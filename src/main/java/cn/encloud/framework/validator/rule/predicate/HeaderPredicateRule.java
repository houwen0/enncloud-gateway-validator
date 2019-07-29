package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotEmpty;
import java.util.Arrays;
import java.util.List;

public class HeaderPredicateRule extends AbstractPredicateRule<HeaderPredicateRule.Config> {

    /**
     * Header key.
     */
    public static final String HEADER_KEY = "header";

    /**
     * Regexp key.
     */
    public static final String REGEXP_KEY = "regexp";

    public HeaderPredicateRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(HEADER_KEY, REGEXP_KEY);
    }

    public static class Config {

        @NotEmpty
        private String header;

        private String regexp;

        public String getHeader() {
            return header;
        }

        public Config setHeader(String header) {
            this.header = header;
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
