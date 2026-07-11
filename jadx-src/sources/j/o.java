package j;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f69264E;
    private static final /* synthetic */ o[] eF;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69278n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f69276t = new o("RES_2160", 0, 2160);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final o f69266O = new o("RES_1440", 1, 1440);
    public static final o J2 = new o("RES_1080", 2, 1080);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f69275r = new o("RES_1024", 3, 1024);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o f69274o = new o("RES_1000", 4, 1000);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final o f69271Z = new o("RES_720", 5, 720);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final o f69267S = new o("RES_640", 6, 640);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f69273g = new o("RES_540", 7, 540);
    public static final o E2 = new o("RES_512", 8, 512);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f69272e = new o("RES_480", 9, 480);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final o f69270X = new o("RES_400", 10, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final o f69268T = new o("RES_360", 11, 360);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final o f69265N = new o("RES_320", 12, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o f69277v = new o("RES_256", 13, 256);
    public static final o Xw = new o("RES_200", 14, 200);
    public static final o jB = new o("RES_180", 15, 180);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final o f69269U = new o("RES_150", 16, 150);
    public static final o P5 = new o("RES_100", 17, 100);
    public static final o M7 = new o("RES_80", 18, 80);
    public static final o p5 = new o("RES_64", 19, 64);

    static {
        o[] oVarArrN = n();
        eF = oVarArrN;
        f69264E = EnumEntriesKt.enumEntries(oVarArrN);
    }

    private static final /* synthetic */ o[] n() {
        return new o[]{f69276t, f69266O, J2, f69275r, f69274o, f69271Z, f69267S, f69273g, E2, f69272e, f69270X, f69268T, f69265N, f69277v, Xw, jB, f69269U, P5, M7, p5};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) eF.clone();
    }

    public final int rl() {
        return this.f69278n;
    }

    private o(String str, int i2, int i3) {
        this.f69278n = i3;
    }
}
