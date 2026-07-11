package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.Scopes;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00102\u00020\u0001:\u0001%B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "Z", "()Ljava/lang/String;", "token", "", "S", "(Ljava/lang/String;)V", "r", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/os/Bundle;", "Ik", "(Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", "parameters", "ck", "(Landroid/os/Bundle;Lcom/facebook/login/LoginClient$Request;)Landroid/os/Bundle;", IV8ValueMap.FUNCTION_VALUES, "Lcom/facebook/FacebookException;", MRAIDPresenter.ERROR, "XQ", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "J2", "Ljava/lang/String;", "e2e", "Lcom/facebook/CN3;", "o", "()Lcom/facebook/CN3;", "tokenSource", "j", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nWebLoginMethodHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebLoginMethodHandler.kt\ncom/facebook/login/WebLoginMethodHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private String e2e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
    }

    /* JADX INFO: renamed from: o */
    public abstract com.facebook.CN3 getTokenSource();

    protected String r() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    protected Bundle Ik(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        if (!vd.GR(request.getPermissions())) {
            String strJoin = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", strJoin);
            n("scope", strJoin);
        }
        Ml defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = Ml.NONE;
        }
        bundle.putString("default_audience", defaultAudience.rl());
        bundle.putString("state", t(request.getAuthId()));
        AccessToken accessTokenO = AccessToken.INSTANCE.O();
        String token = accessTokenO != null ? accessTokenO.getToken() : null;
        if (token == null || !Intrinsics.areEqual(token, Z())) {
            FragmentActivity fragmentActivityXMQ = nr().xMQ();
            if (fragmentActivityXMQ != null) {
                vd.xMQ(fragmentActivityXMQ);
            }
            n("access_token", "0");
        } else {
            bundle.putString("access_token", token);
            n("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", com.facebook.s4.ck() ? "1" : "0");
        return bundle;
    }

    public void XQ(LoginClient.Request request, Bundle values, FacebookException error) {
        String strValueOf;
        LoginClient.Result resultT;
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient loginClientNr = nr();
        this.e2e = null;
        if (values != null) {
            if (values.containsKey("e2e")) {
                this.e2e = values.getString("e2e");
            }
            try {
                LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
                AccessToken accessTokenRl = companion.rl(request.getPermissions(), values, getTokenSource(), request.getApplicationId());
                resultT = LoginClient.Result.INSTANCE.rl(loginClientNr.getPendingRequest(), accessTokenRl, companion.nr(values, request.getNonce()));
                if (loginClientNr.xMQ() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientNr.xMQ()).sync();
                    } catch (Exception unused) {
                    }
                    if (accessTokenRl != null) {
                        S(accessTokenRl.getToken());
                    }
                }
            } catch (FacebookException e2) {
                resultT = LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, loginClientNr.getPendingRequest(), null, e2.getMessage(), null, 8, null);
            }
        } else if (error instanceof FacebookOperationCanceledException) {
            resultT = LoginClient.Result.INSTANCE.n(loginClientNr.getPendingRequest(), "User canceled log in.");
        } else {
            this.e2e = null;
            String message = error != null ? error.getMessage() : null;
            if (error instanceof FacebookServiceException) {
                FacebookRequestError requestError = ((FacebookServiceException) error).getRequestError();
                strValueOf = String.valueOf(requestError.getErrorCode());
                message = requestError.toString();
            } else {
                strValueOf = null;
            }
            resultT = LoginClient.Result.INSTANCE.t(loginClientNr.getPendingRequest(), null, message, strValueOf);
        }
        if (!vd.I(this.e2e)) {
            KN(this.e2e);
        }
        loginClientNr.Uo(resultT);
    }

    protected Bundle ck(Bundle parameters, LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(request, "request");
        parameters.putString("redirect_uri", getValidRedirectURI());
        if (request.r()) {
            parameters.putString("app_id", request.getApplicationId());
        } else {
            parameters.putString("client_id", request.getApplicationId());
        }
        parameters.putString("e2e", LoginClient.INSTANCE.n());
        if (request.r()) {
            parameters.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.getPermissions().contains(Scopes.OPEN_ID)) {
                parameters.putString("nonce", request.getNonce());
            }
            parameters.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        parameters.putString("code_challenge", request.getCodeChallenge());
        j codeChallengeMethod = request.getCodeChallengeMethod();
        parameters.putString("code_challenge_method", codeChallengeMethod != null ? codeChallengeMethod.name() : null);
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.getAuthType());
        parameters.putString("login_behavior", request.getLoginBehavior().name());
        parameters.putString("sdk", "android-" + com.facebook.s4.te());
        if (r() != null) {
            parameters.putString("sso", r());
        }
        parameters.putString("cct_prefetching", com.facebook.s4.Ik ? "1" : "0");
        if (request.getIsFamilyLogin()) {
            parameters.putString("fx_app", request.getLoginTargetApp().toString());
        }
        if (request.getShouldSkipAccountDeduplication()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.getMessengerPageId() != null) {
            parameters.putString("messenger_page_id", request.getMessengerPageId());
            parameters.putString("reset_messenger_state", request.getResetMessengerState() ? "1" : "0");
        }
        return parameters;
    }

    private final void S(String token) {
        Context contextXMQ = nr().xMQ();
        if (contextXMQ == null) {
            contextXMQ = com.facebook.s4.qie();
        }
        contextXMQ.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", token).apply();
    }

    private final String Z() {
        Context contextXMQ = nr().xMQ();
        if (contextXMQ == null) {
            contextXMQ = com.facebook.s4.qie();
        }
        return contextXMQ.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }
}
