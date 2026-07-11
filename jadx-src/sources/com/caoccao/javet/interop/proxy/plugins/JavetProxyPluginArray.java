package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.entities.JavetEntityPropertyDescriptor;
import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.exceptions.V8ErrorTemplate;
import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.IJavetProxyHandler;
import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.ListUtils;
import com.caoccao.javet.utils.SimpleList;
import com.caoccao.javet.utils.SimpleSet;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueInteger;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.caoccao.javet.values.virtual.V8VirtualIterator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class JavetProxyPluginArray extends BaseJavetProxyPluginSingle<Object> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String AT = "at";
    protected static final String CONCAT = "concat";
    protected static final String COPY_WITHIN = "copyWithin";
    protected static final String ENTRIES = "entries";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_ARRAY = "Target object must be an array.";
    protected static final String EVERY = "every";
    protected static final String FILL = "fill";
    protected static final String FILTER = "filter";
    protected static final String FIND = "find";
    protected static final String FIND_INDEX = "findIndex";
    protected static final String FIND_LAST = "findLast";
    protected static final String FIND_LAST_INDEX = "findLastIndex";
    protected static final String FLAT = "flat";
    protected static final String FLAT_MAP = "flatMap";
    protected static final String FOR_EACH = "forEach";
    protected static final String INCLUDES = "includes";
    protected static final String INDEX_OF = "indexOf";
    protected static final String JOIN = "join";
    protected static final String KEYS = "keys";
    protected static final String LAST_INDEX_OF = "lastIndexOf";
    protected static final String MAP = "map";
    protected static final String POP = "pop";
    protected static final String PUSH = "push";
    protected static final String REDUCE = "reduce";
    protected static final String REDUCE_RIGHT = "reduceRight";
    protected static final String REVERSE = "reverse";
    protected static final String SHIFT = "shift";
    protected static final String SLICE = "slice";
    protected static final String SOME = "some";
    protected static final String SORT = "sort";
    protected static final String SPLICE = "splice";
    protected static final String TO_REVERSED = "toReversed";
    protected static final String TO_SORTED = "toSorted";
    protected static final String TO_SPLICED = "toSpliced";
    protected static final String UNSHIFT = "unshift";
    protected static final String VALUES = "values";
    protected static final String WITH = "with";
    protected final Set<String> proxyableMethods = SimpleSet.of(DEFAULT_PROXYABLE_METHODS);
    public static final String NAME = Object[].class.getName();
    protected static final String LENGTH = "length";
    protected static final String[] DEFAULT_PROXYABLE_METHODS = {LENGTH, "toString"};
    private static final JavetProxyPluginArray instance = new JavetProxyPluginArray();

    public static /* synthetic */ V8Value KN(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (int length = Array.getLength(obj) - 1; length >= 0; length--) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, length), v8Runtime.createV8ValueInteger(length), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8ValueInteger v8ValueIntegerCreateV8ValueInteger = v8Runtime.createV8ValueInteger(length);
                        v8ValueCall.close();
                        return v8ValueIntegerCreateV8ValueInteger;
                    }
                    v8ValueCall.close();
                } catch (Throwable th) {
                    if (v8ValueCall != null) {
                        try {
                            v8ValueCall.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        return v8Runtime.createV8ValueInteger(-1);
    }

    public static /* synthetic */ V8Value M7(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0, 1);
        ArrayList arrayList = new ArrayList(Array.getLength(obj));
        ListUtils.flat(arrayList, SimpleList.of(ArrayUtils.copyOf(obj)), iAsInt);
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value S(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, i2), v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8ValueBoolean v8ValueBooleanCreateV8ValueBoolean = v8Runtime.createV8ValueBoolean(true);
                        v8ValueCall.close();
                        return v8ValueBooleanCreateV8ValueBoolean;
                    }
                    v8ValueCall.close();
                } catch (Throwable th) {
                    if (v8ValueCall != null) {
                        try {
                            v8ValueCall.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        return v8Runtime.createV8ValueBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ V8Value Uo(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        ArrayList arrayList = new ArrayList();
        ListUtils.addAll(arrayList, obj);
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            for (Object[] objArr : v8ValueArr) {
                if (objArr instanceof IV8ValueArray) {
                    IV8ValueArray iV8ValueArray = (IV8ValueArray) objArr;
                    int length = iV8ValueArray.getLength();
                    V8Value[] v8ValueArr2 = new V8Value[length];
                    if (ArrayUtils.isNotEmpty(v8ValueArr2)) {
                        iV8ValueArray.batchGet(v8ValueArr2, 0, length);
                        Collections.addAll(arrayList, v8ValueArr2);
                    }
                } else {
                    Object object = v8Runtime.toObject(objArr);
                    if (object instanceof List) {
                        Collections.addAll(arrayList, (List) object);
                    } else if (object == null || !object.getClass().isArray()) {
                        arrayList.add(objArr);
                    } else {
                        ListUtils.addAll(arrayList, object);
                    }
                }
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value XQ(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, i2), v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8ValueInteger v8ValueIntegerCreateV8ValueInteger = v8Runtime.createV8ValueInteger(i2);
                        v8ValueCall.close();
                        return v8ValueIntegerCreateV8ValueInteger;
                    }
                    v8ValueCall.close();
                } catch (Throwable th) {
                    if (v8ValueCall != null) {
                        try {
                            v8ValueCall.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        return v8Runtime.createV8ValueInteger(-1);
    }

    public static /* synthetic */ V8Value g(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (int length = Array.getLength(obj) - 1; length >= 0; length--) {
                Object obj2 = Array.get(obj, length);
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, obj2, v8Runtime.createV8ValueInteger(length), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8Value v8Value2 = v8Runtime.toV8Value(obj2);
                        v8ValueCall.close();
                        return v8Value2;
                    }
                    v8ValueCall.close();
                } catch (Throwable th) {
                    if (v8ValueCall != null) {
                        try {
                            v8ValueCall.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value iF(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError == null) {
            return v8Runtime.createV8ValueBoolean(false);
        }
        V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, i2), v8Runtime.createV8ValueInteger(i2), v8Value);
            try {
                if (!v8ValueCall.asBoolean()) {
                    V8ValueBoolean v8ValueBooleanCreateV8ValueBoolean = v8Runtime.createV8ValueBoolean(false);
                    v8ValueCall.close();
                    return v8ValueBooleanCreateV8ValueBoolean;
                }
                v8ValueCall.close();
            } catch (Throwable th) {
                if (v8ValueCall != null) {
                    try {
                        v8ValueCall.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return v8Runtime.createV8ValueBoolean(true);
    }

    public static /* synthetic */ V8Value r(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8Value v8Value2;
        V8Value v8Value3;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8Value v8ValueAsV8Value = V8ValueUtils.asV8Value(v8ValueArr, 1);
            int length = Array.getLength(obj);
            if (v8ValueAsV8Value != null) {
                if (length == 0) {
                    return v8ValueAsV8Value;
                }
                V8Value clone = v8ValueAsV8Value.toClone();
                int i2 = 0;
                while (i2 < length) {
                    try {
                        v8Value3 = v8Runtime.toV8Value(Array.get(obj, i2));
                        try {
                            V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, v8Value2, v8Value3, v8Runtime.createV8ValueInteger(i2), v8Value);
                            if (v8Value3 != null) {
                                v8Value3.close();
                            }
                            JavetResourceUtils.safeClose(v8Value2);
                            i2++;
                            clone = v8ValueCall;
                        } finally {
                            if (v8Value3 != null) {
                                try {
                                    v8Value3.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return v8Value2;
            }
            if (length != 0) {
                if (length == 1) {
                    return v8Runtime.toV8Value(Array.get(obj, 0));
                }
                v8Value2 = v8Runtime.toV8Value(Array.get(obj, 0));
                int i3 = 1;
                while (i3 < length) {
                    try {
                        v8Value3 = v8Runtime.toV8Value(Array.get(obj, i3));
                        try {
                            V8Value v8ValueCall2 = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, v8Value2, v8Value3, v8Runtime.createV8ValueInteger(i3), v8Value);
                            if (v8Value3 != null) {
                                v8Value3.close();
                            }
                            JavetResourceUtils.safeClose(v8Value2);
                            i3++;
                            v8Value2 = v8ValueCall2;
                        } finally {
                        }
                    } finally {
                    }
                }
                return v8Value2;
            }
            v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorReduceOfEmptyArrayWithNoInitialValue());
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value te(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, i2), v8Runtime.createV8ValueInteger(i2), v8Value);
                if (v8ValueCall != null) {
                    v8ValueCall.close();
                }
            }
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value v(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8Value v8Value2;
        V8Value v8Value3;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8Value v8ValueAsV8Value = V8ValueUtils.asV8Value(v8ValueArr, 1);
            int length = Array.getLength(obj);
            if (v8ValueAsV8Value != null) {
                if (length == 0) {
                    return v8ValueAsV8Value;
                }
                V8Value clone = v8ValueAsV8Value.toClone();
                int i2 = length - 1;
                while (i2 >= 0) {
                    try {
                        v8Value3 = v8Runtime.toV8Value(Array.get(obj, i2));
                        try {
                            V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, v8Value2, v8Value3, v8Runtime.createV8ValueInteger(i2), v8Value);
                            if (v8Value3 != null) {
                                v8Value3.close();
                            }
                            JavetResourceUtils.safeClose(v8Value2);
                            i2--;
                            clone = v8ValueCall;
                        } finally {
                            if (v8Value3 != null) {
                                try {
                                    v8Value3.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return v8Value2;
            }
            if (length != 0) {
                if (length == 1) {
                    return v8Runtime.toV8Value(Array.get(obj, 0));
                }
                v8Value2 = v8Runtime.toV8Value(Array.get(obj, length - 1));
                int i3 = length - 2;
                while (i3 >= 0) {
                    try {
                        v8Value3 = v8Runtime.toV8Value(Array.get(obj, i3));
                        try {
                            V8Value v8ValueCall2 = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, v8Value2, v8Value3, v8Runtime.createV8ValueInteger(i3), v8Value);
                            if (v8Value3 != null) {
                                v8Value3.close();
                            }
                            JavetResourceUtils.safeClose(v8Value2);
                            i3--;
                            v8Value2 = v8ValueCall2;
                        } finally {
                        }
                    } finally {
                    }
                }
                return v8Value2;
            }
            v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorReduceOfEmptyArrayWithNoInitialValue());
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value wTp(V8Runtime v8Runtime, Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, obj2, v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8Value v8Value2 = v8Runtime.toV8Value(obj2);
                        v8ValueCall.close();
                        return v8Value2;
                    }
                    v8ValueCall.close();
                } catch (Throwable th) {
                    if (v8ValueCall != null) {
                        try {
                            v8ValueCall.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        return v8Runtime.createV8ValueUndefined();
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isDeleteSupported(Class<?> cls) {
        return true;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isHasSupported(Class<?> cls) {
        return true;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isIndexSupported(Class<?> cls) {
        return true;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isOwnKeysSupported(Class<?> cls) {
        return true;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    protected Object validateTargetObject(Object obj) {
        return obj;
    }

    public static /* synthetic */ V8Value HI(V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorFunctionIsNotSupported("unshift"));
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value J2(V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorFunctionIsNotSupported("push"));
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value X(V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorFunctionIsNotSupported(SPLICE));
        return v8Runtime.createV8ValueUndefined();
    }

    public static JavetProxyPluginArray getInstance() {
        return instance;
    }

    public static /* synthetic */ V8Value o(V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorFunctionIsNotSupported("shift"));
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value rV9(V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorFunctionIsNotSupported("pop"));
        return v8Runtime.createV8ValueUndefined();
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public String getName() {
        return NAME;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <T> IJavetEntityPropertyDescriptor<T> getProxyOwnPropertyDescriptor(Object obj, Object obj2) {
        return obj2 instanceof String ? LENGTH.equals(obj2) ? new JavetEntityPropertyDescriptor(false, false, true) : new JavetEntityPropertyDescriptor(true, true, true) : new JavetEntityPropertyDescriptor(false, false, false);
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isMethodProxyable(String str, Class<?> cls) {
        return this.proxyableMethods.contains(str);
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isProxyable(Class<?> cls) {
        return cls != null && cls.isArray();
    }

    public JavetProxyPluginArray() {
        this.proxyGetByStringMap.put(AT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.qz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51979n.at(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(CONCAT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.SPz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51804n.concat(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(COPY_WITHIN, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.iwV
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51918n.copyWithin(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("entries", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.iF
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51916n.entries(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(EVERY, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.yg
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52039n.every(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FILL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.pO
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51965n.fill(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FILTER, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Sis
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51806n.filter(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.mz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51942n.find(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND_INDEX, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.OU
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51766n.findIndex(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND_LAST, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.p
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51963n.findLast(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND_LAST_INDEX, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pl
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51775n.findLastIndex(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("flat", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Xo
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51827n.flat(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FLAT_MAP, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.eO
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51885n.flatMap(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FOR_EACH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.z
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52044n.forEach(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(INCLUDES, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.QJ
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51783n.includes(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(INDEX_OF, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.l3D
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51931n.indexOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(JOIN, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.s4
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51991n.join(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("keys", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.UGc
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51813n.keys(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(LAST_INDEX_OF, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Q
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51779n.lastIndexOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(LENGTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.r
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51980n.length(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(MAP, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ci
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51866n.map(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("pop", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.g9s
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51900n.pop(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("push", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.afx
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51853n.push(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(REDUCE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Z
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51838n.reduce(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(REDUCE_RIGHT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Ew
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51698n.reduceRight(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(REVERSE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.DAz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51684n.reverse(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("shift", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.u
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52008n.shift(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SLICE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.qf
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51975n.slice(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SOME, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Ln
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51749n.some(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SORT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.lej
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51938n.sort(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SPLICE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.M
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51751n.splice(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.rv6
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51990n.toJSON(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(TO_REVERSED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.vd
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52012n.toReversed(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(TO_SORTED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Lu
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51750n.toSorted(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(TO_SPLICED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.K
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51736n.toSpliced(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("toString", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.psW
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51969n.toString(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("unshift", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Md
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51754n.unshift(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Zs
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51846n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("values", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.P
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51771n.values(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(WITH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.m
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51939n.with(v8Runtime, obj);
            }
        });
        this.proxyGetBySymbolMap.put(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.P
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51771n.values(v8Runtime, obj);
            }
        });
    }

    public static /* synthetic */ V8Value E2(Object obj, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        ArrayList arrayList = new ArrayList(Array.getLength(obj));
        ListUtils.addAll(arrayList, obj);
        Collections.reverse(arrayList);
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value N(Object obj, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, obj2, v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        arrayList.add(obj2);
                    }
                    v8ValueCall.close();
                } catch (Throwable th) {
                    if (v8ValueCall != null) {
                        try {
                            v8ValueCall.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value O(Object obj, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        int length = Array.getLength(obj);
        if (length > 1) {
            int i2 = 0;
            final V8ValueFunction v8ValueFunctionAsV8ValueFunction = V8ValueUtils.asV8ValueFunction(v8ValueArr, 0);
            ArrayList arrayList = new ArrayList(length);
            ListUtils.addAll(arrayList, obj);
            if (v8ValueFunctionAsV8ValueFunction == null) {
                arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.B
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return Comparator.naturalOrder().compare(String.valueOf(obj2), String.valueOf(obj3));
                    }
                });
            } else {
                try {
                    arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.xuv
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return JavetProxyPluginArray.nr(v8ValueFunctionAsV8ValueFunction, obj2, obj3);
                        }
                    });
                } catch (Throwable th) {
                    v8Runtime.throwError(V8ValueErrorType.Error, th.getMessage());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Array.set(obj, i2, it.next());
                i2++;
            }
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value U(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        int length = Array.getLength(obj);
        int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
        if (iAsInt < 0) {
            iAsInt += length;
        }
        if (iAsInt >= 0 && iAsInt < length) {
            return v8Runtime.toV8Value(Array.get(obj, iAsInt));
        }
        return v8Runtime.createV8ValueUndefined();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ V8Value WPU(V8Runtime v8Runtime, Object obj, V8Value[] v8ValueArr) throws JavetException {
        int iIndexOf;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            int i2 = 0;
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1);
            int length = Array.getLength(obj);
            if (iAsInt < 0) {
                iAsInt += length;
            }
            if (iAsInt >= 0) {
                i2 = iAsInt;
            }
            if (i2 < length) {
                iIndexOf = ArrayUtils.indexOf(obj, object, i2);
            } else {
                iIndexOf = -1;
            }
        }
        return v8Runtime.createV8ValueInteger(iIndexOf);
    }

    public static /* synthetic */ V8Value Xw(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        ListUtils.addAll(arrayList, obj);
        if (length > 1) {
            final V8ValueFunction v8ValueFunctionAsV8ValueFunction = V8ValueUtils.asV8ValueFunction(v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunction == null) {
                arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.c
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return Comparator.naturalOrder().compare(String.valueOf(obj2), String.valueOf(obj3));
                    }
                });
            } else {
                try {
                    arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.nKK
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return JavetProxyPluginArray.ck(v8ValueFunctionAsV8ValueFunction, obj2, obj3);
                        }
                    });
                } catch (Throwable th) {
                    v8Runtime.throwError(V8ValueErrorType.Error, th.getMessage());
                }
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value Z(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        int length = Array.getLength(obj);
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            objArr[i2] = v8Runtime.createV8ValueInteger(i2);
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, objArr);
    }

    public static /* synthetic */ V8Value az(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        V8Value v8ValueCreateV8ValueUndefined;
        Object[] objArrCopyOf = ArrayUtils.copyOf(obj);
        int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
        if (iAsInt >= 0 && iAsInt < objArrCopyOf.length) {
            if (v8ValueArr.length > 1) {
                v8ValueCreateV8ValueUndefined = v8ValueArr[1];
            } else {
                v8ValueCreateV8ValueUndefined = v8Runtime.createV8ValueUndefined();
            }
            objArrCopyOf[iAsInt] = v8ValueCreateV8ValueUndefined;
        } else {
            v8Runtime.throwError(V8ValueErrorType.RangeError, V8ErrorTemplate.rangeErrorInvalidIndex(iAsInt));
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, objArrCopyOf);
    }

    public static /* synthetic */ V8Value bzg(Object obj, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        try {
            V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
                V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, i2), v8Runtime.createV8ValueInteger(i2), v8Value));
                }
            }
            V8ValueArray v8ValueArrayCreateV8ValueArray = V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
            JavetResourceUtils.safeClose(arrayList);
            return v8ValueArrayCreateV8ValueArray;
        } catch (Throwable th) {
            JavetResourceUtils.safeClose(arrayList);
            throw th;
        }
    }

    public static /* synthetic */ int ck(V8ValueFunction v8ValueFunction, Object obj, Object obj2) {
        try {
            V8Value v8ValueCall = v8ValueFunction.call((V8Value) null, obj, obj2);
            try {
                int iAsInt = v8ValueCall.asInt();
                v8ValueCall.close();
                return iAsInt;
            } finally {
            }
        } catch (JavetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ V8Value e(Object obj, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        try {
            V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
                V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, Array.get(obj, i2), v8Runtime.createV8ValueInteger(i2), v8Value));
                }
            }
            V8ValueArray v8ValueArrayCreateV8ValueArray = V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
            try {
                V8ValueArray v8ValueArray = (V8ValueArray) v8ValueArrayCreateV8ValueArray.flat();
                v8ValueArrayCreateV8ValueArray.close();
                JavetResourceUtils.safeClose(arrayList);
                return v8ValueArray;
            } finally {
            }
        } catch (Throwable th) {
            JavetResourceUtils.safeClose(arrayList);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ V8Value gh(V8Runtime v8Runtime, Object obj, V8Value[] v8ValueArr) throws JavetException {
        int iLastIndexOf;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            int length = Array.getLength(obj);
            int i2 = length - 1;
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1, i2);
            if (iAsInt < 0) {
                iAsInt += length;
            }
            if (iAsInt >= 0) {
                i2 = iAsInt;
            }
            if (i2 <= length) {
                iLastIndexOf = ArrayUtils.lastIndexOf(obj, object, i2);
            } else {
                iLastIndexOf = -1;
            }
        }
        return v8Runtime.createV8ValueInteger(iLastIndexOf);
    }

    public static /* synthetic */ V8Value jB(V8Runtime v8Runtime, Object obj, V8Value[] v8ValueArr) throws JavetException {
        boolean zIncludes = false;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1);
            int length = Array.getLength(obj);
            if (iAsInt < 0) {
                iAsInt += length;
            }
            if (iAsInt < 0) {
                iAsInt = 0;
            }
            if (iAsInt < length) {
                zIncludes = ArrayUtils.includes(obj, object, iAsInt);
            }
        }
        return v8Runtime.createV8ValueBoolean(zIncludes);
    }

    public static /* synthetic */ V8Value mUb(Object obj, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        int length = Array.getLength(obj);
        if (length > 0 && ArrayUtils.isNotEmpty(v8ValueArr)) {
            int i2 = 0;
            V8Value v8Value2 = v8ValueArr[0];
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1);
            if (iAsInt < 0 && (iAsInt = iAsInt + length) < 0) {
                iAsInt = 0;
            }
            int iAsInt2 = V8ValueUtils.asInt(v8ValueArr, 2);
            if (iAsInt2 >= 0 || (iAsInt2 = iAsInt2 + length) >= 0) {
                i2 = iAsInt2;
            }
            if (i2 == 0) {
                i2 = length;
            }
            if (iAsInt < length && i2 > iAsInt) {
                while (iAsInt < i2) {
                    Array.set(obj, iAsInt, v8Runtime.toObject(v8Value2));
                    iAsInt++;
                }
            }
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value nHg(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList();
        if (length > 0) {
            int i2 = 0;
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0) {
                iAsInt += length;
            }
            if (iAsInt < 0) {
                iAsInt = 0;
            }
            int iAsInt2 = V8ValueUtils.asInt(v8ValueArr, 1, length);
            if (iAsInt2 < 0) {
                iAsInt2 += length;
            }
            if (iAsInt2 >= 0) {
                i2 = iAsInt2;
            }
            if (i2 <= length) {
                length = i2;
            }
            while (iAsInt < length) {
                arrayList.add(Array.get(obj, iAsInt));
                iAsInt++;
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value nY(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        ArrayList arrayList = new ArrayList(Array.getLength(obj));
        ListUtils.addAll(arrayList, obj);
        return BaseJavetProxyPlugin.PROXY_CONVERTER.toV8Value(v8Runtime, new V8VirtualIterator(arrayList.iterator()));
    }

    public static /* synthetic */ int nr(V8ValueFunction v8ValueFunction, Object obj, Object obj2) {
        try {
            V8Value v8ValueCall = v8ValueFunction.call((V8Value) null, obj, obj2);
            try {
                int iAsInt = v8ValueCall.asInt();
                v8ValueCall.close();
                return iAsInt;
            } finally {
            }
        } catch (JavetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static /* synthetic */ V8Value p5(Object obj, V8Value v8Value, V8Value[] v8ValueArr) {
        ArrayUtils.reverse(obj);
        return v8Value;
    }

    public static /* synthetic */ V8Value s7N(Object obj, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        Object[] objArrCopyOf = ArrayUtils.copyOf(obj);
        int length = Array.getLength(obj);
        if (length > 0 && ArrayUtils.isNotEmpty(v8ValueArr)) {
            int i2 = 0;
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0 && (iAsInt = iAsInt + length) < 0) {
                iAsInt = 0;
            }
            int iAsInt2 = V8ValueUtils.asInt(v8ValueArr, 1);
            if (iAsInt2 < 0 && (iAsInt2 = iAsInt2 + length) < 0) {
                iAsInt2 = 0;
            }
            int iAsInt3 = V8ValueUtils.asInt(v8ValueArr, 2);
            if (iAsInt3 >= 0 || (iAsInt3 = iAsInt3 + length) >= 0) {
                i2 = iAsInt3;
            }
            if (i2 > length) {
                i2 = length;
            }
            if (i2 == 0) {
                i2 = length;
            }
            if (iAsInt < length && iAsInt2 < length && i2 > iAsInt2) {
                if ((iAsInt + i2) - iAsInt2 > length) {
                    i2 = (length + iAsInt2) - iAsInt;
                }
                for (int i3 = iAsInt2; i3 < i2; i3++) {
                    Array.set(obj, (iAsInt + i3) - iAsInt2, objArrCopyOf[i3]);
                }
            }
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value ty(V8Runtime v8Runtime, Object obj, V8Value[] v8ValueArr) throws JavetException {
        V8ValueArray v8ValueArrayCreateV8ValueArray = V8ValueUtils.createV8ValueArray(v8Runtime, ArrayUtils.copyOf(obj));
        try {
            V8ValueString v8ValueStringCreateV8ValueString = v8Runtime.createV8ValueString(v8ValueArrayCreateV8ValueArray.toString());
            v8ValueArrayCreateV8ValueArray.close();
            return v8ValueStringCreateV8ValueString;
        } catch (Throwable th) {
            if (v8ValueArrayCreateV8ValueArray != null) {
                try {
                    v8ValueArrayCreateV8ValueArray.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ V8Value xMQ(Object obj, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        ListUtils.addAll(arrayList, obj);
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            int i2 = 0;
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0) {
                iAsInt += length;
            }
            if (iAsInt >= 0) {
                i2 = iAsInt;
            }
            if (i2 >= length) {
                v8Runtime.throwError(V8ValueErrorType.RangeError, V8ErrorTemplate.rangeErrorStartIsOutOfRange(i2));
            } else {
                int iMin = Math.min(V8ValueUtils.asInt(v8ValueArr, 1), length - i2);
                if (iMin > 0) {
                    arrayList.subList(i2, iMin + i2).clear();
                }
                if (v8ValueArr.length > 2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 2; i3 < v8ValueArr.length; i3++) {
                        arrayList2.add(v8Runtime.toObject(v8ValueArr[i3]));
                    }
                    arrayList.addAll(i2, arrayList2);
                }
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public V8Value at(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(AT, obj, JavetCallbackType.DirectCallNoThisAndResult, new Mf(obj, v8Runtime)));
    }

    public V8Value concat(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(CONCAT, obj, JavetCallbackType.DirectCallNoThisAndResult, new h6y(obj, v8Runtime)));
    }

    public V8Value copyWithin(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(COPY_WITHIN, obj, JavetCallbackType.DirectCallThisAndResult, new Dsr(obj)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    protected V8Value createTargetObject(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        return v8Runtime.createV8ValueArray();
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean deleteByObject(Object obj, Object obj2) {
        int i2;
        validateTargetObject(obj);
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (StringUtils.isDigital(str) && (i2 = Integer.parseInt(str)) >= 0 && i2 < Array.getLength(obj) && !obj.getClass().getComponentType().isPrimitive()) {
                Array.set(obj, i2, null);
                return true;
            }
            return false;
        }
        return false;
    }

    public V8Value entries(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("entries", obj, JavetCallbackType.DirectCallNoThisAndResult, new Fl(obj, v8Runtime)));
    }

    public V8Value every(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(EVERY, obj, JavetCallbackType.DirectCallThisAndResult, new qYU(v8Runtime, obj)));
    }

    public V8Value fill(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FILL, obj, JavetCallbackType.DirectCallThisAndResult, new RGN(obj, v8Runtime)));
    }

    public V8Value filter(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FILTER, obj, JavetCallbackType.DirectCallThisAndResult, new CM(obj, v8Runtime)));
    }

    public V8Value find(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND, obj, JavetCallbackType.DirectCallThisAndResult, new l4Z(v8Runtime, obj)));
    }

    public V8Value findIndex(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND_INDEX, obj, JavetCallbackType.DirectCallThisAndResult, new KH(v8Runtime, obj)));
    }

    public V8Value findLast(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND_LAST, obj, JavetCallbackType.DirectCallThisAndResult, new C1852t(v8Runtime, obj)));
    }

    public V8Value findLastIndex(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND_LAST_INDEX, obj, JavetCallbackType.DirectCallThisAndResult, new QaP(v8Runtime, obj)));
    }

    public V8Value flat(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("flat", obj, JavetCallbackType.DirectCallNoThisAndResult, new Ogx(obj, v8Runtime)));
    }

    public V8Value flatMap(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FLAT_MAP, obj, JavetCallbackType.DirectCallThisAndResult, new FKk(obj, v8Runtime)));
    }

    public V8Value forEach(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FOR_EACH, obj, JavetCallbackType.DirectCallThisAndResult, new V1(v8Runtime, obj)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object getByIndex(Object obj, int i2) {
        validateTargetObject(obj);
        if (i2 >= 0 && i2 < Array.getLength(obj)) {
            return Array.get(obj, i2);
        }
        return null;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object[] getProxyOwnKeys(Object obj) {
        validateTargetObject(obj);
        ArrayList arrayList = new ArrayList();
        IntStream.range(0, Array.getLength(obj)).boxed().forEach(new M5(arrayList));
        arrayList.add(LENGTH);
        return arrayList.toArray();
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean hasByObject(Object obj, Object obj2) {
        int i2;
        validateTargetObject(obj);
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (StringUtils.isDigital(str) && (i2 = Integer.parseInt(str)) >= 0 && i2 < Array.getLength(obj)) {
                return true;
            }
        }
        return false;
    }

    public V8Value includes(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(INCLUDES, obj, JavetCallbackType.DirectCallNoThisAndResult, new kO4(v8Runtime, obj)));
    }

    public V8Value indexOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(INDEX_OF, obj, JavetCallbackType.DirectCallNoThisAndResult, new DC(v8Runtime, obj)));
    }

    public V8Value join(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(JOIN, obj, JavetCallbackType.DirectCallNoThisAndResult, new T(obj, v8Runtime)));
    }

    public V8Value keys(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("keys", obj, JavetCallbackType.DirectCallNoThisAndResult, new crp(obj, v8Runtime)));
    }

    public V8Value lastIndexOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(LAST_INDEX_OF, obj, JavetCallbackType.DirectCallNoThisAndResult, new tI(v8Runtime, obj)));
    }

    public V8Value length(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueInteger(Array.getLength(obj));
    }

    public V8Value map(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(MAP, obj, JavetCallbackType.DirectCallThisAndResult, new O(obj, v8Runtime)));
    }

    public V8Value pop(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("pop", obj, JavetCallbackType.DirectCallNoThisAndResult, new R6(v8Runtime)));
    }

    public V8Value push(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("push", obj, JavetCallbackType.DirectCallNoThisAndResult, new LEl(v8Runtime)));
    }

    public V8Value reduce(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(REDUCE, obj, JavetCallbackType.DirectCallThisAndResult, new hQ(v8Runtime, obj)));
    }

    public V8Value reduceRight(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(REDUCE, obj, JavetCallbackType.DirectCallThisAndResult, new RzR(v8Runtime, obj)));
    }

    public V8Value reverse(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(REVERSE, obj, JavetCallbackType.DirectCallThisAndResult, new gnv(obj)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean setByIndex(Object obj, int i2, Object obj2) {
        validateTargetObject(obj);
        if (i2 >= 0 && i2 < Array.getLength(obj)) {
            Array.set(obj, i2, obj2);
            return true;
        }
        return false;
    }

    public V8Value shift(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("shift", obj, JavetCallbackType.DirectCallNoThisAndResult, new YzO(v8Runtime)));
    }

    public V8Value slice(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SLICE, obj, JavetCallbackType.DirectCallNoThisAndResult, new fg(obj, v8Runtime)));
    }

    public V8Value some(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SOME, obj, JavetCallbackType.DirectCallThisAndResult, new C(v8Runtime, obj)));
    }

    public V8Value sort(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SORT, obj, JavetCallbackType.DirectCallThisAndResult, new lS(obj, v8Runtime)));
    }

    public V8Value splice(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SPLICE, obj, JavetCallbackType.DirectCallNoThisAndResult, new U4(v8Runtime)));
    }

    public V8Value toJSON(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, obj, JavetCallbackType.DirectCallNoThisAndResult, new c7r(v8Runtime, obj)));
    }

    public V8Value toReversed(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(TO_REVERSED, obj, JavetCallbackType.DirectCallThisAndResult, new C1848o(obj, v8Runtime)));
    }

    public V8Value toSorted(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(TO_SORTED, obj, JavetCallbackType.DirectCallNoThisAndResult, new oXP(obj, v8Runtime)));
    }

    public V8Value toSpliced(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(TO_SPLICED, obj, JavetCallbackType.DirectCallNoThisAndResult, new xZD(obj, v8Runtime)));
    }

    public V8Value toString(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("toString", obj, JavetCallbackType.DirectCallNoThisAndResult, new o7q(v8Runtime, obj)));
    }

    public V8Value unshift(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("unshift", obj, JavetCallbackType.DirectCallNoThisAndResult, new C1842h(v8Runtime)));
    }

    public V8Value valueOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("valueOf", obj, JavetCallbackType.DirectCallNoThisAndResult, new g9(v8Runtime, obj)));
    }

    public V8Value values(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("values", obj, JavetCallbackType.DirectCallNoThisAndResult, new L0y(obj, v8Runtime)));
    }

    public V8Value with(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(WITH, obj, JavetCallbackType.DirectCallNoThisAndResult, new aC(obj, v8Runtime)));
    }
}
