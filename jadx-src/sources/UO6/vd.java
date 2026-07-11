package UO6;

import com.alightcreative.monorepo.settings.ExportUIMenuItem;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class vd {
    private final boolean J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f10720O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f10721n;
    private final ExportUIMenuItem nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f10722t;
    private final w6 xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f10724r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f10726n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f10725t = new j("INFO", 0, 2131231002);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f10723O = new j("ARROW", 1, 2131231720);

        static {
            j[] jVarArrN = n();
            J2 = jVarArrN;
            f10724r = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f10725t, f10723O};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) J2.clone();
        }

        public final int rl() {
            return this.f10726n;
        }

        private j(String str, int i2, int i3) {
            this.f10726n = i3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class n {
        private static final /* synthetic */ n[] E2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f10730e;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f10735n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final n f10734t = new n("EXPORT_VIDEO", 0, 2131361919);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final n f10727O = new n("EXPORT_FRAME_PNG", 1, 2131361914);
        public static final n J2 = new n("EXPORT_IMAGE_SEQUENCE", 2, 2131361916);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final n f10733r = new n("EXPORT_GIF", 3, 2131361915);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final n f10732o = new n("EXPORT_XML", 4, 2131361920);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final n f10729Z = new n("SHARE_TEMPLATE", 5, 2131361971);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final n f10728S = new n("SHARE_PROJECT", 6, 2131361970);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final n f10731g = new n("CLOUD_BACKUP", 7, 2131361994);

        static {
            n[] nVarArrN = n();
            E2 = nVarArrN;
            f10730e = EnumEntriesKt.enumEntries(nVarArrN);
        }

        private static final /* synthetic */ n[] n() {
            return new n[]{f10734t, f10727O, J2, f10733r, f10732o, f10729Z, f10728S, f10731g};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) E2.clone();
        }

        public final int rl() {
            return this.f10735n;
        }

        private n(String str, int i2, int i3) {
            this.f10735n = i3;
        }
    }

    public vd(n type, int i2, int i3, ExportUIMenuItem item, j jVar, boolean z2, boolean z3, boolean z4, w6 w6Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f10721n = type;
        this.rl = i2;
        this.f10722t = i3;
        this.nr = item;
        this.f10720O = jVar;
        this.J2 = z2;
        this.Uo = z3;
        this.KN = z4;
        this.xMQ = w6Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return this.f10721n == vdVar.f10721n && this.rl == vdVar.rl && this.f10722t == vdVar.f10722t && this.nr == vdVar.nr && this.f10720O == vdVar.f10720O && this.J2 == vdVar.J2 && this.Uo == vdVar.Uo && this.KN == vdVar.KN && Intrinsics.areEqual(this.xMQ, vdVar.xMQ);
    }

    public final boolean J2() {
        return this.J2;
    }

    public final boolean KN() {
        return this.KN;
    }

    public final j O() {
        return this.f10720O;
    }

    public final boolean Uo() {
        return this.Uo;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f10721n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f10722t)) * 31) + this.nr.hashCode()) * 31;
        j jVar = this.f10720O;
        int iHashCode2 = (((((((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN)) * 31;
        w6 w6Var = this.xMQ;
        return iHashCode2 + (w6Var != null ? w6Var.hashCode() : 0);
    }

    public final w6 n() {
        return this.xMQ;
    }

    public final int nr() {
        return this.rl;
    }

    public final int rl() {
        return this.f10722t;
    }

    public final ExportUIMenuItem t() {
        return this.nr;
    }

    public String toString() {
        return "ExportModeItem(type=" + this.f10721n + ", name=" + this.rl + ", icon=" + this.f10722t + ", item=" + this.nr + ", rightIcon=" + this.f10720O + ", showNewBadge=" + this.J2 + ", showPremiumBadge=" + this.Uo + ", showResolutionDropdown=" + this.KN + ", exportInfo=" + this.xMQ + ")";
    }

    public final n xMQ() {
        return this.f10721n;
    }

    public /* synthetic */ vd(n nVar, int i2, int i3, ExportUIMenuItem exportUIMenuItem, j jVar, boolean z2, boolean z3, boolean z4, w6 w6Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, i2, i3, exportUIMenuItem, jVar, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? false : z3, (i5 & 128) != 0 ? false : z4, (i5 & 256) != 0 ? null : w6Var);
    }
}
