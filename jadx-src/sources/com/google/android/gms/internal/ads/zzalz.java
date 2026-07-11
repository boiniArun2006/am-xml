package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzalz {
    public static void zza(zzama zzamaVar, zzame zzameVar, zzdr zzdrVar) {
        for (int i2 = 0; i2 < zzamaVar.zza(); i2++) {
            long jZzb = zzamaVar.zzb(i2);
            List listZzc = zzamaVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i2 == zzamaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzamaVar.zzb(i2 + 1) - zzamaVar.zzb(i2);
                if (jZzb2 > 0) {
                    zzdrVar.zza(new zzalx(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
