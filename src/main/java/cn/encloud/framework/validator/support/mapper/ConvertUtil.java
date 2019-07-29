package cn.encloud.framework.validator.support.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class ConvertUtil {

    public static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    static{
        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        converterFactory.registerConverter(new ZonedDateTimeConverter());
    }


}
