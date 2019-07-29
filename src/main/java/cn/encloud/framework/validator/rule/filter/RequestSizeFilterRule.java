package cn.encloud.framework.validator.rule.filter;


import java.util.Arrays;
import java.util.List;

public class RequestSizeFilterRule extends AbstractFilterRule<RequestSizeFilterRule.RequestSizeConfig> {

    public RequestSizeFilterRule(){
        super(RequestSizeConfig.class);
    }

    public static class RequestSizeConfig {

        private Long maxSize = 5000000L;

        public Long getMaxSize() {
            return maxSize;
        }


//        public void validate() {
//            Assert.isTrue(this.maxSize != null && this.maxSize > 0,
//                    "maxSize must be greater than 0");
//            Assert.isInstanceOf(Long.class, maxSize, "maxSize must be a number");
//        }

    }

}
