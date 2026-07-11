package Vy;

import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public abstract void nr();

    public abstract void rl();

    public abstract void t(View view);

    public static n n(w6 w6Var, Ml ml) {
        upM.CN3.n();
        upM.CN3.nr(w6Var, "AdSessionConfiguration is null");
        upM.CN3.nr(ml, "AdSessionContext is null");
        return new Pl(w6Var, ml);
    }
}
