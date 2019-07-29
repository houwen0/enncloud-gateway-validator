package cn.encloud.framework.validator.support;

import cn.encloud.framework.validator.rule.predicate.AfterPredicateRule;
import cn.encloud.framework.validator.support.mapper.ConvertUtil;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.converter.builtin.PassThroughConverter;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.time.ZonedDateTime;
import java.util.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;


public class ValidatorUtil {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();


    public static List<String> validate(Map properties, String configName) {
        List<String> errorList = new ArrayList<String>();
        try {

            //Set<ConstraintViolation<Object>> constraintViolations = validator.validate( mapperFactory.getMapperFacade(Map.class,Class.forName(configName)).map(properties) );
//            cn.encloud.framework.validator.rule.predicate.Config config=new cn.encloud.framework.validator.rule.predicate.Config();
//            config.setDatetime("2017-01-20T17:42:47.789-07:00[America/Denver]");
//
//            Set<ConstraintViolation<Object>> constraintViolations = validator.validate( mapperFactory.getMapperFacade(cn.encloud.framework.validator.rule.predicate.Config.class,Class.forName(configName)).map(config) );

//            Map  map=new HashMap ();
//            //map.put("datetime","2017-01-20T17:42:47.789-07:00[America/Denver]");
            Set<ConstraintViolation<Object>> constraintViolations = validator.validate(ConvertUtil.mapperFactory.getMapperFacade(Map.class, Class.forName(configName)).map(properties));


            //5.如果错误信息，放到errorList中，并返回
            if (!constraintViolations.isEmpty()) {
                Iterator<ConstraintViolation<Object>> iterator = constraintViolations.iterator();
                while (iterator.hasNext()) {
                    ConstraintViolation<Object> constraintViolation = iterator.next();
                    errorList.add(constraintViolation.getPropertyPath().toString() + constraintViolation.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return errorList;
    }

}

