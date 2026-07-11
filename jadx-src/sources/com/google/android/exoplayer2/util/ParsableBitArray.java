package com.google.android.exoplayer2.util;

import java.nio.charset.Charset;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    public byte[] data;

    public ParsableBitArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public int readBits(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.bitOffset += i2;
        int i5 = 0;
        while (true) {
            i3 = this.bitOffset;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.bitOffset = i7;
            byte[] bArr = this.data;
            int i8 = this.byteOffset;
            this.byteOffset = i8 + 1;
            i5 |= (bArr[i8] & UByte.MAX_VALUE) << i7;
        }
        byte[] bArr2 = this.data;
        int i9 = this.byteOffset;
        int i10 = ((-1) >>> (32 - i2)) & (i5 | ((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i3)));
        if (i3 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i9 + 1;
        }
        assertValidOffset();
        return i10;
    }

    public String readBytesAsString(int i2) {
        return readBytesAsString(i2, t1.I28.f73396t);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        Assertions.checkState(i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public void byteAlign() {
        if (this.bitOffset == 0) {
            return;
        }
        this.bitOffset = 0;
        this.byteOffset++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Assertions.checkState(this.bitOffset == 0);
        return this.byteOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public void putInt(int i2, int i3) {
        if (i3 < 32) {
            i2 &= (1 << i3) - 1;
        }
        int iMin = Math.min(8 - this.bitOffset, i3);
        int i5 = this.bitOffset;
        int i7 = (8 - i5) - iMin;
        byte[] bArr = this.data;
        int i8 = this.byteOffset;
        byte b2 = (byte) (((65280 >> i5) | ((1 << i7) - 1)) & bArr[i8]);
        bArr[i8] = b2;
        int i9 = i3 - iMin;
        bArr[i8] = (byte) (b2 | ((i2 >>> i9) << i7));
        int i10 = i8 + 1;
        while (i9 > 8) {
            this.data[i10] = (byte) (i2 >>> (i9 - 8));
            i9 -= 8;
            i10++;
        }
        int i11 = 8 - i9;
        byte[] bArr2 = this.data;
        byte b4 = (byte) (bArr2[i10] & ((1 << i11) - 1));
        bArr2[i10] = b4;
        bArr2[i10] = (byte) (((i2 & ((1 << i9) - 1)) << i11) | b4);
        skipBits(i3);
        assertValidOffset();
    }

    public boolean readBit() {
        boolean z2 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z2;
    }

    public long readBitsToLong(int i2) {
        return i2 <= 32 ? Util.toUnsignedLong(readBits(i2)) : Util.toLong(readBits(i2 - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i2, int i3) {
        Assertions.checkState(this.bitOffset == 0);
        System.arraycopy(this.data, this.byteOffset, bArr, i2, i3);
        this.byteOffset += i3;
        assertValidOffset();
    }

    public String readBytesAsString(int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        readBytes(bArr, 0, i2);
        return new String(bArr, charset);
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public void setPosition(int i2) {
        int i3 = i2 / 8;
        this.byteOffset = i3;
        this.bitOffset = i2 - (i3 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i2 = this.bitOffset + 1;
        this.bitOffset = i2;
        if (i2 == 8) {
            this.bitOffset = 0;
            this.byteOffset++;
        }
        assertValidOffset();
    }

    public void skipBits(int i2) {
        int i3 = i2 / 8;
        int i5 = this.byteOffset + i3;
        this.byteOffset = i5;
        int i7 = this.bitOffset + (i2 - (i3 * 8));
        this.bitOffset = i7;
        if (i7 > 7) {
            this.byteOffset = i5 + 1;
            this.bitOffset = i7 - 8;
        }
        assertValidOffset();
    }

    public void skipBytes(int i2) {
        Assertions.checkState(this.bitOffset == 0);
        this.byteOffset += i2;
        assertValidOffset();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i2) {
        this.data = bArr;
        this.byteLimit = i2;
    }

    public void reset(byte[] bArr, int i2) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
        this.byteLimit = i2;
    }

    public void readBits(byte[] bArr, int i2, int i3) {
        int i5 = (i3 >> 3) + i2;
        while (i2 < i5) {
            byte[] bArr2 = this.data;
            int i7 = this.byteOffset;
            int i8 = i7 + 1;
            this.byteOffset = i8;
            byte b2 = bArr2[i7];
            int i9 = this.bitOffset;
            byte b4 = (byte) (b2 << i9);
            bArr[i2] = b4;
            bArr[i2] = (byte) (((255 & bArr2[i8]) >> (8 - i9)) | b4);
            i2++;
        }
        int i10 = i3 & 7;
        if (i10 == 0) {
            return;
        }
        byte b5 = (byte) (bArr[i5] & (255 >> i10));
        bArr[i5] = b5;
        int i11 = this.bitOffset;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.data;
            int i12 = this.byteOffset;
            this.byteOffset = i12 + 1;
            bArr[i5] = (byte) (b5 | ((bArr3[i12] & UByte.MAX_VALUE) << i11));
            this.bitOffset = i11 - 8;
        }
        int i13 = this.bitOffset + i10;
        this.bitOffset = i13;
        byte[] bArr4 = this.data;
        int i14 = this.byteOffset;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | bArr[i5]);
        if (i13 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i14 + 1;
        }
        assertValidOffset();
    }
}
