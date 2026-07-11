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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0014\u0010'\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0014\u0010-\u001a\u00020*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010\u001cR\u0014\u0010G\u001a\u00020D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u00108R\u0016\u0010O\u001a\u0004\u0018\u00010L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010\u001cR\u0014\u0010U\u001a\u00020R8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentTimeOffset;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "", "frameOffset", "<init>", "(Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;I)V", "", "trackId", "Lz/Z;", "textureForVideoTrack", "(J)Lz/Z;", "attr", "Lcom/alightcreative/app/motion/scene/SolidColor;", "default", "colorFromAttr", "(ILcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/SolidColor;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "getEnv", "()Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "I", "", "getTime", "()F", "time", "getPreviousFrameTime", "previousFrameTime", "getCurrentFrame", "()I", "currentFrame", "LHI0/Q;", "getContentResolver", "()LHI0/Q;", "contentResolver", "getEditMode", "editMode", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "getFramesPerHundredSeconds", "framesPerHundredSeconds", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lz/cA;", "getVideoTextureCache", "()Lz/cA;", "videoTextureCache", "LaO/Pl;", "getVideoThumbnails", "()LaO/Pl;", "videoThumbnails", "", "getOverrideVideoTextures", "()Ljava/util/Map;", "overrideVideoTextures", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "scene", "", "getTargetHasAlpha", "()Z", "targetHasAlpha", "getRootFPHS", "rootFPHS", "Lcom/alightcreative/app/motion/scene/UIColors;", "getUiColors", "()Lcom/alightcreative/app/motion/scene/UIColors;", "uiColors", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "getUserElementParamValues", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/ExportParams;", "getExportParams", "()Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "getOptiRate", "optiRate", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getActiveCamera", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "activeCamera", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "userPreviewMode", "", "getDurationInSeconds", "()D", "durationInSeconds", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RenderEnvironmentTimeOffset implements RenderEnvironment {
    public static final int $stable = 8;
    private final RenderEnvironment env;
    private final int frameOffset;

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SolidColor colorFromAttr(@AttrRes int attr, SolidColor solidColor) {
        Intrinsics.checkNotNullParameter(solidColor, "default");
        return this.env.colorFromAttr(attr, solidColor);
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SceneElement getActiveCamera() {
        return this.env.getActiveCamera();
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    /* JADX INFO: renamed from: getDurationInSeconds */
    public double getOverrideDurationInSeconds() {
        return this.env.getOverrideDurationInSeconds();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getEditMode() {
        return this.env.getEditMode();
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

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public UIColors getUiColors() {
        return this.env.getUiColors();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Map<String, UserParameterValue> getUserElementParamValues() {
        return this.env.getUserElementParamValues();
    }

    public RenderEnvironmentTimeOffset(RenderEnvironment env, int i2) {
        Intrinsics.checkNotNullParameter(env, "env");
        this.env = env;
        this.frameOffset = i2;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public HI0.Q getContentResolver() {
        return this.env.getContentResolver();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    /* JADX INFO: renamed from: getCurrentFrame */
    public int getOverrideFrame() {
        return this.env.getOverrideFrame() + this.frameOffset;
    }

    public final RenderEnvironment getEnv() {
        return this.env;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getPreviousFrameTime() {
        return this.env.getPreviousFrameTime() + ((this.env.getTime() - this.env.getPreviousFrameTime()) * this.frameOffset);
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getTime() {
        return this.env.getTime() + ((this.env.getTime() - this.env.getPreviousFrameTime()) * this.frameOffset);
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
