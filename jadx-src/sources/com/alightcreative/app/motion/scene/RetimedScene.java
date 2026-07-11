package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/scene/RetimedScene;", "", "scene", "Lcom/alightcreative/app/motion/scene/Scene;", "frame", "", "shouldRender", "", "<init>", "(Lcom/alightcreative/app/motion/scene/Scene;IZ)V", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "getFrame", "()I", "getShouldRender", "()Z", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RetimedScene {
    public static final int $stable = 8;
    private final int frame;
    private final Scene scene;
    private final boolean shouldRender;

    public static /* synthetic */ RetimedScene copy$default(RetimedScene retimedScene, Scene scene, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            scene = retimedScene.scene;
        }
        if ((i3 & 2) != 0) {
            i2 = retimedScene.frame;
        }
        if ((i3 & 4) != 0) {
            z2 = retimedScene.shouldRender;
        }
        return retimedScene.copy(scene, i2, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Scene getScene() {
        return this.scene;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFrame() {
        return this.frame;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldRender() {
        return this.shouldRender;
    }

    public final RetimedScene copy(Scene scene, int frame, boolean shouldRender) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        return new RetimedScene(scene, frame, shouldRender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetimedScene)) {
            return false;
        }
        RetimedScene retimedScene = (RetimedScene) other;
        return Intrinsics.areEqual(this.scene, retimedScene.scene) && this.frame == retimedScene.frame && this.shouldRender == retimedScene.shouldRender;
    }

    public int hashCode() {
        return (((this.scene.hashCode() * 31) + Integer.hashCode(this.frame)) * 31) + Boolean.hashCode(this.shouldRender);
    }

    public String toString() {
        return "RetimedScene(scene=" + this.scene + ", frame=" + this.frame + ", shouldRender=" + this.shouldRender + ")";
    }

    public RetimedScene(Scene scene, int i2, boolean z2) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.scene = scene;
        this.frame = i2;
        this.shouldRender = z2;
    }

    public final int getFrame() {
        return this.frame;
    }

    public final Scene getScene() {
        return this.scene;
    }

    public final boolean getShouldRender() {
        return this.shouldRender;
    }
}
