package dev.memerson.logicforge.ast;

import java.util.Map;

public record Variable<T extends Comparable<T>>(String key) implements Expression<T> {

  @Override
  public T evaluate(Map<String, Expression<?>> context) {
    return null;
  }

  @Override
  public ExpressionType getType() {
    return ExpressionType.VARIABLE;
  }
}
