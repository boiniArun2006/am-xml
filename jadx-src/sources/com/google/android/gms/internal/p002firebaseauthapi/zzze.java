package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzze implements zzbe {
    private final zzzu zza;
    private final zzcb zzb;
    private final int zzc;
    private final byte[] zzd;

    public static zzbe zza(zzdd zzddVar) throws GeneralSecurityException {
        return new zzze(new zzyl(zzddVar.zzf().zza(zzbj.zza()), ((zzdk) ((zzcx) zzddVar.zza())).zzd()), new zzzx(new zzzv("HMAC" + String.valueOf(((zzdk) ((zzcx) zzddVar.zza())).zzg()), new SecretKeySpec(zzddVar.zzg().zza(zzbj.zza()), "HMAC")), ((zzdk) ((zzcx) zzddVar.zza())).zze()), ((zzdk) ((zzcx) zzddVar.zza())).zze(), zzddVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzyt.zza(this.zzd, bArrZzb, this.zzb.zza(zzyt.zza(bArr2, bArrZzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    private zzze(zzzu zzzuVar, zzcb zzcbVar, int i2, byte[] bArr) {
        this.zza = zzzuVar;
        this.zzb = zzcbVar;
        this.zzc = i2;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length >= i2 + bArr3.length) {
            if (zzqq.zza(bArr3, bArr)) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                this.zzb.zza(bArrCopyOfRange2, zzyt.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
                return this.zza.zza(bArrCopyOfRange);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
