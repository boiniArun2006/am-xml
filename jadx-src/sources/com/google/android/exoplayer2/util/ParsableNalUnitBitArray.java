package com.google.android.exoplayer2.util;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class ParsableNalUnitBitArray {
    private int bitOffset;
    private int byteLimit;
    private int byteOffset;
    private byte[] data;

    private int readExpGolombCodeNum() {
        int i2 = 0;
        while (!readBit()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? readBits(i2) : 0);
    }

    private boolean shouldSkipByte(int i2) {
        if (2 > i2 || i2 >= this.byteLimit) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        Assertions.checkState(i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0)));
    }

    public boolean canReadBits(int i2) {
        int i3 = this.byteOffset;
        int i5 = i2 / 8;
        int i7 = i3 + i5;
        int i8 = (this.bitOffset + i2) - (i5 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i7 || i7 >= this.byteLimit) {
                break;
            }
            if (shouldSkipByte(i3)) {
                i7++;
                i3 += 2;
            }
        }
        int i9 = this.byteLimit;
        if (i7 >= i9) {
            return i7 == i9 && i8 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i2 = this.byteOffset;
        int i3 = this.bitOffset;
        int i5 = 0;
        while (this.byteOffset < this.byteLimit && !readBit()) {
            i5++;
        }
        boolean z2 = this.byteOffset == this.byteLimit;
        this.byteOffset = i2;
        this.bitOffset = i3;
        return !z2 && canReadBits((i5 * 2) + 1);
    }

    public boolean readBit() {
        boolean z2 = (this.data[this.byteOffset] & (128 >> this.bitOffset)) != 0;
        skipBit();
        return z2;
    }

    public int readBits(int i2) {
        int i3;
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
            i5 |= (bArr[i8] & UByte.MAX_VALUE) << i7;
            if (!shouldSkipByte(i8 + 1)) {
                i = 1;
            }
            this.byteOffset = i8 + i;
        }
        byte[] bArr2 = this.data;
        int i9 = this.byteOffset;
        int i10 = ((-1) >>> (32 - i2)) & (i5 | ((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i3)));
        if (i3 == 8) {
            this.bitOffset = 0;
            this.byteOffset = i9 + (shouldSkipByte(i9 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i10;
    }

    public void reset(byte[] bArr, int i2, int i3) {
        this.data = bArr;
        this.byteOffset = i2;
        this.byteLimit = i3;
        this.bitOffset = 0;
        assertValidOffset();
    }

    public void skipBit() {
        int i2 = this.bitOffset + 1;
        this.bitOffset = i2;
        if (i2 == 8) {
            this.bitOffset = 0;
            int i3 = this.byteOffset;
            this.byteOffset = i3 + (shouldSkipByte(i3 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i2) {
        int i3 = this.byteOffset;
        int i5 = i2 / 8;
        int i7 = i3 + i5;
        this.byteOffset = i7;
        int i8 = this.bitOffset + (i2 - (i5 * 8));
        this.bitOffset = i8;
        if (i8 > 7) {
            this.byteOffset = i7 + 1;
            this.bitOffset = i8 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.byteOffset) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i3)) {
                this.byteOffset++;
                i3 += 2;
            }
        }
    }

    public ParsableNalUnitBitArray(byte[] bArr, int i2, int i3) {
        reset(bArr, i2, i3);
    }

    public int readSignedExpGolombCodedInt() {
        int i2;
        int expGolombCodeNum = readExpGolombCodeNum();
        if (expGolombCodeNum % 2 == 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return i2 * ((expGolombCodeNum + 1) / 2);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }
}
