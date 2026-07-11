package com.alightcreative.app.motion.scene;

import WzY.EnumC1485c;
import android.graphics.Matrix;
import android.opengl.GLES20;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt;
import com.alightcreative.app.motion.scene.rendering.SceneRenderingKt;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import yc.nKE;
import z.C2470N;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001a\u0010.\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001a\u00100\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001a\u00102\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001a\u00104\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u001a\u00106\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b6\u0010'R\u001a\u00107\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001a\u00109\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001a\u0010;\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001a\u0010=\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u001a\u0010?\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'R\u001a\u0010A\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'R\u001a\u0010C\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u001a\u0010E\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'R\u001a\u0010G\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bH\u0010'R\u001a\u0010I\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'¨\u0006K"}, d2 = {"Lcom/alightcreative/app/motion/scene/NestedSceneElementTypeImpl;", "Lcom/alightcreative/app/motion/scene/ISceneElementType;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "render", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderSelection", "renderOutline", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeElement", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "xmlTag", "Ljava/lang/String;", "getXmlTag", "()Ljava/lang/String;", "hasTransform", "Z", "getHasTransform", "()Z", "hasVisualContent", "getHasVisualContent", "hasVisualEffects", "getHasVisualEffects", "hasFillColor", "getHasFillColor", "hasFillImage", "getHasFillImage", "hasFillVideo", "getHasFillVideo", "hasFillGradient", "getHasFillGradient", "hasFillType", "getHasFillType", "isRenderable", "hasNestedScene", "getHasNestedScene", "hasBlendingMode", "getHasBlendingMode", "hasBorderAndShadow", "getHasBorderAndShadow", "hasGain", "getHasGain", "hasOutline", "getHasOutline", "hasStroke", "getHasStroke", "hasVolume", "getHasVolume", "hasText", "getHasText", "hasSourceMedia", "getHasSourceMedia", "hasOpacity", "getHasOpacity", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNestedSceneElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedSceneElement.kt\ncom/alightcreative/app/motion/scene/NestedSceneElementTypeImpl\n+ 2 RenderingContext.kt\ncom/alightcreative/gl/RenderingContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,570:1\n183#2:571\n183#2:572\n183#2:573\n183#2:574\n1#3:575\n45#4,12:576\n126#5:588\n153#5,3:589\n*S KotlinDebug\n*F\n+ 1 NestedSceneElement.kt\ncom/alightcreative/app/motion/scene/NestedSceneElementTypeImpl\n*L\n247#1:571\n256#1:572\n257#1:573\n258#1:574\n339#1:576,12\n199#1:588\n199#1:589,3\n*E\n"})
public final class NestedSceneElementTypeImpl implements ISceneElementType {
    public static final int $stable = 0;
    private static final boolean hasOutline = false;
    private static final boolean hasSourceMedia = false;
    private static final boolean hasStroke = false;
    private static final boolean hasText = false;
    private static final boolean hasVolume = false;
    public static final NestedSceneElementTypeImpl INSTANCE = new NestedSceneElementTypeImpl();
    private static final String xmlTag = "embedScene";
    private static final boolean hasTransform = true;
    private static final boolean hasVisualContent = true;
    private static final boolean hasVisualEffects = true;
    private static final boolean hasFillColor = true;
    private static final boolean hasFillImage = true;
    private static final boolean hasFillVideo = true;
    private static final boolean hasFillGradient = true;
    private static final boolean hasFillType = true;
    private static final boolean isRenderable = true;
    private static final boolean hasNestedScene = true;
    private static final boolean hasBlendingMode = true;
    private static final boolean hasBorderAndShadow = true;
    private static final boolean hasGain = true;
    private static final boolean hasOpacity = true;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GradientType.values().length];
            try {
                iArr[GradientType.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientType.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientType.SWEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FillType.values().length];
            try {
                iArr2[FillType.INTRINSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FillType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FillType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FillType.MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FillType.GRADIENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
    }

    private static final String render$lambda$7$lambda$0() {
        return "Skip render cache: Do simple render instead";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String render$lambda$7$lambda$3() {
        return "Attempting to use render cache";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z.g9s render$lambda$7$lambda$5(SceneElement sceneElement, z.KH kh, int i2, int i3, RenderEnvironment renderEnvironment, Vector2D vector2D, float f3, float f4, Rectangle rectangle, int i5, int i7, Scene scene, int i8) {
        XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.psW
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NestedSceneElementTypeImpl.render$lambda$7$lambda$5$lambda$4();
            }
        });
        return render$lambda$7$renderGroup(kh, i2, i3, renderEnvironment, vector2D, f3, f4, sceneElement, rectangle, i5, i7, scene, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String render$lambda$7$lambda$5$lambda$4() {
        return "Rebuild render cache";
    }

    private static final z.g9s render$lambda$7$renderGroup(z.KH kh, int i2, int i3, RenderEnvironment renderEnvironment, Vector2D vector2D, float f3, float f4, SceneElement sceneElement, Rectangle rectangle, int i5, int i7, Scene scene, int i8) {
        UserParameterValue userParameterValue;
        z.g9s g9sVarQie = kh.qie(new z.Pmq(i2, i3, z.DC.f76231X, 0, 0, 24, null), "nestedSceneElement");
        kh.r(g9sVarQie);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(17408);
        HI0.Q contentResolver = renderEnvironment.getContentResolver();
        int x2 = (int) (vector2D.getX() * f3);
        int y2 = (int) (vector2D.getY() * f4);
        z.cA videoTextureCache = renderEnvironment.getVideoTextureCache();
        Map<Long, z.Z> overrideVideoTextures = renderEnvironment.getOverrideVideoTextures();
        RenderMode renderMode = renderEnvironment.getRenderMode();
        SceneSelection empty_scene_selection = SceneKt.getEMPTY_SCENE_SELECTION();
        int rootFPHS = renderEnvironment.getRootFPHS();
        ExportParams exportParams = renderEnvironment.getExportParams();
        cBL.j jVarN = cBL.j.f43572t.n();
        Map<String, UserParameterValue> mapAtTime = UserParameterKt.atTime(sceneElement.getUserElementParamValues(), renderEnvironment.getTime());
        ArrayList arrayList = new ArrayList(mapAtTime.size());
        for (Map.Entry<String, UserParameterValue> entry : mapAtTime.entrySet()) {
            String key = entry.getKey();
            UserParameterValue value = entry.getValue();
            if (value.getDataType() == DataType.STRING && SceneElementKt.isValidUserElementTag(value.getStringValue()) && renderEnvironment.getUserElementParamValues().containsKey(SceneElementKt.getUserElementTagId(value.getStringValue())) && (userParameterValue = renderEnvironment.getUserElementParamValues().get(SceneElementKt.getUserElementTagId(value.getStringValue()))) != null) {
                value = userParameterValue;
            }
            arrayList.add(TuplesKt.to(key, value));
        }
        SceneRenderingKt.renderWithGpu(scene, contentResolver, i8, i2, i3, x2, y2, kh, videoTextureCache, (103217152 & 256) != 0 ? MapsKt.emptyMap() : overrideVideoTextures, (103217152 & 512) != 0 ? RenderMode.PAUSE : renderMode, (103217152 & 1024) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : empty_scene_selection, (103217152 & 2048) != 0 ? 0 : 0, (103217152 & 4096) != 0 ? 0 : 0, (103217152 & 8192) != 0 ? new SpoidEnv(null, null, null, null, 15, null) : null, (103217152 & 16384) != 0 ? false : false, (32768 & 103217152) != 0 ? null : null, (65536 & 103217152) != 0 ? false : false, (131072 & 103217152) != 0 ? false : false, (262144 & 103217152) != 0 ? null : null, (524288 & 103217152) != 0 ? null : Integer.valueOf(rootFPHS), GeometryKt.offset(rectangle, i5 * 0.5f, i7 * 0.5f), (2097152 & 103217152) != 0 ? 1 : 0, (4194304 & 103217152) != 0 ? MapsKt.emptyMap() : MapsKt.plus(MapsKt.toMap(arrayList), renderEnvironment.getUserElementParamValues()), exportParams, jVarN, (33554432 & 103217152) != 0 ? false : false, (103217152 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nKE.ck.n() : null);
        kh.o();
        kh.J2();
        return g9sVarQie;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasBlendingMode() {
        return hasBlendingMode;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasBorderAndShadow() {
        return hasBorderAndShadow;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillColor() {
        return hasFillColor;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillGradient() {
        return hasFillGradient;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillImage() {
        return hasFillImage;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillType() {
        return hasFillType;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillVideo() {
        return hasFillVideo;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasGain() {
        return hasGain;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasNestedScene() {
        return hasNestedScene;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasOpacity() {
        return hasOpacity;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasOutline() {
        return hasOutline;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasSourceMedia() {
        return hasSourceMedia;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasStroke() {
        return hasStroke;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasText() {
        return hasText;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasTransform() {
        return hasTransform;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasVisualContent() {
        return hasVisualContent;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasVisualEffects() {
        return hasVisualEffects;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasVolume() {
        return hasVolume;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public String getXmlTag() {
        return xmlTag;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean isRenderable() {
        return isRenderable;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void render(final SceneElement el, WzY.s4 canvas, final RenderEnvironment env, SceneSelection selection, final Rectangle viewport) {
        final z.KH khKN;
        RenderEnvironment renderEnvironment;
        Matrix matrix;
        Transform transform;
        int i2;
        z.KH kh;
        z.g9s g9sVarGh;
        z.g9s g9sVar;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        if (SceneKt.getDuration(el.getNestedScene()) >= 50000 / env.getFramesPerHundredSeconds() && (khKN = canvas.KN()) != null) {
            final float fIk = khKN.Ik() / viewport.getWidth();
            final float fHI = khKN.HI() / viewport.getHeight();
            Transform transformValueAtTime = el.getTransform().valueAtTime(env);
            RetimedScene retimedSceneRetimeNestedScene = NestedSceneElementKt.retimeNestedScene(el, TimeKt.timeFromFrameNumber(env.getOverrideFrame(), env.getFramesPerHundredSeconds()), env.getFramesPerHundredSeconds());
            final Scene sceneComponent1 = retimedSceneRetimeNestedScene.getScene();
            final int iComponent2 = retimedSceneRetimeNestedScene.getFrame();
            if (retimedSceneRetimeNestedScene.getShouldRender()) {
                Matrix matrixReverseRotation = transformValueAtTime.getMatrixReverseRotation();
                Matrix optiMatrix = transformValueAtTime.getOptiMatrix(fIk, fHI, -viewport.getLeft(), -viewport.getTop());
                final int width = el.getNestedScene().getWidth();
                final int height = el.getNestedScene().getHeight();
                Rectangle rectangle = new Rectangle((-width) * 0.5f, (-height) * 0.5f, width * 0.5f, height * 0.5f);
                PrecomposeType precompose = el.getNestedScene().getPrecompose();
                PrecomposeType precomposeType = PrecomposeType.FIXED;
                Rectangle rectangleIntersect = precompose == precomposeType ? rectangle : GeometryKt.intersect(viewport, rectangle, matrixReverseRotation);
                final Vector2D viewRect = GeometryKt.getViewRect(rectangleIntersect, matrixReverseRotation);
                final Vector2D viewRect2 = GeometryKt.getViewRect(rectangle, matrixReverseRotation);
                if (viewRect.getX() <= 1.0E-7f || viewRect.getY() <= 1.0E-7f) {
                    return;
                }
                boolean z2 = el.getUserElementParamValues().isEmpty() && !SceneElementKt.isTimeDependent(el.getNestedScene());
                canvas.o();
                int width2 = el.getNestedScene().getPrecompose() == precomposeType ? width : (int) viewport.getWidth();
                int height2 = el.getNestedScene().getPrecompose() == precomposeType ? height : (int) viewport.getHeight();
                final int iCoerceAtMost = RangesKt.coerceAtMost(Math.min(RangesKt.coerceAtLeast((int) (viewRect.getX() * fIk), 1), width2), khKN.rl());
                final int iCoerceAtMost2 = RangesKt.coerceAtMost(Math.min(RangesKt.coerceAtLeast((int) (viewRect.getY() * fHI), 1), height2), khKN.rl());
                final Rectangle rectangle2 = rectangleIntersect;
                Function0 function0 = new Function0() { // from class: com.alightcreative.app.motion.scene.Md
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NestedSceneElementTypeImpl.render$lambda$7$lambda$1(iCoerceAtMost, iCoerceAtMost2, rectangle2, viewRect, fIk, fHI, khKN, viewport);
                    }
                };
                final Rectangle rectangle3 = rectangle2;
                XoT.C.Uo(el, function0);
                if (z2) {
                    XoT.C.Uo(el, new Function0() { // from class: com.alightcreative.app.motion.scene.Zs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NestedSceneElementTypeImpl.render$lambda$7$lambda$3();
                        }
                    });
                    transform = transformValueAtTime;
                    matrix = optiMatrix;
                    i2 = 1;
                    Function0 function02 = new Function0() { // from class: com.alightcreative.app.motion.scene.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NestedSceneElementTypeImpl.render$lambda$7$lambda$5(el, khKN, iCoerceAtMost, iCoerceAtMost2, env, viewRect2, fIk, fHI, rectangle3, width, height, sceneComponent1, iComponent2);
                        }
                    };
                    kh = khKN;
                    rectangle3 = rectangle3;
                    renderEnvironment = env;
                    g9sVarGh = kh.gh(sceneComponent1, function02);
                } else {
                    renderEnvironment = env;
                    matrix = optiMatrix;
                    transform = transformValueAtTime;
                    i2 = 1;
                    z.g9s g9sVarRender$lambda$7$renderGroup = render$lambda$7$renderGroup(khKN, iCoerceAtMost, iCoerceAtMost2, renderEnvironment, viewRect2, fIk, fHI, el, rectangle3, width, height, sceneComponent1, iComponent2);
                    kh = khKN;
                    g9sVarGh = g9sVarRender$lambda$7$renderGroup;
                }
                GLES20.glDisable(2960);
                GLES20.glStencilMask(0);
                GLES20.glBlendFunc(i2, 771);
                GLES20.glBlendEquation(32774);
                GLES20.glEnable(3042);
                C2470N c2470nRl = C2470N.KN.rl(rectangle3.getLeft(), rectangle3.getBottom(), rectangle3.getRight(), rectangle3.getTop());
                z.UGc.gh(c2470nRl, GeometryKt.times(matrix, kh.Uo()));
                int i3 = WhenMappings.$EnumSwitchMapping$1[el.getFillType().ordinal()];
                if (i3 == i2) {
                    g9sVar = g9sVarGh;
                    z.Mf.t(kh).render(c2470nRl, g9sVar, transform.getOpacity());
                } else if (i3 != 2) {
                    if (i3 != 3 && i3 != 4) {
                        if (i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i5 = WhenMappings.$EnumSwitchMapping$0[el.getFillGradient().getType().ordinal()];
                        if (i5 == i2) {
                            ((z.RzR) kh.mUb(Reflection.getOrCreateKotlinClass(z.RzR.class))).render(c2470nRl, g9sVarGh, transform.getOpacity(), el.getFillGradient().getStartLocation(), el.getFillGradient().getEndLocation(), ColorKt.premultiply(el.getFillGradient().getStartColor()), ColorKt.premultiply(el.getFillGradient().getEndColor()));
                        } else if (i5 == 2) {
                            ((z.pq) kh.mUb(Reflection.getOrCreateKotlinClass(z.pq.class))).render(c2470nRl, g9sVarGh, transform.getOpacity(), el.getFillGradient().getStartLocation(), el.getFillGradient().getEndLocation(), ColorKt.premultiply(el.getFillGradient().getStartColor()), ColorKt.premultiply(el.getFillGradient().getEndColor()));
                        } else {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((z.xuv) kh.mUb(Reflection.getOrCreateKotlinClass(z.xuv.class))).render(c2470nRl, g9sVarGh, transform.getOpacity(), el.getFillGradient().getStartLocation(), el.getFillGradient().getEndLocation(), ColorKt.premultiply(el.getFillGradient().getStartColor()), ColorKt.premultiply(el.getFillGradient().getEndColor()));
                        }
                    }
                    g9sVar = g9sVarGh;
                } else {
                    g9sVar = g9sVarGh;
                    ((z.B) kh.mUb(Reflection.getOrCreateKotlinClass(z.B.class))).render(c2470nRl, g9sVar, transform.getOpacity(), ColorKt.premultiply((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), renderEnvironment)));
                }
                if (z2) {
                    kh.Z(g9sVar);
                } else {
                    g9sVar.release();
                }
                canvas.az();
            }
        }
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        EnumC1485c enumC1485cN = EnumC1485c.f11632n.n(selection, el.getId(), env.getEditMode());
        if (SceneElementRenderingKt.renderGeneralElementSelectionAndEditMode(el, canvas, env, selection, viewport) || enumC1485cN == EnumC1485c.f11635t) {
            return;
        }
        Transform transformValueAtTime = CameraElementKt.applyCameraAndParenting(el, env, env.getTime()).getTransform().valueAtTime(env);
        NestedSceneElementKt.scratchPath.ijL();
        NestedSceneElementKt.scratchPath.WPU(SceneElementKt.boundsInScene(el, env.getScene()));
        WzY.SPz.r(NestedSceneElementKt.scratchPath, transformValueAtTime);
        WzY.SPz.qie(canvas, NestedSceneElementKt.scratchPath, enumC1485cN, null, null, 12, null);
        WzY.SPz.qie(canvas, NestedSceneElementKt.scratchPath, enumC1485cN, null, null, 12, null);
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        serializer.startTag(namespace, "embedScene");
        SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
        UUID linkedSceneUUID = el.getLinkedSceneUUID();
        if (linkedSceneUUID != null) {
            serializer.attribute(namespace, "link", linkedSceneUUID.toString());
        }
        SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
        for (Map.Entry<String, KeyableUserParameterValue> entry : el.getUserElementParamValues().entrySet()) {
            UserParameterKt.serialize(entry.getValue(), namespace, serializer, entry.getKey());
        }
        SceneSerializerKt.writeScene(namespace, serializer, el.getNestedScene(), MapsKt.emptyMap(), el.getNestedScene().getModifiedTime(), false, null);
        serializer.endTag(namespace, "embedScene");
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, ns, "embedScene");
        SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.Scene, ns, parser);
        String attributeValue = parser.getAttributeValue(ns, "link");
        Scene empty_scene = null;
        UUID uuidFromString = attributeValue != null ? UUID.fromString(attributeValue) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SceneElement sceneElementUnserializeCommonChildTag = sceneElementUnserializeBaseSceneElement;
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                int depth = parser.getDepth();
                String name = parser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "scene")) {
                    if (empty_scene == null) {
                        empty_scene = SceneSerializerKt.readScene$default(parser, ns, isPackage, false, 4, null);
                    }
                } else if (Intrinsics.areEqual(name, "property")) {
                    Pair<String, KeyableUserParameterValue> pairUnserializeUserParameterValue = UserParameterKt.unserializeUserParameterValue(ns, parser, isPackage);
                    linkedHashMap.put(pairUnserializeUserParameterValue.component1(), pairUnserializeUserParameterValue.component2());
                } else {
                    sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeCommonChildTag, name, ns, parser, isPackage);
                    if (parser.getEventType() == 3 || parser.getDepth() != depth) {
                        throw new IllegalStateException("Did not consume all tag contents");
                    }
                }
                if (parser.getEventType() == 3) {
                }
                throw new IllegalStateException("Did not consume all tag contents");
            }
        }
        if (empty_scene == null) {
            empty_scene = SceneKt.getEMPTY_SCENE();
        }
        return SceneElement.copy$default(sceneElementUnserializeCommonChildTag, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, empty_scene, uuidFromString, null, null, null, null, linkedHashMap, null, null, null, false, null, null, false, null, null, -562036737, 127, null);
    }

    private NestedSceneElementTypeImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String render$lambda$7$lambda$1(int i2, int i3, Rectangle rectangle, Vector2D vector2D, float f3, float f4, z.KH kh, Rectangle rectangle2) {
        return "nestedScene wh:" + i2 + " " + i3 + " resultRect:" + rectangle + " vd:(" + vector2D + ") scale:(" + f3 + " " + f4 + ") scrWH(" + kh.Ik() + " " + kh.HI() + ") vpWH(" + rectangle2.getWidth() + " " + rectangle2.getHeight() + ")";
    }
}
