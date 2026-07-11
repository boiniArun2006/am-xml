package stX;

import stX.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer O(CharSequence charSequence, int i2, int i3) {
        int iN = 0;
        while (i2 < i3) {
            iN = (iN * 10) + fm.Ml.n(charSequence.charAt(i2));
            if (iN < 0) {
                return null;
            }
            i2++;
        }
        return Integer.valueOf(iN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(CharSequence charSequence, int i2, int i3) {
        int iN = 0;
        while (i2 < i3) {
            iN = (iN * 10) + fm.Ml.n(charSequence.charAt(i2));
            i2++;
        }
        return iN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CN3 J2(j jVar, Object obj, Object obj2) {
        Object objT = jVar.t(obj, obj2);
        if (objT == null) {
            return null;
        }
        return new CN3.j(objT);
    }
}
