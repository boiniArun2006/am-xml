package com.caoccao.javet.interop.binding;

import com.caoccao.javet.enums.V8ValueSymbolType;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class MethodDescriptor {
    protected Method method;
    protected V8ValueSymbolType symbolType;
    protected boolean thisObjectRequired;

    public MethodDescriptor(Method method, boolean z2) {
        this(method, z2, V8ValueSymbolType.None);
    }

    public MethodDescriptor(Method method, boolean z2, V8ValueSymbolType v8ValueSymbolType) {
        this.method = method;
        this.symbolType = v8ValueSymbolType;
        this.thisObjectRequired = z2;
    }

    public Method getMethod() {
        return this.method;
    }

    public V8ValueSymbolType getSymbolType() {
        return this.symbolType;
    }

    public boolean isThisObjectRequired() {
        return this.thisObjectRequired;
    }
}
