package dev.memerson.logicforge.ast.types;

import dev.memerson.logicforge.ast.Expression;
import dev.memerson.logicforge.ast.Primitive;
import dev.memerson.logicforge.ast.PrimitiveType;
import java.util.Map;

public record PrimitiveString(PrimitiveString value) implements Primitive<PrimitiveString>,
    Comparable<PrimitiveString> {

  @Override
  public PrimitiveType getPrimitiveType() {
    return PrimitiveType.STRING;
  }

  @Override
  public PrimitiveString evaluate(Map<String, Expression<?>> context) {
    return value;
  }

  @Override
  public int compareTo(PrimitiveString o) {
    return value().compareTo(o.value());
  }
}
