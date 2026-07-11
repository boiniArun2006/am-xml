package com.alightcreative.app.motion.scene.liveshape;

import HI0.YzO;
import android.util.Xml;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.alightcreative.app.motion.scene.scripting.ACScriptParserKt;
import com.alightcreative.app.motion.scene.userparam.UserParamParserKt;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0007"}, d2 = {"liveShapeFromXml", "Lcom/alightcreative/app/motion/scene/liveshape/LiveShape;", "effectXml", "", "readLiveShape", "Lorg/xmlpull/v1/XmlPullParser;", "namespace", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveShapeParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveShapeParser.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShapeParserKt\n+ 2 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n*L\n1#1,119:1\n45#2,12:120\n*S KotlinDebug\n*F\n+ 1 LiveShapeParser.kt\ncom/alightcreative/app/motion/scene/liveshape/LiveShapeParserKt\n*L\n46#1:120,12\n*E\n"})
public final class LiveShapeParserKt {
    public static final LiveShape liveShapeFromXml(String effectXml) {
        Intrinsics.checkNotNullParameter(effectXml, "effectXml");
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(new StringReader(effectXml));
            xmlPullParserNewPullParser.nextTag();
            Intrinsics.checkNotNull(xmlPullParserNewPullParser);
            return readLiveShape(xmlPullParserNewPullParser, null);
        } catch (MalformedXMLException e2) {
            if (e2.getHasPositionInfo()) {
                throw e2;
            }
            throw new MalformedXMLException("Malformed Shape: " + xmlPullParserNewPullParser.getPositionDescription(), e2, true);
        } catch (XmlPullParserException e3) {
            throw new MalformedXMLException("Malformed XML: " + xmlPullParserNewPullParser.getPositionDescription(), e3, true);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LiveShape readLiveShape(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        String str2;
        ShapeHandleType shapeHandleType;
        String attributeValue;
        ShapeHandleStyle shapeHandleStyle;
        String attributeValue2;
        ShapeHandleIcon shapeHandleIcon;
        int i2 = 2;
        xmlPullParser.require(2, str, "shape");
        String str3 = "id";
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue3 == null) {
            throw new MalformedXMLException("<shape> element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "deprecated");
        boolean z2 = false;
        boolean z3 = attributeValue4 != null ? Boolean.parseBoolean(attributeValue4) : false;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (attributeValue5 == null) {
            attributeValue5 = attributeValue3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<UserParameter> listEmptyList = null;
        Iy.n nVar = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == i2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                switch (name.hashCode()) {
                    case -1881759102:
                        str2 = str3;
                        if (!name.equals("strings")) {
                            YzO.J2(xmlPullParser);
                        } else {
                            if (nVar != null) {
                                throw new MalformedXMLException("More than one <strings> element found", null, false, 6, null);
                            }
                            nVar = Iy.w6.O(xmlPullParser, str);
                        }
                        if (xmlPullParser.getEventType() == 3 || xmlPullParser.getDepth() != depth) {
                            throw new IllegalStateException("Did not consume all tag contents");
                        }
                        str3 = str2;
                        i2 = 2;
                        z2 = false;
                        break;
                    case -1224577496:
                        if (!name.equals("handle")) {
                            str2 = str3;
                            YzO.J2(xmlPullParser);
                            if (xmlPullParser.getEventType() == 3) {
                            }
                            throw new IllegalStateException("Did not consume all tag contents");
                        }
                        String attributeValue6 = xmlPullParser.getAttributeValue(str, "invert");
                        if (attributeValue6 == null) {
                            attributeValue6 = "";
                        }
                        String attributeValue7 = xmlPullParser.getAttributeValue(str, str3);
                        if (attributeValue7 == null) {
                            throw new MalformedXMLException("<handle> must have 'id'", null, false, 6, null);
                        }
                        String attributeValue8 = xmlPullParser.getAttributeValue(str, "param");
                        if (attributeValue8 == null) {
                            throw new MalformedXMLException("<handle> must have target 'param'", null, false, 6, null);
                        }
                        boolean zContains$default = StringsKt.contains$default(attributeValue6, "x", z2, i2, (Object) null);
                        str2 = str3;
                        boolean zContains$default2 = StringsKt.contains$default(attributeValue6, "y", z2, i2, (Object) null);
                        boolean zN = Ge.j.n(xmlPullParser.getAttributeValue(str, "lock-ratio"));
                        String attributeValue9 = xmlPullParser.getAttributeValue(str, HrvQKfmFZJudBc.AqiEK);
                        if (attributeValue9 == null) {
                            throw new MalformedXMLException("<handle> must have 'type'", null, false, 6, null);
                        }
                        int iHashCode = attributeValue9.hashCode();
                        if (iHashCode == -938578798) {
                            if (!attributeValue9.equals("radius")) {
                                throw new MalformedXMLException("<handle> type must be 'x','y','xy','radius', or 'angle'", null, false, 6, null);
                            }
                            shapeHandleType = ShapeHandleType.Radius;
                            ShapeHandleType shapeHandleType2 = shapeHandleType;
                            attributeValue = xmlPullParser.getAttributeValue(str, "style");
                            if (attributeValue == null) {
                            }
                            if (!Intrinsics.areEqual(attributeValue, "round")) {
                            }
                            ShapeHandleStyle shapeHandleStyle2 = shapeHandleStyle;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "icon");
                            if (attributeValue2 == null) {
                            }
                            switch (attributeValue2.hashCode()) {
                                case 99657:
                                    break;
                                case 3181394:
                                    break;
                                case 3387192:
                                    break;
                                case 93090825:
                                    break;
                                case 1059964331:
                                    break;
                                case 1873729387:
                                    break;
                            }
                        } else if (iHashCode == 3841) {
                            if (!attributeValue9.equals("xy")) {
                                throw new MalformedXMLException("<handle> type must be 'x','y','xy','radius', or 'angle'", null, false, 6, null);
                            }
                            shapeHandleType = ShapeHandleType.XY;
                            ShapeHandleType shapeHandleType22 = shapeHandleType;
                            attributeValue = xmlPullParser.getAttributeValue(str, "style");
                            if (attributeValue == null) {
                            }
                            if (!Intrinsics.areEqual(attributeValue, "round")) {
                            }
                            ShapeHandleStyle shapeHandleStyle22 = shapeHandleStyle;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "icon");
                            if (attributeValue2 == null) {
                            }
                            switch (attributeValue2.hashCode()) {
                                case 99657:
                                    break;
                                case 3181394:
                                    break;
                                case 3387192:
                                    break;
                                case 93090825:
                                    break;
                                case 1059964331:
                                    break;
                                case 1873729387:
                                    break;
                            }
                        } else if (iHashCode == 3008417) {
                            if (!attributeValue9.equals("axis")) {
                                throw new MalformedXMLException("<handle> type must be 'x','y','xy','radius', or 'angle'", null, false, 6, null);
                            }
                            shapeHandleType = ShapeHandleType.Axis;
                            ShapeHandleType shapeHandleType222 = shapeHandleType;
                            attributeValue = xmlPullParser.getAttributeValue(str, "style");
                            if (attributeValue == null) {
                            }
                            if (!Intrinsics.areEqual(attributeValue, "round")) {
                            }
                            ShapeHandleStyle shapeHandleStyle222 = shapeHandleStyle;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "icon");
                            if (attributeValue2 == null) {
                            }
                            switch (attributeValue2.hashCode()) {
                                case 99657:
                                    break;
                                case 3181394:
                                    break;
                                case 3387192:
                                    break;
                                case 93090825:
                                    break;
                                case 1059964331:
                                    break;
                                case 1873729387:
                                    break;
                            }
                        } else if (iHashCode == 92960979) {
                            if (!attributeValue9.equals("angle")) {
                                throw new MalformedXMLException("<handle> type must be 'x','y','xy','radius', or 'angle'", null, false, 6, null);
                            }
                            shapeHandleType = ShapeHandleType.Angle;
                            ShapeHandleType shapeHandleType2222 = shapeHandleType;
                            attributeValue = xmlPullParser.getAttributeValue(str, "style");
                            if (attributeValue == null) {
                            }
                            if (!Intrinsics.areEqual(attributeValue, "round")) {
                            }
                            ShapeHandleStyle shapeHandleStyle2222 = shapeHandleStyle;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "icon");
                            if (attributeValue2 == null) {
                            }
                            switch (attributeValue2.hashCode()) {
                                case 99657:
                                    break;
                                case 3181394:
                                    break;
                                case 3387192:
                                    break;
                                case 93090825:
                                    break;
                                case 1059964331:
                                    break;
                                case 1873729387:
                                    break;
                            }
                        } else if (iHashCode == 120) {
                            if (!attributeValue9.equals("x")) {
                                throw new MalformedXMLException("<handle> type must be 'x','y','xy','radius', or 'angle'", null, false, 6, null);
                            }
                            shapeHandleType = ShapeHandleType.f46106X;
                            ShapeHandleType shapeHandleType22222 = shapeHandleType;
                            attributeValue = xmlPullParser.getAttributeValue(str, "style");
                            if (attributeValue == null) {
                            }
                            if (!Intrinsics.areEqual(attributeValue, "round")) {
                            }
                            ShapeHandleStyle shapeHandleStyle22222 = shapeHandleStyle;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "icon");
                            if (attributeValue2 == null) {
                            }
                            switch (attributeValue2.hashCode()) {
                                case 99657:
                                    break;
                                case 3181394:
                                    break;
                                case 3387192:
                                    break;
                                case 93090825:
                                    break;
                                case 1059964331:
                                    break;
                                case 1873729387:
                                    break;
                            }
                        } else {
                            if (iHashCode != 121 || !attributeValue9.equals("y")) {
                                throw new MalformedXMLException("<handle> type must be 'x','y','xy','radius', or 'angle'", null, false, 6, null);
                            }
                            shapeHandleType = ShapeHandleType.f46107Y;
                            ShapeHandleType shapeHandleType222222 = shapeHandleType;
                            attributeValue = xmlPullParser.getAttributeValue(str, "style");
                            if (attributeValue == null) {
                                attributeValue = "round";
                            }
                            if (!Intrinsics.areEqual(attributeValue, "round")) {
                                shapeHandleStyle = ShapeHandleStyle.Round;
                            } else {
                                if (!Intrinsics.areEqual(attributeValue, "square")) {
                                    throw new MalformedXMLException("<handle> style must be 'round' or 'square'", null, false, 6, null);
                                }
                                shapeHandleStyle = ShapeHandleStyle.Square;
                            }
                            ShapeHandleStyle shapeHandleStyle222222 = shapeHandleStyle;
                            attributeValue2 = xmlPullParser.getAttributeValue(str, "icon");
                            if (attributeValue2 == null) {
                                attributeValue2 = "none";
                            }
                            switch (attributeValue2.hashCode()) {
                                case 99657:
                                    if (!attributeValue2.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                                        throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                                    }
                                    shapeHandleIcon = ShapeHandleIcon.Dot;
                                    arrayList2.add(new ShapeHandle(attributeValue7, attributeValue8, shapeHandleType222222, zContains$default, zContains$default2, zN, shapeHandleStyle222222, shapeHandleIcon));
                                    YzO.J2(xmlPullParser);
                                    break;
                                    break;
                                case 3181394:
                                    if (!attributeValue2.equals("grip")) {
                                        throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                                    }
                                    shapeHandleIcon = ShapeHandleIcon.Grip;
                                    arrayList2.add(new ShapeHandle(attributeValue7, attributeValue8, shapeHandleType222222, zContains$default, zContains$default2, zN, shapeHandleStyle222222, shapeHandleIcon));
                                    YzO.J2(xmlPullParser);
                                    break;
                                    break;
                                case 3387192:
                                    if (!attributeValue2.equals("none")) {
                                        throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                                    }
                                    shapeHandleIcon = ShapeHandleIcon.None;
                                    arrayList2.add(new ShapeHandle(attributeValue7, attributeValue8, shapeHandleType222222, zContains$default, zContains$default2, zN, shapeHandleStyle222222, shapeHandleIcon));
                                    YzO.J2(xmlPullParser);
                                    break;
                                    break;
                                case 93090825:
                                    if (!attributeValue2.equals("arrow")) {
                                        throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                                    }
                                    shapeHandleIcon = ShapeHandleIcon.Arrow;
                                    arrayList2.add(new ShapeHandle(attributeValue7, attributeValue8, shapeHandleType222222, zContains$default, zContains$default2, zN, shapeHandleStyle222222, shapeHandleIcon));
                                    YzO.J2(xmlPullParser);
                                    break;
                                    break;
                                case 1059964331:
                                    if (!attributeValue2.equals("hollow-arrow")) {
                                        throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                                    }
                                    shapeHandleIcon = ShapeHandleIcon.HollowArrow;
                                    arrayList2.add(new ShapeHandle(attributeValue7, attributeValue8, shapeHandleType222222, zContains$default, zContains$default2, zN, shapeHandleStyle222222, shapeHandleIcon));
                                    YzO.J2(xmlPullParser);
                                    break;
                                    break;
                                case 1873729387:
                                    if (!attributeValue2.equals("hollow-dot")) {
                                        throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                                    }
                                    shapeHandleIcon = ShapeHandleIcon.HollowDot;
                                    arrayList2.add(new ShapeHandle(attributeValue7, attributeValue8, shapeHandleType222222, zContains$default, zContains$default2, zN, shapeHandleStyle222222, shapeHandleIcon));
                                    YzO.J2(xmlPullParser);
                                    break;
                                    break;
                                default:
                                    throw new MalformedXMLException("<handle> icon must be 'none', 'dot' or 'grip'", null, false, 6, null);
                            }
                        }
                        if (xmlPullParser.getEventType() == 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -995427962:
                        if (!name.equals("params")) {
                            str2 = str3;
                            YzO.J2(xmlPullParser);
                            if (xmlPullParser.getEventType() == 3) {
                            }
                            throw new IllegalStateException("Did not consume all tag contents");
                        }
                        if (listEmptyList != null) {
                            throw new MalformedXMLException("More than one <params> element found", null, false, 6, null);
                        }
                        listEmptyList = UserParamParserKt.readUserParams(xmlPullParser, str, "shape: " + attributeValue3);
                        str2 = str3;
                        if (xmlPullParser.getEventType() == 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -907685685:
                        if (name.equals("script")) {
                            arrayList.add(ACScriptParserKt.readACScript(xmlPullParser, str));
                            str2 = str3;
                            if (xmlPullParser.getEventType() == 3) {
                            }
                            throw new IllegalStateException("Did not consume all tag contents");
                        }
                        str2 = str3;
                        YzO.J2(xmlPullParser);
                        if (xmlPullParser.getEventType() == 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    default:
                        str2 = str3;
                        YzO.J2(xmlPullParser);
                        if (xmlPullParser.getEventType() == 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<UserParameter> list = listEmptyList;
        if (nVar == null) {
            nVar = new Iy.n(MapsKt.emptyMap(), true);
        }
        return new LiveShape(attributeValue3, attributeValue5, list, nVar, arrayList, arrayList2, z3);
    }
}
