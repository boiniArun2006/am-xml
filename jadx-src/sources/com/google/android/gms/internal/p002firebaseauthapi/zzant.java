package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzant {
    private static final zzanv zza;

    static /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i5 = i3 - i2;
        if (i5 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i5 == 1) {
            byte b4 = bArr[i2];
            if (b2 > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b2;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i2];
        byte b6 = bArr[i2 + 1];
        if (b2 > -12 || b5 > -65 || b6 > -65) {
            return -1;
        }
        return (b6 << 16) ^ ((b5 << 8) ^ b2);
    }

    static String zzb(byte[] bArr, int i2, int i3) throws zzalf {
        return zza.zza(bArr, i2, i3);
    }

    static boolean zzc(byte[] bArr, int i2, int i3) {
        return zza.zza(0, bArr, i2, i3) == 0;
    }

    static {
        if (zzanp.zzc()) {
            zzanp.zzd();
        }
        zza = new zzanu();
    }

    static int zza(String str, byte[] bArr, int i2, int i3) {
        return zza.zza(str, bArr, i2, i3);
    }

    static int zza(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i5 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i5 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new zzanx(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i5 += i2;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i5) + 4294967296L));
    }
}
