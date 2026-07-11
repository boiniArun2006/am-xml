package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class zzht {
    int[] zza;
    private final int zzb;

    abstract int zza();

    final ByteBuffer zza(byte[] bArr, int i2) {
        int[] iArrZza = zza(zzhs.zza(bArr), i2);
        int[] iArr = (int[]) iArrZza.clone();
        zzhs.zza(iArr);
        for (int i3 = 0; i3 < iArrZza.length; i3++) {
            iArrZza[i3] = iArrZza[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }

    abstract int[] zza(int[] iArr, int i2);

    public zzht(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzhs.zza(bArr);
            this.zzb = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int iRemaining = byteBuffer2.remaining();
            int i2 = iRemaining / 64;
            int i3 = i2 + 1;
            for (int i5 = 0; i5 < i3; i5++) {
                ByteBuffer byteBufferZza = zza(bArr, this.zzb + i5);
                if (i5 == i2) {
                    zzyt.zza(byteBuffer, byteBuffer2, byteBufferZza, iRemaining % 64);
                } else {
                    zzyt.zza(byteBuffer, byteBuffer2, byteBufferZza, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
