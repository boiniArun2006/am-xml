package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f61172a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0826a> f61173b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f61174c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f61175d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f61176e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f61177f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f61178g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashSet<String> f61179h = new HashSet<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f61180i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f61181j;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0826a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f61182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f61183b = new ArrayList<>();

        public C0826a(e eVar, String str) {
            this.f61182a = eVar;
            a(str);
        }

        public e a() {
            return this.f61182a;
        }

        public ArrayList<String> b() {
            return this.f61183b;
        }

        public void a(String str) {
            this.f61183b.add(str);
        }
    }

    public View a(String str) {
        return this.f61174c.get(str);
    }

    public C0826a b(View view) {
        C0826a c0826a = this.f61173b.get(view);
        if (c0826a != null) {
            this.f61173b.remove(view);
        }
        return c0826a;
    }

    public String c(View view) {
        if (this.f61172a.size() == 0) {
            return null;
        }
        String str = this.f61172a.get(view);
        if (str != null) {
            this.f61172a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f61175d.contains(view) ? c.PARENT_VIEW : this.f61181j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f61179h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f61176e.add(strC);
                            this.f61172a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f61177f.add(strC);
                            this.f61174c.put(strC, viewE);
                            this.f61178g.put(strC, strA);
                        }
                    } else {
                        this.f61177f.add(strC);
                        this.f61178g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f61180i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f61180i.containsKey(view)) {
            return this.f61180i.get(view);
        }
        Map<View, Boolean> map = this.f61180i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f61178g.get(str);
    }

    public HashSet<String> c() {
        return this.f61176e;
    }

    public void d() {
        this.f61181j = true;
    }

    public boolean e(View view) {
        if (!this.f61180i.containsKey(view)) {
            return true;
        }
        this.f61180i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z2) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z2) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f61175d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f61177f;
    }

    public boolean c(String str) {
        return this.f61179h.contains(str);
    }

    public void a() {
        this.f61172a.clear();
        this.f61173b.clear();
        this.f61174c.clear();
        this.f61175d.clear();
        this.f61176e.clear();
        this.f61177f.clear();
        this.f61178g.clear();
        this.f61181j = false;
        this.f61179h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0826a c0826a = this.f61173b.get(view);
        if (c0826a != null) {
            c0826a.a(aVar.c());
        } else {
            this.f61173b.put(view, new C0826a(eVar, aVar.c()));
        }
    }
}
