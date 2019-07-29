package cn.encloud.framework.validator.rule.predicate;

import cn.encloud.framework.validator.rule.AbstractRule;

public class AbstractPredicateRule<C> extends AbstractRule<C> {

    public AbstractPredicateRule(Class<C> configClass){
        super(configClass);
    }

}