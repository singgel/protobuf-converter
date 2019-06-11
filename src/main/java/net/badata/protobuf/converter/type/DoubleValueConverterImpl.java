package net.badata.protobuf.converter.type;

import com.google.protobuf.DoubleValue;

public class DoubleValueConverterImpl implements TypeConverter<Double, DoubleValue> {
    @Override
    public Double toDomainValue(Object instance) {
        return ((DoubleValue) instance).getValue();
    }

    @Override
    public DoubleValue toProtobufValue(Object instance) {
        return DoubleValue.of((double) instance);
    }
}
