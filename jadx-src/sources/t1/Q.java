package t1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import t1.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Q {

    static class j implements UGc, Serializable {
        transient Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        volatile transient boolean f73403O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private transient Object f73404n = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final UGc f73405t;

        @Override // t1.UGc
        public Object get() {
            if (!this.f73403O) {
                synchronized (this.f73404n) {
                    try {
                        if (!this.f73403O) {
                            Object obj = this.f73405t.get();
                            this.J2 = obj;
                            this.f73403O = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return aC.n(this.J2);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.f73403O) {
                obj = "<supplier that returned " + this.J2 + ">";
            } else {
                obj = this.f73405t;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        j(UGc uGc) {
            this.f73405t = (UGc) Xo.HI(uGc);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f73404n = new Object();
        }
    }

    static class n implements UGc {
        private static final UGc J2 = new UGc() { // from class: t1.r
            @Override // t1.UGc
            public final Object get() {
                return Q.n.n();
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Object f73406O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f73407n = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private volatile UGc f73408t;

        public static /* synthetic */ Void n() {
            throw new IllegalStateException();
        }

        @Override // t1.UGc
        public Object get() {
            UGc uGc = this.f73408t;
            UGc uGc2 = J2;
            if (uGc != uGc2) {
                synchronized (this.f73407n) {
                    try {
                        if (this.f73408t != uGc2) {
                            Object obj = this.f73408t.get();
                            this.f73406O = obj;
                            this.f73408t = uGc2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return aC.n(this.f73406O);
        }

        public String toString() {
            Object obj = this.f73408t;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == J2) {
                obj = "<supplier that returned " + this.f73406O + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        n(UGc uGc) {
            this.f73408t = (UGc) Xo.HI(uGc);
        }
    }

    private static class w6 implements UGc, Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f73409n;

        public boolean equals(Object obj) {
            if (obj instanceof w6) {
                return C.n(this.f73409n, ((w6) obj).f73409n);
            }
            return false;
        }

        @Override // t1.UGc
        public Object get() {
            return this.f73409n;
        }

        public int hashCode() {
            return C.rl(this.f73409n);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f73409n + ")";
        }

        w6(Object obj) {
            this.f73409n = obj;
        }
    }

    public static UGc n(UGc uGc) {
        return ((uGc instanceof n) || (uGc instanceof j)) ? uGc : uGc instanceof Serializable ? new j(uGc) : new n(uGc);
    }

    public static UGc rl(Object obj) {
        return new w6(obj);
    }
}
