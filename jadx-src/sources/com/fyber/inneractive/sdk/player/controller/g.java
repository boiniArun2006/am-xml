package com.fyber.inneractive.sdk.player.controller;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g extends z implements com.fyber.inneractive.sdk.flow.storepromo.loader.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f54457A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f54458B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f54459z;

    public g(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z2, boolean z3, String str) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        super(fVar, sVar, s0Var, rVar, z2, str);
        this.f54459z = false;
        this.f54457A = false;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
        if (fVar2 != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar2).f56389v) != null) {
            bVar.f53819e = this;
        }
        this.f54459z = false;
        this.f54458B = z3;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a() {
        if (!this.f54508h) {
            f();
            return;
        }
        if (this.f54504d.c()) {
            return;
        }
        this.f54504d.a(false);
        Runnable runnable = this.f54510j;
        if (runnable != null) {
            this.f54504d.removeCallbacks(runnable);
            this.f54510j = null;
        }
        E();
        D();
        this.f54511k = false;
        this.f54508h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z2) {
        super.b(z2);
        if (this.f54459z) {
            this.f54504d.m();
            this.f54504d.g(false);
            this.f54506f = 0;
        }
        C();
        this.f54504d.e(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean A() {
        return !this.f54459z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.f53260M.f53294t.f53466b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o() {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        int iIntValue;
        t0 t0Var;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            cVar = new ArrayList(cVar2.f53362c.values()).size() > 0 ? (com.fyber.inneractive.sdk.config.global.features.c) this.f54503c.a(com.fyber.inneractive.sdk.config.global.features.c.class) : null;
        }
        if (cVar != null) {
            Integer numA = cVar.a("skip_time_sec");
            iIntValue = numA != null ? numA.intValue() : 5;
            if (iIntValue < 0 || iIntValue > 8) {
                iIntValue = 5;
            }
        } else {
            iIntValue = -1;
        }
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.f53260M.f53294t.f53466b;
        s0 s0Var = this.f54502b;
        Skip skip = this.f54524x;
        boolean zIsCurrentUserAChild = InneractiveAdManager.isCurrentUserAChild();
        com.fyber.inneractive.sdk.config.l lVarA = oVar.a("vast_configuration");
        lVarA.getClass();
        int i2 = lVarA.f53400a.containsKey("skip_d") ? Integer.parseInt((String) lVarA.f53400a.get("skip_d")) : -1;
        int iMax = Math.max(i2, -1);
        if (skip == null && s0Var != null && (t0Var = ((r0) s0Var).f53420f) != null) {
            skip = t0Var.f53478h;
        }
        if (zIsCurrentUserAChild) {
            if (iIntValue > -1 && iIntValue <= 8) {
                return iIntValue;
            }
            if (iMax <= -1 || iMax > 8) {
                int iIntValue2 = skip.value().intValue();
                if (iIntValue2 <= -1 || iIntValue2 > 8) {
                    return 5;
                }
                return skip.value().intValue();
            }
        } else if (iMax <= -1 || iMax > 5) {
            if (skip == Skip.DEFAULT) {
                return 99999;
            }
            return skip.value().intValue();
        }
        return iMax;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        g0 g0Var = this.f54507g;
        if (g0Var != null) {
            g0Var.g();
        }
        this.f54518r = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        g0 g0Var = this.f54507g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        this.f54504d.g(true);
        C();
        h();
        f();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void E() {
        q qVar;
        super.E();
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (qVar = fVar.f56321a) != null && qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed && this.f54459z) {
            this.f54504d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        int ringerMode;
        int streamVolume;
        AudioManager audioManager;
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && fVar.f56321a != null && !this.f54457A) {
            try {
                audioManager = (AudioManager) this.f54504d.getContext().getSystemService("audio");
                ringerMode = audioManager.getRingerMode();
            } catch (Throwable unused) {
                ringerMode = 0;
            }
            try {
                streamVolume = audioManager.getStreamVolume(2);
            } catch (Throwable unused2) {
                streamVolume = 0;
            }
            if ((this.f54459z || !((r0) this.f54502b).f53420f.f53474d.booleanValue()) && !this.f54458B && !p()) {
                if (streamVolume > 0 && ringerMode == 2) {
                    IAlog.a("%s setting default volume. unmuting player", IAlog.a(this));
                    i(false);
                }
            } else {
                f(false);
            }
            this.f54504d.setMuteButtonState(p());
            this.f54457A = true;
        }
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        if (this.f54459z) {
            this.f54504d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        TapAction tapAction = ((r0) this.f54502b).f53420f.f53479i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
            return;
        }
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            return;
        }
        if (((com.fyber.inneractive.sdk.config.global.features.v) this.f54503c.a(com.fyber.inneractive.sdk.config.global.features.v.class)).c().equals(com.fyber.inneractive.sdk.config.global.features.u.OPEN) || ((this.f54520t != com.fyber.inneractive.sdk.ignite.m.NONE && IAConfigManager.f53260M.f53266D.n()) || ((sVar = this.f54504d) != null && sVar.b()))) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z2) {
        e(z2);
        super.a(z2);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        a(11, g1Var);
    }
}
