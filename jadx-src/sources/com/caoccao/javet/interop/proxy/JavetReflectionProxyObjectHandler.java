package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.enums.V8ConversionMode;
import com.caoccao.javet.enums.V8ProxyMode;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetEntitySymbol;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.ClassDescriptor;
import com.caoccao.javet.interop.binding.ClassDescriptorStore;
import com.caoccao.javet.interop.binding.IClassProxyPlugin;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.plugins.JavetProxyPluginDefault;
import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import java.lang.Exception;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class JavetReflectionProxyObjectHandler<T, E extends Exception> extends BaseJavetReflectionProxyHandler<T, E> {
    protected boolean deleteFromCollection(V8Value v8Value) throws JavetException {
        IClassProxyPlugin classProxyPlugin = this.classDescriptor.getClassProxyPlugin();
        if (classProxyPlugin.isDeleteSupported(this.classDescriptor.getTargetClass())) {
            return classProxyPlugin.deleteByObject(this.targetObject, this.v8Runtime.toObject(v8Value));
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected V8Value getByIndex(V8Value v8Value) throws JavetException {
        int i2;
        Object byIndex;
        IClassProxyPlugin classProxyPlugin = this.classDescriptor.getClassProxyPlugin();
        if (!classProxyPlugin.isIndexSupported(this.classDescriptor.getTargetClass()) || !(v8Value instanceof V8ValueString)) {
            return null;
        }
        String value = ((V8ValueString) v8Value).getValue();
        if (!StringUtils.isDigital(value) || (i2 = Integer.parseInt(value)) < 0 || (byIndex = classProxyPlugin.getByIndex(this.targetObject, i2)) == null) {
            return null;
        }
        return this.v8Runtime.toV8Value(byIndex);
    }

    protected V8Value getByPolyfill(V8Value v8Value) throws Exception {
        IClassProxyPluginFunction<E> proxyGetBySymbol;
        if (v8Value instanceof V8ValueString) {
            proxyGetBySymbol = this.classDescriptor.getClassProxyPlugin().getProxyGetByString(this.classDescriptor.getTargetClass(), ((V8ValueString) v8Value).getValue());
        } else if (v8Value instanceof V8ValueSymbol) {
            proxyGetBySymbol = this.classDescriptor.getClassProxyPlugin().getProxyGetBySymbol(this.classDescriptor.getTargetClass(), ((V8ValueSymbol) v8Value).getDescription());
        } else {
            proxyGetBySymbol = null;
        }
        if (proxyGetBySymbol != null) {
            return proxyGetBySymbol.invoke(this.v8Runtime, this.targetObject);
        }
        return null;
    }

    public JavetCallbackContext[] getCallbackContexts() {
        if (this.callbackContexts == null) {
            JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndResult;
            this.callbackContexts = new JavetCallbackContext[]{new JavetCallbackContext("deleteProperty", this, javetCallbackType, new yg(this)), new JavetCallbackContext("get", this, javetCallbackType, new pO(this)), new JavetCallbackContext("getOwnPropertyDescriptor", this, javetCallbackType, new Sis(this)), new JavetCallbackContext("getPrototypeOf", this, javetCallbackType, new l4Z(this)), new JavetCallbackContext("has", this, javetCallbackType, new mz(this)), new JavetCallbackContext("ownKeys", this, javetCallbackType, new OU(this)), new JavetCallbackContext("set", this, javetCallbackType, new C1830p(this))};
        }
        return this.callbackContexts;
    }

    @Override // com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    public V8ProxyMode getProxyMode() {
        return V8ProxyMode.Object;
    }

    protected boolean hasFromCollection(V8Value v8Value) throws JavetException {
        IClassProxyPlugin classProxyPlugin = this.classDescriptor.getClassProxyPlugin();
        if (classProxyPlugin.isHasSupported(this.classDescriptor.getTargetClass())) {
            return classProxyPlugin.hasByObject(this.targetObject, this.v8Runtime.toObject(v8Value));
        }
        return false;
    }

    @Override // com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    protected void initialize() {
        final Class<?> cls = this.targetObject.getClass();
        ClassDescriptor classDescriptor = ClassDescriptorStore.getObjectMap().get(cls);
        this.classDescriptor = classDescriptor;
        if (classDescriptor == null) {
            this.classDescriptor = new ClassDescriptor(V8ProxyMode.Object, cls, this.v8Runtime.getConverter().getConfig().getProxyPlugins().stream().filter(new Predicate() { // from class: com.caoccao.javet.interop.proxy.O
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((IClassProxyPlugin) obj).isProxyable(cls);
                }
            }).findFirst().orElse(JavetProxyPluginDefault.getInstance()));
            T t3 = this.targetObject;
            if (t3 instanceof Class) {
                initializeFieldsAndMethods((Class) t3, true);
            }
            initializeCollection();
            initializeFieldsAndMethods(cls, false);
            ClassDescriptorStore.getObjectMap().put(cls, this.classDescriptor);
        }
    }

    protected void initializeCollection() {
        IClassProxyPlugin classProxyPlugin = this.classDescriptor.getClassProxyPlugin();
        if (classProxyPlugin.isUniqueKeySupported(this.classDescriptor.getTargetClass())) {
            classProxyPlugin.populateUniqueKeys(this.classDescriptor.getUniqueKeySet(), this.targetObject);
        }
    }

    protected void initializeFieldsAndMethods(Class<?> cls, boolean z2) {
        V8ConversionMode conversionMode = this.classDescriptor.getConversionMode();
        do {
            initializePublicFields(cls, conversionMode, z2);
            initializePublicMethods(cls, conversionMode, z2);
            if (cls == Object.class) {
                return;
            } else {
                cls = cls.getSuperclass();
            }
        } while (cls != null);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueArray ownKeys(V8Value v8Value) throws Exception {
        IClassProxyPlugin classProxyPlugin = this.classDescriptor.getClassProxyPlugin();
        if (!classProxyPlugin.isOwnKeysSupported(this.classDescriptor.getTargetClass())) {
            return super.ownKeys(v8Value);
        }
        Object[] proxyOwnKeys = classProxyPlugin.getProxyOwnKeys(this.targetObject);
        if (ArrayUtils.isEmpty(proxyOwnKeys)) {
            proxyOwnKeys = this.classDescriptor.getUniqueKeySet().toArray();
        }
        for (int i2 = 0; i2 < proxyOwnKeys.length; i2++) {
            Object obj = proxyOwnKeys[i2];
            if (obj instanceof String) {
                proxyOwnKeys[i2] = this.v8Runtime.createV8ValueString((String) obj);
            } else if (obj instanceof IJavetEntitySymbol) {
                proxyOwnKeys[i2] = this.v8Runtime.createV8ValueSymbol(((IJavetEntitySymbol) obj).getDescription());
            } else {
                proxyOwnKeys[i2] = this.v8Runtime.createV8ValueString(String.valueOf(obj));
            }
        }
        return V8ValueUtils.createV8ValueArray(this.v8Runtime, proxyOwnKeys);
    }

    protected boolean setByIndex(V8Value v8Value, V8Value v8Value2) throws JavetException {
        int i2;
        IClassProxyPlugin classProxyPlugin = this.classDescriptor.getClassProxyPlugin();
        if (!classProxyPlugin.isIndexSupported(this.classDescriptor.getTargetClass()) || !(v8Value instanceof V8ValueString)) {
            return false;
        }
        String value = ((V8ValueString) v8Value).getValue();
        if (!StringUtils.isDigital(value) || (i2 = Integer.parseInt(value)) < 0) {
            return false;
        }
        return classProxyPlugin.setByIndex(this.targetObject, i2, this.v8Runtime.toObject(v8Value2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavetReflectionProxyObjectHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
        Objects.requireNonNull(t3);
    }

    public static /* synthetic */ V8Value KN(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.getOwnPropertyDescriptor(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value Uo(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.ownKeys(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value az(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.has(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value mUb(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.getPrototypeOf(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value qie(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.set(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2], v8ValueArr[3]);
    }

    public static /* synthetic */ V8Value ty(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.get(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value xMQ(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler, V8Value[] v8ValueArr) {
        javetReflectionProxyObjectHandler.getClass();
        return javetReflectionProxyObjectHandler.deleteProperty(v8ValueArr[0], v8ValueArr[1]);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean deleteProperty(V8Value v8Value, V8Value v8Value2) throws Exception {
        if (deleteFromCollection(v8Value2)) {
            return this.v8Runtime.createV8ValueBoolean(true);
        }
        return super.deleteProperty(v8Value, v8Value2);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean has(V8Value v8Value, V8Value v8Value2) throws JavetException {
        boolean z2;
        if (!hasFromCollection(v8Value2) && !hasFromRegular(v8Value2) && !hasFromGeneric(v8Value2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return this.v8Runtime.createV8ValueBoolean(z2);
    }

    @Override // com.caoccao.javet.interop.proxy.BaseJavetReflectionProxyHandler
    protected V8Value internalGet(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8Value byIndex = getByIndex(v8Value2);
        if (byIndex == null) {
            byIndex = getByField(v8Value2);
        }
        if (byIndex == null) {
            byIndex = getByMethod(v8Value, v8Value2);
        }
        if (byIndex == null) {
            byIndex = getByGetter(v8Value2);
        }
        if (byIndex == null) {
            return getByPolyfill(v8Value2);
        }
        return byIndex;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean set(V8Value v8Value, V8Value v8Value2, V8Value v8Value3, V8Value v8Value4) throws JavetException {
        boolean z2;
        if (!setByIndex(v8Value2, v8Value3) && !setToField(v8Value2, v8Value3) && !setToSetter(v8Value, v8Value2, v8Value3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return this.v8Runtime.createV8ValueBoolean(z2);
    }
}
