package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

public class QueryPredicateRule extends AbstractPredicateRule<QueryPredicateRule.Config> {

    /**
     * Param key.
     */
    public static final String PARAM_KEY = "param";

    /**
     * Regexp key.
     */
    public static final String REGEXP_KEY = "regexp";

    public QueryPredicateRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(PARAM_KEY, REGEXP_KEY);
    }

    public static class Config {

        @NotEmpty
        private String param;

        private String regexp;

        public String getParam() {
            return param;
        }

        public Config setParam(String param) {
            this.param = param;
            return this;
        }

        public String getRegexp() {
            return regexp;
        }

        public Config setRegexp(String regexp) {
            this.regexp = regexp;
            return this;
        }

    }
}
