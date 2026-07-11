package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class V8ValueReference extends V8Value implements IV8ValueReference {
    public static final long INVALID_HANDLE = 0;
    protected long handle;
    protected boolean weak;

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.interfaces.IJavetClosable, java.lang.AutoCloseable
    public void close() throws JavetException {
        close(false);
    }

    public abstract V8ValueReferenceType getType();

    public boolean isWeak() {
        return this.weak;
    }

    public void close(boolean z2) throws JavetException {
        if (isClosed()) {
            throw new JavetException(JavetError.RuntimeAlreadyClosed);
        }
        if (z2 || !isWeak()) {
            removeReference();
            this.handle = 0L;
            this.v8Runtime = null;
            this.weak = false;
        }
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean equals(V8Value v8Value) throws JavetException {
        if (!(v8Value instanceof V8ValueReference) || v8Value.getClass() != getClass()) {
            return false;
        }
        V8ValueReference v8ValueReference = (V8ValueReference) v8Value;
        if (getHandle() == v8ValueReference.getHandle()) {
            return true;
        }
        return checkV8Runtime().getV8Internal().equals(this, v8ValueReference);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueReference
    public long getHandle() {
        return this.handle;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.interfaces.IJavetClosable
    public boolean isClosed() {
        return this.handle == 0 || super.isClosed();
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueReference
    public boolean isWeak(boolean z2) throws JavetException {
        if (z2) {
            this.weak = checkV8Runtime().getV8Internal().isWeak(this);
        }
        return this.weak;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean sameValue(V8Value v8Value) throws JavetException {
        return (v8Value instanceof V8ValueReference) && ((V8ValueReference) v8Value).getHandle() == getHandle();
    }

    V8ValueReference(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime);
        this.handle = j2;
        this.weak = false;
        addReference();
    }

    protected void addReference() throws JavetException {
        checkV8Runtime().getV8Internal().addReference(this);
    }

    @Override // com.caoccao.javet.values.V8Value
    public V8Runtime checkV8Runtime() throws JavetException {
        if (!isClosed()) {
            return super.checkV8Runtime();
        }
        throw new JavetException(JavetError.RuntimeAlreadyClosed);
    }

    public void clearWeak() throws JavetException {
        checkV8Runtime().getV8Internal().clearWeak(this);
        this.weak = false;
    }

    protected void removeReference() throws JavetException {
        checkV8Runtime().getV8Internal().removeReference(this);
    }

    public void setWeak() throws JavetException {
        checkV8Runtime().getV8Internal().setWeak(this);
        this.weak = true;
    }

    @Override // com.caoccao.javet.values.V8Value, com.caoccao.javet.values.IV8Value
    public boolean strictEquals(V8Value v8Value) throws JavetException {
        return sameValue(v8Value);
    }

    public <T extends V8Value> T toClone(boolean z2) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().cloneV8Value(this, z2);
    }

    public String toString() {
        try {
            return checkV8Runtime().getV8Internal().toString(this);
        } catch (JavetException e2) {
            return e2.getMessage();
        }
    }
}
