package D23;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Ml, IPN.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f1176t = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Ml f1177n;
    private volatile Object rl = f1176t;

    private synchronized Object n() {
        Object obj;
        obj = this.rl;
        if (obj == f1176t) {
            obj = this.f1177n.get();
            this.rl = O(this.rl, obj);
            this.f1177n = null;
        }
        return obj;
    }

    private static Object O(Object obj, Object obj2) {
        if (obj == f1176t || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static IPN.j rl(Ml ml) {
        return ml instanceof IPN.j ? (IPN.j) ml : new j((Ml) w6.rl(ml));
    }

    @Override // qp.InterfaceC2342j
    public Object get() {
        Object obj = this.rl;
        return obj == f1176t ? n() : obj;
    }

    private j(Ml ml) {
        this.f1177n = ml;
    }

    public static InterfaceC2342j nr(InterfaceC2342j interfaceC2342j) {
        return t(I28.n(interfaceC2342j));
    }

    public static Ml t(Ml ml) {
        w6.rl(ml);
        if (ml instanceof j) {
            return ml;
        }
        return new j(ml);
    }
}
