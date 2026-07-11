package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class l extends s {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final g1 f56441J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LayoutInflater f56442A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.g f56443B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f56444C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public v1 f56445D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public k f56446E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f56447F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f56448G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f56449H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f56450I;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f56451z;

    public abstract void a(int i2);

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        Integer num;
        this.f56449H = bVar2.f56409e;
        ViewGroup viewGroup = this.f56512s;
        if (viewGroup != null) {
            bVar.a(viewGroup, bVar2);
            this.f56512s.setVisibility(0);
            com.fyber.inneractive.sdk.model.vast.i iVar = bVar2.f56410f;
            com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Static;
            if (iVar2 == iVar) {
                a(getEndCardView(), 4);
            }
            if ((iVar2 == iVar || iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) && (num = bVar2.f56408d) != null) {
                b(iVar != iVar2 ? 8 : 4, num.intValue());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getTickFraction() {
        return 5;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
    }

    static {
        g1 g1Var = new g1();
        g1Var.f57000c = true;
        f56441J = g1Var;
    }

    public void b(int i2, int i3) {
        if (this.f56444C || this.f56445D != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i3));
        v1 v1Var = new v1(TimeUnit.SECONDS, i3);
        this.f56445D = v1Var;
        v1Var.f57050e = new j(this, i2);
        v1Var.f57049d = false;
        v1Var.f57048c.sendEmptyMessage(1932593528);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.f56449H;
    }

    public String getLocalizedCtaButtonText() {
        com.fyber.inneractive.sdk.config.global.r rVar = this.f56516w;
        com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
        if (dVar != null) {
            dVar.d(IAConfigManager.f53260M.f53289o);
            com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f53360e;
            if (aVar != null && aVar.f54101d) {
                return aVar.f54098a;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        if (this.f56445D != null) {
            IAlog.a("Autoclick paused", new Object[0]);
            v1 v1Var = this.f56445D;
            v1Var.f57049d = true;
            t1 t1Var = v1Var.f57048c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        if (this.f56445D != null) {
            IAlog.a("Autoclick resumed", new Object[0]);
            v1 v1Var = this.f56445D;
            v1Var.f57049d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.f56514u = this.f56451z.a(this.f56428d, this.f56508o, this.f56509p, this.f56513t, this.f56426b, this.f56506m);
    }

    public final void p() {
        if (this.f56445D != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.f56445D.f57050e = null;
            this.f56445D = null;
        }
    }

    public void setEndCardView(View view) {
        this.f56449H = view;
    }

    public l(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context, rVar, str);
        this.f56444C = false;
        this.f56450I = true;
        this.f56443B = gVar;
        this.f56442A = LayoutInflater.from(context);
        this.f56451z = aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        p();
        this.f56444C = true;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public void h(boolean z2) {
        boolean zBooleanValue;
        String string = getContext().getString(R.string.ia_video_app_info_text);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f56516w;
        if (rVar != null) {
            Boolean boolC = ((v) rVar.a(v.class)).c("show_ad_identifier_original_design");
            if (boolC != null) {
                zBooleanValue = boolC.booleanValue();
            } else {
                zBooleanValue = true;
            }
            this.f56450I = zBooleanValue;
            string = ((com.fyber.inneractive.sdk.config.global.features.o) this.f56516w.a(com.fyber.inneractive.sdk.config.global.features.o.class)).a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        }
        if (z2 && this.f56450I) {
            b(false);
            a(true, string);
            c(true);
        } else if (z2) {
            b(false);
            a(true, string);
            c(false);
        } else if (this.f56450I) {
            a(false, (String) null);
            b(false);
            c(true);
        } else {
            b(true);
            c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i2, int i3) {
        this.f56451z.a(this.f56428d, this.f56508o, this.f56509p, this.f56510q, h1Var, i2, i3, this.f56426b, ((r0) this.f56427c).f53420f.f53476f.intValue());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void a(int i2, int i3) {
        Runnable runnable = this.f56446E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f56446E = null;
        }
        this.f56448G = getMaxTickFactor() + i3;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i3;
        int i5 = this.f56448G;
        if (i5 <= 0 || i5 > i2) {
            return;
        }
        int i7 = this.f56447F;
        if (maxTickFactor < i7 && i7 > 0) {
            a(i5);
            return;
        }
        this.f56447F = maxTickFactor;
        a(maxTickFactor);
        k kVar = new k(this);
        this.f56446E = kVar;
        postDelayed(kVar, this.f56505l);
    }
}
