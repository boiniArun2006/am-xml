package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class y extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f56163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f56164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f56166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f56167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f56168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Thread f56169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f56170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f56171i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper, z zVar, x xVar, int i2, long j2) {
        super(looper);
        this.f56171i = b0Var;
        this.f56163a = zVar;
        this.f56164b = xVar;
        this.f56165c = i2;
        this.f56166d = j2;
    }

    public final void a(boolean z2) {
        this.f56170h = z2;
        this.f56167e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z2) {
                sendEmptyMessage(1);
            }
        } else {
            this.f56163a.b();
            if (this.f56169g != null) {
                this.f56169g.interrupt();
            }
        }
        if (z2) {
            this.f56171i.f56016b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f56164b.a(this.f56163a, jElapsedRealtime, jElapsedRealtime - this.f56166d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f56170h) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            this.f56167e = null;
            b0 b0Var = this.f56171i;
            b0Var.f56015a.execute(b0Var.f56016b);
            return;
        }
        if (i2 == 4) {
            throw ((Error) message.obj);
        }
        this.f56171i.f56016b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.f56166d;
        if (this.f56163a.a()) {
            this.f56164b.a(this.f56163a, jElapsedRealtime, j2, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            this.f56164b.a(this.f56163a, jElapsedRealtime, j2, false);
            return;
        }
        if (i3 == 2) {
            this.f56164b.a(this.f56163a, jElapsedRealtime, j2);
            return;
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f56167e = iOException;
        int iA = this.f56164b.a(this.f56163a, jElapsedRealtime, j2, iOException);
        if (iA == 3) {
            this.f56171i.f56017c = this.f56167e;
            return;
        }
        if (iA != 2) {
            int i5 = iA == 1 ? 1 : this.f56168f + 1;
            this.f56168f = i5;
            long jMin = Math.min((i5 - 1) * 1000, 5000);
            b0 b0Var2 = this.f56171i;
            if (b0Var2.f56016b != null) {
                throw new IllegalStateException();
            }
            b0Var2.f56016b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f56167e = null;
                b0Var2.f56015a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f56169g = Thread.currentThread();
            if (!this.f56163a.a()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("load:".concat(this.f56163a.getClass().getSimpleName()));
                try {
                    this.f56163a.load();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                } catch (Throwable th) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    throw th;
                }
            }
            if (this.f56170h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e2) {
            if (this.f56170h) {
                return;
            }
            obtainMessage(3, e2).sendToTarget();
        } catch (Error e3) {
            Log.e("LoadTask", "Unexpected error loading stream", e3);
            if (!this.f56170h) {
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (InterruptedException unused) {
            if (!this.f56163a.a()) {
                throw new IllegalStateException();
            }
            if (this.f56170h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e4) {
            Log.e("LoadTask", "Unexpected exception loading stream", e4);
            if (this.f56170h) {
                return;
            }
            obtainMessage(3, new a0(e4)).sendToTarget();
        } catch (OutOfMemoryError e5) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e5);
            if (this.f56170h) {
                return;
            }
            obtainMessage(3, new a0(e5)).sendToTarget();
        }
    }
}
