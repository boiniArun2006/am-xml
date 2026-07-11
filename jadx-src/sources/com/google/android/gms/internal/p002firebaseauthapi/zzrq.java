package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzrq implements zzcb {
    private final zzrr zza;
    private final zzpo<zzrr> zzb;
    private final zzon zzc;
    private final zzon zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzrr zzrrVar : this.zzb.zza(bArr)) {
            try {
                zzrrVar.zza.zza(bArr, bArr2);
                this.zzd.zza(zzrrVar.zzb, bArr2.length);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzd.zza();
        throw new GeneralSecurityException("invalid MAC");
    }

    private zzrq(zzrr zzrrVar, zzpo<zzrr> zzpoVar, zzon zzonVar, zzon zzonVar2) {
        this.zza = zzrrVar;
        this.zzb = zzpoVar;
        this.zzc = zzonVar;
        this.zzd = zzonVar2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        try {
            byte[] bArrZza = this.zza.zza.zza(bArr);
            this.zzc.zza(this.zza.zzb, bArr.length);
            return bArrZza;
        } catch (GeneralSecurityException e2) {
            this.zzc.zza();
            throw e2;
        }
    }
}
