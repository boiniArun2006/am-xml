package androidx.content.preferences.protobuf;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {
    private static final Comparator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ByteArrayCopier f37739O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ByteString f37740t = new LiteralByteString(Internal.nr);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37741n = 0;

    static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        AbstractByteIterator() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    private static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    private static final class BoundedByteString extends LiteralByteString {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final int f37745Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f37746o;

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected int Xw() {
            return this.f37746o;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        protected void ck(byte[] bArr, int i2, int i3, int i5) {
            System.arraycopy(this.f37748r, Xw() + i2, bArr, i3, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        byte r(int i2) {
            return this.f37748r[this.f37746o + i2];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        public int size() {
            return this.f37745Z;
        }

        BoundedByteString(byte[] bArr, int i2, int i3) {
            super(bArr);
            ByteString.Uo(i2, i2 + i3, bArr.length);
            this.f37746o = i2;
            this.f37745Z = i3;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.content.preferences.protobuf.ByteString
        public byte O(int i2) {
            ByteString.J2(i2, size());
            return this.f37748r[this.f37746o + i2];
        }

        Object writeReplace() {
            return ByteString.s7N(fD());
        }
    }

    private interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i2, int i3);
    }

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    static final class CodedBuilder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CodedOutputStream f37747n;
        private final byte[] rl;

        private CodedBuilder(int i2) {
            byte[] bArr = new byte[i2];
            this.rl = bArr;
            this.f37747n = CodedOutputStream.eTf(bArr);
        }

        public ByteString n() {
            this.f37747n.gh();
            return new LiteralByteString(this.rl);
        }

        public CodedOutputStream rl() {
            return this.f37747n;
        }
    }

    static abstract class LeafByteString extends ByteString {
        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int Ik() {
            return 0;
        }

        abstract boolean bzg(ByteString byteString, int i2, int i3);

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final boolean o() {
            return true;
        }

        private LeafByteString() {
        }

        @Override // androidx.content.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        void rV9(ByteOutput byteOutput) {
            v(byteOutput);
        }
    }

    private static class LiteralByteString extends LeafByteString {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        protected final byte[] f37748r;

        LiteralByteString(byte[] bArr) {
            super();
            bArr.getClass();
            this.f37748r = bArr;
        }

        protected int Xw() {
            return 0;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iG = g();
            int iG2 = literalByteString.g();
            if (iG == 0 || iG2 == 0 || iG == iG2) {
                return bzg(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public byte O(int i2) {
            return this.f37748r[i2];
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int ViF(int i2, int i3, int i5) {
            return Internal.xMQ(i2, this.f37748r, Xw() + i3, i5);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final String X(Charset charset) {
            return new String(this.f37748r, Xw(), size(), charset);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final CodedInputStream aYN() {
            return CodedInputStream.az(this.f37748r, Xw(), size(), true);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected void ck(byte[] bArr, int i2, int i3, int i5) {
            System.arraycopy(this.f37748r, i2, bArr, i3, i5);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        byte r(int i2) {
            return this.f37748r[i2];
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public int size() {
            return this.f37748r.length;
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final ByteBuffer t() {
            return ByteBuffer.wrap(this.f37748r, Xw(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        final void v(ByteOutput byteOutput) {
            byteOutput.xMQ(this.f37748r, Xw(), size());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final boolean XQ() {
            int iXw = Xw();
            return Utf8.XQ(this.f37748r, iXw, size() + iXw);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        final boolean bzg(ByteString byteString, int i2, int i3) {
            if (i3 <= byteString.size()) {
                int i5 = i2 + i3;
                if (i5 <= byteString.size()) {
                    if (byteString instanceof LiteralByteString) {
                        LiteralByteString literalByteString = (LiteralByteString) byteString;
                        byte[] bArr = this.f37748r;
                        byte[] bArr2 = literalByteString.f37748r;
                        int iXw = Xw() + i3;
                        int iXw2 = Xw();
                        int iXw3 = literalByteString.Xw() + i2;
                        while (iXw2 < iXw) {
                            if (bArr[iXw2] != bArr2[iXw3]) {
                                return false;
                            }
                            iXw2++;
                            iXw3++;
                        }
                        return true;
                    }
                    return byteString.iF(i2, i5).equals(iF(0, i3));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + byteString.size());
            }
            throw new IllegalArgumentException("Length too large: " + i3 + size());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public final ByteString iF(int i2, int i3) {
            int iUo = ByteString.Uo(i2, i3, size());
            if (iUo == 0) {
                return ByteString.f37740t;
            }
            return new BoundedByteString(this.f37748r, Xw() + i2, iUo);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected final int nY(int i2, int i3, int i5) {
            int iXw = Xw() + i3;
            return Utf8.WPU(i2, this.f37748r, iXw, i5 + iXw);
        }
    }

    private static final class NioByteString extends LeafByteString {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final ByteBuffer f37749r;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$NioByteString$1, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        class AnonymousClass1 extends InputStream {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ByteBuffer f37750n;

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read() {
                if (this.f37750n.hasRemaining()) {
                    return this.f37750n.get() & UByte.MAX_VALUE;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f37750n.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int i2) {
                Java8Compatibility.rl(this.f37750n);
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    Java8Compatibility.nr(this.f37750n);
                } catch (InvalidMarkException e2) {
                    throw new IOException(e2);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) {
                if (!this.f37750n.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i3, this.f37750n.remaining());
                this.f37750n.get(bArr, i2, iMin);
                return iMin;
            }
        }

        NioByteString(ByteBuffer byteBuffer) {
            super();
            Internal.rl(byteBuffer, V8ValueTypedArray.PROPERTY_BUFFER);
            this.f37749r = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected int ViF(int i2, int i3, int i5) {
            for (int i7 = i3; i7 < i3 + i5; i7++) {
                i2 = (i2 * 31) + this.f37749r.get(i7);
            }
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        boolean bzg(ByteString byteString, int i2, int i3) {
            return iF(0, i3).equals(byteString.iF(i2, i3 + i2));
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
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            return obj instanceof NioByteString ? this.f37749r.equals(((NioByteString) obj).f37749r) : obj instanceof RopeByteString ? obj.equals(this) : this.f37749r.equals(byteString.t());
        }

        private ByteBuffer Xw(int i2, int i3) {
            if (i2 < this.f37749r.position() || i3 > this.f37749r.limit() || i2 > i3) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            ByteBuffer byteBufferSlice = this.f37749r.slice();
            Java8Compatibility.t(byteBufferSlice, i2 - this.f37749r.position());
            Java8Compatibility.n(byteBufferSlice, i3 - this.f37749r.position());
            return byteBufferSlice;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            return ByteString.mUb(this.f37749r.slice());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public byte O(int i2) {
            try {
                return this.f37749r.get(i2);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new ArrayIndexOutOfBoundsException(e3.getMessage());
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected String X(Charset charset) {
            byte[] bArrFD;
            int length;
            int iArrayOffset;
            if (this.f37749r.hasArray()) {
                bArrFD = this.f37749r.array();
                iArrayOffset = this.f37749r.arrayOffset() + this.f37749r.position();
                length = this.f37749r.remaining();
            } else {
                bArrFD = fD();
                length = bArrFD.length;
                iArrayOffset = 0;
            }
            return new String(bArrFD, iArrayOffset, length, charset);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public boolean XQ() {
            return Utf8.o(this.f37749r);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public CodedInputStream aYN() {
            return CodedInputStream.mUb(this.f37749r, true);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected void ck(byte[] bArr, int i2, int i3, int i5) {
            ByteBuffer byteBufferSlice = this.f37749r.slice();
            Java8Compatibility.t(byteBufferSlice, i2);
            byteBufferSlice.get(bArr, i3, i5);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        protected int nY(int i2, int i3, int i5) {
            return Utf8.S(i2, this.f37749r, i3, i5 + i3);
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public int size() {
            return this.f37749r.remaining();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public ByteBuffer t() {
            return this.f37749r.asReadOnlyBuffer();
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        void v(ByteOutput byteOutput) {
            byteOutput.KN(this.f37749r.slice());
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public ByteString iF(int i2, int i3) {
            try {
                return new NioByteString(Xw(i2, i3));
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new ArrayIndexOutOfBoundsException(e3.getMessage());
            }
        }

        @Override // androidx.content.preferences.protobuf.ByteString
        public byte r(int i2) {
            return O(i2);
        }
    }

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final byte[] f37751o = new byte[0];
        private byte[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f37752O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f37753n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f37754r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ArrayList f37755t;

        public synchronized int size() {
            return this.f37752O + this.f37754r;
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
            try {
                if (this.f37754r == this.J2.length) {
                    n(1);
                }
                byte[] bArr = this.J2;
                int i3 = this.f37754r;
                this.f37754r = i3 + 1;
                bArr[i3] = (byte) i2;
            } catch (Throwable th) {
                throw th;
            }
        }

        private void n(int i2) {
            this.f37755t.add(new LiteralByteString(this.J2));
            int length = this.f37752O + this.J2.length;
            this.f37752O = length;
            this.J2 = new byte[Math.max(this.f37753n, Math.max(i2, length >>> 1))];
            this.f37754r = 0;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
            try {
                byte[] bArr2 = this.J2;
                int length = bArr2.length;
                int i5 = this.f37754r;
                if (i3 <= length - i5) {
                    System.arraycopy(bArr, i2, bArr2, i5, i3);
                    this.f37754r += i3;
                } else {
                    int length2 = bArr2.length - i5;
                    System.arraycopy(bArr, i2, bArr2, i5, length2);
                    int i7 = i3 - length2;
                    n(i7);
                    System.arraycopy(bArr, i2 + length2, this.J2, 0, i7);
                    this.f37754r = i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E2(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    private static ByteString nr(Iterator it, int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return (ByteString) it.next();
        }
        int i3 = i2 >>> 1;
        return nr(it, i3).KN(nr(it, i2 - i3));
    }

    public static ByteString qie(byte[] bArr) {
        return az(bArr, 0, bArr.length);
    }

    protected abstract int Ik();

    public abstract byte O(int i2);

    protected abstract int ViF(int i2, int i3, int i5);

    protected abstract String X(Charset charset);

    public abstract boolean XQ();

    public abstract CodedInputStream aYN();

    protected abstract void ck(byte[] bArr, int i2, int i3, int i5);

    public abstract boolean equals(Object obj);

    public abstract ByteString iF(int i2, int i3);

    protected abstract int nY(int i2, int i3, int i5);

    protected abstract boolean o();

    abstract byte r(int i2);

    abstract void rV9(ByteOutput byteOutput);

    public abstract int size();

    public abstract ByteBuffer t();

    abstract void v(ByteOutput byteOutput);

    static {
        f37739O = Android.t() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
        J2 = new Comparator<ByteString>() { // from class: androidx.datastore.preferences.protobuf.ByteString.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public int compare(ByteString byteString, ByteString byteString2) {
                ByteIterator it = byteString.iterator();
                ByteIterator it2 = byteString2.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    int iCompareTo = Integer.valueOf(ByteString.E2(it.nextByte())).compareTo(Integer.valueOf(ByteString.E2(it2.nextByte())));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
            }
        };
    }

    static void J2(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    static int Uo(int i2, int i3, int i5) {
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

    static CodedBuilder WPU(int i2) {
        return new CodedBuilder(i2);
    }

    public static ByteString az(byte[] bArr, int i2, int i3) {
        Uo(i2, i2 + i3, bArr.length);
        return new LiteralByteString(f37739O.copyFrom(bArr, i2, i3));
    }

    static ByteString s7N(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public static ByteString ty(String str) {
        return new LiteralByteString(str.getBytes(Internal.rl));
    }

    static ByteString wTp(byte[] bArr, int i2, int i3) {
        return new BoundedByteString(bArr, i2, i3);
    }

    public static ByteString xMQ(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f37740t : nr(iterable.iterator(), size);
    }

    public final void HI(byte[] bArr, int i2, int i3, int i5) {
        Uo(i2, i2 + i5, size());
        Uo(i3, i3 + i5, bArr.length);
        if (i5 > 0) {
            ck(bArr, i2, i3, i5);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.ByteString.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f37743n = 0;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final int f37744t;

            {
                this.f37744t = ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f37743n < this.f37744t;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i2 = this.f37743n;
                if (i2 >= this.f37744t) {
                    throw new NoSuchElementException();
                }
                this.f37743n = i2 + 1;
                return ByteString.this.r(i2);
            }
        };
    }

    public final String T() {
        return e(Internal.rl);
    }

    protected final int g() {
        return this.f37741n;
    }

    public final int hashCode() {
        int iViF = this.f37741n;
        if (iViF == 0) {
            int size = size();
            iViF = ViF(size, 0, size);
            if (iViF == 0) {
                iViF = 1;
            }
            this.f37741n = iViF;
        }
        return iViF;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), N());
    }

    ByteString() {
    }

    private String N() {
        if (size() <= 50) {
            return TextFormatEscaper.n(this);
        }
        return TextFormatEscaper.n(iF(0, 47)) + "...";
    }

    public static ByteString gh(ByteBuffer byteBuffer, int i2) {
        Uo(0, i2, byteBuffer.remaining());
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString mUb(ByteBuffer byteBuffer) {
        return gh(byteBuffer, byteBuffer.remaining());
    }

    static ByteString nHg(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wTp(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new NioByteString(byteBuffer);
    }

    public final ByteString KN(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.U(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public final String e(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return X(charset);
    }

    public final byte[] fD() {
        int size = size();
        if (size == 0) {
            return Internal.nr;
        }
        byte[] bArr = new byte[size];
        ck(bArr, 0, 0, size);
        return bArr;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final ByteString te(int i2) {
        return iF(i2, size());
    }
}
