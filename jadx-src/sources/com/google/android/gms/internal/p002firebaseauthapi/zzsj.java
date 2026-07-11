package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzrj;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzsj {
    private static final zzaae zza;
    private static final zznk<zzxu, zzrj.zzb> zzb;
    private static final zznk<zzvt, zzrj.zzc> zzc;
    private static final zzpk<zzrj, zzqd> zzd;
    private static final zzpg<zzqd> zze;
    private static final zznw<zzrc, zzqe> zzf;
    private static final zzns<zzqe> zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzrc zzb(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (!zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzvs zzvsVarZza = zzvs.zza(zzqeVar.zzd(), zzakk.zza());
            if (zzvsVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzrc.zzc().zza(zzrj.zzd().zza(zzvsVarZza.zzf().zzb()).zzb(zzvsVarZza.zze().zza()).zza(zzc.zza(zzvsVarZza.zze().zzb())).zza(zzb.zza(zzqeVar.zzc())).zza()).zza(zzaaf.zza(zzvsVarZza.zzf().zzd(), zzck.zza(zzckVar))).zza(zzqeVar.zze()).zza();
        } catch (zzalf | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzaaeVarZzb;
        zzb = zznk.zza().zza(zzxu.RAW, zzrj.zzb.zzd).zza(zzxu.TINK, zzrj.zzb.zza).zza(zzxu.LEGACY, zzrj.zzb.zzc).zza(zzxu.CRUNCHY, zzrj.zzb.zzb).zza();
        zzc = zznk.zza().zza(zzvt.SHA1, zzrj.zzc.zza).zza(zzvt.SHA224, zzrj.zzc.zzb).zza(zzvt.SHA256, zzrj.zzc.zzc).zza(zzvt.SHA384, zzrj.zzc.zzd).zza(zzvt.SHA512, zzrj.zzc.zze).zza();
        zzd = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzrj zzrjVar = (zzrj) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzvv) ((zzaky) zzvv.zzc().zza(zzsj.zzb(zzrjVar)).zza(zzrjVar.zzc()).zze())).a_()).zza((zzxu) zzsj.zzb.zza(zzrjVar.zzf())).zze()));
            }
        }, zzrj.class, zzqd.class);
        zze = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzsj.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zzf = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzrc zzrcVar = (zzrc) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzvs) ((zzaky) zzvs.zzb().zza(zzsj.zzb((zzrj) ((zzrm) zzrcVar.zza()))).zza(zzajp.zza(zzrcVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.SYMMETRIC, (zzxu) zzsj.zzb.zza(((zzrj) ((zzrm) zzrcVar.zza())).zzf()), zzrcVar.zzb());
            }
        }, zzrc.class, zzqe.class);
        zzg = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzsj.zzb((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzrj zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzvv zzvvVarZza = zzvv.zza(zzqdVar.zza().zze(), zzakk.zza());
                if (zzvvVarZza.zzb() == 0) {
                    return zzrj.zzd().zza(zzvvVarZza.zza()).zzb(zzvvVarZza.zzf().zza()).zza(zzc.zza(zzvvVarZza.zzf().zzb())).zza(zzb.zza(zzqdVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzvvVarZza.zzb());
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
        zzpcVarZza.zza(zzf);
        zzpcVarZza.zza(zzg);
    }

    private static zzvy zzb(zzrj zzrjVar) throws GeneralSecurityException {
        return (zzvy) ((zzaky) zzvy.zzc().zza(zzrjVar.zzb()).zza((zzvt) zzc.zza(zzrjVar.zze())).zze());
    }
}
