package com.google.android.gms.internal.ads;

import YgZ.uQga.IYJfqUyym;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzhvx {
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
    private static final zzhiu zzk;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzb = zzhyeVarZza;
        zzhye zzhyeVarZza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        zzc = zzhyeVarZza2;
        zzd = zzhkn.zzd(zzhvw.zza, zzhty.class, zzhlc.class);
        zze = zzhkk.zzd(zzhvr.zza, zzhyeVarZza, zzhlc.class);
        zzf = zzhji.zzd(zzhvs.zza, zzhuc.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhvt.zza, zzhyeVarZza2, zzhlb.class);
        zzh = zzhji.zzd(zzhvu.zza, zzhua.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhvv.zza, zzhyeVarZza, zzhlb.class);
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhqy.RAW, zzhtx.zzd);
        zzhitVarZza.zza(zzhqy.TINK, zzhtx.zza);
        zzhitVarZza.zza(zzhqy.CRUNCHY, zzhtx.zzb);
        zzhitVarZza.zza(zzhqy.LEGACY, zzhtx.zzc);
        zzj = zzhitVarZza.zzb();
        zzhit zzhitVarZza2 = zzhiu.zza();
        zzhitVarZza2.zza(zzhpt.SHA256, zzhtw.zza);
        zzhitVarZza2.zza(zzhpt.SHA384, zzhtw.zzb);
        zzhitVarZza2.zza(zzhpt.SHA512, zzhtw.zzc);
        zzk = zzhitVarZza2.zzb();
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzd);
        zzhkgVar.zze(zze);
        zzhkgVar.zzb(zzf);
        zzhkgVar.zzc(zzg);
        zzhkgVar.zzb(zzh);
        zzhkgVar.zzc(zzi);
    }

    static /* synthetic */ zzhlc zzb(zzhty zzhtyVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zzhrb zzhrbVarZze = zzhrc.zze();
        zzhrbVarZze.zza(zzh(zzhtyVar));
        zzhrbVarZze.zzb(zzhtyVar.zzc());
        byte[] bArrZza = zzhig.zza(zzhtyVar.zzd());
        zzian zzianVar = zzian.zza;
        zzhrbVarZze.zzc(zzian.zzs(bArrZza, 0, bArrZza.length));
        zzhqeVarZze.zzb(((zzhrc) zzhrbVarZze.zzbu()).zzaM());
        zzhqeVarZze.zzc((zzhqy) zzj.zzb(zzhtyVar.zze()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhty zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                zzhrc zzhrcVarZzd = zzhrc.zzd(zzhlcVar.zzc().zzb(), zzibb.zza());
                zzhtv zzhtvVarZzb = zzhty.zzb();
                zzhtvVarZzb.zzd((zzhtw) zzk.zzc(zzhrcVarZzd.zza().zza()));
                zzhtvVarZzb.zzb(new BigInteger(1, zzhrcVarZzd.zzc().zzy()));
                zzhtvVarZzb.zza(zzhrcVarZzd.zzb());
                zzhtvVarZzb.zzc((zzhtx) zzj.zzc(zzhlcVar.zzc().zzc()));
                return zzhtvVarZzb.zze();
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    static /* synthetic */ zzhuc zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals(IYJfqUyym.WFURLgsolGHbv)) {
            try {
                zzhri zzhriVarZze = zzhri.zze(zzhlbVar.zzb(), zzibb.zza());
                if (zzhriVarZze.zza() == 0) {
                    BigInteger bigInteger = new BigInteger(1, zzhriVarZze.zzc().zzy());
                    int iBitLength = bigInteger.bitLength();
                    zzhtv zzhtvVarZzb = zzhty.zzb();
                    zzhtvVarZzb.zzd((zzhtw) zzk.zzc(zzhriVarZze.zzb().zza()));
                    zzhtvVarZzb.zzb(new BigInteger(1, zzhriVarZze.zzd().zzy()));
                    zzhtvVarZzb.zza(iBitLength);
                    zzhtvVarZzb.zzc((zzhtx) zzj.zzc(zzhlbVar.zzd()));
                    zzhty zzhtyVarZze = zzhtvVarZzb.zze();
                    zzhub zzhubVarZzc = zzhuc.zzc();
                    zzhubVarZzc.zza(zzhtyVarZze);
                    zzhubVarZzc.zzb(bigInteger);
                    zzhubVarZzc.zzc(zzhlbVar.zze());
                    return zzhubVarZzc.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
    }

    static /* synthetic */ zzhlb zzf(zzhua zzhuaVar, zzhbt zzhbtVar) {
        zzhrf zzhrfVarZzk = zzhrg.zzk();
        zzhrfVarZzk.zza(0);
        zzhrfVarZzk.zzb(zzi(zzhuaVar.zze()));
        byte[] bArrZza = zzhig.zza(zzhuaVar.zzi().zzb(zzhbtVar));
        zzian zzianVar = zzian.zza;
        zzhrfVarZzk.zzc(zzian.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhig.zza(zzhuaVar.zzf().zzb(zzhbtVar));
        zzhrfVarZzk.zzd(zzian.zzs(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhig.zza(zzhuaVar.zzh().zzb(zzhbtVar));
        zzhrfVarZzk.zze(zzian.zzs(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhig.zza(zzhuaVar.zzj().zzb(zzhbtVar));
        zzhrfVarZzk.zzf(zzian.zzs(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhig.zza(zzhuaVar.zzk().zzb(zzhbtVar));
        zzhrfVarZzk.zzg(zzian.zzs(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhig.zza(zzhuaVar.zzl().zzb(zzhbtVar));
        zzhrfVarZzk.zzh(zzian.zzs(bArrZza6, 0, bArrZza6.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((zzhrg) zzhrfVarZzk.zzbu()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, (zzhqy) zzj.zzb(zzhuaVar.zzd().zze()), zzhuaVar.zze().zzb());
    }

    static /* synthetic */ zzhua zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                zzhrg zzhrgVarZzj = zzhrg.zzj(zzhlbVar.zzb(), zzibb.zza());
                if (zzhrgVarZzj.zza() == 0) {
                    zzhri zzhriVarZzb = zzhrgVarZzj.zzb();
                    if (zzhriVarZzb.zza() == 0) {
                        BigInteger bigInteger = new BigInteger(1, zzhriVarZzb.zzc().zzy());
                        int iBitLength = bigInteger.bitLength();
                        BigInteger bigInteger2 = new BigInteger(1, zzhriVarZzb.zzd().zzy());
                        zzhtv zzhtvVarZzb = zzhty.zzb();
                        zzhtvVarZzb.zzd((zzhtw) zzk.zzc(zzhriVarZzb.zzb().zza()));
                        zzhtvVarZzb.zzb(bigInteger2);
                        zzhtvVarZzb.zza(iBitLength);
                        zzhtvVarZzb.zzc((zzhtx) zzj.zzc(zzhlbVar.zzd()));
                        zzhty zzhtyVarZze = zzhtvVarZzb.zze();
                        zzhub zzhubVarZzc = zzhuc.zzc();
                        zzhubVarZzc.zza(zzhtyVarZze);
                        zzhubVarZzc.zzb(bigInteger);
                        zzhubVarZzc.zzc(zzhlbVar.zze());
                        zzhuc zzhucVarZzd = zzhubVarZzc.zzd();
                        zzhtz zzhtzVarZzc = zzhua.zzc();
                        zzhtzVarZzc.zza(zzhucVarZzd);
                        zzhtzVarZzc.zzb(zzj(zzhrgVarZzj.zzd(), zzhbtVar), zzj(zzhrgVarZzj.zze(), zzhbtVar));
                        zzhtzVarZzc.zzc(zzj(zzhrgVarZzj.zzc(), zzhbtVar));
                        zzhtzVarZzc.zzd(zzj(zzhrgVarZzj.zzg(), zzhbtVar), zzj(zzhrgVarZzj.zzh(), zzhbtVar));
                        zzhtzVarZzc.zze(zzj(zzhrgVarZzj.zzi(), zzhbtVar));
                        return zzhtzVarZzc.zzf();
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhlbVar.zzg())));
    }

    private static zzhre zzh(zzhty zzhtyVar) throws GeneralSecurityException {
        zzhrd zzhrdVarZzb = zzhre.zzb();
        zzhrdVarZzb.zza((zzhpt) zzk.zzb(zzhtyVar.zzf()));
        return (zzhre) zzhrdVarZzb.zzbu();
    }

    private static zzhri zzi(zzhuc zzhucVar) throws GeneralSecurityException {
        zzhrh zzhrhVarZzg = zzhri.zzg();
        zzhrhVarZzg.zza(zzh(zzhucVar.zzf()));
        byte[] bArrZza = zzhig.zza(zzhucVar.zzd());
        zzian zzianVar = zzian.zza;
        zzhrhVarZzg.zzb(zzian.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhig.zza(zzhucVar.zzf().zzd());
        zzhrhVarZzg.zzc(zzian.zzs(bArrZza2, 0, bArrZza2.length));
        return (zzhri) zzhrhVarZzg.zzbu();
    }

    private static zzhyf zzj(zzian zzianVar, zzhbt zzhbtVar) {
        return zzhyf.zza(new BigInteger(1, zzianVar.zzy()), zzhbtVar);
    }
}
