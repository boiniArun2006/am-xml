package com.caoccao.javet.interfaces;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.interop.proxy.IJavetNonProxy;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface IJavetEntityError extends IJavetNonProxy {
    Map<String, Object> getContext();

    String getDetailedMessage();

    String getMessage();

    String getStack();

    V8ValueErrorType getType();

    void setDetailedMessage(String str);

    void setMessage(String str);

    void setStack(String str);

    void setType(V8ValueErrorType v8ValueErrorType);
}
