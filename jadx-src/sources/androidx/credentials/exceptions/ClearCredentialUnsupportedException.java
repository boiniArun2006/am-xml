package androidx.credentials.exceptions;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialUnsupportedException;", "Landroidx/credentials/exceptions/ClearCredentialException;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "O", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClearCredentialUnsupportedException extends ClearCredentialException {
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ClearCredentialUnsupportedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ClearCredentialUnsupportedException(CharSequence charSequence, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : charSequence);
    }

    public ClearCredentialUnsupportedException(CharSequence charSequence) {
        super("androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION", charSequence);
    }
}
