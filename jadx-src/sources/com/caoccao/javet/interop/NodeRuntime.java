package com.caoccao.javet.interop;

import com.caoccao.javet.annotations.NodeModule;
import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.options.RuntimeOptions;
import com.caoccao.javet.node.modules.INodeModule;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.caoccao.javet.utils.JavetResourceUtils;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class NodeRuntime extends V8Runtime {
    public static final String FUNCTION_REQUIRE = "require";
    public static final String PROPERTY_DIRNAME = "__dirname";
    public static final String PROPERTY_FILENAME = "__filename";
    Map<String, INodeModule> nodeModuleMap;

    public <Module extends INodeModule> Module getNodeModule(Class<Module> cls) throws JavetException {
        if (cls.isAnnotationPresent(NodeModule.class)) {
            return (Module) getNodeModule(((NodeModule) cls.getAnnotation(NodeModule.class)).name(), cls);
        }
        return null;
    }

    @Override // com.caoccao.javet.interop.V8Runtime
    public byte[] createSnapshot() throws JavetException {
        throw new JavetException(JavetError.RuntimeCreateSnapshotDisabled);
    }

    public int getNodeModuleCount() {
        return this.nodeModuleMap.size();
    }

    public boolean isStopping() {
        return ((INodeNative) this.v8Native).isStopping(this.handle);
    }

    void removeNodeModules() {
        if (this.nodeModuleMap.isEmpty()) {
            return;
        }
        JavetResourceUtils.safeClose(this.nodeModuleMap.values());
        this.nodeModuleMap.clear();
    }

    public void setStopping(boolean z2) {
        ((INodeNative) this.v8Native).setStopping(this.handle, z2);
    }

    NodeRuntime(V8Host v8Host, long j2, boolean z2, IV8Native iV8Native, JSRuntimeType jSRuntimeType, RuntimeOptions<?> runtimeOptions) {
        super(v8Host, j2, z2, iV8Native, jSRuntimeType, runtimeOptions);
        this.nodeModuleMap = new HashMap();
    }

    @Override // com.caoccao.javet.interop.V8Runtime
    void removeAllReferences() throws JavetException {
        removeNodeModules();
        super.removeAllReferences();
    }

    public void removeNodeModule(INodeModule iNodeModule) throws JavetException {
        Objects.requireNonNull(iNodeModule);
        if (this.nodeModuleMap.containsKey(iNodeModule.getName())) {
            this.nodeModuleMap.remove(iNodeModule.getName());
            iNodeModule.close();
        }
    }

    public <Module extends INodeModule> Module getNodeModule(String str, Class<Module> cls) throws JavetException {
        V8ValueObject v8ValueObject;
        Objects.requireNonNull(str);
        if (this.nodeModuleMap.containsKey(str)) {
            return (Module) this.nodeModuleMap.get(str);
        }
        if (cls == NodeModuleProcess.class) {
            v8ValueObject = (V8ValueObject) getGlobalObject().get(str);
        } else {
            v8ValueObject = (V8ValueObject) getGlobalObject().invoke("require", str);
        }
        Module module = null;
        try {
            Module moduleNewInstance = cls.getConstructor(V8ValueObject.class, String.class).newInstance(v8ValueObject, str);
            try {
                this.nodeModuleMap.put(str, moduleNewInstance);
                return moduleNewInstance;
            } catch (Exception e2) {
                e = e2;
                module = moduleNewInstance;
                getLogger().logError(e, "Failed to create node module {0}.", str);
                return module;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
