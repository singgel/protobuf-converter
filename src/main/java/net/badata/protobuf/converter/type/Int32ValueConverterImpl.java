package net.badata.protobuf.converter.type;

import com.google.protobuf.Int32Value;

public class Int32ValueConverterImpl  implements TypeConverter<Integer, Int32Value> {
    @Override
    public Integer toDomainValue(Object instance) {
        return ((Int32Value) instance).getValue();
    }

    @Override
    public Int32Value toProtobufValue(Object instance) {
        return Int32Value.of((int) instance);
    }
}