package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.IV8Executable;
import com.caoccao.javet.values.IV8ValueNonProxyable;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Module extends IV8Cacheable, IV8ValueReference, IV8Executable, IV8ValueNonProxyable {
    public static final int Errored = 5;
    public static final int Evaluated = 4;
    public static final int Evaluating = 3;
    public static final int Instantiated = 2;
    public static final int Instantiating = 1;
    public static final int Uninstantiated = 0;

    default <T extends V8Value> T evaluate() throws JavetException {
        return (T) evaluate(true);
    }

    <T extends V8Value> T evaluate(boolean z2) throws JavetException;

    V8ValueError getException() throws JavetException;

    int getIdentityHash() throws JavetException;

    V8Value getNamespace() throws JavetException;

    String getResourceName() throws JavetException;

    int getScriptId() throws JavetException;

    int getStatus() throws JavetException;

    boolean instantiate() throws JavetException;

    boolean isSourceTextModule() throws JavetException;

    boolean isSyntheticModule() throws JavetException;

    @Override // com.caoccao.javet.interop.IV8Executable
    default <T extends V8Value> T execute(boolean z2) throws JavetException {
        if (getStatus() == 0 && !instantiate()) {
            return getV8Runtime().createV8ValueUndefined();
        }
        if (getStatus() == 2) {
            return (T) evaluate(z2);
        }
        return getV8Runtime().createV8ValueUndefined();
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    default <T, V extends V8Value> T toObject(V v2) throws JavetException {
        return (T) getV8Runtime().toObject(v2);
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    default <T, V extends V8Value> V toV8Value(T t3) throws JavetException {
        return (V) getV8Runtime().toV8Value(t3);
    }
}
