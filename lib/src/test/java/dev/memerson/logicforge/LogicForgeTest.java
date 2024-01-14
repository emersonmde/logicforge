package dev.memerson.logicforge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import dev.memerson.logicforge.ast.Expression;
import dev.memerson.logicforge.ast.Variable;
import dev.memerson.logicforge.ast.types.PrimitiveBoolean;
import dev.memerson.logicforge.ast.types.PrimitiveInteger;
import dev.memerson.logicforge.ast.types.PrimitiveString;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class LogicForgeTest {

  // Testing primitive types
  @Test
  public void testPrimitiveEvaluation() {
    LogicForge logicForge = new LogicForge();
    Expression<Integer> intExpr = new PrimitiveInteger(42);
    assertEquals("Primitive integer should be evaluated correctly",
        Integer.valueOf(42),
        logicForge.evaluate(intExpr, new HashMap<>()));

    Expression<String> stringExpr = new PrimitiveString("Hello");
    assertEquals("Primitive string should be evaluated correctly",
        "Hello",
        logicForge.evaluate(stringExpr, new HashMap<>()));

    Expression<Boolean> booleanExpr = new PrimitiveBoolean(true);
    assertEquals("Primitive boolean should be evaluated correctly",
        Boolean.TRUE,
        logicForge.evaluate(booleanExpr, new HashMap<>()));
  }

  // Testing variable resolution
  @Test
  public void testVariableResolution() {
    LogicForge logicForge = new LogicForge();
    Map<String, Expression<?>> context = new HashMap<>();
    context.put("myVar", new PrimitiveInteger(100));

    Expression<Integer> varExpr = new Variable<>("myVar");
    assertEquals("Variable should be resolved from context",
        Integer.valueOf(100),
        logicForge.evaluate(varExpr, context));
  }

  // Testing function application
  @Test
  public void testFunctionApplication() {
    LogicForge logicForge = new LogicForge();
    Map<String, Expression<?>> context = new HashMap<>();
    context.put("number", new PrimitiveInteger(50));

    Expression<Integer> varExpr = new Variable<>("number");
    Expression<Integer> constExpr = new PrimitiveInteger(42);
    Expression<Boolean> greaterThanExpr = new GreaterThan(varExpr, constExpr);

    assertTrue("GreaterThan function should return true for 50 > 42",
        logicForge.evaluate(greaterThanExpr, context));
  }

  @Test
  public void someLibraryMethodReturnsTrue() {
    LogicForge logicForge = new LogicForge();
    assertTrue("returnTrue should return 'true'", logicForge.returnTrue());
  }
}
