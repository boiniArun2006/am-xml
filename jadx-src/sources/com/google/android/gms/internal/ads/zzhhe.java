package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzhhe {
    int[] zza;
    private final int zzb;

    abstract int[] zza(int[] iArr, int i2);

    abstract int zzb();

    public zzhhe(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzhhc.zzd(bArr);
            this.zzb = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == zzb()) {
            int iRemaining = byteBuffer.remaining();
            int i2 = iRemaining / 64;
            for (int i3 = 0; i3 < i2 + 1; i3++) {
                ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i3);
                if (i3 == i2) {
                    zzhwr.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
                } else {
                    zzhwr.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
                }
            }
            return byteBufferAllocate.array();
        }
        int iZzb = zzb();
        StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 36);
        sb.append("The nonce length (in bytes) must be ");
        sb.append(iZzb);
        throw new GeneralSecurityException(sb.toString());
    }

    final ByteBuffer zzd(byte[] bArr, int i2) {
        int[] iArrZza = zza(zzhhc.zzd(bArr), i2);
        int[] iArr = (int[]) iArrZza.clone();
        zzhhc.zzb(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrZza[i3] = iArrZza[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
