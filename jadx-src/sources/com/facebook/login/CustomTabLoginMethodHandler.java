package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.vd;
import com.facebook.login.LoginClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 >2\u00020\u0001:\u0001?B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u001a\u00104\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0016R\u001a\u00109\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b+\u00108R\u0014\u0010;\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0016R\u0016\u0010=\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0016¨\u0006@"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "url", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "nY", "(Ljava/lang/String;Lcom/facebook/login/LoginClient$Request;)V", "Landroid/os/Bundle;", IV8ValueMap.FUNCTION_VALUES, "", "te", "(Landroid/os/Bundle;)Z", "Uo", "()Ljava/lang/String;", "r", "", "HI", "(Lcom/facebook/login/LoginClient$Request;)I", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "mUb", "(IILandroid/content/Intent;)Z", "Lorg/json/JSONObject;", "param", "qie", "(Lorg/json/JSONObject;)V", "describeContents", "()I", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "o", "Ljava/lang/String;", "currentPackage", "Z", "expectedChallenge", "S", "validRedirectURI", "g", "J2", "nameForLogging", "Lcom/facebook/CN3;", "E2", "Lcom/facebook/CN3;", "()Lcom/facebook/CN3;", "tokenSource", "ViF", "developerDefinedRedirectURI", "aYN", "chromePackage", "e", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static boolean f52835X;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final com.facebook.CN3 tokenSource;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private String validRedirectURI;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private String expectedChallenge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String nameForLogging;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String currentPackage;

    @JvmField
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new j();

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new CustomTabLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int i2) {
            return new CustomTabLoginMethodHandler[i2];
        }

        j() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = com.facebook.CN3.CHROME_CUSTOM_TAB;
        this.expectedChallenge = vd.Z(20);
        f52835X = false;
        this.validRedirectURI = com.facebook.internal.Wre.t(ViF());
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    private final boolean te(Bundle values) {
        try {
            String string = values.getString("state");
            if (string == null) {
                return false;
            }
            return Intrinsics.areEqual(new JSONObject(string).getString("7_challenge"), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean mUb(int requestCode, int resultCode, Intent data) {
        if (data != null && data.getBooleanExtra(CustomTabMainActivity.E2, false)) {
            return super.mUb(requestCode, resultCode, data);
        }
        if (requestCode != 1) {
            return super.mUb(requestCode, resultCode, data);
        }
        LoginClient.Request requestHI = nr().getPendingRequest();
        if (requestHI == null) {
            return false;
        }
        if (resultCode == -1) {
            nY(data != null ? data.getStringExtra(CustomTabMainActivity.f52136Z) : null, requestHI);
            return true;
        }
        super.XQ(requestHI, null, new FacebookOperationCanceledException());
        return false;
    }

    private final String aYN() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String strN = com.facebook.internal.Wre.n();
        this.currentPackage = strN;
        return strN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(CustomTabLoginMethodHandler this$0, LoginClient.Request request, Bundle values) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(values, "$values");
        try {
            this$0.XQ(request, this$0.gh(request, values), null);
        } catch (FacebookException e2) {
            this$0.XQ(request, null, e2);
        }
    }

    private final void nY(String url, final LoginClient.Request request) {
        int i2;
        if (url != null) {
            if (StringsKt.startsWith$default(url, "fbconnect://cct.", false, 2, (Object) null) || StringsKt.startsWith$default(url, super.getValidRedirectURI(), false, 2, (Object) null)) {
                Uri uri = Uri.parse(url);
                final Bundle bundlePJg = vd.pJg(uri.getQuery());
                bundlePJg.putAll(vd.pJg(uri.getFragment()));
                if (!te(bundlePJg)) {
                    super.XQ(request, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = bundlePJg.getString(MRAIDPresenter.ERROR);
                if (string == null) {
                    string = bundlePJg.getString("error_type");
                }
                String string2 = bundlePJg.getString("error_msg");
                if (string2 == null) {
                    string2 = bundlePJg.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundlePJg.getString("error_description");
                }
                String string3 = bundlePJg.getString("error_code");
                if (string3 != null) {
                    try {
                        i2 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                if (vd.I(string) && vd.I(string2) && i2 == -1) {
                    if (bundlePJg.containsKey("access_token")) {
                        super.XQ(request, bundlePJg, null);
                        return;
                    } else {
                        com.facebook.s4.Z().execute(new Runnable() { // from class: com.facebook.login.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                CustomTabLoginMethodHandler.g(this.f52979n, request, bundlePJg);
                            }
                        });
                        return;
                    }
                }
                if (string != null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                    super.XQ(request, null, new FacebookOperationCanceledException());
                } else if (i2 == 4201) {
                    super.XQ(request, null, new FacebookOperationCanceledException());
                } else {
                    super.XQ(request, null, new FacebookServiceException(new FacebookRequestError(i2, string, string2), string2));
                }
            }
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int HI(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        LoginClient loginClientNr = nr();
        if (getValidRedirectURI().length() == 0) {
            return 0;
        }
        Bundle bundleCk = ck(Ik(request), request);
        if (f52835X) {
            bundleCk.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.s4.Ik) {
            if (request.r()) {
                w6.f52988n.t(com.facebook.internal.r.f52816t.n("oauth", bundleCk));
            } else {
                w6.f52988n.t(com.facebook.internal.I28.rl.n("oauth", bundleCk));
            }
        }
        FragmentActivity fragmentActivityXMQ = loginClientNr.xMQ();
        if (fragmentActivityXMQ == null) {
            return 0;
        }
        Intent intent = new Intent(fragmentActivityXMQ, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.J2, "oauth");
        intent.putExtra(CustomTabMainActivity.f52139r, bundleCk);
        intent.putExtra(CustomTabMainActivity.f52138o, aYN());
        intent.putExtra(CustomTabMainActivity.f52135S, request.getLoginTargetApp().toString());
        Fragment fragmentGh = loginClientNr.getFragment();
        if (fragmentGh != null) {
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragmentGh, intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: J2, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: Uo, reason: from getter */
    protected String getValidRedirectURI() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: o, reason: from getter */
    public com.facebook.CN3 getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void qie(JSONObject param) throws JSONException {
        Intrinsics.checkNotNullParameter(param, "param");
        param.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    protected String r() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeString(this.expectedChallenge);
    }

    private final String ViF() {
        return super.getValidRedirectURI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = com.facebook.CN3.CHROME_CUSTOM_TAB;
        this.expectedChallenge = source.readString();
        this.validRedirectURI = com.facebook.internal.Wre.t(ViF());
    }
}
