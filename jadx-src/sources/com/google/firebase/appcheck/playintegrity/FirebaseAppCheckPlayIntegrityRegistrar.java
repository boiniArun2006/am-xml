package com.google.firebase.appcheck.playintegrity;

import F2O.n;
import F2O.w6;
import N03.fuX;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.Wre;
import com.google.firebase.appcheck.playintegrity.FirebaseAppCheckPlayIntegrityRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import oLx.Dsr;
import uOq.CN3;
import uOq.Ml;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@KeepForSdk
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    public static /* synthetic */ Dsr n(g9s g9sVar, g9s g9sVar2, Ml ml) {
        return new Dsr((Wre) ml.n(Wre.class), (Executor) ml.KN(g9sVar), (Executor) ml.KN(g9sVar2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final g9s g9sVarN = g9s.n(w6.class, Executor.class);
        final g9s g9sVarN2 = g9s.n(n.class, Executor.class);
        return Arrays.asList(uOq.w6.t(Dsr.class).KN("fire-app-check-play-integrity").rl(z.mUb(Wre.class)).rl(z.gh(g9sVarN)).rl(z.gh(g9sVarN2)).J2(new CN3() { // from class: V3I.j
            @Override // uOq.CN3
            public final Object n(Ml ml) {
                return FirebaseAppCheckPlayIntegrityRegistrar.n(g9sVarN, g9sVarN2, ml);
            }
        }).nr(), fuX.rl("fire-app-check-play-integrity", "18.0.0"));
    }
}
