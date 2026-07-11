package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class c0 extends s {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final AtomicBoolean f54430F;

    public c0(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, r0 r0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(fVar, sVar, r0Var, rVar, false, null);
        this.f54430F = new AtomicBoolean(false);
        this.f54487A = 0.5f;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean B() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void C() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void K() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean e() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void g(boolean z2) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void h() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final com.fyber.inneractive.sdk.web.b0 k() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final com.fyber.inneractive.sdk.flow.storepromo.b n() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void s() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void H() {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        q qVar = fVar != null ? fVar.f56321a : null;
        if (this.f54488B < this.f54487A || qVar == null || qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed || qVar.f54480j == null || (sVar = this.f54504d) == null || !sVar.hasWindowFocus()) {
            return;
        }
        c(0);
        i(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s, com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f3) {
        boolean z2 = false;
        if (f3 >= 0.01f && this.f54430F.compareAndSet(false, true)) {
            z2 = true;
        }
        e(z2);
        super.a(f3);
        if (z2) {
            IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f3 * 100.0f));
            ((com.fyber.inneractive.sdk.renderers.q) ((a0) this.f54507g)).f56782a.I();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.s
    public final void F() {
        com.fyber.inneractive.sdk.measurement.f fVar;
        q qVar;
        IAlog.a("%s handle buffering timeout: video paused on last shown frame", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
        if (fVar2 != null && (qVar = fVar2.f56321a) != null) {
            qVar.k();
            this.f54501a.f56321a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f54501a;
        if (fVar3 != null && (fVar = fVar3.f56325e) != null && fVar.f54048c != null) {
            IAlog.a("%s pause", "OMVideo");
            try {
                fVar.f54048c.mUb();
            } catch (Throwable th) {
                fVar.a(th);
            }
        }
    }
}
