package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzln {
    public final zzwi zza;
    public final Object zzb;
    public final zzyc[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzlo zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmn[] zzj;
    private final zzaaj zzk;
    private final zzmc zzl;

    @Nullable
    private zzln zzm;
    private zzyn zzn;
    private zzaak zzo;
    private long zzp;

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j2) {
        this.zzp = j2;
    }

    public final void zzh(float f3, zzbf zzbfVar, boolean z2) throws zziw {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaak zzaakVarZzk = zzk(f3, zzbfVar, z2);
        zzlo zzloVar = this.zzg;
        long jMax = zzloVar.zzb;
        long j2 = zzloVar.zze;
        if (j2 != -9223372036854775807L && jMax >= j2) {
            jMax = Math.max(0L, j2 - 1);
        }
        long jZzl = zzl(zzaakVarZzk, jMax, false);
        long j3 = this.zzp;
        zzlo zzloVar2 = this.zzg;
        this.zzp = j3 + (zzloVar2.zzb - jZzl);
        this.zzg = zzloVar2.zza(jZzl);
    }

    public final long zzl(zzaak zzaakVar, long j2, boolean z2) {
        return zzm(zzaakVar, j2, false, new boolean[2]);
    }

    public final long zzm(zzaak zzaakVar, long j2, boolean z2, boolean[] zArr) {
        zzmn[] zzmnVarArr;
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= zzaakVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z2 || !zzaakVar.zzb(this.zzo, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        int i3 = 0;
        while (true) {
            zzmnVarArr = this.zzj;
            if (i3 >= 2) {
                break;
            }
            zzmnVarArr[i3].zza();
            i3++;
        }
        zzv();
        this.zzo = zzaakVar;
        zzu();
        zzwi zzwiVar = this.zza;
        zzaac[] zzaacVarArr = zzaakVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzyc[] zzycVarArr = this.zzc;
        long jZze = zzwiVar.zze(zzaacVarArr, zArr3, zzycVarArr, zArr, j2);
        for (int i5 = 0; i5 < 2; i5++) {
            zzmnVarArr[i5].zza();
        }
        this.zzf = false;
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzycVarArr[i7] != null) {
                zzgrc.zzi(zzaakVar.zza(i7));
                zzmnVarArr[i7].zza();
                this.zzf = true;
            } else {
                zzgrc.zzi(zzaacVarArr[i7] == null);
            }
        }
        return jZze;
    }

    @Nullable
    public final zzln zzp() {
        return this.zzm;
    }

    public final zzyn zzq() {
        return this.zzn;
    }

    public final zzaak zzr() {
        return this.zzo;
    }

    public final void zzt(zzwh zzwhVar, long j2) {
        this.zzd = true;
        this.zza.zzb(zzwhVar, j2);
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zze : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final zzaak zzk(float f3, zzbf zzbfVar, boolean z2) throws zziw {
        zzyn zzynVar = this.zzn;
        zzwk zzwkVar = this.zzg.zza;
        zzaaj zzaajVar = this.zzk;
        zzmn[] zzmnVarArr = this.zzj;
        zzaak zzaakVarZzq = zzaajVar.zzq(zzmnVarArr, zzynVar, zzwkVar, zzbfVar);
        for (int i2 = 0; i2 < zzaakVarZzq.zza; i2++) {
            if (zzaakVarZzq.zza(i2)) {
                if (zzaakVarZzq.zzc[i2] == null) {
                    zzmnVarArr[i2].zza();
                    z = false;
                }
                zzgrc.zzi(z);
            } else {
                zzgrc.zzi(zzaakVarZzq.zzc[i2] == null);
            }
        }
        for (zzaac zzaacVar : zzaakVarZzq.zzc) {
        }
        return zzaakVarZzq;
    }

    public final void zzo(@Nullable zzln zzlnVar) {
        if (zzlnVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlnVar;
        zzu();
    }

    public final void zzs() {
        zzwi zzwiVar = this.zza;
        if (zzwiVar instanceof zzvo) {
            long j2 = this.zzg.zzd;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((zzvo) zzwiVar).zza(0L, j2);
        }
    }

    public zzln(zzmn[] zzmnVarArr, long j2, zzaaj zzaajVar, zzaan zzaanVar, zzmc zzmcVar, zzlo zzloVar, zzaak zzaakVar, long j3) {
        this.zzj = zzmnVarArr;
        this.zzp = j2;
        this.zzk = zzaajVar;
        this.zzl = zzmcVar;
        zzwk zzwkVar = zzloVar.zza;
        this.zzb = zzwkVar.zza;
        this.zzg = zzloVar;
        this.zzn = zzyn.zza;
        this.zzo = zzaakVar;
        this.zzc = new zzyc[2];
        this.zzi = new boolean[2];
        long j4 = zzloVar.zzb;
        long j5 = zzloVar.zzd;
        zzwi zzwiVarZze = zzmcVar.zze(zzwkVar, zzaanVar, j4);
        this.zza = j5 != -9223372036854775807L ? new zzvo(zzwiVarZze, true, 0L, j5) : zzwiVarZze;
    }

    private final void zzu() {
        if (zzw()) {
            int i2 = 0;
            while (true) {
                zzaak zzaakVar = this.zzo;
                if (i2 < zzaakVar.zza) {
                    zzaakVar.zza(i2);
                    zzaac zzaacVar = this.zzo.zzc[i2];
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzv() {
        if (zzw()) {
            int i2 = 0;
            while (true) {
                zzaak zzaakVar = this.zzo;
                if (i2 < zzaakVar.zza) {
                    zzaakVar.zza(i2);
                    zzaac zzaacVar = this.zzo.zzc[i2];
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzi(long j2) {
        zzgrc.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j2 - this.zzp);
        }
    }

    public final void zzj(zzll zzllVar) {
        zzgrc.zzi(zzw());
        this.zza.zzm(zzllVar);
    }

    public final void zzn() {
        zzv();
        zzwi zzwiVar = this.zza;
        try {
            boolean z2 = zzwiVar instanceof zzvo;
            zzmc zzmcVar = this.zzl;
            if (z2) {
                zzmcVar.zzf(((zzvo) zzwiVar).zza);
            } else {
                zzmcVar.zzf(zzwiVar);
            }
        } catch (RuntimeException e2) {
            zzee.zzf("MediaPeriodHolder", "Period release failed.", e2);
        }
    }
}
