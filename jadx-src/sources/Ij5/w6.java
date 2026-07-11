package Ij5;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final EGLContext t(EGLContext eGLContext) {
        return eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] nr(Map map) {
        int size = map.size() * 2;
        int[] iArr = new int[size + 1];
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            if (((Number) entry.getKey()).intValue() != 12344) {
                int i5 = i2 * 2;
                iArr[i5] = ((Number) entry.getKey()).intValue();
                iArr[i5 + 1] = ((Number) entry.getValue()).intValue();
                i2 = i3;
            } else {
                throw new IllegalArgumentException("Invalid key: EGL_NONE");
            }
        }
        iArr[size] = 12344;
        return iArr;
    }
}
