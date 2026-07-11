package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzmw implements zzms {
    private zzmw() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final zzmv zza() throws GeneralSecurityException {
        byte[] bArrZza = zzaac.zza();
        return new zzmv(bArrZza, zzaac.zza(bArrZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzaac.zza(bArr, bArr2);
    }
}
