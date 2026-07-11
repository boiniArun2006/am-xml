package com.caoccao.javet.interop.callback;

import com.caoccao.javet.enums.V8GCCallbackFlags;
import com.caoccao.javet.enums.V8GCType;
import java.util.EnumSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface IJavetGCCallback {
    void callback(EnumSet<V8GCType> enumSet, EnumSet<V8GCCallbackFlags> enumSet2);
}
