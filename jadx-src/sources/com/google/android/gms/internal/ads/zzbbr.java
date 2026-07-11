package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbr extends zzbby {
    public zzbbr(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3) {
        super(zzbakVar, "WpK2JUF8iJ/BvX1YbpvZEg/OwGEi7DqWo1w6qvQxAhqdLxv0KDJfeHynFcOHsF/r", "eAfiSXYP9RekAEzlsFTPbe7e0Y1hgLoRWRhxsNjDqkg=", zzawgVar, i2, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzbaf zzbafVar = new zzbaf((String) this.zze.invoke(null, new Object[0]));
            zzawgVar.zzF(zzbafVar.zza.longValue());
            zzawgVar.zzG(zzbafVar.zzb.longValue());
        }
    }
}
