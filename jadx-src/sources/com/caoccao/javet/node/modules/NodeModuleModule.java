package com.caoccao.javet.node.modules;

import com.caoccao.javet.annotations.NodeModule;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@NodeModule(name = "module")
public class NodeModuleModule extends BaseNodeModule {
    public static final String FUNCTION_CREATE_REQUIRE = "createRequire";
    public static final String PROPERTY_REQUIRE = "require";

    public void setRequireRootDirectory(String str) throws JavetException {
        V8ValueObject v8ValueObject = this.moduleObject;
        V8Runtime v8Runtime = v8ValueObject.getV8Runtime();
        Objects.requireNonNull(str);
        V8ValueObject v8ValueObject2 = (V8ValueObject) v8ValueObject.invoke(FUNCTION_CREATE_REQUIRE, v8Runtime.createV8ValueString(str));
        try {
            this.moduleObject.getV8Runtime().getGlobalObject().set("require", v8ValueObject2);
            if (v8ValueObject2 != null) {
                v8ValueObject2.close();
            }
        } catch (Throwable th) {
            if (v8ValueObject2 != null) {
                try {
                    v8ValueObject2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public NodeModuleModule(V8ValueObject v8ValueObject, String str) {
        super(v8ValueObject, str);
    }

    public void setRequireRootDirectory(File file) throws JavetException {
        setRequireRootDirectory(file.getAbsolutePath() + File.separator);
    }
}
