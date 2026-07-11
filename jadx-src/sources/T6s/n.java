package T6s;

import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Type[] f10172n = new Type[0];

    private static final class j implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Type f10173n;

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && n.J2(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f10173n;
        }

        public int hashCode() {
            return this.f10173n.hashCode();
        }

        public String toString() {
            return n.Z(this.f10173n) + "[]";
        }

        public j(Type type) {
            Objects.requireNonNull(type);
            this.f10173n = n.rl(type);
        }
    }

    /* JADX INFO: renamed from: T6s.n$n, reason: collision with other inner class name */
    private static final class C0355n implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Type[] f10174O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Type f10175n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Type f10176t;

        private static int n(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && n.J2(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f10174O.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f10175n;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f10176t;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f10174O) ^ this.f10176t.hashCode()) ^ n(this.f10175n);
        }

        public String toString() {
            int length = this.f10174O.length;
            if (length == 0) {
                return n.Z(this.f10176t);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(n.Z(this.f10176t));
            sb.append("<");
            sb.append(n.Z(this.f10174O[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(n.Z(this.f10174O[i2]));
            }
            sb.append(">");
            return sb.toString();
        }

        public C0355n(Type type, Type type2, Type... typeArr) {
            Type typeRl;
            boolean z2;
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z3 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (type == null && !z2) {
                    z3 = false;
                }
                T6s.j.n(z3);
            }
            if (type == null) {
                typeRl = null;
            } else {
                typeRl = n.rl(type);
            }
            this.f10175n = typeRl;
            this.f10176t = n.rl(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f10174O = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                Objects.requireNonNull(this.f10174O[i2]);
                n.t(this.f10174O[i2]);
                Type[] typeArr3 = this.f10174O;
                typeArr3[i2] = n.rl(typeArr3[i2]);
            }
        }
    }

    private static final class w6 implements WildcardType, Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Type f10177n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Type f10178t;

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && n.J2(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f10178t;
            return type != null ? new Type[]{type} : n.f10172n;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f10177n};
        }

        public int hashCode() {
            Type type = this.f10178t;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f10177n.hashCode() + 31);
        }

        public String toString() {
            if (this.f10178t != null) {
                return "? super " + n.Z(this.f10178t);
            }
            if (this.f10177n == Object.class) {
                return "?";
            }
            return "? extends " + n.Z(this.f10177n);
        }

        public w6(Type[] typeArr, Type[] typeArr2) {
            boolean z2;
            boolean z3;
            if (typeArr2.length <= 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            T6s.j.n(z2);
            if (typeArr.length == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            T6s.j.n(z3);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                n.t(typeArr2[0]);
                T6s.j.n(typeArr[0] == Object.class);
                this.f10178t = n.rl(typeArr2[0]);
                this.f10177n = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            n.t(typeArr[0]);
            this.f10178t = null;
            this.f10177n = n.rl(typeArr[0]);
        }
    }

    public static boolean J2(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return O(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return J2(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    private static int az(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type ck(Type type, Class cls, Type type2, Map map) {
        Type typeCk;
        Type typeTy;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = (TypeVariable) type2;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type2 = Ik(type, cls, typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else if (type2 instanceof Class) {
                Class cls3 = (Class) type2;
                if (cls3.isArray()) {
                    Class<?> componentType = cls3.getComponentType();
                    Type typeCk2 = ck(type, cls, componentType, map);
                    if (O(componentType, typeCk2)) {
                        type2 = cls3;
                    } else {
                        typeTy = n(typeCk2);
                        type2 = typeTy;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeCk3 = ck(type, cls, genericComponentType, map);
                    if (!O(genericComponentType, typeCk3)) {
                        typeTy = n(typeCk3);
                        type2 = typeTy;
                    }
                } else {
                    if (type2 instanceof ParameterizedType) {
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeCk4 = ck(type, cls, ownerType, map);
                        boolean z2 = !O(typeCk4, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            Type typeCk5 = ck(type, cls, actualTypeArguments[i2], map);
                            if (!O(typeCk5, actualTypeArguments[i2])) {
                                if (!z2) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z2 = true;
                                }
                                actualTypeArguments[i2] = typeCk5;
                            }
                        }
                        if (z2) {
                            typeTy = ty(typeCk4, type2.getRawType(), actualTypeArguments);
                            type2 = typeTy;
                        }
                    } else if (type2 instanceof WildcardType) {
                        type2 = (WildcardType) type2;
                        Type[] lowerBounds = type2.getLowerBounds();
                        Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type typeCk6 = ck(type, cls, lowerBounds[0], map);
                            if (typeCk6 != lowerBounds[0]) {
                                type2 = o(typeCk6);
                            }
                        } else if (upperBounds.length == 1 && (typeCk = ck(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type2 = r(typeCk);
                        }
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    public static Type[] mUb(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeQie = qie(type, cls, Map.class);
        return typeQie instanceof ParameterizedType ? ((ParameterizedType) typeQie).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static WildcardType o(Type type) {
        return new w6(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static Type HI(Type type, Class cls, Type type2) {
        return ck(type, cls, type2, new HashMap());
    }

    public static Type KN(Type type, Class cls) {
        Type typeQie = qie(type, cls, Collection.class);
        return typeQie instanceof ParameterizedType ? ((ParameterizedType) typeQie).getActualTypeArguments()[0] : Object.class;
    }

    public static Type Uo(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static String Z(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Class gh(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            T6s.j.n(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) gh(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return gh(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? V8ValueNull.NULL : type.getClass().getName()));
    }

    public static GenericArrayType n(Type type) {
        return new j(type);
    }

    private static Type qie(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        T6s.j.n(cls2.isAssignableFrom(cls));
        return HI(type, cls, xMQ(type, cls, cls2));
    }

    public static WildcardType r(Type type) {
        return new w6(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f10172n);
    }

    public static Type rl(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            boolean zIsArray = cls.isArray();
            Type jVar = cls;
            if (zIsArray) {
                jVar = new j(rl(cls.getComponentType()));
            }
            return jVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0355n(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new j(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new w6(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void t(Type type) {
        T6s.j.n(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static ParameterizedType ty(Type type, Type type2, Type... typeArr) {
        return new C0355n(type, type2, typeArr);
    }

    private static Type xMQ(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return xMQ(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return xMQ(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static Type Ik(Type type, Class cls, TypeVariable typeVariable) {
        Class clsNr = nr(typeVariable);
        if (clsNr != null) {
            Type typeXMQ = xMQ(type, cls, clsNr);
            if (typeXMQ instanceof ParameterizedType) {
                return ((ParameterizedType) typeXMQ).getActualTypeArguments()[az(clsNr.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    private static boolean O(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private static Class nr(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
