package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class i extends s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p f56435A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t0 f56436B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f56437z;

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup viewGroup;
        p pVar;
        this.f56437z.a(dVar, bVar);
        if (!a(this.f56435A) || (viewGroup = this.f56511r) == null || viewGroup.getVisibility() != 0 || (pVar = this.f56435A) == null) {
            return;
        }
        pVar.destroy();
        this.f56435A = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean b() {
        p pVar = this.f56435A;
        return pVar != null && pVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z2) {
        if (a(this.f56435A)) {
            this.f56435A.g(z2);
        } else {
            this.f56437z.g(z2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Context context, a aVar, com.fyber.inneractive.sdk.player.n nVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        com.fyber.inneractive.sdk.flow.g gVar;
        boolean zA;
        p pVar;
        t0 t0Var;
        t0 t0Var2;
        com.fyber.inneractive.sdk.config.global.r rVar2 = rVar;
        super(context, rVar2, null);
        this.f56436B = null;
        this.f56436B = nVar != null ? nVar.f56322b : null;
        if (context == null || nVar == null || (t0Var2 = nVar.f56322b) == null) {
            gVar = null;
        } else {
            rVar2 = rVar;
            gVar = new com.fyber.inneractive.sdk.flow.g(context, false, t0Var2.f53977a, t0Var2.f53978b, rVar);
        }
        if (nVar == null || (t0Var = nVar.f56322b) == null) {
            zA = false;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = t0Var.f53978b;
            zA = com.fyber.inneractive.sdk.player.f.a(rVar2, eVar != null ? ((com.fyber.inneractive.sdk.response.g) eVar).f56843E : com.fyber.inneractive.sdk.ignite.m.NONE);
        }
        o oVar = new o(context, gVar, aVar, rVar2, zA, str);
        this.f56437z = oVar;
        if (nVar != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = nVar.f56383p;
            if (bVar == null || TextUtils.isEmpty(bVar.f54116n)) {
                IAlog.a("%s : dynamic controls are not available", "IAVideoViewComposition");
            } else {
                com.fyber.inneractive.sdk.player.ui.remote.g gVar2 = nVar.f56388u;
                if ((gVar2 != null ? gVar2.f56502a : null) != null) {
                    com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVar2 != null ? gVar2.f56502a : null;
                    if (dVar.f56480h) {
                        IAlog.a("%s : dynamic controls are already destroyed", "IAVideoViewComposition");
                    } else if (dVar.f56479g) {
                        IAlog.a("%s : dynamic controls load process timed out", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar3 = nVar.f56388u;
                        (gVar3 != null ? gVar3.f56502a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Template loading is timed out", true, null);
                    } else if (dVar.f56474b.f57196j) {
                        pVar = new p(getContext().getApplicationContext(), aVar, dVar, oVar);
                    } else {
                        IAlog.a("%s : dynamic controls are not ready, yet", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar4 = nVar.f56388u;
                        (gVar4 != null ? gVar4.f56502a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, "Template isn't loaded yet", true, null);
                    }
                }
            }
            this.f56435A = pVar;
            this.f56506m = oVar.f56506m;
            this.f56511r = oVar.f56511r;
            this.f56512s = oVar.f56512s;
            this.f56507n = oVar.f56507n;
            TextView textView = oVar.f56515v;
            this.f56515v = textView;
            a(textView, 10);
            a(this.f56507n, 8);
            a(this.f56506m, 7);
            a(this.f56511r, -1);
            if (b()) {
                p pVar2 = this.f56435A;
                IAsmoothProgressBar iAsmoothProgressBar = oVar.f56457P;
                f(iAsmoothProgressBar != null && iAsmoothProgressBar.getVisibility() == 0);
                ImageView imageView = oVar.f56455N;
                d(imageView != null && imageView.getVisibility() == 0);
                oVar.i();
                attachViewToParent(pVar2, 0, new RelativeLayout.LayoutParams(-1, -1));
                u uVar = u.VAST_EVENT_DVC_IMPRESSION;
                InneractiveAdRequest adRequest = getAdRequest();
                com.fyber.inneractive.sdk.response.e adResponse = getAdResponse();
                com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = pVar2.f56465M;
                String str2 = dVar2.f56478f;
                Boolean boolValueOf = Boolean.valueOf(dVar2.f56481i);
                w wVar = new w(uVar, adRequest, adResponse);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loaded_from_cache", boolValueOf);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
                }
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f54362f.put(jSONObject);
                wVar.a((String) null);
            }
            View view = this.f56437z;
            attachViewToParent(view, 0, view.getLayoutParams());
        }
        IAlog.a("%s : flow manager is missing, unexpected and dynamic controls status are unknown", "IAVideoViewComposition");
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR, getAdRequest(), getAdResponse(), "Missing flow manager", "", (Boolean) null);
        pVar = null;
        this.f56435A = pVar;
        this.f56506m = oVar.f56506m;
        this.f56511r = oVar.f56511r;
        this.f56512s = oVar.f56512s;
        this.f56507n = oVar.f56507n;
        TextView textView2 = oVar.f56515v;
        this.f56515v = textView2;
        a(textView2, 10);
        a(this.f56507n, 8);
        a(this.f56506m, 7);
        a(this.f56511r, -1);
        if (b()) {
        }
        View view2 = this.f56437z;
        attachViewToParent(view2, 0, view2.getLayoutParams());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z2) {
        this.f56437z.b(z2);
        if (a(this.f56435A)) {
            this.f56435A.b(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z2) {
        this.f56437z.c(z2);
        if (a(this.f56435A)) {
            this.f56435A.c(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z2) {
        this.f56437z.d(z2);
        if (a(this.f56435A)) {
            this.f56435A.d(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z2) {
        if (a(this.f56435A)) {
            this.f56435A.e(z2);
        } else {
            this.f56437z.e(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z2) {
        this.f56437z.f(z2);
        if (a(this.f56435A)) {
            this.f56435A.f(z2);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        t0 t0Var = this.f56436B;
        if (t0Var != null) {
            return t0Var.f53977a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        t0 t0Var = this.f56436B;
        if (t0Var != null) {
            return t0Var.f53978b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.f56437z.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return a(this.f56435A) ? this.f56435A.getTrackingFriendlyView() : this.f56437z.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.f56435A) ? this.f56435A.getTrackingFriendlyViewObstructionPurposeOther() : this.f56437z.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.f56437z.h();
        if (a(this.f56435A)) {
            this.f56435A.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        this.f56437z.i();
        if (a(this.f56435A)) {
            this.f56435A.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.f56437z.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.f56437z.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.f56435A) ? this.f56435A.f56465M.f56485m : this.f56437z.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.f56437z.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.f56437z.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f56437z.o();
        this.f56514u = this.f56437z.f56514u;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        this.f56437z.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z2) {
        this.f56437z.setMuteButtonState(z2);
        if (a(this.f56435A)) {
            this.f56435A.setMuteButtonState(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        this.f56437z.setRemainingTime(str);
        if (a(this.f56435A)) {
            this.f56435A.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        this.f56437z.setSkipText(str);
        if (a(this.f56435A)) {
            this.f56435A.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.f56437z.setListener(nVar);
        if (a(this.f56435A)) {
            this.f56435A.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.f56437z.setUnitConfig(s0Var);
        if (a(this.f56435A)) {
            this.f56435A.setUnitConfig(s0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        o oVar = this.f56437z;
        oVar.p();
        oVar.f56444C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (!a(this.f56435A)) {
            this.f56437z.a(z2, mVar);
        } else {
            this.f56435A.a(z2, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2, String str) {
        this.f56437z.a(z2, str);
        if (a(this.f56435A)) {
            this.f56435A.a(z2, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2, int i2, int i3) {
        this.f56508o = i2;
        this.f56509p = i3;
        this.f56510q = z2;
        o oVar = this.f56437z;
        oVar.f56508o = i2;
        oVar.f56509p = i3;
        oVar.f56510q = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        if (a(this.f56435A)) {
            return this.f56435A.f56465M.f56486n;
        }
        return this.f56437z.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        this.f56437z.a(bVar, bVar2);
        p pVar = this.f56435A;
        if (pVar != null) {
            pVar.destroy();
            this.f56435A = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z2) {
        if (a(this.f56435A)) {
            this.f56435A.a(z2);
        } else {
            this.f56437z.a(z2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i2, int i3) {
        this.f56437z.a(i2, i3);
        if (a(this.f56435A)) {
            this.f56435A.a(i2, i3);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i2, int i3) {
        this.f56437z.a(h1Var, i2, i3);
    }

    public static boolean a(p pVar) {
        return (pVar == null || pVar.f56465M.f56480h || !pVar.b()) ? false : true;
    }
}
