package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class zzaeg {
    protected final zzaea zza;
    protected final zzaef zzb;

    @Nullable
    protected zzaec zzc;
    private final int zzd;

    protected zzaeg(zzaed zzaedVar, zzaef zzaefVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.zzb = zzaefVar;
        this.zzd = i2;
        this.zza = new zzaea(zzaedVar, j2, 0L, j4, j5, j6, j7);
    }

    protected static final int zzf(zzaev zzaevVar, long j2, zzafv zzafvVar) {
        if (j2 == zzaevVar.zzn()) {
            return 0;
        }
        zzafvVar.zza = j2;
        return 1;
    }

    public final zzafy zza() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    protected final void zze(boolean z2, long j2) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzb(long j2) {
        zzaec zzaecVar = this.zzc;
        if (zzaecVar == null || zzaecVar.zze() != j2) {
            zzaea zzaeaVar = this.zza;
            this.zzc = new zzaec(j2, zzaeaVar.zzd(j2), 0L, zzaeaVar.zze(), zzaeaVar.zzf(), zzaeaVar.zzg(), zzaeaVar.zzh());
        }
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        while (true) {
            zzaec zzaecVar = this.zzc;
            zzaecVar.getClass();
            long jZzb = zzaecVar.zzb();
            long jZzc = zzaecVar.zzc();
            long jZzh = zzaecVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzaevVar, jZzb, zzafvVar);
            }
            if (!zzg(zzaevVar, jZzh)) {
                return zzf(zzaevVar, jZzh, zzafvVar);
            }
            zzaevVar.zzl();
            zzaee zzaeeVarZza = this.zzb.zza(zzaevVar, zzaecVar.zzd());
            int iZzd = zzaeeVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzaevVar, jZzh, zzafvVar);
            }
            if (iZzd == -2) {
                zzaecVar.zzf(zzaeeVarZza.zze(), zzaeeVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzaevVar, zzaeeVarZza.zzf());
                    zze(true, zzaeeVarZza.zzf());
                    return zzf(zzaevVar, zzaeeVarZza.zzf(), zzafvVar);
                }
                zzaecVar.zzg(zzaeeVarZza.zze(), zzaeeVarZza.zzf());
            }
        }
    }

    protected static final boolean zzg(zzaev zzaevVar, long j2) throws IOException {
        long jZzn = j2 - zzaevVar.zzn();
        if (jZzn >= 0 && jZzn <= 262144) {
            zzaevVar.zzf((int) jZzn);
            return true;
        }
        return false;
    }
}
