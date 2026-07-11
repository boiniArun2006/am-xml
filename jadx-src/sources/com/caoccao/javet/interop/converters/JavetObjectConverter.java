package com.caoccao.javet.interop.converters;

import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.caoccao.javet.entities.JavetEntityError;
import com.caoccao.javet.entities.JavetEntityFunction;
import com.caoccao.javet.entities.JavetEntityMap;
import com.caoccao.javet.entities.JavetEntitySymbol;
import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetBiConsumer;
import com.caoccao.javet.interfaces.IJavetEntityError;
import com.caoccao.javet.interfaces.IJavetEntityFunction;
import com.caoccao.javet.interfaces.IJavetEntityMap;
import com.caoccao.javet.interfaces.IJavetEntityObject;
import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import com.caoccao.javet.interfaces.IJavetEntitySymbol;
import com.caoccao.javet.interfaces.IJavetUniConsumer;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8Scope;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.proxy.IJavetProxyHandler;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValueObject;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueError;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueMap;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.V8ValueProxy;
import com.caoccao.javet.values.reference.V8ValueSet;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.BaseStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class JavetObjectConverter extends JavetPrimitiveConverter {
    protected static final int EXECUTABLE_INDEX_DEFAULT_CONSTRUCTOR = 0;
    protected static final int EXECUTABLE_INDEX_FROM_MAP = 1;
    protected static final int EXECUTABLE_INDEX_TO_MAP = 2;
    protected static final String METHOD_NAME_FROM_MAP = "fromMap";
    protected static final String METHOD_NAME_TO_MAP = "toMap";
    protected static final JavetObjectConverter OBJECT_CONVERTER = new JavetObjectConverter();
    protected static final String PRIVATE_PROPERTY_CUSTOM_OBJECT_CLASS_NAME = "JavetObjectConverter#customObjectClassName";
    protected static final String PRIVATE_PROPERTY_PROXY_TARGET = "Javet#proxyTarget";
    protected static final String PROPERTY_NAME = "name";
    protected static final String PUBLIC_PROPERTY_CONSTRUCTOR = "constructor";
    protected Map<String, AccessibleObject[]> customObjectMap = new ConcurrentHashMap();

    public boolean registerCustomObject(Class<?> cls) {
        return registerCustomObject(cls, METHOD_NAME_FROM_MAP, METHOD_NAME_TO_MAP);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.caoccao.javet.values.reference.V8ValueTypedArray] */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.caoccao.javet.values.reference.V8ValueTypedArray] */
    /* JADX WARN: Type inference failed for: r13v15, types: [com.caoccao.javet.values.reference.V8ValueTypedArray] */
    /* JADX WARN: Type inference failed for: r13v17, types: [com.caoccao.javet.values.reference.IV8ValueArray, com.caoccao.javet.values.reference.V8ValueArray] */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.caoccao.javet.values.reference.V8ValueTypedArray] */
    /* JADX WARN: Type inference failed for: r13v20, types: [T extends com.caoccao.javet.values.V8Value] */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.caoccao.javet.values.reference.IV8ValueArray, com.caoccao.javet.values.reference.V8ValueArray] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.caoccao.javet.values.reference.IV8ValueArray, com.caoccao.javet.values.reference.V8ValueArray] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.caoccao.javet.values.reference.V8ValueTypedArray] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.caoccao.javet.values.reference.V8ValueTypedArray] */
    @Override // com.caoccao.javet.interop.converters.JavetPrimitiveConverter, com.caoccao.javet.interop.converters.BaseJavetConverter
    protected <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj, int i2) throws JavetException {
        V8ValueArray v8ValueArrayCreateV8ValueArray;
        V8ValueObject v8ValueObject = (T) super.toV8Value(v8Runtime, obj, i2);
        if (v8ValueObject != null && !v8ValueObject.isUndefined()) {
            return v8ValueObject;
        }
        if (obj instanceof IJavetEntityMap) {
            V8Scope v8Scope = v8Runtime.getV8Scope();
            try {
                V8ValueMap v8ValueMapCreateV8ValueMap = v8Scope.createV8ValueMap();
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size() << 1);
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(entry.getKey() instanceof String ? entry.getKey() : entry.getKey().toString());
                        arrayList.add(toV8Value(v8Runtime, entry.getValue(), i2 + 1));
                    }
                    v8ValueMapCreateV8ValueMap.set(arrayList.toArray());
                    v8Scope.setEscapable();
                    JavetResourceUtils.safeClose(arrayList);
                    v8Scope.close();
                    return v8ValueMapCreateV8ValueMap;
                } catch (Throwable th) {
                    JavetResourceUtils.safeClose(arrayList);
                    throw th;
                }
            } finally {
            }
        } else {
            if (!(obj instanceof Map)) {
                if (obj instanceof Set) {
                    V8Scope v8Scope2 = v8Runtime.getV8Scope();
                    try {
                        V8ValueSet v8ValueSetCreateV8ValueSet = v8Scope2.createV8ValueSet();
                        Iterator it = ((Set) obj).iterator();
                        while (it.hasNext()) {
                            V8Value v8Value = toV8Value(v8Runtime, it.next(), i2 + 1);
                            try {
                                v8ValueSetCreateV8ValueSet.add(v8Value);
                                if (v8Value != null) {
                                    v8Value.close();
                                }
                            } finally {
                            }
                        }
                        v8Scope2.setEscapable();
                        v8Scope2.close();
                        return v8ValueSetCreateV8ValueSet;
                    } finally {
                        if (v8Scope2 == null) {
                            throw th;
                        }
                        try {
                            v8Scope2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                int i3 = 0;
                v8ValueArr = null;
                V8Value[] v8ValueArr = null;
                v8ValueArr = null;
                V8Value[] v8ValueArr2 = null;
                v8ValueArr = null;
                V8Value[] v8ValueArr3 = null;
                v8ValueArr = null;
                V8Value[] v8ValueArr4 = null;
                if (obj instanceof Collection) {
                    V8Scope v8Scope3 = v8Runtime.getV8Scope();
                    try {
                        Collection collection = (Collection) obj;
                        try {
                            if (!collection.isEmpty()) {
                                v8ValueArr = new V8Value[collection.size()];
                                Iterator it2 = collection.iterator();
                                while (it2.hasNext()) {
                                    v8ValueArr[i3] = toV8Value(v8Runtime, it2.next(), i2 + 1);
                                    i3++;
                                }
                            }
                            V8ValueArray v8ValueArrayCreateV8ValueArray2 = v8Scope3.createV8ValueArray();
                            if (v8ValueArr != null) {
                                v8ValueArrayCreateV8ValueArray2.push(v8ValueArr);
                            }
                            v8Scope3.setEscapable();
                            if (v8ValueArr != null) {
                                JavetResourceUtils.safeClose(v8ValueArr);
                            }
                            v8Scope3.close();
                            return v8ValueArrayCreateV8ValueArray2;
                        } catch (Throwable th3) {
                            if (v8ValueArr == null) {
                                throw th3;
                            }
                            JavetResourceUtils.safeClose(v8ValueArr);
                            throw th3;
                        }
                    } finally {
                        if (v8Scope3 == null) {
                            throw th;
                        }
                        try {
                            v8Scope3.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                }
                if (obj instanceof BaseStream) {
                    V8Scope v8Scope4 = v8Runtime.getV8Scope();
                    try {
                        Iterator it3 = ((BaseStream) obj).iterator();
                        ArrayList arrayList2 = new ArrayList();
                        while (it3.hasNext()) {
                            try {
                                arrayList2.add(toV8Value(v8Runtime, it3.next(), i2 + 1));
                            } finally {
                                JavetResourceUtils.safeClose(arrayList2);
                            }
                        }
                        V8ValueArray v8ValueArrayCreateV8ValueArray3 = v8Scope4.createV8ValueArray();
                        if (!arrayList2.isEmpty()) {
                            v8ValueArrayCreateV8ValueArray3.push(arrayList2.toArray());
                        }
                        v8Scope4.setEscapable();
                        JavetResourceUtils.safeClose(arrayList2);
                        v8Scope4.close();
                        return v8ValueArrayCreateV8ValueArray3;
                    } finally {
                        if (v8Scope4 == null) {
                            throw th;
                        }
                        try {
                            v8Scope4.close();
                            throw th;
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                    }
                }
                if (obj instanceof IJavetEntityFunction) {
                    IJavetEntityFunction iJavetEntityFunction = (IJavetEntityFunction) obj;
                    String sourceCode = iJavetEntityFunction.getJSFunctionType().isUserDefined() ? iJavetEntityFunction.getSourceCode() : null;
                    return StringUtils.isEmpty(sourceCode) ? v8Runtime.createV8ValueNull() : (T) v8Runtime.getExecutor(sourceCode).execute();
                }
                if (obj instanceof IJavetEntitySymbol) {
                    return v8Runtime.createV8ValueSymbol(((IJavetEntitySymbol) obj).getDescription(), true);
                }
                if (obj instanceof IJavetEntityObject) {
                    return (T) OBJECT_CONVERTER.toV8Value(v8Runtime, ((IJavetEntityObject) obj).getValue(), i2 + 1);
                }
                if (obj instanceof IJavetEntityPropertyDescriptor) {
                    IJavetEntityPropertyDescriptor iJavetEntityPropertyDescriptor = (IJavetEntityPropertyDescriptor) obj;
                    V8Scope v8Scope5 = v8Runtime.getV8Scope();
                    try {
                        V8ValueObject v8ValueObjectCreateV8ValueObject = v8Scope5.createV8ValueObject();
                        V8Value v8Value2 = toV8Value(v8Runtime, iJavetEntityPropertyDescriptor.getValue(), i2 + 1);
                        try {
                            v8ValueObjectCreateV8ValueObject.set(v8Runtime.createV8ValueString(qUrazMnwDskFs.SGNuELAHc), v8Runtime.createV8ValueBoolean(iJavetEntityPropertyDescriptor.isConfigurable()), v8Runtime.createV8ValueString(IJavetEntityPropertyDescriptor.PROXY_PROPERTY_ENUMERABLE), v8Runtime.createV8ValueBoolean(iJavetEntityPropertyDescriptor.isEnumerable()), v8Runtime.createV8ValueString(IJavetEntityPropertyDescriptor.PROXY_PROPERTY_WRITABLE), v8Runtime.createV8ValueBoolean(iJavetEntityPropertyDescriptor.isWritable()), v8Runtime.createV8ValueString("value"), v8Value2);
                            if (v8Value2 != null) {
                                v8Value2.close();
                            }
                            v8Scope5.setEscapable();
                            v8Scope5.close();
                            return v8ValueObjectCreateV8ValueObject;
                        } finally {
                            if (v8Value2 == null) {
                                throw th;
                            }
                            try {
                                v8Value2.close();
                                throw th;
                            } catch (Throwable th6) {
                                th.addSuppressed(th6);
                            }
                        }
                    } catch (Throwable th7) {
                        if (v8Scope5 == null) {
                            throw th7;
                        }
                        try {
                            v8Scope5.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                }
                if (obj instanceof IJavetEntityError) {
                    IJavetEntityError iJavetEntityError = (IJavetEntityError) obj;
                    V8Scope v8Scope6 = v8Runtime.getV8Scope();
                    try {
                        V8ValueError v8ValueErrorCreateV8ValueError = v8Scope6.createV8ValueError(iJavetEntityError.getType(), iJavetEntityError.getMessage());
                        v8ValueErrorCreateV8ValueError.setStack(iJavetEntityError.getStack());
                        ArrayList arrayList3 = new ArrayList(iJavetEntityError.getContext().size() << 1);
                        try {
                            for (Map.Entry<String, Object> entry2 : iJavetEntityError.getContext().entrySet()) {
                                arrayList3.add(entry2.getKey());
                                arrayList3.add(toV8Value(v8Runtime, entry2.getValue(), i2 + 1));
                            }
                            v8ValueErrorCreateV8ValueError.set(arrayList3.toArray());
                            v8Scope6.setEscapable();
                            JavetResourceUtils.safeClose(arrayList3);
                            v8Scope6.close();
                            return v8ValueErrorCreateV8ValueError;
                        } catch (Throwable th9) {
                            JavetResourceUtils.safeClose(arrayList3);
                            throw th9;
                        }
                    } finally {
                        if (v8Scope6 == null) {
                            throw th;
                        }
                        try {
                            v8Scope6.close();
                            throw th;
                        } catch (Throwable th10) {
                            th.addSuppressed(th10);
                        }
                    }
                }
                if (!obj.getClass().isArray()) {
                    if (this.customObjectMap.isEmpty()) {
                        return v8ValueObject;
                    }
                    String name = obj.getClass().getName();
                    AccessibleObject[] accessibleObjectArr = this.customObjectMap.get(name);
                    Method method = accessibleObjectArr != null ? (Method) accessibleObjectArr[2] : null;
                    if (method == null) {
                        return v8ValueObject;
                    }
                    try {
                        v8ValueObject = (T) toV8Value(v8Runtime, (Map) method.invoke(obj, new Object[0]));
                        v8ValueObject.setPrivateProperty(PRIVATE_PROPERTY_CUSTOM_OBJECT_CLASS_NAME, name);
                        return v8ValueObject;
                    } catch (Throwable unused) {
                        return v8ValueObject;
                    }
                }
                V8Scope v8Scope7 = v8Runtime.getV8Scope();
                try {
                    if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        try {
                            if (zArr.length > 0) {
                                v8ValueArr2 = new V8Value[zArr.length];
                                while (i3 < zArr.length) {
                                    v8ValueArr2[i3] = v8Runtime.createV8ValueBoolean(zArr[i3]);
                                    i3++;
                                }
                            }
                            v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueArray();
                            if (v8ValueArr2 != null) {
                                v8ValueArrayCreateV8ValueArray.push(v8ValueArr2);
                            }
                            if (v8ValueArr2 != null) {
                                JavetResourceUtils.safeClose(v8ValueArr2);
                            }
                        } catch (Throwable th11) {
                            if (v8ValueArr2 == null) {
                                throw th11;
                            }
                            JavetResourceUtils.safeClose(v8ValueArr2);
                            throw th11;
                        }
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueTypedArray(V8ValueReferenceType.Int8Array, bArr.length);
                        v8ValueArrayCreateV8ValueArray.fromBytes(bArr);
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        try {
                            if (cArr.length > 0) {
                                v8ValueArr3 = new V8Value[cArr.length];
                                while (i3 < cArr.length) {
                                    v8ValueArr3[i3] = v8Runtime.createV8ValueString(Character.toString(cArr[i3]));
                                    i3++;
                                }
                            }
                            v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueArray();
                            if (v8ValueArr3 != null) {
                                v8ValueArrayCreateV8ValueArray.push(v8ValueArr3);
                            }
                            if (v8ValueArr3 != null) {
                                JavetResourceUtils.safeClose(v8ValueArr3);
                            }
                        } catch (Throwable th12) {
                            if (v8ValueArr3 == null) {
                                throw th12;
                            }
                            JavetResourceUtils.safeClose(v8ValueArr3);
                            throw th12;
                        }
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueTypedArray(V8ValueReferenceType.Float64Array, dArr.length);
                        v8ValueArrayCreateV8ValueArray.fromDoubles(dArr);
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueTypedArray(V8ValueReferenceType.Float32Array, fArr.length);
                        v8ValueArrayCreateV8ValueArray.fromFloats(fArr);
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueTypedArray(V8ValueReferenceType.Int32Array, iArr.length);
                        v8ValueArrayCreateV8ValueArray.fromIntegers(iArr);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueTypedArray(V8ValueReferenceType.BigInt64Array, jArr.length);
                        v8ValueArrayCreateV8ValueArray.fromLongs(jArr);
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueTypedArray(V8ValueReferenceType.Int16Array, sArr.length);
                        v8ValueArrayCreateV8ValueArray.fromShorts(sArr);
                    } else {
                        Object[] objArr = (Object[]) obj;
                        try {
                            if (objArr.length > 0) {
                                v8ValueArr4 = new V8Value[objArr.length];
                                while (i3 < objArr.length) {
                                    v8ValueArr4[i3] = toV8Value(v8Runtime, objArr[i3], i2 + 1);
                                    i3++;
                                }
                            }
                            v8ValueArrayCreateV8ValueArray = v8Scope7.createV8ValueArray();
                            if (v8ValueArr4 != null) {
                                v8ValueArrayCreateV8ValueArray.push(v8ValueArr4);
                            }
                            if (v8ValueArr4 != null) {
                                JavetResourceUtils.safeClose(v8ValueArr4);
                            }
                        } catch (Throwable th13) {
                            if (v8ValueArr4 == null) {
                                throw th13;
                            }
                            JavetResourceUtils.safeClose(v8ValueArr4);
                            throw th13;
                        }
                    }
                    v8Scope7.setEscapable();
                    v8Scope7.close();
                    return (T) v8ValueArrayCreateV8ValueArray;
                } catch (Throwable th14) {
                    if (v8Scope7 == null) {
                        throw th14;
                    }
                    try {
                        v8Scope7.close();
                        throw th14;
                    } catch (Throwable th15) {
                        th14.addSuppressed(th15);
                        throw th14;
                    }
                }
            }
            V8Scope v8Scope8 = v8Runtime.getV8Scope();
            try {
                V8ValueObject v8ValueObjectCreateV8ValueObject2 = v8Scope8.createV8ValueObject();
                Map map2 = (Map) obj;
                ArrayList arrayList4 = new ArrayList(map2.size() << 1);
                try {
                    for (Map.Entry entry3 : map2.entrySet()) {
                        arrayList4.add(entry3.getKey() instanceof String ? entry3.getKey() : entry3.getKey().toString());
                        arrayList4.add(toV8Value(v8Runtime, entry3.getValue(), i2 + 1));
                    }
                    v8ValueObjectCreateV8ValueObject2.set(arrayList4.toArray());
                    v8Scope8.setEscapable();
                    JavetResourceUtils.safeClose(arrayList4);
                    v8Scope8.close();
                    return v8ValueObjectCreateV8ValueObject2;
                } catch (Throwable th16) {
                    JavetResourceUtils.safeClose(arrayList4);
                    throw th16;
                }
            } finally {
            }
        }
    }

    public boolean unregisterCustomObject(Class<?> cls) {
        return (cls == null || this.customObjectMap.remove(cls.getName()) == null) ? false : true;
    }

    /* JADX INFO: renamed from: com.caoccao.javet.interop.converters.JavetObjectConverter$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$JSFunctionType;
        static final /* synthetic */ int[] $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType;

        static {
            int[] iArr = new int[JSFunctionType.values().length];
            $SwitchMap$com$caoccao$javet$enums$JSFunctionType = iArr;
            try {
                iArr[JSFunctionType.Native.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$JSFunctionType[JSFunctionType.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$JSFunctionType[JSFunctionType.UserDefined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[V8ValueReferenceType.values().length];
            $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType = iArr2;
            try {
                iArr2[V8ValueReferenceType.Int8Array.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint8Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint8ClampedArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Int16Array.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint16Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Int32Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Uint32Array.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float32Array.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.Float64Array.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.BigInt64Array.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[V8ValueReferenceType.BigUint64Array.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    protected IJavetEntityFunction createEntityFunction() {
        return new JavetEntityFunction();
    }

    protected Map<String, Object> createEntityMap() {
        return new JavetEntityMap();
    }

    public boolean registerCustomObject(Class<?> cls, String str, String str2) {
        if (cls == null || str == null || str2 == null || str.isEmpty() || str2.isEmpty() || str.equals(str2) || this.customObjectMap.containsKey(cls.getName())) {
            return false;
        }
        try {
            Constructor<?> constructor = cls.getConstructor(new Class[0]);
            Method method = cls.getMethod(str, Map.class);
            if (Modifier.isStatic(method.getModifiers())) {
                return false;
            }
            Method method2 = cls.getMethod(str2, new Class[0]);
            if (Modifier.isStatic(method2.getModifiers())) {
                return false;
            }
            this.customObjectMap.put(cls.getName(), new AccessibleObject[]{constructor, method, method2});
        } catch (Throwable th) {
            th.printStackTrace(System.err);
        }
        return false;
    }

    public static /* synthetic */ void O(JavetObjectConverter javetObjectConverter, Map map, int i2, V8Value v8Value, V8Value v8Value2) {
        javetObjectConverter.getClass();
        String string = v8Value.toString();
        if (PUBLIC_PROPERTY_CONSTRUCTOR.equals(string)) {
            map.put(PUBLIC_PROPERTY_CONSTRUCTOR, ((V8ValueObject) v8Value2).getString("name"));
        } else {
            if (v8Value2.isUndefined()) {
                return;
            }
            if (javetObjectConverter.config.isSkipFunctionInObject() && (v8Value2 instanceof V8ValueFunction)) {
                return;
            }
            map.put(string, javetObjectConverter.toObject(v8Value2, i2 + 1));
        }
    }

    public static /* synthetic */ void n(JavetObjectConverter javetObjectConverter, Map map, int i2, V8Value v8Value, V8Value v8Value2) {
        javetObjectConverter.getClass();
        map.put(v8Value.toString(), javetObjectConverter.toObject(v8Value2, i2 + 1));
    }

    public static /* synthetic */ void rl(JavetObjectConverter javetObjectConverter, IJavetEntityError iJavetEntityError, int i2, V8Value v8Value, V8Value v8Value2) {
        javetObjectConverter.getClass();
        iJavetEntityError.getContext().put(v8Value.toString(), javetObjectConverter.toObject(v8Value2, i2 + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object, java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, com.caoccao.javet.entities.JavetEntityError, com.caoccao.javet.interfaces.IJavetEntityError] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, com.caoccao.javet.interfaces.IJavetEntityFunction] */
    @Override // com.caoccao.javet.interop.converters.JavetPrimitiveConverter, com.caoccao.javet.interop.converters.BaseJavetConverter
    protected <T> T toObject(V8Value v8Value, final int i2) throws Throwable {
        Constructor constructor;
        Method method;
        JavetCallbackContext callbackContext;
        T t3 = (T) super.toObject(v8Value, i2);
        if (!(t3 instanceof V8Value)) {
            return t3;
        }
        if (v8Value instanceof V8ValueArray) {
            V8ValueArray v8ValueArray = (V8ValueArray) v8Value;
            final ?? r02 = (T) new ArrayList();
            v8ValueArray.forEach(new IJavetUniConsumer() { // from class: com.caoccao.javet.interop.converters.Dsr
                @Override // com.caoccao.javet.interfaces.IJavetUniConsumer
                public final void accept(V8Value v8Value2) {
                    r02.add(this.f51612n.toObject(v8Value2, i2 + 1));
                }
            });
            if (this.config.isSealedEnabled() && v8ValueArray.isSealed()) {
                return (T) r02.toArray();
            }
            return r02;
        }
        if (v8Value instanceof V8ValueSet) {
            final ?? r03 = (T) new HashSet();
            ((V8ValueSet) v8Value).forEach(new IJavetUniConsumer() { // from class: com.caoccao.javet.interop.converters.aC
                @Override // com.caoccao.javet.interfaces.IJavetUniConsumer
                public final void accept(V8Value v8Value2) {
                    r03.add(this.f51618n.toObject(v8Value2, i2 + 1));
                }
            });
            return r03;
        }
        if (v8Value instanceof V8ValueMap) {
            final ?? r04 = (T) createEntityMap();
            ((V8ValueMap) v8Value).forEach(new IJavetBiConsumer() { // from class: com.caoccao.javet.interop.converters.C
                @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
                public final void accept(V8Value v8Value2, V8Value v8Value3) {
                    JavetObjectConverter.n(this.f51610n, r04, i2, v8Value2, v8Value3);
                }
            });
            return r04;
        }
        if (v8Value instanceof V8ValueTypedArray) {
            V8ValueTypedArray v8ValueTypedArray = (V8ValueTypedArray) v8Value;
            switch (AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$V8ValueReferenceType[v8ValueTypedArray.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return (T) v8ValueTypedArray.toBytes();
                case 4:
                case 5:
                    return (T) v8ValueTypedArray.toShorts();
                case 6:
                case 7:
                    return (T) v8ValueTypedArray.toIntegers();
                case 8:
                    return (T) v8ValueTypedArray.toFloats();
                case 9:
                    return (T) v8ValueTypedArray.toDoubles();
                case 10:
                case 11:
                    return (T) v8ValueTypedArray.toLongs();
            }
        }
        if (v8Value instanceof V8ValueFunction) {
            ?? r7 = (T) createEntityFunction();
            if (this.config.isExtractFunctionSourceCode()) {
                V8ValueFunction v8ValueFunction = (V8ValueFunction) v8Value;
                r7.setJSFunctionType(v8ValueFunction.getJSFunctionType());
                int i3 = AnonymousClass1.$SwitchMap$com$caoccao$javet$enums$JSFunctionType[r7.getJSFunctionType().ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3) {
                        r7.setSourceCode(v8ValueFunction.getSourceCode());
                        return r7;
                    }
                } else {
                    r7.setSourceCode(v8ValueFunction.toString());
                }
            }
            return r7;
        }
        if (v8Value instanceof V8ValueSymbol) {
            return (T) new JavetEntitySymbol(((V8ValueSymbol) v8Value).getDescription());
        }
        if (v8Value instanceof V8ValueError) {
            V8ValueError v8ValueError = (V8ValueError) v8Value;
            final ?? r05 = (T) new JavetEntityError(v8ValueError.getErrorType(), v8ValueError.getMessage(), v8ValueError.toString(), v8ValueError.getStack());
            v8ValueError.forEach(new IJavetBiConsumer() { // from class: com.caoccao.javet.interop.converters.o
                @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
                public final void accept(V8Value v8Value2, V8Value v8Value3) {
                    JavetObjectConverter.rl(this.f51621n, r05, i2, v8Value2, v8Value3);
                }
            });
            return r05;
        }
        if (v8Value instanceof V8ValueObject) {
            if (v8Value instanceof V8ValueProxy) {
                V8ValueProxy v8ValueProxy = (V8ValueProxy) v8Value;
                IV8ValueObject handler = v8ValueProxy.getHandler();
                try {
                    Long privatePropertyLong = handler.getPrivatePropertyLong(PRIVATE_PROPERTY_PROXY_TARGET);
                    if (privatePropertyLong != null && (callbackContext = v8ValueProxy.getV8Runtime().getCallbackContext(privatePropertyLong.longValue())) != null) {
                        T t4 = (T) ((IJavetProxyHandler) callbackContext.getCallbackReceiver()).getTargetObject();
                        if (t4 != null) {
                            handler.close();
                            return t4;
                        }
                    }
                    handler.close();
                } catch (Throwable th) {
                    if (handler != null) {
                        try {
                            handler.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            V8ValueObject v8ValueObject = (V8ValueObject) v8Value;
            final ?? r06 = (T) new HashMap();
            v8ValueObject.forEach(new IJavetBiConsumer() { // from class: com.caoccao.javet.interop.converters.qz
                @Override // com.caoccao.javet.interfaces.IJavetBiConsumer
                public final void accept(V8Value v8Value2, V8Value v8Value3) {
                    JavetObjectConverter.O(this.f51623n, r06, i2, v8Value2, v8Value3);
                }
            });
            if (!this.customObjectMap.isEmpty() && v8ValueObject.hasPrivateProperty(PRIVATE_PROPERTY_CUSTOM_OBJECT_CLASS_NAME)) {
                AccessibleObject[] accessibleObjectArr = this.customObjectMap.get(v8ValueObject.getPrivatePropertyString(PRIVATE_PROPERTY_CUSTOM_OBJECT_CLASS_NAME));
                if (accessibleObjectArr != null) {
                    constructor = (Constructor) accessibleObjectArr[0];
                    method = (Method) accessibleObjectArr[1];
                } else {
                    constructor = null;
                    method = null;
                }
                if (constructor != null) {
                    try {
                        T t5 = (T) constructor.newInstance(new Object[0]);
                        method.invoke(t5, r06);
                        return t5;
                    } catch (Throwable unused) {
                    }
                }
            }
            return r06;
        }
        return v8Value;
    }
}
