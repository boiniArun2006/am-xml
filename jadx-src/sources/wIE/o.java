package wIE;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f74884n = new String[0];
    public static final Charset rl = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    private static List rl(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    Object obj2 = objArr2[i2];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i2++;
                }
            }
        }
        return arrayList;
    }

    public static List n(Object[] objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static Object[] t(Class cls, Object[] objArr, Object[] objArr2) {
        List listRl = rl(objArr, objArr2);
        return listRl.toArray((Object[]) Array.newInstance((Class<?>) cls, listRl.size()));
    }
}
