package com.caoccao.javet.interop.binding;

import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface IClassProxyPlugin {
    boolean deleteByObject(Object obj, Object obj2);

    Object getByIndex(Object obj, int i2);

    String getName();

    <E extends Exception> IClassProxyPluginFunction<E> getProxyGetByString(Class<?> cls, String str);

    <E extends Exception> IClassProxyPluginFunction<E> getProxyGetBySymbol(Class<?> cls, String str);

    Object[] getProxyOwnKeys(Object obj);

    <T> IJavetEntityPropertyDescriptor<T> getProxyOwnPropertyDescriptor(Object obj, Object obj2);

    <E extends Exception> IClassProxyPluginFunction<E> getProxySymbolToPrimitive();

    <E extends Exception> IClassProxyPluginFunction<E> getTargetObjectConstructor(Class<?> cls);

    boolean hasByObject(Object obj, Object obj2);

    boolean isDeleteSupported(Class<?> cls);

    boolean isHasSupported(Class<?> cls);

    boolean isIndexSupported(Class<?> cls);

    boolean isMethodProxyable(String str, Class<?> cls);

    boolean isOwnKeysSupported(Class<?> cls);

    boolean isProxyable(Class<?> cls);

    boolean isUniqueKeySupported(Class<?> cls);

    void populateUniqueKeys(Set<String> set, Object obj);

    boolean setByIndex(Object obj, int i2, Object obj2);
}
