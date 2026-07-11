package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8Script extends V8ValueReference implements IV8Script {
    protected String resourceName;

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.interop.IV8Cloneable
    public V8Script toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.reference.IV8Script
    public String getResourceName() throws JavetException {
        if (this.resourceName == null) {
            this.resourceName = checkV8Runtime().getV8Internal().scriptGetResourceName(this);
        }
        return this.resourceName;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Script;
    }

    V8Script(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
        this.resourceName = null;
    }

    @Override // com.caoccao.javet.interop.IV8Executable
    public <T extends V8Value> T execute(boolean z2) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().scriptRun(this, z2);
    }

    @Override // com.caoccao.javet.values.reference.IV8Cacheable
    public byte[] getCachedData() throws JavetException {
        return checkV8Runtime().getV8Internal().scriptGetCachedData(this);
    }
}
