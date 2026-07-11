package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzyk implements zzwi, zzwh {
    private final zzwi zza;
    private final long zzb;
    private zzwh zzc;

    public zzyk(zzwi zzwiVar, long j2) {
        this.zza = zzwiVar;
        this.zzb = j2;
    }

    public final zzwi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        zzyc[] zzycVarArr2 = new zzyc[zzycVarArr.length];
        int i2 = 0;
        while (true) {
            zzyc zzycVarZza = null;
            if (i2 >= zzycVarArr.length) {
                break;
            }
            zzyj zzyjVar = (zzyj) zzycVarArr[i2];
            if (zzyjVar != null) {
                zzycVarZza = zzyjVar.zza();
            }
            zzycVarArr2[i2] = zzycVarZza;
            i2++;
        }
        zzwi zzwiVar = this.zza;
        long j3 = this.zzb;
        long jZze = zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j2 - j3);
        for (int i3 = 0; i3 < zzycVarArr.length; i3++) {
            zzyc zzycVar = zzycVarArr2[i3];
            if (zzycVar == null) {
                zzycVarArr[i3] = null;
            } else {
                zzyc zzycVar2 = zzycVarArr[i3];
                if (zzycVar2 == null || ((zzyj) zzycVar2).zza() != zzycVar) {
                    zzycVarArr[i3] = new zzyj(zzycVar, j3);
                }
            }
        }
        return jZze + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z2) {
        this.zza.zzf(j2 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zza.zzg(j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long jZzh = this.zza.zzh();
        if (jZzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        long j3 = this.zzb;
        return this.zza.zzj(j2 - j3) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j2, zzmt zzmtVar) {
        long j3 = this.zzb;
        return this.zza.zzk(j2 - j3, zzmtVar) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        long j2 = zzllVar.zza;
        long j3 = this.zzb;
        zzlk zzlkVarZza = zzllVar.zza();
        zzlkVarZza.zza(j2 - j3);
        return this.zza.zzm(zzlkVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
