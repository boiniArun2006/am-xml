package com.caoccao.javet.values.primitive;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.IV8ValueNonProxyable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class V8ValueUnknown extends V8ValuePrimitive<String> implements IV8ValueNonProxyable {
    public V8ValueUnknown(V8Runtime v8Runtime) throws JavetException {
        this(v8Runtime, null);
    }

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueUnknown toClone(boolean z2) throws JavetException {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8ValueUnknown(V8Runtime v8Runtime, String str) throws JavetException {
        super(v8Runtime, str);
        Objects.requireNonNull(str);
    }
}
