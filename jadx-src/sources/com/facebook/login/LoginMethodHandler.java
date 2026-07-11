package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.appevents.rv6;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u000e\b'\u0018\u0000 72\u00020\u0001:\u0001BB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020,2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u0016R4\u0010;\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0005R\u0014\u0010A\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010 ¨\u0006C"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "HI", "(Lcom/facebook/login/LoginClient$Request;)I", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "mUb", "(IILandroid/content/Intent;)Z", "xMQ", "()Z", "", "rl", "()V", "Lorg/json/JSONObject;", "param", "qie", "(Lorg/json/JSONObject;)V", "", "Uo", "()Ljava/lang/String;", "authId", "t", "(Ljava/lang/String;)Ljava/lang/String;", "key", "", "value", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/lang/String;Ljava/lang/Object;)V", "e2e", "KN", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", IV8ValueMap.FUNCTION_VALUES, "gh", "(Lcom/facebook/login/LoginClient$Request;Landroid/os/Bundle;)Landroid/os/Bundle;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "ty", "", "Ljava/util/Map;", "O", "()Ljava/util/Map;", "setMethodLoggingExtras", "(Ljava/util/Map;)V", "methodLoggingExtras", "Lcom/facebook/login/LoginClient;", "nr", "()Lcom/facebook/login/LoginClient;", "az", "J2", "nameForLogging", "j", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Map methodLoggingExtras;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public LoginClient loginClient;

    /* JADX INFO: renamed from: com.facebook.login.LoginMethodHandler$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String O(String str) {
            if (str == null || str.length() == 0) {
                throw new FacebookException("Authorization response does not contain the signed_request");
            }
            try {
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (strArr.length == 2) {
                    byte[] data = Base64.decode(strArr[1], 0);
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    String string = new JSONObject(new String(data, Charsets.UTF_8)).getString("user_id");
                    Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"user_id\")");
                    return string;
                }
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            throw new FacebookException(dpcnwfoVOnrtRA.xdBEIX);
        }

        public final AccessToken n(Bundle bundle, com.facebook.CN3 cn3, String applicationId) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Date dateViF = vd.ViF(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateViF2 = vd.ViF(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, stringArrayList, null, null, cn3, dateViF, new Date(), dateViF2, bundle.getString("graph_domain"));
        }

        public final AuthenticationToken nr(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e2) {
                throw new FacebookException(e2.getMessage(), e2);
            }
        }

        public final AccessToken rl(Collection collection, Bundle bundle, com.facebook.CN3 cn3, String applicationId) {
            Collection collectionArrayListOf;
            ArrayList arrayListArrayListOf;
            ArrayList arrayListArrayListOf2;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Date dateViF = vd.ViF(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateViF2 = vd.ViF(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collectionArrayListOf = collection;
            } else {
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                collectionArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListArrayListOf = null;
            } else {
                String[] strArr2 = (String[]) StringsKt.split$default((CharSequence) string3, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                arrayListArrayListOf = CollectionsKt.arrayListOf(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListArrayListOf2 = null;
            } else {
                String[] strArr3 = (String[]) StringsKt.split$default((CharSequence) string4, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                arrayListArrayListOf2 = CollectionsKt.arrayListOf(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (vd.I(string)) {
                return null;
            }
            return new AccessToken(string, applicationId, O(bundle.getString("signed_request")), collectionArrayListOf, arrayListArrayListOf, arrayListArrayListOf2, cn3, dateViF, new Date(), dateViF2, bundle.getString("graph_domain"));
        }

        public final AuthenticationToken t(Bundle bundle, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new AuthenticationToken(string, str);
            } catch (Exception e2) {
                throw new FacebookException(e2.getMessage());
            }
        }
    }

    public LoginMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        az(loginClient);
    }

    public abstract int HI(LoginClient.Request request);

    /* JADX INFO: renamed from: J2 */
    public abstract String getNameForLogging();

    public boolean mUb(int requestCode, int resultCode, Intent data) {
        return false;
    }

    public void qie(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public void rl() {
    }

    public boolean ty() {
        return false;
    }

    public boolean xMQ() {
        return false;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Map getMethodLoggingExtras() {
        return this.methodLoggingExtras;
    }

    /* JADX INFO: renamed from: Uo */
    protected String getValidRedirectURI() {
        return "fb" + com.facebook.s4.az() + "://authorize/";
    }

    public final void az(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.loginClient = loginClient;
    }

    protected Bundle gh(LoginClient.Request request, Bundle values) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String string = values.getString("code");
        if (vd.I(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string != null) {
            String validRedirectURI = getValidRedirectURI();
            String strJ2 = request.getCodeVerifier();
            if (strJ2 == null) {
                strJ2 = "";
            }
            GraphRequest graphRequestN = g9s.n(string, validRedirectURI, strJ2);
            if (graphRequestN != null) {
                com.facebook.g9s g9sVarGh = graphRequestN.gh();
                FacebookRequestError facebookRequestErrorRl = g9sVarGh.rl();
                if (facebookRequestErrorRl != null) {
                    throw new FacebookServiceException(facebookRequestErrorRl, facebookRequestErrorRl.t());
                }
                try {
                    JSONObject jSONObjectT = g9sVarGh.t();
                    String string2 = jSONObjectT != null ? jSONObjectT.getString("access_token") : null;
                    if (jSONObjectT == null || vd.I(string2)) {
                        throw new FacebookException("No access token found from result");
                    }
                    values.putString("access_token", string2);
                    if (jSONObjectT.has("id_token")) {
                        values.putString("id_token", jSONObjectT.getString("id_token"));
                    }
                    return values;
                } catch (JSONException e2) {
                    throw new FacebookException("Fail to process code exchange response: " + e2.getMessage());
                }
            }
        }
        throw new FacebookException("Failed to create code exchange request");
    }

    protected void n(String key, Object value) {
        if (this.methodLoggingExtras == null) {
            this.methodLoggingExtras = new HashMap();
        }
        Map map = this.methodLoggingExtras;
        if (map != null) {
        }
    }

    public final LoginClient nr() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    protected String t(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", getNameForLogging());
            qie(jSONObject);
        } catch (JSONException e2) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e2.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "param.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        vd.UhV(dest, this.methodLoggingExtras);
    }

    protected LoginMethodHandler(Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Map mapFcU = vd.fcU(source);
        this.methodLoggingExtras = mapFcU != null ? MapsKt.toMutableMap(mapFcU) : null;
    }

    protected void KN(String e2e) {
        String strAz;
        LoginClient.Request requestHI = nr().getPendingRequest();
        if (requestHI == null || (strAz = requestHI.getApplicationId()) == null) {
            strAz = com.facebook.s4.az();
        }
        rv6 rv6Var = new rv6(nr().xMQ(), strAz);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", e2e);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", strAz);
        rv6Var.KN("fb_dialogs_web_login_dialog_complete", null, bundle);
    }
}
