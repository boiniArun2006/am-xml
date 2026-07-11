package com.caoccao.javet.interop.binding;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IClassProxyPluginFunction<E extends Exception> {
    V8Value invoke(V8Runtime v8Runtime, Object obj) throws Exception;
}
