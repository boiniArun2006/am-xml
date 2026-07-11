package qE;

import ajd.j;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f72306n = new j();

    public static /* synthetic */ ajd.j nr(j jVar, String str, Throwable th, pq.Ml ml, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ml = new pq.Ml();
        }
        return jVar.t(str, th, ml);
    }

    public final ajd.j n() {
        return new ajd.j(CollectionsKt.listOf("downloadSettings"), null, "Download app settings", null, null, 26, null);
    }

    public final ajd.j rl(KPz.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new ajd.j(CollectionsKt.listOf("executeCall"), null, null, null, pq.I28.n(pq.n.O("endpoint", request.rl()), pq.n.O("method", request.nr().name())), 14, null);
    }

    public final ajd.j t(String errorCode, Throwable throwable, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"responseProcessing", MRAIDPresenter.ERROR}), j.EnumC0481j.J2, "Error while processing a response", errorCode, pq.I28.n(pq.n.O(MRAIDPresenter.ERROR, throwable.toString())).rl(additionalInfo));
    }

    private j() {
    }
}
