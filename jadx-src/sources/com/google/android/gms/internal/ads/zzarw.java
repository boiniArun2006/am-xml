package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzarw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzary zzc;

    zzarw(zzary zzaryVar, String str, long j2) {
        this.zza = str;
        this.zzb = j2;
        Objects.requireNonNull(zzaryVar);
        this.zzc = zzaryVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzary zzaryVar = this.zzc;
        zzaryVar.zzx().zza(this.zza, this.zzb);
        zzaryVar.zzx().zzb(zzaryVar.toString());
    }
}
