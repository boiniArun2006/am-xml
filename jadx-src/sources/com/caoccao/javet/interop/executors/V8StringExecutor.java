package com.caoccao.javet.interop.executors;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8Module;
import com.caoccao.javet.values.reference.V8Script;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8StringExecutor extends BaseV8Executor {
    protected byte[] cachedData;
    protected String scriptString;

    public V8StringExecutor(V8Runtime v8Runtime) {
        this(v8Runtime, null);
    }

    public V8StringExecutor(V8Runtime v8Runtime, String str) {
        this(v8Runtime, str, null);
    }

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public V8Module compileV8Module(boolean z2) throws JavetException {
        return this.v8Runtime.compileV8Module(getScriptString(), getCachedData(), this.v8ScriptOrigin, z2);
    }

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public V8Script compileV8Script(boolean z2) throws JavetException {
        return this.v8Runtime.compileV8Script(getScriptString(), getCachedData(), this.v8ScriptOrigin, z2);
    }

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public V8ValueFunction compileV8ValueFunction(String[] strArr, V8ValueObject[] v8ValueObjectArr) throws JavetException {
        return this.v8Runtime.compileV8ValueFunction(getScriptString(), getCachedData(), this.v8ScriptOrigin, strArr, v8ValueObjectArr);
    }

    @Override // com.caoccao.javet.interop.IV8Executable
    public <T extends V8Value> T execute(boolean z2) throws JavetException {
        return (T) this.v8Runtime.execute(getScriptString(), getCachedData(), this.v8ScriptOrigin, z2);
    }

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public byte[] getCachedData() {
        return this.cachedData;
    }

    @Override // com.caoccao.javet.interop.executors.IV8Executor
    public String getScriptString() throws JavetException {
        return this.scriptString;
    }

    public V8StringExecutor(V8Runtime v8Runtime, String str, byte[] bArr) {
        super(v8Runtime);
        this.scriptString = str;
        this.cachedData = bArr;
    }
}
