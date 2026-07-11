package com.caoccao.javet.interop;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface IV8Convertible {
    <T, V extends V8Value> T toObject(V v2) throws JavetException;

    default <T, V extends V8Value> T toObject(V v2, boolean z2) throws JavetException {
        if (!z2) {
            return (T) toObject(v2);
        }
        try {
            return (T) toObject(v2);
        } finally {
            JavetResourceUtils.safeClose(v2);
        }
    }

    <T, V extends V8Value> V toV8Value(T t3) throws JavetException;
}
