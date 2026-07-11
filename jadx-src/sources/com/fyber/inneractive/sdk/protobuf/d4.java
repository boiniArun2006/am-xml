package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3 f56549a;

    public static int a(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    static {
        f56549a = (x3.f56722e && x3.f56721d && !d.a()) ? new c4() : new a4();
    }

    public static int a(int i2, int i3, int i5) {
        if (i2 > -12 || i3 > -65 || i5 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i5 << 16);
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i5 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt < 2048) {
                i5 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char cCharAt2 = charSequence.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new b4(i3, length2);
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
