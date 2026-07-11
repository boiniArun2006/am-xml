package com.caoccao.javet.interop.callback;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.NodeRuntime;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.node.modules.NodeModuleAny;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.reference.IV8Module;
import com.caoccao.javet.values.reference.V8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class JavetBuiltInModuleResolver implements IV8ModuleResolver {
    public static final String DEFAULT = "default";
    public static final String PREFIX_NODE = "node:";

    @Override // com.caoccao.javet.interop.callback.IV8ModuleResolver
    public IV8Module resolve(V8Runtime v8Runtime, String str, IV8Module iV8Module) throws JavetException {
        if (v8Runtime.getJSRuntimeType().isNode() && StringUtils.isNotEmpty(str) && str.startsWith(PREFIX_NODE)) {
            V8ValueObject moduleObject = ((NodeModuleAny) ((NodeRuntime) v8Runtime).getNodeModule(str, NodeModuleAny.class)).getModuleObject();
            moduleObject.set("default", moduleObject);
            return v8Runtime.createV8Module(str, moduleObject);
        }
        return null;
    }
}
