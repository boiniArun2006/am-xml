package com.caoccao.javet.interop;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class V8ScriptOrigin {
    private boolean module;
    private int resourceColumnOffset;
    private int resourceLineOffset;
    private String resourceName;
    private int scriptId;
    private boolean wasm;

    public V8ScriptOrigin(String str, int i2, int i3, int i5, boolean z2, boolean z3) {
        this.resourceName = str;
        this.resourceLineOffset = i2;
        this.resourceColumnOffset = i3;
        this.scriptId = i5;
        this.wasm = z2;
        this.module = z3;
    }

    public int getResourceColumnOffset() {
        return this.resourceColumnOffset;
    }

    public int getResourceLineOffset() {
        return this.resourceLineOffset;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public int getScriptId() {
        return this.scriptId;
    }

    public boolean isModule() {
        return this.module;
    }

    public boolean isWasm() {
        return this.wasm;
    }

    public V8ScriptOrigin setModule(boolean z2) {
        this.module = z2;
        return this;
    }

    public V8ScriptOrigin setResourceColumnOffset(int i2) {
        this.resourceColumnOffset = i2;
        return this;
    }

    public V8ScriptOrigin setResourceLineOffset(int i2) {
        this.resourceLineOffset = i2;
        return this;
    }

    public V8ScriptOrigin setResourceName(String str) {
        this.resourceName = str;
        return this;
    }

    public V8ScriptOrigin setScriptId(int i2) {
        this.scriptId = i2;
        return this;
    }

    public V8ScriptOrigin setWasm(boolean z2) {
        this.wasm = z2;
        return this;
    }

    public V8ScriptOrigin() {
        this(null);
    }

    public V8ScriptOrigin(String str) {
        this(str, 0, 0);
    }

    public V8ScriptOrigin(String str, int i2, int i3) {
        this(str, i2, i3, -1, false, false);
    }

    public V8ScriptOrigin(String str, int i2) {
        this(str, 0, 0, i2, false, false);
    }
}
