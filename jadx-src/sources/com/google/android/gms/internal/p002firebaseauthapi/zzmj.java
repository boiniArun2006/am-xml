package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzmj {
    private static final zzpr<zzkl, zzbh> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzmd.zza((zzkl) zzbmVar);
        }
    }, zzkl.class, zzbh.class);
    private static final zzpr<zzkt, zzbk> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzml
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzmc.zza((zzkt) zzbmVar);
        }
    }, zzkt.class, zzbk.class);
    private static final zzcg<zzbh> zzc = zzoc.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbh.class, zzwm.zzf());
    private static final zzbl<zzbk> zzd = zzoc.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbk.class, zzws.zza.ASYMMETRIC_PUBLIC, zzwp.d_());
    private static final zzou<zzki> zze = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmk
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzmj.zza((zzki) zzceVar, num);
        }
    };

    public static /* synthetic */ zzkl zza(zzki zzkiVar, Integer num) throws GeneralSecurityException {
        byte[] bArr;
        zzaae zzaaeVarZza;
        zzaaf zzaafVarZza;
        if (zzkiVar.zze().equals(zzki.zzd.zzd)) {
            byte[] bArrZza = zzaac.zza();
            zzaafVarZza = zzaaf.zza(bArrZza, zzbj.zza());
            zzaaeVarZza = zzaae.zza(zzaac.zza(bArrZza));
        } else {
            if (!zzkiVar.zze().equals(zzki.zzd.zza) && !zzkiVar.zze().equals(zzki.zzd.zzb) && !zzkiVar.zze().equals(zzki.zzd.zzc)) {
                throw new GeneralSecurityException("Unknown KEM ID");
            }
            zzzc zzzcVarZzc = zzmn.zzc(zzkiVar.zze());
            KeyPair keyPairZza = zzyz.zza(zzyz.zza(zzzcVarZzc));
            zzzb zzzbVar = zzzb.UNCOMPRESSED;
            ECPoint w2 = ((ECPublicKey) keyPairZza.getPublic()).getW();
            EllipticCurve curve = zzyz.zza(zzzcVarZzc).getCurve();
            zzni.zza(w2, curve);
            int iZza = zzyz.zza(curve);
            int iOrdinal = zzzbVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    int i2 = iZza + 1;
                    bArr = new byte[i2];
                    byte[] bArrZza2 = zznh.zza(w2.getAffineX());
                    System.arraycopy(bArrZza2, 0, bArr, i2 - bArrZza2.length, bArrZza2.length);
                    bArr[0] = (byte) (w2.getAffineY().testBit(0) ? 3 : 2);
                } else {
                    if (iOrdinal != 2) {
                        throw new GeneralSecurityException("invalid format:" + String.valueOf(zzzbVar));
                    }
                    int i3 = iZza * 2;
                    bArr = new byte[i3];
                    byte[] bArrZza3 = zznh.zza(w2.getAffineX());
                    if (bArrZza3.length > iZza) {
                        bArrZza3 = Arrays.copyOfRange(bArrZza3, bArrZza3.length - iZza, bArrZza3.length);
                    }
                    byte[] bArrZza4 = zznh.zza(w2.getAffineY());
                    if (bArrZza4.length > iZza) {
                        bArrZza4 = Arrays.copyOfRange(bArrZza4, bArrZza4.length - iZza, bArrZza4.length);
                    }
                    System.arraycopy(bArrZza4, 0, bArr, i3 - bArrZza4.length, bArrZza4.length);
                    System.arraycopy(bArrZza3, 0, bArr, iZza - bArrZza3.length, bArrZza3.length);
                }
            } else {
                int i5 = (iZza * 2) + 1;
                bArr = new byte[i5];
                byte[] bArrZza5 = zznh.zza(w2.getAffineX());
                byte[] bArrZza6 = zznh.zza(w2.getAffineY());
                System.arraycopy(bArrZza6, 0, bArr, i5 - bArrZza6.length, bArrZza6.length);
                System.arraycopy(bArrZza5, 0, bArr, (iZza + 1) - bArrZza5.length, bArrZza5.length);
                bArr[0] = 4;
            }
            zzaaeVarZza = zzaae.zza(bArr);
            zzaafVarZza = zzaaf.zza(zznh.zza(((ECPrivateKey) keyPairZza.getPrivate()).getS(), zzmn.zza(zzkiVar.zze())), zzbj.zza());
        }
        return zzkl.zza(zzkt.zza(zzkiVar, zzaaeVarZza, num), zzaafVarZza);
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzkk.zza();
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            zzki.zzb zzbVarZzc = zzki.zzc();
            zzki.zzf zzfVar = zzki.zzf.zza;
            zzki.zzb zzbVarZza = zzbVarZzc.zza(zzfVar);
            zzki.zzd zzdVar = zzki.zzd.zzd;
            zzki.zzb zzbVarZza2 = zzbVarZza.zza(zzdVar);
            zzki.zze zzeVar = zzki.zze.zza;
            zzki.zzb zzbVarZza3 = zzbVarZza2.zza(zzeVar);
            zzki.zza zzaVar = zzki.zza.zza;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzbVarZza3.zza(zzaVar).zza());
            zzki.zzb zzbVarZzc2 = zzki.zzc();
            zzki.zzf zzfVar2 = zzki.zzf.zzc;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzbVarZzc2.zza(zzfVar2).zza(zzdVar).zza(zzeVar).zza(zzaVar).zza());
            zzki.zzb zzbVarZza4 = zzki.zzc().zza(zzfVar).zza(zzdVar).zza(zzeVar);
            zzki.zza zzaVar2 = zzki.zza.zzb;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzbVarZza4.zza(zzaVar2).zza());
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar).zza(zzeVar).zza(zzaVar2).zza());
            zzki.zzb zzbVarZza5 = zzki.zzc().zza(zzfVar).zza(zzdVar).zza(zzeVar);
            zzki.zza zzaVar3 = zzki.zza.zzc;
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzbVarZza5.zza(zzaVar3).zza());
            map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar).zza(zzeVar).zza(zzaVar3).zza());
            zzki.zzb zzbVarZza6 = zzki.zzc().zza(zzfVar);
            zzki.zzd zzdVar2 = zzki.zzd.zza;
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzbVarZza6.zza(zzdVar2).zza(zzeVar).zza(zzaVar).zza());
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar2).zza(zzeVar).zza(zzaVar).zza());
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzki.zzc().zza(zzfVar).zza(zzdVar2).zza(zzeVar).zza(zzaVar2).zza());
            map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar2).zza(zzeVar).zza(zzaVar2).zza());
            zzki.zzb zzbVarZza7 = zzki.zzc().zza(zzfVar);
            zzki.zzd zzdVar3 = zzki.zzd.zzb;
            zzki.zzb zzbVarZza8 = zzbVarZza7.zza(zzdVar3);
            zzki.zze zzeVar2 = zzki.zze.zzb;
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzbVarZza8.zza(zzeVar2).zza(zzaVar).zza());
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar3).zza(zzeVar2).zza(zzaVar).zza());
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzki.zzc().zza(zzfVar).zza(zzdVar3).zza(zzeVar2).zza(zzaVar2).zza());
            map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar3).zza(zzeVar2).zza(zzaVar2).zza());
            zzki.zzb zzbVarZza9 = zzki.zzc().zza(zzfVar);
            zzki.zzd zzdVar4 = zzki.zzd.zzc;
            zzki.zzb zzbVarZza10 = zzbVarZza9.zza(zzdVar4);
            zzki.zze zzeVar3 = zzki.zze.zzc;
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzbVarZza10.zza(zzeVar3).zza(zzaVar).zza());
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar4).zza(zzeVar3).zza(zzaVar).zza());
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzki.zzc().zza(zzfVar).zza(zzdVar4).zza(zzeVar3).zza(zzaVar2).zza());
            map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzki.zzc().zza(zzfVar2).zza(zzdVar4).zza(zzeVar3).zza(zzaVar2).zza());
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zzoz.zza().zza(zza);
            zzoz.zza().zza(zzb);
            zzos.zza().zza(zze, zzki.class);
            zznt.zza().zza((zzbl) zzc, true);
            zznt.zza().zza((zzbl) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
    }
}
