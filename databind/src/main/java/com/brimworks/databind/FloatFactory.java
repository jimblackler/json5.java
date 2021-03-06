package com.brimworks.databind;

public interface FloatFactory {
    default float create(Number value, TypeBuilderContext ctx) {
        throw ctx.unsupportedType("Unexpected number");
    }
    default float create(String value, TypeBuilderContext ctx) {
        throw ctx.unsupportedType("Unexpected string");
    }
    default float create(boolean value, TypeBuilderContext ctx) {
        throw ctx.unsupportedType("Unexpected boolean");
    }
    default float createNull(TypeBuilderContext ctx) {
        throw ctx.unsupportedType("Unexpected null");
    }

    // PRIMITIVES, default to delegation.
    default float create(long value, TypeBuilderContext ctx) {
        return create(Long.valueOf(value), ctx);
    }
    default float create(int value, TypeBuilderContext ctx) {
        return create(Integer.valueOf(value), ctx);
    }
    default float create(short value, TypeBuilderContext ctx) {
        return create(Short.valueOf(value), ctx);
    }
    default float create(char value, TypeBuilderContext ctx) {
        return create(Character.valueOf(value), ctx);
    }
    default float create(byte value, TypeBuilderContext ctx) {
        return create(Byte.valueOf(value), ctx);
    }
    default float create(double value, TypeBuilderContext ctx) {
        return create(Double.valueOf(value), ctx);
    }
    default float create(float value, TypeBuilderContext ctx) {
        return create(Float.valueOf(value), ctx);
    }
}
