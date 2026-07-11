package wqP;

import java.util.Date;
import wqP.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Xo {
    private long J2;
    private long KN = new Date().getTime();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f75121O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f75122n;
    private final double nr;
    private final I28.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f75123t;
    private I28.n xMQ;

    public void J2() {
        this.Uo = this.J2;
    }

    public void O() {
        this.Uo = 0L;
    }

    public void Uo(long j2) {
        this.J2 = j2;
    }

    public void t() {
        I28.n nVar = this.xMQ;
        if (nVar != null) {
            nVar.t();
            this.xMQ = null;
        }
    }

    public Xo(I28 i28, I28.Ml ml, long j2, double d2, long j3) {
        this.f75122n = i28;
        this.rl = ml;
        this.f75123t = j2;
        this.nr = d2;
        this.f75121O = j3;
        this.J2 = j3;
        O();
    }

    public static /* synthetic */ void n(Xo xo, Runnable runnable) {
        xo.getClass();
        xo.KN = new Date().getTime();
        runnable.run();
    }

    private long nr() {
        return (long) ((Math.random() - 0.5d) * this.Uo);
    }

    public void rl(final Runnable runnable) {
        t();
        long jNr = this.Uo + nr();
        long jMax = Math.max(0L, new Date().getTime() - this.KN);
        long jMax2 = Math.max(0L, jNr - jMax);
        if (this.Uo > 0) {
            QJ.n(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.Uo), Long.valueOf(jNr), Long.valueOf(jMax));
        }
        this.xMQ = this.f75122n.KN(this.rl, jMax2, new Runnable() { // from class: wqP.Pl
            @Override // java.lang.Runnable
            public final void run() {
                Xo.n(this.f75108n, runnable);
            }
        });
        long j2 = (long) (this.Uo * this.nr);
        this.Uo = j2;
        long j3 = this.f75123t;
        if (j2 < j3) {
            this.Uo = j3;
        } else {
            long j4 = this.J2;
            if (j2 > j4) {
                this.Uo = j4;
            }
        }
        this.J2 = this.f75121O;
    }
}
