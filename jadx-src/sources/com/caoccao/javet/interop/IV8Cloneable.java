package com.caoccao.javet.interop;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Cloneable {
    default <T extends V8Value> T toClone() throws JavetException {
        return (T) toClone(true);
    }

    <T extends V8Value> T toClone(boolean z2) throws JavetException;
}
