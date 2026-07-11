package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultLauncher;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.qf;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010#\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b%\u0010\u000fJ!\u0010&\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u0014H\u0014¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u0004\u0018\u00010\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u0004\u0018\u00010\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b*\u0010)J!\u0010+\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b+\u0010,R\u001a\u00102\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/os/Bundle;", "extras", "", "ViF", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", "Lcom/facebook/login/LoginClient$Result;", "outcome", "Ik", "(Lcom/facebook/login/LoginClient$Result;)V", "Landroid/content/Intent;", "intent", "", "aYN", "(Landroid/content/Intent;)Z", "", "requestCode", "resultCode", "data", "mUb", "(IILandroid/content/Intent;)Z", "", MRAIDPresenter.ERROR, "errorMessage", "errorCode", "S", "(Lcom/facebook/login/LoginClient$Request;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "WPU", "XQ", "(Lcom/facebook/login/LoginClient$Request;Landroid/content/Intent;)V", "r", "(Landroid/os/Bundle;)Ljava/lang/String;", "o", "g", "(Landroid/content/Intent;I)Z", "Lcom/facebook/CN3;", "J2", "Lcom/facebook/CN3;", "Z", "()Lcom/facebook/CN3;", "tokenSource", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final com.facebook.CN3 tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.tokenSource = com.facebook.CN3.FACEBOOK_APPLICATION_WEB;
    }

    protected void S(LoginClient.Request request, String error, String errorMessage, String errorCode) {
        if (error != null && Intrinsics.areEqual(error, "logged_out")) {
            CustomTabLoginMethodHandler.f52835X = true;
            Ik(null);
        } else if (CollectionsKt.contains(qf.nr(), error)) {
            Ik(null);
        } else if (CollectionsKt.contains(qf.O(), error)) {
            Ik(LoginClient.Result.INSTANCE.n(request, null));
        } else {
            Ik(LoginClient.Result.INSTANCE.t(request, error, errorMessage, errorCode));
        }
    }

    protected boolean g(Intent intent, int requestCode) {
        ActivityResultLauncher activityResultLauncherTe;
        if (intent == null || !aYN(intent)) {
            return false;
        }
        Fragment fragment = nr().getFragment();
        Unit unit = null;
        QJ qj = fragment instanceof QJ ? (QJ) fragment : null;
        if (qj != null && (activityResultLauncherTe = qj.te()) != null) {
            activityResultLauncherTe.n(intent);
            unit = Unit.INSTANCE;
        }
        return unit != null;
    }

    private final void Ik(LoginClient.Result outcome) {
        if (outcome != null) {
            nr().Uo(outcome);
        } else {
            nr().g();
        }
    }

    private final void ViF(final LoginClient.Request request, final Bundle extras) {
        if (!extras.containsKey("code") || vd.I(extras.getString("code"))) {
            WPU(request, extras);
        } else {
            com.facebook.s4.Z().execute(new Runnable() { // from class: com.facebook.login.SPz
                @Override // java.lang.Runnable
                public final void run() {
                    NativeAppLoginMethodHandler.nY(this.f52949n, request, extras);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(NativeAppLoginMethodHandler this$0, LoginClient.Request request, Bundle extras) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(extras, "$extras");
        try {
            this$0.WPU(request, this$0.gh(request, extras));
        } catch (FacebookServiceException e2) {
            FacebookRequestError requestError = e2.getRequestError();
            this$0.S(request, requestError.getErrorType(), requestError.t(), String.valueOf(requestError.getErrorCode()));
        } catch (FacebookException e3) {
            this$0.S(request, null, e3.getMessage(), null);
        }
    }

    protected void WPU(LoginClient.Request request, Bundle extras) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            Ik(LoginClient.Result.INSTANCE.rl(request, companion.rl(request.getPermissions(), extras, getTokenSource(), request.getApplicationId()), companion.nr(extras, request.getNonce())));
        } catch (FacebookException e2) {
            Ik(LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, request, null, e2.getMessage(), null, 8, null));
        }
    }

    protected void XQ(LoginClient.Request request, Intent data) {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle extras = data.getExtras();
        String strR = r(extras);
        String string = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
        if (Intrinsics.areEqual(qf.t(), string)) {
            Ik(LoginClient.Result.INSTANCE.t(request, strR, o(extras), string));
        } else {
            Ik(LoginClient.Result.INSTANCE.n(request, strR));
        }
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public com.facebook.CN3 getTokenSource() {
        return this.tokenSource;
    }

    protected String o(Bundle extras) {
        String string;
        if (extras != null && (string = extras.getString("error_message")) != null) {
            return string;
        }
        if (extras != null) {
            return extras.getString("error_description");
        }
        return null;
    }

    protected String r(Bundle extras) {
        String string;
        if (extras != null && (string = extras.getString(MRAIDPresenter.ERROR)) != null) {
            return string;
        }
        if (extras != null) {
            return extras.getString("error_type");
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.tokenSource = com.facebook.CN3.FACEBOOK_APPLICATION_WEB;
    }

    private final boolean aYN(Intent intent) {
        Intrinsics.checkNotNullExpressionValue(com.facebook.s4.qie().getPackageManager().queryIntentActivities(intent, 65536), "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean mUb(int requestCode, int resultCode, Intent data) {
        String string;
        LoginClient.Request pendingRequest = nr().getPendingRequest();
        if (data == null) {
            Ik(LoginClient.Result.INSTANCE.n(pendingRequest, "Operation canceled"));
        } else if (resultCode == 0) {
            XQ(pendingRequest, data);
        } else if (resultCode != -1) {
            Ik(LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = data.getExtras();
            if (extras == null) {
                Ik(LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String strR = r(extras);
            Object obj = extras.get("error_code");
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            String strO = o(extras);
            String string2 = extras.getString("e2e");
            if (!vd.I(string2)) {
                KN(string2);
            }
            if (strR == null && string == null && strO == null && pendingRequest != null) {
                ViF(pendingRequest, extras);
            } else {
                S(pendingRequest, strR, strO, string);
            }
        }
        return true;
    }
}
