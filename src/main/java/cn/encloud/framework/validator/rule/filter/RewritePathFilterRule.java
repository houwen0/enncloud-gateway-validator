package cn.encloud.framework.validator.rule.filter;


import java.util.Arrays;
import java.util.List;

public class RewritePathFilterRule extends AbstractFilterRule<RewritePathFilterRule.Config> {

    /**
     * Regexp key.
     */
    public static final String REGEXP_KEY = "regexp";

    /**
     * Replacement key.
     */
    public static final String REPLACEMENT_KEY = "replacement";

    public RewritePathFilterRule(){
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(REGEXP_KEY, REPLACEMENT_KEY);
    }

    public static class Config {

        private String regexp;

        private String replacement;

        public String getRegexp() {
            return regexp;
        }

        public Config setRegexp(String regexp) {
            this.regexp = regexp;
            return this;
        }

        public String getReplacement() {
            return replacement;
        }

        public Config setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }

    }

}
