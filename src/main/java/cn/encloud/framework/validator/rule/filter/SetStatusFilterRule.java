package cn.encloud.framework.validator.rule.filter;


import java.util.Arrays;
import java.util.List;

public class SetStatusFilterRule extends AbstractFilterRule<SetStatusFilterRule.Config> {

    /**
     * Status key.
     */
    public static final String STATUS_KEY = "status";

    public SetStatusFilterRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(STATUS_KEY);
    }

    public static class Config {

        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

}
