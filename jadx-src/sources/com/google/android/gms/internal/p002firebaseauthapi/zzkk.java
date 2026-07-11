package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzkk {
    private static final zzaae zza;
    private static final zzaae zzb;
    private static final zzpk<zzki, zzqd> zzc;
    private static final zzpg<zzqd> zzd;
    private static final zznw<zzkt, zzqe> zze;
    private static final zzns<zzqe> zzf;
    private static final zznw<zzkl, zzqe> zzg;
    private static final zzns<zzqe> zzh;
    private static final zznk<zzxu, zzki.zzf> zzi;
    private static final zznk<zzwd, zzki.zzd> zzj;
    private static final zznk<zzwe, zzki.zze> zzk;
    private static final zznk<zzwb, zzki.zza> zzl;

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzaaeVarZzb;
        zzaae zzaaeVarZzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzaaeVarZzb2;
        zzc = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzki zzkiVar = (zzki) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey").zza(((zzwg) ((zzaky) zzwg.zza().zza(zzkk.zzb(zzkiVar)).zze())).a_()).zza((zzxu) zzkk.zzi.zza(zzkiVar.zzf())).zze()));
            }
        }, zzki.class, zzqd.class);
        zzd = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzkk.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zze = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzkt zzktVar = (zzkt) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzkk.zza(zzktVar).a_(), zzws.zza.ASYMMETRIC_PUBLIC, (zzxu) zzkk.zzi.zza(((zzki) ((zzlj) zzktVar.zza())).zzf()), zzktVar.zzb());
            }
        }, zzkt.class, zzqe.class);
        zzf = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzko
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzkk.zzd((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb2, zzqe.class);
        zzg = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzkl zzklVar = (zzkl) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzwm) ((zzaky) zzwm.zzb().zza(0).zza(zzkk.zza((zzkt) ((zzll) zzklVar.zzc()))).zza(zzajp.zza(zzklVar.zzf().zza(zzck.zza(zzckVar)))).zze())).a_(), zzws.zza.ASYMMETRIC_PRIVATE, (zzxu) zzkk.zzi.zza(((zzki) ((zzlj) zzklVar.zza())).zzf()), zzklVar.zzb());
            }
        }, zzkl.class, zzqe.class);
        zzh = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzkk.zzc((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
        zznn zznnVarZza = zznk.zza().zza(zzxu.RAW, zzki.zzf.zzc).zza(zzxu.TINK, zzki.zzf.zza);
        zzxu zzxuVar = zzxu.LEGACY;
        zzki.zzf zzfVar = zzki.zzf.zzb;
        zzi = zznnVarZza.zza(zzxuVar, zzfVar).zza(zzxu.CRUNCHY, zzfVar).zza();
        zzj = zznk.zza().zza(zzwd.DHKEM_P256_HKDF_SHA256, zzki.zzd.zza).zza(zzwd.DHKEM_P384_HKDF_SHA384, zzki.zzd.zzb).zza(zzwd.DHKEM_P521_HKDF_SHA512, zzki.zzd.zzc).zza(zzwd.DHKEM_X25519_HKDF_SHA256, zzki.zzd.zzd).zza();
        zzk = zznk.zza().zza(zzwe.HKDF_SHA256, zzki.zze.zza).zza(zzwe.HKDF_SHA384, zzki.zze.zzb).zza(zzwe.HKDF_SHA512, zzki.zze.zzc).zza();
        zzl = zznk.zza().zza(zzwb.AES_128_GCM, zzki.zza.zza).zza(zzwb.AES_256_GCM, zzki.zza.zzb).zza(zzwb.CHACHA20_POLY1305, zzki.zza.zzc).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzki zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzqdVar.zza().zzd(), zzwg.zza(zzqdVar.zza().zze(), zzakk.zza()).zzc());
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static zzki zza(zzxu zzxuVar, zzwj zzwjVar) throws GeneralSecurityException {
        return zzki.zzc().zza(zzi.zza(zzxuVar)).zza(zzj.zza(zzwjVar.zzc())).zza(zzk.zza(zzwjVar.zzb())).zza(zzl.zza(zzwjVar.zza())).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkl zzc(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                zzwm zzwmVarZza = zzwm.zza(zzqeVar.zzd(), zzakk.zza());
                if (zzwmVarZza.zza() == 0) {
                    zzwp zzwpVarZzd = zzwmVarZza.zzd();
                    if (zzwpVarZzd.zza() == 0) {
                        zzki zzkiVarZza = zza(zzqeVar.zzc(), zzwpVarZzd.zzb());
                        return zzkl.zza(zzkt.zza(zzkiVarZza, zza(zzkiVarZza.zze(), zzwpVarZzd.zzf().zzd()), zzqeVar.zze()), zzaaf.zza(zznh.zza(zznh.zza(zzwmVarZza.zze().zzd()), zzmn.zza(zzkiVarZza.zze())), zzck.zza(zzckVar)));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzqeVar.zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkt zzd(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            try {
                zzwp zzwpVarZza = zzwp.zza(zzqeVar.zzd(), zzakk.zza());
                if (zzwpVarZza.zza() == 0) {
                    zzki zzkiVarZza = zza(zzqeVar.zzc(), zzwpVarZza.zzb());
                    return zzkt.zza(zzkiVarZza, zza(zzkiVarZza.zze(), zzwpVarZza.zzf().zzd()), zzqeVar.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing HpkePublicKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzqeVar.zzf());
    }

    private static zzwj zzb(zzki zzkiVar) throws GeneralSecurityException {
        return (zzwj) ((zzaky) zzwj.zzd().zza((zzwd) zzj.zza(zzkiVar.zze())).zza((zzwe) zzk.zza(zzkiVar.zzd())).zza((zzwb) zzl.zza(zzkiVar.zzb())).zze());
    }

    private static zzwp zza(zzkt zzktVar) throws GeneralSecurityException {
        return (zzwp) ((zzaky) zzwp.zzc().zza(0).zza(zzb((zzki) ((zzlj) zzktVar.zza()))).zza(zzajp.zza(zzktVar.zze().zzb())).zze());
    }

    private static zzaae zza(zzki.zzd zzdVar, byte[] bArr) throws GeneralSecurityException {
        return zzaae.zza(zznh.zza(zznh.zza(bArr), zzmn.zzb(zzdVar)));
    }

    public static void zza() throws GeneralSecurityException {
        zzpc zzpcVarZza = zzpc.zza();
        zzpcVarZza.zza(zzc);
        zzpcVarZza.zza(zzd);
        zzpcVarZza.zza(zze);
        zzpcVarZza.zza(zzf);
        zzpcVarZza.zza(zzg);
        zzpcVarZza.zza(zzh);
    }
}
