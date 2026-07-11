package com.google.firebase.storage;

import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import oW.InterfaceC2314n;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Keep
@RestrictTo
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    uOq.g9s blockingExecutor = uOq.g9s.n(F2O.n.class, Executor.class);
    uOq.g9s uiExecutor = uOq.g9s.n(F2O.Ml.class, Executor.class);

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uOq.w6> getComponents() {
        return Arrays.asList(uOq.w6.t(Wre.class).KN(LIBRARY_NAME).rl(uOq.z.mUb(com.google.firebase.Wre.class)).rl(uOq.z.gh(this.blockingExecutor)).rl(uOq.z.gh(this.uiExecutor)).rl(uOq.z.xMQ(InterfaceC2314n.class)).rl(uOq.z.xMQ(InterfaceC2436n.class)).J2(new uOq.CN3() { // from class: com.google.firebase.storage.qz
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return StorageRegistrar.n(this.f60898n, ml);
            }
        }).nr(), N03.fuX.rl(LIBRARY_NAME, "21.0.2"));
    }

    public static /* synthetic */ Wre n(StorageRegistrar storageRegistrar, uOq.Ml ml) {
        storageRegistrar.getClass();
        return new Wre((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), ml.O(InterfaceC2314n.class), ml.O(InterfaceC2436n.class), (Executor) ml.KN(storageRegistrar.blockingExecutor), (Executor) ml.KN(storageRegistrar.uiExecutor));
    }
}
