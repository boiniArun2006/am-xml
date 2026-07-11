package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgxf {
    public static final /* synthetic */ int zza = 0;

    static {
        new zzgxd();
    }

    public static InputStream zzb(InputStream inputStream, long j2) {
        return new zzgxe(inputStream, j2);
    }

    public static byte[] zza(InputStream inputStream) throws IOException {
        int i2;
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i3 = 0;
        while (i3 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i3);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i5 = 0;
            while (i5 < iMin2) {
                int i7 = inputStream.read(bArr, i5, iMin2 - i5);
                if (i7 == -1) {
                    return zzc(arrayDeque, i3);
                }
                i5 += i7;
                i3 += i7;
            }
            if (iMin < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            iMin = zzgxz.zzb(((long) iMin) * ((long) i2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        int i3 = i2 - length;
        while (i3 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i3, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - i3, iMin);
            i3 -= iMin;
        }
        return bArrCopyOf;
    }
}
