package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveObject;
import com.caoccao.javet.values.primitive.V8ValueLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8ValueLongObject extends V8ValueObject implements IV8ValuePrimitiveObject<V8ValueLong> {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.BigIntObject;
    }

    @Override // com.caoccao.javet.values.IV8ValuePrimitiveObject
    public V8ValueLong valueOf() throws JavetException {
        return checkV8Runtime().getV8Internal().longObjectValueOf(this);
    }

    public V8ValueLongObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }
}
