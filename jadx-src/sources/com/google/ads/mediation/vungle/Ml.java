package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f57341n = new Ml();
    public static com.google.ads.mediation.vungle.j rl = new j();

    public static final class j implements com.google.ads.mediation.vungle.j {
        @Override // com.google.ads.mediation.vungle.j
        public String getSdkVersion() {
            return VungleAds.INSTANCE.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.j
        public boolean isInitialized() {
            return VungleAds.INSTANCE.isInitialized();
        }

        @Override // com.google.ads.mediation.vungle.j
        public void n(Context context, String appId, InitializationListener initializationListener) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
            VungleAds.INSTANCE.init(context, appId, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.j
        public String rl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return VungleAds.INSTANCE.getBiddingToken(context);
        }

        j() {
        }
    }

    private Ml() {
    }
}
