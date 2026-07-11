package com.caoccao.javet.entities;

import com.caoccao.javet.interfaces.IJavetEntityObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetEntityObject<T> implements IJavetEntityObject<T> {
    protected T value;

    @Override // com.caoccao.javet.interfaces.IJavetEntityObject
    public T getValue() {
        return this.value;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityObject
    public void setValue(T t3) {
        this.value = t3;
    }

    public JavetEntityObject(T t3) {
        this.value = t3;
    }
}
