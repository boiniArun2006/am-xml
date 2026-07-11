package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.binding.IClassProxyPluginFunction;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class w6 implements IClassProxyPluginFunction {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BaseJavetProxyPlugin f52019n;

    public /* synthetic */ w6(BaseJavetProxyPlugin baseJavetProxyPlugin) {
        this.f52019n = baseJavetProxyPlugin;
    }

    @Override // com.caoccao.javet.interop.binding.IClassProxyPluginFunction
    public final V8Value invoke(V8Runtime v8Runtime, Object obj) {
        return this.f52019n.symbolToPrimitive(v8Runtime, obj);
    }
}
