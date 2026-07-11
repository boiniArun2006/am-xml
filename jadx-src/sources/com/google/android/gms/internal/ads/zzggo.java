package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzggo extends zzghb {
    private final zzgbf zza;

    zzggo(zzawg zzawgVar, zzgfx zzgfxVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", zzawgVar, zzgfxVar, zzgoeVar.zza(116));
        this.zza = zzgbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzb());
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzb((String) objArr[0]);
            zzawgVar.zzaa((String) objArr[1]);
        }
    }
}
