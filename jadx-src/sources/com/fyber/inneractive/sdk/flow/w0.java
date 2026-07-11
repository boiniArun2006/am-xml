package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w0 extends x implements NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f53959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f53960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f53961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f53962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f53963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f53964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f53965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaView f53966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f53967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Float f53968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f53969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.r f53970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t0 f53971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f53972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.j f53973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.a f53974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f53975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f53976x;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str) {
        com.fyber.inneractive.sdk.util.g gVar;
        if (str == null || str.trim().isEmpty()) {
            str = NativeAdContent.ViewTag.OTHER;
        }
        IAlog.c("%s : handleClick(): %s", "w0", str);
        if (this.f53973u != null) {
            switch (str) {
                case "CTA":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_CTA;
                    break;
                case "TITLE":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_TITLE;
                    break;
                case "DESCRIPTION":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_DESCRIPTION;
                    break;
                case "RATING":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_RATING;
                    break;
                case "MEDIA_VIEW":
                    if (!isVideoAd()) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_IMAGE;
                        break;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_VIDEO;
                        break;
                    }
                    break;
                case "ICON":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ICON;
                    break;
                case "ROOT":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ROOT;
                    break;
                case "OTHER":
                default:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    break;
            }
            com.fyber.inneractive.sdk.flow.nativead.i iVar = (com.fyber.inneractive.sdk.flow.nativead.i) this.f53972t.get(str);
            com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f53973u;
            if (iVar == null) {
                iVar = jVar.f53743a;
            }
            if (iVar == null) {
                jVar.getClass();
                IAlog.a("%s : No active link (no root and object related links), origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.f53742d, gVar);
            } else {
                com.fyber.inneractive.sdk.flow.nativead.p pVar = jVar.f53745c;
                pVar.getClass();
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar, iVar, false, gVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f53966n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.f53974v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        return (this.f53965m == null && this.f53966n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        t0 t0Var = this.f53971s;
        if (t0Var != null) {
            t0Var.destroy();
            this.f53971s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f53973u;
        if (jVar != null) {
            jVar.f53744b = null;
            jVar.f53745c.f53773a = null;
            this.f53973u = null;
        }
        if (this.f53974v != null) {
            this.f53974v = null;
        }
        for (View view : this.f53969q) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        for (View view2 : this.f53969q) {
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f53970r = null;
        this.f53969q.clear();
        this.f53963k = null;
        this.f53967o = null;
        this.f53964l = null;
        this.f53959g = null;
        this.f53965m = null;
        this.f53966n = null;
        this.f53960h = null;
        this.f53962j = null;
        this.f53961i = null;
        this.f53968p = null;
        this.f53972t.clear();
        this.f53975w.clear();
        this.f53976x.clear();
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f53961i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f53960h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f53959g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f53962j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f53964l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f53968p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f53966n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f53963k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f53967o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.f53971s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f53969q.clear();
        if (collection != null) {
            this.f53969q.addAll(collection);
        }
        if (viewGroup != null && !this.f53969q.contains(viewGroup)) {
            this.f53969q.add(viewGroup);
        }
        if (mediaView != null && !this.f53969q.contains(mediaView)) {
            this.f53969q.add(mediaView);
        }
        if (imageView != null && !this.f53969q.contains(imageView)) {
            this.f53969q.add(imageView);
        }
        MediaView mediaView2 = this.f53966n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f53970r = new com.fyber.inneractive.sdk.flow.nativead.r(this.f53966n.getContext(), this);
        for (View view : this.f53969q) {
            if (view != null) {
                view.setOnTouchListener(this.f53970r);
            }
        }
    }

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f53969q = new ArrayList();
        this.f53972t = new HashMap();
        this.f53975w = new ArrayList();
        this.f53976x = new ArrayList();
    }
}
