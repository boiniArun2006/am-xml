package androidx.credentials;

import ScC.FuwU.XIvb;
import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onGetCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "", "rl", "(Landroid/credentials/GetCredentialResponse;)V", MRAIDPresenter.ERROR, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderFrameworkImpl$onGetCredential$outcome$1 implements OutcomeReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ CredentialManagerCallback f37012n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CredentialProviderFrameworkImpl f37013t;

    public void n(GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, XIvb.qZnGXmwviCahwQh);
        this.f37012n.n(this.f37013t.J2(error));
    }

    public void rl(android.credentials.GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f37012n.onResult(this.f37013t.t(response));
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        n(qf.n(th));
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        rl(u.n(obj));
    }
}
