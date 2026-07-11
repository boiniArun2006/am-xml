package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f53400a = new HashMap();

    public final boolean a() {
        try {
            if (this.f53400a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.f53400a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
