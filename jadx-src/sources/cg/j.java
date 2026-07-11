package cg;

import ScC.FuwU.XIvb;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43791E;
    private static final /* synthetic */ j[] eF;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43805n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43803t = new j("AUSTRALIA", 0, "amazon.com.au");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f43793O = new j("AUSTRIA", 1, "amazon.at");
    public static final j J2 = new j("CANADA", 2, "amazon.ca");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f43802r = new j("BRAZIL", 3, "amazon.com.br");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f43801o = new j("CHINA", 4, "amazon.cn");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final j f43798Z = new j("CZECH_REPUBLIC", 5, XIvb.JgbTZritFIg);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final j f43794S = new j("EGYPT", 6, "amazon.eg");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f43800g = new j("FRANCE", 7, "amazon.fr");
    public static final j E2 = new j("GERMANY", 8, "amazon.de");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f43799e = new j("INDIA", 9, "amazon.in");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final j f43797X = new j("ITALY", 10, "amazon.it");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final j f43795T = new j("JAPAN", 11, "amazon.co.jp");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final j f43792N = new j("MEXICO", 12, "amazon.com.mx");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f43804v = new j("NETHERLANDS", 13, "amazon.nl");
    public static final j Xw = new j("POLAND", 14, "amazon.pl");
    public static final j jB = new j("SINGAPORE", 15, "amazon.com.sg");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final j f43796U = new j("SPAIN", 16, "amazon.es");
    public static final j P5 = new j("UNITED_ARAB_EMIRATES", 17, "amazon.ae");
    public static final j M7 = new j("UNITED_KINGDOM_IRELAND", 18, "amazon.co.uk");
    public static final j p5 = new j("UNITED_STATES", 19, "amazon.com");

    static {
        j[] jVarArrN = n();
        eF = jVarArrN;
        f43791E = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f43803t, f43793O, J2, f43802r, f43801o, f43798Z, f43794S, f43800g, E2, f43799e, f43797X, f43795T, f43792N, f43804v, Xw, jB, f43796U, P5, M7, p5};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) eF.clone();
    }

    public final String rl() {
        return this.f43805n;
    }

    private j(String str, int i2, String str2) {
        this.f43805n = str2;
    }
}
