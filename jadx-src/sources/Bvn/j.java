package Bvn;

import WJ.phkN.HFAkacKHsU;
import ajd.j;
import com.caoccao.javet.interop.loader.JavetLibLoadingListener;
import com.safedk.android.analytics.events.RedirectEvent;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f686n = new j();

    public final ajd.j O(j.EnumC0481j severity, String errorCode, Ml info) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(info, "info");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{HFAkacKHsU.wmmEPxFGWMiiSvg, "failed"}), severity, "Preparation of the Concierge IDs failed.", errorCode, info);
    }

    public final ajd.j n(zD.j conciergeError) {
        Intrinsics.checkNotNullParameter(conciergeError, "conciergeError");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"getId", JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM, "failed"}), j.EnumC0481j.J2, "Failed to get custom id", conciergeError.rl(), conciergeError.O());
    }

    public final ajd.j nr(zD.j conciergeError) {
        Intrinsics.checkNotNullParameter(conciergeError, "conciergeError");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"resetIds", "failed"}), j.EnumC0481j.J2, "Failed to reset user ids", conciergeError.rl(), conciergeError.O());
    }

    public final ajd.j rl(zD.j conciergeError) {
        Intrinsics.checkNotNullParameter(conciergeError, "conciergeError");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"getId", RedirectEvent.f62800h, "failed"}), j.EnumC0481j.J2, "Failed to get external id", conciergeError.rl(), conciergeError.O());
    }

    public final ajd.j t(zD.j conciergeError) {
        Intrinsics.checkNotNullParameter(conciergeError, "conciergeError");
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"getId", RedirectEvent.f62801i, "failed"}), j.EnumC0481j.J2, "Failed to get internal id", conciergeError.rl(), conciergeError.O());
    }

    private j() {
    }
}
