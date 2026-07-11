package cKn;

import GJW.Pl;
import GJW.eO;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Dsr {

    static final class Ml implements OnSuccessListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function1 f43627n;

        Ml(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f43627n = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f43627n.invoke(obj);
        }
    }

    static final class j implements OnCanceledListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl f43628n;

        j(Pl pl) {
            this.f43628n = pl;
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            Pl pl = this.f43628n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(new n.C1266n(new CancellationException())));
        }
    }

    static final class n implements OnFailureListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl f43629n;

        n(Pl pl) {
            this.f43629n = pl;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Pl pl = this.f43629n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(new n.C1266n(it)));
        }
    }

    static final class w6 implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl f43630n;

        w6(Pl pl) {
            this.f43630n = pl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String str) {
            Pl pl = this.f43630n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(new n.w6(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object rl(FirebaseAnalytics firebaseAnalytics, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        firebaseAnalytics.n().addOnCanceledListener(new j(eOVar)).addOnFailureListener(new n(eOVar)).addOnSuccessListener(new Ml(new w6(eOVar)));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
