package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.IV8Executable;
import com.caoccao.javet.values.IV8ValueNonProxyable;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Script extends IV8Cacheable, IV8ValueReference, IV8Executable, IV8ValueNonProxyable {
    String getResourceName() throws JavetException;

    @Override // com.caoccao.javet.interop.IV8Convertible
    default <T, V extends V8Value> T toObject(V v2) throws JavetException {
        return (T) getV8Runtime().toObject(v2);
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    default <T, V extends V8Value> V toV8Value(T t3) throws JavetException {
        return (V) getV8Runtime().toV8Value(t3);
    }
}
