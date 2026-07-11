package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.reference.V8ValueArray;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetDirectProxyObjectHandler<T extends IJavetDirectProxyHandler<E>, E extends Exception> extends BaseJavetDirectProxyHandler<T, E> {
    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean deleteProperty(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8ValueBoolean v8ValueBooleanProxyDeleteProperty = this.targetObject.proxyDeleteProperty(v8Value, v8Value2);
        return v8ValueBooleanProxyDeleteProperty != null ? v8ValueBooleanProxyDeleteProperty : super.deleteProperty(v8Value, v8Value2);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value get(V8Value v8Value, V8Value v8Value2, V8Value v8Value3) throws Exception {
        V8Value v8ValueProxyGet = this.targetObject.proxyGet(v8Value, v8Value2, v8Value3);
        return v8ValueProxyGet != null ? v8ValueProxyGet : super.get(v8Value, v8Value2, v8Value3);
    }

    public JavetCallbackContext[] getCallbackContexts() {
        JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndResult;
        return new JavetCallbackContext[]{new JavetCallbackContext("deleteProperty", this, javetCallbackType, new g9s(this)), new JavetCallbackContext("get", this, javetCallbackType, new afx(this)), new JavetCallbackContext("getOwnPropertyDescriptor", this, javetCallbackType, new Z(this)), new JavetCallbackContext("getPrototypeOf", this, javetCallbackType, new Ew(this)), new JavetCallbackContext("has", this, javetCallbackType, new nKK(this)), new JavetCallbackContext("ownKeys", this, javetCallbackType, new DAz(this)), new JavetCallbackContext("set", this, javetCallbackType, new u(this))};
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value getOwnPropertyDescriptor(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8Value v8ValueProxyGetOwnPropertyDescriptor = this.targetObject.proxyGetOwnPropertyDescriptor(v8Value, v8Value2);
        return v8ValueProxyGetOwnPropertyDescriptor != null ? v8ValueProxyGetOwnPropertyDescriptor : super.getOwnPropertyDescriptor(v8Value, v8Value2);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value getPrototypeOf(V8Value v8Value) throws Exception {
        V8Value v8ValueProxyGetPrototypeOf = this.targetObject.proxyGetPrototypeOf(v8Value);
        return v8ValueProxyGetPrototypeOf != null ? v8ValueProxyGetPrototypeOf : super.getPrototypeOf(v8Value);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean has(V8Value v8Value, V8Value v8Value2) throws Exception {
        V8ValueBoolean v8ValueBooleanProxyHas = this.targetObject.proxyHas(v8Value, v8Value2);
        return v8ValueBooleanProxyHas != null ? v8ValueBooleanProxyHas : super.has(v8Value, v8Value2);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueArray ownKeys(V8Value v8Value) throws Exception {
        V8ValueArray v8ValueArrayProxyOwnKeys = this.targetObject.proxyOwnKeys(v8Value);
        return v8ValueArrayProxyOwnKeys != null ? v8ValueArrayProxyOwnKeys : super.ownKeys(v8Value);
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8ValueBoolean set(V8Value v8Value, V8Value v8Value2, V8Value v8Value3, V8Value v8Value4) throws Exception {
        V8ValueBoolean v8ValueBooleanProxySet = this.targetObject.proxySet(v8Value, v8Value2, v8Value3, v8Value4);
        return v8ValueBooleanProxySet != null ? v8ValueBooleanProxySet : super.set(v8Value, v8Value2, v8Value3, v8Value4);
    }

    public JavetDirectProxyObjectHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
    }

    public static /* synthetic */ V8Value J2(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.get(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value O(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.getPrototypeOf(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value Uo(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.deleteProperty(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value n(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.ownKeys(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value nr(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.has(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value rl(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.getOwnPropertyDescriptor(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value t(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler, V8Value[] v8ValueArr) {
        javetDirectProxyObjectHandler.getClass();
        return javetDirectProxyObjectHandler.set(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2], v8ValueArr[3]);
    }
}
