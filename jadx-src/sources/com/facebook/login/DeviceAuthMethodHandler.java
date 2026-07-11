package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u00010B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0085\u0001\u0010(\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0010\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010/\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.¨\u00061"}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "S", "(Lcom/facebook/login/LoginClient$Request;)V", "", "HI", "(Lcom/facebook/login/LoginClient$Request;)I", "Lcom/facebook/login/DeviceAuthDialog;", "r", "()Lcom/facebook/login/DeviceAuthDialog;", "o", "()V", "Ljava/lang/Exception;", "ex", "Z", "(Ljava/lang/Exception;)V", "", "accessToken", "applicationId", "userId", "", "permissions", "declinedPermissions", "expiredPermissions", "Lcom/facebook/CN3;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "XQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/CN3;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "describeContents", "()I", "J2", "Ljava/lang/String;", "()Ljava/lang/String;", "nameForLogging", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f52862o;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final String nameForLogging;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new j();

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DeviceAuthMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i2) {
            return new DeviceAuthMethodHandler[i2];
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$n, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor n() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (DeviceAuthMethodHandler.f52862o == null) {
                    DeviceAuthMethodHandler.f52862o = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f52862o;
                if (scheduledThreadPoolExecutor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                    scheduledThreadPoolExecutor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return scheduledThreadPoolExecutor;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "device_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int HI(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        S(request);
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: J2, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public void XQ(String accessToken, String applicationId, String userId, Collection permissions, Collection declinedPermissions, Collection expiredPermissions, com.facebook.CN3 accessTokenSource, Date expirationTime, Date lastRefreshTime, Date dataAccessExpirationTime) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        nr().Uo(LoginClient.Result.INSTANCE.O(nr().getPendingRequest(), new AccessToken(accessToken, applicationId, userId, permissions, declinedPermissions, expiredPermissions, accessTokenSource, expirationTime, lastRefreshTime, dataAccessExpirationTime, null, 1024, null)));
    }

    public void Z(Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        nr().Uo(LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, nr().getPendingRequest(), null, ex.getMessage(), null, 8, null));
    }

    public void o() {
        nr().Uo(LoginClient.Result.INSTANCE.n(nr().getPendingRequest(), "User canceled log in."));
    }

    protected DeviceAuthDialog r() {
        return new DeviceAuthDialog();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }

    private final void S(LoginClient.Request request) {
        FragmentActivity fragmentActivityXMQ = nr().xMQ();
        if (fragmentActivityXMQ != null && !fragmentActivityXMQ.isFinishing()) {
            DeviceAuthDialog deviceAuthDialogR = r();
            deviceAuthDialogR.show(fragmentActivityXMQ.getSupportFragmentManager(), "login_with_facebook");
            deviceAuthDialogR.B(request);
        }
    }
}
