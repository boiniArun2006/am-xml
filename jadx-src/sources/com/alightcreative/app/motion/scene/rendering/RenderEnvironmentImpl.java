package com.alightcreative.app.motion.scene.rendering;

import HI0.qf;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SpoidEnv;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.UIColors;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yc.nKE;
import z.Z;
import z.cA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0003R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR.\u0010D\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010!\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R\"\u0010G\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010U\u001a\u00020T8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010c\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010p\u001a\u00020i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010k\u001a\u0004\bq\u0010m\"\u0004\br\u0010oR\"\u0010s\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010H\u001a\u0004\bt\u0010J\"\u0004\bu\u0010LR\"\u0010v\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010H\u001a\u0004\bw\u0010J\"\u0004\bx\u0010LR\"\u0010z\u001a\u00020y8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R/\u0010\u0088\u0001\u001a\u00020\u00042\u0007\u0010\u0087\u0001\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010H\u001a\u0005\b\u0089\u0001\u0010J\"\u0005\b\u008a\u0001\u0010LR*\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R&\u0010\u0092\u0001\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010H\u001a\u0005\b\u0093\u0001\u0010J\"\u0005\b\u0094\u0001\u0010LR\u0016\u0010\u0096\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u0015R\u0018\u0010\u0098\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0084\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironmentImpl;", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "<init>", "()V", "", "attr", "Lcom/alightcreative/app/motion/scene/SolidColor;", "default", "colorFromAttr", "(ILcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/SolidColor;", "", "trackId", "Lz/Z;", "textureForVideoTrack", "(J)Lz/Z;", "", "reset", "LaO/Pl;", "_videoThumbnails", "LaO/Pl;", "get_videoThumbnails", "()LaO/Pl;", "set_videoThumbnails", "(LaO/Pl;)V", "Lz/cA;", "videoTextureCache", "Lz/cA;", "getVideoTextureCache", "()Lz/cA;", "setVideoTextureCache", "(Lz/cA;)V", "", "overrideVideoTextures", "Ljava/util/Map;", "getOverrideVideoTextures", "()Ljava/util/Map;", "setOverrideVideoTextures", "(Ljava/util/Map;)V", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "Lcom/alightcreative/app/motion/scene/Scene;", "getScene", "()Lcom/alightcreative/app/motion/scene/Scene;", "setScene", "(Lcom/alightcreative/app/motion/scene/Scene;)V", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "renderMode", "Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "getRenderMode", "()Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "setRenderMode", "(Lcom/alightcreative/app/motion/scene/rendering/RenderMode;)V", "", "targetHasAlpha", "Z", "getTargetHasAlpha", "()Z", "setTargetHasAlpha", "(Z)V", "Lcom/alightcreative/app/motion/scene/UIColors;", "uiColors", "Lcom/alightcreative/app/motion/scene/UIColors;", "getUiColors", "()Lcom/alightcreative/app/motion/scene/UIColors;", "setUiColors", "(Lcom/alightcreative/app/motion/scene/UIColors;)V", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameterValue;", "userElementParamValues", "getUserElementParamValues", "setUserElementParamValues", "rootFPHS", "I", "getRootFPHS", "()I", "setRootFPHS", "(I)V", "Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParams", "Lcom/alightcreative/app/motion/scene/ExportParams;", "getExportParams", "()Lcom/alightcreative/app/motion/scene/ExportParams;", "setExportParams", "(Lcom/alightcreative/app/motion/scene/ExportParams;)V", "Lyc/nKE;", "userPreviewMode", "Lyc/nKE;", "getUserPreviewMode", "()Lyc/nKE;", "setUserPreviewMode", "(Lyc/nKE;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "activeCamera", "Lcom/alightcreative/app/motion/scene/SceneElement;", "getActiveCamera", "()Lcom/alightcreative/app/motion/scene/SceneElement;", "setActiveCamera", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "time", "F", "getTime", "()F", "setTime", "(F)V", "previousFrameTime", "getPreviousFrameTime", "setPreviousFrameTime", "currentFrame", "getCurrentFrame", "setCurrentFrame", "framesPerHundredSeconds", "getFramesPerHundredSeconds", "setFramesPerHundredSeconds", "", "durationInSeconds", "D", "getDurationInSeconds", "()D", "setDurationInSeconds", "(D)V", "LHI0/Q;", "_contentResolver", "LHI0/Q;", "get_contentResolver", "()LHI0/Q;", "set_contentResolver", "(LHI0/Q;)V", "value", "editMode", "getEditMode", "setEditMode", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "spoidEnv", "Lcom/alightcreative/app/motion/scene/SpoidEnv;", "getSpoidEnv", "()Lcom/alightcreative/app/motion/scene/SpoidEnv;", "setSpoidEnv", "(Lcom/alightcreative/app/motion/scene/SpoidEnv;)V", "optiRate", "getOptiRate", "setOptiRate", "getVideoThumbnails", "videoThumbnails", "getContentResolver", "contentResolver", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RenderEnvironmentImpl implements RenderEnvironment {
    private HI0.Q _contentResolver;
    private aO.Pl _videoThumbnails;
    public SceneElement activeCamera;
    private Context context;
    private int currentFrame;
    private double durationInSeconds;
    private int editMode;
    private ExportParams exportParams;
    private int framesPerHundredSeconds;
    private float previousFrameTime;
    private boolean targetHasAlpha;
    private float time;
    private cA videoTextureCache;
    private Map<Long, ? extends Z> overrideVideoTextures = MapsKt.emptyMap();
    private Scene scene = SceneKt.emptyScene$default(0, 0, 3, null);
    private RenderMode renderMode = RenderMode.PAUSE;
    private UIColors uiColors = UIColors.INSTANCE.getDEFAULT();
    private Map<String, UserParameterValue> userElementParamValues = MapsKt.emptyMap();
    private int rootFPHS = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
    private nKE userPreviewMode = nKE.ck.n();
    private SpoidEnv spoidEnv = new SpoidEnv(null, null, null, null, 15, null);
    private int optiRate = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RenderMode.values().length];
            try {
                iArr[RenderMode.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderMode.THUMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RenderMode.SCENE_THUMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RenderMode.PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RenderMode.EXPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void reset() {
        this.context = null;
        this._contentResolver = null;
        setEditMode(0);
        setSpoidEnv(new SpoidEnv(null, null, null, null, 15, null));
        setCurrentFrame(0);
        setFramesPerHundredSeconds(0);
        setVideoTextureCache(null);
        setRenderMode(RenderMode.PAUSE);
        setUiColors(UIColors.INSTANCE.getDEFAULT());
        setTargetHasAlpha(false);
        this._videoThumbnails = null;
        setUserElementParamValues(MapsKt.emptyMap());
        setScene(SceneKt.getEMPTY_SCENE());
        setExportParams(null);
        setOptiRate(1);
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SolidColor colorFromAttr(int attr, SolidColor solidColor) {
        Resources.Theme theme;
        Intrinsics.checkNotNullParameter(solidColor, "default");
        Context context = this.context;
        if (context != null && (theme = context.getTheme()) != null) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(attr, typedValue, true)) {
                return qf.t(typedValue.data);
            }
        }
        return solidColor;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SceneElement getActiveCamera() {
        SceneElement sceneElement = this.activeCamera;
        if (sceneElement != null) {
            return sceneElement;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activeCamera");
        return null;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public HI0.Q getContentResolver() {
        HI0.Q q2 = this._contentResolver;
        if (q2 != null) {
            return q2;
        }
        throw new UninitializedPropertyAccessException();
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getCurrentFrame() {
        return this.currentFrame;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public double getDurationInSeconds() {
        return this.durationInSeconds;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getEditMode() {
        return this.editMode;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public ExportParams getExportParams() {
        return this.exportParams;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getFramesPerHundredSeconds() {
        return this.framesPerHundredSeconds;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getOptiRate() {
        return this.optiRate;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Map<Long, Z> getOverrideVideoTextures() {
        return this.overrideVideoTextures;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getPreviousFrameTime() {
        return this.previousFrameTime;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public int getRootFPHS() {
        return this.rootFPHS;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Scene getScene() {
        return this.scene;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public SpoidEnv getSpoidEnv() {
        return this.spoidEnv;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public boolean getTargetHasAlpha() {
        return this.targetHasAlpha;
    }

    @Override // com.alightcreative.app.motion.scene.animators.AnimatorEnvironment
    public float getTime() {
        return this.time;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public UIColors getUiColors() {
        return this.uiColors;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public Map<String, UserParameterValue> getUserElementParamValues() {
        return this.userElementParamValues;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public nKE getUserPreviewMode() {
        return this.userPreviewMode;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public cA getVideoTextureCache() {
        return this.videoTextureCache;
    }

    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    public aO.Pl getVideoThumbnails() {
        aO.Pl pl = this._videoThumbnails;
        Intrinsics.checkNotNull(pl);
        return pl;
    }

    public final HI0.Q get_contentResolver() {
        return this._contentResolver;
    }

    public final aO.Pl get_videoThumbnails() {
        return this._videoThumbnails;
    }

    public void setActiveCamera(SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(sceneElement, "<set-?>");
        this.activeCamera = sceneElement;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public void setCurrentFrame(int i2) {
        this.currentFrame = i2;
    }

    public void setDurationInSeconds(double d2) {
        this.durationInSeconds = d2;
    }

    public void setEditMode(int i2) {
        this.editMode = i2;
        setSpoidEnv(new SpoidEnv(null, null, null, null, 15, null));
    }

    public void setExportParams(ExportParams exportParams) {
        this.exportParams = exportParams;
    }

    public void setFramesPerHundredSeconds(int i2) {
        this.framesPerHundredSeconds = i2;
    }

    public void setOptiRate(int i2) {
        this.optiRate = i2;
    }

    public void setOverrideVideoTextures(Map<Long, ? extends Z> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.overrideVideoTextures = map;
    }

    public void setPreviousFrameTime(float f3) {
        this.previousFrameTime = f3;
    }

    public void setRenderMode(RenderMode renderMode) {
        Intrinsics.checkNotNullParameter(renderMode, "<set-?>");
        this.renderMode = renderMode;
    }

    public void setRootFPHS(int i2) {
        this.rootFPHS = i2;
    }

    public void setScene(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<set-?>");
        this.scene = scene;
    }

    public void setSpoidEnv(SpoidEnv spoidEnv) {
        Intrinsics.checkNotNullParameter(spoidEnv, "<set-?>");
        this.spoidEnv = spoidEnv;
    }

    public void setTargetHasAlpha(boolean z2) {
        this.targetHasAlpha = z2;
    }

    public void setTime(float f3) {
        this.time = f3;
    }

    public void setUiColors(UIColors uIColors) {
        Intrinsics.checkNotNullParameter(uIColors, "<set-?>");
        this.uiColors = uIColors;
    }

    public void setUserElementParamValues(Map<String, UserParameterValue> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.userElementParamValues = map;
    }

    public void setUserPreviewMode(nKE nke) {
        Intrinsics.checkNotNullParameter(nke, "<set-?>");
        this.userPreviewMode = nke;
    }

    public void setVideoTextureCache(cA cAVar) {
        this.videoTextureCache = cAVar;
    }

    public final void set_contentResolver(HI0.Q q2) {
        this._contentResolver = q2;
    }

    public final void set_videoThumbnails(aO.Pl pl) {
        this._videoThumbnails = pl;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    @Override // com.alightcreative.app.motion.scene.rendering.RenderEnvironment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z textureForVideoTrack(final long trackId) {
        final Uri fillVideo;
        final z.g9s g9sVar;
        z.g9s g9sVarN;
        Z z2 = getOverrideVideoTextures().get(Long.valueOf(trackId));
        if (z2 != null) {
            return z2;
        }
        final SceneElement sceneElementNestedElementByTrackId = SceneKt.nestedElementByTrackId(getScene(), Long.valueOf(trackId));
        z.g9s g9sVarN2 = null;
        if (sceneElementNestedElementByTrackId == null || (fillVideo = sceneElementNestedElementByTrackId.getFillVideo()) == null) {
            return null;
        }
        final int iSceneFrameToMediaTimeMillis = SceneElementKt.sceneFrameToMediaTimeMillis(sceneElementNestedElementByTrackId, getCurrentFrame(), getFramesPerHundredSeconds(), 0);
        long j2 = ((long) iSceneFrameToMediaTimeMillis) * 1000;
        Long cachedVideoPtsLessOrEqual = SceneRenderingKt.getCachedVideoPtsLessOrEqual(fillVideo, j2 - 500);
        final long jLongValue = cachedVideoPtsLessOrEqual != null ? cachedVideoPtsLessOrEqual.longValue() : ICC.aC.rl(sceneElementNestedElementByTrackId.getFillVideo(), j2, 0L, 4, null);
        final int iFrameNumberFromPTSTime = TimeKt.frameNumberFromPTSTime(jLongValue >= 0 ? (int) (jLongValue / 1000) : iSceneFrameToMediaTimeMillis, getRootFPHS());
        int i2 = WhenMappings.$EnumSwitchMapping$0[getRenderMode().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                cA videoTextureCache = getVideoTextureCache();
                if (videoTextureCache == null || (g9sVarN = videoTextureCache.n(fillVideo, trackId, iFrameNumberFromPTSTime)) == null) {
                    cA videoTextureCache2 = getVideoTextureCache();
                    if (videoTextureCache2 != null) {
                        g9sVarN2 = videoTextureCache2.n(fillVideo, trackId, iFrameNumberFromPTSTime - 1);
                    }
                }
                g9sVar = g9sVarN;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                cA videoTextureCache3 = getVideoTextureCache();
                if (videoTextureCache3 == null || (g9sVarN = videoTextureCache3.n(fillVideo, trackId, iFrameNumberFromPTSTime)) == null) {
                    cA videoTextureCache4 = getVideoTextureCache();
                    g9sVarN = videoTextureCache4 != null ? videoTextureCache4.n(fillVideo, trackId, iFrameNumberFromPTSTime - 1) : null;
                    if (g9sVarN == null) {
                        cA videoTextureCache5 = getVideoTextureCache();
                        g9sVarN = videoTextureCache5 != null ? videoTextureCache5.n(fillVideo, trackId, iFrameNumberFromPTSTime - 2) : null;
                        if (g9sVarN == null) {
                            cA videoTextureCache6 = getVideoTextureCache();
                            g9sVarN = videoTextureCache6 != null ? videoTextureCache6.n(fillVideo, trackId, iFrameNumberFromPTSTime - 3) : null;
                            if (g9sVarN == null) {
                                cA videoTextureCache7 = getVideoTextureCache();
                                g9sVarN = videoTextureCache7 != null ? videoTextureCache7.n(fillVideo, trackId, iFrameNumberFromPTSTime - 4) : null;
                                if (g9sVarN == null) {
                                    cA videoTextureCache8 = getVideoTextureCache();
                                    if (videoTextureCache8 != null) {
                                        g9sVarN2 = videoTextureCache8.n(fillVideo, trackId, iFrameNumberFromPTSTime - 5);
                                    }
                                }
                            }
                        }
                    }
                }
                g9sVar = g9sVarN;
            }
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RenderEnvironmentImpl.textureForVideoTrack$lambda$0(trackId, iSceneFrameToMediaTimeMillis, iFrameNumberFromPTSTime, jLongValue, sceneElementNestedElementByTrackId, this, g9sVar);
                }
            });
            if (g9sVar == null) {
                XoT.C.HI(this, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RenderEnvironmentImpl.textureForVideoTrack$lambda$1(trackId, this, iFrameNumberFromPTSTime, fillVideo);
                    }
                });
            }
            return g9sVar;
        }
        cA videoTextureCache9 = getVideoTextureCache();
        if (videoTextureCache9 != null) {
            g9sVarN2 = videoTextureCache9.n(fillVideo, trackId, iFrameNumberFromPTSTime);
        }
        g9sVar = g9sVarN2;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.scene.rendering.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RenderEnvironmentImpl.textureForVideoTrack$lambda$0(trackId, iSceneFrameToMediaTimeMillis, iFrameNumberFromPTSTime, jLongValue, sceneElementNestedElementByTrackId, this, g9sVar);
            }
        });
        if (g9sVar == null) {
        }
        return g9sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textureForVideoTrack$lambda$0(long j2, int i2, int i3, long j3, SceneElement sceneElement, RenderEnvironmentImpl renderEnvironmentImpl, z.g9s g9sVar) {
        String str;
        int inTime = sceneElement.getInTime();
        int startTime = sceneElement.getStartTime();
        int rootFPHS = renderEnvironmentImpl.getRootFPHS();
        if (g9sVar == null) {
            str = "NOT-FOUND";
        } else {
            str = "OK";
        }
        return "VCACHEFRAME: textureForVideoTrack:" + j2 + " mediaTime=" + i2 + " >mediaFrame=" + i3 + "  adjMediaTime=" + j3 + " inTime=" + inTime + " startTime=" + startTime + " rootFPHS=" + rootFPHS + " " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textureForVideoTrack$lambda$1(long j2, RenderEnvironmentImpl renderEnvironmentImpl, int i2, Uri uri) {
        return "Texture not found for trackId=" + j2 + " currentFrame=" + renderEnvironmentImpl.getCurrentFrame() + " cache=" + renderEnvironmentImpl.getVideoTextureCache() + " mediaFrame=" + i2 + " uri=" + uri;
    }
}
