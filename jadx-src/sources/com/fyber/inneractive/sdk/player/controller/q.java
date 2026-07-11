package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class q implements com.fyber.inneractive.sdk.player.mediaplayer.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54471a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f54474d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.c f54476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54477g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f54479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextureView f54480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f54481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Surface f54482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f54483m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54485o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.b f54475e = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f54484n = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f54472b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f54473c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.h f54478h = new com.fyber.inneractive.sdk.player.h(this);

    public void a() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        k();
        this.f54478h = null;
        com.fyber.inneractive.sdk.util.v.a(this.f54480j);
        this.f54480j = null;
        SurfaceTexture surfaceTexture = this.f54481k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f54481k = null;
        }
        Surface surface = this.f54482l;
        if (surface != null) {
            surface.release();
            this.f54482l = null;
        }
        this.f54479i.removeCallbacksAndMessages(null);
        this.f54472b.clear();
        this.f54476f = null;
        this.f54477g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public abstract void a(int i2, boolean z2);

    public abstract void a(Surface surface);

    public abstract void a(String str, int i2);

    public abstract void a(boolean z2);

    public abstract int b();

    public abstract void b(boolean z2);

    public abstract int c();

    public final void c(boolean z2) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f54476f;
        if (cVar == null || (fVar = cVar.f54377a.f56325e) == null) {
            return;
        }
        if (z2) {
            if (fVar.f54048c == null || !fVar.f54049d) {
                return;
            }
            IAlog.a("%s mute", "OMVideo");
            try {
                fVar.f54048c.HI(0.0f);
                return;
            } catch (Throwable th) {
                fVar.a(th);
                return;
            }
        }
        if (fVar.f54048c == null || !fVar.f54049d) {
            return;
        }
        IAlog.a("%s unMute", "OMVideo");
        try {
            fVar.f54048c.HI(1.0f);
        } catch (Throwable th2) {
            fVar.a(th2);
        }
    }

    public abstract String d();

    public abstract void d(boolean z2);

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void i();

    public abstract void j();

    public boolean h() {
        return this.f54475e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public final void k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.h hVar = this.f54478h;
        if (hVar == null || (scheduledThreadPoolExecutor = hVar.f56338b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        hVar.f56338b = null;
    }

    public q(Context context) {
        this.f54471a = context.getApplicationContext();
        this.f54479i = new Handler(context.getMainLooper());
        a(true);
    }

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f54480j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f54480j = textureView;
            if (textureView != null) {
                i iVar = this.f54483m;
                if (iVar == null) {
                    iVar = new i(this);
                    this.f54483m = iVar;
                }
                textureView.setSurfaceTextureListener(iVar);
            }
            if (this.f54481k != null) {
                IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(this));
                if (this.f54480j.getSurfaceTexture() != null && this.f54480j.getSurfaceTexture().equals(this.f54481k)) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(this));
                } else {
                    IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(this));
                    this.f54480j.setSurfaceTexture(this.f54481k);
                }
            }
        }
    }

    public static void a(q qVar, SurfaceTexture surfaceTexture) {
        boolean zEquals = surfaceTexture.equals(qVar.f54481k);
        SurfaceTexture surfaceTexture2 = qVar.f54481k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        qVar.f54481k = surfaceTexture;
        Surface surface = qVar.f54482l;
        if (surface == null || !zEquals) {
            if (surface != null) {
                surface.release();
            }
            qVar.f54482l = new Surface(qVar.f54481k);
        }
        qVar.a(qVar.f54482l);
    }

    public void a(int i2) {
        this.f54479i.post(new l(this, i2));
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.f54475e) {
            return;
        }
        this.f54475e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.h hVar = this.f54478h;
            if (hVar != null && hVar.f56338b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                hVar.f56338b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar.f56339c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            k();
        }
        this.f54479i.post(new m(this, bVar));
    }
}
