package com.fyber.inneractive.sdk.cache.session;

import com.alightcreative.time.Kw.znsSxz;
import com.fyber.inneractive.sdk.util.o;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f53198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c f53199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f53200c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.f53200c = eVar;
        this.f53198a = aVar;
        this.f53199b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f53200c.f53203c) {
            try {
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f53198a;
                if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                    g gVar = (g) this.f53200c.f53201a.f53211a.get(this.f53199b);
                    if (gVar != null) {
                        int i2 = f.f53206a[aVar.ordinal()];
                        if (i2 == 1) {
                            gVar.f53208b++;
                        } else if (i2 == 2) {
                            gVar.f53209c++;
                        } else if (i2 == 3) {
                            gVar.f53207a++;
                        }
                    }
                } else {
                    this.f53200c.f53201a = new i();
                }
                try {
                    o.a(o.f57018a, e.a(this.f53200c).toString().getBytes(znsSxz.cxxRLorO));
                } catch (UnsupportedEncodingException unused) {
                }
                this.f53200c.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
