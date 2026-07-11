package androidx.credentials.playservices.controllers.BeginSignIn;

import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "e", "", "rl", "(Landroidx/credentials/exceptions/GetCredentialException;)V"}, k = 3, mv = {1, 8, 0})
final class CredentialProviderBeginSignInController$handleResponse$2 extends Lambda implements Function1<GetCredentialException, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CredentialProviderBeginSignInController f37100n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.f37100n = credentialProviderBeginSignInController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CredentialProviderBeginSignInController this$0, GetCredentialException e2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(e2, "$e");
        this$0.ck().n(e2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetCredentialException getCredentialException) {
        rl(getCredentialException);
        return Unit.INSTANCE;
    }

    public final void rl(final GetCredentialException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        Executor executorIk = this.f37100n.Ik();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.f37100n;
        executorIk.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$2.t(credentialProviderBeginSignInController, e2);
            }
        });
    }
}
