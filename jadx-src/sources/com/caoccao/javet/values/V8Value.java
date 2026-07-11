package com.caoccao.javet.values;

import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.converters.JavetObjectConverter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class V8Value extends V8Data implements IV8Value {
    protected static final JavetObjectConverter OBJECT_CONVERTER = new JavetObjectConverter();
    protected V8Runtime v8Runtime;

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public abstract void close() throws JavetException;

    @Override // com.caoccao.javet.values.IV8Value
    public abstract boolean equals(V8Value v8Value) throws JavetException;

    @Override // com.caoccao.javet.values.IV8Value
    public abstract boolean sameValue(V8Value v8Value) throws JavetException;

    @Override // com.caoccao.javet.values.IV8Value
    public abstract boolean strictEquals(V8Value v8Value) throws JavetException;

    protected V8Runtime checkV8Runtime() throws JavetException {
        V8Runtime v8Runtime = this.v8Runtime;
        if (v8Runtime != null) {
            return v8Runtime;
        }
        throw new JavetException(JavetError.RuntimeNotRegistered);
    }

    @Override // com.caoccao.javet.values.IV8Value
    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        V8Runtime v8Runtime = this.v8Runtime;
        return v8Runtime == null || v8Runtime.isClosed();
    }

    protected V8Value(V8Runtime v8Runtime) throws JavetException {
        if (v8Runtime != null) {
            this.v8Runtime = v8Runtime;
            return;
        }
        throw new JavetException(JavetError.RuntimeNotRegistered);
    }
}
