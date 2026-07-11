package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzmx implements zzme {
    private final zzly zza;
    private final zzms zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzme
    public final byte[] zza(byte[] bArr, zzmh zzmhVar) throws GeneralSecurityException {
        byte[] bArrZza = this.zzb.zza(zzmhVar.zza().zzb(), bArr);
        byte[] bArrZza2 = zzyt.zza(bArr, zzmhVar.zzb().zzb());
        byte[] bArrZza3 = zzmn.zza(zzmn.zzb);
        zzly zzlyVar = this.zza;
        return zzlyVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlyVar.zza());
    }

    zzmx(zzly zzlyVar) {
        zzms zzmwVar;
        this.zza = zzlyVar;
        try {
            zzmwVar = zzmu.zzb();
        } catch (GeneralSecurityException unused) {
            zzmwVar = new zzmw();
        }
        this.zzb = zzmwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzme
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzmn.zzf)) {
            return zzmn.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
