package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite J2 = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f38179O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38180n;
    private int nr;
    private int[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object[] f38181t;

    private UnknownFieldSetLite() {
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

    final void az(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f38180n; i3++) {
            MessageLiteToString.nr(sb, i2, String.valueOf(WireFormat.n(this.rl[i3])), this.f38181t[i3]);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = this.f38180n;
        return i2 == unknownFieldSetLite.f38180n && HI(this.rl, unknownFieldSetLite.rl, i2) && qie(this.f38181t, unknownFieldSetLite.f38181t, this.f38180n);
    }

    private UnknownFieldSetLite(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.nr = -1;
        this.f38180n = i2;
        this.rl = iArr;
        this.f38181t = objArr;
        this.f38179O = z2;
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

    static UnknownFieldSetLite gh() {
        return new UnknownFieldSetLite();
    }

    static UnknownFieldSetLite mUb(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i2 = unknownFieldSetLite.f38180n + unknownFieldSetLite2.f38180n;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.rl, i2);
        System.arraycopy(unknownFieldSetLite2.rl, 0, iArrCopyOf, unknownFieldSetLite.f38180n, unknownFieldSetLite2.f38180n);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f38181t, i2);
        System.arraycopy(unknownFieldSetLite2.f38181t, 0, objArrCopyOf, unknownFieldSetLite.f38180n, unknownFieldSetLite2.f38180n);
        return new UnknownFieldSetLite(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private void rl(int i2) {
        int[] iArr = this.rl;
        if (i2 > iArr.length) {
            int i3 = this.f38180n;
            int i5 = i3 + (i3 / 2);
            if (i5 >= i2) {
                i2 = i5;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.rl = Arrays.copyOf(iArr, i2);
            this.f38181t = Arrays.copyOf(this.f38181t, i2);
        }
    }

    public static UnknownFieldSetLite t() {
        return J2;
    }

    public void KN() {
        if (this.f38179O) {
            this.f38179O = false;
        }
    }

    public int O() {
        int i2 = this.nr;
        if (i2 != -1) {
            return i2;
        }
        int iU = 0;
        for (int i3 = 0; i3 < this.f38180n; i3++) {
            iU += CodedOutputStream.U(WireFormat.n(this.rl[i3]), (ByteString) this.f38181t[i3]);
        }
        this.nr = iU;
        return iU;
    }

    public int hashCode() {
        int i2 = this.f38180n;
        return ((((527 + i2) * 31) + J2(this.rl, i2)) * 31) + Uo(this.f38181t, this.f38180n);
    }

    void n() {
        if (!this.f38179O) {
            throw new UnsupportedOperationException();
        }
    }

    public int nr() {
        int iNxk;
        int i2 = this.nr;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < this.f38180n; i5++) {
            int i7 = this.rl[i5];
            int iN = WireFormat.n(i7);
            int iRl = WireFormat.rl(i7);
            if (iRl == 0) {
                iNxk = CodedOutputStream.Nxk(iN, ((Long) this.f38181t[i5]).longValue());
            } else if (iRl == 1) {
                iNxk = CodedOutputStream.WPU(iN, ((Long) this.f38181t[i5]).longValue());
            } else if (iRl == 2) {
                iNxk = CodedOutputStream.HI(iN, (ByteString) this.f38181t[i5]);
            } else if (iRl == 3) {
                iNxk = (CodedOutputStream.a(iN) * 2) + ((UnknownFieldSetLite) this.f38181t[i5]).nr();
            } else {
                if (iRl != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.O());
                }
                iNxk = CodedOutputStream.XQ(iN, ((Integer) this.f38181t[i5]).intValue());
            }
            i3 += iNxk;
        }
        this.nr = i3;
        return i3;
    }

    public void r(Writer writer) {
        if (this.f38180n == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i2 = 0; i2 < this.f38180n; i2++) {
                Ik(this.rl[i2], this.f38181t[i2], writer);
            }
            return;
        }
        for (int i3 = this.f38180n - 1; i3 >= 0; i3--) {
            Ik(this.rl[i3], this.f38181t[i3], writer);
        }
    }

    private static void Ik(int i2, Object obj, Writer writer) {
        int iN = WireFormat.n(i2);
        int iRl = WireFormat.rl(i2);
        if (iRl != 0) {
            if (iRl != 1) {
                if (iRl != 2) {
                    if (iRl != 3) {
                        if (iRl == 5) {
                            writer.writeFixed32(iN, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.O());
                    }
                    if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
                        writer.writeStartGroup(iN);
                        ((UnknownFieldSetLite) obj).r(writer);
                        writer.writeEndGroup(iN);
                        return;
                    } else {
                        writer.writeEndGroup(iN);
                        ((UnknownFieldSetLite) obj).r(writer);
                        writer.writeStartGroup(iN);
                        return;
                    }
                }
                writer.rl(iN, (ByteString) obj);
                return;
            }
            writer.writeFixed64(iN, ((Long) obj).longValue());
            return;
        }
        writer.writeInt64(iN, ((Long) obj).longValue());
    }

    void ck(Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i2 = this.f38180n - 1; i2 >= 0; i2--) {
                writer.writeMessageSetItem(WireFormat.n(this.rl[i2]), this.f38181t[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f38180n; i3++) {
            writer.writeMessageSetItem(WireFormat.n(this.rl[i3]), this.f38181t[i3]);
        }
    }

    void ty(int i2, Object obj) {
        n();
        rl(this.f38180n + 1);
        int[] iArr = this.rl;
        int i3 = this.f38180n;
        iArr[i3] = i2;
        this.f38181t[i3] = obj;
        this.f38180n = i3 + 1;
    }

    UnknownFieldSetLite xMQ(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(t())) {
            return this;
        }
        n();
        int i2 = this.f38180n + unknownFieldSetLite.f38180n;
        rl(i2);
        System.arraycopy(unknownFieldSetLite.rl, 0, this.rl, this.f38180n, unknownFieldSetLite.f38180n);
        System.arraycopy(unknownFieldSetLite.f38181t, 0, this.f38181t, this.f38180n, unknownFieldSetLite.f38180n);
        this.f38180n = i2;
        return this;
    }
}
