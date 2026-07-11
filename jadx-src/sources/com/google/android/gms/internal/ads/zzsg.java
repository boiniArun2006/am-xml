package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsg {

    @Nullable
    private final Context zza;
    private zzso zzb;

    @Nullable
    private zzps zzc;
    private zzsm zzd;

    public final zzsg zza(zzso zzsoVar) {
        this.zzb = zzsoVar;
        return this;
    }

    final zzsg zzb(@Nullable zzps zzpsVar) {
        if (this.zza == null) {
            this.zzc = zzpsVar;
        }
        return this;
    }

    final /* synthetic */ Context zzd() {
        return this.zza;
    }

    final /* synthetic */ zzps zze() {
        return this.zzc;
    }

    public final zzsg zzf(zzsm zzsmVar) {
        this.zzd = zzsmVar;
        return this;
    }

    final /* synthetic */ zzsm zzg() {
        return this.zzd;
    }

    public final zzsi zzc() {
        if (this.zzd == null) {
            this.zzd = new zzsm(this.zza);
        }
        return new zzsi(this, null);
    }

    public zzsg(@Nullable Context context) {
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.zza = applicationContext;
        this.zzb = zzso.zza;
        if (context == null) {
            this.zzc = zzps.zza;
        }
    }
}
