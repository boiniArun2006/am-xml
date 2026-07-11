package androidx.credentials;

import android.credentials.ClearCredentialStateException;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onClearCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "response", "", "rl", "(Ljava/lang/Void;)V", MRAIDPresenter.ERROR, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/credentials/ClearCredentialStateException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderFrameworkImpl$onClearCredential$outcome$1 implements OutcomeReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CredentialManagerCallback f37005n;

    public void n(ClearCredentialStateException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
        this.f37005n.n(new ClearCredentialUnknownException(null, 1, null));
    }

    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void onResult(Void response) {
        Log.i("CredManProvService", "Clear result returned from framework: ");
        this.f37005n.onResult(response);
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        n(Z.n(th));
    }
}
