package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhm extends zzhl {
    zzhm() {
    }

    @Override // com.google.android.gms.internal.auth.zzhl
    final int zza(int i2, byte[] bArr, int i3, int i5) {
        while (i3 < i5 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i5) {
            return 0;
        }
        while (i3 < i5) {
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                i3 = i7;
            } else {
                if (b2 < -32) {
                    if (i7 >= i5) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i3 += 2;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i7 >= i5 - 2) {
                        return zzhn.zza(bArr, i7, i5);
                    }
                    int i8 = i3 + 2;
                    byte b4 = bArr[i7];
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i9 = i3 + 3;
                        if (bArr[i8] <= -65) {
                            i3 += 4;
                            if (bArr[i9] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i7 >= i5 - 1) {
                    return zzhn.zza(bArr, i7, i5);
                }
                int i10 = i3 + 2;
                byte b5 = bArr[i7];
                if (b5 > -65 || (b2 == -32 && b5 < -96)) {
                    return -1;
                }
                if (b2 == -19 && b5 >= -96) {
                    return -1;
                }
                i3 += 3;
                if (bArr[i10] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
