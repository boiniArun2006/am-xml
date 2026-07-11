package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import oW.InterfaceC2314n;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@RestrictTo
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    public static /* synthetic */ eO n(uOq.Ml ml) {
        return new eO((Context) ml.n(Context.class), (com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), ml.xMQ(InterfaceC2314n.class), ml.xMQ(InterfaceC2436n.class), new Pe.n(ml.O(N03.Dsr.class), ml.O(Ip.aC.class), (com.google.firebase.qz) ml.n(com.google.firebase.qz.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<uOq.w6> getComponents() {
        return Arrays.asList(uOq.w6.t(eO.class).KN(LIBRARY_NAME).rl(uOq.z.mUb(com.google.firebase.Wre.class)).rl(uOq.z.mUb(Context.class)).rl(uOq.z.xMQ(Ip.aC.class)).rl(uOq.z.xMQ(N03.Dsr.class)).rl(uOq.z.n(InterfaceC2314n.class)).rl(uOq.z.n(InterfaceC2436n.class)).rl(uOq.z.KN(com.google.firebase.qz.class)).J2(new uOq.CN3() { // from class: com.google.firebase.firestore.z
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return FirestoreRegistrar.n(ml);
            }
        }).nr(), N03.fuX.rl(LIBRARY_NAME, "25.1.4"));
    }
}
