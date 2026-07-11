package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcoa {
    private zzcmc zza;
    private zzcox zzb;
    private zzfny zzc;
    private zzcpl zzd;
    private zzfkn zze;

    private zzcoa() {
        throw null;
    }

    /* synthetic */ zzcoa(byte[] bArr) {
    }

    public final zzcoa zza(zzcmc zzcmcVar) {
        this.zza = zzcmcVar;
        return this;
    }

    public final zzcoa zzb(zzcox zzcoxVar) {
        this.zzb = zzcoxVar;
        return this;
    }

    public final zzcma zzc() {
        zziko.zzc(this.zza, zzcmc.class);
        zziko.zzc(this.zzb, zzcox.class);
        if (this.zzc == null) {
            this.zzc = new zzfny();
        }
        if (this.zzd == null) {
            this.zzd = new zzcpl();
        }
        if (this.zze == null) {
            this.zze = new zzfkn();
        }
        return new zzcnp(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
