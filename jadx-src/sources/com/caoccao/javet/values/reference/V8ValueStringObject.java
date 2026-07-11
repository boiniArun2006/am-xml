package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveObject;
import com.caoccao.javet.values.primitive.V8ValueString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class V8ValueStringObject extends V8ValueObject implements IV8ValuePrimitiveObject<V8ValueString> {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.StringObject;
    }

    @Override // com.caoccao.javet.values.IV8ValuePrimitiveObject
    public V8ValueString valueOf() throws JavetException {
        return checkV8Runtime().getV8Internal().stringObjectValueOf(this);
    }

    V8ValueStringObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }
}
