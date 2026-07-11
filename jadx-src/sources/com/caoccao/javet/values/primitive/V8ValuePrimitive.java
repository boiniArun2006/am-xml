package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class V8ValuePrimitive<Primitive> extends V8Value {
    protected Primitive value;

    public V8ValuePrimitive(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, null);
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
    }

    public V8ValuePrimitive(V8Runtime v8Runtime, Primitive primitive) throws JavetException {
        super(v8Runtime);
        this.value = primitive;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean equals(V8Value v8Value) {
        if ((v8Value instanceof V8ValuePrimitive) && v8Value.getClass() == getClass()) {
            return getValue().equals(((V8ValuePrimitive) v8Value).getValue());
        }
        return false;
    }

    public Primitive getValue() {
        return this.value;
    }

    public boolean isEmpty() {
        return this.value == null;
    }

    public boolean isPresent() {
        return this.value != null;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean sameValue(V8Value v8Value) {
        return equals(v8Value);
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean strictEquals(V8Value v8Value) {
        return equals(v8Value);
    }

    public String toString() {
        if (isEmpty()) {
            return null;
        }
        return this.value.toString();
    }
}
