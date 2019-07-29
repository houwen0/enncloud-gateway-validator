package cn.encloud.framework.validator.rule.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathPredicateRule extends AbstractPredicateRule<PathPredicateRule.Config> {

    public PathPredicateRule() {
        super(Config.class);
    }

    public static class Config {

        private List<String> patterns = new ArrayList<>();

        private boolean matchOptionalTrailingSeparator = true;

        public List<String> getPatterns() {
            return patterns;
        }

        public Config setPatterns(List<String> patterns) {
            this.patterns = patterns;
            return this;
        }

        public boolean isMatchOptionalTrailingSeparator() {
            return matchOptionalTrailingSeparator;
        }

        public Config setMatchOptionalTrailingSeparator(
                boolean matchOptionalTrailingSeparator) {
            this.matchOptionalTrailingSeparator = matchOptionalTrailingSeparator;
            return this;
        }
    }
}
