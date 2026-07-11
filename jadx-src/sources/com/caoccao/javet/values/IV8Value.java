package com.caoccao.javet.values;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.IV8Cloneable;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValueUndefined;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Value extends IJavetClosable, IV8Cloneable {
    default boolean asBoolean() throws JavetException {
        return true;
    }

    default int asInt() throws JavetException {
        return 0;
    }

    boolean equals(V8Value v8Value) throws JavetException;

    V8Runtime getV8Runtime();

    boolean sameValue(V8Value v8Value) throws JavetException;

    boolean strictEquals(V8Value v8Value) throws JavetException;

    default boolean isNull() {
        return this instanceof V8ValueNull;
    }

    default boolean isUndefined() {
        return this instanceof V8ValueUndefined;
    }

    default double asDouble() throws JavetException {
        return asInt();
    }

    default long asLong() throws JavetException {
        return asInt();
    }

    default String asString() throws JavetException {
        return toString();
    }

    default boolean isNullOrUndefined() {
        if (!isNull() && !isUndefined()) {
            return false;
        }
        return true;
    }
}
