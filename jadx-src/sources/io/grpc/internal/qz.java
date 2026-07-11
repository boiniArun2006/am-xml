package io.grpc.internal;

import JP.j;
import io.grpc.internal.YzO;
import io.grpc.internal.s4;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class qz implements s4 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f68712O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s4 f68713n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JP.j f68714t;

    private class j extends iwV {
        private io.grpc.SPz J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private io.grpc.SPz f68715O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Q f68716n;
        private volatile io.grpc.SPz nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final AtomicInteger f68717t = new AtomicInteger(-2147483647);
        private final YzO.j Uo = new C0976j();

        /* JADX INFO: renamed from: io.grpc.internal.qz$j$j, reason: collision with other inner class name */
        class C0976j implements YzO.j {
            C0976j() {
            }

            @Override // io.grpc.internal.YzO.j
            public void onComplete() {
                if (j.this.f68717t.decrementAndGet() == 0) {
                    j.this.gh();
                }
            }
        }

        class n extends j.n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ JP.DAz f68719n;
            final /* synthetic */ io.grpc.n rl;

            n(JP.DAz dAz, io.grpc.n nVar) {
                this.f68719n = dAz;
                this.rl = nVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gh() {
            synchronized (this) {
                try {
                    if (this.f68717t.get() != 0) {
                        return;
                    }
                    io.grpc.SPz sPz = this.f68715O;
                    io.grpc.SPz sPz2 = this.J2;
                    this.f68715O = null;
                    this.J2 = null;
                    if (sPz != null) {
                        super.J2(sPz);
                    }
                    if (sPz2 != null) {
                        super.rl(sPz2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        j(Q q2, String str) {
            this.f68716n = (Q) t1.Xo.ck(q2, "delegate");
            this.rl = (String) t1.Xo.ck(str, "authority");
        }

        @Override // io.grpc.internal.iwV, io.grpc.internal.o7q
        public void J2(io.grpc.SPz sPz) {
            t1.Xo.ck(sPz, "status");
            synchronized (this) {
                try {
                    if (this.f68717t.get() < 0) {
                        this.nr = sPz;
                        this.f68717t.addAndGet(Integer.MAX_VALUE);
                        if (this.f68717t.get() != 0) {
                            this.f68715O = sPz;
                        } else {
                            super.J2(sPz);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.iwV
        protected Q n() {
            return this.f68716n;
        }

        @Override // io.grpc.internal.iwV, io.grpc.internal.o7q
        public void rl(io.grpc.SPz sPz) {
            t1.Xo.ck(sPz, "status");
            synchronized (this) {
                try {
                    if (this.f68717t.get() < 0) {
                        this.nr = sPz;
                        this.f68717t.addAndGet(Integer.MAX_VALUE);
                    } else if (this.J2 != null) {
                        return;
                    }
                    if (this.f68717t.get() != 0) {
                        this.J2 = sPz;
                    } else {
                        super.rl(sPz);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.iwV, io.grpc.internal.InterfaceC2171c
        public QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
            JP.j jVarT = nVar.t();
            if (jVarT == null) {
                jVarT = qz.this.f68714t;
            } else if (qz.this.f68714t != null) {
                jVarT = new JP.aC(qz.this.f68714t, jVarT);
            }
            if (jVarT != null) {
                YzO yzO = new YzO(this.f68716n, dAz, qj, nVar, this.Uo, w6VarArr);
                if (this.f68717t.incrementAndGet() > 0) {
                    this.Uo.onComplete();
                    return new u(this.nr, w6VarArr);
                }
                try {
                    jVarT.n(new n(dAz, nVar), qz.this.f68712O, yzO);
                } catch (Throwable th) {
                    yzO.rl(io.grpc.SPz.az.Ik("Credentials should use fail() instead of throwing exceptions").ck(th));
                }
                return yzO.nr();
            }
            if (this.f68717t.get() >= 0) {
                return new u(this.nr, w6VarArr);
            }
            return this.f68716n.t(dAz, qj, nVar, w6VarArr);
        }
    }

    @Override // io.grpc.internal.s4
    public ScheduledExecutorService J() {
        return this.f68713n.J();
    }

    @Override // io.grpc.internal.s4, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f68713n.close();
    }

    @Override // io.grpc.internal.s4
    public Q s7N(SocketAddress socketAddress, s4.j jVar, JP.Ml ml) {
        return new j(this.f68713n.s7N(socketAddress, jVar, ml), jVar.n());
    }

    @Override // io.grpc.internal.s4
    public Collection tFV() {
        return this.f68713n.tFV();
    }

    qz(s4 s4Var, JP.j jVar, Executor executor) {
        this.f68713n = (s4) t1.Xo.ck(s4Var, "delegate");
        this.f68714t = jVar;
        this.f68712O = (Executor) t1.Xo.ck(executor, "appExecutor");
    }
}
