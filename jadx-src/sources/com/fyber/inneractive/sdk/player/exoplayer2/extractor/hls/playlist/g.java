package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.a0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.c0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f54938a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f54939b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f54940c = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f54941d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f54942e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f54943f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f54944g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f54945h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f54946i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f54947j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f54948k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f54949l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f54950m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f54951n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f54952o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f54953p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f54954q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f54955r = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f54956s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f54957t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f54958u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f54959v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Multi-variable type inference failed */
    public static d b(f fVar, String str) throws r {
        String str2;
        int i2;
        int i3;
        int i5;
        f fVar2 = fVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 1;
        String str3 = null;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        boolean zEquals = false;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        c cVar = null;
        String strB = null;
        String strA = null;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j9 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z3 = false;
        long j10 = -9223372036854775807L;
        int i14 = 1;
        while (fVar2.a()) {
            int i15 = i11;
            if (fVar2.a()) {
                str2 = fVar2.f54937c;
                fVar2.f54937c = str3;
            } else {
                str2 = str3;
            }
            long j11 = j2;
            if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strB2 = b(str2, f54944g);
                if ("VOD".equals(strB2)) {
                    i8 = i7;
                    i11 = i15;
                    j2 = j11;
                } else if ("EVENT".equals(strB2)) {
                    i11 = i15;
                    j2 = j11;
                    str3 = null;
                    i8 = 2;
                } else {
                    i2 = i7;
                    fVar2 = fVar;
                    i11 = i15;
                    j2 = j11;
                    i7 = i2;
                }
            } else {
                if (str2.startsWith("#EXT-X-START")) {
                    j10 = (long) (Double.parseDouble(b(str2, f54947j)) * 1000000.0d);
                } else if (str2.startsWith("#EXT-X-MAP")) {
                    String strB3 = b(str2, f54951n);
                    String strA2 = a(str2, f54949l);
                    if (strA2 != null) {
                        String[] strArrSplit = strA2.split("@");
                        j9 = Long.parseLong(strArrSplit[i15]);
                        if (strArrSplit.length > i7) {
                            j5 = Long.parseLong(strArrSplit[i7]);
                        }
                    }
                    c cVar2 = new c(strB3, 0L, -1, -9223372036854775807L, false, null, null, j5, j9);
                    j5 = 0;
                    j9 = -1;
                    i11 = i15;
                    j2 = j11;
                    cVar = cVar2;
                } else {
                    if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j3 = ((long) Integer.parseInt(b(str2, f54942e))) * 1000000;
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i9 = Integer.parseInt(b(str2, f54945h));
                        i13 = i9;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i14 = Integer.parseInt(b(str2, f54943f));
                    } else if (str2.startsWith("#EXTINF")) {
                        j6 = (long) (Double.parseDouble(b(str2, f54946i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        zEquals = "AES-128".equals(b(str2, f54950m));
                        if (zEquals) {
                            strB = b(str2, f54951n);
                            strA = a(str2, f54952o);
                        } else {
                            i11 = i15;
                            j2 = j11;
                            i7 = 1;
                            str3 = null;
                            strB = null;
                            strA = null;
                        }
                    } else {
                        if (str2.startsWith("#EXT-X-BYTERANGE")) {
                            String[] strArrSplit2 = b(str2, f54948k).split("@");
                            j9 = Long.parseLong(strArrSplit2[i15]);
                            i3 = 1;
                            if (strArrSplit2.length > 1) {
                                j5 = Long.parseLong(strArrSplit2[1]);
                            }
                        } else {
                            i3 = 1;
                            if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                i12 = Integer.parseInt(str2.substring(str2.indexOf(58) + 1));
                                i7 = 1;
                                z2 = true;
                            } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                                i10++;
                            } else {
                                if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (j4 == 0) {
                                        String strSubstring = str2.substring(str2.indexOf(58) + 1);
                                        Matcher matcher = z.f56239f.matcher(strSubstring);
                                        if (!matcher.matches()) {
                                            throw new r("Invalid date/time format: " + strSubstring);
                                        }
                                        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                            i5 = i15;
                                        } else {
                                            i5 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                            if (matcher.group(11).equals("-")) {
                                                i5 *= -1;
                                            }
                                        }
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                                        gregorianCalendar.clear();
                                        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                        if (!TextUtils.isEmpty(matcher.group(8))) {
                                            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                        }
                                        long timeInMillis = gregorianCalendar.getTimeInMillis();
                                        if (i5 != 0) {
                                            timeInMillis -= (long) (i5 * 60000);
                                        }
                                        int i16 = com.fyber.inneractive.sdk.player.exoplayer2.b.f54688a;
                                        j4 = (timeInMillis == j11 ? j11 : timeInMillis * 1000) - j7;
                                        fVar2 = fVar;
                                    } else {
                                        i2 = 1;
                                    }
                                } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                                    arrayList2.add(str2);
                                    i2 = 1;
                                } else if (str2.startsWith("#")) {
                                    i2 = 1;
                                    if (str2.equals("#EXT-X-ENDLIST")) {
                                        fVar2 = fVar;
                                        i11 = i15;
                                        j2 = j11;
                                        i7 = 1;
                                        z3 = true;
                                    }
                                } else {
                                    String hexString = !zEquals ? null : strA != null ? strA : Integer.toHexString(i9);
                                    int i17 = i9 + 1;
                                    long j12 = j9 == -1 ? 0L : j5;
                                    arrayList.add(new c(str2, j6, i10, j7, zEquals, strB, hexString, j12, j9));
                                    j7 += j6;
                                    if (j9 != -1) {
                                        j12 += j9;
                                    }
                                    j5 = j12;
                                    i9 = i17;
                                    j6 = 0;
                                    j9 = -1;
                                    i11 = i15;
                                    j2 = j11;
                                    i7 = 1;
                                    str3 = null;
                                    fVar2 = fVar;
                                }
                                fVar2 = fVar;
                                i11 = i15;
                                j2 = j11;
                                i7 = i2;
                            }
                        }
                        i7 = i3;
                    }
                    i11 = i15;
                    j2 = j11;
                    i7 = 1;
                }
                i11 = i15;
                j2 = j11;
            }
            str3 = null;
        }
        return new d(i8, str, j10, j4, z2, i12, i13, i14, j3, z3, j4 != 0 ? i7 : i11, cVar, arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x000f, B:5:0x0017, B:7:0x001f, B:9:0x0027, B:36:0x006f, B:37:0x0076, B:14:0x0032, B:16:0x0038, B:20:0x0041, B:22:0x0049, B:25:0x0056, B:27:0x005c, B:31:0x0063, B:32:0x0068, B:38:0x0077, B:40:0x007d, B:43:0x0088, B:45:0x0090, B:46:0x00a1, B:48:0x00a9, B:50:0x00b1, B:52:0x00b9, B:54:0x00c1, B:56:0x00c9, B:58:0x00d1, B:60:0x00d9, B:63:0x00e2, B:64:0x00e6), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e a(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws r {
        int i2;
        String strTrim;
        e eVarA;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jVar));
        LinkedList linkedList = new LinkedList();
        try {
            int i3 = bufferedReader.read();
            if (i3 != 239) {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                        while (i3 != -1 && Character.isWhitespace(i3)) {
                            int i5 = z.f56234a;
                            if (i3 == 10 || i3 == 13) {
                                break;
                            }
                            i3 = bufferedReader.read();
                        }
                        int i7 = z.f56234a;
                        if (i3 != 10) {
                            if (i3 == 13) {
                            }
                        }
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                z.a(bufferedReader);
                                throw new r("Failed to parse the playlist, could not identify any tags.");
                            }
                            strTrim = line.trim();
                            if (!strTrim.isEmpty()) {
                                if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                                    if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                                        break;
                                    }
                                    linkedList.add(strTrim);
                                } else {
                                    linkedList.add(strTrim);
                                    eVarA = a(new f(linkedList, bufferedReader), uri.toString());
                                    break;
                                }
                            }
                        }
                        linkedList.add(strTrim);
                        eVarA = b(new f(linkedList, bufferedReader), uri.toString());
                        z.a(bufferedReader);
                        return eVarA;
                    }
                    if (i3 != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            } else if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                i3 = bufferedReader.read();
                while (i3 != -1) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            }
            throw new a0("Input does not start with the #EXTM3U header.");
        } catch (Throwable th) {
            z.a(bufferedReader);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(f fVar, String str) throws r {
        String str2;
        int i2;
        String strA;
        String strB;
        String strA2;
        int i3;
        String str3;
        int i5;
        int i7;
        String str4;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        o oVar = null;
        List arrayList4 = null;
        boolean zContains = false;
        while (fVar.a()) {
            if (fVar.a()) {
                str2 = fVar.f54937c;
                fVar.f54937c = null;
            } else {
                str2 = null;
            }
            if (str2.startsWith("#EXT-X-MEDIA")) {
                Matcher matcher = f54958u.matcher(str2);
                boolean zEquals = matcher.find() ? matcher.group(1).equals("YES") : 0;
                Matcher matcher2 = f54959v.matcher(str2);
                int i8 = zEquals | (matcher2.find() ? matcher2.group(1).equals("YES") : false ? 2 : 0);
                Matcher matcher3 = f54957t.matcher(str2);
                i2 = i8 | (matcher3.find() ? matcher3.group(1).equals("YES") : false ? 4 : 0);
                strA = a(str2, f54951n);
                strB = b(str2, f54955r);
                strA2 = a(str2, f54954q);
                String strB2 = b(str2, f54953p);
                strB2.getClass();
                switch (strB2) {
                    case "SUBTITLES":
                        arrayList3.add(new a(strA, new o(strB, "application/x-mpegURL", "text/vtt", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, strA2, -1, Long.MAX_VALUE, null, null, null)));
                        break;
                    case "CLOSED-CAPTIONS":
                        String strB3 = b(str2, f54956s);
                        if (strB3.startsWith("CC")) {
                            i3 = Integer.parseInt(strB3.substring(2));
                            str3 = "application/cea-608";
                        } else {
                            i3 = Integer.parseInt(strB3.substring(7));
                            str3 = "application/cea-708";
                        }
                        int i9 = i3;
                        String str5 = str3;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(new o(strB, null, str5, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, strA2, i9, Long.MAX_VALUE, null, null, null));
                        break;
                    case "AUDIO":
                        o oVar2 = new o(strB, "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, strA2, -1, Long.MAX_VALUE, null, null, null);
                        if (strA != null) {
                            arrayList2.add(new a(strA, oVar2));
                            break;
                        } else {
                            oVar = oVar2;
                            break;
                        }
                        break;
                }
            } else if (str2.startsWith("#EXT-X-STREAM-INF")) {
                int i10 = Integer.parseInt(b(str2, f54939b));
                String strA3 = a(str2, f54938a);
                if (strA3 != null) {
                    i10 = Integer.parseInt(strA3);
                }
                int i11 = i10;
                String strA4 = a(str2, f54940c);
                String strA5 = a(str2, f54941d);
                zContains |= str2.contains("CLOSED-CAPTIONS=NONE");
                if (strA5 != null) {
                    String[] strArrSplit = strA5.split("x");
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    int i13 = Integer.parseInt(strArrSplit[1]);
                    if (i12 <= 0 || i13 <= 0) {
                        i5 = -1;
                        i7 = -1;
                    } else {
                        i7 = i13;
                        i5 = i12;
                    }
                    if (fVar.a()) {
                        str4 = fVar.f54937c;
                        fVar.f54937c = null;
                    } else {
                        str4 = null;
                    }
                    if (hashSet.add(str4)) {
                        arrayList.add(new a(str4, new o(Integer.toString(arrayList.size()), "application/x-mpegURL", null, strA4, i11, -1, i5, i7, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
                    }
                }
            }
        }
        if (zContains) {
            arrayList4 = Collections.EMPTY_LIST;
        }
        return new b(str, arrayList, arrayList2, arrayList3, oVar, arrayList4);
    }

    public static String b(String str, Pattern pattern) throws r {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
