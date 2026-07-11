package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class RopeByteString extends ByteString {
    static final int[] E2 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f38117S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ByteString f38118Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f38119g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ByteString f38120o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f38121r;

    private static class Balancer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayDeque f38125n;

        private Balancer() {
            this.f38125n = new ArrayDeque();
        }

        private int nr(int i2) {
            int iBinarySearch = Arrays.binarySearch(RopeByteString.E2, i2);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void O(ByteString byteString) {
            int iNr = nr(byteString.size());
            int iE = RopeByteString.E(iNr + 1);
            if (!this.f38125n.isEmpty() && ((ByteString) this.f38125n.peek()).size() < iE) {
                int iE2 = RopeByteString.E(iNr);
                ByteString ropeByteString = (ByteString) this.f38125n.pop();
                while (true) {
                    if (this.f38125n.isEmpty() || ((ByteString) this.f38125n.peek()).size() >= iE2) {
                        break;
                    } else {
                        ropeByteString = new RopeByteString((ByteString) this.f38125n.pop(), ropeByteString);
                    }
                }
                RopeByteString ropeByteString2 = new RopeByteString(ropeByteString, byteString);
                while (!this.f38125n.isEmpty()) {
                    if (((ByteString) this.f38125n.peek()).size() >= RopeByteString.E(nr(ropeByteString2.size()) + 1)) {
                        break;
                    } else {
                        ropeByteString2 = new RopeByteString((ByteString) this.f38125n.pop(), ropeByteString2);
                    }
                }
                this.f38125n.push(ropeByteString2);
                return;
            }
            this.f38125n.push(byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString rl(ByteString byteString, ByteString byteString2) {
            t(byteString);
            t(byteString2);
            ByteString ropeByteString = (ByteString) this.f38125n.pop();
            while (!this.f38125n.isEmpty()) {
                ropeByteString = new RopeByteString((ByteString) this.f38125n.pop(), ropeByteString);
            }
            return ropeByteString;
        }

        private void t(ByteString byteString) {
            if (byteString.o()) {
                O(byteString);
                return;
            }
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                t(ropeByteString.f38120o);
                t(ropeByteString.f38118Z);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }
    }

    private static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayDeque f38126n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ByteString.LeafByteString f38127t;

        private PieceIterator(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f38126n = null;
                this.f38127t = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.Ik());
            this.f38126n = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.f38127t = n(ropeByteString.f38120o);
        }

        private ByteString.LeafByteString n(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f38126n.push(ropeByteString);
                byteString = ropeByteString.f38120o;
            }
            return (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString rl() {
            ByteString.LeafByteString leafByteStringN;
            do {
                ArrayDeque arrayDeque = this.f38126n;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringN = n(((RopeByteString) this.f38126n.pop()).f38118Z);
            } while (leafByteStringN.isEmpty());
            return leafByteStringN;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38127t != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f38127t;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.f38127t = rl();
            return leafByteString;
        }
    }

    private class RopeInputStream extends InputStream {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f38128O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ RopeByteString f38129Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private PieceIterator f38130n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f38131o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f38132r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ByteString.LeafByteString f38133t;

        private int Z(byte[] bArr, int i2, int i3) {
            int i5 = i3;
            while (i5 > 0) {
                n();
                if (this.f38133t == null) {
                    break;
                }
                int iMin = Math.min(this.f38128O - this.J2, i5);
                if (bArr != null) {
                    this.f38133t.HI(bArr, this.J2, i2, iMin);
                    i2 += iMin;
                }
                this.J2 += iMin;
                i5 -= iMin;
            }
            return i3 - i5;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            int iZ = Z(bArr, i2, i3);
            if (iZ != 0) {
                return iZ;
            }
            if (i3 > 0 || rl() == 0) {
                return -1;
            }
            return iZ;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            Uo();
            Z(null, 0, this.f38131o);
        }

        private void Uo() {
            PieceIterator pieceIterator = new PieceIterator(this.f38129Z);
            this.f38130n = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.f38133t = next;
            this.f38128O = next.size();
            this.J2 = 0;
            this.f38132r = 0;
        }

        private void n() {
            if (this.f38133t != null) {
                int i2 = this.J2;
                int i3 = this.f38128O;
                if (i2 == i3) {
                    this.f38132r += i3;
                    this.J2 = 0;
                    if (!this.f38130n.hasNext()) {
                        this.f38133t = null;
                        this.f38128O = 0;
                    } else {
                        ByteString.LeafByteString next = this.f38130n.next();
                        this.f38133t = next;
                        this.f38128O = next.size();
                    }
                }
            }
        }

        private int rl() {
            return this.f38129Z.size() - (this.f38132r + this.J2);
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f38131o = this.f38132r + this.J2;
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (j2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j2 > 2147483647L) {
                j2 = 2147483647L;
            }
            return Z(null, 0, (int) j2);
        }

        @Override // java.io.InputStream
        public int available() {
            return rl();
        }

        @Override // java.io.InputStream
        public int read() {
            n();
            ByteString.LeafByteString leafByteString = this.f38133t;
            if (leafByteString == null) {
                return -1;
            }
            int i2 = this.J2;
            this.J2 = i2 + 1;
            return leafByteString.O(i2) & UByte.MAX_VALUE;
        }
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f38121r != byteString.size()) {
            return false;
        }
        if (this.f38121r == 0) {
            return true;
        }
        int iG = g();
        int iG2 = byteString.g();
        if (iG == 0 || iG2 == 0 || iG == iG2) {
            return M7(byteString);
        }
        return false;
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f38120o = byteString;
        this.f38118Z = byteString2;
        int size = byteString.size();
        this.f38117S = size;
        this.f38121r = size + byteString2.size();
        this.f38119g = Math.max(byteString.Ik(), byteString2.Ik()) + 1;
    }

    static int E(int i2) {
        int[] iArr = E2;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    private boolean M7(ByteString byteString) {
        PieceIterator pieceIterator = new PieceIterator(this);
        ByteString.LeafByteString next = pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        ByteString.LeafByteString next2 = pieceIterator2.next();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (true) {
            int size = next.size() - i2;
            int size2 = next2.size() - i3;
            int iMin = Math.min(size, size2);
            if (!(i2 == 0 ? next.bzg(next2, i3, iMin) : next2.bzg(next, i2, iMin))) {
                return false;
            }
            i5 += iMin;
            int i7 = this.f38121r;
            if (i5 >= i7) {
                if (i5 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i2 = 0;
                next = pieceIterator.next();
            } else {
                i2 += iMin;
                next = next;
            }
            if (iMin == size2) {
                next2 = pieceIterator2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected int Ik() {
        return this.f38119g;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public byte O(int i2) {
        ByteString.J2(i2, this.f38121r);
        return r(i2);
    }

    @Override // androidx.content.preferences.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: S */
    public ByteString.ByteIterator iterator() {
        return new ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.RopeByteString.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final PieceIterator f38123n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            ByteString.ByteIterator f38124t = rl();

            {
                this.f38123n = new PieceIterator(RopeByteString.this);
            }

            private ByteString.ByteIterator rl() {
                if (this.f38123n.hasNext()) {
                    return this.f38123n.next().iterator();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f38124t != null;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                ByteString.ByteIterator byteIterator = this.f38124t;
                if (byteIterator == null) {
                    throw new NoSuchElementException();
                }
                byte bNextByte = byteIterator.nextByte();
                if (!this.f38124t.hasNext()) {
                    this.f38124t = rl();
                }
                return bNextByte;
            }
        };
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected int ViF(int i2, int i3, int i5) {
        int i7 = i3 + i5;
        int i8 = this.f38117S;
        if (i7 <= i8) {
            return this.f38120o.ViF(i2, i3, i5);
        }
        if (i3 >= i8) {
            return this.f38118Z.ViF(i2, i3 - i8, i5);
        }
        int i9 = i8 - i3;
        return this.f38118Z.ViF(this.f38120o.ViF(i2, i3, i9), 0, i5 - i9);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected String X(Charset charset) {
        return new String(fD(), charset);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public boolean XQ() {
        int iNY = this.f38120o.nY(0, 0, this.f38117S);
        ByteString byteString = this.f38118Z;
        return byteString.nY(iNY, 0, byteString.size()) == 0;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected void ck(byte[] bArr, int i2, int i3, int i5) {
        int i7 = i2 + i5;
        int i8 = this.f38117S;
        if (i7 <= i8) {
            this.f38120o.ck(bArr, i2, i3, i5);
        } else {
            if (i2 >= i8) {
                this.f38118Z.ck(bArr, i2 - i8, i3, i5);
                return;
            }
            int i9 = i8 - i2;
            this.f38120o.ck(bArr, i2, i3, i9);
            this.f38118Z.ck(bArr, 0, i3 + i9, i5 - i9);
        }
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public ByteString iF(int i2, int i3) {
        int iUo = ByteString.Uo(i2, i3, this.f38121r);
        if (iUo == 0) {
            return ByteString.f37740t;
        }
        if (iUo == this.f38121r) {
            return this;
        }
        int i5 = this.f38117S;
        return i3 <= i5 ? this.f38120o.iF(i2, i3) : i2 >= i5 ? this.f38118Z.iF(i2 - i5, i3 - i5) : new RopeByteString(this.f38120o.te(i2), this.f38118Z.iF(0, i3 - this.f38117S));
    }

    public List jB() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().t());
        }
        return arrayList;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected int nY(int i2, int i3, int i5) {
        int i7 = i3 + i5;
        int i8 = this.f38117S;
        if (i7 <= i8) {
            return this.f38120o.nY(i2, i3, i5);
        }
        if (i3 >= i8) {
            return this.f38118Z.nY(i2, i3 - i8, i5);
        }
        int i9 = i8 - i3;
        return this.f38118Z.nY(this.f38120o.nY(i2, i3, i9), 0, i5 - i9);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    protected boolean o() {
        return this.f38121r >= E(this.f38119g);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    byte r(int i2) {
        int i3 = this.f38117S;
        return i2 < i3 ? this.f38120o.r(i2) : this.f38118Z.r(i2 - i3);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    void rV9(ByteOutput byteOutput) {
        this.f38118Z.rV9(byteOutput);
        this.f38120o.rV9(byteOutput);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public int size() {
        return this.f38121r;
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    void v(ByteOutput byteOutput) {
        this.f38120o.v(byteOutput);
        this.f38118Z.v(byteOutput);
    }

    private static ByteString P5(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.HI(bArr, 0, 0, size);
        byteString2.HI(bArr, 0, size, size2);
        return ByteString.s7N(bArr);
    }

    static ByteString U(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return P5(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.f38118Z.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.f38120o, P5(ropeByteString.f38118Z, byteString2));
            }
            if (ropeByteString.f38120o.Ik() > ropeByteString.f38118Z.Ik() && ropeByteString.Ik() > byteString2.Ik()) {
                return new RopeByteString(ropeByteString.f38120o, new RopeByteString(ropeByteString.f38118Z, byteString2));
            }
        }
        if (size < E(Math.max(byteString.Ik(), byteString2.Ik()) + 1)) {
            return new Balancer().rl(byteString, byteString2);
        }
        return new RopeByteString(byteString, byteString2);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public CodedInputStream aYN() {
        return CodedInputStream.xMQ(jB(), true);
    }

    @Override // androidx.content.preferences.protobuf.ByteString
    public ByteBuffer t() {
        return ByteBuffer.wrap(fD()).asReadOnlyBuffer();
    }

    Object writeReplace() {
        return ByteString.s7N(fD());
    }
}
