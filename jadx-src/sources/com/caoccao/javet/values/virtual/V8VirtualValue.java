package com.caoccao.javet.values.virtual;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.converters.IJavetConverter;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class V8VirtualValue implements IJavetClosable {
    protected boolean converted;
    protected V8Value value;

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        if (this.converted) {
            JavetResourceUtils.safeClose(this.value);
        }
        this.value = null;
    }

    public <T extends V8Value> T get() {
        return (T) this.value;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        V8Value v8Value = this.value;
        return v8Value == null || v8Value.isClosed();
    }

    public V8VirtualValue(V8Runtime v8Runtime, IJavetConverter iJavetConverter, Object obj) throws JavetException {
        V8Value v8Value;
        Objects.requireNonNull(v8Runtime);
        if (obj instanceof V8Value) {
            this.converted = false;
            this.value = (V8Value) obj;
            return;
        }
        this.converted = true;
        if (iJavetConverter == null) {
            v8Value = v8Runtime.toV8Value(obj);
        } else {
            v8Value = iJavetConverter.toV8Value(v8Runtime, obj);
        }
        this.value = v8Value;
    }
}
