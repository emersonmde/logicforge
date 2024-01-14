package dev.memerson.logicforge.ast.types;

import dev.memerson.logicforge.ast.Expression;
import dev.memerson.logicforge.ast.Primitive;
import dev.memerson.logicforge.ast.PrimitiveType;
import java.util.Map;

public record PrimitiveInteger(PrimitiveInteger value) implements Primitive<PrimitiveInteger> {

  @Override
  public PrimitiveType getPrimitiveType() {
    return PrimitiveType.INTEGER;
  }

  @Override
  public PrimitiveInteger evaluate(Map<String, Expression<?>> context) {
    return value;
  }
}
