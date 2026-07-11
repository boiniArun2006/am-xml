package com.caoccao.javet.entities;

import com.caoccao.javet.interfaces.IJavetEntitySymbol;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class JavetEntitySymbol implements IJavetEntitySymbol {
    protected String description;

    @Override // com.caoccao.javet.interfaces.IJavetEntitySymbol
    public String getDescription() {
        return this.description;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntitySymbol
    public void setDescription(String str) {
        this.description = str;
    }

    public JavetEntitySymbol(String str) {
        Objects.requireNonNull(str);
        this.description = str;
    }
}
