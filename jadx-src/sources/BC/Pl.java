package BC;

import com.google.firebase.Timestamp;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Pl implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pl f396n = new Pl();

    @Override // BC.eO
    public s4 n(s4 s4Var, s4 s4Var2) {
        return s4Var2;
    }

    public static Pl t() {
        return f396n;
    }

    private Pl() {
    }

    @Override // BC.eO
    public s4 rl(s4 s4Var, Timestamp timestamp) {
        return pUk.s4.nr(timestamp, s4Var);
    }
}
