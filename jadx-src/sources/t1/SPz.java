package t1;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f73411n;
    private static final Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Method f73412t;

    private static Method nr(Object obj) {
        try {
            Method methodT = t("getStackTraceDepth", Throwable.class);
            if (methodT == null) {
                return null;
            }
            methodT.invoke(obj, new Throwable());
            return methodT;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object rl() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method t(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String O(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Method n() {
        return t("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    static {
        Method methodN;
        Object objRl = rl();
        f73411n = objRl;
        Method methodNr = null;
        if (objRl == null) {
            methodN = null;
        } else {
            methodN = n();
        }
        rl = methodN;
        if (objRl != null) {
            methodNr = nr(objRl);
        }
        f73412t = methodNr;
    }

    public static void J2(Throwable th) {
        Xo.HI(th);
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            } else {
                throw ((Error) th);
            }
        }
        throw ((RuntimeException) th);
    }
}
