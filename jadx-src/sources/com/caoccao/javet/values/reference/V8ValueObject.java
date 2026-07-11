package com.caoccao.javet.values.reference;

import com.caoccao.javet.annotations.V8BindingEnabler;
import com.caoccao.javet.annotations.V8Function;
import com.caoccao.javet.annotations.V8Property;
import com.caoccao.javet.annotations.V8RuntimeSetter;
import com.caoccao.javet.enums.V8ValueInternalType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.enums.V8ValueSymbolType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetBiConsumer;
import com.caoccao.javet.interfaces.IJavetBiIndexedConsumer;
import com.caoccao.javet.interop.V8Internal;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.BindingContext;
import com.caoccao.javet.interop.binding.BindingContextStore;
import com.caoccao.javet.interop.binding.MethodDescriptor;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInJson;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.caoccao.javet.values.virtual.V8VirtualValue;
import com.caoccao.javet.values.virtual.V8VirtualValueList;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class V8ValueObject extends V8ValueReference implements IV8ValueObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String ERROR_THE_KEY_VALUE_PAIR_MUST_MATCH = "The key value pair must match.";
    protected static final String FUNCTION_ADD = "add";
    protected static final String FUNCTION_DELETE = "delete";
    protected static final String FUNCTION_GET = "get";
    protected static final String FUNCTION_HAS = "has";
    protected static final String FUNCTION_SET = "set";
    public static final String METHOD_PREFIX_GET = "get";
    public static final String METHOD_PREFIX_IS = "is";
    public static final String METHOD_PREFIX_SET = "set";
    protected static final String PROPERTY_PROTOTYPE = "prototype";

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiConsumer<Key, Value, E> iJavetBiConsumer, int i2) throws Throwable {
        Objects.requireNonNull(iJavetBiConsumer);
        IV8ValueArray ownPropertyNames = getOwnPropertyNames();
        try {
            int iMax = Math.max(1, i2);
            int length = ownPropertyNames.getLength();
            if (length > 0) {
                V8Value[] v8ValueArr = new V8Value[iMax];
                V8Value[] v8ValueArr2 = new V8Value[iMax];
                int i3 = ((length + iMax) - 1) / iMax;
                int i5 = 0;
                while (i5 < i3) {
                    int i7 = i5 * iMax;
                    try {
                        int iBatchGet = ownPropertyNames.batchGet(v8ValueArr, i7, i5 == i3 + (-1) ? length : i7 + iMax);
                        if (iBatchGet > 0) {
                            batchGet(v8ValueArr, v8ValueArr2, iBatchGet);
                            for (int i8 = 0; i8 < iBatchGet; i8++) {
                                iJavetBiConsumer.accept(v8ValueArr[i8], v8ValueArr2[i8]);
                            }
                        }
                        JavetResourceUtils.safeClose(v8ValueArr);
                        JavetResourceUtils.safeClose(v8ValueArr2);
                        Arrays.fill(v8ValueArr, (Object) null);
                        Arrays.fill(v8ValueArr2, (Object) null);
                        i5++;
                    } finally {
                    }
                }
            }
            ownPropertyNames.close();
            return length;
        } catch (Throwable th) {
            if (ownPropertyNames != null) {
                try {
                    ownPropertyNames.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T invokeExtended(String str, boolean z2, Object... objArr) throws JavetException {
        Objects.requireNonNull(str);
        V8VirtualValueList v8VirtualValueList = new V8VirtualValueList(checkV8Runtime(), null, objArr);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().objectInvoke(this, str, z2, v8VirtualValueList.get());
            v8VirtualValueList.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValueList.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean set(Object obj, Object obj2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            V8VirtualValue v8VirtualValue2 = new V8VirtualValue(this.v8Runtime, null, obj2);
            try {
                boolean zObjectSet = this.v8Runtime.getV8Internal().objectSet(this, v8VirtualValue.get(), v8VirtualValue2.get());
                v8VirtualValue2.close();
                v8VirtualValue.close();
                return zObjectSet;
            } finally {
            }
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean unbindProperty(JavetCallbackContext javetCallbackContext) throws JavetException {
        Objects.requireNonNull(javetCallbackContext);
        return unbindProperty(javetCallbackContext.getName(), javetCallbackContext.getSymbolType());
    }

    /* JADX INFO: renamed from: com.caoccao.javet.values.reference.V8ValueObject$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType;
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType;

        static {
            int[] iArr = new int[V8ValueSymbolType.values().length];
            $SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType = iArr;
            try {
                iArr[V8ValueSymbolType.BuiltIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType[V8ValueSymbolType.Custom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[JavetCallbackType.values().length];
            $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType = iArr2;
            try {
                iArr2[JavetCallbackType.DirectCallGetterAndNoThis.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallGetterAndThis.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallSetterAndNoThis.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[JavetCallbackType.DirectCallSetterAndThis.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public List<JavetCallbackContext> bind(Object obj) throws JavetException {
        JavetCallbackContext javetCallbackContext;
        MethodDescriptor methodDescriptor;
        Object obj2;
        Objects.requireNonNull(obj);
        checkV8Runtime();
        ArrayList arrayList = new ArrayList();
        if (obj instanceof IJavetDirectCallable) {
            IJavetDirectCallable iJavetDirectCallable = (IJavetDirectCallable) obj;
            iJavetDirectCallable.setV8Runtime(this.v8Runtime);
            JavetCallbackContext[] callbackContexts = iJavetDirectCallable.getCallbackContexts();
            if (callbackContexts != null && callbackContexts.length > 0) {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (JavetCallbackContext javetCallbackContext2 : callbackContexts) {
                    int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[javetCallbackContext2.getCallbackType().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        map.put(javetCallbackContext2.getName(), javetCallbackContext2);
                    } else if (i2 == 3 || i2 == 4) {
                        map2.put(javetCallbackContext2.getName(), javetCallbackContext2);
                    } else {
                        arrayList.add(javetCallbackContext2);
                        bindFunction(javetCallbackContext2);
                    }
                }
                for (JavetCallbackContext javetCallbackContext3 : map.values()) {
                    JavetCallbackContext javetCallbackContext4 = (JavetCallbackContext) map2.get(javetCallbackContext3.getName());
                    arrayList.add(javetCallbackContext3);
                    if (javetCallbackContext4 != null) {
                        arrayList.add(javetCallbackContext4);
                    }
                    bindProperty(javetCallbackContext3, javetCallbackContext4);
                }
            }
        } else {
            BindingContext bindingContext = getBindingContext(obj.getClass());
            Map<String, MethodDescriptor> propertyGetterMap = bindingContext.getPropertyGetterMap();
            Map<String, MethodDescriptor> propertySetterMap = bindingContext.getPropertySetterMap();
            Map<String, MethodDescriptor> functionMap = bindingContext.getFunctionMap();
            Method v8BindingEnabler = bindingContext.getV8BindingEnabler();
            Method v8RuntimeSetter = bindingContext.getV8RuntimeSetter();
            if (v8RuntimeSetter != null) {
                try {
                    v8RuntimeSetter.invoke(obj, getV8Runtime());
                } catch (Exception e2) {
                    throw new JavetException(JavetError.CallbackInjectionFailure, SimpleMap.of("message", e2.getMessage()), e2);
                }
            }
            if (!propertyGetterMap.isEmpty()) {
                for (Map.Entry<String, MethodDescriptor> entry : propertyGetterMap.entrySet()) {
                    String key = entry.getKey();
                    MethodDescriptor value = entry.getValue();
                    if (v8BindingEnabler != null) {
                        try {
                            if (!((Boolean) v8BindingEnabler.invoke(obj, value.getMethod().getName())).booleanValue()) {
                            }
                        } catch (Exception e3) {
                            throw new JavetException(JavetError.CallbackRegistrationFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, value.getMethod().getName(), "message", e3.getMessage()), e3);
                        }
                    }
                    JavetCallbackContext javetCallbackContext5 = new JavetCallbackContext(key, value.getSymbolType(), Modifier.isStatic(value.getMethod().getModifiers()) ? null : obj, value.getMethod(), value.isThisObjectRequired());
                    arrayList.add(javetCallbackContext5);
                    if (propertySetterMap.containsKey(key)) {
                        MethodDescriptor methodDescriptor2 = propertySetterMap.get(key);
                        if (v8BindingEnabler == null || ((Boolean) v8BindingEnabler.invoke(obj, methodDescriptor2.getMethod().getName())).booleanValue()) {
                            V8ValueSymbolType symbolType = methodDescriptor2.getSymbolType();
                            if (Modifier.isStatic(methodDescriptor2.getMethod().getModifiers())) {
                                methodDescriptor = methodDescriptor2;
                                obj2 = null;
                            } else {
                                methodDescriptor = methodDescriptor2;
                                obj2 = obj;
                            }
                            javetCallbackContext = new JavetCallbackContext(key, symbolType, obj2, methodDescriptor.getMethod(), methodDescriptor.isThisObjectRequired());
                            arrayList.add(javetCallbackContext);
                        }
                    } else {
                        javetCallbackContext = null;
                    }
                    bindProperty(javetCallbackContext5, javetCallbackContext);
                }
            }
            if (!functionMap.isEmpty()) {
                for (Map.Entry<String, MethodDescriptor> entry2 : functionMap.entrySet()) {
                    String key2 = entry2.getKey();
                    MethodDescriptor value2 = entry2.getValue();
                    if (v8BindingEnabler != null) {
                        try {
                            if (!((Boolean) v8BindingEnabler.invoke(obj, value2.getMethod().getName())).booleanValue()) {
                            }
                        } catch (Exception e4) {
                            throw new JavetException(JavetError.CallbackRegistrationFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, value2.getMethod().getName(), "message", e4.getMessage()), e4);
                        }
                    }
                    JavetCallbackContext javetCallbackContext6 = new JavetCallbackContext(key2, value2.getSymbolType(), Modifier.isStatic(value2.getMethod().getModifiers()) ? null : obj, value2.getMethod(), value2.isThisObjectRequired());
                    arrayList.add(javetCallbackContext6);
                    bindFunction(javetCallbackContext6);
                }
            }
        }
        return arrayList;
    }

    public boolean delete(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zObjectDelete = this.v8Runtime.getV8Internal().objectDelete(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zObjectDelete;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public <T extends V8Value> T get(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().objectGet(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    BindingContext getBindingContext(Class<?> cls) throws JavetException {
        boolean z2;
        Objects.requireNonNull(cls);
        BindingContext bindingContext = BindingContextStore.getMap().get(cls);
        if (bindingContext == null) {
            bindingContext = new BindingContext();
            Map<String, MethodDescriptor> propertyGetterMap = bindingContext.getPropertyGetterMap();
            Map<String, MethodDescriptor> propertySetterMap = bindingContext.getPropertySetterMap();
            Map<String, MethodDescriptor> functionMap = bindingContext.getFunctionMap();
            for (Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(V8Property.class)) {
                    V8Property v8Property = (V8Property) method.getAnnotation(V8Property.class);
                    String strName = v8Property.name();
                    if (strName.isEmpty()) {
                        strName = method.getName();
                        if (strName.startsWith(METHOD_PREFIX_IS)) {
                            strName = strName.substring(2);
                        } else if (strName.startsWith("get") || strName.startsWith("set")) {
                            strName = strName.substring(3);
                        }
                        if (!strName.isEmpty()) {
                            strName = strName.substring(0, 1).toLowerCase(Locale.ROOT) + strName.substring(1);
                        }
                    }
                    if (strName.isEmpty()) {
                        z2 = false;
                    } else {
                        boolean zThisObjectRequired = v8Property.thisObjectRequired();
                        int i2 = (zThisObjectRequired ? 1 : 0) + 1;
                        if (method.getParameterTypes().length == zThisObjectRequired) {
                            if (!propertyGetterMap.containsKey(strName)) {
                                propertyGetterMap.put(strName, new MethodDescriptor(method, v8Property.thisObjectRequired(), v8Property.symbolType()));
                                z2 = true;
                            }
                            z2 = false;
                        } else {
                            if (method.getParameterTypes().length != i2) {
                                throw new JavetException(JavetError.CallbackSignatureParameterSizeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, method.getName(), JavetError.PARAMETER_EXPECTED_PARAMETER_SIZE, Integer.valueOf(zThisObjectRequired ? 1 : 0), JavetError.PARAMETER_ACTUAL_PARAMETER_SIZE, Integer.valueOf(method.getParameterTypes().length)));
                            }
                            if (!propertySetterMap.containsKey(strName)) {
                                propertySetterMap.put(strName, new MethodDescriptor(method, v8Property.thisObjectRequired(), v8Property.symbolType()));
                                z2 = true;
                            }
                            z2 = false;
                        }
                    }
                }
                boolean z3 = z2;
                if (method.isAnnotationPresent(V8Function.class)) {
                    V8Function v8Function = (V8Function) method.getAnnotation(V8Function.class);
                    String strName2 = v8Function.name();
                    if (strName2.isEmpty()) {
                        strName2 = method.getName();
                    }
                    z3 = z2;
                    if (!functionMap.containsKey(strName2)) {
                        functionMap.put(strName2, new MethodDescriptor(method, v8Function.thisObjectRequired()));
                        z3 = true;
                    }
                }
                if (!z3) {
                    if (method.isAnnotationPresent(V8RuntimeSetter.class)) {
                        if (method.getParameterTypes().length != 1) {
                            throw new JavetException(JavetError.CallbackSignatureParameterSizeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, method.getName(), JavetError.PARAMETER_EXPECTED_PARAMETER_SIZE, 1, JavetError.PARAMETER_ACTUAL_PARAMETER_SIZE, Integer.valueOf(method.getParameterTypes().length)));
                        }
                        if (!V8Runtime.class.isAssignableFrom(method.getParameterTypes()[0])) {
                            throw new JavetException(JavetError.CallbackSignatureParameterTypeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_EXPECTED_PARAMETER_TYPE, V8Runtime.class, JavetError.PARAMETER_ACTUAL_PARAMETER_TYPE, method.getParameterTypes()[0]));
                        }
                        bindingContext.setV8RuntimeSetter(method);
                    } else if (!method.isAnnotationPresent(V8BindingEnabler.class)) {
                        continue;
                    } else {
                        if (method.getParameterTypes().length != 1) {
                            throw new JavetException(JavetError.CallbackSignatureParameterSizeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, method.getName(), JavetError.PARAMETER_EXPECTED_PARAMETER_SIZE, 1, JavetError.PARAMETER_ACTUAL_PARAMETER_SIZE, Integer.valueOf(method.getParameterTypes().length)));
                        }
                        if (!String.class.isAssignableFrom(method.getParameterTypes()[0])) {
                            throw new JavetException(JavetError.CallbackSignatureParameterTypeMismatch, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_EXPECTED_PARAMETER_TYPE, String.class, JavetError.PARAMETER_ACTUAL_PARAMETER_TYPE, method.getParameterTypes()[0]));
                        }
                        bindingContext.setV8BindingEnabler(method);
                    }
                }
            }
            BindingContextStore.getMap().put(cls, bindingContext);
        }
        return bindingContext;
    }

    public Boolean getBoolean(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Boolean boolObjectGetBoolean = this.v8Runtime.getV8Internal().objectGetBoolean(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return boolObjectGetBoolean;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Double getDouble(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Double dObjectGetDouble = this.v8Runtime.getV8Internal().objectGetDouble(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return dObjectGetDouble;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Integer getInteger(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Integer numObjectGetInteger = this.v8Runtime.getV8Internal().objectGetInteger(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return numObjectGetInteger;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Long getLong(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            Long lObjectGetLong = this.v8Runtime.getV8Internal().objectGetLong(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return lObjectGetLong;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T getProperty(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            T t3 = (T) this.v8Runtime.getV8Internal().objectGetProperty(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return t3;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends IV8ValueObject> T getPrototype() throws JavetException {
        return (T) get(PROPERTY_PROTOTYPE);
    }

    public String getString(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            String strObjectGetString = this.v8Runtime.getV8Internal().objectGetString(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return strObjectGetString;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Object;
    }

    public boolean has(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zObjectHas = this.v8Runtime.getV8Internal().objectHas(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zObjectHas;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean hasOwnProperty(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zObjectHasOwnProperty = this.v8Runtime.getV8Internal().objectHasOwnProperty(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zObjectHasOwnProperty;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean sameValue(V8Value v8Value) throws JavetException {
        if (!(v8Value instanceof V8ValueObject) || v8Value.getClass() != getClass()) {
            return false;
        }
        V8ValueObject v8ValueObject = (V8ValueObject) v8Value;
        if (getHandle() == v8ValueObject.getHandle()) {
            return true;
        }
        return checkV8Runtime().getV8Internal().sameValue(this, v8ValueObject);
    }

    public boolean setBoolean(Object obj, Boolean bool) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (bool == null) {
                boolean zObjectSetNull = this.v8Runtime.getV8Internal().objectSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zObjectSetNull;
            }
            boolean zObjectSetBoolean = this.v8Runtime.getV8Internal().objectSetBoolean(this, v8VirtualValue.get(), bool.booleanValue());
            v8VirtualValue.close();
            return zObjectSetBoolean;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean setDouble(Object obj, Double d2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (d2 == null) {
                boolean zObjectSetNull = this.v8Runtime.getV8Internal().objectSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zObjectSetNull;
            }
            boolean zObjectSetDouble = this.v8Runtime.getV8Internal().objectSetDouble(this, v8VirtualValue.get(), d2.doubleValue());
            v8VirtualValue.close();
            return zObjectSetDouble;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean setInteger(Object obj, Integer num) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (num == null) {
                boolean zObjectSetNull = this.v8Runtime.getV8Internal().objectSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zObjectSetNull;
            }
            boolean zObjectSetInteger = this.v8Runtime.getV8Internal().objectSetInteger(this, v8VirtualValue.get(), num.intValue());
            v8VirtualValue.close();
            return zObjectSetInteger;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean setLong(Object obj, Long l2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            if (l2 == null) {
                boolean zObjectSetNull = this.v8Runtime.getV8Internal().objectSetNull(this, v8VirtualValue.get());
                v8VirtualValue.close();
                return zObjectSetNull;
            }
            boolean zObjectSetLong = this.v8Runtime.getV8Internal().objectSetLong(this, v8VirtualValue.get(), l2.longValue());
            v8VirtualValue.close();
            return zObjectSetLong;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean setNull(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zObjectSetNull = this.v8Runtime.getV8Internal().objectSetNull(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zObjectSetNull;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setProperty(Object obj, Object obj2) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            V8VirtualValue v8VirtualValue2 = new V8VirtualValue(this.v8Runtime, null, obj2);
            try {
                boolean zObjectSetProperty = this.v8Runtime.getV8Internal().objectSetProperty(this, v8VirtualValue.get(), v8VirtualValue2.get());
                v8VirtualValue2.close();
                v8VirtualValue.close();
                return zObjectSetProperty;
            } finally {
            }
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean setString(Object obj, String str) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zObjectSetString = this.v8Runtime.getV8Internal().objectSetString(this, v8VirtualValue.get(), str);
            v8VirtualValue.close();
            return zObjectSetString;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean setUndefined(Object obj) throws JavetException {
        V8Runtime v8RuntimeCheckV8Runtime = checkV8Runtime();
        JavetObjectConverter javetObjectConverter = V8Value.OBJECT_CONVERTER;
        Objects.requireNonNull(obj);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(v8RuntimeCheckV8Runtime, javetObjectConverter, obj);
        try {
            boolean zObjectSetUndefined = this.v8Runtime.getV8Internal().objectSetUndefined(this, v8VirtualValue.get());
            v8VirtualValue.close();
            return zObjectSetUndefined;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean strictEquals(V8Value v8Value) throws JavetException {
        if (!(v8Value instanceof V8ValueObject) || v8Value.getClass() != getClass()) {
            return false;
        }
        V8ValueObject v8ValueObject = (V8ValueObject) v8Value;
        if (getHandle() == v8ValueObject.getHandle()) {
            return true;
        }
        return checkV8Runtime().getV8Internal().strictEquals(this, v8ValueObject);
    }

    protected V8ValueObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public int batchGet(V8Value[] v8ValueArr, V8Value[] v8ValueArr2, int i2) throws JavetException {
        return checkV8Runtime().getV8Internal().batchObjectGet(this, v8ValueArr, v8ValueArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean bindFunction(JavetCallbackContext javetCallbackContext) throws JavetException {
        Objects.requireNonNull(javetCallbackContext);
        String name = javetCallbackContext.getName();
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType[javetCallbackContext.getSymbolType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                V8ValueFunction v8ValueFunctionCreateV8ValueFunction = checkV8Runtime().createV8ValueFunction(javetCallbackContext);
                try {
                    boolean z2 = set(name, v8ValueFunctionCreateV8ValueFunction);
                    if (v8ValueFunctionCreateV8ValueFunction != null) {
                        v8ValueFunctionCreateV8ValueFunction.close();
                    }
                    return z2;
                } catch (Throwable th) {
                    if (v8ValueFunctionCreateV8ValueFunction != null) {
                        try {
                            v8ValueFunctionCreateV8ValueFunction.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            V8ValueSymbol v8ValueSymbolCreateV8ValueSymbol = this.v8Runtime.createV8ValueSymbol(name, true);
            try {
                V8ValueFunction v8ValueFunctionCreateV8ValueFunction2 = checkV8Runtime().createV8ValueFunction(javetCallbackContext);
                try {
                    boolean z3 = set(v8ValueSymbolCreateV8ValueSymbol, v8ValueFunctionCreateV8ValueFunction2);
                    if (v8ValueFunctionCreateV8ValueFunction2 != null) {
                        v8ValueFunctionCreateV8ValueFunction2.close();
                    }
                    if (v8ValueSymbolCreateV8ValueSymbol != null) {
                        v8ValueSymbolCreateV8ValueSymbol.close();
                    }
                    return z3;
                } finally {
                }
            } catch (Throwable th3) {
                if (v8ValueSymbolCreateV8ValueSymbol != null) {
                    try {
                        v8ValueSymbolCreateV8ValueSymbol.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        V8ValueBuiltInSymbol builtInSymbol = this.v8Runtime.getGlobalObject().getBuiltInSymbol();
        try {
            V8ValueSymbol builtInSymbol2 = builtInSymbol.getBuiltInSymbol(name);
            try {
                if (builtInSymbol2 != null) {
                    V8ValueFunction v8ValueFunctionCreateV8ValueFunction3 = checkV8Runtime().createV8ValueFunction(javetCallbackContext);
                    try {
                        boolean z4 = set(builtInSymbol2, v8ValueFunctionCreateV8ValueFunction3);
                        if (v8ValueFunctionCreateV8ValueFunction3 != null) {
                            v8ValueFunctionCreateV8ValueFunction3.close();
                        }
                        builtInSymbol2.close();
                        builtInSymbol.close();
                        return z4;
                    } finally {
                    }
                }
                throw new JavetException(JavetError.ConverterSymbolNotBuiltIn, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_SYMBOL, name));
            } finally {
            }
        } catch (Throwable th5) {
            if (builtInSymbol != null) {
            }
            throw th5;
        }
        if (builtInSymbol != null) {
            try {
                builtInSymbol.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
        }
        throw th5;
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean bindProperty(JavetCallbackContext javetCallbackContext, JavetCallbackContext javetCallbackContext2) throws JavetException {
        Objects.requireNonNull(javetCallbackContext);
        String name = javetCallbackContext.getName();
        int i2 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType[javetCallbackContext.getSymbolType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                V8ValueString v8ValueStringCreateV8ValueString = this.v8Runtime.createV8ValueString(name);
                try {
                    boolean zObjectSetAccessor = checkV8Runtime().getV8Internal().objectSetAccessor(this, v8ValueStringCreateV8ValueString, javetCallbackContext, javetCallbackContext2);
                    if (v8ValueStringCreateV8ValueString != null) {
                        v8ValueStringCreateV8ValueString.close();
                    }
                    return zObjectSetAccessor;
                } catch (Throwable th) {
                    if (v8ValueStringCreateV8ValueString != null) {
                        try {
                            v8ValueStringCreateV8ValueString.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            V8ValueSymbol v8ValueSymbolCreateV8ValueSymbol = this.v8Runtime.createV8ValueSymbol(name, true);
            try {
                boolean zObjectSetAccessor2 = checkV8Runtime().getV8Internal().objectSetAccessor(this, v8ValueSymbolCreateV8ValueSymbol, javetCallbackContext, javetCallbackContext2);
                if (v8ValueSymbolCreateV8ValueSymbol != null) {
                    v8ValueSymbolCreateV8ValueSymbol.close();
                }
                return zObjectSetAccessor2;
            } catch (Throwable th3) {
                if (v8ValueSymbolCreateV8ValueSymbol != null) {
                    try {
                        v8ValueSymbolCreateV8ValueSymbol.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        V8ValueBuiltInSymbol builtInSymbol = this.v8Runtime.getGlobalObject().getBuiltInSymbol();
        try {
            V8ValueSymbol builtInSymbol2 = builtInSymbol.getBuiltInSymbol(name);
            try {
                if (builtInSymbol2 != null) {
                    boolean zObjectSetAccessor3 = checkV8Runtime().getV8Internal().objectSetAccessor(this, builtInSymbol2, javetCallbackContext, javetCallbackContext2);
                    builtInSymbol2.close();
                    builtInSymbol.close();
                    return zObjectSetAccessor3;
                }
                throw new JavetException(JavetError.ConverterSymbolNotBuiltIn, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_SYMBOL, name));
            } finally {
            }
        } catch (Throwable th5) {
            if (builtInSymbol != null) {
                try {
                    builtInSymbol.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean deletePrivateProperty(String str) throws JavetException {
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        Objects.requireNonNull(str);
        return v8Internal.objectDeletePrivateProperty(this, str);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public int getIdentityHash() throws JavetException {
        return checkV8Runtime().getV8Internal().objectGetIdentityHash(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public IV8ValueArray getOwnPropertyNames() throws JavetException {
        return checkV8Runtime().getV8Internal().objectGetOwnPropertyNames(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T getPrivateProperty(String str) throws JavetException {
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        Objects.requireNonNull(str);
        return (T) v8Internal.objectGetPrivateProperty(this, str);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public IV8ValueArray getPropertyNames() throws JavetException {
        return checkV8Runtime().getV8Internal().objectGetPropertyNames(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean hasInternalType(V8ValueInternalType v8ValueInternalType) throws JavetException {
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        Objects.requireNonNull(v8ValueInternalType);
        return v8Internal.hasInternalType(this, v8ValueInternalType);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean hasPrivateProperty(String str) throws JavetException {
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        Objects.requireNonNull(str);
        return v8Internal.objectHasPrivateProperty(this, str);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean isFrozen() throws JavetException {
        return checkV8Runtime().getV8Internal().objectIsFrozen(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean isSealed() throws JavetException {
        return checkV8Runtime().getV8Internal().objectIsSealed(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setPrivateProperty(String str, Object obj) throws JavetException {
        Objects.requireNonNull(str);
        V8VirtualValue v8VirtualValue = new V8VirtualValue(checkV8Runtime(), null, obj);
        try {
            boolean zObjectSetPrivateProperty = this.v8Runtime.getV8Internal().objectSetPrivateProperty(this, str, v8VirtualValue.get());
            v8VirtualValue.close();
            return zObjectSetPrivateProperty;
        } catch (Throwable th) {
            try {
                v8VirtualValue.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean setPrototype(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return set(PROPERTY_PROTOTYPE, v8Value);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public String toJsonString() {
        try {
            V8ValueBuiltInJson builtInJson = checkV8Runtime().getGlobalObject().getBuiltInJson();
            try {
                String strStringify = builtInJson.stringify(this);
                builtInJson.close();
                return strStringify;
            } finally {
            }
        } catch (JavetException e2) {
            return e2.getMessage();
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public String toProtoString() {
        try {
            return checkV8Runtime().getV8Internal().objectToProtoString(this);
        } catch (JavetException e2) {
            return e2.getMessage();
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public int unbind(Object obj) throws JavetException {
        boolean zUnbindProperty;
        Objects.requireNonNull(obj);
        checkV8Runtime();
        int i2 = 0;
        if (obj instanceof IJavetDirectCallable) {
            IJavetDirectCallable iJavetDirectCallable = (IJavetDirectCallable) obj;
            iJavetDirectCallable.setV8Runtime(this.v8Runtime);
            JavetCallbackContext[] callbackContexts = iJavetDirectCallable.getCallbackContexts();
            Objects.requireNonNull(callbackContexts);
            int i3 = 0;
            for (JavetCallbackContext javetCallbackContext : callbackContexts) {
                int i5 = AnonymousClass1.$SwitchMap$com$caoccao$javet$interop$callback$JavetCallbackType[javetCallbackContext.getCallbackType().ordinal()];
                if (i5 != 1 && i5 != 2) {
                    if (i5 != 3 && i5 != 4) {
                        zUnbindProperty = unbindFunction(javetCallbackContext.getName());
                    } else {
                        zUnbindProperty = false;
                    }
                } else {
                    zUnbindProperty = unbindProperty(javetCallbackContext);
                }
                if (zUnbindProperty) {
                    i3++;
                }
            }
            return i3;
        }
        BindingContext bindingContext = getBindingContext(obj.getClass());
        Map<String, MethodDescriptor> propertyGetterMap = bindingContext.getPropertyGetterMap();
        Map<String, MethodDescriptor> functionMap = bindingContext.getFunctionMap();
        Method v8BindingEnabler = bindingContext.getV8BindingEnabler();
        if (!propertyGetterMap.isEmpty()) {
            for (Map.Entry<String, MethodDescriptor> entry : propertyGetterMap.entrySet()) {
                String key = entry.getKey();
                MethodDescriptor value = entry.getValue();
                if (v8BindingEnabler != null) {
                    try {
                        if (!((Boolean) v8BindingEnabler.invoke(obj, value.getMethod().getName())).booleanValue()) {
                        }
                    } catch (Exception e2) {
                        throw new JavetException(JavetError.CallbackUnregistrationFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, value.getMethod().getName(), "message", e2.getMessage()), e2);
                    }
                }
                if (unbindProperty(key, value.getSymbolType())) {
                    i2++;
                }
            }
        }
        if (!functionMap.isEmpty()) {
            for (Map.Entry<String, MethodDescriptor> entry2 : functionMap.entrySet()) {
                String key2 = entry2.getKey();
                MethodDescriptor value2 = entry2.getValue();
                if (v8BindingEnabler != null) {
                    try {
                        if (!((Boolean) v8BindingEnabler.invoke(obj, value2.getMethod().getName())).booleanValue()) {
                        }
                    } catch (Exception e3) {
                        throw new JavetException(JavetError.CallbackUnregistrationFailure, SimpleMap.of(JavetError.PARAMETER_METHOD_NAME, value2.getMethod().getName(), "message", e3.getMessage()), e3);
                    }
                }
                if (unbindFunction(key2, value2.getSymbolType())) {
                    i2++;
                }
            }
        }
        return i2;
    }

    protected boolean unbindFunction(String str, V8ValueSymbolType v8ValueSymbolType) throws JavetException {
        Objects.requireNonNull(str);
        int[] iArr = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType;
        Objects.requireNonNull(v8ValueSymbolType);
        int i2 = iArr[v8ValueSymbolType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return delete(str);
            }
            V8ValueSymbol v8ValueSymbolCreateV8ValueSymbol = this.v8Runtime.createV8ValueSymbol(str, true);
            try {
                boolean zDelete = delete(v8ValueSymbolCreateV8ValueSymbol);
                if (v8ValueSymbolCreateV8ValueSymbol != null) {
                    v8ValueSymbolCreateV8ValueSymbol.close();
                }
                return zDelete;
            } catch (Throwable th) {
                if (v8ValueSymbolCreateV8ValueSymbol != null) {
                    try {
                        v8ValueSymbolCreateV8ValueSymbol.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        V8ValueBuiltInSymbol builtInSymbol = this.v8Runtime.getGlobalObject().getBuiltInSymbol();
        try {
            V8ValueSymbol builtInSymbol2 = builtInSymbol.getBuiltInSymbol(str);
            try {
                if (builtInSymbol2 != null) {
                    boolean zDelete2 = delete(builtInSymbol2);
                    builtInSymbol2.close();
                    builtInSymbol.close();
                    return zDelete2;
                }
                throw new JavetException(JavetError.ConverterSymbolNotBuiltIn, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_SYMBOL, str));
            } finally {
            }
        } catch (Throwable th3) {
            if (builtInSymbol != null) {
                try {
                    builtInSymbol.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    protected boolean unbindProperty(String str, V8ValueSymbolType v8ValueSymbolType) throws JavetException {
        Objects.requireNonNull(str);
        int[] iArr = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueSymbolType;
        Objects.requireNonNull(v8ValueSymbolType);
        int i2 = iArr[v8ValueSymbolType.ordinal()];
        if (i2 == 1) {
            V8ValueBuiltInSymbol builtInSymbol = this.v8Runtime.getGlobalObject().getBuiltInSymbol();
            try {
                V8ValueSymbol builtInSymbol2 = builtInSymbol.getBuiltInSymbol(str);
                try {
                    if (builtInSymbol2 != null) {
                        boolean zUnbindProperty = unbindProperty(builtInSymbol2);
                        builtInSymbol2.close();
                        builtInSymbol.close();
                        return zUnbindProperty;
                    }
                    throw new JavetException(JavetError.ConverterSymbolNotBuiltIn, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_SYMBOL, str));
                } finally {
                }
            } catch (Throwable th) {
                if (builtInSymbol != null) {
                    try {
                        builtInSymbol.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (i2 != 2) {
            V8ValueString v8ValueStringCreateV8ValueString = this.v8Runtime.createV8ValueString(str);
            try {
                boolean zUnbindProperty2 = unbindProperty(v8ValueStringCreateV8ValueString);
                if (v8ValueStringCreateV8ValueString != null) {
                    v8ValueStringCreateV8ValueString.close();
                }
                return zUnbindProperty2;
            } catch (Throwable th3) {
                if (v8ValueStringCreateV8ValueString != null) {
                    try {
                        v8ValueStringCreateV8ValueString.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        V8ValueSymbol v8ValueSymbolCreateV8ValueSymbol = this.v8Runtime.createV8ValueSymbol(str, true);
        try {
            boolean zUnbindProperty3 = unbindProperty(v8ValueSymbolCreateV8ValueSymbol);
            if (v8ValueSymbolCreateV8ValueSymbol != null) {
                v8ValueSymbolCreateV8ValueSymbol.close();
            }
            return zUnbindProperty3;
        } catch (Throwable th5) {
            if (v8ValueSymbolCreateV8ValueSymbol != null) {
                try {
                    v8ValueSymbolCreateV8ValueSymbol.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    public boolean set(Object... objArr) throws JavetException {
        if (!ArrayUtils.isNotEmpty(objArr)) {
            return false;
        }
        int length = objArr.length;
        int i2 = length >> 1;
        Object[] objArr2 = new Object[i2];
        Object[] objArr3 = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = i3 * 2;
            objArr2[i3] = objArr[i5];
            objArr3[i3] = objArr[i5 + 1];
        }
        V8VirtualValueList v8VirtualValueList = new V8VirtualValueList(checkV8Runtime(), V8Value.OBJECT_CONVERTER, objArr2);
        try {
            V8VirtualValueList v8VirtualValueList2 = new V8VirtualValueList(this.v8Runtime, null, objArr3);
            try {
                V8Value[] v8ValueArr = v8VirtualValueList.get();
                V8Value[] v8ValueArr2 = v8VirtualValueList2.get();
                V8Value[] v8ValueArr3 = new V8Value[length];
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = i7 * 2;
                    v8ValueArr3[i8] = v8ValueArr[i7];
                    v8ValueArr3[i8 + 1] = v8ValueArr2[i7];
                }
                boolean zObjectSet = this.v8Runtime.getV8Internal().objectSet(this, v8ValueArr3);
                v8VirtualValueList2.close();
                v8VirtualValueList.close();
                return zObjectSet;
            } finally {
            }
        } catch (Throwable th) {
            try {
                v8VirtualValueList.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T invokeExtended(String str, boolean z2, V8Value... v8ValueArr) throws JavetException {
        Objects.requireNonNull(str);
        return (T) checkV8Runtime().getV8Internal().objectInvoke(this, str, z2, v8ValueArr);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean unbindProperty(V8ValueString v8ValueString) throws JavetException {
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        Objects.requireNonNull(v8ValueString);
        return v8Internal.objectSetAccessor(this, v8ValueString, null, null);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public <Key extends V8Value, Value extends V8Value, E extends Throwable> int forEach(IJavetBiIndexedConsumer<Key, Value, E> iJavetBiIndexedConsumer, int i2) throws Throwable {
        Objects.requireNonNull(iJavetBiIndexedConsumer);
        IV8ValueArray ownPropertyNames = getOwnPropertyNames();
        try {
            int iMax = Math.max(1, i2);
            int length = ownPropertyNames.getLength();
            if (length > 0) {
                V8Value[] v8ValueArr = new V8Value[iMax];
                V8Value[] v8ValueArr2 = new V8Value[iMax];
                int i3 = ((length + iMax) - 1) / iMax;
                int i5 = 0;
                while (i5 < i3) {
                    int i7 = i5 * iMax;
                    try {
                        int iBatchGet = ownPropertyNames.batchGet(v8ValueArr, i7, i5 == i3 + (-1) ? length : i7 + iMax);
                        try {
                            batchGet(v8ValueArr, v8ValueArr2, iBatchGet);
                            for (int i8 = 0; i8 < iBatchGet; i8++) {
                                iJavetBiIndexedConsumer.accept(i7 + i8, v8ValueArr[i8], v8ValueArr2[i8]);
                            }
                            try {
                                JavetResourceUtils.safeClose(v8ValueArr);
                                JavetResourceUtils.safeClose(v8ValueArr2);
                                Arrays.fill(v8ValueArr, (Object) null);
                                Arrays.fill(v8ValueArr2, (Object) null);
                                i5++;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                if (ownPropertyNames == null) {
                                    throw th2;
                                }
                                try {
                                    ownPropertyNames.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            JavetResourceUtils.safeClose(v8ValueArr);
                            JavetResourceUtils.safeClose(v8ValueArr2);
                            Arrays.fill(v8ValueArr, (Object) null);
                            Arrays.fill(v8ValueArr2, (Object) null);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
            ownPropertyNames.close();
            return length;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueObject
    public boolean unbindProperty(V8ValueSymbol v8ValueSymbol) throws JavetException {
        V8Internal v8Internal = checkV8Runtime().getV8Internal();
        Objects.requireNonNull(v8ValueSymbol);
        return v8Internal.objectSetAccessor(this, v8ValueSymbol, null, null);
    }
}
