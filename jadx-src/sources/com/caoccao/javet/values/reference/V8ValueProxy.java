package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class V8ValueProxy extends V8ValueObject implements IV8ValueProxy {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.Proxy;
    }

    V8ValueProxy(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueProxy
    public IV8ValueObject getHandler() throws JavetException {
        return checkV8Runtime().getV8Internal().proxyGetHandler(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueProxy
    public IV8ValueObject getTarget() throws JavetException {
        return checkV8Runtime().getV8Internal().proxyGetTarget(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueProxy
    public boolean isRevoked() throws JavetException {
        return checkV8Runtime().getV8Internal().proxyIsRevoked(this);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueProxy
    public void revoke() throws JavetException {
        checkV8Runtime().getV8Internal().proxyRevoke(this);
    }
}
