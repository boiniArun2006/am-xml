package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f49831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f49832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SpannedString f49833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SpannedString f49834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f49835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f49836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f49837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f49838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f49839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f49840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f49841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f49842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f49843m;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f49844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f49845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SpannedString f49846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        SpannedString f49847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f49848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f49849f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49850g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f49851h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f49852i = -16777216;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f49853j = -16777216;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f49854k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f49855l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f49856m;

        public b a(boolean z2) {
            this.f49845b = z2;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f49846c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f49847d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f49848e = str;
            return this;
        }

        public b(c cVar) {
            this.f49844a = cVar;
        }

        public b a(String str) {
            this.f49849f = str;
            return this;
        }

        public b b(int i2) {
            this.f49855l = i2;
            return this;
        }

        public b c(int i2) {
            this.f49853j = i2;
            return this;
        }

        public b d(int i2) {
            this.f49852i = i2;
            return this;
        }

        public b a(int i2) {
            this.f49851h = i2;
            return this;
        }

        public b b(boolean z2) {
            this.f49856m = z2;
            return this;
        }

        public b a(Context context) {
            this.f49851h = R.drawable.applovin_ic_disclosure_arrow;
            this.f49855l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public r2 a() {
            return new r2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f49864a;

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f49864a;
        }

        c(int i2) {
            this.f49864a = i2;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    protected r2(c cVar) {
        this.f49837g = 0;
        this.f49838h = 0;
        this.f49839i = -16777216;
        this.f49840j = -16777216;
        this.f49841k = 0;
        this.f49842l = 0;
        this.f49831a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f49836f;
    }

    public String c() {
        return this.f49835e;
    }

    public int d() {
        return this.f49838h;
    }

    public int e() {
        return this.f49842l;
    }

    public SpannedString f() {
        return this.f49834d;
    }

    public int g() {
        return this.f49840j;
    }

    public int h() {
        return this.f49837g;
    }

    public int i() {
        return this.f49841k;
    }

    public int j() {
        return this.f49831a.b();
    }

    public SpannedString k() {
        return this.f49833c;
    }

    public int l() {
        return this.f49839i;
    }

    public int m() {
        return this.f49831a.c();
    }

    public boolean o() {
        return this.f49832b;
    }

    public boolean p() {
        return this.f49843m;
    }

    private r2(b bVar) {
        this.f49837g = 0;
        this.f49838h = 0;
        this.f49839i = -16777216;
        this.f49840j = -16777216;
        this.f49841k = 0;
        this.f49842l = 0;
        this.f49831a = bVar.f49844a;
        this.f49832b = bVar.f49845b;
        this.f49833c = bVar.f49846c;
        this.f49834d = bVar.f49847d;
        this.f49835e = bVar.f49848e;
        this.f49836f = bVar.f49849f;
        this.f49837g = bVar.f49850g;
        this.f49838h = bVar.f49851h;
        this.f49839i = bVar.f49852i;
        this.f49840j = bVar.f49853j;
        this.f49841k = bVar.f49854k;
        this.f49842l = bVar.f49855l;
        this.f49843m = bVar.f49856m;
    }
}
