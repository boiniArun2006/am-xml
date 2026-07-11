package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) throws zzce {
        if (str.length() != 0) {
            try {
                zzhv zzhvVar = new zzhv(this.zza.zza(CollectionsKt.toLongArray(list)), 255L, zzhv.zza);
                StringBuilder sb = new StringBuilder(str.length());
                for (int i2 = 0; i2 < str.length(); i2++) {
                    sb.append((char) UInt.m408constructorimpl(UInt.m408constructorimpl(str.charAt(i2)) ^ UInt.m408constructorimpl((int) zzhvVar.zza())));
                }
                return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
            } catch (Exception e2) {
                throw new zzce(3, 18, e2);
            }
        }
        throw new zzce(3, 17, null);
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        zztz zztzVarZzb = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i2 = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), jZza);
        return zztzVarZzb;
    }
}
