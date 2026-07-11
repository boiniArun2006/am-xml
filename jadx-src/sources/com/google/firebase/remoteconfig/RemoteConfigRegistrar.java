package com.google.firebase.remoteconfig;

import N03.fuX;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.Wre;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s9b.I28;
import uOq.CN3;
import uOq.Ml;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ w6 n(g9s g9sVar, Ml ml) {
        return new w6((Context) ml.n(Context.class), (ScheduledExecutorService) ml.KN(g9sVar), (Wre) ml.n(Wre.class), (I28) ml.n(I28.class), ((com.google.firebase.abt.component.j) ml.n(com.google.firebase.abt.component.j.class)).rl("frc"), ml.O(SHQ.j.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uOq.w6> getComponents() {
        final g9s g9sVarN = g9s.n(F2O.n.class, ScheduledExecutorService.class);
        return Arrays.asList(uOq.w6.nr(w6.class, FP.j.class).KN(LIBRARY_NAME).rl(z.mUb(Context.class)).rl(z.gh(g9sVarN)).rl(z.mUb(Wre.class)).rl(z.mUb(I28.class)).rl(z.mUb(com.google.firebase.abt.component.j.class)).rl(z.xMQ(SHQ.j.class)).J2(new CN3() { // from class: N67.Xo
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return RemoteConfigRegistrar.n(g9sVarN, ml);
            }
        }).O().nr(), fuX.rl(LIBRARY_NAME, "22.1.2"));
    }
}
