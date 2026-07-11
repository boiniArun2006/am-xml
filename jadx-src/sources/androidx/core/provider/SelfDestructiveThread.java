package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
@Deprecated
public class SelfDestructiveThread {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f36588n;
    private final int nr;
    private HandlerThread rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Handler f36589t;

    /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$1, reason: invalid class name */
    class AnonymousClass1 implements Handler.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SelfDestructiveThread f36590n;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f36590n.n();
                return true;
            }
            if (i2 != 1) {
                return true;
            }
            this.f36590n.rl((Runnable) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ReplyCallback f36591O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Callable f36592n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Handler f36593t;

        @Override // java.lang.Runnable
        public void run() {
            final Object objCall;
            try {
                objCall = this.f36592n.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f36593t.post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2.1
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass2.this.f36591O.n(objCall);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.SelfDestructiveThread$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ AtomicBoolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ReentrantLock f36596O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AtomicReference f36597n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Condition f36598r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Callable f36599t;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36597n.set(this.f36599t.call());
            } catch (Exception unused) {
            }
            this.f36596O.lock();
            try {
                this.J2.set(false);
                this.f36598r.signal();
            } finally {
                this.f36596O.unlock();
            }
        }
    }

    public interface ReplyCallback<T> {
        void n(Object obj);
    }

    void n() {
        synchronized (this.f36588n) {
            try {
                if (this.f36589t.hasMessages(1)) {
                    return;
                }
                this.rl.quit();
                this.rl = null;
                this.f36589t = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void rl(Runnable runnable) {
        runnable.run();
        synchronized (this.f36588n) {
            this.f36589t.removeMessages(0);
            Handler handler = this.f36589t;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.nr);
        }
    }
}
