package com.alightcreative.app.motion.scene.rendering;

import androidx.annotation.AttrRes;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SpoidEnv;
import com.alightcreative.app.motion.scene.UIColors;
import com.alightcreative.app.motion.scene.animators.AnimatorEnvironment;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import java.util.Map;
import kotlin.Metadata;
import yc.nKE;
import z.Z;
import z.cA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0012R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010*R\u0016\u0010A\u001a\u0004\u0018\u00010>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0012R\u0014\u0010G\u001a\u00020D8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "", "trackId", "Lz/Z;", "textureForVideoTrack", "(J)Lz/Z;", "", "attr", "Lcom/alightcreative/app/motion/scene/SolidColor;", "default", "colorFromAttr", "(ILcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/SolidColor;", "LHI0/Q;", "getContentResolver", "()LHI0/Q;", "contentResolver", "getEditMode", "()I", "editMode", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "getCurrentFrame", "currentFrame", "getFramesPerHundredSeconds", "framesPerHundredSeconds", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lz/cA;", "getVideoTextureCache", "()Lz/cA;", "videoTextureCache", "LaO/Pl;", "getVideoThumbnails", "()LaO/Pl;", "videoThumbnails", "", "getOverrideVideoTextures", "()Ljava/util/Map;", "overrideVideoTextures", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "scene", "", "getTargetHasAlpha", "()Z", "targetHasAlpha", "getRootFPHS", "rootFPHS", "Lcom/alightcreative/app/motion/scene/UIColors;", "getUiColors", "()Lcom/alightcreative/app/motion/scene/UIColors;", "uiColors", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "getUserElementParamValues", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/ExportParams;", "getExportParams", "()Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "getOptiRate", "optiRate", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getActiveCamera", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "activeCamera", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "userPreviewMode", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RenderEnvironment extends AnimatorEnvironment {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SolidColor colorFromAttr$default(RenderEnvironment renderEnvironment, int i2, SolidColor solidColor, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: colorFromAttr");
            }
            if ((i3 & 2) != 0) {
                solidColor = SolidColor.INSTANCE.getWHITE();
            }
            return renderEnvironment.colorFromAttr(i2, solidColor);
        }
    }

    SolidColor colorFromAttr(@AttrRes int attr, SolidColor solidColor);

    SceneElement getActiveCamera();

    HI0.Q getContentResolver();

    int getCurrentFrame();

    int getEditMode();

    ExportParams getExportParams();

    int getFramesPerHundredSeconds();

    int getOptiRate();

    Map<Long, Z> getOverrideVideoTextures();

    RenderMode getRenderMode();

    int getRootFPHS();

    Scene getScene();

    SpoidEnv getSpoidEnv();

    boolean getTargetHasAlpha();

    UIColors getUiColors();

    Map<String, UserParameterValue> getUserElementParamValues();

    nKE getUserPreviewMode();

    cA getVideoTextureCache();

    aO.Pl getVideoThumbnails();

    Z textureForVideoTrack(long trackId);
}
