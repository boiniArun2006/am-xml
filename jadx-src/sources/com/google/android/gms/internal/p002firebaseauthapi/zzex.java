package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzev;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzex {
    private static final zzaae zza;
    private static final zzpk<zzev, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzew, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzew zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzxi zzxiVarZza = zzxi.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzxiVarZza.zza() == 0) {
                return zzew.zza(zzev.zza(zzxiVarZza.zzd().zzd(), zza(zzqeVar.zzc())), zzqeVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzxiVarZza));
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzev zzevVar = (zzev) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzxl) ((zzaky) zzxl.zza().zza(zzevVar.zzc()).zze())).a_()).zza(zzex.zza(zzevVar.zzb())).zze()));
            }
        }, zzev.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzey
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzex.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzew zzewVar = (zzew) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzxi) ((zzaky) zzxi.zzb().zza((zzxl) ((zzaky) zzxl.zza().zza(((zzev) ((zzcx) zzewVar.zza())).zzc()).zze())).zze())).a_(), zzws.zza.REMOTE, zzex.zza(((zzev) ((zzcx) zzewVar.zza())).zzb()), zzewVar.zzb());
            }
        }, zzew.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzex.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzev.zza zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzfd.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzev.zza.zza;
        }
        if (i2 == 2) {
            return zzev.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzev zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzev.zza(zzxl.zza(zzqdVar.zza().zze(), zzakk.zza()).zzd(), zza(zzqdVar.zza().zzd()));
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzev.zza zzaVar) throws GeneralSecurityException {
        if (zzev.zza.zza.equals(zzaVar)) {
            return zzxu.TINK;
        }
        if (zzev.zza.zzb.equals(zzaVar)) {
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
