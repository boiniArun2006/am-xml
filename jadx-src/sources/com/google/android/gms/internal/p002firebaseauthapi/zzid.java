package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfz;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzid {
    private static final zzaae zza;
    private static final zzpk<zzfz, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzfv, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfv zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzxw zzxwVarZza = zzxw.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzxwVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzxwVarZza.zze().zzb() == 32) {
                return zzfv.zza(zzfz.zza(zza(zzqeVar.zzc()), zzxwVarZza.zzd().zza()), zzaaf.zza(zzxwVarZza.zze().zzd(), zzck.zza(zzckVar)), zzqeVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzig
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzfz zzfzVar = (zzfz) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzxz) ((zzaky) zzxz.zzb().zza((zzyc) ((zzaky) zzyc.zzb().zza(zzfzVar.zzb()).zze())).zze())).a_()).zza(zzid.zza(zzfzVar.zzc())).zze()));
            }
        }, zzfz.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzid.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzii
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzfv zzfvVar = (zzfv) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzxw) ((zzaky) zzxw.zzb().zza(zzajp.zza(zzfvVar.zze().zza(zzck.zza(zzckVar)))).zza((zzyc) ((zzaky) zzyc.zzb().zza(((zzfz) ((zzcx) zzfvVar.zza())).zzb()).zze())).zze())).a_(), zzws.zza.SYMMETRIC, zzid.zza(((zzfz) ((zzcx) zzfvVar.zza())).zzc()), zzfvVar.zzb());
            }
        }, zzfv.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzih
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzid.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzfz.zza zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzik.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzfz.zza.zza;
        }
        if (i2 == 2) {
            return zzfz.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfz zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzxz zzxzVarZza = zzxz.zza(zzqdVar.zza().zze(), zzakk.zza());
                if (zzxzVarZza.zza() == 0) {
                    return zzfz.zza(zza(zzqdVar.zza().zzd()), zzxzVarZza.zzd().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzfz.zza zzaVar) throws GeneralSecurityException {
        if (Objects.equals(zzaVar, zzfz.zza.zza)) {
            return zzxu.TINK;
        }
        if (Objects.equals(zzaVar, zzfz.zza.zzb)) {
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
