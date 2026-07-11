package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class y0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f57248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f57249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f57250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f57251d;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/y0;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.f63176p, view, motionEvent);
        return safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(view, motionEvent);
    }

    public boolean safedk_y0_onTouch_52c42711d0fa7ec04118db9e2b13f35d(View p0, MotionEvent p1) {
        if (this.f57248a != null) {
            if (p1.getActionMasked() == 0) {
                ((i) this.f57248a).i();
                this.f57249b = p1.getX();
                this.f57250c = p1.getY();
            } else if (p1.getActionMasked() == 3) {
                ((i) this.f57248a).i();
                this.f57250c = -1.0f;
                this.f57249b = -1.0f;
            } else if (p1.getActionMasked() == 1) {
                float f3 = this.f57249b;
                if (f3 >= 0.0f && this.f57250c >= 0.0f) {
                    float fRound = Math.round(Math.abs(f3 - p1.getX()));
                    float fRound2 = Math.round(Math.abs(this.f57250c - p1.getY()));
                    float f4 = this.f57251d;
                    if (fRound < f4 && fRound2 < f4) {
                        i iVar = (i) this.f57248a;
                        iVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (iVar.f57123l != null) {
                            IAlog.e("Native click detected in time. Processing pending click", new Object[0]);
                            iVar.f57123l.d();
                            d dVar = iVar.f57124m;
                            if (dVar != null) {
                                com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar);
                            }
                            iVar.f57123l = null;
                            iVar.i();
                        } else {
                            if (iVar.f57125n != null) {
                                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(iVar.f57125n, IAConfigManager.f53260M.f53294t.f53466b.a("click_timeout", 1000, 1000));
                            }
                            iVar.f57121j = true;
                        }
                    }
                    this.f57249b = -1.0f;
                    this.f57250c = -1.0f;
                }
            }
        }
        return false;
    }

    public y0(x0 x0Var, Context context) {
        this.f57248a = x0Var;
        this.f57251d = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
