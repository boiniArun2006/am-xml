package jQ;

import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import k.InterfaceC2201j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements InterfaceC2201j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f69438n = new Ml();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z2) {
        VunglePrivacySettings.setGDPRStatus(z2, null);
        return Unit.INSTANCE;
    }

    @Override // k.InterfaceC2201j
    public Tracker n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String gDPRStatus = VunglePrivacySettings.getGDPRStatus();
        boolean z2 = true;
        if (!Intrinsics.areEqual(gDPRStatus, PrivacyConsent.OPT_IN.getValue()) && Intrinsics.areEqual(gDPRStatus, PrivacyConsent.OPT_OUT.getValue())) {
            z2 = false;
        }
        return new Tracker.Vungle(context, null, z2, new Function1() { // from class: jQ.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.t(((Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    private Ml() {
    }
}
