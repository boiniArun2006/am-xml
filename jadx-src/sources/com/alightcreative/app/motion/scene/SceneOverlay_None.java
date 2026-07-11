package com.alightcreative.app.motion.scene;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneOverlay_None;", "Lcom/alightcreative/app/motion/scene/SceneOverlay;", "<init>", "()V", "", "sceneWidth", "sceneHeight", "", "exportMode", "newWatermarkDesign", "Lcom/alightcreative/app/motion/scene/Rectangle;", "getOverlayVisualBounds", "(IIZZ)Lcom/alightcreative/app/motion/scene/Rectangle;", "getOverlayTouchBounds", "LWzY/s4;", "ucanvas", "Landroid/content/Context;", "context", "", "renderOverlay", "(IIZLWzY/s4;Landroid/content/Context;Z)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneOverlay_None implements SceneOverlay {
    public static final int $stable = 0;
    public static final SceneOverlay_None INSTANCE = new SceneOverlay_None();

    @Override // com.alightcreative.app.motion.scene.SceneOverlay
    public void renderOverlay(int sceneWidth, int sceneHeight, boolean exportMode, WzY.s4 ucanvas, Context context, boolean newWatermarkDesign) {
        Intrinsics.checkNotNullParameter(ucanvas, "ucanvas");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.alightcreative.app.motion.scene.SceneOverlay
    public Rectangle getOverlayTouchBounds(int sceneWidth, int sceneHeight, boolean exportMode, boolean newWatermarkDesign) {
        return Rectangle.INSTANCE.getEMPTY();
    }

    @Override // com.alightcreative.app.motion.scene.SceneOverlay
    public Rectangle getOverlayVisualBounds(int sceneWidth, int sceneHeight, boolean exportMode, boolean newWatermarkDesign) {
        return Rectangle.INSTANCE.getEMPTY();
    }

    private SceneOverlay_None() {
    }
}
