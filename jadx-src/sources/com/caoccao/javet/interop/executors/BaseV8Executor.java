package com.caoccao.javet.interop.executors;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8ScriptOrigin;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class BaseV8Executor implements IV8Executor {
    protected V8Runtime v8Runtime;
    protected V8ScriptOrigin v8ScriptOrigin;

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public V8ScriptOrigin getV8ScriptOrigin() {
        return this.v8ScriptOrigin;
    }

    public BaseV8Executor(V8Runtime v8Runtime) {
        Objects.requireNonNull(v8Runtime);
        this.v8Runtime = v8Runtime;
        this.v8ScriptOrigin = new V8ScriptOrigin();
    }
}
