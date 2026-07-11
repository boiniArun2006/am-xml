package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueFunction;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class BaseJavetProxySymbolConverter<T> implements IJavetProxySymbolConverter {
    protected static final String METHOD_NAME_TO_V8_VALUE = "toV8Value";
    protected static final String NULL = "null";
    protected static final JavetObjectConverter OBJECT_CONVERTER = new JavetObjectConverter();
    protected T targetObject;
    protected V8Runtime v8Runtime;

    @Override // com.caoccao.javet.interop.proxy.IJavetProxySymbolConverter
    public V8ValueFunction getV8ValueFunction() throws JavetException {
        return this.v8Runtime.createV8ValueFunction(new JavetCallbackContext("toV8Value", JavetCallbackType.DirectCallNoThisAndResult, new j(this)));
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxySymbolConverter
    public V8Value toV8Value(V8Value... v8ValueArr) throws JavetException {
        return OBJECT_CONVERTER.toV8Value(this.v8Runtime, this.targetObject);
    }

    public BaseJavetProxySymbolConverter(V8Runtime v8Runtime, T t3) {
        Objects.requireNonNull(t3);
        this.targetObject = t3;
        Objects.requireNonNull(v8Runtime);
        this.v8Runtime = v8Runtime;
    }
}
