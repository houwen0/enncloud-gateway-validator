package cn.encloud.framework.validator.rule.filter;

import cn.encloud.framework.validator.rule.AbstractRule;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

public class AbstractNameValueFilterRule  extends AbstractFilterRule<AbstractNameValueFilterRule.NameValueConfig> {


    /**
     * Name key.
     */
    String NAME_KEY = "name";

    /**
     * Value key.
     */
    String VALUE_KEY = "value";

    public AbstractNameValueFilterRule() {
        super(NameValueConfig.class);
    }

    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY,VALUE_KEY);
    }

    public static class NameValueConfig {

        @NotEmpty
        protected String name;

        @NotEmpty
        protected String value;

        public String getName() {
            return name;
        }

        public NameValueConfig setName(String name) {
            this.name = name;
            return this;
        }

        public String getValue() {
            return value;
        }

        public NameValueConfig setValue(String value) {
            this.value = value;
            return this;
        }

    }


}
