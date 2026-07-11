package wqP;

import com.caoccao.javet.values.reference.V8ValueObject;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.lej;
import com.google.firebase.firestore.nKK;
import com.google.firebase.firestore.u;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ConcurrentMap f75130n = new ConcurrentHashMap();

    private static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f75132n;
        private final boolean nr;
        private final Constructor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f75133t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Map f75131O = new HashMap();
        private final Map Uo = new HashMap();
        private final Map J2 = new HashMap();
        private final Map KN = new HashMap();
        private final HashSet xMQ = new HashSet();
        private final HashSet mUb = new HashSet();

        private Type HI(Type type, Map map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = (Type) map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException("Could not resolve type " + type);
        }

        private void J2(Method method) {
            if (method.isAnnotationPresent(nKK.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != Timestamp.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.xMQ.add(ty(method));
            }
            if (method.isAnnotationPresent(com.google.firebase.firestore.w6.class)) {
                mUb("Method", "returns", method.getReturnType());
                this.mUb.add(ty(method));
            }
        }

        private void O(Field field) {
            if (field.isAnnotationPresent(nKK.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != Timestamp.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.xMQ.add(az(field));
            }
            if (field.isAnnotationPresent(com.google.firebase.firestore.w6.class)) {
                mUb("Field", V8ValueObject.METHOD_PREFIX_IS, field.getType());
                this.mUb.add(az(field));
            }
        }

        private void Uo(Method method) {
            if (method.isAnnotationPresent(nKK.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            }
            if (method.isAnnotationPresent(com.google.firebase.firestore.w6.class)) {
                mUb("Method", "accepts", method.getParameterTypes()[0]);
                this.mUb.add(ty(method));
            }
        }

        private static String ck(String str) {
            String[] strArr = {"get", "set", V8ValueObject.METHOD_PREFIX_IS};
            String str2 = null;
            for (int i2 = 0; i2 < 3; i2++) {
                String str3 = strArr[i2];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i3 = 0; i3 < charArray.length && Character.isUpperCase(charArray[i3]); i3++) {
                charArray[i3] = Character.toLowerCase(charArray[i3]);
            }
            return new String(charArray);
        }

        private void mUb(String str, String str2, Type type) {
            if (type == String.class || type == com.google.firebase.firestore.CN3.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
        }

        private static String nr(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(com.google.firebase.firestore.r.class)) {
                return ((com.google.firebase.firestore.r) accessibleObject.getAnnotation(com.google.firebase.firestore.r.class)).value();
            }
            return null;
        }

        private void qie(Map map, n nVar, Object obj, HashSet hashSet) {
            for (String str : this.mUb) {
                if (hashSet.contains(str)) {
                    throw new RuntimeException("'" + str + "' was found from document " + nVar.rl.gh() + ", cannot apply @DocumentId on this property for class " + this.f75132n.getName());
                }
                w6 w6VarN = nVar.f75134n.n(str);
                if (this.Uo.containsKey(str)) {
                    Method method = (Method) this.Uo.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw o.Ik(w6VarN, "Setter does not have exactly one parameter");
                    }
                    if (HI(genericParameterTypes[0], map) == String.class) {
                        wqP.j.n(method, obj, nVar.rl.mUb());
                    } else {
                        wqP.j.n(method, obj, nVar.rl);
                    }
                } else {
                    Field field = (Field) this.KN.get(str);
                    try {
                        if (field.getType() == String.class) {
                            field.set(obj, nVar.rl.mUb());
                        } else {
                            field.set(obj, nVar.rl);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }

        private void t(String str) {
            Map map = this.f75131O;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        Object KN(Map map, Map map2, n nVar) {
            Constructor constructor = this.rl;
            if (constructor == null) {
                throw o.Ik(nVar.f75134n, "Class " + this.f75132n.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped");
            }
            Object objRl = wqP.j.rl(constructor);
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                w6 w6VarN = nVar.f75134n.n(str);
                if (this.Uo.containsKey(str)) {
                    Method method = (Method) this.Uo.get(str);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length != 1) {
                        throw o.Ik(w6VarN, "Setter does not have exactly one parameter");
                    }
                    wqP.j.n(method, objRl, o.S(entry.getValue(), HI(genericParameterTypes[0], map2), nVar.n(w6VarN)));
                    hashSet.add(str);
                } else if (this.KN.containsKey(str)) {
                    Field field = (Field) this.KN.get(str);
                    try {
                        field.set(objRl, o.S(entry.getValue(), HI(field.getGenericType(), map2), nVar.n(w6VarN)));
                        hashSet.add(str);
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    String str2 = "No setter/field for " + str + " found on class " + this.f75132n.getName();
                    if (this.f75131O.containsKey(str.toLowerCase(Locale.US))) {
                        str2 = str2 + " (fields/setters are case sensitive!)";
                    }
                    if (this.f75133t) {
                        throw new RuntimeException(str2);
                    }
                    if (this.nr) {
                        QJ.nr(o.class.getSimpleName(), "%s", str2);
                    }
                }
            }
            qie(map2, nVar, objRl, hashSet);
            return objRl;
        }

        Object xMQ(Map map, n nVar) {
            return KN(map, Collections.EMPTY_MAP, nVar);
        }

        j(Class cls) {
            Constructor declaredConstructor;
            this.f75132n = cls;
            this.f75133t = cls.isAnnotationPresent(u.class);
            this.nr = !cls.isAnnotationPresent(com.google.firebase.firestore.l3D.class);
            try {
                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            this.rl = declaredConstructor;
            for (Method method : cls.getMethods()) {
                if (r(method)) {
                    String strTy = ty(method);
                    t(strTy);
                    method.setAccessible(true);
                    if (!this.J2.containsKey(strTy)) {
                        this.J2.put(strTy, method);
                        J2(method);
                    } else {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                }
            }
            for (Field field : cls.getFields()) {
                if (Ik(field)) {
                    t(az(field));
                    O(field);
                }
            }
            HashMap map = new HashMap();
            Class superclass = cls;
            do {
                for (Method method2 : superclass.getDeclaredMethods()) {
                    if (o(method2)) {
                        String strTy2 = ty(method2);
                        String str = (String) this.f75131O.get(strTy2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else if (str.equals(strTy2)) {
                            if (method2.isBridge()) {
                                map.put(strTy2, method2);
                            } else {
                                Method method3 = (Method) this.Uo.get(strTy2);
                                Method method4 = (Method) map.get(strTy2);
                                if (method3 == null) {
                                    method2.setAccessible(true);
                                    this.Uo.put(strTy2, method2);
                                    Uo(method2);
                                } else if (!gh(method2, method3) && (method4 == null || !gh(method2, method4))) {
                                    if (superclass == cls) {
                                        throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                    }
                                    throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                                }
                            }
                        } else {
                            throw new RuntimeException("Found setter on " + superclass.getName() + " with invalid case-sensitive name: " + method2.getName());
                        }
                    }
                }
                for (Field field2 : superclass.getDeclaredFields()) {
                    String strAz = az(field2);
                    if (this.f75131O.containsKey(strAz.toLowerCase(Locale.US)) && !this.KN.containsKey(strAz)) {
                        field2.setAccessible(true);
                        this.KN.put(strAz, field2);
                        O(field2);
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    break;
                }
            } while (!superclass.equals(Object.class));
            if (!this.f75131O.isEmpty()) {
                for (String str2 : this.mUb) {
                    if (!this.Uo.containsKey(str2) && !this.KN.containsKey(str2)) {
                        throw new RuntimeException("@DocumentId is annotated on property " + str2 + " of class " + cls.getName() + " but no field or public setter was found");
                    }
                }
                return;
            }
            throw new RuntimeException("No properties to serialize found on class " + cls.getName());
        }

        private static boolean Ik(Field field) {
            if (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(com.google.firebase.firestore.aC.class)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String az(Field field) {
            String strNr = nr(field);
            if (strNr != null) {
                return strNr;
            }
            return field.getName();
        }

        private static boolean gh(Method method, Method method2) {
            boolean z2;
            boolean z3;
            o.aYN(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            o.aYN(returnType.equals(cls), "Expected void return type");
            o.aYN(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            if (parameterTypes.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            o.aYN(z2, "Expected exactly one parameter");
            if (parameterTypes2.length == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            o.aYN(z3, "Expected exactly one parameter");
            if (!method.getName().equals(method2.getName()) || !parameterTypes[0].equals(parameterTypes2[0])) {
                return false;
            }
            return true;
        }

        private static boolean o(Method method) {
            if (!method.getName().startsWith("set") || method.getDeclaringClass().equals(Object.class) || Modifier.isStatic(method.getModifiers()) || !method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 1 || method.isAnnotationPresent(com.google.firebase.firestore.aC.class)) {
                return false;
            }
            return true;
        }

        private static boolean r(Method method) {
            if ((!method.getName().startsWith("get") && !method.getName().startsWith(V8ValueObject.METHOD_PREFIX_IS)) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isBridge() || method.isAnnotationPresent(com.google.firebase.firestore.aC.class)) {
                return false;
            }
            return true;
        }

        private static String ty(Method method) {
            String strNr = nr(method);
            if (strNr != null) {
                return strNr;
            }
            return ck(method.getName());
        }
    }

    static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final w6 f75134n;
        final com.google.firebase.firestore.CN3 rl;

        n n(w6 w6Var) {
            return new n(w6Var, this.rl);
        }

        n(w6 w6Var, com.google.firebase.firestore.CN3 cn3) {
            this.f75134n = w6Var;
            this.rl = cn3;
        }
    }

    static class w6 {
        static final w6 nr = new w6(null, null, 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f75135n;
        private final w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f75136t;

        w6 n(String str) {
            return new w6(this, str, this.f75135n + 1);
        }

        int rl() {
            return this.f75135n;
        }

        public String toString() {
            int i2 = this.f75135n;
            if (i2 == 0) {
                return "";
            }
            if (i2 == 1) {
                return this.f75136t;
            }
            return this.rl.toString() + "." + this.f75136t;
        }

        w6(w6 w6Var, String str, int i2) {
            this.rl = w6Var;
            this.f75136t = str;
            this.f75135n = i2;
        }
    }

    public static Object HI(Object obj, Class cls, com.google.firebase.firestore.CN3 cn3) {
        return r(obj, cls, new n(w6.nr, cn3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException Ik(w6 w6Var, String str) {
        String str2 = "Could not deserialize object. " + str;
        if (w6Var.rl() > 0) {
            str2 = str2 + " (found in field '" + w6Var.toString() + "')";
        }
        return new RuntimeException(str2);
    }

    private static Boolean J2(Object obj, n nVar) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to boolean");
    }

    private static com.google.firebase.firestore.CN3 KN(Object obj, n nVar) {
        if (obj instanceof com.google.firebase.firestore.CN3) {
            return (com.google.firebase.firestore.CN3) obj;
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to DocumentReference");
    }

    private static com.google.firebase.firestore.j O(Object obj, n nVar) {
        if (obj instanceof com.google.firebase.firestore.j) {
            return (com.google.firebase.firestore.j) obj;
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to Blob");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object S(Object obj, Type type, n nVar) {
        if (obj == null) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return Z(obj, (ParameterizedType) type, nVar);
        }
        if (type instanceof Class) {
            return r(obj, (Class) type, nVar);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length > 0) {
                throw Ik(nVar.f75134n, "Generic lower-bounded wildcard types are not supported");
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            aYN(upperBounds.length > 0, "Unexpected type bounds on wildcard " + type);
            return S(obj, upperBounds[0], nVar);
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            aYN(bounds.length > 0, "Unexpected type bounds on type variable " + type);
            return S(obj, bounds[0], nVar);
        }
        if (type instanceof GenericArrayType) {
            throw Ik(nVar.f75134n, "Generic Arrays are not supported, please use Lists instead");
        }
        throw Ik(nVar.f75134n, "Unknown type encountered: " + type);
    }

    private static Date Uo(Object obj, n nVar) {
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Timestamp) {
            return ((Timestamp) obj).toDate();
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to Date");
    }

    private static j ViF(Class cls) {
        ConcurrentMap concurrentMap = f75130n;
        j jVar = (j) concurrentMap.get(cls);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(cls);
        concurrentMap.put(cls, jVar2);
        return jVar2;
    }

    private static Map WPU(Object obj, n nVar) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw Ik(nVar.f75134n, "Expected a Map while deserializing, but got a " + obj.getClass());
    }

    private static Object XQ(Object obj, Class cls, n nVar) {
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            return gh(obj, nVar);
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            return J2(obj, nVar);
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return xMQ(obj, nVar);
        }
        if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
            return qie(obj, nVar);
        }
        if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(xMQ(obj, nVar).floatValue());
        }
        throw Ik(nVar.f75134n, String.format("Deserializing values to %s is not supported", cls.getSimpleName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void aYN(boolean z2, String str) {
        if (z2) {
            return;
        }
        throw new RuntimeException("Hard assert failed: " + str);
    }

    private static String az(Object obj, n nVar) {
        if (obj instanceof String) {
            return (String) obj;
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to String");
    }

    private static lej ck(Object obj, n nVar) {
        if (obj instanceof lej) {
            return (lej) obj;
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to VectorValue");
    }

    private static Integer gh(Object obj, n nVar) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            throw Ik(nVar.f75134n, "Failed to convert a value of type " + obj.getClass().getName() + " to int");
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue();
        if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
            return Integer.valueOf(number.intValue());
        }
        throw Ik(nVar.f75134n, "Numeric value out of 32-bit integer range: " + dDoubleValue + ". Did you mean to use a long or double instead of an int?");
    }

    private static com.google.firebase.firestore.QJ mUb(Object obj, n nVar) {
        if (obj instanceof com.google.firebase.firestore.QJ) {
            return (com.google.firebase.firestore.QJ) obj;
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to GeoPoint");
    }

    private static Object o(Object obj, Class cls, n nVar) {
        if (!(obj instanceof String)) {
            throw Ik(nVar.f75134n, "Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
        }
        String name = (String) obj;
        Field[] fields = cls.getFields();
        int length = fields.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                Field field = fields[i2];
                if (field.isEnumConstant() && name.equals(j.az(field))) {
                    name = field.getName();
                    break;
                }
                i2++;
            }
        }
        try {
            return Enum.valueOf(cls, name);
        } catch (IllegalArgumentException unused) {
            throw Ik(nVar.f75134n, "Could not find enum value of " + cls.getName() + " for value \"" + name + "\"");
        }
    }

    private static Long qie(Object obj, n nVar) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw Ik(nVar.f75134n, "Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d2 = (Double) obj;
        if (d2.doubleValue() >= -9.223372036854776E18d && d2.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d2.longValue());
        }
        throw Ik(nVar.f75134n, "Numeric value out of 64-bit long range: " + d2 + ". Did you mean to use a double instead of a long?");
    }

    private static Object r(Object obj, Class cls, n nVar) {
        if (obj == null) {
            return null;
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            return XQ(obj, cls, nVar);
        }
        if (String.class.isAssignableFrom(cls)) {
            return az(obj, nVar);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return Uo(obj, nVar);
        }
        if (Timestamp.class.isAssignableFrom(cls)) {
            return ty(obj, nVar);
        }
        if (com.google.firebase.firestore.j.class.isAssignableFrom(cls)) {
            return O(obj, nVar);
        }
        if (com.google.firebase.firestore.QJ.class.isAssignableFrom(cls)) {
            return mUb(obj, nVar);
        }
        if (com.google.firebase.firestore.CN3.class.isAssignableFrom(cls)) {
            return KN(obj, nVar);
        }
        if (lej.class.isAssignableFrom(cls)) {
            return ck(obj, nVar);
        }
        if (cls.isArray()) {
            throw Ik(nVar.f75134n, "Converting to Arrays is not supported, please use Lists instead");
        }
        if (cls.getTypeParameters().length <= 0) {
            return cls.equals(Object.class) ? obj : cls.isEnum() ? o(obj, cls, nVar) : nr(obj, cls, nVar);
        }
        throw Ik(nVar.f75134n, "Class " + cls.getName() + " has generic type parameters");
    }

    private static Timestamp ty(Object obj, n nVar) {
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp((Date) obj);
        }
        throw Ik(nVar.f75134n, "Failed to convert value of type " + obj.getClass().getName() + " to Timestamp");
    }

    private static Double xMQ(Object obj, n nVar) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw Ik(nVar.f75134n, "Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l2 = (Long) obj;
        Double dValueOf = Double.valueOf(l2.doubleValue());
        if (dValueOf.longValue() == l2.longValue()) {
            return dValueOf;
        }
        throw Ik(nVar.f75134n, "Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    private static Object Z(Object obj, ParameterizedType parameterizedType, n nVar) {
        Class cls = (Class) parameterizedType.getRawType();
        int i2 = 0;
        if (List.class.isAssignableFrom(cls)) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                while (i2 < list.size()) {
                    arrayList.add(S(list.get(i2), type, nVar.n(nVar.f75134n.n("[" + i2 + "]"))));
                    i2++;
                }
                return arrayList;
            }
            throw Ik(nVar.f75134n, "Expected a List, but got a " + obj.getClass());
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (type2.equals(String.class)) {
                Map mapWPU = WPU(obj, nVar);
                HashMap map = new HashMap();
                for (Map.Entry entry : mapWPU.entrySet()) {
                    map.put((String) entry.getKey(), S(entry.getValue(), type3, nVar.n(nVar.f75134n.n((String) entry.getKey()))));
                }
                return map;
            }
            throw Ik(nVar.f75134n, "Only Maps with string keys are supported, but found Map with key type " + type2);
        }
        if (!Collection.class.isAssignableFrom(cls)) {
            Map mapWPU2 = WPU(obj, nVar);
            j jVarViF = ViF(cls);
            HashMap map2 = new HashMap();
            TypeVariable[] typeParameters = jVarViF.f75132n.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == typeParameters.length) {
                while (i2 < typeParameters.length) {
                    map2.put(typeParameters[i2], actualTypeArguments[i2]);
                    i2++;
                }
                return jVarViF.KN(mapWPU2, map2, nVar);
            }
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        throw Ik(nVar.f75134n, "Collections are not supported, please use Lists instead");
    }

    private static Object nr(Object obj, Class cls, n nVar) {
        j jVarViF = ViF(cls);
        if (obj instanceof Map) {
            return jVarViF.xMQ(WPU(obj, nVar), nVar);
        }
        throw Ik(nVar.f75134n, "Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
    }
}
