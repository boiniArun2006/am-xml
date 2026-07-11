package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.Surface;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a extends q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.mediaplayer.p f54421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f54423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f54425t;

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            pVar.reset();
            this.f54421p.release();
            this.f54421p = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z2) {
        if (g() && this.f54484n) {
            return;
        }
        this.f54484n = z2;
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z2) {
        if (g() || !this.f54484n) {
            this.f54484n = z2;
            com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
            if (pVar != null) {
                IAlog.a("%s unmute", pVar.b());
                pVar.f56365d = false;
                if (pVar.a()) {
                    pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.m(pVar));
                } else {
                    IAlog.a("%s unmute called when player is not ready!", pVar.b());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            return pVar.f56379r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            return pVar.f56381t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            return pVar.f56380s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            return pVar.f56365d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            pVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            pVar.start();
        }
    }

    public a(Context context) {
        super(context);
        this.f54422q = 0;
        this.f54423r = 2;
        this.f54424s = 0;
        this.f54425t = false;
        IAlog.a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            return pVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i2, boolean z2) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", pVar.b(), Integer.valueOf(i2), Boolean.valueOf(z2));
            if (!pVar.a()) {
                IAlog.a("%s seek called when player is not ready!", pVar.b());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f56363b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                IAlog.a("%s seek called when player is already seeking!", pVar.b());
                return;
            }
            pVar.a(bVar2);
            pVar.f56364c = z2;
            pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.j(pVar, i2));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f54421p;
        if (pVar != null) {
            pVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z2) {
        if (this.f54421p == null) {
            IAlog.a("MediaPlayerController: creating media player", new Object[0]);
            this.f54421p = new com.fyber.inneractive.sdk.player.mediaplayer.p(this.f54471a, this, this.f54479i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(String str, int i2) {
        this.f54421p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i2) {
        this.f54479i.post(new l(this, i2));
        if (i2 >= c()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i2 == this.f54422q) {
            IAlog.a("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i3 = this.f54424s + 1;
            this.f54424s = i3;
            if (i3 == this.f54423r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.f54425t = true;
            }
        } else if (this.f54425t) {
            IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.f54424s = 0;
            this.f54425t = false;
        }
        this.f54422q = i2;
    }
}
