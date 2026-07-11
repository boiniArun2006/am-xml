package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 implements InitializationListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w6 f57345t = new w6();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f57346n = new AtomicBoolean(false);
    private final ArrayList rl = new ArrayList();

    public interface j {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public static w6 n() {
        return f57345t;
    }

    @Override // com.vungle.ads.InitializationListener
    public void onSuccess() {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onInitializeSuccess();
        }
        this.rl.clear();
        this.f57346n.set(false);
    }

    public void rl(String str, Context context, j jVar) {
        if (Ml.rl.isInitialized()) {
            jVar.onInitializeSuccess();
        } else {
            if (this.f57346n.getAndSet(true)) {
                this.rl.add(jVar);
                return;
            }
            t(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            Ml.rl.n(context, str, this);
            this.rl.add(jVar);
        }
    }

    public void t(int i2) {
        if (i2 == 0) {
            VunglePrivacySettings.setCOPPAStatus(false);
        } else {
            if (i2 != 1) {
                return;
            }
            VunglePrivacySettings.setCOPPAStatus(true);
        }
    }

    private w6() {
        VungleAds.setIntegrationName(VungleAds.WrapperFramework.admob, BuildConfig.ADAPTER_VERSION.replace('.', '_'));
    }

    @Override // com.vungle.ads.InitializationListener
    public void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onInitializeError(adError);
        }
        this.rl.clear();
        this.f57346n.set(false);
    }
}
