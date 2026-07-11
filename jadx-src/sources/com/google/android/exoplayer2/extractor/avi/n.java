package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class n implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f57768n;
    public final int nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f57769t;

    @Override // com.google.android.exoplayer2.extractor.avi.j
    public int getType() {
        return 1751742049;
    }

    public boolean n() {
        return (this.rl & 16) == 16;
    }

    private n(int i2, int i3, int i5, int i7) {
        this.f57768n = i2;
        this.rl = i3;
        this.f57769t = i5;
        this.nr = i7;
    }

    public static n rl(ParsableByteArray parsableByteArray) {
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(8);
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        return new n(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4);
    }
}
