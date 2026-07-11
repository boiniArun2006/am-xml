package com.google.common.io;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final BaseEncoding f59805n = new w6("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding rl = new w6("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final BaseEncoding f59806t = new Ml("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding nr = new Ml("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final BaseEncoding f59804O = new n("base16()", "0123456789ABCDEF");

    private static class Ml extends BaseEncoding {
        final j J2;
        final Character Uo;

        Ml(String str, String str2, Character ch) {
            this(new j(str, str2.toCharArray()), ch);
        }

        Ml(j jVar, Character ch) {
            this.J2 = (j) Xo.HI(jVar);
            Xo.gh(ch == null || !jVar.J2(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.Uo = ch;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Ml) {
                Ml ml = (Ml) obj;
                if (this.J2.equals(ml.J2) && Objects.equals(this.Uo, ml.Uo)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding gh() {
            return this.Uo == null ? this : ty(this.J2, null);
        }

        public int hashCode() {
            return this.J2.hashCode() ^ Objects.hashCode(this.Uo);
        }

        @Override // com.google.common.io.BaseEncoding
        int mUb(int i2) {
            j jVar = this.J2;
            return jVar.f59807O * OW.Ml.rl(i2, jVar.J2, RoundingMode.CEILING);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.J2);
            if (8 % this.J2.nr != 0) {
                if (this.Uo == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.Uo);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        BaseEncoding ty(j jVar, Character ch) {
            return new Ml(jVar, ch);
        }

        @Override // com.google.common.io.BaseEncoding
        int xMQ(int i2) {
            return (int) (((((long) this.J2.nr) * ((long) i2)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        void Uo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            Xo.HI(appendable);
            Xo.Z(i2, i2 + i3, bArr.length);
            int i5 = 0;
            while (i5 < i3) {
                az(appendable, bArr, i2 + i5, Math.min(this.J2.J2, i3 - i5));
                i5 += this.J2.J2;
            }
        }

        void az(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            boolean z2;
            Xo.HI(appendable);
            Xo.Z(i2, i2 + i3, bArr.length);
            int i5 = 0;
            if (i3 <= this.J2.J2) {
                z2 = true;
            } else {
                z2 = false;
            }
            Xo.nr(z2);
            long j2 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                j2 = (j2 | ((long) (bArr[i2 + i7] & UByte.MAX_VALUE))) << 8;
            }
            int i8 = ((i3 + 1) * 8) - this.J2.nr;
            while (i5 < i3 * 8) {
                j jVar = this.J2;
                appendable.append(jVar.nr(((int) (j2 >>> (i8 - i5))) & jVar.f59809t));
                i5 += this.J2.nr;
            }
            if (this.Uo != null) {
                while (i5 < this.J2.J2 * 8) {
                    appendable.append(this.Uo.charValue());
                    i5 += this.J2.nr;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        int nr(byte[] bArr, CharSequence charSequence) throws DecodingException {
            j jVar;
            Xo.HI(bArr);
            CharSequence charSequenceQie = qie(charSequence);
            if (this.J2.O(charSequenceQie.length())) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < charSequenceQie.length()) {
                    long jT2 = 0;
                    int i5 = 0;
                    int i7 = 0;
                    while (true) {
                        jVar = this.J2;
                        if (i5 >= jVar.f59807O) {
                            break;
                        }
                        jT2 <<= jVar.nr;
                        if (i2 + i5 < charSequenceQie.length()) {
                            jT2 |= (long) this.J2.t(charSequenceQie.charAt(i7 + i2));
                            i7++;
                        }
                        i5++;
                    }
                    int i8 = jVar.J2;
                    int i9 = (i8 * 8) - (i7 * jVar.nr);
                    int i10 = (i8 - 1) * 8;
                    while (i10 >= i9) {
                        bArr[i3] = (byte) ((jT2 >>> i10) & 255);
                        i10 -= 8;
                        i3++;
                    }
                    i2 += this.J2.f59807O;
                }
                return i3;
            }
            throw new DecodingException("Invalid input length " + charSequenceQie.length());
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence qie(CharSequence charSequence) {
            Xo.HI(charSequence);
            Character ch = this.Uo;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }
    }

    static final class j {
        final int J2;
        private final boolean[] KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final int f59807O;
        private final byte[] Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f59808n;
        final int nr;
        private final char[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f59809t;
        private final boolean xMQ;

        j(String str, char[] cArr) {
            this(str, cArr, rl(cArr), false);
        }

        private j(String str, char[] cArr, byte[] bArr, boolean z2) {
            this.f59808n = (String) Xo.HI(str);
            this.rl = (char[]) Xo.HI(cArr);
            try {
                int iO = OW.Ml.O(cArr.length, RoundingMode.UNNECESSARY);
                this.nr = iO;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iO);
                int i2 = 1 << (3 - iNumberOfTrailingZeros);
                this.f59807O = i2;
                this.J2 = iO >> iNumberOfTrailingZeros;
                this.f59809t = cArr.length - 1;
                this.Uo = bArr;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.J2; i3++) {
                    zArr[OW.Ml.rl(i3 * 8, this.nr, RoundingMode.CEILING)] = true;
                }
                this.KN = zArr;
                this.xMQ = z2;
            } catch (ArithmeticException e2) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
            }
        }

        private static byte[] rl(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < cArr.length; i2++) {
                char c2 = cArr[i2];
                boolean z2 = true;
                Xo.J2(c2 < 128, "Non-ASCII character: %s", c2);
                if (bArr[c2] != -1) {
                    z2 = false;
                }
                Xo.J2(z2, "Duplicate character: %s", c2);
                bArr[c2] = (byte) i2;
            }
            return bArr;
        }

        public boolean J2(char c2) {
            byte[] bArr = this.Uo;
            return c2 < bArr.length && bArr[c2] != -1;
        }

        boolean O(int i2) {
            return this.KN[i2 % this.f59807O];
        }

        public boolean equals(Object obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.xMQ == jVar.xMQ && Arrays.equals(this.rl, jVar.rl)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.rl) + (this.xMQ ? 1231 : 1237);
        }

        char nr(int i2) {
            return this.rl[i2];
        }

        int t(char c2) throws DecodingException {
            if (c2 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c2));
            }
            byte b2 = this.Uo[c2];
            if (b2 != -1) {
                return b2;
            }
            if (c2 <= ' ' || c2 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c2));
            }
            throw new DecodingException("Unrecognized character: " + c2);
        }

        public String toString() {
            return this.f59808n;
        }
    }

    private static final class n extends Ml {
        final char[] KN;

        n(String str, String str2) {
            this(new j(str, str2.toCharArray()));
        }

        private n(j jVar) {
            super(jVar, null);
            this.KN = new char[512];
            Xo.nr(jVar.rl.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                this.KN[i2] = jVar.nr(i2 >>> 4);
                this.KN[i2 | 256] = jVar.nr(i2 & 15);
            }
        }

        @Override // com.google.common.io.BaseEncoding.Ml
        BaseEncoding ty(j jVar, Character ch) {
            return new n(jVar);
        }

        @Override // com.google.common.io.BaseEncoding.Ml, com.google.common.io.BaseEncoding
        void Uo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            Xo.HI(appendable);
            Xo.Z(i2, i2 + i3, bArr.length);
            for (int i5 = 0; i5 < i3; i5++) {
                int i7 = bArr[i2 + i5] & UByte.MAX_VALUE;
                appendable.append(this.KN[i7]);
                appendable.append(this.KN[i7 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.Ml, com.google.common.io.BaseEncoding
        int nr(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Xo.HI(bArr);
            if (charSequence.length() % 2 != 1) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < charSequence.length()) {
                    bArr[i3] = (byte) ((this.J2.t(charSequence.charAt(i2)) << 4) | this.J2.t(charSequence.charAt(i2 + 1)));
                    i2 += 2;
                    i3++;
                }
                return i3;
            }
            throw new DecodingException("Invalid input length " + charSequence.length());
        }
    }

    private static final class w6 extends Ml {
        w6(String str, String str2, Character ch) {
            this(new j(str, str2.toCharArray()), ch);
        }

        private w6(j jVar, Character ch) {
            super(jVar, ch);
            Xo.nr(jVar.rl.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.Ml
        BaseEncoding ty(j jVar, Character ch) {
            return new w6(jVar, ch);
        }

        @Override // com.google.common.io.BaseEncoding.Ml, com.google.common.io.BaseEncoding
        void Uo(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            Xo.HI(appendable);
            int i5 = i2 + i3;
            Xo.Z(i2, i5, bArr.length);
            while (i3 >= 3) {
                int i7 = i2 + 2;
                int i8 = ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2] & UByte.MAX_VALUE) << 16);
                i2 += 3;
                int i9 = i8 | (bArr[i7] & UByte.MAX_VALUE);
                appendable.append(this.J2.nr(i9 >>> 18));
                appendable.append(this.J2.nr((i9 >>> 12) & 63));
                appendable.append(this.J2.nr((i9 >>> 6) & 63));
                appendable.append(this.J2.nr(i9 & 63));
                i3 -= 3;
            }
            if (i2 < i5) {
                az(appendable, bArr, i2, i5 - i2);
            }
        }

        @Override // com.google.common.io.BaseEncoding.Ml, com.google.common.io.BaseEncoding
        int nr(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Xo.HI(bArr);
            CharSequence charSequenceQie = qie(charSequence);
            if (this.J2.O(charSequenceQie.length())) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < charSequenceQie.length()) {
                    int i5 = i2 + 2;
                    int iT = (this.J2.t(charSequenceQie.charAt(i2)) << 18) | (this.J2.t(charSequenceQie.charAt(i2 + 1)) << 12);
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) (iT >>> 16);
                    if (i5 < charSequenceQie.length()) {
                        int i8 = i2 + 3;
                        int iT2 = iT | (this.J2.t(charSequenceQie.charAt(i5)) << 6);
                        int i9 = i3 + 2;
                        bArr[i7] = (byte) ((iT2 >>> 8) & 255);
                        if (i8 < charSequenceQie.length()) {
                            i2 += 4;
                            i3 += 3;
                            bArr[i9] = (byte) ((iT2 | this.J2.t(charSequenceQie.charAt(i8))) & 255);
                        } else {
                            i3 = i9;
                            i2 = i8;
                        }
                    } else {
                        i3 = i7;
                        i2 = i5;
                    }
                }
                return i3;
            }
            throw new DecodingException("Invalid input length " + charSequenceQie.length());
        }
    }

    private static byte[] KN(byte[] bArr, int i2) {
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    public String O(byte[] bArr) {
        return J2(bArr, 0, bArr.length);
    }

    abstract void Uo(Appendable appendable, byte[] bArr, int i2, int i3);

    public abstract BaseEncoding gh();

    abstract int mUb(int i2);

    abstract int nr(byte[] bArr, CharSequence charSequence);

    abstract CharSequence qie(CharSequence charSequence);

    abstract int xMQ(int i2);

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    public static BaseEncoding n() {
        return f59805n;
    }

    public final String J2(byte[] bArr, int i2, int i3) {
        Xo.Z(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(mUb(i3));
        try {
            Uo(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    BaseEncoding() {
    }

    public final byte[] rl(CharSequence charSequence) {
        try {
            return t(charSequence);
        } catch (DecodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    final byte[] t(CharSequence charSequence) {
        CharSequence charSequenceQie = qie(charSequence);
        byte[] bArr = new byte[xMQ(charSequenceQie.length())];
        return KN(bArr, nr(bArr, charSequenceQie));
    }
}
