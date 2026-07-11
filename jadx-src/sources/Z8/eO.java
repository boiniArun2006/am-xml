package Z8;

import Z8.Wre;
import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class eO {

    public static abstract class j {
        public abstract eO n();

        public abstract j rl(l3D l3d);

        public abstract j t(n nVar);
    }

    public enum n {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f12344n;

        static {
            n nVar = NOT_SET;
            n nVar2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            J2 = sparseArray;
            sparseArray.put(0, nVar);
            sparseArray.put(5, nVar2);
        }

        n(int i2) {
            this.f12344n = i2;
        }
    }

    public abstract l3D rl();

    public abstract n t();

    public static j n() {
        return new Wre.n();
    }
}
