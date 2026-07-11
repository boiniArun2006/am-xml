package WzY;

import com.alightcreative.app.motion.scene.SceneSelection;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: WzY.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class EnumC1485c {
    private static final /* synthetic */ EnumEntries Xw;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11632n;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC1485c[] f11636v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1485c f11635t = new EnumC1485c("NONE", 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC1485c f11625O = new EnumC1485c("SINGLE", 1);
    public static final EnumC1485c J2 = new EnumC1485c("MULTI", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC1485c f11634r = new EnumC1485c("SELECTABLE_HINT", 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1485c f11633o = new EnumC1485c("PARENT_OUTLINE", 4);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final EnumC1485c f11629Z = new EnumC1485c("PARENT_OUTLINE_INDIRECT", 5);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final EnumC1485c f11626S = new EnumC1485c("OUTLINE", 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1485c f11631g = new EnumC1485c("DETAIL", 7);
    public static final EnumC1485c E2 = new EnumC1485c("MOTION_PATH", 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1485c f11630e = new EnumC1485c("MOTION_PATH_HINT", 9);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final EnumC1485c f11628X = new EnumC1485c("EDIT_POINTS", 10);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final EnumC1485c f11627T = new EnumC1485c("EDIT_POINTS_UNSELECTED", 11);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final EnumC1485c f11624N = new EnumC1485c("PARENT_CONNECTION", 12);

    /* JADX INFO: renamed from: WzY.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final EnumC1485c n(SceneSelection selection, long j2, int i2) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            if (i2 == 2131362625) {
                return EnumC1485c.f11629Z;
            }
            if (i2 == 2131362624) {
                return EnumC1485c.f11633o;
            }
            if (selection.isElementDirectlySelected(j2)) {
                return EnumC1485c.f11625O;
            }
            if (selection.isElementSelected(j2) && selection.isMultiSelect()) {
                return EnumC1485c.J2;
            }
            if (selection.isElementSelected(j2)) {
                return EnumC1485c.f11625O;
            }
            Long selectableHint = selection.getSelectableHint();
            return (selectableHint != null && selectableHint.longValue() == j2) ? EnumC1485c.f11634r : EnumC1485c.f11635t;
        }
    }

    static {
        EnumC1485c[] enumC1485cArrN = n();
        f11636v = enumC1485cArrN;
        Xw = EnumEntriesKt.enumEntries(enumC1485cArrN);
        f11632n = new j(null);
    }

    private static final /* synthetic */ EnumC1485c[] n() {
        return new EnumC1485c[]{f11635t, f11625O, J2, f11634r, f11633o, f11629Z, f11626S, f11631g, E2, f11630e, f11628X, f11627T, f11624N};
    }

    public static EnumC1485c valueOf(String str) {
        return (EnumC1485c) Enum.valueOf(EnumC1485c.class, str);
    }

    public static EnumC1485c[] values() {
        return (EnumC1485c[]) f11636v.clone();
    }

    private EnumC1485c(String str, int i2) {
    }
}
