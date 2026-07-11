package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveObject;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueNumber;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8ValueDoubleObject extends V8ValueObject implements IV8ValuePrimitiveObject<V8Value> {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.DoubleObject;
    }

    public V8ValueIntegerObject toIntegerObject() throws JavetException {
        return new V8ValueIntegerObject(this.v8Runtime, this.handle);
    }

    @Override // com.caoccao.javet.values.IV8ValuePrimitiveObject
    public V8ValueNumber<?> valueOf() throws JavetException {
        return checkV8Runtime().getV8Internal().doubleObjectValueOf(this);
    }

    public V8ValueDoubleObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }
}
