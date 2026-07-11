package CuC;

import ajd.j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f1027n = new j();

    public final ajd.j n(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"remoteSettings", "deserialization", "failed"});
        j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
        Ml ml = new Ml();
        String message = throwable.getMessage();
        if (message != null) {
            ml.O("exception_message", message);
        }
        Unit unit = Unit.INSTANCE;
        return new ajd.j(listListOf, enumC0481j, "Remote Settings Deserialization failed", null, ml, 8, null);
    }

    private j() {
    }
}
