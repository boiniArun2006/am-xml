package Kn;

import android.util.SparseArray;
import bF.I28;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static SparseArray f5791n = new SparseArray();
    private static HashMap rl;

    static {
        HashMap map = new HashMap();
        rl = map;
        map.put(I28.DEFAULT, 0);
        rl.put(I28.VERY_LOW, 1);
        rl.put(I28.HIGHEST, 2);
        for (I28 i28 : rl.keySet()) {
            f5791n.append(((Integer) rl.get(i28)).intValue(), i28);
        }
    }

    public static int n(I28 i28) {
        Integer num = (Integer) rl.get(i28);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + i28);
    }

    public static I28 rl(int i2) {
        I28 i28 = (I28) f5791n.get(i2);
        if (i28 != null) {
            return i28;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
