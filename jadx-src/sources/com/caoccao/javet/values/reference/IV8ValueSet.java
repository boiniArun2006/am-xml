package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8ValueSet extends IV8ValueKeyContainer {
    void add(Object obj) throws JavetException;

    IV8ValueArray asArray() throws JavetException;

    void clear() throws JavetException;

    IV8ValueIterator<V8ValueArray> getEntries() throws JavetException;

    default void addNull() throws JavetException {
        add(getV8Runtime().createV8ValueNull());
    }

    default void addUndefined() throws JavetException {
        add(getV8Runtime().createV8ValueUndefined());
    }
}
