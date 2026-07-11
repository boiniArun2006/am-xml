package com.caoccao.javet.interop.callback;

import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.interop.converters.IJavetConverter;
import com.caoccao.javet.interop.converters.JavetConverterConfig;
import com.caoccao.javet.utils.JavetReflectionUtils;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.JavetTypeUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.IV8Value;
import com.caoccao.javet.values.V8Value;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class V8FunctionCallback {
    private static final String NULL = "null";

    /* JADX WARN: Removed duplicated region for block: B:307:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Object convert(IJavetConverter iJavetConverter, Class<?> cls, V8Value v8Value) throws JavetException {
        Object obj;
        DoubleStream doubleStream;
        Class<?> cls2 = Character.TYPE;
        Class<?> cls3 = Byte.TYPE;
        Class<?> cls4 = Short.TYPE;
        Class<?> cls5 = Long.TYPE;
        Class<?> cls6 = Float.TYPE;
        Class<?> cls7 = Double.TYPE;
        Class<?> cls8 = Boolean.TYPE;
        Class<?> cls9 = Integer.TYPE;
        if (v8Value == null) {
            if (cls.isPrimitive()) {
                JavetConverterConfig<?> config = iJavetConverter.getConfig();
                if (cls == cls9) {
                    return Integer.valueOf(config.getDefaultInt());
                }
                if (cls == cls8) {
                    return Boolean.valueOf(config.getDefaultBoolean());
                }
                if (cls == cls7) {
                    return Double.valueOf(config.getDefaultDouble());
                }
                if (cls == cls6) {
                    return Float.valueOf(config.getDefaultFloat());
                }
                if (cls == cls5) {
                    return Long.valueOf(config.getDefaultLong());
                }
                if (cls == cls4) {
                    return Short.valueOf(config.getDefaultShort());
                }
                if (cls == cls3) {
                    return Byte.valueOf(config.getDefaultByte());
                }
                if (cls == cls2) {
                    return Character.valueOf(config.getDefaultChar());
                }
            } else {
                if (cls == Optional.class) {
                    return Optional.empty();
                }
                if (cls == OptionalInt.class) {
                    return OptionalInt.empty();
                }
                if (cls == OptionalDouble.class) {
                    return OptionalDouble.empty();
                }
                if (cls == OptionalLong.class) {
                    return OptionalLong.empty();
                }
                if (cls == Stream.class) {
                    return Stream.empty();
                }
                if (cls == IntStream.class) {
                    return IntStream.empty();
                }
                if (cls == DoubleStream.class) {
                    return DoubleStream.empty();
                }
                if (cls == LongStream.class) {
                    return LongStream.empty();
                }
            }
        } else if (!cls.isAssignableFrom(v8Value.getClass())) {
            Object object = iJavetConverter.toObject(v8Value);
            try {
            } catch (Throwable unused) {
                obj = object;
            }
            if (object == null) {
                return convert(iJavetConverter, cls, null);
            }
            Class<?> cls10 = object.getClass();
            if (cls.isAssignableFrom(cls10)) {
                return object;
            }
            if (cls.isPrimitive()) {
                if (cls == cls9) {
                    if (cls10 == Integer.class) {
                        return (Integer) object;
                    }
                    if (cls10 == Long.class) {
                        return Integer.valueOf(((Long) object).intValue());
                    }
                    if (cls10 == Short.class) {
                        return Integer.valueOf(((Short) object).intValue());
                    }
                    if (cls10 == Byte.class) {
                        return Integer.valueOf(((Byte) object).intValue());
                    }
                } else {
                    if (cls == cls8 && cls10 == Boolean.class) {
                        return (Boolean) object;
                    }
                    if (cls == cls7) {
                        if (cls10 == Double.class) {
                            return (Double) object;
                        }
                        if (cls10 == Float.class) {
                            return Double.valueOf(((Float) object).doubleValue());
                        }
                        if (cls10 == Integer.class) {
                            return Double.valueOf(((Integer) object).doubleValue());
                        }
                        if (cls10 == Long.class) {
                            return Double.valueOf(((Long) object).doubleValue());
                        }
                        if (cls10 == Short.class) {
                            return Double.valueOf(((Short) object).doubleValue());
                        }
                        if (cls10 == Byte.class) {
                            return Double.valueOf(((Byte) object).doubleValue());
                        }
                    } else if (cls == cls6) {
                        if (cls10 == Double.class) {
                            return Float.valueOf(((Double) object).floatValue());
                        }
                        if (cls10 == Float.class) {
                            return (Float) object;
                        }
                        if (cls10 == Integer.class) {
                            return Float.valueOf(((Integer) object).floatValue());
                        }
                        if (cls10 == Long.class) {
                            return Float.valueOf(((Long) object).floatValue());
                        }
                        if (cls10 == Short.class) {
                            return Float.valueOf(((Short) object).floatValue());
                        }
                        if (cls10 == Byte.class) {
                            return Float.valueOf(((Byte) object).floatValue());
                        }
                    } else if (cls == cls5) {
                        if (cls10 == Long.class) {
                            return (Long) object;
                        }
                        if (cls10 == Integer.class) {
                            return Long.valueOf(((Integer) object).longValue());
                        }
                        if (cls10 == Short.class) {
                            return Long.valueOf(((Short) object).longValue());
                        }
                        if (cls10 == Byte.class) {
                            return Long.valueOf(((Byte) object).longValue());
                        }
                    } else if (cls == cls4) {
                        if (cls10 == Short.class) {
                            return (Short) object;
                        }
                        if (cls10 == Integer.class) {
                            return Short.valueOf(((Integer) object).shortValue());
                        }
                        if (cls10 == Long.class) {
                            return Short.valueOf(((Long) object).shortValue());
                        }
                        if (cls10 == Byte.class) {
                            return Short.valueOf(((Byte) object).shortValue());
                        }
                    } else if (cls == cls3) {
                        if (cls10 == Byte.class) {
                            return (Byte) object;
                        }
                        if (cls10 == Integer.class) {
                            return Byte.valueOf(((Integer) object).byteValue());
                        }
                        if (cls10 == Long.class) {
                            return Byte.valueOf(((Long) object).byteValue());
                        }
                        if (cls10 == Short.class) {
                            return Byte.valueOf(((Short) object).byteValue());
                        }
                    } else if (cls == cls2) {
                        if (cls10 == Character.class) {
                            return (Character) object;
                        }
                        if (cls10 == String.class) {
                            String str = (String) object;
                            return Character.valueOf(StringUtils.isNotEmpty(str) ? str.charAt(0) : iJavetConverter.getConfig().getDefaultChar());
                        }
                    }
                }
            } else if (cls == Integer.class) {
                if (cls10 == Long.class) {
                    return Integer.valueOf(((Long) object).intValue());
                }
                if (cls10 == Short.class) {
                    return Integer.valueOf(((Short) object).intValue());
                }
                if (cls10 == Byte.class) {
                    return Integer.valueOf(((Byte) object).intValue());
                }
            } else if (cls == Double.class) {
                if (cls10 == Float.class) {
                    return Double.valueOf(((Float) object).doubleValue());
                }
                if (cls10 == Integer.class) {
                    return Double.valueOf(((Integer) object).doubleValue());
                }
                if (cls10 == Long.class) {
                    return Double.valueOf(((Long) object).doubleValue());
                }
                if (cls10 == Short.class) {
                    return Double.valueOf(((Short) object).doubleValue());
                }
                if (cls10 == Byte.class) {
                    return Double.valueOf(((Byte) object).doubleValue());
                }
            } else if (cls == Float.class) {
                if (cls10 == Double.class) {
                    return Float.valueOf(((Double) object).floatValue());
                }
                if (cls10 == Integer.class) {
                    return Float.valueOf(((Integer) object).floatValue());
                }
                if (cls10 == Long.class) {
                    return Float.valueOf(((Long) object).floatValue());
                }
                if (cls10 == Short.class) {
                    return Float.valueOf(((Short) object).floatValue());
                }
                if (cls10 == Byte.class) {
                    return Float.valueOf(((Byte) object).floatValue());
                }
            } else if (cls == Long.class) {
                if (cls10 == Integer.class) {
                    return Long.valueOf(((Integer) object).longValue());
                }
                if (cls10 == Short.class) {
                    return Long.valueOf(((Short) object).longValue());
                }
                if (cls10 == Byte.class) {
                    return Long.valueOf(((Byte) object).longValue());
                }
            } else if (cls == Short.class) {
                if (cls10 == Integer.class) {
                    return Short.valueOf(((Integer) object).shortValue());
                }
                if (cls10 == Long.class) {
                    return Short.valueOf(((Long) object).shortValue());
                }
                if (cls10 == Byte.class) {
                    return Short.valueOf(((Byte) object).shortValue());
                }
            } else if (cls == Byte.class) {
                if (cls10 == Integer.class) {
                    return Byte.valueOf(((Integer) object).byteValue());
                }
                if (cls10 == Long.class) {
                    return Byte.valueOf(((Long) object).byteValue());
                }
                if (cls10 == Short.class) {
                    return Byte.valueOf(((Short) object).byteValue());
                }
            } else {
                if (cls != Character.class) {
                    if (cls == Optional.class) {
                        return Optional.of(object);
                    }
                    obj = OptionalInt.class;
                    try {
                        if (cls == obj) {
                            obj = object;
                            if (obj instanceof Integer) {
                                return OptionalInt.of(((Integer) obj).intValue());
                            }
                        } else {
                            obj = object;
                            if (cls == OptionalDouble.class) {
                                if (obj instanceof Double) {
                                    return OptionalDouble.of(((Double) obj).doubleValue());
                                }
                            } else if (cls == OptionalLong.class) {
                                if (obj instanceof Long) {
                                    return OptionalLong.of(((Long) obj).longValue());
                                }
                            } else if (cls == Stream.class) {
                                Stream<?> stream = JavetTypeUtils.toStream(obj);
                                if (stream != null) {
                                    return stream;
                                }
                            } else if (cls == IntStream.class) {
                                IntStream intStream = JavetTypeUtils.toIntStream(obj);
                                if (intStream != null) {
                                    return intStream;
                                }
                            } else if (cls == LongStream.class) {
                                LongStream longStream = JavetTypeUtils.toLongStream(obj);
                                if (longStream != null) {
                                    return longStream;
                                }
                            } else if (cls == DoubleStream.class && (doubleStream = JavetTypeUtils.toDoubleStream(obj)) != null) {
                                return doubleStream;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    throw new JavetException(JavetError.CallbackSignatureParameterTypeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_EXPECTED_PARAMETER_TYPE, cls, JavetError.PARAMETER_ACTUAL_PARAMETER_TYPE, obj != null ? "null" : obj.getClass()));
                }
                if (cls10 == String.class) {
                    String str2 = (String) object;
                    return Character.valueOf(StringUtils.isNotEmpty(str2) ? str2.charAt(0) : iJavetConverter.getConfig().getDefaultChar());
                }
            }
            obj = object;
            throw new JavetException(JavetError.CallbackSignatureParameterTypeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_EXPECTED_PARAMETER_TYPE, cls, JavetError.PARAMETER_ACTUAL_PARAMETER_TYPE, obj != null ? "null" : obj.getClass()));
        }
        return v8Value;
    }

    /* JADX INFO: renamed from: com.caoccao.javet.interop.callback.V8FunctionCallback$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType;

        static {
            int[] iArr = new int[JavetCallbackType.values().length];
            $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType = iArr;
            try {
                iArr[JavetCallbackType.DirectCallGetterAndNoThis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallGetterAndThis.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallSetterAndNoThis.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallSetterAndThis.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallThisAndNoResult.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallThisAndResult.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallNoThisAndNoResult.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallNoThisAndResult.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static V8Value receiveCallback(V8Runtime v8Runtime, JavetCallbackContext javetCallbackContext, V8Value v8Value, V8Value[] v8ValueArr) throws Throwable {
        V8Runtime v8Runtime2;
        IJavetConverter converter;
        int i2;
        Object objCall;
        int i3;
        Object objInvoke;
        if (javetCallbackContext != null) {
            int i5 = 0;
            try {
                try {
                    converter = v8Runtime.getConverter();
                } catch (Throwable th) {
                    th = th;
                    if (javetCallbackContext.isThisObjectRequired() && v8Value != null) {
                        JavetResourceUtils.safeClose(v8Value);
                    }
                    if (v8ValueArr != null) {
                        for (V8Value v8Value2 : v8ValueArr) {
                            if (v8Value2 != null) {
                                JavetResourceUtils.safeClose(v8Value2);
                            }
                        }
                    }
                    throw th;
                }
            } catch (InvocationTargetException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (javetCallbackContext.getCallbackType() == JavetCallbackType.Reflection) {
                    Method method = (Method) javetCallbackContext.getCallbackMethod();
                    JavetReflectionUtils.safeSetAccessible(method);
                    Object callbackReceiver = javetCallbackContext.getCallbackReceiver();
                    ArrayList arrayList = new ArrayList();
                    if (javetCallbackContext.isThisObjectRequired()) {
                        arrayList.add(v8Value);
                    }
                    if (v8ValueArr != null && v8ValueArr.length > 0) {
                        Collections.addAll(arrayList, v8ValueArr);
                    }
                    if (arrayList.isEmpty()) {
                        if (method.isVarArgs()) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            objInvoke = method.invoke(callbackReceiver, Array.newInstance(parameterTypes[parameterTypes.length - 1].getComponentType(), 0));
                        } else {
                            objInvoke = method.invoke(callbackReceiver, new Object[0]);
                        }
                        objCall = objInvoke;
                        i2 = 0;
                    } else {
                        int size = arrayList.size();
                        ArrayList arrayList2 = new ArrayList();
                        Class<?>[] parameterTypes2 = method.getParameterTypes();
                        if (method.isVarArgs()) {
                            int i7 = 0;
                            while (i7 < parameterTypes2.length) {
                                Class<?> cls = parameterTypes2[i7];
                                if (cls.isArray() && i7 == parameterTypes2.length - 1) {
                                    Class<?> componentType = cls.getComponentType();
                                    Object objNewInstance = Array.newInstance(componentType, size - i7);
                                    int i8 = i7;
                                    while (i8 < size) {
                                        int i9 = i5;
                                        Array.set(objNewInstance, i8 - i7, convert(converter, componentType, (V8Value) arrayList.get(i8)));
                                        i8++;
                                        i5 = i9;
                                    }
                                    i3 = i5;
                                    arrayList2.add(objNewInstance);
                                } else {
                                    i3 = i5;
                                    arrayList2.add(convert(converter, cls, (V8Value) arrayList.get(i7)));
                                }
                                i7++;
                                i5 = i3;
                            }
                            i2 = i5;
                        } else {
                            i2 = 0;
                            int i10 = 0;
                            while (i10 < parameterTypes2.length) {
                                arrayList2.add(convert(converter, parameterTypes2[i10], i10 < size ? (V8Value) arrayList.get(i10) : null));
                                i10++;
                            }
                        }
                        objCall = method.invoke(callbackReceiver, arrayList2.toArray());
                    }
                } else {
                    i2 = 0;
                    switch (AnonymousClass1.$SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[javetCallbackContext.getCallbackType().ordinal()]) {
                        case 1:
                            objCall = ((IJavetDirectCallable.GetterAndNoThis) javetCallbackContext.getCallbackMethod()).get();
                            break;
                        case 2:
                            objCall = ((IJavetDirectCallable.GetterAndThis) javetCallbackContext.getCallbackMethod()).get(v8Value);
                            break;
                        case 3:
                            IJavetDirectCallable.SetterAndNoThis setterAndNoThis = (IJavetDirectCallable.SetterAndNoThis) javetCallbackContext.getCallbackMethod();
                            if (v8ValueArr != null && v8ValueArr.length >= 1) {
                                setterAndNoThis.set(v8ValueArr[0]);
                                objCall = null;
                                break;
                            }
                            throw new JavetException(JavetError.CallbackSignatureParameterSizeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, javetCallbackContext.getName(), JavetError.PARAMETER_EXPECTED_PARAMETER_SIZE, 1, JavetError.PARAMETER_ACTUAL_PARAMETER_SIZE, Integer.valueOf(v8ValueArr == null ? 0 : v8ValueArr.length)));
                        case 4:
                            IJavetDirectCallable.SetterAndThis setterAndThis = (IJavetDirectCallable.SetterAndThis) javetCallbackContext.getCallbackMethod();
                            if (v8ValueArr != null && v8ValueArr.length == 1) {
                                setterAndThis.set(v8Value, v8ValueArr[0]);
                                objCall = null;
                                break;
                            }
                            throw new JavetException(JavetError.CallbackSignatureParameterSizeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, javetCallbackContext.getName(), JavetError.PARAMETER_EXPECTED_PARAMETER_SIZE, 1, JavetError.PARAMETER_ACTUAL_PARAMETER_SIZE, Integer.valueOf(v8ValueArr == null ? 0 : v8ValueArr.length)));
                        case 5:
                            ((IJavetDirectCallable.ThisAndNoResult) javetCallbackContext.getCallbackMethod()).call(v8Value, v8ValueArr);
                            objCall = null;
                            break;
                        case 6:
                            objCall = ((IJavetDirectCallable.ThisAndResult) javetCallbackContext.getCallbackMethod()).call(v8Value, v8ValueArr);
                            break;
                        case 7:
                            ((IJavetDirectCallable.NoThisAndNoResult) javetCallbackContext.getCallbackMethod()).call(v8ValueArr);
                            objCall = null;
                            break;
                        case 8:
                            objCall = ((IJavetDirectCallable.NoThisAndResult) javetCallbackContext.getCallbackMethod()).call(v8ValueArr);
                            break;
                        default:
                            throw new JavetException(JavetError.CallbackTypeNotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_CALLBACK_TYPE, javetCallbackContext.getCallbackType().name()));
                    }
                }
                try {
                    if (javetCallbackContext.isReturnResult()) {
                        if (!(objCall instanceof IV8Value)) {
                            objCall = v8Runtime.toV8Value(objCall);
                        }
                        V8Value v8Value3 = (V8Value) objCall;
                        if (javetCallbackContext.isThisObjectRequired() && v8Value != objCall) {
                            JavetResourceUtils.safeClose(v8Value);
                        }
                        if (v8ValueArr != null) {
                            int length = v8ValueArr.length;
                            for (int i11 = i2; i11 < length; i11++) {
                                V8Value v8Value4 = v8ValueArr[i11];
                                if (v8Value4 != objCall) {
                                    JavetResourceUtils.safeClose(v8Value4);
                                }
                            }
                        }
                        return v8Value3;
                    }
                    v8Runtime2 = v8Runtime;
                    JavetResourceUtils.safeClose(objCall);
                    if (javetCallbackContext.isThisObjectRequired() && v8Value != objCall) {
                        JavetResourceUtils.safeClose(v8Value);
                    }
                    if (v8ValueArr != null) {
                        int length2 = v8ValueArr.length;
                        for (int i12 = i2; i12 < length2; i12++) {
                            V8Value v8Value5 = v8ValueArr[i12];
                            if (v8Value5 != objCall) {
                                JavetResourceUtils.safeClose(v8Value5);
                            }
                        }
                    }
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw e.getTargetException();
                }
            } catch (InvocationTargetException e4) {
                e = e4;
                throw e.getTargetException();
            } catch (Throwable th3) {
                th = th3;
                if (javetCallbackContext.isThisObjectRequired()) {
                    JavetResourceUtils.safeClose(v8Value);
                }
                if (v8ValueArr != null) {
                }
                throw th;
            }
        } else {
            v8Runtime2 = v8Runtime;
        }
        return v8Runtime2.createV8ValueUndefined();
    }
}
