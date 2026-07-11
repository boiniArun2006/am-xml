package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.facebook.FacebookException;
import com.facebook.internal.Md;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 82\u00020\u0001:\u00029:B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00102\u001a\u00020(8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,R\u001a\u00107\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b!\u00106¨\u0006;"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "xMQ", "()Z", "", "rl", "()V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "HI", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", IV8ValueMap.FUNCTION_VALUES, "Lcom/facebook/FacebookException;", MRAIDPresenter.ERROR, "WPU", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/facebook/internal/Md;", "o", "Lcom/facebook/internal/Md;", "getLoginDialog", "()Lcom/facebook/internal/Md;", "setLoginDialog", "(Lcom/facebook/internal/Md;)V", "loginDialog", "", "Z", "Ljava/lang/String;", "getE2e", "()Ljava/lang/String;", "setE2e", "(Ljava/lang/String;)V", "e2e", "S", "J2", "nameForLogging", "Lcom/facebook/CN3;", "g", "Lcom/facebook/CN3;", "()Lcom/facebook/CN3;", "tokenSource", "E2", "j", "w6", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final String nameForLogging;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private String e2e;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.CN3 tokenSource;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Md loginDialog;

    @JvmField
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new n();

    public static final class Ml implements Md.Ml {
        final /* synthetic */ LoginClient.Request rl;

        Ml(LoginClient.Request request) {
            this.rl = request;
        }

        @Override // com.facebook.internal.Md.Ml
        public void n(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.WPU(this.rl, bundle, facebookException);
        }
    }

    public final class j extends Md.j {
        final /* synthetic */ WebViewLoginMethodHandler HI;
        private String KN;
        public String az;
        private boolean gh;
        private r mUb;
        private boolean qie;
        public String ty;
        private Pl xMQ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String applicationId, Bundle parameters) {
            super(context, applicationId, "oauth", parameters);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.HI = webViewLoginMethodHandler;
            this.KN = "fbconnect://success";
            this.xMQ = Pl.NATIVE_WITH_FALLBACK;
            this.mUb = r.FACEBOOK;
        }

        public final j HI(boolean z2) {
            this.gh = z2;
            return this;
        }

        public final j Ik(Pl loginBehavior) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            this.xMQ = loginBehavior;
            return this;
        }

        public final j az(String e2e) {
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            ty(e2e);
            return this;
        }

        public final j ck(boolean z2) {
            this.KN = z2 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final j gh(String authType) {
            Intrinsics.checkNotNullParameter(authType, "authType");
            qie(authType);
            return this;
        }

        public final String mUb() {
            String str = this.az;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("e2e");
            return null;
        }

        public final j o(boolean z2) {
            this.qie = z2;
            return this;
        }

        public final void qie(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.ty = str;
        }

        public final j r(r targetApp) {
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            this.mUb = targetApp;
            return this;
        }

        public final void ty(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.az = str;
        }

        public final String xMQ() {
            String str = this.ty;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("authType");
            return null;
        }

        @Override // com.facebook.internal.Md.j
        public Md n() {
            String str;
            Bundle bundleJ2 = J2();
            Intrinsics.checkNotNull(bundleJ2, "null cannot be cast to non-null type android.os.Bundle");
            bundleJ2.putString("redirect_uri", this.KN);
            bundleJ2.putString("client_id", t());
            bundleJ2.putString("e2e", mUb());
            if (this.mUb == r.INSTAGRAM) {
                str = "token,signed_request,graph_domain,granted_scopes";
            } else {
                str = "token,signed_request,graph_domain";
            }
            bundleJ2.putString("response_type", str);
            bundleJ2.putString("return_scopes", "true");
            bundleJ2.putString("auth_type", xMQ());
            bundleJ2.putString("login_behavior", this.xMQ.name());
            if (this.gh) {
                bundleJ2.putString("fx_app", this.mUb.toString());
            }
            if (this.qie) {
                bundleJ2.putString("skip_dedupe", "true");
            }
            Md.n nVar = Md.f52686T;
            Context contextNr = nr();
            Intrinsics.checkNotNull(contextNr, "null cannot be cast to non-null type android.content.Context");
            return nVar.nr(contextNr, "oauth", bundleJ2, Uo(), this.mUb, O());
        }
    }

    public static final class n implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new WebViewLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int i2) {
            return new WebViewLoginMethodHandler[i2];
        }

        n() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "web_view";
        this.tokenSource = com.facebook.CN3.WEB_VIEW;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean xMQ() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int HI(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundleIk = Ik(request);
        Ml ml = new Ml(request);
        String strN = LoginClient.INSTANCE.n();
        this.e2e = strN;
        n("e2e", strN);
        FragmentActivity fragmentActivityXMQ = nr().xMQ();
        if (fragmentActivityXMQ == null) {
            return 0;
        }
        boolean zM = vd.M(fragmentActivityXMQ);
        j jVar = new j(this, fragmentActivityXMQ, request.getApplicationId(), bundleIk);
        String str = this.e2e;
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
        this.loginDialog = jVar.az(str).ck(zM).gh(request.getAuthType()).Ik(request.getLoginBehavior()).r(request.getLoginTargetApp()).HI(request.getIsFamilyLogin()).o(request.getShouldSkipAccountDeduplication()).KN(ml).n();
        com.facebook.internal.Dsr dsr = new com.facebook.internal.Dsr();
        dsr.setRetainInstance(true);
        dsr.e(this.loginDialog);
        dsr.show(fragmentActivityXMQ.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: J2, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void WPU(LoginClient.Request request, Bundle values, FacebookException error) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.XQ(request, values, error);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: o, reason: from getter */
    public com.facebook.CN3 getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void rl() {
        Md md = this.loginDialog;
        if (md != null) {
            if (md != null) {
                md.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.e2e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = com.facebook.CN3.WEB_VIEW;
        this.e2e = source.readString();
    }
}
