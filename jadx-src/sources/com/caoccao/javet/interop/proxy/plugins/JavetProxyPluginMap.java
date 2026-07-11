package com.caoccao.javet.interop.proxy.plugins;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.caoccao.javet.entities.JavetEntityPropertyDescriptor;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.IJavetProxyHandler;
import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.SimpleList;
import com.caoccao.javet.utils.SimpleSet;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class JavetProxyPluginMap extends BaseJavetProxyPluginSingle<Map<Object, Object>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String DELETE = "delete";
    protected static final String ENTRIES = "entries";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_MAP = "Target object must be an instance of Map.";
    protected static final String GET = "get";
    protected static final String HAS = "has";
    protected static final String KEYS = "keys";
    protected static final String OBJECT_MAP = "[object Map]";
    protected static final String SET = "set";
    protected static final String VALUES = "values";
    protected final Set<String> proxyableMethods = SimpleSet.of(DEFAULT_PROXYABLE_METHODS);
    public static final String NAME = Map.class.getName();
    protected static final String CLEAR = "clear";
    protected static final String FOR_EACH = "forEach";
    protected static final String SIZE = "size";
    protected static final String[] DEFAULT_PROXYABLE_METHODS = {CLEAR, FOR_EACH, "get", SIZE, "toString"};
    private static final JavetProxyPluginMap instance = new JavetProxyPluginMap();

    public static /* synthetic */ V8Value nr(V8Runtime v8Runtime, Map map, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        Object object = v8Runtime.toObject(V8ValueUtils.asV8Value(v8ValueArr, 0));
        Object object2 = v8Runtime.toObject(V8ValueUtils.asV8Value(v8ValueArr, 1));
        if (object != null) {
            map.put(object, object2);
        }
        return v8Value;
    }

    public static /* synthetic */ V8Value xMQ(V8Runtime v8Runtime, Map map, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (Map.Entry entry : map.entrySet()) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, entry.getValue(), entry.getKey(), v8Value);
                if (v8ValueCall != null) {
                    v8ValueCall.close();
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
    public boolean isOwnKeysSupported(Class<?> cls) {
        return true;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isUniqueKeySupported(Class<?> cls) {
        return true;
    }

    public static JavetProxyPluginMap getInstance() {
        return instance;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public String getName() {
        return NAME;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <T> IJavetEntityPropertyDescriptor<T> getProxyOwnPropertyDescriptor(Object obj, Object obj2) {
        return new JavetEntityPropertyDescriptor(true, true, true);
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isMethodProxyable(String str, Class<?> cls) {
        return this.proxyableMethods.contains(str);
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isProxyable(Class<?> cls) {
        return cls != null && Map.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    public Map<Object, Object> validateTargetObject(Object obj) {
        return (Map) obj;
    }

    public JavetProxyPluginMap() {
        this.proxyGetByStringMap.put(CLEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ab
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51851n.clear(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(DELETE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ou
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51961n.delete(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("entries", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.xe
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52030n.entries(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FOR_EACH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.qW
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51972n.forEach(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("get", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.JF
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51731n.get(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("has", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.aXh
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51850n.has(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("keys", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.cDu
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51862n.keys(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(QiDPjiOCZHDS.oCkmuMAiQW, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Dbq
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51688n.set(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SIZE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Zz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51847n.size(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.r4t
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51981n.toJSON(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("toString", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.BLY
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51672n.toString(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.BNf
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51673n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("values", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.USE
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51814n.values(v8Runtime, obj);
            }
        });
        this.proxyGetBySymbolMap.put(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.xe
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52030n.entries(v8Runtime, obj);
            }
        });
    }

    public static /* synthetic */ V8Value HI(Map map, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        boolean zContainsKey = false;
        if (!map.isEmpty() && ArrayUtils.isNotEmpty(v8ValueArr)) {
            zContainsKey = map.containsKey(v8Runtime.toObject(v8ValueArr[0]));
        }
        return v8Runtime.createV8ValueBoolean(zContainsKey);
    }

    public static /* synthetic */ V8Value KN(Map map, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        map.clear();
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value Uo(Map map, V8Runtime v8Runtime, V8Value[] v8ValueArr) throws JavetException {
        if (!map.isEmpty() && ArrayUtils.isNotEmpty(v8ValueArr)) {
            Object object = v8Runtime.toObject(v8ValueArr[0]);
            if (map.containsKey(object)) {
                return v8Runtime.toV8Value(map.get(object));
            }
        }
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value ck(Map map, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        Object[] objArr = new Object[map.size() << 1];
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            objArr[i2] = entry.getKey();
            objArr[i2 + 1] = entry.getValue();
            i2 += 2;
        }
        return V8ValueUtils.createV8ValueObject(v8Runtime, objArr);
    }

    public static /* synthetic */ V8Value qie(Map map, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        boolean z2 = false;
        if (!map.isEmpty() && ArrayUtils.isNotEmpty(v8ValueArr) && map.remove(v8Runtime.toObject(v8ValueArr[0])) != null) {
            z2 = true;
        }
        return v8Runtime.createV8ValueBoolean(z2);
    }

    public V8Value clear(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(CLEAR, obj, JavetCallbackType.DirectCallNoThisAndResult, new WE7(mapValidateTargetObject, v8Runtime)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    protected V8Value createTargetObject(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        return null;
    }

    public V8Value delete(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(DELETE, obj, JavetCallbackType.DirectCallNoThisAndResult, new Xtu(mapValidateTargetObject, v8Runtime)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean deleteByObject(Object obj, Object obj2) {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        if (obj2 != null && mapValidateTargetObject.remove(obj2) != null) {
            return true;
        }
        return false;
    }

    public V8Value entries(V8Runtime v8Runtime, Object obj) throws JavetException {
        List list = (List) validateTargetObject(obj).entrySet().stream().map(new Function() { // from class: com.caoccao.javet.interop.proxy.plugins.s
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Map.Entry entry = (Map.Entry) obj2;
                return SimpleList.of(entry.getKey(), entry.getValue());
            }
        }).collect(Collectors.toList());
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("entries", obj, JavetCallbackType.DirectCallNoThisAndResult, new vi(v8Runtime, list)));
    }

    public V8Value forEach(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FOR_EACH, obj, JavetCallbackType.DirectCallThisAndResult, new r6h(v8Runtime, mapValidateTargetObject)));
    }

    public V8Value get(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("get", obj, JavetCallbackType.DirectCallNoThisAndResult, new Z4b(mapValidateTargetObject, v8Runtime)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object[] getProxyOwnKeys(Object obj) {
        return validateTargetObject(obj).keySet().toArray();
    }

    public V8Value has(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("has", obj, JavetCallbackType.DirectCallNoThisAndResult, new dB(mapValidateTargetObject, v8Runtime)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean hasByObject(Object obj, Object obj2) {
        return validateTargetObject(obj).containsKey(obj2);
    }

    public V8Value keys(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("keys", obj, JavetCallbackType.DirectCallNoThisAndResult, new dq(v8Runtime, mapValidateTargetObject)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public void populateUniqueKeys(Set<String> set, Object obj) {
        Stream streamFilter = validateTargetObject(obj).keySet().stream().map(new cA()).filter(new f0());
        Objects.requireNonNull(set);
        streamFilter.forEach(new ua(set));
    }

    public V8Value set(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("set", obj, JavetCallbackType.DirectCallThisAndResult, new Xq(v8Runtime, mapValidateTargetObject)));
    }

    public V8Value size(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueInteger(mapValidateTargetObject.size());
    }

    public V8Value toJSON(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, obj, JavetCallbackType.DirectCallNoThisAndResult, new BW(mapValidateTargetObject, v8Runtime)));
    }

    public V8Value toString(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("toString", obj, JavetCallbackType.DirectCallNoThisAndResult, new PXC(v8Runtime)));
    }

    public V8Value valueOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("values", obj, JavetCallbackType.DirectCallNoThisAndResult, new FOg(v8Runtime, mapValidateTargetObject)));
    }

    public V8Value values(V8Runtime v8Runtime, Object obj) throws JavetException {
        Map<Object, Object> mapValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("values", obj, JavetCallbackType.DirectCallNoThisAndResult, new gW(v8Runtime, mapValidateTargetObject)));
    }
}
