package Ht;

import GJW.Pl;
import GJW.eO;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: Ht.j$j, reason: collision with other inner class name */
    public static final class C0139j implements Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl f3981n;

        C0139j(Pl pl) {
            this.f3981n = pl;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e2) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e2, "e");
            if (this.f3981n.isCancelled()) {
                return;
            }
            Pl pl = this.f3981n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(new n.C1266n(e2)));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (this.f3981n.isCancelled()) {
                return;
            }
            Pl pl = this.f3981n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(new n.w6(response)));
        }
    }

    static final class n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Call f3982n;

        n(Call call) {
            this.f3982n = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable th) {
            Call call = this.f3982n;
            try {
                Result.Companion companion = Result.INSTANCE;
                call.cancel();
                Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m313constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    public static final Object n(Call call, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        FirebasePerfOkHttpClient.enqueue(call, new C0139j(eOVar));
        eOVar.J2(new n(call));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
