package com.google.protobuf;

import com.google.protobuf.C;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Fl extends C {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final C left;
    private final int leftLength;
    private final C right;
    private final int totalLength;
    private final int treeDepth;

    private class Ml extends InputStream {
        private C.Dsr currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private w6 pieceIterator;

        private int readSkipInternal(byte[] bArr, int i2, int i3) {
            int i5 = i3;
            while (i5 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i5);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i2, iMin);
                    i2 += iMin;
                }
                this.currentPieceIndex += iMin;
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
            int skipInternal = readSkipInternal(bArr, i2, i3);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (i3 > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        public Ml() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i2 = this.currentPieceIndex;
                int i3 = this.currentPieceSize;
                if (i2 == i3) {
                    this.currentPieceOffsetInRope += i3;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        C.Dsr next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return Fl.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            w6 w6Var = new w6(Fl.this, null);
            this.pieceIterator = w6Var;
            C.Dsr next = w6Var.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (j2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j2 > 2147483647L) {
                j2 = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j2);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            C.Dsr dsr = this.currentPiece;
            if (dsr == null) {
                return -1;
            }
            int i2 = this.currentPieceIndex;
            this.currentPieceIndex = i2 + 1;
            return dsr.byteAt(i2) & UByte.MAX_VALUE;
        }
    }

    class j extends C.w6 {
        C.CN3 current = nextPiece();
        final w6 pieces;

        j() {
            this.pieces = new w6(Fl.this, null);
        }

        private C.CN3 nextPiece() {
            if (this.pieces.hasNext()) {
                return this.pieces.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current != null;
        }

        @Override // com.google.protobuf.C.w6, com.google.protobuf.C.CN3
        public byte nextByte() {
            C.CN3 cn3 = this.current;
            if (cn3 == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = cn3.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return bNextByte;
        }
    }

    private static class n {
        private final ArrayDeque<C> prefixesStack;

        private n() {
            this.prefixesStack = new ArrayDeque<>();
        }

        private int getDepthBinForLength(int i2) {
            int iBinarySearch = Arrays.binarySearch(Fl.minLengthByDepth, i2);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        /* synthetic */ n(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C balance(C c2, C c4) {
            doBalance(c2);
            doBalance(c4);
            C cPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                cPop = new Fl(this.prefixesStack.pop(), cPop, null);
            }
            return cPop;
        }

        private void doBalance(C c2) {
            if (c2.isBalanced()) {
                insert(c2);
                return;
            }
            if (c2 instanceof Fl) {
                Fl fl = (Fl) c2;
                doBalance(fl.left);
                doBalance(fl.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + c2.getClass());
            }
        }

        private void insert(C c2) {
            j jVar;
            int depthBinForLength = getDepthBinForLength(c2.size());
            int iMinLength = Fl.minLength(depthBinForLength + 1);
            if (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < iMinLength) {
                int iMinLength2 = Fl.minLength(depthBinForLength);
                C cPop = this.prefixesStack.pop();
                while (true) {
                    jVar = null;
                    if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                        break;
                    } else {
                        cPop = new Fl(this.prefixesStack.pop(), cPop, jVar);
                    }
                }
                Fl fl = new Fl(cPop, c2, jVar);
                while (!this.prefixesStack.isEmpty()) {
                    if (this.prefixesStack.peek().size() >= Fl.minLength(getDepthBinForLength(fl.size()) + 1)) {
                        break;
                    } else {
                        fl = new Fl(this.prefixesStack.pop(), fl, jVar);
                    }
                }
                this.prefixesStack.push(fl);
                return;
            }
            this.prefixesStack.push(c2);
        }
    }

    private static final class w6 implements Iterator {
        private final ArrayDeque<Fl> breadCrumbs;
        private C.Dsr next;

        /* synthetic */ w6(C c2, j jVar) {
            this(c2);
        }

        private w6(C c2) {
            if (!(c2 instanceof Fl)) {
                this.breadCrumbs = null;
                this.next = (C.Dsr) c2;
                return;
            }
            Fl fl = (Fl) c2;
            ArrayDeque<Fl> arrayDeque = new ArrayDeque<>(fl.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(fl);
            this.next = getLeafByLeft(fl.left);
        }

        private C.Dsr getLeafByLeft(C c2) {
            while (c2 instanceof Fl) {
                Fl fl = (Fl) c2;
                this.breadCrumbs.push(fl);
                c2 = fl.left;
            }
            return (C.Dsr) c2;
        }

        private C.Dsr getNextNonEmptyLeaf() {
            C.Dsr leafByLeft;
            do {
                ArrayDeque<Fl> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public C.Dsr next() {
            C.Dsr dsr = this.next;
            if (dsr == null) {
                throw new NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return dsr;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* synthetic */ Fl(C c2, C c4, j jVar) {
        this(c2, c4);
    }

    @Override // com.google.protobuf.C
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        if (this.totalLength != c2.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = c2.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(c2);
        }
        return false;
    }

    @Override // com.google.protobuf.C
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    private Fl(C c2, C c4) {
        this.left = c2;
        this.right = c4;
        int size = c2.size();
        this.leftLength = size;
        this.totalLength = size + c4.size();
        this.treeDepth = Math.max(c2.getTreeDepth(), c4.getTreeDepth()) + 1;
    }

    private boolean equalsFragments(C c2) {
        j jVar = null;
        w6 w6Var = new w6(this, jVar);
        C.Dsr dsr = (C.Dsr) w6Var.next();
        w6 w6Var2 = new w6(c2, jVar);
        C.Dsr dsr2 = (C.Dsr) w6Var2.next();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (true) {
            int size = dsr.size() - i2;
            int size2 = dsr2.size() - i3;
            int iMin = Math.min(size, size2);
            if (!(i2 == 0 ? dsr.equalsRange(dsr2, i3, iMin) : dsr2.equalsRange(dsr, i2, iMin))) {
                return false;
            }
            i5 += iMin;
            int i7 = this.totalLength;
            if (i5 >= i7) {
                if (i5 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i2 = 0;
                dsr = (C.Dsr) w6Var.next();
            } else {
                i2 += iMin;
                dsr = dsr;
            }
            if (iMin == size2) {
                dsr2 = (C.Dsr) w6Var2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    static int minLength(int i2) {
        int[] iArr = minLengthByDepth;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    static Fl newInstanceForTest(C c2, C c4) {
        return new Fl(c2, c4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.C
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, null);
        while (w6Var.hasNext()) {
            arrayList.add(w6Var.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.C
    public byte byteAt(int i2) {
        C.checkIndex(i2, this.totalLength);
        return internalByteAt(i2);
    }

    @Override // com.google.protobuf.C
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.C
    protected void copyToInternal(byte[] bArr, int i2, int i3, int i5) {
        int i7 = i2 + i5;
        int i8 = this.leftLength;
        if (i7 <= i8) {
            this.left.copyToInternal(bArr, i2, i3, i5);
        } else {
            if (i2 >= i8) {
                this.right.copyToInternal(bArr, i2 - i8, i3, i5);
                return;
            }
            int i9 = i8 - i2;
            this.left.copyToInternal(bArr, i2, i3, i9);
            this.right.copyToInternal(bArr, 0, i3 + i9, i5 - i9);
        }
    }

    @Override // com.google.protobuf.C
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.C
    byte internalByteAt(int i2) {
        int i3 = this.leftLength;
        return i2 < i3 ? this.left.internalByteAt(i2) : this.right.internalByteAt(i2 - i3);
    }

    @Override // com.google.protobuf.C
    protected boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.C
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        C c2 = this.right;
        return c2.partialIsValidUtf8(iPartialIsValidUtf8, 0, c2.size()) == 0;
    }

    @Override // com.google.protobuf.C, java.lang.Iterable
    public C.CN3 iterator() {
        return new j();
    }

    @Override // com.google.protobuf.C
    public InputStream newInput() {
        return new Ml();
    }

    @Override // com.google.protobuf.C
    protected int partialHash(int i2, int i3, int i5) {
        int i7 = i3 + i5;
        int i8 = this.leftLength;
        if (i7 <= i8) {
            return this.left.partialHash(i2, i3, i5);
        }
        if (i3 >= i8) {
            return this.right.partialHash(i2, i3 - i8, i5);
        }
        int i9 = i8 - i3;
        return this.right.partialHash(this.left.partialHash(i2, i3, i9), 0, i5 - i9);
    }

    @Override // com.google.protobuf.C
    protected int partialIsValidUtf8(int i2, int i3, int i5) {
        int i7 = i3 + i5;
        int i8 = this.leftLength;
        if (i7 <= i8) {
            return this.left.partialIsValidUtf8(i2, i3, i5);
        }
        if (i3 >= i8) {
            return this.right.partialIsValidUtf8(i2, i3 - i8, i5);
        }
        int i9 = i8 - i3;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i2, i3, i9), 0, i5 - i9);
    }

    @Override // com.google.protobuf.C
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.C
    public C substring(int i2, int i3) {
        int iCheckRange = C.checkRange(i2, i3, this.totalLength);
        if (iCheckRange == 0) {
            return C.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i5 = this.leftLength;
        return i3 <= i5 ? this.left.substring(i2, i3) : i2 >= i5 ? this.right.substring(i2 - i5, i3 - i5) : new Fl(this.left.substring(i2), this.right.substring(0, i3 - this.leftLength));
    }

    @Override // com.google.protobuf.C
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.C
    void writeToInternal(OutputStream outputStream, int i2, int i3) throws IOException {
        int i5 = i2 + i3;
        int i7 = this.leftLength;
        if (i5 <= i7) {
            this.left.writeToInternal(outputStream, i2, i3);
        } else {
            if (i2 >= i7) {
                this.right.writeToInternal(outputStream, i2 - i7, i3);
                return;
            }
            int i8 = i7 - i2;
            this.left.writeToInternal(outputStream, i2, i8);
            this.right.writeToInternal(outputStream, 0, i3 - i8);
        }
    }

    @Override // com.google.protobuf.C
    void writeToReverse(aC aCVar) throws IOException {
        this.right.writeToReverse(aCVar);
        this.left.writeToReverse(aCVar);
    }

    static C concatenate(C c2, C c4) {
        if (c4.size() == 0) {
            return c2;
        }
        if (c2.size() == 0) {
            return c4;
        }
        int size = c2.size() + c4.size();
        if (size < 128) {
            return concatenateBytes(c2, c4);
        }
        if (c2 instanceof Fl) {
            Fl fl = (Fl) c2;
            if (fl.right.size() + c4.size() < 128) {
                return new Fl(fl.left, concatenateBytes(fl.right, c4));
            }
            if (fl.left.getTreeDepth() > fl.right.getTreeDepth() && fl.getTreeDepth() > c4.getTreeDepth()) {
                return new Fl(fl.left, new Fl(fl.right, c4));
            }
        }
        if (size < minLength(Math.max(c2.getTreeDepth(), c4.getTreeDepth()) + 1)) {
            return new n(null).balance(c2, c4);
        }
        return new Fl(c2, c4);
    }

    private static C concatenateBytes(C c2, C c4) {
        int size = c2.size();
        int size2 = c4.size();
        byte[] bArr = new byte[size + size2];
        c2.copyTo(bArr, 0, 0, size);
        c4.copyTo(bArr, 0, size, size2);
        return C.wrap(bArr);
    }

    @Override // com.google.protobuf.C
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.C
    public AbstractC1923o newCodedInput() {
        return AbstractC1923o.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    Object writeReplace() {
        return C.wrap(toByteArray());
    }

    @Override // com.google.protobuf.C
    void writeTo(aC aCVar) throws IOException {
        this.left.writeTo(aCVar);
        this.right.writeTo(aCVar);
    }
}
