package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgmv implements zzgmu {
    private final zzika zza;
    private final zzgoe zzb;
    private final long zzc;

    zzgmv(zzika zzikaVar, zzgoe zzgoeVar, zzgao zzgaoVar, long j2) {
        this.zza = zzikaVar;
        this.zzb = zzgoeVar;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzgduVar.zzc() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z2 = (zzgduVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z2) {
            this.zzb.zzb(15106);
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzgduVar.zzc() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}
