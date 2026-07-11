package com.caoccao.javet.node.modules;

import com.caoccao.javet.annotations.NodeModule;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@NodeModule(name = "process")
public class NodeModuleProcess extends BaseNodeModule {
    public static final String FUNCTION_CHDIR = "chdir";
    public static final String FUNCTION_CWD = "cwd";
    public static final String FUNCTION_ON = "on";
    public static final String PROPERTY_VERSION = "version";

    public void setWorkingDirectory(File file) throws JavetException {
        Objects.requireNonNull(file);
        setWorkingDirectory(file.getAbsolutePath());
    }

    public String getVersion() throws JavetException {
        V8ValueObject v8ValueObject = this.moduleObject;
        return v8ValueObject.getString(v8ValueObject.getV8Runtime().createV8ValueString(PROPERTY_VERSION));
    }

    public File getWorkingDirectory() throws JavetException {
        return new File(this.moduleObject.invokeString(FUNCTION_CWD, new Object[0]));
    }

    public void on(String str, V8ValueFunction v8ValueFunction) throws JavetException {
        V8ValueObject v8ValueObject = this.moduleObject;
        v8ValueObject.invokeVoid(FUNCTION_ON, v8ValueObject.getV8Runtime().createV8ValueString(str), v8ValueFunction);
    }

    public void setWorkingDirectory(String str) throws JavetException {
        V8ValueObject v8ValueObject = this.moduleObject;
        V8Runtime v8Runtime = v8ValueObject.getV8Runtime();
        Objects.requireNonNull(str);
        v8ValueObject.invokeVoid(FUNCTION_CHDIR, v8Runtime.createV8ValueString(str));
    }

    public NodeModuleProcess(V8ValueObject v8ValueObject, String str) {
        super(v8ValueObject, str);
    }
}
