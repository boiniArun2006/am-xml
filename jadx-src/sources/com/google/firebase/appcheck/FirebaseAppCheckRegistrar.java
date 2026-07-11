package com.google.firebase.appcheck;

import Dh.I28;
import F2O.j;
import F2O.n;
import F2O.w6;
import Ip.Dsr;
import Ip.fuX;
import cIr.aC;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.Wre;
import com.google.firebase.appcheck.FirebaseAppCheckRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import uOq.CN3;
import uOq.Ml;
import uOq.g9s;
import uOq.z;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@KeepForSdk
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    public static /* synthetic */ I28 n(g9s g9sVar, g9s g9sVar2, g9s g9sVar3, g9s g9sVar4, Ml ml) {
        return new aC((Wre) ml.n(Wre.class), ml.O(Dsr.class), (Executor) ml.KN(g9sVar), (Executor) ml.KN(g9sVar2), (Executor) ml.KN(g9sVar3), (ScheduledExecutorService) ml.KN(g9sVar4));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        final g9s g9sVarN = g9s.n(F2O.Ml.class, Executor.class);
        final g9s g9sVarN2 = g9s.n(w6.class, Executor.class);
        final g9s g9sVarN3 = g9s.n(j.class, Executor.class);
        final g9s g9sVarN4 = g9s.n(n.class, ScheduledExecutorService.class);
        return Arrays.asList(uOq.w6.nr(I28.class, InterfaceC2436n.class).KN("fire-app-check").rl(z.mUb(Wre.class)).rl(z.gh(g9sVarN)).rl(z.gh(g9sVarN2)).rl(z.gh(g9sVarN3)).rl(z.gh(g9sVarN4)).rl(z.xMQ(Dsr.class)).J2(new CN3() { // from class: Dh.Wre
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebaseAppCheckRegistrar.n(g9sVarN, g9sVarN2, g9sVarN3, g9sVarN4, ml);
            }
        }).t().nr(), fuX.n(), N03.fuX.rl("fire-app-check", "18.0.0"));
    }
}
