package lN;

import lN.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Wre implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Wre f70415n;

    @Override // lN.j
    public void n(j.EnumC1048j enumC1048j, Class cls, String str, Throwable th) {
    }

    public static synchronized Wre rl() {
        try {
            if (f70415n == null) {
                f70415n = new Wre();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f70415n;
    }

    private Wre() {
    }
}
