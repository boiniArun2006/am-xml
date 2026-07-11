package com.caoccao.javet.interop.proxy.plugins;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class JavetProxyPluginList extends BaseJavetProxyPluginSingle<List<Object>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String AT = "at";
    protected static final String CONCAT = "concat";
    protected static final String COPY_WITHIN = "copyWithin";
    protected static final String ENTRIES = "entries";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_LIST = "Target object must be an instance of List.";
    protected static final String EVERY = "every";
    protected static final String FILL = "fill";
    protected static final String FILTER = "filter";
    protected static final String FIND = "find";
    protected static final String FIND_INDEX = "findIndex";
    protected static final String FIND_LAST = "findLast";
    protected static final String FIND_LAST_INDEX = "findLastIndex";
    protected static final String FLAT = "flat";
    protected static final String FLAT_MAP = "flatMap";
    protected static final String INCLUDES = "includes";
    protected static final String JOIN = "join";
    protected static final String KEYS = "keys";
    protected static final String LENGTH = "length";
    protected static final String MAP = "map";
    protected static final String POP = "pop";
    protected static final String PUSH = "push";
    protected static final String REDUCE = "reduce";
    protected static final String REDUCE_RIGHT = "reduceRight";
    protected static final String REVERSE = "reverse";
    protected static final String SHIFT = "shift";
    protected static final String SLICE = "slice";
    protected static final String SOME = "some";
    protected static final String SPLICE = "splice";
    protected static final String TO_REVERSED = "toReversed";
    protected static final String TO_SORTED = "toSorted";
    protected static final String TO_SPLICED = "toSpliced";
    protected static final String UNSHIFT = "unshift";
    protected static final String VALUES = "values";
    protected static final String WITH = "with";
    protected final Set<String> proxyableMethods = SimpleSet.of(DEFAULT_PROXYABLE_METHODS);
    public static final String NAME = List.class.getName();
    protected static final String FOR_EACH = "forEach";
    protected static final String INDEX_OF = "indexOf";
    protected static final String LAST_INDEX_OF = "lastIndexOf";
    protected static final String SORT = "sort";
    protected static final String[] DEFAULT_PROXYABLE_METHODS = {FOR_EACH, INDEX_OF, LAST_INDEX_OF, SORT, "toString"};
    private static final JavetProxyPluginList instance = new JavetProxyPluginList();

    public static /* synthetic */ V8Value HI(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        int i2 = 0;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (Object obj : list) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, obj, v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8Value v8Value2 = v8Runtime.toV8Value(obj);
                        v8ValueCall.close();
                        return v8Value2;
                    }
                    v8ValueCall.close();
                    i2++;
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

    public static /* synthetic */ V8Value J2(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, it.next(), v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8ValueBoolean v8ValueBooleanCreateV8ValueBoolean = v8Runtime.createV8ValueBoolean(true);
                        v8ValueCall.close();
                        return v8ValueBooleanCreateV8ValueBoolean;
                    }
                    v8ValueCall.close();
                    i2++;
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
    public static /* synthetic */ V8Value O(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        ArrayList arrayList = new ArrayList(list.size());
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
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

    public static /* synthetic */ V8Value P5(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        int i2 = 0;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, it.next(), v8Runtime.createV8ValueInteger(i2), v8Value);
                if (v8ValueCall != null) {
                    v8ValueCall.close();
                }
                i2++;
            }
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value U(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8Value clone;
        V8Value v8Value2;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8Value v8ValueAsV8Value = V8ValueUtils.asV8Value(v8ValueArr, 1);
            int size = list.size();
            if (v8ValueAsV8Value != null) {
                if (size == 0) {
                    return v8ValueAsV8Value;
                }
                clone = v8ValueAsV8Value.toClone();
                int i2 = size - 1;
                ListIterator listIterator = list.listIterator(size);
                while (listIterator.hasPrevious()) {
                    try {
                        v8Value2 = v8Runtime.toV8Value(listIterator.previous());
                        try {
                            V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, clone, v8Value2, v8Runtime.createV8ValueInteger(i2), v8Value);
                            if (v8Value2 != null) {
                                v8Value2.close();
                            }
                            JavetResourceUtils.safeClose(clone);
                            i2--;
                            clone = v8ValueCall;
                        } finally {
                            if (v8Value2 != null) {
                                try {
                                    v8Value2.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return clone;
            }
            if (size != 0) {
                if (size == 1) {
                    return v8Runtime.toV8Value(list.get(0));
                }
                int i3 = size - 1;
                V8Value v8Value3 = v8Runtime.toV8Value(list.get(i3));
                ListIterator listIterator2 = list.listIterator(size);
                int i5 = i3;
                while (listIterator2.hasPrevious()) {
                    if (i5 == i3) {
                        listIterator2.previous();
                        i5--;
                    } else {
                        try {
                            v8Value2 = v8Runtime.toV8Value(listIterator2.previous());
                            try {
                                V8Value v8ValueCall2 = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, clone, v8Value2, v8Runtime.createV8ValueInteger(i5), v8Value);
                                if (v8Value2 != null) {
                                    v8Value2.close();
                                }
                                JavetResourceUtils.safeClose(clone);
                                i5--;
                                v8Value3 = v8ValueCall2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
                return clone;
            }
            v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorReduceOfEmptyArrayWithNoInitialValue());
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value Xw(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            int size = list.size() - 1;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, objPrevious, v8Runtime.createV8ValueInteger(size), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8Value v8Value2 = v8Runtime.toV8Value(objPrevious);
                        v8ValueCall.close();
                        return v8Value2;
                    }
                    v8ValueCall.close();
                    size--;
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

    public static /* synthetic */ V8Value Z(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        int i2 = 0;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, it.next(), v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8ValueInteger v8ValueIntegerCreateV8ValueInteger = v8Runtime.createV8ValueInteger(i2);
                        v8ValueCall.close();
                        return v8ValueIntegerCreateV8ValueInteger;
                    }
                    v8ValueCall.close();
                    i2++;
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

    public static /* synthetic */ V8Value az(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8Value clone;
        V8Value v8Value2;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8Value v8ValueAsV8Value = V8ValueUtils.asV8Value(v8ValueArr, 1);
            int size = list.size();
            if (v8ValueAsV8Value != null) {
                if (size == 0) {
                    return v8ValueAsV8Value;
                }
                clone = v8ValueAsV8Value.toClone();
                Iterator it = list.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    try {
                        v8Value2 = v8Runtime.toV8Value(it.next());
                        try {
                            V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, clone, v8Value2, v8Runtime.createV8ValueInteger(i2), v8Value);
                            if (v8Value2 != null) {
                                v8Value2.close();
                            }
                            JavetResourceUtils.safeClose(clone);
                            i2++;
                            clone = v8ValueCall;
                        } finally {
                            if (v8Value2 != null) {
                                try {
                                    v8Value2.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return clone;
            }
            if (size != 0) {
                if (size == 1) {
                    return v8Runtime.toV8Value(list.get(0));
                }
                V8Value v8Value3 = v8Runtime.toV8Value(list.get(0));
                int i3 = 0;
                for (Object obj : list) {
                    if (i3 == 0) {
                        i3++;
                    } else {
                        try {
                            v8Value2 = v8Runtime.toV8Value(obj);
                            try {
                                V8Value v8ValueCall2 = v8ValueFunctionAsV8ValueFunctionWithError.call((V8Value) null, clone, v8Value2, v8Runtime.createV8ValueInteger(i3), v8Value);
                                if (v8Value2 != null) {
                                    v8Value2.close();
                                }
                                JavetResourceUtils.safeClose(clone);
                                i3++;
                                v8Value3 = v8ValueCall2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
                return clone;
            }
            v8Runtime.throwError(V8ValueErrorType.TypeError, V8ErrorTemplate.typeErrorReduceOfEmptyArrayWithNoInitialValue());
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value bzg(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            int size = list.size() - 1;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, listIterator.previous(), v8Runtime.createV8ValueInteger(size), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        V8ValueInteger v8ValueIntegerCreateV8ValueInteger = v8Runtime.createV8ValueInteger(size);
                        v8ValueCall.close();
                        return v8ValueIntegerCreateV8ValueInteger;
                    }
                    v8ValueCall.close();
                    size--;
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

    public static /* synthetic */ V8Value iF(V8Runtime v8Runtime, List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError == null) {
            return v8Runtime.createV8ValueBoolean(false);
        }
        V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, it.next(), v8Runtime.createV8ValueInteger(i2), v8Value);
            try {
                if (!v8ValueCall.asBoolean()) {
                    V8ValueBoolean v8ValueBooleanCreateV8ValueBoolean = v8Runtime.createV8ValueBoolean(false);
                    v8ValueCall.close();
                    return v8ValueBooleanCreateV8ValueBoolean;
                }
                v8ValueCall.close();
                i2++;
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

    public static /* synthetic */ V8Value s7N(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0, 1);
        ArrayList arrayList = new ArrayList(list.size());
        ListUtils.flat(arrayList, list, iAsInt);
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
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

    public static /* synthetic */ V8Value X(List list, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        try {
            V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
                V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, it.next(), v8Runtime.createV8ValueInteger(i2), v8Value));
                    i2++;
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

    public static /* synthetic */ V8Value ck(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            int size = list.size();
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0) {
                iAsInt += size;
            }
            if (iAsInt < 0) {
                iAsInt = 0;
            }
            int iAsInt2 = V8ValueUtils.asInt(v8ValueArr, 1, size);
            if (iAsInt2 < 0) {
                iAsInt2 += size;
            }
            int i2 = iAsInt2 >= 0 ? iAsInt2 : 0;
            if (i2 <= size) {
                size = i2;
            }
            if (iAsInt < size) {
                arrayList.addAll(list.subList(iAsInt, size));
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value fD(List list, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static JavetProxyPluginList getInstance() {
        return instance;
    }

    public static /* synthetic */ V8Value jB(List list, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (Object obj : list) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, obj, v8Runtime.createV8ValueInteger(i2), v8Value);
                try {
                    if (v8ValueCall.asBoolean()) {
                        arrayList.add(obj);
                    }
                    v8ValueCall.close();
                    i2++;
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

    public static /* synthetic */ V8Value nY(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        ArrayList arrayList = new ArrayList(list);
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            int size = list.size();
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0) {
                iAsInt += size;
            }
            int i2 = iAsInt >= 0 ? iAsInt : 0;
            if (i2 >= size) {
                v8Runtime.throwError(V8ValueErrorType.RangeError, V8ErrorTemplate.rangeErrorStartIsOutOfRange(i2));
            } else {
                int iMin = Math.min(V8ValueUtils.asInt(v8ValueArr, 1), size - i2);
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

    public static /* synthetic */ V8Value p5(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        ArrayList arrayList = new ArrayList();
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            int size = list.size();
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0) {
                iAsInt += size;
            }
            int i2 = iAsInt >= 0 ? iAsInt : 0;
            if (i2 >= size) {
                v8Runtime.throwError(V8ValueErrorType.RangeError, V8ErrorTemplate.rangeErrorStartIsOutOfRange(i2));
            } else {
                int iMin = Math.min(V8ValueUtils.asInt(v8ValueArr, 1), size - i2);
                if (iMin > 0) {
                    List listSubList = list.subList(i2, iMin + i2);
                    arrayList.addAll(listSubList);
                    listSubList.clear();
                }
                if (v8ValueArr.length > 2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 2; i3 < v8ValueArr.length; i3++) {
                        arrayList2.add(v8Runtime.toObject(v8ValueArr[i3]));
                    }
                    list.addAll(i2, arrayList2);
                }
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
    }

    public static /* synthetic */ V8Value ty(List list, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        try {
            V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
                V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, it.next(), v8Runtime.createV8ValueInteger(i2), v8Value));
                    i2++;
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

    public static /* synthetic */ V8Value wTp(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        ArrayList arrayList = new ArrayList(list);
        if (list.size() > 1) {
            final V8ValueFunction v8ValueFunctionAsV8ValueFunction = V8ValueUtils.asV8ValueFunction(v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunction == null) {
                arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.uuz
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Comparator.naturalOrder().compare(String.valueOf(obj), String.valueOf(obj2));
                    }
                });
            } else {
                try {
                    arrayList.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.G8Q
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return JavetProxyPluginList.te(v8ValueFunctionAsV8ValueFunction, obj, obj2);
                        }
                    });
                } catch (Throwable th) {
                    v8Runtime.throwError(V8ValueErrorType.Error, th.getMessage());
                }
            }
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, arrayList.toArray());
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
        return cls != null && List.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    public List<Object> validateTargetObject(Object obj) {
        return (List) obj;
    }

    public JavetProxyPluginList() {
        this.proxyGetByStringMap.put(AT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.epX
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51888n.at(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(CONCAT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.qiB
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51978n.concat(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(COPY_WITHIN, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Q6T
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51780n.copyWithin(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("entries", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.nKE
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51948n.entries(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(EVERY, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.RP
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51792n.every(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FILL, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Pta
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51778n.fill(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FILTER, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.hg
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51912n.filter(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.KA
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51737n.find(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND_INDEX, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.jjk
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51923n.findIndex(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND_LAST, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.hl
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51913n.findLast(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FIND_LAST_INDEX, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.VY8
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51818n.findLastIndex(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("flat", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.tZ
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52002n.flat(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FLAT_MAP, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.pIF
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51964n.flatMap(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FOR_EACH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.qhS
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51977n.forEach(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(INCLUDES, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.H9
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51717n.includes(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(INDEX_OF, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.cF
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51863n.indexOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(JOIN, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.QUT
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51784n.join(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("keys", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.wb
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52021n.keys(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(LAST_INDEX_OF, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Iuj
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51728n.lastIndexOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(LENGTH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.zO
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52047n.length(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(MAP, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.J2L
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51730n.map(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("pop", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.tUY
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52001n.pop(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("push", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Jr
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51735n.push(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(REDUCE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.f
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51889n.reduce(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(REDUCE_RIGHT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Vgd
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51819n.reduceRight(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(REVERSE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.tce
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52003n.reverse(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("shift", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.xx
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52033n.shift(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SLICE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.fi
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51893n.slice(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SOME, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Y
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51834n.some(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SORT, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.fmn
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51894n.sort(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SPLICE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.z2
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52045n.splice(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.E
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51693n.toJSON(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(TO_REVERSED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.mf
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51940n.toReversed(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(TO_SORTED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.cv
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51869n.toSorted(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(TO_SPLICED, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.G
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51713n.toSpliced(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("toString", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.hzY
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51914n.toString(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("unshift", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.I5
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51723n.unshift(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.d
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51870n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("values", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.rCj
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51984n.values(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(WITH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.LIz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51746n.with(v8Runtime, obj);
            }
        });
        this.proxyGetBySymbolMap.put(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.rCj
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51984n.values(v8Runtime, obj);
            }
        });
    }

    public static /* synthetic */ V8Value E2(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = v8Runtime.createV8ValueInteger(i2);
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, objArr);
    }

    public static /* synthetic */ V8Value Ik(List list, V8Value v8Value, V8Value[] v8ValueArr) {
        if (!list.isEmpty()) {
            Collections.reverse(list);
        }
        return v8Value;
    }

    public static /* synthetic */ int KN(V8ValueFunction v8ValueFunction, Object obj, Object obj2) {
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

    public static /* synthetic */ V8Value M7(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        if (list.isEmpty()) {
            return v8Runtime.createV8ValueUndefined();
        }
        return v8Runtime.toV8Value(ListUtils.shift(list));
    }

    public static /* synthetic */ V8Value S(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        int size = list.size();
        int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
        if (iAsInt < 0) {
            iAsInt += size;
        }
        if (iAsInt >= 0 && iAsInt < size) {
            return v8Runtime.toV8Value(list.get(iAsInt));
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value T(V8Runtime v8Runtime, List list, V8Value[] v8ValueArr) throws JavetException {
        V8ValueArray v8ValueArrayCreateV8ValueArray = V8ValueUtils.createV8ValueArray(v8Runtime, list.toArray());
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ V8Value ViF(V8Runtime v8Runtime, List list, V8Value[] v8ValueArr) throws JavetException {
        int iLastIndexOf;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            int size = list.size();
            int i2 = size - 1;
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1, i2);
            if (iAsInt < 0) {
                iAsInt += size;
            }
            if (iAsInt >= 0) {
                i2 = iAsInt;
            }
            if (i2 < size) {
                iLastIndexOf = ListUtils.lastIndexOf(list, object, i2);
            } else {
                iLastIndexOf = -1;
            }
        }
        return v8Runtime.createV8ValueInteger(iLastIndexOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ V8Value WPU(V8Runtime v8Runtime, List list, V8Value[] v8ValueArr) throws JavetException {
        int iIndexOf;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            int i2 = 0;
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1);
            int size = list.size();
            if (iAsInt < 0) {
                iAsInt += size;
            }
            if (iAsInt >= 0) {
                i2 = iAsInt;
            }
            if (i2 < size) {
                iIndexOf = ListUtils.indexOf(list, object, i2);
            } else {
                iIndexOf = -1;
            }
        }
        return v8Runtime.createV8ValueInteger(iIndexOf);
    }

    public static /* synthetic */ V8Value XQ(List list, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        Object[] array = list.toArray();
        if (!list.isEmpty() && ArrayUtils.isNotEmpty(v8ValueArr)) {
            int size = list.size();
            int i2 = 0;
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
            if (iAsInt < 0 && (iAsInt = iAsInt + size) < 0) {
                iAsInt = 0;
            }
            int iAsInt2 = V8ValueUtils.asInt(v8ValueArr, 1);
            if (iAsInt2 < 0 && (iAsInt2 = iAsInt2 + size) < 0) {
                iAsInt2 = 0;
            }
            int iAsInt3 = V8ValueUtils.asInt(v8ValueArr, 2);
            if (iAsInt3 >= 0 || (iAsInt3 = iAsInt3 + size) >= 0) {
                i2 = iAsInt3;
            }
            if (i2 > size) {
                i2 = size;
            }
            if (i2 == 0) {
                i2 = size;
            }
            if (iAsInt < size && iAsInt2 < size && i2 > iAsInt2) {
                if ((iAsInt + i2) - iAsInt2 > size) {
                    i2 = (size + iAsInt2) - iAsInt;
                }
                for (int i3 = iAsInt2; i3 < i2; i3++) {
                    list.set((iAsInt + i3) - iAsInt2, array[i3]);
                }
            }
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value aYN(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        V8Value v8ValueCreateV8ValueUndefined;
        Object[] array = list.toArray();
        int iAsInt = V8ValueUtils.asInt(v8ValueArr, 0);
        if (iAsInt >= 0 && iAsInt < array.length) {
            if (v8ValueArr.length > 1) {
                v8ValueCreateV8ValueUndefined = v8ValueArr[1];
            } else {
                v8ValueCreateV8ValueUndefined = v8Runtime.createV8ValueUndefined();
            }
            array[iAsInt] = v8ValueCreateV8ValueUndefined;
        } else {
            v8Runtime.throwError(V8ValueErrorType.RangeError, V8ErrorTemplate.rangeErrorInvalidIndex(iAsInt));
        }
        return V8ValueUtils.createV8ValueArray(v8Runtime, array);
    }

    public static /* synthetic */ V8Value e(V8Runtime v8Runtime, List list, V8Value[] v8ValueArr) throws JavetException {
        boolean zIncludes = false;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1);
            int size = list.size();
            if (iAsInt < 0) {
                iAsInt += size;
            }
            if (iAsInt < 0) {
                iAsInt = 0;
            }
            if (iAsInt < size) {
                zIncludes = ListUtils.includes(list, object, iAsInt);
            }
        }
        return v8Runtime.createV8ValueBoolean(zIncludes);
    }

    public static /* synthetic */ V8Value g(List list, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        if (list.size() > 1) {
            final V8ValueFunction v8ValueFunctionAsV8ValueFunction = V8ValueUtils.asV8ValueFunction(v8ValueArr, 0);
            if (v8ValueFunctionAsV8ValueFunction == null) {
                list.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.Ch
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Comparator.naturalOrder().compare(String.valueOf(obj), String.valueOf(obj2));
                    }
                });
                return v8Value;
            }
            try {
                list.sort(new Comparator() { // from class: com.caoccao.javet.interop.proxy.plugins.tQj
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return JavetProxyPluginList.KN(v8ValueFunctionAsV8ValueFunction, obj, obj2);
                    }
                });
                return v8Value;
            } catch (Throwable th) {
                v8Runtime.throwError(V8ValueErrorType.Error, th.getMessage());
            }
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value gh(List list, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        if (!list.isEmpty() && ArrayUtils.isNotEmpty(v8ValueArr)) {
            int size = list.size();
            int i2 = 0;
            V8Value v8Value2 = v8ValueArr[0];
            int iAsInt = V8ValueUtils.asInt(v8ValueArr, 1);
            if (iAsInt < 0 && (iAsInt = iAsInt + size) < 0) {
                iAsInt = 0;
            }
            int iAsInt2 = V8ValueUtils.asInt(v8ValueArr, 2);
            if (iAsInt2 >= 0 || (iAsInt2 = iAsInt2 + size) >= 0) {
                i2 = iAsInt2;
            }
            if (i2 == 0) {
                i2 = size;
            }
            if (iAsInt < size && i2 > iAsInt) {
                while (iAsInt < i2) {
                    list.set(iAsInt, v8Runtime.toObject(v8Value2));
                    iAsInt++;
                }
            }
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value r(List list, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        if (list.isEmpty()) {
            return v8Runtime.createV8ValueUndefined();
        }
        return v8Runtime.toV8Value(ListUtils.pop(list));
    }

    public static /* synthetic */ int te(V8ValueFunction v8ValueFunction, Object obj, Object obj2) {
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

    public V8Value at(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(AT, obj, JavetCallbackType.DirectCallNoThisAndResult, new OB3(listValidateTargetObject, v8Runtime)));
    }

    public V8Value concat(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(CONCAT, obj, JavetCallbackType.DirectCallNoThisAndResult, new CnF(listValidateTargetObject, v8Runtime)));
    }

    public V8Value copyWithin(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(COPY_WITHIN, obj, JavetCallbackType.DirectCallThisAndResult, new GC(listValidateTargetObject)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    protected V8Value createTargetObject(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        return v8Runtime.createV8ValueArray();
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean deleteByObject(Object obj, Object obj2) {
        int i2;
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (StringUtils.isDigital(str) && (i2 = Integer.parseInt(str)) >= 0 && i2 < listValidateTargetObject.size()) {
                listValidateTargetObject.remove(i2);
                return true;
            }
            return false;
        }
        return false;
    }

    public V8Value entries(V8Runtime v8Runtime, Object obj) throws JavetException {
        final List<Object> listValidateTargetObject = validateTargetObject(obj);
        List list = (List) IntStream.range(0, listValidateTargetObject.size()).mapToObj(new IntFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.XK
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return SimpleList.of(Integer.valueOf(i2), listValidateTargetObject.get(i2));
            }
        }).collect(Collectors.toList());
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("entries", obj, JavetCallbackType.DirectCallNoThisAndResult, new Dhl(v8Runtime, list)));
    }

    public V8Value every(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(EVERY, obj, JavetCallbackType.DirectCallThisAndResult, new bj(v8Runtime, listValidateTargetObject)));
    }

    public V8Value fill(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FILL, obj, JavetCallbackType.DirectCallThisAndResult, new C1857y(listValidateTargetObject, v8Runtime)));
    }

    public V8Value filter(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FILTER, obj, JavetCallbackType.DirectCallThisAndResult, new PS(listValidateTargetObject, v8Runtime)));
    }

    public V8Value find(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND, obj, JavetCallbackType.DirectCallThisAndResult, new hWw(v8Runtime, listValidateTargetObject)));
    }

    public V8Value findIndex(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND_INDEX, obj, JavetCallbackType.DirectCallThisAndResult, new yLi(v8Runtime, listValidateTargetObject)));
    }

    public V8Value findLast(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND_LAST, obj, JavetCallbackType.DirectCallThisAndResult, new Al(v8Runtime, listValidateTargetObject)));
    }

    public V8Value findLastIndex(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FIND_LAST_INDEX, obj, JavetCallbackType.DirectCallThisAndResult, new jn(v8Runtime, listValidateTargetObject)));
    }

    public V8Value flat(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("flat", obj, JavetCallbackType.DirectCallNoThisAndResult, new HI(listValidateTargetObject, v8Runtime)));
    }

    public V8Value flatMap(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FLAT_MAP, obj, JavetCallbackType.DirectCallThisAndResult, new F2n(listValidateTargetObject, v8Runtime)));
    }

    public V8Value forEach(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FOR_EACH, obj, JavetCallbackType.DirectCallThisAndResult, new F(v8Runtime, listValidateTargetObject)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object getByIndex(Object obj, int i2) {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        if (i2 >= 0 && i2 < listValidateTargetObject.size()) {
            return listValidateTargetObject.get(i2);
        }
        return null;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object[] getProxyOwnKeys(Object obj) {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        ArrayList arrayList = new ArrayList();
        IntStream.range(0, listValidateTargetObject.size()).boxed().forEach(new M5(arrayList));
        arrayList.add(LENGTH);
        return arrayList.toArray();
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean hasByObject(Object obj, Object obj2) {
        int i2;
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (StringUtils.isDigital(str) && (i2 = Integer.parseInt(str)) >= 0 && i2 < listValidateTargetObject.size()) {
                return true;
            }
        }
        return false;
    }

    public V8Value includes(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(INCLUDES, obj, JavetCallbackType.DirectCallNoThisAndResult, new l3h(v8Runtime, listValidateTargetObject)));
    }

    public V8Value indexOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(INDEX_OF, obj, JavetCallbackType.DirectCallNoThisAndResult, new C1839e(v8Runtime, listValidateTargetObject)));
    }

    public V8Value join(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(JOIN, obj, JavetCallbackType.DirectCallNoThisAndResult, new A(listValidateTargetObject, v8Runtime)));
    }

    public V8Value keys(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("keys", obj, JavetCallbackType.DirectCallNoThisAndResult, new tl(listValidateTargetObject, v8Runtime)));
    }

    public V8Value lastIndexOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(LAST_INDEX_OF, obj, JavetCallbackType.DirectCallNoThisAndResult, new asi(v8Runtime, listValidateTargetObject)));
    }

    public V8Value length(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueInteger(listValidateTargetObject.size());
    }

    public V8Value map(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(MAP, obj, JavetCallbackType.DirectCallThisAndResult, new C1835ca(listValidateTargetObject, v8Runtime)));
    }

    public V8Value pop(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("pop", obj, JavetCallbackType.DirectCallNoThisAndResult, new QGL(listValidateTargetObject, v8Runtime)));
    }

    public V8Value push(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("push", obj, JavetCallbackType.DirectCallNoThisAndResult, new JT(v8Runtime, listValidateTargetObject)));
    }

    public V8Value reduce(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(REDUCE, obj, JavetCallbackType.DirectCallThisAndResult, new xMz(v8Runtime, listValidateTargetObject)));
    }

    public V8Value reduceRight(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(REDUCE, obj, JavetCallbackType.DirectCallThisAndResult, new C1854v(v8Runtime, listValidateTargetObject)));
    }

    public V8Value reverse(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(REVERSE, obj, JavetCallbackType.DirectCallThisAndResult, new kO(listValidateTargetObject)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean setByIndex(Object obj, int i2, Object obj2) {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        if (i2 >= 0 && i2 < listValidateTargetObject.size()) {
            listValidateTargetObject.set(i2, obj2);
            return true;
        }
        return false;
    }

    public V8Value shift(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("shift", obj, JavetCallbackType.DirectCallNoThisAndResult, new C1838dc(listValidateTargetObject, v8Runtime)));
    }

    public V8Value slice(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SLICE, obj, JavetCallbackType.DirectCallNoThisAndResult, new Y2e(listValidateTargetObject, v8Runtime)));
    }

    public V8Value some(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SOME, obj, JavetCallbackType.DirectCallThisAndResult, new C1855w(v8Runtime, listValidateTargetObject)));
    }

    public V8Value sort(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SORT, obj, JavetCallbackType.DirectCallThisAndResult, new E6O(listValidateTargetObject, v8Runtime)));
    }

    public V8Value splice(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(SPLICE, obj, JavetCallbackType.DirectCallNoThisAndResult, new FdJ(listValidateTargetObject, v8Runtime)));
    }

    public V8Value toJSON(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, obj, JavetCallbackType.DirectCallNoThisAndResult, new XpT(v8Runtime, listValidateTargetObject)));
    }

    public V8Value toReversed(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(Apsps.QbFgkervaW, obj, JavetCallbackType.DirectCallThisAndResult, new ZI(listValidateTargetObject, v8Runtime)));
    }

    public V8Value toSorted(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(TO_SORTED, obj, JavetCallbackType.DirectCallNoThisAndResult, new pi(listValidateTargetObject, v8Runtime)));
    }

    public V8Value toSpliced(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(TO_SPLICED, obj, JavetCallbackType.DirectCallNoThisAndResult, new EB1(listValidateTargetObject, v8Runtime)));
    }

    public V8Value toString(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("toString", obj, JavetCallbackType.DirectCallNoThisAndResult, new dip(v8Runtime, listValidateTargetObject)));
    }

    public V8Value unshift(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("unshift", obj, JavetCallbackType.DirectCallNoThisAndResult, new RQi(v8Runtime, listValidateTargetObject)));
    }

    public V8Value valueOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("valueOf", obj, JavetCallbackType.DirectCallNoThisAndResult, new KA5(v8Runtime, listValidateTargetObject)));
    }

    public V8Value values(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("values", obj, JavetCallbackType.DirectCallNoThisAndResult, new S0R(v8Runtime, listValidateTargetObject)));
    }

    public V8Value with(V8Runtime v8Runtime, Object obj) throws JavetException {
        List<Object> listValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(qfEYuUHwj.faIaLnOnxuERjn, obj, JavetCallbackType.DirectCallNoThisAndResult, new tB(listValidateTargetObject, v8Runtime)));
    }
}
