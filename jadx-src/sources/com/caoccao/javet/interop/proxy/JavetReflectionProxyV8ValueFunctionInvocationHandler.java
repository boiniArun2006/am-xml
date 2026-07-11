package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.values.reference.V8ValueFunction;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetReflectionProxyV8ValueFunctionInvocationHandler extends BaseJavetReflectionProxyInvocationHandler<V8ValueFunction> {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (method.getName().equals(MRAIDPresenter.CLOSE) && objArr.length == 0) {
            close();
            return null;
        }
        Reference reference = this.v8ValueReference;
        if (reference == 0 || ((V8ValueFunction) reference).isClosed()) {
            return null;
        }
        return ((V8ValueFunction) this.v8ValueReference).callObject(null, objArr);
    }

    public JavetReflectionProxyV8ValueFunctionInvocationHandler(V8ValueFunction v8ValueFunction) {
        super(v8ValueFunction);
    }
}
