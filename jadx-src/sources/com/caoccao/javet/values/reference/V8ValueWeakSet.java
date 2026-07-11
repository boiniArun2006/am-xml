package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.SimpleMap;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class V8ValueWeakSet extends V8ValueObject {
    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.WeakSet;
    }

    V8ValueWeakSet(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    public void add(IV8ValueObject iV8ValueObject) throws JavetException {
        Objects.requireNonNull(iV8ValueObject);
        invokeVoid(gUxOLwRQBPPLC.UkfxvnEa, iV8ValueObject);
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean delete(Object obj) throws JavetException {
        Objects.requireNonNull(obj);
        if (obj instanceof IV8ValueObject) {
            invokeVoid("delete", obj);
            return true;
        }
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, obj.toString()));
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean has(Object obj) throws JavetException {
        Objects.requireNonNull(obj);
        if (obj instanceof IV8ValueObject) {
            return invokeBoolean("has", obj).booleanValue();
        }
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, obj.toString()));
    }
}
