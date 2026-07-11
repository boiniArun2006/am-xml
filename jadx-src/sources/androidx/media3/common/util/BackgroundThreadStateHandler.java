package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class BackgroundThreadStateHandler<T> {
    private final HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    public interface StateChangeListener<T> {
        void onStateChanged(T t3, T t4);
    }

    public static /* synthetic */ void n(final BackgroundThreadStateHandler backgroundThreadStateHandler, t1.CN3 cn3) {
        final T t3 = (T) cn3.apply(backgroundThreadStateHandler.backgroundState);
        backgroundThreadStateHandler.backgroundState = t3;
        backgroundThreadStateHandler.foregroundHandler.post(new Runnable() { // from class: androidx.media3.common.util.w6
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.t(this.f39341n, t3);
            }
        });
    }

    public static /* synthetic */ void rl(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj) {
        if (backgroundThreadStateHandler.pendingOperations == 0) {
            backgroundThreadStateHandler.updateStateInForeground(obj);
        }
    }

    public static /* synthetic */ void t(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj) {
        int i2 = backgroundThreadStateHandler.pendingOperations - 1;
        backgroundThreadStateHandler.pendingOperations = i2;
        if (i2 == 0) {
            backgroundThreadStateHandler.updateStateInForeground(obj);
        }
    }

    private void updateStateInForeground(T t3) {
        T t4 = this.foregroundState;
        this.foregroundState = t3;
        if (t4.equals(t3)) {
            return;
        }
        this.onStateChanged.onStateChanged(t4, t3);
    }

    public void runInBackground(Runnable runnable) {
        this.backgroundHandler.post(runnable);
    }

    public void setStateInBackground(final T t3) {
        this.backgroundState = t3;
        this.foregroundHandler.post(new Runnable() { // from class: androidx.media3.common.util.n
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.rl(this.f39334n, t3);
            }
        });
    }

    public BackgroundThreadStateHandler(T t3, Looper looper, Looper looper2, Clock clock, StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t3;
        this.backgroundState = t3;
        this.onStateChanged = stateChangeListener;
    }

    public T get() {
        boolean z2;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        if (looperMyLooper == this.backgroundHandler.getLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        return this.backgroundState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateStateAsync(t1.CN3 cn3, final t1.CN3 cn32) {
        boolean z2;
        if (Looper.myLooper() == this.foregroundHandler.getLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        this.pendingOperations++;
        this.backgroundHandler.post(new Runnable() { // from class: androidx.media3.common.util.j
            @Override // java.lang.Runnable
            public final void run() {
                BackgroundThreadStateHandler.n(this.f39329n, cn32);
            }
        });
        updateStateInForeground(cn3.apply(this.foregroundState));
    }
}
