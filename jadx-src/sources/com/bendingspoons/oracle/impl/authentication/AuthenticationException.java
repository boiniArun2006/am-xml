package com.bendingspoons.oracle.impl.authentication;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "LogoutFailed", "LoginFailed", "LoginCancelled", "LoginFailedBackendError", "RefreshFailed", "MigrationFailed", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LoginCancelled;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LoginFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LoginFailedBackendError;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LogoutFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$MigrationFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$RefreshFailed;", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AuthenticationException extends Exception {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LoginCancelled;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoginCancelled extends AuthenticationException {
        /* JADX WARN: Multi-variable type inference failed */
        public LoginCancelled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LoginCancelled(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Login cancelled by user" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginCancelled(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LoginFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoginFailed extends AuthenticationException {
        /* JADX WARN: Multi-variable type inference failed */
        public LoginFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LoginFailed(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Login operation failed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginFailed(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LoginFailedBackendError;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoginFailedBackendError extends AuthenticationException {
        /* JADX WARN: Multi-variable type inference failed */
        public LoginFailedBackendError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LoginFailedBackendError(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Login operation failed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginFailedBackendError(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$LogoutFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogoutFailed extends AuthenticationException {
        /* JADX WARN: Multi-variable type inference failed */
        public LogoutFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ LogoutFailed(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Logout operation failed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoutFailed(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$MigrationFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "", "message", "", "httpCode", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", c.f62177j, "Ljava/lang/Integer;", "getHttpCode", "()Ljava/lang/Integer;", "t", "getErrorCode", "O", "j", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MigrationFailed extends AuthenticationException {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final Integer httpCode;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final Integer errorCode;

        public MigrationFailed() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ MigrationFailed(String str, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "User migration operation failed" : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigrationFailed(String message, Integer num, Integer num2) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.httpCode = num;
            this.errorCode = num2;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException$RefreshFailed;", "Lcom/bendingspoons/oracle/impl/authentication/AuthenticationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RefreshFailed extends AuthenticationException {
        /* JADX WARN: Multi-variable type inference failed */
        public RefreshFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ RefreshFailed(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Token refresh operation failed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshFailed(String message) {
            super(message, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public /* synthetic */ AuthenticationException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public AuthenticationException(String str) {
        super(str);
    }
}
