package com.caoccao.javet.values.reference.builtin;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8ValueBuiltInJson extends V8ValueObject {
    public static final String FUNCTION_STRINGIFY = "stringify";
    public static final String NAME = "JSON";

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueBuiltInJson toClone() throws JavetException {
        return this;
    }

    public V8ValueBuiltInJson(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
    }

    public String stringify(V8Value v8Value) throws JavetException {
        Objects.requireNonNull(v8Value);
        return invokeString(FUNCTION_STRINGIFY, v8Value);
    }
}
