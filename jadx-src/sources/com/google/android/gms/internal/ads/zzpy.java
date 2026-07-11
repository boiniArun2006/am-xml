package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzpy {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpy zza(boolean z2) {
        this.zza = z2;
        return this;
    }

    public final zzpy zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzpy zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    final /* synthetic */ boolean zze() {
        return this.zza;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzc;
    }

    public final zzpz zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpz(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
