package a88;

import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {
    public abstract void J2();

    public abstract void O(View view);

    public abstract void n(View view, fuX fux, String str);

    public abstract void nr(View view);

    public abstract void t();

    public static n rl(w6 w6Var, Ml ml) {
        K7m.CN3.n();
        K7m.CN3.nr(w6Var, "AdSessionConfiguration is null");
        K7m.CN3.nr(ml, "AdSessionContext is null");
        return new Pl(w6Var, ml);
    }
}
