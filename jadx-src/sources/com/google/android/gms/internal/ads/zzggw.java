package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.safedk.android.analytics.brandsafety.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzggw extends zzghb {
    private final Context zza;
    private final Map zzb;

    zzggw(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgoe zzgoeVar) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", zzawgVar, zzgfxVar, zzgoeVar.zza(b.f61769v));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", this.zza);
                if (l2 == null) {
                    throw null;
                }
                lValueOf = l2;
            } else {
                com.google.common.util.concurrent.Xo xo = (com.google.common.util.concurrent.Xo) this.zzb.get("gs");
                if (xo != null && xo.isDone()) {
                    lValueOf = Long.valueOf(((zzaxg) xo.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzawgVar) {
            zzawgVar.zzR(lValueOf.longValue());
        }
    }
}
