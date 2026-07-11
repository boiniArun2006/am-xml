package N03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ml {
    private static volatile Ml rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f6933n = new HashSet();

    public static Ml n() {
        Ml ml;
        Ml ml2 = rl;
        if (ml2 != null) {
            return ml2;
        }
        synchronized (Ml.class) {
            try {
                ml = rl;
                if (ml == null) {
                    ml = new Ml();
                    rl = ml;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ml;
    }

    Set rl() {
        Set setUnmodifiableSet;
        synchronized (this.f6933n) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f6933n);
        }
        return setUnmodifiableSet;
    }

    Ml() {
    }
}
