package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzggi extends zzghb {
    private final Map zza;
    private final Context zzb;
    private final zzgcc zzc;
    private final long zzd;
    private final long zze;

    zzggi(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgcc zzgccVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", zzawgVar, zzgfxVar, zzgoeVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgccVar;
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        zzaxg zzaxgVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = dpcnwfoVOnrtRA.XqfZh;
        int i2 = 1;
        try {
            com.google.common.util.concurrent.Xo xo = (com.google.common.util.concurrent.Xo) this.zza.get("gs");
            if (xo != null && ((Build.VERSION.SDK_INT < 31 || xo.isDone()) && (zzaxgVar = (zzaxg) xo.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaxgVar.zzb().length() > 1)) {
                strZzb = zzaxgVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                com.google.common.util.concurrent.Xo xo2 = (com.google.common.util.concurrent.Xo) this.zza.get("ai");
                if (xo2 != null) {
                    String str = (String) xo2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzu(((Long) objArr[0]).longValue());
                zzawgVar.zzt((String) objArr[1]);
                zzawgVar.zzD((String) objArr[2]);
                zzawgVar.zzE((String) objArr[3]);
                zzgxa zzgxaVarZzi = zzgxa.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzawgVar.zzp(zzgxaVarZzi.zzj(bArr, 0, bArr.length));
                zzawgVar.zzo(strZzb);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i2 = 2;
                    }
                    zzawgVar.zzai(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
