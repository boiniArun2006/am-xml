package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@KeepForSdk
public final class HexDumpUtils {
    @Nullable
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i2, int i3, boolean z2) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i2 < 0 || i3 <= 0 || i2 + i3 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder((z2 ? 75 : 57) * ((i3 + 15) / 16));
        int i5 = i3;
        int i7 = 0;
        int i8 = 0;
        while (i5 > 0) {
            if (i7 == 0) {
                if (i3 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i2)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i2)));
                }
                i8 = i2;
            } else if (i7 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i2] & UByte.MAX_VALUE)));
            i5--;
            i7++;
            if (z2 && (i7 == 16 || i5 == 0)) {
                int i9 = 16 - i7;
                if (i9 > 0) {
                    for (int i10 = 0; i10 < i9; i10++) {
                        sb.append("   ");
                    }
                }
                if (i9 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i11 = 0; i11 < i7; i11++) {
                    char c2 = (char) bArr[i8 + i11];
                    if (c2 < ' ' || c2 > '~') {
                        c2 = '.';
                    }
                    sb.append(c2);
                }
            }
            if (i7 == 16 || i5 == 0) {
                sb.append('\n');
                i7 = 0;
            }
            i2++;
        }
        return sb.toString();
    }
}
