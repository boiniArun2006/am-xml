package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzqg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqg zza(boolean z2) {
        this.zza = z2;
        return this;
    }

    public final zzqg zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzqg zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzqg zzd(int i2) {
        this.zzd = i2;
        return this;
    }

    final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final zzqh zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
