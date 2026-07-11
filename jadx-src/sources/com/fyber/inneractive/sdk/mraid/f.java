package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f54205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f54206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f54207d;

    public final int a(String str) {
        String str2 = (String) this.f54205b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void a();

    public abstract boolean b();

    public f(Map map, i0 i0Var, g1 g1Var) {
        this.f54205b = map;
        this.f54207d = g1Var;
        this.f54206c = i0Var;
    }
}
