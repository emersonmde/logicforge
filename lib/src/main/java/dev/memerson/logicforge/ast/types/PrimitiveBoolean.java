package dev.memerson.logicforge.ast.types;

import dev.memerson.logicforge.ast.Expression;
import dev.memerson.logicforge.ast.ExpressionType;
import dev.memerson.logicforge.ast.Primitive;
import dev.memerson.logicforge.ast.PrimitiveType;
import java.util.Map;

public record PrimitiveBoolean(Boolean value) implements Primitive {
  @Override
  public Boolean evaluate(Map context) {
    return value;
  }

  @Override
  public PrimitiveType getPrimitiveType() {
    return PrimitiveType.BOOLEAN;
  }
}
