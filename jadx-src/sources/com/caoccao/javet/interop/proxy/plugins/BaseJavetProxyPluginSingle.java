package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.values.V8Value;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class BaseJavetProxyPluginSingle<T> extends BaseJavetProxyPlugin {
    protected final Map<String, IClassProxyPluginFunction<?>> proxyGetByStringMap = new HashMap();
    protected final Map<String, IClassProxyPluginFunction<?>> proxyGetBySymbolMap = new HashMap();

    protected abstract V8Value createTargetObject(V8Runtime v8Runtime, Object obj) throws JavetException;

    protected abstract T validateTargetObject(Object obj);

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetByString(Class<?> cls, String str) {
        return (IClassProxyPluginFunction) this.proxyGetByStringMap.get(str);
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetBySymbol(Class<?> cls, String str) {
        return (IClassProxyPluginFunction) Optional.ofNullable(this.proxyGetBySymbolMap.get(str)).orElse(super.getProxyGetBySymbol(cls, str));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getTargetObjectConstructor(Class<?> cls) {
        return new IClassProxyPluginFunction() { // from class: com.caoccao.javet.interop.proxy.plugins.fuX
            @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
            public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
                return this.f51895n.createTargetObject(v8Runtime, obj);
            }
        };
    }
}
