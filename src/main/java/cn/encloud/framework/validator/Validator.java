package cn.encloud.framework.validator;

import cn.encloud.framework.validator.context.FilterContext;
import cn.encloud.framework.validator.rule.filter.AbstractFilterRule;
import cn.encloud.framework.validator.rule.predicate.AbstractPredicateRule;
import cn.encloud.framework.validator.support.ValidatorUtil;
import java.util.*;

public class Validator {


    /**
     * 校验config中数据内容
     * @param code   断言或过滤器名称标识     参数在FilterContext中定义
     * @param args   具体参数值信息
     * @param ruleType   是断言还是过滤器    参数在FilterContext中定义
     * @param appType    应用识别           参数在FilterContext中定义
     * @return
     */
    public  List<String> check(String code, String args, int ruleType, int appType){
        //先校验code、args等参数；

        List<String> errorList=new ArrayList<String>();

        Map properties =new HashMap<>();

        //1.获取code获取shortcut信息，加工信息
        String  configName="";
        if(FilterContext.RULE_TYPE_FILTER==ruleType){
            AbstractFilterRule filterRule=FilterContext.filterRuleMap.get(code);
            properties= filterRule.shortcutType().normalize(args,filterRule);
            configName=filterRule.getConfigClass().getName();
        }else if(FilterContext.RULE_TYPE_PREDICATE==ruleType){
            AbstractPredicateRule predicateRule=FilterContext.predicateRuleMap.get(code);
            properties= predicateRule.shortcutType().normalize(args,predicateRule);
            configName=predicateRule.getConfigClass().getName();
        }else{
            //直接返回异常
        }

        errorList=ValidatorUtil.validate(properties,configName);

        return errorList;
    }
}
