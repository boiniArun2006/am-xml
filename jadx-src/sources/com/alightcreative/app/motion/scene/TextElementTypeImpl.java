package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.EnumC1485c;
import WzY.s4;
import WzY.yg;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.easing.CubicBezierEasing;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001a\u0010.\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b.\u0010'R\u001a\u0010/\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u001a\u00101\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u001a\u00103\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'R\u001a\u00105\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u001a\u00107\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001a\u00109\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001a\u0010;\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001a\u0010=\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u001a\u0010?\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'R\u001a\u0010A\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'R\u001a\u0010C\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u001a\u0010E\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'R\u001a\u0010G\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bH\u0010'R\u001a\u0010I\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'¨\u0006K"}, d2 = {"Lcom/alightcreative/app/motion/scene/TextElementTypeImpl;", "Lcom/alightcreative/app/motion/scene/ISceneElementType;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "render", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderSelection", "renderOutline", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeElement", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "xmlTag", "Ljava/lang/String;", "getXmlTag", "()Ljava/lang/String;", "hasTransform", "Z", "getHasTransform", "()Z", "hasVisualContent", "getHasVisualContent", "hasVisualEffects", "getHasVisualEffects", "hasText", "getHasText", "isRenderable", "hasFillColor", "getHasFillColor", "hasFillImage", "getHasFillImage", "hasFillVideo", "getHasFillVideo", "hasFillGradient", "getHasFillGradient", "hasFillType", "getHasFillType", "hasBlendingMode", "getHasBlendingMode", "hasBorderAndShadow", "getHasBorderAndShadow", "hasGain", "getHasGain", "hasOutline", "getHasOutline", "hasStroke", "getHasStroke", "hasVolume", "getHasVolume", "hasSourceMedia", "getHasSourceMedia", "hasNestedScene", "getHasNestedScene", "hasOpacity", "getHasOpacity", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextElement.kt\ncom/alightcreative/app/motion/scene/TextElementTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n*L\n1#1,787:1\n1#2:788\n1872#3,3:789\n45#4,12:792\n*S KotlinDebug\n*F\n+ 1 TextElement.kt\ncom/alightcreative/app/motion/scene/TextElementTypeImpl\n*L\n187#1:789,3\n492#1:792,12\n*E\n"})
public final class TextElementTypeImpl implements ISceneElementType {
    public static final int $stable = 0;
    private static final boolean hasNestedScene = false;
    private static final boolean hasOutline = false;
    private static final boolean hasSourceMedia = false;
    private static final boolean hasVolume = false;
    public static final TextElementTypeImpl INSTANCE = new TextElementTypeImpl();
    private static final String xmlTag = "text";
    private static final boolean hasTransform = true;
    private static final boolean hasVisualContent = true;
    private static final boolean hasVisualEffects = true;
    private static final boolean hasText = true;
    private static final boolean isRenderable = true;
    private static final boolean hasFillColor = true;
    private static final boolean hasFillImage = true;
    private static final boolean hasFillVideo = true;
    private static final boolean hasFillGradient = true;
    private static final boolean hasFillType = true;
    private static final boolean hasBlendingMode = true;
    private static final boolean hasBorderAndShadow = true;
    private static final boolean hasGain = true;
    private static final boolean hasStroke = true;
    private static final boolean hasOpacity = true;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FillType.values().length];
            try {
                iArr[FillType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FillType.INTRINSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FillType.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FillType.MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FillType.GRADIENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$10$lambda$3(int i2, int i3, int i5, int i7, int i8, C1487z a2, C1487z b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Rectangle rectangleM7 = a2.M7();
        Rectangle rectangleM72 = b2.M7();
        if (i2 == i3) {
            return GeometryKt.intersects(rectangleM7, rectangleM72);
        }
        if (i2 == i5 || i2 == i7) {
            return GeometryKt.intersects(GeometryKt.expand(rectangleM7, 0.0f, 16000.0f), GeometryKt.expand(rectangleM72, (-rectangleM72.getWidth()) / 3.0f, 0.0f));
        }
        if (i2 == i8) {
            return GeometryKt.intersects(GeometryKt.expand(rectangleM7, 0.0f, rectangleM7.getHeight() / 4.0f), GeometryKt.expand(rectangleM72, 16000.0f, 0.0f));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1487z render$lambda$10$lambda$4(C1487z a2, C1487z b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        a2.XQ(b2);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean render$lambda$10$lambda$7$lambda$5(float f3, C1487z a2, C1487z b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return GeometryKt.intersects(a2.M7(), GeometryKt.expand(b2.M7(), (f3 * 2.0f) / 3.0f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1487z render$lambda$10$lambda$7$lambda$6(C1487z a2, C1487z b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        a2.XQ(b2);
        return a2;
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

    /* JADX WARN: Removed duplicated region for block: B:157:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x095c A[LOOP:3: B:277:0x056b->B:396:0x095c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x08bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0576 A[EDGE_INSN: B:417:0x0576->B:279:0x0576 BREAK  A[LOOP:3: B:277:0x056b->B:396:0x095c], SYNTHETIC] */
    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Object next;
        Object next2;
        Vector2D zero;
        float f3;
        float fFloatValue;
        float fFloatValue2;
        float f4;
        boolean booleanValue;
        boolean z2;
        boolean booleanValue2;
        boolean z3;
        SolidColor black;
        StyleParams styleParamsForElement;
        RenderMode renderMode;
        float opacity;
        Transform transform;
        String userElementTagId;
        int i2;
        String str;
        StyledText styledTextCopy$default;
        double d2;
        boolean z4;
        C1487z textPath;
        Path pathT;
        PathMeasure pathMeasure;
        float length;
        float f5;
        float f6;
        List list;
        float f7;
        float f8;
        List list2;
        List list3;
        Iterator it;
        float fPow;
        float f9;
        float f10;
        Vector2D vector2D;
        int i3;
        float f11;
        float f12;
        float f13;
        float f14;
        Transform transform2;
        int i5;
        float f15;
        float f16;
        int i7;
        float f17;
        Transform transform3;
        float f18;
        float fCoerceIn;
        RenderEnvironment renderEnvironment;
        SolidColor solidColor;
        SolidColor solidColorMix;
        int i8;
        SceneElement sceneElement;
        WzY.s4 s4Var;
        String userElementTagLabel;
        Map<String, KeyableUserParameterValue> parameters;
        Keyable<SolidColor> colorValue;
        Map<String, KeyableUserParameterValue> parameters2;
        Map<String, KeyableUserParameterValue> parameters3;
        Map<String, KeyableUserParameterValue> parameters4;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<Float> floatValue;
        Map<String, KeyableUserParameterValue> parameters5;
        KeyableUserParameterValue keyableUserParameterValue2;
        Map<String, KeyableUserParameterValue> parameters6;
        KeyableUserParameterValue keyableUserParameterValue3;
        Map<String, KeyableUserParameterValue> parameters7;
        Keyable<Float> floatValue2;
        Map<String, KeyableUserParameterValue> parameters8;
        KeyableUserParameterValue keyableUserParameterValue4;
        Keyable<Float> floatValue3;
        Map<String, KeyableUserParameterValue> parameters9;
        KeyableUserParameterValue keyableUserParameterValue5;
        Keyable<Float> floatValue4;
        Map<String, KeyableUserParameterValue> parameters10;
        KeyableUserParameterValue keyableUserParameterValue6;
        Keyable<Float> floatValue5;
        Map<String, KeyableUserParameterValue> parameters11;
        KeyableUserParameterValue keyableUserParameterValue7;
        Keyable<Float> floatValue6;
        Map<String, KeyableUserParameterValue> parameters12;
        KeyableUserParameterValue keyableUserParameterValue8;
        Keyable<Float> floatValue7;
        Map<String, KeyableUserParameterValue> parameters13;
        KeyableUserParameterValue keyableUserParameterValue9;
        Keyable<Float> floatValue8;
        Map<String, KeyableUserParameterValue> parameters14;
        KeyableUserParameterValue keyableUserParameterValue10;
        Keyable<Float> floatValue9;
        Map<String, KeyableUserParameterValue> parameters15;
        KeyableUserParameterValue keyableUserParameterValue11;
        Map<String, KeyableUserParameterValue> parameters16;
        KeyableUserParameterValue keyableUserParameterValue12;
        Keyable<Float> floatValue10;
        Map<String, KeyableUserParameterValue> parameters17;
        KeyableUserParameterValue keyableUserParameterValue13;
        Keyable<Float> floatValue11;
        Map<String, KeyableUserParameterValue> parameters18;
        KeyableUserParameterValue keyableUserParameterValue14;
        Keyable<Vector2D> vec2DValue;
        Map<String, KeyableUserParameterValue> parameters19;
        KeyableUserParameterValue keyableUserParameterValue15;
        Keyable<Float> floatValue12;
        Map<String, KeyableUserParameterValue> parameters20;
        KeyableUserParameterValue keyableUserParameterValue16;
        Keyable<Float> floatValue13;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        Transform transformValueAtTime = el.getTransform().valueAtTime(env);
        Matrix matrix = transformValueAtTime.getMatrix();
        TextElementKt.paint.gh((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), env));
        canvas.O();
        Iterator<T> it2 = el.getVisualEffects().values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
            if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.drawing.progress") && !keyableVisualEffectRef.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
        float fFloatValue3 = ((keyableVisualEffectRef2 == null || (parameters20 = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue16 = parameters20.get(TtmlNode.START)) == null || (floatValue13 = keyableUserParameterValue16.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue13, env)).floatValue()) / 100.0f;
        float fFloatValue4 = ((keyableVisualEffectRef2 == null || (parameters19 = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue15 = parameters19.get(TtmlNode.END)) == null || (floatValue12 = keyableUserParameterValue15.getFloatValue()) == null) ? 100.0f : ((Number) KeyableKt.valueAtTime(floatValue12, env)).floatValue()) / 100.0f;
        Iterator<T> it3 = el.getVisualEffects().values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            KeyableVisualEffectRef keyableVisualEffectRef3 = (KeyableVisualEffectRef) next2;
            if (Intrinsics.areEqual(keyableVisualEffectRef3.getId(), "com.alightcreative.effects.texttransform") && !keyableVisualEffectRef3.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef4 = (KeyableVisualEffectRef) next2;
        if (keyableVisualEffectRef4 == null || (parameters18 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue14 = parameters18.get("offset")) == null || (vec2DValue = keyableUserParameterValue14.getVec2DValue()) == null || (zero = (Vector2D) KeyableKt.valueAtTime(vec2DValue, env)) == null) {
            zero = Vector2D.INSTANCE.getZERO();
        }
        Vector2D vector2DTimes = GeometryKt.times(zero, transformValueAtTime.getScale());
        float fFloatValue5 = (keyableVisualEffectRef4 == null || (parameters17 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue13 = parameters17.get(TtmlNode.START)) == null || (floatValue11 = keyableUserParameterValue13.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue11, env)).floatValue();
        float fFloatValue6 = (keyableVisualEffectRef4 == null || (parameters16 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue12 = parameters16.get(TtmlNode.END)) == null || (floatValue10 = keyableUserParameterValue12.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue10, env)).floatValue();
        final int intValue = (keyableVisualEffectRef4 == null || (parameters15 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue11 = parameters15.get("component")) == null) ? 1 : keyableUserParameterValue11.getIntValue();
        float fFloatValue7 = (keyableVisualEffectRef4 == null || (parameters14 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue10 = parameters14.get("phase")) == null || (floatValue9 = keyableUserParameterValue10.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue9, env)).floatValue();
        float fFloatValue8 = (keyableVisualEffectRef4 == null || (parameters13 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue9 = parameters13.get("angle")) == null || (floatValue8 = keyableUserParameterValue9.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue8, env)).floatValue();
        float fFloatValue9 = (keyableVisualEffectRef4 == null || (parameters12 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue8 = parameters12.get("scale")) == null || (floatValue7 = keyableUserParameterValue8.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue7, env)).floatValue();
        float fFloatValue10 = (keyableVisualEffectRef4 == null || (parameters11 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue7 = parameters11.get("stretch")) == null || (floatValue6 = keyableUserParameterValue7.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue6, env)).floatValue();
        float fFloatValue11 = (keyableVisualEffectRef4 == null || (parameters10 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue6 = parameters10.get("alpha")) == null || (floatValue5 = keyableUserParameterValue6.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue5, env)).floatValue();
        float fFloatValue12 = (keyableVisualEffectRef4 == null || (parameters9 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue5 = parameters9.get("easeIn")) == null || (floatValue4 = keyableUserParameterValue5.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue4, env)).floatValue();
        float fFloatValue13 = (keyableVisualEffectRef4 == null || (parameters8 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue4 = parameters8.get("easeOut")) == null || (floatValue3 = keyableUserParameterValue4.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue3, env)).floatValue();
        if (keyableVisualEffectRef4 != null && (parameters7 = keyableVisualEffectRef4.getParameters()) != null) {
            f3 = 1.0f;
            KeyableUserParameterValue keyableUserParameterValue17 = parameters7.get("overlap");
            if (keyableUserParameterValue17 != null && (floatValue2 = keyableUserParameterValue17.getFloatValue()) != null) {
                fFloatValue = ((Number) KeyableKt.valueAtTime(floatValue2, env)).floatValue();
            }
            float f19 = fFloatValue + f3;
            int intValue2 = (keyableVisualEffectRef4 != null || (parameters6 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue3 = parameters6.get("shape")) == null) ? 0 : keyableUserParameterValue3.getIntValue();
            int intValue3 = (keyableVisualEffectRef4 != null || (parameters5 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue2 = parameters5.get("anchor")) == null) ? 0 : keyableUserParameterValue2.getIntValue();
            fFloatValue2 = (keyableVisualEffectRef4 != null || (parameters4 = keyableVisualEffectRef4.getParameters()) == null || (keyableUserParameterValue = parameters4.get("seed")) == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, env)).floatValue();
            if (keyableVisualEffectRef4 == null && (parameters3 = keyableVisualEffectRef4.getParameters()) != null) {
                f4 = fFloatValue2;
                KeyableUserParameterValue keyableUserParameterValue18 = parameters3.get("randomOrder");
                booleanValue = keyableUserParameterValue18 != null ? keyableUserParameterValue18.getBooleanValue() : false;
                if (keyableVisualEffectRef4 != null && (parameters2 = keyableVisualEffectRef4.getParameters()) != null) {
                    z2 = booleanValue;
                    KeyableUserParameterValue keyableUserParameterValue19 = parameters2.get("useFillColor");
                    booleanValue2 = keyableUserParameterValue19 != null ? keyableUserParameterValue19.getBooleanValue() : false;
                    if (keyableVisualEffectRef4 == null && (parameters = keyableVisualEffectRef4.getParameters()) != null) {
                        z3 = booleanValue2;
                        KeyableUserParameterValue keyableUserParameterValue20 = parameters.get("fillColor");
                        if (keyableUserParameterValue20 == null || (colorValue = keyableUserParameterValue20.getColorValue()) == null || (black = (SolidColor) KeyableKt.valueAtTime(colorValue, env)) == null) {
                        }
                        styleParamsForElement = StyleParams.INSTANCE.forElement(el, env.getTime());
                        RenderMode renderMode2 = env.getRenderMode();
                        renderMode = RenderMode.THUMB;
                        opacity = renderMode2 == renderMode ? f3 : transformValueAtTime.getOpacity();
                        transform = transformValueAtTime;
                        userElementTagId = SceneElementKt.getUserElementTagId(el.getText().getText());
                        if (userElementTagId != null) {
                            i2 = intValue3;
                            UserParameterValue userParameterValue = env.getUserElementParamValues().get(userElementTagId);
                            if (userParameterValue == null || userParameterValue.getDataType() != DataType.STRING || userParameterValue.getStringValue().length() <= 0) {
                                userElementTagLabel = SceneElementKt.getUserElementTagLabel(el.getText().getText());
                                if (userElementTagLabel == null) {
                                    str = userElementTagId;
                                }
                            } else {
                                userElementTagLabel = userParameterValue.getStringValue();
                            }
                            str = userElementTagLabel;
                        } else {
                            i2 = intValue3;
                            str = null;
                        }
                        if (str != null && !StringsKt.isBlank(str) && (el.getFillType() != FillType.NONE || el.getStroke().getEnabled())) {
                            styledTextCopy$default = StyledText.copy$default(el.getText(), str, 0.0f, null, 0, null, 30, null);
                            SolidColor solidColor2 = black;
                            d2 = fFloatValue3;
                            z4 = d2 <= 1.0E-5d || ((double) fFloatValue4) < 0.99999d;
                            textPath = TextElementKt.getTextPath(styledTextCopy$default, styleParamsForElement);
                            float f20 = opacity;
                            if (!z4 || transform.getScale().getX() > 2.0f || transform.getScale().getY() > 2.0f || el.getStroke().getEnabled() || keyableVisualEffectRef4 != null || el.getFillType() == FillType.MEDIA) {
                                final float spaceWidth = TextElementKt.getSpaceWidth(styledTextCopy$default, styleParamsForElement);
                                pathT = textPath.t();
                                TextElementKt.paint.gh((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), env));
                                TextElementKt.paint.ty(yg.w6.f11697t);
                                WzY.yg ygVar = TextElementKt.paint;
                                ygVar.xMQ(ygVar.t() * (env.getRenderMode() != renderMode ? f3 : transform.getOpacity()));
                                if (el.getFillType() != FillType.MEDIA || el.getFillType() == FillType.GRADIENT) {
                                    pathT.computeBounds(TextElementKt.scratchRectF, true);
                                }
                                if (d2 <= 1.0E-5d || fFloatValue4 < 0.99999d) {
                                    pathMeasure = new PathMeasure();
                                    pathMeasure.setPath(pathT, false);
                                    length = 0.0f;
                                    while (true) {
                                        length += pathMeasure.getLength();
                                        if (pathMeasure.nextContour()) {
                                            break;
                                        }
                                        intValue2 = intValue2;
                                        fFloatValue13 = fFloatValue13;
                                    }
                                    pathMeasure.setPath(pathT, false);
                                    f5 = length * fFloatValue3;
                                    f6 = length * fFloatValue4;
                                    textPath.ijL();
                                    if (f6 > f5) {
                                        textPath.XQ(WzY.l4Z.t(pathT, 0.01f, f5, f6));
                                    }
                                }
                                if (keyableVisualEffectRef4 == null) {
                                    final int i9 = 0;
                                    final int i10 = 1;
                                    final int i11 = 2;
                                    final int i12 = 3;
                                    int i13 = intValue;
                                    List listN = HI0.iwV.n(HI0.iwV.rl(textPath.eTf(), new Function2() { // from class: com.alightcreative.app.motion.scene.S
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return Boolean.valueOf(TextElementTypeImpl.render$lambda$10$lambda$3(intValue, i9, i10, i11, i12, (C1487z) obj, (C1487z) obj2));
                                        }
                                    }), new Function2() { // from class: com.alightcreative.app.motion.scene.V
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return TextElementTypeImpl.render$lambda$10$lambda$4((C1487z) obj, (C1487z) obj2);
                                        }
                                    });
                                    if (i13 == 2) {
                                        listN = HI0.iwV.n(HI0.iwV.rl(listN, new Function2() { // from class: com.alightcreative.app.motion.scene.Qik
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return Boolean.valueOf(TextElementTypeImpl.render$lambda$10$lambda$7$lambda$5(spaceWidth, (C1487z) obj, (C1487z) obj2));
                                            }
                                        }), new Function2() { // from class: com.alightcreative.app.motion.scene.z3w
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return TextElementTypeImpl.render$lambda$10$lambda$7$lambda$6((C1487z) obj, (C1487z) obj2);
                                            }
                                        });
                                    }
                                    float f21 = f19 * 2;
                                    float f22 = 1;
                                    float size = f3 / ((listN.size() + f21) - f22);
                                    if (z2) {
                                        f8 = f22;
                                        list = listN;
                                        f7 = size;
                                        list2 = CollectionsKt.shuffled(CollectionsKt.toList(CollectionsKt.getIndices(listN)), new Random((long) (15234322 + (35432883143L * f4))));
                                    } else {
                                        list = listN;
                                        f7 = size;
                                        f8 = f22;
                                        list2 = CollectionsKt.toList(CollectionsKt.getIndices(list));
                                    }
                                    Iterator it4 = list.iterator();
                                    int i14 = 0;
                                    while (it4.hasNext()) {
                                        Object next3 = it4.next();
                                        int i15 = i14 + 1;
                                        if (i14 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        C1487z c1487z = (C1487z) next3;
                                        float fIntValue = ((((Number) list2.get(i14)).intValue() + f19) / ((list.size() + f21) - f8)) + fFloatValue7;
                                        float f23 = f7 * f19;
                                        float f24 = (f23 / 2.0f) + fIntValue;
                                        if (intValue2 == 0) {
                                            float f25 = f3;
                                            float fCoerceIn2 = RangesKt.coerceIn((fIntValue - fFloatValue5) / f23, 0.0f, f25);
                                            float fCoerceIn3 = RangesKt.coerceIn((fFloatValue6 - fIntValue) / f23, 0.0f, f25);
                                            list3 = list2;
                                            it = it4;
                                            fPow = fFloatValue5 < fFloatValue6 ? Math.min(fCoerceIn2, fCoerceIn3) : f25 - Math.max(fCoerceIn2, fCoerceIn3);
                                        } else {
                                            if (intValue2 != 1) {
                                                list3 = list2;
                                                it = it4;
                                                if (intValue2 != 2) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                if (f24 >= fFloatValue5 && f24 <= fFloatValue6) {
                                                    float f26 = (f24 - fFloatValue5) / (fFloatValue6 - fFloatValue5);
                                                    fPow = f26 < 0.5f ? f26 * 2.0f : (f8 - f26) * 2.0f;
                                                    f9 = 0.0f;
                                                    if (fFloatValue12 == f9 && fFloatValue13 == f9) {
                                                        f10 = 1.0f;
                                                    } else {
                                                        f10 = 1.0f;
                                                        fPow = new CubicBezierEasing(Math.max(fFloatValue12 / 2.0f, f9), Math.max((-fFloatValue12) / 2.0f, f9), 1.0f - Math.max(f9, fFloatValue13 / 2.0f), 1.0f - Math.max(f9, (-fFloatValue13) / 2.0f)).interpolate(fPow);
                                                    }
                                                    float f27 = fPow;
                                                    if (i2 == 0) {
                                                        Vector3D vector3DPlus = GeometryKt.plus(transform.getLocation(), GeometryKt.times(vector2DTimes, f27));
                                                        float rotation = transform.getRotation() + (fFloatValue8 * f27);
                                                        Vector2D vector2DPlus = GeometryKt.plus(GeometryKt.plus(transform.getScale(), fFloatValue9 * f27), GeometryKt.times(new Vector2D(0.0f, fFloatValue10), f27));
                                                        f11 = f8;
                                                        f13 = fFloatValue13;
                                                        f14 = f10;
                                                        i3 = intValue2;
                                                        f12 = fFloatValue12;
                                                        i5 = 2;
                                                        f16 = f21;
                                                        i7 = i2;
                                                        f17 = fFloatValue10;
                                                        vector2D = vector2DTimes;
                                                        transform2 = transform;
                                                        f15 = 0.0f;
                                                        TransformKt.transform(c1487z, Transform.copy$default(transform2, vector3DPlus, null, vector2DPlus, 0.0f, 0.0f, rotation, 0.0f, null, null, 474, null));
                                                    } else {
                                                        vector2D = vector2DTimes;
                                                        i3 = intValue2;
                                                        f11 = f8;
                                                        f12 = fFloatValue12;
                                                        f13 = fFloatValue13;
                                                        f14 = f10;
                                                        transform2 = transform;
                                                        i5 = 2;
                                                        f15 = 0.0f;
                                                        f16 = f21;
                                                        i7 = i2;
                                                        f17 = fFloatValue10;
                                                        if (i7 == 1) {
                                                            Rectangle rectangleM7 = c1487z.M7();
                                                            transform3 = transform2;
                                                            TransformKt.transform(c1487z, Transform.copy$default(transform2, GeometryKt.plus(transform2.getLocation(), GeometryKt.times(vector2D, f27)), null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 510, null));
                                                            Matrix matrix2 = new Matrix();
                                                            matrix2.postTranslate(-rectangleM7.getCx(), -rectangleM7.getCy());
                                                            float f28 = (fFloatValue9 * f27) + f14;
                                                            matrix2.postScale(f28, (f17 * f27) + f28);
                                                            matrix2.postRotate((fFloatValue8 * f27) + f14);
                                                            matrix2.postTranslate(rectangleM7.getCx(), rectangleM7.getCy());
                                                            c1487z.Mx(matrix2);
                                                        }
                                                        if (env.getRenderMode() != RenderMode.THUMB) {
                                                            fCoerceIn = f14;
                                                            f18 = fCoerceIn;
                                                        } else if (fFloatValue11 < f15) {
                                                            f18 = f14;
                                                            fCoerceIn = RangesKt.coerceIn(transform3.getOpacity() + (fFloatValue11 * f27), f15, f18);
                                                        } else {
                                                            f18 = f14;
                                                            fCoerceIn = RangesKt.coerceIn(transform3.getOpacity() - ((f18 - f27) * fFloatValue11), f15, f18);
                                                        }
                                                        WzY.yg ygVar2 = TextElementKt.paint;
                                                        if (z3) {
                                                            renderEnvironment = env;
                                                            solidColor = solidColor2;
                                                            solidColorMix = (SolidColor) KeyableKt.valueAtTime(el.getFillColor(), renderEnvironment);
                                                        } else {
                                                            renderEnvironment = env;
                                                            solidColor = solidColor2;
                                                            solidColorMix = GeometryKt.mix((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), renderEnvironment), solidColor, f27);
                                                        }
                                                        ygVar2.gh(solidColorMix);
                                                        TextElementKt.paint.ty(yg.w6.f11697t);
                                                        WzY.yg ygVar3 = TextElementKt.paint;
                                                        ygVar3.xMQ(ygVar3.t() * fCoerceIn);
                                                        i8 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
                                                        if (i8 != 1) {
                                                            sceneElement = el;
                                                            s4Var = canvas;
                                                            Unit unit = Unit.INSTANCE;
                                                        } else {
                                                            if (i8 == i5) {
                                                                throw new IllegalStateException();
                                                            }
                                                            if (i8 == 3) {
                                                                sceneElement = el;
                                                                s4Var = canvas;
                                                                s4Var.te(c1487z, TextElementKt.paint);
                                                                Unit unit2 = Unit.INSTANCE;
                                                            } else if (i8 == 4) {
                                                                s4Var = canvas;
                                                                sceneElement = el;
                                                                MediaFillKt.renderMediaFill(sceneElement, s4Var, renderEnvironment, c1487z, TextElementKt.scratchRectF);
                                                                Unit unit3 = Unit.INSTANCE;
                                                            } else {
                                                                if (i8 != 5) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                s4Var = canvas;
                                                                s4Var.J2(c1487z);
                                                                s4Var.ty(el.getFillGradient(), TextElementKt.scratchRectF, transform3.getMatrix(), transform3.getOpacity());
                                                                s4Var.r();
                                                                Unit unit4 = Unit.INSTANCE;
                                                                sceneElement = el;
                                                            }
                                                        }
                                                        if (!sceneElement.getStroke().getEnabled()) {
                                                            StrokeKt.drawStroke(sceneElement, c1487z, s4Var, renderEnvironment, Float.valueOf(fCoerceIn));
                                                        }
                                                        transform = transform3;
                                                        solidColor2 = solidColor;
                                                        f3 = f18;
                                                        i14 = i15;
                                                        list2 = list3;
                                                        f8 = f11;
                                                        fFloatValue10 = f17;
                                                        fFloatValue12 = f12;
                                                        intValue2 = i3;
                                                        fFloatValue13 = f13;
                                                        vector2DTimes = vector2D;
                                                        i2 = i7;
                                                        it4 = it;
                                                        f21 = f16;
                                                    }
                                                    transform3 = transform2;
                                                    if (env.getRenderMode() != RenderMode.THUMB) {
                                                    }
                                                    WzY.yg ygVar22 = TextElementKt.paint;
                                                    if (z3) {
                                                    }
                                                    ygVar22.gh(solidColorMix);
                                                    TextElementKt.paint.ty(yg.w6.f11697t);
                                                    WzY.yg ygVar32 = TextElementKt.paint;
                                                    ygVar32.xMQ(ygVar32.t() * fCoerceIn);
                                                    i8 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
                                                    if (i8 != 1) {
                                                    }
                                                    if (!sceneElement.getStroke().getEnabled()) {
                                                    }
                                                    transform = transform3;
                                                    solidColor2 = solidColor;
                                                    f3 = f18;
                                                    i14 = i15;
                                                    list2 = list3;
                                                    f8 = f11;
                                                    fFloatValue10 = f17;
                                                    fFloatValue12 = f12;
                                                    intValue2 = i3;
                                                    fFloatValue13 = f13;
                                                    vector2DTimes = vector2D;
                                                    i2 = i7;
                                                    it4 = it;
                                                    f21 = f16;
                                                }
                                            } else if (f24 >= fFloatValue5 && f24 <= fFloatValue6) {
                                                list3 = list2;
                                                it = it4;
                                                double d4 = 2;
                                                fPow = (float) Math.pow(2.71828d, (-Math.pow(((((double) ((f24 - fFloatValue5) / (fFloatValue6 - fFloatValue5))) - 0.5d) * d4) * 3.141592653589793d, d4)) / 2.0d);
                                            } else {
                                                list3 = list2;
                                                it = it4;
                                            }
                                            f9 = 0.0f;
                                            fPow = 0.0f;
                                            if (fFloatValue12 == f9) {
                                                f10 = 1.0f;
                                                fPow = new CubicBezierEasing(Math.max(fFloatValue12 / 2.0f, f9), Math.max((-fFloatValue12) / 2.0f, f9), 1.0f - Math.max(f9, fFloatValue13 / 2.0f), 1.0f - Math.max(f9, (-fFloatValue13) / 2.0f)).interpolate(fPow);
                                            }
                                            float f272 = fPow;
                                            if (i2 == 0) {
                                            }
                                            transform3 = transform2;
                                            if (env.getRenderMode() != RenderMode.THUMB) {
                                            }
                                            WzY.yg ygVar222 = TextElementKt.paint;
                                            if (z3) {
                                            }
                                            ygVar222.gh(solidColorMix);
                                            TextElementKt.paint.ty(yg.w6.f11697t);
                                            WzY.yg ygVar322 = TextElementKt.paint;
                                            ygVar322.xMQ(ygVar322.t() * fCoerceIn);
                                            i8 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
                                            if (i8 != 1) {
                                            }
                                            if (!sceneElement.getStroke().getEnabled()) {
                                            }
                                            transform = transform3;
                                            solidColor2 = solidColor;
                                            f3 = f18;
                                            i14 = i15;
                                            list2 = list3;
                                            f8 = f11;
                                            fFloatValue10 = f17;
                                            fFloatValue12 = f12;
                                            intValue2 = i3;
                                            fFloatValue13 = f13;
                                            vector2DTimes = vector2D;
                                            i2 = i7;
                                            it4 = it;
                                            f21 = f16;
                                        }
                                        f9 = 0.0f;
                                        if (fFloatValue12 == f9) {
                                        }
                                        float f2722 = fPow;
                                        if (i2 == 0) {
                                        }
                                        transform3 = transform2;
                                        if (env.getRenderMode() != RenderMode.THUMB) {
                                        }
                                        WzY.yg ygVar2222 = TextElementKt.paint;
                                        if (z3) {
                                        }
                                        ygVar2222.gh(solidColorMix);
                                        TextElementKt.paint.ty(yg.w6.f11697t);
                                        WzY.yg ygVar3222 = TextElementKt.paint;
                                        ygVar3222.xMQ(ygVar3222.t() * fCoerceIn);
                                        i8 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
                                        if (i8 != 1) {
                                        }
                                        if (!sceneElement.getStroke().getEnabled()) {
                                        }
                                        transform = transform3;
                                        solidColor2 = solidColor;
                                        f3 = f18;
                                        i14 = i15;
                                        list2 = list3;
                                        f8 = f11;
                                        fFloatValue10 = f17;
                                        fFloatValue12 = f12;
                                        intValue2 = i3;
                                        fFloatValue13 = f13;
                                        vector2DTimes = vector2D;
                                        i2 = i7;
                                        it4 = it;
                                        f21 = f16;
                                    }
                                    Unit unit5 = Unit.INSTANCE;
                                } else {
                                    WzY.SPz.r(textPath, transform);
                                    int i16 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
                                    if (i16 == 1) {
                                        Unit unit6 = Unit.INSTANCE;
                                    } else {
                                        if (i16 == 2) {
                                            throw new IllegalStateException();
                                        }
                                        if (i16 == 3) {
                                            canvas.te(textPath, TextElementKt.paint);
                                            Unit unit7 = Unit.INSTANCE;
                                        } else if (i16 == 4) {
                                            MediaFillKt.renderMediaFill(el, canvas, env, textPath, TextElementKt.scratchRectF);
                                            Unit unit8 = Unit.INSTANCE;
                                        } else {
                                            if (i16 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            canvas.J2(textPath);
                                            canvas.ty(el.getFillGradient(), TextElementKt.scratchRectF, matrix, transform.getOpacity());
                                            canvas.r();
                                            Unit unit9 = Unit.INSTANCE;
                                        }
                                    }
                                    if (el.getStroke().getEnabled()) {
                                        StrokeKt.drawStroke$default(el, textPath, canvas, env, null, 8, null);
                                    }
                                }
                            } else {
                                Bitmap textBitmap = TextElementKt.getTextBitmap(styledTextCopy$default, canvas.rl(), styleParamsForElement);
                                TextElementKt.scratchBounds.set((-r0) / 2.0f, (-r2) / 2.0f, el.getText().getWrapWidth() / 2.0f, ((textBitmap.getHeight() * el.getText().getWrapWidth()) / textBitmap.getWidth()) / 2.0f);
                                int i17 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
                                if (i17 == 1) {
                                    Unit unit10 = Unit.INSTANCE;
                                } else {
                                    if (i17 == 2) {
                                        throw new IllegalStateException();
                                    }
                                    if (i17 == 3) {
                                        s4.j.rl(canvas, textBitmap, TextElementKt.scratchBounds, matrix, f20, TextElementKt.paint, null, null, 96, null);
                                        Unit unit11 = Unit.INSTANCE;
                                    } else if (i17 == 4) {
                                        Unit unit12 = Unit.INSTANCE;
                                    } else {
                                        if (i17 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        s4.j.rl(canvas, textBitmap, TextElementKt.scratchBounds, matrix, f20, TextElementKt.paint, el.getFillGradient(), null, 64, null);
                                        Unit unit13 = Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        canvas.n();
                    }
                    z3 = booleanValue2;
                    black = SolidColor.INSTANCE.getBLACK();
                    styleParamsForElement = StyleParams.INSTANCE.forElement(el, env.getTime());
                    RenderMode renderMode22 = env.getRenderMode();
                    renderMode = RenderMode.THUMB;
                    if (renderMode22 == renderMode) {
                    }
                    transform = transformValueAtTime;
                    userElementTagId = SceneElementKt.getUserElementTagId(el.getText().getText());
                    if (userElementTagId != null) {
                    }
                    if (str != null) {
                        styledTextCopy$default = StyledText.copy$default(el.getText(), str, 0.0f, null, 0, null, 30, null);
                        SolidColor solidColor22 = black;
                        d2 = fFloatValue3;
                        if (d2 <= 1.0E-5d) {
                            textPath = TextElementKt.getTextPath(styledTextCopy$default, styleParamsForElement);
                            float f202 = opacity;
                            if (z4) {
                                final float spaceWidth2 = TextElementKt.getSpaceWidth(styledTextCopy$default, styleParamsForElement);
                                pathT = textPath.t();
                                TextElementKt.paint.gh((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), env));
                                TextElementKt.paint.ty(yg.w6.f11697t);
                                WzY.yg ygVar4 = TextElementKt.paint;
                                ygVar4.xMQ(ygVar4.t() * (env.getRenderMode() != renderMode ? f3 : transform.getOpacity()));
                                if (el.getFillType() != FillType.MEDIA) {
                                    pathT.computeBounds(TextElementKt.scratchRectF, true);
                                    if (d2 <= 1.0E-5d) {
                                        pathMeasure = new PathMeasure();
                                        pathMeasure.setPath(pathT, false);
                                        length = 0.0f;
                                        while (true) {
                                            length += pathMeasure.getLength();
                                            if (pathMeasure.nextContour()) {
                                            }
                                            intValue2 = intValue2;
                                            fFloatValue13 = fFloatValue13;
                                        }
                                        pathMeasure.setPath(pathT, false);
                                        f5 = length * fFloatValue3;
                                        f6 = length * fFloatValue4;
                                        textPath.ijL();
                                        if (f6 > f5) {
                                        }
                                        if (keyableVisualEffectRef4 == null) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    canvas.n();
                }
                z2 = booleanValue;
                if (keyableVisualEffectRef4 == null) {
                    z3 = booleanValue2;
                    black = SolidColor.INSTANCE.getBLACK();
                }
                styleParamsForElement = StyleParams.INSTANCE.forElement(el, env.getTime());
                RenderMode renderMode222 = env.getRenderMode();
                renderMode = RenderMode.THUMB;
                if (renderMode222 == renderMode) {
                }
                transform = transformValueAtTime;
                userElementTagId = SceneElementKt.getUserElementTagId(el.getText().getText());
                if (userElementTagId != null) {
                }
                if (str != null) {
                }
                canvas.n();
            }
            f4 = fFloatValue2;
            if (keyableVisualEffectRef4 != null) {
                z2 = booleanValue;
            }
            if (keyableVisualEffectRef4 == null) {
            }
            styleParamsForElement = StyleParams.INSTANCE.forElement(el, env.getTime());
            RenderMode renderMode2222 = env.getRenderMode();
            renderMode = RenderMode.THUMB;
            if (renderMode2222 == renderMode) {
            }
            transform = transformValueAtTime;
            userElementTagId = SceneElementKt.getUserElementTagId(el.getText().getText());
            if (userElementTagId != null) {
            }
            if (str != null) {
            }
            canvas.n();
        }
        f3 = 1.0f;
        fFloatValue = 0.0f;
        float f192 = fFloatValue + f3;
        if (keyableVisualEffectRef4 != null) {
        }
        if (keyableVisualEffectRef4 != null) {
        }
        if (keyableVisualEffectRef4 != null) {
        }
        if (keyableVisualEffectRef4 == null) {
            f4 = fFloatValue2;
        }
        if (keyableVisualEffectRef4 != null) {
        }
        if (keyableVisualEffectRef4 == null) {
        }
        styleParamsForElement = StyleParams.INSTANCE.forElement(el, env.getTime());
        RenderMode renderMode22222 = env.getRenderMode();
        renderMode = RenderMode.THUMB;
        if (renderMode22222 == renderMode) {
        }
        transform = transformValueAtTime;
        userElementTagId = SceneElementKt.getUserElementTagId(el.getText().getText());
        if (userElementTagId != null) {
        }
        if (str != null) {
        }
        canvas.n();
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
        if (SceneElementRenderingKt.renderGeneralElementSelectionAndEditMode(el, canvas, env, selection, viewport) || env.getEditMode() == 2131362632) {
            return;
        }
        if (!selection.isElementDirectlySelected(el.getId()) || (env.getEditMode() != 2131362631 && env.getEditMode() != 2131362633)) {
            EnumC1485c enumC1485cN = EnumC1485c.f11632n.n(selection, el.getId(), env.getEditMode());
            if (enumC1485cN != EnumC1485c.f11635t) {
                canvas.O();
                canvas.XQ(viewport);
                TextElementKt.scratchPath.ijL();
                TextElementKt.scratchPath.WPU(SceneElementKt.boundsInScene(el, env.getScene()));
                TransformKt.transform(TextElementKt.scratchPath, CameraElementKt.applyCameraAndParenting(el, env, env.getTime()).getTransform().valueAtTime(env));
                WzY.SPz.qie(canvas, TextElementKt.scratchPath, enumC1485cN, null, null, 12, null);
                canvas.n();
                return;
            }
            return;
        }
        Transform transformValueAtTime = CameraElementKt.applyCameraAndParenting(el, env, env.getTime()).getTransform().valueAtTime(env);
        TextElementKt.paint.gh((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), env));
        canvas.O();
        canvas.XQ(viewport);
        canvas.xMQ(true);
        Bitmap textBitmap = TextElementKt.getTextBitmap(el.getText(), canvas.rl(), StyleParams.INSTANCE.forElement(el, env.getTime()));
        int wrapWidth = el.getText().getWrapWidth();
        int height = (textBitmap.getHeight() * el.getText().getWrapWidth()) / textBitmap.getWidth();
        TextElementKt.selectionPaintTop.gh(env.colorFromAttr(2130968731, TextElementKt.selectionPaintTop.nr()));
        float f3 = el.getText().getAlign() == StyledTextAlign.RIGHT ? -1.0f : 1.0f;
        int editMode = env.getEditMode();
        if (editMode == 2131362631) {
            C1487z c1487z = new C1487z();
            C1487z c1487z2 = new C1487z();
            float f4 = wrapWidth / 2.0f;
            c1487z.S((-wrapWidth) / 2.0f, (-height) / 2.0f, f4, height / 2.0f);
            c1487z2.Z(f4 * f3, 0.0f, canvas.Uo() * 24.0f);
            c1487z2.Mx(transformValueAtTime.getMatrix());
            c1487z.Mx(transformValueAtTime.getMatrix());
            canvas.te(c1487z, TextElementKt.selectionPaintBase);
            canvas.te(c1487z2, TextElementKt.selectionPaintBase);
            canvas.te(c1487z, TextElementKt.selectionPaintTop);
            TextElementKt.selectionPaintTop.ty(yg.w6.f11697t);
            canvas.te(c1487z2, TextElementKt.selectionPaintTop);
            TextElementKt.selectionPaintTop.ty(yg.w6.f11694O);
        } else {
            if (editMode != 2131362633) {
                throw new IllegalStateException();
            }
            C1487z c1487z3 = new C1487z();
            C1487z c1487z4 = new C1487z();
            C1487z c1487z5 = new C1487z();
            float f5 = wrapWidth / 2.0f;
            float f6 = f3 * f5;
            c1487z4.Y(f6, canvas.aYN() * 2.0f);
            c1487z4.J(f6, (-canvas.aYN()) * 2.0f);
            c1487z3.S((-wrapWidth) / 2.0f, (-height) / 2.0f, f5, height / 2.0f);
            c1487z5.Z(f6, 0.0f, canvas.Uo() * 24.0f);
            c1487z5.Mx(transformValueAtTime.getMatrix());
            c1487z3.Mx(transformValueAtTime.getMatrix());
            c1487z4.Mx(transformValueAtTime.getMatrix());
            canvas.te(c1487z4, TextElementKt.selectionPaintBase);
            canvas.te(c1487z3, TextElementKt.selectionPaintBase);
            canvas.te(c1487z5, TextElementKt.selectionPaintBase);
            canvas.te(c1487z3, TextElementKt.selectionPaintTop);
            TextElementKt.selectionPaintTop.ty(yg.w6.f11697t);
            canvas.te(c1487z5, TextElementKt.selectionPaintTop);
            TextElementKt.selectionPaintTop.ty(yg.w6.f11694O);
        }
        canvas.n();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        serializer.startTag(namespace, "text");
        SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
        HI0.YzO.n(serializer, namespace, "size", el.getText().getFontSize());
        serializer.attribute(namespace, "font", el.getText().getFont());
        HI0.YzO.rl(serializer, namespace, "wrapWidth", el.getText().getWrapWidth());
        String string = el.getText().getAlign().toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        serializer.attribute(namespace, "align", lowerCase);
        SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
        if (el.getText().getText().length() > 0) {
            serializer.startTag(namespace, AppLovinEventTypes.USER_VIEWED_CONTENT);
            serializer.text(el.getText().getText());
            serializer.endTag(namespace, AppLovinEventTypes.USER_VIEWED_CONTENT);
        }
        serializer.endTag(namespace, "text");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException {
        StyledTextAlign styledTextAlign;
        Integer intOrNull;
        Float floatOrNull;
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, ns, "text");
        SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.Text, ns, parser);
        String attributeValue = parser.getAttributeValue(ns, "size");
        float fFloatValue = (attributeValue == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue)) == null) ? 18.0f : floatOrNull.floatValue();
        String attributeValue2 = parser.getAttributeValue(ns, "wrapWidth");
        int iIntValue = (attributeValue2 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue2)) == null) ? 512 : intOrNull.intValue();
        String attributeValue3 = parser.getAttributeValue(ns, "font");
        String str = attributeValue3 == null ? "" : attributeValue3;
        String attributeValue4 = parser.getAttributeValue(ns, "align");
        if (attributeValue4 != null) {
            StyledTextAlign[] styledTextAlignArrValues = StyledTextAlign.values();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = attributeValue4.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            styledTextAlign = (StyledTextAlign) HI0.Ew.n(styledTextAlignArrValues, upperCase);
            if (styledTextAlign == null) {
                styledTextAlign = StyledTextAlign.LEFT;
            }
        }
        StyledTextAlign styledTextAlign2 = styledTextAlign;
        SceneElement sceneElementUnserializeCommonChildTag = sceneElementUnserializeBaseSceneElement;
        String strO = "";
        while (parser.next() != 3) {
            if (parser.getEventType() == 2) {
                int depth = parser.getDepth();
                String name = parser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                    strO = HI0.YzO.O(parser);
                } else {
                    sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeCommonChildTag, name, ns, parser, isPackage);
                }
                if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        return SceneElement.copy$default(sceneElementUnserializeCommonChildTag, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, new StyledText(strO, fFloatValue, styledTextAlign2, iIntValue, str), null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -2097153, 127, null);
    }

    private TextElementTypeImpl() {
    }
}
