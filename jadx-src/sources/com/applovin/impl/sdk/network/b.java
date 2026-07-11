package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1797r6;
import com.applovin.impl.d6;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f50399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f50401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50402e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f50403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f50404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f50405h;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f50406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f50407b;

        a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f50406a = dVar;
            this.f50407b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i2) {
            C1804o unused = b.this.f50399b;
            if (C1804o.a()) {
                b.this.f50399b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f50406a + " with error code: " + i2 + LHbnkhI.vxBt);
            }
            b.this.d(this.f50406a);
            t2.a(this.f50407b, str, i2);
            if (this.f50406a.c() == 1) {
                b.this.f50398a.D().a("dispatchPostback", str, i2, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f50406a);
            C1804o unused = b.this.f50399b;
            if (C1804o.a()) {
                b.this.f50399b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f50406a);
            }
            b.this.c();
            t2.a(this.f50407b, str);
        }
    }

    protected List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f50402e) {
            try {
                if (((Boolean) this.f50398a.a(x4.L2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f50405h.size());
                    arrayList.addAll(this.f50405h);
                } else {
                    arrayList.ensureCapacity(this.f50403f.size());
                    arrayList.addAll(this.f50403f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    private void c(d dVar) {
        synchronized (this.f50402e) {
            while (this.f50403f.size() > this.f50400c) {
                try {
                    this.f50403f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f50403f.add(dVar);
        }
        if (C1804o.a()) {
            this.f50399b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f50402e) {
            try {
                Iterator it = new ArrayList(this.f50403f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f50398a.q0().a((AbstractRunnableC1782i5) this.f50401d, d6.b.OTHER);
    }

    public b(C1802k c1802k) {
        ArrayList arrayList = new ArrayList();
        this.f50403f = arrayList;
        this.f50404g = new HashSet();
        this.f50405h = new ArrayList();
        if (c1802k != null) {
            this.f50398a = c1802k;
            this.f50399b = c1802k.O();
            int iIntValue = ((Integer) c1802k.a(x4.J2)).intValue();
            this.f50400c = iIntValue;
            if (((Boolean) c1802k.a(x4.M2)).booleanValue()) {
                c cVar = new c(this, c1802k);
                this.f50401d = cVar;
                arrayList.addAll(cVar.a(iIntValue));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                return;
            }
            this.f50401d = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f50402e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    public void a(d dVar, boolean z2) {
        a(dVar, z2, (AppLovinPostbackListener) null);
    }

    public void a(final d dVar, boolean z2, final AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (C1804o.a()) {
                this.f50399b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z2) {
                dVar.a();
            }
            a(new Runnable() { // from class: com.applovin.impl.sdk.network.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50444n.b(dVar, appLovinPostbackListener);
                }
            }, n7.i(), dVar.m());
        }
    }

    public void b() {
        a(new Runnable() { // from class: com.applovin.impl.sdk.network.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f50446n.e();
            }
        }, true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f50402e) {
            try {
                Iterator it = this.f50405h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f50405h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f50402e) {
            this.f50404g.remove(dVar);
            this.f50405h.add(dVar);
        }
    }

    public void a() {
        synchronized (this.f50402e) {
            this.f50403f.clear();
            this.f50405h.clear();
        }
        this.f50398a.q0().a((AbstractRunnableC1782i5) this.f50401d, d6.b.OTHER);
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (C1804o.a()) {
            this.f50399b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f50398a.E0() && !dVar.m()) {
            if (C1804o.a()) {
                this.f50399b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (C1804o.a()) {
                this.f50399b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f50402e) {
            try {
                if (this.f50404g.contains(dVar)) {
                    if (C1804o.a()) {
                        this.f50399b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f50398a.a(x4.I2);
                if (dVar.c() > num.intValue()) {
                    if (C1804o.a()) {
                        this.f50399b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f50402e) {
                    this.f50404g.add(dVar);
                }
                e eVarB = e.b(this.f50398a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (C1804o.a()) {
                    this.f50399b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f50398a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f50402e) {
            this.f50404g.remove(dVar);
            this.f50403f.remove(dVar);
        }
        if (C1804o.a()) {
            this.f50399b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z2, boolean z3) {
        if (z2) {
            this.f50398a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50398a, z3, "runPostbackTask", runnable), d6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
