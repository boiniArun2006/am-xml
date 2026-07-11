package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class o1 extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q1 f49527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1802k f49528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f49529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f49530d;

    public void a(q1 q1Var, C1802k c1802k) {
        this.f49527a = q1Var;
        this.f49528b = c1802k;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f49527a.d() + " - " + this.f49527a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        e8.a(findViewById(android.R.id.content), this.f49528b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f49530d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.tmw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50543n.a(view);
            }
        });
    }

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.f49528b.y().a(this.f49527a));
        String strB = this.f49528b.y().b(this.f49527a);
        if (strB != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f49529c = textView;
        textView.setText(v2Var.toString());
        this.f49529c.setTextColor(-16777216);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f49528b.y().a(this.f49527a, (Context) this, true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share == menuItem.getItemId()) {
            this.f49528b.y().a(this.f49527a, (Context) this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private boolean a() {
        return (this.f49527a == null || this.f49528b == null) ? false : true;
    }
}
