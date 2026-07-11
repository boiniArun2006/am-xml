package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class d7 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f48352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f48353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f48354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s2 f48355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f48356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f48357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListView f48358g;

    class a extends s2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        protected r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            return i2 == c.BIDDERS.ordinal() ? d7.this.f48356e : d7.this.f48357f;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return i2 == c.BIDDERS.ordinal() ? d7.this.f48356e.size() : d7.this.f48357f.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return i2 == c.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
        }
    }

    class b extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ u2 f48360p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e3 e3Var, Context context, u2 u2Var) {
            super(e3Var, context);
            this.f48360p = u2Var;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (d7.this.f48352a.s0().b() == null || !d7.this.f48352a.s0().b().equals(this.f48360p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (d7.this.f48352a.s0().b() == null || !d7.this.f48352a.s0().b().equals(this.f48360p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            int i2;
            if (o()) {
                i2 = -16777216;
            } else {
                i2 = -7829368;
            }
            return StringUtils.createSpannedString(this.f48360p.a(), i2, 18, 1);
        }
    }

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f48358g = listView;
        listView.setAdapter((ListAdapter) this.f48355d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C1802k c1802k, j2 j2Var, r2 r2Var) {
        List listB = a(j2Var).b();
        if (listB.equals(c1802k.s0().b())) {
            c1802k.s0().a((List) null);
        } else {
            c1802k.s0().a(listB);
        }
        this.f48355d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f48352a;
    }

    public void initialize(List<u2> list, List<u2> list2, final C1802k c1802k) {
        this.f48352a = c1802k;
        this.f48353b = list;
        this.f48354c = list2;
        this.f48356e = a(list);
        this.f48357f = a(list2);
        a aVar = new a(this);
        this.f48355d = aVar;
        aVar.a(new s2.a() { // from class: com.applovin.impl.lej
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f48916n.a(c1802k, j2Var, r2Var);
            }
        });
        this.f48355d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f48356e = a(this.f48353b);
        this.f48357f = a(this.f48354c);
        this.f48355d.c();
    }

    public d7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u2 u2Var = (u2) it.next();
            arrayList.add(new b(u2Var.d(), this, u2Var));
        }
        return arrayList;
    }

    private u2 a(j2 j2Var) {
        if (j2Var.b() == c.BIDDERS.ordinal()) {
            return (u2) this.f48353b.get(j2Var.a());
        }
        return (u2) this.f48354c.get(j2Var.a());
    }
}
