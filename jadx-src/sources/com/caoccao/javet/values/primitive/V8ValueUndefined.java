package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValueNonProxyable;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V8ValueUndefined extends V8Value implements IV8ValueNonProxyable {
    public static final String UNDEFINED = "undefined";

    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return false;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueUndefined toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean equals(V8Value v8Value) {
        return v8Value instanceof V8ValueUndefined;
    }

    public String toString() {
        return "undefined";
    }

    public V8ValueUndefined(V8Runtime v8Runtime) throws JavetException {
        super(v8Runtime);
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean sameValue(V8Value v8Value) {
        return equals(v8Value);
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean strictEquals(V8Value v8Value) {
        return equals(v8Value);
    }
}
