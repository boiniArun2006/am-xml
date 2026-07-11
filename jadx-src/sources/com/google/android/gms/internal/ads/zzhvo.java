package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhvo implements zzhbs {
    private static final byte[] zza = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private final PublicKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final Provider zze;

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Provider provider = this.zze;
        PublicKey publicKey = this.zzb;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.zzd);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    private zzhvo(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            if (bArr.length == 32) {
                this.zzb = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zzhwr.zza(zza, bArr)));
                this.zzc = bArr2;
                this.zzd = bArr3;
                this.zze = provider;
                return;
            }
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    public static zzhbs zzb(zzhsx zzhsxVar) throws GeneralSecurityException {
        byte[] bArr;
        Provider providerZza = zzhih.zza();
        if (providerZza != null) {
            if (zzhid.zza(1)) {
                byte[] bArrZzc = zzhsxVar.zzd().zzc();
                byte[] bArrZzc2 = zzhsxVar.zze().zzc();
                if (zzhsxVar.zzf().zzc().equals(zzhsp.zzc)) {
                    bArr = new byte[]{0};
                } else {
                    bArr = new byte[0];
                }
                return new zzhvo(bArrZzc, bArrZzc2, bArr, providerZza);
            }
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
    }
}
