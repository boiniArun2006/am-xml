package androidx.credentials.exceptions;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialCustomException;", "Landroidx/credentials/exceptions/ClearCredentialException;", "", "O", "Ljava/lang/String;", c.f62177j, "()Ljava/lang/String;", "type", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClearCredentialCustomException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearCredentialCustomException.kt\nandroidx/credentials/exceptions/ClearCredentialCustomException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class ClearCredentialCustomException extends ClearCredentialException {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String type;

    @Override // androidx.credentials.exceptions.ClearCredentialException
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getType() {
        return this.type;
    }
}
