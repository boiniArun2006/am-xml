package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.annotations.V8Function;
import com.caoccao.javet.utils.StringUtils;
import com.caoccao.javet.values.reference.V8ValueObject;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetReflectionProxyV8ValueObjectInvocationHandler extends BaseJavetReflectionProxyInvocationHandler<V8ValueObject> {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        if (name.equals(MRAIDPresenter.CLOSE) && objArr.length == 0) {
            close();
            return null;
        }
        Reference reference = this.v8ValueReference;
        if (reference == 0 || ((V8ValueObject) reference).isClosed()) {
            return null;
        }
        if (method.isAnnotationPresent(V8Function.class)) {
            String strName = ((V8Function) method.getAnnotation(V8Function.class)).name();
            if (!StringUtils.isEmpty(strName)) {
                name = strName;
            }
        }
        return ((V8ValueObject) this.v8ValueReference).invokeObject(name, objArr);
    }

    public JavetReflectionProxyV8ValueObjectInvocationHandler(V8ValueObject v8ValueObject) {
        super(v8ValueObject);
    }
}
