package com.alightcreative.app.motion.templates;

import com.alightcreative.app.motion.templates.Template;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0650j f46391O;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f46394U;
    private static final /* synthetic */ j[] jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46402n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f46403t;
    public static final j J2 = new j("THREE_D_PERSPECTIVE", 0, Template.Tag.t("3D Perspective"), 2132020324);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f46400r = new j("BOUNCE", 1, Template.Tag.t("Bounce"), 2132017367);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f46399o = new j("COLOR_SHIFT", 2, Template.Tag.t("Color Shift"), 2132017451);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final j f46396Z = new j("FLASH", 3, Template.Tag.t("Flash"), 2132019091);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final j f46392S = new j("GLITCH", 4, Template.Tag.t("Glitch"), 2132019340);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f46398g = new j("GLOW", 5, Template.Tag.t("Glow"), 2132019341);
    public static final j E2 = new j("MOTION_BLUR", 6, Template.Tag.t("Motion Blur"), 2132019638);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f46397e = new j("RGB_SPLIT", 7, Template.Tag.t("RGB Split"), 2132020071);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final j f46395X = new j("ROTATE", 8, Template.Tag.t("Rotate"), 2132020073);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final j f46393T = new j("SHAKE", 9, Template.Tag.t("Shake"), 2132020124);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final j f46390N = new j("SPIN", 10, Template.Tag.t("Spin"), 2132020190);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f46401v = new j("ZOOM_IN", 11, Template.Tag.t("Zoom In"), 2132020460);
    public static final j Xw = new j("ZOOM_OUT", 12, Template.Tag.t("Zoom Out"), 2132020461);

    /* JADX INFO: renamed from: com.alightcreative.app.motion.templates.j$j, reason: collision with other inner class name */
    public static final class C0650j {
        public /* synthetic */ C0650j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0650j() {
        }

        public final j n(String tag) {
            Object next;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Iterator<E> it = j.rl().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Template.Tag.J2(Ml.qie(((j) next).nr()), Ml.qie(tag))) {
                    break;
                }
            }
            return (j) next;
        }
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{J2, f46400r, f46399o, f46396Z, f46392S, f46398g, E2, f46397e, f46395X, f46393T, f46390N, f46401v, Xw};
    }

    public static EnumEntries rl() {
        return f46394U;
    }

    static {
        j[] jVarArrN = n();
        jB = jVarArrN;
        f46394U = EnumEntriesKt.enumEntries(jVarArrN);
        f46391O = new C0650j(null);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) jB.clone();
    }

    public final String nr() {
        return this.f46402n;
    }

    public final int t() {
        return this.f46403t;
    }

    private j(String str, int i2, String str2, int i3) {
        this.f46402n = str2;
        this.f46403t = i3;
    }
}
