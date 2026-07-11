package com.caoccao.javet.values.reference;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.values.V8Value;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueWeakMap extends V8ValueObject {
    public <T extends V8Value> T get(String str) throws JavetException {
        return (T) checkV8Runtime().getV8Internal().objectGet(this, this.v8Runtime.createV8ValueString(str));
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public <T extends V8Value> T get(Object obj) throws JavetException {
        Objects.requireNonNull(obj);
        if (obj instanceof IV8ValueObject) {
            return (T) invoke("get", obj);
        }
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, obj.toString()));
    }

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public V8ValueReferenceType getType() {
        return V8ValueReferenceType.WeakMap;
    }

    V8ValueWeakMap(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
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

    @Override // com.caoccao.javet.values.reference.V8ValueObject, com.caoccao.javet.values.reference.IV8ValueObject
    public boolean set(Object obj, Object obj2) throws JavetException {
        Objects.requireNonNull(obj);
        if (obj instanceof IV8ValueObject) {
            invokeVoid("set", obj, obj2);
            return true;
        }
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, obj.toString()));
    }
}
