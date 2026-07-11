package com.alightcreative.widget;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class U4 {
    public static final U4 E2;
    public static final U4 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final U4 f47298O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final U4 f47299S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f47300X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final U4 f47301Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ U4[] f47302e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final U4 f47303g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final U4 f47304o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final U4 f47305r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47306n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f47307t;

    private U4(String str, int i2, boolean z2, boolean z3) {
        this.f47306n = z2;
        this.f47307t = z3;
    }

    private static final /* synthetic */ U4[] n() {
        return new U4[]{f47298O, J2, f47305r, f47304o, f47301Z, f47299S, f47303g, E2};
    }

    static {
        boolean z2 = false;
        f47298O = new U4("ColorFill", 0, false, z2, 3, null);
        boolean z3 = false;
        J2 = new U4("BorderShadow", 1, z2, z3, 3, null);
        boolean z4 = false;
        f47305r = new U4("BlendingOpacity", 2, z3, z4, 3, null);
        boolean z5 = false;
        f47304o = new U4("MoveTransform", 3, z4, z5, 3, null);
        boolean z6 = false;
        f47301Z = new U4("Text", 4, z5, z6, 3, null);
        boolean z7 = false;
        f47299S = new U4("Volume", 5, z6, z7, 3, null);
        boolean z9 = false;
        f47303g = new U4("Effects", 6, z7, z9, 3, null);
        E2 = new U4("Speed", 7, z9, false, 3, null);
        U4[] u4ArrN = n();
        f47302e = u4ArrN;
        f47300X = EnumEntriesKt.enumEntries(u4ArrN);
    }

    /* synthetic */ U4(String str, int i2, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, (i3 & 1) != 0 ? true : z2, (i3 & 2) != 0 ? true : z3);
    }

    public static U4 valueOf(String str) {
        return (U4) Enum.valueOf(U4.class, str);
    }

    public static U4[] values() {
        return (U4[]) f47302e.clone();
    }

    public final void J2(boolean z2) {
        this.f47307t = z2;
    }

    public final void nr(boolean z2) {
        this.f47306n = z2;
    }

    public final boolean rl() {
        return this.f47306n;
    }

    public final boolean t() {
        return this.f47307t;
    }
}
