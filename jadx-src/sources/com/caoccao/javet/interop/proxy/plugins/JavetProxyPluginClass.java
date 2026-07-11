package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class JavetProxyPluginClass extends BaseJavetProxyPlugin {
    public static final String NAME = Class.class.getName();
    private static final JavetProxyPluginClass instance = new JavetProxyPluginClass();

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetByString(Class<?> cls, String str) {
        return null;
    }

    @Override // com.caoccao.javet.interop.proxy.plugins.BaseJavetProxyPlugin, com.caoccao.javet.interop.binding.IClassProxyPlugin
    public <E extends Exception> IClassProxyPluginFunction<E> getProxyGetBySymbol(Class<?> cls, String str) {
        return null;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isMethodProxyable(String str, Class<?> cls) {
        return false;
    }

    public static JavetProxyPluginClass getInstance() {
        return instance;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public String getName() {
        return NAME;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPlugin
    public boolean isProxyable(Class<?> cls) {
        return cls != null && Class.class.isAssignableFrom(cls);
    }
}
