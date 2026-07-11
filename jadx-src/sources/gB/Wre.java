package gB;

import MoG.Pl;
import gB.I28;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Wre {
    public static final I28.j n(MoG.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return new I28.j(nVar.rl(), nVar.n(), null);
    }

    public static final I28.n rl(Pl pl) {
        Intrinsics.checkNotNullParameter(pl, "<this>");
        throw null;
    }

    public static final I28 t(MoG.C c2) {
        Intrinsics.checkNotNullParameter(c2, "<this>");
        if (c2 instanceof MoG.n) {
            return n((MoG.n) c2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
