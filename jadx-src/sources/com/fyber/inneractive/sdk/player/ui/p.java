package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p extends l {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f56463K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.f f56464L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.remote.d f56465M;

    public p(Context context, a aVar, com.fyber.inneractive.sdk.player.ui.remote.d dVar, o oVar) {
        super(context, null, aVar, null, null);
        this.f56463K = 0;
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = new com.fyber.inneractive.sdk.player.ui.remote.f(oVar);
        this.f56464L = fVar;
        this.f56465M = dVar;
        dVar.f56473a = fVar;
        attachViewToParent(dVar.f56474b, getChildCount() - 1, new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        super.a(dVar, bVar);
        ViewGroup viewGroup = this.f56511r;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        this.f56465M.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean b() {
        return this.f56465M.f56474b.f57196j;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getTickFractions() {
        return 15;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[0];
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56497h = z2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56498i = z2;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        String str = z2 ? "FyberRemoteUiBridge.showMuteButton()" : "FyberRemoteUiBridge.hideMuteButton()";
        dVar.f56476d.a(str, str, dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.m
    public final void destroy() {
        IAlog.a("%s: destroy() : destroying remote UI", "IAVideoViewRemote");
        removeView(this.f56465M.f56474b);
        this.f56465M.a();
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56490a = null;
            this.f56464L = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56492c = z2;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.showPlayOverlay(%s)", "FyberRemoteUiBridge.showPlayOverlay(" + z2 + ")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56495f = z2;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.showProgressBar(%s)", "FyberRemoteUiBridge.showProgressBar(" + z2 + ")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56491b = z2;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.showSkipLayout(%s)", "FyberRemoteUiBridge.showSkipLayout(" + z2 + ")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.f56465M.f56474b};
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.f56476d.a("FyberRemoteUiBridge.enableSkip()", "FyberRemoteUiBridge.enableSkip()", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.f56476d.a("FyberRemoteUiBridge.hideOverlays()", "FyberRemoteUiBridge.hideOverlays()", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return this.f56465M.f56485m;
    }

    public void setIsSkipEnabled(boolean z2) {
        this.f56465M.f56486n = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        String str = z2 ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
        com.fyber.inneractive.sdk.player.ui.remote.e eVar = dVar.f56476d;
        eVar.f56489c = z2;
        com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = eVar.f56487a;
        if (dVar2 != null) {
            dVar2.f56474b.a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.setRemainingTime(\"%s\")", "FyberRemoteUiBridge.setRemainingTime(\"" + str + "\")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.setSkipText(\"%s\")", "FyberRemoteUiBridge.setSkipText(\"" + str + "\")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.f56465M.f56477e = nVar;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2, com.fyber.inneractive.sdk.ignite.m mVar) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56494e = z2;
            fVar.f56500k = mVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56496g = z2;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.showCountdownText(%s)", "FyberRemoteUiBridge.showCountdownText(" + z2 + ")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2, String str) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56499j = z2;
            fVar.f56501l = str;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2) {
        com.fyber.inneractive.sdk.player.ui.remote.f fVar = this.f56464L;
        if (fVar != null) {
            fVar.f56493d = z2;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.showBufferingOverlay(%s)", "FyberRemoteUiBridge.showBufferingOverlay(" + z2 + ")", dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l, com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i2, int i3) {
        this.f56463K = i2;
        super.a(i2, i3);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.l
    public final void a(int i2) {
        int i3 = this.f56463K;
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f56465M;
        dVar.getClass();
        dVar.f56476d.a("FyberRemoteUiBridge.updateProgressBar(%d, %.2f)", String.format(Locale.US, "FyberRemoteUiBridge.updateProgressBar(%d, %.2f)", Integer.valueOf(i3), Float.valueOf((i2 / i3) * 100.0f)), dVar.f56474b.f57196j);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        return this.f56465M.f56486n;
    }
}
