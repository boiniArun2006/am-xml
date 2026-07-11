package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import oW.C2310Wre;
import oW.InterfaceC2314n;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@KeepForSdk
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(uOq.g9s g9sVar, uOq.g9s g9sVar2, uOq.g9s g9sVar3, uOq.g9s g9sVar4, uOq.g9s g9sVar5, uOq.Ml ml) {
        return new C2310Wre((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), ml.O(InterfaceC2436n.class), ml.O(Ip.Dsr.class), (Executor) ml.KN(g9sVar), (Executor) ml.KN(g9sVar2), (Executor) ml.KN(g9sVar3), (ScheduledExecutorService) ml.KN(g9sVar4), (Executor) ml.KN(g9sVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    public List<uOq.w6> getComponents() {
        final uOq.g9s g9sVarN = uOq.g9s.n(F2O.j.class, Executor.class);
        final uOq.g9s g9sVarN2 = uOq.g9s.n(F2O.n.class, Executor.class);
        final uOq.g9s g9sVarN3 = uOq.g9s.n(F2O.w6.class, Executor.class);
        final uOq.g9s g9sVarN4 = uOq.g9s.n(F2O.w6.class, ScheduledExecutorService.class);
        final uOq.g9s g9sVarN5 = uOq.g9s.n(F2O.Ml.class, Executor.class);
        return Arrays.asList(uOq.w6.nr(FirebaseAuth.class, InterfaceC2314n.class).rl(uOq.z.mUb(com.google.firebase.Wre.class)).rl(uOq.z.qie(Ip.Dsr.class)).rl(uOq.z.gh(g9sVarN)).rl(uOq.z.gh(g9sVarN2)).rl(uOq.z.gh(g9sVarN3)).rl(uOq.z.gh(g9sVarN4)).rl(uOq.z.gh(g9sVarN5)).rl(uOq.z.xMQ(InterfaceC2436n.class)).J2(new uOq.CN3() { // from class: com.google.firebase.auth.Q
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(g9sVarN, g9sVarN2, g9sVarN3, g9sVarN4, g9sVarN5, ml);
            }
        }).nr(), Ip.fuX.n(), N03.fuX.rl("fire-auth", "23.2.1"));
    }
}
