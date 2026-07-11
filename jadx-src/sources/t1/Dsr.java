package t1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Dsr {

    public static final class n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f73389O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f73390n;
        private boolean nr;
        private final C1175n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private C1175n f73391t;

        private static final class j extends C1175n {
            private j() {
            }
        }

        public n az() {
            this.nr = true;
            return this;
        }

        /* JADX INFO: renamed from: t1.Dsr$n$n, reason: collision with other inner class name */
        static class C1175n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            String f73392n;
            Object rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            C1175n f73393t;

            C1175n() {
            }
        }

        private n(String str) {
            C1175n c1175n = new C1175n();
            this.rl = c1175n;
            this.f73391t = c1175n;
            this.nr = false;
            this.f73389O = false;
            this.f73390n = (String) Xo.HI(str);
        }

        private C1175n J2() {
            C1175n c1175n = new C1175n();
            this.f73391t.f73393t = c1175n;
            this.f73391t = c1175n;
            return c1175n;
        }

        private static boolean qie(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof o ? !((o) obj).t() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        private j xMQ() {
            j jVar = new j();
            this.f73391t.f73393t = jVar;
            this.f73391t = jVar;
            return jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            boolean z2 = this.nr;
            boolean z3 = this.f73389O;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f73390n);
            sb.append('{');
            String str = "";
            for (C1175n c1175n = this.rl.f73393t; c1175n != null; c1175n = c1175n.f73393t) {
                Object obj = c1175n.rl;
                if (c1175n instanceof j) {
                    sb.append(str);
                    String str2 = c1175n.f73392n;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                } else if (obj == null) {
                    if (!z2) {
                    }
                } else if (!z3 || !qie(obj)) {
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private n KN(String str, Object obj) {
            C1175n c1175nJ2 = J2();
            c1175nJ2.rl = obj;
            c1175nJ2.f73392n = (String) Xo.HI(str);
            return this;
        }

        private n Uo(Object obj) {
            J2().rl = obj;
            return this;
        }

        private n mUb(String str, Object obj) {
            j jVarXMQ = xMQ();
            jVarXMQ.rl = obj;
            jVarXMQ.f73392n = (String) Xo.HI(str);
            return this;
        }

        public n O(String str, boolean z2) {
            return mUb(str, String.valueOf(z2));
        }

        public n gh(Object obj) {
            return Uo(obj);
        }

        public n n(String str, double d2) {
            return mUb(str, String.valueOf(d2));
        }

        public n nr(String str, Object obj) {
            return KN(str, obj);
        }

        public n rl(String str, int i2) {
            return mUb(str, String.valueOf(i2));
        }

        public n t(String str, long j2) {
            return mUb(str, String.valueOf(j2));
        }
    }

    public static Object n(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static n rl(Class cls) {
        return new n(cls.getSimpleName());
    }

    public static n t(Object obj) {
        return new n(obj.getClass().getSimpleName());
    }
}
