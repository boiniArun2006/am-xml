package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ContextType;
import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8Context extends V8ValueReference implements IV8Context {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String ERROR_ELEMENT_LENGTH_MUST_BE_NON_NEGATIVE = "Element length must be non-negative.";

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.interop.IV8Cloneable
    public V8Context toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Context;
    }

    V8Context(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.reference.IV8Context
    public <T extends V8Value> T get(int i2) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().contextGet(this, i2);
    }

    @Override // com.caoccao.javet.values.reference.IV8Context
    public int getLength() throws JavetException {
        return checkV8Runtime().getV8Internal().contextGetLength(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Context
    public boolean isContextType(V8ContextType v8ContextType) throws JavetException {
        return checkV8Runtime().getV8Internal().contextIsContextType(this, v8ContextType.getId());
    }

    @Override // com.caoccao.javet.values.reference.IV8Context
    public boolean setLength(int i2) throws JavetException {
        return checkV8Runtime().getV8Internal().contextSetLength(this, i2);
    }
}
