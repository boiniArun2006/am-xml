package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.internal.DAz;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.Scopes;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001!B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006\""}, d2 = {"Lcom/facebook/login/GetTokenLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "rl", "()V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "HI", "(Lcom/facebook/login/LoginClient$Request;)I", "Landroid/os/Bundle;", "result", "r", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)V", "o", "Ik", "describeContents", "()I", "Lcom/facebook/login/o;", "J2", "Lcom/facebook/login/o;", "getTokenClient", "", "Ljava/lang/String;", "()Ljava/lang/String;", "nameForLogging", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private o getTokenClient;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String nameForLogging;

    @JvmField
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new j();

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new GetTokenLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i2) {
            return new GetTokenLoginMethodHandler[i2];
        }

        j() {
        }
    }

    public static final class w6 implements vd.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f52868n;
        final /* synthetic */ GetTokenLoginMethodHandler rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LoginClient.Request f52869t;

        w6(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f52868n = bundle;
            this.rl = getTokenLoginMethodHandler;
            this.f52869t = request;
        }

        @Override // com.facebook.internal.vd.j
        public void n(JSONObject jSONObject) {
            try {
                this.f52868n.putString("com.facebook.platform.extra.USER_ID", jSONObject != null ? jSONObject.getString("id") : null);
                this.rl.o(this.f52869t, this.f52868n);
            } catch (JSONException e2) {
                this.rl.nr().J2(LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, this.rl.nr().getPendingRequest(), "Caught exception", e2.getMessage(), null, 8, null));
            }
        }

        @Override // com.facebook.internal.vd.j
        public void rl(FacebookException facebookException) {
            this.rl.nr().J2(LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, this.rl.nr().getPendingRequest(), "Caught exception", facebookException != null ? facebookException.getMessage() : null, null, 8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "get_token";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(GetTokenLoginMethodHandler this$0, LoginClient.Request request, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        this$0.r(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int HI(final LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Context contextXMQ = nr().xMQ();
        if (contextXMQ == null) {
            contextXMQ = com.facebook.s4.qie();
        }
        o oVar = new o(contextXMQ, request);
        this.getTokenClient = oVar;
        if (!oVar.mUb()) {
            return 0;
        }
        nr().r();
        DAz.n nVar = new DAz.n() { // from class: com.facebook.login.qz
            @Override // com.facebook.internal.DAz.n
            public final void n(Bundle bundle) {
                GetTokenLoginMethodHandler.Z(this.f52981n, request, bundle);
            }
        };
        o oVar2 = this.getTokenClient;
        if (oVar2 == null) {
            return 1;
        }
        oVar2.xMQ(nVar);
        return 1;
    }

    public final void Ik(LoginClient.Request request, Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        String string = result.getString("com.facebook.platform.extra.USER_ID");
        if (string != null && string.length() != 0) {
            o(request, result);
            return;
        }
        nr().r();
        String string2 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.checkNotNullExpressionValue(string2, "checkNotNull(result.getS…ocol.EXTRA_ACCESS_TOKEN))");
        vd.T(string2, new w6(result, this, request));
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: J2, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public final void o(LoginClient.Request request, Bundle result) {
        LoginClient.Result resultNr;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            resultNr = LoginClient.Result.INSTANCE.rl(request, companion.n(result, com.facebook.CN3.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId()), companion.t(result, request.getNonce()));
        } catch (FacebookException e2) {
            resultNr = LoginClient.Result.Companion.nr(LoginClient.Result.INSTANCE, nr().getPendingRequest(), null, e2.getMessage(), null, 8, null);
        }
        nr().Uo(resultNr);
    }

    public final void r(LoginClient.Request request, Bundle result) {
        Intrinsics.checkNotNullParameter(request, "request");
        o oVar = this.getTokenClient;
        if (oVar != null) {
            oVar.xMQ(null);
        }
        this.getTokenClient = null;
        nr().o();
        if (result != null) {
            List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = CollectionsKt.emptyList();
            }
            Set<String> permissions = request.getPermissions();
            if (permissions == null) {
                permissions = SetsKt.emptySet();
            }
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (permissions.contains(Scopes.OPEN_ID) && (string == null || string.length() == 0)) {
                nr().g();
                return;
            }
            if (stringArrayList.containsAll(permissions)) {
                Ik(request, result);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : permissions) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                n("new_permissions", TextUtils.join(",", hashSet));
            }
            request.S(hashSet);
        }
        nr().g();
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void rl() {
        o oVar = this.getTokenClient;
        if (oVar != null) {
            oVar.O();
            oVar.xMQ(null);
            this.getTokenClient = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "get_token";
    }
}
