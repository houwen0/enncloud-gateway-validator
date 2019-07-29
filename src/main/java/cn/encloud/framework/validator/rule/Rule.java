package cn.encloud.framework.validator.rule;

import cn.encloud.framework.validator.support.Configurable;

public interface Rule<C> extends Configurable<C> {


    default Class<C> getConfigClass() {
        throw new UnsupportedOperationException("getConfigClass() not implemented");
    }

}
