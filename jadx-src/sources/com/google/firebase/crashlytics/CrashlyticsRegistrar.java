package com.google.firebase.crashlytics;

import F2O.j;
import F2O.n;
import F2O.w6;
import N03.fuX;
import XE.n;
import Zlm.Wre;
import com.google.firebase.components.ComponentRegistrar;
import h1M.CN3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import s9b.I28;
import uOq.Ml;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g9s f60278n = g9s.n(j.class, ExecutorService.class);
    private final g9s rl = g9s.n(n.class, ExecutorService.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g9s f60279t = g9s.n(w6.class, ExecutorService.class);

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics rl(Ml ml) {
        Wre.J2(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsRl = FirebaseCrashlytics.rl((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), (I28) ml.n(I28.class), ml.xMQ(h1M.j.class), ml.xMQ(SHQ.j.class), ml.xMQ(FP.j.class), (ExecutorService) ml.KN(this.f60278n), (ExecutorService) ml.KN(this.rl), (ExecutorService) ml.KN(this.f60279t));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            CN3.J2().rl("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsRl;
    }

    static {
        XE.j.n(n.j.CRASHLYTICS);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(uOq.w6.t(FirebaseCrashlytics.class).KN("fire-cls").rl(z.mUb(com.google.firebase.Wre.class)).rl(z.mUb(I28.class)).rl(z.gh(this.f60278n)).rl(z.gh(this.rl)).rl(z.gh(this.f60279t)).rl(z.n(h1M.j.class)).rl(z.n(SHQ.j.class)).rl(z.n(FP.j.class)).J2(new uOq.CN3() { // from class: BUw.Wre
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return this.f484n.rl(ml);
            }
        }).O().nr(), fuX.rl("fire-cls", "19.4.4"));
    }
}
