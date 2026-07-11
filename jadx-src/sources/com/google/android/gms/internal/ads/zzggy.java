package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzggy extends zzghb {
    private static final Long zza = -1L;
    private final zzgcc zzb;
    private final Context zzc;
    private final Map zzd;

    zzggy(zzawg zzawgVar, zzgfx zzgfxVar, zzgcc zzgccVar, Context context, Map map, zzgoe zzgoeVar) {
        super("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", zzawgVar, zzgfxVar, zzgoeVar.zza(Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        this.zzb = zzgccVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        zzgcc zzgccVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgccVar.ordinal()), this.zzc, zzgqz.zza(this.zzd.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (zzawgVar) {
            try {
                if (zzgccVar == zzgcc.QUERY) {
                    Object obj = objArr[0];
                    Long l2 = zza;
                    zzawgVar.zzq(((Long) zzgqz.zza(obj, l2)).longValue());
                    zzawgVar.zzr(((Long) zzgqz.zza(objArr[1], l2)).longValue());
                }
                zzawgVar.zzg(((Long) objArr[2]).longValue());
                zzawgVar.zzQ(((Long) objArr[3]).longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
