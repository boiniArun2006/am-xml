package P6h;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 {
    private long J2;
    private long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f7603O;
    private long Uo;
    private int gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GV.n f7604n;
    private long nr;
    private int qie;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f7605t;
    private long xMQ;

    public w6(GV.n frameScheduler) {
        Intrinsics.checkNotNullParameter(frameScheduler, "frameScheduler");
        this.f7604n = frameScheduler;
        this.f7605t = 8L;
        this.mUb = -1;
        this.gh = -1;
    }

    public final void J2(int i2) {
        this.mUb = i2;
    }

    public final boolean KN() {
        return this.mUb != -1 && nr() >= this.Uo;
    }

    public final void O() {
        this.qie++;
    }

    public final void Uo(boolean z2) {
        this.rl = z2;
    }

    public final void mUb() {
        if (this.rl) {
            long jNr = nr();
            this.f7603O = jNr - this.J2;
            this.xMQ = jNr - this.KN;
            this.J2 = 0L;
            this.Uo = 0L;
            this.KN = -1L;
            this.mUb = -1;
            this.rl = false;
        }
    }

    public final boolean rl() {
        return this.rl;
    }

    public final long t() {
        if (!this.rl) {
            return -1L;
        }
        long jN = this.f7604n.n(nr() - this.J2);
        if (jN == -1) {
            this.rl = false;
            return -1L;
        }
        long j2 = jN + this.f7605t;
        this.Uo = this.J2 + j2;
        return j2;
    }

    public final void xMQ() {
        if (this.rl) {
            return;
        }
        long jNr = nr();
        long j2 = jNr - this.f7603O;
        this.J2 = j2;
        this.Uo = j2;
        this.KN = jNr - this.xMQ;
        this.mUb = this.gh;
        this.rl = true;
    }

    private final long nr() {
        return SystemClock.uptimeMillis();
    }

    public final int n() {
        long jMax;
        long jNr = nr();
        if (this.rl) {
            jMax = (jNr - this.J2) + this.nr;
        } else {
            jMax = Math.max(this.KN, 0L);
        }
        int iRl = this.f7604n.rl(jMax, this.KN);
        this.KN = jMax;
        return iRl;
    }
}
