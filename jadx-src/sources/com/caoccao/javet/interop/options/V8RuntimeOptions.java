package com.caoccao.javet.interop.options;

import com.caoccao.javet.utils.StringUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class V8RuntimeOptions extends RuntimeOptions<V8RuntimeOptions> {
    public static final String GLOBAL_THIS = "globalThis";
    public static final V8Flags V8_FLAGS = new V8Flags();
    private String globalName;

    public String getGlobalName() {
        return this.globalName;
    }

    public V8RuntimeOptions() {
        setGlobalName(null);
    }

    public V8RuntimeOptions setGlobalName(String str) {
        if (StringUtils.isEmpty(str)) {
            str = null;
        }
        this.globalName = str;
        return this;
    }
}
