package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l0 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f48849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f48850b;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f48851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f48852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f48853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f48854h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f48855i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f48851e = list;
            this.f48852f = list2;
            this.f48853g = list3;
            this.f48854h = list4;
            this.f48855i = list5;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            List list;
            boolean z2 = true;
            if (i2 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f48851e;
            } else if (i2 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f48852f;
            } else {
                z2 = false;
                list = i2 == c.LISTED_TC_NETWORKS.ordinal() ? this.f48853g : i2 == c.LISTED_AC_NETWORKS.ordinal() ? this.f48854h : this.f48855i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((a7) it.next(), z2));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return i2 == c.MISSING_TC_NETWORKS.ordinal() ? this.f48851e.size() : i2 == c.MISSING_AC_NETWORKS.ordinal() ? this.f48852f.size() : i2 == c.LISTED_TC_NETWORKS.ordinal() ? this.f48853g.size() : i2 == c.LISTED_AC_NETWORKS.ordinal() ? this.f48854h.size() : this.f48855i.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return i2 == c.MISSING_TC_NETWORKS.ordinal() ? new v4("MISSING TCF VENDORS (TC STRING)") : i2 == c.MISSING_AC_NETWORKS.ordinal() ? new v4("MISSING ATP NETWORKS (AC STRING)") : i2 == c.LISTED_TC_NETWORKS.ordinal() ? new v4("LISTED TCF VENDORS (TC STRING)") : i2 == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return c.values().length;
        }
    }

    class b implements s2.a {
        b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), l0.this);
        }
    }

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f48850b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z2) {
        r2.b bVarA = r2.a();
        boolean zB = this.f48849a.r0().b();
        a7.a aVarF = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (aVarF == aVar || (a7Var.f() == a7.a.ATP_NETWORK && zB)) {
            String strC = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarA.d(strC).d(z2 ? -65536 : -16777216).b(strC).a(str + a7Var.d()).a(true);
        } else {
            bVarA.d(a7Var.b());
        }
        return bVarA.a();
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f48849a;
    }

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, C1802k c1802k) {
        this.f48849a = c1802k;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f48850b = aVar;
        aVar.a(new b());
        this.f48850b.notifyDataSetChanged();
    }
}
