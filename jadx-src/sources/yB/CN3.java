package yB;

import dzu.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nKK f75562n = new nKK("NO_OWNER");
    private static final nKK rl = new nKK("ALREADY_LOCKED_BY_OWNER");

    public static final j n(boolean z2) {
        return new Wre(z2);
    }

    public static /* synthetic */ j rl(boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return n(z2);
    }
}
