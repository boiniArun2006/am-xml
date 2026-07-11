package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractActivityC1783i7 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f48741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f48742b;

    /* JADX INFO: renamed from: com.applovin.impl.i7$a */
    class a extends s2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        protected List c(int i2) {
            return i2 == d.SETTINGS.ordinal() ? AbstractActivityC1783i7.this.c() : AbstractActivityC1783i7.this.a();
        }

        @Override // com.applovin.impl.s2
        protected int d(int i2) {
            return i2 == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i2) {
            return i2 == d.SETTINGS.ordinal() ? new v4("SETTINGS") : new v4("GDPR APPLICABILITY");
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return d.values().length;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.i7$b */
    class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1802k f48744a;

        b(C1802k c1802k) {
            this.f48744a = c1802k;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() == d.SETTINGS.ordinal()) {
                if (j2Var.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f48744a.x().f() != null) {
                        k7.a(this.f48744a.x().f(), C1802k.o(), this.f48744a);
                        return;
                    } else {
                        n7.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", AbstractActivityC1783i7.this);
                        return;
                    }
                }
                if (j2Var.a() == e.TERMS_OF_SERVICE_URL.ordinal() && this.f48744a.x().h() != null) {
                    k7.a(this.f48744a.x().h(), C1802k.o(), this.f48744a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.i7$c */
    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* JADX INFO: renamed from: com.applovin.impl.i7$d */
    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* JADX INFO: renamed from: com.applovin.impl.i7$e */
    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
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
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f48742b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f48741a.v().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = this.f48741a.x().d();
        boolean z2 = n7.c(this.f48741a) && consentFlowUserGeographyD != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(r2.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z2));
        arrayList.add(b(consentFlowUserGeographyD, z2));
        return arrayList;
    }

    private r2 b() {
        boolean z2 = this.f48741a.x().f() != null;
        return r2.a().d("Privacy Policy URL").a(z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    protected C1802k getSdk() {
        return this.f48741a;
    }

    public void initialize(C1802k c1802k) {
        this.f48741a = c1802k;
        a aVar = new a(this);
        this.f48742b = aVar;
        aVar.a(new b(c1802k));
        this.f48742b.notifyDataSetChanged();
    }

    private r2 d() {
        r2.b bVarD = r2.a().d("Terms of Service URL");
        if (this.f48741a.x().h() != null) {
            bVarD.a(R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(m0.a(R.color.applovin_sdk_checkmarkColor, this));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f48742b;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    private r2 a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z2) {
        return r2.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z2).a();
    }

    private r2 b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z2) {
        return r2.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z2).a();
    }
}
