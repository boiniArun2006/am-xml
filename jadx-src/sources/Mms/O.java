package Mms;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class O {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6704S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ O[] f6705Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final char f6708n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final char f6709t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final O f6703O = new O("OBJ", 0, '{', '}');
    public static final O J2 = new O("LIST", 1, '[', ']');

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final O f6707r = new O("MAP", 2, '{', '}');

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final O f6706o = new O("POLY_OBJ", 3, '[', ']');

    public static EnumEntries rl() {
        return f6704S;
    }

    static {
        O[] oArrN = n();
        f6705Z = oArrN;
        f6704S = EnumEntriesKt.enumEntries(oArrN);
    }

    private static final /* synthetic */ O[] n() {
        return new O[]{f6703O, J2, f6707r, f6706o};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f6705Z.clone();
    }

    private O(String str, int i2, char c2, char c4) {
        this.f6708n = c2;
        this.f6709t = c4;
    }
}
