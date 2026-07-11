package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class s extends z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f54487A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f54488B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f54489C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f54490D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f54491E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f54492z;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63176p);
        p0.startActivity(p1);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public boolean A() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z2) {
        if (z2) {
            a(this.f54488B);
        }
        super.a(z2);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        return !(this instanceof c0);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int o() {
        return 0;
    }

    public final void G() {
        Context context;
        if (this.f54507g == null || this.f54491E) {
            return;
        }
        I();
        super.g();
        com.fyber.inneractive.sdk.renderers.q qVar = (com.fyber.inneractive.sdk.renderers.q) ((a0) this.f54507g);
        com.fyber.inneractive.sdk.renderers.r rVar = qVar.f56782a;
        InneractiveUnitController.EventsListener eventsListener = rVar.f53563c;
        if (eventsListener != null) {
            SpecialsBridge.fyberOnAdExpanded((InneractiveAdViewEventsListener) eventsListener, rVar.f53561a);
        }
        com.fyber.inneractive.sdk.renderers.r rVar2 = qVar.f56782a;
        ViewGroup viewGroup = rVar2.f56787p;
        if (viewGroup != null && rVar2.f53561a != null && (context = viewGroup.getContext()) != null) {
            InneractiveAdSpot inneractiveAdSpot = qVar.f56782a.f53561a;
            Intent intent = new Intent(context, (Class<?>) InneractiveFullscreenAdActivity.class);
            intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(context), inneractiveAdSpot.getLocalUniqueId());
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            } catch (ActivityNotFoundException unused) {
                IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(context));
            }
        }
        IAlog.a("%sopening fullscreen", IAlog.a(this));
        this.f54491E = true;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            nVar.a(nVar.f56383p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_FULLSCREEN, com.fyber.inneractive.sdk.model.vast.x.EVENT_EXPAND);
        }
    }

    public void H() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        if (this.f54488B < this.f54487A || (fVar = this.f54501a) == null || (qVar = fVar.f56321a) == null || qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed || (sVar = this.f54504d) == null || sVar.c() || this.f54501a.f56321a.f54480j == null) {
            return;
        }
        if (((r0) this.f54502b).f53420f.f53471a.booleanValue() || this.f54489C) {
            c(IAConfigManager.f53260M.f53283i.f53393a);
        }
    }

    public final void I() {
        if (this.f54492z != null) {
            IAlog.a("%sCancelling play runnable", IAlog.a(this));
            this.f54504d.removeCallbacks(this.f54492z);
            this.f54492z = null;
        }
    }

    public final void J() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || (qVar = fVar.f56321a) == null || qVar.f54484n) {
            return;
        }
        if (((r0) this.f54502b).f53420f.f53474d.booleanValue()) {
            this.f54501a.f56321a.b(false);
        } else {
            if (p()) {
                return;
            }
            this.f54501a.f56321a.d(false);
        }
    }

    public void K() {
        if (((r0) this.f54502b).f53420f.f53479i != TapAction.FULLSCREEN) {
            this.f54504d.n();
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z2) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (qVar = fVar.f56321a) != null && qVar.f54475e != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            K();
        }
        super.b(z2);
    }

    public final void c(int i2) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || (qVar = fVar.f56321a) == null || qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Playing || this.f54492z != null) {
            return;
        }
        IAlog.a("%splayVideo %s", IAlog.a(this), this.f54504d);
        if (i2 == 0) {
            h(false);
            return;
        }
        r rVar = new r(this);
        this.f54492z = rVar;
        this.f54504d.postDelayed(rVar, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h(boolean z2) {
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || fVar.f56321a == null) {
            return;
        }
        J();
        super.h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.f53260M.f53294t.f53466b.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    public final void j(boolean z2) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        this.f54490D = z2;
        if (!z2 || (fVar = this.f54501a) == null || (qVar = fVar.f56321a) == null || qVar.f54480j != null || !this.f54504d.f56429e || qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        f();
        a(this.f54488B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || fVar.f56321a == null) {
            return;
        }
        f();
        h(false);
    }

    public s(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z2, String str) {
        super(fVar, sVar, r0Var, rVar, z2, str);
        this.f54488B = 0.0f;
        this.f54489C = false;
        this.f54490D = false;
        this.f54491E = false;
        this.f54487A = ((r0) this.f54502b).f53421g.f53484b.intValue() / 100.0f;
        J();
    }

    public void F() {
        IAlog.a("%s handle buffering timeout: Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void a(float f3) {
        q qVar;
        this.f54488B = f3;
        if (IAlog.f56974a >= 3) {
            IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.a(this), Float.valueOf(f3), Float.valueOf(this.f54487A), Float.valueOf(1.0f - this.f54487A));
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || (qVar = fVar.f56321a) == null) {
            return;
        }
        if (qVar.f54475e != com.fyber.inneractive.sdk.player.enums.b.Playing) {
            H();
            return;
        }
        if (f3 <= this.f54487A) {
            IAlog.e("%sonVisibilityChanged pausing player", IAlog.a(this));
            if (this.f54501a.f56321a.f54480j != null) {
                this.f54489C = false;
                I();
                super.z();
                f(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        I();
        this.f54507g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && fVar.f56321a != null) {
            IAlog.a("%sconnectToTextureView playing state = %s", IAlog.a(this), this.f54501a.f56321a.f54475e);
            if (this.f54501a.f56321a.h()) {
                this.f54504d.e(!this.f54501a.f56327g);
                J();
            }
        }
        a(this.f54488B);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g() {
        I();
        super.g();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        IAlog.a("%s onBufferingTimeout reached", IAlog.a(this));
        if (this.f54504d.f56429e) {
            this.f54518r = true;
            F();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        G();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void u() {
        super.u();
        I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void w() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        K();
        this.f54489C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void z() {
        I();
        super.z();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public void b(g1 g1Var) {
        q qVar;
        TapAction tapAction = ((r0) this.f54502b).f53420f.f53479i;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || fVar.f56321a == null || this.f54488B >= this.f54487A) {
            if (tapAction == TapAction.CTR) {
                a(false, VideoClickOrigin.CTA, g1Var);
                return;
            }
            if (tapAction == TapAction.FULLSCREEN) {
                G();
                return;
            }
            if (tapAction != TapAction.DO_NOTHING) {
                IAlog.a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
                return;
            }
            if (fVar == null || (qVar = fVar.f56321a) == null) {
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f54475e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                qVar.j();
            } else {
                qVar.a(1, true);
            }
        }
    }
}
