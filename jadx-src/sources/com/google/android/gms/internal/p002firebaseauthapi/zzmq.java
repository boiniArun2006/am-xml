package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzmq implements zzme {
    private final zzzc zza;
    private final zzly zzb;

    static zzmq zza(zzzc zzzcVar) throws GeneralSecurityException {
        int i2 = zzmt.zza[zzzcVar.ordinal()];
        if (i2 == 1) {
            return new zzmq(new zzly("HmacSha256"), zzzc.NIST_P256);
        }
        if (i2 == 2) {
            return new zzmq(new zzly("HmacSha384"), zzzc.NIST_P384);
        }
        if (i2 == 3) {
            return new zzmq(new zzly("HmacSha512"), zzzc.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzzcVar));
    }

    private zzmq(zzly zzlyVar, zzzc zzzcVar) {
        this.zzb = zzlyVar;
        this.zza = zzzcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzme
    public final byte[] zza(byte[] bArr, zzmh zzmhVar) throws GeneralSecurityException {
        ECPrivateKey eCPrivateKeyZza = zzyz.zza(this.zza, zzmhVar.zza().zzb());
        zzzc zzzcVar = this.zza;
        byte[] bArrZza = zzyz.zza(eCPrivateKeyZza, zzyz.zza(zzyz.zza(zzzcVar), zzzb.UNCOMPRESSED, bArr));
        byte[] bArrZza2 = zzyt.zza(bArr, zzmhVar.zzb().zzb());
        byte[] bArrZza3 = zzmn.zza(zza());
        zzly zzlyVar = this.zzb;
        return zzlyVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlyVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzme
    public final byte[] zza() throws GeneralSecurityException {
        int i2 = zzmt.zza[this.zza.ordinal()];
        if (i2 == 1) {
            return zzmn.zzc;
        }
        if (i2 == 2) {
            return zzmn.zzd;
        }
        if (i2 == 3) {
            return zzmn.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
