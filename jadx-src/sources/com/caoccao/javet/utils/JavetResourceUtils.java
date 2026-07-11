package com.caoccao.javet.utils;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValueReference;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class JavetResourceUtils {
    public static void safeClose(Object... objArr) {
        for (Object obj : objArr) {
            safeClose(obj);
        }
    }

    public static boolean isClosed(Object obj) {
        if (obj instanceof IJavetClosable) {
            return ((IJavetClosable) obj).isClosed();
        }
        return true;
    }

    public static V8Value[] toClone(V8Value[] v8ValueArr) throws JavetException {
        if (v8ValueArr == null) {
            return null;
        }
        V8Value[] v8ValueArr2 = new V8Value[v8ValueArr.length];
        for (int i2 = 0; i2 < v8ValueArr.length; i2++) {
            v8ValueArr2[i2] = v8ValueArr[i2].toClone();
        }
        return v8ValueArr2;
    }

    private JavetResourceUtils() {
    }

    public static void safeClose(V8Value... v8ValueArr) {
        for (V8Value v8Value : v8ValueArr) {
            safeClose(v8Value);
        }
    }

    public static void safeClose(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof IV8ValueReference) {
                IV8ValueReference iV8ValueReference = (IV8ValueReference) obj;
                if (iV8ValueReference.isClosed()) {
                    return;
                }
                iV8ValueReference.close();
                return;
            }
            if (obj instanceof IJavetClosable) {
                ((IJavetClosable) obj).close();
                return;
            }
            int i2 = 0;
            if (obj instanceof V8Value[]) {
                V8Value[] v8ValueArr = (V8Value[]) obj;
                int length = v8ValueArr.length;
                while (i2 < length) {
                    safeClose(v8ValueArr[i2]);
                    i2++;
                }
                return;
            }
            if (obj.getClass().isArray()) {
                Object[] objArr = (Object[]) obj;
                int length2 = objArr.length;
                while (i2 < length2) {
                    safeClose(objArr[i2]);
                    i2++;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    safeClose(it.next());
                }
            }
        } catch (JavetException unused) {
        }
    }
}
