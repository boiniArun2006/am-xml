package com.caoccao.javet.values.reference;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8ValueKeyContainer extends IV8ValueObject {
    IV8ValueIterator<? extends V8Value> getKeys() throws JavetException;

    int getSize() throws JavetException;
}
