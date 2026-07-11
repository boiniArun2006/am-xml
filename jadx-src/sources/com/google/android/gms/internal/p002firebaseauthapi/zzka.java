package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzka {
    private static final zzpr<zzkh, zzbh> zza = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzyv.zza((zzkh) zzbmVar);
        }
    }, zzkh.class, zzbh.class);
    private static final zzpr<zzkg, zzbk> zzb = zzpr.zza(new zzpt() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpt
        public final Object zza(zzbm zzbmVar) {
            return zzyy.zza((zzkg) zzbmVar);
        }
    }, zzkg.class, zzbk.class);
    private static final zzcg<zzbh> zzc = zzoc.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbh.class, zzve.zzf());
    private static final zzbl<zzbk> zzd = zzoc.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbk.class, zzws.zza.ASYMMETRIC_PUBLIC, zzvh.zzh());
    private static final zzou<zzke> zze = new zzou() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzou
        public final zzbm zza(zzce zzceVar, Integer num) {
            return zzka.zza((zzke) zzceVar, num);
        }
    };

    public static /* synthetic */ zzkh zza(zzke zzkeVar, Integer num) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        zzke.zza zzaVarZzd = zzkeVar.zzd();
        if (zzaVarZzd == zzke.zza.zza) {
            eCParameterSpec = zzni.zza;
        } else if (zzaVarZzd == zzke.zza.zzb) {
            eCParameterSpec = zzni.zzb;
        } else {
            if (zzaVarZzd != zzke.zza.zzc) {
                throw new GeneralSecurityException("Unsupported curve type: " + String.valueOf(zzaVarZzd));
            }
            eCParameterSpec = zzni.zzc;
        }
        KeyPair keyPairZza = zzyz.zza(eCParameterSpec);
        return zzkh.zza(zzkg.zza(zzkeVar, ((ECPublicKey) keyPairZza.getPublic()).getW(), num), zzaad.zza(((ECPrivateKey) keyPairZza.getPrivate()).getS(), zzbj.zza()));
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (zzix.zza.zza.zza()) {
            zzlt.zza();
            zzpa zzpaVarZza = zzpa.zza();
            HashMap map = new HashMap();
            zzke.zzb zzbVarZzc = zzke.zzc();
            zzke.zza zzaVar = zzke.zza.zza;
            zzke.zzb zzbVarZza = zzbVarZzc.zza(zzaVar);
            zzke.zzd zzdVar = zzke.zzd.zzc;
            zzke.zzb zzbVarZza2 = zzbVarZza.zza(zzdVar);
            zzke.zzc zzcVar = zzke.zzc.zzb;
            zzke.zzb zzbVarZza3 = zzbVarZza2.zza(zzcVar);
            zzke.zze zzeVar = zzke.zze.zza;
            zzke.zzb zzbVarZza4 = zzbVarZza3.zza(zzeVar);
            zzdz.zza zzaVarZzc = zzdz.zze().zza(12).zzb(16).zzc(16);
            zzdz.zzb zzbVar = zzdz.zzb.zzc;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzbVarZza4.zza(zzaVarZzc.zza(zzbVar).zza()).zza());
            zzke.zzb zzbVarZza5 = zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar);
            zzke.zze zzeVar2 = zzke.zze.zzc;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzbVarZza5.zza(zzeVar2).zza(zzdz.zze().zza(12).zzb(16).zzc(16).zza(zzbVar).zza()).zza());
            zzke.zzb zzbVarZza6 = zzke.zzc().zza(zzaVar).zza(zzdVar);
            zzke.zzc zzcVar2 = zzke.zzc.zza;
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzbVarZza6.zza(zzcVar2).zza(zzeVar).zza(zzdz.zze().zza(12).zzb(16).zzc(16).zza(zzbVar).zza()).zza());
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar2).zza(zzdz.zze().zza(12).zzb(16).zzc(16).zza(zzbVar).zza()).zza());
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar2).zza(zzdz.zze().zza(12).zzb(16).zzc(16).zza(zzbVar).zza()).zza());
            zzke.zzb zzbVarZza7 = zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar).zza(zzeVar);
            zzdk.zza zzaVarZzc2 = zzdk.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdk.zzc zzcVar3 = zzdk.zzc.zzc;
            zzdk.zza zzaVarZza = zzaVarZzc2.zza(zzcVar3);
            zzdk.zzb zzbVar2 = zzdk.zzb.zzc;
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzbVarZza7.zza(zzaVarZza.zza(zzbVar2).zza()).zza());
            map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar).zza(zzeVar2).zza(zzdk.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar3).zza(zzbVar2).zza()).zza());
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar).zza(zzdk.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar3).zza(zzbVar2).zza()).zza());
            map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzke.zzc().zza(zzaVar).zza(zzdVar).zza(zzcVar2).zza(zzeVar2).zza(zzdk.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar3).zza(zzbVar2).zza()).zza());
            zzpaVarZza.zza(Collections.unmodifiableMap(map));
            zzoz.zza().zza(zza);
            zzoz.zza().zza(zzb);
            zzos.zza().zza(zze, zzke.class);
            zznt.zza().zza((zzbl) zzc, true);
            zznt.zza().zza((zzbl) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
