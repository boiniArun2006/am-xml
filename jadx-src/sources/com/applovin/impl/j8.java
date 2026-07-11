package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j8 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1802k f48784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f48785c;

    class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f48786e;

        @Override // com.applovin.impl.s2
        protected int b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f48786e = list;
        }

        @Override // com.applovin.impl.s2
        protected r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            return this.f48786e;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return this.f48786e.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return new v4("SEGMENT TARGETING");
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
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f48783a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f48785c);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r2.a(r2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f48784b;
    }

    public void initialize(String str, List<String> list, C1802k c1802k) {
        this.f48783a = str;
        this.f48784b = c1802k;
        a aVar = new a(this, a(list));
        this.f48785c = aVar;
        aVar.notifyDataSetChanged();
    }
}
