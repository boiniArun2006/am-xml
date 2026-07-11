package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhhq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhhp.zza, zzhfq.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhhm.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhhn.zza, zzhfl.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhho.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzhfp zzhfpVar) throws GeneralSecurityException {
        if (Objects.equals(zzhfpVar, zzhfp.zza)) {
            return zzhqy.TINK;
        }
        if (Objects.equals(zzhfpVar, zzhfp.zzb)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhfpVar.toString()));
    }

    static /* synthetic */ zzhlc zzb(zzhfq zzhfqVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzhrt zzhrtVarZzd = zzhru.zzd();
        zzhrv zzhrvVarZzb = zzhrw.zzb();
        zzhrvVarZzb.zza(zzhfqVar.zzd());
        zzhrtVarZzd.zza((zzhrw) zzhrvVarZzb.zzbu());
        zzhqeVarZze.zzb(((zzhru) zzhrtVarZzd.zzbu()).zzaM());
        zzhqeVarZze.zzc(zzf(zzhfqVar.zzc()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhfq zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzhru zzhruVarZzc = zzhru.zzc(zzhlcVar.zzc().zzb(), zzibb.zza());
                if (zzhruVarZzc.zza() == 0) {
                    return zzhfq.zzb(zzg(zzhlcVar.zzc().zzc()), zzhruVarZzc.zzb().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    static /* synthetic */ zzhlb zzd(zzhfl zzhflVar, zzhbt zzhbtVar) {
        zzhrr zzhrrVarZze = zzhrs.zze();
        byte[] bArrZzc = zzhflVar.zze().zzc(zzhbtVar);
        zzhrrVarZze.zzb(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        zzhrv zzhrvVarZzb = zzhrw.zzb();
        zzhrvVarZzb.zza(zzhflVar.zzf().zzd());
        zzhrrVarZze.zza((zzhrw) zzhrvVarZzb.zzbu());
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhrs) zzhrrVarZze.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhflVar.zzf().zzc()), zzhflVar.zzb());
    }

    static /* synthetic */ zzhfl zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzhrs zzhrsVarZzd = zzhrs.zzd(zzhlbVar.zzb(), zzibb.zza());
                if (zzhrsVarZzd.zza() == 0) {
                    if (zzhrsVarZzd.zzc().zzc() == 32) {
                        return zzhfl.zzd(zzhfq.zzb(zzg(zzhlbVar.zzd()), zzhrsVarZzd.zzb().zza()), zzhyg.zza(zzhrsVarZzd.zzc().zzy(), zzhbtVar), zzhlbVar.zze());
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
    }

    private static zzhfp zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                return zzhfp.zzb;
            }
            int iZza = zzhqyVar.zza();
            StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
            sb.append("Unable to parse OutputPrefixType: ");
            sb.append(iZza);
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhfp.zza;
    }
}
