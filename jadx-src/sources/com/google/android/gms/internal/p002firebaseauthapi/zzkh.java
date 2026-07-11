package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzkh extends zzli {
    private final zzkg zza;
    private final zzaad zzb;
    private final zzaaf zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzke) zza();
    }

    public static zzkh zza(zzkg zzkgVar, zzaaf zzaafVar) throws GeneralSecurityException {
        if (zzkgVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzkgVar.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzaafVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] bArrZza = zzaafVar.zza(zzbj.zza());
        byte[] bArrZzb = zzkgVar.zze().zzb();
        if (bArrZza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzaac.zza(bArrZza), bArrZzb)) {
            return new zzkh(zzkgVar, null, zzaafVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzlj zza() {
        return (zzke) ((zzlj) this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    /* JADX INFO: renamed from: zze */
    public final /* synthetic */ zzll zzc() {
        return this.zza;
    }

    public final zzaad zzf() {
        return this.zzb;
    }

    public final zzaaf zzg() {
        return this.zzc;
    }

    private zzkh(zzkg zzkgVar, zzaad zzaadVar, zzaaf zzaafVar) {
        this.zza = zzkgVar;
        this.zzb = zzaadVar;
        this.zzc = zzaafVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli, com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final /* synthetic */ zzbm zzc() {
        return (zzkg) zzc();
    }

    public static zzkh zza(zzkg zzkgVar, zzaad zzaadVar) throws GeneralSecurityException {
        if (zzkgVar != null) {
            if (zzkgVar.zzf() == null) {
                throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            }
            if (zzaadVar != null) {
                BigInteger bigIntegerZza = zzaadVar.zza(zzbj.zza());
                ECPoint eCPointZzf = zzkgVar.zzf();
                zzke.zza zzaVarZzd = ((zzke) ((zzlj) zzkgVar.zza())).zzd();
                BigInteger order = zza(zzaVarZzd).getOrder();
                if (bigIntegerZza.signum() > 0 && bigIntegerZza.compareTo(order) < 0) {
                    if (zzni.zza(bigIntegerZza, zza(zzaVarZzd)).equals(eCPointZzf)) {
                        return new zzkh(zzkgVar, zzaadVar, null);
                    }
                    throw new GeneralSecurityException("Invalid private value");
                }
                throw new GeneralSecurityException("Invalid private value");
            }
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
    }

    private static ECParameterSpec zza(zzke.zza zzaVar) {
        if (zzaVar == zzke.zza.zza) {
            return zzni.zza;
        }
        if (zzaVar == zzke.zza.zzb) {
            return zzni.zzb;
        }
        if (zzaVar == zzke.zza.zzc) {
            return zzni.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzaVar));
    }
}
