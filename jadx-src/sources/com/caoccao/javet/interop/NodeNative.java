package com.caoccao.javet.interop;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class NodeNative extends V8Native implements INodeNative {
    @Override // com.caoccao.javet.interop.V8Native, com.caoccao.javet.interop.IV8Native
    public native boolean await(long j2, int i2);

    @Override // com.caoccao.javet.interop.INodeNative
    public native boolean isStopping(long j2);

    @Override // com.caoccao.javet.interop.INodeNative
    public native void setStopping(long j2, boolean z2);

    NodeNative() {
    }
}
