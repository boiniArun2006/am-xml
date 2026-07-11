package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.EnumC1485c;
import WzY.yg;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.opengl.GLES20;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.OptionalKeyableVector2D;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeRef;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.caoccao.javet.exceptions.JavetError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import yc.RP;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b0\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001a\u0010.\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001a\u00100\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001a\u00102\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001a\u00104\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u001a\u00106\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001a\u00108\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b8\u0010'R\u001a\u00109\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001a\u0010;\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001a\u0010=\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u001a\u0010?\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'R\u001a\u0010A\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'R\u001a\u0010C\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u001a\u0010E\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'R\u001a\u0010G\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bH\u0010'R\u001a\u0010I\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'¨\u0006K"}, d2 = {"Lcom/alightcreative/app/motion/scene/ShapeElementTypeImpl;", "Lcom/alightcreative/app/motion/scene/ISceneElementType;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "render", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderSelection", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeElement", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "renderOutline", "xmlTag", "Ljava/lang/String;", "getXmlTag", "()Ljava/lang/String;", "hasTransform", "Z", "getHasTransform", "()Z", "hasVisualContent", "getHasVisualContent", "hasFillColor", "getHasFillColor", "hasFillImage", "getHasFillImage", "hasFillVideo", "getHasFillVideo", "hasFillGradient", "getHasFillGradient", "hasFillType", "getHasFillType", "hasOutline", "getHasOutline", "hasStroke", "getHasStroke", "isRenderable", "hasVisualEffects", "getHasVisualEffects", "hasBlendingMode", "getHasBlendingMode", "hasBorderAndShadow", "getHasBorderAndShadow", "hasGain", "getHasGain", "hasVolume", "getHasVolume", "hasText", "getHasText", "hasSourceMedia", "getHasSourceMedia", "hasNestedScene", "getHasNestedScene", "hasOpacity", "getHasOpacity", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShapeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeElement.kt\ncom/alightcreative/app/motion/scene/ShapeElementTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n+ 6 KeyableSerializer.kt\ncom/alightcreative/app/motion/scene/KeyableSerializerKt\n*L\n1#1,835:1\n1#2:836\n785#3:837\n796#3:838\n1872#3,2:839\n797#3,2:841\n1874#3:843\n799#3:844\n1368#3:845\n1454#3,2:846\n1557#3:848\n1628#3,3:849\n1456#3,3:852\n1557#3:855\n1628#3,3:856\n1872#3,2:859\n1755#3,3:861\n1755#3,3:864\n1755#3,3:867\n1755#3,3:870\n1755#3,3:873\n1874#3:876\n1872#3,3:877\n1872#3,3:880\n1755#3,3:885\n1863#3,2:888\n1863#3:890\n1863#3,2:891\n1864#3:893\n1863#3,2:1020\n774#3:1022\n865#3,2:1023\n1863#3,2:1025\n216#4,2:883\n45#5,5:894\n45#5,5:899\n45#5,5:904\n45#5,5:909\n50#5,7:947\n50#5,7:954\n45#5,5:961\n50#5,7:999\n50#5,7:1006\n50#5,7:1013\n52#6,11:914\n52#6,11:925\n52#6,11:936\n52#6,11:966\n52#6,11:977\n52#6,11:988\n*S KotlinDebug\n*F\n+ 1 ShapeElement.kt\ncom/alightcreative/app/motion/scene/ShapeElementTypeImpl\n*L\n194#1:837\n194#1:838\n194#1:839,2\n194#1:841,2\n194#1:843\n194#1:844\n194#1:845\n194#1:846,2\n195#1:848\n195#1:849,3\n194#1:852,3\n204#1:855\n204#1:856,3\n207#1:859,2\n216#1:861,3\n240#1:864,3\n289#1:867,3\n292#1:870,3\n293#1:873,3\n207#1:876\n310#1:877,3\n334#1:880,3\n464#1:885,3\n468#1:888,2\n478#1:890\n485#1:891,2\n478#1:893\n608#1:1020,2\n627#1:1022\n627#1:1023,2\n627#1:1025,2\n459#1:883,2\n526#1:894,5\n537#1:899,5\n551#1:904,5\n557#1:909,5\n557#1:947,7\n551#1:954,7\n578#1:961,5\n578#1:999,7\n537#1:1006,7\n526#1:1013,7\n559#1:914,11\n560#1:925,11\n561#1:936,11\n580#1:966,11\n581#1:977,11\n582#1:988,11\n*E\n"})
public final class ShapeElementTypeImpl implements ISceneElementType {
    public static final int $stable = 0;
    private static final boolean hasNestedScene = false;
    private static final boolean hasSourceMedia = false;
    private static final boolean hasText = false;
    private static final boolean hasVolume = false;
    public static final ShapeElementTypeImpl INSTANCE = new ShapeElementTypeImpl();
    private static final String xmlTag = "shape";
    private static final boolean hasTransform = true;
    private static final boolean hasVisualContent = true;
    private static final boolean hasFillColor = true;
    private static final boolean hasFillImage = true;
    private static final boolean hasFillVideo = true;
    private static final boolean hasFillGradient = true;
    private static final boolean hasFillType = true;
    private static final boolean hasOutline = true;
    private static final boolean hasStroke = true;
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

    /* JADX WARN: Code restructure failed: missing block: B:210:0x03fd, code lost:
    
        throw new java.lang.IllegalStateException("Did not consume all tag contents");
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x044c, code lost:
    
        throw new java.lang.IllegalStateException("Did not consume all tag contents");
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0713, code lost:
    
        throw new java.lang.IllegalStateException("Did not consume all tag contents");
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0782, code lost:
    
        throw new java.lang.IllegalStateException("Did not consume all tag contents");
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x03f8 A[ADDED_TO_REGION, EDGE_INSN: B:465:0x03f8->B:209:0x03f8 BREAK  A[LOOP:0: B:7:0x0032->B:494:0x0032, LOOP_LABEL: LOOP:0: B:7:0x0032->B:494:0x0032], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x070e A[ADDED_TO_REGION, EDGE_INSN: B:488:0x070e->B:387:0x070e BREAK  A[LOOP:0: B:7:0x0032->B:494:0x0032, LOOP_LABEL: LOOP:0: B:7:0x0032->B:494:0x0032], REMOVE, SYNTHETIC] */
    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException, MalformedSceneException {
        List<UserParameter> parameters;
        KeyableUserParameterValue defaultKeyableUserParameterValue;
        String str;
        int i2;
        String str2;
        LinkedHashMap linkedHashMap;
        String str3;
        String str4;
        ArrayList arrayList;
        String str5;
        int i3;
        ArrayList arrayList2;
        String str6;
        Vector2D Vector2D;
        Vector2D Vector2D2;
        Vector2D Vector2D3;
        boolean z2;
        String str7;
        ArrayList arrayList3;
        String str8;
        Vector2D Vector2D4;
        Vector2D Vector2D5;
        Vector2D Vector2D6;
        String str9 = "knot";
        Intrinsics.checkNotNullParameter(parser, "parser");
        int i5 = 2;
        parser.require(2, ns, "shape");
        SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.Shape, ns, parser);
        String attributeValue = parser.getAttributeValue(ns, CmcdData.STREAMING_FORMAT_SS);
        KeyableCompoundCubicBSpline empty = null;
        String strQie = attributeValue != null ? HI0.gnv.qie(attributeValue, ".", "com.alightcreative.shapes.") : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        SceneElement sceneElementUnserializeCommonChildTag = sceneElementUnserializeBaseSceneElement;
        loop0: while (true) {
            if (parser.next() == 3) {
                String str10 = strQie;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                if (str10 == null) {
                    if (empty == null) {
                        empty = KeyableCompoundCubicBSpline.INSTANCE.getEMPTY();
                    }
                    return SceneElement.copy$default(sceneElementUnserializeCommonChildTag, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, empty, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
                }
                LiveShape liveShapeLiveShapeById = LiveShapeKt.liveShapeById(str10);
                if (liveShapeLiveShapeById != null && (parameters = liveShapeLiveShapeById.getParameters()) != null) {
                    for (UserParameter userParameter : parameters) {
                        if (!linkedHashMap3.containsKey(userParameter.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) != null) {
                            linkedHashMap3.put(userParameter.getName(), defaultKeyableUserParameterValue);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                SceneElement sceneElementCopy$default = SceneElement.copy$default(sceneElementUnserializeCommonChildTag, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, new LiveShapeRef(str10, linkedHashMap3), 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65537, 127, null);
                final CompoundCubicBSpline shapeOutline = LiveShapeScriptKt.getShapeOutline(sceneElementCopy$default, 0.0f);
                XoT.C.Uo(INSTANCE, new Function0() { // from class: com.alightcreative.app.motion.scene.FPL
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShapeElementTypeImpl.unserializeElement$lambda$32$lambda$31(shapeOutline);
                    }
                });
                Unit unit2 = Unit.INSTANCE;
                return SceneElement.copy$default(sceneElementCopy$default, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, CubicBSplineKt.keyable(shapeOutline), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
            }
            if (parser.getEventType() == i5) {
                int depth = parser.getDepth();
                String name = parser.getName();
                String str11 = "getName(...)";
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, JavetError.PARAMETER_PATH)) {
                    String str12 = "d";
                    String attributeValue2 = parser.getAttributeValue(ns, "d");
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    if (StringsKt.trim((CharSequence) attributeValue2).toString().length() > 0) {
                        KeyableCompoundCubicBSpline keyableCompoundCubicBSplineKeyable = CubicBSplineKt.keyable(CubicBSplineKt.compoundCubicBSplineFromSVGPath(attributeValue2));
                        HI0.YzO.J2(parser);
                        empty = keyableCompoundCubicBSplineKeyable;
                        str = str9;
                        i2 = depth;
                        str2 = strQie;
                        linkedHashMap = linkedHashMap2;
                    } else {
                        String str13 = "closed";
                        String attributeValue3 = parser.getAttributeValue(ns, "closed");
                        boolean z3 = attributeValue3 != null ? Boolean.parseBoolean(attributeValue3) : false;
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (int i7 = 3; parser.next() != i7; i7 = 3) {
                            if (parser.getEventType() == 2) {
                                int depth2 = parser.getDepth();
                                String name2 = parser.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, str11);
                                String str14 = strQie;
                                boolean zAreEqual = Intrinsics.areEqual(name2, "contour");
                                int i8 = depth;
                                SceneElement sceneElement = sceneElementUnserializeCommonChildTag;
                                Class cls = Double.TYPE;
                                Class cls2 = Float.TYPE;
                                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                                if (!zAreEqual) {
                                    str4 = str12;
                                    ArrayList arrayList6 = arrayList4;
                                    String str15 = str9;
                                    arrayList = arrayList5;
                                    str5 = str13;
                                    String str16 = str11;
                                    i3 = depth2;
                                    if (!Intrinsics.areEqual(name2, str15)) {
                                        str3 = str15;
                                        arrayList2 = arrayList6;
                                        str6 = str16;
                                        HI0.YzO.J2(parser);
                                    } else {
                                        if (!arrayList.isEmpty()) {
                                            throw new MalformedSceneException("Cannot mix <contour> and <knot> at same level within <path>", null, false, 6, null);
                                        }
                                        Keyable zero = KeyableVector2D.INSTANCE.getZERO();
                                        Object obj = OptionalKeyableVector2D.NONE.INSTANCE;
                                        Object obj2 = obj;
                                        while (parser.next() != 3) {
                                            if (parser.getEventType() == 2) {
                                                int depth3 = parser.getDepth();
                                                String name3 = parser.getName();
                                                String str17 = str16;
                                                Intrinsics.checkNotNullExpressionValue(name3, str17);
                                                String str18 = str15;
                                                int iHashCode = name3.hashCode();
                                                Object obj3 = obj;
                                                if (iHashCode == 112) {
                                                    if (name3.equals(TtmlNode.TAG_P)) {
                                                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Vector2D.class);
                                                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                                                            Vector2D = (Vector2D) Float.valueOf(0.0f);
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                                                            Vector2D = (Vector2D) Double.valueOf(0.0d);
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                                            Vector2D = GeometryKt.Vector2D();
                                                            if (Vector2D == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                                            Parcelable parcelableVector3D = GeometryKt.Vector3D();
                                                            if (parcelableVector3D == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D = (Vector2D) parcelableVector3D;
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                                            Parcelable parcelableVector4D = GeometryKt.Vector4D();
                                                            if (parcelableVector4D == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D = (Vector2D) parcelableVector4D;
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                                            Object identity = Quaternion.INSTANCE.getIDENTITY();
                                                            if (identity == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D = (Vector2D) identity;
                                                        } else {
                                                            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            Object objSolidColor = ColorKt.SolidColor();
                                                            if (objSolidColor == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D = (Vector2D) objSolidColor;
                                                        }
                                                        Keyable keyableUnserializeKeyable = KeyableSerializerKt.unserializeKeyable(ns, parser, TtmlNode.TAG_P, Vector2D, isPackage);
                                                        Unit unit3 = Unit.INSTANCE;
                                                        zero = keyableUnserializeKeyable;
                                                    }
                                                    if (parser.getEventType() == 3) {
                                                    }
                                                } else {
                                                    if (iHashCode == 3365) {
                                                        if (name3.equals("in")) {
                                                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                                                            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                                                                Vector2D2 = (Vector2D) Float.valueOf(0.0f);
                                                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                                                                Vector2D2 = (Vector2D) Double.valueOf(0.0d);
                                                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                                                Vector2D2 = GeometryKt.Vector2D();
                                                                if (Vector2D2 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                }
                                                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                                                Parcelable parcelableVector3D2 = GeometryKt.Vector3D();
                                                                if (parcelableVector3D2 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                }
                                                                Vector2D2 = (Vector2D) parcelableVector3D2;
                                                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                                                Parcelable parcelableVector4D2 = GeometryKt.Vector4D();
                                                                if (parcelableVector4D2 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                }
                                                                Vector2D2 = (Vector2D) parcelableVector4D2;
                                                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                                                Object identity2 = Quaternion.INSTANCE.getIDENTITY();
                                                                if (identity2 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                }
                                                                Vector2D2 = (Vector2D) identity2;
                                                            } else {
                                                                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                Object objSolidColor2 = ColorKt.SolidColor();
                                                                if (objSolidColor2 == null) {
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                }
                                                                Vector2D2 = (Vector2D) objSolidColor2;
                                                            }
                                                            Object objUnserializeKeyable = KeyableSerializerKt.unserializeKeyable(ns, parser, "in", Vector2D2, isPackage);
                                                            Unit unit4 = Unit.INSTANCE;
                                                            obj3 = objUnserializeKeyable;
                                                        }
                                                        if (parser.getEventType() == 3) {
                                                            break loop0;
                                                        }
                                                        break loop0;
                                                        break loop0;
                                                    }
                                                    if (iHashCode == 110414 && name3.equals("out")) {
                                                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                                                        if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls2))) {
                                                            Vector2D3 = (Vector2D) Float.valueOf(0.0f);
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(cls))) {
                                                            Vector2D3 = (Vector2D) Double.valueOf(0.0d);
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                                            Vector2D3 = GeometryKt.Vector2D();
                                                            if (Vector2D3 == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                                            Parcelable parcelableVector3D3 = GeometryKt.Vector3D();
                                                            if (parcelableVector3D3 == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D3 = (Vector2D) parcelableVector3D3;
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                                            Parcelable parcelableVector4D3 = GeometryKt.Vector4D();
                                                            if (parcelableVector4D3 == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D3 = (Vector2D) parcelableVector4D3;
                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                                            Object identity3 = Quaternion.INSTANCE.getIDENTITY();
                                                            if (identity3 == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D3 = (Vector2D) identity3;
                                                        } else {
                                                            if (!Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            Object objSolidColor3 = ColorKt.SolidColor();
                                                            if (objSolidColor3 == null) {
                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                            }
                                                            Vector2D3 = (Vector2D) objSolidColor3;
                                                        }
                                                        Object objUnserializeKeyable2 = KeyableSerializerKt.unserializeKeyable(ns, parser, "out", Vector2D3, isPackage);
                                                        Unit unit5 = Unit.INSTANCE;
                                                        obj2 = objUnserializeKeyable2;
                                                    } else {
                                                        HI0.YzO.J2(parser);
                                                        Unit unit6 = Unit.INSTANCE;
                                                    }
                                                    if (parser.getEventType() == 3 || parser.getDepth() != depth3) {
                                                        break loop0;
                                                    }
                                                    str16 = str17;
                                                    obj = obj3;
                                                    str15 = str18;
                                                }
                                            }
                                        }
                                        str3 = str15;
                                        str6 = str16;
                                        KeyableCBKnot keyableCBKnot = new KeyableCBKnot(zero, (OptionalKeyableVector2D) obj, (OptionalKeyableVector2D) obj2);
                                        arrayList2 = arrayList6;
                                        arrayList2.add(keyableCBKnot);
                                    }
                                } else {
                                    if (!arrayList4.isEmpty()) {
                                        throw new MalformedSceneException("Cannot mix <contour> and <knot> at same level within <path>", null, false, 6, null);
                                    }
                                    String attributeValue4 = parser.getAttributeValue(ns, str12);
                                    if (attributeValue4 == null) {
                                        attributeValue4 = "";
                                    }
                                    str4 = str12;
                                    String attributeValue5 = parser.getAttributeValue(ns, "exclude");
                                    boolean z4 = attributeValue5 != null ? Boolean.parseBoolean(attributeValue5) : false;
                                    if (StringsKt.trim((CharSequence) attributeValue4).toString().length() <= 0) {
                                        boolean z5 = z4;
                                        String attributeValue6 = parser.getAttributeValue(ns, str13);
                                        boolean z6 = attributeValue6 != null ? Boolean.parseBoolean(attributeValue6) : false;
                                        str5 = str13;
                                        ArrayList arrayList7 = new ArrayList();
                                        i3 = depth2;
                                        while (true) {
                                            ArrayList arrayList8 = arrayList4;
                                            if (parser.next() == 3) {
                                                str3 = str9;
                                                arrayList = arrayList5;
                                                arrayList.add(new KeyableCubicBSpline(arrayList7, z6, z5));
                                                arrayList2 = arrayList8;
                                                str6 = str11;
                                                break;
                                            }
                                            if (parser.getEventType() == 2) {
                                                int depth4 = parser.getDepth();
                                                String name4 = parser.getName();
                                                Intrinsics.checkNotNullExpressionValue(name4, str11);
                                                if (Intrinsics.areEqual(name4, str9)) {
                                                    Keyable zero2 = KeyableVector2D.INSTANCE.getZERO();
                                                    Object obj4 = OptionalKeyableVector2D.NONE.INSTANCE;
                                                    str7 = str9;
                                                    Object obj5 = obj4;
                                                    while (true) {
                                                        arrayList3 = arrayList5;
                                                        if (parser.next() == 3) {
                                                            z2 = z5;
                                                            str8 = str11;
                                                            arrayList7.add(new KeyableCBKnot(zero2, (OptionalKeyableVector2D) obj4, (OptionalKeyableVector2D) obj5));
                                                            break;
                                                        }
                                                        if (parser.getEventType() == 2) {
                                                            int depth5 = parser.getDepth();
                                                            String name5 = parser.getName();
                                                            Intrinsics.checkNotNullExpressionValue(name5, str11);
                                                            String str19 = str11;
                                                            int iHashCode2 = name5.hashCode();
                                                            boolean z7 = z5;
                                                            if (iHashCode2 == 112) {
                                                                if (name5.equals(TtmlNode.TAG_P)) {
                                                                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                                                                    if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls2))) {
                                                                        Vector2D4 = (Vector2D) Float.valueOf(0.0f);
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(cls))) {
                                                                        Vector2D4 = (Vector2D) Double.valueOf(0.0d);
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                                                        Vector2D4 = GeometryKt.Vector2D();
                                                                        if (Vector2D4 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                                                        Parcelable parcelableVector3D4 = GeometryKt.Vector3D();
                                                                        if (parcelableVector3D4 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D4 = (Vector2D) parcelableVector3D4;
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                                                        Parcelable parcelableVector4D4 = GeometryKt.Vector4D();
                                                                        if (parcelableVector4D4 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D4 = (Vector2D) parcelableVector4D4;
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                                                        Object identity4 = Quaternion.INSTANCE.getIDENTITY();
                                                                        if (identity4 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D4 = (Vector2D) identity4;
                                                                    } else {
                                                                        if (!Intrinsics.areEqual(orCreateKotlinClass4, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        Object objSolidColor4 = ColorKt.SolidColor();
                                                                        if (objSolidColor4 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D4 = (Vector2D) objSolidColor4;
                                                                    }
                                                                    Keyable keyableUnserializeKeyable2 = KeyableSerializerKt.unserializeKeyable(ns, parser, TtmlNode.TAG_P, Vector2D4, isPackage);
                                                                    Unit unit7 = Unit.INSTANCE;
                                                                    zero2 = keyableUnserializeKeyable2;
                                                                }
                                                                if (parser.getEventType() == 3) {
                                                                }
                                                            } else {
                                                                if (iHashCode2 == 3365) {
                                                                    if (name5.equals("in")) {
                                                                        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                                                                        if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls2))) {
                                                                            Vector2D5 = (Vector2D) Float.valueOf(0.0f);
                                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(cls))) {
                                                                            Vector2D5 = (Vector2D) Double.valueOf(0.0d);
                                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                                                            Vector2D5 = GeometryKt.Vector2D();
                                                                            if (Vector2D5 == null) {
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                            }
                                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                                                            Parcelable parcelableVector3D5 = GeometryKt.Vector3D();
                                                                            if (parcelableVector3D5 == null) {
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                            }
                                                                            Vector2D5 = (Vector2D) parcelableVector3D5;
                                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                                                            Parcelable parcelableVector4D5 = GeometryKt.Vector4D();
                                                                            if (parcelableVector4D5 == null) {
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                            }
                                                                            Vector2D5 = (Vector2D) parcelableVector4D5;
                                                                        } else if (Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                                                            Object identity5 = Quaternion.INSTANCE.getIDENTITY();
                                                                            if (identity5 == null) {
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                            }
                                                                            Vector2D5 = (Vector2D) identity5;
                                                                        } else {
                                                                            if (!Intrinsics.areEqual(orCreateKotlinClass5, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            Object objSolidColor5 = ColorKt.SolidColor();
                                                                            if (objSolidColor5 == null) {
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                            }
                                                                            Vector2D5 = (Vector2D) objSolidColor5;
                                                                        }
                                                                        Object objUnserializeKeyable3 = KeyableSerializerKt.unserializeKeyable(ns, parser, "in", Vector2D5, isPackage);
                                                                        Unit unit8 = Unit.INSTANCE;
                                                                        obj4 = objUnserializeKeyable3;
                                                                    }
                                                                    if (parser.getEventType() == 3) {
                                                                        break loop0;
                                                                    }
                                                                    break loop0;
                                                                    break loop0;
                                                                }
                                                                if (iHashCode2 == 110414 && name5.equals("out")) {
                                                                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(Vector2D.class);
                                                                    if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls2))) {
                                                                        Vector2D6 = (Vector2D) Float.valueOf(0.0f);
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(cls))) {
                                                                        Vector2D6 = (Vector2D) Double.valueOf(0.0d);
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
                                                                        Vector2D6 = GeometryKt.Vector2D();
                                                                        if (Vector2D6 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Vector3D.class))) {
                                                                        Parcelable parcelableVector3D6 = GeometryKt.Vector3D();
                                                                        if (parcelableVector3D6 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D6 = (Vector2D) parcelableVector3D6;
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Vector4D.class))) {
                                                                        Parcelable parcelableVector4D6 = GeometryKt.Vector4D();
                                                                        if (parcelableVector4D6 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D6 = (Vector2D) parcelableVector4D6;
                                                                    } else if (Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(Quaternion.class))) {
                                                                        Object identity6 = Quaternion.INSTANCE.getIDENTITY();
                                                                        if (identity6 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D6 = (Vector2D) identity6;
                                                                    } else {
                                                                        if (!Intrinsics.areEqual(orCreateKotlinClass6, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        Object objSolidColor6 = ColorKt.SolidColor();
                                                                        if (objSolidColor6 == null) {
                                                                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                                                                        }
                                                                        Vector2D6 = (Vector2D) objSolidColor6;
                                                                    }
                                                                    Object objUnserializeKeyable4 = KeyableSerializerKt.unserializeKeyable(ns, parser, "out", Vector2D6, isPackage);
                                                                    Unit unit9 = Unit.INSTANCE;
                                                                    obj5 = objUnserializeKeyable4;
                                                                } else {
                                                                    HI0.YzO.J2(parser);
                                                                    Unit unit10 = Unit.INSTANCE;
                                                                }
                                                                if (parser.getEventType() == 3 || parser.getDepth() != depth5) {
                                                                    break loop0;
                                                                }
                                                                arrayList5 = arrayList3;
                                                                str11 = str19;
                                                                z5 = z7;
                                                            }
                                                        } else {
                                                            arrayList5 = arrayList3;
                                                        }
                                                    }
                                                } else {
                                                    z2 = z5;
                                                    str7 = str9;
                                                    arrayList3 = arrayList5;
                                                    str8 = str11;
                                                    HI0.YzO.J2(parser);
                                                }
                                                if (parser.getEventType() != 3 || parser.getDepth() != depth4) {
                                                    break loop0;
                                                }
                                                arrayList4 = arrayList8;
                                                str9 = str7;
                                                arrayList5 = arrayList3;
                                                str11 = str8;
                                                z5 = z2;
                                            } else {
                                                arrayList4 = arrayList8;
                                            }
                                        }
                                    } else {
                                        arrayList5.add(KeyableCubicBSpline.copy$default(CubicBSplineKt.keyable(CubicBSplineKt.cubicBSplineFromSVGPath(attributeValue4)), null, false, z4, 3, null));
                                        HI0.YzO.J2(parser);
                                        str3 = str9;
                                        str5 = str13;
                                        i3 = depth2;
                                        arrayList2 = arrayList4;
                                        arrayList = arrayList5;
                                        str6 = str11;
                                    }
                                }
                                if (parser.getEventType() != 3 || parser.getDepth() != i3) {
                                    break loop0;
                                }
                                arrayList5 = arrayList;
                                arrayList4 = arrayList2;
                                str11 = str6;
                                str12 = str4;
                                strQie = str14;
                                depth = i8;
                                sceneElementUnserializeCommonChildTag = sceneElement;
                                linkedHashMap2 = linkedHashMap4;
                                str13 = str5;
                            } else {
                                str3 = str9;
                            }
                            str9 = str3;
                        }
                        str = str9;
                        i2 = depth;
                        str2 = strQie;
                        LinkedHashMap linkedHashMap5 = linkedHashMap2;
                        SceneElement sceneElement2 = sceneElementUnserializeCommonChildTag;
                        ArrayList arrayList9 = arrayList4;
                        ArrayList arrayList10 = arrayList5;
                        empty = !arrayList10.isEmpty() ? new KeyableCompoundCubicBSpline(arrayList10) : new KeyableCompoundCubicBSpline(CollectionsKt.listOf(new KeyableCubicBSpline(arrayList9, z3, false, 4, null)));
                        sceneElementUnserializeCommonChildTag = sceneElement2;
                        linkedHashMap = linkedHashMap5;
                    }
                } else {
                    str = str9;
                    i2 = depth;
                    str2 = strQie;
                    LinkedHashMap linkedHashMap6 = linkedHashMap2;
                    SceneElement sceneElement3 = sceneElementUnserializeCommonChildTag;
                    if (Intrinsics.areEqual(name, "property")) {
                        Pair<String, KeyableUserParameterValue> pairUnserializeUserParameterValue = UserParameterKt.unserializeUserParameterValue(ns, parser, isPackage);
                        linkedHashMap = linkedHashMap6;
                        linkedHashMap.put(pairUnserializeUserParameterValue.component1(), pairUnserializeUserParameterValue.component2());
                        sceneElementUnserializeCommonChildTag = sceneElement3;
                    } else {
                        linkedHashMap = linkedHashMap6;
                        sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElement3, name, ns, parser, isPackage);
                    }
                }
                if (parser.getEventType() != 3 || parser.getDepth() != i2) {
                    break;
                }
                linkedHashMap2 = linkedHashMap;
                strQie = str2;
                str9 = str;
                i5 = 2;
            }
        }
        throw new IllegalStateException("Did not consume all tag contents");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unserializeElement$lambda$32$lambda$31(CompoundCubicBSpline compoundCubicBSpline) {
        return "getShapeOutline result: " + compoundCubicBSpline;
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
    public void render(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Object next;
        Map<String, KeyableUserParameterValue> parameters;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<Float> floatValue;
        Map<String, KeyableUserParameterValue> parameters2;
        KeyableUserParameterValue keyableUserParameterValue2;
        Keyable<Float> floatValue2;
        RenderEnvironment env2 = env;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env2, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        GLES20.glClear(1024);
        Iterator<T> it = el.getVisualEffects().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
            if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.drawing.progress") && !keyableVisualEffectRef.getHidden()) {
                break;
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
        float length = 0.0f;
        float fFloatValue = ((keyableVisualEffectRef2 == null || (parameters2 = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue2 = parameters2.get(TtmlNode.START)) == null || (floatValue2 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, env2)).floatValue()) / 100.0f;
        float fFloatValue2 = ((keyableVisualEffectRef2 == null || (parameters = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue = parameters.get(TtmlNode.END)) == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? 100.0f : ((Number) KeyableKt.valueAtTime(floatValue, env2)).floatValue()) / 100.0f;
        C1487z path = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(el, env2.getTime()));
        Path pathT = path.t();
        Transform transformValueAtTime = el.getTransform().valueAtTime(env2);
        ShapeElementKt.paint.gh((SolidColor) KeyableKt.valueAtTime(el.getFillColor(), env2));
        ShapeElementKt.paint.ty(yg.w6.f11697t);
        canvas.O();
        if (el.getFillType() == FillType.MEDIA || el.getFillType() == FillType.GRADIENT) {
            pathT.computeBounds(ShapeElementKt.scratchRectF, true);
        }
        if (fFloatValue > 1.0E-5d || fFloatValue2 < 0.99999d) {
            PathMeasure pathMeasure = new PathMeasure();
            pathMeasure.setPath(pathT, false);
            while (true) {
                length += pathMeasure.getLength();
                if (!pathMeasure.nextContour()) {
                    break;
                } else {
                    env2 = env;
                }
            }
            pathMeasure.setPath(pathT, false);
            float f3 = fFloatValue * length;
            float f4 = length * fFloatValue2;
            path.ijL();
            if (f4 > f3) {
                path.XQ(WzY.l4Z.t(pathT, 0.01f, f3, f4));
            }
        }
        WzY.SPz.r(path, transformValueAtTime);
        WzY.yg ygVar = ShapeElementKt.paint;
        ygVar.xMQ(ygVar.t() * (env2.getRenderMode() == RenderMode.THUMB ? 1.0f : transformValueAtTime.getOpacity()));
        int i2 = WhenMappings.$EnumSwitchMapping$0[el.getFillType().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                throw new IllegalStateException();
            }
            if (i2 == 3) {
                canvas.te(path, ShapeElementKt.paint);
            } else if (i2 == 4) {
                MediaFillKt.renderMediaFill(el, canvas, env2, path, ShapeElementKt.scratchRectF);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                canvas.J2(path);
                canvas.ty(el.getFillGradient(), ShapeElementKt.scratchRectF, transformValueAtTime.getMatrix(), transformValueAtTime.getOpacity());
                canvas.r();
            }
        }
        if (el.getStroke().getEnabled()) {
            StrokeKt.drawStroke$default(el, path, canvas, env2, null, 8, null);
        }
        ShapeElementKt.paint.xMQ(1.0f);
        canvas.n();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Object next;
        Map<String, KeyableUserParameterValue> parameters;
        KeyableUserParameterValue keyableUserParameterValue;
        Keyable<Float> floatValue;
        Map<String, KeyableUserParameterValue> parameters2;
        KeyableUserParameterValue keyableUserParameterValue2;
        Keyable<Float> floatValue2;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        List<KeyableEdgeDecoration> borders = el.getBorders();
        ArrayList<KeyableEdgeDecoration> arrayList = new ArrayList();
        for (Object obj : borders) {
            KeyableEdgeDecoration keyableEdgeDecoration = (KeyableEdgeDecoration) obj;
            if (keyableEdgeDecoration.getDirection() == EdgeDecorationDirection.CENTERED && keyableEdgeDecoration.getEnabled()) {
                arrayList.add(obj);
            }
        }
        for (KeyableEdgeDecoration keyableEdgeDecoration2 : arrayList) {
            C1487z path = CubicBSplineKt.toPath(CubicBSplineKt.valueAtTime(el.getOutline(), env.getTime()));
            Iterator<T> it = el.getVisualEffects().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) next;
                if (Intrinsics.areEqual(keyableVisualEffectRef.getId(), "com.alightcreative.effects.drawing.progress") && !keyableVisualEffectRef.getHidden()) {
                    break;
                }
            }
            KeyableVisualEffectRef keyableVisualEffectRef2 = (KeyableVisualEffectRef) next;
            float fFloatValue = ((keyableVisualEffectRef2 == null || (parameters2 = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue2 = parameters2.get(TtmlNode.START)) == null || (floatValue2 = keyableUserParameterValue2.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, env)).floatValue()) / 100.0f;
            float fFloatValue2 = ((keyableVisualEffectRef2 == null || (parameters = keyableVisualEffectRef2.getParameters()) == null || (keyableUserParameterValue = parameters.get(TtmlNode.END)) == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? 100.0f : ((Number) KeyableKt.valueAtTime(floatValue, env)).floatValue()) / 100.0f;
            if (fFloatValue > 1.0E-5d || fFloatValue2 < 0.99999d) {
                Path pathT = path.t();
                PathMeasure pathMeasure = new PathMeasure();
                float[] fArr = new float[2];
                pathMeasure.setPath(pathT, false);
                float length = pathMeasure.getLength();
                float f3 = fFloatValue * length;
                float f4 = length * fFloatValue2;
                path.ijL();
                pathMeasure.getPosTan(f3, fArr, null);
                path.Y(fArr[0], fArr[1]);
                float f5 = 5.0f;
                float f6 = f3 + (5.0f - (f3 % 5.0f));
                while (f6 < f4) {
                    pathMeasure.getPosTan(f6, fArr, null);
                    float f7 = f5;
                    path.J(fArr[0], fArr[1]);
                    f6 += f7;
                    f5 = f7;
                }
            }
            Transform transformValueAtTime = el.getTransform().valueAtTime(env);
            ShapeElementKt.paint.gh((SolidColor) KeyableKt.valueAtTime(keyableEdgeDecoration2.getColor(), env));
            ShapeElementKt.paint.ty(yg.w6.f11694O);
            ShapeElementKt.paint.mUb(yg.j.f11689t);
            ShapeElementKt.paint.az(((Number) KeyableKt.valueAtTime(keyableEdgeDecoration2.getSize(), env)).floatValue());
            canvas.O();
            canvas.XQ(viewport);
            TransformKt.transform(path, transformValueAtTime);
            WzY.yg ygVar = ShapeElementKt.paint;
            ygVar.xMQ(ygVar.t() * (env.getRenderMode() == RenderMode.THUMB ? 1.0f : transformValueAtTime.getOpacity()));
            canvas.te(path, ShapeElementKt.paint);
            canvas.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x045f  */
    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, final SceneSelection selection, Rectangle viewport) {
        SceneElement sceneElement;
        float f3;
        Transform transform;
        WzY.s4 s4Var;
        float f4;
        float f5;
        Iterator it;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        List<Keyframe<Vector2D>> keyframesIfExistsAndKeyed;
        Iterator it2;
        boolean z7;
        boolean z9;
        boolean z10;
        final SceneElement el2 = el;
        final WzY.s4 canvas2 = canvas;
        Intrinsics.checkNotNullParameter(el2, "el");
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        el2.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        XoT.C.Uo(el2, new Function0() { // from class: com.alightcreative.app.motion.scene.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShapeElementTypeImpl.renderSelection$lambda$18$lambda$3(el2, selection);
            }
        });
        float optiRate = (1.0f / env.getOptiRate()) / RP.KN(canvas2.ck().getUserPreviewMode());
        EnumC1485c enumC1485cN = EnumC1485c.f11632n.n(selection, el2.getId(), env.getEditMode());
        double endTime = el2.getEndTime() - el2.getStartTime();
        if (!selection.isElementDirectlySelected(el2.getId())) {
            if (selection.isElementSelected(el2.getId())) {
                C1487z path = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(el2, env.getTime()));
                TransformKt.transform(path, CameraElementKt.applyCameraAndParenting(el2, env, env.getTime()).getTransform().valueAtTime(env));
                canvas2.O();
                canvas2.XQ(viewport);
                WzY.SPz.qie(canvas2, path, enumC1485cN, null, null, 12, null);
                canvas2.n();
                return;
            }
            Long selectableHint = selection.getSelectableHint();
            long id = el2.getId();
            if (selectableHint != null && selectableHint.longValue() == id) {
                C1487z path2 = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(el2, env.getTime()));
                TransformKt.transform(path2, CameraElementKt.applyCameraAndParenting(el2, env, env.getTime()).getTransform().valueAtTime(env));
                canvas2.O();
                canvas2.XQ(viewport);
                WzY.SPz.qie(canvas2, path2, EnumC1485c.f11634r, null, null, 12, null);
                canvas.n();
                return;
            }
            return;
        }
        final float fTy = WzY.SPz.ty(canvas2, 2131166349) / env.getOptiRate();
        final float fTy2 = WzY.SPz.ty(canvas2, 2131166348) / env.getOptiRate();
        C1487z path3 = CubicBSplineKt.toPath(LiveShapeScriptKt.getShapeOutline(el2, env.getTime()));
        CompoundCubicBSpline compoundCubicBSplineValueAtTime = CubicBSplineKt.valueAtTime(el2.getOutline(), env.getTime());
        canvas2.O();
        Transform transformValueAtTime = CameraElementKt.applyCameraAndParenting(el2, env, env.getTime()).getTransform().valueAtTime(env);
        TransformKt.transform(path3, transformValueAtTime);
        canvas2.XQ(viewport);
        if (SceneElementRenderingKt.renderGeneralElementSelectionAndEditMode(el, canvas, env, selection, viewport)) {
            sceneElement = el2;
            f3 = optiRate;
            transform = transformValueAtTime;
        } else if (env.getEditMode() == 2131362620) {
            WzY.SPz.qie(canvas2, path3, enumC1485cN, null, null, 12, null);
            sceneElement = el2;
            f3 = optiRate;
            transform = transformValueAtTime;
        } else if (env.getEditMode() == 2131362621) {
            sceneElement = el2;
            f3 = optiRate;
            transform = transformValueAtTime;
        } else if (env.getEditMode() == 2131362623) {
            float fTy3 = WzY.SPz.ty(canvas2, 2131165566) * optiRate * canvas2.Uo();
            float fTy4 = WzY.SPz.ty(canvas2, 2131165565) * optiRate;
            float fTy5 = WzY.SPz.ty(canvas2, 2131165507) * optiRate;
            float fTy6 = WzY.SPz.ty(canvas2, 2131166347) * optiRate * canvas2.Uo();
            float fTy7 = WzY.SPz.ty(canvas2, 2131165355) * optiRate;
            float fTy8 = WzY.SPz.ty(canvas2, 2131165419) * optiRate * canvas2.Uo();
            float fTy9 = WzY.SPz.ty(canvas2, 2131165420) * optiRate * canvas2.Uo();
            float fTy10 = WzY.SPz.ty(canvas2, 2131166345) * optiRate;
            ShapeElementKt.keyframeOutlinePaint.az(((WzY.SPz.ty(canvas2, 2131165416) * optiRate) * canvas2.Uo()) / env.getOptiRate());
            List<CubicBSpline> contours = compoundCubicBSplineValueAtTime.getContours();
            Integer selectedContour = selection.getSelectedContour();
            CubicBSpline cubicBSpline = (CubicBSpline) CollectionsKt.getOrNull(contours, selectedContour != null ? selectedContour.intValue() : 0);
            if (cubicBSpline == null) {
                cubicBSpline = compoundCubicBSplineValueAtTime.getContours().get(0);
            }
            CubicBSpline cubicBSpline2 = cubicBSpline;
            List<KeyableCubicBSpline> contours2 = el2.getOutline().getContours();
            Integer selectedContour2 = selection.getSelectedContour();
            KeyableCubicBSpline keyableCubicBSpline = (KeyableCubicBSpline) CollectionsKt.getOrNull(contours2, selectedContour2 != null ? selectedContour2.intValue() : 0);
            if (keyableCubicBSpline == null) {
                keyableCubicBSpline = el2.getOutline().getContours().get(0);
            }
            KeyableCubicBSpline keyableCubicBSpline2 = keyableCubicBSpline;
            EnumC1485c enumC1485c = EnumC1485c.f11627T;
            List<CubicBSpline> contours3 = compoundCubicBSplineValueAtTime.getContours();
            ArrayList arrayList = new ArrayList();
            Iterator it3 = contours3.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                Iterator it4 = it3;
                Object next = it4.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Integer selectedContour3 = selection.getSelectedContour();
                if (selectedContour3 == null) {
                    selectedContour3 = 0;
                }
                EnumC1485c enumC1485c2 = enumC1485c;
                if (i2 != selectedContour3.intValue()) {
                    arrayList.add(next);
                }
                it3 = it4;
                i2 = i3;
                enumC1485c = enumC1485c2;
            }
            EnumC1485c enumC1485c3 = enumC1485c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                List<CBKnot> knots = ((CubicBSpline) it5.next()).getKnots();
                Iterator it6 = it5;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
                Iterator<T> it7 = knots.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(new WzY.l3D(TransformKt.transformPoint(transformValueAtTime, ((CBKnot) it7.next()).getP()), false, false, false, false, false, 62, null));
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
                it5 = it6;
            }
            float f10 = fTy9;
            f3 = optiRate;
            transform = transformValueAtTime;
            float f11 = fTy8;
            WzY.SPz.qie(canvas, path3, enumC1485c3, arrayList2, null, 8, null);
            C1487z path4 = CubicBSplineKt.toPath(cubicBSpline2);
            TransformKt.transform(path4, transform);
            EnumC1485c enumC1485c4 = EnumC1485c.f11628X;
            List<KeyableCBKnot> knots2 = keyableCubicBSpline2.getKnots();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots2, 10));
            Iterator<T> it8 = knots2.iterator();
            while (it8.hasNext()) {
                arrayList4.add(new WzY.l3D(TransformKt.transformPoint(transform, (Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) it8.next()).getP(), env)), false, false, false, false, false, 62, null));
            }
            WzY.SPz.qie(canvas, path4, enumC1485c4, arrayList4, null, 8, null);
            int i5 = 0;
            for (Iterator it9 = keyableCubicBSpline2.getKnots().iterator(); it9.hasNext(); it9 = it) {
                Object next2 = it9.next();
                int i7 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                KeyableCBKnot keyableCBKnot = (KeyableCBKnot) next2;
                Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), env);
                float[] fArrTransformPoint = TransformKt.transformPoint(transform, vector2D.getX(), vector2D.getY());
                float f12 = fArrTransformPoint[0];
                float f13 = fArrTransformPoint[1];
                boolean z11 = i5 == CollectionsKt.getLastIndex(cubicBSpline2.getKnots()) && !cubicBSpline2.getClosed();
                boolean z12 = i5 == 0 && !cubicBSpline2.getClosed();
                Integer selectedPoint = selection.getSelectedPoint();
                if (selectedPoint != null && i5 == selectedPoint.intValue() && selection.getSelectedHandle() != ControlHandle.CURVE_OUT && selection.getMultiSelectPoints().isEmpty()) {
                    if (!(keyableCBKnot.getCurveIn() instanceof KeyableVector2D) || z12) {
                        s4Var = canvas;
                        f4 = f12;
                        f5 = f13;
                        it = it9;
                    } else {
                        boolean z13 = selection.getSelectedHandle() == ControlHandle.IN;
                        boolean keyed = ((KeyableVector2D) keyableCBKnot.getCurveIn()).getKeyed();
                        List keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed((Keyable) keyableCBKnot.getCurveIn());
                        if (keyframesIfKeyed == null || !keyframesIfKeyed.isEmpty()) {
                            Iterator it10 = keyframesIfKeyed.iterator();
                            while (it10.hasNext()) {
                                Iterator it11 = it10;
                                if (TimeKt.frameNumberFromTime((int) (((double) el2.getStartTime()) + (((double) ((Keyframe) it10.next()).getTime()) * endTime)), env.getFramesPerHundredSeconds()) == env.getOverrideFrame()) {
                                    z4 = true;
                                    break;
                                }
                                it10 = it11;
                            }
                            z4 = false;
                            Vector2D vector2DPlus = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveIn(), env), (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), env));
                            float[] fArrTransformPoint2 = TransformKt.transformPoint(transform, vector2DPlus.getX(), vector2DPlus.getY());
                            float f14 = fArrTransformPoint2[0];
                            float f15 = fArrTransformPoint2[1];
                            ShapeElementKt.selectionPaintBase.az(f11);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditBg());
                            canvas.fD(f14, f15, f12, f13, ShapeElementKt.selectionPaintBase);
                            ShapeElementKt.selectionPaintBase.az(f10);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditFg());
                            canvas.fD(f14, f15, f12, f13, ShapeElementKt.selectionPaintBase);
                            f4 = f12;
                            f5 = f13;
                            it = it9;
                            canvas.gh(f14 - fTy10, f15 - fTy10, f14 + fTy10, f15 + fTy10, ShapeElementKt.selectionPaintKnot);
                            float f16 = f14 - fTy7;
                            float f17 = f15 - fTy7;
                            float f18 = f15 + fTy7;
                            s4Var = canvas;
                            s4Var.gh(f16, f17, f14 + fTy7, f18, !z13 ? ShapeElementKt.selectionPaintKnotActiveMain : ShapeElementKt.selectionPaintKnotActive);
                            if (keyed) {
                                if (z13 && !z4) {
                                    WzY.SPz.xMQ(s4Var, Y3a.j.rl(), new Vector2D(f14, f15), fTy5, ShapeElementKt.selectionPaintKnotActive);
                                }
                                WzY.SPz.xMQ(s4Var, Y3a.j.rl(), new Vector2D(f14, f15), fTy5, ShapeElementKt.keyframeOutlinePaint);
                            }
                        } else {
                            z4 = false;
                            Vector2D vector2DPlus2 = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveIn(), env), (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), env));
                            float[] fArrTransformPoint22 = TransformKt.transformPoint(transform, vector2DPlus2.getX(), vector2DPlus2.getY());
                            float f142 = fArrTransformPoint22[0];
                            float f152 = fArrTransformPoint22[1];
                            ShapeElementKt.selectionPaintBase.az(f11);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditBg());
                            canvas.fD(f142, f152, f12, f13, ShapeElementKt.selectionPaintBase);
                            ShapeElementKt.selectionPaintBase.az(f10);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditFg());
                            canvas.fD(f142, f152, f12, f13, ShapeElementKt.selectionPaintBase);
                            f4 = f12;
                            f5 = f13;
                            it = it9;
                            canvas.gh(f142 - fTy10, f152 - fTy10, f142 + fTy10, f152 + fTy10, ShapeElementKt.selectionPaintKnot);
                            float f162 = f142 - fTy7;
                            float f172 = f152 - fTy7;
                            float f182 = f152 + fTy7;
                            s4Var = canvas;
                            s4Var.gh(f162, f172, f142 + fTy7, f182, !z13 ? ShapeElementKt.selectionPaintKnotActiveMain : ShapeElementKt.selectionPaintKnotActive);
                            if (keyed) {
                            }
                        }
                    }
                    if (!(keyableCBKnot.getCurveOut() instanceof KeyableVector2D) || z11) {
                        f6 = f11;
                        f7 = f4;
                        f8 = f5;
                        f9 = f10;
                    } else {
                        boolean z14 = selection.getSelectedHandle() == ControlHandle.OUT;
                        boolean keyed2 = ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyed();
                        List keyframesIfKeyed2 = KeyableKt.getKeyframesIfKeyed((Keyable) keyableCBKnot.getCurveOut());
                        if (keyframesIfKeyed2 == null || !keyframesIfKeyed2.isEmpty()) {
                            Iterator it12 = keyframesIfKeyed2.iterator();
                            while (it12.hasNext()) {
                                z2 = z14;
                                if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it12.next()).getTime()) * endTime)), env.getFramesPerHundredSeconds()) == env.getOverrideFrame()) {
                                    z3 = true;
                                    break;
                                }
                                z14 = z2;
                            }
                            z2 = z14;
                            z3 = false;
                            Vector2D vector2DPlus3 = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveOut(), env), (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), env));
                            float[] fArrTransformPoint3 = TransformKt.transformPoint(transform, vector2DPlus3.getX(), vector2DPlus3.getY());
                            float f19 = fArrTransformPoint3[0];
                            float f20 = fArrTransformPoint3[1];
                            ShapeElementKt.selectionPaintBase.az(f11);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditBg());
                            float f21 = f4;
                            float f22 = f5;
                            canvas.fD(f19, f20, f21, f22, ShapeElementKt.selectionPaintBase);
                            ShapeElementKt.selectionPaintBase.az(f10);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditFg());
                            canvas.fD(f19, f20, f21, f22, ShapeElementKt.selectionPaintBase);
                            boolean z15 = z3;
                            f6 = f11;
                            f7 = f4;
                            f9 = f10;
                            f8 = f5;
                            canvas.gh(f19 - fTy10, f20 - fTy10, f19 + fTy10, f20 + fTy10, ShapeElementKt.selectionPaintKnot);
                            float f23 = f19 - fTy7;
                            float f24 = f20 - fTy7;
                            float f25 = f20 + fTy7;
                            s4Var = canvas;
                            s4Var.gh(f23, f24, f19 + fTy7, f25, !z2 ? ShapeElementKt.selectionPaintKnotActiveMain : ShapeElementKt.selectionPaintKnotActive);
                            if (keyed2) {
                                if (z2 && !z15) {
                                    WzY.SPz.xMQ(s4Var, Y3a.j.rl(), new Vector2D(f19, f20), fTy5, ShapeElementKt.selectionPaintKnotActive);
                                }
                                WzY.SPz.xMQ(s4Var, Y3a.j.rl(), new Vector2D(f19, f20), fTy5, ShapeElementKt.keyframeOutlinePaint);
                            }
                        } else {
                            z2 = z14;
                            z3 = false;
                            Vector2D vector2DPlus32 = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveOut(), env), (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), env));
                            float[] fArrTransformPoint32 = TransformKt.transformPoint(transform, vector2DPlus32.getX(), vector2DPlus32.getY());
                            float f192 = fArrTransformPoint32[0];
                            float f202 = fArrTransformPoint32[1];
                            ShapeElementKt.selectionPaintBase.az(f11);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditBg());
                            float f212 = f4;
                            float f222 = f5;
                            canvas.fD(f192, f202, f212, f222, ShapeElementKt.selectionPaintBase);
                            ShapeElementKt.selectionPaintBase.az(f10);
                            ShapeElementKt.selectionPaintBase.gh(env.getUiColors().getOutlineEditFg());
                            canvas.fD(f192, f202, f212, f222, ShapeElementKt.selectionPaintBase);
                            boolean z152 = z3;
                            f6 = f11;
                            f7 = f4;
                            f9 = f10;
                            f8 = f5;
                            canvas.gh(f192 - fTy10, f202 - fTy10, f192 + fTy10, f202 + fTy10, ShapeElementKt.selectionPaintKnot);
                            float f232 = f192 - fTy7;
                            float f242 = f202 - fTy7;
                            float f252 = f202 + fTy7;
                            s4Var = canvas;
                            s4Var.gh(f232, f242, f192 + fTy7, f252, !z2 ? ShapeElementKt.selectionPaintKnotActiveMain : ShapeElementKt.selectionPaintKnotActive);
                            if (keyed2) {
                            }
                        }
                    }
                } else {
                    s4Var = canvas;
                    f7 = f12;
                    it = it9;
                    f6 = f11;
                    f9 = f10;
                    f8 = f13;
                }
                if (selection.getMultiSelectPoints().isEmpty() && selection.getLasso() == null) {
                    Integer selectedPoint2 = selection.getSelectedPoint();
                    if (selectedPoint2 != null && selectedPoint2.intValue() == i5 && selection.getSelectedHandle() == ControlHandle.MAIN) {
                        s4Var.Z(f7, f8, fTy6, ShapeElementKt.selectionPaintKnot);
                        s4Var.Z(f7, f8, fTy3, ShapeElementKt.selectionPaintKnotActiveMain);
                        z5 = true;
                    } else {
                        s4Var.Z(f7, f8, fTy6, ShapeElementKt.selectionPaintKnot);
                        s4Var.Z(f7, f8, fTy3, ShapeElementKt.selectionPaintKnotActive);
                        z5 = false;
                    }
                } else if (selection.getMultiSelectPoints().contains(Integer.valueOf(i5))) {
                    s4Var.Z(f7, f8, fTy6, ShapeElementKt.selectionPaintKnot);
                    s4Var.Z(f7, f8, fTy3, ShapeElementKt.selectionPaintKnotActiveMain);
                    z5 = true;
                } else {
                    float f26 = 3;
                    float f27 = 4;
                    s4Var.Z(f7, f8, (fTy6 * f26) / f27, ShapeElementKt.selectionPaintKnot);
                    s4Var.Z(f7, f8, (f26 * fTy3) / f27, ShapeElementKt.selectionPaintKnotUnselect);
                    z5 = false;
                }
                float f28 = ((selection.getMultiSelectPoints().isEmpty() && selection.getLasso() == null) || selection.getMultiSelectPoints().contains(Integer.valueOf(i5))) ? fTy4 : (fTy4 * 3) / 4;
                if (keyableCBKnot.getP().getKeyed()) {
                    List keyframesIfKeyed3 = KeyableKt.getKeyframesIfKeyed(keyableCBKnot.getP());
                    if (keyframesIfKeyed3 == null || !keyframesIfKeyed3.isEmpty()) {
                        Iterator it13 = keyframesIfKeyed3.iterator();
                        while (it13.hasNext()) {
                            z6 = z5;
                            Iterator it14 = it13;
                            if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it13.next()).getTime()) * endTime)), env.getFramesPerHundredSeconds()) == env.getOverrideFrame()) {
                                z10 = true;
                                break;
                            } else {
                                it13 = it14;
                                z5 = z6;
                            }
                        }
                    }
                    z6 = z5;
                    z10 = false;
                } else {
                    z6 = z5;
                    Integer selectedPoint3 = selection.getSelectedPoint();
                    if ((selectedPoint3 != null && selectedPoint3.intValue() == i5) || !(keyableCBKnot.getCurveIn().getKeyed() || keyableCBKnot.getCurveOut().getKeyed())) {
                        z7 = false;
                        z9 = false;
                        if (z7) {
                            if (z6 && !z9) {
                                WzY.SPz.xMQ(s4Var, Y3a.j.rl(), new Vector2D(f7, f8), f28, ShapeElementKt.selectionPaintKnotActive);
                            }
                            WzY.SPz.xMQ(s4Var, Y3a.j.rl(), new Vector2D(f7, f8), f28, ShapeElementKt.keyframeOutlinePaint);
                        }
                        el2 = el;
                        i5 = i7;
                        f11 = f6;
                        f10 = f9;
                    } else {
                        List<Keyframe<Vector2D>> keyframesIfExistsAndKeyed2 = KeyableKt.getKeyframesIfExistsAndKeyed(keyableCBKnot.getCurveIn());
                        if (keyframesIfExistsAndKeyed2 == null || !keyframesIfExistsAndKeyed2.isEmpty()) {
                            Iterator it15 = keyframesIfExistsAndKeyed2.iterator();
                            while (it15.hasNext()) {
                                Iterator it16 = it15;
                                if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it15.next()).getTime()) * endTime)), env.getFramesPerHundredSeconds()) == env.getOverrideFrame()) {
                                    break;
                                } else {
                                    it15 = it16;
                                }
                            }
                            keyframesIfExistsAndKeyed = KeyableKt.getKeyframesIfExistsAndKeyed(keyableCBKnot.getCurveOut());
                            if (keyframesIfExistsAndKeyed != null || !keyframesIfExistsAndKeyed.isEmpty()) {
                                it2 = keyframesIfExistsAndKeyed.iterator();
                                while (it2.hasNext()) {
                                    Iterator it17 = it2;
                                    if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it2.next()).getTime()) * endTime)), env.getFramesPerHundredSeconds()) == env.getOverrideFrame()) {
                                        z10 = true;
                                        break;
                                    }
                                    it2 = it17;
                                }
                            }
                            z10 = false;
                        } else {
                            keyframesIfExistsAndKeyed = KeyableKt.getKeyframesIfExistsAndKeyed(keyableCBKnot.getCurveOut());
                            if (keyframesIfExistsAndKeyed != null) {
                                it2 = keyframesIfExistsAndKeyed.iterator();
                                while (it2.hasNext()) {
                                }
                                z10 = false;
                            }
                        }
                        if (z7) {
                        }
                        el2 = el;
                        i5 = i7;
                        f11 = f6;
                        f10 = f9;
                    }
                }
                z9 = z10;
                z7 = true;
                if (z7) {
                }
                el2 = el;
                i5 = i7;
                f11 = f6;
                f10 = f9;
            }
            sceneElement = el;
            canvas2 = canvas;
        } else {
            f3 = optiRate;
            transform = transformValueAtTime;
            if (env.getEditMode() == 2131362617) {
                float fTy11 = WzY.SPz.ty(canvas2, 2131165420) / env.getOptiRate();
                WzY.SPz.qie(canvas2, path3, enumC1485cN, null, null, 12, null);
                sceneElement = el;
                int i8 = 0;
                for (Object obj : LiveShapeScriptKt.getShapeHandles(sceneElement, env.getTime())) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    PositionedShapeHandle positionedShapeHandleTimes = LiveShapeKt.times((PositionedShapeHandle) obj, transform);
                    Integer selectedPoint4 = selection.getSelectedPoint();
                    boolean z16 = selectedPoint4 != null && selectedPoint4.intValue() == i8;
                    final float f29 = z16 ? fTy2 : fTy;
                    XoT.C.Uo(sceneElement, new Function0() { // from class: com.alightcreative.app.motion.scene.IG
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShapeElementTypeImpl.renderSelection$lambda$18$lambda$16$lambda$15(f29, fTy2, fTy, canvas2);
                        }
                    });
                    ShapeElementKt.paint.gh(z16 ? env.getUiColors().getMultiSelectionFg() : SolidColor.INSTANCE.getWHITE());
                    ShapeElementKt.paint.ty(yg.w6.f11697t);
                    ShapeElementKt.drawHandleOutline(positionedShapeHandleTimes, canvas2, f29, ShapeElementKt.paint);
                    ShapeElementKt.paint.gh(SolidColor.INSTANCE.getBLACK());
                    ShapeElementKt.paint.ty(yg.w6.f11694O);
                    ShapeElementKt.paint.az((fTy11 / RP.KN(env.getUserPreviewMode())) * canvas2.Uo());
                    ShapeElementKt.drawHandleOutline(positionedShapeHandleTimes, canvas2, f29, ShapeElementKt.paint);
                    ShapeElementKt.drawHandleIcon(positionedShapeHandleTimes, canvas2, f29, ShapeElementKt.paint);
                    i8 = i9;
                }
            } else {
                sceneElement = el;
                if (env.getEditMode() == 2131362618) {
                    float fTy12 = WzY.SPz.ty(canvas2, 2131165420) / env.getOptiRate();
                    int i10 = 0;
                    for (Object obj2 : LiveShapeScriptKt.getShapeHandles(sceneElement, env.getTime())) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        PositionedShapeHandle positionedShapeHandleTimes2 = LiveShapeKt.times((PositionedShapeHandle) obj2, transform);
                        Integer selectedPoint5 = selection.getSelectedPoint();
                        if (selectedPoint5 != null && selectedPoint5.intValue() == i10) {
                            ShapeElementKt.paint.ty(yg.w6.f11697t);
                            ShapeElementKt.paint.gh(SolidColor.copy$default(env.getUiColors().getMultiSelectionFg(), 0.0f, 0.0f, 0.0f, 0.25f, 7, null));
                            ShapeElementKt.drawHandleOutline(positionedShapeHandleTimes2, canvas2, 3 * fTy, ShapeElementKt.paint);
                            ShapeElementKt.paint.gh(env.getUiColors().getMultiSelectionFg());
                            ShapeElementKt.drawHandleOutline(positionedShapeHandleTimes2, canvas2, fTy2, ShapeElementKt.paint);
                            ShapeElementKt.paint.gh(SolidColor.INSTANCE.getBLACK());
                            ShapeElementKt.paint.ty(yg.w6.f11694O);
                            ShapeElementKt.paint.az((fTy12 / RP.KN(env.getUserPreviewMode())) * canvas2.Uo());
                            ShapeElementKt.drawHandleOutline(positionedShapeHandleTimes2, canvas2, fTy2, ShapeElementKt.paint);
                            ShapeElementKt.drawHandleIcon(positionedShapeHandleTimes2, canvas2, fTy2, ShapeElementKt.paint);
                        }
                        i10 = i11;
                    }
                } else {
                    WzY.SPz.qie(canvas2, path3, enumC1485cN, null, null, 12, null);
                }
            }
        }
        if (selection.getSelectedHandle() == ControlHandle.CURVE_OUT && selection.getSelectedPoint() != null && selection.getSelectedContour() != null && selection.getSelectedContour().intValue() < sceneElement.getOutline().getContours().size()) {
            KeyableCubicBSpline keyableCubicBSpline3 = sceneElement.getOutline().getContours().get(selection.getSelectedContour().intValue());
            if (selection.getPendingAddPoint() != null) {
                float fTy13 = WzY.SPz.ty(canvas2, 2131166264) * f3;
                float fTy14 = WzY.SPz.ty(canvas2, 2131166265) * f3;
                Vector2D vector2DTransformPoint = TransformKt.transformPoint(transform, selection.getPendingAddPoint());
                float x2 = vector2DTransformPoint.getX();
                float y2 = vector2DTransformPoint.getY();
                ShapeElementKt.addPointPaint.az(WzY.SPz.ty(canvas2, 2131166266) * f3 * canvas2.Uo());
                ShapeElementKt.addSegmentPaint.az(WzY.SPz.ty(canvas2, 2131166266) * f3 * canvas2.Uo());
                if (!keyableCubicBSpline3.getKnots().isEmpty()) {
                    Float curvePos = selection.getCurvePos();
                    Vector2D vector2DTransformPoint2 = TransformKt.transformPoint(transform, (curvePos != null ? curvePos.floatValue() : 0.0f) < 0.5f ? CubicBSplineKt.valueAtTime((KeyableCBKnot) CollectionsKt.last((List) keyableCubicBSpline3.getKnots()), env.getTime()).getP() : CubicBSplineKt.valueAtTime((KeyableCBKnot) CollectionsKt.first((List) keyableCubicBSpline3.getKnots()), env.getTime()).getP());
                    canvas.fD(vector2DTransformPoint2.getX(), vector2DTransformPoint2.getY(), x2, y2, ShapeElementKt.addSegmentPaint);
                    y2 = y2;
                }
                WzY.yg ygVar = ShapeElementKt.addPointPaint;
                SolidColor.Companion companion = SolidColor.INSTANCE;
                ygVar.gh(companion.getBLACK());
                float f30 = x2 - fTy14;
                float f31 = y2;
                canvas.fD(f30, y2, x2 - fTy13, f31, ShapeElementKt.addPointPaint);
                float f32 = x2 + fTy14;
                canvas.fD(f32, y2, x2 + fTy13, f31, ShapeElementKt.addPointPaint);
                float f33 = y2;
                float f34 = f33 - fTy14;
                canvas.fD(x2, f34, x2, f33 - fTy13, ShapeElementKt.addPointPaint);
                float f35 = f33 + fTy14;
                canvas.fD(x2, f35, x2, f33 + fTy13, ShapeElementKt.addPointPaint);
                ShapeElementKt.addPointPaint.gh(companion.getWHITE());
                float f36 = fTy14 * 1.5f;
                canvas.fD(x2 - f36, f33, f30, f33, ShapeElementKt.addPointPaint);
                canvas.fD(x2 + f36, f33, f32, f33, ShapeElementKt.addPointPaint);
                canvas.fD(x2, f33 - f36, x2, f34, ShapeElementKt.addPointPaint);
                canvas.fD(x2, f33 + f36, x2, f35, ShapeElementKt.addPointPaint);
                canvas2 = canvas;
            } else {
                float fTy15 = WzY.SPz.ty(canvas2, 2131165420) / env.getOptiRate();
                Float curvePos2 = selection.getCurvePos();
                C1487z pathSegment = CubicBSplineKt.toPathSegment(keyableCubicBSpline3, selection.getSelectedPoint().intValue(), env.getTime());
                TransformKt.transform(pathSegment, transform);
                ShapeElementKt.selectionCurveActive.az(fTy15 * f3 * canvas2.Uo());
                canvas2.te(pathSegment, ShapeElementKt.selectionCurveActive);
                float fTy16 = WzY.SPz.ty(canvas2, 2131165280) * f3 * canvas2.Uo();
                if (curvePos2 != null) {
                    PathMeasure pathMeasure = new PathMeasure();
                    float[] fArr = new float[2];
                    pathMeasure.setPath(pathSegment.t(), false);
                    pathMeasure.getPosTan(pathMeasure.getLength() * selection.getCurvePos().floatValue(), fArr, null);
                    canvas2.Z(fArr[0], fArr[1], fTy16, ShapeElementKt.selectionPaintKnotActiveMain);
                }
            }
        }
        canvas2.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
        String str;
        String str2;
        String str3 = namespace;
        XmlSerializer serializer2 = serializer;
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        el.getType();
        SceneElementType sceneElementType = SceneElementType.Shape;
        serializer2.startTag(str3, "shape");
        SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
        if (el.getLiveShape().getId() != null) {
            serializer2.attribute(str3, CmcdData.STREAMING_FORMAT_SS, HI0.gnv.qie(el.getLiveShape().getId(), "com.alightcreative.shapes.", "."));
        }
        SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
        if (el.getLiveShape().getId() != null) {
            for (Map.Entry<String, KeyableUserParameterValue> entry : el.getLiveShape().getParamValues().entrySet()) {
                UserParameterKt.serialize(entry.getValue(), str3, serializer2, entry.getKey());
            }
        } else {
            serializer2.startTag(str3, JavetError.PARAMETER_PATH);
            boolean z2 = true;
            if (CubicBSplineKt.getKeyed(el.getOutline())) {
                if (el.getOutline().getContours().size() != 1) {
                    KeyableCubicBSpline keyableCubicBSpline = (KeyableCubicBSpline) CollectionsKt.first((List) el.getOutline().getContours());
                    HI0.YzO.nr(serializer2, str3, "closed", keyableCubicBSpline.getClosed());
                    for (KeyableCBKnot keyableCBKnot : keyableCubicBSpline.getKnots()) {
                        serializer2.startTag(str3, "knot");
                        OptionalKeyableVector2D curveIn = keyableCBKnot.getCurveIn();
                        KeyableVector2D keyableVector2D = curveIn instanceof KeyableVector2D ? (KeyableVector2D) curveIn : null;
                        if (keyableVector2D != null) {
                            KeyableSerializerKt.serialize$default(keyableVector2D, null, str3, serializer2, "in", null, 16, null);
                        }
                        KeyableSerializerKt.serialize$default(keyableCBKnot.getP(), null, namespace, serializer, TtmlNode.TAG_P, null, 16, null);
                        OptionalKeyableVector2D curveOut = keyableCBKnot.getCurveOut();
                        KeyableVector2D keyableVector2D2 = curveOut instanceof KeyableVector2D ? (KeyableVector2D) curveOut : null;
                        if (keyableVector2D2 != null) {
                            str3 = namespace;
                            serializer2 = serializer;
                            KeyableSerializerKt.serialize$default(keyableVector2D2, null, str3, serializer2, "out", null, 16, null);
                        } else {
                            str3 = namespace;
                            serializer2 = serializer;
                        }
                        serializer2.endTag(str3, "knot");
                    }
                } else {
                    for (KeyableCubicBSpline keyableCubicBSpline2 : el.getOutline().getContours()) {
                        String str4 = "contour";
                        serializer2.startTag(str3, "contour");
                        if (keyableCubicBSpline2.getExclude()) {
                            HI0.YzO.nr(serializer2, str3, "exclude", z2);
                        }
                        if (CubicBSplineKt.getKeyed(keyableCubicBSpline2)) {
                            HI0.YzO.nr(serializer2, str3, "closed", keyableCubicBSpline2.getClosed());
                            for (KeyableCBKnot keyableCBKnot2 : keyableCubicBSpline2.getKnots()) {
                                serializer2.startTag(str3, "knot");
                                OptionalKeyableVector2D curveIn2 = keyableCBKnot2.getCurveIn();
                                KeyableVector2D keyableVector2D3 = curveIn2 instanceof KeyableVector2D ? (KeyableVector2D) curveIn2 : null;
                                if (keyableVector2D3 != null) {
                                    str2 = str4;
                                    KeyableSerializerKt.serialize$default(keyableVector2D3, null, str3, serializer2, "in", null, 16, null);
                                } else {
                                    str2 = str4;
                                }
                                KeyableSerializerKt.serialize$default(keyableCBKnot2.getP(), null, namespace, serializer, TtmlNode.TAG_P, null, 16, null);
                                OptionalKeyableVector2D curveOut2 = keyableCBKnot2.getCurveOut();
                                KeyableVector2D keyableVector2D4 = curveOut2 instanceof KeyableVector2D ? (KeyableVector2D) curveOut2 : null;
                                if (keyableVector2D4 != null) {
                                    str3 = namespace;
                                    serializer2 = serializer;
                                    KeyableSerializerKt.serialize$default(keyableVector2D4, null, str3, serializer2, "out", null, 16, null);
                                } else {
                                    str3 = namespace;
                                    serializer2 = serializer;
                                }
                                serializer2.endTag(str3, "knot");
                                str4 = str2;
                            }
                            str = str4;
                        } else {
                            str = "contour";
                            serializer2.attribute(str3, "d", CubicBSplineKt.toSVGPath(CubicBSplineKt.valueAtTime(keyableCubicBSpline2, 0.0f)));
                        }
                        serializer2.endTag(str3, str);
                        z2 = true;
                    }
                }
                serializer2.endTag(str3, JavetError.PARAMETER_PATH);
            } else {
                List listDrop = CollectionsKt.drop(el.getOutline().getContours(), 1);
                if (listDrop == null || !listDrop.isEmpty()) {
                    Iterator it = listDrop.iterator();
                    while (it.hasNext()) {
                        if (((KeyableCubicBSpline) it.next()).getExclude()) {
                            if (el.getOutline().getContours().size() != 1) {
                            }
                            serializer2.endTag(str3, JavetError.PARAMETER_PATH);
                        }
                    }
                }
                serializer2.attribute(str3, "d", CubicBSplineKt.toSVGPath(CubicBSplineKt.valueAtTime(el.getOutline(), 0.0f)));
                serializer2.endTag(str3, JavetError.PARAMETER_PATH);
            }
        }
        serializer2.endTag(str3, "shape");
    }

    private ShapeElementTypeImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderSelection$lambda$18$lambda$16$lambda$15(float f3, float f4, float f5, WzY.s4 s4Var) {
        return "drawLiveHandle: r=" + f3 + " selr=" + f4 + " hr=" + f5 + " scale=" + s4Var.Uo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderSelection$lambda$18$lambda$3(SceneElement sceneElement, SceneSelection sceneSelection) {
        return "renderAsShapeElementSelection IN[" + sceneElement.getId() + "]; directSel=" + sceneSelection.isElementDirectlySelected(sceneElement.getId());
    }
}
