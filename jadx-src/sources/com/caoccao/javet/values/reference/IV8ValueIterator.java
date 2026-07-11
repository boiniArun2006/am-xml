package com.caoccao.javet.values.reference;

import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IV8ValueIterator<T extends V8Value> extends IJavetClosable {
    T getNext();
}
