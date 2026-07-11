package com.alightcreative.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Md {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f47167o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ Md[] f47168r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Md f47166n = new Md("Start", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Md f47169t = new Md("Change", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Md f47165O = new Md("Finish", 2);
    public static final Md J2 = new Md("Cancel", 3);

    private static final /* synthetic */ Md[] n() {
        return new Md[]{f47166n, f47169t, f47165O, J2};
    }

    static {
        Md[] mdArrN = n();
        f47168r = mdArrN;
        f47167o = EnumEntriesKt.enumEntries(mdArrN);
    }

    public static Md valueOf(String str) {
        return (Md) Enum.valueOf(Md.class, str);
    }

    public static Md[] values() {
        return (Md[]) f47168r.clone();
    }

    private Md(String str, int i2) {
    }
}
