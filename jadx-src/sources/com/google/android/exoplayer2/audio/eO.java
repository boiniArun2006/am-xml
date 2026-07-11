package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class eO {
    private int HI;
    private int Ik;
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f57678O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f57679S;
    private final int Uo;
    private int XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f57680Z;
    private int az;
    private int ck;
    private int gh;
    private short[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f57681n;
    private final float nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f57682o;
    private short[] qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f57683r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f57684t;
    private short[] ty;
    private final short[] xMQ;

    private boolean Ik(int i2, int i3) {
        return i2 != 0 && this.f57682o != 0 && i3 <= i2 * 3 && i2 * 2 > this.f57680Z * 3;
    }

    private short[] J2(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i5 = this.rl;
        int i7 = length / i5;
        return i2 + i3 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i3) * i5);
    }

    private static void ck(int i2, int i3, short[] sArr, int i5, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i5 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i7 * i3) + i9;
            for (int i13 = 0; i13 < i2; i13++) {
                sArr[i10] = (short) (((sArr2[i12] * (i2 - i13)) + (sArr3[i11] * i13)) / i2);
                i10 += i3;
                i12 += i3;
                i11 += i3;
            }
        }
    }

    public void xMQ() {
        this.gh = 0;
        this.az = 0;
        this.HI = 0;
        this.ck = 0;
        this.Ik = 0;
        this.f57683r = 0;
        this.f57682o = 0;
        this.f57680Z = 0;
        this.XQ = 0;
        this.f57679S = 0;
    }

    private void HI(int i2) {
        int i3 = this.az - i2;
        short[] sArrJ2 = J2(this.ty, this.HI, i3);
        this.ty = sArrJ2;
        short[] sArr = this.qie;
        int i5 = this.rl;
        System.arraycopy(sArr, i2 * i5, sArrJ2, this.HI * i5, i5 * i3);
        this.az = i2;
        this.HI += i3;
    }

    private int KN(short[] sArr, int i2, int i3, int i5) {
        int i7 = i2 * this.rl;
        int i8 = 255;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i3 <= i5) {
            int iAbs = 0;
            for (int i12 = 0; i12 < i3; i12++) {
                iAbs += Math.abs(sArr[i7 + i12] - sArr[(i7 + i3) + i12]);
            }
            if (iAbs * i10 < i9 * i3) {
                i10 = i3;
                i9 = iAbs;
            }
            if (iAbs * i8 > i11 * i3) {
                i8 = i3;
                i11 = iAbs;
            }
            i3++;
        }
        this.XQ = i9 / i10;
        this.f57679S = i11 / i8;
        return i10;
    }

    private void O(short[] sArr, int i2, int i3) {
        int i5 = this.KN / i3;
        int i7 = this.rl;
        int i8 = i3 * i7;
        int i9 = i2 * i7;
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.xMQ[i10] = (short) (i11 / i8);
        }
    }

    private void S(int i2) {
        int i3 = this.gh - i2;
        short[] sArr = this.mUb;
        int i5 = this.rl;
        System.arraycopy(sArr, i2 * i5, sArr, 0, i5 * i3);
        this.gh = i3;
    }

    private int Uo(short[] sArr, int i2) {
        int iKN;
        int i3 = this.f57681n;
        int i5 = i3 > 4000 ? i3 / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE : 1;
        if (this.rl == 1 && i5 == 1) {
            iKN = KN(sArr, i2, this.J2, this.Uo);
        } else {
            O(sArr, i2, i5);
            int iKN2 = KN(this.xMQ, 0, this.J2 / i5, this.Uo / i5);
            if (i5 != 1) {
                int i7 = iKN2 * i5;
                int i8 = i5 * 4;
                int i9 = i7 - i8;
                int i10 = i7 + i8;
                int i11 = this.J2;
                if (i9 < i11) {
                    i9 = i11;
                }
                int i12 = this.Uo;
                if (i10 > i12) {
                    i10 = i12;
                }
                if (this.rl == 1) {
                    iKN = KN(sArr, i2, i9, i10);
                } else {
                    O(sArr, i2, 1);
                    iKN = KN(this.xMQ, 0, i9, i10);
                }
            } else {
                iKN = iKN2;
            }
        }
        int i13 = Ik(this.XQ, this.f57679S) ? this.f57682o : iKN;
        this.f57680Z = this.XQ;
        this.f57682o = iKN;
        return i13;
    }

    private int WPU(short[] sArr, int i2, float f3, int i3) {
        int i5;
        if (f3 >= 2.0f) {
            i5 = (int) (i3 / (f3 - 1.0f));
        } else {
            this.f57683r = (int) ((i3 * (2.0f - f3)) / (f3 - 1.0f));
            i5 = i3;
        }
        short[] sArrJ2 = J2(this.qie, this.az, i5);
        this.qie = sArrJ2;
        ck(i5, this.rl, sArrJ2, this.az, sArr, i2, sArr, i2 + i3);
        this.az += i5;
        return i5;
    }

    private void XQ(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.ty;
        int i3 = this.rl;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.HI - i2) * i3);
        this.HI -= i2;
    }

    private int az(short[] sArr, int i2, float f3, int i3) {
        int i5;
        if (f3 < 0.5f) {
            i5 = (int) ((i3 * f3) / (1.0f - f3));
        } else {
            this.f57683r = (int) ((i3 * ((2.0f * f3) - 1.0f)) / (1.0f - f3));
            i5 = i3;
        }
        int i7 = i3 + i5;
        short[] sArrJ2 = J2(this.qie, this.az, i7);
        this.qie = sArrJ2;
        int i8 = this.rl;
        System.arraycopy(sArr, i2 * i8, sArrJ2, this.az * i8, i8 * i3);
        ck(i5, this.rl, this.qie, this.az + i3, sArr, i2 + i3, sArr, i2);
        this.az += i7;
        return i5;
    }

    private void n(float f3, int i2) {
        int i3;
        int i5;
        if (this.az == i2) {
            return;
        }
        int i7 = this.f57681n;
        int i8 = (int) (i7 / f3);
        while (true) {
            if (i8 <= 16384 && i7 <= 16384) {
                break;
            }
            i8 /= 2;
            i7 /= 2;
        }
        HI(i2);
        int i9 = 0;
        while (true) {
            int i10 = this.HI;
            if (i9 >= i10 - 1) {
                XQ(i10 - 1);
                return;
            }
            while (true) {
                i3 = this.ck;
                int i11 = (i3 + 1) * i8;
                i5 = this.Ik;
                if (i11 <= i5 * i7) {
                    break;
                }
                this.qie = J2(this.qie, this.az, 1);
                int i12 = 0;
                while (true) {
                    int i13 = this.rl;
                    if (i12 < i13) {
                        this.qie[(this.az * i13) + i12] = ty(this.ty, (i13 * i9) + i12, i7, i8);
                        i12++;
                    }
                }
                this.Ik++;
                this.az++;
            }
            int i14 = i3 + 1;
            this.ck = i14;
            if (i14 == i7) {
                this.ck = 0;
                Assertions.checkState(i5 == i8);
                this.Ik = 0;
            }
            i9++;
        }
    }

    private void nr(short[] sArr, int i2, int i3) {
        short[] sArrJ2 = J2(this.qie, this.az, i3);
        this.qie = sArrJ2;
        int i5 = this.rl;
        System.arraycopy(sArr, i2 * i5, sArrJ2, this.az * i5, i5 * i3);
        this.az += i3;
    }

    private void r() {
        int i2 = this.az;
        float f3 = this.f57684t;
        float f4 = this.nr;
        float f5 = f3 / f4;
        float f6 = this.f57678O * f4;
        double d2 = f5;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            rl(f5);
        } else {
            nr(this.mUb, 0, this.gh);
            this.gh = 0;
        }
        if (f6 != 1.0f) {
            n(f6, i2);
        }
    }

    private void rl(float f3) {
        int iWPU;
        int i2 = this.gh;
        if (i2 < this.KN) {
            return;
        }
        int i3 = 0;
        do {
            if (this.f57683r > 0) {
                iWPU = t(i3);
            } else {
                int iUo = Uo(this.mUb, i3);
                iWPU = ((double) f3) > 1.0d ? iUo + WPU(this.mUb, i3, f3, iUo) : az(this.mUb, i3, f3, iUo);
            }
            i3 += iWPU;
        } while (this.KN + i3 <= i2);
        S(i3);
    }

    private int t(int i2) {
        int iMin = Math.min(this.KN, this.f57683r);
        nr(this.mUb, i2, iMin);
        this.f57683r -= iMin;
        return iMin;
    }

    private short ty(short[] sArr, int i2, int i3, int i5) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.rl];
        int i7 = this.Ik * i3;
        int i8 = this.ck;
        int i9 = i8 * i5;
        int i10 = (i8 + 1) * i5;
        int i11 = i10 - i7;
        int i12 = i10 - i9;
        return (short) (((s2 * i11) + ((i12 - i11) * s3)) / i12);
    }

    public int gh() {
        return this.az * this.rl * 2;
    }

    public void o() {
        int i2;
        int i3 = this.gh;
        float f3 = this.f57684t;
        float f4 = this.nr;
        int i5 = this.az + ((int) ((((i3 / (f3 / f4)) + this.HI) / (this.f57678O * f4)) + 0.5f));
        this.mUb = J2(this.mUb, i3, (this.KN * 2) + i3);
        int i7 = 0;
        while (true) {
            i2 = this.KN;
            int i8 = this.rl;
            if (i7 >= i2 * 2 * i8) {
                break;
            }
            this.mUb[(i8 * i3) + i7] = 0;
            i7++;
        }
        this.gh += i2 * 2;
        r();
        if (this.az > i5) {
            this.az = i5;
        }
        this.gh = 0;
        this.f57683r = 0;
        this.HI = 0;
    }

    public int qie() {
        return this.gh * this.rl * 2;
    }

    public eO(int i2, int i3, float f3, float f4, int i5) {
        this.f57681n = i2;
        this.rl = i3;
        this.f57684t = f3;
        this.nr = f4;
        this.f57678O = i2 / i5;
        this.J2 = i2 / Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
        int i7 = i2 / 65;
        this.Uo = i7;
        int i8 = i7 * 2;
        this.KN = i8;
        this.xMQ = new short[i8];
        this.mUb = new short[i8 * i3];
        this.qie = new short[i8 * i3];
        this.ty = new short[i8 * i3];
    }

    public void Z(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.rl;
        int i3 = iRemaining / i2;
        short[] sArrJ2 = J2(this.mUb, this.gh, i3);
        this.mUb = sArrJ2;
        shortBuffer.get(sArrJ2, this.gh * this.rl, ((i2 * i3) * 2) / 2);
        this.gh += i3;
        r();
    }

    public void mUb(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.rl, this.az);
        shortBuffer.put(this.qie, 0, this.rl * iMin);
        int i2 = this.az - iMin;
        this.az = i2;
        short[] sArr = this.qie;
        int i3 = this.rl;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }
}
