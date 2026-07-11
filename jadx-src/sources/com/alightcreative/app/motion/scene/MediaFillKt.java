package com.alightcreative.app.motion.scene;

import WzY.s4;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElement;", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "LWzY/Sis;", JavetError.PARAMETER_PATH, "Landroid/graphics/RectF;", "layerBounds", "", "renderMediaFill", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;LWzY/Sis;Landroid/graphics/RectF;)V", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaFillKt {
    public static final void renderMediaFill(final SceneElement sceneElement, WzY.s4 canvas, RenderEnvironment env, WzY.Sis path, RectF layerBounds) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(layerBounds, "layerBounds");
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.Ln
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaFillKt.renderMediaFill$lambda$0(sceneElement);
            }
        });
        Transform transformValueAtTime = sceneElement.getTransform().valueAtTime(env);
        if (sceneElement.getFillImage() != null) {
            Bitmap bitmapLoadImageFromUri$default = ImageCacheKt.loadImageFromUri$default(env.getContentResolver(), sceneElement.getFillImage(), false, 4, null);
            if (bitmapLoadImageFromUri$default != null) {
                canvas.J2(path);
                s4.j.rl(canvas, bitmapLoadImageFromUri$default, layerBounds, transformValueAtTime.getMatrix(), transformValueAtTime.getOpacity(), null, null, sceneElement.getMediaFillMode(), 48, null);
                canvas.r();
                return;
            }
            return;
        }
        if (sceneElement.getFillVideo() != null) {
            final z.Z zTextureForVideoTrack = env.textureForVideoTrack(sceneElement.getEngineState().getTrackId());
            XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.lej
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaFillKt.renderMediaFill$lambda$1(sceneElement, zTextureForVideoTrack);
                }
            });
            if (zTextureForVideoTrack != null) {
                canvas.J2(path);
                canvas.WPU(zTextureForVideoTrack, layerBounds, transformValueAtTime.getMatrix(), transformValueAtTime.getOpacity(), sceneElement.getMediaFillMode());
                canvas.r();
            } else {
                Bitmap bitmapAYN = aO.Pl.aYN(env.getVideoThumbnails(), sceneElement.getFillVideo(), 0, false, false, false, 28, null);
                if (bitmapAYN != null) {
                    canvas.J2(path);
                    s4.j.rl(canvas, bitmapAYN, layerBounds, transformValueAtTime.getMatrix(), transformValueAtTime.getOpacity(), null, null, sceneElement.getMediaFillMode(), 48, null);
                    canvas.r();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderMediaFill$lambda$0(SceneElement sceneElement) {
        return "renderMediaFill: " + sceneElement.getType() + " " + sceneElement.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderMediaFill$lambda$1(SceneElement sceneElement, z.Z z2) {
        return "fillVideo: uri=" + sceneElement.getFillVideo() + " tex=" + z2 + " id=" + sceneElement.getId();
    }
}
