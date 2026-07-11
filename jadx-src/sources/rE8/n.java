package rE8;

import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.ads.MobileAds;
import k.InterfaceC2201j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements InterfaceC2201j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f72883n = new n();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z2) {
        MobileAds.setRequestConfiguration(MobileAds.getRequestConfiguration().toBuilder().setTagForChildDirectedTreatment(!z2 ? 1 : 0).build());
        return Unit.INSTANCE;
    }

    @Override // k.InterfaceC2201j
    public Tracker n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Tracker.GoogleMobileAds(context, null, MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1, new Function1() { // from class: rE8.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.t(((Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    private n() {
    }
}
