package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.IV8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8ValueReference extends IV8Value {
    void clearWeak() throws JavetException;

    void close(boolean z2) throws JavetException;

    long getHandle();

    V8ValueReferenceType getType();

    @Override // com.caoccao.javet.interfaces.IJavetClosable
    boolean isClosed();

    boolean isWeak() throws JavetException;

    boolean isWeak(boolean z2) throws JavetException;

    void setWeak() throws JavetException;
}
