package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValueNonProxyable;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class V8ValueNull extends V8Value implements IV8ValueNonProxyable {
    public static final String NULL = "null";

    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return false;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueNull toClone(boolean z2) {
        return this;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean equals(V8Value v8Value) {
        return v8Value instanceof V8ValueNull;
    }

    public String toString() {
        return NULL;
    }

    public V8ValueNull(V8Runtime v8Runtime) throws JavetException {
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
