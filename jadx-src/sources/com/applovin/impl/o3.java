package com.applovin.impl;

import aT.dE.JLZo;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a7;
import com.applovin.impl.b0;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class o3 extends s2 implements AppLovinCommunicatorSubscriber, b0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private List f49539A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List f49540B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private List f49541C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1802k f49542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f49543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f49544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f49545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f49546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f49547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f49548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f49549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f49550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final StringBuilder f49551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f49552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f49553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f49554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f49555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f49556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f49557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f49558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f49559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f49560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f49561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f49562y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f49563z;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public boolean a(r2 r2Var) {
        if (r2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(r2Var.k().toString());
    }

    public void b(boolean z2) {
        this.f49553p = z2;
    }

    @Override // com.applovin.impl.s2
    protected List c(int i2) {
        return i2 == e.APP_INFO.ordinal() ? this.f49560w : i2 == e.MAX.ordinal() ? this.f49561x : i2 == e.PRIVACY.ordinal() ? this.f49562y : i2 == e.ADS.ordinal() ? this.f49563z : i2 == e.INCOMPLETE_NETWORKS.ordinal() ? this.f49539A : i2 == e.COMPLETED_NETWORKS.ordinal() ? this.f49540B : this.f49541C;
    }

    public List d() {
        ArrayList<a7> arrayList = new ArrayList();
        Iterator it = this.f49543f.iterator();
        while (it.hasNext()) {
            arrayList.add(((e3) it.next()).t());
        }
        String strK = this.f49542e.r0().k();
        if (strK != null) {
            String strC = this.f49542e.r0().c();
            for (a7 a7Var : arrayList) {
                if (a7Var.f() == a7.a.TCF_VENDOR && a7Var.d() != null) {
                    a7Var.a(Boolean.valueOf(c7.a(strK, a7Var.d().intValue() - 1)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK && a7Var.d() != null) {
                    a7Var.a(c7.a(a7Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((a7) it2.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i2) {
        return i2 == e.APP_INFO.ordinal() ? new v4("APP INFO") : i2 == e.MAX.ordinal() ? new v4("MAX") : i2 == e.PRIVACY.ordinal() ? new v4("PRIVACY") : i2 == e.ADS.ordinal() ? new v4("ADS") : i2 == e.INCOMPLETE_NETWORKS.ordinal() ? new v4("INCOMPLETE SDK INTEGRATIONS") : i2 == e.COMPLETED_NETWORKS.ordinal() ? new v4("COMPLETED SDK INTEGRATIONS") : new v4("MISSING SDK INTEGRATIONS");
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49564a;

        static {
            int[] iArr = new int[b0.b.values().length];
            f49564a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49564a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49564a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49564a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49564a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private List g() {
        boolean zC2 = this.f49542e.s0().c();
        List listB = this.f49542e.s0().b();
        return zC2 ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo packageInfoA = n7.a(this.f49908a, 0);
        String str = packageInfoA != null ? packageInfoA.versionName : null;
        arrayList.add(r2.a().d("Package Name").c(this.f49908a.getPackageName()).a());
        r2.b bVarD = r2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(r2.a().d(JavetError.PARAMETER_OS).c(n7.d()).a());
        arrayList.add(r2.a().d("Account").c(StringUtils.isValidString(this.f49549l) ? this.f49549l : "None").a());
        arrayList.add(r2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f49542e.V()) ? this.f49542e.V() : "None").a());
        arrayList.add(r2.a().d("OM SDK Version").c(this.f49542e.e0().c()).a());
        arrayList.add(a(C1802k.F0()));
        return arrayList;
    }

    private r2 l() {
        String strD = this.f49542e.r0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f49542e.r0().j());
        r2.b bVarD = r2.a(r2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        r2.b bVarC = bVarD.c(strD);
        if (this.f49550m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f49908a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z2 = this.f49542e.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z2 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(m0.a(z2 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f49908a));
            }
        }
        return bVarC.a();
    }

    private r2 n() {
        boolean zHasSupportedCmp = this.f49542e.s().hasSupportedCmp();
        return r2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f49908a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(r2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f49542e.a(x4.f50772L3);
        r2.b bVarD = r2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f49542e.H0()) {
            String strA = n7.a(this.f49542e.n0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f49542e.x().j()) {
            arrayList.add(m());
            arrayList.add(n());
            return arrayList;
        }
        if (this.f49542e.x().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f49542e.r0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new r4(p0.b(), false, this.f49908a));
        }
        arrayList.add(new r4(p0.a(), true, this.f49908a));
        return arrayList;
    }

    private void z() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + n7.c(this.f49542e));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f49542e.s0().c() ? "enabled" : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.f49542e.A().G().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f49542e.a(x4.f50772L3);
        String strB = C1784j.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb4.append(strB);
        sb.append(sb4.toString());
        if (this.f49542e.H0()) {
            String strA = n7.a(this.f49542e.n0());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(strA) ? strA : "None");
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(p0.a(this.f49908a));
        sb.append(this.f49542e.x().e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f49542e.r0().i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb.append(((a7) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f49555r.iterator();
        while (it2.hasNext()) {
            a(sb, ((e3) it2.next()).j());
        }
        Iterator it3 = this.f49554q.iterator();
        while (it3.hasNext()) {
            a(sb, ((e3) it3.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f49544g.iterator();
        while (it4.hasNext()) {
            a(sb, ((C1793n) it4.next()).e());
        }
        sb.append("\n========== END ==========");
        C1804o.g("MediationDebuggerListAdapter", sb.toString());
        this.f49551n.append(sb.toString());
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return e.COUNT.ordinal();
    }

    public List f() {
        return this.f49544g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f49548k;
    }

    public String i() {
        return this.f49547j;
    }

    public List k() {
        return this.f49557t;
    }

    public List o() {
        return this.f49545h;
    }

    public String p() {
        return this.f49551n.toString();
    }

    public C1802k t() {
        return this.f49542e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f49552o.get() + "}";
    }

    public List v() {
        return this.f49559v;
    }

    public List w() {
        return this.f49558u;
    }

    public boolean x() {
        return this.f49553p;
    }

    public boolean y() {
        return this.f49552o.get();
    }

    public o3(Context context) {
        super(context);
        this.f49551n = new StringBuilder("");
        this.f49552o = new AtomicBoolean();
        this.f49554q = new ArrayList();
        this.f49555r = new ArrayList();
        this.f49556s = new ArrayList();
        this.f49557t = new ArrayList();
        this.f49558u = new ArrayList();
        this.f49559v = new ArrayList();
        this.f49560w = new ArrayList();
        this.f49561x = new ArrayList();
        this.f49562y = new ArrayList();
        this.f49563z = new ArrayList();
        this.f49539A = new ArrayList();
        this.f49540B = new ArrayList();
        this.f49541C = new ArrayList();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1794o c1794oF = ((C1793n) it.next()).f();
            Iterator it2 = c1794oF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((i8) it2.next()).b());
            }
            Iterator it3 = c1794oF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((i8) it3.next()).b());
            }
        }
        this.f49557t = new ArrayList(hashSet);
        this.f49558u = new ArrayList(hashSet2);
        Collections.sort(this.f49557t);
        Collections.sort(this.f49558u);
    }

    private r2 m() {
        return r2.a().d("MAX Terms and Privacy Policy Flow").a(this.f49908a).a(true).a();
    }

    private r2 r() {
        return r2.a().d("Network Consent Statuses").a(this.f49908a).a(true).a();
    }

    private r2 u() {
        return r2.a().d(KfLR.cSPKqMknWM).a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f49908a)).b("Terms Flow has been replaced").a(this.f49542e.x().g()).a(true).a();
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z2, C1802k c1802k) {
        this.f49542e = c1802k;
        this.f49543f = list;
        this.f49544g = list2;
        this.f49545h = list3;
        this.f49546i = list4;
        this.f49547j = str;
        this.f49548k = str2;
        this.f49549l = str3;
        this.f49550m = z2;
        if (list != null && this.f49552o.compareAndSet(false, true)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f49555r);
            this.f49560w.addAll(j());
            this.f49561x.addAll(q());
            this.f49562y.addAll(s());
            this.f49563z.addAll(g());
            this.f49539A = a(this.f49554q);
            this.f49540B = a(this.f49555r);
            this.f49541C = a(this.f49556s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f49908a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.oJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f49629n.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f49562y = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f49539A = a(this.f49554q);
            this.f49540B = a(this.f49555r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f49563z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f49563z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    @Override // com.applovin.impl.s2
    protected int d(int i2) {
        if (i2 == e.APP_INFO.ordinal()) {
            return this.f49560w.size();
        }
        if (i2 == e.MAX.ordinal()) {
            return this.f49561x.size();
        }
        if (i2 == e.PRIVACY.ordinal()) {
            return this.f49562y.size();
        }
        if (i2 == e.ADS.ordinal()) {
            return this.f49563z.size();
        }
        if (i2 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f49539A.size();
        }
        if (i2 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.f49540B.size();
        }
        return this.f49541C.size();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (!e3Var.G()) {
                if (e3Var.q() != e3.a.INCOMPLETE_INTEGRATION && e3Var.q() != e3.a.INVALID_INTEGRATION) {
                    if (e3Var.q() == e3.a.COMPLETE) {
                        this.f49555r.add(e3Var);
                    } else if (e3Var.q() == e3.a.MISSING) {
                        this.f49556s.add(e3Var);
                    }
                } else {
                    this.f49554q.add(e3Var);
                }
            }
        }
    }

    private r2 e() {
        String string;
        r2.b bVarD = r2.a().d("Ad Review Version");
        String strB = C1784j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = C1784j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f49542e.i0())) {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb.append(this.f49542e.H0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb.append(" from the correct account.");
                string = sb.toString();
            }
        } else {
            string = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (string != null) {
            bVarD.b("MAX Ad Review").a(string).a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f49908a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private r2 b(String str, String str2) {
        r2.b bVarD = r2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(m0.a(R.color.applovin_sdk_xmarkColor, this.f49908a));
        }
        return bVarD.a();
    }

    private r2 b(String str) {
        r2.b bVarA = r2.a();
        if (this.f49542e.s0().c()) {
            bVarA.a(this.f49908a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Test Mode Network");
        r2.b bVarD = bVarA.d(sb.toString());
        if (!this.f49542e.s0().c()) {
            str = YmsTEL.eIvdafKgk;
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.y() == e3.b.READY) {
                this.f49559v.add(e3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(C1816z c1816z, String str) {
        String strA;
        c cVarA;
        c cVar;
        String str2;
        List<a0> listA = b0.a(c1816z, this.f49546i);
        if (listA.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : listA) {
                this.f49542e.O();
                if (C1804o.a()) {
                    this.f49542e.O().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + a0Var2.d());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, a0Var.d());
                cVarA = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str3 = strA;
            cVar = cVarA;
            str2 = str3;
        }
        this.f49561x.add(a(str2, cVar));
        c();
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.f49542e.O();
            if (C1804o.a()) {
                this.f49542e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f49561x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (string.length() + str.length() >= ((Integer) this.f49542e.a(x4.f50837r)).intValue()) {
            C1804o.g("MediationDebuggerListAdapter", string);
            this.f49551n.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(r2.a().d("View Ad Units (" + this.f49544g.size() + ")").a(this.f49908a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f49545h.isEmpty()) {
            arrayList.add(r2.a().d("Selective Init Ad Units (" + this.f49545h.size() + ")").a(this.f49908a).a(true).a());
        }
        arrayList.add(r2.a().d("Test Mode Enabled").c(String.valueOf(this.f49542e.s0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z3((e3) it.next(), this.f49908a));
        }
        return arrayList;
    }

    private r2 a(String str) {
        r2.b bVarA = r2.a();
        if (!this.f49542e.s0().c()) {
            bVarA.a(this.f49908a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Live Network");
        r2.b bVarD = bVarA.d(sb.toString());
        if (this.f49542e.s0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private r2 a(boolean z2) {
        return r2.a().d("Java 8").a(z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f49908a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z2).a();
    }

    private r2 a(String str, c cVar) {
        int i2;
        int iA;
        if (cVar == c.SUCCESS) {
            i2 = R.drawable.applovin_ic_check_mark_bordered;
            iA = m0.a(R.color.applovin_sdk_checkmarkColor, this.f49908a);
        } else if (cVar == c.WARNING) {
            i2 = R.drawable.applovin_ic_warning;
            iA = m0.a(R.color.applovin_sdk_warningColor, this.f49908a);
        } else {
            i2 = R.drawable.applovin_ic_x_mark;
            iA = m0.a(R.color.applovin_sdk_xmarkColor, this.f49908a);
        }
        return r2.a().d("app-ads.txt").a(i2).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i2 = a.f49564a[bVar.ordinal()];
        if (i2 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i2 == 2) {
            return JLZo.cUC;
        }
        if (i2 == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i2 != 4) {
            if (i2 != 5) {
                return "";
            }
            return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    private c a(b0.b bVar) {
        int i2 = a.f49564a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return c.ERROR;
        }
        if (i2 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z2) {
            for (u2 u2Var : this.f49557t) {
                if (list.equals(u2Var.b())) {
                    return u2Var.a();
                }
            }
            for (u2 u2Var2 : this.f49558u) {
                if (list.equals(u2Var2.b())) {
                    return u2Var2.a();
                }
            }
        } else {
            for (e3 e3Var : this.f49559v) {
                if (list.equals(e3Var.u())) {
                    return e3Var.g();
                }
            }
        }
        return zpl.n(",", list);
    }
}
