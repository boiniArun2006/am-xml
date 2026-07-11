package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.entities.JavetEntityPropertyDescriptor;
import com.caoccao.javet.enums.V8ValueSymbolType;
import com.caoccao.javet.interfaces.IJavetBiFunction;
import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import com.caoccao.javet.interfaces.IJavetEntitySymbol;
import com.caoccao.javet.interfaces.IJavetUniFunction;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPlugin;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.lang.Exception;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IJavetDirectProxyHandler<E extends Exception> {
    default IClassProxyPlugin getProxyPlugin() {
        return null;
    }

    V8Runtime getV8Runtime();

    default V8Value proxyApply(V8Value v8Value, V8Value v8Value2, V8ValueArray v8ValueArray) throws Exception {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[PHI: r0
      0x008f: PHI (r0v11 com.caoccao.javet.values.V8Value) = (r0v7 com.caoccao.javet.values.V8Value), (r0v17 com.caoccao.javet.values.V8Value) binds: [B:27:0x0087, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default V8Value proxyGetOwnPropertyDescriptor(V8Value v8Value, V8Value v8Value2) throws Exception {
        ?? r02;
        IJavetEntityPropertyDescriptor javetEntityPropertyDescriptor;
        V8Value v8Value3;
        ?? r52 = 0;
        try {
            r02 = v8Value2 instanceof V8ValueString;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (r02 != 0) {
                final String value = ((V8ValueString) v8Value2).getValue();
                Optional map = Optional.ofNullable(proxyGetStringGetterMap()).map(new Function() { // from class: com.caoccao.javet.interop.proxy.fuX
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return IJavetDirectProxyHandler.rl(value, (Map) obj);
                    }
                });
                v8Value3 = map.isPresent() ? (V8Value) ((IJavetUniFunction) map.get()).apply(value) : null;
                if (v8Value3 == null) {
                    IClassProxyPlugin proxyPlugin = getProxyPlugin();
                    if (proxyPlugin != null) {
                        javetEntityPropertyDescriptor = proxyPlugin.getProxyOwnPropertyDescriptor(this, value);
                        javetEntityPropertyDescriptor.setValue(getV8Runtime().createV8ValueUndefined());
                        r02 = v8Value3;
                    } else {
                        javetEntityPropertyDescriptor = null;
                        r02 = v8Value3;
                    }
                } else {
                    javetEntityPropertyDescriptor = new JavetEntityPropertyDescriptor(true, true, true, v8Value3);
                    r02 = v8Value3;
                }
            } else if (v8Value2 instanceof V8ValueSymbol) {
                V8ValueSymbol v8ValueSymbol = (V8ValueSymbol) v8Value2;
                final String description = v8ValueSymbol.getDescription();
                Optional map2 = Optional.ofNullable(proxyGetSymbolGetterMap()).map(new Function() { // from class: com.caoccao.javet.interop.proxy.aC
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return IJavetDirectProxyHandler.J2(description, (Map) obj);
                    }
                });
                v8Value3 = map2.isPresent() ? (V8Value) ((IJavetUniFunction) map2.get()).apply(v8ValueSymbol) : null;
                if (v8Value3 != null) {
                    javetEntityPropertyDescriptor = new JavetEntityPropertyDescriptor(true, true, true, v8Value3);
                    r02 = v8Value3;
                }
            } else {
                javetEntityPropertyDescriptor = null;
                r02 = 0;
            }
            if (javetEntityPropertyDescriptor == null) {
                JavetResourceUtils.safeClose((Object) r02);
                return null;
            }
            V8Value v8Value4 = getV8Runtime().toV8Value(javetEntityPropertyDescriptor);
            JavetResourceUtils.safeClose((Object) r02);
            return v8Value4;
        } catch (Throwable th2) {
            th = th2;
            r52 = r02;
            JavetResourceUtils.safeClose((Object) r52);
            throw th;
        }
    }

    default V8Value proxyGetPrototypeOf(V8Value v8Value) throws Exception {
        return null;
    }

    default Map<String, IJavetUniFunction<String, ? extends V8Value, E>> proxyGetStringGetterMap() {
        return null;
    }

    default Map<String, IJavetBiFunction<String, V8Value, Boolean, E>> proxyGetStringSetterMap() {
        return null;
    }

    default Map<String, IJavetUniFunction<V8ValueSymbol, ? extends V8Value, E>> proxyGetSymbolGetterMap() {
        return null;
    }

    default Map<String, IJavetBiFunction<V8ValueSymbol, V8Value, Boolean, E>> proxyGetSymbolSetterMap() {
        return null;
    }

    default V8ValueArray proxyOwnKeys(V8Value v8Value) throws Exception {
        Object[] proxyOwnKeys;
        Throwable th;
        try {
            Map<String, IJavetUniFunction<String, ? extends V8Value, E>> mapProxyGetStringGetterMap = proxyGetStringGetterMap();
            if (mapProxyGetStringGetterMap == null || mapProxyGetStringGetterMap.isEmpty()) {
                proxyOwnKeys = null;
            } else {
                proxyOwnKeys = new Object[mapProxyGetStringGetterMap.size()];
                try {
                    Iterator<String> it = mapProxyGetStringGetterMap.keySet().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        proxyOwnKeys[i2] = getV8Runtime().createV8ValueString(it.next());
                        i2++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    JavetResourceUtils.safeClose(proxyOwnKeys);
                    throw th;
                }
            }
            if (proxyOwnKeys == null) {
                IClassProxyPlugin proxyPlugin = getProxyPlugin();
                if (proxyPlugin.isOwnKeysSupported(getClass())) {
                    proxyOwnKeys = proxyPlugin.getProxyOwnKeys(this);
                    for (int i3 = 0; i3 < proxyOwnKeys.length; i3++) {
                        Object obj = proxyOwnKeys[i3];
                        if (obj instanceof String) {
                            proxyOwnKeys[i3] = getV8Runtime().createV8ValueString((String) obj);
                        } else if (obj instanceof IJavetEntitySymbol) {
                            proxyOwnKeys[i3] = getV8Runtime().createV8ValueSymbol(((IJavetEntitySymbol) obj).getDescription());
                        } else {
                            proxyOwnKeys[i3] = getV8Runtime().createV8ValueString(String.valueOf(obj));
                        }
                    }
                }
            }
            if (proxyOwnKeys == null) {
                JavetResourceUtils.safeClose(proxyOwnKeys);
                return null;
            }
            V8ValueArray v8ValueArrayCreateV8ValueArray = V8ValueUtils.createV8ValueArray(getV8Runtime(), proxyOwnKeys);
            JavetResourceUtils.safeClose(proxyOwnKeys);
            return v8ValueArrayCreateV8ValueArray;
        } catch (Throwable th3) {
            proxyOwnKeys = null;
            th = th3;
        }
    }

    default void setV8Runtime(V8Runtime v8Runtime) {
    }

    static /* synthetic */ IJavetUniFunction J2(String str, Map map) {
        return (IJavetUniFunction) map.get(str);
    }

    static /* synthetic */ V8Value n(IJavetDirectProxyHandler iJavetDirectProxyHandler, IClassProxyPluginFunction iClassProxyPluginFunction) {
        iJavetDirectProxyHandler.getClass();
        try {
            return iClassProxyPluginFunction.invoke(iJavetDirectProxyHandler.getV8Runtime(), iJavetDirectProxyHandler);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ IJavetUniFunction nr(String str, Map map) {
        return (IJavetUniFunction) map.get(str);
    }

    static /* synthetic */ IJavetUniFunction rl(String str, Map map) {
        return (IJavetUniFunction) map.get(str);
    }

    static /* synthetic */ IJavetUniFunction t(String str, Map map) {
        return (IJavetUniFunction) map.get(str);
    }

    default V8Value createTargetObject() {
        return (V8Value) Optional.ofNullable(getProxyPlugin()).map(new Function() { // from class: com.caoccao.javet.interop.proxy.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((IClassProxyPlugin) obj).getTargetObjectConstructor(this.f51665n.getClass());
            }
        }).map(new Function() { // from class: com.caoccao.javet.interop.proxy.qz
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return IJavetDirectProxyHandler.n(this.f52052n, (IClassProxyPluginFunction) obj);
            }
        }).orElse(null);
    }

    default V8ValueBoolean proxyDeleteProperty(V8Value v8Value, V8Value v8Value2) throws Exception {
        boolean zDeleteByObject;
        IClassProxyPlugin proxyPlugin = getProxyPlugin();
        if (proxyPlugin != null && proxyPlugin.isDeleteSupported(getClass())) {
            zDeleteByObject = proxyPlugin.deleteByObject(this, getV8Runtime().toObject(v8Value2));
        } else {
            zDeleteByObject = false;
        }
        if (zDeleteByObject) {
            return getV8Runtime().createV8ValueBoolean(true);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default V8Value proxyGet(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws Exception {
        V8Value v8Value4;
        int i2;
        Object byIndex;
        IClassProxyPlugin proxyPlugin = getProxyPlugin();
        V8Value v8ValueInvoke = null;
        IClassProxyPluginFunction<E> proxyGetBySymbol = null;
        if (proxyPlugin != null) {
            if (proxyPlugin.isIndexSupported(getClass()) && (v8Value2 instanceof V8ValueString)) {
                String value = ((V8ValueString) v8Value2).getValue();
                if (StringUtils.isDigital(value) && (i2 = Integer.parseInt(value)) >= 0 && (byIndex = proxyPlugin.getByIndex(this, i2)) != null) {
                    v8Value4 = getV8Runtime().toV8Value(byIndex);
                }
                if (v8Value4 == null) {
                }
            } else {
                v8Value4 = null;
                if (v8Value4 == null) {
                    if (v8Value2 instanceof V8ValueString) {
                        proxyGetBySymbol = proxyPlugin.getProxyGetByString(getClass(), ((V8ValueString) v8Value2).getValue());
                    } else if (v8Value2 instanceof V8ValueSymbol) {
                        proxyGetBySymbol = proxyPlugin.getProxyGetBySymbol(getClass(), ((V8ValueSymbol) v8Value2).getDescription());
                    }
                    if (proxyGetBySymbol != null) {
                        v8ValueInvoke = proxyGetBySymbol.invoke(getV8Runtime(), this);
                    }
                } else {
                    v8ValueInvoke = v8Value4;
                }
            }
        }
        if (v8ValueInvoke == null && (v8Value2 instanceof V8ValueString)) {
            final String value2 = ((V8ValueString) v8Value2).getValue();
            Optional map = Optional.ofNullable(proxyGetStringGetterMap()).map(new Function() { // from class: com.caoccao.javet.interop.proxy.Pl
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return IJavetDirectProxyHandler.t(value2, (Map) obj);
                }
            });
            if (map.isPresent()) {
                return (V8Value) ((IJavetUniFunction) map.get()).apply(value2);
            }
            if (IJavetProxyHandler.FUNCTION_NAME_TO_JSON.equals(value2)) {
                return getV8Runtime().createV8ValueFunction(new JavetCallbackContext(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, V8ValueSymbolType.BuiltIn, JavetCallbackType.DirectCallNoThisAndResult, (IJavetDirectCallable.DirectCall) new Xo(this)));
            }
            if (IJavetProxyHandler.FUNCTION_NAME_TO_V8_VALUE.equals(value2)) {
                return getV8Runtime().createV8ValueFunction(new JavetCallbackContext(IJavetProxyHandler.FUNCTION_NAME_TO_V8_VALUE, V8ValueSymbolType.BuiltIn, JavetCallbackType.DirectCallNoThisAndResult, (IJavetDirectCallable.DirectCall) new eO(this)));
            }
        } else if (v8ValueInvoke == null && (v8Value2 instanceof V8ValueSymbol)) {
            V8ValueSymbol v8ValueSymbol = (V8ValueSymbol) v8Value2;
            final String description = v8ValueSymbol.getDescription();
            Optional map2 = Optional.ofNullable(proxyGetSymbolGetterMap()).map(new Function() { // from class: com.caoccao.javet.interop.proxy.z
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return IJavetDirectProxyHandler.nr(description, (Map) obj);
                }
            });
            if (map2.isPresent()) {
                return (V8Value) ((IJavetUniFunction) map2.get()).apply(v8ValueSymbol);
            }
            if (V8ValueBuiltInSymbol.SYMBOL_PROPERTY_TO_PRIMITIVE.equals(description)) {
                return getV8Runtime().createV8ValueFunction(new JavetCallbackContext(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_TO_PRIMITIVE, V8ValueSymbolType.BuiltIn, JavetCallbackType.DirectCallNoThisAndResult, (IJavetDirectCallable.DirectCall) new eO(this)));
            }
            if (V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR.equals(description)) {
                return getV8Runtime().createV8ValueFunction(new JavetCallbackContext(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR, V8ValueSymbolType.BuiltIn, JavetCallbackType.DirectCallNoThisAndResult, (IJavetDirectCallable.DirectCall) new QJ(this)));
            }
        }
        return v8ValueInvoke;
    }

    default V8ValueBoolean proxyHas(V8Value v8Value, V8Value v8Value2) throws Exception {
        boolean zContainsKey;
        IClassProxyPlugin proxyPlugin = getProxyPlugin();
        if (proxyPlugin != null && proxyPlugin.isHasSupported(getClass())) {
            zContainsKey = proxyPlugin.hasByObject(this, getV8Runtime().toObject(v8Value2));
        } else {
            zContainsKey = false;
        }
        if (!zContainsKey && (v8Value2 instanceof V8ValueString)) {
            String primitive = ((V8ValueString) v8Value2).toPrimitive();
            Map<String, IJavetUniFunction<String, ? extends V8Value, E>> mapProxyGetStringGetterMap = proxyGetStringGetterMap();
            if (mapProxyGetStringGetterMap != null && !mapProxyGetStringGetterMap.isEmpty()) {
                zContainsKey = mapProxyGetStringGetterMap.containsKey(primitive);
            }
        } else if (!zContainsKey && (v8Value2 instanceof V8ValueSymbol)) {
            String description = ((V8ValueSymbol) v8Value2).getDescription();
            Map<String, IJavetUniFunction<V8ValueSymbol, ? extends V8Value, E>> mapProxyGetSymbolGetterMap = proxyGetSymbolGetterMap();
            if (mapProxyGetSymbolGetterMap != null && !mapProxyGetSymbolGetterMap.isEmpty()) {
                zContainsKey = mapProxyGetSymbolGetterMap.containsKey(description);
            }
        }
        if (zContainsKey) {
            return getV8Runtime().createV8ValueBoolean(true);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default V8ValueBoolean proxySet(V8Value v8Value, V8Value v8Value2, V8Value v8Value3, V8Value v8Value4) throws Exception {
        boolean zBooleanValue;
        IJavetBiFunction<V8ValueSymbol, V8Value, Boolean, E> iJavetBiFunction;
        IJavetBiFunction<String, V8Value, Boolean, E> iJavetBiFunction2;
        int i2;
        IClassProxyPlugin proxyPlugin = getProxyPlugin();
        if (proxyPlugin != null && proxyPlugin.isIndexSupported(getClass()) && (v8Value2 instanceof V8ValueString)) {
            String value = ((V8ValueString) v8Value2).getValue();
            if (StringUtils.isDigital(value) && (i2 = Integer.parseInt(value)) >= 0) {
                zBooleanValue = proxyPlugin.setByIndex(this, i2, getV8Runtime().toObject(v8Value3));
            }
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue && (v8Value2 instanceof V8ValueString)) {
            String primitive = ((V8ValueString) v8Value2).toPrimitive();
            Map<String, IJavetBiFunction<String, V8Value, Boolean, E>> mapProxyGetStringSetterMap = proxyGetStringSetterMap();
            if (mapProxyGetStringSetterMap != null && !mapProxyGetStringSetterMap.isEmpty() && (iJavetBiFunction2 = mapProxyGetStringSetterMap.get(primitive)) != null) {
                zBooleanValue = iJavetBiFunction2.apply(primitive, v8Value3).booleanValue();
            }
        } else if (!zBooleanValue && (v8Value2 instanceof V8ValueSymbol)) {
            V8ValueSymbol v8ValueSymbol = (V8ValueSymbol) v8Value2;
            String description = v8ValueSymbol.getDescription();
            Map<String, IJavetBiFunction<V8ValueSymbol, V8Value, Boolean, E>> mapProxyGetSymbolSetterMap = proxyGetSymbolSetterMap();
            if (mapProxyGetSymbolSetterMap != null && !mapProxyGetSymbolSetterMap.isEmpty() && (iJavetBiFunction = mapProxyGetSymbolSetterMap.get(description)) != null) {
                zBooleanValue = iJavetBiFunction.apply(v8ValueSymbol, v8Value3).booleanValue();
            }
        }
        if (zBooleanValue) {
            return getV8Runtime().createV8ValueBoolean(true);
        }
        return null;
    }

    default void registerStringGetter(String str, IJavetUniFunction<String, ? extends V8Value, E> iJavetUniFunction) {
        proxyGetStringGetterMap().put(str, iJavetUniFunction);
    }

    default void registerStringGetterFunction(String str, final IJavetDirectCallable.NoThisAndResult<?> noThisAndResult) {
        proxyGetStringGetterMap().put(str, new IJavetUniFunction() { // from class: com.caoccao.javet.interop.proxy.Dsr
            @Override // com.caoccao.javet.interfaces.IJavetUniFunction
            public final Object apply(Object obj) {
                return this.f51629n.getV8Runtime().createV8ValueFunction(new JavetCallbackContext((String) obj, JavetCallbackType.DirectCallNoThisAndResult, noThisAndResult));
            }
        });
    }

    default void registerStringSetter(String str, IJavetBiFunction<String, V8Value, Boolean, E> iJavetBiFunction) {
        proxyGetStringSetterMap().put(str, iJavetBiFunction);
    }

    default void registerSymbolGetterFunction(String str, final IJavetDirectCallable.NoThisAndResult<?> noThisAndResult) {
        proxyGetSymbolGetterMap().put(str, new IJavetUniFunction() { // from class: com.caoccao.javet.interop.proxy.C
            @Override // com.caoccao.javet.interfaces.IJavetUniFunction
            public final Object apply(Object obj) {
                return this.f51627n.getV8Runtime().createV8ValueFunction(new JavetCallbackContext(((V8ValueSymbol) obj).getDescription(), JavetCallbackType.DirectCallNoThisAndResult, noThisAndResult));
            }
        });
    }

    default V8Value symbolIterator(V8Value... v8ValueArr) throws Exception {
        return getV8Runtime().createV8ValueUndefined();
    }

    default V8Value symbolToPrimitive(V8Value... v8ValueArr) throws Exception {
        return getV8Runtime().createV8ValueNull();
    }

    default V8Value toJSON(V8Value... v8ValueArr) throws Exception {
        return getV8Runtime().createV8ValueObject();
    }
}
