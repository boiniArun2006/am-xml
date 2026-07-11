package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringReader;
import mfo.CLVG.aNrWBQYwFf;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzahu {
    private static final String[] zza = {"Camera:MotionPhoto", aNrWBQYwFf.cLeZVQh, "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static boolean zzb(@Nullable String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i2 = 0; i2 < 4; i2++) {
            if (str.contains(String.valueOf(strArr[i2]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaht zza(String str) throws IOException {
        long j2;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzfq.zzb(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzat.zzb("Couldn't find xmp metadata", null);
            }
            zzguf zzgufVarZzi = zzguf.zzi();
            long j3 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzfq.zzb(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i2 = 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        String strZzc = zzfq.zzc(xmlPullParserNewPullParser, strArr[i3]);
                        if (strZzc != null) {
                            if (Integer.parseInt(strZzc) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= 4) {
                                    break;
                                }
                                String strZzc2 = zzfq.zzc(xmlPullParserNewPullParser, strArr2[i5]);
                                if (strZzc2 != null) {
                                    j2 = Long.parseLong(strZzc2);
                                    if (j2 == -1) {
                                        break;
                                    }
                                } else {
                                    i5++;
                                }
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i2 >= 2) {
                                    zzgufVarZzi = zzguf.zzi();
                                    break;
                                }
                                String strZzc3 = zzfq.zzc(xmlPullParserNewPullParser, strArr3[i2]);
                                if (strZzc3 != null) {
                                    zzgufVarZzi = zzguf.zzk(new zzahs("image/jpeg", "Primary", 0L, 0L), new zzahs("video/mp4", "MotionPhoto", Long.parseLong(strZzc3), 0L));
                                    break;
                                }
                                i2++;
                            }
                            j3 = j2;
                        }
                    }
                    return null;
                }
                if (zzfq.zzb(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgufVarZzi = zzc(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzfq.zzb(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgufVarZzi = zzc(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzfq.zza(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgufVarZzi.isEmpty()) {
                return null;
            }
            return new zzaht(j3, zzgufVarZzi);
        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
            zzee.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzguf zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfq.zzb(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZzc = zzfq.zzc(xmlPullParser, strConcat2);
                String strZzc2 = zzfq.zzc(xmlPullParser, strConcat3);
                String strZzc3 = zzfq.zzc(xmlPullParser, strConcat4);
                String strZzc4 = zzfq.zzc(xmlPullParser, strConcat5);
                if (strZzc == null || strZzc2 == null) {
                    return zzguf.zzi();
                }
                zzgucVar.zzf(new zzahs(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzfq.zza(xmlPullParser, str.concat(":Directory")));
        return zzgucVar.zzi();
    }
}
