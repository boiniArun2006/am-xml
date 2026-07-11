package z;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f76342n = false;
    private static final long rl = System.nanoTime();

    public static final void t(rv6 rv6Var, int i2, Pmq spec) {
        Intrinsics.checkNotNullParameter(rv6Var, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        rv6Var.nY(i2, spec.O(), spec.rl(), Ew.Uo(spec));
    }
}
