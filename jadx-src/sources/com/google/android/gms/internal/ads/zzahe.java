package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzahe extends zzaeg {
    public zzahe(final zzafh zzafhVar, int i2, long j2, long j3) {
        long j4;
        Objects.requireNonNull(zzafhVar);
        zzaed zzaedVar = new zzaed() { // from class: com.google.android.gms.internal.ads.zzahc
            @Override // com.google.android.gms.internal.ads.zzaed
            public final /* synthetic */ long zza(long j5) {
                return zzafhVar.zzb(j5);
            }
        };
        zzahd zzahdVar = new zzahd(zzafhVar, i2, null);
        long jZza = zzafhVar.zza();
        long j5 = zzafhVar.zzj;
        int i3 = zzafhVar.zzd;
        if (i3 > 0) {
            j4 = ((((long) i3) + ((long) zzafhVar.zzc)) / 2) + 1;
        } else {
            int i5 = zzafhVar.zza;
            long j6 = 4096;
            if (i5 == zzafhVar.zzb && i5 > 0) {
                j6 = i5;
            }
            j4 = 64 + (((j6 * ((long) zzafhVar.zzg)) * ((long) zzafhVar.zzh)) / 8);
        }
        super(zzaedVar, zzahdVar, jZza, 0L, j5, j2, j3, j4, Math.max(6, zzafhVar.zzc));
    }
}
