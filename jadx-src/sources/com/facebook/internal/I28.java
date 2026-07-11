package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class I28 {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f52675n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public Uri n(String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            return vd.Uo(qf.rl(), com.facebook.s4.WPU() + "/dialog/" + action, bundle);
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, "com.facebook");
        p0.launchUrl(p1, p2);
    }

    public I28(String action, Bundle bundle) {
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        Q[] qArrValues = Q.values();
        ArrayList arrayList = new ArrayList(qArrValues.length);
        for (Q q2 : qArrValues) {
            arrayList.add(q2.rl());
        }
        this.f52675n = arrayList.contains(action) ? vd.Uo(qf.Uo(), "/dialog/" + action, bundle) : rl.n(action, bundle);
    }

    public final boolean n(Activity activity, String str) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CustomTabsIntent customTabsIntentN = new CustomTabsIntent.Builder(com.facebook.login.w6.f52988n.rl()).n();
            customTabsIntentN.intent.setPackage(str);
            try {
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentN, activity, this.f52675n);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    protected final void rl(Uri uri) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "<set-?>");
            this.f52675n = uri;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
