package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzhwg {
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
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzb = zzhyeVarZza;
        zzhye zzhyeVarZza2 = zzhln.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        zzc = zzhyeVarZza2;
        zzd = zzhkn.zzd(zzhwf.zza, zzhuk.class, zzhlc.class);
        zze = zzhkk.zzd(zzhwa.zza, zzhyeVarZza, zzhlc.class);
        zzf = zzhji.zzd(zzhwb.zza, zzhuo.class, zzhlb.class);
        zzg = zzhjf.zzd(zzhwc.zza, zzhyeVarZza2, zzhlb.class);
        zzh = zzhji.zzd(zzhwd.zza, zzhum.class, zzhlb.class);
        zzi = zzhjf.zzd(zzhwe.zza, zzhyeVarZza, zzhlb.class);
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhqy.RAW, zzhuj.zzd);
        zzhitVarZza.zza(zzhqy.TINK, zzhuj.zza);
        zzhitVarZza.zza(zzhqy.CRUNCHY, zzhuj.zzb);
        zzhitVarZza.zza(zzhqy.LEGACY, zzhuj.zzc);
        zzj = zzhitVarZza.zzb();
        zzhit zzhitVarZza2 = zzhiu.zza();
        zzhitVarZza2.zza(zzhpt.SHA256, zzhui.zza);
        zzhitVarZza2.zza(zzhpt.SHA384, zzhui.zzb);
        zzhitVarZza2.zza(zzhpt.SHA512, zzhui.zzc);
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

    static /* synthetic */ zzhlc zzb(zzhuk zzhukVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zzhrj zzhrjVarZze = zzhrk.zze();
        zzhrjVarZze.zza(zzh(zzhukVar));
        zzhrjVarZze.zzb(zzhukVar.zzc());
        byte[] bArrZza = zzhig.zza(zzhukVar.zzd());
        zzian zzianVar = zzian.zza;
        zzhrjVarZze.zzc(zzian.zzs(bArrZza, 0, bArrZza.length));
        zzhqeVarZze.zzb(((zzhrk) zzhrjVarZze.zzbu()).zzaM());
        zzhqeVarZze.zzc((zzhqy) zzj.zzb(zzhukVar.zze()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhuk zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            try {
                zzhrk zzhrkVarZzd = zzhrk.zzd(zzhlcVar.zzc().zzb(), zzibb.zza());
                zzhuh zzhuhVarZzb = zzhuk.zzb();
                zzhiu zzhiuVar = zzk;
                zzhuhVarZzb.zzd((zzhui) zzhiuVar.zzc(zzhrkVarZzd.zza().zza()));
                zzhuhVarZzb.zze((zzhui) zzhiuVar.zzc(zzhrkVarZzd.zza().zzb()));
                zzhuhVarZzb.zzb(new BigInteger(1, zzhrkVarZzd.zzc().zzy()));
                zzhuhVarZzb.zza(zzhrkVarZzd.zzb());
                zzhuhVarZzb.zzf(zzhrkVarZzd.zza().zzc());
                zzhuhVarZzb.zzc((zzhuj) zzj.zzc(zzhlcVar.zzc().zzc()));
                return zzhuhVarZzb.zzg();
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    static /* synthetic */ zzhuo zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            try {
                zzhrq zzhrqVarZze = zzhrq.zze(zzhlbVar.zzb(), zzibb.zza());
                if (zzhrqVarZze.zza() == 0) {
                    BigInteger bigInteger = new BigInteger(1, zzhrqVarZze.zzc().zzy());
                    int iBitLength = bigInteger.bitLength();
                    zzhuh zzhuhVarZzb = zzhuk.zzb();
                    zzhiu zzhiuVar = zzk;
                    zzhuhVarZzb.zzd((zzhui) zzhiuVar.zzc(zzhrqVarZze.zzb().zza()));
                    zzhuhVarZzb.zze((zzhui) zzhiuVar.zzc(zzhrqVarZze.zzb().zzb()));
                    zzhuhVarZzb.zzb(new BigInteger(1, zzhrqVarZze.zzd().zzy()));
                    zzhuhVarZzb.zza(iBitLength);
                    zzhuhVarZzb.zzf(zzhrqVarZze.zzb().zzc());
                    zzhuhVarZzb.zzc((zzhuj) zzj.zzc(zzhlbVar.zzd()));
                    zzhuk zzhukVarZzg = zzhuhVarZzb.zzg();
                    zzhun zzhunVarZzc = zzhuo.zzc();
                    zzhunVarZzc.zza(zzhukVarZzg);
                    zzhunVarZzc.zzb(bigInteger);
                    zzhunVarZzc.zzc(zzhlbVar.zze());
                    return zzhunVarZzc.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhlbVar.zzg())));
    }

    static /* synthetic */ zzhlb zzf(zzhum zzhumVar, zzhbt zzhbtVar) {
        zzhrn zzhrnVarZzk = zzhro.zzk();
        zzhrnVarZzk.zza(0);
        zzhrnVarZzk.zzb(zzi(zzhumVar.zze()));
        byte[] bArrZza = zzhig.zza(zzhumVar.zzi().zzb(zzhbtVar));
        zzian zzianVar = zzian.zza;
        zzhrnVarZzk.zzc(zzian.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhig.zza(zzhumVar.zzf().zzb(zzhbtVar));
        zzhrnVarZzk.zzd(zzian.zzs(bArrZza2, 0, bArrZza2.length));
        byte[] bArrZza3 = zzhig.zza(zzhumVar.zzh().zzb(zzhbtVar));
        zzhrnVarZzk.zze(zzian.zzs(bArrZza3, 0, bArrZza3.length));
        byte[] bArrZza4 = zzhig.zza(zzhumVar.zzj().zzb(zzhbtVar));
        zzhrnVarZzk.zzf(zzian.zzs(bArrZza4, 0, bArrZza4.length));
        byte[] bArrZza5 = zzhig.zza(zzhumVar.zzk().zzb(zzhbtVar));
        zzhrnVarZzk.zzg(zzian.zzs(bArrZza5, 0, bArrZza5.length));
        byte[] bArrZza6 = zzhig.zza(zzhumVar.zzl().zzb(zzhbtVar));
        zzhrnVarZzk.zzh(zzian.zzs(bArrZza6, 0, bArrZza6.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((zzhro) zzhrnVarZzk.zzbu()).zzaM(), zzhqb.ASYMMETRIC_PRIVATE, (zzhqy) zzj.zzb(zzhumVar.zzd().zze()), zzhumVar.zze().zzb());
    }

    static /* synthetic */ zzhum zzg(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            try {
                zzhro zzhroVarZzj = zzhro.zzj(zzhlbVar.zzb(), zzibb.zza());
                if (zzhroVarZzj.zza() == 0) {
                    zzhrq zzhrqVarZzb = zzhroVarZzj.zzb();
                    if (zzhrqVarZzb.zza() == 0) {
                        BigInteger bigInteger = new BigInteger(1, zzhrqVarZzb.zzc().zzy());
                        int iBitLength = bigInteger.bitLength();
                        BigInteger bigInteger2 = new BigInteger(1, zzhrqVarZzb.zzd().zzy());
                        zzhuh zzhuhVarZzb = zzhuk.zzb();
                        zzhiu zzhiuVar = zzk;
                        zzhuhVarZzb.zzd((zzhui) zzhiuVar.zzc(zzhrqVarZzb.zzb().zza()));
                        zzhuhVarZzb.zze((zzhui) zzhiuVar.zzc(zzhrqVarZzb.zzb().zzb()));
                        zzhuhVarZzb.zzb(bigInteger2);
                        zzhuhVarZzb.zza(iBitLength);
                        zzhuhVarZzb.zzf(zzhrqVarZzb.zzb().zzc());
                        zzhuhVarZzb.zzc((zzhuj) zzj.zzc(zzhlbVar.zzd()));
                        zzhuk zzhukVarZzg = zzhuhVarZzb.zzg();
                        zzhun zzhunVarZzc = zzhuo.zzc();
                        zzhunVarZzc.zza(zzhukVarZzg);
                        zzhunVarZzc.zzb(bigInteger);
                        zzhunVarZzc.zzc(zzhlbVar.zze());
                        zzhuo zzhuoVarZzd = zzhunVarZzc.zzd();
                        zzhul zzhulVarZzc = zzhum.zzc();
                        zzhulVarZzc.zza(zzhuoVarZzd);
                        zzhulVarZzc.zzb(zzj(zzhroVarZzj.zzd(), zzhbtVar), zzj(zzhroVarZzj.zze(), zzhbtVar));
                        zzhulVarZzc.zzc(zzj(zzhroVarZzj.zzc(), zzhbtVar));
                        zzhulVarZzc.zzd(zzj(zzhroVarZzj.zzg(), zzhbtVar), zzj(zzhroVarZzj.zzh(), zzhbtVar));
                        zzhulVarZzc.zze(zzj(zzhroVarZzj.zzi(), zzhbtVar));
                        return zzhulVarZzc.zzf();
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
            }
        }
        throw new IllegalArgumentException(dpcnwfoVOnrtRA.uMNKTzuwGpLgRWE.concat(String.valueOf(zzhlbVar.zzg())));
    }

    private static zzhrm zzh(zzhuk zzhukVar) throws GeneralSecurityException {
        zzhrl zzhrlVarZzd = zzhrm.zzd();
        zzhiu zzhiuVar = zzk;
        zzhrlVarZzd.zza((zzhpt) zzhiuVar.zzb(zzhukVar.zzf()));
        zzhrlVarZzd.zzb((zzhpt) zzhiuVar.zzb(zzhukVar.zzg()));
        zzhrlVarZzd.zzc(zzhukVar.zzh());
        return (zzhrm) zzhrlVarZzd.zzbu();
    }

    private static zzhrq zzi(zzhuo zzhuoVar) throws GeneralSecurityException {
        zzhrp zzhrpVarZzg = zzhrq.zzg();
        zzhrpVarZzg.zzb(zzh(zzhuoVar.zzf()));
        byte[] bArrZza = zzhig.zza(zzhuoVar.zzd());
        zzian zzianVar = zzian.zza;
        zzhrpVarZzg.zzc(zzian.zzs(bArrZza, 0, bArrZza.length));
        byte[] bArrZza2 = zzhig.zza(zzhuoVar.zzf().zzd());
        zzhrpVarZzg.zzd(zzian.zzs(bArrZza2, 0, bArrZza2.length));
        zzhrpVarZzg.zza(0);
        return (zzhrq) zzhrpVarZzg.zzbu();
    }

    private static zzhyf zzj(zzian zzianVar, zzhbt zzhbtVar) {
        return zzhyf.zza(new BigInteger(1, zzianVar.zzy()), zzhbtVar);
    }
}
