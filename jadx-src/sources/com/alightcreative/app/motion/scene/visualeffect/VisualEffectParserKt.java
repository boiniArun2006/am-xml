package com.alightcreative.app.motion.scene.visualeffect;

import HI0.Ew;
import HI0.YzO;
import android.content.Context;
import android.net.Uri;
import android.util.Xml;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.scripting.ACScriptParserKt;
import com.alightcreative.app.motion.scene.scripting.ACScriptType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.UserParamParserKt;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.RedirectEvent;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yc.DT;
import yc.S;
import yc.V;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u0006*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0018*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "effectXml", "Landroid/net/Uri;", "uri", "LkgE/fuX;", "iapManager", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "visualEffectFromXml", "(Ljava/lang/String;Landroid/net/Uri;LkgE/fuX;)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "Lorg/xmlpull/v1/XmlPullParser;", "namespace", "readEffect", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Landroid/net/Uri;LkgE/fuX;)Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "", "isValidGLSLIdentifier", "(Ljava/lang/String;)Z", "effectId", "", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "readPresets", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectRenderPass;", "readPasses", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/util/List;", "Lcom/alightcreative/app/motion/scene/visualeffect/ShaderInfo;", "readShader", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/visualeffect/ShaderInfo;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVisualEffectParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisualEffectParser.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffectParserKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 XmlUtil.kt\ncom/alightcreative/ext/XmlUtilKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,296:1\n1#2:297\n1#2:333\n45#3,5:298\n50#3,7:310\n45#3,5:341\n45#3,12:358\n50#3,7:370\n45#3,12:377\n381#4,7:303\n126#5:317\n153#5,3:318\n1611#6,9:321\n1863#6:330\n1864#6:334\n1620#6:335\n774#6:336\n865#6,2:337\n1310#7,2:331\n1069#8,2:339\n434#8:346\n507#8,5:347\n434#8:352\n507#8,5:353\n*S KotlinDebug\n*F\n+ 1 VisualEffectParser.kt\ncom/alightcreative/app/motion/scene/visualeffect/VisualEffectParserKt\n*L\n182#1:333\n75#1:298,5\n75#1:310,7\n215#1:341,5\n240#1:358,12\n215#1:370,7\n260#1:377,12\n95#1:303,7\n112#1:317\n112#1:318,3\n182#1:321,9\n182#1:330\n182#1:334\n182#1:335\n205#1:336\n205#1:337,2\n183#1:331,2\n209#1:339,2\n223#1:346\n223#1:347,5\n224#1:352\n224#1:353,5\n*E\n"})
public final class VisualEffectParserKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ACScriptType.values().length];
            try {
                iArr[ACScriptType.JS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ACScriptType.External.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final ShaderInfo readShader(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        ShaderType shaderType;
        ShaderPrecision shaderPrecision;
        Integer intOrNull;
        xmlPullParser.require(2, str, "shader");
        String attributeValue = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue == null) {
            throw new MalformedXMLException("<shader> element missing 'type' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "precision");
        if (attributeValue2 == null) {
            attributeValue2 = "high";
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "group");
        int iIntValue = (attributeValue3 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue3)) == null) ? 0 : intOrNull.intValue();
        if (Intrinsics.areEqual(attributeValue, "fragment")) {
            shaderType = ShaderType.FRAGMENT;
        } else {
            if (!Intrinsics.areEqual(attributeValue, "vertex")) {
                throw new MalformedXMLException("Unrecognized shader type '" + attributeValue, null, false, 6, null);
            }
            shaderType = ShaderType.VERTEX;
        }
        int iHashCode = attributeValue2.hashCode();
        if (iHashCode == -1078030475) {
            if (attributeValue2.equals("medium")) {
                shaderPrecision = ShaderPrecision.MEDIUM;
                return new ShaderInfo(shaderType, YzO.O(xmlPullParser), shaderPrecision, iIntValue);
            }
            throw new MalformedXMLException("Unrecognized shader precision '" + attributeValue2, null, false, 6, null);
        }
        if (iHashCode == 107348) {
            if (attributeValue2.equals(l.aa)) {
                shaderPrecision = ShaderPrecision.LOW;
                return new ShaderInfo(shaderType, YzO.O(xmlPullParser), shaderPrecision, iIntValue);
            }
            throw new MalformedXMLException("Unrecognized shader precision '" + attributeValue2, null, false, 6, null);
        }
        if (iHashCode == 3202466 && attributeValue2.equals("high")) {
            shaderPrecision = ShaderPrecision.HIGH;
            return new ShaderInfo(shaderType, YzO.O(xmlPullParser), shaderPrecision, iIntValue);
        }
        throw new MalformedXMLException("Unrecognized shader precision '" + attributeValue2, null, false, 6, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0296 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[PHI: r6
      0x00b6: PHI (r6v30 java.lang.Float) = (r6v17 java.lang.Float), (r6v32 java.lang.Float) binds: [B:54:0x00cb, B:47:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final VisualEffect readEffect(XmlPullParser xmlPullParser, String str, Uri uri, kgE.fuX fux) throws XmlPullParserException, IOException, MalformedXMLException {
        float fFloatValue;
        EffectType effectType;
        V v2;
        Uri uri2;
        V v3;
        Integer intOrNull;
        String str2;
        int i2 = 2;
        xmlPullParser.require(2, str, "effect");
        String attributeValue = xmlPullParser.getAttributeValue(str, "id");
        if (attributeValue == null) {
            throw new MalformedXMLException("<effect> element missing 'id' attribute", null, false, 6, null);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str3 = attributeValue2 == null ? attributeValue : attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(str, "desc");
        String str4 = attributeValue3 == null ? "" : attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(str, "tags");
        String str5 = attributeValue4 == null ? "" : attributeValue4;
        String attributeValue5 = xmlPullParser.getAttributeValue(str, "affinity");
        String str6 = attributeValue5 == null ? "" : attributeValue5;
        String attributeValue6 = xmlPullParser.getAttributeValue(str, "category");
        String str7 = attributeValue6 == null ? "" : attributeValue6;
        String attributeValue7 = xmlPullParser.getAttributeValue(str, "thumb");
        String attributeValue8 = xmlPullParser.getAttributeValue(str, "deprecated");
        boolean z2 = attributeValue8 != null ? Boolean.parseBoolean(attributeValue8) : false;
        String attributeValue9 = xmlPullParser.getAttributeValue(str, "auto-transform");
        boolean z3 = attributeValue9 != null ? Boolean.parseBoolean(attributeValue9) : false;
        String attributeValue10 = xmlPullParser.getAttributeValue(str, "experimental");
        boolean z4 = attributeValue10 != null ? Boolean.parseBoolean(attributeValue10) : false;
        String attributeValue11 = xmlPullParser.getAttributeValue(str, RedirectEvent.f62801i);
        boolean z5 = attributeValue11 != null ? Boolean.parseBoolean(attributeValue11) : false;
        String attributeValue12 = xmlPullParser.getAttributeValue(str, "overdraw");
        boolean z6 = attributeValue12 != null ? Boolean.parseBoolean(attributeValue12) : false;
        String attributeValue13 = xmlPullParser.getAttributeValue(str, "max-overdraw");
        if (attributeValue13 == null || (floatOrNull = StringsKt.toFloatOrNull(attributeValue13)) == null) {
            String attributeValue14 = xmlPullParser.getAttributeValue(str, "maxOverdraw");
            Float floatOrNull = attributeValue14 != null ? StringsKt.toFloatOrNull(attributeValue14) : null;
            fFloatValue = floatOrNull != null ? floatOrNull.floatValue() : 0.0f;
        }
        float f3 = fFloatValue;
        String attributeValue15 = xmlPullParser.getAttributeValue(str, "type");
        if (attributeValue15 != null) {
            EffectType[] effectTypeArrValues = EffectType.values();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = attributeValue15.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            effectType = (EffectType) Ew.n(effectTypeArrValues, upperCase);
            if (effectType == null) {
                effectType = EffectType.SHADER;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iy.n nVar = null;
        List<UserParameter> listEmptyList = null;
        List<EffectRenderPass> listListOf = null;
        List<EffectPreset> listEmptyList2 = null;
        int iIntValue = 1;
        String str8 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == i2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                switch (name.hashCode()) {
                    case -1881759102:
                        if (!name.equals("strings")) {
                            YzO.J2(xmlPullParser);
                            Unit unit = Unit.INSTANCE;
                        } else {
                            if (nVar != null) {
                                throw new MalformedXMLException("More than one <strings> element found", null, false, 6, null);
                            }
                            Iy.n nVarO = Iy.w6.O(xmlPullParser, str);
                            Unit unit2 = Unit.INSTANCE;
                            nVar = nVarO;
                        }
                        if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                            throw new IllegalStateException("Did not consume all tag contents");
                        }
                        i2 = 2;
                        break;
                        break;
                    case -1751585482:
                        if (name.equals("iterations")) {
                            String attributeValue16 = xmlPullParser.getAttributeValue(str, JavetError.PARAMETER_COUNT);
                            if (attributeValue16 != null && (intOrNull = StringsKt.toIntOrNull(attributeValue16)) != null) {
                                iIntValue = intOrNull.intValue();
                            }
                            String attributeValue17 = xmlPullParser.getAttributeValue(str, "param");
                            YzO.J2(xmlPullParser);
                            Unit unit3 = Unit.INSTANCE;
                            str8 = attributeValue17;
                        }
                        if (xmlPullParser.getEventType() != 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -995427962:
                        if (name.equals("params")) {
                            if (listEmptyList != null) {
                                throw new MalformedXMLException("More than one <params> element found", null, false, 6, null);
                            }
                            if (z2 || z4) {
                                str2 = null;
                            } else {
                                Context applicationContext = IvA.n.rl().getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                str2 = "effect: " + Iy.w6.rl(str3, applicationContext);
                            }
                            List<UserParameter> userParams = UserParamParserKt.readUserParams(xmlPullParser, str, str2);
                            Unit unit4 = Unit.INSTANCE;
                            listEmptyList = userParams;
                        }
                        if (xmlPullParser.getEventType() != 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -995381121:
                        if (name.equals("passes")) {
                            if (listListOf != null) {
                                throw new MalformedXMLException("More than one <passes> element found", null, false, 6, null);
                            }
                            List<EffectRenderPass> passes = readPasses(xmlPullParser, str);
                            Unit unit5 = Unit.INSTANCE;
                            listListOf = passes;
                        }
                        if (xmlPullParser.getEventType() != 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -907685685:
                        if (name.equals("script")) {
                            arrayList.add(ACScriptParserKt.readACScript(xmlPullParser, str));
                            Unit unit6 = Unit.INSTANCE;
                        }
                        if (xmlPullParser.getEventType() != 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -903579675:
                        if (name.equals("shader")) {
                            ShaderInfo shader = readShader(xmlPullParser, str);
                            Integer numValueOf = Integer.valueOf(shader.getGroupId());
                            Object linkedHashMap2 = linkedHashMap.get(numValueOf);
                            if (linkedHashMap2 == null) {
                                linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap.put(numValueOf, linkedHashMap2);
                            }
                            Map map = (Map) linkedHashMap2;
                            if (map.containsKey(shader.getType())) {
                                throw new MalformedXMLException("More than  one " + shader.getType() + " shader in group " + shader.getGroupId(), null, false, 6, null);
                            }
                            map.put(shader.getType(), shader);
                            Unit unit7 = Unit.INSTANCE;
                        }
                        if (xmlPullParser.getEventType() != 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                    case -318277260:
                        if (name.equals("presets")) {
                            if (listEmptyList2 != null) {
                                throw new MalformedXMLException("More than one <presets> element found", null, false, 6, null);
                            }
                            List<EffectPreset> presets = readPresets(xmlPullParser, str, attributeValue);
                            Unit unit8 = Unit.INSTANCE;
                            listEmptyList2 = presets;
                        }
                        if (xmlPullParser.getEventType() != 3) {
                        }
                        throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            arrayList2.add(TuplesKt.to(Integer.valueOf(iIntValue2), new ShaderGroup(iIntValue2, true, (Map) entry.getValue())));
        }
        Map map2 = MapsKt.toMap(arrayList2);
        if (StringsKt.startsWith$default(attributeValue, "com.alightcreative.effects.repeat.", false, 2, (Object) null)) {
            v2 = V.n1;
        } else if (!map2.isEmpty()) {
            v2 = V.eWT;
        } else if (Intrinsics.areEqual(attributeValue, "com.alightcreative.effects.drawing.progress") || Intrinsics.areEqual(attributeValue, "com.alightcreative.effects.drawing.strokecolor") || Intrinsics.areEqual(attributeValue, "com.alightcreative.effects.drawing.stroketaper")) {
            v2 = V.ER;
        } else if (!arrayList.isEmpty()) {
            ACScript aCScript = (ACScript) CollectionsKt.first((List) arrayList);
            int i3 = WhenMappings.$EnumSwitchMapping$0[aCScript.getType().ordinal()];
            if (i3 == 1) {
                v2 = V.f75860G7;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                v2 = Intrinsics.areEqual(aCScript.getSource(), "com.alightcreative.script.movealongpath") ? V.f75860G7 : null;
            }
        }
        if (nVar == null) {
            nVar = new Iy.n(MapsKt.emptyMap(), true);
        }
        Iy.n nVar2 = nVar;
        Regex regex = new Regex("[^A-Za-z0-9]");
        Regex regex2 = new Regex("-{2,}");
        Context applicationContext2 = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        Context contextAz = XoT.fuX.az(applicationContext2);
        Intrinsics.checkNotNullExpressionValue(contextAz, "getEnglishContext(...)");
        String strTrim = StringsKt.trim(regex2.replace(regex.replace(StringsKt.trim((CharSequence) Iy.w6.n(nVar2, contextAz, str3)).toString(), "-"), "-"), '-');
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strTrim.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context applicationContext3 = IvA.n.rl().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
        HI0.Q q2 = new HI0.Q(applicationContext3);
        Uri uriBuild = uri.buildUpon().clearQuery().appendEncodedPath("thumb/" + StringsKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null) + ".webp").build();
        Uri uriBuild2 = uri.buildUpon().clearQuery().appendEncodedPath("thumb/" + StringsKt.replace$default(lowerCase, "-", "_", false, 4, (Object) null) + "_bg.webp").build();
        Intrinsics.checkNotNull(uriBuild);
        boolean zO = q2.O(uriBuild);
        Intrinsics.checkNotNull(uriBuild2);
        boolean zO2 = q2.O(uriBuild2);
        if (!zO) {
            uriBuild = attributeValue7 == null ? null : Uri.parse(attributeValue7).isAbsolute() ? Uri.parse(attributeValue7) : uri.buildUpon().clearQuery().appendEncodedPath(attributeValue7).build();
        }
        if (listListOf != null && listListOf.isEmpty()) {
            throw new MalformedXMLException("If <passes> is present, at least one <pass> must be specified.", null, false, 6, null);
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<UserParameter> list = listEmptyList;
        Set set = SequencesKt.toSet(SequencesKt.mapNotNull(SequencesKt.filter(SequencesKt.map(StringsKt.splitToSequence$default((CharSequence) str6, new char[]{','}, false, 0, 6, (Object) null), VisualEffectParserKt$readEffect$result$1.INSTANCE), VisualEffectParserKt$readEffect$result$2.INSTANCE), new Function1() { // from class: com.alightcreative.app.motion.scene.visualeffect.SPz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VisualEffectParserKt.readEffect$lambda$5((String) obj);
            }
        }));
        Set<String> set2 = SequencesKt.toSet(SequencesKt.filter(SequencesKt.map(StringsKt.splitToSequence$default((CharSequence) str5, new char[]{','}, false, 0, 6, (Object) null), VisualEffectParserKt$readEffect$result$4.INSTANCE), VisualEffectParserKt$readEffect$result$5.INSTANCE));
        List arrayList3 = new ArrayList();
        for (String str9 : set2) {
            V[] vArrValues = V.values();
            int length = vArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    V v4 = vArrValues[i5];
                    uri2 = uriBuild2;
                    if (Intrinsics.areEqual(v4.rl(), str9)) {
                        v3 = v4;
                    } else {
                        i5++;
                        uriBuild2 = uri2;
                    }
                } else {
                    uri2 = uriBuild2;
                    v3 = null;
                }
            }
            if (v3 != null) {
                arrayList3.add(v3);
            }
            uriBuild2 = uri2;
        }
        Uri uri3 = uriBuild2;
        if (v2 != null && !arrayList3.contains(v2)) {
            arrayList3 = CollectionsKt.plus((Collection<? extends V>) arrayList3, v2);
        }
        List listEmptyList3 = CollectionsKt.emptyList();
        if (listListOf == null) {
            listListOf = CollectionsKt.listOf(new EffectRenderPass("-", "normal", "none", "-"));
        }
        List<EffectRenderPass> list2 = listListOf;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        VisualEffect visualEffect = new VisualEffect(attributeValue, str3, str4, list, nVar2, map2, arrayList, list2, uri, effectType, z5, z2, z4, listEmptyList2, str7, arrayList3, set, listEmptyList3, uriBuild, zO2 ? uri3 : uriBuild, iIntValue, str8, z6, f3, z3);
        List listE2 = DT.E2();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : listE2) {
            if (((Boolean) ((S) obj).rl().invoke(visualEffect, null, Boolean.valueOf(fux.rl()))).booleanValue()) {
                arrayList4.add(obj);
            }
        }
        return VisualEffect.copy$default(visualEffect, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, arrayList4, null, null, 0, null, false, 0.0f, false, 33423359, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EffectAffinity readEffect$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return EffectAffinity.INSTANCE.fromString(it);
    }

    private static final List<EffectRenderPass> readPasses(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        xmlPullParser.require(2, str, "passes");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "pass")) {
                    String attributeValue = xmlPullParser.getAttributeValue(str, "target");
                    if (attributeValue == null) {
                        attributeValue = "-";
                    }
                    String string = StringsKt.trim((CharSequence) attributeValue).toString();
                    if (!Intrinsics.areEqual(string, "-") && !isValidGLSLIdentifier(string)) {
                        throw new MalformedXMLException("Illegal target name", null, false, 6, null);
                    }
                    YzO.J2(xmlPullParser);
                    String attributeValue2 = xmlPullParser.getAttributeValue(str, "blend");
                    if (attributeValue2 == null) {
                        attributeValue2 = "normal";
                    }
                    String string2 = StringsKt.trim((CharSequence) attributeValue2).toString();
                    String attributeValue3 = xmlPullParser.getAttributeValue(str, "effect");
                    if (attributeValue3 == null) {
                        attributeValue3 = "none";
                    }
                    String string3 = StringsKt.trim((CharSequence) attributeValue3).toString();
                    String attributeValue4 = xmlPullParser.getAttributeValue(str, "src");
                    arrayList.add(new EffectRenderPass(string, string2, string3, StringsKt.trim((CharSequence) (attributeValue4 != null ? attributeValue4 : "-")).toString()));
                } else {
                    YzO.J2(xmlPullParser);
                }
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final List<EffectPreset> readPresets(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException, MalformedXMLException {
        EffectPresetTiming effectPresetTiming;
        int i2 = 2;
        xmlPullParser.require(2, str, "presets");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == i2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "preset")) {
                    String attributeValue = xmlPullParser.getAttributeValue(str, "id");
                    if (attributeValue == null) {
                        throw new MalformedXMLException("<preset> element missing 'id' attribute", null, false, 6, null);
                    }
                    String attributeValue2 = xmlPullParser.getAttributeValue(str, "label");
                    String str3 = attributeValue2 == null ? attributeValue : attributeValue2;
                    String attributeValue3 = xmlPullParser.getAttributeValue(str, "timescale");
                    int i3 = attributeValue3 != null ? Integer.parseInt(attributeValue3) : 0;
                    String attributeValue4 = xmlPullParser.getAttributeValue(str, "short-code");
                    if (attributeValue4 == null) {
                        StringBuilder sb = new StringBuilder();
                        int length = str3.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            char cCharAt = str3.charAt(i5);
                            if (Character.isUpperCase(cCharAt)) {
                                sb.append(cCharAt);
                            }
                        }
                        String string = sb.toString();
                        StringBuilder sb2 = new StringBuilder();
                        int length2 = str3.length();
                        for (int i7 = 0; i7 < length2; i7++) {
                            char cCharAt2 = str3.charAt(i7);
                            if (Character.isLetterOrDigit(cCharAt2)) {
                                sb2.append(cCharAt2);
                            }
                        }
                        String strTake = StringsKt.take(string + sb2.toString() + str3 + attributeValue, 3);
                        Locale ROOT = Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        attributeValue4 = strTake.toUpperCase(ROOT);
                        Intrinsics.checkNotNullExpressionValue(attributeValue4, "toUpperCase(...)");
                    }
                    String str4 = attributeValue4;
                    String attributeValue5 = xmlPullParser.getAttributeValue(str, "timing");
                    if (attributeValue5 != null) {
                        switch (attributeValue5.hashCode()) {
                            case -1881872635:
                                if (!attributeValue5.equals("stretch")) {
                                    throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                                }
                                effectPresetTiming = EffectPresetTiming.Stretch;
                                break;
                                break;
                            case -1539739310:
                                if (!attributeValue5.equals("extend-match")) {
                                    throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                                }
                                effectPresetTiming = EffectPresetTiming.ExtendMatch;
                                break;
                                break;
                            case -1289044198:
                                if (!attributeValue5.equals("extend")) {
                                    throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                                }
                                effectPresetTiming = EffectPresetTiming.Extend;
                                break;
                                break;
                            case 100571:
                                if (!attributeValue5.equals(TtmlNode.END)) {
                                    throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                                }
                                effectPresetTiming = EffectPresetTiming.End;
                                break;
                                break;
                            case 109648666:
                                if (!attributeValue5.equals(V8ValueBuiltInSymbol.PROPERTY_SPLIT)) {
                                    throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                                }
                                effectPresetTiming = EffectPresetTiming.Split;
                                break;
                                break;
                            case 109757538:
                                if (!attributeValue5.equals(TtmlNode.START)) {
                                    throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                                }
                                effectPresetTiming = EffectPresetTiming.Start;
                                break;
                                break;
                            default:
                                throw new MalformedXMLException("Unrecognized preset timing '" + attributeValue5 + "' (must be 'stretch', 'extend', or 'extend-match'", null, false, 6, null);
                        }
                    } else {
                        effectPresetTiming = EffectPresetTiming.Stretch;
                    }
                    EffectPresetTiming effectPresetTiming2 = effectPresetTiming;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == i2) {
                            int depth2 = xmlPullParser.getDepth();
                            String name2 = xmlPullParser.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (Intrinsics.areEqual(name2, "property")) {
                                Pair<String, KeyableUserParameterValue> pairUnserializeUserParameterValue = UserParameterKt.unserializeUserParameterValue(str, xmlPullParser, false);
                                linkedHashMap.put(pairUnserializeUserParameterValue.component1(), pairUnserializeUserParameterValue.component2());
                            } else {
                                YzO.J2(xmlPullParser);
                            }
                            if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth2) {
                                throw new IllegalStateException("Did not consume all tag contents");
                            }
                            i2 = 2;
                        }
                    }
                    arrayList.add(new EffectPreset(attributeValue, str3, str4, i3, effectPresetTiming2, linkedHashMap, str2, null, null, RendererCapabilities.DECODER_SUPPORT_MASK, null));
                } else {
                    YzO.J2(xmlPullParser);
                }
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
                i2 = 2;
            }
        }
        return arrayList;
    }

    public static final VisualEffect visualEffectFromXml(String effectXml, Uri uri, kgE.fuX iapManager) throws IOException, MalformedXMLException {
        Intrinsics.checkNotNullParameter(effectXml, "effectXml");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(new StringReader(effectXml));
            xmlPullParserNewPullParser.nextTag();
            Intrinsics.checkNotNull(xmlPullParserNewPullParser);
            return readEffect(xmlPullParserNewPullParser, null, uri, iapManager);
        } catch (MalformedXMLException e2) {
            if (e2.getHasPositionInfo()) {
                throw e2;
            }
            throw new MalformedXMLException("Malformed Scene: " + xmlPullParserNewPullParser.getPositionDescription(), e2, true);
        } catch (XmlPullParserException e3) {
            throw new MalformedXMLException("Malformed XML: " + xmlPullParserNewPullParser.getPositionDescription(), e3, true);
        }
    }

    private static final boolean isValidGLSLIdentifier(String str) {
        if (!StringsKt.isBlank(str)) {
            int i2 = 0;
            while (true) {
                if (i2 < str.length()) {
                    if (!StringsKt.contains$default((CharSequence) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789", str.charAt(i2), false, 2, (Object) null)) {
                        break;
                    }
                    i2++;
                } else if (!StringsKt.contains$default((CharSequence) "0123456789", StringsKt.first(str), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
