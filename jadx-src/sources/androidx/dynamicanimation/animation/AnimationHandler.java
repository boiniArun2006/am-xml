package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class AnimationHandler {
    public static final ThreadLocal Uo = new ThreadLocal();
    private AnimationFrameCallbackProvider nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SimpleArrayMap f38284n = new SimpleArrayMap();
    final ArrayList rl = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AnimationCallbackDispatcher f38285t = new AnimationCallbackDispatcher();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f38283O = 0;
    private boolean J2 = false;

    class AnimationCallbackDispatcher {
        AnimationCallbackDispatcher() {
        }

        void n() {
            AnimationHandler.this.f38283O = SystemClock.uptimeMillis();
            AnimationHandler animationHandler = AnimationHandler.this;
            animationHandler.t(animationHandler.f38283O);
            if (AnimationHandler.this.rl.size() > 0) {
                AnimationHandler.this.O().n();
            }
        }
    }

    interface AnimationFrameCallback {
        boolean n(long j2);
    }

    @RequiresApi
    private static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {
        private final Choreographer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Choreographer.FrameCallback f38290t;

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        void n() {
            this.rl.postFrameCallback(this.f38290t);
        }

        FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.rl = Choreographer.getInstance();
            this.f38290t = new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j2) {
                    FrameCallbackProvider16.this.f38287n.n();
                }
            };
        }
    }

    static abstract class AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AnimationCallbackDispatcher f38287n;

        abstract void n();

        AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.f38287n = animationCallbackDispatcher;
        }
    }

    private static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {
        long nr;
        private final Runnable rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Handler f38288t;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ FrameCallbackProvider14 f38289n;

            @Override // java.lang.Runnable
            public void run() {
                this.f38289n.nr = SystemClock.uptimeMillis();
                this.f38289n.f38287n.n();
            }
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        void n() {
            this.f38288t.postDelayed(this.rl, Math.max(10 - (SystemClock.uptimeMillis() - this.nr), 0L));
        }
    }

    private boolean J2(AnimationFrameCallback animationFrameCallback, long j2) {
        Long l2 = (Long) this.f38284n.get(animationFrameCallback);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j2) {
            return false;
        }
        this.f38284n.remove(animationFrameCallback);
        return true;
    }

    public static AnimationHandler nr() {
        ThreadLocal threadLocal = Uo;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        return (AnimationHandler) threadLocal.get();
    }

    private void rl() {
        if (this.J2) {
            for (int size = this.rl.size() - 1; size >= 0; size--) {
                if (this.rl.get(size) == null) {
                    this.rl.remove(size);
                }
            }
            this.J2 = false;
        }
    }

    AnimationFrameCallbackProvider O() {
        if (this.nr == null) {
            this.nr = new FrameCallbackProvider16(this.f38285t);
        }
        return this.nr;
    }

    public void Uo(AnimationFrameCallback animationFrameCallback) {
        this.f38284n.remove(animationFrameCallback);
        int iIndexOf = this.rl.indexOf(animationFrameCallback);
        if (iIndexOf >= 0) {
            this.rl.set(iIndexOf, null);
            this.J2 = true;
        }
    }

    public void n(AnimationFrameCallback animationFrameCallback, long j2) {
        if (this.rl.size() == 0) {
            O().n();
        }
        if (!this.rl.contains(animationFrameCallback)) {
            this.rl.add(animationFrameCallback);
        }
        if (j2 > 0) {
            this.f38284n.put(animationFrameCallback, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    AnimationHandler() {
    }

    void t(long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i2 = 0; i2 < this.rl.size(); i2++) {
            AnimationFrameCallback animationFrameCallback = (AnimationFrameCallback) this.rl.get(i2);
            if (animationFrameCallback != null && J2(animationFrameCallback, jUptimeMillis)) {
                animationFrameCallback.n(j2);
            }
        }
        rl();
    }
}
