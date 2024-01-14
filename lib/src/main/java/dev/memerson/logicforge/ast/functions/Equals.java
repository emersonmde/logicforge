package dev.memerson.logicforge.ast.functions;

import dev.memerson.logicforge.ast.Expression;
import dev.memerson.logicforge.ast.BiFunction;
import java.util.Map;

public record Equals(Object[] args) implements BiFunction {


  @Override
  public Comparable evaluate(Map<String, Expression<Boolean>> context) {
    return null;
  }
}
