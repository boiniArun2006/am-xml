package T6s;

import com.google.gson.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class C {

    private static abstract class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f10146n;

        class j extends n {
            final /* synthetic */ Method rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Method method) {
                super();
                this.rl = method;
            }

            @Override // T6s.C.n
            public boolean n(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.rl.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e2) {
                    throw new RuntimeException("Failed invoking canAccess", e2);
                }
            }
        }

        /* JADX INFO: renamed from: T6s.C$n$n, reason: collision with other inner class name */
        class C0354n extends n {
            C0354n() {
                super();
            }

            @Override // T6s.C.n
            public boolean n(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        private n() {
        }

        public abstract boolean n(AccessibleObject accessibleObject, Object obj);

        static {
            n jVar;
            if (Ml.nr()) {
                try {
                    jVar = new j(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    jVar = null;
                }
            } else {
                jVar = null;
            }
            if (jVar == null) {
                jVar = new C0354n();
            }
            f10146n = jVar;
        }
    }

    public static boolean n(AccessibleObject accessibleObject, Object obj) {
        return n.f10146n.n(accessibleObject, obj);
    }

    public static o.j rl(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return o.j.ALLOW;
        }
        android.support.v4.media.j.n(it.next());
        throw null;
    }
}
