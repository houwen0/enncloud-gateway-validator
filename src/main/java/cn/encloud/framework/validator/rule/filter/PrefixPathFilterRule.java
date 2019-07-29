package cn.encloud.framework.validator.rule.filter;


import java.util.Arrays;
import java.util.List;

public class PrefixPathFilterRule extends AbstractFilterRule<PrefixPathFilterRule.Config> {

    /**
     * Prefix key.
     */
    public static final String PREFIX_KEY = "prefix";


    public PrefixPathFilterRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(PREFIX_KEY);
    }


    public static class Config {

        private String prefix;

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

    }

}
