package com.google.firebase.perf;

import Li.I28;
import Li.n;
import N03.fuX;
import Ys.j;
import androidx.annotation.Keep;
import bF.Dsr;
import com.google.firebase.Pl;
import com.google.firebase.Wre;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.w6;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import uOq.CN3;
import uOq.Ml;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static I28 providesFirebasePerformance(Ml ml) {
        ml.n(n.class);
        return j.n().rl(new Aqv.j((Wre) ml.n(Wre.class), (s9b.I28) ml.n(s9b.I28.class), ml.O(w6.class), ml.O(Dsr.class))).n().n();
    }

    public static /* synthetic */ n rl(g9s g9sVar, Ml ml) {
        return new n((Wre) ml.n(Wre.class), (Pl) ml.O(Pl.class).get(), (Executor) ml.KN(g9sVar));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<uOq.w6> getComponents() {
        final g9s g9sVarN = g9s.n(F2O.Ml.class, Executor.class);
        return Arrays.asList(uOq.w6.t(I28.class).KN(LIBRARY_NAME).rl(z.mUb(Wre.class)).rl(z.qie(w6.class)).rl(z.mUb(s9b.I28.class)).rl(z.qie(Dsr.class)).rl(z.mUb(n.class)).J2(new CN3() { // from class: Li.w6
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebasePerfRegistrar.providesFirebasePerformance(ml);
            }
        }).nr(), uOq.w6.t(n.class).KN(EARLY_LIBRARY_NAME).rl(z.mUb(Wre.class)).rl(z.xMQ(Pl.class)).rl(z.gh(g9sVarN)).O().J2(new CN3() { // from class: Li.Ml
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebasePerfRegistrar.rl(g9sVarN, ml);
            }
        }).nr(), fuX.rl(LIBRARY_NAME, "21.0.5"));
    }
}
