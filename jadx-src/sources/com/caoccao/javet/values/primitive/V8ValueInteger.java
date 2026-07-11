package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveValue;
import com.caoccao.javet.values.reference.V8ValueIntegerObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class V8ValueInteger extends V8ValueNumber<Integer> implements IV8ValuePrimitiveValue<V8ValueIntegerObject> {
    public V8ValueInteger(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, 0);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueInteger toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.primitive.V8ValuePrimitive
    public String toString() {
        return toString(10);
    }

    public V8ValueInteger(V8Runtime v8Runtime, int i2) throws JavetException {
        super(v8Runtime, Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public boolean asBoolean() {
        return ((Integer) this.value).intValue() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8Value
    public int asInt() {
        return ((Integer) this.value).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caoccao.javet.values.IV8ValuePrimitiveValue
    public V8ValueIntegerObject toObject() throws JavetException {
        return checkV8Runtime().createV8ValueIntegerObject(((Integer) this.value).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int toPrimitive() {
        return ((Integer) this.value).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString(int i2) {
        return Integer.toString(((Integer) this.value).intValue(), i2);
    }
}
