package androidx.credentials;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialManager$prepareGetCredential$2$callback$1", "Landroidx/credentials/CredentialManagerCallback;", "Landroidx/credentials/PrepareGetCredentialResponse;", "Landroidx/credentials/exceptions/GetCredentialException;", "result", "", "t", "(Landroidx/credentials/PrepareGetCredentialResponse;)V", "e", "rl", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialManager$prepareGetCredential$2$callback$1 implements CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ GJW.Pl f36995n;

    @Override // androidx.credentials.CredentialManagerCallback
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void n(GetCredentialException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        if (this.f36995n.isActive()) {
            GJW.Pl pl = this.f36995n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(e2)));
        }
    }

    @Override // androidx.credentials.CredentialManagerCallback
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onResult(PrepareGetCredentialResponse result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f36995n.isActive()) {
            this.f36995n.resumeWith(Result.m313constructorimpl(result));
        }
    }
}
