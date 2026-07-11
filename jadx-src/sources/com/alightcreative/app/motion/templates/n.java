package com.alightcreative.app.motion.templates;

import com.alightcreative.app.motion.templates.Template;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class n {
    private static final /* synthetic */ EnumEntries M7;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f46405O;
    private static final /* synthetic */ n[] P5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46416n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f46417t;
    public static final n J2 = new n("ANIMAL", 0, Template.Tag.t("Animal"), 2132017251);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f46414r = new n("CAR", 1, Template.Tag.t("Car"), 2132017399);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f46413o = new n("CHIBI", 2, Template.Tag.t("Chibi"), 2132017428);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final n f46410Z = new n("CITYSCAPES", 3, Template.Tag.t("Cityscapes"), 2132017430);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final n f46406S = new n("CLASSIC_ANIME", 4, Template.Tag.t("Classic Anime"), 2132017431);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f46412g = new n("COMIC", 5, Template.Tag.t("Comic"), 2132017477);
    public static final n E2 = new n("CYBERPUNK_ANIME", 6, Template.Tag.t("Cyberpunk Anime"), 2132017642);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f46411e = new n("FAMILY", 7, Template.Tag.t("Family"), 2132019068);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final n f46409X = new n("FANTASY", 8, Template.Tag.t("Fantasy"), 2132019069);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final n f46407T = new n("GHIBLI_STYLE", 9, Template.Tag.t("Ghibli Style"), 2132019337);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final n f46404N = new n("LOVE", 10, Template.Tag.t("Love"), 2132019466);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f46415v = new n("MYTHOLOGY", 11, Template.Tag.t("Mythology"), 2132019707);
    public static final n Xw = new n("ROMANTIC_ANIME", 12, Template.Tag.t("Romantic Anime"), 2132020072);
    public static final n jB = new n("SPACE", 13, Template.Tag.t("Space"), 2132020189);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final n f46408U = new n("SPORTS", 14, Template.Tag.t("Sports"), 2132020191);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final n n(String tag) {
            Object next;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Iterator<E> it = n.rl().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Template.Tag.J2(Ml.qie(((n) next).nr()), Ml.qie(tag))) {
                    break;
                }
            }
            return (n) next;
        }
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{J2, f46414r, f46413o, f46410Z, f46406S, f46412g, E2, f46411e, f46409X, f46407T, f46404N, f46415v, Xw, jB, f46408U};
    }

    public static EnumEntries rl() {
        return M7;
    }

    static {
        n[] nVarArrN = n();
        P5 = nVarArrN;
        M7 = EnumEntriesKt.enumEntries(nVarArrN);
        f46405O = new j(null);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) P5.clone();
    }

    public final String nr() {
        return this.f46416n;
    }

    public final int t() {
        return this.f46417t;
    }

    private n(String str, int i2, String str2, int i3) {
        this.f46416n = str2;
        this.f46417t = i3;
    }
}
