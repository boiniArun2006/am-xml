package io.grpc.internal;

import io.grpc.internal.InterfaceC2171c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class OU {
    private ScheduledFuture J2;
    private final Runnable KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private I28 f68336O;
    private ScheduledFuture Uo;
    private final long gh;
    private final long mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f68337n;
    private final boolean nr;
    private final C2369c rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f68338t;
    private final Runnable xMQ;
    private static final long qie = TimeUnit.SECONDS.toNanos(10);
    private static final long az = TimeUnit.MILLISECONDS.toNanos(10);

    private enum I28 {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public interface Ml {
        void n();

        void rl();
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            synchronized (OU.this) {
                try {
                    I28 i28 = OU.this.f68336O;
                    I28 i282 = I28.DISCONNECTED;
                    if (i28 != i282) {
                        OU.this.f68336O = i282;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                OU.this.f68338t.rl();
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            synchronized (OU.this) {
                try {
                    OU.this.Uo = null;
                    I28 i28 = OU.this.f68336O;
                    I28 i282 = I28.PING_SCHEDULED;
                    if (i28 == i282) {
                        OU.this.f68336O = I28.PING_SENT;
                        OU ou2 = OU.this;
                        ou2.J2 = ou2.f68337n.schedule(OU.this.KN, OU.this.gh, TimeUnit.NANOSECONDS);
                        z2 = true;
                    } else {
                        if (OU.this.f68336O == I28.PING_DELAYED) {
                            OU ou3 = OU.this;
                            ScheduledExecutorService scheduledExecutorService = ou3.f68337n;
                            Runnable runnable = OU.this.xMQ;
                            long j2 = OU.this.mUb;
                            C2369c c2369c = OU.this.rl;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            ou3.Uo = scheduledExecutorService.schedule(runnable, j2 - c2369c.nr(timeUnit), timeUnit);
                            OU.this.f68336O = i282;
                        }
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                OU.this.f68338t.n();
            }
        }
    }

    public static final class w6 implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Q f68347n;

        class j implements InterfaceC2171c.j {
            @Override // io.grpc.internal.InterfaceC2171c.j
            public void n(long j2) {
            }

            j() {
            }

            @Override // io.grpc.internal.InterfaceC2171c.j
            public void onFailure(Throwable th) {
                w6.this.f68347n.rl(io.grpc.SPz.f68186Z.Ik("Keepalive failed. The connection is likely gone"));
            }
        }

        @Override // io.grpc.internal.OU.Ml
        public void n() {
            this.f68347n.O(new j(), com.google.common.util.concurrent.QJ.n());
        }

        @Override // io.grpc.internal.OU.Ml
        public void rl() {
            this.f68347n.rl(io.grpc.SPz.f68186Z.Ik("Keepalive failed. The connection is likely gone"));
        }

        public w6(Q q2) {
            this.f68347n = q2;
        }
    }

    public OU(Ml ml, ScheduledExecutorService scheduledExecutorService, long j2, long j3, boolean z2) {
        this(ml, scheduledExecutorService, C2369c.t(), j2, j3, z2);
    }

    public synchronized void HI() {
        try {
            if (this.nr) {
                return;
            }
            I28 i28 = this.f68336O;
            if (i28 == I28.PING_SCHEDULED || i28 == I28.PING_DELAYED) {
                this.f68336O = I28.IDLE;
            }
            if (this.f68336O == I28.PING_SENT) {
                this.f68336O = I28.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void Ik() {
        try {
            I28 i28 = this.f68336O;
            I28 i282 = I28.DISCONNECTED;
            if (i28 != i282) {
                this.f68336O = i282;
                ScheduledFuture scheduledFuture = this.J2;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.Uo;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.Uo = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void az() {
        try {
            this.rl.J2().Uo();
            I28 i28 = this.f68336O;
            I28 i282 = I28.PING_SCHEDULED;
            if (i28 == i282) {
                this.f68336O = I28.PING_DELAYED;
            } else if (i28 == I28.PING_SENT || i28 == I28.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.J2;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f68336O == I28.IDLE_AND_PING_SENT) {
                    this.f68336O = I28.IDLE;
                } else {
                    this.f68336O = i282;
                    t1.Xo.S(this.Uo == null, "There should be no outstanding pingFuture");
                    this.Uo = this.f68337n.schedule(this.xMQ, this.mUb, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void ck() {
        if (this.nr) {
            ty();
        }
    }

    public synchronized void ty() {
        try {
            I28 i28 = this.f68336O;
            if (i28 == I28.IDLE) {
                this.f68336O = I28.PING_SCHEDULED;
                if (this.Uo == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f68337n;
                    Runnable runnable = this.xMQ;
                    long j2 = this.mUb;
                    C2369c c2369c = this.rl;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.Uo = scheduledExecutorService.schedule(runnable, j2 - c2369c.nr(timeUnit), timeUnit);
                }
            } else if (i28 == I28.IDLE_AND_PING_SENT) {
                this.f68336O = I28.PING_SENT;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    OU(Ml ml, ScheduledExecutorService scheduledExecutorService, C2369c c2369c, long j2, long j3, boolean z2) {
        this.f68336O = I28.IDLE;
        this.KN = new RunnableC2176p(new j());
        this.xMQ = new RunnableC2176p(new n());
        this.f68338t = (Ml) t1.Xo.ck(ml, "keepAlivePinger");
        this.f68337n = (ScheduledExecutorService) t1.Xo.ck(scheduledExecutorService, "scheduler");
        this.rl = (C2369c) t1.Xo.ck(c2369c, "stopwatch");
        this.mUb = j2;
        this.gh = j3;
        this.nr = z2;
        c2369c.J2().Uo();
    }

    public static long qie(long j2) {
        return Math.max(j2, qie);
    }
}
