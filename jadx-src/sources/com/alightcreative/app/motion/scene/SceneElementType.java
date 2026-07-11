package com.alightcreative.app.motion.scene;

import WzY.C1487z;
import WzY.EnumC1485c;
import WzY.yg;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.CameraProperties;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneElementRenderingKt;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b7\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0012J8\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0012J*\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00100\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010)R\u0014\u00102\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0014\u00104\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0014\u00106\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0014\u00108\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010)R\u0014\u0010:\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0014\u0010<\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010)R\u0014\u0010>\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010)R\u0014\u0010@\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010)R\u0014\u0010A\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010)R\u0014\u0010C\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010)R\u0014\u0010E\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010)R\u0014\u0010G\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010)R\u0014\u0010I\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010)R\u0014\u0010K\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010)R\u0014\u0010M\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010)j\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bT¨\u0006U"}, d2 = {"Lcom/alightcreative/app/motion/scene/SceneElementType;", "Lcom/alightcreative/app/motion/scene/ISceneElementType;", "", "impl", "<init>", "(Ljava/lang/String;ILcom/alightcreative/app/motion/scene/ISceneElementType;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "LWzY/s4;", "canvas", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", "env", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "selection", "Lcom/alightcreative/app/motion/scene/Rectangle;", "viewport", "", "render", "(Lcom/alightcreative/app/motion/scene/SceneElement;LWzY/s4;Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;Lcom/alightcreative/app/motion/scene/SceneSelection;Lcom/alightcreative/app/motion/scene/Rectangle;)V", "renderSelection", "renderOutline", "", "namespace", "Lorg/xmlpull/v1/XmlSerializer;", "serializer", "serialize", "(Lcom/alightcreative/app/motion/scene/SceneElement;Ljava/lang/String;Lorg/xmlpull/v1/XmlSerializer;)V", "ns", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "isPackage", "unserializeElement", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Z)Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/ISceneElementType;", "getImpl", "()Lcom/alightcreative/app/motion/scene/ISceneElementType;", "getXmlTag", "()Ljava/lang/String;", "xmlTag", "getHasTransform", "()Z", "hasTransform", "getHasVisualContent", "hasVisualContent", "getHasFillColor", "hasFillColor", "getHasFillImage", "hasFillImage", "getHasFillVideo", "hasFillVideo", "getHasFillGradient", "hasFillGradient", "getHasFillType", "hasFillType", "getHasOutline", "hasOutline", "getHasStroke", "hasStroke", "getHasVolume", "hasVolume", "getHasBorderAndShadow", "hasBorderAndShadow", "getHasText", "hasText", "isRenderable", "getHasSourceMedia", "hasSourceMedia", "getHasNestedScene", "hasNestedScene", "getHasVisualEffects", "hasVisualEffects", "getHasBlendingMode", "hasBlendingMode", "getHasGain", "hasGain", "getHasOpacity", "hasOpacity", "Shape", "Drawing", "Scene", "Text", "Audio", "Camera", "NullObject", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneElementType implements ISceneElementType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SceneElementType[] $VALUES;
    private final ISceneElementType impl;
    public static final SceneElementType Shape = new SceneElementType("Shape", 0, ShapeElementTypeImpl.INSTANCE);
    public static final SceneElementType Drawing = new SceneElementType("Drawing", 1, DrawingElementTypeImpl.INSTANCE);
    public static final SceneElementType Scene = new SceneElementType("Scene", 2, NestedSceneElementTypeImpl.INSTANCE);
    public static final SceneElementType Text = new SceneElementType("Text", 3, TextElementTypeImpl.INSTANCE);
    public static final SceneElementType Audio = new SceneElementType("Audio", 4, new ISceneElementType() { // from class: com.alightcreative.app.motion.scene.AudioElementTypeImpl
        public static final int $stable = 0;
        private static final boolean hasBlendingMode = false;
        private static final boolean hasBorderAndShadow = false;
        private static final boolean hasFillColor = false;
        private static final boolean hasFillGradient = false;
        private static final boolean hasFillImage = false;
        private static final boolean hasFillType = false;
        private static final boolean hasFillVideo = false;
        private static final boolean hasNestedScene = false;
        private static final boolean hasOpacity = false;
        private static final boolean hasOutline = false;
        private static final boolean hasStroke = false;
        private static final boolean hasText = false;
        private static final boolean hasTransform = false;
        private static final boolean hasVisualContent = false;
        private static final boolean hasVisualEffects = false;
        private static final boolean isRenderable = false;
        private static final String xmlTag = "audio";
        private static final boolean hasSourceMedia = true;
        private static final boolean hasVolume = true;
        private static final boolean hasGain = true;

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void render(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
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
        public void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
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

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            el.getType();
            SceneElementType sceneElementType = SceneElementType.Shape;
            serializer.startTag(namespace, "audio");
            SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
            SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
            serializer.endTag(namespace, "audio");
        }

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(parser, "parser");
            parser.require(2, ns, "audio");
            SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.Audio, ns, parser);
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    int depth = parser.getDepth();
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeBaseSceneElement, name, ns, parser, isPackage);
                    if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                        throw new IllegalStateException("Did not consume all tag contents");
                    }
                }
            }
            return sceneElementUnserializeBaseSceneElement;
        }
    });
    public static final SceneElementType Camera = new SceneElementType("Camera", 5, new ISceneElementType() { // from class: com.alightcreative.app.motion.scene.CameraElementTypeImpl
        public static final int $stable;
        private static final boolean hasBlendingMode = false;
        private static final boolean hasBorderAndShadow = false;
        private static final boolean hasFillColor = false;
        private static final boolean hasFillGradient = false;
        private static final boolean hasFillImage = false;
        private static final boolean hasFillType = false;
        private static final boolean hasFillVideo = false;
        private static final boolean hasGain = false;
        private static final boolean hasNestedScene = false;
        private static final boolean hasOpacity = false;
        private static final boolean hasOutline = false;
        private static final boolean hasSourceMedia = false;
        private static final boolean hasStroke = false;
        private static final boolean hasText = false;
        private static final boolean hasVisualContent = false;
        private static final boolean hasVolume = false;
        private static final WzY.yg paint;
        private static final C1487z scratchPath;
        private static final String xmlTag = "camera";
        private static final boolean hasTransform = true;
        private static final boolean isRenderable = true;
        private static final boolean hasVisualEffects = true;

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x020b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0356 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01c4 A[PHI: r52
          0x01c4: PHI (r52v6 java.lang.String) = (r52v4 java.lang.String), (r52v7 java.lang.String), (r52v9 java.lang.String) binds: [B:53:0x01c2, B:49:0x0183, B:43:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x030f A[PHI: r51
          0x030f: PHI (r51v2 java.lang.String) = (r51v0 java.lang.String), (r51v3 java.lang.String), (r51v5 java.lang.String) binds: [B:91:0x030d, B:87:0x02ce, B:81:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x034c  */
        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException {
            CameraType cameraTypeFromString;
            CameraProperties cameraProperties;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Intrinsics.checkNotNullParameter(parser, "parser");
            parser.require(2, ns, "camera");
            SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.Camera, ns, parser);
            CameraProperties cameraProperties2 = CameraProperties.INSTANCE.getDEFAULT();
            String attributeValue = parser.getAttributeValue(ns, "type");
            if (attributeValue == null || (cameraTypeFromString = CameraType.Companion.fromString(attributeValue)) == null) {
                cameraTypeFromString = CameraType.Perspective;
            }
            CameraProperties cameraPropertiesCopy$default = CameraProperties.copy$default(cameraProperties2, cameraTypeFromString, null, false, null, null, null, false, null, null, null, 1022, null);
            SceneElement sceneElementUnserializeCommonChildTag = sceneElementUnserializeBaseSceneElement;
            CameraProperties cameraPropertiesCopy$default2 = cameraPropertiesCopy$default;
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    int depth = parser.getDepth();
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    int iHashCode = name.hashCode();
                    if (iHashCode == -1088273348) {
                        cameraProperties = cameraPropertiesCopy$default2;
                        String str6 = "getName(...)";
                        str = "Did not consume all tag contents";
                        if (name.equals("focus-blur")) {
                            String attributeValue2 = parser.getAttributeValue(ns, "enabled");
                            CameraProperties cameraPropertiesCopy$default3 = CameraProperties.copy$default(cameraProperties, null, null, attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : true, null, null, null, false, null, null, null, 1019, null);
                            while (parser.next() != 3) {
                                if (parser.getEventType() == 2) {
                                    int depth2 = parser.getDepth();
                                    String name2 = parser.getName();
                                    String str7 = str6;
                                    Intrinsics.checkNotNullExpressionValue(name2, str7);
                                    int iHashCode2 = name2.hashCode();
                                    if (iHashCode2 == -394139314) {
                                        str3 = str7;
                                        if (name2.equals("depth-of-field")) {
                                            cameraPropertiesCopy$default3 = CameraProperties.copy$default(cameraPropertiesCopy$default3, null, null, false, null, (KeyableFloat) KeyableSerializerKt.unserializeKeyable(ns, parser, "depth-of-field", ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFocusDepthOfField().getKeyframes())).getValue(), isPackage), null, false, null, null, null, 1007, null);
                                        }
                                        if (parser.getEventType() == 3) {
                                        }
                                        throw new IllegalStateException(str);
                                    }
                                    if (iHashCode2 == 288459765) {
                                        str3 = str7;
                                        if (name2.equals("distance")) {
                                            cameraPropertiesCopy$default3 = CameraProperties.copy$default(cameraPropertiesCopy$default3, null, null, false, (KeyableFloat) KeyableSerializerKt.unserializeKeyable(ns, parser, "distance", ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFocusDistance().getKeyframes())).getValue(), isPackage), null, null, false, null, null, null, 1015, null);
                                        } else {
                                            HI0.YzO.J2(parser);
                                        }
                                        if (parser.getEventType() == 3) {
                                        }
                                        throw new IllegalStateException(str);
                                    }
                                    if (iHashCode2 != 1791316033 || !name2.equals("strength")) {
                                        str3 = str7;
                                        HI0.YzO.J2(parser);
                                        if (parser.getEventType() == 3) {
                                        }
                                        throw new IllegalStateException(str);
                                    }
                                    str3 = str7;
                                    cameraPropertiesCopy$default3 = CameraProperties.copy$default(cameraPropertiesCopy$default3, null, null, false, null, null, (KeyableFloat) KeyableSerializerKt.unserializeKeyable(ns, parser, "strength", ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFocusBlurStrength().getKeyframes())).getValue(), isPackage), false, null, null, null, 991, null);
                                    if (parser.getEventType() == 3 || parser.getDepth() != depth2) {
                                        throw new IllegalStateException(str);
                                    }
                                    str6 = str3;
                                }
                            }
                            str2 = str;
                            cameraPropertiesCopy$default2 = cameraPropertiesCopy$default3;
                        } else {
                            sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeCommonChildTag, name, ns, parser, isPackage);
                            str2 = str;
                            cameraPropertiesCopy$default2 = cameraProperties;
                        }
                        if (parser.getEventType() == 3) {
                        }
                        throw new IllegalStateException(str2);
                    }
                    if (iHashCode == 101566) {
                        str4 = "Did not consume all tag contents";
                        if (name.equals("fog")) {
                            String attributeValue3 = parser.getAttributeValue(ns, "enabled");
                            String str8 = "getName(...)";
                            CameraProperties cameraPropertiesCopy$default4 = CameraProperties.copy$default(cameraPropertiesCopy$default2, null, null, false, null, null, null, attributeValue3 != null ? Boolean.parseBoolean(attributeValue3) : true, null, null, null, 959, null);
                            while (parser.next() != 3) {
                                if (parser.getEventType() == 2) {
                                    int depth3 = parser.getDepth();
                                    String name3 = parser.getName();
                                    String str9 = str8;
                                    Intrinsics.checkNotNullExpressionValue(name3, str9);
                                    int iHashCode3 = name3.hashCode();
                                    if (iHashCode3 == -1049484267) {
                                        str5 = str9;
                                        if (name3.equals("near-z")) {
                                            cameraPropertiesCopy$default4 = CameraProperties.copy$default(cameraPropertiesCopy$default4, null, null, false, null, null, null, false, null, (KeyableFloat) KeyableSerializerKt.unserializeKeyable(ns, parser, "near-z", ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFogNearZ().getKeyframes())).getValue(), isPackage), null, 767, null);
                                        }
                                        if (parser.getEventType() == 3) {
                                        }
                                        throw new IllegalStateException(str4);
                                    }
                                    if (iHashCode3 == 94842723) {
                                        str5 = str9;
                                        if (name3.equals(TtmlNode.ATTR_TTS_COLOR)) {
                                            cameraPropertiesCopy$default4 = CameraProperties.copy$default(cameraPropertiesCopy$default4, null, null, false, null, null, null, false, (KeyableSolidColor) KeyableSerializerKt.unserializeKeyable(ns, parser, TtmlNode.ATTR_TTS_COLOR, ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFogColor().getKeyframes())).getValue(), isPackage), null, null, 895, null);
                                        } else {
                                            HI0.YzO.J2(parser);
                                        }
                                        if (parser.getEventType() == 3) {
                                        }
                                        throw new IllegalStateException(str4);
                                    }
                                    if (iHashCode3 != 97199940 || !name3.equals("far-z")) {
                                        str5 = str9;
                                        HI0.YzO.J2(parser);
                                        if (parser.getEventType() == 3) {
                                        }
                                        throw new IllegalStateException(str4);
                                    }
                                    str5 = str9;
                                    cameraPropertiesCopy$default4 = CameraProperties.copy$default(cameraPropertiesCopy$default4, null, null, false, null, null, null, false, null, null, (KeyableFloat) KeyableSerializerKt.unserializeKeyable(ns, parser, "far-z", ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFogFarZ().getKeyframes())).getValue(), isPackage), 511, null);
                                    if (parser.getEventType() == 3 || parser.getDepth() != depth3) {
                                        throw new IllegalStateException(str4);
                                    }
                                    str8 = str5;
                                }
                            }
                            cameraPropertiesCopy$default2 = cameraPropertiesCopy$default4;
                            str2 = str4;
                        } else {
                            cameraProperties = cameraPropertiesCopy$default2;
                            str = str4;
                            sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeCommonChildTag, name, ns, parser, isPackage);
                            str2 = str;
                            cameraPropertiesCopy$default2 = cameraProperties;
                        }
                    } else if (iHashCode == 101581 && name.equals("fov")) {
                        str4 = "Did not consume all tag contents";
                        cameraPropertiesCopy$default2 = CameraProperties.copy$default(cameraPropertiesCopy$default2, null, (KeyableFloat) KeyableSerializerKt.unserializeKeyable(ns, parser, "fov", ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFov().getKeyframes())).getValue(), isPackage), false, null, null, null, false, null, null, null, 1021, null);
                        str2 = str4;
                    } else {
                        cameraProperties = cameraPropertiesCopy$default2;
                        str = "Did not consume all tag contents";
                        sceneElementUnserializeCommonChildTag = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeCommonChildTag, name, ns, parser, isPackage);
                        str2 = str;
                        cameraPropertiesCopy$default2 = cameraProperties;
                    }
                    if (parser.getEventType() == 3 || parser.getDepth() != depth) {
                        throw new IllegalStateException(str2);
                    }
                }
            }
            return SceneElement.copy$default(sceneElementUnserializeCommonChildTag, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, cameraPropertiesCopy$default2, null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
        }

        static {
            WzY.yg ygVar = new WzY.yg();
            ygVar.ty(yg.w6.f11694O);
            ygVar.az(2.0f);
            ygVar.gh(SolidColor.INSTANCE.getGRAY());
            paint = ygVar;
            scratchPath = new C1487z();
            $stable = 8;
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
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
            if (env.getRenderMode() != RenderMode.EXPORT) {
                if (env.getUserPreviewMode().nr() && (env.getActiveCamera().getId() == el.getId() || env.getRenderMode() == RenderMode.PLAY)) {
                    return;
                }
                Transform transformValueAtTime = el.getTransform().valueAtTime(env);
                C1487z c1487z = scratchPath;
                c1487z.ijL();
                Rectangle rectangleCenteredWithSize = Rectangle.INSTANCE.centeredWithSize(CameraElementKt.calcCameraDimensions(env.getScene(), ((Number) KeyableKt.valueAtTime(el.getCameraProperties().getFov(), env.getTime())).floatValue(), -((Vector3D) KeyableKt.valueAtTime(el.getTransform().getLocation(), env.getTime())).getZ()));
                c1487z.WPU(rectangleCenteredWithSize);
                if (el.getCameraProperties().getType() == CameraType.Perspective) {
                    c1487z.Y(rectangleCenteredWithSize.getLeft(), rectangleCenteredWithSize.getBottom());
                    c1487z.J(rectangleCenteredWithSize.getRight(), rectangleCenteredWithSize.getTop());
                    c1487z.Y(rectangleCenteredWithSize.getLeft(), rectangleCenteredWithSize.getTop());
                    c1487z.J(rectangleCenteredWithSize.getRight(), rectangleCenteredWithSize.getBottom());
                }
                TransformKt.transform(c1487z, transformValueAtTime);
                canvas.O();
                canvas.XQ(viewport);
                WzY.yg ygVar = paint;
                ygVar.az(WzY.SPz.ty(canvas, 2131165301));
                SolidColor.Companion companion = SolidColor.INSTANCE;
                ygVar.gh(companion.getGRAY());
                ygVar.xMQ(0.75f);
                canvas.te(c1487z, ygVar);
                ygVar.az(WzY.SPz.ty(canvas, 2131165302));
                ygVar.gh(el.getTag() != ElementTag.NONE ? el.getTag().getColors().n() : companion.getBLACK());
                ygVar.xMQ(0.75f);
                canvas.te(c1487z, ygVar);
                canvas.n();
            }
        }

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
            EnumC1485c enumC1485cN;
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
            el.getType();
            SceneElementType sceneElementType = SceneElementType.Shape;
            if (SceneElementRenderingKt.renderGeneralElementSelectionAndEditMode(el, canvas, env, selection, viewport) || (enumC1485cN = EnumC1485c.f11632n.n(selection, el.getId(), env.getEditMode())) == EnumC1485c.f11635t) {
                return;
            }
            if (env.getActiveCamera().getId() == el.getId()) {
                Rectangle rectangle = new Rectangle(0.0f, 0.0f, env.getScene().getWidth(), env.getScene().getHeight());
                C1487z c1487z = scratchPath;
                c1487z.ijL();
                c1487z.WPU(rectangle);
                WzY.SPz.qie(canvas, c1487z, enumC1485cN, null, null, 12, null);
                return;
            }
            Rectangle rectangleCenteredWithSize = Rectangle.INSTANCE.centeredWithSize(CameraElementKt.calcCameraDimensions(env.getScene(), ((Number) KeyableKt.valueAtTime(el.getCameraProperties().getFov(), env.getTime())).floatValue(), -((Vector3D) KeyableKt.valueAtTime(el.getTransform().getLocation(), env.getTime())).getZ()));
            C1487z c1487z2 = scratchPath;
            c1487z2.ijL();
            c1487z2.WPU(rectangleCenteredWithSize);
            WzY.SPz.r(c1487z2, CameraElementKt.applyCameraAndParenting(el, env, env.getTime()).getTransform().valueAtTime(env));
            WzY.SPz.qie(canvas, c1487z2, enumC1485cN, null, null, 12, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0128  */
        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            el.getType();
            SceneElementType sceneElementType = SceneElementType.Shape;
            serializer.startTag(namespace, "camera");
            SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
            serializer.attribute(namespace, "type", el.getCameraProperties().getType().getId());
            SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
            KeyableSerializerKt.serialize$default(el.getCameraProperties().getFov(), null, namespace, serializer, "fov", null, 16, null);
            if (!el.getCameraProperties().getFocusBlurEnabled()) {
                KeyableFloat focusBlurStrength = el.getCameraProperties().getFocusBlurStrength();
                CameraProperties.Companion companion = CameraProperties.INSTANCE;
                if (!Intrinsics.areEqual(focusBlurStrength, companion.getDEFAULT().getFocusBlurStrength()) || !Intrinsics.areEqual(el.getCameraProperties().getFocusDepthOfField(), companion.getDEFAULT().getFocusDepthOfField()) || !Intrinsics.areEqual(el.getCameraProperties().getFocusDistance(), companion.getDEFAULT().getFocusDistance())) {
                    serializer.startTag(namespace, "focus-blur");
                    if (!el.getCameraProperties().getFocusBlurEnabled()) {
                        HI0.YzO.nr(serializer, namespace, "enabled", el.getCameraProperties().getFocusBlurEnabled());
                    }
                    KeyableSerializerKt.serialize$default(el.getCameraProperties().getFocusBlurStrength(), null, namespace, serializer, "strength", null, 16, null);
                    KeyableSerializerKt.serialize$default(el.getCameraProperties().getFocusDepthOfField(), null, namespace, serializer, "depth-of-field", null, 16, null);
                    KeyableSerializerKt.serialize$default(el.getCameraProperties().getFocusDistance(), null, namespace, serializer, "distance", null, 16, null);
                    serializer.endTag(namespace, "focus-blur");
                }
            }
            if (!el.getCameraProperties().getFogEnabled()) {
                KeyableSolidColor fogColor = el.getCameraProperties().getFogColor();
                CameraProperties.Companion companion2 = CameraProperties.INSTANCE;
                if (!Intrinsics.areEqual(fogColor, companion2.getDEFAULT().getFogColor()) || !Intrinsics.areEqual(el.getCameraProperties().getFogNearZ(), companion2.getDEFAULT().getFogNearZ()) || !Intrinsics.areEqual(el.getCameraProperties().getFogFarZ(), companion2.getDEFAULT().getFogFarZ())) {
                    serializer.startTag(namespace, "fog");
                    if (!el.getCameraProperties().getFogEnabled()) {
                        HI0.YzO.nr(serializer, namespace, "enabled", el.getCameraProperties().getFogEnabled());
                    }
                    KeyableSerializerKt.serialize$default(el.getCameraProperties().getFogColor(), ((Keyframe) CollectionsKt.first((List) CameraProperties.INSTANCE.getDEFAULT().getFogColor().getKeyframes())).getValue(), namespace, serializer, TtmlNode.ATTR_TTS_COLOR, null, 16, null);
                    KeyableSerializerKt.serialize$default(el.getCameraProperties().getFogNearZ(), null, namespace, serializer, "near-z", null, 16, null);
                    KeyableSerializerKt.serialize$default(el.getCameraProperties().getFogFarZ(), null, namespace, serializer, "far-z", null, 16, null);
                    serializer.endTag(namespace, "fog");
                }
            }
            serializer.endTag(namespace, "camera");
        }
    });
    public static final SceneElementType NullObject = new SceneElementType("NullObject", 6, new ISceneElementType() { // from class: com.alightcreative.app.motion.scene.NullObjectElementTypeImpl
        public static final int $stable;
        private static final boolean hasBlendingMode = false;
        private static final boolean hasBorderAndShadow = false;
        private static final boolean hasFillColor = false;
        private static final boolean hasFillGradient = false;
        private static final boolean hasFillImage = false;
        private static final boolean hasFillType = false;
        private static final boolean hasFillVideo = false;
        private static final boolean hasGain = false;
        private static final boolean hasNestedScene = false;
        private static final boolean hasOpacity = false;
        private static final boolean hasOutline = false;
        private static final boolean hasSourceMedia = false;
        private static final boolean hasStroke = false;
        private static final boolean hasText = false;
        private static final boolean hasVisualContent = false;
        private static final boolean hasVolume = false;
        private static final WzY.yg paint;
        private static final String xmlTag = "nullobj";
        private static final boolean hasTransform = true;
        private static final boolean isRenderable = true;
        private static final boolean hasVisualEffects = true;
        private static final C1487z scratchPath = new C1487z();

        private final void addCrosshairs(C1487z c1487z) {
            c1487z.Y(0.0f, -5.0f);
            c1487z.J(0.0f, -25.0f);
            c1487z.Y(0.0f, 5.0f);
            c1487z.J(0.0f, 25.0f);
            c1487z.Y(-5.0f, 0.0f);
            c1487z.J(-25.0f, 0.0f);
            c1487z.Y(5.0f, 0.0f);
            c1487z.J(25.0f, 0.0f);
        }

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
        }

        static {
            WzY.yg ygVar = new WzY.yg();
            ygVar.ty(yg.w6.f11694O);
            ygVar.az(2.0f);
            ygVar.gh(SolidColor.INSTANCE.getGRAY());
            paint = ygVar;
            $stable = 8;
        }

        private final void addCorners(C1487z c1487z) {
            c1487z.Y(-50.0f, -30.0f);
            c1487z.J(-50.0f, -50.0f);
            c1487z.J(-30.0f, -50.0f);
            c1487z.Y(50.0f, -30.0f);
            c1487z.J(50.0f, -50.0f);
            c1487z.J(30.0f, -50.0f);
            c1487z.Y(-50.0f, 30.0f);
            c1487z.J(-50.0f, 50.0f);
            c1487z.J(-30.0f, 50.0f);
            c1487z.Y(50.0f, 30.0f);
            c1487z.J(50.0f, 50.0f);
            c1487z.J(30.0f, 50.0f);
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
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
            if (env.getRenderMode() == RenderMode.EXPORT) {
                return;
            }
            C1487z c1487z = scratchPath;
            c1487z.ijL();
            addCrosshairs(c1487z);
            addCorners(c1487z);
            c1487z.Mx(el.getTransform().valueAtTime(env).getMatrix());
            canvas.O();
            WzY.yg ygVar = paint;
            ygVar.az(WzY.SPz.ty(canvas, 2131166239));
            SolidColor.Companion companion = SolidColor.INSTANCE;
            ygVar.gh(companion.getGRAY());
            ygVar.xMQ(0.75f);
            canvas.te(c1487z, ygVar);
            ygVar.az(WzY.SPz.ty(canvas, 2131166240));
            ygVar.gh(el.getTag() != ElementTag.NONE ? el.getTag().getColors().n() : companion.getBLACK());
            ygVar.xMQ(0.75f);
            canvas.te(c1487z, ygVar);
            canvas.n();
        }

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
            EnumC1485c enumC1485cN;
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
            el.getType();
            SceneElementType sceneElementType = SceneElementType.Shape;
            if (SceneElementRenderingKt.renderGeneralElementSelectionAndEditMode(el, canvas, env, selection, viewport) || (enumC1485cN = EnumC1485c.f11632n.n(selection, el.getId(), env.getEditMode())) == EnumC1485c.f11635t) {
                return;
            }
            C1487z c1487z = scratchPath;
            c1487z.ijL();
            addCorners(c1487z);
            TransformKt.transform(c1487z, CameraElementKt.applyCameraAndParenting(el, env, env.getTime()).getTransform().valueAtTime(env));
            WzY.SPz.qie(canvas, c1487z, enumC1485cN, null, null, 12, null);
        }

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public void serialize(SceneElement el, String namespace, XmlSerializer serializer) throws IOException {
            Intrinsics.checkNotNullParameter(el, "el");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            el.getType();
            SceneElementType sceneElementType = SceneElementType.Shape;
            serializer.startTag(namespace, getXmlTag());
            SceneElementKt.serializeCommonAttributes(el, namespace, serializer);
            serializer.attribute(namespace, "type", el.getCameraProperties().getType().getId());
            SceneElementKt.serializeCommonChildTags(el, namespace, serializer);
            serializer.endTag(namespace, getXmlTag());
        }

        @Override // com.alightcreative.app.motion.scene.ISceneElementType
        public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(parser, "parser");
            parser.require(2, ns, getXmlTag());
            SceneElement sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeBaseSceneElement(SceneElementType.NullObject, ns, parser);
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    int depth = parser.getDepth();
                    String name = parser.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    sceneElementUnserializeBaseSceneElement = SceneElementKt.unserializeCommonChildTag(sceneElementUnserializeBaseSceneElement, name, ns, parser, isPackage);
                    if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                        throw new IllegalStateException("Did not consume all tag contents");
                    }
                }
            }
            return sceneElementUnserializeBaseSceneElement;
        }
    });

    private static final /* synthetic */ SceneElementType[] $values() {
        return new SceneElementType[]{Shape, Drawing, Scene, Text, Audio, Camera, NullObject};
    }

    public static EnumEntries<SceneElementType> getEntries() {
        return $ENTRIES;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasBlendingMode() {
        return this.impl.getHasBlendingMode();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasBorderAndShadow() {
        return this.impl.getHasBorderAndShadow();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillColor() {
        return this.impl.getHasFillColor();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillGradient() {
        return this.impl.getHasFillGradient();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillImage() {
        return this.impl.getHasFillImage();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillType() {
        return this.impl.getHasFillType();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasFillVideo() {
        return this.impl.getHasFillVideo();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasGain() {
        return this.impl.getHasGain();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasNestedScene() {
        return this.impl.getHasNestedScene();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasOpacity() {
        return this.impl.getHasOpacity();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasOutline() {
        return this.impl.getHasOutline();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasSourceMedia() {
        return this.impl.getHasSourceMedia();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasStroke() {
        return this.impl.getHasStroke();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasText() {
        return this.impl.getHasText();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasTransform() {
        return this.impl.getHasTransform();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasVisualContent() {
        return this.impl.getHasVisualContent();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasVisualEffects() {
        return this.impl.getHasVisualEffects();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean getHasVolume() {
        return this.impl.getHasVolume();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public String getXmlTag() {
        return this.impl.getXmlTag();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public boolean isRenderable() {
        return this.impl.isRenderable();
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void serialize(SceneElement el, String namespace, XmlSerializer serializer) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.impl.serialize(el, namespace, serializer);
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public SceneElement unserializeElement(String ns, XmlPullParser parser, boolean isPackage) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        return this.impl.unserializeElement(ns, parser, isPackage);
    }

    static {
        SceneElementType[] sceneElementTypeArr$values = $values();
        $VALUES = sceneElementTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sceneElementTypeArr$values);
    }

    public static SceneElementType valueOf(String str) {
        return (SceneElementType) Enum.valueOf(SceneElementType.class, str);
    }

    public static SceneElementType[] values() {
        return (SceneElementType[]) $VALUES.clone();
    }

    public final ISceneElementType getImpl() {
        return this.impl;
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void render(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.impl.render(el, canvas, env, selection, viewport);
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderOutline(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.impl.renderOutline(el, canvas, env, selection, viewport);
    }

    @Override // com.alightcreative.app.motion.scene.ISceneElementType
    public void renderSelection(SceneElement el, WzY.s4 canvas, RenderEnvironment env, SceneSelection selection, Rectangle viewport) {
        Intrinsics.checkNotNullParameter(el, "el");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.impl.renderSelection(el, canvas, env, selection, viewport);
    }

    private SceneElementType(String str, int i2, ISceneElementType iSceneElementType) {
        this.impl = iSceneElementType;
    }
}
