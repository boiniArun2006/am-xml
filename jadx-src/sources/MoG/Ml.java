package MoG;

import MoG.eO;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {
    public static final Oe.j n(aC aCVar) {
        Intrinsics.checkNotNullParameter(aCVar, "<this>");
        if (aCVar instanceof o) {
            return ((o) aCVar).n();
        }
        if (aCVar instanceof QJ) {
            return ((eO.n) ((QJ) aCVar).n().n()).rl();
        }
        if (aCVar instanceof qz) {
            return ((qz) aCVar).n();
        }
        throw new NoWhenBranchMatchedException();
    }
}
