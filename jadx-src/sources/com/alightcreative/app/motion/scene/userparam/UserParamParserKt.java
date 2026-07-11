package com.alightcreative.app.motion.scene.userparam;

import Ge.j;
import HI0.YzO;
import HI0.gnv;
import HI0.qf;
import IvA.n;
import Iy.w6;
import XoT.C;
import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.QuaternionKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.userparam.UserParamParserKt;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import d8q.jqQ.QTafcm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\r\u001a\u00020\u000e*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a \u0010\u0015\u001a\u00020\u0016*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u0019\u001a\u00020\u001a*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u001b\u001a\u00020\u001c*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u001d\u001a\u00020\u001e*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u001f\u001a\u00020 *\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010!\u001a\u00020\"*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006#"}, d2 = {"readUserParams", "", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "Lorg/xmlpull/v1/XmlPullParser;", "namespace", "", "debugLogContext", "readStaticText", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$StaticText;", "style", "Lcom/alightcreative/app/motion/scene/userparam/StaticTextStyle;", "readSelectorParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Selector;", "readSwitchParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Switch;", "readOrientationParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Orientation;", "readPointParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Point;", "readXYZParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$XYZ;", "readSpinnerParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Spinner;", "readSliderParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Slider;", "readFloatParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$FloatValue;", "readColorParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Color;", "readHueRingParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$HueRing;", "readHueDiscParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$HueDisc;", "readTextureParam", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter$Texture;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserParamParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserParamParser.kt\ncom/alightcreative/app/motion/scene/userparam/UserParamParserKt\n+ 2 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n45#2,12:398\n45#2,5:410\n50#2,7:425\n1557#3:415\n1628#3,3:416\n774#3:419\n865#3,2:420\n1755#3,3:422\n1557#3:432\n1628#3,3:433\n774#3:436\n865#3,2:437\n1611#3,9:439\n1863#3:448\n1864#3:450\n1620#3:451\n1611#3,9:452\n1863#3:461\n1864#3:463\n1620#3:464\n1611#3,9:465\n1863#3:474\n1864#3:476\n1620#3:477\n1#4:449\n1#4:462\n1#4:475\n*S KotlinDebug\n*F\n+ 1 UserParamParser.kt\ncom/alightcreative/app/motion/scene/userparam/UserParamParserKt\n*L\n29#1:398,12\n95#1:410,5\n95#1:425,7\n100#1:415\n100#1:416,3\n100#1:419\n100#1:420,2\n101#1:422,3\n123#1:432\n123#1:433,3\n123#1:436\n123#1:437,2\n248#1:439,9\n248#1:448\n248#1:450\n248#1:451\n289#1:452,9\n289#1:461\n289#1:463\n289#1:464\n290#1:465,9\n290#1:474\n290#1:476\n290#1:477\n248#1:449\n289#1:462\n290#1:475\n*E\n"})
public final class UserParamParserKt {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StaticTextStyle.values().length];
            try {
                iArr[StaticTextStyle.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticTextStyle.SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final UserParameter.Color readColorParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        boolean z2;
        SolidColor black;
        xmlPullParser.require(2, str, TtmlNode.ATTR_TTS_COLOR);
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "alpha");
        if (attributeValue3 == null) {
            attributeValue3 = V8ValueBoolean.FALSE;
        }
        if (Intrinsics.areEqual(attributeValue3, "true")) {
            z2 = true;
        } else {
            if (!Intrinsics.areEqual(attributeValue3, V8ValueBoolean.FALSE)) {
                throw new MalformedXMLException("expected 'true' or 'false'", null, false, 6, null);
            }
            z2 = false;
        }
        boolean z3 = z2;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "default");
        if (attributeValue4 == null || (black = qf.t(gnv.Uo(attributeValue4))) == null) {
            black = SolidColor.INSTANCE.getBLACK();
        }
        SolidColor solidColor = black;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "label");
        if (attributeValue5 == null) {
            attributeValue5 = "";
        }
        YzO.J2(xmlPullParser);
        return new UserParameter.Color(attributeValue, attributeValue5, zN, solidColor, z3);
    }

    private static final UserParameter.FloatValue readFloatParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Float fKN;
        xmlPullParser.require(2, str, "float");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "value");
        float fFloatValue = (attributeValue2 == null || (fKN = gnv.KN(attributeValue2)) == null) ? 0.0f : fKN.floatValue();
        YzO.J2(xmlPullParser);
        return new UserParameter.FloatValue(attributeValue, fFloatValue);
    }

    private static final UserParameter.HueDisc readHueDiscParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Vector3D zero;
        xmlPullParser.require(2, str, "hue-disc");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "default");
        if (attributeValue3 == null || (zero = GeometryKt.toVector3DOrNull(attributeValue3)) == null) {
            zero = Vector3D.INSTANCE.getZERO();
        }
        Vector3D vector3D = zero;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
        if (attributeValue4 == null) {
            attributeValue4 = "";
        }
        String str2 = attributeValue4;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "bias");
        boolean z2 = attributeValue5 != null ? Boolean.parseBoolean(attributeValue5) : false;
        YzO.J2(xmlPullParser);
        return new UserParameter.HueDisc(attributeValue, str2, zN, z2, vector3D);
    }

    private static final UserParameter.HueRing readHueRingParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Float floatOrNull;
        xmlPullParser.require(2, str, "hue-ring");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "default");
        float fFloatValue = (attributeValue3 == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue3)) == null) ? 0.0f : floatOrNull.floatValue();
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
        if (attributeValue4 == null) {
            attributeValue4 = "";
        }
        YzO.J2(xmlPullParser);
        return new UserParameter.HueRing(attributeValue, attributeValue4, zN, fFloatValue);
    }

    private static final UserParameter.Orientation readOrientationParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Quaternion identity;
        xmlPullParser.require(2, str, "orient");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "label");
        if (attributeValue3 == null) {
            attributeValue3 = "";
        }
        String str2 = attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "invert");
        boolean zN2 = attributeValue4 != null ? j.n(attributeValue4) : false;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "default");
        if (attributeValue5 == null || (identity = QuaternionKt.toQuaternionOrNull(attributeValue5)) == null) {
            identity = Quaternion.INSTANCE.getIDENTITY();
        }
        Quaternion quaternion = identity;
        YzO.J2(xmlPullParser);
        return new UserParameter.Orientation(attributeValue, str2, zN, quaternion, zN2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UserParameter.Point readPointParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Vector2D zero;
        Vector2D vector2D;
        Vector2D vector2D2;
        PointType pointType;
        String attributeValue;
        Float fKN;
        xmlPullParser.require(2, str, "point");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue2 == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue3 == null) {
            attributeValue3 = "true";
        }
        boolean zN = j.n(attributeValue3);
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "default");
        if (attributeValue4 == null || (zero = GeometryKt.toVector2DOrNull(attributeValue4)) == null) {
            zero = Vector2D.INSTANCE.getZERO();
        }
        Vector2D vector2D3 = zero;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "min");
        if (attributeValue5 == null || (vector2D = GeometryKt.toVector2DOrNull(attributeValue5)) == null) {
            vector2D = new Vector2D(-9999.0f, -9999.0f);
        }
        Vector2D vector2D4 = vector2D;
        String attributeValue6 = xmlPullParser.getAttributeValue(str, "max");
        if (attributeValue6 == null || (vector2D2 = GeometryKt.toVector2DOrNull(attributeValue6)) == null) {
            vector2D2 = new Vector2D(9999.0f, 9999.0f);
        }
        Vector2D vector2D5 = vector2D2;
        String attributeValue7 = xmlPullParser.getAttributeValue(str, "step");
        float fFloatValue = (attributeValue7 == null || (fKN = gnv.KN(attributeValue7)) == null) ? 1.0f : fKN.floatValue();
        String attributeValue8 = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue8 == null) {
            attributeValue8 = "layer";
        }
        switch (attributeValue8.hashCode()) {
            case -1019779949:
                if (attributeValue8.equals("offset")) {
                    pointType = PointType.OFFSET;
                    PointType pointType2 = pointType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                        attributeValue = "";
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Point(attributeValue2, attributeValue, zN, vector2D4, vector2D5, vector2D3, pointType2, fFloatValue);
                }
                throw new MalformedXMLException("expected 'layer', 'screen', 'offset', or 'size'", null, false, 6, null);
            case -907689876:
                if (attributeValue8.equals("screen")) {
                    pointType = PointType.SCREEN;
                    PointType pointType22 = pointType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Point(attributeValue2, attributeValue, zN, vector2D4, vector2D5, vector2D3, pointType22, fFloatValue);
                }
                throw new MalformedXMLException("expected 'layer', 'screen', 'offset', or 'size'", null, false, 6, null);
            case 3530753:
                if (attributeValue8.equals("size")) {
                    pointType = PointType.SIZE;
                    PointType pointType222 = pointType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Point(attributeValue2, attributeValue, zN, vector2D4, vector2D5, vector2D3, pointType222, fFloatValue);
                }
                throw new MalformedXMLException("expected 'layer', 'screen', 'offset', or 'size'", null, false, 6, null);
            case 102749521:
                if (attributeValue8.equals("layer")) {
                    pointType = PointType.LAYER;
                    PointType pointType2222 = pointType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Point(attributeValue2, attributeValue, zN, vector2D4, vector2D5, vector2D3, pointType2222, fFloatValue);
                }
                throw new MalformedXMLException("expected 'layer', 'screen', 'offset', or 'size'", null, false, 6, null);
            default:
                throw new MalformedXMLException("expected 'layer', 'screen', 'offset', or 'size'", null, false, 6, null);
        }
    }

    private static final UserParameter.Switch readSwitchParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        boolean z2;
        xmlPullParser.require(2, str, "switch");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "enableTargets");
        List listSplit$default = StringsKt.split$default((CharSequence) (attributeValue3 == null ? "" : attributeValue3), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "default");
        if (attributeValue4 == null) {
            attributeValue4 = "true";
        }
        if (Intrinsics.areEqual(attributeValue4, "true")) {
            z2 = true;
        } else {
            if (!Intrinsics.areEqual(attributeValue4, V8ValueBoolean.FALSE)) {
                throw new MalformedXMLException("expected 'true' or 'false'", null, false, 6, null);
            }
            z2 = false;
        }
        boolean z3 = z2;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "label");
        String str2 = attributeValue5 != null ? attributeValue5 : "";
        YzO.J2(xmlPullParser);
        return new UserParameter.Switch(attributeValue, str2, zN, z3, arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UserParameter.Texture readTextureParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        TextureSrcType textureSrcType;
        String attributeValue;
        xmlPullParser.require(2, str, "texture");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue2 == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue3 == null) {
            attributeValue3 = "true";
        }
        boolean zN = j.n(attributeValue3);
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "src");
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "downsample");
        if (attributeValue5 == null) {
            attributeValue5 = "1";
        }
        int iRl = j.rl(attributeValue5);
        String attributeValue6 = xmlPullParser.getAttributeValue(str, "srcType");
        if (attributeValue6 == null) {
            attributeValue6 = attributeValue4 == null ? "user" : "image";
        }
        switch (attributeValue6.hashCode()) {
            case -1378118592:
                if (attributeValue6.equals(V8ValueTypedArray.PROPERTY_BUFFER)) {
                    textureSrcType = TextureSrcType.BUFFER;
                    TextureSrcType textureSrcType2 = textureSrcType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                        attributeValue = "";
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Texture(attributeValue2, attributeValue, zN, textureSrcType2, attributeValue4, iRl);
                }
                throw new MalformedXMLException("expected 'composition', 'content', 'image', or 'user'", null, false, 6, null);
            case 3059471:
                if (attributeValue6.equals("comp")) {
                    textureSrcType = TextureSrcType.COMPOSITION;
                    TextureSrcType textureSrcType22 = textureSrcType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Texture(attributeValue2, attributeValue, zN, textureSrcType22, attributeValue4, iRl);
                }
                throw new MalformedXMLException("expected 'composition', 'content', 'image', or 'user'", null, false, 6, null);
            case 3599307:
                if (attributeValue6.equals("user")) {
                    textureSrcType = TextureSrcType.USER;
                    TextureSrcType textureSrcType222 = textureSrcType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Texture(attributeValue2, attributeValue, zN, textureSrcType222, attributeValue4, iRl);
                }
                throw new MalformedXMLException("expected 'composition', 'content', 'image', or 'user'", null, false, 6, null);
            case 100313435:
                if (attributeValue6.equals("image")) {
                    textureSrcType = TextureSrcType.IMAGE;
                    TextureSrcType textureSrcType2222 = textureSrcType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Texture(attributeValue2, attributeValue, zN, textureSrcType2222, attributeValue4, iRl);
                }
                throw new MalformedXMLException("expected 'composition', 'content', 'image', or 'user'", null, false, 6, null);
            case 951530617:
                if (attributeValue6.equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                    textureSrcType = TextureSrcType.CONTENT;
                    TextureSrcType textureSrcType22222 = textureSrcType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Texture(attributeValue2, attributeValue, zN, textureSrcType22222, attributeValue4, iRl);
                }
                throw new MalformedXMLException("expected 'composition', 'content', 'image', or 'user'", null, false, 6, null);
            default:
                throw new MalformedXMLException("expected 'composition', 'content', 'image', or 'user'", null, false, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UserParameter.XYZ readXYZParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Vector3D zero;
        Vector3D vector3D;
        Vector3D vector3D2;
        XYZType xYZType;
        String attributeValue;
        xmlPullParser.require(2, str, "xyz");
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue2 == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue3 == null) {
            attributeValue3 = QTafcm.ddnl;
        }
        boolean zN = j.n(attributeValue3);
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "default");
        if (attributeValue4 == null || (zero = GeometryKt.toVector3DOrNull(attributeValue4)) == null) {
            zero = Vector3D.INSTANCE.getZERO();
        }
        Vector3D vector3D3 = zero;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "min");
        if (attributeValue5 == null || (vector3D = GeometryKt.toVector3DOrNull(attributeValue5)) == null) {
            vector3D = new Vector3D(-9999.0f, -9999.0f, -9999.0f);
        }
        Vector3D vector3D4 = vector3D;
        String attributeValue6 = xmlPullParser.getAttributeValue(str, "max");
        if (attributeValue6 == null || (vector3D2 = GeometryKt.toVector3DOrNull(attributeValue6)) == null) {
            vector3D2 = new Vector3D(9999.0f, 9999.0f, 9999.0f);
        }
        Vector3D vector3D5 = vector3D2;
        String attributeValue7 = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue7 == null) {
            attributeValue7 = "translate";
        }
        int iHashCode = attributeValue7.hashCode();
        if (iHashCode == -925180581) {
            if (attributeValue7.equals("rotate")) {
                xYZType = XYZType.Rotate3D;
                XYZType xYZType2 = xYZType;
                attributeValue = xmlPullParser.getAttributeValue(str, "label");
                if (attributeValue == null) {
                }
                YzO.J2(xmlPullParser);
                return new UserParameter.XYZ(attributeValue2, attributeValue, zN, vector3D4, vector3D5, vector3D3, xYZType2);
            }
            throw new MalformedXMLException("expected 'translate', 'rotate', or 'scale'", null, false, 6, null);
        }
        if (iHashCode == 109250890) {
            if (attributeValue7.equals("scale")) {
                xYZType = XYZType.Scale3D;
                XYZType xYZType22 = xYZType;
                attributeValue = xmlPullParser.getAttributeValue(str, "label");
                if (attributeValue == null) {
                }
                YzO.J2(xmlPullParser);
                return new UserParameter.XYZ(attributeValue2, attributeValue, zN, vector3D4, vector3D5, vector3D3, xYZType22);
            }
            throw new MalformedXMLException("expected 'translate', 'rotate', or 'scale'", null, false, 6, null);
        }
        if (iHashCode == 1052832078 && attributeValue7.equals("translate")) {
            xYZType = XYZType.Translate3D;
            XYZType xYZType222 = xYZType;
            attributeValue = xmlPullParser.getAttributeValue(str, "label");
            if (attributeValue == null) {
                attributeValue = "";
            }
            YzO.J2(xmlPullParser);
            return new UserParameter.XYZ(attributeValue2, attributeValue, zN, vector3D4, vector3D5, vector3D3, xYZType222);
        }
        throw new MalformedXMLException("expected 'translate', 'rotate', or 'scale'", null, false, 6, null);
    }

    private static final UserParameter.Selector readSelectorParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Integer intOrNull;
        int i2 = 2;
        xmlPullParser.require(2, str, "selector");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "default");
        SelectorStyle selectorStyle = null;
        Integer intOrNull2 = attributeValue3 != null ? StringsKt.toIntOrNull(attributeValue3) : null;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "style");
        if (attributeValue4 != null) {
            if (Intrinsics.areEqual(attributeValue4, "dropdown")) {
                selectorStyle = SelectorStyle.DROPDOWN;
            } else {
                if (!Intrinsics.areEqual(attributeValue4, "radio")) {
                    throw new MalformedXMLException("expected 'dropdown' or 'radio'", null, false, 6, null);
                }
                selectorStyle = SelectorStyle.RADIO;
            }
        }
        ArrayList arrayList = new ArrayList();
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "label");
        if (attributeValue5 == null) {
            attributeValue5 = "";
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == i2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "choice")) {
                    String attributeValue6 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue6 == null) {
                        attributeValue6 = "";
                    }
                    String attributeValue7 = xmlPullParser.getAttributeValue(str, "value");
                    if (attributeValue7 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue7)) == null) {
                        throw new MalformedXMLException("Missing or invalid choice value", null, false, 6, null);
                    }
                    int iIntValue = intOrNull.intValue();
                    String attributeValue8 = xmlPullParser.getAttributeValue(str, "enableTargets");
                    List listSplit$default = StringsKt.split$default((CharSequence) (attributeValue8 == null ? "" : attributeValue8), new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(StringsKt.trim((CharSequence) it.next()).toString());
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (((String) obj).length() > 0) {
                            arrayList3.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (((ChoiceInfo) it2.next()).getValue() == iIntValue) {
                                throw new MalformedXMLException("Duplicate choice value '" + iIntValue + "'", null, false, 6, null);
                            }
                        }
                    }
                    arrayList.add(new ChoiceInfo(iIntValue, attributeValue6, arrayList3));
                    YzO.J2(xmlPullParser);
                } else {
                    YzO.J2(xmlPullParser);
                }
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
                i2 = 2;
            }
        }
        if (arrayList.isEmpty()) {
            throw new MalformedXMLException("<selector> must have at least one <choice> element", null, false, 6, null);
        }
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : ((ChoiceInfo) CollectionsKt.first((List) arrayList)).getValue();
        if (selectorStyle == null) {
            selectorStyle = arrayList.size() <= 3 ? SelectorStyle.RADIO : SelectorStyle.DROPDOWN;
        }
        return new UserParameter.Selector(attributeValue, attributeValue5, zN, arrayList, iIntValue2, selectorStyle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UserParameter.Slider readSliderParam(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        SliderType sliderType;
        SliderType sliderType2;
        String attributeValue;
        float f3;
        float fFloatValue;
        String attributeValue2;
        String attributeValue3;
        String attributeValue4;
        String attributeValue5;
        char c2;
        char c4;
        List listEmptyList;
        String attributeValue6;
        List listEmptyList2;
        List listSplit$default;
        Float fKN;
        Float fKN2;
        Float fKN3;
        Float fKN4;
        Float fKN5;
        Float floatOrNull;
        xmlPullParser.require(2, str, "slider");
        String attributeValue7 = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue7 == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue8 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue8 == null) {
            attributeValue8 = "true";
        }
        boolean zN = j.n(attributeValue8);
        String attributeValue9 = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue9 == null) {
            attributeValue9 = "float";
        }
        switch (attributeValue9.hashCode()) {
            case -1266514778:
                if (attributeValue9.equals("frames")) {
                    sliderType = SliderType.FRAMES;
                    sliderType2 = sliderType;
                    String attributeValue10 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue2 = 1.0f;
                    float fFloatValue3 = (attributeValue10 != null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue10)) == null) ? 1.0f : floatOrNull.floatValue();
                    String attributeValue11 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue4 = 0.0f;
                    float fFloatValue5 = (attributeValue11 != null || (fKN5 = gnv.KN(attributeValue11)) == null) ? 0.0f : fKN5.floatValue();
                    String attributeValue12 = xmlPullParser.getAttributeValue(str, "min");
                    float fFloatValue6 = (attributeValue12 != null || (fKN4 = gnv.KN(attributeValue12)) == null) ? 0.0f : fKN4.floatValue();
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null && (fKN3 = gnv.KN(attributeValue)) != null) {
                        fFloatValue = fKN3.floatValue();
                    } else {
                        if (sliderType2 == SliderType.INTEGER) {
                            f3 = 1.0f;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                            if (attributeValue2 != null && (fKN2 = gnv.KN(attributeValue2)) != null) {
                                fFloatValue2 = fKN2.floatValue();
                            } else if (sliderType2 != SliderType.INTEGER) {
                                fFloatValue2 = (f3 - fFloatValue6) / 100.0f;
                            }
                            float f4 = fFloatValue2;
                            attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                            if (attributeValue3 != null && (fKN = gnv.KN(attributeValue3)) != null) {
                                fFloatValue4 = fKN.floatValue();
                            }
                            float f5 = fFloatValue4;
                            attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                            if (attributeValue4 == null) {
                                attributeValue4 = "";
                            }
                            String str2 = attributeValue4;
                            attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                            char c5 = ',';
                            if (attributeValue5 == null || (listSplit$default = StringsKt.split$default((CharSequence) attributeValue5, new char[]{','}, false, 0, 6, (Object) null)) == null) {
                                c2 = 0;
                                c4 = ',';
                                listEmptyList = CollectionsKt.emptyList();
                            } else {
                                c2 = 0;
                                listEmptyList = new ArrayList();
                                Iterator it = listSplit$default.iterator();
                                while (it.hasNext()) {
                                    char c6 = c5;
                                    Float fKN6 = gnv.KN(StringsKt.trim((CharSequence) it.next()).toString());
                                    if (fKN6 != null) {
                                        listEmptyList.add(fKN6);
                                    }
                                    c5 = c6;
                                }
                                c4 = c5;
                            }
                            attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                            if (attributeValue6 != null) {
                                char[] cArr = new char[1];
                                cArr[c2] = c4;
                                List listSplit$default2 = StringsKt.split$default((CharSequence) attributeValue6, cArr, false, 0, 6, (Object) null);
                                if (listSplit$default2 != null) {
                                    listEmptyList2 = new ArrayList();
                                    Iterator it2 = listSplit$default2.iterator();
                                    while (it2.hasNext()) {
                                        Float fKN7 = gnv.KN(StringsKt.trim((CharSequence) it2.next()).toString());
                                        if (fKN7 != null) {
                                            listEmptyList2.add(fKN7);
                                        }
                                    }
                                } else {
                                    listEmptyList2 = CollectionsKt.emptyList();
                                }
                            }
                            List list = listEmptyList2;
                            YzO.J2(xmlPullParser);
                            return new UserParameter.Slider(attributeValue7, str2, zN, fFloatValue6, f3, f4, fFloatValue5, f5, sliderType2, fFloatValue3, listEmptyList, list);
                        }
                        fFloatValue = 10.0f;
                    }
                    f3 = fFloatValue;
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                        if (sliderType2 != SliderType.INTEGER) {
                        }
                    }
                    float f42 = fFloatValue2;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                        fFloatValue4 = fKN.floatValue();
                    }
                    float f53 = fFloatValue4;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str22 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c52 = ',';
                    if (attributeValue5 == null) {
                        c2 = 0;
                        c4 = ',';
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list2 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str22, zN, fFloatValue6, f3, f42, fFloatValue5, f53, sliderType2, fFloatValue3, listEmptyList, list2);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case -1135038327:
                if (attributeValue9.equals("kelvin")) {
                    sliderType = SliderType.KELVIN;
                    sliderType2 = sliderType;
                    String attributeValue102 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue22 = 1.0f;
                    if (attributeValue102 != null) {
                    }
                    String attributeValue112 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue42 = 0.0f;
                    if (attributeValue112 != null) {
                    }
                    String attributeValue122 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue122 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                        if (sliderType2 == SliderType.INTEGER) {
                        }
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f422 = fFloatValue22;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f532 = fFloatValue42;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c522 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list22 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str222, zN, fFloatValue6, f3, f422, fFloatValue5, f532, sliderType2, fFloatValue3, listEmptyList, list22);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case -678927291:
                if (attributeValue9.equals("percent")) {
                    sliderType = SliderType.PERCENT;
                    sliderType2 = sliderType;
                    String attributeValue1022 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue222 = 1.0f;
                    if (attributeValue1022 != null) {
                    }
                    String attributeValue1122 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue422 = 0.0f;
                    if (attributeValue1122 != null) {
                    }
                    String attributeValue1222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue1222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f4222 = fFloatValue222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f5322 = fFloatValue422;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str2222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c5222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str2222, zN, fFloatValue6, f3, f4222, fFloatValue5, f5322, sliderType2, fFloatValue3, listEmptyList, list222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case -324933605:
                if (attributeValue9.equals("relative-float")) {
                    sliderType = SliderType.RELATIVE_FLOAT;
                    sliderType2 = sliderType;
                    String attributeValue10222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue2222 = 1.0f;
                    if (attributeValue10222 != null) {
                    }
                    String attributeValue11222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue4222 = 0.0f;
                    if (attributeValue11222 != null) {
                    }
                    String attributeValue12222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue12222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f42222 = fFloatValue2222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f53222 = fFloatValue4222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str22222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c52222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list2222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str22222, zN, fFloatValue6, f3, f42222, fFloatValue5, f53222, sliderType2, fFloatValue3, listEmptyList, list2222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 3346:
                if (attributeValue9.equals("hz")) {
                    sliderType = SliderType.f46339HZ;
                    sliderType2 = sliderType;
                    String attributeValue102222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue22222 = 1.0f;
                    if (attributeValue102222 != null) {
                    }
                    String attributeValue112222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue42222 = 0.0f;
                    if (attributeValue112222 != null) {
                    }
                    String attributeValue122222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue122222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f422222 = fFloatValue22222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f532222 = fFloatValue42222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str222222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c522222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list22222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str222222, zN, fFloatValue6, f3, f422222, fFloatValue5, f532222, sliderType2, fFloatValue3, listEmptyList, list22222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 113135:
                if (attributeValue9.equals("rpm")) {
                    sliderType = SliderType.RPM;
                    sliderType2 = sliderType;
                    String attributeValue1022222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue222222 = 1.0f;
                    if (attributeValue1022222 != null) {
                    }
                    String attributeValue1122222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue422222 = 0.0f;
                    if (attributeValue1122222 != null) {
                    }
                    String attributeValue1222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue1222222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f4222222 = fFloatValue222222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f5322222 = fFloatValue422222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str2222222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c5222222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list222222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str2222222, zN, fFloatValue6, f3, f4222222, fFloatValue5, f5322222, sliderType2, fFloatValue3, listEmptyList, list222222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 97526364:
                if (attributeValue9.equals("float")) {
                    sliderType = SliderType.FLOAT;
                    sliderType2 = sliderType;
                    String attributeValue10222222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue2222222 = 1.0f;
                    if (attributeValue10222222 != null) {
                    }
                    String attributeValue11222222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue4222222 = 0.0f;
                    if (attributeValue11222222 != null) {
                    }
                    String attributeValue12222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue12222222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f42222222 = fFloatValue2222222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f53222222 = fFloatValue4222222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str22222222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c52222222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list2222222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str22222222, zN, fFloatValue6, f3, f42222222, fFloatValue5, f53222222, sliderType2, fFloatValue3, listEmptyList, list2222222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 1358935620:
                if (attributeValue9.equals("relative-percent")) {
                    sliderType = SliderType.RELATIVE_PERCENT;
                    sliderType2 = sliderType;
                    String attributeValue102222222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue22222222 = 1.0f;
                    if (attributeValue102222222 != null) {
                    }
                    String attributeValue112222222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue42222222 = 0.0f;
                    if (attributeValue112222222 != null) {
                    }
                    String attributeValue122222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue122222222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f422222222 = fFloatValue22222222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f532222222 = fFloatValue42222222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str222222222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c522222222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list22222222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str222222222, zN, fFloatValue6, f3, f422222222, fFloatValue5, f532222222, sliderType2, fFloatValue3, listEmptyList, list22222222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 1958052158:
                if (attributeValue9.equals("integer")) {
                    sliderType = SliderType.INTEGER;
                    sliderType2 = sliderType;
                    String attributeValue1022222222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue222222222 = 1.0f;
                    if (attributeValue1022222222 != null) {
                    }
                    String attributeValue1122222222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue422222222 = 0.0f;
                    if (attributeValue1122222222 != null) {
                    }
                    String attributeValue1222222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue1222222222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f4222222222 = fFloatValue222222222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f5322222222 = fFloatValue422222222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str2222222222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c5222222222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list222222222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str2222222222, zN, fFloatValue6, f3, f4222222222, fFloatValue5, f5322222222, sliderType2, fFloatValue3, listEmptyList, list222222222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 1970096767:
                if (attributeValue9.equals("seconds")) {
                    sliderType = SliderType.SECONDS;
                    sliderType2 = sliderType;
                    String attributeValue10222222222 = xmlPullParser.getAttributeValue(str, "logscale");
                    float fFloatValue2222222222 = 1.0f;
                    if (attributeValue10222222222 != null) {
                    }
                    String attributeValue11222222222 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue4222222222 = 0.0f;
                    if (attributeValue11222222222 != null) {
                    }
                    String attributeValue12222222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue12222222222 != null) {
                    }
                    attributeValue = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue == null) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 != null) {
                    }
                    float f42222222222 = fFloatValue2222222222;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue3 != null) {
                    }
                    float f53222222222 = fFloatValue4222222222;
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue4 == null) {
                    }
                    String str22222222222 = attributeValue4;
                    attributeValue5 = xmlPullParser.getAttributeValue(str, "ticks");
                    char c52222222222 = ',';
                    if (attributeValue5 == null) {
                    }
                    attributeValue6 = xmlPullParser.getAttributeValue(str, "snap");
                    if (attributeValue6 != null) {
                    }
                    List list2222222222 = listEmptyList2;
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Slider(attributeValue7, str22222222222, zN, fFloatValue6, f3, f42222222222, fFloatValue5, f53222222222, sliderType2, fFloatValue3, listEmptyList, list2222222222);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            default:
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final UserParameter.Spinner readSpinnerParam(XmlPullParser xmlPullParser, String str, final String str2) throws XmlPullParserException, IOException, MalformedXMLException {
        SliderType sliderType;
        SliderType sliderType2;
        String attributeValue;
        float fFloatValue;
        float f3;
        String attributeValue2;
        float fFloatValue2;
        float f4;
        String attributeValue3;
        String attributeValue4;
        List listEmptyList;
        List listSplit$default;
        Float fKN;
        Float floatOrNull;
        Float fKN2;
        Float fKN3;
        Float fKN4;
        Float fKN5;
        xmlPullParser.require(2, str, "spinner");
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue5 == null) {
            throw new MalformedXMLException("element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue6 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue6 == null) {
            attributeValue6 = "true";
        }
        boolean zN = j.n(attributeValue6);
        String attributeValue7 = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue7 == null) {
            attributeValue7 = "float";
        }
        switch (attributeValue7.hashCode()) {
            case -1266514778:
                if (attributeValue7.equals("frames")) {
                    sliderType = SliderType.FRAMES;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                        attributeValue = "";
                    }
                    final String str3 = attributeValue;
                    String attributeValue8 = xmlPullParser.getAttributeValue(str, "default");
                    float fFloatValue3 = (attributeValue8 != null || (fKN5 = gnv.KN(attributeValue8)) == null) ? 0.0f : fKN5.floatValue();
                    String attributeValue9 = xmlPullParser.getAttributeValue(str, "min");
                    fFloatValue = (attributeValue9 != null || (fKN4 = gnv.KN(attributeValue9)) == null) ? 0.0f : fKN4.floatValue();
                    String attributeValue10 = xmlPullParser.getAttributeValue(str, "max");
                    float fFloatValue4 = (attributeValue10 != null || (fKN3 = gnv.KN(attributeValue10)) == null) ? sliderType2 != SliderType.INTEGER ? 10.0f : 1.0f : fKN3.floatValue();
                    final float f5 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    double d2 = 10.0f;
                    float f6 = fFloatValue3;
                    float fPow = (float) Math.pow(d2, (float) Math.floor((float) Math.log10(f5)));
                    floatRef.element = fPow;
                    if (fFloatValue <= 0.0f) {
                        f3 = fFloatValue4;
                        floatRef.element = RangesKt.coerceAtMost(fPow, (float) Math.pow(d2, (float) Math.floor((float) Math.log10(fFloatValue))));
                    } else {
                        f3 = fFloatValue4;
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null && (fKN2 = gnv.KN(attributeValue2)) != null) {
                        fFloatValue2 = fKN2.floatValue();
                    } else {
                        if (sliderType2 != SliderType.INTEGER) {
                            f4 = 1.0f;
                            attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                            if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null && floatRef.element != f5 && str2 != null) {
                                C.Uo(xmlPullParser, new Function0() { // from class: UOb.j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UserParamParserKt.readSpinnerParam$lambda$9(str2, str3, f5, floatRef);
                                    }
                                });
                            }
                            String attributeValue11 = xmlPullParser.getAttributeValue(str, "multiplier");
                            float fFloatValue5 = (attributeValue11 == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue11)) == null) ? 1.0f : floatOrNull.floatValue();
                            String attributeValue12 = xmlPullParser.getAttributeValue(str, "originValue");
                            float fFloatValue6 = (attributeValue12 == null || (fKN = gnv.KN(attributeValue12)) == null) ? 0.0f : fKN.floatValue();
                            attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                            if (attributeValue4 == null || (listSplit$default = StringsKt.split$default((CharSequence) attributeValue4, new char[]{','}, false, 0, 6, (Object) null)) == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            } else {
                                listEmptyList = new ArrayList();
                                Iterator it = listSplit$default.iterator();
                                while (it.hasNext()) {
                                    Float fKN6 = gnv.KN(StringsKt.trim((CharSequence) it.next()).toString());
                                    if (fKN6 != null) {
                                        listEmptyList.add(fKN6);
                                    }
                                }
                            }
                            YzO.J2(xmlPullParser);
                            return new UserParameter.Spinner(attributeValue5, str3, zN, fFloatValue, f3, f4, f6, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                        }
                        fFloatValue2 = floatRef.element;
                    }
                    f4 = fFloatValue2;
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                        C.Uo(xmlPullParser, new Function0() { // from class: UOb.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UserParamParserKt.readSpinnerParam$lambda$9(str2, str3, f5, floatRef);
                            }
                        });
                    }
                    String attributeValue112 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue112 == null) {
                    }
                    String attributeValue122 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue122 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str3, zN, fFloatValue, f3, f4, f6, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case -1135038327:
                if (attributeValue7.equals("kelvin")) {
                    sliderType = SliderType.KELVIN;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str32 = attributeValue;
                    String attributeValue82 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue82 != null) {
                    }
                    String attributeValue92 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue92 != null) {
                    }
                    String attributeValue102 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue102 != null) {
                    }
                    final float f53 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    double d22 = 10.0f;
                    float f62 = fFloatValue3;
                    float fPow2 = (float) Math.pow(d22, (float) Math.floor((float) Math.log10(f53)));
                    floatRef2.element = fPow2;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                        if (sliderType2 != SliderType.INTEGER) {
                        }
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue1122 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue1122 == null) {
                    }
                    String attributeValue1222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue1222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str32, zN, fFloatValue, f3, f4, f62, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case -678927291:
                if (attributeValue7.equals("percent")) {
                    sliderType = SliderType.PERCENT;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str322 = attributeValue;
                    String attributeValue822 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue822 != null) {
                    }
                    String attributeValue922 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue922 != null) {
                    }
                    String attributeValue1022 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue1022 != null) {
                    }
                    final float f532 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                    double d222 = 10.0f;
                    float f622 = fFloatValue3;
                    float fPow22 = (float) Math.pow(d222, (float) Math.floor((float) Math.log10(f532)));
                    floatRef22.element = fPow22;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue11222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue11222 == null) {
                    }
                    String attributeValue12222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue12222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str322, zN, fFloatValue, f3, f4, f622, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case -324933605:
                if (attributeValue7.equals("relative-float")) {
                    sliderType = SliderType.RELATIVE_FLOAT;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str3222 = attributeValue;
                    String attributeValue8222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue8222 != null) {
                    }
                    String attributeValue9222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue9222 != null) {
                    }
                    String attributeValue10222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue10222 != null) {
                    }
                    final float f5322 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef222 = new Ref.FloatRef();
                    double d2222 = 10.0f;
                    float f6222 = fFloatValue3;
                    float fPow222 = (float) Math.pow(d2222, (float) Math.floor((float) Math.log10(f5322)));
                    floatRef222.element = fPow222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue112222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue112222 == null) {
                    }
                    String attributeValue122222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue122222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str3222, zN, fFloatValue, f3, f4, f6222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 3346:
                if (attributeValue7.equals("hz")) {
                    sliderType = SliderType.f46339HZ;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str32222 = attributeValue;
                    String attributeValue82222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue82222 != null) {
                    }
                    String attributeValue92222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue92222 != null) {
                    }
                    String attributeValue102222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue102222 != null) {
                    }
                    final float f53222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef2222 = new Ref.FloatRef();
                    double d22222 = 10.0f;
                    float f62222 = fFloatValue3;
                    float fPow2222 = (float) Math.pow(d22222, (float) Math.floor((float) Math.log10(f53222)));
                    floatRef2222.element = fPow2222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue1122222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue1122222 == null) {
                    }
                    String attributeValue1222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue1222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str32222, zN, fFloatValue, f3, f4, f62222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 113135:
                if (attributeValue7.equals("rpm")) {
                    sliderType = SliderType.RPM;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str322222 = attributeValue;
                    String attributeValue822222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue822222 != null) {
                    }
                    String attributeValue922222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue922222 != null) {
                    }
                    String attributeValue1022222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue1022222 != null) {
                    }
                    final float f532222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef22222 = new Ref.FloatRef();
                    double d222222 = 10.0f;
                    float f622222 = fFloatValue3;
                    float fPow22222 = (float) Math.pow(d222222, (float) Math.floor((float) Math.log10(f532222)));
                    floatRef22222.element = fPow22222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue11222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue11222222 == null) {
                    }
                    String attributeValue12222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue12222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str322222, zN, fFloatValue, f3, f4, f622222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 92960979:
                if (attributeValue7.equals("angle")) {
                    sliderType = SliderType.ANGLE;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str3222222 = attributeValue;
                    String attributeValue8222222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue8222222 != null) {
                    }
                    String attributeValue9222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue9222222 != null) {
                    }
                    String attributeValue10222222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue10222222 != null) {
                    }
                    final float f5322222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef222222 = new Ref.FloatRef();
                    double d2222222 = 10.0f;
                    float f6222222 = fFloatValue3;
                    float fPow222222 = (float) Math.pow(d2222222, (float) Math.floor((float) Math.log10(f5322222)));
                    floatRef222222.element = fPow222222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue112222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue112222222 == null) {
                    }
                    String attributeValue122222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue122222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str3222222, zN, fFloatValue, f3, f4, f6222222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 97526364:
                if (attributeValue7.equals("float")) {
                    sliderType = SliderType.FLOAT;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str32222222 = attributeValue;
                    String attributeValue82222222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue82222222 != null) {
                    }
                    String attributeValue92222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue92222222 != null) {
                    }
                    String attributeValue102222222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue102222222 != null) {
                    }
                    final float f53222222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef2222222 = new Ref.FloatRef();
                    double d22222222 = 10.0f;
                    float f62222222 = fFloatValue3;
                    float fPow2222222 = (float) Math.pow(d22222222, (float) Math.floor((float) Math.log10(f53222222)));
                    floatRef2222222.element = fPow2222222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue1122222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue1122222222 == null) {
                    }
                    String attributeValue1222222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue1222222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str32222222, zN, fFloatValue, f3, f4, f62222222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 248617923:
                if (attributeValue7.equals("angle-range")) {
                    sliderType = SliderType.ANGLE_RANGE;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str322222222 = attributeValue;
                    String attributeValue822222222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue822222222 != null) {
                    }
                    String attributeValue922222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue922222222 != null) {
                    }
                    String attributeValue1022222222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue1022222222 != null) {
                    }
                    final float f532222222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef22222222 = new Ref.FloatRef();
                    double d222222222 = 10.0f;
                    float f622222222 = fFloatValue3;
                    float fPow22222222 = (float) Math.pow(d222222222, (float) Math.floor((float) Math.log10(f532222222)));
                    floatRef22222222.element = fPow22222222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue11222222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue11222222222 == null) {
                    }
                    String attributeValue12222222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue12222222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str322222222, zN, fFloatValue, f3, f4, f622222222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 1358935620:
                if (attributeValue7.equals("relative-percent")) {
                    sliderType = SliderType.RELATIVE_PERCENT;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str3222222222 = attributeValue;
                    String attributeValue8222222222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue8222222222 != null) {
                    }
                    String attributeValue9222222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue9222222222 != null) {
                    }
                    String attributeValue10222222222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue10222222222 != null) {
                    }
                    final float f5322222222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef222222222 = new Ref.FloatRef();
                    double d2222222222 = 10.0f;
                    float f6222222222 = fFloatValue3;
                    float fPow222222222 = (float) Math.pow(d2222222222, (float) Math.floor((float) Math.log10(f5322222222)));
                    floatRef222222222.element = fPow222222222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue112222222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue112222222222 == null) {
                    }
                    String attributeValue122222222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue122222222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str3222222222, zN, fFloatValue, f3, f4, f6222222222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 1958052158:
                if (attributeValue7.equals("integer")) {
                    sliderType = SliderType.INTEGER;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str32222222222 = attributeValue;
                    String attributeValue82222222222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue82222222222 != null) {
                    }
                    String attributeValue92222222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue92222222222 != null) {
                    }
                    String attributeValue102222222222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue102222222222 != null) {
                    }
                    final float f53222222222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef2222222222 = new Ref.FloatRef();
                    double d22222222222 = 10.0f;
                    float f62222222222 = fFloatValue3;
                    float fPow2222222222 = (float) Math.pow(d22222222222, (float) Math.floor((float) Math.log10(f53222222222)));
                    floatRef2222222222.element = fPow2222222222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue1122222222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue1122222222222 == null) {
                    }
                    String attributeValue1222222222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue1222222222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str32222222222, zN, fFloatValue, f3, f4, f62222222222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            case 1970096767:
                if (attributeValue7.equals("seconds")) {
                    sliderType = SliderType.SECONDS;
                    sliderType2 = sliderType;
                    attributeValue = xmlPullParser.getAttributeValue(str, "label");
                    if (attributeValue == null) {
                    }
                    final String str322222222222 = attributeValue;
                    String attributeValue822222222222 = xmlPullParser.getAttributeValue(str, "default");
                    if (attributeValue822222222222 != null) {
                    }
                    String attributeValue922222222222 = xmlPullParser.getAttributeValue(str, "min");
                    if (attributeValue922222222222 != null) {
                    }
                    String attributeValue1022222222222 = xmlPullParser.getAttributeValue(str, "max");
                    if (attributeValue1022222222222 != null) {
                    }
                    final float f532222222222 = (fFloatValue4 - fFloatValue) / 100.0f;
                    final Ref.FloatRef floatRef22222222222 = new Ref.FloatRef();
                    double d222222222222 = 10.0f;
                    float f622222222222 = fFloatValue3;
                    float fPow22222222222 = (float) Math.pow(d222222222222, (float) Math.floor((float) Math.log10(f532222222222)));
                    floatRef22222222222.element = fPow22222222222;
                    if (fFloatValue <= 0.0f) {
                    }
                    attributeValue2 = xmlPullParser.getAttributeValue(str, "step");
                    if (attributeValue2 == null) {
                    }
                    attributeValue3 = xmlPullParser.getAttributeValue(str, "step");
                    if ((attributeValue3 != null ? gnv.KN(attributeValue3) : null) == null) {
                    }
                    String attributeValue11222222222222 = xmlPullParser.getAttributeValue(str, "multiplier");
                    if (attributeValue11222222222222 == null) {
                    }
                    String attributeValue12222222222222 = xmlPullParser.getAttributeValue(str, "originValue");
                    if (attributeValue12222222222222 == null) {
                    }
                    attributeValue4 = xmlPullParser.getAttributeValue(str, "ticks");
                    if (attributeValue4 == null) {
                    }
                    YzO.J2(xmlPullParser);
                    return new UserParameter.Spinner(attributeValue5, str322222222222, zN, fFloatValue, f3, f4, f622222222222, fFloatValue6, sliderType2, fFloatValue5, listEmptyList);
                }
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
            default:
                throw new MalformedXMLException("expected 'float', 'integer', or 'percent'", null, false, 6, null);
        }
    }

    private static final UserParameter.StaticText readStaticText(XmlPullParser xmlPullParser, String str, StaticTextStyle staticTextStyle) throws XmlPullParserException, IOException {
        String str2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[staticTextStyle.ordinal()];
        if (i2 == 1) {
            str2 = "tip";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "section";
        }
        xmlPullParser.require(2, str, str2);
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            attributeValue = "__staticText" + xmlPullParser.getLineNumber();
        }
        String str3 = attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "enabled");
        if (attributeValue2 == null) {
            attributeValue2 = "true";
        }
        boolean zN = j.n(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "label");
        String str4 = attributeValue3 == null ? "" : attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "text");
        String str5 = attributeValue4 == null ? "" : attributeValue4;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "hintType");
        HintType hintType = null;
        if (attributeValue5 != null && Intrinsics.areEqual(attributeValue5, "editFirst")) {
            hintType = HintType.EDITFIRST;
        }
        YzO.J2(xmlPullParser);
        return new UserParameter.StaticText(str3, str4, zN, str5, staticTextStyle, hintType);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<UserParameter> readUserParams(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        xmlPullParser.require(2, str, "params");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                switch (name.hashCode()) {
                    case -2004438503:
                        if (!name.equals("spinner")) {
                            YzO.J2(xmlPullParser);
                        } else {
                            arrayList.add(readSpinnerParam(xmlPullParser, str, str2));
                        }
                        break;
                    case -1417816805:
                        if (name.equals("texture")) {
                            arrayList.add(readTextureParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case -1008621499:
                        if (name.equals("orient")) {
                            arrayList.add(readOrientationParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case -899647263:
                        if (name.equals("slider")) {
                            arrayList.add(readSliderParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case -889473228:
                        if (name.equals("switch")) {
                            arrayList.add(readSwitchParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 114843:
                        if (name.equals("tip")) {
                            arrayList.add(readStaticText(xmlPullParser, str, StaticTextStyle.TIP));
                            break;
                        }
                        break;
                    case 119193:
                        if (name.equals("xyz")) {
                            arrayList.add(readXYZParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 94842723:
                        if (name.equals(TtmlNode.ATTR_TTS_COLOR)) {
                            arrayList.add(readColorParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            arrayList.add(readFloatParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 106845584:
                        if (name.equals("point")) {
                            arrayList.add(readPointParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 263583050:
                        if (name.equals("hue-disc")) {
                            arrayList.add(readHueDiscParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 263999973:
                        if (name.equals("hue-ring")) {
                            arrayList.add(readHueRingParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 1191572447:
                        if (name.equals("selector")) {
                            arrayList.add(readSelectorParam(xmlPullParser, str));
                            break;
                        }
                        break;
                    case 1970241253:
                        if (name.equals("section")) {
                            arrayList.add(readStaticText(xmlPullParser, str, StaticTextStyle.SECTION));
                            break;
                        }
                        break;
                }
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readSpinnerParam$lambda$9(String str, String str2, float f3, Ref.FloatRef floatRef) {
        Context applicationContext = n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return "Changed Spinner Default Step:  " + str + "/" + w6.rl(str2, applicationContext) + ": " + f3 + " -> " + floatRef.element;
    }
}
