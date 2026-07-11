package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbe extends zzbby {
    private final zzbal zzh;

    public zzbbe(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3, zzbal zzbalVar) {
        super(zzbakVar, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", zzawgVar, i2, 85);
        this.zzh = zzbalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzbal zzbalVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzbalVar.zzf()), Long.valueOf(zzbalVar.zzg()), Long.valueOf(zzbalVar.zzi()), Long.valueOf(zzbalVar.zzh()));
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzY(jArr[0]);
            zzawgVar.zzZ(jArr[1]);
        }
    }
}
