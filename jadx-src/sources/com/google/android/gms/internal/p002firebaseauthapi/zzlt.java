package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import com.google.android.gms.internal.p002firebaseauthapi.zzve;
import com.google.android.gms.internal.p002firebaseauthapi.zzvk;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzlt {
    private static final zzaae zza;
    private static final zzaae zzb;
    private static final zzpk<zzke, zzqd> zzc;
    private static final zzpg<zzqd> zzd;
    private static final zznw<zzkg, zzqe> zze;
    private static final zzns<zzqe> zzf;
    private static final zznw<zzkh, zzqe> zzg;
    private static final zzns<zzqe> zzh;
    private static final zznk<zzxu, zzke.zze> zzi;
    private static final zznk<zzvt, zzke.zzd> zzj;
    private static final zznk<zzvn, zzke.zza> zzk;
    private static final zznk<zzuw, zzke.zzc> zzl;

    static {
        zzaae zzaaeVarZzb = zzqq.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzaaeVarZzb;
        zzaae zzaaeVarZzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzaaeVarZzb2;
        zzc = zzpk.zza(new zzpm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzls
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpm
            public final zzqi zza(zzce zzceVar) {
                zzke zzkeVar = (zzke) zzceVar;
                return zzqd.zzb((zzww) ((zzaky) zzww.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzuy) ((zzaky) zzuy.zza().zza(zzlt.zzb(zzkeVar)).zze())).a_()).zza((zzxu) zzlt.zzi.zza(zzkeVar.zzg())).zze()));
            }
        }, zzke.class, zzqd.class);
        zzd = zzpg.zza(new zzpi() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpi
            public final zzce zza(zzqi zzqiVar) {
                return zzlt.zzb((zzqd) zzqiVar);
            }
        }, zzaaeVarZzb, zzqd.class);
        zze = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                zzkg zzkgVar = (zzkg) zzbmVar;
                return zzqe.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzlt.zza(zzkgVar).a_(), zzws.zza.ASYMMETRIC_PUBLIC, (zzxu) zzlt.zzi.zza(((zzke) ((zzlj) zzkgVar.zza())).zzg()), zzkgVar.zzb());
            }
        }, zzkg.class, zzqe.class);
        zzf = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzlt.zzd((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb2, zzqe.class);
        zzg = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzqi zza(zzbm zzbmVar, zzck zzckVar) {
                return zzlt.zza((zzkh) zzbmVar, zzckVar);
            }
        }, zzkh.class, zzqe.class);
        zzh = zzns.zza(new zznu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznu
            public final zzbm zza(zzqi zzqiVar, zzck zzckVar) {
                return zzlt.zzc((zzqe) zzqiVar, zzckVar);
            }
        }, zzaaeVarZzb, zzqe.class);
        zznn zznnVarZza = zznk.zza().zza(zzxu.RAW, zzke.zze.zzc).zza(zzxu.TINK, zzke.zze.zza);
        zzxu zzxuVar = zzxu.LEGACY;
        zzke.zze zzeVar = zzke.zze.zzb;
        zzi = zznnVarZza.zza(zzxuVar, zzeVar).zza(zzxu.CRUNCHY, zzeVar).zza();
        zzj = zznk.zza().zza(zzvt.SHA1, zzke.zzd.zza).zza(zzvt.SHA224, zzke.zzd.zzb).zza(zzvt.SHA256, zzke.zzd.zzc).zza(zzvt.SHA384, zzke.zzd.zzd).zza(zzvt.SHA512, zzke.zzd.zze).zza();
        zzk = zznk.zza().zza(zzvn.NIST_P256, zzke.zza.zza).zza(zzvn.NIST_P384, zzke.zza.zzb).zza(zzvn.NIST_P521, zzke.zza.zzc).zza(zzvn.CURVE25519, zzke.zza.zzd).zza();
        zzl = zznk.zza().zza(zzuw.UNCOMPRESSED, zzke.zzc.zzb).zza(zzuw.COMPRESSED, zzke.zzc.zza).zza(zzuw.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzke.zzc.zzc).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzke zzb(zzqd zzqdVar) throws GeneralSecurityException {
        if (zzqdVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzqdVar.zza().zzd(), zzuy.zza(zzqdVar.zza().zze(), zzakk.zza()).zzc());
            } catch (zzalf e2) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzqdVar.zza().zzf());
    }

    private static int zza(zzke.zza zzaVar) throws GeneralSecurityException {
        if (zzke.zza.zza.equals(zzaVar)) {
            return 33;
        }
        if (zzke.zza.zzb.equals(zzaVar)) {
            return 49;
        }
        if (zzke.zza.zzc.equals(zzaVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + String.valueOf(zzaVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkh zzc(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                zzve zzveVarZza = zzve.zza(zzqeVar.zzd(), zzakk.zza());
                if (zzveVarZza.zza() == 0) {
                    zzvh zzvhVarZzd = zzveVarZza.zzd();
                    if (zzvhVarZzd.zza() == 0) {
                        zzke zzkeVarZza = zza(zzqeVar.zzc(), zzvhVarZzd.zzb());
                        if (zzkeVarZza.zzd().equals(zzke.zza.zzd)) {
                            return zzkh.zza(zzkg.zza(zzkeVarZza, zzaae.zza(zzvhVarZzd.zzf().zzd()), zzqeVar.zze()), zzaaf.zza(zzveVarZza.zze().zzd(), zzck.zza(zzckVar)));
                        }
                        return zzkh.zza(zzkg.zza(zzkeVarZza, new ECPoint(zznh.zza(zzvhVarZzd.zzf().zzd()), zznh.zza(zzvhVarZzd.b_().zzd())), zzqeVar.zze()), zzaad.zza(zznh.zza(zzveVarZza.zze().zzd()), zzck.zza(zzckVar)));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzqeVar.zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkg zzd(zzqe zzqeVar, zzck zzckVar) throws GeneralSecurityException {
        if (zzqeVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            try {
                zzvh zzvhVarZza = zzvh.zza(zzqeVar.zzd(), zzakk.zza());
                if (zzvhVarZza.zza() == 0) {
                    zzke zzkeVarZza = zza(zzqeVar.zzc(), zzvhVarZza.zzb());
                    if (zzkeVarZza.zzd().equals(zzke.zza.zzd)) {
                        if (zzvhVarZza.b_().zzb() == 0) {
                            return zzkg.zza(zzkeVarZza, zzaae.zza(zzvhVarZza.zzf().zzd()), zzqeVar.zze());
                        }
                        throw new GeneralSecurityException("Y must be empty for X25519 points");
                    }
                    return zzkg.zza(zzkeVarZza, new ECPoint(zznh.zza(zzvhVarZza.zzf().zzd()), zznh.zza(zzvhVarZza.b_().zzd())), zzqeVar.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzqeVar.zzf());
    }

    private static zzke zza(zzxu zzxuVar, zzvb zzvbVar) throws GeneralSecurityException {
        zzke.zzb zzbVarZza = zzke.zzc().zza(zzi.zza(zzxuVar)).zza(zzk.zza(zzvbVar.zzf().zzd())).zza(zzj.zza(zzvbVar.zzf().zze())).zza(zzcm.zza(((zzww) ((zzaky) zzww.zza().zza(zzvbVar.zzb().zzd().zzf()).zza(zzxu.RAW).zza(zzvbVar.zzb().zzd().zze()).zze())).zzk())).zza(zzaae.zza(zzvbVar.zzf().zzf().zzd()));
        if (!zzvbVar.zzf().zzd().equals(zzvn.CURVE25519)) {
            zzbVarZza.zza(zzl.zza(zzvbVar.zza()));
        } else if (!zzvbVar.zza().equals(zzuw.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zzbVarZza.zza();
    }

    private static zzvb zzb(zzke zzkeVar) throws GeneralSecurityException {
        zzvk.zza zzaVarZza = zzvk.zza().zza((zzvn) zzk.zza(zzkeVar.zzd())).zza((zzvt) zzj.zza(zzkeVar.zze()));
        if (zzkeVar.zzh() != null && zzkeVar.zzh().zza() > 0) {
            zzaVarZza.zza(zzajp.zza(zzkeVar.zzh().zzb()));
        }
        zzvk zzvkVar = (zzvk) ((zzaky) zzaVarZza.zze());
        try {
            zzww zzwwVarZza = zzww.zza(zzcm.zza(zzkeVar.zzb()), zzakk.zza());
            zzuv zzuvVar = (zzuv) ((zzaky) zzuv.zza().zza((zzww) ((zzaky) zzww.zza().zza(zzwwVarZza.zzf()).zza(zzxu.TINK).zza(zzwwVarZza.zze()).zze())).zze());
            zzke.zzc zzcVarZzf = zzkeVar.zzf();
            if (zzcVarZzf == null) {
                zzcVarZzf = zzke.zzc.zza;
            }
            return (zzvb) ((zzaky) zzvb.zzc().zza(zzvkVar).zza(zzuvVar).zza((zzuw) zzl.zza(zzcVarZzf)).zze());
        } catch (zzalf e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzqe zza(zzkh zzkhVar, zzck zzckVar) throws GeneralSecurityException {
        zzve.zza zzaVarZza = zzve.zzb().zza(0).zza(zza((zzkg) ((zzll) zzkhVar.zzc())));
        if (((zzke) ((zzlj) zzkhVar.zza())).zzd().equals(zzke.zza.zzd)) {
            zzaVarZza.zza(zzajp.zza(zzkhVar.zzg().zza(zzck.zza(zzckVar))));
        } else {
            zzaVarZza.zza(zzajp.zza(zznh.zza(zzkhVar.zzf().zza(zzck.zza(zzckVar)), zza(((zzke) ((zzlj) zzkhVar.zza())).zzd()))));
        }
        return zzqe.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzve) ((zzaky) zzaVarZza.zze())).a_(), zzws.zza.ASYMMETRIC_PRIVATE, (zzxu) zzi.zza(((zzke) ((zzlj) zzkhVar.zza())).zzg()), zzkhVar.zzb());
    }

    private static zzvh zza(zzkg zzkgVar) throws GeneralSecurityException {
        if (((zzke) ((zzlj) zzkgVar.zza())).zzd().equals(zzke.zza.zzd)) {
            return (zzvh) ((zzaky) zzvh.zzc().zza(0).zza(zzb((zzke) ((zzlj) zzkgVar.zza()))).zza(zzajp.zza(zzkgVar.zze().zzb())).zzb(zzajp.zza).zze());
        }
        int iZza = zza(((zzke) ((zzlj) zzkgVar.zza())).zzd());
        ECPoint eCPointZzf = zzkgVar.zzf();
        if (eCPointZzf != null) {
            return (zzvh) ((zzaky) zzvh.zzc().zza(0).zza(zzb((zzke) ((zzlj) zzkgVar.zza()))).zza(zzajp.zza(zznh.zza(eCPointZzf.getAffineX(), iZza))).zzb(zzajp.zza(zznh.zza(eCPointZzf.getAffineY(), iZza))).zze());
        }
        throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
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
