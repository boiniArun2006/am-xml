package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest;
import com.facebook.internal.Md;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Md extends Dialog {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static volatile int f52687v;
    private boolean E2;
    private WebView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Ml f52688O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private I28 f52689S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private WindowManager.LayoutParams f52690X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private FrameLayout f52691Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f52692e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52693g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f52694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f52695o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ProgressDialog f52696r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f52697t;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final n f52686T = new n(null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f52685N = com.facebook.common.I28.f52354n;

    /* JADX INFO: Access modifiers changed from: private */
    final class I28 extends AsyncTask {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f52698n;
        final /* synthetic */ Md nr;
        private final Bundle rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Exception[] f52699t;

        public I28(Md md, String action, Bundle parameters) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.nr = md;
            this.f52698n = action;
            this.rl = parameters;
            this.f52699t = new Exception[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(String[] results, int i2, I28 this$0, CountDownLatch latch, com.facebook.g9s response) {
            FacebookRequestError facebookRequestErrorRl;
            String str;
            Intrinsics.checkNotNullParameter(results, "$results");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(latch, "$latch");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                facebookRequestErrorRl = response.rl();
                str = "Error staging photo.";
            } catch (Exception e2) {
                this$0.f52699t[i2] = e2;
            }
            if (facebookRequestErrorRl != null) {
                String strT = facebookRequestErrorRl.t();
                if (strT != null) {
                    str = strT;
                }
                throw new FacebookGraphResponseException(response, str);
            }
            JSONObject jSONObjectT = response.t();
            if (jSONObjectT == null) {
                throw new FacebookException("Error staging photo.");
            }
            String strOptString = jSONObjectT.optString("uri");
            if (strOptString == null) {
                throw new FacebookException("Error staging photo.");
            }
            results[i2] = strOptString;
            latch.countDown();
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                return rl((Void[]) objArr);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return null;
            }
        }

        protected void nr(String[] strArr) {
            if (!VmF.j.nr(this)) {
                try {
                    ProgressDialog progressDialog = this.nr.f52696r;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    for (Exception exc : this.f52699t) {
                        if (exc != null) {
                            this.nr.ViF(exc);
                            return;
                        }
                    }
                    if (strArr == null) {
                        this.nr.ViF(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    List listAsList = ArraysKt.asList(strArr);
                    if (listAsList.contains(null)) {
                        this.nr.ViF(new FacebookException("Failed to stage photos for web dialog"));
                        return;
                    }
                    vd.ofS(this.rl, "media", new JSONArray((Collection) listAsList));
                    this.nr.f52694n = vd.Uo(qf.rl(), com.facebook.s4.WPU() + "/dialog/" + this.f52698n, this.rl).toString();
                    ImageView imageView = this.nr.f52695o;
                    if (imageView != null) {
                        this.nr.iF((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } catch (Throwable th) {
                    VmF.j.rl(th, this);
                }
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (VmF.j.nr(this)) {
                return;
            }
            try {
                nr((String[]) obj);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }

        protected String[] rl(Void... p0) {
            if (VmF.j.nr(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(p0, "p0");
                String[] stringArray = this.rl.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f52699t = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken accessTokenO = AccessToken.INSTANCE.O();
                try {
                    int length = stringArray.length;
                    for (final int i2 = 0; i2 < length; i2++) {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((com.facebook.SPz) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri uri = Uri.parse(stringArray[i2]);
                        if (vd.Nxk(uri)) {
                            strArr[i2] = uri.toString();
                            countDownLatch.countDown();
                        } else {
                            GraphRequest.n nVar = new GraphRequest.n() { // from class: com.facebook.internal.Zs
                                @Override // com.facebook.GraphRequest.n
                                public final void n(com.facebook.g9s g9sVar) {
                                    Md.I28.t(strArr, i2, this, countDownLatch, g9sVar);
                                }
                            };
                            Intrinsics.checkNotNullExpressionValue(uri, "uri");
                            concurrentLinkedQueue.add(Vwf.j.n(accessTokenO, uri, nVar).qie());
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((com.facebook.SPz) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
                return null;
            }
        }
    }

    public interface Ml {
        void n(Bundle bundle, FacebookException facebookException);
    }

    public /* synthetic */ class Wre {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.r.values().length];
            try {
                iArr[com.facebook.login.r.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static class j {
        private Bundle J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Ml f52700O;
        private AccessToken Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Context f52701n;
        private int nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f52702t;

        public j(Context context, String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            AccessToken.Companion companion = AccessToken.INSTANCE;
            this.Uo = companion.O();
            if (!companion.Uo()) {
                String strS7N = vd.s7N(context);
                if (strS7N == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.rl = strS7N;
            }
            rl(context, action, bundle);
        }

        private final void rl(Context context, String str, Bundle bundle) {
            this.f52701n = context;
            this.f52702t = str;
            if (bundle != null) {
                this.J2 = bundle;
            } else {
                this.J2 = new Bundle();
            }
        }

        public final Bundle J2() {
            return this.J2;
        }

        public final j KN(Ml ml) {
            this.f52700O = ml;
            return this;
        }

        public final Ml O() {
            return this.f52700O;
        }

        public final int Uo() {
            return this.nr;
        }

        public Md n() {
            AccessToken accessToken = this.Uo;
            if (accessToken != null) {
                Bundle bundle = this.J2;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken != null ? accessToken.getApplicationId() : null);
                }
                Bundle bundle2 = this.J2;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.Uo;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.getToken() : null);
                }
            } else {
                Bundle bundle3 = this.J2;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.rl);
                }
            }
            n nVar = Md.f52686T;
            Context context = this.f52701n;
            if (context != null) {
                return nVar.t(context, this.f52702t, this.J2, this.nr, this.f52700O);
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final Context nr() {
            return this.f52701n;
        }

        public final String t() {
            return this.rl;
        }

        public j(Context context, String str, String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            this.rl = Lu.gh(str == null ? vd.s7N(context) : str, "applicationId");
            rl(context, action, bundle);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }

        public final void O(int i2) {
            if (i2 == 0) {
                i2 = Md.f52685N;
            }
            Md.f52687v = i2;
        }

        public final Md nr(Context context, String str, Bundle bundle, int i2, com.facebook.login.r targetApp, Ml ml) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            Md.o(context);
            return new Md(context, str, bundle, i2, targetApp, ml, null);
        }

        protected final void rl(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && Md.f52687v == 0) {
                    O(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final Md t(Context context, String str, Bundle bundle, int i2, Ml ml) {
            Intrinsics.checkNotNullParameter(context, "context");
            Md.o(context);
            return new Md(context, str, bundle, i2, com.facebook.login.r.FACEBOOK, ml, null);
        }

        public final int n() {
            Lu.qie();
            return Md.f52687v;
        }
    }

    private final class w6 extends WebViewClient {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, "com.facebook");
            p0.startActivity(p1);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded("com.facebook", view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Facebook|SafeDK: Execution> Lcom/facebook/internal/Md$w6;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted("com.facebook", webView, str);
            safedk_Md$w6_onPageStarted_8fbf0a1abe9ffe6e79975ae7191083da(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            Logger.d("Facebook|SafeDK: Execution> Lcom/facebook/internal/Md$w6;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError("com.facebook", webView, i2, str, str2);
            safedk_Md$w6_onReceivedError_7d4970f9b609f324dcc6d13a62bbc52e(webView, i2, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders("com.facebook", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("Facebook|SafeDK: Execution> Lcom/facebook/internal/Md$w6;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_Md$w6_shouldOverrideUrlLoading_bddb26ac9c1d87a0db635c29cfdf693f = safedk_Md$w6_shouldOverrideUrlLoading_bddb26ac9c1d87a0db635c29cfdf693f(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading("com.facebook", webView, str, zSafedk_Md$w6_shouldOverrideUrlLoading_bddb26ac9c1d87a0db635c29cfdf693f);
            return zSafedk_Md$w6_shouldOverrideUrlLoading_bddb26ac9c1d87a0db635c29cfdf693f;
        }

        public w6() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (!Md.this.E2 && (progressDialog = Md.this.f52696r) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = Md.this.f52691Z;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webViewR = Md.this.r();
            if (webViewR != null) {
                webViewR.setVisibility(0);
            }
            ImageView imageView = Md.this.f52695o;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            Md.this.f52692e = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            Md.this.ViF(new FacebookDialogException(null, -11, null));
        }

        public void safedk_Md$w6_onPageStarted_8fbf0a1abe9ffe6e79975ae7191083da(WebView view, String url, Bitmap p2) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            vd.piY("FacebookSDK.WebDialog", "Webview loading URL: " + url);
            super.onPageStarted(view, url, p2);
            if (Md.this.E2 || (progressDialog = Md.this.f52696r) == null) {
                return;
            }
            progressDialog.show();
        }

        public void safedk_Md$w6_onReceivedError_7d4970f9b609f324dcc6d13a62bbc52e(WebView view, int p1, String description, String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, p1, description, failingUrl);
            Md.this.ViF(new FacebookDialogException(description, p1, failingUrl));
        }

        public boolean safedk_Md$w6_shouldOverrideUrlLoading_bddb26ac9c1d87a0db635c29cfdf693f(WebView view, String url) {
            int i2;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            vd.piY("FacebookSDK.WebDialog", "Redirect URL: " + url);
            Uri uri = Uri.parse(url);
            boolean z2 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            if (!StringsKt.startsWith$default(url, Md.this.f52697t, false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(url, "fbconnect://cancel", false, 2, (Object) null)) {
                    Md.this.cancel();
                    return true;
                }
                if (!z2 && !StringsKt.contains$default((CharSequence) url, (CharSequence) "touch", false, 2, (Object) null)) {
                    try {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Md.this.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                return false;
            }
            Bundle bundleWPU = Md.this.WPU(url);
            String p1 = bundleWPU.getString(MRAIDPresenter.ERROR);
            if (p1 == null) {
                p1 = bundleWPU.getString("error_type");
            }
            String string = bundleWPU.getString("error_msg");
            if (string == null) {
                string = bundleWPU.getString("error_message");
            }
            if (string == null) {
                string = bundleWPU.getString("error_description");
            }
            String string2 = bundleWPU.getString("error_code");
            if (string2 == null || vd.I(string2)) {
                i2 = -1;
            } else {
                try {
                    i2 = Integer.parseInt(string2);
                } catch (NumberFormatException unused2) {
                    i2 = -1;
                }
            }
            if (vd.I(p1) && vd.I(string) && i2 == -1) {
                Md.this.nY(bundleWPU);
            } else if ((p1 == null || !(Intrinsics.areEqual(p1, "access_denied") || Intrinsics.areEqual(p1, "OAuthAccessDeniedException"))) && i2 != 4201) {
                Md.this.ViF(new FacebookServiceException(new FacebookRequestError(i2, p1, string), string));
            } else {
                Md.this.cancel();
            }
            return true;
        }
    }

    public /* synthetic */ Md(Context context, String str, Bundle bundle, int i2, com.facebook.login.r rVar, Ml ml, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, bundle, i2, rVar, ml);
    }

    private final int Ik(int i2, float f3, int i3, int i5) {
        int i7 = (int) (i2 / f3);
        return (int) (((double) i2) * (i7 <= i3 ? 1.0d : i7 >= i5 ? 0.5d : ((((double) (i5 - i7)) / ((double) (i5 - i3))) * 0.5d) + 0.5d));
    }

    protected static final void o(Context context) {
        f52686T.rl(context);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.E2 = false;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (vd.xg(context) && (layoutParams = this.f52690X) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.f52690X;
                sb.append(layoutParams2 != null ? layoutParams2.token : null);
                vd.piY("FacebookSDK.WebDialog", sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.E2 = true;
        super.onDetachedFromWindow();
    }

    public static final class CN3 extends WebView {
        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch("com.facebook", this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }

        CN3(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            try {
                super.onWindowFocusChanged(z2);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected Md(Context context, String url) {
        this(context, url, f52686T.n());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    private final void HI() {
        ImageView imageView = new ImageView(getContext());
        this.f52695o = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.internal.psW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Md.ck(this.f52813n, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(com.facebook.common.j.f52358n);
        ImageView imageView2 = this.f52695o;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f52695o;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Md this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(Md this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        CN3 cn3 = new CN3(getContext());
        this.J2 = cn3;
        cn3.setVerticalScrollBarEnabled(false);
        WebView webView = this.J2;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.J2;
        if (webView2 != null) {
            webView2.setWebViewClient(new w6());
        }
        WebView webView3 = this.J2;
        WebSettings settings = webView3 != null ? webView3.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.J2;
        if (webView4 != null) {
            String str = this.f52694n;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.J2;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.J2;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.J2;
        WebSettings settings2 = webView7 != null ? webView7.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.J2;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.J2;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.J2;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.J2;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.internal.h
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return Md.fD(view, motionEvent);
                }
            });
        }
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.J2);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f52691Z;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    protected final void ViF(Throwable th) {
        if (this.f52688O == null || this.f52693g) {
            return;
        }
        this.f52693g = true;
        FacebookException facebookException = th instanceof FacebookException ? (FacebookException) th : new FacebookException(th);
        Ml ml = this.f52688O;
        if (ml != null) {
            ml.n(null, facebookException);
        }
        dismiss();
    }

    protected final boolean XQ() {
        return this.f52692e;
    }

    protected final boolean Z() {
        return this.f52693g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f52688O == null || this.f52693g) {
            return;
        }
        ViF(new FacebookOperationCanceledException());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.J2;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.E2 && (progressDialog = this.f52696r) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    protected final void g(String expectedRedirectUrl) {
        Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.f52697t = expectedRedirectUrl;
    }

    protected final void nY(Bundle bundle) {
        Ml ml = this.f52688O;
        if (ml == null || this.f52693g) {
            return;
        }
        this.f52693g = true;
        if (ml != null) {
            ml.n(bundle, null);
        }
        dismiss();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i2 == 4) {
            WebView webView = this.J2;
            if (webView != null && webView != null && webView.canGoBack()) {
                WebView webView2 = this.J2;
                if (webView2 != null) {
                    webView2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i2, event);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        I28 i28 = this.f52689S;
        if (i28 != null) {
            i28.cancel(true);
            ProgressDialog progressDialog = this.f52696r;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f52690X = params;
        }
        super.onWindowAttributesChanged(params);
    }

    protected final WebView r() {
        return this.J2;
    }

    public final void te(Ml ml) {
        this.f52688O = ml;
    }

    private Md(Context context, String str, int i2) {
        super(context, i2 == 0 ? f52686T.n() : i2);
        this.f52697t = "fbconnect://success";
        this.f52694n = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fD(View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
            return false;
        }
        return false;
    }

    public Bundle WPU(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundlePJg = vd.pJg(uri.getQuery());
        bundlePJg.putAll(vd.pJg(uri.getFragment()));
        return bundlePJg;
    }

    public final void aYN() {
        int i2;
        Object systemService = getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        if (i3 < i5) {
            i2 = i3;
        } else {
            i2 = i5;
        }
        if (i3 < i5) {
            i3 = i5;
        }
        int iMin = Math.min(Ik(i2, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(Ik(i3, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f52696r = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f52696r;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(com.facebook.common.Ml.nr));
        }
        ProgressDialog progressDialog3 = this.f52696r;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f52696r;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.internal.K
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Md.S(this.f52676n, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f52691Z = new FrameLayout(getContext());
        aYN();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        HI();
        if (this.f52694n != null) {
            ImageView imageView = this.f52695o;
            if (imageView != null) {
                iF((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        FrameLayout frameLayout = this.f52691Z;
        if (frameLayout != null) {
            frameLayout.addView(this.f52695o, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f52691Z;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.app.Dialog
    protected void onStart() {
        AsyncTask.Status status;
        super.onStart();
        I28 i28 = this.f52689S;
        if (i28 != null) {
            if (i28 != null) {
                status = i28.getStatus();
            } else {
                status = null;
            }
            if (status == AsyncTask.Status.PENDING) {
                I28 i282 = this.f52689S;
                if (i282 != null) {
                    i282.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f52696r;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        aYN();
    }

    private Md(Context context, String str, Bundle bundle, int i2, com.facebook.login.r rVar, Ml ml) {
        Uri uriUo;
        super(context, i2 == 0 ? f52686T.n() : i2);
        this.f52697t = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = vd.M(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f52697t = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", com.facebook.s4.az());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{com.facebook.s4.te()}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
        bundle.putString("sdk", str3);
        this.f52688O = ml;
        if (Intrinsics.areEqual(str, AppLovinEventTypes.USER_SHARED_LINK) && bundle.containsKey("media")) {
            this.f52689S = new I28(this, str, bundle);
            return;
        }
        if (Wre.$EnumSwitchMapping$0[rVar.ordinal()] == 1) {
            uriUo = vd.Uo(qf.gh(), "oauth/authorize", bundle);
        } else {
            uriUo = vd.Uo(qf.rl(), com.facebook.s4.WPU() + "/dialog/" + str, bundle);
        }
        this.f52694n = uriUo.toString();
    }
}
