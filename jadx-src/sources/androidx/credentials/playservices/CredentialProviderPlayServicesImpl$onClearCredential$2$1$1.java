package androidx.credentials.playservices;

import android.util.Log;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CredentialManagerCallback f37078O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Exception f37079n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Executor f37080t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        super(0);
        this.f37079n = exc;
        this.f37080t = executor;
        this.f37078O = credentialManagerCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(CredentialManagerCallback callback, Exception e2) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(e2, "$e");
        callback.n(new ClearCredentialUnknownException(e2.getMessage()));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.f37079n);
        Executor executor = this.f37080t;
        final CredentialManagerCallback credentialManagerCallback = this.f37078O;
        final Exception exc = this.f37079n;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.Ml
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.rl(credentialManagerCallback, exc);
            }
        });
    }
}
