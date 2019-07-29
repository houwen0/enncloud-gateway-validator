package cn.encloud.framework.validator.rule;


import cn.encloud.framework.validator.support.AbstractConfigurable;
import cn.encloud.framework.validator.support.ShortcutConfigurable;

import java.util.Collections;
import java.util.List;

public class AbstractRule<C> extends AbstractConfigurable<C> implements ShortcutConfigurable,Rule<C>{

    @SuppressWarnings("unchecked")
    public AbstractRule() {
        super((Class<C>) Object.class);
    }

    public AbstractRule(Class<C> configClass) {
        super(configClass);
    }

    public List<String> shortcutFieldOrder() {
        return Collections.emptyList();
    }



}
