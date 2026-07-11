package io.grpc.internal;

import com.safedk.android.analytics.brandsafety.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class xuv implements O {
    private static final RuntimeException J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Method f68820O;
    private static final Object[] Uo;
    private static final Method nr;
    private static final Logger rl = Logger.getLogger(xuv.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Constructor f68821t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f68822n;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        int i2;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod(l.f62657l, Long.TYPE);
            try {
                i2 = 0;
                method2 = cls.getMethod("sum", new Class[0]);
            } catch (Throwable th) {
                th = th;
                method2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
            method2 = null;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i2 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i2];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i2++;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            rl.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
        }
        if (th != null || constructor == null) {
            f68821t = null;
            nr = null;
            f68820O = null;
            J2 = new RuntimeException(th);
        } else {
            f68821t = constructor;
            nr = method;
            f68820O = method2;
            J2 = null;
        }
        Uo = new Object[]{1L};
    }

    static boolean rl() {
        return J2 == null;
    }

    @Override // io.grpc.internal.O
    public void n(long j2) {
        try {
            nr.invoke(this.f68822n, j2 == 1 ? Uo : new Object[]{Long.valueOf(j2)});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    xuv() {
        RuntimeException runtimeException = J2;
        if (runtimeException == null) {
            try {
                this.f68822n = f68821t.newInstance(new Object[0]);
                return;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        throw runtimeException;
    }
}
