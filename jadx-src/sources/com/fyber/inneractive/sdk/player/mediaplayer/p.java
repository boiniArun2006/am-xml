package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;
import com.safedk.android.utils.Logger;
import d8q.jqQ.QTafcm;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class p extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56362a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f56369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f56370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Surface f56371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceHolder f56372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f56373l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f56375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f56376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f56377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f56378q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.enums.b f56363b = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56364c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56365d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56366e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56367f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56368g = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f56374m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f56379r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f56380s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56381t = 0;

    public static void b(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        pVar.safedk_mediaplayer_p_MediaPlayerRelease_885b94a0f32147f4dbbd0288d926e6e5();
        IAlog.e(strB + "timelog: release took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void c(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f56363b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            pVar.safedk_mediaplayer_p_MediaPlayerStart_f43709012b568879f46c903aa7e85cf6();
            pVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            IAlog.a("%s Start called in wrong mState! %s", pVar.b(), bVar);
            if (pVar.f56363b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                pVar.f56364c = true;
            }
        }
        IAlog.e(strB + "timelog: start took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    private void safedk_mediaplayer_p_MediaPlayerPause_c6bf11f2fca1895dd9a8fdfc0a7988b7() throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerPause_c6bf11f2fca1895dd9a8fdfc0a7988b7()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", this, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                CreativeInfoManager.a(inFlMLxL.XCv, (String) null, true, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e2.getMessage());
            }
        }
        super.pause();
    }

    private void safedk_mediaplayer_p_MediaPlayerRelease_885b94a0f32147f4dbbd0288d926e6e5() throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerRelease_885b94a0f32147f4dbbd0288d926e6e5()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", this, QTafcm.ksb, Boolean.valueOf(com.safedk.android.utils.n.c()));
                if (CreativeInfoManager.a(com.safedk.android.utils.h.f63176p, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(com.safedk.android.utils.h.f63176p, (String) null, true, "media-player");
                }
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        super.release();
    }

    private void safedk_mediaplayer_p_MediaPlayerSetSurface_baf035e053cd0323964903e8d61e6fe2(Surface p1) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerSetSurface_baf035e053cd0323964903e8d61e6fe2(Landroid/view/Surface;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player ", this, ", surface ", p1, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: ", e2.getMessage());
            }
        }
        super.setSurface(p1);
    }

    private void safedk_mediaplayer_p_MediaPlayerStart_f43709012b568879f46c903aa7e85cf6() throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerStart_f43709012b568879f46c903aa7e85cf6()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", this, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                CreativeInfoManager.a(com.safedk.android.utils.h.f63176p, this);
                CreativeInfoManager.a(com.safedk.android.utils.h.f63176p, (String) null, false, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        super.start();
    }

    private void safedk_mediaplayer_p_MediaPlayerStop_1a4f9cb0ba4b60a5eec058e0c59d0088() throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->safedk_mediaplayer_p_MediaPlayerStop_1a4f9cb0ba4b60a5eec058e0c59d0088()V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", this, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                CreativeInfoManager.a(com.safedk.android.utils.h.f63176p, (String) null, true, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e2.getMessage());
            }
        }
        super.stop();
    }

    public final boolean a() {
        return (this.f56363b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.f56363b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public final void d() {
        this.f56365d = true;
        if (a()) {
            a(new l(this));
        } else {
            IAlog.a("%s mute called when player is not ready!", b());
        }
        IAlog.a("%s mute", b());
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/mediaplayer/p;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f63176p, mediaPlayer, "media-player");
        safedk_p_onCompletion_c2edc5526db825297a33bec5b2811602(mediaPlayer);
    }

    public final void a(String str) {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f56367f = false;
        this.f56368g = false;
        if (isPlaying()) {
            IAlog.a("%s loadUri stopping play before refresh", b());
            stop();
        }
        this.f56373l = System.currentTimeMillis();
        e();
        IAlog.a("%s calling setDataSource with %s", b(), str);
        try {
            DTExchangeVideoBridge.MediaPlayerSetDataSource(this, str);
            IAlog.a("%s setDataSource succeeded, calling prepareAsync", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e2) {
                IAlog.b("%s prepareAsync failed with illegal mState exception: %s", b(), e2.getMessage());
                this.f56374m++;
                if (this.f56374m < 5) {
                    a(str);
                }
                this.f56374m = 0;
            }
            IAlog.e(strB + "timelog: loadUri took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e3) {
            IAlog.b("%s error setting data source %s", b(), str);
            IAlog.b("%s exception message: %s", b(), e3.getMessage());
        }
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.f56379r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.f56381t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.f56380s;
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f56363b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (a()) {
                    a(new k(this));
                } else {
                    IAlog.a("%s paused called when player is not ready!", b());
                }
                IAlog.a("%s pause", b());
                return;
            }
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", b(), this.f56363b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.f56366e) {
            a(new g(this));
        }
        this.f56370i = null;
        this.f56378q = null;
        this.f56366e = true;
        IAlog.a("%s release called", b());
    }

    public void safedk_p_onCompletion_c2edc5526db825297a33bec5b2811602(MediaPlayer p0) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    public p(Context context, n nVar, Handler handler) {
        this.f56362a = context;
        this.f56370i = nVar;
        this.f56369h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f56375n = handlerThread;
        handlerThread.start();
        this.f56376o = new Handler(this.f56375n.getLooper());
        this.f56378q = new b(this);
    }

    public final void e() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f56363b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            IAlog.a("%s reset called, but player is already resetted. Do nothing", b());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.e(strB + "timelog: reset took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        if (a() && this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        IAlog.f("%s onError code = %d code2 = %d", b(), Integer.valueOf(i2), Integer.valueOf(i3));
        e();
        this.f56369h.post(new a(this, i2, i3));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("%s onPrepared %s gotPrepared = %s", b(), this, Boolean.valueOf(this.f56368g));
        IAlog.a("%sMedia prepare time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f56373l));
        if (this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.f("%s onPrepared: previous error encountered. Aborting", b());
        } else if (!this.f56368g) {
            this.f56368g = true;
            c();
        } else {
            IAlog.a("%s onPrepared called again??? We are already prepared", b());
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.a("%s onSeekComplete called current position = %d", b(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f56363b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.a("%s onSeekComplete called when Story is not seeking", b());
            return;
        }
        if (this.f56365d) {
            d();
        }
        if (this.f56364c) {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = true", b());
            this.f56363b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
        } else {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = false", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        IAlog.a("%s onVideoSizeChanged %d, %d", b(), Integer.valueOf(i2), Integer.valueOf(i3));
        if (this.f56367f) {
            return;
        }
        c cVar = this.f56377p;
        if (cVar != null) {
            r.f57026b.removeCallbacks(cVar);
            IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", b());
        }
        this.f56367f = true;
        if (i2 != 0 && i3 != 0) {
            IAlog.a("%sMedia got video size time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f56373l));
            this.f56380s = i2;
            this.f56381t = i3;
            c();
            return;
        }
        IAlog.f("%s onVideoSizeChanged - Invalid video size!", b());
        onError(this, 0, 0);
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        IAlog.a("%s reset called", b());
        c cVar = this.f56377p;
        if (cVar != null) {
            r.f57026b.removeCallbacks(cVar);
        }
        a(new h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.a("%s setDisplay called", b());
        if (!a()) {
            IAlog.a("%s setDisplay called when player is not ready!", b());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f56372k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.a("%s setDisplay called with existing surface. ignoring!", b());
        } else {
            this.f56372k = surfaceHolder;
            a(new e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(Surface surface) {
        IAlog.a("%s setSurface called", b());
        Surface surface2 = this.f56371j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.a("%s setSurface called with existing surface. ignoring!", b());
        } else {
            this.f56371j = surface;
            a(new f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        IAlog.a("%s Start called", b());
        if (!a()) {
            IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", b(), this.f56363b);
            return;
        }
        if (this.f56363b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.f56364c = true;
        } else if (isPlaying()) {
            IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", b());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        String strB = b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a()) {
            safedk_mediaplayer_p_MediaPlayerStop_1a4f9cb0ba4b60a5eec058e0c59d0088();
        }
        IAlog.a("%s stop called", b());
        IAlog.e(strB + "timelog: stop took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public static void d(p pVar) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            pVar.safedk_mediaplayer_p_MediaPlayerPause_c6bf11f2fca1895dd9a8fdfc0a7988b7();
        } else {
            IAlog.a("%s paused called cannot set to pause, canceled", pVar.b());
        }
        IAlog.e(strB + "timelog: delayed pause took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
    }

    public final String b() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + ": ";
    }

    public final void c() {
        if (this.f56368g) {
            if (this.f56367f) {
                IAlog.a("%sMedia load time took %d msec", b(), Long.valueOf(System.currentTimeMillis() - this.f56373l));
                this.f56379r = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.f56365d) {
                    d();
                    return;
                }
                return;
            }
            IAlog.a("%sGot prepared only, waiting for video size", b());
            if (this.f56377p == null) {
                this.f56377p = new c(this);
            }
            r.f57026b.postDelayed(this.f56377p, 2000L);
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%s updatePlayerState - %s", b(), bVar);
        if (this.f56363b == bVar) {
            IAlog.a("%s updatePlayerState - mState didn't change!", b());
            return;
        }
        IAlog.a("%s updatePlayerState - changing from %s to %s", b(), this.f56363b, bVar);
        this.f56363b = bVar;
        this.f56369h.post(new d(this, bVar));
    }

    public static void a(p pVar, Surface surface) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setSurface called with %s", pVar.b(), surface);
        try {
            pVar.safedk_mediaplayer_p_MediaPlayerSetSurface_baf035e053cd0323964903e8d61e6fe2(surface);
            if (surface == null) {
                IAlog.a("%s setSurface with null! current surface cleared", pVar.b());
            } else {
                IAlog.a("%s setSurface - replacing surface!", pVar.b());
            }
            IAlog.e(strB + "timelog: setSurface took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setSurface threw exception!", pVar.b());
        }
    }

    public static void a(p pVar, SurfaceHolder surfaceHolder) {
        String strB = pVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setDisplay called with %s", pVar.b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.a("%s setDisplay with null! current display cleared", pVar.b());
            } else {
                IAlog.a("%s setDisplay - replacing surface holder!", pVar.b());
            }
            IAlog.e(strB + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setDisplay threw exception!", pVar.b());
        }
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f56375n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f56375n.isInterrupted() && (handler2 = this.f56376o) != null) {
            handler2.post(runnable);
        }
        if ((this.f56380s == 0 || this.f56381t == 0 || this.f56379r == 0) && (handler = this.f56376o) != null) {
            handler.post(this.f56378q);
        }
    }

    public static void a(p pVar) {
        if (pVar.a()) {
            pVar.f56380s = super.getVideoWidth();
            pVar.f56381t = super.getVideoHeight();
            pVar.f56379r = super.getDuration();
        }
    }
}
