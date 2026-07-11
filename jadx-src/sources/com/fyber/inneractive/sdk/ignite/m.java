package com.fyber.inneractive.sdk.ignite;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP(CmcdConfiguration.KEY_STREAM_TYPE),
    NONE("none");

    private static final Map<String, m> CONSTANTS = new HashMap();
    private final String value;

    public final String a() {
        return this.value;
    }

    static {
        for (m mVar : values()) {
            CONSTANTS.put(mVar.value, mVar);
        }
    }

    public static m a(String str) {
        return CONSTANTS.get(str);
    }

    m(String str) {
        this.value = str;
    }
}
