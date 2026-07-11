package com.fyber.inneractive.sdk.network.timeouts;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54330a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54331b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54332c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54333d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54334e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54335f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54336g = false;

    public final int a() {
        int iMax;
        int i2 = this.f54332c;
        int i3 = this.f54333d;
        if (i3 <= 0) {
            IAlog.f("%s Unable resolve retries because of invalid ILAT: %d, will set retries to 0", IAlog.a(com.fyber.inneractive.sdk.network.timeouts.content.a.class), Integer.valueOf(i3));
            iMax = 0;
        } else {
            int i5 = i2 / i3;
            int i7 = i5 - 1;
            if (i7 > 3) {
                i7 = i5 - 2;
            }
            iMax = Math.max(i7, 0);
        }
        int i8 = this.f54332c;
        int i9 = this.f54333d;
        int i10 = this.f54334e;
        int i11 = this.f54335f;
        int iMax2 = Math.max(0, i8);
        int iMax3 = Math.max(0, i9);
        int iMax4 = Math.max(0, iMax);
        int iMax5 = Math.max(0, (iMax2 - (Math.max(0, i10) * iMax4)) - (Math.max(0, i11) * iMax4));
        int iMax6 = Math.max(0, iMax3);
        if (iMax4 > 0) {
            iMax5 %= iMax6;
        }
        int iMax7 = Math.max(iMax5, 0);
        if (iMax7 == 0 && iMax > 2) {
            iMax--;
            iMax7 = this.f54333d;
        }
        int i12 = iMax + 1;
        int iMax8 = Math.max(0, iMax7);
        if (i12 > 0) {
            iMax8 /= i12;
        }
        this.f54331b = iMax8;
        return Math.max(0, a(this.f54332c, this.f54333d, iMax8, 0) - 1);
    }

    public static int a(int i2, int i3, int i5, int i7) {
        int iMax = Math.max(0, i2);
        if (i3 <= 0) {
            i3 = iMax;
        }
        int iMax2 = Math.max(0, i5);
        int iMax3 = Math.max(0, i7);
        int i8 = iMax3 + 1;
        int i9 = iMax - ((iMax2 * iMax3) + i3);
        if (i9 < 0) {
            return Math.max(iMax3, 0);
        }
        if (i9 == 0) {
            return Math.max(i8, 0);
        }
        return a(i9, i3, iMax2, i8);
    }
}
