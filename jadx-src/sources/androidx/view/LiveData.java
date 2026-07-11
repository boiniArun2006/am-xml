package androidx.view;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.view.Lifecycle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class LiveData<T> {
    static final Object gh = new Object();
    volatile Object J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile Object f38912O;
    private int Uo;
    private final Runnable mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Object f38913n;
    private boolean nr;
    private SafeIterableMap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f38914t;
    private boolean xMQ;

    private class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean O() {
            return true;
        }

        AlwaysActiveObserver(Observer observer) {
            super(observer);
        }
    }

    class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final LifecycleOwner f38918r;

        LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.f38918r = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean O() {
            return this.f38918r.getLifecycle().rl().rl(Lifecycle.State.J2);
        }

        @Override // androidx.view.LifecycleEventObserver
        public void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State stateRl = this.f38918r.getLifecycle().rl();
            if (stateRl == Lifecycle.State.f38882n) {
                LiveData.this.HI(this.f38920n);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateRl) {
                n(O());
                state = stateRl;
                stateRl = this.f38918r.getLifecycle().rl();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean nr(LifecycleOwner lifecycleOwner) {
            return this.f38918r == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        void t() {
            this.f38918r.getLifecycle().nr(this);
        }
    }

    private abstract class ObserverWrapper {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f38919O = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Observer f38920n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f38921t;

        abstract boolean O();

        boolean nr(LifecycleOwner lifecycleOwner) {
            return false;
        }

        void t() {
        }

        ObserverWrapper(Observer observer) {
            this.f38920n = observer;
        }

        void n(boolean z2) {
            if (z2 == this.f38921t) {
                return;
            }
            this.f38921t = z2;
            LiveData.this.t(z2 ? 1 : -1);
            if (this.f38921t) {
                LiveData.this.O(this);
            }
        }
    }

    public LiveData(Object obj) {
        this.f38913n = new Object();
        this.rl = new SafeIterableMap();
        this.f38914t = 0;
        this.J2 = gh;
        this.mUb = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                synchronized (LiveData.this.f38913n) {
                    obj2 = LiveData.this.J2;
                    LiveData.this.J2 = LiveData.gh;
                }
                LiveData.this.ck(obj2);
            }
        };
        this.f38912O = obj;
        this.Uo = 0;
    }

    protected void az() {
    }

    protected void qie() {
    }

    private void nr(ObserverWrapper observerWrapper) {
        if (observerWrapper.f38921t) {
            if (!observerWrapper.O()) {
                observerWrapper.n(false);
                return;
            }
            int i2 = observerWrapper.f38919O;
            int i3 = this.Uo;
            if (i2 >= i3) {
                return;
            }
            observerWrapper.f38919O = i3;
            observerWrapper.f38920n.onChanged(this.f38912O);
        }
    }

    public void HI(Observer observer) {
        rl("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.rl.KN(observer);
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.t();
        observerWrapper.n(false);
    }

    public Object J2() {
        Object obj = this.f38912O;
        if (obj != gh) {
            return obj;
        }
        return null;
    }

    public boolean KN() {
        return this.f38914t > 0;
    }

    void O(ObserverWrapper observerWrapper) {
        if (this.KN) {
            this.xMQ = true;
            return;
        }
        this.KN = true;
        do {
            this.xMQ = false;
            if (observerWrapper != null) {
                nr(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap.IteratorWithAdditions iteratorWithAdditionsNr = this.rl.nr();
                while (iteratorWithAdditionsNr.hasNext()) {
                    nr((ObserverWrapper) iteratorWithAdditionsNr.next().getValue());
                    if (this.xMQ) {
                        break;
                    }
                }
            }
        } while (this.xMQ);
        this.KN = false;
    }

    int Uo() {
        return this.Uo;
    }

    protected void ck(Object obj) {
        rl("setValue");
        this.Uo++;
        this.f38912O = obj;
        O(null);
    }

    public void gh(Observer observer) {
        rl("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.rl.Uo(observer, alwaysActiveObserver);
        if (observerWrapper instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        alwaysActiveObserver.n(true);
    }

    public void mUb(LifecycleOwner lifecycleOwner, Observer observer) {
        rl("observe");
        if (lifecycleOwner.getLifecycle().rl() == Lifecycle.State.f38882n) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.rl.Uo(observer, lifecycleBoundObserver);
        if (observerWrapper != null && !observerWrapper.nr(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        lifecycleOwner.getLifecycle().n(lifecycleBoundObserver);
    }

    void t(int i2) {
        int i3 = this.f38914t;
        this.f38914t = i2 + i3;
        if (this.nr) {
            return;
        }
        this.nr = true;
        while (true) {
            try {
                int i5 = this.f38914t;
                if (i3 == i5) {
                    this.nr = false;
                    return;
                }
                boolean z2 = i3 == 0 && i5 > 0;
                boolean z3 = i3 > 0 && i5 == 0;
                if (z2) {
                    qie();
                } else if (z3) {
                    az();
                }
                i3 = i5;
            } catch (Throwable th) {
                this.nr = false;
                throw th;
            }
        }
    }

    protected void ty(Object obj) {
        boolean z2;
        synchronized (this.f38913n) {
            z2 = this.J2 == gh;
            this.J2 = obj;
        }
        if (z2) {
            ArchTaskExecutor.KN().nr(this.mUb);
        }
    }

    public boolean xMQ() {
        return this.f38912O != gh;
    }

    static void rl(String str) {
        if (ArchTaskExecutor.KN().t()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public LiveData() {
        this.f38913n = new Object();
        this.rl = new SafeIterableMap();
        this.f38914t = 0;
        Object obj = gh;
        this.J2 = obj;
        this.mUb = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                synchronized (LiveData.this.f38913n) {
                    obj2 = LiveData.this.J2;
                    LiveData.this.J2 = LiveData.gh;
                }
                LiveData.this.ck(obj2);
            }
        };
        this.f38912O = obj;
        this.Uo = -1;
    }
}
