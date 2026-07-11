package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzatt extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatt(zzats zzatsVar, zzatq zzatqVar, long j2) {
        int i2 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i2];
        objArr[0] = Long.valueOf(zzatsVar.zza());
        objArr[1] = Long.valueOf(zzatqVar.zza());
        int i3 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j2);
        objArr[i3] = lValueOf;
        super(String.format(locale, zzaui.zza("bk3t6gFTc30="), objArr));
        Optional.of(zzatqVar);
        Optional.of(lValueOf);
    }

    public zzatt(zzats zzatsVar, Throwable th) {
        super(String.format(Locale.US, zzaui.zza("bk0="), Long.valueOf(zzatsVar.zza())), th);
        Optional.empty();
        Optional.empty();
    }
}
