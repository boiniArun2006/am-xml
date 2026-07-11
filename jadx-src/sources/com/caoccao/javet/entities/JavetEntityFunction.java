package com.caoccao.javet.entities;

import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.interfaces.IJavetEntityFunction;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetEntityFunction implements IJavetEntityFunction {
    protected JSFunctionType jsFunctionType;
    protected String sourceCode;

    public JavetEntityFunction() {
        this(null);
    }

    public JavetEntityFunction(String str, JSFunctionType jSFunctionType) {
        setJSFunctionType(jSFunctionType);
        setSourceCode(str);
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityFunction
    public JSFunctionType getJSFunctionType() {
        return this.jsFunctionType;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityFunction
    public String getSourceCode() {
        return this.sourceCode;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityFunction
    public void setSourceCode(String str) {
        this.sourceCode = str;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityFunction
    public void setJSFunctionType(JSFunctionType jSFunctionType) {
        Objects.requireNonNull(jSFunctionType);
        this.jsFunctionType = jSFunctionType;
    }

    public JavetEntityFunction(String str) {
        this(str, JSFunctionType.Unknown);
    }
}
