package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class BeforePredicateRule extends AbstractPredicateRule<BeforePredicateRule.Config> {

    /**
     * DateTime key.
     */
    public static final String DATETIME_KEY = "datetime";


    public BeforePredicateRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList(DATETIME_KEY);
    }

    public static class Config {

        private ZonedDateTime datetime;

        public ZonedDateTime getDatetime() {
            return datetime;
        }

        public void setDatetime(ZonedDateTime datetime) {
            this.datetime = datetime;
        }

    }
}
