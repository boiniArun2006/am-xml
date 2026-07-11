package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsp {

    @Nullable
    private final Context zza;
    private final zzps zzb;
    private boolean zzc;
    private zzso zzd;
    private zzqm zze;

    @Nullable
    private zzsr zzf;
    private zzsm zzg;

    @Deprecated
    public zzsp() {
        this.zza = null;
        this.zzb = zzps.zza;
    }

    final /* synthetic */ Context zzb() {
        return this.zza;
    }

    final /* synthetic */ zzqm zzc() {
        return this.zze;
    }

    final /* synthetic */ zzsr zzd() {
        return this.zzf;
    }

    public zzsp(Context context) {
        this.zza = context;
        this.zzb = zzps.zza;
    }

    public final zzsw zza() {
        zzgrc.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzsr(new zzco[0]);
        }
        if (this.zze == null) {
            if (this.zzg == null) {
                this.zzg = new zzsm(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = zzso.zza;
            }
            Context context = this.zza;
            zzsg zzsgVar = new zzsg(context);
            zzsgVar.zzb(context != null ? null : this.zzb);
            zzsgVar.zzf(this.zzg);
            zzsgVar.zza(this.zzd);
            this.zze = zzsgVar.zzc();
        } else {
            zzgrc.zzi(this.zzg == null);
            zzgrc.zzi(this.zzd == null);
        }
        return new zzsw(this, null);
    }
}
