package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class RedirectDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f61738a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f61739b = Long.valueOf(SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BrandSafetyUtils.AdType f61741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RedirectType f61742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f61744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RedirectDetails f61746i;

    public enum RedirectType {
        REDIRECT,
        EXPAND
    }

    public RedirectDetails(String sdkPackageName, BrandSafetyUtils.AdType adType, RedirectType type, String viewAddress, String requestedUrl, String originatedMethod, RedirectDetails previousRedirectDetails) {
        this.f61740c = sdkPackageName;
        this.f61741d = adType;
        this.f61742e = type;
        this.f61743f = viewAddress;
        this.f61744g = requestedUrl;
        this.f61745h = originatedMethod;
        this.f61746i = previousRedirectDetails;
    }

    public String toString() {
        return "RedirectDetails{ " + this.f61739b + ", " + this.f61740c + ", " + this.f61741d + ", " + this.f61742e + ", " + this.f61743f + ", " + this.f61744g + ", " + this.f61745h + " }";
    }
}
