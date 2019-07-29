package cn.encloud.framework.validator;

import org.junit.Test;

import java.util.List;

import cn.encloud.framework.validator.context.FilterContext;

import javax.validation.constraints.NotNull;

import static org.junit.Assert.assertEquals;

public class ValidatorTest {


    @Test
    public void checkTest() {

        Validator  validator=new Validator();
        //String args="2017-01-20T17:42:47.789-07:00[America/Denver]";
        String args=null;
        List<String> checkResult=validator.check(FilterContext.AFTER_PREDICATE,args,FilterContext.RULE_TYPE_PREDICATE,FilterContext.APP_TYPE_WEBSTITE);
        assertEquals(1, checkResult.size());
        assertEquals("datetime不能为null", checkResult.get(0));
    }

}


