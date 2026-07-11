package gq;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f67719n;
    private final eZ.w6 rl;

    public int rl() {
        return this.f67719n;
    }

    public eZ.w6 t() {
        return this.rl;
    }

    Pl(int i2, eZ.w6 w6Var) {
        this.f67719n = i2;
        this.rl = w6Var;
    }

    public static Pl n(int i2, Map map) {
        eZ.w6 w6VarN = pUk.Dsr.n();
        for (Map.Entry entry : map.entrySet()) {
            w6VarN = w6VarN.Uo((pUk.C) entry.getKey(), ((iF) entry.getValue()).n());
        }
        return new Pl(i2, w6VarN);
    }
}
