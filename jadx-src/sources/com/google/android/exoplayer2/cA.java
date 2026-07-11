package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class cA {
    public final boolean J2;
    public final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f57702O;
    public final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f57703n;
    public final long nr;
    public final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f57704t;
    public final boolean xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cA.class == obj.getClass()) {
            cA cAVar = (cA) obj;
            if (this.rl == cAVar.rl && this.f57704t == cAVar.f57704t && this.nr == cAVar.nr && this.f57702O == cAVar.f57702O && this.J2 == cAVar.J2 && this.Uo == cAVar.Uo && this.KN == cAVar.KN && this.xMQ == cAVar.xMQ && Util.areEqual(this.f57703n, cAVar.f57703n)) {
                return true;
            }
        }
        return false;
    }

    cA(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        Assertions.checkArgument(!z5 || z3);
        Assertions.checkArgument(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        Assertions.checkArgument(z6);
        this.f57703n = mediaPeriodId;
        this.rl = j2;
        this.f57704t = j3;
        this.nr = j4;
        this.f57702O = j5;
        this.J2 = z2;
        this.Uo = z3;
        this.KN = z4;
        this.xMQ = z5;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f57703n.hashCode()) * 31) + ((int) this.rl)) * 31) + ((int) this.f57704t)) * 31) + ((int) this.nr)) * 31) + ((int) this.f57702O)) * 31) + (this.J2 ? 1 : 0)) * 31) + (this.Uo ? 1 : 0)) * 31) + (this.KN ? 1 : 0)) * 31) + (this.xMQ ? 1 : 0);
    }

    public cA n(long j2) {
        return j2 == this.f57704t ? this : new cA(this.f57703n, this.rl, j2, this.nr, this.f57702O, this.J2, this.Uo, this.KN, this.xMQ);
    }

    public cA rl(long j2) {
        return j2 == this.rl ? this : new cA(this.f57703n, j2, this.f57704t, this.nr, this.f57702O, this.J2, this.Uo, this.KN, this.xMQ);
    }
}
