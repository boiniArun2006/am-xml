package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzem;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhm {
    private static final zzaae zza;
    private static final zzpk<zzem, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzei, zzqe> zzd;
    private static final zzns<zzqe> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzei zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzuq zzuqVarZza = zzuq.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzuqVarZza.zza() == 0) {
                return zzei.zza(zza(zzqeVar.zzc()), zzaaf.zza(zzuqVarZza.zzd().zzd(), zzck.zza(zzckVar)), zzqeVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzalf unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzaaeVarZzb;
        zzb = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzut.zzb().a_()).zza(zzhm.zza(((zzem) zzceVar).zzb())).zze()));
            }
        }, zzem.class, zzqd.class);
        zzc = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzho
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzhm.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzd = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzei zzeiVar = (zzei) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzuq) ((zzaky) zzuq.zzb().zza(zzajp.zza(zzeiVar.zze().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, zzhm.zza(((zzem) ((zzcx) zzeiVar.zza())).zzb()), zzeiVar.zzb());
            }
        }, zzei.class, zzqe.class);
        zze = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzhm.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    private static zzem.zza zza(zzxu zzxuVar) throws GeneralSecurityException {
        int i2 = zzhp.zza[zzxuVar.ordinal()];
        if (i2 == 1) {
            return zzem.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzem.zza.zzb;
        }
        if (i2 == 4) {
            return zzem.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxuVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzem zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzut.zza(zzqdVar.zza().zze(), zzakk.zza());
                return zzem.zza(zza(zzqdVar.zza().zzd()));
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzxu zza(zzem.zza zzaVar) throws GeneralSecurityException {
        if (zzem.zza.zza.equals(zzaVar)) {
            return zzxu.TINK;
        }
        if (zzem.zza.zzb.equals(zzaVar)) {
            return zzxu.CRUNCHY;
        }
        if (zzem.zza.zzc.equals(zzaVar)) {
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
