package jh;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements InterfaceC2342j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f69616t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile InterfaceC2342j f69617n;
    private volatile Object rl = f69616t;

    private static Object rl(Object obj, Object obj2) {
        if (obj == f69616t || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // qp.InterfaceC2342j
    public Object get() {
        Object obj;
        Object obj2 = this.rl;
        Object obj3 = f69616t;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.rl;
                if (obj == obj3) {
                    obj = this.f69617n.get();
                    this.rl = rl(this.rl, obj);
                    this.f69617n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    private j(InterfaceC2342j interfaceC2342j) {
        this.f69617n = interfaceC2342j;
    }

    public static InterfaceC2342j n(InterfaceC2342j interfaceC2342j) {
        Ml.rl(interfaceC2342j);
        if (interfaceC2342j instanceof j) {
            return interfaceC2342j;
        }
        return new j(interfaceC2342j);
    }
}
