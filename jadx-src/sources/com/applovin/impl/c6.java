package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.d6;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.caoccao.javet.exceptions.JavetError;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class c6 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1802k f48196g;

    public c6(C1802k c1802k) {
        super("TaskInitializeSdk", c1802k, true);
        this.f48196g = c1802k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.f48196g.D().a("license_validation", exc);
        }
        this.f48196g.q0().a(new s6(this.f48196g, p2Var, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f48196g.S().a(this.f48196g.e().b());
    }

    private void f() {
        if (this.f48196g.S().c()) {
            return;
        }
        Activity activityU0 = this.f48196g.u0();
        if (activityU0 != null) {
            this.f48196g.S().a(activityU0);
            return;
        }
        this.f48196g.D().a(d2.D0, this.f48734b + ":maybeInitializeAdapters()");
        this.f48196g.q0().a(new C1797r6(this.f48196g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.g9s
            @Override // java.lang.Runnable
            public final void run() {
                this.f48620n.e();
            }
        }), d6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    private void g() {
        String str;
        boolean zC2 = this.f48196g.o0().c();
        Map mapP = this.f48196g.A().p();
        Map mapM = this.f48196g.A().M();
        String strA = zC2 ? this.f48196g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC2) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f48196g.a(x4.f50772L3)).a("Ad Review Version", C1784j.b()).a("OM SDK Version", this.f48196g.e0().c());
        v2Var.a("===Device Info===").a(JavetError.PARAMETER_OS, n7.d()).a("GAID", strA).a("App Set ID", str).a("Model", mapP.get("model")).a("Locale", mapP.get("locale")).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.f48196g.i0()).a("Mediation Provider", this.f48196g.V()).a("TG", m7.a(this.f48196g)).a("MD", this.f48196g.a(x4.f50843t)).a("Test Mode On", Boolean.valueOf(this.f48196g.s0().c())).a("Verbose Logging On", Boolean.valueOf(zC2));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 u0VarX = this.f48196g.x();
        boolean zJ = u0VarX.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f48196g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = u0VarX.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (n7.c(this.f48196g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", u0VarX.f()).a("Terms of Service URI", u0VarX.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f48196g.r0().i());
        v2Var.a();
        C1804o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l2 = (Long) this.f48196g.a(x4.f50851y);
        if (l2.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.f51006i, Boolean.FALSE, C1802k.o());
        Boolean bool2 = (Boolean) this.f48196g.a(x4.f50852z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f48196g.N().a(l2.longValue()).a(this.f48196g.q0().a("lv_task"), new s4.b() { // from class: com.applovin.impl.afx
                @Override // com.applovin.impl.s4.b
                public final void a(boolean z2, Object obj, Object obj2) {
                    this.f48080n.a(z2, (p2) obj, (Exception) obj2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01e7 A[PHI: r8 r9 r10
      0x01e7: PHI (r8v18 com.applovin.impl.sdk.o) = (r8v14 com.applovin.impl.sdk.o), (r8v66 com.applovin.impl.sdk.o) binds: [B:45:0x01e5, B:32:0x0178] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r9v9 java.lang.String) = (r9v8 java.lang.String), (r9v18 java.lang.String) binds: [B:45:0x01e5, B:32:0x0178] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r10v4 java.lang.StringBuilder) = (r10v3 java.lang.StringBuilder), (r10v8 java.lang.StringBuilder) binds: [B:45:0x01e5, B:32:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        String str;
        C1804o c1804o;
        String str2;
        StringBuilder sb;
        str = "failed";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f48196g.G().b(a());
            this.f48196g.G().e(a());
            this.f48196g.q0().a((AbstractRunnableC1782i5) new j5(this.f48196g), d6.b.OTHER);
            this.f48196g.A().b0();
            this.f48196g.l0().c();
            this.f48196g.y().l();
            if (n7.c(this.f48196g)) {
                this.f48196g.a();
            }
            this.f48196g.X0();
            g();
            f();
            this.f48196g.a(true);
            h();
            this.f48196g.f0().b();
            this.f48196g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f48196g.a(x4.C2)).booleanValue()) {
                this.f48196g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f48196g.F().maybeTrackAppOpenEvent();
            this.f48196g.z().a();
            if (((Boolean) this.f48196g.a(x4.P2)).booleanValue()) {
                this.f48196g.x0().b();
            }
            if (((Boolean) this.f48196g.a(x4.X0)).booleanValue()) {
                this.f48196g.h().b();
            } else {
                this.f48196g.h().g();
            }
            if (this.f48196g.U().g() || (((Boolean) this.f48196g.a(r3.u7)).booleanValue() && n7.c(this.f48196g) && this.f48196g.G0())) {
                this.f48196g.U().e();
            }
            this.f48196g.e0().i();
        } catch (Throwable th) {
            try {
                C1804o.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f48196g.a(false);
                a(th);
                if (((Boolean) this.f48196g.a(x4.f50821i)).booleanValue()) {
                    this.f48196g.f0().a();
                }
                if (((Boolean) this.f48196g.a(x4.f50820h)).booleanValue()) {
                    this.f48196g.T0();
                }
                this.f48196g.e0().i();
                if (!C1804o.a()) {
                    return;
                }
                c1804o = this.f48735c;
                str2 = this.f48734b;
                sb = new StringBuilder();
                sb.append("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (this.f48196g.B0()) {
                }
            } catch (Throwable th2) {
                this.f48196g.e0().i();
                if (C1804o.a()) {
                    C1804o c1804o2 = this.f48735c;
                    String str3 = this.f48734b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.f48196g.B0() ? "succeeded" : "failed");
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb2.append("ms");
                    c1804o2.a(str3, sb2.toString());
                }
                throw th2;
            }
        }
        if (C1804o.a()) {
            c1804o = this.f48735c;
            str2 = this.f48734b;
            sb = new StringBuilder();
            sb.append("AppLovin SDK ");
            sb.append(AppLovinSdk.VERSION);
            sb.append(" initialization ");
            if (this.f48196g.B0()) {
                str = "succeeded";
            }
            sb.append(str);
            sb.append(" in ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            c1804o.a(str2, sb.toString());
        }
    }
}
