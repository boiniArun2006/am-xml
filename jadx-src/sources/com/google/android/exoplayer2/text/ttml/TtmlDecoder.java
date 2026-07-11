package com.google.android.exoplayer2.text.ttml;

import Hr.CQ.USEaHtCMH;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final n DEFAULT_FRAME_AND_TICK_RATE = new n(30.0f, 1, 1);
    private static final j DEFAULT_CELL_RESOLUTION = new j(32, 15);

    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).te(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).aYN(attributeValue);
                    break;
                case "textAlign":
                    ttmlStyle = createIfNull(ttmlStyle).T(parseAlignment(attributeValue));
                    break;
                case "textDecoration":
                    String strO = AbstractC2372w6.O(attributeValue);
                    strO.getClass();
                    switch (strO) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).s7N(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).s7N(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).iF(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).iF(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).S(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).g(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strO2 = AbstractC2372w6.O(attributeValue);
                    strO2.getClass();
                    switch (strO2) {
                        case "baseContainer":
                        case "base":
                            ttmlStyle = createIfNull(ttmlStyle).e(2);
                            break;
                        case "container":
                            ttmlStyle = createIfNull(ttmlStyle).e(1);
                            break;
                        case "delimiter":
                            ttmlStyle = createIfNull(ttmlStyle).e(4);
                            break;
                        case "textContainer":
                        case "text":
                            ttmlStyle = createIfNull(ttmlStyle).e(3);
                            break;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.WPU(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        Log.w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    ttmlStyle = createIfNull(ttmlStyle).X(parseShear(attributeValue));
                    break;
                case "textCombine":
                    String strO3 = AbstractC2372w6.O(attributeValue);
                    strO3.getClass();
                    if (!strO3.equals("all")) {
                        if (strO3.equals("none")) {
                            ttmlStyle = createIfNull(ttmlStyle).N(false);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).N(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        Log.w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    ttmlStyle = createIfNull(ttmlStyle).nHg(TextEmphasis.n(attributeValue));
                    break;
                case "rubyPosition":
                    String strO4 = AbstractC2372w6.O(attributeValue);
                    strO4.getClass();
                    if (!strO4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (strO4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            ttmlStyle = createIfNull(ttmlStyle).E2(2);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).E2(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.XQ(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        Log.w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    ttmlStyle = createIfNull(ttmlStyle).fD(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static long parseTimeExpression(String str, n nVar) throws SubtitleDecoderException {
        double d2;
        double d4;
        double d5;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d6 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d6 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / nVar.f58341n : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) nVar.rl)) / ((double) nVar.f58341n) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        d2 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
        String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d4 = nVar.f58341n;
                d2 /= d4;
                return (long) (d2 * 1000000.0d);
            case "h":
                d5 = 3600.0d;
                break;
            case "m":
                d5 = 60.0d;
                break;
            case "t":
                d4 = nVar.f58342t;
                d2 /= d4;
                return (long) (d2 * 1000000.0d);
            case "ms":
                d4 = 1000.0d;
                d2 /= d4;
                return (long) (d2 * 1000000.0d);
            default:
                return (long) (d2 * 1000000.0d);
        }
        d2 *= d5;
        return (long) (d2 * 1000000.0d);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f58340n;
        final int rl;

        j(int i2, int i3) {
            this.f58340n = i2;
            this.rl = i3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final float f58341n;
        final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f58342t;

        n(float f3, int i2, int i3) {
            this.f58341n = f3;
            this.rl = i2;
            this.f58342t = i3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int f58343n;
        final int rl;

        w6(int i2, int i3) {
            this.f58343n = i2;
            this.rl = i3;
        }
    }

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static TtmlStyle createIfNull(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(USEaHtCMH.vUsNyEbd) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private static j parseCellResolution(XmlPullParser xmlPullParser, j jVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return jVar;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return jVar;
        }
        try {
            int i2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int i3 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (i2 != 0 && i3 != 0) {
                return new j(i2, i3);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i2 + " " + i3);
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return jVar;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String str2;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) Assertions.checkNotNull(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                ttmlStyle.nY(3);
                break;
            case "em":
                ttmlStyle.nY(2);
                break;
            case "px":
                ttmlStyle.nY(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        ttmlStyle.ViF(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static n parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f3;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (Util.split(attributeValue2, " ").length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f3 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f3 = 1.0f;
        }
        n nVar = DEFAULT_FRAME_AND_TICK_RATE;
        int i3 = nVar.rl;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i5 = nVar.f58342t;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i5 = Integer.parseInt(attributeValue4);
        }
        return new n(i2 * f3, i3, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.exoplayer2.text.ttml.n parseNode(XmlPullParser xmlPullParser, @Nullable com.google.android.exoplayer2.text.ttml.n nVar, Map<String, com.google.android.exoplayer2.text.ttml.w6> map, n nVar2) throws SubtitleDecoderException {
        String attributeValue;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        long j2 = -9223372036854775807L;
        long timeExpression = -9223372036854775807L;
        long timeExpression2 = -9223372036854775807L;
        long timeExpression3 = -9223372036854775807L;
        String str = "";
        int i2 = 0;
        String strSubstring = null;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            long j3 = j2;
            attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i2++;
                    j2 = j3;
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, nVar2);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, nVar2);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, nVar2);
                    break;
                case "style":
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i2++;
            j2 = j3;
        }
        long j4 = j2;
        if (nVar != null) {
            long j5 = nVar.nr;
            if (j5 != j4) {
                if (timeExpression != j4) {
                    timeExpression += j5;
                }
                if (timeExpression2 != j4) {
                    timeExpression2 += j5;
                }
            }
        }
        long j6 = timeExpression;
        if (timeExpression2 == j4) {
            if (timeExpression3 != j4) {
                timeExpression2 = j6 + timeExpression3;
            } else if (nVar != null) {
                long j7 = nVar.f58349O;
                if (j7 != j4) {
                    timeExpression2 = j7;
                }
            }
        }
        return com.google.android.exoplayer2.text.ttml.n.t(xmlPullParser.getName(), j6, timeExpression2, styleAttributes, strArr, str, strSubstring, nVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.exoplayer2.text.ttml.w6 parseRegionAttributes(XmlPullParser xmlPullParser, j jVar, @Nullable w6 w6Var) {
        float f3;
        float f4;
        float f5;
        float f6;
        j jVar2;
        int i2;
        int i3;
        byte b2 = 0;
        int i5 = 1;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue == null) {
            return null;
        }
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue2 == null) {
            Log.w(TAG, "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = PERCENTAGE_COORDINATES;
        Matcher matcher = pattern.matcher(attributeValue2);
        Pattern pattern2 = PIXEL_COORDINATES;
        Matcher matcher2 = pattern2.matcher(attributeValue2);
        if (matcher.matches()) {
            try {
                f3 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                Log.w(TAG, "Ignoring region with unsupported origin: " + attributeValue2);
                return null;
            }
            if (w6Var == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                return null;
            }
            try {
                float f7 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1))) / w6Var.f58343n;
                float f8 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2))) / w6Var.rl;
                f3 = f7;
                f4 = f8;
            } catch (NumberFormatException unused2) {
                Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                return null;
            }
        }
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue3 == null) {
            Log.w(TAG, "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(attributeValue3);
        Matcher matcher4 = pattern2.matcher(attributeValue3);
        if (matcher3.matches()) {
            try {
                f5 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                f6 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                Log.w(TAG, "Ignoring region with unsupported extent: " + attributeValue2);
                return null;
            }
            if (w6Var == null) {
                Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                return null;
            }
            try {
                float f9 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1))) / w6Var.f58343n;
                f6 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2))) / w6Var.rl;
                f5 = f9;
            } catch (NumberFormatException unused4) {
                Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                return null;
            }
        }
        float f10 = f6;
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (attributeValue4 != null) {
            String strO = AbstractC2372w6.O(attributeValue4);
            strO.getClass();
            if (strO.equals(TtmlNode.CENTER)) {
                f4 += f10 / 2.0f;
                jVar2 = jVar;
                i2 = 1;
            } else if (strO.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                f4 += f10;
                jVar2 = jVar;
                i2 = 2;
            } else {
                jVar2 = jVar;
                i2 = 0;
            }
        }
        float f11 = f4;
        float f12 = 1.0f / jVar2.rl;
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (attributeValue5 != null) {
            String strO2 = AbstractC2372w6.O(attributeValue5);
            strO2.getClass();
            switch (strO2.hashCode()) {
                case 3694:
                    if (!strO2.equals("tb")) {
                        b2 = -1;
                    }
                    break;
                case 3553396:
                    b2 = !strO2.equals(TtmlNode.VERTICAL_LR) ? (byte) -1 : (byte) 1;
                    break;
                case 3553576:
                    b2 = !strO2.equals(TtmlNode.VERTICAL_RL) ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                    i3 = 2;
                    break;
                default:
                    i5 = Integer.MIN_VALUE;
                case 2:
                    i3 = i5;
                    break;
            }
        }
        return new com.google.android.exoplayer2.text.ttml.w6(attributeValue, f3, f11, 0, i2, f5, f10, 1, f12, i3);
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e2) {
            Log.w(TAG, "Failed to parse shear: " + str, e2);
            return Float.MAX_VALUE;
        }
    }

    @Nullable
    private static w6 parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new w6(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i2, boolean z2) throws SubtitleDecoderException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new com.google.android.exoplayer2.text.ttml.w6(""));
            int i3 = 0;
            w6 ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            n frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            j cellResolution = DEFAULT_CELL_RESOLUTION;
            I28 i28 = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                com.google.android.exoplayer2.text.ttml.n nVar = (com.google.android.exoplayer2.text.ttml.n) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellResolution = parseCellResolution(xmlPullParserNewPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        n nVar2 = frameAndTickRates;
                        w6 w6Var = ttsExtent;
                        j jVar = cellResolution;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                parseHeader(xmlPullParserNewPullParser, map, jVar, w6Var, map2, map3);
                            } else {
                                try {
                                    com.google.android.exoplayer2.text.ttml.n node = parseNode(xmlPullParserNewPullParser, nVar, map2, nVar2);
                                    arrayDeque.push(node);
                                    if (nVar != null) {
                                        nVar.n(node);
                                    }
                                } catch (SubtitleDecoderException e2) {
                                    Log.w(TAG, "Suppressing parser error", e2);
                                    i3++;
                                }
                            }
                            cellResolution = jVar;
                            ttsExtent = w6Var;
                            frameAndTickRates = nVar2;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i3++;
                        cellResolution = jVar;
                        ttsExtent = w6Var;
                        frameAndTickRates = nVar2;
                    } else if (eventType == 4) {
                        ((com.google.android.exoplayer2.text.ttml.n) Assertions.checkNotNull(nVar)).n(com.google.android.exoplayer2.text.ttml.n.nr(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            i28 = new I28((com.google.android.exoplayer2.text.ttml.n) Assertions.checkNotNull((com.google.android.exoplayer2.text.ttml.n) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (i28 != null) {
                return i28;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new SubtitleDecoderException("Unable to decode source", e4);
        }
    }

    @Nullable
    private static Layout.Alignment parseAlignment(String str) {
        String strO = AbstractC2372w6.O(str);
        strO.getClass();
        switch (strO) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, j jVar, @Nullable w6 w6Var, Map<String, com.google.android.exoplayer2.text.ttml.w6> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.n(map.get(str));
                    }
                }
                String strUo = styleAttributes.Uo();
                if (strUo != null) {
                    map.put(strUo, styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                com.google.android.exoplayer2.text.ttml.w6 regionAttributes = parseRegionAttributes(xmlPullParser, jVar, w6Var);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.f58353n, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        return Util.split(strTrim, "\\s+");
    }
}
