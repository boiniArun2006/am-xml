package KaW;

import KaW.n;
import io.grpc.internal.DC;
import java.io.IOException;
import java.net.Socket;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class j implements Sink {
    private Socket E2;
    private final n.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DC f5578O;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f5580T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f5581X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5583e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Sink f5584g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f5587r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f5585n = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Buffer f5588t = new Buffer();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5586o = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f5582Z = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f5579S = false;

    private abstract class I28 implements Runnable {
        private I28() {
        }

        public abstract void n();

        /* synthetic */ I28(j jVar, C0191j c0191j) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (j.this.f5584g == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                n();
            } catch (Exception e2) {
                j.this.J2.KN(e2);
            }
        }
    }

    private class Ml extends KaW.w6 {
        public Ml(ISg.w6 w6Var) {
            super(w6Var);
        }

        @Override // KaW.w6, ISg.w6
        public void KN(int i2, ISg.j jVar) {
            j.eF(j.this);
            super.KN(i2, jVar);
        }

        @Override // KaW.w6, ISg.w6
        public void N(ISg.Dsr dsr) {
            j.eF(j.this);
            super.N(dsr);
        }

        @Override // KaW.w6, ISg.w6
        public void ping(boolean z2, int i2, int i3) {
            if (z2) {
                j.eF(j.this);
            }
            super.ping(z2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: KaW.j$j, reason: collision with other inner class name */
    class C0191j extends I28 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final L3.n f5592t;

        C0191j() {
            super(j.this, null);
            this.f5592t = L3.w6.J2();
        }

        @Override // KaW.j.I28
        public void n() {
            int i2;
            Buffer buffer = new Buffer();
            L3.I28 i28KN = L3.w6.KN("WriteRunnable.runWrite");
            try {
                L3.w6.O(this.f5592t);
                synchronized (j.this.f5585n) {
                    buffer.write(j.this.f5588t, j.this.f5588t.completeSegmentByteCount());
                    j.this.f5586o = false;
                    i2 = j.this.f5580T;
                }
                j.this.f5584g.write(buffer, buffer.size());
                synchronized (j.this.f5585n) {
                    j.T(j.this, i2);
                }
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class n extends I28 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final L3.n f5594t;

        n() {
            super(j.this, null);
            this.f5594t = L3.w6.J2();
        }

        @Override // KaW.j.I28
        public void n() {
            Buffer buffer = new Buffer();
            L3.I28 i28KN = L3.w6.KN("WriteRunnable.runFlush");
            try {
                L3.w6.O(this.f5594t);
                synchronized (j.this.f5585n) {
                    buffer.write(j.this.f5588t, j.this.f5588t.size());
                    j.this.f5582Z = false;
                }
                j.this.f5584g.write(buffer, buffer.size());
                j.this.f5584g.flush();
                if (i28KN != null) {
                    i28KN.close();
                }
            } catch (Throwable th) {
                if (i28KN != null) {
                    try {
                        i28KN.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    class w6 implements Runnable {
        w6() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (j.this.f5584g != null && j.this.f5588t.size() > 0) {
                    j.this.f5584g.write(j.this.f5588t, j.this.f5588t.size());
                }
            } catch (IOException e2) {
                j.this.J2.KN(e2);
            }
            j.this.f5588t.close();
            try {
                if (j.this.f5584g != null) {
                    j.this.f5584g.close();
                }
            } catch (IOException e3) {
                j.this.J2.KN(e3);
            }
            try {
                if (j.this.E2 != null) {
                    j.this.E2.close();
                }
            } catch (IOException e4) {
                j.this.J2.KN(e4);
            }
        }
    }

    static /* synthetic */ int T(j jVar, int i2) {
        int i3 = jVar.f5580T - i2;
        jVar.f5580T = i3;
        return i3;
    }

    static j a(DC dc, n.j jVar, int i2) {
        return new j(dc, jVar, i2);
    }

    static /* synthetic */ int eF(j jVar) {
        int i2 = jVar.f5581X;
        jVar.f5581X = i2 + 1;
        return i2;
    }

    ISg.w6 FX(ISg.w6 w6Var) {
        return new Ml(w6Var);
    }

    void M(Sink sink, Socket socket) {
        t1.Xo.S(this.f5584g == null, "AsyncSink's becomeConnected should only be called once.");
        this.f5584g = (Sink) t1.Xo.ck(sink, "sink");
        this.E2 = (Socket) t1.Xo.ck(socket, "socket");
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5579S) {
            return;
        }
        this.f5579S = true;
        this.f5578O.execute(new w6());
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.f5579S) {
            throw new IOException("closed");
        }
        L3.I28 i28KN = L3.w6.KN("AsyncSink.flush");
        try {
            synchronized (this.f5585n) {
                if (this.f5582Z) {
                    if (i28KN != null) {
                        i28KN.close();
                    }
                } else {
                    this.f5582Z = true;
                    this.f5578O.execute(new n());
                    if (i28KN != null) {
                        i28KN.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j2) throws IOException {
        t1.Xo.ck(buffer, "source");
        if (this.f5579S) {
            throw new IOException("closed");
        }
        L3.I28 i28KN = L3.w6.KN("AsyncSink.write");
        try {
            synchronized (this.f5585n) {
                try {
                    this.f5588t.write(buffer, j2);
                    int i2 = this.f5580T + this.f5581X;
                    this.f5580T = i2;
                    boolean z2 = false;
                    this.f5581X = 0;
                    if (this.f5583e || i2 <= this.f5587r) {
                        if (!this.f5586o && !this.f5582Z && this.f5588t.completeSegmentByteCount() > 0) {
                            this.f5586o = true;
                        }
                        if (i28KN != null) {
                            i28KN.close();
                            return;
                        }
                        return;
                    }
                    this.f5583e = true;
                    z2 = true;
                    if (!z2) {
                        this.f5578O.execute(new C0191j());
                        if (i28KN != null) {
                            i28KN.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.E2.close();
                    } catch (IOException e2) {
                        this.J2.KN(e2);
                    }
                    if (i28KN != null) {
                        i28KN.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (i28KN != null) {
                try {
                    i28KN.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private j(DC dc, n.j jVar, int i2) {
        this.f5578O = (DC) t1.Xo.ck(dc, "executor");
        this.J2 = (n.j) t1.Xo.ck(jVar, "exceptionHandler");
        this.f5587r = i2;
    }
}
