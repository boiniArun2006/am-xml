package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class o {
    public final long[] J2;
    public final long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f57848O;
    public final int[] Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Track f57849n;
    public final int[] nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long[] f57850t;

    public int n(long j2) {
        for (int iBinarySearchFloor = Util.binarySearchFloor(this.J2, j2, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.Uo[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int rl(long j2) {
        for (int iBinarySearchCeil = Util.binarySearchCeil(this.J2, j2, true, false); iBinarySearchCeil < this.J2.length; iBinarySearchCeil++) {
            if ((this.Uo[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }

    public o(Track track, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        boolean z2;
        boolean z3;
        if (iArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        if (jArr.length == jArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkArgument(z3);
        Assertions.checkArgument(iArr2.length == jArr2.length);
        this.f57849n = track;
        this.f57850t = jArr;
        this.nr = iArr;
        this.f57848O = i2;
        this.J2 = jArr2;
        this.Uo = iArr2;
        this.KN = j2;
        this.rl = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }
}
