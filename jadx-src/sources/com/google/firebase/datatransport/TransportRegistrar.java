package com.google.firebase.datatransport;

import N03.fuX;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bF.Dsr;
import com.google.android.datatransport.cct.j;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import lDQ.n;
import uOq.CN3;
import uOq.Ml;
import uOq.g9s;
import uOq.w6;
import uOq.z;
import veW.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ Dsr n(Ml ml) {
        s4.J2((Context) ml.n(Context.class));
        return s4.t().Uo(j.Uo);
    }

    public static /* synthetic */ Dsr rl(Ml ml) {
        s4.J2((Context) ml.n(Context.class));
        return s4.t().Uo(j.KN);
    }

    public static /* synthetic */ Dsr t(Ml ml) {
        s4.J2((Context) ml.n(Context.class));
        return s4.t().Uo(j.KN);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<w6> getComponents() {
        return Arrays.asList(w6.t(Dsr.class).KN(LIBRARY_NAME).rl(z.mUb(Context.class)).J2(new CN3() { // from class: lDQ.w6
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return TransportRegistrar.t(ml);
            }
        }).nr(), w6.O(g9s.n(lDQ.j.class, Dsr.class)).rl(z.mUb(Context.class)).J2(new CN3() { // from class: lDQ.Ml
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return TransportRegistrar.rl(ml);
            }
        }).nr(), w6.O(g9s.n(n.class, Dsr.class)).rl(z.mUb(Context.class)).J2(new CN3() { // from class: lDQ.I28
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return TransportRegistrar.n(ml);
            }
        }).nr(), fuX.rl(LIBRARY_NAME, "19.0.0"));
    }
}
