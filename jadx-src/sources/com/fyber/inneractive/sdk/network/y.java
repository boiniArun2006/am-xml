package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f54369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54370c;

    public y(String str, String str2, String str3, Long l2, String str4, String str5, String str6, String str7) {
        String strA;
        int i2 = com.fyber.inneractive.sdk.config.k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            strA = com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u + IAConfigManager.f53260M.f53283i.f53398f;
        } else {
            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
        }
        this.f54370c = null;
        if (TextUtils.isEmpty(strA)) {
            throw new InvalidParameterException();
        }
        this.f54369b = new HashMap();
        this.f54368a = strA;
        a(str7 == null ? "8.4.3" : str7, "sdkv");
        a(com.fyber.inneractive.sdk.util.o.f57018a.getPackageName(), "pkgn");
        if (IAConfigManager.c()) {
            return;
        }
        a("Android", "osn");
        a(Build.VERSION.RELEASE, "osv");
        a(com.fyber.inneractive.sdk.util.k.j(), "model");
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, "appid");
        a(str2, "session");
        a(str3, "adnt");
        a(l2, "adnt_id");
        a(str4, "creative_id");
        a(str5, "adomain");
        a(str6, CreativeInfo.f62425D);
    }

    public final void a(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f54369b.put(str, obj);
        }
    }
}
