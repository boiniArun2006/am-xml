package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final /* synthetic */ class zzhuy implements zzhjh {
    static final /* synthetic */ zzhuy zza = new zzhuy();

    private /* synthetic */ zzhuy() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjh
    public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
        zzhsk zzhskVar = (zzhsk) zzhazVar;
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhvd.zzm(zzhskVar).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, zzhvd.zzh(zzhskVar.zzf().zzf()), zzhskVar.zzb());
    }
}
