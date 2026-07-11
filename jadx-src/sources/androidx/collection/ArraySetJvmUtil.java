package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class ArraySetJvmUtil {
    static Object[] n(Object[] objArr, int i2) {
        if (objArr.length < i2) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
