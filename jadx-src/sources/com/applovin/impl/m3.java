package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.o3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class m3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o3 f48936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f48937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f48938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f48939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f48940e;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            m3.this.a();
            m3 m3Var = m3.this;
            m3Var.b((Context) m3Var);
        }
    }

    class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1773c f48942a;

        class a implements AbstractC1775d.b {
            a() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.this.f48936a.t());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.m3$b$b, reason: collision with other inner class name */
        class C0702b implements AbstractC1775d.b {
            C0702b() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.this.f48936a.d(), m3.this.f48936a.t());
            }
        }

        class c implements AbstractC1775d.b {
            c() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.this.f48936a.d(), m3.this.f48936a.t());
            }
        }

        class d implements AbstractC1775d.b {
            d() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f48936a.f(), false, m3.this.f48936a.t());
            }
        }

        class e implements AbstractC1775d.b {
            e() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.this.f48936a.k(), m3.this.f48936a.w(), m3.this.f48936a.t());
            }
        }

        class f implements AbstractC1775d.b {
            f() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.this.f48936a.v(), m3.this.f48936a.t());
            }
        }

        class g implements AbstractC1775d.b {
            g() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f48936a.o(), true, m3.this.f48936a.t());
            }
        }

        class h implements AbstractC1775d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ r2 f48951a;

            h(r2 r2Var) {
                this.f48951a = r2Var;
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.f48951a).r());
            }
        }

        b(C1773c c1773c) {
            this.f48942a = c1773c;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            int iB = j2Var.b();
            if (iB == o3.e.APP_INFO.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), m3.this);
                return;
            }
            if (iB == o3.e.MAX.ordinal()) {
                if (m3.this.f48936a.a(r2Var)) {
                    AbstractC1775d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.f48942a, new a());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB == o3.e.PRIVACY.ordinal()) {
                if (j2Var.a() == o3.d.CMP.ordinal()) {
                    if (StringUtils.isValidString(m3.this.f48936a.t().r0().j())) {
                        AbstractC1775d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.f48942a, new C0702b());
                        return;
                    } else {
                        n7.a(r2Var.c(), r2Var.b(), m3.this);
                        return;
                    }
                }
                if (j2Var.a() == o3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                    AbstractC1775d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f48942a, new c());
                    return;
                }
                return;
            }
            if (iB == o3.e.ADS.ordinal()) {
                if (j2Var.a() == o3.b.AD_UNITS.ordinal()) {
                    if (m3.this.f48936a.f().size() > 0) {
                        AbstractC1775d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f48942a, new d());
                        return;
                    } else {
                        n7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", m3.this);
                        return;
                    }
                }
                if (j2Var.a() == o3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (m3.this.f48936a.k().size() <= 0 && m3.this.f48936a.w().size() <= 0) {
                        n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                        return;
                    } else if (m3.this.f48936a.t().s0().c()) {
                        n7.a("Restart Required", r2Var.b(), m3.this);
                        return;
                    } else {
                        AbstractC1775d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f48942a, new e());
                        return;
                    }
                }
                if (j2Var.a() == o3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (!m3.this.f48936a.t().s0().c()) {
                        m3.this.getSdk().s0().a();
                        n7.a("Restart Required", r2Var.b(), m3.this);
                        return;
                    } else if (m3.this.f48936a.v().size() > 0) {
                        AbstractC1775d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.f48942a, new f());
                        return;
                    } else {
                        n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                        return;
                    }
                }
                if (j2Var.a() == o3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    AbstractC1775d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f48942a, new g());
                    return;
                }
                return;
            }
            if ((iB == o3.e.INCOMPLETE_NETWORKS.ordinal() || iB == o3.e.COMPLETED_NETWORKS.ordinal()) && (r2Var instanceof z3)) {
                AbstractC1775d.a(m3.this, MaxDebuggerDetailActivity.class, this.f48942a, new h(r2Var));
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

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f48938c = (FrameLayout) findViewById(android.R.id.content);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f48939d = listView;
        listView.setAdapter((ListAdapter) this.f48936a);
    }

    private void b() {
        o3 o3Var = this.f48936a;
        if (o3Var == null) {
            return;
        }
        String strP = o3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        o3 o3Var = this.f48936a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    public void setListAdapter(o3 o3Var, C1773c c1773c) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.f48936a;
        if (o3Var2 != null && (dataSetObserver = this.f48937b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f48936a = o3Var;
        this.f48937b = new a();
        b((Context) this);
        this.f48936a.registerDataSetObserver(this.f48937b);
        this.f48936a.a(new b(c1773c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f48940e;
        if (aVar != null) {
            aVar.b();
            this.f48938c.removeView(this.f48940e);
            this.f48940e = null;
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, android.R.attr.progressBarStyleLarge);
        this.f48940e = aVar;
        aVar.setColor(-3355444);
        this.f48938c.addView(this.f48940e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f48938c.bringChildToFront(this.f48940e);
        this.f48940e.a();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.f48936a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.f48937b);
            this.f48936a.a((s2.a) null);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        o3 o3Var = this.f48936a;
        if (o3Var != null && !o3Var.y()) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        n7.a(this.f48936a.i(), this.f48936a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f48936a.h()) || this.f48936a.x()) {
            return;
        }
        this.f48936a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.VoU
            @Override // java.lang.Runnable
            public final void run() {
                this.f47855n.a(context);
            }
        });
    }
}
