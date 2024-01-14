package dev.memerson.logicforge.ast;

import java.util.Map;

public interface BiFunction extends Expression {

  @Override
  default ExpressionType getType() {
    return ExpressionType.FUNCTION;
  }
}
