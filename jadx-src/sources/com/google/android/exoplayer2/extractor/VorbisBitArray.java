package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class VorbisBitArray {
    private int bitOffset;
    private final int byteLimit;
    private int byteOffset;
    private final byte[] data;

    public void reset() {
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    private void assertValidOffset() {
        int i2;
        int i3 = this.byteOffset;
        Assertions.checkState(i3 >= 0 && (i3 < (i2 = this.byteLimit) || (i3 == i2 && this.bitOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.byteLimit - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        boolean z2 = (((this.data[this.byteOffset] & UByte.MAX_VALUE) >> this.bitOffset) & 1) == 1;
        skipBits(1);
        return z2;
    }

    public int readBits(int i2) {
        int i3 = this.byteOffset;
        int iMin = Math.min(i2, 8 - this.bitOffset);
        int i5 = i3 + 1;
        int i7 = ((this.data[i3] & UByte.MAX_VALUE) >> this.bitOffset) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i7 |= (this.data[i5] & UByte.MAX_VALUE) << iMin;
            iMin += 8;
            i5++;
        }
        int i8 = i7 & ((-1) >>> (32 - i2));
        skipBits(i2);
        return i8;
    }

    public void setPosition(int i2) {
        int i3 = i2 / 8;
        this.byteOffset = i3;
        this.bitOffset = i2 - (i3 * 8);
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

    public VorbisBitArray(byte[] bArr) {
        this.data = bArr;
        this.byteLimit = bArr.length;
    }
}
