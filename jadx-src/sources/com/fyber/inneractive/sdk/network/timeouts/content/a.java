package com.fyber.inneractive.sdk.network.timeouts.content;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.features.k;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.d;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class a extends com.fyber.inneractive.sdk.network.timeouts.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54337h;

    public a(String str, String str2, int i2, boolean z2, String str3, r rVar) {
        int iIntValue;
        k kVar = (k) rVar.a(k.class);
        this.f54337h = 0;
        Boolean boolC = kVar.c("reverse_retries");
        this.f54336g = boolC != null ? boolC.booleanValue() : true;
        if (z2) {
            iIntValue = kVar.b(str, str3);
        } else if (TextUtils.isEmpty(str3)) {
            String str4 = str + "_global_timeout";
            int i3 = k.d(str) ? 30000 : 10000;
            Integer numA = kVar.a(str4);
            iIntValue = numA != null ? numA.intValue() : i3;
        } else {
            iIntValue = kVar.c(str, str3);
        }
        if (iIntValue > i2) {
            boolean zIsEmpty = TextUtils.isEmpty(str3);
            int iIntValue2 = d.f62986a;
            if (zIsEmpty) {
                Integer numA2 = kVar.a(k.a(str, str2, "retry_interval"));
                this.f54334e = numA2 != null ? numA2.intValue() : 100;
                Integer numA3 = kVar.a(k.a("timeout", "threshold"));
                this.f54335f = numA3 != null ? numA3.intValue() : iIntValue2;
                String strA = k.a(str, str2, "ilat");
                int i5 = k.d(str) ? BrandSafetyUtils.f61442h : 10000;
                Integer numA4 = kVar.a(strA);
                this.f54333d = numA4 != null ? numA4.intValue() : i5;
            } else {
                String strA2 = k.a(str, str2, "retry_interval", k.e(str3));
                Integer numA5 = kVar.a(k.a("retry_interval", "all_mediators"));
                int iIntValue3 = numA5 != null ? numA5.intValue() : 100;
                Integer numA6 = kVar.a(strA2);
                this.f54334e = numA6 != null ? numA6.intValue() : iIntValue3;
                String strA3 = k.a("timeout", "threshold", k.e(str3));
                Integer numA7 = kVar.a(k.a("timeout", "threshold", "all_mediators"));
                iIntValue2 = numA7 != null ? numA7.intValue() : iIntValue2;
                Integer numA8 = kVar.a(strA3);
                this.f54335f = numA8 != null ? numA8.intValue() : iIntValue2;
                String strA4 = k.a(str, str2, "ilat", k.e(str3));
                String strA5 = k.a(str, str2, "ilat", "all_mediators");
                int iIntValue4 = k.d(str) ? BrandSafetyUtils.f61442h : 10000;
                Integer numA9 = kVar.a(strA5);
                iIntValue4 = numA9 != null ? numA9.intValue() : iIntValue4;
                Integer numA10 = kVar.a(strA4);
                this.f54333d = numA10 != null ? numA10.intValue() : iIntValue4;
            }
        }
        int i7 = iIntValue - (this.f54335f + i2);
        IAlog.a("%s : LoadAdContentTimeout resolveLoadAdTimeout : usedTime: %d, global timeout: %d, timeout: %d", IAlog.a(a.class), Integer.valueOf(i2), Integer.valueOf(iIntValue), Integer.valueOf(i7));
        this.f54332c = Math.max(i7, 0);
        int iA = a();
        this.f54330a = iA;
        if (iA == 0) {
            this.f54333d = this.f54332c;
        }
        IAlog.a("%s : LoadAdContentTimeout onFixedLoadAdTimeoutUpdated : Calculated: %d attempts with LeftoverTime: %d", IAlog.a(this), Integer.valueOf(this.f54330a), 0);
        int i8 = this.f54330a;
        if (i8 > 0) {
            int i9 = this.f54332c;
            int i10 = this.f54335f;
            int i11 = this.f54334e;
            for (int i12 = 0; i12 <= i8; i12++) {
                i9 -= (this.f54331b * i12) + this.f54333d;
            }
            this.f54337h = Math.max(0, i9 - ((i11 * i8) + (i10 * i8)));
        }
    }
}
