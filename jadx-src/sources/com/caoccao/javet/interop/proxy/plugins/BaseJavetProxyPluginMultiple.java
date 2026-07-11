package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BaseJavetProxyPluginMultiple extends BaseJavetProxyPlugin {
    protected final Map<Class<?>, Set<String>> proxyableMethodsMap = new HashMap();
    protected final Map<Class<?>, Map<String, IClassProxyPluginFunction<?>>> proxyGetByStringMap = new HashMap();
    protected final Map<Class<?>, Map<String, IClassProxyPluginFunction<?>>> proxyGetBySymbolMap = new HashMap();
    protected final Map<Class<?>, IClassProxyPluginFunction<?>> targetObjectConstructorMap = new HashMap();

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetByString(Class<?> cls, final String str) {
        return (IClassProxyPluginFunction) Optional.ofNullable(this.proxyGetByStringMap.get(cls)).map(new Function() { // from class: com.caoccao.javet.interop.proxy.plugins.Wre
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseJavetProxyPluginMultiple.J2(str, (Map) obj);
            }
        }).orElse(null);
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetBySymbol(Class<?> cls, final String str) {
        return (IClassProxyPluginFunction) Optional.ofNullable(this.proxyGetBySymbolMap.get(cls)).map(new Function() { // from class: com.caoccao.javet.interop.proxy.plugins.I28
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return BaseJavetProxyPluginMultiple.O(str, (Map) obj);
            }
        }).orElse(super.getProxyGetBySymbol(cls, str));
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getTargetObjectConstructor(Class<?> cls) {
        return (IClassProxyPluginFunction) Optional.ofNullable(this.targetObjectConstructorMap.get(cls)).orElse(super.getTargetObjectConstructor(cls));
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isMethodProxyable(final String str, Class<?> cls) {
        return ((Boolean) Optional.ofNullable(this.proxyableMethodsMap.get(cls)).map(new Function() { // from class: com.caoccao.javet.interop.proxy.plugins.CN3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Set) obj).contains(str));
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public static /* synthetic */ IClassProxyPluginFunction J2(String str, Map map) {
        return (IClassProxyPluginFunction) map.get(str);
    }

    public static /* synthetic */ IClassProxyPluginFunction O(String str, Map map) {
        return (IClassProxyPluginFunction) map.get(str);
    }
}
