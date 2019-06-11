package net.badata.protobuf.converter.type;

import com.google.protobuf.FloatValue;

public class FloatValueConverterImpl implements TypeConverter<Float, FloatValue> {
    @Override
    public Float toDomainValue(Object instance) {
        return ((FloatValue) instance).getValue();
    }

    @Override
    public FloatValue toProtobufValue(Object instance) {
        return FloatValue.of((float) instance);
    }
}
