package com.applovin.sdk;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51145c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, BrandSafetyUtils.f61447m);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, BrandSafetyUtils.f61448n);
    public static final AppLovinAdSize MREC = new AppLovinAdSize(d.f62986a, 250, BrandSafetyUtils.f61449o);
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, BrandSafetyUtils.f61444j);
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    public static AppLovinAdSize fromString(String str) {
        if (BrandSafetyUtils.f61447m.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if (BrandSafetyUtils.f61449o.equalsIgnoreCase(str)) {
            return MREC;
        }
        if (BrandSafetyUtils.f61448n.equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || BrandSafetyUtils.f61444j.equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f51145c;
    }

    public String getLabel() {
        return this.f51143a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f51144b;
    }

    private AppLovinAdSize(int i2, int i3, String str) {
        this.f51144b = i2;
        this.f51145c = i3;
        this.f51143a = str;
    }

    public String toString() {
        return getLabel();
    }
}
