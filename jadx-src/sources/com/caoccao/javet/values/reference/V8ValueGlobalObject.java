package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.utils.SimpleMap;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInJson;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInPromise;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInReflect;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class V8ValueGlobalObject extends V8ValueObject {
    @Override // com.caoccao.javet.values.reference.V8ValueReference
    protected void addReference() {
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public void clearWeak() {
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public void close(boolean z2) throws JavetException {
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public boolean isWeak() {
        return false;
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference
    protected void removeReference() {
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.values.reference.IV8ValueReference
    public void setWeak() {
    }

    @Override // com.caoccao.javet.values.reference.V8ValueReference, com.caoccao.javet.interop.IV8Cloneable
    public V8ValueGlobalObject toClone(boolean z2) {
        return this;
    }

    public V8ValueBuiltInJson getBuiltInJson() throws JavetException {
        V8Value v8ValueExecute = this.v8Runtime.getExecutor(V8ValueBuiltInJson.NAME).execute();
        if (v8ValueExecute instanceof V8ValueObject) {
            return new V8ValueBuiltInJson(this.v8Runtime, ((V8ValueObject) v8ValueExecute).getHandle());
        }
        JavetResourceUtils.safeClose(v8ValueExecute);
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, V8ValueBuiltInJson.NAME));
    }

    public V8ValueBuiltInObject getBuiltInObject() throws JavetException {
        V8Value v8ValueExecute = this.v8Runtime.getExecutor(V8ValueBuiltInObject.NAME).execute();
        if (v8ValueExecute instanceof V8ValueObject) {
            return new V8ValueBuiltInObject(this.v8Runtime, ((V8ValueObject) v8ValueExecute).getHandle());
        }
        JavetResourceUtils.safeClose(v8ValueExecute);
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, V8ValueBuiltInObject.NAME));
    }

    public V8ValueBuiltInPromise getBuiltInPromise() throws JavetException {
        V8Value v8ValueExecute = this.v8Runtime.getExecutor(V8ValueBuiltInPromise.NAME).execute();
        if (v8ValueExecute instanceof V8ValueObject) {
            return new V8ValueBuiltInPromise(this.v8Runtime, ((V8ValueObject) v8ValueExecute).getHandle());
        }
        JavetResourceUtils.safeClose(v8ValueExecute);
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, V8ValueBuiltInPromise.NAME));
    }

    public V8ValueBuiltInReflect getBuiltInReflect() throws JavetException {
        V8Value v8ValueExecute = this.v8Runtime.getExecutor(V8ValueBuiltInReflect.NAME).execute();
        if (v8ValueExecute instanceof V8ValueObject) {
            return new V8ValueBuiltInReflect(this.v8Runtime, ((V8ValueObject) v8ValueExecute).getHandle());
        }
        JavetResourceUtils.safeClose(v8ValueExecute);
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, V8ValueBuiltInReflect.NAME));
    }

    public V8ValueBuiltInSymbol getBuiltInSymbol() throws JavetException {
        V8Value v8ValueExecute = this.v8Runtime.getExecutor(V8ValueBuiltInSymbol.NAME).execute();
        if (v8ValueExecute instanceof V8ValueObject) {
            return new V8ValueBuiltInSymbol(this.v8Runtime, ((V8ValueObject) v8ValueExecute).getHandle());
        }
        JavetResourceUtils.safeClose(v8ValueExecute);
        throw new JavetException(JavetError.NotSupported, (Map<String, Object>) SimpleMap.of(JavetError.PARAMETER_FEATURE, V8ValueBuiltInSymbol.NAME));
    }

    V8ValueGlobalObject(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }
}
