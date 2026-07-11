package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f48555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f48556c;

    public f8(View view, C1802k c1802k) {
        this.f48554a = c1802k;
        this.f48555b = c1802k.O();
        this.f48556c = view;
    }

    public long a(h3 h3Var) {
        long j2;
        if (C1804o.a()) {
            this.f48555b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = o0.b(this.f48556c.getContext());
        if (!this.f48556c.isShown()) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "View is hidden");
            }
            j2 = 2;
        } else {
            j2 = 0;
        }
        if (this.f48556c.getAlpha() < h3Var.j0()) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "View is transparent");
            }
            j2 |= 4;
        }
        Animation animation = this.f48556c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "View is animating");
            }
            j2 |= 8;
        }
        if (this.f48556c.getParent() == null) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "No parent view found");
            }
            j2 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f48556c.getContext(), this.f48556c.getWidth());
        if (iPxToDp < Math.min(h3Var.p0(), pointB.x)) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j2 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f48556c.getContext(), this.f48556c.getHeight());
        if (iPxToDp2 < h3Var.l0()) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j2 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f48556c.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        Rect rect2 = new Rect(i2, iArr[1], this.f48556c.getWidth() + i2, iArr[1] + this.f48556c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j2 |= 128;
        }
        Activity activityB = this.f48554a.e().b();
        if (activityB != null && !e8.a(this.f48556c, activityB)) {
            if (C1804o.a()) {
                this.f48555b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j2 |= 256;
        }
        if (C1804o.a()) {
            this.f48555b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j2));
        }
        return j2;
    }
}
