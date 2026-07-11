package com.caoccao.javet.interop.converters;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface IJavetConverter {
    JavetConverterConfig<?> getConfig();

    <T> T toObject(V8Value v8Value) throws JavetException;

    default <T> T toObject(V8Value v8Value, boolean z2) throws JavetException {
        if (!z2) {
            return (T) toObject(v8Value);
        }
        try {
            return (T) toObject(v8Value);
        } finally {
            JavetResourceUtils.safeClose(v8Value);
        }
    }

    <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj) throws JavetException;
}
