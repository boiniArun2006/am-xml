package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class I28 {
    private static final long[] nr = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f57787n = new byte[8];
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f57788t;

    public static long n(byte[] bArr, int i2, boolean z2) {
        long j2 = ((long) bArr[0]) & 255;
        if (z2) {
            j2 &= ~nr[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    public static int t(int i2) {
        int i3 = 0;
        while (true) {
            long[] jArr = nr;
            if (i3 >= jArr.length) {
                return -1;
            }
            if ((jArr[i3] & ((long) i2)) != 0) {
                return i3 + 1;
            }
            i3++;
        }
    }

    public void O() {
        this.rl = 0;
        this.f57788t = 0;
    }

    public long nr(ExtractorInput extractorInput, boolean z2, boolean z3, int i2) throws IOException {
        if (this.rl == 0) {
            if (!extractorInput.readFully(this.f57787n, 0, 1, z2)) {
                return -1L;
            }
            int iT = t(this.f57787n[0] & UByte.MAX_VALUE);
            this.f57788t = iT;
            if (iT == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.rl = 1;
        }
        int i3 = this.f57788t;
        if (i3 > i2) {
            this.rl = 0;
            return -2L;
        }
        if (i3 != 1) {
            extractorInput.readFully(this.f57787n, 1, i3 - 1);
        }
        this.rl = 0;
        return n(this.f57787n, this.f57788t, z3);
    }

    public int rl() {
        return this.f57788t;
    }
}
