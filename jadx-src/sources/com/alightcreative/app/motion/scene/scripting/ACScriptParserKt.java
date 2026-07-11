package com.alightcreative.app.motion.scene.scripting;

import HI0.YzO;
import com.alightcreative.app.motion.scene.MalformedXMLException;
import com.safedk.android.analytics.events.RedirectEvent;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"readACScript", "Lcom/alightcreative/app/motion/scene/scripting/ACScript;", "Lorg/xmlpull/v1/XmlPullParser;", "namespace", "", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ACScriptParserKt {
    public static final ACScript readACScript(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, MalformedXMLException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        xmlPullParser.require(2, str, "script");
        String attributeValue = xmlPullParser.getAttributeValue(str, RedirectEvent.f62800h);
        if (attributeValue == null) {
            attributeValue = "";
        }
        if (!StringsKt.isBlank(attributeValue)) {
            YzO.J2(xmlPullParser);
            return new ACScript(attributeValue, ACScriptType.External);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(str, "lang");
        if (attributeValue2 == null) {
            throw new MalformedXMLException("<script> element missing 'lang' attribute", null, false, 6, null);
        }
        if (Intrinsics.areEqual(attributeValue2, "js")) {
            return new ACScript(YzO.O(xmlPullParser), ACScriptType.JS);
        }
        throw new MalformedXMLException("Unrecognized <script> language, '" + attributeValue2 + "'", null, false, 6, null);
    }
}
