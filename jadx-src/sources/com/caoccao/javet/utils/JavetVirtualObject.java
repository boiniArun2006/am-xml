package com.caoccao.javet.utils;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetVirtualObject {
    protected boolean converted = false;
    protected Object object = null;
    protected V8Value v8Value;

    public Object getObject() throws JavetException {
        if (!this.converted) {
            this.object = this.v8Value.getV8Runtime().toObject(this.v8Value);
            this.converted = true;
        }
        return this.object;
    }

    public V8Value getV8Value() {
        return this.v8Value;
    }

    public boolean isConverted() {
        return this.converted;
    }

    public JavetVirtualObject(V8Value v8Value) {
        this.v8Value = v8Value;
    }
}
