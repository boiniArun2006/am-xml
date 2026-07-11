package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgge extends zzghb {
    private final Activity zza;
    private final View zzb;

    zzgge(zzawg zzawgVar, zzgfx zzgfxVar, View view, Activity activity, zzgoe zzgoeVar) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", zzawgVar, zzgfxVar, zzgoeVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzS(((Long) objArr[0]).longValue());
            zzawgVar.zzT(((Long) objArr[1]).longValue());
            zzawgVar.zzU((String) objArr[2]);
        }
    }
}
