package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractActivityC1795p extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1793n f49636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1802k f49637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f49638c;

    /* JADX INFO: renamed from: com.applovin.impl.p$a */
    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1793n f49639e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C1793n c1793n) {
            super(context);
            this.f49639e = c1793n;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return this.f49639e.g().size();
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            ArrayList arrayList = new ArrayList();
            C1794o c1794o = (C1794o) this.f49639e.g().get(i2);
            arrayList.add(AbstractActivityC1795p.this.c(c1794o.c()));
            if (c1794o.b() != null) {
                arrayList.add(AbstractActivityC1795p.this.a("AB Test Experiment Name", c1794o.b()));
            }
            k8 k8VarD = c1794o.d();
            AbstractActivityC1795p abstractActivityC1795p = AbstractActivityC1795p.this;
            arrayList.add(abstractActivityC1795p.a("Device ID Targeting", abstractActivityC1795p.a(k8VarD.a())));
            AbstractActivityC1795p abstractActivityC1795p2 = AbstractActivityC1795p.this;
            arrayList.add(abstractActivityC1795p2.a("Device Type Targeting", abstractActivityC1795p2.b(k8VarD.b())));
            if (k8VarD.c() != null) {
                arrayList.add(AbstractActivityC1795p.this.a(k8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            C1794o c1794o = (C1794o) this.f49639e.g().get(i2);
            return (c1794o.b() != null ? 1 : 0) + 3 + (c1794o.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return i2 == b.TARGETED_WATERFALL.ordinal() ? new v4("TARGETED WATERFALL FOR CURRENT DEVICE") : i2 == b.OTHER_WATERFALLS.ordinal() ? new v4("OTHER WATERFALLS") : new v4("");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p$b */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
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
        setTitle(this.f49636a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f49638c);
        listView.setDividerHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 c(String str) {
        return r2.a(r2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f49637b;
    }

    public void initialize(final C1793n c1793n, final C1802k c1802k) {
        this.f49636a = c1793n;
        this.f49637b = c1802k;
        a aVar = new a(this, c1793n);
        this.f49638c = aVar;
        aVar.a(new s2.a() { // from class: com.applovin.impl.MKd
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f47776n.a(c1802k, c1793n, j2Var, r2Var);
            }
        });
        this.f49638c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f49638c;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final C1802k c1802k, final C1793n c1793n, final j2 j2Var, r2 r2Var) {
        if (j2Var.a() == 0) {
            AbstractC1775d.a(this, MaxDebuggerAdUnitDetailActivity.class, c1802k.e(), new AbstractC1775d.b() { // from class: com.applovin.impl.Dt
                @Override // com.applovin.impl.AbstractC1775d.b
                public final void a(Activity activity) {
                    AbstractActivityC1795p.a(c1793n, j2Var, c1802k, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            AbstractC1775d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, c1802k.e(), new AbstractC1775d.b() { // from class: com.applovin.impl.Buf
                @Override // com.applovin.impl.AbstractC1775d.b
                public final void a(Activity activity) {
                    AbstractActivityC1795p.a(c1793n, j2Var, c1802k, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1793n c1793n, j2 j2Var, C1802k c1802k, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1793n, (C1794o) c1793n.g().get(j2Var.b()), null, c1802k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1793n c1793n, j2 j2Var, C1802k c1802k, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C1794o c1794o = (C1794o) c1793n.g().get(j2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c1794o.c(), c1794o.d().c(), c1802k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(String str, String str2) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(List list) {
        return r2.a(r2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
