package M3;

import QmE.iF;
import QmE.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final ga6.j n(ga6.j jVar, iF logger) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        logger.n(new j.xZD(jVar));
        return jVar;
    }

    public static final x0X.n rl(x0X.n nVar, iF logger) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if (nVar instanceof n.C1266n) {
            n((ga6.j) ((n.C1266n) nVar).n(), logger);
            return nVar;
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
