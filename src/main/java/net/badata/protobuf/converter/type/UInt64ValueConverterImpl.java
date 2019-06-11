package net.badata.protobuf.converter.type;

import com.google.protobuf.UInt64Value;

public class UInt64ValueConverterImpl  implements TypeConverter<Long, UInt64Value> {
    @Override
    public Long toDomainValue(Object instance) {
        return ((UInt64Value) instance).getValue();
    }

    @Override
    public UInt64Value toProtobufValue(Object instance) {
        return UInt64Value.of((long) instance);
    }
}