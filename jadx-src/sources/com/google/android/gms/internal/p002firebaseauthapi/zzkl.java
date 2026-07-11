package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzkl extends zzli {
    private final zzkt zza;
    private final zzaaf zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli, com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final /* synthetic */ zzce zza() {
        return (zzki) zza();
    }

    public static zzkl zza(zzkt zzktVar, zzaaf zzaafVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzktVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzaafVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzki.zzd zzdVarZze = ((zzki) ((zzlj) zzktVar.zza())).zze();
        int iZza = zzaafVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zzdVarZze) + " must be %d, not " + iZza;
        zzki.zzd zzdVar = zzki.zzd.zza;
        if (zzdVarZze == zzdVar) {
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zzdVarZze == zzki.zzd.zzb) {
            if (iZza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zzdVarZze == zzki.zzd.zzc) {
            if (iZza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zzdVarZze != zzki.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for " + String.valueOf(zzdVarZze));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzki.zzd zzdVarZze2 = ((zzki) ((zzlj) zzktVar.zza())).zze();
        byte[] bArrZzb = zzktVar.zze().zzb();
        byte[] bArrZza = zzaafVar.zza(zzbj.zza());
        if (zzdVarZze2 == zzdVar || zzdVarZze2 == zzki.zzd.zzb || zzdVarZze2 == zzki.zzd.zzc) {
            if (zzdVarZze2 == zzdVar) {
                eCParameterSpec = zzni.zza;
            } else if (zzdVarZze2 == zzki.zzd.zzb) {
                eCParameterSpec = zzni.zzb;
            } else {
                if (zzdVarZze2 != zzki.zzd.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + String.valueOf(zzdVarZze2));
                }
                eCParameterSpec = zzni.zzc;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerZza = zznh.zza(bArrZza);
            if (bigIntegerZza.signum() <= 0 || bigIntegerZza.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zzni.zza(bigIntegerZza, eCParameterSpec).equals(zzyz.zza(eCParameterSpec.getCurve(), zzzb.UNCOMPRESSED, bArrZzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zzdVarZze2 != zzki.zzd.zzd) {
                throw new IllegalArgumentException("Unable to validate key pair for " + String.valueOf(zzdVarZze2));
            }
            if (!Arrays.equals(zzaac.zza(bArrZza), bArrZzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzkl(zzktVar, zzaafVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzlj zza() {
        return (zzki) ((zzlj) this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    /* JADX INFO: renamed from: zze */
    public final /* synthetic */ zzll zzc() {
        return this.zza;
    }

    public final zzaaf zzf() {
        return this.zzb;
    }

    private zzkl(zzkt zzktVar, zzaaf zzaafVar) {
        this.zza = zzktVar;
        this.zzb = zzaafVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli, com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final /* synthetic */ zzbm zzc() {
        return (zzkt) zzc();
    }
}
