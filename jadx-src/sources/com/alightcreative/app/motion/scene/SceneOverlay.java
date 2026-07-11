package com.alightcreative.app.motion.scene;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\nJ?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneOverlay;", "", "", "sceneWidth", "sceneHeight", "", "exportMode", "newWatermarkDesign", "Lcom/alightcreative/app/motion/scene/Rectangle;", "getOverlayVisualBounds", "(IIZZ)Lcom/alightcreative/app/motion/scene/Rectangle;", "getOverlayTouchBounds", "LWzY/s4;", "ucanvas", "Landroid/content/Context;", "context", "", "renderOverlay", "(IIZLWzY/s4;Landroid/content/Context;Z)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SceneOverlay {
    Rectangle getOverlayTouchBounds(int sceneWidth, int sceneHeight, boolean exportMode, boolean newWatermarkDesign);

    Rectangle getOverlayVisualBounds(int sceneWidth, int sceneHeight, boolean exportMode, boolean newWatermarkDesign);

    void renderOverlay(int sceneWidth, int sceneHeight, boolean exportMode, WzY.s4 ucanvas, Context context, boolean newWatermarkDesign);
}
