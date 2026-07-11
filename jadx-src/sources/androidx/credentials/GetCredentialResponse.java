package androidx.credentials;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/GetCredentialResponse;", "", "Landroidx/credentials/Credential;", "credential", "<init>", "(Landroidx/credentials/Credential;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/credentials/Credential;", "()Landroidx/credentials/Credential;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetCredentialResponse {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Credential credential;

    public GetCredentialResponse(Credential credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        this.credential = credential;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Credential getCredential() {
        return this.credential;
    }
}
