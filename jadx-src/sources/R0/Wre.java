package R0;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8640n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f8641t;

        public j n(j jVar) {
            return new j(this.f8640n - jVar.nr(), this.rl - jVar.t(), this.f8641t - jVar.rl());
        }

        public int nr() {
            return this.f8640n;
        }

        public int rl() {
            return this.f8641t;
        }

        public int t() {
            return this.rl;
        }

        public j(int i2, int i3, int i5) {
            this.f8640n = i2;
            this.rl = i3;
            this.f8641t = i5;
        }
    }

    public static j n(SparseIntArray[] sparseIntArrayArr) {
        int i2;
        int i3;
        SparseIntArray sparseIntArray;
        int i5 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i2 = 0;
            i3 = 0;
        } else {
            int i7 = 0;
            i2 = 0;
            i3 = 0;
            while (i5 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i5);
                int iValueAt = sparseIntArray.valueAt(i5);
                i7 += iValueAt;
                if (iKeyAt > 700) {
                    i3 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i2 += iValueAt;
                }
                i5++;
            }
            i5 = i7;
        }
        return new j(i5, i2, i3);
    }
}
