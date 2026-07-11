package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f extends q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f54439A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f54440B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u f54441C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f54442D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f54443E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f54444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f54445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f54446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.g f54447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f54448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f54449u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f54450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] f54451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f54452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f54453y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f54454z;

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        if (this.f54447s != null) {
            if (!this.f54454z) {
                this.f54454z = true;
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new e(this));
            }
            b0 b0Var = this.f54453y;
            if (b0Var != null) {
                b0Var.f54426a.clear();
            }
            this.f54453y = null;
        }
        Iterator it = this.f54440B.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f54440B.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z2) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        this.f54484n = z2;
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f54451w;
        if (aVarArr == null || (gVar = this.f54447s) == null || this.f54454z || aVarArr.length < 2) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(0.0f)));
        this.f54450v = true;
        c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z2) {
        this.f54484n = z2;
        if (this.f54447s == null || this.f54454z) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f54471a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f3 = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f3));
        if (streamVolume == 0) {
            IAlog.a("Avoided unmute - Device is muted", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f54451w;
        if (aVarArr != null && aVarArr.length >= 2) {
            this.f54447s.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(f3)));
        }
        this.f54450v = false;
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f54447s;
        if (gVar == null || this.f54454z) {
            return 0;
        }
        return (int) (gVar.f55701m.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f55701m.a(gVar.a(), gVar.f55694f).f56318f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        return this.f54449u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        return this.f54448t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        return this.f54450v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean h() {
        return (this.f54447s == null || this.f54454z || this.f54475e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f54475e;
        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar2 == (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f54447s;
        if (gVar != null && !this.f54454z) {
            gVar.a(false);
        }
        k();
        a(bVar);
    }

    public f(Context context, boolean z2, com.fyber.inneractive.sdk.config.global.r rVar) {
        Integer numA;
        int iIntValue;
        super(context);
        this.f54448t = 0;
        this.f54449u = 0;
        this.f54450v = false;
        this.f54454z = false;
        this.f54440B = new CopyOnWriteArrayList();
        this.f54441C = null;
        this.f54443E = 0;
        this.f54439A = z2;
        this.f54445q = rVar;
        this.f54446r = IAConfigManager.f53260M.f53294t.f53466b.a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.v vVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class) : null;
        if (vVar == null || (numA = vVar.a("max_tries")) == null) {
            iIntValue = 0;
        } else {
            iIntValue = numA.intValue();
        }
        this.f54444p = iIntValue;
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (!h()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            this.f54447s.a(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        long jA;
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f54447s;
        if (gVar == null || this.f54454z) {
            return 0;
        }
        if (!gVar.f55701m.c() && gVar.f55699k <= 0) {
            gVar.f55701m.a(gVar.f55705q.f55727a, gVar.f55695g, false);
            jA = com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f55705q.f55729c) + com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f55695g.f56246e);
        } else {
            jA = gVar.f55707s;
        }
        return (int) jA;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return this.f54439A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i2, boolean z2) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i2), Boolean.valueOf(z2));
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f54447s;
        if (gVar == null || this.f54454z) {
            return;
        }
        gVar.a(z2);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f54447s;
        gVar2.a(gVar2.a(), i2);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f54451w;
        if (aVarArr == null || (gVar = this.f54447s) == null || this.f54454z) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z2) {
        if (this.f54447s != null || this.f54454z) {
            return;
        }
        this.f54442D = z2;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        b0 b0Var = this.f54453y;
        if (b0Var != null) {
            b0Var.f54426a.clear();
        }
        this.f54453y = new b0(this);
        this.f54452x = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.a[z2 ? 2 : 1];
        this.f54451w = aVarArr;
        aVarArr[0] = new MediaCodecVideoRenderer(this.f54452x, this.f54453y);
        if (z2) {
            this.f54451w[1] = new MediaCodecAudioRenderer();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.f54451w, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d(), new com.fyber.inneractive.sdk.player.exoplayer2.c());
        this.f54447s = gVar;
        gVar.f55693e.add(this.f54453y);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    @Override // com.fyber.inneractive.sdk.player.controller.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, int i2) {
        char c2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.u jVar;
        if (this.f54447s == null || this.f54454z) {
            return;
        }
        IAlog.a("%sloadMediaPlayerUri called with %s", IAlog.a(this), str);
        Uri uri = Uri.parse(str);
        int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
        String path = uri.getPath();
        if (path == null) {
            c2 = 3;
        } else {
            String lowerCase = path.toLowerCase();
            if (lowerCase.endsWith(".mpd")) {
                c2 = 0;
            } else if (lowerCase.endsWith(".m3u8")) {
                c2 = 2;
            } else if (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) {
                c2 = 1;
            }
        }
        if (this.f54439A && com.fyber.inneractive.sdk.player.cache.n.f54415f.f54418c && com.fyber.inneractive.sdk.util.s.a() && c2 != 2) {
            fVar = new com.fyber.inneractive.sdk.player.cache.i(this, i2, this.f54445q);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.m();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.o(this.f54471a, mVar, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.q(IAConfigManager.f53260M.f53298x.a(), mVar));
            File fileA = com.fyber.inneractive.sdk.player.cache.n.a(this.f54471a, "ia-vid-cache-ex2");
            if (fileA != null) {
                fVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.f(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l(fileA, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j()), oVar);
            } else {
                gVar = oVar;
                if (c2 == 2) {
                    jVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.q(uri, gVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c(), this.f54446r, this.f54452x, this.f54453y);
                } else {
                    jVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j(uri, gVar, this.f54452x, this.f54453y);
                }
                this.f54441C = jVar;
                a(jVar);
            }
        }
        gVar = fVar;
        if (c2 == 2) {
        }
        this.f54441C = jVar;
        a(jVar);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f54447s;
        if (gVar == null || uVar == null) {
            return;
        }
        if (!gVar.f55701m.c() || gVar.f55702n != null) {
            gVar.f55701m = com.fyber.inneractive.sdk.player.exoplayer2.x.f56320a;
            gVar.f55702n = null;
            Iterator it = gVar.f55693e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
        }
        if (gVar.f55696h) {
            gVar.f55696h = false;
            int i2 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f55988d;
            gVar.f55703o = gVar.f55690b;
            ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) gVar.f55689a).getClass();
            Iterator it2 = gVar.f55693e.iterator();
            while (it2.hasNext()) {
                ((b0) it2.next()).getClass();
            }
        }
        gVar.f55700l++;
        gVar.f55692d.f55745f.obtainMessage(0, 1, 0, uVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }
}
