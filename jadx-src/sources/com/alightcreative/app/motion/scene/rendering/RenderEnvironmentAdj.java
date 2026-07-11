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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yc.nKE;
import z.Z;
import z.cA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0014\u0010&\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0014\u0010(\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0014\u0010.\u001a\u00020+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0014\u00104\u001a\u0002018\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010\"R\u0014\u0010:\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010\"R\u0014\u0010T\u001a\u00020Q8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010SR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010ER\u0016\u0010\\\u001a\u0004\u0018\u00010Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010\"R\u0014\u0010b\u001a\u00020_8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentAdj;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "", "overrideTime", "overridePreviousFrameTime", "", "overrideDurationInSeconds", "", "overrideFrame", "<init>", "(Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;FFDI)V", "", "trackId", "Lz/Z;", "textureForVideoTrack", "(J)Lz/Z;", "attr", "Lcom/alightcreative/app/motion/scene/SolidColor;", "default", "colorFromAttr", "(ILcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/SolidColor;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "getEnv", "()Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "F", "getOverrideTime", "()F", "getOverridePreviousFrameTime", "D", "getOverrideDurationInSeconds", "()D", "I", "getOverrideFrame", "()I", "getTime", "time", "getPreviousFrameTime", "previousFrameTime", "getDurationInSeconds", "durationInSeconds", "getCurrentFrame", "currentFrame", "LHI0/Q;", "getContentResolver", "()LHI0/Q;", "contentResolver", "getEditMode", "editMode", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "getFramesPerHundredSeconds", "framesPerHundredSeconds", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lz/cA;", "getVideoTextureCache", "()Lz/cA;", "videoTextureCache", "LaO/Pl;", "getVideoThumbnails", "()LaO/Pl;", "videoThumbnails", "", "getOverrideVideoTextures", "()Ljava/util/Map;", "overrideVideoTextures", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "scene", "", "getTargetHasAlpha", "()Z", "targetHasAlpha", "getRootFPHS", "rootFPHS", "Lcom/alightcreative/app/motion/scene/UIColors;", "getUiColors", "()Lcom/alightcreative/app/motion/scene/UIColors;", "uiColors", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "getUserElementParamValues", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/ExportParams;", "getExportParams", "()Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "getOptiRate", "optiRate", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getActiveCamera", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "activeCamera", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "userPreviewMode", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RenderEnvironmentAdj implements RenderEnvironment {
    public static final int $stable = 8;
    private final RenderEnvironment env;
    private final double overrideDurationInSeconds;
    private final int overrideFrame;
    private final float overridePreviousFrameTime;
    private final float overrideTime;

    public RenderEnvironmentAdj(RenderEnvironment env, float f3, float f4, double d2, int i2) {
        Intrinsics.checkNotNullParameter(env, "env");
        this.env = env;
        this.overrideTime = f3;
        this.overridePreviousFrameTime = f4;
        this.overrideDurationInSeconds = d2;
        this.overrideFrame = i2;
    }

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

    public /* synthetic */ RenderEnvironmentAdj(RenderEnvironment renderEnvironment, float f3, float f4, double d2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEnvironment, f3, f4, d2, (i3 & 16) != 0 ? renderEnvironment.getOverrideFrame() : i2);
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public HI0.Q getContentResolver() {
        return this.env.getContentResolver();
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    /* JADX INFO: renamed from: getCurrentFrame, reason: from getter */
    public int getOverrideFrame() {
        return this.overrideFrame;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    /* JADX INFO: renamed from: getDurationInSeconds, reason: from getter */
    public double getOverrideDurationInSeconds() {
        return this.overrideDurationInSeconds;
    }

    public final RenderEnvironment getEnv() {
        return this.env;
    }

    public final double getOverrideDurationInSeconds() {
        return this.overrideDurationInSeconds;
    }

    public final int getOverrideFrame() {
        return this.overrideFrame;
    }

    public final float getOverridePreviousFrameTime() {
        return this.overridePreviousFrameTime;
    }

    public final float getOverrideTime() {
        return this.overrideTime;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getPreviousFrameTime() {
        return this.overridePreviousFrameTime;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getTime() {
        return this.overrideTime;
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
