package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhhw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhye zzb;
    private static final zzhkn zzc;
    private static final zzhkk zzd;
    private static final zzhji zze;
    private static final zzhjf zzf;

    static {
        zzhye zzhyeVarZza = zzhln.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzhyeVarZza;
        zzc = zzhkn.zzd(zzhhv.zza, zzhfx.class, zzhlc.class);
        zzd = zzhkk.zzd(zzhhs.zza, zzhyeVarZza, zzhlc.class);
        zze = zzhji.zzd(zzhht.zza, zzhfr.class, zzhlb.class);
        zzf = zzhjf.zzd(zzhhu.zza, zzhyeVarZza, zzhlb.class);
    }

    public static void zza(zzhkg zzhkgVar) throws GeneralSecurityException {
        zzhkgVar.zzd(zzc);
        zzhkgVar.zze(zzd);
        zzhkgVar.zzb(zze);
        zzhkgVar.zzc(zzf);
    }

    private static zzhqy zzf(zzhfw zzhfwVar) throws GeneralSecurityException {
        if (zzhfw.zza.equals(zzhfwVar)) {
            return zzhqy.TINK;
        }
        if (zzhfw.zzb.equals(zzhfwVar)) {
            return zzhqy.CRUNCHY;
        }
        if (zzhfw.zzc.equals(zzhfwVar)) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhfwVar.toString()));
    }

    static /* synthetic */ zzhlc zzb(zzhfx zzhfxVar) {
        zzhqe zzhqeVarZze = zzhqf.zze();
        zzhqeVarZze.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzhqeVarZze.zzb(zzhsa.zzc().zzaM());
        zzhqeVarZze.zzc(zzf(zzhfxVar.zzc()));
        return zzhlc.zza((zzhqf) zzhqeVarZze.zzbu());
    }

    static /* synthetic */ zzhfx zzc(zzhlc zzhlcVar) throws GeneralSecurityException {
        if (zzhlcVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzhsa.zzb(zzhlcVar.zzc().zzb(), zzibb.zza()).zza() == 0) {
                    return zzhfx.zzb(zzg(zzhlcVar.zzc().zzc()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzicg e2) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhlcVar.zzc().zza())));
    }

    static /* synthetic */ zzhlb zzd(zzhfr zzhfrVar, zzhbt zzhbtVar) {
        zzhrx zzhrxVarZzd = zzhry.zzd();
        byte[] bArrZzc = zzhfrVar.zze().zzc(zzhbtVar);
        zzhrxVarZzd.zza(zzian.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhlb.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhry) zzhrxVarZzd.zzbu()).zzaM(), zzhqb.SYMMETRIC, zzf(zzhfrVar.zzf().zzc()), zzhfrVar.zzb());
    }

    static /* synthetic */ zzhfr zze(zzhlb zzhlbVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        if (zzhlbVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzhry zzhryVarZzc = zzhry.zzc(zzhlbVar.zzb(), zzibb.zza());
                if (zzhryVarZzc.zza() == 0) {
                    return zzhfr.zzd(zzg(zzhlbVar.zzd()), zzhyg.zza(zzhryVarZzc.zzb().zzy(), zzhbtVar), zzhlbVar.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzicg unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    private static zzhfw zzg(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        int iZza = zzhqyVar.zza();
                        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                        sb.append("Unable to parse OutputPrefixType: ");
                        sb.append(iZza);
                        throw new GeneralSecurityException(sb.toString());
                    }
                } else {
                    return zzhfw.zzc;
                }
            }
            return zzhfw.zzb;
        }
        return zzhfw.zza;
    }
}
