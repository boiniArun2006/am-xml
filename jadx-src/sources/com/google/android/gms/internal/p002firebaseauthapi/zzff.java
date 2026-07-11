package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfe;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzff {
    private static final zzaae zza;
    private static final zzpk<zzfe, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzfc, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfc zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzxo zzxoVarZza = zzxo.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzxoVarZza.zza() == 0) {
                return zzfc.zza(zza(zzxoVarZza.zzd(), zzqeVar.zzc()), zzqeVar.zze());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zzxoVarZza));
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzfe zzfeVar = (zzfe) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzff.zzb(zzfeVar).a_()).zza(zzff.zza(zzfeVar.zzc())).zze()));
            }
        }, zzfe.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzff.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzfc zzfcVar = (zzfc) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzxo) ((zzaky) zzxo.zzb().zza(zzff.zzb((zzfe) ((zzcx) zzfcVar.zza()))).zze())).a_(), zzws.zza.REMOTE, zzff.zza(((zzfe) ((zzcx) zzfcVar.zza())).zzc()), zzfcVar.zzb());
            }
        }, zzfc.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzff.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzfe zza(zzxr zzxrVar, zzxu zzxuVar) throws GeneralSecurityException {
        zzfe.zzc zzcVar;
        zzfe.zzb zzbVar;
        zzce zzceVarZza = zzcm.zza(((zzww) ((zzaky) zzww.zza().zza(zzxrVar.zza().zzf()).zza(zzxrVar.zza().zze()).zza(zzxu.RAW).zze())).zzk());
        if (zzceVarZza instanceof zzdz) {
            zzcVar = zzfe.zzc.zza;
        } else if (zzceVarZza instanceof zzem) {
            zzcVar = zzfe.zzc.zzc;
        } else if (zzceVarZza instanceof zzgg) {
            zzcVar = zzfe.zzc.zzb;
        } else if (zzceVarZza instanceof zzdk) {
            zzcVar = zzfe.zzc.zzd;
        } else if (zzceVarZza instanceof zzdq) {
            zzcVar = zzfe.zzc.zze;
        } else if (zzceVarZza instanceof zzeg) {
            zzcVar = zzfe.zzc.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + String.valueOf(zzceVarZza));
        }
        zzfe.zza zzaVar = new zzfe.zza();
        int i2 = zzfm.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            zzbVar = zzfe.zzb.zza;
        } else if (i2 == 2) {
            zzbVar = zzfe.zzb.zzb;
        } else {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
        }
        return zzaVar.zza(zzbVar).zza(zzxrVar.zze()).zza((zzcx) zzceVarZza).zza(zzcVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfe zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zza(zzxr.zza(zzqdVar.zza().zze(), zzakk.zza()), zzqdVar.zza().zzd());
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxr zzb(zzfe zzfeVar) throws GeneralSecurityException {
        try {
            return (zzxr) ((zzaky) zzxr.zzb().zza(zzfeVar.zzd()).zza(zzww.zza(zzcm.zza(zzfeVar.zzb()), zzakk.zza())).zze());
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    private static zzxu zza(zzfe.zzb zzbVar) throws GeneralSecurityException {
        if (zzfe.zzb.zza.equals(zzbVar)) {
            return zzxu.TINK;
        }
        if (zzfe.zzb.zzb.equals(zzbVar)) {
            return zzxu.RAW;
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
