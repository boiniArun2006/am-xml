package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f56740b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f56747i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f56741c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56742d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f56743e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56744f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56745g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56746h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f56748j = new b(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.j f56739a = new com.fyber.inneractive.sdk.util.j(4, new c());

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z2;
        String str;
        IAlog.a("IAVisibilityTracker: onCheckVisibility", new Object[0]);
        float f3 = this.f56742d / 100.0f;
        com.fyber.inneractive.sdk.util.j jVar = this.f56739a;
        Object objPoll = jVar.f57004a.poll();
        if (objPoll == null) {
            objPoll = jVar.f57005b.a();
        }
        Rect rect = (Rect) objPoll;
        RelativeLayout relativeLayout = this.f56740b;
        float fWidth = (relativeLayout.getParent() != null && relativeLayout.isShown() && relativeLayout.hasWindowFocus() && relativeLayout.getGlobalVisibleRect(rect)) ? (rect.width() * rect.height()) / (relativeLayout.getWidth() * relativeLayout.getHeight()) : 0.0f;
        this.f56739a.f57004a.offer(rect);
        this.f56741c = fWidth;
        if (fWidth >= f3) {
            float f4 = this.f56743e * 1000.0f;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.f56744f;
            z2 = f4 < ((float) (jCurrentTimeMillis - j2)) && j2 != 0;
        }
        IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", Boolean.valueOf(z2), Float.valueOf(f3));
        if (!z2 || !this.f56745g) {
            if (this.f56745g) {
                float f5 = this.f56741c;
                if (f5 < f3) {
                    this.f56744f = 0L;
                } else if (f5 >= f3 && this.f56744f == 0) {
                    this.f56744f = System.currentTimeMillis();
                }
                Handler handler = com.fyber.inneractive.sdk.util.r.f57026b;
                handler.removeCallbacks(this.f56748j);
                handler.postDelayed(this.f56748j, 50L);
                return;
            }
            return;
        }
        if (this.f56747i == null || this.f56746h) {
            return;
        }
        this.f56746h = true;
        IAlog.a("BannerVisibilityTracker | firing viewable", new Object[0]);
        n nVar = this.f56747i.f56756a;
        nVar.getClass();
        try {
            com.fyber.inneractive.sdk.flow.x xVar = nVar.f53562b;
            if (xVar == null || ((q0) xVar).f53978b == null || (str = ((com.fyber.inneractive.sdk.response.f) ((q0) xVar).f53978b).f56869u) == null || str.trim().length() <= 0) {
                return;
            }
            IAlog.e("%sfiring banner mrc visibility impression!", IAlog.a(nVar));
            IAlog.d("MRC_VISIBILITY_IMPRESSION", new Object[0]);
            z0.b(str);
        } catch (Exception unused) {
        }
    }

    public d(com.fyber.inneractive.sdk.response.f fVar, RelativeLayout relativeLayout, g gVar) {
        this.f56740b = relativeLayout;
        this.f56747i = gVar;
    }
}
