package com.google.protobuf;

import com.google.protobuf.yg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1923o {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    qz wrapper;

    /* JADX INFO: renamed from: com.google.protobuf.o$I28 */
    private static final class I28 extends AbstractC1923o {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private void skipRawVarintFastPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                long j2 = this.pos;
                this.pos = 1 + j2;
                if (g9.getByte(j2) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readGroup(int i2, yg.j jVar, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readMessage(yg.j jVar, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(CM.makeTag(CM.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        private I28(ByteBuffer byteBuffer, boolean z2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = g9.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) byteBuffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z2;
        }

        private int bufferPos(long j2) {
            return (int) (j2 - this.address);
        }

        private void recomputeBufferSizeAfterLimit() {
            long j2 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j2;
            int i2 = (int) (j2 - this.startPos);
            int i3 = this.currentLimit;
            if (i2 <= i3) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i5 = i2 - i3;
            this.bufferSizeAfterLimit = i5;
            this.limit = j2 - ((long) i5);
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private ByteBuffer slice(long j2, long j3) throws IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j2));
                    byteBuffer.limit(bufferPos(j3));
                    return this.buffer.slice();
                } catch (IllegalArgumentException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e2);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void enableAliasing(boolean z2) {
            this.enableAliasing = z2;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i2 + getTotalBytesRead();
            int i3 = this.currentLimit;
            if (totalBytesRead > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte readRawByte() throws IOException {
            long j2 = this.pos;
            if (j2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j2;
            return g9.getByte(j2);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readRawBytes(int i2) throws IOException {
            if (i2 < 0 || i2 > remaining()) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 == 0) {
                    return nKK.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i2];
            long j2 = this.pos;
            long j3 = i2;
            slice(j2, j2 + j3).get(bArr);
            this.pos += j3;
            return bArr;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawLittleEndian32() throws IOException {
            long j2 = this.pos;
            if (this.limit - j2 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j2;
            return ((g9.getByte(j2 + 3) & UByte.MAX_VALUE) << 24) | (g9.getByte(j2) & UByte.MAX_VALUE) | ((g9.getByte(1 + j2) & UByte.MAX_VALUE) << 8) | ((g9.getByte(2 + j2) & UByte.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawLittleEndian64() throws IOException {
            long j2 = this.pos;
            if (this.limit - j2 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j2;
            return ((((long) g9.getByte(j2 + 7)) & 255) << 56) | (((long) g9.getByte(j2)) & 255) | ((((long) g9.getByte(1 + j2)) & 255) << 8) | ((((long) g9.getByte(2 + j2)) & 255) << 16) | ((((long) g9.getByte(3 + j2)) & 255) << 24) | ((((long) g9.getByte(4 + j2)) & 255) << 32) | ((((long) g9.getByte(5 + j2)) & 255) << 40) | ((((long) g9.getByte(6 + j2)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.g9.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.AbstractC1923o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws IOException {
            int i2;
            long j2 = this.pos;
            if (this.limit != j2) {
                long j3 = 1 + j2;
                byte b2 = g9.getByte(j2);
                if (b2 >= 0) {
                    this.pos = j3;
                    return b2;
                }
                if (this.limit - j3 >= 9) {
                    long j4 = 2 + j2;
                    int i3 = (g9.getByte(j3) << 7) ^ b2;
                    if (i3 < 0) {
                        i2 = i3 ^ (-128);
                    } else {
                        long j5 = 3 + j2;
                        int i5 = i3 ^ (g9.getByte(j4) << 14);
                        if (i5 >= 0) {
                            i2 = i5 ^ 16256;
                        } else {
                            j4 = 4 + j2;
                            int i7 = i5 ^ (g9.getByte(j5) << 21);
                            if (i7 < 0) {
                                i2 = (-2080896) ^ i7;
                            } else {
                                j5 = 5 + j2;
                                byte b4 = g9.getByte(j4);
                                int i8 = (i7 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    j4 = 6 + j2;
                                    if (g9.getByte(j5) < 0) {
                                        j5 = 7 + j2;
                                        if (g9.getByte(j4) < 0) {
                                            j4 = 8 + j2;
                                            if (g9.getByte(j5) < 0) {
                                                j5 = j2 + 9;
                                                if (g9.getByte(j4) < 0) {
                                                    j4 = 10 + j2;
                                                }
                                            }
                                        }
                                    }
                                    i2 = i8;
                                }
                                i2 = i8;
                            }
                        }
                        j4 = j5;
                    }
                    this.pos = j4;
                    return i2;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2;
            long j5 = this.pos;
            if (this.limit != j5) {
                long j6 = 1 + j5;
                byte b2 = g9.getByte(j5);
                if (b2 >= 0) {
                    this.pos = j6;
                    return b2;
                }
                if (this.limit - j6 >= 9) {
                    long j7 = 2 + j5;
                    int i3 = (g9.getByte(j6) << 7) ^ b2;
                    if (i3 >= 0) {
                        long j9 = 3 + j5;
                        int i5 = i3 ^ (g9.getByte(j7) << 14);
                        if (i5 >= 0) {
                            j2 = i5 ^ 16256;
                            j7 = j9;
                        } else {
                            j7 = 4 + j5;
                            int i7 = i5 ^ (g9.getByte(j9) << 21);
                            if (i7 < 0) {
                                i2 = (-2080896) ^ i7;
                            } else {
                                long j10 = 5 + j5;
                                long j11 = ((long) i7) ^ (((long) g9.getByte(j7)) << 28);
                                if (j11 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j12 = 6 + j5;
                                    long j13 = j11 ^ (((long) g9.getByte(j10)) << 35);
                                    if (j13 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j10 = 7 + j5;
                                        j11 = j13 ^ (((long) g9.getByte(j12)) << 42);
                                        if (j11 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j12 = 8 + j5;
                                            j13 = j11 ^ (((long) g9.getByte(j10)) << 49);
                                            if (j13 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                long j14 = j5 + 9;
                                                long j15 = (j13 ^ (((long) g9.getByte(j12)) << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    long j16 = j5 + 10;
                                                    if (g9.getByte(j14) >= 0) {
                                                        j7 = j16;
                                                        j2 = j15;
                                                    }
                                                } else {
                                                    j2 = j15;
                                                    j7 = j14;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j13;
                                    j7 = j12;
                                }
                                j2 = j4 ^ j11;
                                j7 = j10;
                            }
                        }
                        this.pos = j7;
                        return j2;
                    }
                    i2 = i3 ^ (-128);
                    j2 = i2;
                    this.pos = j7;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 |= ((long) (rawByte & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((rawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void skipRawBytes(int i2) throws IOException {
            if (i2 >= 0 && i2 <= remaining()) {
                this.pos += (long) i2;
            } else {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        static boolean isSupported() {
            return g9.hasUnsafeByteBufferOperations();
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                if (!this.immutable && this.enableAliasing) {
                    long j2 = this.pos;
                    long j3 = rawVarint32;
                    ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
                    this.pos += j3;
                    return byteBufferSlice;
                }
                byte[] bArr = new byte[rawVarint32];
                long j4 = rawVarint32;
                g9.copyMemory(this.pos, bArr, 0L, j4);
                this.pos += j4;
                return ByteBuffer.wrap(bArr);
            }
            if (rawVarint32 == 0) {
                return nKK.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public C readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                if (this.immutable && this.enableAliasing) {
                    long j2 = this.pos;
                    long j3 = rawVarint32;
                    ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
                    this.pos += j3;
                    return C.wrap(byteBufferSlice);
                }
                byte[] bArr = new byte[rawVarint32];
                long j4 = rawVarint32;
                g9.copyMemory(this.pos, bArr, 0L, j4);
                this.pos += j4;
                return C.wrap(bArr);
            }
            if (rawVarint32 == 0) {
                return C.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSInt32() throws IOException {
            return AbstractC1923o.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSInt64() throws IOException {
            return AbstractC1923o.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                long j2 = rawVarint32;
                g9.copyMemory(this.pos, bArr, 0L, j2);
                String str = new String(bArr, nKK.UTF_8);
                this.pos += j2;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = L0y.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (CM.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        @Deprecated
        public void readUnknownGroup(int i2, yg.j jVar) throws IOException {
            readGroup(i2, jVar, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readGroup(int i2, KH kh, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
            return t3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                C bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = CM.makeTag(CM.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readMessage(KH kh, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.o$Ml */
    private static final class Ml extends AbstractC1923o {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private j refillCallback;
        private int totalBytesRetired;

        /* JADX INFO: renamed from: com.google.protobuf.o$Ml$j */
        private interface j {
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.buffer;
                int i3 = this.pos;
                this.pos = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void enableAliasing(boolean z2) {
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readGroup(int i2, yg.j jVar, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readMessage(yg.j jVar, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(CM.makeTag(CM.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        private Ml(InputStream inputStream, int i2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            nKK.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i2];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i2) throws IOException {
            if (i2 == 0) {
                return nKK.EMPTY_BYTE_ARRAY;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i3 = this.totalBytesRetired;
            int i5 = this.pos;
            int i7 = i3 + i5 + i2;
            if (i7 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i8 = this.currentLimit;
            if (i7 > i8) {
                skipRawBytes((i8 - i3) - i5);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i9 = this.bufferSize - i5;
            int i10 = i2 - i9;
            if (i10 >= 4096 && i10 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i9);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i9 < i2) {
                int i11 = read(this.input, bArr, i9, i2 - i9);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i11;
                i9 += i11;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int iMin = Math.min(i2, 4096);
                byte[] bArr = new byte[iMin];
                int i3 = 0;
                while (i3 < iMin) {
                    int i5 = this.input.read(bArr, i3, iMin - i3);
                    if (i5 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i5;
                    i3 += i5;
                }
                i2 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i2;
            int i3 = this.totalBytesRetired + i2;
            int i5 = this.currentLimit;
            if (i3 <= i5) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i7 = i3 - i5;
            this.bufferSizeAfterLimit = i7;
            this.bufferSize = i2 - i7;
        }

        private void skipRawBytesSlowPath(int i2) throws IOException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i3 = this.totalBytesRetired;
            int i5 = this.pos;
            int i7 = i3 + i5 + i2;
            int i8 = this.currentLimit;
            if (i7 > i8) {
                skipRawBytes((i8 - i3) - i5);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.totalBytesRetired = i3 + i5;
            int i9 = this.bufferSize - i5;
            this.bufferSize = 0;
            this.pos = 0;
            while (i9 < i2) {
                try {
                    long j2 = i2 - i9;
                    long jSkip = skip(this.input, j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i9 += (int) jSkip;
                    }
                } finally {
                    this.totalBytesRetired += i9;
                    recomputeBufferSizeAfterLimit();
                }
            }
            if (i9 >= i2) {
                return;
            }
            int i10 = this.bufferSize;
            int i11 = i10 - this.pos;
            this.pos = i10;
            refillBuffer(1);
            while (true) {
                int i12 = i2 - i11;
                int i13 = this.bufferSize;
                if (i12 <= i13) {
                    this.pos = i12;
                    return;
                } else {
                    i11 += i13;
                    this.pos = i13;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private boolean tryRefillBuffer(int i2) throws IOException {
            int i3 = this.pos;
            int i5 = i3 + i2;
            int i7 = this.bufferSize;
            if (i5 <= i7) {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
            int i8 = this.sizeLimit;
            int i9 = this.totalBytesRetired;
            if (i2 > (i8 - i9) - i3 || i9 + i3 + i2 > this.currentLimit) {
                return false;
            }
            if (i3 > 0) {
                if (i7 > i3) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
                }
                this.totalBytesRetired += i3;
                this.bufferSize -= i3;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i10 = this.bufferSize;
            int i11 = read(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.sizeLimit - this.totalBytesRetired) - i10));
            if (i11 == 0 || i11 < -1 || i11 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i11 + "\nThe InputStream implementation is buggy.");
            }
            if (i11 <= 0) {
                return false;
            }
            this.bufferSize += i11;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i2) {
                return true;
            }
            return tryRefillBuffer(i2);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i3 = i2 + this.totalBytesRetired + this.pos;
            int i5 = this.currentLimit;
            if (i3 > i5) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i3;
            recomputeBufferSizeAfterLimit();
            return i5;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readRawBytes(int i2) throws IOException {
            int i3 = this.pos;
            if (i2 > this.bufferSize - i3 || i2 <= 0) {
                return readRawBytesSlowPath(i2, false);
            }
            int i5 = i2 + i3;
            this.pos = i5;
            return Arrays.copyOfRange(this.buffer, i3, i5);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawLittleEndian32() throws IOException {
            int i2 = this.pos;
            if (this.bufferSize - i2 < 4) {
                refillBuffer(4);
                i2 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawLittleEndian64() throws IOException {
            int i2 = this.pos;
            if (this.bufferSize - i2 < 8) {
                refillBuffer(8);
                i2 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawVarint32() throws IOException {
            int i2;
            int i3 = this.pos;
            int i5 = this.bufferSize;
            if (i5 != i3) {
                byte[] bArr = this.buffer;
                int i7 = i3 + 1;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.pos = i7;
                    return b2;
                }
                if (i5 - i7 >= 9) {
                    int i8 = i3 + 2;
                    int i9 = (bArr[i7] << 7) ^ b2;
                    if (i9 < 0) {
                        i2 = i9 ^ (-128);
                    } else {
                        int i10 = i3 + 3;
                        int i11 = (bArr[i8] << 14) ^ i9;
                        if (i11 >= 0) {
                            i2 = i11 ^ 16256;
                        } else {
                            int i12 = i3 + 4;
                            int i13 = i11 ^ (bArr[i10] << 21);
                            if (i13 < 0) {
                                i2 = (-2080896) ^ i13;
                            } else {
                                i10 = i3 + 5;
                                byte b4 = bArr[i12];
                                int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i12 = i3 + 6;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 7;
                                        if (bArr[i12] < 0) {
                                            i12 = i3 + 8;
                                            if (bArr[i10] < 0) {
                                                i10 = i3 + 9;
                                                if (bArr[i12] < 0) {
                                                    int i15 = i3 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i8 = i15;
                                                        i2 = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i14;
                                }
                                i2 = i14;
                            }
                            i8 = i12;
                        }
                        i8 = i10;
                    }
                    this.pos = i8;
                    return i2;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i5 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.pos = i5;
                    return b2;
                }
                if (i3 - i5 >= 9) {
                    int i7 = i2 + 2;
                    int i8 = (bArr[i5] << 7) ^ b2;
                    if (i8 < 0) {
                        j2 = i8 ^ (-128);
                    } else {
                        int i9 = i2 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            j2 = i10 ^ 16256;
                            i7 = i9;
                        } else {
                            int i11 = i2 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                long j5 = (-2080896) ^ i12;
                                i7 = i11;
                                j2 = j5;
                            } else {
                                long j6 = i12;
                                i7 = i2 + 5;
                                long j7 = j6 ^ (((long) bArr[i11]) << 28);
                                if (j7 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i13 = i2 + 6;
                                    long j9 = j7 ^ (((long) bArr[i7]) << 35);
                                    if (j9 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i2 + 7;
                                        j7 = j9 ^ (((long) bArr[i13]) << 42);
                                        if (j7 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i13 = i2 + 8;
                                            j9 = j7 ^ (((long) bArr[i7]) << 49);
                                            if (j9 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i2 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i14 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i14;
                                                    }
                                                }
                                                j2 = j10;
                                            }
                                        }
                                    }
                                    j2 = j9 ^ j3;
                                    i7 = i13;
                                }
                                j2 = j7 ^ j4;
                            }
                        }
                    }
                    this.pos = i7;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 |= ((long) (rawByte & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((rawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void skipRawBytes(int i2) throws IOException {
            int i3 = this.bufferSize;
            int i5 = this.pos;
            if (i2 > i3 - i5 || i2 < 0) {
                skipRawBytesSlowPath(i2);
            } else {
                this.pos = i5 + i2;
            }
        }

        private static int available(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
            try {
                return inputStream.read(bArr, i2, i3);
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }

        private C readBytesSlowPath(int i2) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i2);
            if (rawBytesSlowPathOneChunk != null) {
                return C.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i3 = this.pos;
            int i5 = this.bufferSize;
            int length = i5 - i3;
            this.totalBytesRetired += i5;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, i3, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return C.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i2, boolean z2) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i2);
            if (rawBytesSlowPathOneChunk != null) {
                if (z2) {
                    return (byte[]) rawBytesSlowPathOneChunk.clone();
                }
                return rawBytesSlowPathOneChunk;
            }
            int i3 = this.pos;
            int i5 = this.bufferSize;
            int length = i5 - i3;
            this.totalBytesRetired += i5;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, i3, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private void refillBuffer(int i2) throws IOException {
            if (!tryRefillBuffer(i2)) {
                if (i2 > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private static long skip(InputStream inputStream, long j2) throws IOException {
            try {
                return inputStream.skip(j2);
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32);
                this.pos += rawVarint32;
                return bArrCopyOfRange;
            }
            if (rawVarint32 >= 0) {
                return readRawBytesSlowPath(rawVarint32, false);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return nKK.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public C readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
                C cCopyFrom = C.copyFrom(this.buffer, i3, rawVarint32);
                this.pos += rawVarint32;
                return cCopyFrom;
            }
            if (rawVarint32 == 0) {
                return C.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSInt32() throws IOException {
            return AbstractC1923o.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSInt64() throws IOException {
            return AbstractC1923o.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.bufferSize;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    String str = new String(this.buffer, i3, rawVarint32, nKK.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 >= 0) {
                if (rawVarint32 <= this.bufferSize) {
                    refillBuffer(rawVarint32);
                    String str2 = new String(this.buffer, this.pos, rawVarint32, nKK.UTF_8);
                    this.pos += rawVarint32;
                    return str2;
                }
                return new String(readRawBytesSlowPath(rawVarint32, false), nKK.UTF_8);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (rawVarint32 <= i3 - i2 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i2 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 >= 0) {
                    i2 = 0;
                    if (rawVarint32 <= i3) {
                        refillBuffer(rawVarint32);
                        rawBytesSlowPath = this.buffer;
                        this.pos = rawVarint32;
                    } else {
                        rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                    }
                } else {
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }
            return L0y.decodeUtf8(rawBytesSlowPath, i2, rawVarint32);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (CM.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        @Deprecated
        public void readUnknownGroup(int i2, yg.j jVar) throws IOException {
            readGroup(i2, jVar, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readGroup(int i2, KH kh, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
            return t3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                C bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = CM.makeTag(CM.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readMessage(KH kh, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.o$n */
    private static final class n extends AbstractC1923o {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void skipRawVarintFastPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.buffer;
                int i3 = this.pos;
                this.pos = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readGroup(int i2, yg.j jVar, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readMessage(yg.j jVar, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(CM.makeTag(CM.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        private n(byte[] bArr, int i2, int i3, boolean z2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i3 + i2;
            this.pos = i2;
            this.startPos = i2;
            this.immutable = z2;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i2;
            int i3 = i2 - this.startPos;
            int i5 = this.currentLimit;
            if (i3 <= i5) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i7 = i3 - i5;
            this.bufferSizeAfterLimit = i7;
            this.limit = i2 - i7;
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void enableAliasing(boolean z2) {
            this.enableAliasing = z2;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i2 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i3 = this.currentLimit;
            if (totalBytesRead > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte readRawByte() throws IOException {
            int i2 = this.pos;
            if (i2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readRawBytes(int i2) throws IOException {
            if (i2 > 0) {
                int i3 = this.limit;
                int i5 = this.pos;
                if (i2 <= i3 - i5) {
                    int i7 = i2 + i5;
                    this.pos = i7;
                    return Arrays.copyOfRange(this.buffer, i5, i7);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 == 0) {
                return nKK.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawLittleEndian32() throws IOException {
            int i2 = this.pos;
            if (this.limit - i2 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawLittleEndian64() throws IOException {
            int i2 = this.pos;
            if (this.limit - i2 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawVarint32() throws IOException {
            int i2;
            int i3 = this.pos;
            int i5 = this.limit;
            if (i5 != i3) {
                byte[] bArr = this.buffer;
                int i7 = i3 + 1;
                byte b2 = bArr[i3];
                if (b2 >= 0) {
                    this.pos = i7;
                    return b2;
                }
                if (i5 - i7 >= 9) {
                    int i8 = i3 + 2;
                    int i9 = (bArr[i7] << 7) ^ b2;
                    if (i9 < 0) {
                        i2 = i9 ^ (-128);
                    } else {
                        int i10 = i3 + 3;
                        int i11 = (bArr[i8] << 14) ^ i9;
                        if (i11 >= 0) {
                            i2 = i11 ^ 16256;
                        } else {
                            int i12 = i3 + 4;
                            int i13 = i11 ^ (bArr[i10] << 21);
                            if (i13 < 0) {
                                i2 = (-2080896) ^ i13;
                            } else {
                                i10 = i3 + 5;
                                byte b4 = bArr[i12];
                                int i14 = (i13 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i12 = i3 + 6;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 7;
                                        if (bArr[i12] < 0) {
                                            i12 = i3 + 8;
                                            if (bArr[i10] < 0) {
                                                i10 = i3 + 9;
                                                if (bArr[i12] < 0) {
                                                    int i15 = i3 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i8 = i15;
                                                        i2 = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i14;
                                }
                                i2 = i14;
                            }
                            i8 = i12;
                        }
                        i8 = i10;
                    }
                    this.pos = i8;
                    return i2;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i5 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.pos = i5;
                    return b2;
                }
                if (i3 - i5 >= 9) {
                    int i7 = i2 + 2;
                    int i8 = (bArr[i5] << 7) ^ b2;
                    if (i8 < 0) {
                        j2 = i8 ^ (-128);
                    } else {
                        int i9 = i2 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            j2 = i10 ^ 16256;
                            i7 = i9;
                        } else {
                            int i11 = i2 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                long j5 = (-2080896) ^ i12;
                                i7 = i11;
                                j2 = j5;
                            } else {
                                long j6 = i12;
                                i7 = i2 + 5;
                                long j7 = j6 ^ (((long) bArr[i11]) << 28);
                                if (j7 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i13 = i2 + 6;
                                    long j9 = j7 ^ (((long) bArr[i7]) << 35);
                                    if (j9 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i7 = i2 + 7;
                                        j7 = j9 ^ (((long) bArr[i13]) << 42);
                                        if (j7 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i13 = i2 + 8;
                                            j9 = j7 ^ (((long) bArr[i7]) << 49);
                                            if (j9 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i7 = i2 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i14 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i14;
                                                    }
                                                }
                                                j2 = j10;
                                            }
                                        }
                                    }
                                    j2 = j9 ^ j3;
                                    i7 = i13;
                                }
                                j2 = j7 ^ j4;
                            }
                        }
                    }
                    this.pos = i7;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 |= ((long) (rawByte & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((rawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void skipRawBytes(int i2) throws IOException {
            if (i2 >= 0) {
                int i3 = this.limit;
                int i5 = this.pos;
                if (i2 <= i3 - i5) {
                    this.pos = i5 + i2;
                    return;
                }
            }
            if (i2 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public ByteBuffer readByteBuffer() throws IOException {
            ByteBuffer byteBufferWrap;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    if (!this.immutable && this.enableAliasing) {
                        byteBufferWrap = ByteBuffer.wrap(this.buffer, i3, rawVarint32).slice();
                    } else {
                        byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32));
                    }
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return nKK.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public C readBytes() throws IOException {
            C cCopyFrom;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    if (this.immutable && this.enableAliasing) {
                        cCopyFrom = C.wrap(this.buffer, i3, rawVarint32);
                    } else {
                        cCopyFrom = C.copyFrom(this.buffer, i3, rawVarint32);
                    }
                    this.pos += rawVarint32;
                    return cCopyFrom;
                }
            }
            if (rawVarint32 == 0) {
                return C.EMPTY;
            }
            return C.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.AbstractC1923o
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSInt32() throws IOException {
            return AbstractC1923o.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSInt64() throws IOException {
            return AbstractC1923o.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    String str = new String(this.buffer, i3, rawVarint32, nKK.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    String strDecodeUtf8 = L0y.decodeUtf8(this.buffer, i3, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (CM.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        @Deprecated
        public void readUnknownGroup(int i2, yg.j jVar) throws IOException {
            readGroup(i2, jVar, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readGroup(int i2, KH kh, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
            return t3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                C bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = CM.makeTag(CM.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readMessage(KH kh, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.o$w6 */
    private static final class w6 extends AbstractC1923o {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private void skipRawVarint() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readGroup(int i2, yg.j jVar, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void readMessage(yg.j jVar, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            jVar.mergeFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(CM.makeTag(CM.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        private w6(Iterable<ByteBuffer> iterable, int i2, boolean z2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i2;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z2;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i2 != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = nKK.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bArr, int i2, int i3) throws IOException {
            if (i3 < 0 || i3 > remaining()) {
                if (i3 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i3 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i5 = i3;
            while (i5 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i5, (int) currentRemaining());
                long j2 = iMin;
                g9.copyMemory(this.currentByteBufferPos, bArr, (i3 - i5) + i2, j2);
                i5 -= iMin;
                this.currentByteBufferPos += j2;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i2;
            int i3 = i2 - this.startOffset;
            int i5 = this.currentLimit;
            if (i3 <= i5) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i7 = i3 - i5;
            this.bufferSizeAfterCurrentLimit = i7;
            this.totalBufferSize = i2 - i7;
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private ByteBuffer slice(int i2, int i3) throws IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i2);
                    byteBuffer.limit(i3);
                    return this.currentByteBuffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = g9.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void enableAliasing(boolean z2) {
            this.enableAliasing = z2;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean isAtEnd() throws IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i2 + getTotalBytesRead();
            int i3 = this.currentLimit;
            if (totalBytesRead > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readRawBytes(int i2) throws IOException {
            if (i2 >= 0) {
                long j2 = i2;
                if (j2 <= currentRemaining()) {
                    byte[] bArr = new byte[i2];
                    g9.copyMemory(this.currentByteBufferPos, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return bArr;
                }
            }
            if (i2 >= 0 && i2 <= remaining()) {
                byte[] bArr2 = new byte[i2];
                readRawBytesTo(bArr2, 0, i2);
                return bArr2;
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 == 0) {
                return nKK.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawLittleEndian64() throws IOException {
            char c2;
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j2 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j2;
                c2 = '8';
                rawByte = (((long) g9.getByte(j2)) & 255) | ((((long) g9.getByte(1 + j2)) & 255) << 8) | ((((long) g9.getByte(2 + j2)) & 255) << 16) | ((((long) g9.getByte(3 + j2)) & 255) << 24) | ((((long) g9.getByte(4 + j2)) & 255) << 32) | ((((long) g9.getByte(5 + j2)) & 255) << 40) | ((((long) g9.getByte(6 + j2)) & 255) << 48);
                rawByte2 = g9.getByte(j2 + 7);
            } else {
                c2 = '8';
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return rawByte | ((((long) rawByte2) & 255) << c2);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawVarint32() throws IOException {
            int i2;
            long j2 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j2) {
                long j3 = j2 + 1;
                byte b2 = g9.getByte(j2);
                if (b2 >= 0) {
                    this.currentByteBufferPos++;
                    return b2;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j4 = 2 + j2;
                    int i3 = (g9.getByte(j3) << 7) ^ b2;
                    if (i3 < 0) {
                        i2 = i3 ^ (-128);
                    } else {
                        long j5 = 3 + j2;
                        int i5 = (g9.getByte(j4) << 14) ^ i3;
                        if (i5 >= 0) {
                            i2 = i5 ^ 16256;
                        } else {
                            long j6 = 4 + j2;
                            int i7 = i5 ^ (g9.getByte(j5) << 21);
                            if (i7 < 0) {
                                i2 = (-2080896) ^ i7;
                            } else {
                                j5 = 5 + j2;
                                byte b4 = g9.getByte(j6);
                                int i8 = (i7 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    j6 = 6 + j2;
                                    if (g9.getByte(j5) < 0) {
                                        j5 = 7 + j2;
                                        if (g9.getByte(j6) < 0) {
                                            j6 = 8 + j2;
                                            if (g9.getByte(j5) < 0) {
                                                j5 = 9 + j2;
                                                if (g9.getByte(j6) < 0) {
                                                    long j7 = j2 + 10;
                                                    if (g9.getByte(j5) >= 0) {
                                                        i2 = i8;
                                                        j4 = j7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i2 = i8;
                                }
                                i2 = i8;
                            }
                            j4 = j6;
                        }
                        j4 = j5;
                    }
                    this.currentByteBufferPos = j4;
                    return i2;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            long j5 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j5) {
                long j6 = j5 + 1;
                byte b2 = g9.getByte(j5);
                if (b2 >= 0) {
                    this.currentByteBufferPos++;
                    return b2;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j7 = 2 + j5;
                    int i2 = (g9.getByte(j6) << 7) ^ b2;
                    if (i2 < 0) {
                        j2 = i2 ^ (-128);
                    } else {
                        long j9 = 3 + j5;
                        int i3 = (g9.getByte(j7) << 14) ^ i2;
                        if (i3 >= 0) {
                            j2 = i3 ^ 16256;
                            j7 = j9;
                        } else {
                            long j10 = 4 + j5;
                            int i5 = i3 ^ (g9.getByte(j9) << 21);
                            if (i5 < 0) {
                                j2 = (-2080896) ^ i5;
                                j7 = j10;
                            } else {
                                long j11 = 5 + j5;
                                long j12 = (((long) g9.getByte(j10)) << 28) ^ ((long) i5);
                                if (j12 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j13 = 6 + j5;
                                    long j14 = j12 ^ (((long) g9.getByte(j11)) << 35);
                                    if (j14 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j11 = 7 + j5;
                                        j12 = j14 ^ (((long) g9.getByte(j13)) << 42);
                                        if (j12 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j13 = 8 + j5;
                                            j14 = j12 ^ (((long) g9.getByte(j11)) << 49);
                                            if (j14 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                j11 = 9 + j5;
                                                long j15 = (j14 ^ (((long) g9.getByte(j13)) << 56)) ^ 71499008037633920L;
                                                if (j15 < 0) {
                                                    long j16 = j5 + 10;
                                                    if (g9.getByte(j11) >= 0) {
                                                        j7 = j16;
                                                        j2 = j15;
                                                    }
                                                } else {
                                                    j2 = j15;
                                                    j7 = j11;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j14;
                                    j7 = j13;
                                }
                                j2 = j4 ^ j12;
                                j7 = j11;
                            }
                        }
                    }
                    this.currentByteBufferPos = j7;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.AbstractC1923o
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 |= ((long) (rawByte & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((rawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public void skipRawBytes(int i2) throws IOException {
            if (i2 < 0 || i2 > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i2 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i2 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i2, (int) currentRemaining());
                i2 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                if (j2 <= currentRemaining()) {
                    if (!this.immutable && this.enableAliasing) {
                        long j3 = this.currentByteBufferPos + j2;
                        this.currentByteBufferPos = j3;
                        long j4 = this.currentAddress;
                        return slice((int) ((j3 - j4) - j2), (int) (j3 - j4));
                    }
                    byte[] bArr = new byte[rawVarint32];
                    g9.copyMemory(this.currentByteBufferPos, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return nKK.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public C readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                long j3 = this.currentByteBufferLimit;
                long j4 = this.currentByteBufferPos;
                if (j2 <= j3 - j4) {
                    if (this.immutable && this.enableAliasing) {
                        int i2 = (int) (j4 - this.currentAddress);
                        C cWrap = C.wrap(slice(i2, rawVarint32 + i2));
                        this.currentByteBufferPos += j2;
                        return cWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    g9.copyMemory(j4, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return C.wrap(bArr);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                if (this.immutable && this.enableAliasing) {
                    ArrayList arrayList = new ArrayList();
                    while (rawVarint32 > 0) {
                        if (currentRemaining() == 0) {
                            getNextByteBuffer();
                        }
                        int iMin = Math.min(rawVarint32, (int) currentRemaining());
                        int i3 = (int) (this.currentByteBufferPos - this.currentAddress);
                        arrayList.add(C.wrap(slice(i3, i3 + iMin)));
                        rawVarint32 -= iMin;
                        this.currentByteBufferPos += (long) iMin;
                    }
                    return C.copyFrom(arrayList);
                }
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return C.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return C.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j2 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j2;
            return g9.getByte(j2);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() >= 4) {
                long j2 = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j2;
                return ((g9.getByte(j2 + 3) & UByte.MAX_VALUE) << 24) | (g9.getByte(j2) & UByte.MAX_VALUE) | ((g9.getByte(1 + j2) & UByte.MAX_VALUE) << 8) | ((g9.getByte(2 + j2) & UByte.MAX_VALUE) << 16);
            }
            return (readRawByte() & UByte.MAX_VALUE) | ((readRawByte() & UByte.MAX_VALUE) << 8) | ((readRawByte() & UByte.MAX_VALUE) << 16) | ((readRawByte() & UByte.MAX_VALUE) << 24);
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readSInt32() throws IOException {
            return AbstractC1923o.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readSInt64() throws IOException {
            return AbstractC1923o.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                long j3 = this.currentByteBufferLimit;
                long j4 = this.currentByteBufferPos;
                if (j2 <= j3 - j4) {
                    byte[] bArr = new byte[rawVarint32];
                    g9.copyMemory(j4, bArr, 0L, j2);
                    String str = new String(bArr, nKK.UTF_8);
                    this.currentByteBufferPos += j2;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, nKK.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                long j3 = this.currentByteBufferLimit;
                long j4 = this.currentByteBufferPos;
                if (j2 <= j3 - j4) {
                    String strDecodeUtf8 = L0y.decodeUtf8(this.currentByteBuffer, (int) (j4 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j2;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return L0y.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (CM.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.AbstractC1923o
        @Deprecated
        public void readUnknownGroup(int i2, yg.j jVar) throws IOException {
            readGroup(i2, jVar, QJ.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readGroup(int i2, KH kh, QJ qj) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(CM.makeTag(i2, 4));
            this.recursionDepth--;
            return t3;
        }

        @Override // com.google.protobuf.AbstractC1923o
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = CM.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                C bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = CM.makeTag(CM.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.AbstractC1923o
        public <T extends yg> T readMessage(KH kh, QJ qj) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t3 = (T) kh.parsePartialFrom(this, qj);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static AbstractC1923o newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i5 = 7;
        while (i5 < 32) {
            int i7 = inputStream.read();
            if (i7 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i3 |= (i7 & 127) << i5;
            if ((i7 & 128) == 0) {
                return i3;
            }
            i5 += 7;
        }
        while (i5 < 64) {
            int i8 = inputStream.read();
            if (i8 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i8 & 128) == 0) {
                return i3;
            }
            i5 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i2) throws InvalidProtocolBufferException;

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z2);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i2);

    public abstract int pushLimit(int i2) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract C readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends yg> T readGroup(int i2, KH kh, QJ qj) throws IOException;

    public abstract void readGroup(int i2, yg.j jVar, QJ qj) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends yg> T readMessage(KH kh, QJ qj) throws IOException;

    public abstract void readMessage(yg.j jVar, QJ qj) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i2) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i2, yg.j jVar) throws IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i2) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException;

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(tag));
    }

    public abstract void skipRawBytes(int i2) throws IOException;

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private AbstractC1923o() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static AbstractC1923o newInstance(InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? newInstance(nKK.EMPTY_BYTE_ARRAY) : new Ml(inputStream, i2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public final int setRecursionLimit(int i2) {
        if (i2 >= 0) {
            int i3 = this.recursionLimit;
            this.recursionLimit = i2;
            return i3;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i2);
    }

    public final int setSizeLimit(int i2) {
        if (i2 >= 0) {
            int i3 = this.sizeLimit;
            this.sizeLimit = i2;
            return i3;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i2);
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public static AbstractC1923o newInstance(Iterable<ByteBuffer> iterable) {
        if (!I28.isSupported()) {
            return newInstance(new u(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return readRawVarint32(i2, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(tag, codedOutputStream));
    }

    static AbstractC1923o newInstance(Iterable<ByteBuffer> iterable, boolean z2) {
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i2 |= 1;
            } else {
                i2 = byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
            }
        }
        if (i2 == 2) {
            return new w6(iterable, iRemaining, z2);
        }
        return newInstance(new u(iterable));
    }

    public static AbstractC1923o newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static AbstractC1923o newInstance(byte[] bArr, int i2, int i3) {
        return newInstance(bArr, i2, i3, false);
    }

    static AbstractC1923o newInstance(byte[] bArr, int i2, int i3, boolean z2) {
        n nVar = new n(bArr, i2, i3, z2);
        try {
            nVar.pushLimit(i3);
            return nVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static AbstractC1923o newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static AbstractC1923o newInstance(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z2);
        }
        if (byteBuffer.isDirect() && I28.isSupported()) {
            return new I28(byteBuffer, z2);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
