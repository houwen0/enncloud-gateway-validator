package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotEmpty;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CookiePredicateRule extends AbstractPredicateRule<CookiePredicateRule.Config> {

    /**
     * Name key.
     */
    public static final String NAME_KEY = "name";

    /**
     * Regexp key.
     */
    public static final String REGEXP_KEY = "regexp";

    public CookiePredicateRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(NAME_KEY, REGEXP_KEY);
    }

    public static class Config {

        @NotEmpty
        private String name;

        @NotEmpty
        private String regexp;

        public String getName() {
            return name;
        }

        public Config setName(String name) {
            this.name = name;
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
