package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class C1786m extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1793n f48917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1794o f48918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i8 f48919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f48920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f48921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f48922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f48923k;

    /* JADX INFO: renamed from: com.applovin.impl.m$a */
    enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.m$b */
    class b extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final i8 f48929p;

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        b(i8 i8Var, String str, boolean z2) {
            super(i8Var.b().d(), C1786m.this.f49908a);
            this.f48929p = i8Var;
            this.f49833c = StringUtils.createSpannedString(i8Var.b().a(), -16777216, 18, 1);
            this.f49834d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f49832b = z2;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f49832b;
        }

        public i8 v() {
            return this.f48929p;
        }
    }

    @Override // com.applovin.impl.s2
    protected int d(int i2) {
        return i2 == a.INFO.ordinal() ? this.f48921i.size() : i2 == a.BIDDERS.ordinal() ? this.f48922j.size() : this.f48923k.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i2) {
        return i2 == a.INFO.ordinal() ? new v4("INFO") : i2 == a.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f48918f.b() != null) {
            arrayList.add(f());
        }
        if (this.f48919g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private List l() {
        i8 i8Var = this.f48919g;
        if (i8Var != null && i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listE = this.f48918f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (i8 i8Var2 : listE) {
            i8 i8Var3 = this.f48919g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, null, this.f48919g == null));
                for (a4 a4Var : i8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i2) {
        return i2 == a.INFO.ordinal() ? this.f48921i : i2 == a.BIDDERS.ordinal() ? this.f48922j : this.f48923k;
    }

    public C1794o j() {
        return this.f48918f;
    }

    public String k() {
        return this.f48920h;
    }

    C1786m(C1793n c1793n, C1794o c1794o, i8 i8Var, Context context) {
        C1794o c1794oF;
        String strD;
        super(context);
        this.f48917e = c1793n;
        this.f48919g = i8Var;
        if (c1794o != null) {
            c1794oF = c1794o;
        } else {
            c1794oF = c1793n.f();
        }
        this.f48918f = c1794oF;
        if (c1794o != null) {
            strD = c1794o.c();
        } else {
            strD = c1793n.d();
        }
        this.f48920h = strD;
        this.f48921i = h();
        this.f48922j = e();
        this.f48923k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f48917e.c()).a();
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.f48919g.b().a()).a();
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f48917e.b()).a();
    }

    private List e() {
        i8 i8Var = this.f48919g;
        if (i8Var != null && !i8Var.d()) {
            return new ArrayList();
        }
        List<i8> listA = this.f48918f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (i8 i8Var2 : listA) {
            i8 i8Var3 = this.f48919g;
            if (i8Var3 == null || i8Var3.b().c().equals(i8Var2.b().c())) {
                arrayList.add(new b(i8Var2, i8Var2.a() != null ? i8Var2.a().a() : "", this.f48919g == null));
            }
        }
        return arrayList;
    }
}
