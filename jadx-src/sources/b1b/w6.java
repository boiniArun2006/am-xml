package b1b;

import com.google.android.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum w6 {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, C.ISO88591_NAME),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, C.UTF8_NAME),
    ASCII(new int[]{27, 170}, C.ASCII_NAME),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f43176n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String[] f43177t;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Map f43160I = new HashMap();

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private static final Map f43159GR = new HashMap();

    w6(int i2) {
        this(new int[]{i2}, new String[0]);
    }

    static {
        for (w6 w6Var : values()) {
            for (int i2 : w6Var.f43176n) {
                f43160I.put(Integer.valueOf(i2), w6Var);
            }
            f43159GR.put(w6Var.name(), w6Var);
            for (String str : w6Var.f43177t) {
                f43159GR.put(str, w6Var);
            }
        }
    }

    w6(int i2, String... strArr) {
        this.f43176n = new int[]{i2};
        this.f43177t = strArr;
    }

    public static w6 rl(String str) {
        return (w6) f43159GR.get(str);
    }

    public int t() {
        return this.f43176n[0];
    }

    w6(int[] iArr, String... strArr) {
        this.f43176n = iArr;
        this.f43177t = strArr;
    }
}
