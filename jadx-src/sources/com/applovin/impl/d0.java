package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d0 extends c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f48223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f48224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f48225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f48226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f48227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f48228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f48229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f48230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f48231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f48232o;

    class a implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48233a;

        a(String str) {
            this.f48233a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f48161a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f48228k) {
                        StringUtils.replaceAll(d0.this.f48227j, this.f48233a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f48227j, this.f48233a, uri.toString());
                }
                d0.this.f48224g.a(uri.toString(), this.f48233a);
                return;
            }
            C1804o c1804o = d0.this.f48163c;
            if (C1804o.a()) {
                d0 d0Var = d0.this;
                d0Var.f48163c.a(d0Var.f48162b, "Failed to cache JavaScript resource " + this.f48233a);
            }
            if (d0.this.f48226i != null) {
                d0.this.f48226i.a(d0.this.f48223f, true);
            }
        }
    }

    class b implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48237c;

        b(String str, String str2, String str3) {
            this.f48235a = str;
            this.f48236b = str2;
            this.f48237c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f48161a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.this.f48228k) {
                        StringUtils.replaceAll(d0.this.f48227j, this.f48235a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f48227j, this.f48235a, uri.toString());
                }
                d0.this.f48224g.a(uri.toString(), this.f48235a);
                return;
            }
            if (!d0.this.f48224g.Q().contains(this.f48236b + this.f48237c) || d0.this.f48226i == null) {
                return;
            }
            d0.this.f48226i.a(d0.this.f48223f, true);
        }
    }

    public interface c {
        void a(String str, boolean z2);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, C1802k c1802k, c cVar) {
        super("AsyncTaskCacheHTMLResources", c1802k);
        this.f48223f = str;
        this.f48224g = bVar;
        this.f48225h = list;
        this.f48229l = executorService;
        this.f48230m = str2;
        this.f48226i = cVar;
        this.f48227j = new StringBuffer(str);
        this.f48228k = new Object();
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f48229l.submit((e0) it.next()));
        }
        this.f48232o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HashSet d() {
        HashSet hashSet = new HashSet();
        List listH = this.f48224g.H();
        Collection collectionF = f();
        for (String str : this.f48225h) {
            int iIndexOf = 0;
            int i2 = 0;
            while (iIndexOf < this.f48223f.length()) {
                if (this.f48165e.get()) {
                    return null;
                }
                iIndexOf = this.f48223f.indexOf(str, i2);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f48223f.length();
                int i3 = iIndexOf;
                while (!collectionF.contains(Character.valueOf(this.f48223f.charAt(i3))) && i3 < length) {
                    i3++;
                }
                if (i3 <= iIndexOf || i3 == length) {
                    if (C1804o.a()) {
                        this.f48163c.b(this.f48162b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                String strSubstring = this.f48223f.substring(str.length() + iIndexOf, i3);
                String str2 = str + strSubstring;
                if (StringUtils.isValidString(strSubstring) && !listH.contains(str2)) {
                    hashSet.add(new e0(str2, this.f48224g, Arrays.asList(str), true, this.f48230m, this.f48161a, new b(str2, str, strSubstring)));
                } else if (C1804o.a()) {
                    this.f48163c.a(this.f48162b, "Skip caching of optional or non-resource " + strSubstring);
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f48223f, (String) this.f48161a.a(x4.h5)), 1)) {
            if (this.f48165e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f48224g, Collections.EMPTY_LIST, false, this.f48230m, this.f48161a, new a(str)));
            } else if (C1804o.a()) {
                this.f48163c.a(this.f48162b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f48161a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add(Character.valueOf(Typography.quote));
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f48165e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f48223f)) {
            a(this.f48223f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f48161a.a(x4.E0)).booleanValue()) {
            if (C1804o.a()) {
                this.f48163c.a(this.f48162b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f48223f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f48161a.a(x4.g5)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f48231n = new ArrayList(hashSet);
        if (this.f48165e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f48231n;
        if (list == null || list.isEmpty()) {
            a(this.f48223f);
            return Boolean.FALSE;
        }
        if (C1804o.a()) {
            this.f48163c.a(this.f48162b, "Executing " + this.f48231n.size() + " caching operations...");
        }
        if (this.f48161a.q0().e()) {
            a(this.f48231n);
        } else {
            this.f48229l.invokeAll(this.f48231n);
        }
        if (((Boolean) this.f48161a.a(x4.T0)).booleanValue()) {
            synchronized (this.f48228k) {
                a(this.f48227j.toString());
            }
        } else {
            a(this.f48227j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f48231n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f48232o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f48165e.get() || (cVar = this.f48226i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
