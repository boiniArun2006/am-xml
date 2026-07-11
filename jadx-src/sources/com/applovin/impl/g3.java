package com.applovin.impl;

import YgZ.uQga.IYJfqUyym;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class g3 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e3 f48572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f48573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f48574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f48575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f48576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f48577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SpannedString f48578k;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    private r2 f() {
        if (this.f48572e.H()) {
            return null;
        }
        return r2.a().d("Initialization Status").c(f(this.f48572e.i())).a(false).a();
    }

    public boolean a(j2 j2Var) {
        return j2Var.b() == a.TEST_ADS.ordinal() && j2Var.a() == this.f48577j.size() - 1;
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i2) {
        return i2 == a.INTEGRATIONS.ordinal() ? this.f48573f : i2 == a.PERMISSIONS.ordinal() ? this.f48574g : i2 == a.CONFIGURATION.ordinal() ? this.f48575h : i2 == a.DEPENDENCIES.ordinal() ? this.f48576i : this.f48577j;
    }

    @Override // com.applovin.impl.s2
    protected int d(int i2) {
        return i2 == a.INTEGRATIONS.ordinal() ? this.f48573f.size() : i2 == a.PERMISSIONS.ordinal() ? this.f48574g.size() : i2 == a.CONFIGURATION.ordinal() ? this.f48575h.size() : i2 == a.DEPENDENCIES.ordinal() ? this.f48576i.size() : this.f48577j.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i2) {
        return i2 == a.INTEGRATIONS.ordinal() ? new v4("INTEGRATIONS") : i2 == a.PERMISSIONS.ordinal() ? new v4("PERMISSIONS") : i2 == a.CONFIGURATION.ordinal() ? new v4("CONFIGURATION") : i2 == a.DEPENDENCIES.ordinal() ? new v4("DEPENDENCIES") : new v4("TEST ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1 k1Var = (k1) it.next();
                arrayList.add(a(k1Var.b(), k1Var.a(), k1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p4 p4Var = (p4) it.next();
                arrayList.add(a(p4Var.b(), p4Var.a(), p4Var.c(), true));
            }
        }
        return arrayList;
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f48572e.v())) {
            arrayList.add(r2.a(r2.c.DETAIL).d(this.f48572e.v()).a());
        }
        if (this.f48572e.y() == e3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f48572e.s() != null) {
            arrayList.add(c(this.f48572e.s()));
        }
        arrayList.add(a(this.f48572e.y()));
        return arrayList;
    }

    public e3 h() {
        return this.f48572e;
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    g3(e3 e3Var, Context context) {
        super(context);
        this.f48572e = e3Var;
        if (e3Var.q() == e3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f48578k = new SpannedString(spannableString);
        } else {
            this.f48578k = new SpannedString("");
        }
        this.f48573f = g();
        this.f48574g = b(e3Var.n());
        this.f48575h = e();
        this.f48576i = a(e3Var.f());
        this.f48577j = j();
        notifyDataSetChanged();
    }

    private r2 i() {
        r2.b bVarC = r2.a().d("SDK").c(this.f48572e.p());
        if (TextUtils.isEmpty(this.f48572e.p())) {
            bVarC.a(a(this.f48572e.F())).b(b(this.f48572e.F()));
        }
        return bVarC.a();
    }

    public void k() {
        this.f48573f = g();
    }

    private String f(int i2) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i2 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i2 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i2) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i2) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i2) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private r2 a(e3.b bVar) {
        r2.b bVarA = r2.a();
        if (bVar == e3.b.READY) {
            bVarA.a(this.f49908a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z2) {
        return m0.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f49908a);
    }

    private r2 c(List list) {
        return r2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private r2 d() {
        r2.b bVarC = r2.a().d("Adapter").c(this.f48572e.c());
        if (TextUtils.isEmpty(this.f48572e.c())) {
            bVarC.a(a(this.f48572e.z())).b(b(this.f48572e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f48572e.D()) {
            arrayList.add(a(IYJfqUyym.BZYAtXSpvQSos, "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", C1802k.F0(), true));
        }
        return arrayList;
    }

    private int c(boolean z2) {
        return z2 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z2) {
        return m0.a(z2 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f49908a);
    }

    private r2 a(String str, String str2, boolean z2, boolean z3) {
        return r2.a(z2 ? r2.c.RIGHT_DETAIL : r2.c.DETAIL).d(str).a(z2 ? null : this.f48578k).b("Instructions").a(str2).a(z2 ? R.drawable.applovin_ic_check_mark_bordered : c(z3)).b(z2 ? m0.a(R.color.applovin_sdk_checkmarkColor, this.f49908a) : d(z3)).a(!z2).a();
    }

    private int a(boolean z2) {
        return z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
