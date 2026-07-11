package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzebh implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzebh(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzebh zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzebh(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeba((zzeak) this.zza.zzb(), (zzdvm) this.zzb.zzb());
    }
}
