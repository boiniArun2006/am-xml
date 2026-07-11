package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class j implements AudienceNetworkAds.InitListener {
    private static j nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f57294n = false;
    private boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f57295t = new ArrayList();

    /* JADX INFO: renamed from: com.google.ads.mediation.facebook.j$j, reason: collision with other inner class name */
    interface InterfaceC0760j {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f57294n = false;
        this.rl = initResult.isSuccess();
        for (InterfaceC0760j interfaceC0760j : this.f57295t) {
            if (initResult.isSuccess()) {
                interfaceC0760j.onInitializeSuccess();
            } else {
                interfaceC0760j.onInitializeError(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f57295t.clear();
    }

    static j n() {
        if (nr == null) {
            nr = new j();
        }
        return nr;
    }

    void rl(Context context, ArrayList arrayList, InterfaceC0760j interfaceC0760j) {
        if (this.f57294n) {
            this.f57295t.add(interfaceC0760j);
        } else {
            if (this.rl) {
                interfaceC0760j.onInitializeSuccess();
                return;
            }
            this.f57294n = true;
            n().f57295t.add(interfaceC0760j);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    private j() {
    }
}
