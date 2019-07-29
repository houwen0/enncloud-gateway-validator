package cn.encloud.framework.validator.rule.filter;

import cn.encloud.framework.validator.rule.AbstractRule;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

public class AbstractFilterRule<C>  extends AbstractRule<C> {

    /**
     * Name key.
     */
    String NAME_KEY = "name";

    /**
     * Value key.
     */
    String VALUE_KEY = "value";

    public AbstractFilterRule(Class<C> configClass){
        super(configClass);
    }


    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY,VALUE_KEY);
    }

    public static class NameConfig {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


}
