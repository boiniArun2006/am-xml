package efc;

import android.content.Context;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.bendingspoons.legal.privacy.Tracker;
import k.InterfaceC2201j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements InterfaceC2201j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f63841n = new n();

    @Override // k.InterfaceC2201j
    public Tracker n(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Tracker.AppLovin(context, null, !AppLovinPrivacySettings.isUserConsentSet(context) || AppLovinPrivacySettings.hasUserConsent(context), new Function1() { // from class: efc.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.t(context, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Context context, boolean z2) {
        AppLovinPrivacySettings.setHasUserConsent(z2, context);
        AppLovinPrivacySettings.setDoNotSell(!z2, context);
        return Unit.INSTANCE;
    }
}
