package dev.memerson.logicforge.ast;

public interface Primitive extends Expression {

  Object value();

  PrimitiveType getPrimitiveType();

  @Override
  default ExpressionType getType() {
    return ExpressionType.PRIMITIVE;
  }
}
