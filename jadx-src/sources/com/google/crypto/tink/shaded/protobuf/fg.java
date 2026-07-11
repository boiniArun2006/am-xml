package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.YzO;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fg {
    private static final fg J2 = new fg(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f59993O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f59994n;
    private int nr;
    private int[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object[] f59995t;

    private fg() {
        this(0, new int[8], new Object[8], true);
    }

    private static boolean HI(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    private static boolean qie(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public void KN() {
        this.f59993O = false;
    }

    final void az(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f59994n; i3++) {
            Lu.nr(sb, i2, String.valueOf(M5.n(this.rl[i3])), this.f59995t[i3]);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        int i2 = this.f59994n;
        return i2 == fgVar.f59994n && HI(this.rl, fgVar.rl, i2) && qie(this.f59995t, fgVar.f59995t, this.f59994n);
    }

    private fg(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.nr = -1;
        this.f59994n = i2;
        this.rl = iArr;
        this.f59995t = objArr;
        this.f59993O = z2;
    }

    private static int J2(int[] iArr, int i2) {
        int i3 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i3 = (i3 * 31) + iArr[i5];
        }
        return i3;
    }

    private static int Uo(Object[] objArr, int i2) {
        int iHashCode = 17;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + objArr[i3].hashCode();
        }
        return iHashCode;
    }

    static fg gh() {
        return new fg();
    }

    static fg mUb(fg fgVar, fg fgVar2) {
        int i2 = fgVar.f59994n + fgVar2.f59994n;
        int[] iArrCopyOf = Arrays.copyOf(fgVar.rl, i2);
        System.arraycopy(fgVar2.rl, 0, iArrCopyOf, fgVar.f59994n, fgVar2.f59994n);
        Object[] objArrCopyOf = Arrays.copyOf(fgVar.f59995t, i2);
        System.arraycopy(fgVar2.f59995t, 0, objArrCopyOf, fgVar.f59994n, fgVar2.f59994n);
        return new fg(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private void rl(int i2) {
        int[] iArr = this.rl;
        if (i2 > iArr.length) {
            int i3 = this.f59994n;
            int i5 = i3 + (i3 / 2);
            if (i5 >= i2) {
                i2 = i5;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.rl = Arrays.copyOf(iArr, i2);
            this.f59995t = Arrays.copyOf(this.f59995t, i2);
        }
    }

    public static fg t() {
        return J2;
    }

    public int O() {
        int i2 = this.nr;
        if (i2 != -1) {
            return i2;
        }
        int iG = 0;
        for (int i3 = 0; i3 < this.f59994n; i3++) {
            iG += CodedOutputStream.g(M5.n(this.rl[i3]), (fuX) this.f59995t[i3]);
        }
        this.nr = iG;
        return iG;
    }

    public int hashCode() {
        int i2 = this.f59994n;
        return ((((527 + i2) * 31) + J2(this.rl, i2)) * 31) + Uo(this.f59995t, this.f59994n);
    }

    void n() {
        if (!this.f59993O) {
            throw new UnsupportedOperationException();
        }
    }

    public int nr() {
        int iBzg;
        int i2 = this.nr;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < this.f59994n; i5++) {
            int i7 = this.rl[i5];
            int iN = M5.n(i7);
            int iRl = M5.rl(i7);
            if (iRl == 0) {
                iBzg = CodedOutputStream.bzg(iN, ((Long) this.f59995t[i5]).longValue());
            } else if (iRl == 1) {
                iBzg = CodedOutputStream.ty(iN, ((Long) this.f59995t[i5]).longValue());
            } else if (iRl == 2) {
                iBzg = CodedOutputStream.J2(iN, (fuX) this.f59995t[i5]);
            } else if (iRl == 3) {
                iBzg = (CodedOutputStream.wTp(iN) * 2) + ((fg) this.f59995t[i5]).nr();
            } else {
                if (iRl != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.O());
                }
                iBzg = CodedOutputStream.qie(iN, ((Integer) this.f59995t[i5]).intValue());
            }
            i3 += iBzg;
        }
        this.nr = i3;
        return i3;
    }

    public void r(YzO yzO) {
        if (this.f59994n == 0) {
            return;
        }
        if (yzO.fieldOrder() == YzO.j.ASCENDING) {
            for (int i2 = 0; i2 < this.f59994n; i2++) {
                Ik(this.rl[i2], this.f59995t[i2], yzO);
            }
            return;
        }
        for (int i3 = this.f59994n - 1; i3 >= 0; i3--) {
            Ik(this.rl[i3], this.f59995t[i3], yzO);
        }
    }

    private static void Ik(int i2, Object obj, YzO yzO) {
        int iN = M5.n(i2);
        int iRl = M5.rl(i2);
        if (iRl != 0) {
            if (iRl != 1) {
                if (iRl != 2) {
                    if (iRl != 3) {
                        if (iRl == 5) {
                            yzO.writeFixed32(iN, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.O());
                    }
                    if (yzO.fieldOrder() == YzO.j.ASCENDING) {
                        yzO.writeStartGroup(iN);
                        ((fg) obj).r(yzO);
                        yzO.writeEndGroup(iN);
                        return;
                    } else {
                        yzO.writeEndGroup(iN);
                        ((fg) obj).r(yzO);
                        yzO.writeStartGroup(iN);
                        return;
                    }
                }
                yzO.nr(iN, (fuX) obj);
                return;
            }
            yzO.writeFixed64(iN, ((Long) obj).longValue());
            return;
        }
        yzO.writeInt64(iN, ((Long) obj).longValue());
    }

    void ck(YzO yzO) {
        if (yzO.fieldOrder() == YzO.j.DESCENDING) {
            for (int i2 = this.f59994n - 1; i2 >= 0; i2--) {
                yzO.writeMessageSetItem(M5.n(this.rl[i2]), this.f59995t[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f59994n; i3++) {
            yzO.writeMessageSetItem(M5.n(this.rl[i3]), this.f59995t[i3]);
        }
    }

    void ty(int i2, Object obj) {
        n();
        rl(this.f59994n + 1);
        int[] iArr = this.rl;
        int i3 = this.f59994n;
        iArr[i3] = i2;
        this.f59995t[i3] = obj;
        this.f59994n = i3 + 1;
    }

    fg xMQ(fg fgVar) {
        if (fgVar.equals(t())) {
            return this;
        }
        n();
        int i2 = this.f59994n + fgVar.f59994n;
        rl(i2);
        System.arraycopy(fgVar.rl, 0, this.rl, this.f59994n, fgVar.f59994n);
        System.arraycopy(fgVar.f59995t, 0, this.f59995t, this.f59994n, fgVar.f59994n);
        this.f59994n = i2;
        return this;
    }
}
