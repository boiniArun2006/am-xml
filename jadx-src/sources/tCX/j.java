package tCX;

import K6D.j;
import ajd.j;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pq.I28;
import pq.Ml;
import pq.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class j {
    public static final void J2(K6D.j jVar, dI8.j displayError, String mediator, Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(displayError, "displayError");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        j.C0175j.rl(jVar, displayError.getTitle(), null, I28.n(n.O("message", displayError.getMessage()), n.O("mediator", mediator)).rl(additionalInfo), 2, null);
    }

    public static final void KN(rB.Ml ml, k.I28 adType, String mediator) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        rB.I28.rl(ml, CollectionsKt.listOf((Object[]) new String[]{"launch", "staleAd"}), j.EnumC0481j.f13101O, "A stale ad was found among the loaded ones.", null, I28.n(n.O("ad_type", adType.rl()), n.O("mediator", mediator)), 8, null);
    }

    public static final void O(rB.Ml ml, k.I28 adType, String mediator) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        rB.I28.rl(ml, CollectionsKt.listOf((Object[]) new String[]{"launch", "anotherAdShowing"}), j.EnumC0481j.J2, "Attempted to launch an ad while another one was showing.", null, I28.n(n.O("ad_type", adType.rl()), n.O("mediator", mediator)), 8, null);
    }

    public static final void Uo(K6D.j jVar, dI8.n loadError, String mediator, Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(loadError, "loadError");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        j.C0175j.rl(jVar, loadError.getTitle(), null, I28.n(n.O("message", loadError.getMessage()), n.O("mediator", mediator)).rl(additionalInfo), 2, null);
    }

    public static final ajd.j n(k.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return t(ml, "display");
    }

    public static final void nr(rB.Ml ml, boolean z2, String mediator) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        rB.I28.rl(ml, CollectionsKt.listOf("initialized"), null, null, null, I28.n(n.n(FijIa.cYQmBKFsuk, z2), n.O("mediator", mediator)), 14, null);
    }

    public static final ajd.j rl(k.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return t(ml, "load");
    }

    private static final ajd.j t(k.Ml ml, String str) {
        return new ajd.j(CollectionsKt.listOf(str), null, null, null, ml.rl(), 14, null);
    }
}
