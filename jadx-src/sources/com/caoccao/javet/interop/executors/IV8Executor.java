package com.caoccao.javet.interop.executors;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.IV8Executable;
import com.caoccao.javet.interop.NodeRuntime;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.V8ScriptOrigin;
import com.caoccao.javet.node.modules.NodeModuleModule;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8Module;
import com.caoccao.javet.values.reference.V8Script;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface IV8Executor extends IV8Executable {
    default V8Module compileV8Module() throws JavetException {
        return compileV8Module(true);
    }

    V8Module compileV8Module(boolean z2) throws JavetException;

    default void compileV8ModuleVoid() throws JavetException {
        compileV8Module(false);
    }

    default V8Script compileV8Script() throws JavetException {
        return compileV8Script(true);
    }

    V8Script compileV8Script(boolean z2) throws JavetException;

    default void compileV8ScriptVoid() throws JavetException {
        compileV8Script(false);
    }

    default V8ValueFunction compileV8ValueFunction() throws JavetException {
        return compileV8ValueFunction(null, null);
    }

    V8ValueFunction compileV8ValueFunction(String[] strArr, V8ValueObject[] v8ValueObjectArr) throws JavetException;

    byte[] getCachedData();

    String getScriptString() throws JavetException;

    V8Runtime getV8Runtime();

    V8ScriptOrigin getV8ScriptOrigin();

    default V8ValueFunction compileV8ValueFunction(String[] strArr) throws JavetException {
        return compileV8ValueFunction(strArr, null);
    }

    default String getResourceName() {
        return getV8ScriptOrigin().getResourceName();
    }

    default boolean isModule() {
        return getV8ScriptOrigin().isModule();
    }

    default IV8Executor setModule(boolean z2) {
        getV8ScriptOrigin().setModule(z2);
        return this;
    }

    default IV8Executor setResourceName(String str) throws JavetException {
        getV8ScriptOrigin().setResourceName(str);
        V8Runtime v8Runtime = getV8Runtime();
        if (v8Runtime.getJSRuntimeType().isNode()) {
            try {
                NodeRuntime nodeRuntime = (NodeRuntime) v8Runtime;
                File file = new File(str);
                File parentFile = file.getParentFile();
                nodeRuntime.getGlobalObject().set(NodeRuntime.PROPERTY_DIRNAME, parentFile.getAbsolutePath());
                nodeRuntime.getGlobalObject().set(NodeRuntime.PROPERTY_FILENAME, file.getAbsolutePath());
                ((NodeModuleModule) nodeRuntime.getNodeModule(NodeModuleModule.class)).setRequireRootDirectory(parentFile.getAbsoluteFile());
                ((NodeModuleProcess) nodeRuntime.getNodeModule(NodeModuleProcess.class)).setWorkingDirectory(parentFile.getAbsolutePath());
                return this;
            } catch (Throwable th) {
                v8Runtime.getLogger().logError(th, "Failed to set resource name for Node.js runtime.", new Object[0]);
            }
        }
        return this;
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    default <T, V extends V8Value> T toObject(V v2) throws JavetException {
        return (T) getV8Runtime().toObject(v2);
    }

    @Override // com.caoccao.javet.interop.IV8Convertible
    default <T, V extends V8Value> V toV8Value(T t3) throws JavetException {
        return (V) getV8Runtime().toV8Value(t3);
    }
}
