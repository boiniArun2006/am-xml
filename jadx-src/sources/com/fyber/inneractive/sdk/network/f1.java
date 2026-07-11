package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f1 extends t0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f54253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.adm.y f54254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f54256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f54257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f54258u;

    public f1(com.fyber.inneractive.sdk.bidder.adm.v vVar, String str, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.e eVar) {
        UnitDisplayType unitDisplayType;
        super(vVar, g0.f54259c.a(), rVar);
        this.f54255r = 0;
        this.f54329o = true;
        this.f54253p = str;
        this.f54254q = yVar;
        this.f54256s = eVar;
        this.f54257t = rVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
        String strName = unitDisplayType2.name();
        Locale locale = Locale.US;
        String lowerCase = strName.toLowerCase(locale);
        if (eVar == null || (unitDisplayType = eVar.f56862n) == null) {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = yVar.f53120a;
            if (admParametersOuterClass$AdmParameters != null) {
                lowerCase = com.fyber.inneractive.sdk.util.n1.a(String.valueOf(admParametersOuterClass$AdmParameters.getSpotId()));
            }
        } else {
            lowerCase = (unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(locale) : unitDisplayType2.name().toLowerCase(locale);
        }
        String str2 = IAConfigManager.f53260M.f53286l;
        com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
        this.f54258u = TextUtils.isEmpty(str2) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(kVar, lowerCase) : new com.fyber.inneractive.sdk.network.timeouts.request.c(lowerCase, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i2) throws n0, t1 {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f54272c;
            if (inputStream != null) {
                d(System.currentTimeMillis());
                StringBuffer stringBufferB = com.fyber.inneractive.sdk.util.v.b(inputStream);
                b(System.currentTimeMillis());
                String string = stringBufferB.toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f54254q.f53120a;
                int iA = admParametersOuterClass$AdmParameters != null ? admParametersOuterClass$AdmParameters.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
                com.fyber.inneractive.sdk.bidder.adm.y yVar = this.f54254q;
                yVar.f53122c = string;
                com.fyber.inneractive.sdk.response.e eVarA = a(iA, (o) null, yVar);
                eVarA.f56856h = string;
                o0Var.f54294a = eVarA;
            }
            return o0Var;
        } catch (b e2) {
            e = e2;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f54253p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (com.fyber.inneractive.sdk.response.nativead.a e3) {
            b(System.currentTimeMillis());
            throw new n0(e3.getMessage(), e3);
        } catch (SocketTimeoutException e4) {
            e = e4;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f54253p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (UnknownHostException e5) {
            e = e5;
            IAlog.a("failed parse adm network request but will re-try url: %s msg: %s", this.f54253p, e.getMessage());
            b(System.currentTimeMillis());
            throw new t1(e);
        } catch (Exception e6) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse adm network request url: %s msg: %s", this.f54253p, e6.getMessage());
            throw new n0(e6);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestMarkup cancel by timeout at retry: %d", IAlog.a(this), Integer.valueOf(this.f54255r));
        l0 l0Var = IAConfigManager.f53260M.f53292r;
        this.f54315a = true;
        f1 f1Var = new f1(this);
        if (l0Var == null || !l0Var.c(f1Var)) {
            IAlog.a("%s : NetworkRequestMarkup won't retry - resolve request with `Bidding ad request passed allowed time` at retry: %d", IAlog.a(this), Integer.valueOf(this.f54255r));
            a((Object) null, new Exception("Bidding ad request passed allowed time"), false);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int q() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return this.f54258u.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.config.global.r k() {
        return this.f54257t;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f54258u;
        return new l1(aVar.f54339i, aVar.f54338h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f54253p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f54258u.f54335f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        if (this.f54315a) {
            return false;
        }
        int i2 = this.f54255r + 1;
        this.f54255r = i2;
        if (i2 > this.f54258u.b()) {
            IAlog.a("%s : NetworkRequestMarkup Should enable retry - FALSE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f54255r - 1), Integer.valueOf(this.f54258u.b()), this.f54321g);
            return false;
        }
        IAlog.a("%s : NetworkRequestMarkup Should enable retry - TRUE, current retry: %d total retries: %d, request id: %s", IAlog.a(this), Integer.valueOf(this.f54255r - 1), Integer.valueOf(this.f54258u.b()), this.f54321g);
        this.f54258u.a(this.f54255r);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j2) {
        super.b(j2);
        IAlog.a("%s : NetworkRequestMarkup : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j2) {
        super.c(j2);
        IAlog.a("%s : NetworkRequestMarkup : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        int iQ = super.q();
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f54258u;
        return ((aVar.c() + aVar.f54335f) * this.f54255r) + iQ;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d(long j2) {
        super.d(j2);
        IAlog.a("%s : NetworkRequestMarkup : set start read timestamp", IAlog.a(this));
    }

    public f1(f1 f1Var) {
        super(f1Var);
        this.f54255r = 0;
        this.f54329o = true;
        this.f54253p = f1Var.f54253p;
        this.f54254q = f1Var.f54254q;
        this.f54256s = f1Var.f54256s;
        this.f54257t = f1Var.f54257t;
        this.f54258u = f1Var.f54258u;
        this.f54255r = f1Var.f54255r;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s : NetworkRequestMarkup Ad request execution started, retry number: %d, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(this.f54255r), Integer.valueOf(p().f54283a), Integer.valueOf(p().f54284b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j2) {
        super.a(j2);
        IAlog.a("%s : NetworkRequestMarkup : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(super.q()));
    }
}
