package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.GetCredentialResponse;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderGetSignInIntentController$handleResponse$3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CredentialProviderGetSignInIntentController f37191n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ GetCredentialResponse f37192t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialResponse getCredentialResponse) {
        super(0);
        this.f37191n = credentialProviderGetSignInIntentController;
        this.f37192t = getCredentialResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(CredentialProviderGetSignInIntentController this$0, GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(response, "$response");
        this$0.ck().onResult(response);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executorIk = this.f37191n.Ik();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.f37191n;
        final GetCredentialResponse getCredentialResponse = this.f37192t;
        executorIk.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.rl(credentialProviderGetSignInIntentController, getCredentialResponse);
            }
        });
    }
}
