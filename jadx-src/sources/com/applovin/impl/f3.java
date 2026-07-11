package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.AbstractC1775d;
import com.applovin.impl.e3;
import com.applovin.impl.g3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class f3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g3 f48520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f48521b;

    class a implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e3 f48522a;

        /* JADX INFO: renamed from: com.applovin.impl.f3$a$a, reason: collision with other inner class name */
        class C0700a implements AbstractC1775d.b {
            C0700a() {
            }

            @Override // com.applovin.impl.AbstractC1775d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f48522a);
            }
        }

        a(e3 e3Var) {
            this.f48522a = e3Var;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() == g3.a.TEST_ADS.ordinal()) {
                C1802k c1802kO = this.f48522a.o();
                e3.b bVarY = this.f48522a.y();
                if (f3.this.f48520a.a(j2Var)) {
                    if (e3.b.READY == bVarY) {
                        AbstractC1775d.a(f3.this, MaxDebuggerMultiAdActivity.class, c1802kO.e(), new C0700a());
                        return;
                    } else if (e3.b.DISABLED == bVarY) {
                        c1802kO.s0().a();
                        n7.a(r2Var.c(), r2Var.b(), f3.this);
                        return;
                    } else {
                        n7.a(r2Var.c(), r2Var.b(), f3.this);
                        return;
                    }
                }
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            n7.a(r2Var.c(), r2Var.b(), f3.this);
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
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f48521b = listView;
        listView.setAdapter((ListAdapter) this.f48520a);
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        g3 g3Var = this.f48520a;
        if (g3Var != null) {
            return g3Var.h().o();
        }
        return null;
    }

    public f3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(e3 e3Var) {
        setTitle(e3Var.g());
        g3 g3Var = new g3(e3Var, this);
        this.f48520a = g3Var;
        g3Var.a(new a(e3Var));
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f48520a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f48520a.k();
            this.f48520a.c();
        }
    }
}
