package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzeg;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhe {
    private static final zzaae zza;
    private static final zzpk<zzeg, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzeb, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzeb zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzue zzueVarZza = zzue.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzueVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzeb.zze().zza(zzeg.zzc().zza(zzueVarZza.zzd().zzb()).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zzueVarZza.zzd().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzeg zzegVar = (zzeg) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zzuh) ((zzaky) zzuh.zzc().zza(zzegVar.zzb()).zze())).a_()).zza(zzhe.zza(zzegVar.zzd())).zze()));
            }
        }, zzeg.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzhe.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzeb zzebVar = (zzeb) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzue) ((zzaky) zzue.zzb().zza(zzajp.zza(zzebVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzhe.zza(((zzeg) ((zzcx) zzebVar.zza())).zzd()), zzebVar.zzb());
            }
        }, zzeb.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzhe.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzeg.zza zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzhh.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzeg.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzeg.zza.zzb;
        }
        if (i2 == 4) {
            return zzeg.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzeg zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzuh zzuhVarZza = zzuh.zza(zzqdVar.zza().zze(), zzakk.zza());
                if (zzuhVarZza.zzb() == 0) {
                    return zzeg.zzc().zza(zzuhVarZza.zza()).zza(zza(zzqdVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzeg.zza zzaVar) throws GeneralSecurityException {
        if (zzeg.zza.zza.equals(zzaVar)) {
            return zzxu.TINK;
        }
        if (zzeg.zza.zzb.equals(zzaVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzeg.zza.zzc.equals(zzaVar)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzb);
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
    }
}
