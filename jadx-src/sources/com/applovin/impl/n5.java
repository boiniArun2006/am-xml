package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class n5 extends l5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final o7 f49472q;

    class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w7 f49473a;

        a(w7 w7Var) {
            this.f49473a = w7Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f49473a.a(uri);
                n5.this.f49472q.b(true);
                return;
            }
            C1804o c1804o = n5.this.f48735c;
            if (C1804o.a()) {
                n5 n5Var = n5.this;
                n5Var.f48735c.b(n5Var.f48734b, "Failed to cache static companion ad");
            }
        }
    }

    class b implements l5.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w7 f49475a;

        b(w7 w7Var) {
            this.f49475a = w7Var;
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            this.f49475a.a(str);
            n5.this.f49472q.b(true);
        }
    }

    class c implements l5.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w7 f49477a;

        c(w7 w7Var) {
            this.f49477a = w7Var;
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            this.f49477a.a(str);
            n5.this.f49472q.b(true);
        }
    }

    class d implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c8 f49479a;

        d(c8 c8Var) {
            this.f49479a = c8Var;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                C1804o c1804o = n5.this.f48735c;
                if (C1804o.a()) {
                    n5 n5Var = n5.this;
                    n5Var.f48735c.a(n5Var.f48734b, "Video file successfully cached into: " + uri);
                }
                this.f49479a.a(uri);
                return;
            }
            C1804o c1804o2 = n5.this.f48735c;
            if (C1804o.a()) {
                n5 n5Var2 = n5.this;
                n5Var2.f48735c.b(n5Var2.f48734b, "Failed to cache video file: " + this.f49479a);
            }
        }
    }

    class e implements l5.e {
        e() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            if (n5.this.f49472q.isOpenMeasurementEnabled()) {
                str = n5.this.f48733a.e0().a(str, f2.a((AppLovinAdImpl) n5.this.f48882g));
            }
            n5.this.f49472q.d(str);
            C1804o c1804o = n5.this.f48735c;
            if (C1804o.a()) {
                n5 n5Var = n5.this;
                n5Var.f48735c.a(n5Var.f48734b, "Finish caching HTML template " + n5.this.f49472q.i1() + " for ad #" + n5.this.f49472q.getAdIdNumber());
            }
        }
    }

    public n5(o7 o7Var, C1802k c1802k, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", o7Var, c1802k, appLovinAdLoadListener);
        this.f49472q = o7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f48733a.a(x4.h5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.EMPTY_LIST, false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.f48882g.a(uriA.toString(), str2);
                } else if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private c0 p() {
        if (!this.f49472q.u1()) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        r7 r7VarG1 = this.f49472q.g1();
        if (r7VarG1 == null) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        w7 w7VarE = r7VarG1.e();
        if (w7VarE == null) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriC = w7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = w7VarE.b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strB)) {
            if (w7VarE.d() == w7.a.STATIC) {
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Caching static companion ad at " + string + "...");
                }
                return new e0(string, this.f49472q, Collections.EMPTY_LIST, false, this.f48884i, this.f48733a, new a(w7VarE));
            }
            if (w7VarE.d() == w7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
                    }
                    return a(strB, Collections.EMPTY_LIST, new c(w7VarE));
                }
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                }
                String strC = c(string, null, false);
                if (StringUtils.isValidString(strC)) {
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "HTML fetched. Caching HTML now...");
                    }
                    return a(strC, Collections.EMPTY_LIST, new b(w7VarE));
                }
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Unable to load companion ad resources from " + string);
                }
            } else if (w7VarE.d() == w7.a.IFRAME && C1804o.a()) {
                this.f48735c.a(this.f48734b, "Skip caching of iFrame resource...");
            }
        } else if (C1804o.a()) {
            this.f48735c.k(this.f48734b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.l5
    void a(int i2) {
        this.f49472q.getAdEventTracker().f();
        super.a(i2);
    }

    @Override // com.applovin.impl.l5
    void f() {
        this.f49472q.getAdEventTracker().h();
        super.f();
    }

    protected d0 q() {
        if (!TextUtils.isEmpty(this.f49472q.i1())) {
            return a(this.f49472q.i1(), this.f49472q.S(), new e());
        }
        if (!C1804o.a()) {
            return null;
        }
        this.f48735c.a(this.f48734b, "Unable to load HTML template");
        return null;
    }

    protected e0 r() {
        c8 c8VarQ1;
        Uri uriE;
        if (!this.f49472q.v1()) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f49472q.p1() == null || (c8VarQ1 = this.f49472q.q1()) == null || (uriE = c8VarQ1.e()) == null) {
            return null;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Caching video file " + c8VarQ1 + " creative...");
        }
        return a(uriE.toString(), Collections.EMPTY_LIST, false, new d(c8VarQ1));
    }

    private void m() {
        String string;
        if (!l()) {
            if (this.f49472q.u1()) {
                r7 r7VarG1 = this.f49472q.g1();
                if (r7VarG1 != null) {
                    w7 w7VarE = r7VarG1.e();
                    if (w7VarE != null) {
                        Uri uriC = w7VarE.c();
                        if (uriC != null) {
                            string = uriC.toString();
                        } else {
                            string = "";
                        }
                        String strB = w7VarE.b();
                        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
                            if (C1804o.a()) {
                                this.f48735c.k(this.f48734b, "Companion ad does not have any resources attached. Skipping...");
                                return;
                            }
                            return;
                        }
                        if (w7VarE.d() == w7.a.STATIC) {
                            if (C1804o.a()) {
                                this.f48735c.a(this.f48734b, "Caching static companion ad at " + string + "...");
                            }
                            Uri uriA = a(string, Collections.EMPTY_LIST, false);
                            if (uriA != null) {
                                w7VarE.a(uriA);
                                this.f49472q.b(true);
                                return;
                            } else {
                                if (C1804o.a()) {
                                    this.f48735c.b(this.f48734b, "Failed to cache static companion ad");
                                    return;
                                }
                                return;
                            }
                        }
                        if (w7VarE.d() == w7.a.HTML) {
                            if (StringUtils.isValidString(string)) {
                                if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                                }
                                String strC = c(string, null, false);
                                if (StringUtils.isValidString(strC)) {
                                    if (C1804o.a()) {
                                        this.f48735c.a(this.f48734b, "HTML fetched. Caching HTML now...");
                                    }
                                    w7VarE.a(a(strC, Collections.EMPTY_LIST, this.f49472q));
                                    this.f49472q.b(true);
                                    return;
                                }
                                if (C1804o.a()) {
                                    this.f48735c.b(this.f48734b, "Unable to load companion ad resources from " + string);
                                    return;
                                }
                                return;
                            }
                            if (C1804o.a()) {
                                this.f48735c.a(this.f48734b, "Caching provided HTML for companion ad. No fetch required. HTML: " + strB);
                            }
                            if (((Boolean) this.f48733a.a(x4.g5)).booleanValue()) {
                                strB = d(strB);
                            }
                            w7VarE.a(a(strB, Collections.EMPTY_LIST, this.f49472q));
                            this.f49472q.b(true);
                            return;
                        }
                        if (w7VarE.d() == w7.a.IFRAME && C1804o.a()) {
                            this.f48735c.a(this.f48734b, "Skip caching of iFrame resource...");
                            return;
                        }
                        return;
                    }
                    if (C1804o.a()) {
                        this.f48735c.b(this.f48734b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                        return;
                    }
                    return;
                }
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "No companion ad provided. Skipping...");
                    return;
                }
                return;
            }
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Companion ad caching disabled. Skipping...");
            }
        }
    }

    private void n() {
        if (!l() && a8.a(this.f49472q)) {
            String strI1 = this.f49472q.i1();
            if (StringUtils.isValidString(strI1)) {
                String strA = a(strI1, this.f49472q.S(), this.f48882g);
                if (this.f49472q.isOpenMeasurementEnabled()) {
                    strA = this.f48733a.e0().a(strA, f2.a((AppLovinAdImpl) this.f48882g));
                }
                this.f49472q.d(strA);
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Finish caching HTML template " + this.f49472q.i1() + " for ad #" + this.f49472q.getAdIdNumber());
                    return;
                }
                return;
            }
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Unable to load HTML template");
            }
        }
    }

    private void o() {
        c8 c8VarQ1;
        Uri uriE;
        if (!l()) {
            if (this.f49472q.v1()) {
                if (this.f49472q.p1() != null && (c8VarQ1 = this.f49472q.q1()) != null && (uriE = c8VarQ1.e()) != null) {
                    Uri uriB = b(uriE.toString(), Collections.EMPTY_LIST, false);
                    if (uriB != null) {
                        if (C1804o.a()) {
                            this.f48735c.a(this.f48734b, "Video file successfully cached into: " + uriB);
                        }
                        c8VarQ1.a(uriB);
                        return;
                    }
                    if (C1804o.a()) {
                        this.f48735c.b(this.f48734b, "Failed to cache video file: " + c8VarQ1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Video caching disabled. Skipping...");
            }
        }
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        String str;
        super.run();
        boolean zC0 = this.f49472q.C0();
        if (C1804o.a()) {
            C1804o c1804o = this.f48735c;
            String str2 = this.f48734b;
            StringBuilder sb = new StringBuilder();
            sb.append("Begin caching for VAST ");
            if (zC0) {
                str = "streaming ";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append("ad #");
            sb.append(this.f48882g.getAdIdNumber());
            sb.append("...");
            c1804o.a(str2, sb.toString());
        }
        if (zC0) {
            if (((Boolean) this.f48733a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                if (this.f49472q.s1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c0 c0VarP = p();
                    if (c0VarP != null) {
                        arrayList.add(c0VarP);
                    }
                    d0 d0VarQ = q();
                    if (d0VarQ != null) {
                        arrayList.add(d0VarQ);
                    }
                    e0 e0VarR = r();
                    if (e0VarR != null) {
                        arrayList.add(e0VarR);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f49472q.j1() == o7.c.COMPANION_AD) {
                        c0 c0VarP2 = p();
                        if (c0VarP2 != null) {
                            arrayList2.add(c0VarP2);
                        }
                        d0 d0VarQ2 = q();
                        if (d0VarQ2 != null) {
                            arrayList2.add(d0VarQ2);
                        }
                        a(arrayList2);
                        f();
                        e0 e0VarR2 = r();
                        if (e0VarR2 != null) {
                            arrayList3.add(e0VarR2);
                        }
                        a(arrayList3);
                    } else {
                        e0 e0VarR3 = r();
                        if (e0VarR3 != null) {
                            arrayList2.add(e0VarR3);
                        }
                        a(arrayList2);
                        f();
                        c0 c0VarP3 = p();
                        if (c0VarP3 != null) {
                            arrayList3.add(c0VarP3);
                        }
                        d0 d0VarQ3 = q();
                        if (d0VarQ3 != null) {
                            arrayList3.add(d0VarQ3);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f49472q.s1()) {
                    f();
                }
                o7.c cVarJ1 = this.f49472q.j1();
                o7.c cVar = o7.c.COMPANION_AD;
                if (cVarJ1 == cVar) {
                    m();
                    n();
                    a(this.f49472q);
                } else {
                    o();
                }
                if (!this.f49472q.s1()) {
                    f();
                }
                if (this.f49472q.j1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f49472q);
                }
            }
        } else if (((Boolean) this.f48733a.a(x4.I0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!o0.d()) {
                arrayList4.addAll(e());
            }
            c0 c0VarP4 = p();
            if (c0VarP4 != null) {
                arrayList4.add(c0VarP4);
            }
            e0 e0VarR4 = r();
            if (e0VarR4 != null) {
                arrayList4.add(e0VarR4);
            }
            d0 d0VarQ4 = q();
            if (d0VarQ4 != null) {
                arrayList4.add(d0VarQ4);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f49472q);
            f();
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Finished caching VAST ad #" + this.f49472q.getAdIdNumber());
        }
        this.f49472q.t1();
        k();
    }
}
