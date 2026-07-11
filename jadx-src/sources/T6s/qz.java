package T6s;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f10183n = t();

    class Ml extends qz {
        @Override // T6s.qz
        public Object nr(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }

        Ml() {
        }
    }

    class j extends qz {
        final /* synthetic */ Method rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f10184t;

        j(Method method, Object obj) {
            this.rl = method;
            this.f10184t = obj;
        }

        @Override // T6s.qz
        public Object nr(Class cls) {
            qz.rl(cls);
            return this.rl.invoke(this.f10184t, cls);
        }
    }

    class n extends qz {
        final /* synthetic */ Method rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f10185t;

        n(Method method, int i2) {
            this.rl = method;
            this.f10185t = i2;
        }

        @Override // T6s.qz
        public Object nr(Class cls) {
            qz.rl(cls);
            return this.rl.invoke(null, cls, Integer.valueOf(this.f10185t));
        }
    }

    class w6 extends qz {
        final /* synthetic */ Method rl;

        w6(Method method) {
            this.rl = method;
        }

        @Override // T6s.qz
        public Object nr(Class cls) {
            qz.rl(cls);
            return this.rl.invoke(null, cls, Object.class);
        }
    }

    public abstract Object nr(Class cls);

    private static qz t() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new j(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new Ml();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new w6(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new n(declaredMethod3, iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void rl(Class cls) {
        String strN = T6s.w6.n(cls);
        if (strN == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strN);
    }
}
