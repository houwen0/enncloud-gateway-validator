package cn.encloud.framework.validator.support.mapper;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.ZonedDateTime;


public class ZonedDateTimeConverter extends BidirectionalConverter<Object, ZonedDateTime> {



    public ZonedDateTime convertTo(Object source, Type<ZonedDateTime> destinationType, MappingContext mapping) {
        return ZonedDateTime.parse(String.valueOf(source));
    }

    public Object convertFrom(ZonedDateTime source, Type<Object> destinationType, MappingContext mapping) {
        return source.toString();
    }


}
