package com.google.firebase.installations;

import Ip.Dsr;
import JWp.aC;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ s9b.I28 n(uOq.Ml ml) {
        return new w6((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), ml.O(Dsr.class), (ExecutorService) ml.KN(g9s.n(F2O.j.class, ExecutorService.class)), aC.t((Executor) ml.KN(g9s.n(F2O.n.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uOq.w6> getComponents() {
        return Arrays.asList(uOq.w6.t(s9b.I28.class).KN(LIBRARY_NAME).rl(z.mUb(com.google.firebase.Wre.class)).rl(z.xMQ(Dsr.class)).rl(z.gh(g9s.n(F2O.j.class, ExecutorService.class))).rl(z.gh(g9s.n(F2O.n.class, Executor.class))).J2(new uOq.CN3() { // from class: s9b.Wre
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebaseInstallationsRegistrar.n(ml);
            }
        }).nr(), Ip.fuX.n(), N03.fuX.rl(LIBRARY_NAME, "18.0.0"));
    }
}
