package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgg;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzim {
    private static final zzaae zza;
    private static final zzpk<zzgg, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzgb, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgb zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzyf zzyfVarZza = zzyf.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzyfVarZza.zza() == 0) {
                return zzgb.zza(zza(zzqeVar.zzc()), zzaaf.zza(zzyfVarZza.zzd().zzd(), zzck.zza(zzckVar)), zzqeVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzil
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzyi.zzc().a_()).zza(zzim.zza(((zzgg) zzceVar).zzb())).zze()));
            }
        }, zzgg.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzio
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzim.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzin
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzgb zzgbVar = (zzgb) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzyf) ((zzaky) zzyf.zzb().zza(zzajp.zza(zzgbVar.zze().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzim.zza(((zzgg) ((zzcx) zzgbVar.zza())).zzb()), zzgbVar.zzb());
            }
        }, zzgb.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zziq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzim.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzgg.zza zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzip.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzgg.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzgg.zza.zzb;
        }
        if (i2 == 4) {
            return zzgg.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgg zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzyi.zza(zzqdVar.zza().zze(), zzakk.zza()).zza() == 0) {
                    return zzgg.zza(zza(zzqdVar.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzgg.zza zzaVar) throws GeneralSecurityException {
        if (zzgg.zza.zza.equals(zzaVar)) {
            return zzxu.TINK;
        }
        if (zzgg.zza.zzb.equals(zzaVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzgg.zza.zzc.equals(zzaVar)) {
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
