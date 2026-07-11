package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbb extends zzbby {
    private final long zzh;

    public zzbbb(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, long j2, int i2, int i3) {
        super(zzbakVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zzawgVar, i2, 25);
        this.zzh = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzac(jLongValue);
                long j2 = this.zzh;
                if (j2 != 0) {
                    zzawgVar.zzk(jLongValue - j2);
                    zzawgVar.zzn(j2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
