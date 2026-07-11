package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73040N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final /* synthetic */ C[] f73043T;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f73048n = new C("SHAPE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f73051t = new C("MEDIA_PHOTO", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C f73041O = new C("MEDIA_VIDEO", 2);
    public static final C J2 = new C("AUDIO", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C f73050r = new C("CAMERA_OBJECT", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C f73049o = new C("NULL_OBJECT", 5);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final C f73045Z = new C("EMPTY_GROUP_OBJECT", 6);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C f73042S = new C("ELEMENT", 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C f73047g = new C("FREEHAND_DRAWING", 8);
    public static final C E2 = new C("VECTOR_DRAWING", 9);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f73046e = new C("TEXT", 10);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final C f73044X = new C("TEMPLATE", 11);

    static {
        C[] cArrN = n();
        f73043T = cArrN;
        f73040N = EnumEntriesKt.enumEntries(cArrN);
    }

    private static final /* synthetic */ C[] n() {
        return new C[]{f73048n, f73051t, f73041O, J2, f73050r, f73049o, f73045Z, f73042S, f73047g, E2, f73046e, f73044X};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f73043T.clone();
    }

    private C(String str, int i2) {
    }
}
