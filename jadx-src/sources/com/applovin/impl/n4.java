package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f49467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f49470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f49471e;

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i2;
        if (!bVar.x0() || (i2 = this.f49468b) == -1) {
            a(bVar.W());
        } else {
            a(i2);
        }
    }

    public n4(Activity activity) {
        boolean z2;
        this.f49467a = activity;
        int iD = n7.d(activity);
        this.f49469c = iD;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f49470d = zIsTablet;
        this.f49468b = a(iD, zIsTablet);
        if (zIsTablet && 2 == a(activity)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f49471e = z2;
    }

    private int a(int i2, boolean z2) {
        if (z2 && this.f49471e) {
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 1) {
                return 9;
            }
            if (i2 == 2) {
                return 8;
            }
            return i2 == 3 ? 1 : -1;
        }
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 9;
        }
        return i2 == 3 ? 8 : -1;
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f49470d && this.f49471e) {
                int i2 = this.f49469c;
                if (i2 != 1 && i2 != 3) {
                    a(1);
                    return;
                } else if (i2 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i3 = this.f49469c;
            if (i3 != 0 && i3 != 2) {
                a(1);
                return;
            } else {
                a(i3 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f49470d && this.f49471e) {
                int i5 = this.f49469c;
                if (i5 != 0 && i5 != 2) {
                    a(0);
                    return;
                } else {
                    a(i5 != 2 ? 0 : 8);
                    return;
                }
            }
            int i7 = this.f49469c;
            if (i7 != 1 && i7 != 3) {
                a(0);
            } else {
                a(i7 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = n7.f(context).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i2) {
        try {
            this.f49467a.setRequestedOrientation(i2);
        } catch (Throwable unused) {
        }
    }
}
