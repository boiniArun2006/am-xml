package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzxu extends zzvj implements zzxi {
    private final zzha zza;
    private final zzxc zzb;
    private final zzto zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzhz zzi;

    @GuardedBy
    private zzak zzj;
    private final zzaaw zzk;

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized void zzA(zzak zzakVar) {
        this.zzj = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized zzak zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzt() {
    }

    private final void zzu() {
        long j2 = this.zzf;
        boolean z2 = this.zzg;
        boolean z3 = this.zzh;
        zzak zzakVarZzJ = zzJ();
        zzbf zzygVar = new zzyg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z2, false, false, null, zzakVarZzJ, z3 ? zzakVarZzJ.zzc : null);
        if (this.zze) {
            zzygVar = new zzxr(this, zzygVar);
        }
        zze(zzygVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzxq) zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        zzhb zzhbVarZza = this.zza.zza();
        zzhz zzhzVar = this.zzi;
        if (zzhzVar != null) {
            zzhbVarZza.zze(zzhzVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzxq(zzagVar.zza, zzhbVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzwkVar), this.zzk, zzf(zzwkVar), this, zzaanVar, null, this.zzd, false, 0, null, zzfj.zzq(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zza(@Nullable zzhz zzhzVar) {
        this.zzi = zzhzVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    /* synthetic */ zzxu(zzak zzakVar, zzha zzhaVar, zzxc zzxcVar, zzto zztoVar, zzaaw zzaawVar, int i2, boolean z2, int i3, zzv zzvVar, zzgru zzgruVar, byte[] bArr) {
        this.zzj = zzakVar;
        this.zza = zzhaVar;
        this.zzb = zzxcVar;
        this.zzc = zztoVar;
        this.zzk = zzaawVar;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(long j2, zzafy zzafyVar, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.zzf;
        }
        boolean zZzb = zzafyVar.zzb();
        if (!this.zze && this.zzf == j2 && this.zzg == zZzb && this.zzh == z2) {
            return;
        }
        this.zzf = j2;
        this.zzg = zZzb;
        this.zzh = z2;
        this.zze = false;
        zzu();
    }
}
