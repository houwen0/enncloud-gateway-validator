package cn.encloud.framework.validator.rule.filter;


import java.util.Arrays;
import java.util.List;

public class RemoveResponseHeaderFilterRule extends AbstractFilterRule<AbstractFilterRule.NameConfig> {

    public RemoveResponseHeaderFilterRule() {
        super(NameConfig.class);
    }
    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY);
    }


}
