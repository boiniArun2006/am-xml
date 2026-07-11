package Du;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;

/* JADX INFO: renamed from: Du.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractC1341t {
    private static final XA.Ml mUb(Object obj, XA.Ml... mlArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (mlArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = mlArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = XA.Ml.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(mlArr, mlArr.length));
            if (objInvoke instanceof XA.Ml) {
                return (XA.Ml) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final Object n(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean HI(KClass rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass(rootClass).isArray();
    }

    public static final Object[] Ik(ArrayList arrayList, KClass eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass(eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    private static final boolean az(Class cls) {
        return cls.getAnnotation(XA.Xo.class) == null && cls.getAnnotation(XA.I28.class) == null;
    }

    public static final Void ck(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        cA.J2(kClass);
        throw new KotlinNothingValueException();
    }

    private static final XA.Ml gh(Class cls, XA.Ml... mlArr) {
        Object objN = n(cls, "Companion");
        if (objN == null) {
            return null;
        }
        return mUb(objN, (XA.Ml[]) Arrays.copyOf(mlArr, mlArr.length));
    }

    public static final XA.Ml nr(KClass kClass, XA.Ml... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return t(JvmClassMappingKt.getJavaClass(kClass), (XA.Ml[]) Arrays.copyOf(args, args.length));
    }

    public static final boolean qie(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return JvmClassMappingKt.getJavaClass(kClass).isInterface();
    }

    public static final XA.Ml rl(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return nr(kClass, new XA.Ml[0]);
    }

    public static final XA.Ml t(Class cls, XA.Ml... args) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && az(cls)) {
            return O(cls);
        }
        XA.Ml mlGh = gh(cls, (XA.Ml[]) Arrays.copyOf(args, args.length));
        if (mlGh != null) {
            return mlGh;
        }
        XA.Ml mlKN = KN(cls);
        if (mlKN != null) {
            return mlKN;
        }
        XA.Ml mlJ2 = J2(cls, (XA.Ml[]) Arrays.copyOf(args, args.length));
        if (mlJ2 != null) {
            return mlJ2;
        }
        if (ty(cls)) {
            return new XA.fuX(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    private static final boolean ty(Class cls) {
        if (cls.getAnnotation(XA.I28.class) != null) {
            return true;
        }
        XA.Xo xo = (XA.Xo) cls.getAnnotation(XA.Xo.class);
        return xo != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(xo.with()), Reflection.getOrCreateKotlinClass(XA.fuX.class));
    }

    private static final XA.Ml J2(Class cls, XA.Ml... mlArr) throws IllegalAccessException {
        Object obj;
        Field field;
        XA.Ml mlMUb;
        Object objUo = Uo(cls);
        if (objUo != null && (mlMUb = mUb(objUo, (XA.Ml[]) Arrays.copyOf(mlArr, mlArr.length))) != null) {
            return mlMUb;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i2 = 0;
            Class<?> cls2 = null;
            boolean z2 = false;
            while (true) {
                if (i2 < length) {
                    Class<?> cls3 = declaredClasses[i2];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        cls2 = cls3;
                    }
                    i2++;
                } else if (!z2) {
                }
            }
            cls2 = null;
            if (cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                obj = field.get(null);
            } else {
                obj = null;
            }
            if (obj instanceof XA.Ml) {
                return (XA.Ml) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final XA.Ml KN(Class cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null && !StringsKt.startsWith$default(canonicalName, "java.", false, 2, (Object) null) && !StringsKt.startsWith$default(canonicalName, "kotlin.", false, 2, (Object) null)) {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field = null;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i2 < length) {
                    Field field2 = declaredFields[i2];
                    if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        field = field2;
                    }
                    i2++;
                } else if (!z2) {
                    break;
                }
            }
            field = null;
            if (field == null) {
                return null;
            }
            Object obj = field.get(null);
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            int length2 = methods.length;
            Method method = null;
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                if (i3 < length2) {
                    Method method2 = methods[i3];
                    if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), XA.Ml.class)) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            method = method2;
                        }
                    }
                    i3++;
                } else if (!z3) {
                    break;
                }
            }
            if (method == null) {
                return null;
            }
            Object objInvoke = method.invoke(obj, new Object[0]);
            if (objInvoke instanceof XA.Ml) {
                return (XA.Ml) objInvoke;
            }
        }
        return null;
    }

    private static final XA.Ml O(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new Ln(canonicalName, (Enum[]) enumConstants);
    }

    private static final Object Uo(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                cls2 = declaredClasses[i2];
                if (cls2.getAnnotation(YzO.class) != null) {
                    break;
                }
                i2++;
            } else {
                cls2 = null;
                break;
            }
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return n(cls, simpleName);
    }

    public static final Map xMQ() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), WY.j.T(StringCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Character.TYPE), WY.j.te(CharCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), WY.j.nr());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Double.TYPE), WY.j.iF(DoubleCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), WY.j.O());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Float.TYPE), WY.j.fD(FloatCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), WY.j.J2());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Long.TYPE), WY.j.e(LongCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), WY.j.xMQ());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(ULong.class), WY.j.WPU(ULong.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), WY.j.E2(IntCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), WY.j.Uo());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UInt.class), WY.j.S(UInt.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Short.TYPE), WY.j.X(ShortCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), WY.j.ty());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UShort.class), WY.j.aYN(UShort.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), WY.j.g(ByteCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), WY.j.t());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UByte.class), WY.j.XQ(UByte.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), WY.j.nY(BooleanCompanionObject.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), WY.j.rl());
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Unit.class), WY.j.ViF(Unit.INSTANCE));
        mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), WY.j.qie());
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Duration.class), WY.j.N(Duration.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), WY.j.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), WY.j.Ik());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), WY.j.o());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), WY.j.ck());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapCreateMapBuilder.put(Reflection.getOrCreateKotlinClass(Uuid.class), WY.j.nHg(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
