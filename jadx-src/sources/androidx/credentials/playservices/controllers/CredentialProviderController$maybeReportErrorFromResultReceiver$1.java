package androidx.credentials.playservices.controllers;

import androidx.credentials.CredentialManagerCallback;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T1", "", "T2", "R2", "R1", "E1", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Object f37185O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Executor f37186n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CredentialManagerCallback f37187t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, CredentialManagerCallback credentialManagerCallback, Object obj) {
        super(0);
        this.f37186n = executor;
        this.f37187t = credentialManagerCallback;
        this.f37185O = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(CredentialManagerCallback callback, Object exception) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        callback.n(exception);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.f37186n;
        final CredentialManagerCallback credentialManagerCallback = this.f37187t;
        final Object obj = this.f37185O;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderController$maybeReportErrorFromResultReceiver$1.rl(credentialManagerCallback, obj);
            }
        });
    }
}
