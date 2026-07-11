package Mms;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class M implements g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private char[] f6690n = C.f6682t.nr();
    private int rl;

    private final int J2(int i2, int i3) {
        int i5 = i3 + i2;
        char[] cArr = this.f6690n;
        if (cArr.length <= i5) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i5, i2 * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f6690n = cArrCopyOf;
        }
        return i2;
    }

    @Override // Mms.g9s
    public void n(char c2) {
        O(1);
        char[] cArr = this.f6690n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        cArr[i2] = c2;
    }

    private final void O(int i2) {
        J2(this.rl, i2);
    }

    public void Uo() {
        C.f6682t.t(this.f6690n);
    }

    @Override // Mms.g9s
    public void rl(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        O(text.length() + 2);
        char[] cArr = this.f6690n;
        int i2 = this.rl;
        int i3 = i2 + 1;
        cArr[i2] = Typography.quote;
        int length = text.length();
        text.getChars(0, length, cArr, i3);
        int i5 = length + i3;
        for (int i7 = i3; i7 < i5; i7++) {
            char c2 = cArr[i7];
            if (c2 < l4Z.n().length && l4Z.n()[c2] != 0) {
                nr(i7 - i3, i7, text);
                return;
            }
        }
        cArr[i5] = Typography.quote;
        this.rl = i5 + 1;
    }

    @Override // Mms.g9s
    public void t(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        O(length);
        text.getChars(0, text.length(), this.f6690n, this.rl);
        this.rl += length;
    }

    public String toString() {
        return new String(this.f6690n, 0, this.rl);
    }

    private final void nr(int i2, int i3, String str) {
        byte b2;
        int length = str.length();
        while (i2 < length) {
            int iJ2 = J2(i3, 2);
            char cCharAt = str.charAt(i2);
            if (cCharAt >= l4Z.n().length || (b2 = l4Z.n()[cCharAt]) == 0) {
                int i5 = iJ2 + 1;
                this.f6690n[iJ2] = cCharAt;
                i3 = i5;
                i2++;
            } else {
                if (b2 == 1) {
                    String str2 = l4Z.rl()[cCharAt];
                    Intrinsics.checkNotNull(str2);
                    int iJ22 = J2(iJ2, str2.length());
                    str2.getChars(0, str2.length(), this.f6690n, iJ22);
                    i3 = iJ22 + str2.length();
                    this.rl = i3;
                } else {
                    char[] cArr = this.f6690n;
                    cArr[iJ2] = '\\';
                    cArr[iJ2 + 1] = (char) b2;
                    i3 = iJ2 + 2;
                    this.rl = i3;
                }
                i2++;
            }
        }
        int iJ23 = J2(i3, 1);
        this.f6690n[iJ23] = Typography.quote;
        this.rl = iJ23 + 1;
    }

    @Override // Mms.g9s
    public void writeLong(long j2) {
        t(String.valueOf(j2));
    }
}
