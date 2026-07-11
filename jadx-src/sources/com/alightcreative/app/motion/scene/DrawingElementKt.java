package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009d\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/alightcreative/app/motion/scene/KeyableTransform;", "transform", "", "startTime", "endTime", "Lcom/alightcreative/app/motion/scene/Keyable;", "Lcom/alightcreative/app/motion/scene/SolidColor;", "fillColor", "Landroid/net/Uri;", "fillImage", "fillVideo", "", "id", "", "label", "inTime", "outTime", "Lcom/alightcreative/app/motion/scene/FillType;", "fillType", "", "loop", "Lcom/alightcreative/app/motion/scene/BlendingMode;", "blendingMode", "Lcom/alightcreative/app/motion/scene/Drawing;", "drawing", "Lcom/alightcreative/app/motion/scene/SceneElement;", "DrawingElement", "(Lcom/alightcreative/app/motion/scene/KeyableTransform;IILcom/alightcreative/app/motion/scene/Keyable;Landroid/net/Uri;Landroid/net/Uri;JLjava/lang/String;IILcom/alightcreative/app/motion/scene/FillType;ZLcom/alightcreative/app/motion/scene/BlendingMode;Lcom/alightcreative/app/motion/scene/Drawing;)Lcom/alightcreative/app/motion/scene/SceneElement;", "LWzY/yg;", "paint", "LWzY/yg;", "LWzY/z;", "scratchPath", "LWzY/z;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DrawingElementKt {
    private static final WzY.yg paint = new WzY.yg();
    private static final C1487z scratchPath = new C1487z();

    public static final SceneElement DrawingElement(KeyableTransform transform, int i2, int i3, Keyable<SolidColor> fillColor, Uri uri, Uri uri2, long j2, String label, int i5, int i7, FillType fillType, boolean z2, BlendingMode blendingMode, Drawing drawing) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(fillColor, "fillColor");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        Intrinsics.checkNotNullParameter(drawing, "drawing");
        return new SceneElement(SceneElementType.Drawing, i2, i3, j2, new EngineState(nCS.j.f71005n.n()), label, transform, fillColor, uri, uri2, null, fillType, null, null, null, null, null, i5, i7, z2, null, null, blendingMode, SceneKt.getEMPTY_SCENE(), null, null, null, null, drawing, null, null, null, null, false, null, null, false, null, null, -298716160, 127, null);
    }
}
