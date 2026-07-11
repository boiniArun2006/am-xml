package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzafu {
    public static int zzb(ByteBuffer byteBuffer) {
        int i2;
        if ((byteBuffer.get(5) & 2) == 0) {
            i2 = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i3 = 28;
            int i5 = 28;
            for (int i7 = 0; i7 < b2; i7++) {
                i5 += byteBuffer.get(i7 + 27);
            }
            byte b4 = byteBuffer.get(i5 + 26);
            for (int i8 = 0; i8 < b4; i8++) {
                i3 += byteBuffer.get(i5 + 27 + i8);
            }
            i2 = i5 + i3;
        }
        int i9 = byteBuffer.get(i2 + 26) + 27 + i2;
        return (int) ((zzg(byteBuffer.get(i9), byteBuffer.limit() - i9 > 1 ? byteBuffer.get(i9 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static boolean zzf(long j2, long j3) {
        return j2 - j3 <= zzi(3840L) / 1000;
    }

    private static long zzg(byte b2, byte b4) {
        int i2;
        int i3 = b2 & UByte.MAX_VALUE;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b4 & 63;
            }
        } else {
            i2 = 1;
        }
        int i7 = i3 >> 3;
        int i8 = i7 & 3;
        return ((long) i2) * ((long) (i7 >= 16 ? 2500 << i8 : i7 >= 12 ? 10000 << (i7 & 1) : i8 == 3 ? 60000 : 10000 << i8));
    }

    private static long zzi(long j2) {
        return (j2 * 1000000000) / 48000;
    }

    public static int zze(byte[] bArr) {
        return (bArr[10] & UByte.MAX_VALUE) | ((bArr[11] & UByte.MAX_VALUE) << 8);
    }

    private static byte[] zzh(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    public static List zza(byte[] bArr) {
        long jZze = zze(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzi(jZze)));
        arrayList.add(zzh(zzi(3840L)));
        return arrayList;
    }
}
