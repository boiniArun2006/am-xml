package com.caoccao.javet.values.virtual;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.V8ValueArray;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.lang.Exception;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class V8VirtualIterator<T, E extends Exception> implements IJavetDirectProxyHandler<E> {
    protected static final String FUNCTION_NEXT = "next";
    protected static final String PROPERTY_DONE = "done";
    protected static final String PROPERTY_VALUE = "value";
    protected Iterator<T> iterator;
    protected V8Runtime v8Runtime;
    protected T value;

    public static /* synthetic */ V8Value xMQ(V8Value v8Value, V8Value[] v8ValueArr) {
        return v8Value;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    protected V8Value next(V8Value v8Value, V8Value... v8ValueArr) {
        Iterator<T> it = this.iterator;
        if (it != null) {
            if (it.hasNext()) {
                this.value = this.iterator.next();
                return v8Value;
            }
            this.iterator = null;
            this.value = null;
        }
        return v8Value;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
    public V8Value proxyGet(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws Exception {
        if (v8Value2 instanceof V8ValueString) {
            String value = ((V8ValueString) v8Value2).getValue();
            if (FUNCTION_NEXT.equals(value)) {
                return this.v8Runtime.createV8ValueFunction(new JavetCallbackContext(FUNCTION_NEXT, this, JavetCallbackType.DirectCallThisAndResult, new j(this)));
            }
            if (PROPERTY_DONE.equals(value)) {
                return this.v8Runtime.createV8ValueBoolean(this.iterator == null);
            }
            if ("value".equals(value)) {
                return this.iterator == null ? this.v8Runtime.createV8ValueUndefined() : this.v8Runtime.toV8Value(this.value);
            }
        }
        return ((v8Value2 instanceof V8ValueSymbol) && V8ValueBuiltInSymbol.SYMBOL_PROPERTY_ITERATOR.equals(((V8ValueSymbol) v8Value2).getDescription())) ? this.v8Runtime.createV8ValueFunction(new JavetCallbackContext(FUNCTION_NEXT, this, JavetCallbackType.DirectCallThisAndResult, new n())) : super.proxyGet(v8Value, v8Value2, v8Value3);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
    public V8ValueArray proxyOwnKeys(V8Value v8Value) throws Exception {
        V8Runtime v8Runtime = this.v8Runtime;
        return V8ValueUtils.createV8ValueArray(v8Runtime, v8Runtime.createV8ValueString(PROPERTY_DONE), this.v8Runtime.createV8ValueString("value"));
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
    public void setV8Runtime(V8Runtime v8Runtime) {
        this.v8Runtime = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler
    public V8Value symbolToPrimitive(V8Value... v8ValueArr) throws Exception {
        return this.v8Runtime.createV8ValueString((String) Optional.ofNullable(this.iterator).map(new Function() { // from class: com.caoccao.javet.values.virtual.w6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Iterator) obj).toString();
            }
        }).orElse(V8ValueNull.NULL));
    }

    public V8VirtualIterator(Iterator<T> it) {
        Objects.requireNonNull(it);
        this.iterator = it;
        this.value = null;
        this.v8Runtime = null;
    }
}
