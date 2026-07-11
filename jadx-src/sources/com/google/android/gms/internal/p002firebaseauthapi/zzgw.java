package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzgw {
    private static final zzaae zza;
    private static final zzpk<zzdz, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzds, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzds zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzty zztyVarZza = zzty.zza(zzqeVar.zzd(), zzakk.zza());
            if (zztyVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzds.zze().zza(zzdz.zze().zzb(zztyVarZza.zzd().zzb()).zza(12).zzc(16).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zztyVarZza.zzd().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                return zzgw.zza((zzdz) zzceVar);
            }
        }, zzdz.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzgw.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                return zzgw.zza((zzds) zzbmVar, zzckVar);
            }
        }, zzds.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzha
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzgw.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzdz.zzb zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzgz.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzdz.zzb.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzdz.zzb.zzb;
        }
        if (i2 == 4) {
            return zzdz.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    public static /* synthetic */ zzqe zza(zzds zzdsVar, zzck zzckVar) throws GeneralSecurityException {
        zzb((zzdz) ((zzcx) zzdsVar.zza()));
        return zzqe.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzty) ((zzaky) zzty.zzb().zza(zzajp.zza(zzdsVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zza(((zzdz) ((zzcx) zzdsVar.zza())).zzf()), zzdsVar.zzb());
    }

    public static /* synthetic */ zzqd zza(zzdz zzdzVar) throws GeneralSecurityException {
        zzb(zzdzVar);
        return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzub) ((zzaky) zzub.zzc().zza(zzdzVar.zzc()).zze())).a_()).zza(zza(zzdzVar.zzf())).zze()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdz zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzub zzubVarZza = zzub.zza(zzqdVar.zza().zze(), zzakk.zza());
                if (zzubVarZza.zzb() == 0) {
                    return zzdz.zze().zzb(zzubVarZza.zza()).zza(12).zzc(16).zza(zza(zzqdVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzdz.zzb zzbVar) throws GeneralSecurityException {
        if (zzdz.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzdz.zzb.zzb.equals(zzbVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzdz.zzb.zzc.equals(zzbVar)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    private static void zzb(zzdz zzdzVar) throws GeneralSecurityException {
        if (zzdzVar.zzd() == 16) {
            if (zzdzVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdzVar.zzb())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdzVar.zzd())));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzb);
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
    }
}
