package dev.memerson.logicforge;


import dev.memerson.logicforge.ast.Expression;
import java.util.Map;

public class LogicForge {

  boolean returnTrue() {
    return true;
  }

  public <T> T evaluate(Expression<T> expr, Map<String, Expression<?>> context) {
    return expr.evaluate(context);
  }
}
