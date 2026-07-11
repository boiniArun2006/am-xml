package ePk;

import bolts.ExecutorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Exception f63606O;
    private CN3 Uo;
    private Object nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63608t;
    public static final ExecutorService xMQ = ePk.n.n();
    private static final Executor mUb = ePk.n.rl();
    public static final Executor gh = ePk.j.t();
    private static I28 qie = new I28((Object) null);
    private static I28 az = new I28(Boolean.TRUE);
    private static I28 ty = new I28(Boolean.FALSE);
    private static I28 HI = new I28(true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f63607n = new Object();
    private List KN = new ArrayList();

    public interface Ml {
    }

    class j implements ePk.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f63609n;
        final /* synthetic */ ePk.Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Executor f63610t;

        j(Wre wre, ePk.Ml ml, Executor executor, ePk.w6 w6Var) {
            this.f63609n = wre;
            this.rl = ml;
            this.f63610t = executor;
        }

        @Override // ePk.Ml
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Void n(I28 i28) {
            I28.nr(this.f63609n, this.rl, i28, this.f63610t, null);
            return null;
        }
    }

    static class n implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28 f63611O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f63612n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ePk.Ml f63613t;

        n(ePk.w6 w6Var, Wre wre, ePk.Ml ml, I28 i28) {
            this.f63612n = wre;
            this.f63613t = ml;
            this.f63611O = i28;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f63612n.nr(this.f63613t.n(this.f63611O));
            } catch (CancellationException unused) {
                this.f63612n.rl();
            } catch (Exception e2) {
                this.f63612n.t(e2);
            }
        }
    }

    static class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f63614n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Callable f63615t;

        w6(ePk.w6 w6Var, Wre wre, Callable callable) {
            this.f63614n = wre;
            this.f63615t = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f63614n.nr(this.f63615t.call());
            } catch (CancellationException unused) {
                this.f63614n.rl();
            } catch (Exception e2) {
                this.f63614n.t(e2);
            }
        }
    }

    I28() {
    }

    public static Ml gh() {
        return null;
    }

    public static I28 rl(Callable callable, Executor executor) {
        return t(callable, executor, null);
    }

    private void HI() {
        synchronized (this.f63607n) {
            Iterator it = this.KN.iterator();
            while (it.hasNext()) {
                try {
                    ((ePk.Ml) it.next()).n(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.KN = null;
        }
    }

    public static I28 KN(Object obj) {
        if (obj == null) {
            return qie;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? az : ty;
        }
        Wre wre = new Wre();
        wre.nr(obj);
        return wre.n();
    }

    public static I28 Uo(Exception exc) {
        Wre wre = new Wre();
        wre.t(exc);
        return wre.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void nr(Wre wre, ePk.Ml ml, I28 i28, Executor executor, ePk.w6 w6Var) {
        try {
            executor.execute(new n(w6Var, wre, ml, i28));
        } catch (Exception e2) {
            wre.t(new ExecutorException(e2));
        }
    }

    public static I28 t(Callable callable, Executor executor, ePk.w6 w6Var) {
        Wre wre = new Wre();
        try {
            executor.execute(new w6(w6Var, wre, callable));
        } catch (Exception e2) {
            wre.t(new ExecutorException(e2));
        }
        return wre.n();
    }

    boolean Ik(Exception exc) {
        synchronized (this.f63607n) {
            try {
                if (this.rl) {
                    return false;
                }
                this.rl = true;
                this.f63606O = exc;
                this.J2 = false;
                this.f63607n.notifyAll();
                HI();
                if (!this.J2) {
                    gh();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public I28 J2(ePk.Ml ml, Executor executor, ePk.w6 w6Var) throws Throwable {
        ePk.Ml ml2;
        Executor executor2;
        ePk.w6 w6Var2;
        Wre wre = new Wre();
        synchronized (this.f63607n) {
            try {
                try {
                    boolean zAz = az();
                    if (zAz) {
                        ml2 = ml;
                        executor2 = executor;
                        w6Var2 = w6Var;
                    } else {
                        ml2 = ml;
                        executor2 = executor;
                        w6Var2 = w6Var;
                        this.KN.add(new j(wre, ml2, executor2, w6Var2));
                    }
                    if (zAz) {
                        nr(wre, ml2, this, executor2, w6Var2);
                    }
                    return wre.n();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public I28 O(ePk.Ml ml) {
        return J2(ml, mUb, null);
    }

    public boolean az() {
        boolean z2;
        synchronized (this.f63607n) {
            z2 = this.rl;
        }
        return z2;
    }

    boolean ck() {
        synchronized (this.f63607n) {
            try {
                if (this.rl) {
                    return false;
                }
                this.rl = true;
                this.f63608t = true;
                this.f63607n.notifyAll();
                HI();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object mUb() {
        Object obj;
        synchronized (this.f63607n) {
            obj = this.nr;
        }
        return obj;
    }

    public boolean qie() {
        boolean z2;
        synchronized (this.f63607n) {
            z2 = this.f63608t;
        }
        return z2;
    }

    boolean r(Object obj) {
        synchronized (this.f63607n) {
            try {
                if (this.rl) {
                    return false;
                }
                this.rl = true;
                this.nr = obj;
                this.f63607n.notifyAll();
                HI();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ty() {
        boolean z2;
        synchronized (this.f63607n) {
            z2 = xMQ() != null;
        }
        return z2;
    }

    public Exception xMQ() {
        Exception exc;
        synchronized (this.f63607n) {
            try {
                if (this.f63606O != null) {
                    this.J2 = true;
                }
                exc = this.f63606O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    private I28(Object obj) {
        r(obj);
    }

    private I28(boolean z2) {
        if (z2) {
            ck();
        } else {
            r(null);
        }
    }
}
