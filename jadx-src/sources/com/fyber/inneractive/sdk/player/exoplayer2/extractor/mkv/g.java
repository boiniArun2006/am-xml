package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import java.io.EOFException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f55093d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f55094a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55096c;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z2, boolean z3, int i2) throws InterruptedException, EOFException {
        int i3;
        if (this.f55095b == 0) {
            if (!bVar.b(this.f55094a, 0, 1, z2)) {
                return -1L;
            }
            int i5 = this.f55094a[0] & UByte.MAX_VALUE;
            int i7 = 0;
            while (true) {
                long[] jArr = f55093d;
                if (i7 >= 8) {
                    i3 = -1;
                    break;
                }
                if ((((long) i5) & jArr[i7]) != 0) {
                    i3 = i7 + 1;
                    break;
                }
                i7++;
            }
            this.f55096c = i3;
            if (i3 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f55095b = 1;
        }
        int i8 = this.f55096c;
        if (i8 > i2) {
            this.f55095b = 0;
            return -2L;
        }
        if (i8 != 1) {
            bVar.b(this.f55094a, 1, i8 - 1, false);
        }
        this.f55095b = 0;
        return a(this.f55094a, this.f55096c, z3);
    }

    public static long a(byte[] bArr, int i2, boolean z2) {
        long j2 = ((long) bArr[0]) & 255;
        if (z2) {
            j2 &= ~f55093d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }
}
