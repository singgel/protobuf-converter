package net.badata.protobuf.converter.type;

import com.google.protobuf.UInt32Value;

public class UInt32ValueConverterImpl  implements TypeConverter<Integer, UInt32Value> {
    @Override
    public Integer toDomainValue(Object instance) {
        return ((UInt32Value) instance).getValue();
    }

    @Override
    public UInt32Value toProtobufValue(Object instance) {
        return UInt32Value.of((int) instance);
    }
}