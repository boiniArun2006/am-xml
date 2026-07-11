package androidx.credentials;

import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/PrepareGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "", "rl", "(Landroid/credentials/PrepareGetCredentialResponse;)V", MRAIDPresenter.ERROR, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1 implements OutcomeReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CredentialManagerCallback f37017n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CredentialProviderFrameworkImpl f37018t;

    public void n(GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f37017n.n(this.f37018t.J2(error));
    }

    public void rl(android.credentials.PrepareGetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f37017n.onResult(this.f37018t.nr(response));
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        n(qf.n(th));
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        rl(Ln.n(obj));
    }
}
