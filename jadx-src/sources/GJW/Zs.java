package GJW;

import dzu.AbstractC1958c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Zs {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f3469n = dzu.DAz.J2("kotlinx.coroutines.main.delay", false);
    private static final iF rl = rl();

    public static final iF n() {
        return rl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final iF rl() {
        if (!f3469n) {
            return Md.f3426S;
        }
        DC dcT = OU.t();
        return (AbstractC1958c.t(dcT) || !(dcT instanceof iF)) ? Md.f3426S : (iF) dcT;
    }
}
