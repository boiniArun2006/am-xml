package com.caoccao.javet.utils.receivers;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface IJavetCallbackReceiver {
    default Method getMethod(String str) throws NoSuchMethodException {
        return getMethod(str, false, 0);
    }

    default Method getMethodVarargs(String str) throws NoSuchMethodException {
        return getMethod(str, false, -1);
    }

    V8Runtime getV8Runtime();

    default Method getMethod(String str, int i2) throws NoSuchMethodException {
        return getMethod(str, false, i2);
    }

    default Method getMethodVarargs(String str, boolean z2) throws NoSuchMethodException {
        return getMethod(str, z2, -1);
    }

    default Method getMethod(String str, boolean z2) throws NoSuchMethodException {
        return getMethod(str, z2, 0);
    }

    default Method getMethod(String str, boolean z2, int i2) throws NoSuchMethodException {
        if (i2 < 0) {
            if (z2) {
                return getClass().getMethod(str, V8Value.class, V8Value[].class);
            }
            return getClass().getMethod(str, V8Value[].class);
        }
        if (i2 == 0) {
            if (z2) {
                return getClass().getMethod(str, V8Value.class);
            }
            return getClass().getMethod(str, new Class[0]);
        }
        if (z2) {
            i2++;
        }
        Class<?>[] clsArr = new Class[i2];
        Arrays.fill(clsArr, V8Value.class);
        return getClass().getMethod(str, clsArr);
    }

    default Method getMethod(String str, Class<?>... clsArr) throws NoSuchMethodException {
        return getClass().getMethod(str, clsArr);
    }
}
