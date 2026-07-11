package com.caoccao.javet.node.modules;

import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.values.reference.V8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface INodeModule extends IJavetClosable {
    V8ValueObject getModuleObject();

    String getName();
}
