package com.caoccao.javet.interop.callback;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.IV8Module;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IV8ModuleResolver {
    default String getAbsoluteResourceName(V8Runtime v8Runtime, String str, IV8Module iV8Module) throws JavetException {
        return str;
    }

    IV8Module resolve(V8Runtime v8Runtime, String str, IV8Module iV8Module) throws JavetException;
}
