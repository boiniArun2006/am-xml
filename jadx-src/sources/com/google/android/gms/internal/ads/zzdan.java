package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdan {
    private Context zza;
    private zzfjk zzb;
    private Bundle zzc;

    @Nullable
    private zzfjd zzd;

    @Nullable
    private zzdag zze;

    @Nullable
    private zzekl zzf;
    private int zzg = 0;

    public final zzdan zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdan zzb(zzfjk zzfjkVar) {
        this.zzb = zzfjkVar;
        return this;
    }

    public final zzdan zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdan zzd(@Nullable zzdag zzdagVar) {
        this.zze = zzdagVar;
        return this;
    }

    public final zzdao zze() {
        return new zzdao(this, null);
    }

    public final zzdan zzf(zzfjd zzfjdVar) {
        this.zzd = zzfjdVar;
        return this;
    }

    public final zzdan zzg(@Nullable zzekl zzeklVar) {
        this.zzf = zzeklVar;
        return this;
    }

    public final zzdan zzh(int i2) {
        this.zzg = i2;
        return this;
    }

    final /* synthetic */ Context zzi() {
        return this.zza;
    }

    final /* synthetic */ zzfjk zzj() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzk() {
        return this.zzc;
    }

    final /* synthetic */ zzfjd zzl() {
        return this.zzd;
    }

    final /* synthetic */ zzdag zzm() {
        return this.zze;
    }

    final /* synthetic */ zzekl zzn() {
        return this.zzf;
    }

    final /* synthetic */ int zzo() {
        return this.zzg;
    }
}
