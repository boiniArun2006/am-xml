package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class TreeWalker implements a.InterfaceC0824a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f61158i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f61159j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f61160k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f61161l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f61162m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f61164b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f61170h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f61163a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61165c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f61166d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f61168f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f61167e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f61169g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i2, long j2);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i2, long j2);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f61169g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f61160k != null) {
                TreeWalker.f61160k.post(TreeWalker.f61161l);
                TreeWalker.f61160k.postDelayed(TreeWalker.f61162m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f61170h);
    }

    private void e() {
        this.f61164b = 0;
        this.f61166d.clear();
        this.f61165c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f61165c = true;
                break;
            }
        }
        this.f61170h = f.b();
    }

    public static TreeWalker getInstance() {
        return f61158i;
    }

    private void i() {
        if (f61160k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f61160k = handler;
            handler.post(f61161l);
            f61160k.postDelayed(f61162m, 200L);
        }
    }

    private void k() {
        Handler handler = f61160k;
        if (handler != null) {
            handler.removeCallbacks(f61162m);
            f61160k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f61163a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f61163a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    void f() {
        TreeWalker treeWalker;
        this.f61168f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f61167e.a();
        if (this.f61168f.b().size() > 0) {
            for (String str : this.f61168f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f61168f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f61169g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f61168f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f61169g.b(jSONObjectA2, treeWalker.f61168f.c(), jB);
            if (treeWalker.f61165c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f61166d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f61169g.b();
        }
        treeWalker.f61168f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f61163a.clear();
        f61159j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f61163a.contains(treeWalkerTimeLogger)) {
            this.f61163a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j2) {
        if (this.f61163a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f61163a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f61164b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f61164b, j2);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f61168f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f61168f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f61168f.c(strC)));
        this.f61168f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z2) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z2);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0824a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z2) {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f61168f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z3 = z2 || a(view, jSONObjectA);
                if (this.f61165c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z3) {
                    this.f61166d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z3);
            }
            treeWalker.f61164b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f61167e.b();
        String strB = this.f61168f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0826a c0826aB = this.f61168f.b(view);
        if (c0826aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0826aB);
        return true;
    }
}
