package com.alightcreative.app.motion.scene;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005\u001a\u0018\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"serialize", "", "Lcom/alightcreative/app/motion/scene/GradientFill;", "default", "namespace", "", "serializer", "Lorg/xmlpull/v1/XmlSerializer;", "tag", "gradientFillFromXml", "ns", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GradientFillKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GradientFill gradientFillFromXml(String str, XmlPullParser parser) throws XmlPullParserException, IOException {
        GradientType gradientType;
        SolidColor black;
        SolidColor white;
        Vector2D zero;
        Vector2D one;
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, str, "gradient");
        String attributeValue = parser.getAttributeValue(str, "type");
        if (attributeValue != null) {
            GradientType[] gradientTypeArrValues = GradientType.values();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = attributeValue.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            gradientType = (GradientType) HI0.Ew.n(gradientTypeArrValues, upperCase);
            if (gradientType == null) {
                gradientType = GradientType.LINEAR;
            }
        }
        GradientType gradientType2 = gradientType;
        String attributeValue2 = parser.getAttributeValue(str, "startColor");
        if (attributeValue2 == null || (black = HI0.qf.t(HI0.gnv.Uo(attributeValue2))) == null) {
            black = SolidColor.INSTANCE.getBLACK();
        }
        SolidColor solidColor = black;
        String attributeValue3 = parser.getAttributeValue(str, "endColor");
        if (attributeValue3 == null || (white = HI0.qf.t(HI0.gnv.Uo(attributeValue3))) == null) {
            white = SolidColor.INSTANCE.getWHITE();
        }
        SolidColor solidColor2 = white;
        String attributeValue4 = parser.getAttributeValue(str, TtmlNode.START);
        if (attributeValue4 == null || (zero = GeometryKt.toVector2DOrNull(attributeValue4)) == null) {
            zero = Vector2D.INSTANCE.getZERO();
        }
        Vector2D vector2D = zero;
        String attributeValue5 = parser.getAttributeValue(str, TtmlNode.END);
        if (attributeValue5 == null || (one = GeometryKt.toVector2DOrNull(attributeValue5)) == null) {
            one = Vector2D.INSTANCE.getONE();
        }
        Vector2D vector2D2 = one;
        HI0.YzO.J2(parser);
        return new GradientFill(gradientType2, solidColor, solidColor2, vector2D, vector2D2);
    }

    public static final void serialize(GradientFill gradientFill, GradientFill gradientFill2, String str, XmlSerializer serializer, String tag) throws IOException {
        Intrinsics.checkNotNullParameter(gradientFill, "<this>");
        Intrinsics.checkNotNullParameter(gradientFill2, "default");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(gradientFill, gradientFill2)) {
            return;
        }
        serializer.startTag(str, tag);
        String strName = gradientFill.getType().name();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = strName.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        serializer.attribute(str, "type", lowerCase);
        serializer.attribute(str, "startColor", HI0.qf.rl(ColorKt.toInt(gradientFill.getStartColor())));
        serializer.attribute(str, "endColor", HI0.qf.rl(ColorKt.toInt(gradientFill.getEndColor())));
        serializer.attribute(str, TtmlNode.START, gradientFill.getStartLocation().toString());
        serializer.attribute(str, TtmlNode.END, gradientFill.getEndLocation().toString());
        serializer.endTag(str, tag);
    }
}
