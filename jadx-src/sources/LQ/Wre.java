package LQ;

import LQ.j;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {
    public static final Object n(j jVar) throws UnhandledFailureException {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (jVar instanceof j.n) {
            throw new UnhandledFailureException(((j.n) jVar).n());
        }
        if (jVar instanceof j.w6) {
            return ((j.w6) jVar).n();
        }
        throw new NoWhenBranchMatchedException();
    }
}
