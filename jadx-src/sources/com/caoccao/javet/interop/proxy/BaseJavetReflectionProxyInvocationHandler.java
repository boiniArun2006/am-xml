package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.reference.V8ValueReference;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class BaseJavetReflectionProxyInvocationHandler<Reference extends V8ValueReference> implements InvocationHandler, IJavetClosable {
    protected static final String METHOD_NAME_CLOSE = "close";
    protected Reference v8ValueReference;

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        JavetResourceUtils.safeClose(this.v8ValueReference);
        this.v8ValueReference = null;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        Reference reference = this.v8ValueReference;
        return reference == null || reference.isClosed();
    }

    public BaseJavetReflectionProxyInvocationHandler(Reference reference) {
        this.v8ValueReference = reference;
    }

    protected void finalize() throws Throwable {
        close();
    }
}
