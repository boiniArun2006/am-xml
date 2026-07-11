package wIE;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f74817n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class[] f74818t;

    private static Method rl(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return rl(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private Method n(Class cls) {
        Class cls2;
        String str = this.rl;
        if (str == null) {
            return null;
        }
        Method methodRl = rl(cls, str, this.f74818t);
        if (methodRl == null || (cls2 = this.f74817n) == null || cls2.isAssignableFrom(methodRl.getReturnType())) {
            return methodRl;
        }
        return null;
    }

    public CN3(Class cls, String str, Class... clsArr) {
        this.f74817n = cls;
        this.rl = str;
        this.f74818t = clsArr;
    }

    public Object J2(Object obj, Object... objArr) {
        try {
            return t(obj, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object O(Object obj, Object... objArr) {
        try {
            return nr(obj, objArr);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean Uo(Object obj) {
        if (n(obj.getClass()) != null) {
            return true;
        }
        return false;
    }

    public Object nr(Object obj, Object... objArr) {
        Method methodN = n(obj.getClass());
        if (methodN == null) {
            return null;
        }
        try {
            return methodN.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object t(Object obj, Object... objArr) {
        Method methodN = n(obj.getClass());
        if (methodN != null) {
            try {
                return methodN.invoke(obj, objArr);
            } catch (IllegalAccessException e2) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodN);
                assertionError.initCause(e2);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.rl + " not supported for object " + obj);
    }
}
