package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class p3 implements q0.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f49659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f49660m = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f49662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f49663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o3 f49664d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49667g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f49670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b0 f49671k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f49665e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f49666f = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49668h = 2;

    class a extends AbstractC1772b {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                C1804o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.this.c() || p3.f49659l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = p3.f49659l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(p3.this.f49664d, p3.this.f49661a.e());
                }
                p3.f49660m.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                C1804o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = p3.f49659l = null;
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63161a);
        p0.startActivity(p1);
    }

    public void h() {
        a((Map) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f49659l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityU0 = this.f49661a.u0();
        if (activityU0 == null || activityU0.isFinishing()) {
            C1804o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityU0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.nH
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f49500n.a(dialogInterface, i2);
                }
            }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    private void f() {
        this.f49661a.e().a(new a());
    }

    public void e() {
        if (this.f49666f.compareAndSet(false, true)) {
            this.f49661a.q0().a((AbstractRunnableC1782i5) new w5(this, this.f49661a), d6.b.OTHER);
        }
    }

    public boolean g() {
        return this.f49667g;
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f49664d + "}";
    }

    public p3(C1802k c1802k) {
        this.f49661a = c1802k;
        this.f49662b = c1802k.O();
        Context contextO = C1802k.o();
        this.f49663c = contextO;
        o3 o3Var = new o3(contextO);
        this.f49664d = o3Var;
        this.f49671k = new b0(c1802k, o3Var);
    }

    public void a(boolean z2, int i2) {
        this.f49667g = z2;
        this.f49668h = i2;
    }

    public void a(Map map) {
        this.f49670j = map;
        e();
        if (!c() && f49660m.compareAndSet(false, true)) {
            if (!this.f49669i) {
                f();
                this.f49669i = true;
            }
            Intent intent = new Intent(this.f49663c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            C1804o.g("AppLovinSdk", "Starting mediation debugger...");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f49663c, intent);
            return;
        }
        C1804o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f49670j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f49670j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.Lc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47767n.d();
                    }
                }, TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        h();
    }

    private List a(JSONObject jSONObject, C1802k c1802k) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, c1802k);
                arrayList.add(e3Var);
                this.f49665e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, C1802k c1802k) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1793n(jSONObject2, this.f49665e, c1802k));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, C1802k c1802k) {
        List<String> adUnitIds = c1802k.J() != null ? c1802k.J().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1793n c1793n = (C1793n) it.next();
                if (adUnitIds.contains(c1793n.c())) {
                    arrayList.add(c1793n);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (C1804o.a()) {
                this.f49662b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i2) {
        List listA = a(jSONObject, this.f49661a);
        List listA2 = a(jSONObject, listA, this.f49661a);
        List listA3 = a(listA2, this.f49661a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f49664d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f49661a);
        if (!listA4.isEmpty()) {
            this.f49671k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.ya
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50926n.h();
                }
            }, TimeUnit.SECONDS.toMillis(this.f49668h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i2, String str2, JSONObject jSONObject) {
        if (C1804o.a()) {
            this.f49662b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i2);
        }
        C1804o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f49661a.D().a("fetchMediationDebuggerInfo", str, i2, str2);
        this.f49664d.a(null, null, null, null, null, null, null, false, this.f49661a);
        this.f49666f.set(false);
    }
}
