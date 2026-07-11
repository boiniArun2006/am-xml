package ICC;

import HI0.Q;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final n f4090n = new n(CollectionsKt.emptyList(), 24000);

    public static final n n(Q contentResolver, Function1 init) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(init, "init");
        CN3 cn3 = new CN3(contentResolver);
        init.invoke(cn3);
        List listXMQ = cn3.xMQ();
        Integer numKN = cn3.KN();
        return new n(listXMQ, numKN != null ? numKN.intValue() : 0);
    }
}
