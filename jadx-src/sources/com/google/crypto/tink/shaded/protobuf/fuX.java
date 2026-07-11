package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class fuX implements Iterable, Serializable {
    private static final Comparator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Wre f59996O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fuX f59997t = new aC(SPz.nr);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f59998n = 0;

    private static final class C implements Wre {
        private C() {
        }

        /* synthetic */ C(j jVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.Wre
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    public interface CN3 extends Iterator {
        byte nextByte();
    }

    private static final class I28 extends aC {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final int f59999Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f60000o;

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.aC
        protected int iF() {
            return this.f60000o;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.aC, com.google.crypto.tink.shaded.protobuf.fuX
        byte mUb(int i2) {
            return this.f60001r[this.f60000o + i2];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.aC, com.google.crypto.tink.shaded.protobuf.fuX
        public int size() {
            return this.f59999Z;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.aC, com.google.crypto.tink.shaded.protobuf.fuX
        protected void xMQ(byte[] bArr, int i2, int i3, int i5) {
            System.arraycopy(this.f60001r, iF() + i2, bArr, i3, i5);
        }

        I28(byte[] bArr, int i2, int i3) {
            super(bArr);
            fuX.O(i2, i2 + i3, bArr.length);
            this.f60000o = i2;
            this.f59999Z = i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.aC, com.google.crypto.tink.shaded.protobuf.fuX
        public byte t(int i2) {
            fuX.nr(i2, size());
            return this.f60001r[this.f60000o + i2];
        }

        Object writeReplace() {
            return fuX.ViF(r());
        }
    }

    private static final class Ml implements Wre {
        private Ml() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.Wre
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }

        /* synthetic */ Ml(j jVar) {
            this();
        }
    }

    private interface Wre {
        byte[] copyFrom(byte[] bArr, int i2, int i3);
    }

    private static class aC extends Dsr {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        protected final byte[] f60001r;

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof fuX) || size() != ((fuX) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof aC)) {
                return obj.equals(this);
            }
            aC aCVar = (aC) obj;
            int iCk = ck();
            int iCk2 = aCVar.ck();
            if (iCk == 0 || iCk2 == 0 || iCk == iCk2) {
                return te(aCVar, 0, size());
            }
            return false;
        }

        protected int iF() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        protected final int HI(int i2, int i3, int i5) {
            return SPz.KN(i2, this.f60001r, iF() + i3, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        protected final String S(Charset charset) {
            return new String(this.f60001r, iF(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        final void g(com.google.crypto.tink.shaded.protobuf.CN3 cn3) {
            cn3.n(this.f60001r, iF(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        byte mUb(int i2) {
            return this.f60001r[i2];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        public int size() {
            return this.f60001r.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        public byte t(int i2) {
            return this.f60001r[i2];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        public final com.google.crypto.tink.shaded.protobuf.Dsr ty() {
            return com.google.crypto.tink.shaded.protobuf.Dsr.mUb(this.f60001r, iF(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        protected void xMQ(byte[] bArr, int i2, int i3, int i5) {
            System.arraycopy(this.f60001r, i2, bArr, i3, i5);
        }

        aC(byte[] bArr) {
            bArr.getClass();
            this.f60001r = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        public final fuX Ik(int i2, int i3) {
            int iO = fuX.O(i2, i3, size());
            if (iO == 0) {
                return fuX.f59997t;
            }
            return new I28(this.f60001r, iF() + i2, iO);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX
        public final boolean gh() {
            int iIF = iF();
            return xZD.ty(this.f60001r, iIF, size() + iIF);
        }

        final boolean te(fuX fux, int i2, int i3) {
            if (i3 <= fux.size()) {
                int i5 = i2 + i3;
                if (i5 <= fux.size()) {
                    if (fux instanceof aC) {
                        aC aCVar = (aC) fux;
                        byte[] bArr = this.f60001r;
                        byte[] bArr2 = aCVar.f60001r;
                        int iIF = iF() + i3;
                        int iIF2 = iF();
                        int iIF3 = aCVar.iF() + i2;
                        while (iIF2 < iIF) {
                            if (bArr[iIF2] != bArr2[iIF3]) {
                                return false;
                            }
                            iIF2++;
                            iIF3++;
                        }
                        return true;
                    }
                    return fux.Ik(i2, i5).equals(Ik(0, i3));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + fux.size());
            }
            throw new IllegalArgumentException("Length too large: " + i3 + size());
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.fuX$fuX, reason: collision with other inner class name */
    static final class C0802fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CodedOutputStream f60002n;
        private final byte[] rl;

        /* synthetic */ C0802fuX(int i2, j jVar) {
            this(i2);
        }

        private C0802fuX(int i2) {
            byte[] bArr = new byte[i2];
            this.rl = bArr;
            this.f60002n = CodedOutputStream.p5(bArr);
        }

        public fuX n() {
            this.f60002n.t();
            return new aC(this.rl);
        }

        public CodedOutputStream rl() {
            return this.f60002n;
        }
    }

    class j extends w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f60004n = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f60005t;

        j() {
            this.f60005t = fuX.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60004n < this.f60005t;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.fuX.CN3
        public byte nextByte() {
            int i2 = this.f60004n;
            if (i2 >= this.f60005t) {
                throw new NoSuchElementException();
            }
            this.f60004n = i2 + 1;
            return fuX.this.mUb(i2);
        }
    }

    static abstract class w6 implements CN3 {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        w6() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    public static fuX J2(byte[] bArr) {
        return Uo(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    protected abstract int HI(int i2, int i3, int i5);

    public abstract fuX Ik(int i2, int i3);

    protected abstract String S(Charset charset);

    public abstract boolean equals(Object obj);

    abstract void g(com.google.crypto.tink.shaded.protobuf.CN3 cn3);

    public abstract boolean gh();

    abstract byte mUb(int i2);

    public abstract int size();

    public abstract byte t(int i2);

    public abstract com.google.crypto.tink.shaded.protobuf.Dsr ty();

    protected abstract void xMQ(byte[] bArr, int i2, int i3, int i5);

    static abstract class Dsr extends fuX {
        Dsr() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.qie();
        }
    }

    class n implements Comparator {
        n() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(fuX fux, fuX fux2) {
            CN3 cn3Qie = fux.qie();
            CN3 cn3Qie2 = fux2.qie();
            while (cn3Qie.hasNext() && cn3Qie2.hasNext()) {
                int iCompareTo = Integer.valueOf(fuX.o(cn3Qie.nextByte())).compareTo(Integer.valueOf(fuX.o(cn3Qie2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(fux.size()).compareTo(Integer.valueOf(fux2.size()));
        }
    }

    static {
        j jVar = null;
        f59996O = com.google.crypto.tink.shaded.protobuf.Ml.t() ? new C(jVar) : new Ml(jVar);
        J2 = new n();
    }

    public static fuX KN(String str) {
        return new aC(str.getBytes(SPz.rl));
    }

    static int O(int i2, int i3, int i5) {
        int i7 = i3 - i2;
        if ((i2 | i3 | i7 | (i5 - i3)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i5);
    }

    public static fuX Uo(byte[] bArr, int i2, int i3) {
        O(i2, i2 + i3, bArr.length);
        return new aC(f59996O.copyFrom(bArr, i2, i3));
    }

    static fuX ViF(byte[] bArr) {
        return new aC(bArr);
    }

    static C0802fuX az(int i2) {
        return new C0802fuX(i2, null);
    }

    static fuX nY(byte[] bArr, int i2, int i3) {
        return new I28(bArr, i2, i3);
    }

    static void nr(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    public final String WPU() {
        return XQ(SPz.rl);
    }

    protected final int ck() {
        return this.f59998n;
    }

    public final int hashCode() {
        int iHI = this.f59998n;
        if (iHI == 0) {
            int size = size();
            iHI = HI(size, 0, size);
            if (iHI == 0) {
                iHI = 1;
            }
            this.f59998n = iHI;
        }
        return iHI;
    }

    public CN3 qie() {
        return new j();
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), aYN());
    }

    fuX() {
    }

    private String aYN() {
        if (size() <= 50) {
            return LEl.n(this);
        }
        return LEl.n(Ik(0, 47)) + "...";
    }

    public final String XQ(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return S(charset);
    }

    public final byte[] r() {
        int size = size();
        if (size == 0) {
            return SPz.nr;
        }
        byte[] bArr = new byte[size];
        xMQ(bArr, 0, 0, size);
        return bArr;
    }
}
