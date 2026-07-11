package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class b extends a {
    public b(k kVar, String str) {
        super(str, kVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        kVar.getClass();
        String str2 = str + "_global_timeout";
        int i2 = k.d(str) ? 30000 : 10000;
        Integer numA = kVar.a(str2);
        return numA != null ? numA.intValue() : i2;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        kVar.getClass();
        String strA = k.a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer numA = kVar.a(strA);
        if (numA != null) {
            return numA.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        int i2;
        kVar.getClass();
        String strA = k.a(str, "rat_perc");
        if ("read".equalsIgnoreCase(str)) {
            i2 = 15;
        } else {
            i2 = 10;
        }
        Integer numA = kVar.a(strA);
        if (numA != null) {
            return numA.intValue();
        }
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        kVar.getClass();
        Integer numA = kVar.a(k.a("timeout", "threshold"));
        return numA != null ? numA.intValue() : com.safedk.android.internal.d.f62986a;
    }
}
