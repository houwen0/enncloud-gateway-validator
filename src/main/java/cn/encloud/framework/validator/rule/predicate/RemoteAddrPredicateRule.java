package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RemoteAddrPredicateRule extends AbstractPredicateRule<RemoteAddrPredicateRule.Config> {


    public RemoteAddrPredicateRule(){
        super(Config.class);
    }

    @Override
    public ShortcutType shortcutType() {
        return ShortcutType.GATHER_LIST;
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList("sources");
    }

    public static class Config {

        @NotEmpty
        private List<String> sources = new ArrayList<>();


        public List<String> getSources() {
            return sources;
        }

        public Config setSources(List<String> sources) {
            this.sources = sources;
            return this;
        }

        public Config setSources(String... sources) {
            this.sources = Arrays.asList(sources);
            return this;
        }


    }
}
