package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class V8ValueNumber<Primitive> extends V8ValuePrimitive<Primitive> {
    public V8ValueNumber(V8Runtime v8Runtime) throws JavetException {
        super(v8Runtime);
    }

    public V8ValueNumber(V8Runtime v8Runtime, Primitive primitive) throws JavetException {
        super(v8Runtime, primitive);
    }
}
