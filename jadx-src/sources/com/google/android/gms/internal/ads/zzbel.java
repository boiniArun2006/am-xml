package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbel extends zzbeg {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i2 = 4;
        if (length == 1) {
            int iZza = zzbek.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int iZza2 = zzbek.zza(strArrSplit[i3]);
                    int i5 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b2 = (byte) i5;
                    byte b4 = (byte) (i5 >> 8);
                    int i7 = i3 + i3;
                    bArr[i7] = new byte[]{b2, b4}[0];
                    bArr[i7 + 1] = b4;
                }
            } else {
                bArr = new byte[length];
                for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                    int iZza3 = zzbek.zza(strArrSplit[i8]);
                    bArr[i8] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArrArray);
                byte[] bArrDigest = this.zzb.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i2 = length2;
                }
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i2);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
