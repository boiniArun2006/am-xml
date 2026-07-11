package com.google.protobuf;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class C implements Iterable, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final C EMPTY = new aC(nKK.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<C> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final Wre byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* JADX INFO: renamed from: com.google.protobuf.C$C, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class C0820C extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<C> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized C toByteString() {
            flushLastBuffer();
            return C.copyFrom(this.flushedBuffers);
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i3 = this.bufferPos;
                this.bufferPos = i3 + 1;
                bArr[i3] = (byte) i2;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i2;
            C[] cArr;
            byte[] bArr;
            int i3;
            synchronized (this) {
                cArr = (C[]) this.flushedBuffers.toArray(new C[0]);
                bArr = this.buffer;
                i3 = this.bufferPos;
            }
            for (C c2 : cArr) {
                c2.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i3));
        }

        private void flushFullBuffer(int i2) {
            this.flushedBuffers.add(new aC(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i2, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i2 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i2 >= bArr.length) {
                this.flushedBuffers.add(new aC(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i2 > 0) {
                this.flushedBuffers.add(new aC(Arrays.copyOf(bArr, i2)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        C0820C(int i2) {
            if (i2 >= 0) {
                this.initialCapacity = i2;
                this.flushedBuffers = new ArrayList<>();
                this.buffer = new byte[i2];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i5 = this.bufferPos;
                if (i3 <= length - i5) {
                    System.arraycopy(bArr, i2, bArr2, i5, i3);
                    this.bufferPos += i3;
                } else {
                    int length2 = bArr2.length - i5;
                    System.arraycopy(bArr, i2, bArr2, i5, length2);
                    int i7 = i3 - length2;
                    flushFullBuffer(i7);
                    System.arraycopy(bArr, i2 + length2, this.buffer, 0, i7);
                    this.bufferPos = i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface CN3 extends Iterator {
        byte nextByte();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class I28 extends aC {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.C.aC, com.google.protobuf.C
        protected void copyToInternal(byte[] bArr, int i2, int i3, int i5) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i2, bArr, i3, i5);
        }

        @Override // com.google.protobuf.C.aC
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.C.aC, com.google.protobuf.C
        byte internalByteAt(int i2) {
            return this.bytes[this.bytesOffset + i2];
        }

        @Override // com.google.protobuf.C.aC, com.google.protobuf.C
        public int size() {
            return this.bytesLength;
        }

        I28(byte[] bArr, int i2, int i3) {
            super(bArr);
            C.checkRange(i2, i2 + i3, bArr.length);
            this.bytesOffset = i2;
            this.bytesLength = i3;
        }

        @Override // com.google.protobuf.C.aC, com.google.protobuf.C
        public byte byteAt(int i2) {
            C.checkIndex(i2, size());
            return this.bytes[this.bytesOffset + i2];
        }

        Object writeReplace() {
            return C.wrap(toByteArray());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class Ml implements Wre {
        private Ml() {
        }

        @Override // com.google.protobuf.C.Wre
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }

        /* synthetic */ Ml(j jVar) {
            this();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private interface Wre {
        byte[] copyFrom(byte[] bArr, int i2, int i3);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static class aC extends Dsr {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        @Override // com.google.protobuf.C
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C) || size() != ((C) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof aC)) {
                return obj.equals(this);
            }
            aC aCVar = (aC) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = aCVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(aCVar, 0, size());
            }
            return false;
        }

        protected int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.C
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.C
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.C
        public byte byteAt(int i2) {
            return this.bytes[i2];
        }

        @Override // com.google.protobuf.C
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.C
        protected void copyToInternal(byte[] bArr, int i2, int i3, int i5) {
            System.arraycopy(this.bytes, i2, bArr, i3, i5);
        }

        @Override // com.google.protobuf.C
        byte internalByteAt(int i2) {
            return this.bytes[i2];
        }

        @Override // com.google.protobuf.C
        public final AbstractC1923o newCodedInput() {
            return AbstractC1923o.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.C
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.C
        protected final int partialHash(int i2, int i3, int i5) {
            return nKK.partialHash(i2, this.bytes, getOffsetIntoBytes() + i3, i5);
        }

        @Override // com.google.protobuf.C
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.C
        protected final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.C
        final void writeTo(com.google.protobuf.aC aCVar) throws IOException {
            aCVar.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.C
        final void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        aC(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.C
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.C.Dsr
        final boolean equalsRange(C c2, int i2, int i3) {
            if (i3 <= c2.size()) {
                int i5 = i2 + i3;
                if (i5 <= c2.size()) {
                    if (c2 instanceof aC) {
                        aC aCVar = (aC) c2;
                        byte[] bArr = this.bytes;
                        byte[] bArr2 = aCVar.bytes;
                        int offsetIntoBytes = getOffsetIntoBytes() + i3;
                        int offsetIntoBytes2 = getOffsetIntoBytes();
                        int offsetIntoBytes3 = aCVar.getOffsetIntoBytes() + i2;
                        while (offsetIntoBytes2 < offsetIntoBytes) {
                            if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                                return false;
                            }
                            offsetIntoBytes2++;
                            offsetIntoBytes3++;
                        }
                        return true;
                    }
                    return c2.substring(i2, i5).equals(substring(0, i3));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + c2.size());
            }
            throw new IllegalArgumentException("Length too large: " + i3 + size());
        }

        @Override // com.google.protobuf.C
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return L0y.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.C
        protected final int partialIsValidUtf8(int i2, int i3, int i5) {
            int offsetIntoBytes = getOffsetIntoBytes() + i3;
            return L0y.partialIsValidUtf8(i2, this.bytes, offsetIntoBytes, i5 + offsetIntoBytes);
        }

        @Override // com.google.protobuf.C
        public final C substring(int i2, int i3) {
            int iCheckRange = C.checkRange(i2, i3, size());
            if (iCheckRange == 0) {
                return C.EMPTY;
            }
            return new I28(this.bytes, getOffsetIntoBytes() + i2, iCheckRange);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class fuX {
        private final byte[] buffer;
        private final CodedOutputStream output;

        /* synthetic */ fuX(int i2, j jVar) {
            this(i2);
        }

        private fuX(int i2) {
            byte[] bArr = new byte[i2];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }

        public C build() {
            this.output.checkNoSpaceLeft();
            return new aC(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class j extends w6 {
        private final int limit;
        private int position = 0;

        j() {
            this.limit = C.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // com.google.protobuf.C.w6, com.google.protobuf.C.CN3
        public byte nextByte() {
            int i2 = this.position;
            if (i2 >= this.limit) {
                throw new NoSuchElementException();
            }
            this.position = i2 + 1;
            return C.this.internalByteAt(i2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    class n implements Comparator {
        @Override // java.util.Comparator
        public int compare(C c2, C c4) {
            CN3 it = c2.iterator();
            CN3 it2 = c4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(C.toInt(it.nextByte())).compareTo(Integer.valueOf(C.toInt(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(c2.size()).compareTo(Integer.valueOf(c4.size()));
        }

        n() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class o implements Wre {
        private o() {
        }

        /* synthetic */ o(j jVar) {
            this();
        }

        @Override // com.google.protobuf.C.Wre
        public byte[] copyFrom(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static abstract class w6 implements CN3 {
        @Override // com.google.protobuf.C.CN3
        public abstract /* synthetic */ byte nextByte();

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        w6() {
        }
    }

    private static C balancedConcat(Iterator<C> it, int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return balancedConcat(it, i3).concat(balancedConcat(it, i2 - i3));
    }

    public static C copyFrom(byte[] bArr, int i2, int i3) {
        checkRange(i2, i2 + i3, bArr.length);
        return new aC(byteArrayCopier.copyFrom(bArr, i2, i3));
    }

    private static int hexDigit(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return -1;
        }
        return c2 - 'W';
    }

    public static C0820C newOutput(int i2) {
        return new C0820C(i2);
    }

    public static C readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b2) {
        return b2 & UByte.MAX_VALUE;
    }

    static C wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new LEl(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i2);

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i2) {
        copyTo(bArr, 0, i2, size());
    }

    protected abstract void copyToInternal(byte[] bArr, int i2, int i3, int i5);

    public abstract boolean equals(Object obj);

    protected abstract int getTreeDepth();

    abstract byte internalByteAt(int i2);

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract AbstractC1923o newCodedInput();

    public abstract InputStream newInput();

    protected abstract int partialHash(int i2, int i3, int i5);

    protected abstract int partialIsValidUtf8(int i2, int i3, int i5);

    public abstract int size();

    public final C substring(int i2) {
        return substring(i2, size());
    }

    public abstract C substring(int i2, int i3);

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e2) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e2);
            throw unsupportedEncodingException;
        }
    }

    protected abstract String toStringInternal(Charset charset);

    abstract void writeTo(com.google.protobuf.aC aCVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    final void writeTo(OutputStream outputStream, int i2, int i3) throws IOException {
        checkRange(i2, i2 + i3, size());
        if (i3 > 0) {
            writeToInternal(outputStream, i2, i3);
        }
    }

    abstract void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException;

    abstract void writeToReverse(com.google.protobuf.aC aCVar) throws IOException;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static abstract class Dsr extends C {
        private static final long serialVersionUID = 1;

        abstract boolean equalsRange(C c2, int i2, int i3);

        @Override // com.google.protobuf.C
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.C
        protected final boolean isBalanced() {
            return true;
        }

        Dsr() {
        }

        @Override // com.google.protobuf.C, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.protobuf.C
        void writeToReverse(com.google.protobuf.aC aCVar) throws IOException {
            writeTo(aCVar);
        }
    }

    static {
        j jVar = null;
        byteArrayCopier = com.google.protobuf.Ml.isOnAndroidDevice() ? new o(jVar) : new Ml(jVar);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new n();
    }

    static void checkIndex(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    static int checkRange(int i2, int i3, int i5) {
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

    public static C copyFromUtf8(String str) {
        return new aC(str.getBytes(nKK.UTF_8));
    }

    public static final C empty() {
        return EMPTY;
    }

    static fuX newCodedBuilder(int i2) {
        return new fuX(i2, null);
    }

    public static C0820C newOutput() {
        return new C0820C(128);
    }

    private static C readChunk(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i5 = inputStream.read(bArr, i3, i2 - i3);
            if (i5 == -1) {
                break;
            }
            i3 += i5;
        }
        if (i3 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i3);
    }

    public static C readFrom(InputStream inputStream, int i2) throws IOException {
        return readFrom(inputStream, i2, i2);
    }

    public static Comparator<C> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i2, int i3, int i5) {
        checkRange(i2, i2 + i5, size());
        checkRange(i3, i3 + i5, bArr.length);
        if (i5 > 0) {
            copyToInternal(bArr, i2, i3, i5);
        }
    }

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // java.lang.Iterable
    public CN3 iterator() {
        return new j();
    }

    protected final int peekCachedHashCode() {
        return this.hash;
    }

    public final String toStringUtf8() {
        return toString(nKK.UTF_8);
    }

    C() {
    }

    public static C copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    private static int extractHexDigit(String str, int i2) {
        int iHexDigit = hexDigit(str.charAt(i2));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i2) + " at index " + i2);
    }

    public static C fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (extractHexDigit(str, i3 + 1) | (extractHexDigit(str, i3) << 4));
            }
            return new aC(bArr);
        }
        throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + obbPUqyhtS.ZICcwwLjXcAwn);
    }

    public static C readFrom(InputStream inputStream, int i2, int i3) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C chunk = readChunk(inputStream, i2);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i2 = Math.min(i2 * 2, i3);
        }
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return qYU.escapeBytes(this);
        }
        return qYU.escapeBytes(substring(0, 47)) + "...";
    }

    public final C concat(C c2) {
        if (Integer.MAX_VALUE - size() >= c2.size()) {
            return Fl.concatenate(this, c2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + c2.size());
    }

    public final boolean endsWith(C c2) {
        if (size() >= c2.size() && substring(size() - c2.size()).equals(c2)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean startsWith(C c2) {
        if (size() < c2.size() || !substring(0, c2.size()).equals(c2)) {
            return false;
        }
        return true;
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return nKK.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public static C copyFrom(ByteBuffer byteBuffer, int i2) {
        checkRange(0, i2, byteBuffer.remaining());
        byte[] bArr = new byte[i2];
        byteBuffer.get(bArr);
        return new aC(bArr);
    }

    static C wrap(byte[] bArr) {
        return new aC(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    static C wrap(byte[] bArr, int i2, int i3) {
        return new I28(bArr, i2, i3);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static C copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static C copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new aC(str.getBytes(str2));
    }

    public static C copyFrom(String str, Charset charset) {
        return new aC(str.getBytes(charset));
    }

    public static C copyFrom(Iterable<C> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<C> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
