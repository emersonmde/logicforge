package dev.memerson.logicforge.ast.functions;

import dev.memerson.logicforge.ast.Expression;
import dev.memerson.logicforge.ast.BiFunction;
import java.util.Map;

public class GreaterThan implements BiFunction {
  private final Expression firstArg;
  private final Expression secondArg;

  public GreaterThan(Expression firstArg, Expression secondArg) {
    this.firstArg = firstArg;
    this.secondArg = secondArg;
  }

  public static BiFunction<Boolean> of(Expression firstArg, Expression secondArg) {
    return new GreaterThan(firstArg, secondArg);
  }

  @Override
  public Boolean evaluate(Map context) {
    Comparable firstValue = (Comparable) firstArg.evaluate(context);
    Comparable secondValue = (Comparable) secondArg.evaluate(context);
    return firstValue.compareTo(secondValue) > 0;
  }
}
