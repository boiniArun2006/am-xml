package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f62584a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f62585b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f62586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f62587d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f62588e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f62589f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f62590g = false;

    public j(String str, String str2, long j2, int i2, int i3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z2) {
        a(str, str2, j2, i2, i3, screenShotOrientation, z2);
    }

    public j(String str, String str2, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation) {
        a(str, str2, 0L, 0, 0, screenShotOrientation, false);
    }

    private void a(String str, String str2, long j2, int i2, int i3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean z2) {
        this.f62584a = str;
        this.f62585b = str2;
        this.f62586c = j2;
        this.f62587d = i2;
        this.f62588e = i3;
        this.f62589f = screenShotOrientation;
        this.f62590g = z2;
    }

    public float a(int i2) {
        return (this.f62587d * 100) / i2;
    }

    public String toString() {
        return "fileName=" + this.f62585b + ", hashValue=" + this.f62584a;
    }
}
