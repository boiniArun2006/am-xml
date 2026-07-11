package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class s extends c {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f62702W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    boolean f62703X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f62704Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    ScheduledFuture<?> f62705Z;
    ScheduledFuture<?> aa;
    WeakReference<Activity> ab;
    public NativeFinder.a ac;
    boolean ad;
    long ae;
    long af;
    float ag;
    String ah;
    boolean ai;

    public s(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3) {
        this(strArr, str, i2, str2, bundle, str3, BrandSafetyUtils.AdType.NATIVE);
    }

    public s(String str, long j2) {
        super(str, j2, BrandSafetyUtils.AdType.NATIVE);
        this.f62702W = false;
        this.f62703X = false;
        this.f62704Y = false;
        this.ac = null;
        this.ad = false;
        this.ae = 0L;
        this.af = 0L;
        this.ag = 0.0f;
        this.ah = null;
        this.ai = false;
    }

    public s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        this(str, str2, str3, screenShotOrientation, str4, str5, BrandSafetyUtils.AdType.NATIVE);
    }

    protected s(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5, BrandSafetyUtils.AdType adType) {
        super(str, str2, str3, screenShotOrientation, str4, adType);
        this.f62702W = false;
        this.f62703X = false;
        this.f62704Y = false;
        this.ac = null;
        this.ad = false;
        this.ae = 0L;
        this.af = 0L;
        this.ag = 0.0f;
        this.ah = null;
        this.ai = false;
        this.f61835q = str5;
    }

    private s(String[] strArr, String str, int i2, String str2, Bundle bundle, String str3, BrandSafetyUtils.AdType adType) {
        super(strArr, i2, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, adType);
        this.f62702W = false;
        this.f62703X = false;
        this.f62704Y = false;
        this.ac = null;
        this.ad = false;
        this.ae = 0L;
        this.af = 0L;
        this.ag = 0.0f;
        this.ah = null;
        this.ai = false;
        this.ah = str2;
        if (str3 != null) {
            this.f61819L = str3;
        }
    }
}
