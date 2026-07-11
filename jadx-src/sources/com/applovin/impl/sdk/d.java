package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1797r6;
import com.applovin.impl.C1809u;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.l1;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1801c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1801c f50139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f50140c = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(C1801c.a aVar) {
        if (aVar == null) {
            this.f50138a.O();
            if (C1804o.a()) {
                this.f50138a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f50140c.add(aVar);
        if (((Boolean) this.f50138a.a(x4.Y0)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f50138a.p0().b(z4.f50984E);
        this.f50139b.a();
    }

    public void a(final C1809u c1809u, final a aVar) {
        if (aVar == null) {
            this.f50138a.O();
            if (C1804o.a()) {
                this.f50138a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            l1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (c1809u == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f50138a.g().a(d2.f48271W, c1809u, (AppLovinError) null);
        final C1801c.a aVarA = a(c1809u.g());
        this.f50139b.a(aVarA, new C1801c.InterfaceC0710c() { // from class: com.applovin.impl.sdk.Xo
            @Override // com.applovin.impl.sdk.C1801c.InterfaceC0710c
            public final void a(com.applovin.impl.sdk.ad.b bVar, String str) {
                this.f50053n.a(aVar, aVarA, c1809u, bVar, str);
            }
        });
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void e() {
        String str = (String) this.f50138a.p0().a(z4.f50984E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                C1801c.a aVarA = C1801c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f50138a);
                if (aVarA != null) {
                    if (a(aVarA)) {
                        long jC = aVarA.c() - SystemClock.elapsedRealtime();
                        this.f50138a.g().d(d2.f48274Z, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                    } else {
                        this.f50140c.add(0, aVarA);
                    }
                }
            } catch (Throwable th) {
                this.f50138a.O();
                if (C1804o.a()) {
                    this.f50138a.O().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th);
                }
                this.f50138a.D().a("AdPersistenceManager", "deserializePersistedAdFilePath", th);
            }
        }
    }

    private void f() {
        this.f50138a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50138a, "loadPersistedAdFilesQueueAndCleanupAsync", new Runnable() { // from class: com.applovin.impl.sdk.eO
            @Override // java.lang.Runnable
            public final void run() {
                this.f50146n.c();
            }
        }), d6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f50140c) {
            try {
                Iterator it = this.f50140c.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((C1801c.a) it.next()).a());
                    } catch (Throwable th) {
                        this.f50138a.O();
                        if (C1804o.a()) {
                            this.f50138a.O().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th);
                        }
                        this.f50138a.D().a("AdPersistenceManager", "serializePersistedAdFilePath", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f50138a.p0().b(z4.f50984E, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f50138a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50138a, "resetManagerState", new Runnable() { // from class: com.applovin.impl.sdk.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f50488n.d();
            }
        }), d6.b.OTHER);
    }

    public d(C1802k c1802k) {
        this.f50138a = c1802k;
        this.f50139b = new C1801c(c1802k);
    }

    private void d(C1801c.a aVar) {
        if (aVar != null && this.f50140c.remove(aVar)) {
            this.f50139b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f50138a.g().a(d2.f48268T, bVar);
        this.f50139b.b(bVar, new C1801c.b() { // from class: com.applovin.impl.sdk.QJ
            @Override // com.applovin.impl.sdk.C1801c.b
            public final void a(C1801c.a aVar) {
                this.f50021n.c(aVar);
            }
        });
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    private boolean b(C1801c.a aVar) {
        long jB = aVar.b();
        return (jB == 0 || jB == C1802k.n()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, C1801c.a aVar2, C1809u c1809u, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, c1809u, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(C1801c.a.a(bVar));
    }

    private C1801c.a a(AppLovinAdType appLovinAdType) {
        C1801c.a aVar;
        synchronized (this.f50140c) {
            try {
                Iterator it = this.f50140c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (C1801c.a) it.next();
                    if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                        break;
                    }
                }
                this.f50140c.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void a(a aVar, C1801c.a aVar2, C1809u c1809u, String str) {
        if (aVar == null) {
            return;
        }
        this.f50138a.O();
        if (C1804o.a()) {
            this.f50138a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f50139b.b(aVar2);
        this.f50138a.g().a(d2.f48273Y, c1809u, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, C1801c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f50138a.O();
        if (C1804o.a()) {
            this.f50138a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f50139b.b(aVar2);
        this.f50138a.g().a(d2.f48272X, bVar);
    }

    private boolean a(C1801c.a aVar) {
        return SystemClock.elapsedRealtime() + ((Long) this.f50138a.a(x4.a1)).longValue() >= aVar.c();
    }

    private void a() {
        synchronized (this.f50140c) {
            this.f50139b.a(new ArrayList(this.f50140c));
        }
    }
}
