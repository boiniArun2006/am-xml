package com.alightcreative.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class oXP {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ oXP[] f47460O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final oXP f47461n = new oXP("Normal", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final oXP f47462t = new oXP("Bar", 1);

    private static final /* synthetic */ oXP[] n() {
        return new oXP[]{f47461n, f47462t};
    }

    static {
        oXP[] oxpArrN = n();
        f47460O = oxpArrN;
        J2 = EnumEntriesKt.enumEntries(oxpArrN);
    }

    public static oXP valueOf(String str) {
        return (oXP) Enum.valueOf(oXP.class, str);
    }

    public static oXP[] values() {
        return (oXP[]) f47460O.clone();
    }

    private oXP(String str, int i2) {
    }
}
