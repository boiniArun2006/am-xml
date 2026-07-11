package com.facebook;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "Lcom/facebook/g9s;", "graphResponse", "", "errorMessage", "<init>", "(Lcom/facebook/g9s;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "t", "Lcom/facebook/g9s;", "getGraphResponse", "()Lcom/facebook/g9s;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final g9s graphResponse;

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        g9s g9sVar = this.graphResponse;
        FacebookRequestError facebookRequestErrorRl = g9sVar != null ? g9sVar.rl() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestErrorRl != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestErrorRl.getRequestStatusCode());
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestErrorRl.getErrorCode());
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestErrorRl.getErrorType());
            sb.append(", message: ");
            sb.append(facebookRequestErrorRl.t());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "errorStringBuilder.toString()");
        return string;
    }

    public FacebookGraphResponseException(g9s g9sVar, String str) {
        super(str);
        this.graphResponse = g9sVar;
    }
}
