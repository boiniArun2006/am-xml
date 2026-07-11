package com.alightcreative.app.motion.scene.rendering;

import androidx.annotation.AttrRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SpoidEnv;
import com.alightcreative.app.motion.scene.UIColors;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yc.nKE;
import z.Z;
import z.cA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0014\u0010&\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010\u0016R\u0014\u0010@\u001a\u00020=8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R \u0010D\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B0/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u00101R\u0016\u0010H\u001a\u0004\u0018\u00010E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010\u0016R\u0014\u0010N\u001a\u00020K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0014\u0010\\\u001a\u00020Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentAltMode;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "", "editMode", "<init>", "(Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;I)V", "", "trackId", "Lz/Z;", "textureForVideoTrack", "(J)Lz/Z;", "attr", "Lcom/alightcreative/app/motion/scene/SolidColor;", "default", "colorFromAttr", "(ILcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/SolidColor;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "getEnv", "()Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "I", "getEditMode", "()I", "LHI0/Q;", "getContentResolver", "()LHI0/Q;", "contentResolver", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "getCurrentFrame", "currentFrame", "getFramesPerHundredSeconds", "framesPerHundredSeconds", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lz/cA;", "getVideoTextureCache", "()Lz/cA;", "videoTextureCache", "LaO/Pl;", "getVideoThumbnails", "()LaO/Pl;", "videoThumbnails", "", "getOverrideVideoTextures", "()Ljava/util/Map;", "overrideVideoTextures", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "scene", "", "getTargetHasAlpha", "()Z", "targetHasAlpha", "getRootFPHS", "rootFPHS", "Lcom/alightcreative/app/motion/scene/UIColors;", "getUiColors", "()Lcom/alightcreative/app/motion/scene/UIColors;", "uiColors", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "getUserElementParamValues", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/ExportParams;", "getExportParams", "()Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "getOptiRate", "optiRate", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getActiveCamera", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "activeCamera", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "userPreviewMode", "", "getPreviousFrameTime", "()F", "previousFrameTime", "getTime", "time", "", "getDurationInSeconds", "()D", "durationInSeconds", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RenderEnvironmentAltMode implements RenderEnvironment {
    public static final int $stable = 8;
    private final int editMode;
    private final RenderEnvironment env;

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SolidColor colorFromAttr(@AttrRes int attr, SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "default");
        return this.env.colorFromAttr(attr, solidColor);
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SceneElement getActiveCamera() {
        return this.env.getActiveCamera();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getCurrentFrame() {
        return this.env.getCurrentFrame();
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public double getDurationInSeconds() {
        return this.env.getDurationInSeconds();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public ExportParams getExportParams() {
        return this.env.getExportParams();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getFramesPerHundredSeconds() {
        return this.env.getFramesPerHundredSeconds();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getOptiRate() {
        return this.env.getOptiRate();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Map<Long, Z> getOverrideVideoTextures() {
        return this.env.getOverrideVideoTextures();
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getPreviousFrameTime() {
        return this.env.getPreviousFrameTime();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public RenderMode getRenderMode() {
        return this.env.getRenderMode();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getRootFPHS() {
        return this.env.getRootFPHS();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Scene getScene() {
        return this.env.getScene();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SpoidEnv getSpoidEnv() {
        return this.env.getSpoidEnv();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public boolean getTargetHasAlpha() {
        return this.env.getTargetHasAlpha();
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getTime() {
        return this.env.getTime();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public UIColors getUiColors() {
        return this.env.getUiColors();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Map<String, UserParameterValue> getUserElementParamValues() {
        return this.env.getUserElementParamValues();
    }

    public RenderEnvironmentAltMode(RenderEnvironment env, int i2) {
        Intrinsics.checkNotNullParameter(env, "env");
        this.env = env;
        this.editMode = i2;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public HI0.Q getContentResolver() {
        return this.env.getContentResolver();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getEditMode() {
        return this.editMode;
    }

    public final RenderEnvironment getEnv() {
        return this.env;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public nKE getUserPreviewMode() {
        return this.env.getUserPreviewMode();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public cA getVideoTextureCache() {
        return this.env.getVideoTextureCache();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public aO.Pl getVideoThumbnails() {
        return this.env.getVideoThumbnails();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Z textureForVideoTrack(long trackId) {
        return this.env.textureForVideoTrack(trackId);
    }
}
