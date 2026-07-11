package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class KeyCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    HashMap f35267n = new HashMap();

    public float n(Object obj, String str, int i2) {
        HashMap map;
        float[] fArr;
        if (this.f35267n.containsKey(obj) && (map = (HashMap) this.f35267n.get(obj)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > i2) {
            return fArr[i2];
        }
        return Float.NaN;
    }

    public void rl(Object obj, String str, int i2, float f3) {
        if (!this.f35267n.containsKey(obj)) {
            HashMap map = new HashMap();
            float[] fArr = new float[i2 + 1];
            fArr[i2] = f3;
            map.put(str, fArr);
            this.f35267n.put(obj, map);
            return;
        }
        HashMap map2 = (HashMap) this.f35267n.get(obj);
        if (map2 == null) {
            map2 = new HashMap();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i2 + 1];
            fArr2[i2] = f3;
            map2.put(str, fArr2);
            this.f35267n.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = (float[]) map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i2) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i2 + 1);
        }
        fArrCopyOf[i2] = f3;
        map2.put(str, fArrCopyOf);
    }
}
