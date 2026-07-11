package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhvm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhye zzc;
    private static final zzhkn zzd;
    private static final zzhkk zze;
    private static final zzhji zzf;
    private static final zzhjf zzg;
    private static final zzhji zzh;
    private static final zzhjf zzi;
    private static final zzhiu zzj;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zzhyeVarZza;
        zzhye zzhyeVarZza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zzhyeVarZza2;
        zzd = zzhkn.zzd(zzhvl.zza, zzhsq.class, zzhlc.class);
        zze = zzhkk.zzd(zzhvg.zza, zzhyeVarZza, zzhlc.class);
        zzf = zzhji.zzd(zzhvh.zza, zzhsx.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhvi.zza, zzhyeVarZza2, zzhlb.class);
        zzh = zzhji.zzd(zzhvj.zza, zzhsr.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhvk.zza, zzhyeVarZza, zzhlb.class);
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhqy.RAW, zzhsp.zzd);
        zzhitVarZza.zza(zzhqy.TINK, zzhsp.zza);
        zzhitVarZza.zza(zzhqy.CRUNCHY, zzhsp.zzb);
        zzhitVarZza.zza(zzhqy.LEGACY, zzhsp.zzc);
        zzj = zzhitVarZza.zzb();
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzd);
        zzhkgVar.zze(zze);
        zzhkgVar.zzb(zzf);
        zzhkgVar.zzc(zzg);
        zzhkgVar.zzb(zzh);
        zzhkgVar.zzc(zzi);
    }

    static /* synthetic */ zzhlc zzb(zzhsq zzhsqVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzhqeVarZze.zzb(zzhpn.zzc().zzaM());
        zzhqeVarZze.zzc((zzhqy) zzj.zzb(zzhsqVar.zzc()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhsq zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            try {
                if (zzhpn.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza() == 0) {
                    return zzhsq.zzb((zzhsp) zzj.zzc(zzhlcVar.zzc().zzc()));
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    static /* synthetic */ zzhsx zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            try {
                zzhpr zzhprVarZzc = zzhpr.zzc(zzhlbVar.zzb(), zzibb.zza());
                if (zzhprVarZzc.zza() == 0) {
                    return zzhsx.zzc((zzhsp) zzj.zzc(zzhlbVar.zzd()), zzhye.zza(zzhprVarZzc.zzb().zzy()), zzhlbVar.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg unused) {
                throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
    }

    static /* synthetic */ zzhlb zzf(zzhsr zzhsrVar, zzhbt zzhbtVar) {
        zzhpo zzhpoVarZze = zzhpp.zze();
        zzhpoVarZze.zzb(zzh(zzhsrVar.zze()));
        byte[] bArrZzc = zzhsrVar.zzf().zzc(zzhbtVar);
        zzhpoVarZze.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhpp) zzhpoVarZze.zzbu()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, (zzhqy) zzj.zzb(zzhsrVar.zzd().zzc()), zzhsrVar.zze().zzb());
    }

    static /* synthetic */ zzhsr zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            try {
                zzhpp zzhppVarZzd = zzhpp.zzd(zzhlbVar.zzb(), zzibb.zza());
                if (zzhppVarZzd.zza() == 0) {
                    zzhpr zzhprVarZzc = zzhppVarZzd.zzc();
                    if (zzhprVarZzc.zza() == 0) {
                        return zzhsr.zzc(zzhsx.zzc((zzhsp) zzj.zzc(zzhlbVar.zzd()), zzhye.zza(zzhprVarZzc.zzb().zzy()), zzhlbVar.zze()), zzhyg.zza(zzhppVarZzd.zzb().zzy(), zzhbtVar));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg unused) {
                throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
    }

    private static zzhpr zzh(zzhsx zzhsxVar) {
        zzhpq zzhpqVarZzd = zzhpr.zzd();
        byte[] bArrZzc = zzhsxVar.zzd().zzc();
        zzhpqVarZzd.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return (zzhpr) zzhpqVarZzd.zzbu();
    }
}
