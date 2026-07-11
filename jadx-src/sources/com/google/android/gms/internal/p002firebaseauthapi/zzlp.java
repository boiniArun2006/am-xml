package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlp implements zzlq {
    private final zzdk zza;
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
        return zzze.zza(zzdd.zze().zza(this.zza).zza(zzaaf.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbj.zza())).zzb(zzaaf.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzb() + this.zza.zzc()), zzbj.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i2, bArr2.length), zzlm.zza);
    }

    public zzlp(zzdk zzdkVar) {
        this.zza = zzdkVar;
        this.zzb = zzdkVar.zzb() + zzdkVar.zzc();
    }
}
