package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.collect.nKK;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f57785n = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] rl = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f57786t = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static long O(XmlPullParser xmlPullParser) {
        for (String str : rl) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j2 = Long.parseLong(attributeValue);
                if (j2 == -1) {
                    return -9223372036854775807L;
                }
                return j2;
            }
        }
        return -9223372036854775807L;
    }

    private static boolean nr(XmlPullParser xmlPullParser) {
        for (String str : f57785n) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static nKK t(XmlPullParser xmlPullParser) {
        for (String str : f57786t) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return nKK.XQ(new MotionPhotoDescription.ContainerItem("image/jpeg", "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        return nKK.r();
    }

    private static nKK J2(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j2;
        nKK.j jVarGh = nKK.gh();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, str3)) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Mime");
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Semantic");
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Length");
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Padding");
                if (attributeValue != null && attributeValue2 != null) {
                    long j3 = 0;
                    if (attributeValue3 != null) {
                        j2 = Long.parseLong(attributeValue3);
                    } else {
                        j2 = 0;
                    }
                    if (attributeValue4 != null) {
                        j3 = Long.parseLong(attributeValue4);
                    }
                    jVarGh.n(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, j2, j3));
                } else {
                    return nKK.r();
                }
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str4));
        return jVarGh.gh();
    }

    public static MotionPhotoDescription n(String str) {
        try {
            return rl(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static MotionPhotoDescription rl(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            nKK nkkR = nKK.r();
            long jO = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                    if (!nr(xmlPullParserNewPullParser)) {
                        return null;
                    }
                    jO = O(xmlPullParserNewPullParser);
                    nkkR = t(xmlPullParserNewPullParser);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                    nkkR = J2(xmlPullParserNewPullParser, "Container", "Item");
                } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    nkkR = J2(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (nkkR.isEmpty()) {
                return null;
            }
            return new MotionPhotoDescription(jO, nkkR);
        }
        throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
    }
}
