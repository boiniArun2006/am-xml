package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class V8ValueSharedArrayBuffer extends V8ValueArrayBuffer {
    @Override // com.caoccao.javet.values.reference.V8ValueArrayBuffer, com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.SharedArrayBuffer;
    }

    V8ValueSharedArrayBuffer(V8Runtime v8Runtime, long j2, ByteBuffer byteBuffer) throws JavetException {
        super(v8Runtime, j2, byteBuffer);
    }
}
