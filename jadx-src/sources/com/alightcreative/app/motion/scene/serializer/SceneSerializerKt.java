package com.alightcreative.app.motion.scene.serializer;

import HI0.Ew;
import HI0.YzO;
import HI0.gnv;
import HI0.qf;
import IvA.n;
import IvA.o;
import ScC.FuwU.XIvb;
import XoT.qz;
import android.net.Uri;
import android.util.Xml;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.PrecomposeType;
import com.alightcreative.app.motion.scene.ReTimingMethod;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneBookmark;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.AppLovinBridge;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006\u001aN\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u001aN\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u001a,\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r\u001a&\u0010!\u001a\u00020\u0002*\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006#"}, d2 = {"fpsString", "", "Lcom/alightcreative/app/motion/scene/Scene;", "getFpsString", "(Lcom/alightcreative/app/motion/scene/Scene;)Ljava/lang/String;", "getSerializedFormatVersion", "", "getDeserializedSceneVersion", "fpsStringFromFPHS", "fphs", "serializeScene", "scene", "pretty", "", "uriInfoMap", "", "Landroid/net/Uri;", "Lcom/alightcreative/app/motion/scene/MediaUriInfo;", "updateModifiedTime", "includeExternalMedia", "templateLink", "writeScene", "", "namespace", "serializer", "Lorg/xmlpull/v1/XmlSerializer;", "modifiedTime", "", "unserializeScene", "serializedScene", "isPackage", "noUpgrade", "noDowngrade", "readScene", "Lorg/xmlpull/v1/XmlPullParser;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneSerializer.kt\ncom/alightcreative/app/motion/scene/serializer/SceneSerializerKt\n+ 2 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n*L\n1#1,376:1\n845#2,2:377\n847#2,5:380\n854#2,10:386\n1863#3:379\n1864#3:385\n1611#3,9:397\n1863#3:406\n1864#3:408\n1620#3:409\n1863#3,2:410\n1863#3,2:414\n1202#3,2:430\n1230#3,4:432\n1#4:396\n1#4:407\n216#5,2:412\n1310#6,2:416\n45#7,12:418\n*S KotlinDebug\n*F\n+ 1 SceneSerializer.kt\ncom/alightcreative/app/motion/scene/serializer/SceneSerializerKt\n*L\n52#1:377,2\n52#1:380,5\n52#1:386,10\n52#1:379\n52#1:385\n172#1:397,9\n172#1:406\n172#1:408\n172#1:409\n174#1:410,2\n220#1:414,2\n372#1:430,2\n372#1:432,4\n172#1:407\n212#1:412,2\n272#1:416,2\n287#1:418,12\n*E\n"})
public final class SceneSerializerKt {
    private static final int getDeserializedSceneVersion(int i2) {
        if (i2 == 107 || i2 == 108) {
            return 106;
        }
        return i2;
    }

    public static final String fpsStringFromFPHS(int i2) {
        int i3 = i2 % 100;
        if (-9 <= i3 && i3 < 0) {
            return "";
        }
        if (i3 == 0) {
            return String.valueOf(i2 / 100);
        }
        if (1 > i3 || i3 >= 10) {
            return (i2 / 100) + "." + i3;
        }
        return (i2 / 100) + ".0" + i3;
    }

    public static final String getFpsString(Scene scene) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        return fpsStringFromFPHS(scene.getFramesPerHundredSeconds());
    }

    private static final int getSerializedFormatVersion(Scene scene) {
        SceneElement sceneElement;
        List<SceneElement> elements;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = scene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                loop1: while (true) {
                    Scene scene2 = (Scene) qz.n(arrayList);
                    if (scene2 != null && (elements = scene2.getElements()) != null) {
                        for (SceneElement sceneElement2 : elements) {
                            if (sceneElement2.getSpeedMap().getKeyframes().size() > 1) {
                                sceneElement = sceneElement2;
                                break loop1;
                            }
                            if (sceneElement2.getType().getHasNestedScene()) {
                                arrayList.add(sceneElement2.getNestedScene());
                            }
                        }
                    }
                    if (scene2 == null) {
                        sceneElement = null;
                        break;
                    }
                }
            } else {
                sceneElement = (SceneElement) it.next();
                if (sceneElement.getSpeedMap().getKeyframes().size() > 1) {
                    break;
                }
                if (sceneElement.getType().getHasNestedScene()) {
                    arrayList.add(sceneElement.getNestedScene());
                }
            }
        }
        if (sceneElement != null) {
            return Math.max(106, 108);
        }
        if (scene.getType() == SceneType.PRESET) {
            return Math.max(106, 107);
        }
        return 106;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x037f, code lost:
    
        throw new java.lang.IllegalStateException("Did not consume all tag contents");
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Scene readScene(XmlPullParser xmlPullParser, String str, boolean z2, boolean z3) throws XmlPullParserException, IOException {
        SolidColor light_gray;
        PrecomposeType precomposeType;
        int i2;
        SceneType sceneType;
        String attributeValue;
        int i3;
        ReTimingMethod reTimingMethod;
        int iIntValue;
        int i5;
        String str2;
        String str3;
        Integer intOrNull;
        Integer intOrNull2;
        Long longOrNull;
        Integer intOrNull3;
        Double doubleOrNull;
        Long longOrNull2;
        Long longOrNull3;
        Integer intOrNull4;
        Long longOrNull4;
        Integer intOrNull5;
        Integer intOrNull6;
        Integer intOrNull7;
        Double doubleOrNull2;
        Integer intOrNull8;
        Integer intOrNull9;
        Integer intOrNull10;
        Integer intOrNull11;
        Integer intOrNull12;
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        xmlPullParser.require(2, str, "scene");
        String str4 = "width";
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "width");
        int iIntValue2 = (attributeValue2 == null || (intOrNull12 = StringsKt.toIntOrNull(attributeValue2)) == null) ? 1280 : intOrNull12.intValue();
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "height");
        int iIntValue3 = (attributeValue3 == null || (intOrNull11 = StringsKt.toIntOrNull(attributeValue3)) == null) ? 720 : intOrNull11.intValue();
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "exportWidth");
        int iIntValue4 = (attributeValue4 == null || (intOrNull10 = StringsKt.toIntOrNull(attributeValue4)) == null) ? iIntValue2 : intOrNull10.intValue();
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "exportHeight");
        int iIntValue5 = (attributeValue5 == null || (intOrNull9 = StringsKt.toIntOrNull(attributeValue5)) == null) ? iIntValue3 : intOrNull9.intValue();
        String attributeValue6 = xmlPullParser.getAttributeValue(str, "bgcolor");
        if (attributeValue6 == null || (light_gray = qf.t(gnv.Uo(attributeValue6))) == null) {
            light_gray = SolidColor.INSTANCE.getLIGHT_GRAY();
        }
        SolidColor solidColor = light_gray;
        String attributeValue7 = xmlPullParser.getAttributeValue(str, "title");
        if (attributeValue7 == null) {
            attributeValue7 = "";
        }
        String attributeValue8 = xmlPullParser.getAttributeValue(str, "precompose");
        if (attributeValue8 != null) {
            PrecomposeType[] precomposeTypeArrValues = PrecomposeType.values();
            int length = precomposeTypeArrValues.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    precomposeType = null;
                    break;
                }
                precomposeType = precomposeTypeArrValues[i7];
                if (Intrinsics.areEqual(precomposeType.getTag(), attributeValue8)) {
                    break;
                }
                i7++;
            }
            if (precomposeType == null) {
                precomposeType = PrecomposeType.DYNAMIC;
            }
        }
        PrecomposeType precomposeType2 = precomposeType;
        String attributeValue9 = xmlPullParser.getAttributeValue(str, "ffver");
        int iIntValue6 = (attributeValue9 == null || (intOrNull8 = StringsKt.toIntOrNull(attributeValue9)) == null) ? 106 : intOrNull8.intValue();
        if (!z3) {
            iIntValue6 = getDeserializedSceneVersion(iIntValue6);
        }
        int i8 = iIntValue6;
        String str5 = "type";
        String attributeValue10 = xmlPullParser.getAttributeValue(str, "type");
        String str6 = attributeValue7;
        if (attributeValue10 != null) {
            SceneType[] sceneTypeArrValues = SceneType.values();
            i2 = iIntValue2;
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = attributeValue10.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sceneType = (SceneType) Ew.n(sceneTypeArrValues, upperCase);
            if (sceneType == null) {
            }
            String attributeValue11 = xmlPullParser.getAttributeValue(str, "fps");
            int iRoundToInt = MathKt.roundToInt(((attributeValue11 != null || (doubleOrNull2 = StringsKt.toDoubleOrNull(attributeValue11)) == null) ? 30.0d : doubleOrNull2.doubleValue()) * 100.0d);
            SceneType sceneType2 = sceneType;
            attributeValue = xmlPullParser.getAttributeValue(str, "retime");
            if (attributeValue == null) {
                ReTimingMethod[] reTimingMethodArrValues = ReTimingMethod.values();
                i3 = iIntValue4;
                Locale ENGLISH2 = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
                String upperCase2 = attributeValue.toUpperCase(ENGLISH2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                reTimingMethod = (ReTimingMethod) Ew.n(reTimingMethodArrValues, StringsKt.replace$default(upperCase2, '-', '_', false, 4, (Object) null));
                if (reTimingMethod == null) {
                }
                String attributeValue12 = xmlPullParser.getAttributeValue(str, "retimeIn");
                int iIntValue7 = (attributeValue12 == null || (intOrNull7 = StringsKt.toIntOrNull(attributeValue12)) == null) ? 0 : intOrNull7.intValue();
                String attributeValue13 = xmlPullParser.getAttributeValue(str, "retimeOut");
                int iIntValue8 = (attributeValue13 == null || (intOrNull6 = StringsKt.toIntOrNull(attributeValue13)) == null) ? 0 : intOrNull6.intValue();
                String attributeValue14 = xmlPullParser.getAttributeValue(str, "thumbnailTime");
                iIntValue = (attributeValue14 == null || (intOrNull5 = StringsKt.toIntOrNull(attributeValue14)) == null) ? -1 : intOrNull5.intValue();
                String attributeValue15 = xmlPullParser.getAttributeValue(str, "modifiedTime");
                long jLongValue = (attributeValue15 == null || (longOrNull4 = StringsKt.toLongOrNull(attributeValue15)) == null) ? 0L : longOrNull4.longValue();
                String attributeValue16 = xmlPullParser.getAttributeValue(str, "retimeAdaptFPS");
                boolean z4 = attributeValue16 != null ? Boolean.parseBoolean(attributeValue16) : SceneKt.getEMPTY_SCENE().getReTimingAdaptFrameRate();
                ReTimingMethod reTimingMethod2 = reTimingMethod;
                String attributeValue17 = xmlPullParser.getAttributeValue(str, "templateLink");
                int i9 = i2;
                int i10 = iIntValue8;
                boolean z5 = z4;
                int i11 = iRoundToInt;
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i12 = iIntValue7;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i13 = iIntValue;
                    if (xmlPullParser.next() == 3) {
                        int i14 = iIntValue5;
                        int i15 = i11;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
                        for (Object obj : arrayList2) {
                            linkedHashMap2.put(((MediaUriInfo) obj).getUri(), obj);
                        }
                        return new Scene(str6, i8, i9, iIntValue3, i3, i14, arrayList, i15, solidColor, precomposeType2, sceneType2, linkedHashMap, reTimingMethod2, i12, i10, i13, z5, jLongValue, linkedHashMap2, attributeValue17);
                    }
                    if (xmlPullParser.getEventType() == 2) {
                        int depth = xmlPullParser.getDepth();
                        String name = xmlPullParser.getName();
                        int i16 = iIntValue5;
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (Intrinsics.areEqual(name, "bookmark")) {
                            String attributeValue18 = xmlPullParser.getAttributeValue(str, "t");
                            Integer intOrNull13 = attributeValue18 != null ? StringsKt.toIntOrNull(attributeValue18) : null;
                            String attributeValue19 = xmlPullParser.getAttributeValue(str, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
                            int iIntValue9 = (attributeValue19 == null || (intOrNull4 = StringsKt.toIntOrNull(attributeValue19)) == null) ? 0 : intOrNull4.intValue();
                            i5 = i11;
                            if (intOrNull13 != null) {
                                linkedHashMap.put(intOrNull13, new SceneBookmark(iIntValue9));
                            }
                            YzO.J2(xmlPullParser);
                            str2 = str4;
                            str3 = str5;
                        } else {
                            i5 = i11;
                            if (Intrinsics.areEqual(name, "media")) {
                                String attributeValue20 = xmlPullParser.getAttributeValue(str, "uri");
                                if (attributeValue20 == null || StringsKt.isBlank(attributeValue20)) {
                                    str2 = str4;
                                    str3 = str5;
                                } else {
                                    String attributeValue21 = xmlPullParser.getAttributeValue(str, "filename");
                                    String attributeValue22 = xmlPullParser.getAttributeValue(str, "title");
                                    String attributeValue23 = xmlPullParser.getAttributeValue(str, str5);
                                    String attributeValue24 = xmlPullParser.getAttributeValue(str, "duration");
                                    String attributeValue25 = xmlPullParser.getAttributeValue(str, "size");
                                    String attributeValue26 = xmlPullParser.getAttributeValue(str, "fps");
                                    str3 = str5;
                                    String attributeValue27 = xmlPullParser.getAttributeValue(str, "sig");
                                    String attributeValue28 = xmlPullParser.getAttributeValue(str, "orientation");
                                    String attributeValue29 = xmlPullParser.getAttributeValue(str, "infoUpdated");
                                    String attributeValue30 = xmlPullParser.getAttributeValue(str, str4);
                                    String attributeValue31 = xmlPullParser.getAttributeValue(str, "height");
                                    Uri uri = Uri.parse(attributeValue20);
                                    str2 = str4;
                                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                                    long jLongValue2 = -1;
                                    long jLongValue3 = (attributeValue24 == null || (longOrNull3 = StringsKt.toLongOrNull(attributeValue24)) == null) ? -1L : longOrNull3.longValue();
                                    long jLongValue4 = (attributeValue25 == null || (longOrNull2 = StringsKt.toLongOrNull(attributeValue25)) == null) ? -1L : longOrNull2.longValue();
                                    int iRoundToInt2 = (attributeValue26 == null || (doubleOrNull = StringsKt.toDoubleOrNull(attributeValue26)) == null) ? -1 : MathKt.roundToInt(doubleOrNull.doubleValue() * 100.0d);
                                    int iIntValue10 = (attributeValue28 == null || (intOrNull3 = StringsKt.toIntOrNull(attributeValue28)) == null) ? -1 : intOrNull3.intValue();
                                    if (attributeValue29 != null && (longOrNull = StringsKt.toLongOrNull(attributeValue29)) != null) {
                                        jLongValue2 = longOrNull.longValue();
                                    }
                                    arrayList2.add(new MediaUriInfo(uri, attributeValue21, attributeValue22, attributeValue23, jLongValue4, jLongValue2, attributeValue27, (attributeValue30 == null || (intOrNull2 = StringsKt.toIntOrNull(attributeValue30)) == null) ? -1 : intOrNull2.intValue(), (attributeValue31 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue31)) == null) ? -1 : intOrNull.intValue(), iIntValue10, jLongValue3, iRoundToInt2));
                                }
                                YzO.J2(xmlPullParser);
                            } else {
                                str2 = str4;
                                str3 = str5;
                                if (SceneElementKt.getElementReaders().containsKey(name)) {
                                    Function3<String, XmlPullParser, Boolean, SceneElement> function3 = SceneElementKt.getElementReaders().get(name);
                                    Intrinsics.checkNotNull(function3);
                                    arrayList.add(function3.invoke(str, xmlPullParser, Boolean.valueOf(z2)));
                                } else {
                                    YzO.J2(xmlPullParser);
                                }
                            }
                        }
                        if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                            break;
                        }
                        iIntValue = i13;
                        iIntValue5 = i16;
                        i11 = i5;
                        str5 = str3;
                        str4 = str2;
                    } else {
                        iIntValue = i13;
                    }
                }
            } else {
                i3 = iIntValue4;
            }
            reTimingMethod = ReTimingMethod.FREEZE;
            String attributeValue122 = xmlPullParser.getAttributeValue(str, "retimeIn");
            if (attributeValue122 == null) {
            }
            String attributeValue132 = xmlPullParser.getAttributeValue(str, "retimeOut");
            if (attributeValue132 == null) {
            }
            String attributeValue142 = xmlPullParser.getAttributeValue(str, "thumbnailTime");
            if (attributeValue142 == null) {
            }
            String attributeValue152 = xmlPullParser.getAttributeValue(str, "modifiedTime");
            if (attributeValue152 == null) {
            }
            String attributeValue162 = xmlPullParser.getAttributeValue(str, "retimeAdaptFPS");
            if (attributeValue162 != null) {
            }
            ReTimingMethod reTimingMethod22 = reTimingMethod;
            String attributeValue172 = xmlPullParser.getAttributeValue(str, "templateLink");
            int i92 = i2;
            int i102 = iIntValue8;
            boolean z52 = z4;
            int i112 = iRoundToInt;
            ArrayList arrayList3 = new ArrayList();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            int i122 = iIntValue7;
            ArrayList arrayList22 = new ArrayList();
            while (true) {
                int i132 = iIntValue;
                if (xmlPullParser.next() == 3) {
                }
            }
        } else {
            i2 = iIntValue2;
        }
        sceneType = SceneType.SCENE;
        String attributeValue112 = xmlPullParser.getAttributeValue(str, "fps");
        int iRoundToInt3 = MathKt.roundToInt(((attributeValue112 != null || (doubleOrNull2 = StringsKt.toDoubleOrNull(attributeValue112)) == null) ? 30.0d : doubleOrNull2.doubleValue()) * 100.0d);
        SceneType sceneType22 = sceneType;
        attributeValue = xmlPullParser.getAttributeValue(str, "retime");
        if (attributeValue == null) {
        }
        reTimingMethod = ReTimingMethod.FREEZE;
        String attributeValue1222 = xmlPullParser.getAttributeValue(str, "retimeIn");
        if (attributeValue1222 == null) {
        }
        String attributeValue1322 = xmlPullParser.getAttributeValue(str, "retimeOut");
        if (attributeValue1322 == null) {
        }
        String attributeValue1422 = xmlPullParser.getAttributeValue(str, "thumbnailTime");
        if (attributeValue1422 == null) {
        }
        String attributeValue1522 = xmlPullParser.getAttributeValue(str, "modifiedTime");
        if (attributeValue1522 == null) {
        }
        String attributeValue1622 = xmlPullParser.getAttributeValue(str, "retimeAdaptFPS");
        if (attributeValue1622 != null) {
        }
        ReTimingMethod reTimingMethod222 = reTimingMethod;
        String attributeValue1722 = xmlPullParser.getAttributeValue(str, "templateLink");
        int i922 = i2;
        int i1022 = iIntValue8;
        boolean z522 = z4;
        int i1122 = iRoundToInt3;
        ArrayList arrayList32 = new ArrayList();
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        int i1222 = iIntValue7;
        ArrayList arrayList222 = new ArrayList();
        while (true) {
            int i1322 = iIntValue;
            if (xmlPullParser.next() == 3) {
            }
        }
    }

    public static /* synthetic */ Scene readScene$default(XmlPullParser xmlPullParser, String str, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return readScene(xmlPullParser, str, z2, z3);
    }

    public static final String serializeScene(Scene scene, boolean z2, Map<Uri, MediaUriInfo> uriInfoMap, boolean z3, boolean z4, String str) throws IOException {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(uriInfoMap, "uriInfoMap");
        if (!SceneKt.hasUniqueIds(scene)) {
            throw new IllegalStateException("Scene IDs aren't uniquified.");
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        if (z2) {
            xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        }
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.startDocument(C.UTF8_NAME, null);
        if (z2) {
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
            Long BUILD_DATE = o.f4322n;
            Intrinsics.checkNotNullExpressionValue(BUILD_DATE, "BUILD_DATE");
            String str2 = dateTimeInstance.format(new Date(BUILD_DATE.longValue()));
            String str3 = String.format("%04d", Arrays.copyOf(new Object[]{1028425}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            String str4 = "5.0.273.1028425 (" + str3 + ")";
            String str5 = StringsKt.take("2d5c0f8d6aea15436d6faca47f9d6dec11f24c6e", 7) + " (" + str2 + ")";
            xmlSerializerNewSerializer.comment("\nCreated by Alight Motion (http://alightmotion.com)\nExported: " + new SimpleDateFormat("yyyy-MM-dd hh:mm a", Locale.ENGLISH).format(new Date()) + "\n" + str4 + "\n" + str5 + "\n");
        }
        Intrinsics.checkNotNull(xmlSerializerNewSerializer);
        writeScene(null, xmlSerializerNewSerializer, scene, uriInfoMap, z3 ? System.currentTimeMillis() : scene.getModifiedTime(), z4, str);
        xmlSerializerNewSerializer.endDocument();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String serializeScene$default(Scene scene, boolean z2, Map map, boolean z3, boolean z4, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        }
        if ((i2 & 16) != 0) {
            z4 = true;
        }
        if ((i2 & 32) != 0) {
            str = scene.getTemplateLink();
        }
        String str2 = str;
        return serializeScene(scene, z2, map, z3, z4, str2);
    }

    public static final Scene unserializeScene(String serializedScene, boolean z2, boolean z3, boolean z4) throws IOException, MalformedSceneException {
        Intrinsics.checkNotNullParameter(serializedScene, "serializedScene");
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(new StringReader(serializedScene));
            xmlPullParserNewPullParser.nextTag();
            Intrinsics.checkNotNull(xmlPullParserNewPullParser);
            final Scene scene = readScene(xmlPullParserNewPullParser, null, z2, z4);
            final Scene sceneUniquifyIds = SceneKt.uniquifyIds(scene);
            XoT.C.KN("unserializeScene", new Function0() { // from class: dmX.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SceneSerializerKt.unserializeScene$lambda$6(scene, sceneUniquifyIds);
                }
            });
            if (!z3 && !z4) {
                return SceneUpgraderKt.upgradeIfNeeded(sceneUniquifyIds);
            }
            return sceneUniquifyIds;
        } catch (MalformedSceneException e2) {
            if (e2.getHasPositionInfo()) {
                throw e2;
            }
            throw new MalformedSceneException("Malformed Scene: " + xmlPullParserNewPullParser.getPositionDescription(), e2, true);
        } catch (XmlPullParserException e3) {
            throw new MalformedSceneException("Malformed XML: " + xmlPullParserNewPullParser.getPositionDescription(), e3, true);
        }
    }

    public static /* synthetic */ Scene unserializeScene$default(String str, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        return unserializeScene(str, z2, z3, z4);
    }

    public static final void writeScene(String str, XmlSerializer xmlSerializer, Scene scene, Map<Uri, MediaUriInfo> uriInfoMap, long j2, boolean z2, String str2) throws IOException {
        long j3;
        Intrinsics.checkNotNullParameter(xmlSerializer, PtsLKY.zfCVzSWYygMeH);
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(uriInfoMap, "uriInfoMap");
        xmlSerializer.startTag(str, "scene");
        xmlSerializer.attribute(str, "title", scene.getTitle());
        YzO.rl(xmlSerializer, str, "width", scene.getWidth());
        YzO.rl(xmlSerializer, str, "height", scene.getHeight());
        YzO.rl(xmlSerializer, str, "exportWidth", scene.getExportWidth());
        YzO.rl(xmlSerializer, str, "exportHeight", scene.getExportHeight());
        xmlSerializer.attribute(str, "precompose", scene.getPrecompose().getTag());
        xmlSerializer.attribute(str, "bgcolor", qf.rl(ColorKt.toInt(scene.getBackground())));
        YzO.rl(xmlSerializer, str, "totalTime", scene.getTotalTime());
        xmlSerializer.attribute(str, "fps", getFpsString(scene));
        YzO.t(xmlSerializer, str, "modifiedTime", j2);
        YzO.rl(xmlSerializer, str, "amver", 1028425);
        YzO.rl(xmlSerializer, str, "ffver", getSerializedFormatVersion(scene));
        xmlSerializer.attribute(str, "am", n.rl().getPackageName() + "/5.0.273.1028425");
        xmlSerializer.attribute(str, "amplatform", AppLovinBridge.f61290h);
        if (str2 != null) {
            xmlSerializer.attribute(str, "templateLink", str2);
        }
        if (scene.getType() != SceneType.SCENE) {
            String strName = scene.getType().name();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = strName.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            xmlSerializer.attribute(str, "type", lowerCase);
        }
        String strName2 = scene.getReTimingMethod().name();
        Locale ENGLISH2 = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
        String lowerCase2 = strName2.toLowerCase(ENGLISH2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        xmlSerializer.attribute(str, "retime", StringsKt.replace$default(lowerCase2, '_', '-', false, 4, (Object) null));
        if (scene.getThumbnailTime() >= 0) {
            YzO.rl(xmlSerializer, str, "thumbnailTime", scene.getThumbnailTime());
        }
        if (scene.getReTimingInMark() != 0) {
            YzO.rl(xmlSerializer, str, "retimeIn", scene.getReTimingInMark());
        }
        if (scene.getReTimingOutMark() != 0) {
            YzO.rl(xmlSerializer, str, "retimeOut", scene.getReTimingOutMark());
        }
        YzO.nr(xmlSerializer, str, "retimeAdaptFPS", scene.getReTimingAdaptFrameRate());
        if (z2) {
            Set<Uri> set = SequencesKt.toSet(SceneKt.externalMediaSequence(scene));
            ArrayList<MediaUriInfo> arrayList = new ArrayList();
            for (Uri uri : set) {
                MediaUriInfo mediaUriInfoFromCache = uriInfoMap.get(uri);
                if (mediaUriInfoFromCache == null) {
                    mediaUriInfoFromCache = MediaUriInfo.INSTANCE.fromCache(uri);
                }
                if (mediaUriInfoFromCache != null) {
                    arrayList.add(mediaUriInfoFromCache);
                }
            }
            for (MediaUriInfo mediaUriInfo : arrayList) {
                xmlSerializer.startTag(str, "media");
                xmlSerializer.attribute(str, "uri", mediaUriInfo.getUri().toString());
                if (mediaUriInfo.getFilename() != null) {
                    xmlSerializer.attribute(str, "filename", mediaUriInfo.getFilename());
                }
                if (mediaUriInfo.getTitle() != null) {
                    xmlSerializer.attribute(str, "title", mediaUriInfo.getTitle());
                }
                if (mediaUriInfo.getMime() != null) {
                    xmlSerializer.attribute(str, "type", mediaUriInfo.getMime());
                }
                if (mediaUriInfo.getDuration() >= 0) {
                    j3 = 0;
                    YzO.t(xmlSerializer, str, "duration", mediaUriInfo.getDuration());
                } else {
                    j3 = 0;
                }
                if (mediaUriInfo.getSize() >= j3) {
                    YzO.t(xmlSerializer, str, "size", mediaUriInfo.getSize());
                }
                if (mediaUriInfo.getFphs() >= 0) {
                    xmlSerializer.attribute(str, "fps", fpsStringFromFPHS(mediaUriInfo.getFphs()));
                }
                if (mediaUriInfo.getSig() != null) {
                    xmlSerializer.attribute(str, "sig", mediaUriInfo.getSig());
                }
                if (mediaUriInfo.getOrientation() >= 0) {
                    YzO.rl(xmlSerializer, str, "orientation", mediaUriInfo.getOrientation());
                }
                if (mediaUriInfo.getInfoUpdated() > j3) {
                    YzO.t(xmlSerializer, str, XIvb.GTedIaPSflAOkOe, mediaUriInfo.getInfoUpdated());
                }
                if (mediaUriInfo.getWidth() >= 0 && mediaUriInfo.getHeight() >= 0) {
                    YzO.rl(xmlSerializer, str, "width", mediaUriInfo.getWidth());
                    YzO.rl(xmlSerializer, str, "height", mediaUriInfo.getHeight());
                }
                xmlSerializer.endTag(str, "media");
            }
        }
        for (Map.Entry<Integer, SceneBookmark> entry : scene.getBookmarks().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            SceneBookmark value = entry.getValue();
            xmlSerializer.startTag(str, "bookmark");
            YzO.rl(xmlSerializer, str, "t", iIntValue);
            if (value.getAppearance() != 0) {
                YzO.rl(xmlSerializer, str, CmcdData.OBJECT_TYPE_AUDIO_ONLY, value.getAppearance());
            }
            xmlSerializer.endTag(str, "bookmark");
        }
        Iterator<T> it = scene.getElements().iterator();
        while (it.hasNext()) {
            SceneElementKt.serialize((SceneElement) it.next(), str, xmlSerializer);
        }
        xmlSerializer.endTag(str, "scene");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unserializeScene$lambda$6(Scene scene, Scene scene2) {
        return "hasUniqueIds:" + SceneKt.hasUniqueIds(scene) + "->" + SceneKt.hasUniqueIds(scene2);
    }
}
