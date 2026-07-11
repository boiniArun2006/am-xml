package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.media3.common.C;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = C.BUFFER_FLAG_NOT_DEPENDED_ON;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    public static int decodeZigZag32(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    public int readRawVarint32() throws IOException {
        int i2;
        int i3 = this.bufferPos;
        int i5 = this.bufferSize;
        if (i5 != i3) {
            byte[] bArr = this.buffer;
            int i7 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.bufferPos = i7;
                return b2;
            }
            if (i5 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b2;
                long j2 = i9;
                if (j2 < 0) {
                    i2 = (int) ((-128) ^ j2);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    long j3 = i11;
                    if (j3 >= 0) {
                        i2 = (int) (16256 ^ j3);
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        long j4 = i13;
                        if (j4 < 0) {
                            i2 = (int) ((-2080896) ^ j4);
                        } else {
                            i10 = i3 + 5;
                            byte b4 = bArr[i12];
                            int i14 = (int) (((long) (i13 ^ (b4 << 28))) ^ 266354560);
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
                this.bufferPos = i8;
                return i2;
            }
        }
        return (int) readRawVarint64SlowPath();
    }

    private void ensureAvailable(int i2) throws IOException {
        if (this.bufferSize - this.bufferPos < i2) {
            refillBuffer(i2);
        }
    }

    static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private byte[] readRawBytesSlowPath(int i2) throws IOException {
        if (i2 <= 0) {
            if (i2 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i3 = this.totalBytesRetired;
        int i5 = this.bufferPos;
        int i7 = i3 + i5 + i2;
        int i8 = this.currentLimit;
        if (i7 > i8) {
            skipRawBytes((i8 - i3) - i5);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 < 4096) {
            byte[] bArr = new byte[i2];
            int i9 = this.bufferSize - i5;
            System.arraycopy(this.buffer, i5, bArr, 0, i9);
            this.bufferPos = this.bufferSize;
            int i10 = i2 - i9;
            ensureAvailable(i10);
            System.arraycopy(this.buffer, 0, bArr, i9, i10);
            this.bufferPos = i10;
            return bArr;
        }
        int i11 = this.bufferSize;
        this.totalBytesRetired = i3 + i11;
        this.bufferPos = 0;
        this.bufferSize = 0;
        int length = i11 - i5;
        int i12 = i2 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i12 > 0) {
            int iMin = Math.min(i12, 4096);
            byte[] bArr2 = new byte[iMin];
            int i13 = 0;
            while (i13 < iMin) {
                InputStream inputStream = this.input;
                int i14 = inputStream == null ? -1 : inputStream.read(bArr2, i13, iMin - i13);
                if (i14 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i14;
                i13 += i14;
            }
            i12 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(this.buffer, i5, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
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
        int i5 = this.bufferPos;
        int i7 = i3 + i5 + i2;
        int i8 = this.currentLimit;
        if (i7 > i8) {
            skipRawBytes((i8 - i3) - i5);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i9 = this.bufferSize;
        int i10 = i9 - i5;
        this.bufferPos = i9;
        refillBuffer(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.bufferSize;
            if (i11 <= i12) {
                this.bufferPos = i11;
                return;
            } else {
                i10 += i12;
                this.bufferPos = i12;
                refillBuffer(1);
            }
        }
    }

    private boolean tryRefillBuffer(int i2) throws IOException {
        int i3 = this.bufferPos;
        if (i3 + i2 <= this.bufferSize) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.totalBytesRetired + i3 + i2 > this.currentLimit) {
            return false;
        }
        RefillCallback refillCallback = this.refillCallback;
        if (refillCallback != null) {
            refillCallback.onRefill();
        }
        if (this.input != null) {
            int i5 = this.bufferPos;
            if (i5 > 0) {
                int i7 = this.bufferSize;
                if (i7 > i5) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
                }
                this.totalBytesRetired += i5;
                this.bufferSize -= i5;
                this.bufferPos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i8 = this.bufferSize;
            int i9 = inputStream.read(bArr2, i8, bArr2.length - i8);
            if (i9 == 0 || i9 < -1 || i9 > this.buffer.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i9);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i9 > 0) {
                this.bufferSize += i9;
                if ((this.totalBytesRetired + i2) - this.sizeLimit > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i2) {
                    return true;
                }
                return tryRefillBuffer(i2);
            }
        }
        return false;
    }

    public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
        if (this.lastTag != i2) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i2 = this.currentLimit;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i2) {
        this.currentLimit = i2;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i2) throws InvalidProtocolBufferException {
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i3 = i2 + this.totalBytesRetired + this.bufferPos;
        int i5 = this.currentLimit;
        if (i3 > i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.currentLimit = i3;
        recomputeBufferSizeAfterLimit();
        return i5;
    }

    public void readGroup(int i2, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i3 = this.recursionDepth;
        if (i3 >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i3 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i2, 4));
        this.recursionDepth--;
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.bufferPos;
        this.bufferPos = i2 + 1;
        return bArr[i2];
    }

    public int readRawLittleEndian32() throws IOException {
        int i2 = this.bufferPos;
        if (this.bufferSize - i2 < 4) {
            refillBuffer(4);
            i2 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i2 + 4;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i2 = this.bufferPos;
        if (this.bufferSize - i2 < 8) {
            refillBuffer(8);
            i2 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public long readRawVarint64() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.bufferPos;
        int i3 = this.bufferSize;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.bufferPos = i5;
                return b2;
            }
            if (i3 - i5 >= 9) {
                int i7 = i2 + 2;
                long j5 = (bArr[i5] << 7) ^ b2;
                if (j5 >= 0) {
                    int i8 = i2 + 3;
                    long j6 = j5 ^ ((long) (bArr[i7] << 14));
                    if (j6 >= 0) {
                        j4 = 16256;
                    } else {
                        i7 = i2 + 4;
                        j5 = j6 ^ ((long) (bArr[i8] << 21));
                        if (j5 < 0) {
                            j3 = -2080896;
                        } else {
                            i8 = i2 + 5;
                            j6 = j5 ^ (((long) bArr[i7]) << 28);
                            if (j6 >= 0) {
                                j4 = 266354560;
                            } else {
                                i7 = i2 + 6;
                                j5 = j6 ^ (((long) bArr[i8]) << 35);
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i8 = i2 + 7;
                                    j6 = j5 ^ (((long) bArr[i7]) << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i7 = i2 + 8;
                                        j5 = j6 ^ (((long) bArr[i8]) << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i8 = i2 + 9;
                                            long j7 = (j5 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                            if (j7 >= 0) {
                                                j2 = j7;
                                                i7 = i8;
                                                this.bufferPos = i7;
                                                return j2;
                                            }
                                            i7 = i2 + 10;
                                            if (bArr[i8] >= 0) {
                                                j2 = j7;
                                                this.bufferPos = i7;
                                                return j2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j2 = j6 ^ j4;
                    i7 = i8;
                    this.bufferPos = i7;
                    return j2;
                }
                j3 = -128;
                j2 = j5 ^ j3;
                this.bufferPos = i7;
                return j2;
            }
        }
        return readRawVarint64SlowPath();
    }

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

    public void skipRawBytes(int i2) throws IOException {
        int i3 = this.bufferSize;
        int i5 = this.bufferPos;
        if (i2 > i3 - i5 || i2 < 0) {
            skipRawBytesSlowPath(i2);
        } else {
            this.bufferPos = i5 + i2;
        }
    }

    private void refillBuffer(int i2) throws IOException {
        if (tryRefillBuffer(i2)) {
        } else {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public boolean readBool() throws IOException {
        if (readRawVarint64() != 0) {
            return true;
        }
        return false;
    }

    public ByteString readBytes() throws IOException {
        ByteString byteStringCopyFrom;
        int rawVarint32 = readRawVarint32();
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
            if (this.bufferIsImmutable && this.enableAliasing) {
                byteStringCopyFrom = new BoundedByteString(this.buffer, this.bufferPos, rawVarint32);
            } else {
                byteStringCopyFrom = ByteString.copyFrom(this.buffer, i3, rawVarint32);
            }
            this.bufferPos += rawVarint32;
            return byteStringCopyFrom;
        }
        if (rawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        return new LiteralByteString(readRawBytesSlowPath(rawVarint32));
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
            String str = new String(this.buffer, i3, rawVarint32, com.google.android.exoplayer2.C.UTF8_NAME);
            this.bufferPos += rawVarint32;
            return str;
        }
        if (rawVarint32 == 0) {
            return "";
        }
        return new String(readRawBytesSlowPath(rawVarint32), com.google.android.exoplayer2.C.UTF8_NAME);
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] rawBytesSlowPath;
        int rawVarint32 = readRawVarint32();
        int i2 = this.bufferPos;
        if (rawVarint32 <= this.bufferSize - i2 && rawVarint32 > 0) {
            rawBytesSlowPath = this.buffer;
            this.bufferPos = i2 + rawVarint32;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            rawBytesSlowPath = readRawBytesSlowPath(rawVarint32);
            i2 = 0;
        }
        if (Utf8.isValidUtf8(rawBytesSlowPath, i2, i2 + rawVarint32)) {
            return new String(rawBytesSlowPath, i2, rawVarint32, com.google.android.exoplayer2.C.UTF8_NAME);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                int rawLittleEndian32 = readRawLittleEndian32();
                                codedOutputStream.writeRawVarint32(i2);
                                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    codedOutputStream.writeRawVarint32(i2);
                    skipMessage(codedOutputStream);
                    int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4);
                    checkLastTagWas(iMakeTag);
                    codedOutputStream.writeRawVarint32(iMakeTag);
                    return true;
                }
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i2);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        long int64 = readInt64();
        codedOutputStream.writeRawVarint32(i2);
        codedOutputStream.writeUInt64NoTag(int64);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = C.BUFFER_FLAG_NOT_DEPENDED_ON;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
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
}
