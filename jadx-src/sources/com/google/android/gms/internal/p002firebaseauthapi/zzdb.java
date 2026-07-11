package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzdb implements zzbe {
    private final zzdc zza;
    private final zzpo<zzdc> zzb;
    private final zzon zzc;
    private final zzon zzd;

    private zzdb(zzdc zzdcVar, zzpo<zzdc> zzpoVar, zzon zzonVar, zzon zzonVar2) {
        this.zza = zzdcVar;
        this.zzb = zzpoVar;
        this.zzc = zzonVar;
        this.zzd = zzonVar2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzdc zzdcVar : this.zzb.zza(bArr)) {
            try {
                byte[] bArrZza = zzdcVar.zza.zza(bArr, bArr2);
                this.zzd.zza(zzdcVar.zzb, bArr.length);
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        this.zzd.zza();
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] bArrZzb = this.zza.zza.zzb(bArr, bArr2);
            this.zzc.zza(this.zza.zzb, bArr.length);
            return bArrZzb;
        } catch (GeneralSecurityException e2) {
            this.zzc.zza();
            throw e2;
        }
    }
}
