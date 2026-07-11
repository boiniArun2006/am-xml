package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzvo implements zzwi, zzwh {
    public final zzwi zza;
    long zzb;

    @Nullable
    private zzwh zzc;
    private zzvn[] zzd = new zzvn[0];
    private long zze = 0;

    public zzvo(zzwi zzwiVar, boolean z2, long j2, long j3) {
        this.zza = zzwiVar;
        this.zzb = j3;
    }

    public final void zza(long j2, long j3) {
        this.zzb = j3;
    }

    final boolean zzo() {
        return this.zze != -9223372036854775807L;
    }

    private static long zzq(long j2, long j3, long j4) {
        long jMax = Math.max(j2, j3);
        return j4 != Long.MIN_VALUE ? Math.min(jMax, j4) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j2);
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
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        int length = zzycVarArr.length;
        this.zzd = new zzvn[length];
        zzyc[] zzycVarArr2 = new zzyc[length];
        int i2 = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i2 >= zzycVarArr.length) {
                break;
            }
            zzvn[] zzvnVarArr = this.zzd;
            zzvn zzvnVar = (zzvn) zzycVarArr[i2];
            zzvnVarArr[i2] = zzvnVar;
            if (zzvnVar != null) {
                zzycVar = zzvnVar.zza;
            }
            zzycVarArr2[i2] = zzycVar;
            i2++;
        }
        long jZze = this.zza.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j2);
        long jZzq = zzq(jZze, j2, this.zzb);
        long j3 = -9223372036854775807L;
        if (zzo()) {
            if (jZze < j2) {
                j3 = jZzq;
                break;
            }
            if (jZze != 0) {
                for (zzaac zzaacVar : zzaacVarArr) {
                    if (zzaacVar != null) {
                        zzv zzvVarZzc = zzaacVar.zzc();
                        if (!zzas.zzd(zzvVarZzc.zzo, zzvVarZzc.zzk)) {
                            j3 = jZzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j3;
        for (int i3 = 0; i3 < zzycVarArr.length; i3++) {
            zzyc zzycVar2 = zzycVarArr2[i3];
            if (zzycVar2 == null) {
                this.zzd[i3] = null;
            } else {
                zzvn[] zzvnVarArr2 = this.zzd;
                zzvn zzvnVar2 = zzvnVarArr2[i3];
                if (zzvnVar2 == null || zzvnVar2.zza != zzycVar2) {
                    zzvnVarArr2[i3] = new zzvn(this, zzycVar2);
                }
            }
            zzycVarArr[i3] = this.zzd[i3];
        }
        return jZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z2) {
        this.zza.zzf(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zza.zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzi = this.zza.zzi();
        if (jZzi != Long.MIN_VALUE) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZzi < j2) {
                return jZzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j2, zzmt zzmtVar) {
        if (j2 == 0) {
            return 0L;
        }
        long j3 = zzmtVar.zzd;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j3, j2));
        long j4 = zzmtVar.zze;
        long j5 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j4, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j2));
        if (jMax != j3 || jMax2 != j4) {
            zzmtVar = new zzmt(jMax, jMax2);
        }
        return this.zza.zzk(j2, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long jZzl = this.zza.zzl();
        if (jZzl != Long.MIN_VALUE) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZzl < j2) {
                return jZzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        return this.zza.zzm(zzllVar);
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

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (zzo()) {
            long j2 = this.zze;
            this.zze = -9223372036854775807L;
            long jZzh = zzh();
            if (jZzh != -9223372036854775807L) {
                return jZzh;
            }
            return j2;
        }
        long jZzh2 = this.zza.zzh();
        if (jZzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(jZzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        this.zze = -9223372036854775807L;
        for (zzvn zzvnVar : this.zzd) {
            if (zzvnVar != null) {
                zzvnVar.zza();
            }
        }
        return zzq(this.zza.zzj(j2), 0L, this.zzb);
    }
}
