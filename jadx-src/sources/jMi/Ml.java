package jMi;

import O2.Pl;
import android.content.Context;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import oK9.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Ml {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f69389O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.perf.config.j f69390n;
    private j nr;
    private final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f69391t;

    static class j {
        private static final yMa.j gh = yMa.j.O();
        private static final long qie = TimeUnit.SECONDS.toMicros(1);
        private double J2;
        private O2.Dsr KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private long f69392O;
        private O2.Dsr Uo;
        private long mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final O2.j f69393n;
        private O2.Dsr nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Timer f69394t;
        private long xMQ;

        synchronized void n(boolean z2) {
            try {
                this.nr = z2 ? this.Uo : this.KN;
                this.f69392O = z2 ? this.xMQ : this.mUb;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean rl(oK9.Dsr dsr) {
            try {
                Timer timerN = this.f69393n.n();
                double dNr = (this.f69394t.nr(timerN) * this.nr.n()) / qie;
                if (dNr > 0.0d) {
                    this.J2 = Math.min(this.J2 + dNr, this.f69392O);
                    this.f69394t = timerN;
                }
                double d2 = this.J2;
                if (d2 >= 1.0d) {
                    this.J2 = d2 - 1.0d;
                    return true;
                }
                if (this.rl) {
                    gh.mUb("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }

        private static long J2(com.google.firebase.perf.config.j jVar, String str) {
            return str == "Trace" ? jVar.Z() : jVar.Z();
        }

        private static long O(com.google.firebase.perf.config.j jVar, String str) {
            return str == "Trace" ? jVar.e() : jVar.r();
        }

        private static long nr(com.google.firebase.perf.config.j jVar, String str) {
            return str == "Trace" ? jVar.Z() : jVar.Z();
        }

        private static long t(com.google.firebase.perf.config.j jVar, String str) {
            return str == "Trace" ? jVar.E2() : jVar.Ik();
        }

        j(O2.Dsr dsr, long j2, O2.j jVar, com.google.firebase.perf.config.j jVar2, String str, boolean z2) {
            this.f69393n = jVar;
            this.f69392O = j2;
            this.nr = dsr;
            this.J2 = j2;
            this.f69394t = jVar.n();
            Uo(jVar2, str, z2);
            this.rl = z2;
        }

        private void Uo(com.google.firebase.perf.config.j jVar, String str, boolean z2) {
            long jJ2 = J2(jVar, str);
            long jO = O(jVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            O2.Dsr dsr = new O2.Dsr(jO, jJ2, timeUnit);
            this.Uo = dsr;
            this.xMQ = jO;
            if (z2) {
                gh.rl("Foreground %s logging rate:%f, burst capacity:%d", str, dsr, Long.valueOf(jO));
            }
            long jNr = nr(jVar, str);
            long jT2 = t(jVar, str);
            O2.Dsr dsr2 = new O2.Dsr(jT2, jNr, timeUnit);
            this.KN = dsr2;
            this.mUb = jT2;
            if (z2) {
                gh.rl("Background %s logging rate:%f, capacity:%d", str, dsr2, Long.valueOf(jT2));
            }
        }
    }

    public Ml(Context context, O2.Dsr dsr, long j2) {
        this(dsr, j2, new O2.j(), rl(), rl(), com.google.firebase.perf.config.j.Uo());
        this.J2 = Pl.rl(context);
    }

    private boolean J2() {
        return this.rl < this.f69390n.X();
    }

    private boolean O() {
        return this.rl < this.f69390n.o();
    }

    private boolean nr() {
        return this.f69391t < this.f69390n.J2();
    }

    static double rl() {
        return new Random().nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z2) {
        this.nr.n(z2);
        this.f69389O.n(z2);
    }

    private boolean t(List list) {
        if (list.size() <= 0 || ((oK9.C) list.get(0)).ty() <= 0 || ((oK9.C) list.get(0)).az(0) != o.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    boolean KN(oK9.Dsr dsr) {
        if (dsr.nr() && !J2() && !t(dsr.O().X())) {
            return false;
        }
        if (xMQ(dsr) && !nr() && !t(dsr.O().X())) {
            return false;
        }
        if (dsr.rl() && !O() && !t(dsr.t().iF())) {
            return false;
        }
        return true;
    }

    boolean Uo(oK9.Dsr dsr) {
        if (!mUb(dsr)) {
            return false;
        }
        if (dsr.rl()) {
            return !this.f69389O.rl(dsr);
        }
        if (!dsr.nr()) {
            return true;
        }
        return !this.nr.rl(dsr);
    }

    boolean mUb(oK9.Dsr dsr) {
        if ((dsr.nr() && ((dsr.O().e().equals(O2.w6.FOREGROUND_TRACE_NAME.toString()) || dsr.O().e().equals(O2.w6.BACKGROUND_TRACE_NAME.toString())) && dsr.O().ViF() > 0)) || dsr.n()) {
            return false;
        }
        return true;
    }

    protected boolean xMQ(oK9.Dsr dsr) {
        if (dsr.nr() && dsr.O().e().startsWith("_st_") && dsr.O().S("Hosting_activity")) {
            return true;
        }
        return false;
    }

    Ml(O2.Dsr dsr, long j2, O2.j jVar, double d2, double d4, com.google.firebase.perf.config.j jVar2) {
        this.nr = null;
        this.f69389O = null;
        boolean z2 = false;
        this.J2 = false;
        Pl.n(0.0d <= d2 && d2 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d4 && d4 < 1.0d) {
            z2 = true;
        }
        Pl.n(z2, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.rl = d2;
        this.f69391t = d4;
        this.f69390n = jVar2;
        this.nr = new j(dsr, j2, jVar, jVar2, "Trace", this.J2);
        this.f69389O = new j(dsr, j2, jVar, jVar2, "Network", this.J2);
    }
}
