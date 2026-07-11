package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Wre;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qcD.nehv.Apsps;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class SsaStyle {
    public final boolean J2;
    public final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final float f58317O;
    public final boolean Uo;
    public final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f58318n;
    public final Integer nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f58319t;
    public final boolean xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58325n;
        public final PointF rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Pattern f58324t = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern nr = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final Pattern f58323O = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern J2 = Pattern.compile("\\\\an(\\d+)");

        private static int n(String str) {
            Matcher matcher = J2.matcher(str);
            if (matcher.find()) {
                return SsaStyle.O((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static String nr(String str) {
            return f58324t.matcher(str).replaceAll("");
        }

        public static n rl(String str) {
            Matcher matcher = f58324t.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF pointFT = t(str2);
                    if (pointFT != null) {
                        pointF = pointFT;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iN = n(str2);
                    if (iN != -1) {
                        i2 = iN;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new n(i2, pointF);
        }

        private static PointF t(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = nr.matcher(str);
            Matcher matcher2 = f58323O.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.i("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(strGroup)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(strGroup2)).trim()));
        }

        private n(int i2, PointF pointF) {
            this.f58325n = i2;
            this.rl = pointF;
        }
    }

    private static boolean J2(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            Log.w("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    private static boolean nr(int i2) {
        return i2 == 1 || i2 == 3;
    }

    private static boolean t(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class j {
        public final int J2;
        public final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f58320O;
        public final int Uo;
        public final int gh;
        public final int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58321n;
        public final int nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f58322t;
        public final int xMQ;

        /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static j n(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i2 = -1;
            int i3 = -1;
            int i5 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                String strO = AbstractC2372w6.O(strArrSplit[i14].trim());
                strO.getClass();
                switch (strO) {
                    case "italic":
                        i10 = i14;
                        break;
                    case "underline":
                        i11 = i14;
                        break;
                    case "strikeout":
                        i12 = i14;
                        break;
                    case "primarycolour":
                        i5 = i14;
                        break;
                    case "bold":
                        i9 = i14;
                        break;
                    case "name":
                        i2 = i14;
                        break;
                    case "fontsize":
                        i8 = i14;
                        break;
                    case "borderstyle":
                        i13 = i14;
                        break;
                    case "alignment":
                        i3 = i14;
                        break;
                    case "outlinecolour":
                        i7 = i14;
                        break;
                }
            }
            if (i2 != -1) {
                return new j(i2, i3, i5, i7, i8, i9, i10, i11, i12, i13, strArrSplit.length);
            }
            return null;
        }

        private j(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f58321n = i2;
            this.rl = i3;
            this.f58322t = i5;
            this.nr = i7;
            this.f58320O = i8;
            this.J2 = i9;
            this.Uo = i10;
            this.KN = i11;
            this.xMQ = i12;
            this.mUb = i13;
            this.gh = i14;
        }
    }

    public static Integer KN(String str) {
        try {
            long j2 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.checkArgument(j2 <= 4294967295L);
            return Integer.valueOf(Color.argb(Wre.nr(((j2 >> 24) & 255) ^ 255), Wre.nr(j2 & 255), Wre.nr((j2 >> 8) & 255), Wre.nr((j2 >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            Log.w("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }

    public static SsaStyle rl(String str, j jVar) {
        boolean z2;
        boolean z3;
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = jVar.gh;
        if (length != i2) {
            Log.w("SsaStyle", Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[jVar.f58321n].trim();
            int i3 = jVar.rl;
            int iO = i3 != -1 ? O(strArrSplit[i3].trim()) : -1;
            int i5 = jVar.f58322t;
            Integer numKN = i5 != -1 ? KN(strArrSplit[i5].trim()) : null;
            int i7 = jVar.nr;
            Integer numKN2 = i7 != -1 ? KN(strArrSplit[i7].trim()) : null;
            int i8 = jVar.f58320O;
            float fXMQ = i8 != -1 ? xMQ(strArrSplit[i8].trim()) : -3.4028235E38f;
            int i9 = jVar.J2;
            boolean z4 = false;
            boolean z5 = true;
            if (i9 == -1 || !J2(strArrSplit[i9].trim())) {
                z2 = false;
            } else {
                z2 = false;
                z4 = true;
            }
            int i10 = jVar.Uo;
            if (i10 == -1 || !J2(strArrSplit[i10].trim())) {
                z3 = true;
                z5 = z2;
            } else {
                z3 = true;
            }
            int i11 = jVar.KN;
            if (i11 == -1 || !J2(strArrSplit[i11].trim())) {
                z3 = false;
            }
            int i12 = jVar.xMQ;
            boolean z6 = i12 != -1 && J2(strArrSplit[i12].trim());
            int i13 = jVar.mUb;
            return new SsaStyle(strTrim, iO, numKN, numKN2, fXMQ, z4, z5, z3, z6, i13 != -1 ? Uo(strArrSplit[i13].trim()) : -1);
        } catch (RuntimeException e2) {
            Log.w("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    private SsaStyle(String str, int i2, Integer num, Integer num2, float f3, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        this.f58318n = str;
        this.rl = i2;
        this.f58319t = num;
        this.nr = num2;
        this.f58317O = f3;
        this.J2 = z2;
        this.Uo = z3;
        this.KN = z4;
        this.xMQ = z5;
        this.mUb = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int O(String str) {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (t(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int Uo(String str) {
        try {
            int i2 = Integer.parseInt(str.trim());
            if (nr(i2)) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w("SsaStyle", Apsps.sUjhxGkhu + str);
        return -1;
    }

    private static float xMQ(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            Log.w("SsaStyle", "Failed to parse font size: '" + str + "'", e2);
            return -3.4028235E38f;
        }
    }
}
