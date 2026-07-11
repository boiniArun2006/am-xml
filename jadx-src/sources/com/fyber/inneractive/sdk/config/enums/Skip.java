package com.fyber.inneractive.sdk.config.enums;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum Skip {
    DEFAULT(-1),
    _0(0),
    _10(10),
    _15(15),
    _5(5);

    private static final Map<Integer, Skip> CONSTANTS = new HashMap();
    private final Integer value;

    static {
        for (Skip skip : values()) {
            CONSTANTS.put(skip.value, skip);
        }
    }

    public static Skip fromValue(Integer num) {
        if (num == null) {
            return null;
        }
        return CONSTANTS.get(num);
    }

    public Integer value() {
        return this.value;
    }

    Skip(Integer num) {
        this.value = num;
    }
}
