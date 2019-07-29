package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HostPredicateRule extends AbstractPredicateRule<HostPredicateRule.Config> {

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList("patterns");
    }

    public HostPredicateRule(){
        super(Config.class);
    }


    @Override
    public ShortcutType shortcutType() {
        return ShortcutType.GATHER_LIST;
    }

    public static class Config {

        private List<String> patterns = new ArrayList<>();


                public List<String> getPatterns() {
                    return patterns;
                }

                public void setPatterns(List<String> patterns) {
                    this.patterns = patterns;
                }

        }


}
