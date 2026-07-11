package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class AsyncLayoutInflater {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    LayoutInflater f14480n;
    Handler rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    InflateThread f14481t;

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1, reason: invalid class name */
    class AnonymousClass1 implements Handler.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AsyncLayoutInflater f14482n;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            InflateRequest inflateRequest = (InflateRequest) message.obj;
            if (inflateRequest.nr == null) {
                inflateRequest.nr = this.f14482n.f14480n.inflate(inflateRequest.f14486t, inflateRequest.rl, false);
            }
            inflateRequest.f14484O.n(inflateRequest.nr, inflateRequest.f14486t, inflateRequest.rl);
            this.f14482n.f14481t.n(inflateRequest);
            return true;
        }
    }

    private static class BasicInflater extends LayoutInflater {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f14483n = {"android.widget.", "android.webkit.", "android.app."};

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) {
            View viewCreateView;
            for (String str2 : f14483n) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }

        BasicInflater(Context context) {
            super(context);
        }
    }

    private static class InflateRequest {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        OnInflateFinishedListener f14484O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        AsyncLayoutInflater f14485n;
        View nr;
        ViewGroup rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f14486t;
    }

    private static class InflateThread extends Thread {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final InflateThread f14487O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ArrayBlockingQueue f14488n = new ArrayBlockingQueue(10);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Pools.SynchronizedPool f14489t = new Pools.SynchronizedPool(10);

        public void n(InflateRequest inflateRequest) {
            inflateRequest.f14484O = null;
            inflateRequest.f14485n = null;
            inflateRequest.rl = null;
            inflateRequest.f14486t = 0;
            inflateRequest.nr = null;
            this.f14489t.n(inflateRequest);
        }

        static {
            InflateThread inflateThread = new InflateThread();
            f14487O = inflateThread;
            inflateThread.start();
        }

        public void rl() {
            try {
                InflateRequest inflateRequest = (InflateRequest) this.f14488n.take();
                try {
                    inflateRequest.nr = inflateRequest.f14485n.f14480n.inflate(inflateRequest.f14486t, inflateRequest.rl, false);
                } catch (RuntimeException e2) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                }
                Message.obtain(inflateRequest.f14485n.rl, 0, inflateRequest).sendToTarget();
            } catch (InterruptedException e3) {
                Log.w("AsyncLayoutInflater", e3);
            }
        }

        private InflateThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                rl();
            }
        }
    }

    public interface OnInflateFinishedListener {
        void n(View view, int i2, ViewGroup viewGroup);
    }
}
