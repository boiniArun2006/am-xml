package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class TsUtil {
    public static boolean isStartOfTsPacket(byte[] bArr, int i2, int i3, int i5) {
        int i7 = 0;
        for (int i8 = -4; i8 <= 4; i8++) {
            int i9 = (i8 * 188) + i5;
            if (i9 < i2 || i9 >= i3 || bArr[i9] != 71) {
                i7 = 0;
            } else {
                i7++;
                if (i7 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static int findSyncBytePosition(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    private TsUtil() {
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i2, int i3) {
        parsableByteArray.setPosition(i2);
        if (parsableByteArray.bytesLeft() < 5) {
            return -9223372036854775807L;
        }
        int i5 = parsableByteArray.readInt();
        if ((8388608 & i5) != 0 || ((2096896 & i5) >> 8) != i3 || (i5 & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }
}
