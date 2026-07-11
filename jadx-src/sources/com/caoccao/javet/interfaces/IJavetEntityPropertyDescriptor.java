package com.caoccao.javet.interfaces;

import com.caoccao.javet.interop.proxy.IJavetNonProxy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface IJavetEntityPropertyDescriptor<T> extends IJavetNonProxy {
    public static final String PROXY_PROPERTY_CONFIGURABLE = "configurable";
    public static final String PROXY_PROPERTY_ENUMERABLE = "enumerable";
    public static final String PROXY_PROPERTY_VALUE = "value";
    public static final String PROXY_PROPERTY_WRITABLE = "writable";

    T getValue();

    boolean isConfigurable();

    boolean isEnumerable();

    boolean isWritable();

    void setConfigurable(boolean z2);

    void setEnumerable(boolean z2);

    void setValue(T t3);

    void setWritable(boolean z2);
}
