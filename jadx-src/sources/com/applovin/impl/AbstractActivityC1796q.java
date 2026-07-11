package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractActivityC1796q extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f49758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f49759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f49760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f49762e;

    /* JADX INFO: renamed from: com.applovin.impl.q$a */
    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f49763e;

        @Override // com.applovin.impl.s2
        protected int b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f49763e = list;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            return AbstractActivityC1796q.this.f49760c;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return this.f49763e.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return new v4("");
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.f49761d ? "Selective Init " : "");
        sb.append("Ad Units");
        setTitle(sb.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f49762e = listView;
        listView.setAdapter((ListAdapter) this.f49759b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final C1802k c1802k, j2 j2Var, r2 r2Var) {
        final C1793n c1793n = (C1793n) list.get(j2Var.a());
        if (c1793n.g().size() == 1) {
            AbstractC1775d.a(this, MaxDebuggerAdUnitDetailActivity.class, c1802k.e(), new AbstractC1775d.b() { // from class: com.applovin.impl.I7
                @Override // com.applovin.impl.AbstractC1775d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c1793n, null, null, c1802k);
                }
            });
        } else {
            AbstractC1775d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, c1802k.e(), new AbstractC1775d.b() { // from class: com.applovin.impl.giR
                @Override // com.applovin.impl.AbstractC1775d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c1793n, c1802k);
                }
            });
        }
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f49758a;
    }

    public void initialize(final List<C1793n> list, boolean z2, final C1802k c1802k) {
        this.f49761d = z2;
        this.f49758a = c1802k;
        this.f49760c = a(list);
        a aVar = new a(this, list);
        this.f49759b = aVar;
        aVar.a(new s2.a() { // from class: com.applovin.impl.FP
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f47720n.a(list, c1802k, j2Var, r2Var);
            }
        });
        this.f49759b.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1793n c1793n = (C1793n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1793n.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1793n.b(), -16777216));
            arrayList.add(r2.a(r2.c.DETAIL).b(StringUtils.createSpannedString(c1793n.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
