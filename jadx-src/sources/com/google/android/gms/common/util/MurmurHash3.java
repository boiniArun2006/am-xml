package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@KeepForSdk
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i2, int i3, int i5) {
        int i7;
        int i8 = i2;
        while (true) {
            i7 = (i3 & (-4)) + i2;
            if (i8 >= i7) {
                break;
            }
            int i9 = ((bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | (bArr[i8 + 3] << 24)) * (-862048943);
            int i10 = i5 ^ (((i9 >>> 17) | (i9 << 15)) * 461845907);
            i5 = (((i10 >>> 19) | (i10 << 13)) * 5) - 430675100;
            i8 += 4;
        }
        int i11 = i3 & 3;
        if (i11 == 1) {
            int i12 = ((bArr[i7] & 255) | i) * (-862048943);
            i5 ^= ((i12 >>> 17) | (i12 << 15)) * 461845907;
        } else {
            if (i11 != 2) {
                i = i11 == 3 ? (bArr[i7 + 2] & 255) << 16 : 0;
            }
            i |= (bArr[i7 + 1] & 255) << 8;
            int i122 = ((bArr[i7] & 255) | i) * (-862048943);
            i5 ^= ((i122 >>> 17) | (i122 << 15)) * 461845907;
        }
        int i13 = i5 ^ i3;
        int i14 = (i13 ^ (i13 >>> 16)) * (-2048144789);
        int i15 = (i14 ^ (i14 >>> 13)) * (-1028477387);
        return i15 ^ (i15 >>> 16);
    }
}
