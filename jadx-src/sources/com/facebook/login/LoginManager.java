package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.view.result.ActivityResultRegistryOwner;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.Lu;
import com.facebook.internal.Ml;
import com.facebook.login.LoginClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0003nMoB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JS\u0010\u001d\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JO\u0010/\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u0001042\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b8\u00109J3\u0010=\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:2\b\u0010<\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0017¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\bA\u0010BJ\u001d\u0010E\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\f2\u0006\u0010D\u001a\u00020CH\u0014¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020!2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\bI\u0010JR$\u0010Q\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010W\u001a\u00020R2\u0006\u0010L\u001a\u00020R8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010`\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010]R\u0016\u0010c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u000eR$\u0010h\u001a\u00020d2\u0006\u0010L\u001a\u00020d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010e\u001a\u0004\bf\u0010gR$\u0010i\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010\u000e\u001a\u0004\bi\u0010jR$\u0010m\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bk\u0010\u000e\u001a\u0004\bl\u0010j¨\u0006p"}, d2 = {"Lcom/facebook/login/LoginManager;", "", "<init>", "()V", "", "", "permissions", "", "aYN", "(Ljava/util/Collection;)V", "Lcom/facebook/login/afx;", "startActivityDelegate", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Z", "(Lcom/facebook/login/afx;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/content/Context;", "context", "loginRequest", "az", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Request;)V", "Lcom/facebook/login/LoginClient$Result$j;", "result", "", "resultExtras", "Ljava/lang/Exception;", "exception", "", "wasLoginActivityTried", "mUb", "(Landroid/content/Context;Lcom/facebook/login/LoginClient$Result$j;Ljava/util/Map;Ljava/lang/Exception;ZLcom/facebook/login/LoginClient$Request;)V", "S", "(Lcom/facebook/login/afx;Lcom/facebook/login/LoginClient$Request;)Z", "Landroid/content/Intent;", "intent", "r", "(Landroid/content/Intent;)Z", "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "origRequest", "Lcom/facebook/FacebookException;", "isCanceled", "Lcom/facebook/aC;", "Lcom/facebook/login/Q;", "callback", "Uo", "(Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Lcom/facebook/login/LoginClient$Request;Lcom/facebook/FacebookException;ZLcom/facebook/aC;)V", "isExpressLoginAllowed", "o", "(Z)V", "Lcom/facebook/Dsr;", "callbackManager", "ck", "(Lcom/facebook/Dsr;Lcom/facebook/aC;)V", "WPU", "(Lcom/facebook/Dsr;)V", "", "resultCode", "data", "ty", "(ILandroid/content/Intent;Lcom/facebook/aC;)Z", "Landroid/app/Activity;", "activity", "qie", "(Landroid/app/Activity;Ljava/util/Collection;)V", "Lcom/facebook/login/Xo;", "loginConfig", "gh", "(Landroid/app/Activity;Lcom/facebook/login/Xo;)V", "J2", "(Lcom/facebook/login/Xo;)Lcom/facebook/login/LoginClient$Request;", "KN", "(Lcom/facebook/login/LoginClient$Request;)Landroid/content/Intent;", "Lcom/facebook/login/Pl;", "<set-?>", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lcom/facebook/login/Pl;", "getLoginBehavior", "()Lcom/facebook/login/Pl;", "loginBehavior", "Lcom/facebook/login/Ml;", "rl", "Lcom/facebook/login/Ml;", "getDefaultAudience", "()Lcom/facebook/login/Ml;", "defaultAudience", "Landroid/content/SharedPreferences;", "t", "Landroid/content/SharedPreferences;", "sharedPreferences", "nr", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "authType", "O", "messengerPageId", "resetMessengerState", "Lcom/facebook/login/r;", "Lcom/facebook/login/r;", "getLoginTargetApp", "()Lcom/facebook/login/r;", "loginTargetApp", "isFamilyLogin", "()Z", "xMQ", "getShouldSkipAccountDeduplication", "shouldSkipAccountDeduplication", "j", "w6", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LoginManager {
    private static volatile LoginManager az;
    private static final Set gh;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final String qie;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean resetMessengerState;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean isFamilyLogin;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private String messengerPageId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean shouldSkipAccountDeduplication;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Pl loginBehavior = Pl.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Ml defaultAudience = Ml.FRIENDS;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private String authType = "rerequest";

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private r loginTargetApp = r.FACEBOOK;

    private static final class j implements afx {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Activity f52916n;

        public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, "com.facebook");
            p0.startActivityForResult(p1, p2);
        }

        public j(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f52916n = activity;
        }

        @Override // com.facebook.login.afx
        public Activity n() {
            return this.f52916n;
        }

        @Override // com.facebook.login.afx
        public void startActivityForResult(Intent intent, int i2) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(n(), intent, i2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginManager$n, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean O(String str) {
            return str != null && (StringsKt.startsWith$default(str, "publish", false, 2, (Object) null) || StringsKt.startsWith$default(str, "manage", false, 2, (Object) null) || LoginManager.gh.contains(str));
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set nr() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        public final Q rl(LoginClient.Request request, AccessToken newToken, AuthenticationToken authenticationToken) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            Set setTy = request.getPermissions();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.getPermissions()));
            if (request.getIsRerequest()) {
                mutableSet.retainAll(setTy);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(setTy));
            mutableSet2.removeAll(mutableSet);
            return new Q(newToken, authenticationToken, mutableSet, mutableSet2);
        }

        public LoginManager t() {
            if (LoginManager.az == null) {
                synchronized (this) {
                    LoginManager.az = new LoginManager();
                    Unit unit = Unit.INSTANCE;
                }
            }
            LoginManager loginManager = LoginManager.az;
            if (loginManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("instance");
                return null;
            }
            return loginManager;
        }
    }

    public static void safedk_afx_startActivityForResult_cf2322b84c28bc6227ea23cca3c9329a(afx p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/login/afx;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    public static LoginManager xMQ() {
        return INSTANCE.t();
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f52917n = new w6();
        private static C1870c rl;

        /* JADX WARN: Removed duplicated region for block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[DONT_GENERATE] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized C1870c n(Context context) {
            if (context == null) {
                context = com.facebook.s4.qie();
                if (context != null) {
                    return null;
                }
                if (rl == null) {
                    rl = new C1870c(context, com.facebook.s4.az());
                }
                return rl;
            }
            if (context != null) {
            }
        }

        private w6() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        gh = companion.nr();
        String string = LoginManager.class.toString();
        Intrinsics.checkNotNullExpressionValue(string, "LoginManager::class.java.toString()");
        qie = string;
    }

    public static /* synthetic */ boolean HI(LoginManager loginManager, int i2, Intent intent, com.facebook.aC aCVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i3 & 4) != 0) {
            aCVar = null;
        }
        return loginManager.ty(i2, intent, aCVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ik(LoginManager this$0, com.facebook.aC aCVar, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.ty(i2, intent, aCVar);
    }

    private final void Uo(AccessToken newToken, AuthenticationToken newIdToken, LoginClient.Request origRequest, FacebookException exception, boolean isCanceled, com.facebook.aC callback) {
        if (newToken != null) {
            AccessToken.INSTANCE.KN(newToken);
            Profile.INSTANCE.n();
        }
        if (newIdToken != null) {
            AuthenticationToken.INSTANCE.n(newIdToken);
        }
        if (callback != null) {
            Q qRl = (newToken == null || origRequest == null) ? null : INSTANCE.rl(origRequest, newToken, newIdToken);
            if (isCanceled || (qRl != null && qRl.rl().isEmpty())) {
                callback.onCancel();
                return;
            }
            if (exception != null) {
                callback.onError(exception);
            } else {
                if (newToken == null || qRl == null) {
                    return;
                }
                o(true);
                callback.onSuccess(qRl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean XQ(LoginManager this$0, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return HI(this$0, i2, intent, null, 4, null);
    }

    private final void aYN(Collection permissions) {
        if (permissions == null) {
            return;
        }
        Iterator it = permissions.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (INSTANCE.O(str)) {
                throw new FacebookException("Cannot pass a publish or manage permission (" + str + ") to a request for read authorization");
            }
        }
    }

    private final void az(Context context, LoginClient.Request loginRequest) {
        C1870c c1870cN = w6.f52917n.n(context);
        if (c1870cN == null || loginRequest == null) {
            return;
        }
        c1870cN.xMQ(loginRequest, loginRequest.getIsFamilyLogin() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    private final void mUb(Context context, LoginClient.Result.j result, Map resultExtras, Exception exception, boolean wasLoginActivityTried, LoginClient.Request request) {
        C1870c c1870cN = w6.f52917n.n(context);
        if (c1870cN == null) {
            return;
        }
        if (request == null) {
            C1870c.gh(c1870cN, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("try_login_activity", wasLoginActivityTried ? "1" : "0");
        c1870cN.J2(request.getAuthId(), map, result, resultExtras, exception, request.getIsFamilyLogin() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    private final void o(boolean isExpressLoginAllowed) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("express_login_allowed", isExpressLoginAllowed);
        editorEdit.apply();
    }

    protected LoginClient.Request J2(Xo loginConfig) {
        String strN;
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        com.facebook.login.j jVar = com.facebook.login.j.S256;
        try {
            strN = g9s.rl(loginConfig.n(), jVar);
        } catch (FacebookException unused) {
            jVar = com.facebook.login.j.PLAIN;
            strN = loginConfig.n();
        }
        com.facebook.login.j jVar2 = jVar;
        String str = strN;
        Pl pl = this.loginBehavior;
        Set set = CollectionsKt.toSet(loginConfig.t());
        Ml ml = this.defaultAudience;
        String str2 = this.authType;
        String strAz = com.facebook.s4.az();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(pl, set, ml, str2, strAz, string, this.loginTargetApp, loginConfig.rl(), loginConfig.n(), str, jVar2);
        request.WPU(AccessToken.INSTANCE.Uo());
        request.XQ(this.messengerPageId);
        request.aYN(this.resetMessengerState);
        request.Z(this.isFamilyLogin);
        request.ViF(this.shouldSkipAccountDeduplication);
        return request;
    }

    protected Intent KN(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        intent.setClass(com.facebook.s4.qie(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(AdActivity.REQUEST_KEY_EXTRA, request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final void WPU(com.facebook.Dsr callbackManager) {
        if (!(callbackManager instanceof com.facebook.internal.Ml)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.Ml) callbackManager).t(Ml.w6.Login.rl());
    }

    public final void ck(com.facebook.Dsr callbackManager, final com.facebook.aC callback) {
        if (!(callbackManager instanceof com.facebook.internal.Ml)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((com.facebook.internal.Ml) callbackManager).rl(Ml.w6.Login.rl(), new Ml.j() { // from class: com.facebook.login.s4
            @Override // com.facebook.internal.Ml.j
            public final boolean n(int i2, Intent intent) {
                return LoginManager.Ik(this.f52986n, callback, i2, intent);
            }
        });
    }

    public final void gh(Activity activity, Xo loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        if (activity instanceof ActivityResultRegistryOwner) {
            Log.w(qie, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        Z(new j(activity), J2(loginConfig));
    }

    public final void qie(Activity activity, Collection permissions) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        aYN(permissions);
        gh(activity, new Xo(permissions, null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ty(int resultCode, Intent data, com.facebook.aC callback) {
        LoginClient.Result.j jVar;
        boolean z2;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        Map map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.j jVar2 = LoginClient.Result.j.ERROR;
        FacebookException facebookException = null;
        if (data != null) {
            data.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) data.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request2 = result.com.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String;
                LoginClient.Result.j jVar3 = result.code;
                if (resultCode != -1) {
                    z = resultCode == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (jVar3 == LoginClient.Result.j.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                request = request2;
                z2 = z;
                authenticationToken = authenticationToken2;
                jVar = jVar3;
            } else {
                jVar = jVar2;
                accessToken = null;
                authenticationToken = null;
                map = null;
                request = null;
                z2 = false;
            }
        } else if (resultCode == 0) {
            jVar = LoginClient.Result.j.CANCEL;
            z2 = true;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
        }
        if (facebookException == null && accessToken == null && !z2) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        mUb(null, jVar, map, facebookException2, true, request);
        Uo(accessToken, authenticationToken, request, facebookException2, z2, callback);
        return true;
    }

    public LoginManager() {
        Lu.qie();
        SharedPreferences sharedPreferences = com.facebook.s4.qie().getSharedPreferences("com.facebook.loginManager", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (com.facebook.s4.Ik && com.facebook.internal.Wre.n() != null) {
            CustomTabsClient.n(com.facebook.s4.qie(), "com.android.chrome", new com.facebook.login.w6());
            CustomTabsClient.rl(com.facebook.s4.qie(), com.facebook.s4.qie().getPackageName());
        }
    }

    private final boolean S(afx startActivityDelegate, LoginClient.Request request) {
        Intent intentKN = KN(request);
        if (!r(intentKN)) {
            return false;
        }
        try {
            safedk_afx_startActivityForResult_cf2322b84c28bc6227ea23cca3c9329a(startActivityDelegate, intentKN, LoginClient.INSTANCE.rl());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final void Z(afx startActivityDelegate, LoginClient.Request request) {
        az(startActivityDelegate.n(), request);
        com.facebook.internal.Ml.rl.t(Ml.w6.Login.rl(), new Ml.j() { // from class: com.facebook.login.UGc
            @Override // com.facebook.internal.Ml.j
            public final boolean n(int i2, Intent intent) {
                return LoginManager.XQ(this.f52951n, i2, intent);
            }
        });
        if (S(startActivityDelegate, request)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        mUb(startActivityDelegate.n(), LoginClient.Result.j.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    private final boolean r(Intent intent) {
        if (com.facebook.s4.qie().getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        return true;
    }
}
