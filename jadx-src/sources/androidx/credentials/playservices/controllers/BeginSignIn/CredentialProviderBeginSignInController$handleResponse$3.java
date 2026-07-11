package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.GetCredentialResponse;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderBeginSignInController$handleResponse$3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CredentialProviderBeginSignInController f37101n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ GetCredentialResponse f37102t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialResponse getCredentialResponse) {
        super(0);
        this.f37101n = credentialProviderBeginSignInController;
        this.f37102t = getCredentialResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(CredentialProviderBeginSignInController this$0, GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.ck().onResult(response);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executorIk = this.f37101n.Ik();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.f37101n;
        final GetCredentialResponse getCredentialResponse = this.f37102t;
        executorIk.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$3.rl(credentialProviderBeginSignInController, getCredentialResponse);
            }
        });
    }
}
