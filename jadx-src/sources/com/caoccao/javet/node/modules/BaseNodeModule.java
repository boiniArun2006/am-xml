package com.caoccao.javet.node.modules;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BaseNodeModule implements INodeModule {
    protected V8ValueObject moduleObject;
    protected String name;

    @Override // com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        JavetResourceUtils.safeClose(this.moduleObject);
        this.moduleObject = null;
    }

    @Override // com.caoccao.javet.node.modules.INodeModule
    public V8ValueObject getModuleObject() {
        return this.moduleObject;
    }

    @Override // com.caoccao.javet.node.modules.INodeModule
    public String getName() {
        return this.name;
    }

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        V8ValueObject v8ValueObject = this.moduleObject;
        return v8ValueObject == null || v8ValueObject.isClosed();
    }

    public BaseNodeModule(V8ValueObject v8ValueObject, String str) {
        Objects.requireNonNull(v8ValueObject);
        this.moduleObject = v8ValueObject;
        this.name = str;
    }
}
