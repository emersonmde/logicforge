package dev.memerson.logicforge.ast;

import java.util.Map;

public interface Expression {
  Object evaluate(Map<String, Expression> context);

  ExpressionType getType();
}
