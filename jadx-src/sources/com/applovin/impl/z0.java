package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import com.applovin.impl.v0;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50937b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f50939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f50941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0.c f50942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f50943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f50944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f50945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f50946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f50947l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f50938c = new t0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u0.b f50948m = new u0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1772b f50949n = new a();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class a extends AbstractC1772b {
        a() {
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.f50943h == null) {
                return;
            }
            if (z0.this.f50944i != null) {
                z0 z0Var = z0.this;
                if (!AbstractC1775d.d(z0Var.a(z0Var.f50944i))) {
                    z0.this.f50944i.dismiss();
                }
                z0.this.f50944i = null;
            }
            v0 v0Var = z0.this.f50943h;
            z0.this.f50943h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f50941f, v0Var, activity);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f50951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f50952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0 f50953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f50954d;

        b(boolean z2, x0 x0Var, v0 v0Var, Activity activity) {
            this.f50951a = z2;
            this.f50952b = x0Var;
            this.f50953c = v0Var;
            this.f50954d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            z0.this.f50943h = null;
            z0.this.f50944i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.f50947l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f50951a), mapHashMap);
            z0.this.f50936a.v0().d(d2.f48291p, mapHashMap);
            v0 v0VarA = z0.this.a(this.f50952b.a());
            if (v0VarA == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.f50953c, v0VarA, this.f50954d);
            if (v0VarA.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f50956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f50957b;

        c(Uri uri, Activity activity) {
            this.f50956a = uri;
            this.f50957b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f50956a, this.f50957b, z0.this.f50936a);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f50959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f50960b;

        d(Uri uri, Activity activity) {
            this.f50959a = uri;
            this.f50960b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f50959a, this.f50960b, z0.this.f50936a);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class e implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f50963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f50964c;

        e(long j2, v0 v0Var, Activity activity) {
            this.f50962a = j2;
            this.f50963b = v0Var;
            this.f50964c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f50948m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f50962a);
            z0.this.a(this.f50963b, this.f50964c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class f implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f50967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f50968c;

        f(long j2, v0 v0Var, Activity activity) {
            this.f50966a = j2;
            this.f50967b = v0Var;
            this.f50968c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f50948m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f50966a);
            z0.this.a(this.f50967b, this.f50968c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class g implements CmpServiceImpl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f50970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f50971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f50972c;

        g(long j2, v0 v0Var, Activity activity) {
            this.f50970a = j2;
            this.f50971b = v0Var;
            this.f50972c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f50970a));
            if (appLovinCmpError != null) {
                z0.this.f50948m.a(appLovinCmpError);
                mapHashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.f50936a.v0().d(d2.f48297u, mapHashMap);
            } else {
                z0.this.f50948m.c();
                z0.this.f50936a.v0().d(d2.f48298v, mapHashMap);
            }
            z0.this.b(this.f50971b, this.f50972c);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0 f50974a;

        h(v0 v0Var) {
            this.f50974a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f50941f, this.f50974a, z0.this.f50936a.u0());
        }
    }

    private void c(final v0 v0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.pi
            @Override // java.lang.Runnable
            public final void run() {
                this.f49708n.a(v0Var, activity);
            }
        });
    }

    public z0(C1802k c1802k) {
        this.f50936a = c1802k;
        this.f50937b = ((Integer) c1802k.a(x4.a7)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f50945j));
        CollectionUtils.putStringIfValid("details", this.f50938c.toString(), mapHashMap);
        this.f50936a.v0().d(d2.f48299w, mapHashMap);
        this.f50939d = null;
        this.f50941f = null;
        this.f50945j = 0L;
        this.f50946k = 0L;
        this.f50947l = 0L;
        this.f50938c.a();
        this.f50936a.e().b(this.f50949n);
        u0.c cVar = this.f50942g;
        if (cVar != null) {
            cVar.a(this.f50948m);
            this.f50942g = null;
        }
        this.f50948m = new u0.b();
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i2, Activity activity, u0.c cVar) {
        if (this.f50939d != null) {
            this.f50936a.O();
            if (C1804o.a()) {
                this.f50936a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f50939d);
            }
            this.f50936a.O();
            if (C1804o.a()) {
                this.f50936a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f50939d);
            }
            cVar.a(new u0.b(new s0(s0.f49900d, PtsLKY.Lqw)));
            return;
        }
        List listA = a1.a(this.f50936a);
        this.f50939d = listA;
        this.f50940e = String.valueOf(listA);
        this.f50942g = cVar;
        v0 v0VarA = a(i2);
        this.f50936a.O();
        if (C1804o.a()) {
            this.f50936a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f50939d + "\nInitial state: " + v0VarA);
        }
        C1802k.a(activity).a(this.f50949n);
        this.f50936a.v0().a(d2.f48289n);
        this.f50945j = SystemClock.elapsedRealtime();
        a((v0) null, v0VarA, activity);
    }

    public boolean a() {
        return this.f50939d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f50941f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z2;
        SpannableString spannableString;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f50936a.O();
        if (C1804o.a()) {
            this.f50936a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long jElapsedRealtime = this.f50941f != null ? SystemClock.elapsedRealtime() - this.f50946k : 0L;
        this.f50946k = SystemClock.elapsedRealtime();
        this.f50938c.a(v0Var, jElapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (AbstractC1775d.d(activity)) {
                a(v0Var);
                return;
            }
            this.f50936a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.f50943h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f50936a.x().h();
            final boolean z3 = uriH != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z3, x0Var, v0Var, activity);
                if (x0Var.c() == x0.a.POSITIVE) {
                    builder.setPositiveButton(x0Var.d(), bVar);
                } else if (x0Var.c() == x0.a.NEGATIVE) {
                    builder.setNegativeButton(x0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(x0Var.d(), bVar);
                }
            }
            String strH = w0Var.h();
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = C1802k.a(R.string.applovin_terms_of_service_text);
                String strA2 = C1802k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z3) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f50936a.x().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.Y2e
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f47864n.a(alertDialogCreate, activity, z3, dialogInterface);
                }
            });
            this.f50944i = alertDialogCreate;
            alertDialogCreate.show();
            this.f50948m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (this.f50936a.x().k() && this.f50936a.x().m()) {
                if (AbstractC1775d.d(activity)) {
                    a(v0Var);
                    return;
                } else {
                    this.f50936a.v0().a(d2.f48292q);
                    this.f50936a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
                    return;
                }
            }
            a(v0Var, activity, Boolean.FALSE);
            return;
        }
        if (v0Var.d() == v0.b.EVENT) {
            y0 y0Var = (y0) v0Var;
            String strG = y0Var.g();
            Map<String, ?> mapF = y0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f50936a.F().trackEvent(strG, mapF);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (AbstractC1775d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.f50936a.x().m()) {
                this.f50936a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f50936a.v0().a(d2.f48292q);
                this.f50936a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (AbstractC1775d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.f50936a.x().m()) {
                this.f50936a.F().trackEvent("cf_start");
            }
            this.f50936a.v0().a(d2.f48296t);
            this.f50936a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() == v0.b.DECISION) {
            v0.a aVarA = v0Var.a();
            if (aVarA == v0.a.IS_AL_GDPR) {
                boolean zK = this.f50936a.x().k();
                this.f50938c.a(v0Var, zK, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z2 = !this.f50936a.z0() || ((Boolean) this.f50936a.a(z4.f51017t, Boolean.FALSE)).booleanValue();
                this.f50938c.a(v0Var, z2, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z2));
                return;
            } else {
                if (aVarA != v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z2 = this.f50936a.x().h() != null;
                this.f50938c.a(v0Var, z2, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z2));
                return;
            }
        }
        if (v0Var.d() == v0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z2, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f50937b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f50947l = SystemClock.elapsedRealtime();
        this.f50936a.v0().d(d2.f48290o, CollectionUtils.hashMap("details", String.valueOf(z2)));
    }

    private void a(v0 v0Var) {
        this.f50938c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f50936a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f50940e + "\nLast successful state: " + this.f50941f));
        this.f50938c.b(str);
        u0.b bVar = this.f50948m;
        if (bVar != null) {
            bVar.a(new s0(s0.f49901e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i2) {
        List<v0> list = this.f50939d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i2 == v0Var.c()) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j2));
        if (appLovinCmpError == null) {
            this.f50936a.v0().d(d2.f48293r, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f50936a.v0().d(d2.f48295s, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
