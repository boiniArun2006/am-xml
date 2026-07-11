package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzld implements zzbh {
    private final zzpo<zzla> zza;
    private final zzon zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzla zzlaVar : this.zza.zza(bArr)) {
            try {
                byte[] bArrZza = zzlaVar.zza.zza(bArr, bArr2);
                this.zzb.zza(zzlaVar.zzb, bArr.length);
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    public zzld(zzpo<zzla> zzpoVar, zzon zzonVar) {
        this.zza = zzpoVar;
        this.zzb = zzonVar;
    }
}
