package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f56649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f56651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56652d;

    public r2(d2 d2Var, String str, Object[] objArr) {
        char cCharAt;
        this.f56649a = d2Var;
        this.f56650b = str;
        this.f56651c = objArr;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e2) {
                        e = e2;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e4) {
                e = e4;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.f56652d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i5 = 1;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 >= 55296) {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i5 = i7;
            } else {
                this.f56652d = i2 | (cCharAt2 << i3);
                return;
            }
        }
    }
}
