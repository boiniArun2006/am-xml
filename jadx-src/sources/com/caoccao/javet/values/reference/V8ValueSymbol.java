package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValuePrimitiveValue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class V8ValueSymbol extends V8ValueObject implements IV8ValuePrimitiveValue<V8ValueSymbolObject> {
    protected static final String FUNCTION_TO_STRING = "toString";
    protected String description;

    public String getDescription() throws JavetException {
        if (this.description == null) {
            this.description = checkV8Runtime().getV8Internal().symbolDescription(this);
        }
        return this.description;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Symbol;
    }

    @Override // com.caoccao.javet.values.IV8ValuePrimitiveValue
    public V8ValueSymbolObject toObject() throws JavetException {
        return checkV8Runtime().getV8Internal().symbolToObject(this);
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference
    public String toString() {
        try {
            return invokeString(FUNCTION_TO_STRING, new Object[0]);
        } catch (JavetException e2) {
            return e2.getMessage();
        }
    }

    V8ValueSymbol(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
        this.description = null;
    }
}
