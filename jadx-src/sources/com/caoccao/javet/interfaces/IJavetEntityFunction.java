package com.caoccao.javet.interfaces;

import com.caoccao.javet.enums.JSFunctionType;
import com.caoccao.javet.interop.proxy.IJavetNonProxy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface IJavetEntityFunction extends IJavetNonProxy {
    JSFunctionType getJSFunctionType();

    String getSourceCode();

    void setJSFunctionType(JSFunctionType jSFunctionType);

    void setSourceCode(String str);
}
