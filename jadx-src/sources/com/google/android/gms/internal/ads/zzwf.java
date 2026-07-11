package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzwf extends zzyp {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzwd zze;

    @Nullable
    private zzwc zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    @Override // com.google.android.gms.internal.ads.zzyp, com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzwc) zzwiVar).zzu();
        if (zzwiVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbf zzz() {
        return this.zze;
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzwd.zzc)) ? obj : this.zze.zzs();
    }

    private final boolean zzL(long j2) {
        zzwc zzwcVar = this.zzf;
        int iZze = this.zze.zze(zzwcVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzwd zzwdVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzwdVar.zzd(iZze, zzbdVar, false);
        long j3 = zzbdVar.zzd;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        zzwcVar.zzo(j2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzA(zzak zzakVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzyl(this.zze.zzb, zzakVar));
        } else {
            this.zze = zzwd.zzp(zzakVar);
        }
        ((zzyp) this).zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzyp) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzyp, com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzwc zzG(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        zzwc zzwcVar = new zzwc(zzwkVar, zzaanVar, j2);
        zzwcVar.zzr(((zzyp) this).zza);
        if (this.zzh) {
            zzwcVar.zzt(zzwkVar.zza(zzK(zzwkVar.zza)));
            return zzwcVar;
        }
        this.zzf = zzwcVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzyp) this).zza);
        }
        return zzwcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(zzbf zzbfVar) {
        zzwk zzwkVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            zzwc zzwcVar = this.zzf;
            if (zzwcVar != null) {
                zzL(zzwcVar.zzq());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwd.zzq(zzbfVar, zzbe.zza, zzwd.zzc);
        } else {
            zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            Object obj = zzbeVar.zzb;
            zzwc zzwcVar2 = this.zzf;
            if (zzwcVar2 != null) {
                long jZza = zzwcVar2.zza();
                this.zze.zzo(zzwcVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
                if (jZza == 0) {
                    jZza = 0;
                }
                Pair pairZzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, jZza);
                Object obj2 = pairZzm.first;
                long jLongValue = ((Long) pairZzm.second).longValue();
                this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwd.zzq(zzbfVar, obj, obj2);
                zzwc zzwcVar3 = this.zzf;
                if (zzwcVar3 != null && zzL(jLongValue)) {
                    zzwk zzwkVar = zzwcVar3.zza;
                    zzwkVarZza = zzwkVar.zza(zzK(zzwkVar.zza));
                }
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzwkVarZza != null) {
            zzwc zzwcVar4 = this.zzf;
            zzwcVar4.getClass();
            zzwcVar4.zzt(zzwkVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    @Nullable
    protected final zzwk zzF(zzwk zzwkVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzwkVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzwd.zzc;
        }
        return zzwkVar.zza(obj);
    }

    public zzwf(zzwm zzwmVar, boolean z2) {
        boolean z3;
        super(zzwmVar);
        if (z2) {
            zzwmVar.zzI();
            z3 = true;
        } else {
            z3 = false;
        }
        this.zzb = z3;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzwmVar.zzH();
        this.zze = zzwd.zzp(zzwmVar.zzJ());
    }
}
