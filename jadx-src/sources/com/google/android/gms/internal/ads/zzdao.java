package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzdao {
    private final Context zza;
    private final zzfjk zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfjd zzd;

    @Nullable
    private final zzdag zze;

    @Nullable
    private final zzekl zzf;
    private final int zzg;

    /* synthetic */ zzdao(zzdan zzdanVar, byte[] bArr) {
        this.zza = zzdanVar.zzi();
        this.zzb = zzdanVar.zzj();
        this.zzc = zzdanVar.zzk();
        this.zzd = zzdanVar.zzl();
        this.zze = zzdanVar.zzm();
        this.zzf = zzdanVar.zzn();
        this.zzg = zzdanVar.zzo();
    }

    final zzfjk zzb() {
        return this.zzb;
    }

    @Nullable
    final zzfjd zzc() {
        return this.zzd;
    }

    @Nullable
    final Bundle zzd() {
        return this.zzc;
    }

    @Nullable
    final zzdag zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final int zzh() {
        return this.zzg;
    }

    final zzdan zza() {
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(this.zzb);
        zzdanVar.zzc(this.zzc);
        zzdanVar.zzd(this.zze);
        zzdanVar.zzg(this.zzf);
        return zzdanVar;
    }

    final zzekl zzg(String str) {
        zzekl zzeklVar = this.zzf;
        return zzeklVar != null ? zzeklVar : new zzekl(str);
    }
}
