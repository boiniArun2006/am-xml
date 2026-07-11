package CKP;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class s4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s4 f903n = new s4();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum j {
        NONE("none"),
        V1("Android-GPBL-V1"),
        V2_V4("Android-GPBL-V2-V4"),
        V5_V7("Android-GPBL-V5-V7");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f908n;

        public final String rl() {
            return this.f908n;
        }

        j(String str) {
            this.f908n = str;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum n {
        INAPP("inapp"),
        SUBS("subs");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f911n;

        public final String rl() {
            return this.f911n;
        }

        n(String str) {
            this.f911n = str;
        }
    }

    public static final Object O(Class clazz, Method method, Object obj, Object... objArr) {
        if (VmF.j.nr(s4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(objArr, pTYaLzzmJSGAPQ.ZctdEeiwxd);
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, s4.class);
            return null;
        }
    }

    public static final Class n(String className) {
        if (VmF.j.nr(s4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, s4.class);
            return null;
        }
    }

    public static final Method nr(Class clazz, String methodName, Class... args) {
        if (VmF.j.nr(s4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, s4.class);
            return null;
        }
    }

    public static final Class rl(Context context, String className) {
        if (VmF.j.nr(s4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, s4.class);
            return null;
        }
    }

    public static final Method t(Class clazz, String methodName, Class... args) {
        if (VmF.j.nr(s4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, s4.class);
            return null;
        }
    }

    private s4() {
    }
}
