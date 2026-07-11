package z;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Zs {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ Zs[] f76291g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76295n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Zs f76294t = new Zs("Triangles", 0, 4);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Zs f76288O = new Zs("TriangleStrip", 1, 5);
    public static final Zs J2 = new Zs("TriangleFan", 2, 6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Zs f76293r = new Zs("Lines", 3, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Zs f76292o = new Zs(YmsTEL.xPArZh, 4, 2);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Zs f76290Z = new Zs("LineStrip", 5, 3);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Zs f76289S = new Zs("Points", 6, 0);

    static {
        Zs[] zsArrN = n();
        f76291g = zsArrN;
        E2 = EnumEntriesKt.enumEntries(zsArrN);
    }

    private static final /* synthetic */ Zs[] n() {
        return new Zs[]{f76294t, f76288O, J2, f76293r, f76292o, f76290Z, f76289S};
    }

    public static Zs valueOf(String str) {
        return (Zs) Enum.valueOf(Zs.class, str);
    }

    public static Zs[] values() {
        return (Zs[]) f76291g.clone();
    }

    public final int rl() {
        return this.f76295n;
    }

    private Zs(String str, int i2, int i3) {
        this.f76295n = i3;
    }
}
