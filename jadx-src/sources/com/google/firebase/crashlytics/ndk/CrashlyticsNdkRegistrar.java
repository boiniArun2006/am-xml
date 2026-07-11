package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import uOq.Ml;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public h1M.j rl(uOq.Ml ml) {
        return w6.J2((Context) ml.n(Context.class), !h1M.Wre.Uo(r2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(uOq.w6.t(h1M.j.class).KN("fire-cls-ndk").rl(z.mUb(Context.class)).J2(new uOq.CN3() { // from class: Up.j
            @Override // uOq.CN3
            public final Object n(Ml ml) {
                return this.f10837n.rl(ml);
            }
        }).O().nr(), N03.fuX.rl("fire-cls-ndk", "19.4.4"));
    }
}
