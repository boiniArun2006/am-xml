package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f61065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f61066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f61067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f61068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f61069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f61070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f61071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f61072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f61073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f61074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f61075k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f61073i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f61074j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f61071g) {
            return;
        }
        this.f61067c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f61072h;
    }

    public AdSessionStatePublisher d() {
        return this.f61069e;
    }

    public View e() {
        return this.f61068d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f61071g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f61067c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f61071g) {
            return;
        }
        this.f61068d.clear();
        removeAllFriendlyObstructions();
        this.f61071g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f61069e = null;
        this.f61075k = null;
    }

    public boolean g() {
        return this.f61075k != null;
    }

    public boolean h() {
        return this.f61070f && !this.f61071g;
    }

    public boolean i() {
        return this.f61071g;
    }

    public boolean j() {
        return this.f61066b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f61066b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f61070f;
    }

    void m() {
        a();
        d().g();
        this.f61073i = true;
    }

    void n() {
        b();
        d().h();
        this.f61074j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f61071g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f61071g) {
            return;
        }
        this.f61067c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f61071g) {
            return;
        }
        this.f61067c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f61075k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f61070f || this.f61069e == null) {
            return;
        }
        this.f61070f = true;
        c.c().c(this);
        this.f61069e.a(i.c().b());
        this.f61069e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f61069e.a(this, this.f61065a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f61067c = new f();
        this.f61070f = false;
        this.f61071g = false;
        this.f61066b = adSessionConfiguration;
        this.f61065a = adSessionContext;
        this.f61072h = str;
        b(null);
        this.f61069e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f61069e.i();
        c.c().a(this);
        this.f61069e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f61068d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f61068d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f61075k.onPossibleObstructionsDetected(this.f61072h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f61074j = true;
    }
}
