package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.EnumC1485c;
import WzY.s4;
import WzY.yg;
import android.graphics.Matrix;
import android.opengl.GLES20;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001a\u0010.\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001a\u00100\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001a\u00102\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001a\u00104\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b4\u0010'R\u001a\u00105\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u001a\u00107\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001a\u00109\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001a\u0010;\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001a\u0010=\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u001a\u0010?\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'R\u001a\u0010A\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'R\u001a\u0010C\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u001a\u0010E\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'R\u001a\u0010G\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bH\u0010'R\u001a\u0010I\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'¨\u0006K"}, d2 = {"Lcom/alightcreative/app/motion/scene/DrawingElementTypeImpl;", "Lcom/alightcreative/app/motion/scene/ISceneElementType;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "render", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderSelection", "renderOutline", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeElement", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "xmlTag", "Ljava/lang/String;", "getXmlTag", "()Ljava/lang/String;", "hasTransform", "Z", "getHasTransform", "()Z", "hasVisualContent", "getHasVisualContent", "hasFillColor", "getHasFillColor", "hasFillImage", "getHasFillImage", "hasFillVideo", "getHasFillVideo", "hasFillGradient", "getHasFillGradient", "hasFillType", "getHasFillType", "isRenderable", "hasVisualEffects", "getHasVisualEffects", "hasBlendingMode", "getHasBlendingMode", "hasBorderAndShadow", "getHasBorderAndShadow", "hasGain", "getHasGain", "hasOutline", "getHasOutline", "hasStroke", "getHasStroke", "hasVolume", "getHasVolume", "hasText", "getHasText", "hasSourceMedia", "getHasSourceMedia", "hasNestedScene", "getHasNestedScene", "hasOpacity", "getHasOpacity", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawingElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawingElement.kt\ncom/alightcreative/app/motion/scene/DrawingElementTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n*L\n1#1,305:1\n1#2:306\n1567#3:307\n1598#3,4:308\n1863#3,2:312\n1863#3,2:314\n1863#3,2:328\n45#4,12:316\n*S KotlinDebug\n*F\n+ 1 DrawingElement.kt\ncom/alightcreative/app/motion/scene/DrawingElementTypeImpl\n*L\n83#1:307\n83#1:308,4\n106#1:312,2\n220#1:314,2\n152#1:328,2\n233#1:316,12\n*E\n"})
public final class DrawingElementTypeImpl implements ISceneElementType {
    public static final int $stable = 0;
    private static final boolean hasNestedScene = false;
    private static final boolean hasOutline = false;
    private static final boolean hasSourceMedia = false;
    private static final boolean hasStroke = false;
    private static final boolean hasText = false;
    private static final boolean hasVolume = false;
    public static final DrawingElementTypeImpl INSTANCE = new DrawingElementTypeImpl();
    private static final String xmlTag = "drawing";
    private static final boolean hasTransform = true;
    private static final boolean hasVisualContent = true;
    private static final boolean hasFillColor = true;
    private static final boolean hasFillImage = true;
    private static final boolean hasFillVideo = true;
    private static final boolean hasFillGradient = true;
    private static final boolean hasFillType = true;
    private static final boolean isRenderable = true;
    private static final boolean hasVisualEffects = true;
    private static final boolean hasBlendingMode = true;
    private static final boolean hasBorderAndShadow = true;
    private static final boolean hasGain = true;
    private static final boolean hasOpacity = true;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrawingTool.values().length];
            try {
                iArr[DrawingTool.PEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawingTool.BRUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawingTool.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DrawingTool.ERASER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11$lambda$10(Stroke stroke, SolidColor solidColor, boolean z2, WzY.s4 s4Var, List list, Transform transform, Rectangle rectangle) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearStencil(0);
        GLES20.glClear(17408);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectangle.getLeft(), -rectangle.getTop());
        int i2 = WhenMappings.$EnumSwitchMapping$0[stroke.getTool().ordinal()];
        if (i2 == 1) {
            DrawingElementKt.paint.az(stroke.getWidth());
            DrawingElementKt.paint.gh(solidColor);
            if (z2) {
                s4Var.E2(list, matrix, DrawingElementKt.paint);
            } else {
                s4Var.ViF(list, matrix, DrawingElementKt.paint);
            }
        } else if (i2 == 2) {
            DrawingElementKt.paint.az(stroke.getWidth());
            DrawingElementKt.paint.gh(solidColor);
            s4Var.E2(list, matrix, DrawingElementKt.paint);
        } else if (i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            DrawingElementKt.paint.az(stroke.getWidth());
            DrawingElementKt.paint.gh(SolidColor.INSTANCE.getBLACK());
            s4Var.ViF(list, matrix, DrawingElementKt.paint);
        } else if (!list.isEmpty()) {
            C1487z c1487z = DrawingElementKt.scratchPath;
            c1487z.ijL();
            c1487z.k(((StrokePoint) CollectionsKt.first(list)).getLocation());
            Iterator it = CollectionsKt.drop(list, 1).iterator();
            while (it.hasNext()) {
                c1487z.D(((StrokePoint) it.next()).getLocation());
            }
            DrawingElementKt.paint.ty(yg.w6.f11697t);
            DrawingElementKt.paint.gh(SolidColor.copy$default(stroke.getColor(), 0.0f, 0.0f, 0.0f, 1.0f, 7, null));
            WzY.SPz.r(c1487z, transform);
            s4Var.te(c1487z, DrawingElementKt.paint);
        }
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void render(SceneElement el, final WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Object next;
        Object next2;
        Object next3;
        float f3;
        int i2;
        int i3;
        Matrix matrix;
        Stroke stroke;
        double d2;
        Transform transform;
        float f4;
        float f5;
        final List<StrokePoint> list;
        Stroke strokeCopy$default;
        Map<String, KeyableUserParameterValue> parameters;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<Float> floatValue;
        Map<String, KeyableUserParameterValue> parameters2;
        KeyableUserParameterValue keyableUserParameterValue2;
        Keyable<Float> floatValue2;
        Map<String, KeyableUserParameterValue> parameters3;
        KeyableUserParameterValue keyableUserParameterValue3;
        Keyable<Float> floatValue3;
        Map<String, KeyableUserParameterValue> parameters4;
        KeyableUserParameterValue keyableUserParameterValue4;
        Keyable<Float> floatValue4;
        Map<String, KeyableUserParameterValue> parameters5;
        KeyableUserParameterValue keyableUserParameterValue5;
        Keyable<Float> floatValue5;
        Map<String, KeyableUserParameterValue> parameters6;
        KeyableUserParameterValue keyableUserParameterValue6;
        Keyable<SolidColor> colorValue;
        WzY.s4 canvas2 = canvas;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        Transform transformValueAtTime = el.getTransform().valueAtTime(env);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(viewport.getLeft() / canvas2.g(), ((-viewport.getBottom()) + canvas2.mUb()) / canvas2.mUb());
        matrix2.preScale(viewport.getWidth() / canvas2.g(), viewport.getHeight() / canvas2.mUb());
        canvas2.O();
        Matrix matrix3 = transformValueAtTime.getMatrix();
        s4.j.n(canvas2, null, null, null, null, null, transformValueAtTime.getOpacity(), null, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null);
        Iterator<T> it = el.getVisualEffects().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
            if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.drawing.strokecolor") && !keyableVisualEffectRef.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
        SolidColor solidColor = (keyableVisualEffectRef2 == null || (parameters6 = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue6 = parameters6.get(TtmlNode.ATTR_TTS_COLOR)) == null || (colorValue = keyableUserParameterValue6.getColorValue()) == null) ? null : (SolidColor) KeyableKt.valueAtTime(colorValue, env);
        Iterator<T> it2 = el.getVisualEffects().values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            KeyableVisualEffectRef keyableVisualEffectRef3 = (KeyableVisualEffectRef) next2;
            if (Intrinsics.areEqual(keyableVisualEffectRef3.getId(), "com.alightcreative.effects.drawing.progress") && !keyableVisualEffectRef3.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef4 = (KeyableVisualEffectRef) next2;
        Iterator<T> it3 = el.getVisualEffects().values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            KeyableVisualEffectRef keyableVisualEffectRef5 = (KeyableVisualEffectRef) next3;
            if (Intrinsics.areEqual(keyableVisualEffectRef5.getId(), "com.alightcreative.effects.drawing.stroketaper") && !keyableVisualEffectRef5.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef6 = (KeyableVisualEffectRef) next3;
        float fFloatValue = 100.0f;
        float fFloatValue2 = ((keyableVisualEffectRef4 == null || (parameters5 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue5 = parameters5.get(TtmlNode.START)) == null || (floatValue5 = keyableUserParameterValue5.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue5, env)).floatValue()) / 100.0f;
        float fFloatValue3 = ((keyableVisualEffectRef4 == null || (parameters4 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue4 = parameters4.get(TtmlNode.END)) == null || (floatValue4 = keyableUserParameterValue4.getFloatValue()) == null) ? 100.0f : ((Number) KeyableKt.valueAtTime(floatValue4, env)).floatValue()) / 100.0f;
        float fFloatValue4 = (keyableVisualEffectRef6 == null || (parameters3 = keyableVisualEffectRef6.getParameters()) == null || (keyableUserParameterValue3 = parameters3.get(TtmlNode.START)) == null || (floatValue3 = keyableUserParameterValue3.getFloatValue()) == null) ? 100.0f : ((Number) KeyableKt.valueAtTime(floatValue3, env)).floatValue();
        if (keyableVisualEffectRef6 != null && (parameters2 = keyableVisualEffectRef6.getParameters()) != null && (keyableUserParameterValue2 = parameters2.get(TtmlNode.END)) != null && (floatValue2 = keyableUserParameterValue2.getFloatValue()) != null) {
            fFloatValue = ((Number) KeyableKt.valueAtTime(floatValue2, env)).floatValue();
        }
        double dFloatValue = (((double) ((keyableVisualEffectRef6 == null || (parameters = keyableVisualEffectRef6.getParameters()) == null || (keyableUserParameterValue = parameters.get("squeeze")) == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, env)).floatValue())) / 5.0d) + 1.0d;
        Iterator<T> it4 = el.getDrawing().getStrokes().iterator();
        int i5 = 0;
        int size = 0;
        while (it4.hasNext()) {
            size += ((Stroke) it4.next()).getPoints().size();
        }
        float f6 = size;
        int iRoundToInt = MathKt.roundToInt(fFloatValue2 * f6);
        int iRoundToInt2 = MathKt.roundToInt(f6 * fFloatValue3);
        if (iRoundToInt2 > iRoundToInt) {
            int size2 = 0;
            for (final Stroke stroke2 : el.getDrawing().getStrokes()) {
                int size3 = size2 + stroke2.getPoints().size();
                final Rectangle bounds = SceneElementKt.getBounds(stroke2);
                SolidColor solidColor2 = solidColor;
                int i7 = (((double) fFloatValue4) < 0.995d || ((double) fFloatValue) < 0.995d) ? 1 : i5;
                if (iRoundToInt >= size3 || iRoundToInt2 <= size2 || bounds.getWidth() <= 0.0f || bounds.getHeight() <= 0.0f) {
                    f3 = fFloatValue4;
                    i2 = iRoundToInt2;
                    i3 = size2;
                    matrix = matrix3;
                    stroke = stroke2;
                    d2 = dFloatValue;
                    transform = transformValueAtTime;
                    f4 = fFloatValue;
                } else {
                    int iMax = Math.max(i5, size3 - iRoundToInt2);
                    int iMax2 = Math.max(i5, iRoundToInt - size2);
                    int i8 = (iMax2 == 0 && iMax == 0) ? 1 : i5;
                    List<StrokePoint> points = i8 != 0 ? stroke2.getPoints() : CollectionsKt.drop(CollectionsKt.dropLast(stroke2.getPoints(), iMax), iMax2);
                    if (i7 != 0) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
                        int i9 = 0;
                        for (Object obj : points) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            int i11 = iRoundToInt2;
                            StrokePoint strokePoint = (StrokePoint) obj;
                            List<StrokePoint> list2 = points;
                            int i12 = size2;
                            arrayList.add(StrokePoint.copy$default(strokePoint, null, QuaternionKt.mix(fFloatValue4, fFloatValue, (float) Math.pow(((double) i9) / ((double) list2.size()), dFloatValue)) * (stroke2.getTool() == DrawingTool.BRUSH ? strokePoint.getPressure() : 1.0f), 1, null));
                            size2 = i12;
                            points = list2;
                            i9 = i10;
                            iRoundToInt2 = i11;
                        }
                        points = arrayList;
                    }
                    i2 = iRoundToInt2;
                    int i13 = size2;
                    final SolidColor solidColorCopy$default = SolidColor.copy$default(solidColor2 == null ? stroke2.getColor() : solidColor2, 0.0f, 0.0f, 0.0f, 1.0f, 7, null);
                    if (i8 == 0 || i7 != 0) {
                        List<StrokePoint> list3 = points;
                        f5 = fFloatValue;
                        list = list3;
                        strokeCopy$default = Stroke.copy$default(stroke2, list3, null, null, 0.0f, 14, null);
                    } else {
                        f5 = fFloatValue;
                        strokeCopy$default = stroke2;
                        list = points;
                    }
                    if (!Intrinsics.areEqual(strokeCopy$default.getColor(), solidColorCopy$default)) {
                        strokeCopy$default = Stroke.copy$default(strokeCopy$default, null, solidColorCopy$default, null, 0.0f, 13, null);
                    }
                    if (stroke2.getTool() == DrawingTool.FILL) {
                        if (!list.isEmpty()) {
                            C1487z c1487z = DrawingElementKt.scratchPath;
                            c1487z.ijL();
                            c1487z.k(((StrokePoint) CollectionsKt.first((List) list)).getLocation());
                            Iterator it5 = CollectionsKt.drop(list, 1).iterator();
                            while (it5.hasNext()) {
                                c1487z.D(((StrokePoint) it5.next()).getLocation());
                            }
                            DrawingElementKt.paint.ty(yg.w6.f11697t);
                            DrawingElementKt.paint.gh(solidColorCopy$default);
                            WzY.SPz.r(c1487z, transformValueAtTime);
                            canvas2.te(c1487z, DrawingElementKt.paint);
                        }
                        i3 = i13;
                        f3 = fFloatValue4;
                        matrix = matrix3;
                        stroke = stroke2;
                        d2 = dFloatValue;
                        transform = transformValueAtTime;
                        f4 = f5;
                    } else {
                        DrawingTool tool = stroke2.getTool();
                        DrawingTool drawingTool = DrawingTool.ERASER;
                        float a2 = tool == drawingTool ? 1.0f : (solidColor2 == null ? stroke2.getColor() : solidColor2).getA();
                        WzY.j jVar = stroke2.getTool() == drawingTool ? WzY.j.f11651t : WzY.j.f11650n;
                        i3 = i13;
                        final boolean z2 = i7;
                        f3 = fFloatValue4;
                        final Transform transform2 = transformValueAtTime;
                        f4 = f5;
                        d2 = dFloatValue;
                        Function0 function0 = new Function0() { // from class: com.alightcreative.app.motion.scene.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DrawingElementTypeImpl.render$lambda$11$lambda$10(stroke2, solidColorCopy$default, z2, canvas, list, transform2, bounds);
                            }
                        };
                        matrix = matrix3;
                        stroke = stroke2;
                        transform = transform2;
                        canvas2 = canvas;
                        canvas2.Ik(strokeCopy$default, bounds, matrix, a2, jVar, function0);
                    }
                }
                size2 = i3 + stroke.getPoints().size();
                matrix3 = matrix;
                fFloatValue4 = f3;
                fFloatValue = f4;
                solidColor = solidColor2;
                iRoundToInt2 = i2;
                i5 = 0;
                transformValueAtTime = transform;
                dFloatValue = d2;
            }
        }
        canvas2.iF(matrix2);
        DrawingElementKt.paint.xMQ(1.0f);
        canvas2.n();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderSelection(final SceneElement el, WzY.s4 canvas, RenderEnvironment env, final SceneSelection selection, Rectangle viewport) {
        EnumC1485c enumC1485cN;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        if (env.getEditMode() == 2131362622) {
            return;
        }
        XoT.C.Uo(el, new Function0() { // from class: com.alightcreative.app.motion.scene.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawingElementTypeImpl.renderSelection$lambda$13$lambda$12(el, selection);
            }
        });
        if (SceneElementRenderingKt.renderGeneralElementSelectionAndEditMode(el, canvas, env, selection, viewport) || (enumC1485cN = EnumC1485c.f11632n.n(selection, el.getId(), env.getEditMode())) == EnumC1485c.f11635t) {
            return;
        }
        Transform transformValueAtTime = CameraElementKt.applyCameraAndParenting(el, env, env.getTime()).getTransform().valueAtTime(env);
        DrawingElementKt.scratchPath.ijL();
        DrawingElementKt.scratchPath.WPU(SceneElementKt.boundsInScene(el, env.getScene()));
        WzY.SPz.r(DrawingElementKt.scratchPath, transformValueAtTime);
        WzY.SPz.qie(canvas, DrawingElementKt.scratchPath, enumC1485cN, null, null, 12, null);
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        serializer.startTag(namespace, "drawing");
        SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
        SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
        Iterator<T> it = el.getDrawing().getStrokes().iterator();
        while (it.hasNext()) {
            SceneElementKt.serialize((Stroke) it.next(), namespace, serializer);
        }
        serializer.endTag(namespace, "drawing");
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, ns, "drawing");
        SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.Drawing, ns, parser);
        ArrayList arrayList = new ArrayList();
        SceneElement sceneElementUnserializeCommonChildTag = sceneElementUnserializeBaseSceneElement;
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                int depth = parser.getDepth();
                String name = parser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "stroke")) {
                    arrayList.add(SceneElementKt.unserializeStroke(ns, parser));
                } else {
                    sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeCommonChildTag, name, ns, parser, isPackage);
                }
                if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        return SceneElement.copy$default(sceneElementUnserializeCommonChildTag, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, new Drawing(arrayList), null, null, null, null, false, null, null, false, null, null, -268435457, 127, null);
    }

    private DrawingElementTypeImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderSelection$lambda$13$lambda$12(SceneElement sceneElement, SceneSelection sceneSelection) {
        return "renderAsDrawingElementSelection IN[" + sceneElement.getId() + "]; directSel=" + sceneSelection.isElementDirectlySelected(sceneElement.getId());
    }
}
