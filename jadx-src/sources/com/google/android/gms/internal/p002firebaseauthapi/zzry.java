package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqw;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzry {
    private static final zzaae zza;
    private static final zzpk<zzqw, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzqp, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqp zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzsr zzsrVarZza = zzsr.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzsrVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqp.zzc().zza(zzqw.zzd().zza(zzsrVarZza.zze().zzb()).zzb(zzsrVarZza.zzd().zza()).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zzsrVarZza.zze().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzqw zzqwVar = (zzqw) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsu) ((zzaky) zzsu.zzb().zza(zzry.zzb(zzqwVar)).zza(zzqwVar.zzc()).zze())).a_()).zza(zzry.zza(zzqwVar.zze())).zze()));
            }
        }, zzqw.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzry.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzqp zzqpVar = (zzqp) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsr) ((zzaky) zzsr.zzb().zza(zzry.zzb((zzqw) ((zzrm) zzqpVar.zza()))).zza(zzajp.zza(zzqpVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzry.zza(((zzqw) ((zzrm) zzqpVar.zza())).zze()), zzqpVar.zzb());
            }
        }, zzqp.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzry.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqw zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsu zzsuVarZza = zzsu.zza(zzqdVar.zza().zze(), zzakk.zza());
                return zzqw.zzd().zza(zzsuVarZza.zza()).zzb(zzsuVarZza.zzd().zza()).zza(zza(zzqdVar.zza().zzd())).zza();
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzqw.zzb zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzsf.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzqw.zzb.zza;
        }
        if (i2 == 2) {
            return zzqw.zzb.zzb;
        }
        if (i2 == 3) {
            return zzqw.zzb.zzc;
        }
        if (i2 == 4) {
            return zzqw.zzb.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    private static zzsx zzb(zzqw zzqwVar) {
        return (zzsx) ((zzaky) zzsx.zzb().zza(zzqwVar.zzb()).zze());
    }

    private static zzxu zza(zzqw.zzb zzbVar) throws GeneralSecurityException {
        if (zzqw.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzqw.zzb.zzb.equals(zzbVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzqw.zzb.zzd.equals(zzbVar)) {
            return zzxu.RAW;
        }
        if (zzqw.zzb.zzc.equals(zzbVar)) {
            return zzxu.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzb);
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
    }
}
