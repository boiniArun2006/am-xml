package HI0;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class YzO {
    public static final void J2(XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = 1;
        while (i2 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final String O(XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        String str = "";
        while (xmlPullParser.next() != 3) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 2) {
                int depth = xmlPullParser.getDepth();
                J2(xmlPullParser);
                if (xmlPullParser.getEventType() != 3 || xmlPullParser.getDepth() != depth) {
                    throw new IllegalStateException("Did not consume all tag contents");
                }
            } else if (eventType == 4) {
                if (!StringsKt.isBlank(str)) {
                    str = str + " '";
                }
                str = str + xmlPullParser.getText();
            }
        }
        return str;
    }

    public static final void n(XmlSerializer xmlSerializer, String str, String name, float f3) {
        Intrinsics.checkNotNullParameter(xmlSerializer, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String str2 = String.format(Locale.ENGLISH, "%f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        xmlSerializer.attribute(str, name, str2);
    }

    public static final void nr(XmlSerializer xmlSerializer, String str, String name, boolean z2) {
        Intrinsics.checkNotNullParameter(xmlSerializer, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        xmlSerializer.attribute(str, name, z2 ? "true" : V8ValueBoolean.FALSE);
    }

    public static final void rl(XmlSerializer xmlSerializer, String str, String name, int i2) {
        Intrinsics.checkNotNullParameter(xmlSerializer, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        xmlSerializer.attribute(str, name, String.valueOf(i2));
    }

    public static final void t(XmlSerializer xmlSerializer, String str, String name, long j2) {
        Intrinsics.checkNotNullParameter(xmlSerializer, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        xmlSerializer.attribute(str, name, String.valueOf(j2));
    }
}
