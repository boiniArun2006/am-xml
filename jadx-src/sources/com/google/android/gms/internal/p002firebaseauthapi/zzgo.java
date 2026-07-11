package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgo {
    private static final zzaae zza;
    private static final zzpk<zzdq, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzdl, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdl zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zztp zztpVarZza = zztp.zza(zzqeVar.zzd(), zzakk.zza());
            if (zztpVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdl.zze().zza(zzdq.zze().zzb(zztpVarZza.zze().zzb()).zza(zztpVarZza.zzd().zza()).zzc(16).zza(zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zztpVarZza.zze().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzdq zzdqVar = (zzdq) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zzts) ((zzaky) zzts.zzb().zza(zzgo.zzb(zzdqVar)).zza(zzdqVar.zzc()).zze())).a_()).zza(zzgo.zza(zzdqVar.zzf())).zze()));
            }
        }, zzdq.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzgo.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzdl zzdlVar = (zzdl) zzbmVar;
                return zzqe.zza(gUxOLwRQBPPLC.vfxtxZtHGsWkJ, ((zztp) ((zzaky) zztp.zzb().zza(zzgo.zzb((zzdq) ((zzcx) zzdlVar.zza()))).zza(zzajp.zza(zzdlVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzgo.zza(((zzdq) ((zzcx) zzdlVar.zza())).zzf()), zzdlVar.zzb());
            }
        }, zzdl.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzgo.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzdq.zza zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzgr.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzdq.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzdq.zza.zzb;
        }
        if (i2 == 4) {
            return zzdq.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdq zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzts zztsVarZza = zzts.zza(zzqdVar.zza().zze(), zzakk.zza());
                return zzdq.zze().zzb(zztsVarZza.zza()).zza(zztsVarZza.zzd().zza()).zzc(16).zza(zza(zzqdVar.zza().zzd())).zza();
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzdq.zza zzaVar) throws GeneralSecurityException {
        if (zzdq.zza.zza.equals(zzaVar)) {
            return zzxu.TINK;
        }
        if (zzdq.zza.zzb.equals(zzaVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzdq.zza.zzc.equals(zzaVar)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    private static zztv zzb(zzdq zzdqVar) throws GeneralSecurityException {
        if (zzdqVar.zzd() == 16) {
            return (zztv) ((zzaky) zztv.zzb().zza(zzdqVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdqVar.zzd())));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzb);
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
    }
}
