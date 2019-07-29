package cn.encloud.framework.validator.context;

import cn.encloud.framework.validator.rule.filter.AbstractFilterRule;
import cn.encloud.framework.validator.rule.filter.AddRequestHeaderFilterRule;
import cn.encloud.framework.validator.rule.filter.AddRequestParameterFilterRule;
import cn.encloud.framework.validator.rule.predicate.AbstractPredicateRule;
import cn.encloud.framework.validator.rule.predicate.AfterPredicateRule;

import java.util.HashMap;
import java.util.Map;

public class FilterContext {

    public static final Map<String, AbstractFilterRule> filterRuleMap = new HashMap<>();
    public static final Map<String, AbstractPredicateRule> predicateRuleMap = new HashMap<>();

    public static final  String ADDREQUESTHEADER_FILTER="AddRequestHeader";
    public static final  String ADDREQUESTPARAMETER_FILTER="AddRequestParameter";


    public static final  String AFTER_PREDICATE="After";


    //规则类型，区分是断言和过滤器
    public static final  int RULE_TYPE_FILTER=1;
    public static final  int RULE_TYPE_PREDICATE=2;

    //应用端区分，根据应用不同，做适配
    public static final  int APP_TYPE_WEBSTITE=1;
    public static final  int APP_TYPE_CONF=2;


    static{

        filterRuleMap.put(ADDREQUESTHEADER_FILTER,new AddRequestHeaderFilterRule());
        filterRuleMap.put(ADDREQUESTPARAMETER_FILTER,new AddRequestParameterFilterRule());


        predicateRuleMap.put(AFTER_PREDICATE,new AfterPredicateRule());

    }

}
