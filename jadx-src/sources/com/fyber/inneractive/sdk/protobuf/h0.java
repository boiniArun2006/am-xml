package com.fyber.inneractive.sdk.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile h0 f56574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f56575c = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f56576a = Collections.EMPTY_MAP;

    public static h0 a() {
        h0 h0Var;
        h0 h0Var2 = f56574b;
        if (h0Var2 != null) {
            return h0Var2;
        }
        synchronized (h0.class) {
            h0Var = f56574b;
            if (h0Var == null) {
                Class cls = f0.f56564a;
                h0 h0Var3 = null;
                if (cls != null) {
                    try {
                        h0Var3 = (h0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                h0Var = h0Var3 != null ? h0Var3 : f56575c;
                f56574b = h0Var;
            }
        }
        return h0Var;
    }

    public final x0 a(int i2, d2 d2Var) {
        return (x0) this.f56576a.get(new g0(i2, d2Var));
    }
}
