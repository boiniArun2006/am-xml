package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzj;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzzd<T_WRAPPER extends zzzj<JcePrimitiveT>, JcePrimitiveT> {
    public static final zzzd<zzzm, Cipher> zza = new zzzd<>(new zzzm());
    public static final zzzd<zzzq, Mac> zzb = new zzzd<>(new zzzq());
    public static final zzzd<zzzl, KeyAgreement> zzc;
    public static final zzzd<zzzn, KeyPairGenerator> zzd;
    public static final zzzd<zzzo, KeyFactory> zze;
    private final zzzh<JcePrimitiveT> zzf;

    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        return this.zzf.zza(str);
    }

    static {
        new zzzd(new zzzs());
        new zzzd(new zzzp());
        zzc = new zzzd<>(new zzzl());
        zzd = new zzzd<>(new zzzn());
        zze = new zzzd<>(new zzzo());
    }

    public static List<Provider> zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    private zzzd(T_WRAPPER t_wrapper) {
        if (zzix.zzb()) {
            this.zzf = new zzzi(t_wrapper);
        } else if (zzaaa.zza()) {
            this.zzf = new zzzg(t_wrapper);
        } else {
            this.zzf = new zzzf(t_wrapper);
        }
    }
}
