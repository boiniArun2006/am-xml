package com.applovin.impl.sdk;

import com.applovin.impl.l1;
import com.applovin.impl.y2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f50157b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f50158c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50159d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50160e = new Object();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f50161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f50162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f50163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f50164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f50165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f50166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f50167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f50168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayDeque f50169i;

        private b(y2 y2Var, c cVar) {
            this.f50169i = new ArrayDeque();
            this.f50161a = y2Var.getAdUnitId();
            this.f50162b = y2Var.getFormat().getLabel();
            this.f50163c = y2Var.c();
            this.f50164d = y2Var.b();
            this.f50165e = y2Var.z();
            this.f50166f = y2Var.B();
            this.f50167g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f50161a;
        }

        public String b() {
            return this.f50164d;
        }

        public String c() {
            return this.f50163c;
        }

        public String d() {
            return this.f50165e;
        }

        public String e() {
            return this.f50166f;
        }

        public String f() {
            return this.f50167g;
        }

        public String g() {
            return this.f50162b;
        }

        public String h() {
            return this.f50166f;
        }

        public c i() {
            return (c) this.f50169i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f50161a + "', format='" + this.f50162b + "', adapterName='" + this.f50163c + "', adapterClass='" + this.f50164d + "', adapterVersion='" + this.f50165e + "', bCode='" + this.f50166f + "', creativeId='" + this.f50167g + "', updated=" + this.f50168h + '}';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f50168h = System.currentTimeMillis();
            this.f50169i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f50178a;

        @Override // java.lang.Enum
        public String toString() {
            return this.f50178a;
        }

        c(String str) {
            this.f50178a = str;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f50160e) {
            try {
                String strB = y2Var.B();
                b bVar = (b) this.f50159d.get(strB);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(y2Var, cVar);
                    this.f50159d.put(strB, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f50159d.remove(strB);
                }
                a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    g(C1802k c1802k) {
        this.f50156a = c1802k;
        a();
    }

    public void a() {
        synchronized (this.f50158c) {
            try {
                for (c cVar : c.values()) {
                    this.f50157b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f50158c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f50158c) {
            try {
                Iterator it = this.f50157b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f50158c) {
            try {
                Set set = (Set) this.f50157b.get(cVar);
                if (l1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f50158c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
