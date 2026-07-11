package com.alightcreative.app.motion.activities;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class rv6 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f45636Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ rv6[] f45637o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f45640n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final rv6 f45639t = new rv6("ChangeEmail", 0, "changeEmail");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final rv6 f45635O = new rv6("DeleteAccount", 1, "deleteAccount");
    public static final rv6 J2 = new rv6("SignIn", 2, "signIn");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final rv6 f45638r = new rv6("UnverifiedEmail", 3, "unverifiedEmail");

    private static final /* synthetic */ rv6[] n() {
        return new rv6[]{f45639t, f45635O, J2, f45638r};
    }

    static {
        rv6[] rv6VarArrN = n();
        f45637o = rv6VarArrN;
        f45636Z = EnumEntriesKt.enumEntries(rv6VarArrN);
    }

    public static rv6 valueOf(String str) {
        return (rv6) Enum.valueOf(rv6.class, str);
    }

    public static rv6[] values() {
        return (rv6[]) f45637o.clone();
    }

    public final String rl() {
        return this.f45640n;
    }

    private rv6(String str, int i2, String str2) {
        this.f45640n = str2;
    }
}
