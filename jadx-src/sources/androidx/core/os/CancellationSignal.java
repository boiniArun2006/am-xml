package androidx.core.os;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated
public final class CancellationSignal {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36525n;
    private boolean nr;
    private OnCancelListener rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object f36526t;

    public interface OnCancelListener {
        void onCancel();
    }

    public void n() {
        synchronized (this) {
            try {
                if (this.f36525n) {
                    return;
                }
                this.f36525n = true;
                this.nr = true;
                OnCancelListener onCancelListener = this.rl;
                Object obj = this.f36526t;
                if (onCancelListener != null) {
                    try {
                        onCancelListener.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.nr = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((android.os.CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.nr = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object rl() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f36526t == null) {
                    android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
                    this.f36526t = cancellationSignal;
                    if (this.f36525n) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f36526t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public void t(OnCancelListener onCancelListener) {
        synchronized (this) {
            try {
                nr();
                if (this.rl == onCancelListener) {
                    return;
                }
                this.rl = onCancelListener;
                if (this.f36525n && onCancelListener != null) {
                    onCancelListener.onCancel();
                }
            } finally {
            }
        }
    }

    private void nr() {
        while (this.nr) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
