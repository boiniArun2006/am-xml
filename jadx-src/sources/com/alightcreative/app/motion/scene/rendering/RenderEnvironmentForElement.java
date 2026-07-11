package com.alightcreative.app.motion.scene.rendering;

import androidx.annotation.AttrRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.text.ttml.TtmlNode;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020)8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0014\u00107\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0014\u0010;\u001a\u0002088\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010.R\u0014\u0010U\u001a\u00020R8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010TR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010FR\u0016\u0010]\u001a\u0004\u0018\u00010Z8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010.R\u0014\u0010a\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010\u0017R\u0014\u0010e\u001a\u00020b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentForElement;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "<init>", "(Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneElement;)V", "", "trackId", "Lz/Z;", "textureForVideoTrack", "(J)Lz/Z;", "", "attr", "Lcom/alightcreative/app/motion/scene/SolidColor;", "default", "colorFromAttr", "(ILcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/SolidColor;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "getEnv", "()Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getEl", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "t", "I", "tPrev", "", TtmlNode.TAG_P, "F", "pPrev", "", "durationInSeconds", "D", "getDurationInSeconds", "()D", "time", "getTime", "()F", "previousFrameTime", "getPreviousFrameTime", "LHI0/Q;", "getContentResolver", "()LHI0/Q;", "contentResolver", "getEditMode", "()I", "editMode", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "getCurrentFrame", "currentFrame", "getFramesPerHundredSeconds", "framesPerHundredSeconds", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lz/cA;", "getVideoTextureCache", "()Lz/cA;", "videoTextureCache", "LaO/Pl;", "getVideoThumbnails", "()LaO/Pl;", "videoThumbnails", "", "getOverrideVideoTextures", "()Ljava/util/Map;", "overrideVideoTextures", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "scene", "", "getTargetHasAlpha", "()Z", "targetHasAlpha", "getRootFPHS", "rootFPHS", "Lcom/alightcreative/app/motion/scene/UIColors;", "getUiColors", "()Lcom/alightcreative/app/motion/scene/UIColors;", "uiColors", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "getUserElementParamValues", "userElementParamValues", "Lcom/alightcreative/app/motion/scene/ExportParams;", "getExportParams", "()Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "getOptiRate", "optiRate", "getActiveCamera", "activeCamera", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "userPreviewMode", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RenderEnvironmentForElement implements RenderEnvironment {
    public static final int $stable = 8;
    private final double durationInSeconds;
    private final SceneElement el;
    private final RenderEnvironment env;
    private final float p;
    private final float pPrev;
    private final float previousFrameTime;
    private final int t;
    private final int tPrev;
    private final float time;

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

    public RenderEnvironmentForElement(RenderEnvironment env, SceneElement el) {
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(el, "el");
        this.env = env;
        this.el = el;
        int currentFrame = (int) ((((long) env.getCurrentFrame()) * SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) / ((long) getFramesPerHundredSeconds()));
        this.t = currentFrame;
        int rootFPHS = currentFrame - (100000 / getRootFPHS());
        this.tPrev = rootFPHS;
        float startTime = (currentFrame - el.getStartTime()) / (el.getEndTime() - el.getStartTime());
        this.p = startTime;
        float startTime2 = (rootFPHS - el.getStartTime()) / (el.getEndTime() - el.getStartTime());
        this.pPrev = startTime2;
        this.durationInSeconds = ((double) (el.getEndTime() - el.getStartTime())) / 1000.0d;
        this.time = startTime;
        this.previousFrameTime = startTime2;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public HI0.Q getContentResolver() {
        return this.env.getContentResolver();
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public double getDurationInSeconds() {
        return this.durationInSeconds;
    }

    public final SceneElement getEl() {
        return this.el;
    }

    public final RenderEnvironment getEnv() {
        return this.env;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getPreviousFrameTime() {
        return this.previousFrameTime;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getTime() {
        return this.time;
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
