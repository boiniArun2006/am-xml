package androidx.credentials;

import androidx.credentials.exceptions.ClearCredentialException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialManager$clearCredentialState$2$callback$1", "Landroidx/credentials/CredentialManagerCallback;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "result", "", "t", "(Ljava/lang/Void;)V", "e", "rl", "(Landroidx/credentials/exceptions/ClearCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialManager$clearCredentialState$2$callback$1 implements CredentialManagerCallback<Void, ClearCredentialException> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ GJW.Pl f36987n;

    @Override // androidx.credentials.CredentialManagerCallback
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void n(ClearCredentialException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        if (this.f36987n.isActive()) {
            GJW.Pl pl = this.f36987n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(e2)));
        }
    }

    @Override // androidx.credentials.CredentialManagerCallback
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onResult(Void result) {
        if (this.f36987n.isActive()) {
            GJW.Pl pl = this.f36987n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }
}
