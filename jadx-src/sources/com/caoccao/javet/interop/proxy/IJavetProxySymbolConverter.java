package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IJavetProxySymbolConverter {
    V8ValueFunction getV8ValueFunction() throws JavetException;

    V8Value toV8Value(V8Value... v8ValueArr) throws JavetException;
}
