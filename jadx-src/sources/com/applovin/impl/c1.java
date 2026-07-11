package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.d1;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class c1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d1 f48166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f48167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f48168c;

    class a implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1773c f48169a;

        /* JADX INFO: renamed from: com.applovin.impl.c1$a$a, reason: collision with other inner class name */
        class C0698a implements AbstractC1775d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2 f48171a;

            C0698a(j2 j2Var) {
                this.f48171a = j2Var;
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((q1) c1.this.f48166a.d().get(this.f48171a.a()), c1.this.f48166a.e());
            }
        }

        a(C1773c c1773c) {
            this.f48169a = c1773c;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != d1.a.RECENT_ADS.ordinal()) {
                return;
            }
            AbstractC1775d.a(c1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f48169a, new C0698a(j2Var));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f48167b = (FrameLayout) findViewById(android.R.id.content);
        this.f48168c = (ListView) findViewById(R.id.listView);
        e8.a(this.f48167b, C1802k.C0);
    }

    public void a(d1 d1Var, C1773c c1773c) {
        this.f48166a = d1Var;
        d1Var.a(new a(c1773c));
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.f48166a;
        if (d1Var != null) {
            d1Var.a((s2.a) null);
            this.f48166a.g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        d1 d1Var = this.f48166a;
        if (d1Var == null) {
            finish();
            return;
        }
        this.f48168c.setAdapter((ListAdapter) d1Var);
        d1 d1Var2 = this.f48166a;
        if (d1Var2 != null && !d1Var2.e().y().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        d1 d1Var3 = this.f48166a;
        if (d1Var3 != null && d1Var3.f()) {
            a(R.string.applovin_creative_debugger_no_ads_text);
        }
    }

    private void a(int i2) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i2);
        this.f48167b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f48167b.bringChildToFront(textView);
    }
}
