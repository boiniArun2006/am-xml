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
public abstract class e7 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f48486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f48487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f48488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f48489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f48490e;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f48491e;

        @Override // com.applovin.impl.s2
        protected int b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f48491e = list;
        }

        @Override // com.applovin.impl.s2
        protected r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            return e7.this.f48489d;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return this.f48491e.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return new v4("TEST MODE NETWORKS");
        }
    }

    class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f48493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1802k f48494b;

        b(List list, C1802k c1802k) {
            this.f48493a = list;
            this.f48494b = c1802k;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            List listU = ((e3) this.f48493a.get(j2Var.a())).u();
            if (listU.equals(this.f48494b.s0().b())) {
                this.f48494b.s0().a((List) null);
            } else {
                this.f48494b.s0().a(listU);
            }
            e7.this.f48488c.notifyDataSetChanged();
        }
    }

    class c extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ e3 f48496p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e3 e3Var, Context context, e3 e3Var2) {
            super(e3Var, context);
            this.f48496p = e3Var2;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (this.f48496p.u().equals(e7.this.f48486a.s0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (this.f48496p.u().equals(e7.this.f48486a.s0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            int i2;
            if (o()) {
                i2 = -16777216;
            } else {
                i2 = -7829368;
            }
            return StringUtils.createSpannedString(this.f48496p.g(), i2, 18, 1);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f48490e = listView;
        listView.setAdapter((ListAdapter) this.f48488c);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            arrayList.add(new c(e3Var, this, e3Var));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f48486a;
    }

    public void initialize(List<e3> list, C1802k c1802k) {
        this.f48486a = c1802k;
        this.f48487b = list;
        this.f48489d = a(list);
        a aVar = new a(this, list);
        this.f48488c = aVar;
        aVar.a(new b(list, c1802k));
        this.f48488c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f48489d = a(this.f48487b);
        this.f48488c.notifyDataSetChanged();
    }

    public e7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }
}
