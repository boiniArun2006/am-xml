package com.caoccao.javet.interop.converters;

import com.caoccao.javet.exceptions.JavetConverterException;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BaseJavetConverter implements IJavetConverter {
    protected JavetConverterConfig<?> config = new JavetConverterConfig<>();

    @Override // com.caoccao.javet.interop.converters.IJavetConverter
    public final <T> T toObject(V8Value v8Value) throws JavetException {
        return (T) toObject(v8Value, 0);
    }

    protected abstract <T> T toObject(V8Value v8Value, int i2) throws JavetException;

    @Override // com.caoccao.javet.interop.converters.IJavetConverter
    public final <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj) throws JavetException {
        return (T) toV8Value(v8Runtime, obj, 0);
    }

    protected abstract <T extends V8Value> T toV8Value(V8Runtime v8Runtime, Object obj, int i2) throws JavetException;

    @Override // com.caoccao.javet.interop.converters.IJavetConverter
    public JavetConverterConfig<?> getConfig() {
        return this.config;
    }

    protected void validateDepth(int i2) throws JavetException {
        if (i2 >= this.config.getMaxDepth()) {
            throw JavetConverterException.circularStructure(this.config.getMaxDepth());
        }
    }

    public void setConfig(JavetConverterConfig<?> javetConverterConfig) {
        Objects.requireNonNull(javetConverterConfig);
        this.config = javetConverterConfig;
    }
}
