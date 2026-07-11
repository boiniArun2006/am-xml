package com.caoccao.javet.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class JavetTypeUtils {
    public static /* synthetic */ boolean n(Object obj) {
        return obj instanceof Double;
    }

    public static /* synthetic */ boolean nr(Object obj) {
        return obj instanceof Integer;
    }

    public static /* synthetic */ boolean t(Object obj) {
        return obj instanceof Long;
    }

    public static Object toApproximatePrimitive(Class<?> cls, Object obj) {
        if (cls == Integer.TYPE || cls == Integer.class) {
            if (obj instanceof Integer) {
                return obj;
            }
            if (obj instanceof Long) {
                return Integer.valueOf(((Long) obj).intValue());
            }
            if (obj instanceof Short) {
                return Integer.valueOf(((Short) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Integer.valueOf(((Byte) obj).intValue());
            }
        }
        if ((cls == Boolean.TYPE || cls == Boolean.class) && (obj instanceof Boolean)) {
            return obj;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            if (obj instanceof Double) {
                return obj;
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (obj instanceof Integer) {
                return Double.valueOf(((Integer) obj).doubleValue());
            }
            if (obj instanceof Long) {
                return Double.valueOf(((Long) obj).doubleValue());
            }
            if (obj instanceof Short) {
                return Double.valueOf(((Short) obj).doubleValue());
            }
            if (obj instanceof Byte) {
                return Double.valueOf(((Byte) obj).doubleValue());
            }
        }
        if (cls == Float.TYPE || cls == Float.class) {
            if (obj instanceof Float) {
                return obj;
            }
            if (obj instanceof Double) {
                return Float.valueOf(((Double) obj).floatValue());
            }
            if (obj instanceof Integer) {
                return Float.valueOf(((Integer) obj).floatValue());
            }
            if (obj instanceof Long) {
                return Float.valueOf(((Long) obj).floatValue());
            }
            if (obj instanceof Short) {
                return Float.valueOf(((Short) obj).floatValue());
            }
            if (obj instanceof Byte) {
                return Float.valueOf(((Byte) obj).floatValue());
            }
        }
        if (cls == Long.TYPE || cls == Long.class) {
            if (obj instanceof Long) {
                return obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).longValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).longValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).longValue());
            }
        }
        if (cls == Short.TYPE || cls == Short.class) {
            if (obj instanceof Short) {
                return obj;
            }
            if (obj instanceof Integer) {
                return Short.valueOf(((Integer) obj).shortValue());
            }
            if (obj instanceof Long) {
                return Short.valueOf(((Long) obj).shortValue());
            }
            if (obj instanceof Byte) {
                return Short.valueOf(((Byte) obj).shortValue());
            }
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            if (obj instanceof Byte) {
                return obj;
            }
            if (obj instanceof Integer) {
                return Byte.valueOf(((Integer) obj).byteValue());
            }
            if (obj instanceof Long) {
                return Byte.valueOf(((Long) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Byte.valueOf(((Short) obj).byteValue());
            }
        }
        if (cls != Character.TYPE && cls != Character.class) {
            return null;
        }
        if (obj instanceof Character) {
            return obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (StringUtils.isNotEmpty(str)) {
            return Character.valueOf(str.charAt(0));
        }
        return null;
    }

    public static DoubleStream toDoubleStream(Object obj) {
        if (obj instanceof double[]) {
            return DoubleStream.of((double[]) obj);
        }
        if (!(obj instanceof Collection)) {
            return null;
        }
        Collection collection = (Collection) obj;
        if (collection.stream().allMatch(new Predicate() { // from class: com.caoccao.javet.utils.I28
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return JavetTypeUtils.n(obj2);
            }
        })) {
            return collection.stream().mapToDouble(new ToDoubleFunction() { // from class: com.caoccao.javet.utils.Wre
                @Override // java.util.function.ToDoubleFunction
                public final double applyAsDouble(Object obj2) {
                    return ((Double) obj2).doubleValue();
                }
            });
        }
        return null;
    }

    public static Object toExactPrimitive(Class<?> cls, Object obj) {
        if (cls == Integer.TYPE && (obj instanceof Integer)) {
            Integer num = (Integer) obj;
            num.intValue();
            return num;
        }
        if (cls == Boolean.TYPE && (obj instanceof Boolean)) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        }
        if (cls == Double.TYPE && (obj instanceof Double)) {
            Double d2 = (Double) obj;
            d2.doubleValue();
            return d2;
        }
        if (cls == Float.TYPE && (obj instanceof Float)) {
            Float f3 = (Float) obj;
            f3.floatValue();
            return f3;
        }
        if (cls == Long.TYPE && (obj instanceof Long)) {
            Long l2 = (Long) obj;
            l2.longValue();
            return l2;
        }
        if (cls == Short.TYPE && (obj instanceof Short)) {
            Short sh = (Short) obj;
            sh.shortValue();
            return sh;
        }
        if (cls == Byte.TYPE && (obj instanceof Byte)) {
            Byte b2 = (Byte) obj;
            b2.byteValue();
            return b2;
        }
        if (cls != Character.TYPE || !(obj instanceof Character)) {
            return null;
        }
        Character ch = (Character) obj;
        ch.charValue();
        return ch;
    }

    public static IntStream toIntStream(Object obj) {
        if (obj instanceof int[]) {
            return IntStream.of((int[]) obj);
        }
        if (!(obj instanceof Collection)) {
            return null;
        }
        Collection collection = (Collection) obj;
        if (collection.stream().allMatch(new Predicate() { // from class: com.caoccao.javet.utils.CN3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return JavetTypeUtils.nr(obj2);
            }
        })) {
            return collection.stream().mapToInt(new ToIntFunction() { // from class: com.caoccao.javet.utils.fuX
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj2) {
                    return ((Integer) obj2).intValue();
                }
            });
        }
        return null;
    }

    public static LongStream toLongStream(Object obj) {
        if (obj instanceof long[]) {
            return LongStream.of((long[]) obj);
        }
        if (!(obj instanceof Collection)) {
            return null;
        }
        Collection collection = (Collection) obj;
        if (collection.stream().allMatch(new Predicate() { // from class: com.caoccao.javet.utils.w6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return JavetTypeUtils.t(obj2);
            }
        })) {
            return collection.stream().mapToLong(new ToLongFunction() { // from class: com.caoccao.javet.utils.Ml
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj2) {
                    return ((Long) obj2).longValue();
                }
            });
        }
        return null;
    }

    public static Stream<?> toStream(Object obj) {
        if (obj.getClass().isArray()) {
            if (obj instanceof int[]) {
                return Arrays.stream((int[]) obj).boxed();
            }
            if (obj instanceof long[]) {
                return Arrays.stream((long[]) obj).boxed();
            }
            if (obj instanceof double[]) {
                return Arrays.stream((double[]) obj).boxed();
            }
            int i2 = 0;
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                Object[] objArr = new Object[zArr.length];
                while (i2 < zArr.length) {
                    objArr[i2] = Boolean.valueOf(zArr[i2]);
                    i2++;
                }
                return Stream.of(objArr);
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                Object[] objArr2 = new Object[fArr.length];
                while (i2 < fArr.length) {
                    objArr2[i2] = Float.valueOf(fArr[i2]);
                    i2++;
                }
                return Stream.of(objArr2);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                Object[] objArr3 = new Object[bArr.length];
                while (i2 < bArr.length) {
                    objArr3[i2] = Byte.valueOf(bArr[i2]);
                    i2++;
                }
                return Stream.of(objArr3);
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                Object[] objArr4 = new Object[sArr.length];
                while (i2 < sArr.length) {
                    objArr4[i2] = Short.valueOf(sArr[i2]);
                    i2++;
                }
                return Stream.of(objArr4);
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                Object[] objArr5 = new Object[cArr.length];
                while (i2 < cArr.length) {
                    objArr5[i2] = Character.valueOf(cArr[i2]);
                    i2++;
                }
                return Stream.of(objArr5);
            }
            return Stream.of((Object[]) obj);
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).stream();
        }
        return null;
    }
}
