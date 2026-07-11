package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzsr {
    private final zzco[] zza;
    private final zztc zzb;
    private final zzcu zzc;

    public final zzco[] zza() {
        return this.zza;
    }

    public final long zze() {
        return this.zzb.zzr();
    }

    public zzsr(zzco... zzcoVarArr) {
        zztc zztcVar = new zztc();
        zzcu zzcuVar = new zzcu();
        zzco[] zzcoVarArr2 = {zztcVar, zzcuVar};
        this.zza = zzcoVarArr2;
        System.arraycopy(zzcoVarArr, 0, zzcoVarArr2, 0, 0);
        this.zzb = zztcVar;
        this.zzc = zzcuVar;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcu zzcuVar = this.zzc;
        zzcuVar.zzk(zzavVar.zzb);
        zzcuVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z2) {
        this.zzb.zzq(z2);
        return z2;
    }

    public final long zzd(long j2) {
        zzcu zzcuVar = this.zzc;
        return zzcuVar.zzc() ? zzcuVar.zzm(j2) : j2;
    }
}
