package kYF;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import okhttp3.Call;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {
    public static final Object n(Call call, Continuation continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        QJ qj = new QJ(call, eOVar);
        FirebasePerfOkHttpClient.enqueue(call, qj);
        eOVar.J2(qj);
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
