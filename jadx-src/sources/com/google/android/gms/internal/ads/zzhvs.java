package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final /* synthetic */ class zzhvs implements zzhjh {
    static final /* synthetic */ zzhvs zza = new zzhvs();

    private /* synthetic */ zzhvs() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjh
    public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
        zzhuc zzhucVar = (zzhuc) zzhazVar;
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhvx.zzi(zzhucVar).zzaM(), zzhqb.ASYMMETRIC_PUBLIC, (zzhqy) zzhvx.zzj.zzb(zzhucVar.zzf().zze()), zzhucVar.zzb());
    }
}
