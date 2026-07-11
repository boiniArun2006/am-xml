package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class V8Module extends V8ValueReference implements IV8Module {
    protected String resourceName;
    protected Boolean sourceTextModule;
    protected Boolean syntheticModule;

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.interop.IV8Cloneable
    public V8Module toClone(boolean z2) throws JavetException {
        return this;
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public String getResourceName() throws JavetException {
        if (this.resourceName == null) {
            this.resourceName = checkV8Runtime().getV8Internal().moduleGetResourceName(this);
        }
        return this.resourceName;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Module;
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public boolean isSourceTextModule() throws JavetException {
        if (this.sourceTextModule == null) {
            this.sourceTextModule = Boolean.valueOf(checkV8Runtime().getV8Internal().moduleIsSourceTextModule(this));
        }
        return this.sourceTextModule.booleanValue();
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public boolean isSyntheticModule() throws JavetException {
        if (this.syntheticModule == null) {
            this.syntheticModule = Boolean.valueOf(checkV8Runtime().getV8Internal().moduleIsSyntheticModule(this));
        }
        return this.syntheticModule.booleanValue();
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference
    public String toString() {
        return this.resourceName;
    }

    V8Module(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
        this.sourceTextModule = null;
        this.syntheticModule = null;
        this.resourceName = null;
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public <T extends V8Value> T evaluate(boolean z2) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().moduleEvaluate(this, z2);
    }

    @Override // com.caoccao.javet.values.reference.IV8Cacheable
    public byte[] getCachedData() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleGetCachedData(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public V8ValueError getException() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleGetException(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public int getIdentityHash() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleGetIdentityHash(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public V8Value getNamespace() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleGetNamespace(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public int getScriptId() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleGetScriptId(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public int getStatus() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleGetStatus(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8Module
    public boolean instantiate() throws JavetException {
        return checkV8Runtime().getV8Internal().moduleInstantiate(this);
    }
}
