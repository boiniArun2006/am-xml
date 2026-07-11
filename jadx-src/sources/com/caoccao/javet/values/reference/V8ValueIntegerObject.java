package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveObject;
import com.caoccao.javet.values.primitive.V8ValueInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueIntegerObject extends V8ValueObject implements IV8ValuePrimitiveObject<V8ValueInteger> {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.IntegerObject;
    }

    public V8ValueDoubleObject toDoubleObject() throws JavetException {
        return new V8ValueDoubleObject(this.v8Runtime, this.handle);
    }

    @Override // com.caoccao.javet.values.IV8ValuePrimitiveObject
    public V8ValueInteger valueOf() throws JavetException {
        return checkV8Runtime().getV8Internal().integerObjectValueOf(this);
    }

    public V8ValueIntegerObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }
}
