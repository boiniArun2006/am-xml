package Vst;

import com.google.protobuf.C;
import java.math.RoundingMode;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CN3 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[][] f11341t = {new byte[]{0, 0}, new byte[]{ByteCompanionObject.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, ByteCompanionObject.MIN_VALUE}, new byte[]{-1, -64}};
    private int rl = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f11342n = new byte[1024];

    private void Ik() {
        az((byte) 0);
        az((byte) 1);
    }

    private void J2(byte b2) {
        if (b2 == 0) {
            qie((byte) 0);
            qie((byte) -1);
        } else if (b2 != -1) {
            qie(b2);
        } else {
            qie((byte) -1);
            qie((byte) 0);
        }
    }

    private void Uo(byte b2) {
        if (b2 == 0) {
            az((byte) 0);
            az((byte) -1);
        } else if (b2 != -1) {
            az(b2);
        } else {
            az((byte) -1);
            az((byte) 0);
        }
    }

    private void az(byte b2) {
        rl(1);
        byte[] bArr = this.f11342n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        bArr[i2] = (byte) (~b2);
    }

    private void ck() {
        qie((byte) 0);
        qie((byte) 1);
    }

    private void qie(byte b2) {
        rl(1);
        byte[] bArr = this.f11342n;
        int i2 = this.rl;
        this.rl = i2 + 1;
        bArr[i2] = b2;
    }

    public void HI() {
        az((byte) -1);
        az((byte) -1);
    }

    public void KN(C c2) {
        for (int i2 = 0; i2 < c2.size(); i2++) {
            J2(c2.byteAt(i2));
        }
        ck();
    }

    public void o(long j2) {
        r(~j2);
    }

    public void t(byte[] bArr) {
        rl(bArr.length);
        for (byte b2 : bArr) {
            byte[] bArr2 = this.f11342n;
            int i2 = this.rl;
            this.rl = i2 + 1;
            bArr2[i2] = b2;
        }
    }

    public void ty() {
        qie((byte) -1);
        qie((byte) -1);
    }

    public void xMQ(C c2) {
        for (int i2 = 0; i2 < c2.size(); i2++) {
            Uo(c2.byteAt(i2));
        }
        Ik();
    }

    private int nr(long j2) {
        if (j2 < 0) {
            j2 = ~j2;
        }
        return Wre.n(65 - Long.numberOfLeadingZeros(j2), 7, RoundingMode.UP);
    }

    private void rl(int i2) {
        int i3 = i2 + this.rl;
        byte[] bArr = this.f11342n;
        if (i3 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i3) {
            i3 = length;
        }
        this.f11342n = Arrays.copyOf(bArr, i3);
    }

    public byte[] n() {
        return Arrays.copyOf(this.f11342n, this.rl);
    }

    public void r(long j2) {
        int i2;
        long j3 = j2 < 0 ? ~j2 : j2;
        if (j3 < 64) {
            rl(1);
            byte[] bArr = this.f11342n;
            int i3 = this.rl;
            this.rl = i3 + 1;
            bArr[i3] = (byte) (j2 ^ ((long) f11341t[1][0]));
            return;
        }
        int iNr = nr(j3);
        rl(iNr);
        if (iNr < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iNr)));
        }
        byte b2 = j2 < 0 ? (byte) -1 : (byte) 0;
        int i5 = this.rl;
        if (iNr == 10) {
            i2 = i5 + 2;
            byte[] bArr2 = this.f11342n;
            bArr2[i5] = b2;
            bArr2[i5 + 1] = b2;
        } else if (iNr == 9) {
            i2 = i5 + 1;
            this.f11342n[i5] = b2;
        } else {
            i2 = i5;
        }
        for (int i7 = (iNr - 1) + i5; i7 >= i2; i7--) {
            this.f11342n[i7] = (byte) (255 & j2);
            j2 >>= 8;
        }
        byte[] bArr3 = this.f11342n;
        int i8 = this.rl;
        byte b4 = bArr3[i8];
        byte[] bArr4 = f11341t[iNr];
        bArr3[i8] = (byte) (b4 ^ bArr4[0]);
        int i9 = i8 + 1;
        bArr3[i9] = (byte) (bArr4[1] ^ bArr3[i9]);
        this.rl = i8 + iNr;
    }

    private int O(long j2) {
        return Wre.n(64 - Long.numberOfLeadingZeros(j2), 8, RoundingMode.UP);
    }

    public void S(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 128) {
                J2((byte) cCharAt);
            } else if (cCharAt < 2048) {
                J2((byte) ((cCharAt >>> 6) | 960));
                J2((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt >= 55296 && 57343 >= cCharAt) {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                i2++;
                J2((byte) ((iCodePointAt >>> 18) | 240));
                J2((byte) (((iCodePointAt >>> 12) & 63) | 128));
                J2((byte) (((iCodePointAt >>> 6) & 63) | 128));
                J2((byte) ((iCodePointAt & 63) | 128));
            } else {
                J2((byte) ((cCharAt >>> '\f') | 480));
                J2((byte) (((cCharAt >>> 6) & 63) | 128));
                J2((byte) ((cCharAt & '?') | 128));
            }
            i2++;
        }
        ck();
    }

    public void WPU(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 128) {
                Uo((byte) cCharAt);
            } else if (cCharAt < 2048) {
                Uo((byte) ((cCharAt >>> 6) | 960));
                Uo((byte) ((cCharAt & '?') | 128));
            } else if (cCharAt >= 55296 && 57343 >= cCharAt) {
                int iCodePointAt = Character.codePointAt(charSequence, i2);
                i2++;
                Uo((byte) ((iCodePointAt >>> 18) | 240));
                Uo((byte) (((iCodePointAt >>> 12) & 63) | 128));
                Uo((byte) (((iCodePointAt >>> 6) & 63) | 128));
                Uo((byte) ((iCodePointAt & 63) | 128));
            } else {
                Uo((byte) ((cCharAt >>> '\f') | 480));
                Uo((byte) (((cCharAt >>> 6) & 63) | 128));
                Uo((byte) ((cCharAt & '?') | 128));
            }
            i2++;
        }
        Ik();
    }

    public void XQ(long j2) {
        int iO = O(j2);
        rl(iO + 1);
        byte[] bArr = this.f11342n;
        int i2 = this.rl;
        int i3 = i2 + 1;
        this.rl = i3;
        bArr[i2] = (byte) (~iO);
        int i5 = i3 + iO;
        while (true) {
            i5--;
            int i7 = this.rl;
            if (i5 >= i7) {
                this.f11342n[i5] = (byte) (~(255 & j2));
                j2 >>>= 8;
            } else {
                this.rl = i7 + iO;
                return;
            }
        }
    }

    public void Z(long j2) {
        int iO = O(j2);
        rl(iO + 1);
        byte[] bArr = this.f11342n;
        int i2 = this.rl;
        int i3 = i2 + 1;
        this.rl = i3;
        bArr[i2] = (byte) iO;
        int i5 = i3 + iO;
        while (true) {
            i5--;
            int i7 = this.rl;
            if (i5 >= i7) {
                this.f11342n[i5] = (byte) (255 & j2);
                j2 >>>= 8;
            } else {
                this.rl = i7 + iO;
                return;
            }
        }
    }

    public void gh(double d2) {
        long j2;
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        if (jDoubleToLongBits < 0) {
            j2 = -1;
        } else {
            j2 = Long.MIN_VALUE;
        }
        XQ(jDoubleToLongBits ^ j2);
    }

    public void mUb(double d2) {
        long j2;
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        if (jDoubleToLongBits < 0) {
            j2 = -1;
        } else {
            j2 = Long.MIN_VALUE;
        }
        Z(jDoubleToLongBits ^ j2);
    }
}
