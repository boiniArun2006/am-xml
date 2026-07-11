package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlr implements zzlq {
    private final zzjh zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i2) throws GeneralSecurityException {
        if (bArr2.length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return zzyr.zza(zzja.zzc().zza(this.zza).zza(zzaaf.zza(bArr, zzbj.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i2, bArr2.length), zzlm.zza);
    }

    public zzlr(zzjh zzjhVar) {
        this.zza = zzjhVar;
        this.zzb = zzjhVar.zzb();
    }
}
