package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzhhg {
    private final zzhhe zza;
    private final zzhhe zzb;

    abstract zzhhe zza(byte[] bArr, int i2) throws InvalidKeyException;

    public zzhhg(byte[] bArr) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2;
        int i3;
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzd(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i5 = length & 15;
                if (i5 == 0) {
                    i2 = length;
                } else {
                    i2 = (length + 16) - i5;
                }
                int iRemaining = byteBuffer.remaining();
                int i7 = iRemaining % 16;
                if (i7 == 0) {
                    i3 = iRemaining;
                } else {
                    i3 = (iRemaining + 16) - i7;
                }
                int i8 = i3 + i2;
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.put(bArr2);
                byteBufferOrder.position(i2);
                byteBufferOrder.put(byteBuffer);
                byteBufferOrder.position(i8);
                byteBufferOrder.putLong(length);
                byteBufferOrder.putLong(iRemaining);
                if (MessageDigest.isEqual(zzhhk.zza(bArr4, byteBufferOrder.array()), bArr3)) {
                    byteBuffer.position(iPosition);
                    return this.zza.zzc(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e2) {
                throw new AEADBadTagException(e2.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
