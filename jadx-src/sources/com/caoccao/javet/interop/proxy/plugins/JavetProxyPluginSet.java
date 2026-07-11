package com.caoccao.javet.interop.proxy.plugins;

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
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetProxyPluginSet extends BaseJavetProxyPluginSingle<Set<Object>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String ADD = "add";
    protected static final String DELETE = "delete";
    protected static final String ENTRIES = "entries";
    protected static final String ERROR_TARGET_OBJECT_MUST_BE_AN_INSTANCE_OF_SET = "Target object must be an instance of Set.";
    protected static final String HAS = "has";
    protected static final String KEYS = "keys";
    protected static final String OBJECT_SET = "[object Set]";
    protected static final String VALUES = "values";
    protected final Set<String> proxyableMethods = SimpleSet.of(DEFAULT_PROXYABLE_METHODS);
    public static final String NAME = Set.class.getName();
    protected static final String CLEAR = "clear";
    protected static final String FOR_EACH = "forEach";
    protected static final String SIZE = "size";
    protected static final String[] DEFAULT_PROXYABLE_METHODS = {"add", CLEAR, FOR_EACH, SIZE, "toString"};
    private static final JavetProxyPluginSet instance = new JavetProxyPluginSet();

    public static /* synthetic */ V8Value mUb(V8Runtime v8Runtime, Set set, V8Value v8Value, V8Value[] v8ValueArr) throws JavetException {
        V8ValueFunction v8ValueFunctionAsV8ValueFunctionWithError = V8ValueUtils.asV8ValueFunctionWithError(v8Runtime, v8ValueArr, 0);
        if (v8ValueFunctionAsV8ValueFunctionWithError != null) {
            V8ValueObject v8ValueObjectAsV8ValueObject = V8ValueUtils.asV8ValueObject(v8ValueArr, 1);
            for (Object obj : set) {
                V8Value v8ValueCall = v8ValueFunctionAsV8ValueFunctionWithError.call(v8ValueObjectAsV8ValueObject, obj, obj, v8Value);
                if (v8ValueCall != null) {
                    v8ValueCall.close();
                }
            }
        }
        return v8Runtime.createV8ValueUndefined();
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

    public static JavetProxyPluginSet getInstance() {
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
        return cls != null && Set.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    public Set<Object> validateTargetObject(Object obj) {
        return (Set) obj;
    }

    public JavetProxyPluginSet() {
        this.proxyGetByStringMap.put("add", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.kJ
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51926n.add(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(CLEAR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.zU
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52048n.clear(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(DELETE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Lj
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51748n.delete(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("entries", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.yvO
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52043n.entries(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(FOR_EACH, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.SUH
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51805n.forEach(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("has", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.eD
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51884n.has(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("keys", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Wqz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51823n.values(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(SIZE, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.iB
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51915n.size(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.ng
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51951n.toJSON(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("toString", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.wE9
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f52020n.toString(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("valueOf", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.X
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51825n.valueOf(v8Runtime, obj);
            }
        });
        this.proxyGetByStringMap.put("values", new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Wqz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51823n.values(v8Runtime, obj);
            }
        });
        this.proxyGetBySymbolMap.put(V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR, new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.Wqz
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51823n.values(v8Runtime, obj);
            }
        });
    }

    public static /* synthetic */ V8Value nr(Set set, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        boolean zRemove = false;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            zRemove = set.remove(v8Runtime.toObject(v8ValueArr[0]));
        }
        return v8Runtime.createV8ValueBoolean(zRemove);
    }

    public static /* synthetic */ V8Value qie(Set set, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        boolean zContains = false;
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            zContains = set.contains(v8Runtime.toObject(v8ValueArr[0]));
        }
        return v8Runtime.createV8ValueBoolean(zContains);
    }

    public static /* synthetic */ V8Value ty(Set set, V8Runtime v8Runtime, V8Value[] v8ValueArr) {
        set.clear();
        return v8Runtime.createV8ValueUndefined();
    }

    public static /* synthetic */ V8Value xMQ(Set set, V8Runtime v8Runtime, V8Value v8Value, V8Value[] v8ValueArr) {
        if (ArrayUtils.isNotEmpty(v8ValueArr)) {
            set.add(v8Runtime.toObject(v8ValueArr[0]));
        }
        return v8Value;
    }

    public V8Value add(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("add", obj, JavetCallbackType.DirectCallThisAndResult, new q4d(setValidateTargetObject, v8Runtime)));
    }

    public V8Value clear(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(CLEAR, obj, JavetCallbackType.DirectCallNoThisAndResult, new rXW(setValidateTargetObject, v8Runtime)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPluginSingle
    protected V8Value createTargetObject(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        return v8Runtime.createV8ValueSet();
    }

    public V8Value delete(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(DELETE, obj, JavetCallbackType.DirectCallNoThisAndResult, new RVT(setValidateTargetObject, v8Runtime)));
    }

    public V8Value entries(V8Runtime v8Runtime, Object obj) throws JavetException {
        List list = (List) validateTargetObject(obj).stream().map(new Function() { // from class: com.caoccao.javet.interop.proxy.plugins.BH
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return SimpleList.of(obj2, obj2);
            }
        }).collect(Collectors.toList());
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("entries", obj, JavetCallbackType.DirectCallNoThisAndResult, new NDx(v8Runtime, list)));
    }

    public V8Value forEach(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(FOR_EACH, obj, JavetCallbackType.DirectCallThisAndResult, new xU(v8Runtime, setValidateTargetObject)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public Object[] getProxyOwnKeys(Object obj) {
        return validateTargetObject(obj).toArray();
    }

    public V8Value has(V8Runtime v8Runtime, Object obj) throws JavetException {
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("has", obj, JavetCallbackType.DirectCallNoThisAndResult, new vr(validateTargetObject(obj), v8Runtime)));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean hasByObject(Object obj, Object obj2) {
        return validateTargetObject(obj).contains(obj2);
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public void populateUniqueKeys(Set<String> set, Object obj) {
        Stream streamFilter = validateTargetObject(obj).stream().map(new cA()).filter(new f0());
        Objects.requireNonNull(set);
        streamFilter.forEach(new ua(set));
    }

    public V8Value size(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueInteger(setValidateTargetObject.size());
    }

    public V8Value toJSON(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext(IJavetProxyHandler.FUNCTION_NAME_TO_JSON, obj, JavetCallbackType.DirectCallNoThisAndResult, new xJ(v8Runtime)));
    }

    public V8Value toString(V8Runtime v8Runtime, Object obj) throws JavetException {
        validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("toString", obj, JavetCallbackType.DirectCallNoThisAndResult, new nBa(v8Runtime)));
    }

    public V8Value valueOf(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("valueOf", obj, JavetCallbackType.DirectCallNoThisAndResult, new SF(v8Runtime, setValidateTargetObject)));
    }

    public V8Value values(V8Runtime v8Runtime, Object obj) throws JavetException {
        Set<Object> setValidateTargetObject = validateTargetObject(obj);
        Objects.requireNonNull(v8Runtime);
        return v8Runtime.createV8ValueFunction(new JavetCallbackContext("values", obj, JavetCallbackType.DirectCallNoThisAndResult, new OW(v8Runtime, setValidateTargetObject)));
    }
}
