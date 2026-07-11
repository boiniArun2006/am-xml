package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzmg {
    public static zzmb zza(zzki.zza zzaVar) throws GeneralSecurityException {
        if (zzaVar == zzki.zza.zza) {
            return new zzlk(16);
        }
        if (zzaVar == zzki.zza.zzb) {
            return new zzlk(32);
        }
        if (zzaVar == zzki.zza.zzc) {
            return new zzln();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzmf zza(zzki.zze zzeVar) {
        if (zzeVar == zzki.zze.zza) {
            return new zzly("HmacSha256");
        }
        if (zzeVar == zzki.zze.zzb) {
            return new zzly("HmacSha384");
        }
        if (zzeVar == zzki.zze.zzc) {
            return new zzly("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static zzme zza(zzki.zzd zzdVar) throws GeneralSecurityException {
        if (zzdVar == zzki.zzd.zzd) {
            return new zzmx(new zzly("HmacSha256"));
        }
        if (zzdVar == zzki.zzd.zza) {
            return zzmq.zza(zzzc.NIST_P256);
        }
        if (zzdVar == zzki.zzd.zzb) {
            return zzmq.zza(zzzc.NIST_P384);
        }
        if (zzdVar == zzki.zzd.zzc) {
            return zzmq.zza(zzzc.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
