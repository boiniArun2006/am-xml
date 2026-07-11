package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Keep
@KeepForSdk
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    static class j implements Qc1.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final FirebaseInstanceId f60520n;

        public j(FirebaseInstanceId firebaseInstanceId) {
            this.f60520n = firebaseInstanceId;
        }

        @Override // Qc1.j
        public String n() {
            return this.f60520n.ty();
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(uOq.Ml ml) {
        return new FirebaseInstanceId((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), ml.O(N03.Dsr.class), ml.O(Ip.aC.class), (s9b.I28) ml.n(s9b.I28.class));
    }

    static final /* synthetic */ Qc1.j lambda$getComponents$1$Registrar(uOq.Ml ml) {
        return new j((FirebaseInstanceId) ml.n(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<uOq.w6> getComponents() {
        return Arrays.asList(uOq.w6.t(FirebaseInstanceId.class).rl(uOq.z.mUb(com.google.firebase.Wre.class)).rl(uOq.z.xMQ(N03.Dsr.class)).rl(uOq.z.xMQ(Ip.aC.class)).rl(uOq.z.mUb(s9b.I28.class)).J2(Xo.f60524n).t().nr(), uOq.w6.t(Qc1.j.class).rl(uOq.z.mUb(FirebaseInstanceId.class)).J2(eO.f60530n).nr(), N03.fuX.rl("fire-iid", "21.1.0"));
    }
}
