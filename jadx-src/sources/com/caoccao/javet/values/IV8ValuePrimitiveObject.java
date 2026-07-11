package com.caoccao.javet.values;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface IV8ValuePrimitiveObject<T extends V8Value> extends IV8Value {
    T valueOf() throws JavetException;

    @Override // com.caoccao.javet.values.IV8Value
    default boolean asBoolean() throws JavetException {
        return valueOf().asBoolean();
    }

    @Override // com.caoccao.javet.values.IV8Value
    default double asDouble() throws JavetException {
        return valueOf().asDouble();
    }

    @Override // com.caoccao.javet.values.IV8Value
    default int asInt() throws JavetException {
        return valueOf().asInt();
    }

    @Override // com.caoccao.javet.values.IV8Value
    default long asLong() throws JavetException {
        return valueOf().asLong();
    }

    @Override // com.caoccao.javet.values.IV8Value
    default String asString() throws JavetException {
        return valueOf().asString();
    }
}
