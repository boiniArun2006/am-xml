package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveValue;
import com.caoccao.javet.values.reference.V8ValueLongObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V8ValueLong extends V8ValueBigNumber<Long> implements IV8ValuePrimitiveValue<V8ValueLongObject> {
    public V8ValueLong(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, 0L);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueLong toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.primitive.V8ValuePrimitive
    public String toString() {
        return toString(10);
    }

    public V8ValueLong(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, Long.valueOf(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return ((Long) this.value).longValue() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public double asDouble() {
        return ((Long) this.value).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() {
        return ((Long) this.value).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public long asLong() {
        return ((Long) this.value).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8ValuePrimitiveValue
    public V8ValueLongObject toObject() throws JavetException {
        return checkV8Runtime().createV8ValueLongObject(((Long) this.value).longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long toPrimitive() {
        return ((Long) this.value).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString(int i2) {
        return Long.toString(((Long) this.value).longValue(), i2);
    }

    public V8ValueLong(V8Runtime v8Runtime, String str) throws JavetException {
        this(v8Runtime, Long.parseLong(str));
    }
}
