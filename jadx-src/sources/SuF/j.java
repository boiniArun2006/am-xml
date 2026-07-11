package SuF;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: SuF.j$j, reason: collision with other inner class name */
    private static class C0346j implements InvocationHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f9996n;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return j.nr(method, this.f9996n.getClass().getClassLoader()).invoke(this.f9996n, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getTargetException();
            } catch (ReflectiveOperationException e3) {
                throw new RuntimeException("Reflection failed for method " + method, e3);
            }
        }

        public C0346j(Object obj) {
            this.f9996n = obj;
        }
    }

    private static boolean O() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static Object n(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static InvocationHandler t(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0346j(obj);
    }

    public static Method nr(Method method, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    public static boolean rl(Collection collection, String str) {
        if (!collection.contains(str)) {
            if (O()) {
                if (!collection.contains(str + ":dev")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
