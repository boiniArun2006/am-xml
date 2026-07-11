package com.google.firebase.abt.component;

import N03.fuX;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import uOq.CN3;
import uOq.Ml;
import uOq.w6;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ j n(Ml ml) {
        return new j((Context) ml.n(Context.class), ml.O(SHQ.j.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<w6> getComponents() {
        return Arrays.asList(w6.t(j.class).KN(LIBRARY_NAME).rl(z.mUb(Context.class)).rl(z.xMQ(SHQ.j.class)).J2(new CN3() { // from class: Ugz.j
            @Override // uOq.CN3
            public final Object n(Ml ml) {
                return AbtRegistrar.n(ml);
            }
        }).nr(), fuX.rl(LIBRARY_NAME, "21.1.1"));
    }
}
