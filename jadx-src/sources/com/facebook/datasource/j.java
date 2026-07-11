package com.facebook.datasource;

import Hh.C;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j implements com.facebook.datasource.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f52373n;
    private Object nr = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Throwable f52372O = null;
    private float J2 = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f52374t = false;
    private Ml rl = Ml.IN_PROGRESS;
    private final ConcurrentLinkedQueue Uo = new ConcurrentLinkedQueue();

    private enum Ml {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* JADX INFO: renamed from: com.facebook.datasource.j$j, reason: collision with other inner class name */
    class RunnableC0747j implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f52378O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f52379n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28 f52380t;

        RunnableC0747j(boolean z2, I28 i28, boolean z3) {
            this.f52379n = z2;
            this.f52380t = i28;
            this.f52378O = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f52379n) {
                this.f52380t.rl(j.this);
            } else if (this.f52378O) {
                this.f52380t.n(j.this);
            } else {
                this.f52380t.t(j.this);
            }
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ I28 f52381n;

        n(I28 i28) {
            this.f52381n = i28;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52381n.nr(j.this);
        }
    }

    public interface w6 {
    }

    private synchronized boolean Ik(Throwable th, Map map) {
        if (!this.f52374t && this.rl == Ml.IN_PROGRESS) {
            this.rl = Ml.FAILURE;
            this.f52372O = th;
            this.f52373n = map;
            return true;
        }
        return false;
    }

    public static w6 KN() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean S() {
        boolean z2;
        if (mUb()) {
            z2 = !rl();
        }
        return z2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    private boolean XQ(Object obj, boolean z2) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f52374t && this.rl == Ml.IN_PROGRESS) {
                            if (z2) {
                                this.rl = Ml.SUCCESS;
                                this.J2 = 1.0f;
                            }
                            Object obj4 = this.nr;
                            if (obj4 != obj) {
                                try {
                                    this.nr = obj;
                                    obj2 = obj4;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj4;
                                    throw th;
                                }
                            } else {
                                obj2 = null;
                            }
                            return true;
                        }
                        if (obj != null) {
                            Uo(obj);
                        }
                        return false;
                    } catch (Throwable th2) {
                        obj3 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (obj3 != null) {
                Uo(obj3);
            }
        }
    }

    private synchronized boolean o(float f3) {
        if (!this.f52374t && this.rl == Ml.IN_PROGRESS) {
            if (f3 < this.J2) {
                return false;
            }
            this.J2 = f3;
            return true;
        }
        return false;
    }

    protected boolean HI(Throwable th) {
        return ck(th, null);
    }

    @Override // com.facebook.datasource.w6
    public boolean J2() {
        return false;
    }

    protected void Uo(Object obj) {
    }

    @Override // com.facebook.datasource.w6
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f52374t) {
                    return false;
                }
                this.f52374t = true;
                Object obj = this.nr;
                this.nr = null;
                if (obj != null) {
                    Uo(obj);
                }
                if (!rl()) {
                    qie();
                }
                synchronized (this) {
                    this.Uo.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.datasource.w6
    public synchronized Object getResult() {
        return this.nr;
    }

    public synchronized boolean mUb() {
        return this.f52374t;
    }

    @Override // com.facebook.datasource.w6
    public synchronized boolean n() {
        return this.nr != null;
    }

    @Override // com.facebook.datasource.w6
    public synchronized Throwable nr() {
        return this.f52372O;
    }

    @Override // com.facebook.datasource.w6
    public synchronized boolean rl() {
        return this.rl != Ml.IN_PROGRESS;
    }

    @Override // com.facebook.datasource.w6
    public synchronized float t() {
        return this.J2;
    }

    public synchronized boolean xMQ() {
        return this.rl == Ml.FAILURE;
    }

    protected void az() {
        for (Pair pair : this.Uo) {
            ((Executor) pair.second).execute(new n((I28) pair.first));
        }
    }

    @Override // com.facebook.datasource.w6
    public Map getExtras() {
        return this.f52373n;
    }

    protected void gh(I28 i28, Executor executor, boolean z2, boolean z3) {
        RunnableC0747j runnableC0747j = new RunnableC0747j(z2, i28, z3);
        KN();
        executor.execute(runnableC0747j);
    }

    protected void ty(Map map) {
        this.f52373n = map;
    }

    protected j() {
    }

    private void qie() {
        boolean zXMQ = xMQ();
        boolean zS = S();
        for (Pair pair : this.Uo) {
            gh((I28) pair.first, (Executor) pair.second, zXMQ, zS);
        }
    }

    @Override // com.facebook.datasource.w6
    public void O(I28 i28, Executor executor) {
        boolean z2;
        C.Uo(i28);
        C.Uo(executor);
        synchronized (this) {
            try {
                if (this.f52374t) {
                    return;
                }
                if (this.rl == Ml.IN_PROGRESS) {
                    this.Uo.add(Pair.create(i28, executor));
                }
                if (!n() && !rl() && !S()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    gh(i28, executor, xMQ(), S());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected boolean Z(Object obj, boolean z2, Map map) {
        ty(map);
        boolean zXQ = XQ(obj, z2);
        if (zXQ) {
            qie();
        }
        return zXQ;
    }

    protected boolean ck(Throwable th, Map map) {
        boolean zIk = Ik(th, map);
        if (zIk) {
            qie();
        }
        return zIk;
    }

    protected boolean r(float f3) {
        boolean zO = o(f3);
        if (zO) {
            az();
        }
        return zO;
    }
}
