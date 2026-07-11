package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbu extends zzbby {
    public zzbbu(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3) {
        super(zzbakVar, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", zzawgVar, i2, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzawgVar) {
            try {
                if (zBooleanValue) {
                    zzawgVar.zzae(2);
                } else {
                    zzawgVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
