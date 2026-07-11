package com.caoccao.javet.entities;

import com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class JavetEntityPropertyDescriptor<T> implements IJavetEntityPropertyDescriptor<T> {
    protected boolean configurable;
    protected boolean enumerable;
    protected T value;
    protected boolean writable;

    public JavetEntityPropertyDescriptor(boolean z2, boolean z3, boolean z4) {
        this(z2, z3, z4, null);
    }

    public JavetEntityPropertyDescriptor(boolean z2, boolean z3, boolean z4, T t3) {
        this.configurable = z2;
        this.enumerable = z3;
        this.value = t3;
        this.writable = z4;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public T getValue() {
        return this.value;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public boolean isConfigurable() {
        return this.configurable;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public boolean isEnumerable() {
        return this.enumerable;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public boolean isWritable() {
        return this.writable;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public void setConfigurable(boolean z2) {
        this.configurable = z2;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public void setEnumerable(boolean z2) {
        this.enumerable = z2;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public void setValue(T t3) {
        this.value = t3;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityPropertyDescriptor
    public void setWritable(boolean z2) {
        this.writable = z2;
    }
}
