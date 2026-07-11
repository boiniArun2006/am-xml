package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q implements com.fyber.inneractive.sdk.player.controller.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f56782a;

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z2) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
    }

    public q(r rVar) {
        this.f56782a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z2, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        this.f56782a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        this.f56782a.I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.ignite.m o() {
        return com.fyber.inneractive.sdk.ignite.m.NONE;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        r rVar = this.f56782a;
        VideoContentListener videoContentListener = rVar.f56785n;
        if (videoContentListener == null || (mVar = rVar.f56784m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f56429e) {
            return;
        }
        videoContentListener.onPlayerError();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i2, int i3) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        r rVar = this.f56782a;
        VideoContentListener videoContentListener = rVar.f56785n;
        if (videoContentListener == null || (mVar = rVar.f56784m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f56429e) {
            return;
        }
        videoContentListener.onProgress(i2, i3);
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
        this.f56782a.I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        r rVar = this.f56782a;
        rVar.getClass();
        IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(rVar));
        ViewGroup viewGroup = this.f56782a.f56787p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        r rVar2 = this.f56782a;
        if (!rVar2.f56792u) {
            com.fyber.inneractive.sdk.network.b0.a(rVar2.f56787p.getContext(), str, str2, this.f56782a.f53562b);
            r rVar3 = this.f56782a;
            rVar3.f56792u = true;
            IAlog.a("%s reporting auto redirect", IAlog.a(rVar3));
            return;
        }
        IAlog.a("%s redirect already reported for this ad", IAlog.a(rVar2));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f56782a.c(view), str);
            this.f56782a.c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        r rVar = this.f56782a;
        if (rVar.f56784m.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f57018a;
        } else {
            context = this.f56782a.f56784m.getContext();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f56782a.f53562b;
        return rVar.a(context, (xVar == null || (eVar = ((t0) xVar).f53978b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).f56877L) == null) ? null : bVar.f54104b, g1Var, gVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // com.fyber.inneractive.sdk.player.controller.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z2) {
        String str2;
        f0 f0Var;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (TextUtils.isEmpty(str) && (xVar = this.f56782a.f53562b) != null) {
            com.fyber.inneractive.sdk.response.e eVar = ((t0) xVar).f53978b;
            str = (eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).f56877L) == null) ? null : bVar.f54104b;
        }
        r rVar = this.f56782a;
        com.fyber.inneractive.sdk.ui.controller.b bVar2 = (com.fyber.inneractive.sdk.player.controller.b) rVar.f56750k;
        if (bVar2 == null && (f0Var = rVar.f56788q) != null) {
            bVar2 = f0Var.f56753a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar2 != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar2).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.f53605b.a() : null;
        if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            String str3 = ((com.fyber.inneractive.sdk.flow.endcard.c) bVarA).f53592g.f54125g;
            str2 = !TextUtils.isEmpty(str3) ? str3 : str;
        }
        r rVar2 = this.f56782a;
        return rVar2.a(rVar2.c((View) rVar2.f56787p), str2, g1Var, z2 ? com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.g.VAST_ENDCARD, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i2, boolean z2) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        r rVar = this.f56782a;
        VideoContentListener videoContentListener = rVar.f56785n;
        if (videoContentListener == null || (mVar = rVar.f56784m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).f56429e) {
            return;
        }
        videoContentListener.onCompleted();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        r rVar = this.f56782a;
        if (rVar.f53563c != null) {
            rVar.c(view);
            rVar.c(false);
        }
    }
}
