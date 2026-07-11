package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTabsClient f48514b;

    class a extends CustomTabsServiceConnection {
        a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            f1.this.f48513a.O();
            if (C1804o.a()) {
                f1.this.f48513a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.f48514b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.f48513a.O();
            if (C1804o.a()) {
                f1.this.f48513a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.f48514b = null;
        }
    }

    private class b extends CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f48516a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f48516a = new WeakReference(aVar);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i2, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f48516a.get();
            if (aVar == null) {
                f1.this.f48513a.O();
                if (C1804o.a()) {
                    f1.this.f48513a.O().b("CustomTabsManager", "Unable to track navigation event (" + i2 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                f1.this.f48513a.O();
                if (C1804o.a()) {
                    f1.this.f48513a.O().b("CustomTabsManager", "Unable to track navigation event (" + i2 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i2) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackCustomTabsNavigationStarted(bVarG);
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackCustomTabsNavigationFinished(bVarG);
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackCustomTabsNavigationFailed(bVarG);
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackCustomTabsNavigationAborted(bVarG);
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    f1.this.f48513a.O();
                    if (C1804o.a()) {
                        f1.this.f48513a.O().a("CustomTabsManager", "Unknown navigation event: " + i2);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
            f1.this.f48513a.O();
            if (C1804o.a()) {
                C1804o c1804oO = f1.this.f48513a.O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z2 ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i2);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                c1804oO.a("CustomTabsManager", sb.toString());
            }
        }
    }

    private class c extends CustomTabsCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f48518a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f48518a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i2, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f48518a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.f48513a.O();
                if (C1804o.a()) {
                    f1.this.f48513a.O().b("CustomTabsManager", "Unable to track navigation event (" + i2 + "). Native ad is null.");
                }
                return;
            }
            switch (i2) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f48513a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.f48513a.O();
                    if (C1804o.a()) {
                        f1.this.f48513a.O().a("CustomTabsManager", "Unknown navigation event: " + i2);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
            f1.this.f48513a.O();
            if (C1804o.a()) {
                C1804o c1804oO = f1.this.f48513a.O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z2 ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i2);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                c1804oO.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, com.safedk.android.utils.h.f63161a);
        p0.launchUrl(p1, p2);
    }

    public void b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            a("warmup urls", new Runnable() { // from class: com.applovin.impl.l4Z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48880n.a(list, customTabsSession);
                }
            });
            return;
        }
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public f1(C1802k c1802k) {
        this.f48513a = c1802k;
    }

    public void a() {
        if (((Boolean) this.f48513a.a(x4.d7)).booleanValue() && this.f48514b == null) {
            String strO = CustomTabsClient.O(C1802k.o(), this.f48513a.c(x4.e7), true);
            String strNr = CustomTabsClient.nr(C1802k.o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f48513a.a(x4.f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strNr, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strO, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strO, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strNr, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f48513a.O();
                if (C1804o.a()) {
                    this.f48513a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g1 g1Var, CustomTabsSession customTabsSession) {
        this.f48514b.KN(0L);
        if (g1Var == null) {
            return;
        }
        Integer numE = g1Var.e();
        String strB = g1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (customTabsSession == null) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        customTabsSession.gh(numE.intValue(), Uri.parse(strB), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zN = false;
        try {
            zN = CustomTabsClient.n(C1802k.o(), (String) linkedList.poll(), new a());
            if (!zN) {
                this.f48513a.O();
                if (C1804o.a()) {
                    this.f48513a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th) {
            try {
                this.f48513a.O();
                if (C1804o.a()) {
                    this.f48513a.O().a("CustomTabsManager", "Failed to bind to service", th);
                }
                if (zN) {
                    return;
                } else {
                    if (zIsEmpty) {
                        return;
                    }
                }
            } finally {
                if (!zN && !linkedList.isEmpty()) {
                    this.f48513a.O();
                    if (C1804o.a()) {
                        this.f48513a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (zN || linkedList.isEmpty()) {
            return;
        }
        this.f48513a.O();
        if (C1804o.a()) {
        }
    }

    public CustomTabsSession a(com.applovin.impl.adview.a aVar) {
        if (this.f48514b == null) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionJ2 = this.f48514b.J2(new b(aVar));
            a(customTabsSessionJ2, aVar.g());
            return customTabsSessionJ2;
        } catch (Exception e2) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    public CustomTabsSession a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f48514b == null) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionJ2 = this.f48514b.J2(new c(appLovinNativeAdImpl));
            a(customTabsSessionJ2, appLovinNativeAdImpl);
            return customTabsSessionJ2;
        } catch (Exception e2) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, CustomTabsSession customTabsSession) {
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zUo = customTabsSession.Uo(Uri.parse(str), null, arrayList);
        this.f48513a.O();
        if (C1804o.a()) {
            C1804o c1804oO = this.f48513a.O();
            StringBuilder sb = new StringBuilder();
            sb.append("Warmup for URLs ");
            sb.append(zUo ? "succeeded" : "failed");
            c1804oO.a("CustomTabsManager", sb.toString());
        }
    }

    public void a(final Uri uri, final com.applovin.impl.adview.a aVar, final Activity activity) {
        if (aVar.h() == null) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Runnable() { // from class: com.applovin.impl.OU
            @Override // java.lang.Runnable
            public final void run() {
                this.f47798n.a(aVar, activity, uri);
            }
        })) {
            this.f48513a.m0().pauseForClick();
            return;
        }
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(aVar, activity), activity, uri);
    }

    public boolean a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new Runnable() { // from class: com.applovin.impl.O
            @Override // java.lang.Runnable
            public final void run() {
                this.f47790n.a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (zA) {
            this.f48513a.m0().pauseForClick();
            return zA;
        }
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(a(appLovinNativeAdImpl, activity), activity, uri);
    }

    private void a(CustomTabsSession customTabsSession, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), customTabsSession);
    }

    private void a(CustomTabsSession customTabsSession, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), customTabsSession);
    }

    private void a(final g1 g1Var, final CustomTabsSession customTabsSession) {
        a("client warmup", new Runnable() { // from class: com.applovin.impl.mz
            @Override // java.lang.Runnable
            public final void run() {
                this.f49444n.b(g1Var, customTabsSession);
            }
        });
    }

    private CustomTabsIntent a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private CustomTabsIntent a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private CustomTabsIntent a(g1 g1Var, Bundle bundle, CustomTabsSession customTabsSession, Activity activity) {
        this.f48513a.O();
        if (C1804o.a()) {
            this.f48513a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        if (((Boolean) this.f48513a.a(x4.g7)).booleanValue()) {
            int i2 = R.anim.applovin_slide_up_animation;
            int i3 = R.anim.applovin_slide_down_animation;
            builder.HI(activity, i2, i3);
            builder.J2(activity, i2, i3);
        }
        if (g1Var != null) {
            Integer numH = g1Var.h();
            if (numH != null) {
                builder.O(new CustomTabColorSchemeParams.Builder().rl(numH.intValue()).n());
            }
            Integer numA = g1Var.a();
            if (numA != null) {
                builder.t(2, new CustomTabColorSchemeParams.Builder().rl(numA.intValue()).n());
            }
            Boolean boolI = g1Var.i();
            if (boolI != null) {
                builder.ck(boolI.booleanValue());
            }
            Boolean boolG = g1Var.g();
            if (boolG != null) {
                builder.ty(boolG.booleanValue());
            }
            Boolean boolC = g1Var.c();
            if (boolC != null) {
                builder.xMQ(boolC.booleanValue());
            }
            Integer numF = g1Var.f();
            if (numF != null) {
                builder.az(numF.intValue());
            }
        }
        CustomTabsIntent customTabsIntentN = builder.n();
        if (g1Var != null) {
            String strD = g1Var.d();
            if (strD != null) {
                customTabsIntentN.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                customTabsIntentN.intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return customTabsIntentN;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f48513a.a(x4.h7)).booleanValue()) {
            k7.a(uri, activity, this.f48513a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f48513a.O();
            if (!C1804o.a()) {
                return true;
            }
            this.f48513a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f48513a.O();
            if (C1804o.a()) {
                this.f48513a.O().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f48513a.D().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
