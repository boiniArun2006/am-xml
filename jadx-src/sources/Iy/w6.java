package Iy;

import HI0.YzO;
import android.content.Context;
import androidx.core.os.ConfigurationCompat;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d8q.jqQ.QTafcm;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class w6 {
    public static final n O(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        xmlPullParser.require(2, str, "strings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "locale")) {
                    Pair pairNr = nr(xmlPullParser, str);
                    String str2 = (String) pairNr.component1();
                    Map map = (Map) pairNr.component2();
                    if (linkedHashMap.containsKey(str2)) {
                        throw new MalformedXMLException("Language '" + str2 + "' specified multiple times", null, false, 6, null);
                    }
                    linkedHashMap.put(str2, map);
                } else {
                    YzO.J2(xmlPullParser);
                }
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            }
        }
        return new n(linkedHashMap, true);
    }

    public static final String n(n nVar, Context context, String string) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string, "string");
        if (StringsKt.startsWith$default(string, "@am:string/", false, 2, (Object) null) && nVar.n()) {
            int identifier = context.getResources().getIdentifier(StringsKt.drop(string, 11), "string", context.getPackageName());
            if (identifier != 0) {
                String string2 = context.getString(identifier);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            return "?" + StringsKt.drop(string, 11);
        }
        if (!StringsKt.startsWith$default(string, "@string/", false, 2, (Object) null)) {
            return string;
        }
        String strSubstring = string.substring(8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Map mapRl = nVar.rl();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapRl.entrySet()) {
            if (((Map) entry.getValue()).containsKey(strSubstring)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Locale localeJ2 = ConfigurationCompat.n(context.getResources().getConfiguration()).J2((String[]) linkedHashMap.keySet().toArray(new String[0]));
        if (localeJ2 == null) {
            localeJ2 = Locale.ENGLISH;
        }
        String languageTag = localeJ2.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = languageTag.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (Map.Entry entry2 : nVar.rl().entrySet()) {
            String str6 = (String) entry2.getKey();
            Map map = (Map) entry2.getValue();
            Locale ENGLISH2 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            String lowerCase2 = str6.toLowerCase(ENGLISH2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                String str7 = (String) map.get(strSubstring);
                if (str7 != null) {
                    return str7;
                }
            } else if (StringsKt.startsWith$default(lowerCase, lowerCase2, false, 2, (Object) null) && str3 == null) {
                String str8 = (String) map.get(strSubstring);
                if (str8 != null) {
                    str3 = str8;
                }
            } else if (Intrinsics.areEqual(lowerCase2, "en") && (str = (String) map.get(strSubstring)) != null) {
                str4 = str;
            }
            if (str5 == null && (str2 = (String) map.get(strSubstring)) != null) {
                str5 = str2;
            }
        }
        if (str3 != null) {
            return str3;
        }
        if (str4 != null) {
            return str4;
        }
        if (str5 != null) {
            return str5;
        }
        return "?" + strSubstring;
    }

    private static final Pair nr(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        xmlPullParser.require(2, str, "locale");
        String attributeValue = xmlPullParser.getAttributeValue(str, "lang");
        if (attributeValue == null) {
            throw new MalformedXMLException("<locale> element missing 'lang' attribute", null, false, 6, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                int depth = xmlPullParser.getDepth();
                String name = xmlPullParser.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (Intrinsics.areEqual(name, "string")) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (attributeValue2 == null) {
                        throw new MalformedXMLException("<string> element missing 'name' attribute", null, false, 6, null);
                    }
                    String strO = YzO.O(xmlPullParser);
                    if (linkedHashMap.containsKey(attributeValue2)) {
                        throw new MalformedXMLException("String with name '" + attributeValue2 + "' specified multiple times", null, false, 6, null);
                    }
                    linkedHashMap.put(attributeValue2, strO);
                } else {
                    YzO.J2(xmlPullParser);
                }
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException(QTafcm.bBvQxvUA);
                }
            }
        }
        return new Pair(attributeValue, linkedHashMap);
    }

    public static final String rl(String str, Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!StringsKt.startsWith$default(str, "@am:string/", false, 2, (Object) null)) {
            return str;
        }
        int identifier = context.getResources().getIdentifier(StringsKt.drop(str, 11), "string", context.getPackageName());
        if (identifier == 0) {
            return "?";
        }
        String string = context.getString(identifier);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final String t(Map map, Context context) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Locale localeJ2 = ConfigurationCompat.n(context.getResources().getConfiguration()).J2((String[]) map.keySet().toArray(new String[0]));
        if (localeJ2 == null) {
            localeJ2 = Locale.ENGLISH;
        }
        String languageTag = localeJ2.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = languageTag.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = null;
        String str2 = null;
        String str3 = null;
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            Locale ENGLISH2 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            String lowerCase2 = str4.toLowerCase(ENGLISH2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                return str5;
            }
            if (StringsKt.startsWith$default(lowerCase, lowerCase2, false, 2, (Object) null) && str == null) {
                str = str5;
            } else if (Intrinsics.areEqual(lowerCase2, "en")) {
                str2 = str5;
            }
            if (str3 == null) {
                str3 = str5;
            }
        }
        return str == null ? str2 == null ? str3 : str2 : str;
    }
}
