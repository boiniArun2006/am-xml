package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import com.caoccao.javet.interop.callback.JavetCallbackType;
import com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetDirectProxyFunctionHandler<T extends IJavetDirectProxyHandler<E>, E extends Exception> extends JavetDirectProxyObjectHandler<T, E> {
    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Value apply(V8Value v8Value, V8Value v8Value2, V8ValueArray v8ValueArray) throws Exception {
        V8Value v8ValueProxyApply = this.targetObject.proxyApply(v8Value, v8Value2, v8ValueArray);
        return v8ValueProxyApply != null ? v8ValueProxyApply : super.apply(v8Value, v8Value2, v8ValueArray);
    }

    @Override // com.caoccao.javet.interop.proxy.JavetDirectProxyObjectHandler, com.caoccao.javet.interop.callback.IJavetDirectCallable
    public JavetCallbackContext[] getCallbackContexts() {
        JavetCallbackType javetCallbackType = JavetCallbackType.DirectCallNoThisAndResult;
        return new JavetCallbackContext[]{new JavetCallbackContext("apply", this, javetCallbackType, new l3D(this)), new JavetCallbackContext("deleteProperty", this, javetCallbackType, new C1827c(this)), new JavetCallbackContext("get", this, javetCallbackType, new s4(this)), new JavetCallbackContext("getOwnPropertyDescriptor", this, javetCallbackType, new UGc(this)), new JavetCallbackContext("getPrototypeOf", this, javetCallbackType, new Q(this)), new JavetCallbackContext("has", this, javetCallbackType, new r(this)), new JavetCallbackContext("ownKeys", this, javetCallbackType, new SPz(this)), new JavetCallbackContext("set", this, javetCallbackType, new ci(this))};
    }

    public JavetDirectProxyFunctionHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
    }

    public static /* synthetic */ V8Value HI(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.getOwnPropertyDescriptor(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value KN(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.ownKeys(v8ValueArr[0]);
    }

    public static /* synthetic */ V8Value az(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.deleteProperty(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value gh(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.has(v8ValueArr[0], v8ValueArr[1]);
    }

    public static /* synthetic */ V8Value mUb(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.apply(v8ValueArr[0], v8ValueArr[1], (V8ValueArray) v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value qie(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.get(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2]);
    }

    public static /* synthetic */ V8Value ty(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.set(v8ValueArr[0], v8ValueArr[1], v8ValueArr[2], v8ValueArr[3]);
    }

    public static /* synthetic */ V8Value xMQ(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler, V8Value[] v8ValueArr) {
        javetDirectProxyFunctionHandler.getClass();
        return javetDirectProxyFunctionHandler.getPrototypeOf(v8ValueArr[0]);
    }
}
