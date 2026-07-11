package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ParsableByteArray {
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i2) {
        readBytes(parsableBitArray.data, 0, i2);
        parsableBitArray.setPosition(0);
    }

    public String readNullTerminatedString(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.position;
        int i5 = (i3 + i2) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i3, (i5 >= this.limit || this.data[i5] != 0) ? i2 : i2 - 1);
        this.position += i2;
        return strFromUtf8Bytes;
    }

    public String readString(int i2) {
        return readString(i2, t1.I28.f73396t);
    }

    public void reset(int i2) {
        reset(capacity() < i2 ? new byte[i2] : this.data, i2);
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i2 = this.position;
        return (char) ((bArr[i2 + 1] & UByte.MAX_VALUE) | ((bArr[i2] & UByte.MAX_VALUE) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & UByte.MAX_VALUE;
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 24;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 16) | i5;
        int i9 = i2 + 3;
        this.position = i9;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 8);
        this.position = i2 + 4;
        return (bArr[i9] & UByte.MAX_VALUE) | i10;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = ((bArr[i2] & UByte.MAX_VALUE) << 24) >> 8;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | i8;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        int i9 = i2 + 3;
        this.position = i9;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 16);
        this.position = i2 + 4;
        return ((bArr[i9] & UByte.MAX_VALUE) << 24) | i10;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return ((bArr[i7] & UByte.MAX_VALUE) << 16) | i8;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 16);
        int i8 = i2 + 4;
        this.position = i8;
        long j5 = j4 | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i2 + 5;
        this.position = i9;
        long j6 = j5 | ((((long) bArr[i8]) & 255) << 32);
        int i10 = i2 + 6;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i9]) & 255) << 40);
        int i11 = i2 + 7;
        this.position = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 48);
        this.position = i2 + 8;
        return ((((long) bArr[i11]) & 255) << 56) | j9;
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.position = i2 + 2;
        return (short) (((bArr[i3] & UByte.MAX_VALUE) << 8) | i5);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 16);
        this.position = i2 + 4;
        return ((((long) bArr[i7]) & 255) << 24) | j4;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return ((bArr[i7] & UByte.MAX_VALUE) << 16) | i8;
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.position = i2 + 2;
        return ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 48);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 40);
        int i8 = i2 + 4;
        this.position = i8;
        long j5 = j4 | ((((long) bArr[i7]) & 255) << 32);
        int i9 = i2 + 5;
        this.position = i9;
        long j6 = j5 | ((((long) bArr[i8]) & 255) << 24);
        int i10 = i2 + 6;
        this.position = i10;
        long j7 = j6 | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i2 + 7;
        this.position = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 8);
        this.position = i2 + 8;
        return (((long) bArr[i11]) & 255) | j9;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.position = i2 + 2;
        return (short) ((bArr[i3] & UByte.MAX_VALUE) | i5);
    }

    public String readString(int i2, Charset charset) {
        String str = new String(this.data, this.position, i2, charset);
        this.position += i2;
        return str;
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i2 = this.position;
        this.position = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.position = i2 + 2;
        int i7 = (bArr[i3] & UByte.MAX_VALUE) | i5;
        this.position = i2 + 4;
        return i7;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = (((long) bArr[i2]) & 255) << 24;
        int i5 = i2 + 2;
        this.position = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i7 = i2 + 3;
        this.position = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 8);
        this.position = i2 + 4;
        return (((long) bArr[i7]) & 255) | j4;
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 16;
        int i7 = i2 + 2;
        this.position = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.position = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | i8;
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.position = i2 + 2;
        return (bArr[i3] & UByte.MAX_VALUE) | i5;
    }

    public long readUtf8EncodedLong() {
        int i2;
        int i3;
        long j2 = this.data[this.position];
        int i5 = 7;
        while (true) {
            if (i5 < 0) {
                break;
            }
            int i7 = 1 << i5;
            if ((((long) i7) & j2) != 0) {
                i5--;
            } else if (i5 < 6) {
                j2 &= (long) (i7 - 1);
                i3 = 7 - i5;
            } else if (i5 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j2);
        }
        for (i2 = 1; i2 < i3; i2++) {
            byte b2 = this.data[this.position + i2];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j2);
            }
            j2 = (j2 << 6) | ((long) (b2 & 63));
        }
        this.position += i3;
        return j2;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setLimit(int i2) {
        Assertions.checkArgument(i2 >= 0 && i2 <= this.data.length);
        this.limit = i2;
    }

    public void setPosition(int i2) {
        Assertions.checkArgument(i2 >= 0 && i2 <= this.limit);
        this.position = i2;
    }

    public void skipBytes(int i2) {
        setPosition(this.position + i2);
    }

    public ParsableByteArray(int i2) {
        this.data = new byte[i2];
        this.limit = i2;
    }

    public void ensureCapacity(int i2) {
        if (i2 > capacity()) {
            this.data = Arrays.copyOf(this.data, i2);
        }
    }

    public void readBytes(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.data, this.position, bArr, i2, i3);
        this.position += i3;
    }

    @Nullable
    public String readDelimiterTerminatedString(char c2) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i2 = this.position;
        while (i2 < this.limit && this.data[i2] != c2) {
            i2++;
        }
        byte[] bArr = this.data;
        int i3 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i3, i2 - i3);
        this.position = i2;
        if (i2 < this.limit) {
            this.position = i2 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String readLine() {
        if (bytesLeft() == 0) {
            return null;
        }
        int i2 = this.position;
        while (i2 < this.limit && !Util.isLinebreak(this.data[i2])) {
            i2++;
        }
        int i3 = this.position;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.data;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.position = i3 + 3;
            }
        }
        byte[] bArr2 = this.data;
        int i5 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr2, i5, i2 - i5);
        this.position = i2;
        int i7 = this.limit;
        if (i2 != i7) {
            byte[] bArr3 = this.data;
            if (bArr3[i2] == 13) {
                int i8 = i2 + 1;
                this.position = i8;
                if (i8 != i7) {
                    int i9 = this.position;
                    if (bArr3[i9] == 10) {
                        this.position = i9 + 1;
                    }
                }
            }
        }
        return strFromUtf8Bytes;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedIntToInt() {
        int i2 = readInt();
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalStateException("Top bit not zero: " + i2);
    }

    public long readUnsignedLongToLong() {
        long j2 = readLong();
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalStateException("Top bit not zero: " + j2);
    }

    public void reset(byte[] bArr, int i2) {
        this.data = bArr;
        this.limit = i2;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i2) {
        byteBuffer.put(this.data, this.position, i2);
        this.position += i2;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr, int i2) {
        this.data = bArr;
        this.limit = i2;
    }
}
