package cn.encloud.framework.validator.rule.filter;



import java.util.Arrays;
import java.util.List;

public class RedirectToFilterRule extends AbstractFilterRule<RedirectToFilterRule.Config> {

    /**
     * Status key.
     */
    public static final String STATUS_KEY = "status";

    /**
     * URL key.
     */
    public static final String URL_KEY = "url";


    public RedirectToFilterRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(STATUS_KEY, URL_KEY);
    }

    public static class Config {

        String status;

        String url;


        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }
}
