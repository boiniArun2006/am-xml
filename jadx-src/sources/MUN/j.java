package MUN;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final n f6610n;

    private static class Ml extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Method f6611n;
        private final Method nr;
        private final Method rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Method f6612t;

        private Ml() throws NoSuchMethodException {
            super();
            this.f6611n = Class.class.getMethod("isRecord", new Class[0]);
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.rl = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f6612t = componentType.getMethod("getName", new Class[0]);
            this.nr = componentType.getMethod("getType", new Class[0]);
        }

        @Override // MUN.j.n
        boolean nr(Class cls) {
            try {
                return ((Boolean) this.f6611n.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e2) {
                throw j.nr(e2);
            }
        }

        @Override // MUN.j.n
        public Constructor rl(Class cls) {
            try {
                Object[] objArr = (Object[]) this.rl.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    clsArr[i2] = (Class) this.nr.invoke(objArr[i2], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e2) {
                throw j.nr(e2);
            }
        }

        @Override // MUN.j.n
        String[] t(Class cls) {
            try {
                Object[] objArr = (Object[]) this.rl.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    strArr[i2] = (String) this.f6612t.invoke(objArr[i2], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e2) {
                throw j.nr(e2);
            }
        }

        @Override // MUN.j.n
        public Method n(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e2) {
                throw j.nr(e2);
            }
        }
    }

    private static abstract class n {
        private n() {
        }

        public abstract Method n(Class cls, Field field);

        abstract boolean nr(Class cls);

        abstract Constructor rl(Class cls);

        abstract String[] t(Class cls);
    }

    private static class w6 extends n {
        private w6() {
            super();
        }

        @Override // MUN.j.n
        boolean nr(Class cls) {
            return false;
        }

        @Override // MUN.j.n
        public Method n(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // MUN.j.n
        Constructor rl(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // MUN.j.n
        String[] t(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }

    static {
        n w6Var;
        try {
            w6Var = new Ml();
        } catch (NoSuchMethodException unused) {
            w6Var = new w6();
        }
        f6610n = w6Var;
    }

    public static String az(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e2) {
            return "Failed making constructor '" + t(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage();
        }
    }

    public static void qie(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            throw new JsonIOException("Failed making " + Uo(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e2);
        }
    }

    public static String J2(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static Method KN(Class cls, Field field) {
        return f6610n.n(cls, field);
    }

    public static RuntimeException O(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String Uo(AccessibleObject accessibleObject, boolean z2) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + J2((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            rl(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + t((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z2 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static boolean gh(Class cls) {
        return f6610n.nr(cls);
    }

    public static String[] mUb(Class cls) {
        return f6610n.t(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException nr(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    private static void rl(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i2].getSimpleName());
        }
        sb.append(')');
    }

    public static String t(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        rl(constructor, sb);
        return sb.toString();
    }

    public static Constructor xMQ(Class cls) {
        return f6610n.rl(cls);
    }
}
