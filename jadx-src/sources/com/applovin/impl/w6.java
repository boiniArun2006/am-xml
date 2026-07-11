package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f50708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f50709b;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f50710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f50711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f50712g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
            super(context);
            this.f50710e = arrayList;
            this.f50711f = arrayList2;
            this.f50712g = z2;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            return i2 == b.TC_NETWORKS.ordinal() ? this.f50710e : this.f50711f;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return i2 == b.TC_NETWORKS.ordinal() ? this.f50710e.size() : this.f50711f.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            if (i2 == b.TC_NETWORKS.ordinal()) {
                return new v4("TCF VENDORS (TC STRING)");
            }
            return new v4(this.f50712g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return b.values().length;
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
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
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f50709b);
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f50708a;
    }

    public void initialize(List<a7> list, C1802k c1802k) {
        this.f50708a = c1802k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = p0.b().a(this);
        boolean zB = c1802k.r0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (a7 a7Var : list) {
            Boolean boolA = a7Var.a();
            if (boolA != null) {
                if (a7Var.f() == a7.a.TCF_VENDOR) {
                    arrayList.add(a(a7Var.b(), String.valueOf(boolA)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK) {
                    arrayList2.add(a(a7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && a7Var.f() == a7.a.ATP_NETWORK) {
                arrayList2.add(a(a7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f50709b = aVar;
        aVar.notifyDataSetChanged();
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }
}
