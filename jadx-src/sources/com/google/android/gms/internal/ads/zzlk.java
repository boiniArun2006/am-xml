package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzlk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzlk zza(long j2) {
        this.zza = j2;
        return this;
    }

    public final zzlk zzb(float f3) {
        boolean z2 = true;
        if (f3 <= 0.0f && f3 != -3.4028235E38f) {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zzb = f3;
        return this;
    }

    public final zzll zzd() {
        return new zzll(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }

    /* synthetic */ zzlk(zzll zzllVar, byte[] bArr) {
        this.zza = zzllVar.zza;
        this.zzb = zzllVar.zzb;
        this.zzc = zzllVar.zzc;
    }

    public final zzlk zzc(long j2) {
        boolean z2 = true;
        if (j2 < 0) {
            if (j2 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                z2 = false;
            }
        }
        zzgrc.zza(z2);
        this.zzc = j2;
        return this;
    }
}
