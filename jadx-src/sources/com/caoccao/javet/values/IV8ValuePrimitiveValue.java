package com.caoccao.javet.values;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface IV8ValuePrimitiveValue<T extends V8Value> extends IV8Value, IV8ValueNonProxyable {
    T toObject() throws JavetException;
}
