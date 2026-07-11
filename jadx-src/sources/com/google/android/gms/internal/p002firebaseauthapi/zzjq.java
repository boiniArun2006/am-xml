package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzjq implements zzbi {
    private final zzpo<zzjn> zza;
    private final zzon zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzjn zzjnVar : this.zza.zza(bArr)) {
            try {
                byte[] bArrZza = zzjnVar.zza.zza(bArr, bArr2);
                this.zzb.zza(zzjnVar.zzb, bArr.length);
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    public zzjq(zzjn zzjnVar, zzpo<zzjn> zzpoVar, zzon zzonVar, zzon zzonVar2) {
        this.zza = zzpoVar;
        this.zzb = zzonVar2;
    }
}
