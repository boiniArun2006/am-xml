package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzkb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzli zzi;

    zzkb(zzli zzliVar, String str, String str2, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = bundle;
        this.zze = z2;
        this.zzf = z3;
        this.zzg = z4;
        this.zzh = str3;
        Objects.requireNonNull(zzliVar);
        this.zzi = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzH(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
