package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.annotation.RequiresApi;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.credentials.provider.utils.ClearCredentialUtil;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b'\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0006¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00180\u0006H&¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0006H&¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010#\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0006H&¢\u0006\u0004\b#\u0010$R*\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020%8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u00101\u001a\u0004\u0018\u00010 2\b\u0010&\u001a\u0004\u0018\u00010 8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R.\u00108\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u001b8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010?\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010\u00178G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "Landroid/service/credentials/BeginGetCredentialRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/OutcomeReceiver;", "Landroid/service/credentials/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "callback", "", "onBeginGetCredential", "(Landroid/service/credentials/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "Landroid/service/credentials/BeginCreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "onBeginCreateCredential", "(Landroid/service/credentials/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "onClearCredentialState", "(Landroid/service/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "Landroidx/credentials/exceptions/ClearCredentialException;", "t", "(Landroidx/credentials/provider/ProviderClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "rl", "(Landroidx/credentials/provider/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "Landroidx/credentials/exceptions/CreateCredentialException;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/credentials/provider/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "", "<set-?>", "Z", "isTestMode", "()Z", "setTestMode", "(Z)V", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "getLastCreateRequest", "()Landroidx/credentials/provider/BeginCreateCredentialRequest;", "setLastCreateRequest", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;)V", "lastCreateRequest", "O", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "getLastGetRequest", "()Landroidx/credentials/provider/BeginGetCredentialRequest;", "setLastGetRequest", "(Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "lastGetRequest", "J2", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "getLastClearRequest", "()Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "setLastClearRequest", "(Landroidx/credentials/provider/ProviderClearCredentialStateRequest;)V", "lastClearRequest", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private ProviderClearCredentialStateRequest lastClearRequest;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private BeginGetCredentialRequest lastGetRequest;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isTestMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private BeginCreateCredentialRequest lastCreateRequest;

    public abstract void n(BeginCreateCredentialRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public abstract void rl(BeginGetCredentialRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public abstract void t(ProviderClearCredentialStateRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public final void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest request, CancellationSignal cancellationSignal, final OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginCreateCredential$outcome$1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public void onError(CreateCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OutcomeReceiver outcomeReceiver2 = callback;
                l3D.n();
                outcomeReceiver2.onError(QJ.n(error.getType(), error.getMessage()));
            }

            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void onResult(BeginCreateCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.onResult(BeginCreateCredentialUtil.INSTANCE.O(response));
            }
        };
        BeginCreateCredentialRequest beginCreateCredentialRequestJ2 = BeginCreateCredentialUtil.INSTANCE.J2(request);
        if (this.isTestMode) {
            this.lastCreateRequest = beginCreateCredentialRequestJ2;
        }
        n(beginCreateCredentialRequestJ2, cancellationSignal, androidx.core.os.j.n(outcomeReceiver));
    }

    public final void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest request, CancellationSignal cancellationSignal, final OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BeginGetCredentialRequest beginGetCredentialRequestCk = BeginGetCredentialUtil.INSTANCE.ck(request);
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginGetCredential$outcome$1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public void onError(GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OutcomeReceiver outcomeReceiver2 = callback;
                s4.n();
                outcomeReceiver2.onError(AbstractC1546c.n(error.getType(), error.getMessage()));
            }

            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void onResult(BeginGetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                callback.onResult(BeginGetCredentialUtil.INSTANCE.ty(response));
            }
        };
        if (this.isTestMode) {
            this.lastGetRequest = beginGetCredentialRequestCk;
        }
        rl(beginGetCredentialRequestCk, cancellationSignal, androidx.core.os.j.n(outcomeReceiver));
    }

    public final void onClearCredentialState(ClearCredentialStateRequest request, CancellationSignal cancellationSignal, final OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onClearCredentialState$outcome$1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public void onError(ClearCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OutcomeReceiver outcomeReceiver2 = callback;
                Q.n();
                outcomeReceiver2.onError(UGc.n(error.getType(), error.getMessage()));
            }

            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void onResult(Void response) {
                callback.onResult(response);
            }
        };
        ProviderClearCredentialStateRequest providerClearCredentialStateRequestN = ClearCredentialUtil.INSTANCE.n(request);
        if (this.isTestMode) {
            this.lastClearRequest = providerClearCredentialStateRequestN;
        }
        t(providerClearCredentialStateRequestN, cancellationSignal, androidx.core.os.j.n(outcomeReceiver));
    }
}
