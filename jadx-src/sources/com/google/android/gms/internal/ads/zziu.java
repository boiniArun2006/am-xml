package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zziu implements zzlm {
    private final zzmw zza;
    private final zzit zzb;

    @Nullable
    private zzml zzc;

    @Nullable
    private zzlm zzd;
    private boolean zze = true;
    private boolean zzf;

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zze(zzml zzmlVar) {
        if (zzmlVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzav zzj() {
        zzlm zzlmVar = this.zzd;
        return zzlmVar != null ? zzlmVar.zzj() : this.zza.zzj();
    }

    public final void zzc(long j2) {
        this.zza.zzc(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(boolean z2) {
        zzmw zzmwVar;
        zzav zzavVarZzj;
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || zzmlVar.zzZ() || ((z2 && this.zzc.zze() != 2) || (!this.zzc.zzY() && (z2 || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzlm zzlmVar = this.zzd;
            zzlmVar.getClass();
            long jZzg = zzlmVar.zzg();
            if (this.zze) {
                zzmw zzmwVar2 = this.zza;
                if (jZzg < zzmwVar2.zzg()) {
                    zzmwVar2.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zzmwVar2.zza();
                    }
                    zzmwVar = this.zza;
                    zzmwVar.zzc(jZzg);
                    zzavVarZzj = zzlmVar.zzj();
                    if (!zzavVarZzj.equals(zzmwVar.zzj())) {
                        zzmwVar.zzi(zzavVarZzj);
                        this.zzb.zzc(zzavVarZzj);
                    }
                }
            } else {
                zzmwVar = this.zza;
                zzmwVar.zzc(jZzg);
                zzavVarZzj = zzlmVar.zzj();
                if (!zzavVarZzj.equals(zzmwVar.zzj())) {
                }
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzlm zzlmVar = this.zzd;
        zzlmVar.getClass();
        return zzlmVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzlm zzlmVar = this.zzd;
        zzlmVar.getClass();
        return zzlmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzi(zzav zzavVar) {
        zzlm zzlmVar = this.zzd;
        if (zzlmVar != null) {
            zzlmVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    public zziu(zzit zzitVar, zzdn zzdnVar) {
        this.zzb = zzitVar;
        this.zza = new zzmw(zzdnVar);
    }

    public final void zzd(zzml zzmlVar) throws zziw {
        zzlm zzlmVar;
        zzlm zzlmVarZzd = zzmlVar.zzd();
        if (zzlmVarZzd != null && zzlmVarZzd != (zzlmVar = this.zzd)) {
            if (zzlmVar == null) {
                this.zzd = zzlmVarZzd;
                this.zzc = zzmlVar;
                zzlmVarZzd.zzi(this.zza.zzj());
                return;
            }
            throw zziw.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }
}
