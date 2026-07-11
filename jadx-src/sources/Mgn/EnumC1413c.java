package Mgn;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Mgn.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class EnumC1413c {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6635Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumC1413c[] f6636o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6639n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1413c f6638t = new EnumC1413c("SRC_FALSE", 0, 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC1413c f6634O = new EnumC1413c("SRC_TRUE", 1, 1);
    public static final EnumC1413c J2 = new EnumC1413c("SRC_MODE_PROCESS", 2, 555);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1413c f6637r = new EnumC1413c("SRC_MODE_CALLBACK", 3, 556);

    static {
        EnumC1413c[] enumC1413cArrN = n();
        f6636o = enumC1413cArrN;
        f6635Z = EnumEntriesKt.enumEntries(enumC1413cArrN);
    }

    private static final /* synthetic */ EnumC1413c[] n() {
        return new EnumC1413c[]{f6638t, f6634O, J2, f6637r};
    }

    public static EnumC1413c valueOf(String str) {
        return (EnumC1413c) Enum.valueOf(EnumC1413c.class, str);
    }

    public static EnumC1413c[] values() {
        return (EnumC1413c[]) f6636o.clone();
    }

    private EnumC1413c(String str, int i2, int i3) {
        this.f6639n = i3;
    }
}
