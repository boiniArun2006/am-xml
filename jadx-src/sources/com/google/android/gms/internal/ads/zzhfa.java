package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhfa {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhez.zza, zzhev.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhew.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhex.zza, zzher.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhey.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzheu zzheuVar) throws GeneralSecurityException {
        if (zzheu.zza.equals(zzheuVar)) {
            return zzhqy.TINK;
        }
        if (zzheu.zzb.equals(zzheuVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzheuVar)));
    }

    static /* synthetic */ zzhlc zzb(zzhev zzhevVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhqeVarZze.zzb(zzg(zzhevVar).zzaM());
        zzhqeVarZze.zzc(zzf(zzhevVar.zzc()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhev zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzh(zzhqx.zzc(zzhlcVar.zzc().zzb(), zzibb.zza()), zzhlcVar.zzc().zzc());
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    static /* synthetic */ zzhlb zzd(zzher zzherVar, zzhbt zzhbtVar) {
        zzhqu zzhquVarZzd = zzhqv.zzd();
        zzhquVarZzd.zza(zzg(zzherVar.zze()));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhqv) zzhquVarZzd.zzbu()).zzaM(), zzhqb.REMOTE, zzf(zzherVar.zze().zzc()), zzherVar.zzb());
    }

    static /* synthetic */ zzher zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzhqv zzhqvVarZzc = zzhqv.zzc(zzhlbVar.zzb(), zzibb.zza());
                if (zzhqvVarZzc.zza() == 0) {
                    return zzher.zzd(zzh(zzhqvVarZzc.zzb(), zzhlbVar.zzd()), zzhlbVar.zze());
                }
                String strValueOf = String.valueOf(zzhqvVarZzc);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
                sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                sb.append(strValueOf);
                throw new GeneralSecurityException(sb.toString());
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    private static zzhqx zzg(zzhev zzhevVar) throws GeneralSecurityException {
        try {
            zzhqf zzhqfVarZzd = zzhqf.zzd(zzhbv.zza(zzhevVar.zzd()), zzibb.zza());
            zzhqw zzhqwVarZzd = zzhqx.zzd();
            zzhqwVarZzd.zza(zzhevVar.zzb());
            zzhqwVarZzd.zzb(zzhqfVarZzd);
            return (zzhqx) zzhqwVarZzd.zzbu();
        } catch (zzicg e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    private static zzhev zzh(zzhqx zzhqxVar, zzhqy zzhqyVar) throws GeneralSecurityException {
        zzhet zzhetVar;
        zzheu zzheuVar;
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza(zzhqxVar.zzb().zza());
        zzhqeVarZze.zzb(zzhqxVar.zzb().zzb());
        zzhqeVarZze.zzc(zzhqy.RAW);
        zzhbp zzhbpVarZzb = zzhbv.zzb(((zzhqf) zzhqeVarZze.zzbu()).zzaN());
        if (zzhbpVarZzb instanceof zzhdm) {
            zzhetVar = zzhet.zza;
        } else if (zzhbpVarZzb instanceof zzheb) {
            zzhetVar = zzhet.zzc;
        } else if (zzhbpVarZzb instanceof zzhfx) {
            zzhetVar = zzhet.zzb;
        } else if (zzhbpVarZzb instanceof zzhcv) {
            zzhetVar = zzhet.zzd;
        } else if (zzhbpVarZzb instanceof zzhdd) {
            zzhetVar = zzhet.zze;
        } else if (zzhbpVarZzb instanceof zzhdv) {
            zzhetVar = zzhet.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzhbpVarZzb.toString()));
        }
        zzhes zzhesVar = new zzhes(null);
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                zzheuVar = zzheu.zzb;
            } else {
                int iZza = zzhqyVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        } else {
            zzheuVar = zzheu.zza;
        }
        zzhesVar.zza(zzheuVar);
        zzhesVar.zzb(zzhqxVar.zza());
        zzhesVar.zzd((zzhch) zzhbpVarZzb);
        zzhesVar.zzc(zzhetVar);
        return zzhesVar.zze();
    }
}
