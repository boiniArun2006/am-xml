package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class iwV extends u {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Wre f59576n;

    iwV(Wre wre) {
        this.f59576n = wre;
    }

    @Override // com.google.android.play.integrity.internal.u
    public final void b() {
        synchronized (this.f59576n.J2) {
            try {
                if (this.f59576n.qie.get() > 0 && this.f59576n.qie.decrementAndGet() > 0) {
                    this.f59576n.rl.nr("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                Wre wre = this.f59576n;
                if (wre.ty != null) {
                    wre.rl.nr("Unbind from service.", new Object[0]);
                    Wre wre2 = this.f59576n;
                    wre2.f59571n.unbindService(wre2.az);
                    this.f59576n.Uo = false;
                    this.f59576n.ty = null;
                    this.f59576n.az = null;
                }
                this.f59576n.aYN();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
