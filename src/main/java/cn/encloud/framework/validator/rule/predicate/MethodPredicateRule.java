package cn.encloud.framework.validator.rule.predicate;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodPredicateRule extends AbstractPredicateRule<MethodPredicateRule.Config> {

    /**
     * Method key.
     */
    public static final String METHOD_KEY = "method";

    public MethodPredicateRule() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(METHOD_KEY);
    }


    public static class Config {

//        private HttpMethod method;
//
//        public HttpMethod getMethod() {
//            return method;
//        }
//
//        public void setMethod(HttpMethod method) {
//            this.method = method;
//        }

    }

//    GET,
//    HEAD,
//    POST,
//    PUT,
//    PATCH,
//    DELETE,
//    OPTIONS,
//    TRACE;

}
