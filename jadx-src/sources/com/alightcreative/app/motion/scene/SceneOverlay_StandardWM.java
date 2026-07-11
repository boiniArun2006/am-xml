package com.alightcreative.app.motion.scene;

import WzY.s4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.Vector2D;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneOverlay_StandardWM;", "Lcom/alightcreative/app/motion/scene/SceneOverlay;", "<init>", "()V", "", "sceneWidth", "sceneHeight", "", "exportMode", "newWatermarkDesign", "Lcom/alightcreative/app/motion/scene/Rectangle;", "getOverlayVisualBounds", "(IIZZ)Lcom/alightcreative/app/motion/scene/Rectangle;", "getOverlayTouchBounds", "LWzY/s4;", "ucanvas", "Landroid/content/Context;", "context", "", "renderOverlay", "(IIZLWzY/s4;Landroid/content/Context;Z)V", "Landroid/graphics/Bitmap;", "watermarkBitmap", "Landroid/graphics/Bitmap;", "Lcom/alightcreative/app/motion/persist/j$Xo;", "wmPosition", "Lcom/alightcreative/app/motion/persist/j$Xo;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneOverlay_StandardWM implements SceneOverlay {
    private static Bitmap watermarkBitmap;
    public static final SceneOverlay_StandardWM INSTANCE = new SceneOverlay_StandardWM();
    private static j.Xo wmPosition = com.alightcreative.app.motion.persist.j.INSTANCE.getWmPosition();
    public static final int $stable = 8;

    @Override // com.alightcreative.app.motion.scene.SceneOverlay
    public Rectangle getOverlayVisualBounds(int sceneWidth, int sceneHeight, boolean exportMode, boolean newWatermarkDesign) {
        Integer numValueOf;
        Integer numValueOf2;
        Pair pair;
        Integer numValueOf3;
        Integer numValueOf4;
        boolean z2 = sceneWidth >= sceneHeight;
        int i2 = newWatermarkDesign ? Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE : 138;
        int i3 = newWatermarkDesign ? 672 : 806;
        int i5 = newWatermarkDesign ? 792 : 858;
        if (exportMode) {
            if (z2) {
                numValueOf3 = Integer.valueOf(i3);
                numValueOf4 = Integer.valueOf(i2);
            } else {
                numValueOf3 = Integer.valueOf(i2);
                numValueOf4 = Integer.valueOf(i3);
            }
            pair = TuplesKt.to(numValueOf3, numValueOf4);
        } else {
            if (z2) {
                numValueOf = Integer.valueOf(i5);
                numValueOf2 = Integer.valueOf(i2);
            } else {
                numValueOf = Integer.valueOf(i2);
                numValueOf2 = Integer.valueOf(i5);
            }
            pair = TuplesKt.to(numValueOf, numValueOf2);
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        float f3 = sceneWidth;
        float f4 = sceneHeight;
        double d2 = f3 / f4;
        int iMin = (0.95d > d2 || d2 > 1.05d) ? (0.74d > d2 || d2 > 1.44d) ? (0.54d > d2 || d2 > 1.88d) ? (0.3d > d2 || d2 > 3.33d) ? Math.min(sceneWidth, sceneHeight) / 3 : Math.min(sceneWidth, sceneHeight) / 5 : Math.min(sceneWidth, sceneHeight) / (newWatermarkDesign ? 8 : 11) : Math.min(sceneWidth, sceneHeight) / (newWatermarkDesign ? 10 : 11) : Math.min(sceneWidth, sceneHeight) / (newWatermarkDesign ? 11 : 12);
        int i7 = newWatermarkDesign ? iMin / 6 : iMin / 3;
        Pair pair2 = z2 ? TuplesKt.to(Integer.valueOf((iIntValue * iMin) / iIntValue2), Integer.valueOf(iMin)) : TuplesKt.to(Integer.valueOf(iMin), Integer.valueOf((iIntValue2 * iMin) / iIntValue));
        int iIntValue3 = ((Number) pair2.component1()).intValue();
        int iIntValue4 = ((Number) pair2.component2()).intValue();
        XoT.C.nr("Scene size: (" + sceneWidth + "," + sceneHeight + "), Scale Size: (" + iIntValue3 + ", " + iIntValue4 + "), inset: " + i7 + ", wmSize: " + iMin + ", landscapeOrSquare : " + z2);
        if (!z2) {
            float f5 = f4 / 2.0f;
            float f6 = iIntValue4 / 2.0f;
            return new Rectangle(i7, f5 - f6, i7 + iIntValue3, f5 + f6);
        }
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getWmPosition() == j.Xo.f45843n) {
            float f7 = f3 / 2.0f;
            float f8 = iIntValue3 / 2.0f;
            return new Rectangle(f7 - f8, i7, f7 + f8, i7 + iIntValue4);
        }
        float f9 = f3 / 2.0f;
        float f10 = iIntValue3 / 2.0f;
        return new Rectangle(f9 - f10, sceneHeight - (iIntValue4 + i7), f9 + f10, sceneHeight - i7);
    }

    @Override // com.alightcreative.app.motion.scene.SceneOverlay
    public void renderOverlay(int sceneWidth, int sceneHeight, boolean exportMode, WzY.s4 ucanvas, Context context, boolean newWatermarkDesign) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(ucanvas, "ucanvas");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z2 = sceneWidth >= sceneHeight;
        RectF rectF = GeometryKt.toRectF(getOverlayVisualBounds(sceneWidth, sceneHeight, exportMode, newWatermarkDesign));
        Vector2D.Companion companion = Vector2D.INSTANCE;
        float fCoerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(GeometryKt.getLength(GeometryKt.minus(GeometryKt.times(companion.getONE(), ucanvas.S()), GeometryKt.times(companion.getZERO(), ucanvas.S()))), 1.0f), 2.0f);
        int iWidth = (int) (rectF.width() * fCoerceAtMost);
        int iHeight = (int) (rectF.height() * fCoerceAtMost);
        j.Xo xo = wmPosition;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (xo != jVar.getWmPosition() || (bitmap = watermarkBitmap) == null || bitmap == null || bitmap.getWidth() != iWidth || (bitmap2 = watermarkBitmap) == null || bitmap2.getHeight() != iHeight) {
            Drawable drawable = ContextCompat.getDrawable(context, newWatermarkDesign ? exportMode ? z2 ? 2131232343 : 2131232351 : z2 ? 2131232344 : 2131232352 : exportMode ? z2 ? 2131232340 : 2131232349 : z2 ? jVar.getWmPosition() == j.Xo.f45843n ? 2131232342 : 2131232341 : 2131232350);
            Intrinsics.checkNotNull(drawable);
            wmPosition = jVar.getWmPosition();
            watermarkBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            Bitmap bitmap3 = watermarkBitmap;
            Intrinsics.checkNotNull(bitmap3);
            Canvas canvas = new Canvas(bitmap3);
            drawable.setBounds(new Rect(0, 0, iWidth, iHeight));
            drawable.draw(canvas);
        }
        Bitmap bitmap4 = watermarkBitmap;
        Intrinsics.checkNotNull(bitmap4);
        s4.j.rl(ucanvas, bitmap4, rectF, null, 0.0f, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
    }

    private SceneOverlay_StandardWM() {
    }

    @Override // com.alightcreative.app.motion.scene.SceneOverlay
    public Rectangle getOverlayTouchBounds(int sceneWidth, int sceneHeight, boolean exportMode, boolean newWatermarkDesign) {
        return getOverlayVisualBounds(sceneWidth, sceneHeight, exportMode, newWatermarkDesign);
    }
}
