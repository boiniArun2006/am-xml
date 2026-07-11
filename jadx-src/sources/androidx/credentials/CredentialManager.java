package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u0011H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManager;", "", "Landroid/content/Context;", "context", "Landroidx/credentials/GetCredentialRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroidx/credentials/GetCredentialResponse;", "t", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "J2", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "", "O", "(Landroid/content/Context;Landroidx/credentials/GetCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", "Landroidx/credentials/exceptions/CreateCredentialException;", "nr", "(Landroid/content/Context;Landroidx/credentials/CreateCredentialRequest;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroidx/credentials/CredentialManagerCallback;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCredentialManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,472:1\n314#2,11:473\n314#2,11:484\n314#2,11:495\n314#2,11:506\n314#2,11:517\n*S KotlinDebug\n*F\n+ 1 CredentialManager.kt\nandroidx/credentials/CredentialManager\n*L\n110#1:473,11\n163#1:484,11\n210#1:495,11\n257#1:506,11\n306#1:517,11\n*E\n"})
public interface CredentialManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f36985n;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/CredentialManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/CredentialManager;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/content/Context;)Landroidx/credentials/CredentialManager;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f36985n = new Companion();

        public final CredentialManager n(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialManagerImpl(context);
        }

        private Companion() {
        }
    }

    static CredentialManager create(Context context) {
        return INSTANCE.n(context);
    }

    default Object J2(Context context, CreateCredentialRequest createCredentialRequest, Continuation continuation) {
        return n(this, context, createCredentialRequest, continuation);
    }

    void O(Context context, GetCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback);

    void nr(Context context, CreateCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback);

    default Object t(Context context, GetCredentialRequest getCredentialRequest, Continuation continuation) {
        return rl(this, context, getCredentialRequest, continuation);
    }

    static /* synthetic */ Object n(CredentialManager credentialManager, Context context, CreateCredentialRequest createCredentialRequest, Continuation continuation) {
        final GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$createCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.nr(context, createCredentialRequest, cancellationSignal, new j(), new CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>() { // from class: androidx.credentials.CredentialManager$createCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void n(CreateCredentialException e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                if (eOVar.isActive()) {
                    GJW.Pl pl = eOVar;
                    Result.Companion companion = Result.INSTANCE;
                    pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(e2)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void onResult(CreateCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (eOVar.isActive()) {
                    eOVar.resumeWith(Result.m313constructorimpl(result));
                }
            }
        });
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    static /* synthetic */ Object rl(CredentialManager credentialManager, Context context, GetCredentialRequest getCredentialRequest, Continuation continuation) {
        final GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.O(context, getCredentialRequest, cancellationSignal, new j(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void n(GetCredentialException e2) {
                Intrinsics.checkNotNullParameter(e2, "e");
                if (eOVar.isActive()) {
                    GJW.Pl pl = eOVar;
                    Result.Companion companion = Result.INSTANCE;
                    pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(e2)));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void onResult(GetCredentialResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (eOVar.isActive()) {
                    eOVar.resumeWith(Result.m313constructorimpl(result));
                }
            }
        });
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
