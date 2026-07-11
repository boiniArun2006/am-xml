package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.e0;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53234c = false;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63176p);
        p0.startActivity(p1);
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        if (this.f53234c) {
            return false;
        }
        return "fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.f53232a) || this.f53233b || uri.toString().contains("FYBER_OPEN_BROWSER");
    }

    public i(boolean z2, String str) {
        this.f53232a = str;
        this.f53233b = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @Override // com.fyber.inneractive.sdk.click.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(Context context, Uri uri, List list) {
        String queryParameter;
        d0 d0Var;
        String string = uri.toString();
        if (!TextUtils.isEmpty(string)) {
            Uri uri2 = Uri.parse(string);
            String scheme = uri2.getScheme();
            String host = uri2.getHost();
            queryParameter = (scheme == null || !scheme.equals("fybernativebrowser") || host == null || !host.equals("navigate")) ? null : uri2.getQueryParameter("url");
        }
        if (queryParameter != null) {
            try {
                uri = Uri.parse(queryParameter);
            } catch (Exception unused) {
                IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", queryParameter);
                uri = null;
            }
            string = queryParameter;
        }
        if (this.f53234c) {
            return r.a(uri.toString(), null, "The process was cancelled");
        }
        f0 f0Var = f0.OPEN_EVERYTHING;
        try {
            context.getClass();
        } catch (Throwable unused2) {
        }
        try {
            IAlog.a("IAJavaUtil - valid url found: '%s' opening browser", string);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                d0Var = new d0(g0.OPEN_IN_EXTERNAL_BROWSER, null);
            } catch (ActivityNotFoundException unused3) {
                if (h0.a(context, string)) {
                    d0Var = new d0(g0.OPENED_USING_CHROME_NAVIGATE, null);
                } else {
                    d0Var = new d0(g0.FAILED, new e0("tryOpeningChromeGracefully has failed and couldn't open the url"));
                }
            } catch (Throwable unused4) {
                if (!h0.d(string) && !h0.c(string) && f0Var != f0.DO_NOT_OPEN_IN_INTERNAL_BROWSER) {
                    Intent intent2 = new Intent(context, (Class<?>) InneractiveInternalBrowserActivity.class);
                    intent2.putExtra("extra_url", string);
                    intent2.putExtra("spotId", (String) null);
                    if (!(context instanceof Activity)) {
                        intent2.setFlags(268435456);
                    }
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
                    d0Var = new d0(g0.OPENED_IN_INTERNAL_BROWSER, null);
                } else {
                    d0Var = new d0(g0.FAILED, new e0("canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"));
                }
            }
        } catch (Throwable th) {
            IAlog.a("IAJavaUtil - could not open a browser for url: %s", string);
            d0Var = new d0(g0.FAILED, th);
        }
        if (list != null) {
            Throwable th2 = d0Var.f56992b;
            if (th2 != null) {
                list.add(new j(string, false, null, th2.toString()));
            } else {
                list.add(new j(string, true, a.a(uri, q.OPENED_IN_EXTERNAL_BROWSER), null));
            }
        }
        return new b(uri.toString(), a.a(uri, q.OPENED_IN_EXTERNAL_BROWSER), "FyberNativeBrowser", null);
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.f53234c = true;
    }
}
