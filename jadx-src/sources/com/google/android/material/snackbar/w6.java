package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static w6 f59202O;
    private C0790w6 nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C0790w6 f59204t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f59203n = new Object();
    private final Handler rl = new Handler(Looper.getMainLooper(), new j());

    class j implements Handler.Callback {
        j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            w6.this.nr((C0790w6) message.obj);
            return true;
        }
    }

    interface n {
        void n(int i2);

        void show();
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.w6$w6, reason: collision with other inner class name */
    private static class C0790w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final WeakReference f59206n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f59207t;

        boolean n(n nVar) {
            return nVar != null && this.f59206n.get() == nVar;
        }

        C0790w6(int i2, n nVar) {
            this.f59206n = new WeakReference(nVar);
            this.rl = i2;
        }
    }

    private boolean J2(n nVar) {
        C0790w6 c0790w6 = this.f59204t;
        return c0790w6 != null && c0790w6.n(nVar);
    }

    private boolean Uo(n nVar) {
        C0790w6 c0790w6 = this.nr;
        return c0790w6 != null && c0790w6.n(nVar);
    }

    private boolean n(C0790w6 c0790w6, int i2) {
        n nVar = (n) c0790w6.f59206n.get();
        if (nVar == null) {
            return false;
        }
        this.rl.removeCallbacksAndMessages(c0790w6);
        nVar.n(i2);
        return true;
    }

    private void qie(C0790w6 c0790w6) {
        int i2 = c0790w6.rl;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.rl.removeCallbacksAndMessages(c0790w6);
        Handler handler = this.rl;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0790w6), i2);
    }

    static w6 t() {
        if (f59202O == null) {
            f59202O = new w6();
        }
        return f59202O;
    }

    private void ty() {
        C0790w6 c0790w6 = this.nr;
        if (c0790w6 != null) {
            this.f59204t = c0790w6;
            this.nr = null;
            n nVar = (n) c0790w6.f59206n.get();
            if (nVar != null) {
                nVar.show();
            } else {
                this.f59204t = null;
            }
        }
    }

    public void KN(n nVar) {
        synchronized (this.f59203n) {
            try {
                if (J2(nVar)) {
                    this.f59204t = null;
                    if (this.nr != null) {
                        ty();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean O(n nVar) {
        boolean z2;
        synchronized (this.f59203n) {
            try {
                z2 = J2(nVar) || Uo(nVar);
            } finally {
            }
        }
        return z2;
    }

    public void az(int i2, n nVar) {
        synchronized (this.f59203n) {
            try {
                if (J2(nVar)) {
                    C0790w6 c0790w6 = this.f59204t;
                    c0790w6.rl = i2;
                    this.rl.removeCallbacksAndMessages(c0790w6);
                    qie(this.f59204t);
                    return;
                }
                if (Uo(nVar)) {
                    this.nr.rl = i2;
                } else {
                    this.nr = new C0790w6(i2, nVar);
                }
                C0790w6 c0790w62 = this.f59204t;
                if (c0790w62 == null || !n(c0790w62, 4)) {
                    this.f59204t = null;
                    ty();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void gh(n nVar) {
        synchronized (this.f59203n) {
            try {
                if (J2(nVar)) {
                    C0790w6 c0790w6 = this.f59204t;
                    if (c0790w6.f59207t) {
                        c0790w6.f59207t = false;
                        qie(c0790w6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void mUb(n nVar) {
        synchronized (this.f59203n) {
            try {
                if (J2(nVar)) {
                    C0790w6 c0790w6 = this.f59204t;
                    if (!c0790w6.f59207t) {
                        c0790w6.f59207t = true;
                        this.rl.removeCallbacksAndMessages(c0790w6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void nr(C0790w6 c0790w6) {
        synchronized (this.f59203n) {
            try {
                if (this.f59204t == c0790w6 || this.nr == c0790w6) {
                    n(c0790w6, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void rl(n nVar, int i2) {
        synchronized (this.f59203n) {
            try {
                if (J2(nVar)) {
                    n(this.f59204t, i2);
                } else if (Uo(nVar)) {
                    n(this.nr, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void xMQ(n nVar) {
        synchronized (this.f59203n) {
            try {
                if (J2(nVar)) {
                    qie(this.f59204t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private w6() {
    }
}
