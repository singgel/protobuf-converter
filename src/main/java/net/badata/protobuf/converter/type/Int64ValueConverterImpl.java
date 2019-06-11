package net.badata.protobuf.converter.type;

import com.google.protobuf.Int64Value;

public class Int64ValueConverterImpl  implements TypeConverter<Long, Int64Value> {
    @Override
    public Long toDomainValue(Object instance) {
        return ((Int64Value) instance).getValue();
    }

    @Override
    public Int64Value toProtobufValue(Object instance) {
        return Int64Value.of((long) instance);
    }
}