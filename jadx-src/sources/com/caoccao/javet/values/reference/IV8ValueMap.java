package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface IV8ValueMap extends IV8ValueKeyContainer {
    public static final String FUNCTION_ENTRIES = "entries";
    public static final String FUNCTION_KEYS = "keys";
    public static final String FUNCTION_VALUES = "values";

    IV8ValueArray asArray() throws JavetException;

    void clear() throws JavetException;

    default IV8ValueIterator<V8ValueArray> getEntries() throws JavetException {
        return (IV8ValueIterator) invoke(FUNCTION_ENTRIES, new V8Value[0]);
    }

    @Override // com.caoccao.javet.values.reference.IV8ValueKeyContainer
    default IV8ValueIterator<? extends V8Value> getKeys() throws JavetException {
        return (IV8ValueIterator) invoke(FUNCTION_KEYS, new V8Value[0]);
    }

    default IV8ValueIterator<? extends V8Value> getValues() throws JavetException {
        return (IV8ValueIterator) invoke(FUNCTION_VALUES, new V8Value[0]);
    }
}
