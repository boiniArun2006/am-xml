package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b1;
import com.applovin.impl.d6;
import com.applovin.impl.m8;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class a2 extends w1 implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final b2 f47888M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private MediaPlayer f47889N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View f47890O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected final AppLovinVideoView f47891P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected final com.applovin.impl.a f47892Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f47893R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected i0 f47894S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected final ImageView f47895T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected com.applovin.impl.adview.l f47896U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected final ProgressBar f47897V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected ProgressBar f47898W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected ImageView f47899X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final e f47900Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final d f47901Z;
    private final Handler a0;
    private final Handler b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected final b1 f47902c0;
    protected final b1 d0;
    private final boolean e0;
    protected boolean f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected long f47903g0;
    private int h0;
    private int i0;
    protected boolean j0;
    private boolean k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AtomicBoolean f47904l0;
    private final AtomicBoolean m0;
    private long n0;
    private long o0;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class a implements b1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47905a;

        a(int i2) {
            this.f47905a = i2;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            if (a2.this.f47894S != null) {
                long seconds = ((long) this.f47905a) - TimeUnit.MILLISECONDS.toSeconds(r0.f47891P.getCurrentPosition());
                if (seconds <= 0) {
                    a2.this.f50671v = true;
                } else if (a2.this.Q()) {
                    a2.this.f47894S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return a2.this.Q();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class b implements b1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f47907a;

        b(Integer num) {
            this.f47907a = num;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            a2 a2Var = a2.this;
            if (a2Var.j0) {
                a2Var.f47897V.setVisibility(8);
            } else {
                a2.this.f47897V.setProgress((int) ((a2Var.f47891P.getCurrentPosition() / a2.this.f47903g0) * this.f47907a.intValue()));
            }
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return !a2.this.j0;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class c implements b1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f47909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f47910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Long f47911c;

        c(long j2, Integer num, Long l2) {
            this.f47909a = j2;
            this.f47910b = num;
            this.f47911c = l2;
        }

        @Override // com.applovin.impl.b1.b
        public void a() {
            a2.this.f47898W.setProgress((int) ((a2.this.f50667r / this.f47909a) * this.f47910b.intValue()));
            a2.this.f50667r += this.f47911c.longValue();
        }

        @Override // com.applovin.impl.b1.b
        public boolean b() {
            return a2.this.f50667r < this.f47909a;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private class d implements m8.a {
        private d() {
        }

        @Override // com.applovin.impl.m8.a
        public void a(com.applovin.impl.adview.l lVar) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            a2.this.a("video_button");
        }

        @Override // com.applovin.impl.m8.a
        public void b(com.applovin.impl.adview.l lVar) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            a2.this.a(lVar.getAndClearLastClickEvent());
        }

        /* synthetic */ d(a2 a2Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.m8.a
        public void c(com.applovin.impl.adview.l lVar) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            a2.this.f50647J = true;
        }

        @Override // com.applovin.impl.m8.a
        public void d(com.applovin.impl.adview.l lVar) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            a2.this.T();
        }

        @Override // com.applovin.impl.m8.a
        public void a(Uri uri, com.applovin.impl.adview.l lVar) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            k7.a(uri, a2.this.b().getController(), a2.this.f50651b);
        }

        @Override // com.applovin.impl.m8.a
        public void b(Uri uri, com.applovin.impl.adview.l lVar) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            k7.c(uri, a2.this.b().getController().g(), a2.this.f50651b);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/a2$e;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f63161a, mediaPlayer, "media-player");
            safedk_a2$e_onCompletion_ffc10cb19c0b37098ac09c7b1569d838(mediaPlayer);
        }

        /* synthetic */ e(a2 a2Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            a2.this.a(motionEvent);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            a2.this.g("Video view error (" + i2 + "," + i3 + ")");
            AppLovinVideoBridge.VideoViewPlay(a2.this.f47891P);
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i2 + ", " + i3 + ")");
            }
            if (i2 == 701) {
                a2.this.R();
                return false;
            }
            if (i2 != 3) {
                if (i2 != 702) {
                    return false;
                }
                a2.this.E();
                return false;
            }
            a2.this.f47902c0.b();
            a2 a2Var = a2.this;
            if (a2Var.f47893R != null) {
                a2Var.P();
            }
            a2.this.E();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            a2.this.f47889N = mediaPlayer;
            mediaPlayer.setOnInfoListener(a2.this.f47900Y);
            mediaPlayer.setOnErrorListener(a2.this.f47900Y);
            float f3 = !a2.this.f0 ? 1 : 0;
            mediaPlayer.setVolume(f3, f3);
            a2.this.f50670u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            a2.this.d(mediaPlayer.getDuration());
            a2.this.O();
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + a2.this.f47889N);
            }
        }

        public void safedk_a2$e_onCompletion_ffc10cb19c0b37098ac09c7b1569d838(MediaPlayer p0) {
            C1804o c1804o = a2.this.f50652c;
            if (C1804o.a()) {
                a2.this.f50652c.a("AppLovinFullscreenActivity", "Video completed");
            }
            a2.this.k0 = true;
            a2 a2Var = a2.this;
            if (!a2Var.f50669t) {
                a2Var.S();
            } else if (a2Var.h()) {
                a2.this.A();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private class f implements View.OnClickListener {
        private f() {
        }

        /* synthetic */ f(a2 a2Var, a aVar) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a2 a2Var = a2.this;
            if (view == a2Var.f47893R) {
                a2Var.T();
                return;
            }
            if (view == a2Var.f47895T) {
                a2Var.U();
                return;
            }
            if (C1804o.a()) {
                a2.this.f50652c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    private void e(boolean z2) {
        if (o0.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f50653d.getDrawable(z2 ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f47895T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f47895T.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f47895T, z2 ? this.f50650a.G() : this.f50650a.Y(), this.f50651b);
    }

    private void f(boolean z2) {
        this.h0 = C();
        if (z2) {
            AppLovinVideoBridge.VideoViewPause(this.f47891P);
        } else {
            AppLovinVideoBridge.VideoViewStop(this.f47891P);
        }
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    public a2(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, C1802k c1802k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, c1802k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f47888M = new b2(this.f50650a, this.f50653d, this.f50651b);
        a aVar = null;
        this.f47899X = null;
        e eVar = new e(this, aVar);
        this.f47900Y = eVar;
        d dVar = new d(this, aVar);
        this.f47901Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.b0 = handler2;
        b1 b1Var = new b1(handler, this.f50651b);
        this.f47902c0 = b1Var;
        this.d0 = new b1(handler2, this.f50651b);
        boolean zC0 = this.f50650a.C0();
        this.e0 = zC0;
        this.f0 = n7.e(this.f50651b);
        this.i0 = -1;
        this.f47904l0 = new AtomicBoolean();
        this.m0 = new AtomicBoolean();
        this.n0 = -2L;
        this.o0 = 0L;
        if (!bVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f47891P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        bVar.h().putString("video_view_address", e8.a(appLovinVideoView));
        View view = new View(activity);
        this.f47890O = view;
        boolean z2 = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) c1802k.a(x4.m1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(c1802k, x4.e0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(c1802k, x4.e0, activity, eVar));
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.qz
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return a2.a(view2, motionEvent);
                }
            });
        }
        f fVar = new f(this, aVar);
        if (bVar.d0() >= 0) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.U(), activity);
            this.f47893R = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(fVar);
        } else {
            this.f47893R = null;
        }
        if (a(this.f0, c1802k)) {
            ImageView imageView = new ImageView(activity);
            this.f47895T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            e(this.f0);
        } else {
            this.f47895T = null;
        }
        String strA0 = bVar.a0();
        if (StringUtils.isValidString(strA0)) {
            m8 m8Var = new m8(c1802k);
            m8Var.a(new WeakReference(dVar));
            com.applovin.impl.adview.l lVar = new com.applovin.impl.adview.l(bVar.Z(), bVar, m8Var, activity);
            this.f47896U = lVar;
            lVar.a(strA0);
        } else {
            this.f47896U = null;
        }
        if (zC0) {
            com.applovin.impl.a aVar2 = new com.applovin.impl.a(activity, ((Integer) c1802k.a(x4.k2)).intValue(), android.R.attr.progressBarStyleLarge);
            this.f47892Q = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f47892Q = null;
        }
        int iC = c();
        if (((Boolean) c1802k.a(x4.U1)).booleanValue() && iC > 0) {
            z2 = true;
        }
        if (this.f47894S == null && z2) {
            this.f47894S = new i0(activity);
            int iS = bVar.s();
            this.f47894S.setTextColor(iS);
            this.f47894S.setTextSize(((Integer) c1802k.a(x4.f50794T1)).intValue());
            this.f47894S.setFinishedStrokeColor(iS);
            this.f47894S.setFinishedStrokeWidth(((Integer) c1802k.a(x4.S1)).intValue());
            this.f47894S.setMax(iC);
            this.f47894S.setProgress(iC);
            b1Var.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iC));
        }
        if (!bVar.k0()) {
            this.f47897V = null;
            return;
        }
        Long l2 = (Long) c1802k.a(x4.h2);
        Integer num = (Integer) c1802k.a(x4.i2);
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleHorizontal);
        this.f47897V = progressBar;
        a(progressBar, bVar.j0(), num.intValue());
        b1Var.a("PROGRESS_BAR", l2.longValue(), new b(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        com.applovin.impl.a aVar = this.f47892Q;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        com.applovin.impl.a aVar = this.f47892Q;
        if (aVar != null) {
            aVar.a();
            final com.applovin.impl.a aVar2 = this.f47892Q;
            Objects.requireNonNull(aVar2);
            a(new Runnable() { // from class: com.applovin.impl.Xo
                @Override // java.lang.Runnable
                public final void run() {
                    aVar2.b();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.n0 = -1L;
        this.o0 = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() {
        com.applovin.impl.a aVar = this.f47892Q;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void M() {
        com.applovin.impl.adview.l lVar;
        d8 d8VarB0 = this.f50650a.b0();
        if (d8VarB0 == null || !d8VarB0.j() || this.j0 || (lVar = this.f47896U) == null) {
            return;
        }
        final boolean z2 = lVar.getVisibility() == 4;
        final long jH = d8VarB0.h();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.Wre
            @Override // java.lang.Runnable
            public final void run() {
                this.f47860n.b(z2, jH);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (this.j0) {
            if (C1804o.a()) {
                this.f50652c.k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f50651b.m0().isApplicationPaused()) {
            if (C1804o.a()) {
                this.f50652c.k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.i0 < 0) {
            if (C1804o.a()) {
                this.f50652c.a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Resuming video at position " + this.i0 + "ms for MediaPlayer: " + this.f47889N);
        }
        this.f47891P.seekTo(this.i0);
        AppLovinVideoBridge.VideoViewPlay(this.f47891P);
        this.f47902c0.b();
        this.i0 = -1;
        a(new Runnable() { // from class: com.applovin.impl.I28
            @Override // java.lang.Runnable
            public final void run() {
                this.f47738n.I();
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        if (this.m0.compareAndSet(false, true)) {
            a(this.f47893R, this.f50650a.d0(), new Runnable() { // from class: com.applovin.impl.Dsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47714n.J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        o8.a(this.f47896U, str, "AppLovinFullscreenActivity", this.f50651b);
    }

    @Override // com.applovin.impl.w1
    protected void A() {
        this.f47888M.a(this.f50661l);
        this.f50666q = SystemClock.elapsedRealtime();
    }

    protected int C() {
        long currentPosition = this.f47891P.getCurrentPosition();
        if (this.k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f47903g0) * 100.0f) : this.h0;
    }

    public void D() {
        this.f50674y++;
        if (this.f50650a.u()) {
            if (C1804o.a()) {
                this.f50652c.a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            a("video_skip");
        } else {
            if (C1804o.a()) {
                this.f50652c.a("AppLovinFullscreenActivity", "Skipping video...");
            }
            S();
        }
    }

    protected void E() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.CN3
            @Override // java.lang.Runnable
            public final void run() {
                this.f47705n.H();
            }
        });
    }

    protected boolean F() {
        if (this.f50647J && this.f50650a.a1()) {
            return true;
        }
        return G();
    }

    protected void O() {
        long jP;
        long millis;
        if (this.f50650a.O() >= 0 || this.f50650a.P() >= 0) {
            if (this.f50650a.O() >= 0) {
                jP = this.f50650a.O();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f50650a;
                long j2 = this.f47903g0;
                long j3 = j2 > 0 ? j2 : 0L;
                if (aVar.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f50650a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) aVar.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                    j3 += millis;
                }
                jP = (long) (j3 * (((double) this.f50650a.P()) / 100.0d));
            }
            c(jP);
        }
    }

    protected boolean Q() {
        return (this.f50671v || this.j0 || !this.f47891P.isPlaying()) ? false : true;
    }

    protected void R() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.eO
            @Override // java.lang.Runnable
            public final void run() {
                this.f48502n.K();
            }
        });
    }

    public void S() {
        a2 a2Var;
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        f(this.f50650a.d1());
        long jM = this.f50650a.M();
        if (jM > 0) {
            this.f50667r = 0L;
            Long l2 = (Long) this.f50651b.a(x4.p2);
            Integer num = (Integer) this.f50651b.a(x4.s2);
            ProgressBar progressBar = new ProgressBar(this.f50653d, null, android.R.attr.progressBarStyleHorizontal);
            this.f47898W = progressBar;
            a(progressBar, this.f50650a.L(), num.intValue());
            a2Var = this;
            this.d0.a("POSTITIAL_PROGRESS_BAR", l2.longValue(), a2Var.new c(jM, num, l2));
            a2Var.d0.b();
        } else {
            a2Var = this;
        }
        a2Var.f47888M.a(a2Var.f50660k, a2Var.f50659j, b(), a2Var.f47898W);
        a("javascript:al_onPoststitialShow(" + a2Var.f50674y + "," + a2Var.f50675z + ");", a2Var.f50650a.x());
        if (a2Var.f50660k != null) {
            if (a2Var.f50650a.r() >= 0) {
                a(a2Var.f50660k, a2Var.f50650a.r(), new Runnable() { // from class: com.applovin.impl.aC
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47939n.L();
                    }
                });
            } else {
                a2Var.f50660k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = a2Var.f50660k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = a2Var.f50659j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = a2Var.f50659j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = a2Var.f47898W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        a2Var.f50650a.getAdEventTracker().b(b(), arrayList);
        p();
        a2Var.j0 = true;
    }

    protected void U() {
        MediaPlayer mediaPlayer = this.f47889N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f3 = this.f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f3, f3);
            boolean z2 = !this.f0;
            this.f0 = z2;
            e(z2);
            a(this.f0, 0L);
        } catch (Throwable unused) {
        }
    }

    @Override // com.applovin.impl.w1
    public void b(boolean z2) {
        super.b(z2);
        if (z2) {
            b(0L);
            if (this.j0) {
                this.d0.b();
                return;
            }
            return;
        }
        if (this.j0) {
            this.d0.c();
        } else {
            v();
        }
    }

    protected void d(long j2) {
        this.f47903g0 = j2;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L() {
        this.f50666q = SystemClock.elapsedRealtime();
    }

    protected boolean G() {
        if (C() >= this.f50650a.f0()) {
            return true;
        }
        return false;
    }

    public void T() {
        this.n0 = SystemClock.elapsedRealtime() - this.o0;
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Attempting to skip video with skip time: " + this.n0 + "ms");
        }
        D();
    }

    protected void g(String str) {
        String str2;
        if (C1804o.a()) {
            this.f50652c.b("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f50650a);
        }
        if (this.f47904l0.compareAndSet(false, true)) {
            if (((Boolean) this.f50651b.a(x4.O0)).booleanValue()) {
                this.f50651b.G().d(this.f50650a, C1802k.o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f50643F;
            if (appLovinAdDisplayListener instanceof l2) {
                ((l2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            if (this.f50650a instanceof o7) {
                str2 = "handleVastVideoError";
            } else {
                str2 = "handleVideoError";
            }
            this.f50651b.D().a(str2, str, this.f50650a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f50651b.g().a(d2.f48251F, this.f50650a, mapHashMap);
            a("media_error");
        }
    }

    @Override // com.applovin.impl.w1
    protected void m() {
        super.a(C(), this.e0, F(), this.n0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong(CreativeInfo.f62439c) == this.f50650a.getAdIdNumber() && this.e0) {
                int i2 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || r0.a(i2)) && !this.k0 && !this.f47891P.isPlaying()) {
                    g("Video cache error during stream. ResponseCode=" + i2 + ", exception=" + string);
                }
            }
        }
    }

    @Override // com.applovin.impl.w1
    public void r() {
        if (C1804o.a()) {
            this.f50652c.d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f50651b.a(x4.v6)).booleanValue()) {
                o8.b(this.f47896U);
                this.f47896U = null;
            }
            if (this.e0) {
                AppLovinCommunicator.getInstance(this.f50653d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f47891P;
            if (appLovinVideoView != null) {
                AppLovinVideoBridge.VideoViewPause(appLovinVideoView);
                AppLovinVideoBridge.VideoViewStop(this.f47891P);
            }
            MediaPlayer mediaPlayer = this.f47889N;
            if (mediaPlayer != null) {
                AppLovinVideoBridge.MediaPlayerRelease(mediaPlayer);
            }
        } catch (Throwable th) {
            C1804o.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.r();
    }

    @Override // com.applovin.impl.w1
    public void v() {
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.i0 = this.f47891P.getCurrentPosition();
        AppLovinVideoBridge.VideoViewPause(this.f47891P);
        this.f47902c0.c();
        if (C1804o.a()) {
            this.f50652c.a("AppLovinFullscreenActivity", "Paused video at position " + this.i0 + "ms");
        }
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        this.f47888M.a(this.f47896U);
        this.f47888M.a((View) this.f47893R);
        if (!h() || this.j0) {
            A();
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        String str;
        this.f47888M.a(this.f47895T, this.f47893R, this.f47896U, this.f47892Q, this.f47897V, this.f47894S, this.f47891P, this.f47890O, b(), this.f50659j, this.f47899X, viewGroup);
        if (o0.g() && (str = this.f50651b.n0().getExtraParameters().get("audio_focus_request")) != null) {
            this.f47891P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f50651b.a(x4.f50804X5)).booleanValue() || !a(!this.e0)) {
            AppLovinVideoBridge.VideoViewSetVideoUri(this.f47891P, this.f50650a.l0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            com.applovin.impl.adview.k kVar = this.f50659j;
            if (kVar != null) {
                kVar.b();
            }
            AppLovinVideoBridge.VideoViewPlay(this.f47891P);
            if (this.e0) {
                R();
            }
            SpecialsBridge.appLovinAdViewRenderAd(b(), this.f50650a);
            if (this.f47893R != null) {
                this.f50651b.q0().a(new C1797r6(this.f50651b, jhotmBbwMbr.ekY, new Runnable() { // from class: com.applovin.impl.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47703n.P();
                    }
                }), d6.b.TIMEOUT, this.f50650a.e0(), true);
            }
            super.c(this.f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z2, long j2) {
        if (z2) {
            e8.a(this.f47896U, j2, (Runnable) null);
        } else {
            e8.b(this.f47896U, j2, null);
        }
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void b(long j2) {
        a(new Runnable() { // from class: com.applovin.impl.Pl
            @Override // java.lang.Runnable
            public final void run() {
                this.f47803n.N();
            }
        }, j2);
    }

    @Override // com.applovin.impl.w1
    protected void a(final String str, long j2) {
        super.a(str, j2);
        if (this.f47896U == null || j2 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.fuX
            @Override // java.lang.Runnable
            public final void run() {
                this.f48566n.h(str);
            }
        }, j2);
    }

    private void a(ProgressBar progressBar, int i2, int i3) {
        progressBar.setMax(i3);
        progressBar.setPadding(0, 0, 0, 0);
        if (o0.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        this.f47902c0.a();
        this.d0.a();
        this.a0.removeCallbacksAndMessages(null);
        this.b0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f50651b.a(x4.f50783P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f50650a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        super.a(str);
    }

    protected void a(MotionEvent motionEvent) {
        Context context;
        if (this.f50650a.B0()) {
            if (C1804o.a()) {
                this.f50652c.a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriC0 = this.f50650a.c0();
            if (uriC0 != null) {
                if (!((Boolean) this.f50651b.a(x4.f50848w)).booleanValue() || (context = this.f50653d) == null) {
                    context = b() != null ? b().getContext() : C1802k.o();
                }
                this.f50651b.k().trackAndLaunchVideoClick(this.f50650a, uriC0, motionEvent, this, context);
                t2.a(this.f50642E, this.f50650a);
                this.f50675z++;
                return;
            }
            return;
        }
        M();
    }

    private static boolean a(boolean z2, C1802k c1802k) {
        if (!((Boolean) c1802k.a(x4.Z1)).booleanValue()) {
            return false;
        }
        if (!((Boolean) c1802k.a(x4.a2)).booleanValue() || z2) {
            return true;
        }
        return ((Boolean) c1802k.a(x4.c2)).booleanValue();
    }
}
