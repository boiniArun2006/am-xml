package com.caoccao.javet.interfaces;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.reference.IV8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IJavetInterceptor {
    boolean register(IV8ValueObject... iV8ValueObjectArr) throws JavetException;

    boolean unregister(IV8ValueObject... iV8ValueObjectArr) throws JavetException;
}
