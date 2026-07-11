package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class w6 implements j {
    public final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f57770O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f57771n;
    public final int nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f57772t;

    @Override // com.google.android.exoplayer2.extractor.avi.j
    public int getType() {
        return 1752331379;
    }

    public long n() {
        return Util.scaleLargeTimestamp(this.f57770O, ((long) this.f57772t) * 1000000, this.nr);
    }

    public int rl() {
        int i2 = this.f57771n;
        if (i2 == 1935960438) {
            return 2;
        }
        if (i2 == 1935963489) {
            return 1;
        }
        if (i2 == 1937012852) {
            return 3;
        }
        Log.w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f57771n));
        return -1;
    }

    private w6(int i2, int i3, int i5, int i7, int i8, int i9) {
        this.f57771n = i2;
        this.rl = i3;
        this.f57772t = i5;
        this.nr = i7;
        this.f57770O = i8;
        this.J2 = i9;
    }

    public static w6 t(ParsableByteArray parsableByteArray) {
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt5 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt6 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(8);
        return new w6(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5, littleEndianInt6);
    }
}
