package com.alightcreative.app.motion.scene;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.animators.AnimatorEnvironment;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a(\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"serialize", "", "Lcom/alightcreative/app/motion/scene/KeyableEdgeDecoration;", "default", "namespace", "", "serializer", "Lorg/xmlpull/v1/XmlSerializer;", "unserializeKeyableEdgeDecoration", "ns", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "tag", "isPackage", "", "valueAtTime", "Lcom/alightcreative/app/motion/scene/EdgeDecoration;", "t", "", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEdgeDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeDecoration.kt\ncom/alightcreative/app/motion/scene/EdgeDecorationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n*L\n1#1,225:1\n1#2:226\n1310#3,2:227\n1310#3,2:229\n1310#3,2:231\n1310#3,2:233\n45#4,12:235\n*S KotlinDebug\n*F\n+ 1 EdgeDecoration.kt\ncom/alightcreative/app/motion/scene/EdgeDecorationKt\n*L\n175#1:227,2\n176#1:229,2\n177#1:231,2\n178#1:233,2\n182#1:235,12\n*E\n"})
public final class EdgeDecorationKt {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EdgeDecorationType.values().length];
            try {
                iArr[EdgeDecorationType.BORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EdgeDecorationType.SHADOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EdgeDecorationType.GLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EdgeDecorationType.STROKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EdgeDecorationType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EdgeDecorationDirection.values().length];
            try {
                iArr2[EdgeDecorationDirection.INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EdgeDecorationDirection.OUTSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EdgeDecorationDirection.CENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final EdgeDecoration valueAtTime(KeyableEdgeDecoration keyableEdgeDecoration, float f3) {
        Intrinsics.checkNotNullParameter(keyableEdgeDecoration, "<this>");
        return new EdgeDecoration(keyableEdgeDecoration.getType(), keyableEdgeDecoration.getDirection(), keyableEdgeDecoration.getEnabled(), (SolidColor) KeyableKt.valueAtTime(keyableEdgeDecoration.getColor(), f3), ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getAlpha(), f3)).floatValue(), ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getSize(), f3)).floatValue(), ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getHardness(), f3)).floatValue(), (Vector2D) KeyableKt.valueAtTime(keyableEdgeDecoration.getOffset(), f3));
    }

    public static final void serialize(KeyableEdgeDecoration keyableEdgeDecoration, KeyableEdgeDecoration keyableEdgeDecoration2, String str, XmlSerializer serializer) throws IOException {
        String str2;
        Intrinsics.checkNotNullParameter(keyableEdgeDecoration, "<this>");
        Intrinsics.checkNotNullParameter(keyableEdgeDecoration2, "default");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (keyableEdgeDecoration2.getType() != keyableEdgeDecoration.getType()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[keyableEdgeDecoration.getType().ordinal()];
        if (i2 == 1) {
            str2 = "border";
        } else if (i2 == 2) {
            str2 = "shadow";
        } else if (i2 == 3) {
            str2 = "glow";
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            str2 = "path-stroke";
        }
        String str3 = str2;
        if (Intrinsics.areEqual(keyableEdgeDecoration2, keyableEdgeDecoration)) {
            return;
        }
        serializer.startTag(str, str3);
        String strName = keyableEdgeDecoration.getDirection().name();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = strName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        serializer.attribute(str, "direction", lowerCase);
        if (!keyableEdgeDecoration.getEnabled()) {
            HI0.YzO.nr(serializer, str, "enabled", keyableEdgeDecoration.getEnabled());
        }
        if (keyableEdgeDecoration.getType() == EdgeDecorationType.BORDER && keyableEdgeDecoration.getBorderId() > 0) {
            HI0.YzO.rl(serializer, str, "id", keyableEdgeDecoration.getBorderId());
        }
        if (keyableEdgeDecoration.getType() == EdgeDecorationType.STROKE) {
            if (keyableEdgeDecoration.getCap() != keyableEdgeDecoration2.getCap()) {
                serializer.attribute(str, "cap", keyableEdgeDecoration.getCap().getId());
            }
            if (keyableEdgeDecoration.getJoin() != keyableEdgeDecoration2.getJoin()) {
                serializer.attribute(str, "join", keyableEdgeDecoration.getJoin().getId());
            }
            if (keyableEdgeDecoration.getEndStyle() != keyableEdgeDecoration2.getEndStyle()) {
                serializer.attribute(str, TtmlNode.END, keyableEdgeDecoration.getEndStyle().getId());
            }
            if (keyableEdgeDecoration.getStartStyle() != keyableEdgeDecoration2.getStartStyle()) {
                serializer.attribute(str, TtmlNode.START, keyableEdgeDecoration.getStartStyle().getId());
            }
            HI0.YzO.n(serializer, str, "end-size", keyableEdgeDecoration.getEndSize());
        }
        KeyableSerializerKt.serialize$default(keyableEdgeDecoration.getColor(), ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration2.getColor().getKeyframes())).getValue(), str, serializer, TtmlNode.ATTR_TTS_COLOR, null, 16, null);
        EdgeDecorationType type = keyableEdgeDecoration.getType();
        EdgeDecorationType edgeDecorationType = EdgeDecorationType.SHADOW;
        if (type == edgeDecorationType || keyableEdgeDecoration.getType() == EdgeDecorationType.GLOW) {
            KeyableSerializerKt.serialize$default(keyableEdgeDecoration.getAlpha(), ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration2.getAlpha().getKeyframes())).getValue(), str, serializer, "opacity", null, 16, null);
        }
        KeyableSerializerKt.serialize$default(keyableEdgeDecoration.getSize(), ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration2.getSize().getKeyframes())).getValue(), str, serializer, "size", null, 16, null);
        if (keyableEdgeDecoration.getType() == edgeDecorationType || keyableEdgeDecoration.getType() == EdgeDecorationType.GLOW) {
            KeyableSerializerKt.serialize$default(keyableEdgeDecoration.getHardness(), ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration2.getHardness().getKeyframes())).getValue(), str, serializer, "hardness", null, 16, null);
        }
        if (keyableEdgeDecoration.getType() == edgeDecorationType) {
            KeyableSerializerKt.serialize$default(keyableEdgeDecoration.getOffset(), ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration2.getOffset().getKeyframes())).getValue(), str, serializer, "offset", null, 16, null);
        }
        serializer.endTag(str, str3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KeyableEdgeDecoration unserializeKeyableEdgeDecoration(String str, XmlPullParser parser, String tag, boolean z2) throws XmlPullParserException, IOException, MalformedSceneException {
        EdgeDecorationDirection edgeDecorationDirection;
        KeyableEdgeDecoration no_inner_border;
        int length;
        int i2;
        StrokeEnd endStyle;
        StrokeCap cap;
        int length2;
        int i3;
        StrokeJoin join;
        int length3;
        int i5;
        StrokeEnd startStyle;
        int length4;
        int i7;
        KeyableEdgeDecoration keyableEdgeDecorationCopy;
        Float floatOrNull;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(tag, "tag");
        parser.require(2, str, tag);
        String attributeValue = parser.getAttributeValue(str, "direction");
        if (attributeValue != null) {
            EdgeDecorationDirection[] edgeDecorationDirectionArrValues = EdgeDecorationDirection.values();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = attributeValue.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            edgeDecorationDirection = (EdgeDecorationDirection) HI0.Ew.n(edgeDecorationDirectionArrValues, upperCase);
            if (edgeDecorationDirection == null) {
                edgeDecorationDirection = EdgeDecorationDirection.INSIDE;
            }
        }
        switch (tag.hashCode()) {
            case -1383304148:
                if (tag.equals("border")) {
                    int i8 = WhenMappings.$EnumSwitchMapping$1[edgeDecorationDirection.ordinal()];
                    if (i8 == 1) {
                        no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_INNER_BORDER();
                    } else if (i8 == 2) {
                        no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_OUTER_BORDER();
                    } else {
                        if (i8 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_CENTERED_BORDER();
                    }
                    KeyableEdgeDecoration keyableEdgeDecoration = no_inner_border;
                    String attributeValue2 = parser.getAttributeValue(str, "enabled");
                    boolean z3 = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : true;
                    String attributeValue3 = parser.getAttributeValue(str, "id");
                    int iIntValue = (attributeValue3 != null || (intOrNull = StringsKt.toIntOrNull(attributeValue3)) == null) ? 0 : intOrNull.intValue();
                    String attributeValue4 = parser.getAttributeValue(str, "cap");
                    String attributeValue5 = parser.getAttributeValue(str, "join");
                    String attributeValue6 = parser.getAttributeValue(str, GDEJgAYrPQHfw.JfFK);
                    String attributeValue7 = parser.getAttributeValue(str, TtmlNode.END);
                    String attributeValue8 = parser.getAttributeValue(str, "end-size");
                    float fFloatValue = (attributeValue8 != null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue8)) == null) ? 1.5f : floatOrNull.floatValue();
                    StrokeCap[] strokeCapArrValues = StrokeCap.values();
                    length = strokeCapArrValues.length;
                    i2 = 0;
                    while (true) {
                        endStyle = null;
                        if (i2 >= length) {
                            cap = strokeCapArrValues[i2];
                            if (!Intrinsics.areEqual(cap.getId(), attributeValue4)) {
                                i2++;
                            }
                        } else {
                            cap = null;
                        }
                    }
                    if (cap == null) {
                        cap = keyableEdgeDecoration.getCap();
                    }
                    StrokeCap strokeCap = cap;
                    StrokeJoin[] strokeJoinArrValues = StrokeJoin.values();
                    length2 = strokeJoinArrValues.length;
                    i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            join = strokeJoinArrValues[i3];
                            if (!Intrinsics.areEqual(join.getId(), attributeValue5)) {
                                i3++;
                            }
                        } else {
                            join = null;
                        }
                    }
                    if (join == null) {
                        join = keyableEdgeDecoration.getJoin();
                    }
                    StrokeJoin strokeJoin = join;
                    StrokeEnd[] strokeEndArrValues = StrokeEnd.values();
                    length3 = strokeEndArrValues.length;
                    i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                            startStyle = strokeEndArrValues[i5];
                            if (!Intrinsics.areEqual(startStyle.getId(), attributeValue6)) {
                                i5++;
                            }
                        } else {
                            startStyle = null;
                        }
                    }
                    if (startStyle == null) {
                        startStyle = keyableEdgeDecoration.getStartStyle();
                    }
                    StrokeEnd strokeEnd = startStyle;
                    StrokeEnd[] strokeEndArrValues2 = StrokeEnd.values();
                    length4 = strokeEndArrValues2.length;
                    i7 = 0;
                    while (true) {
                        if (i7 >= length4) {
                            StrokeEnd strokeEnd2 = strokeEndArrValues2[i7];
                            if (Intrinsics.areEqual(strokeEnd2.getId(), attributeValue7)) {
                                endStyle = strokeEnd2;
                            } else {
                                i7++;
                            }
                        }
                    }
                    if (endStyle == null) {
                        endStyle = keyableEdgeDecoration.getEndStyle();
                    }
                    KeyableEdgeDecoration keyableEdgeDecorationCopy2 = keyableEdgeDecoration.copy((16339 & 1) != 0 ? keyableEdgeDecoration.type : null, (16339 & 2) != 0 ? keyableEdgeDecoration.direction : null, (16339 & 4) != 0 ? keyableEdgeDecoration.enabled : z3, (16339 & 8) != 0 ? keyableEdgeDecoration.color : null, (16339 & 16) != 0 ? keyableEdgeDecoration.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecoration.size : null, (16339 & 64) != 0 ? keyableEdgeDecoration.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecoration.offset : null, (16339 & 256) != 0 ? keyableEdgeDecoration.cap : strokeCap, (16339 & 512) != 0 ? keyableEdgeDecoration.join : strokeJoin, (16339 & 1024) != 0 ? keyableEdgeDecoration.startStyle : strokeEnd, (16339 & 2048) != 0 ? keyableEdgeDecoration.endStyle : endStyle, (16339 & 4096) != 0 ? keyableEdgeDecoration.endSize : fFloatValue, (16339 & 8192) != 0 ? keyableEdgeDecoration.borderId : iIntValue);
                    while (parser.next() != 3) {
                        if (parser.getEventType() == 2) {
                            int depth = parser.getDepth();
                            String name = parser.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            switch (name.hashCode()) {
                                case -1267206133:
                                    if (name.equals("opacity")) {
                                        keyableEdgeDecorationCopy = keyableEdgeDecorationCopy2.copy((16339 & 1) != 0 ? keyableEdgeDecorationCopy2.type : null, (16339 & 2) != 0 ? keyableEdgeDecorationCopy2.direction : null, (16339 & 4) != 0 ? keyableEdgeDecorationCopy2.enabled : false, (16339 & 8) != 0 ? keyableEdgeDecorationCopy2.color : null, (16339 & 16) != 0 ? keyableEdgeDecorationCopy2.alpha : KeyableSerializerKt.unserializeKeyable(str, parser, name, ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration.getAlpha().getKeyframes())).getValue(), z2), (16339 & 32) != 0 ? keyableEdgeDecorationCopy2.size : null, (16339 & 64) != 0 ? keyableEdgeDecorationCopy2.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecorationCopy2.offset : null, (16339 & 256) != 0 ? keyableEdgeDecorationCopy2.cap : null, (16339 & 512) != 0 ? keyableEdgeDecorationCopy2.join : null, (16339 & 1024) != 0 ? keyableEdgeDecorationCopy2.startStyle : null, (16339 & 2048) != 0 ? keyableEdgeDecorationCopy2.endStyle : null, (16339 & 4096) != 0 ? keyableEdgeDecorationCopy2.endSize : 0.0f, (16339 & 8192) != 0 ? keyableEdgeDecorationCopy2.borderId : 0);
                                        keyableEdgeDecorationCopy2 = keyableEdgeDecorationCopy;
                                    }
                                    HI0.YzO.J2(parser);
                                    break;
                                case -1019779949:
                                    if (name.equals("offset")) {
                                        keyableEdgeDecorationCopy = keyableEdgeDecorationCopy2.copy((16339 & 1) != 0 ? keyableEdgeDecorationCopy2.type : null, (16339 & 2) != 0 ? keyableEdgeDecorationCopy2.direction : null, (16339 & 4) != 0 ? keyableEdgeDecorationCopy2.enabled : false, (16339 & 8) != 0 ? keyableEdgeDecorationCopy2.color : null, (16339 & 16) != 0 ? keyableEdgeDecorationCopy2.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecorationCopy2.size : null, (16339 & 64) != 0 ? keyableEdgeDecorationCopy2.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecorationCopy2.offset : KeyableSerializerKt.unserializeKeyable(str, parser, name, ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration.getOffset().getKeyframes())).getValue(), z2), (16339 & 256) != 0 ? keyableEdgeDecorationCopy2.cap : null, (16339 & 512) != 0 ? keyableEdgeDecorationCopy2.join : null, (16339 & 1024) != 0 ? keyableEdgeDecorationCopy2.startStyle : null, (16339 & 2048) != 0 ? keyableEdgeDecorationCopy2.endStyle : null, (16339 & 4096) != 0 ? keyableEdgeDecorationCopy2.endSize : 0.0f, (16339 & 8192) != 0 ? keyableEdgeDecorationCopy2.borderId : 0);
                                        keyableEdgeDecorationCopy2 = keyableEdgeDecorationCopy;
                                    }
                                    HI0.YzO.J2(parser);
                                    break;
                                case 3530753:
                                    if (name.equals("size")) {
                                        keyableEdgeDecorationCopy = keyableEdgeDecorationCopy2.copy((16339 & 1) != 0 ? keyableEdgeDecorationCopy2.type : null, (16339 & 2) != 0 ? keyableEdgeDecorationCopy2.direction : null, (16339 & 4) != 0 ? keyableEdgeDecorationCopy2.enabled : false, (16339 & 8) != 0 ? keyableEdgeDecorationCopy2.color : null, (16339 & 16) != 0 ? keyableEdgeDecorationCopy2.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecorationCopy2.size : KeyableSerializerKt.unserializeKeyable(str, parser, name, ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration.getSize().getKeyframes())).getValue(), z2), (16339 & 64) != 0 ? keyableEdgeDecorationCopy2.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecorationCopy2.offset : null, (16339 & 256) != 0 ? keyableEdgeDecorationCopy2.cap : null, (16339 & 512) != 0 ? keyableEdgeDecorationCopy2.join : null, (16339 & 1024) != 0 ? keyableEdgeDecorationCopy2.startStyle : null, (16339 & 2048) != 0 ? keyableEdgeDecorationCopy2.endStyle : null, (16339 & 4096) != 0 ? keyableEdgeDecorationCopy2.endSize : 0.0f, (16339 & 8192) != 0 ? keyableEdgeDecorationCopy2.borderId : 0);
                                        keyableEdgeDecorationCopy2 = keyableEdgeDecorationCopy;
                                    }
                                    HI0.YzO.J2(parser);
                                    break;
                                case 94842723:
                                    if (name.equals(TtmlNode.ATTR_TTS_COLOR)) {
                                        keyableEdgeDecorationCopy = keyableEdgeDecorationCopy2.copy((16339 & 1) != 0 ? keyableEdgeDecorationCopy2.type : null, (16339 & 2) != 0 ? keyableEdgeDecorationCopy2.direction : null, (16339 & 4) != 0 ? keyableEdgeDecorationCopy2.enabled : false, (16339 & 8) != 0 ? keyableEdgeDecorationCopy2.color : KeyableSerializerKt.unserializeKeyable(str, parser, name, ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration.getColor().getKeyframes())).getValue(), z2), (16339 & 16) != 0 ? keyableEdgeDecorationCopy2.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecorationCopy2.size : null, (16339 & 64) != 0 ? keyableEdgeDecorationCopy2.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecorationCopy2.offset : null, (16339 & 256) != 0 ? keyableEdgeDecorationCopy2.cap : null, (16339 & 512) != 0 ? keyableEdgeDecorationCopy2.join : null, (16339 & 1024) != 0 ? keyableEdgeDecorationCopy2.startStyle : null, (16339 & 2048) != 0 ? keyableEdgeDecorationCopy2.endStyle : null, (16339 & 4096) != 0 ? keyableEdgeDecorationCopy2.endSize : 0.0f, (16339 & 8192) != 0 ? keyableEdgeDecorationCopy2.borderId : 0);
                                        keyableEdgeDecorationCopy2 = keyableEdgeDecorationCopy;
                                    }
                                    HI0.YzO.J2(parser);
                                    break;
                                case 116645314:
                                    if (name.equals("hardness")) {
                                        keyableEdgeDecorationCopy = keyableEdgeDecorationCopy2.copy((16339 & 1) != 0 ? keyableEdgeDecorationCopy2.type : null, (16339 & 2) != 0 ? keyableEdgeDecorationCopy2.direction : null, (16339 & 4) != 0 ? keyableEdgeDecorationCopy2.enabled : false, (16339 & 8) != 0 ? keyableEdgeDecorationCopy2.color : null, (16339 & 16) != 0 ? keyableEdgeDecorationCopy2.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecorationCopy2.size : null, (16339 & 64) != 0 ? keyableEdgeDecorationCopy2.hardness : KeyableSerializerKt.unserializeKeyable(str, parser, name, ((Keyframe) CollectionsKt.first((List) keyableEdgeDecoration.getHardness().getKeyframes())).getValue(), z2), (16339 & 128) != 0 ? keyableEdgeDecorationCopy2.offset : null, (16339 & 256) != 0 ? keyableEdgeDecorationCopy2.cap : null, (16339 & 512) != 0 ? keyableEdgeDecorationCopy2.join : null, (16339 & 1024) != 0 ? keyableEdgeDecorationCopy2.startStyle : null, (16339 & 2048) != 0 ? keyableEdgeDecorationCopy2.endStyle : null, (16339 & 4096) != 0 ? keyableEdgeDecorationCopy2.endSize : 0.0f, (16339 & 8192) != 0 ? keyableEdgeDecorationCopy2.borderId : 0);
                                        keyableEdgeDecorationCopy2 = keyableEdgeDecorationCopy;
                                    }
                                    HI0.YzO.J2(parser);
                                    break;
                                default:
                                    HI0.YzO.J2(parser);
                                    break;
                            }
                            if (parser.getEventType() != 3 || parser.getDepth() != depth) {
                                throw new IllegalStateException("Did not consume all tag contents");
                            }
                        }
                    }
                    return keyableEdgeDecorationCopy2;
                }
                throw new MalformedSceneException(null, null, false, 7, null);
            case -903579360:
                if (tag.equals("shadow")) {
                    no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_SHADOW();
                    KeyableEdgeDecoration keyableEdgeDecoration2 = no_inner_border;
                    String attributeValue22 = parser.getAttributeValue(str, "enabled");
                    boolean z32 = attributeValue22 != null ? Boolean.parseBoolean(attributeValue22) : true;
                    String attributeValue32 = parser.getAttributeValue(str, "id");
                    if (attributeValue32 != null) {
                    }
                    String attributeValue42 = parser.getAttributeValue(str, "cap");
                    String attributeValue52 = parser.getAttributeValue(str, "join");
                    String attributeValue62 = parser.getAttributeValue(str, GDEJgAYrPQHfw.JfFK);
                    String attributeValue72 = parser.getAttributeValue(str, TtmlNode.END);
                    String attributeValue82 = parser.getAttributeValue(str, "end-size");
                    float fFloatValue2 = (attributeValue82 != null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue82)) == null) ? 1.5f : floatOrNull.floatValue();
                    StrokeCap[] strokeCapArrValues2 = StrokeCap.values();
                    length = strokeCapArrValues2.length;
                    i2 = 0;
                    while (true) {
                        endStyle = null;
                        if (i2 >= length) {
                        }
                        i2++;
                    }
                    if (cap == null) {
                    }
                    StrokeCap strokeCap2 = cap;
                    StrokeJoin[] strokeJoinArrValues2 = StrokeJoin.values();
                    length2 = strokeJoinArrValues2.length;
                    i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                        }
                        i3++;
                    }
                    if (join == null) {
                    }
                    StrokeJoin strokeJoin2 = join;
                    StrokeEnd[] strokeEndArrValues3 = StrokeEnd.values();
                    length3 = strokeEndArrValues3.length;
                    i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                        }
                        i5++;
                    }
                    if (startStyle == null) {
                    }
                    StrokeEnd strokeEnd3 = startStyle;
                    StrokeEnd[] strokeEndArrValues22 = StrokeEnd.values();
                    length4 = strokeEndArrValues22.length;
                    i7 = 0;
                    while (true) {
                        if (i7 >= length4) {
                        }
                        i7++;
                    }
                    if (endStyle == null) {
                    }
                    KeyableEdgeDecoration keyableEdgeDecorationCopy22 = keyableEdgeDecoration2.copy((16339 & 1) != 0 ? keyableEdgeDecoration2.type : null, (16339 & 2) != 0 ? keyableEdgeDecoration2.direction : null, (16339 & 4) != 0 ? keyableEdgeDecoration2.enabled : z32, (16339 & 8) != 0 ? keyableEdgeDecoration2.color : null, (16339 & 16) != 0 ? keyableEdgeDecoration2.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecoration2.size : null, (16339 & 64) != 0 ? keyableEdgeDecoration2.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecoration2.offset : null, (16339 & 256) != 0 ? keyableEdgeDecoration2.cap : strokeCap2, (16339 & 512) != 0 ? keyableEdgeDecoration2.join : strokeJoin2, (16339 & 1024) != 0 ? keyableEdgeDecoration2.startStyle : strokeEnd3, (16339 & 2048) != 0 ? keyableEdgeDecoration2.endStyle : endStyle, (16339 & 4096) != 0 ? keyableEdgeDecoration2.endSize : fFloatValue2, (16339 & 8192) != 0 ? keyableEdgeDecoration2.borderId : iIntValue);
                    while (parser.next() != 3) {
                    }
                    return keyableEdgeDecorationCopy22;
                }
                throw new MalformedSceneException(null, null, false, 7, null);
            case 3175821:
                if (tag.equals("glow")) {
                    no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_GLOW();
                    KeyableEdgeDecoration keyableEdgeDecoration22 = no_inner_border;
                    String attributeValue222 = parser.getAttributeValue(str, "enabled");
                    boolean z322 = attributeValue222 != null ? Boolean.parseBoolean(attributeValue222) : true;
                    String attributeValue322 = parser.getAttributeValue(str, "id");
                    if (attributeValue322 != null) {
                    }
                    String attributeValue422 = parser.getAttributeValue(str, "cap");
                    String attributeValue522 = parser.getAttributeValue(str, "join");
                    String attributeValue622 = parser.getAttributeValue(str, GDEJgAYrPQHfw.JfFK);
                    String attributeValue722 = parser.getAttributeValue(str, TtmlNode.END);
                    String attributeValue822 = parser.getAttributeValue(str, "end-size");
                    float fFloatValue22 = (attributeValue822 != null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue822)) == null) ? 1.5f : floatOrNull.floatValue();
                    StrokeCap[] strokeCapArrValues22 = StrokeCap.values();
                    length = strokeCapArrValues22.length;
                    i2 = 0;
                    while (true) {
                        endStyle = null;
                        if (i2 >= length) {
                        }
                        i2++;
                    }
                    if (cap == null) {
                    }
                    StrokeCap strokeCap22 = cap;
                    StrokeJoin[] strokeJoinArrValues22 = StrokeJoin.values();
                    length2 = strokeJoinArrValues22.length;
                    i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                        }
                        i3++;
                    }
                    if (join == null) {
                    }
                    StrokeJoin strokeJoin22 = join;
                    StrokeEnd[] strokeEndArrValues32 = StrokeEnd.values();
                    length3 = strokeEndArrValues32.length;
                    i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                        }
                        i5++;
                    }
                    if (startStyle == null) {
                    }
                    StrokeEnd strokeEnd32 = startStyle;
                    StrokeEnd[] strokeEndArrValues222 = StrokeEnd.values();
                    length4 = strokeEndArrValues222.length;
                    i7 = 0;
                    while (true) {
                        if (i7 >= length4) {
                        }
                        i7++;
                    }
                    if (endStyle == null) {
                    }
                    KeyableEdgeDecoration keyableEdgeDecorationCopy222 = keyableEdgeDecoration22.copy((16339 & 1) != 0 ? keyableEdgeDecoration22.type : null, (16339 & 2) != 0 ? keyableEdgeDecoration22.direction : null, (16339 & 4) != 0 ? keyableEdgeDecoration22.enabled : z322, (16339 & 8) != 0 ? keyableEdgeDecoration22.color : null, (16339 & 16) != 0 ? keyableEdgeDecoration22.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecoration22.size : null, (16339 & 64) != 0 ? keyableEdgeDecoration22.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecoration22.offset : null, (16339 & 256) != 0 ? keyableEdgeDecoration22.cap : strokeCap22, (16339 & 512) != 0 ? keyableEdgeDecoration22.join : strokeJoin22, (16339 & 1024) != 0 ? keyableEdgeDecoration22.startStyle : strokeEnd32, (16339 & 2048) != 0 ? keyableEdgeDecoration22.endStyle : endStyle, (16339 & 4096) != 0 ? keyableEdgeDecoration22.endSize : fFloatValue22, (16339 & 8192) != 0 ? keyableEdgeDecoration22.borderId : iIntValue);
                    while (parser.next() != 3) {
                    }
                    return keyableEdgeDecorationCopy222;
                }
                throw new MalformedSceneException(null, null, false, 7, null);
            case 766277856:
                if (tag.equals("path-stroke")) {
                    no_inner_border = KeyableEdgeDecoration.INSTANCE.getNO_STROKE();
                    KeyableEdgeDecoration keyableEdgeDecoration222 = no_inner_border;
                    String attributeValue2222 = parser.getAttributeValue(str, "enabled");
                    boolean z3222 = attributeValue2222 != null ? Boolean.parseBoolean(attributeValue2222) : true;
                    String attributeValue3222 = parser.getAttributeValue(str, "id");
                    if (attributeValue3222 != null) {
                    }
                    String attributeValue4222 = parser.getAttributeValue(str, "cap");
                    String attributeValue5222 = parser.getAttributeValue(str, "join");
                    String attributeValue6222 = parser.getAttributeValue(str, GDEJgAYrPQHfw.JfFK);
                    String attributeValue7222 = parser.getAttributeValue(str, TtmlNode.END);
                    String attributeValue8222 = parser.getAttributeValue(str, "end-size");
                    float fFloatValue222 = (attributeValue8222 != null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue8222)) == null) ? 1.5f : floatOrNull.floatValue();
                    StrokeCap[] strokeCapArrValues222 = StrokeCap.values();
                    length = strokeCapArrValues222.length;
                    i2 = 0;
                    while (true) {
                        endStyle = null;
                        if (i2 >= length) {
                        }
                        i2++;
                    }
                    if (cap == null) {
                    }
                    StrokeCap strokeCap222 = cap;
                    StrokeJoin[] strokeJoinArrValues222 = StrokeJoin.values();
                    length2 = strokeJoinArrValues222.length;
                    i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                        }
                        i3++;
                    }
                    if (join == null) {
                    }
                    StrokeJoin strokeJoin222 = join;
                    StrokeEnd[] strokeEndArrValues322 = StrokeEnd.values();
                    length3 = strokeEndArrValues322.length;
                    i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                        }
                        i5++;
                    }
                    if (startStyle == null) {
                    }
                    StrokeEnd strokeEnd322 = startStyle;
                    StrokeEnd[] strokeEndArrValues2222 = StrokeEnd.values();
                    length4 = strokeEndArrValues2222.length;
                    i7 = 0;
                    while (true) {
                        if (i7 >= length4) {
                        }
                        i7++;
                    }
                    if (endStyle == null) {
                    }
                    KeyableEdgeDecoration keyableEdgeDecorationCopy2222 = keyableEdgeDecoration222.copy((16339 & 1) != 0 ? keyableEdgeDecoration222.type : null, (16339 & 2) != 0 ? keyableEdgeDecoration222.direction : null, (16339 & 4) != 0 ? keyableEdgeDecoration222.enabled : z3222, (16339 & 8) != 0 ? keyableEdgeDecoration222.color : null, (16339 & 16) != 0 ? keyableEdgeDecoration222.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecoration222.size : null, (16339 & 64) != 0 ? keyableEdgeDecoration222.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecoration222.offset : null, (16339 & 256) != 0 ? keyableEdgeDecoration222.cap : strokeCap222, (16339 & 512) != 0 ? keyableEdgeDecoration222.join : strokeJoin222, (16339 & 1024) != 0 ? keyableEdgeDecoration222.startStyle : strokeEnd322, (16339 & 2048) != 0 ? keyableEdgeDecoration222.endStyle : endStyle, (16339 & 4096) != 0 ? keyableEdgeDecoration222.endSize : fFloatValue222, (16339 & 8192) != 0 ? keyableEdgeDecoration222.borderId : iIntValue);
                    while (parser.next() != 3) {
                    }
                    return keyableEdgeDecorationCopy2222;
                }
                throw new MalformedSceneException(null, null, false, 7, null);
            default:
                throw new MalformedSceneException(null, null, false, 7, null);
        }
    }

    public static final EdgeDecoration valueAtTime(KeyableEdgeDecoration keyableEdgeDecoration, AnimatorEnvironment env) {
        Intrinsics.checkNotNullParameter(keyableEdgeDecoration, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        return new EdgeDecoration(keyableEdgeDecoration.getType(), keyableEdgeDecoration.getDirection(), keyableEdgeDecoration.getEnabled(), (SolidColor) KeyableKt.valueAtTime(keyableEdgeDecoration.getColor(), env), ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getAlpha(), env)).floatValue(), ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getSize(), env)).floatValue(), ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getHardness(), env)).floatValue(), (Vector2D) KeyableKt.valueAtTime(keyableEdgeDecoration.getOffset(), env));
    }
}
