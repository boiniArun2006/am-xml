package DSG;

import java.util.List;
import java.util.UUID;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1442n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f1443t;

    public static final class Ml extends Wre {
        private final String J2;
        private final List KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f1444O;
        private final String Uo;

        public /* synthetic */ Ml(String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : str3, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return Intrinsics.areEqual(this.f1444O, ml.f1444O) && Intrinsics.areEqual(this.J2, ml.J2) && Intrinsics.areEqual(this.Uo, ml.Uo) && Intrinsics.areEqual(this.KN, ml.KN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(String title, String emoji, String str, List items) {
            super(null, title, emoji, str, 1, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f1444O = title;
            this.J2 = emoji;
            this.Uo = str;
            this.KN = items;
        }

        public final List O() {
            return this.KN;
        }

        public int hashCode() {
            int iHashCode = ((this.f1444O.hashCode() * 31) + this.J2.hashCode()) * 31;
            String str = this.Uo;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.KN.hashCode();
        }

        @Override // DSG.Wre
        public String n() {
            return this.Uo;
        }

        @Override // DSG.Wre
        public String nr() {
            return this.f1444O;
        }

        @Override // DSG.Wre
        public String rl() {
            return this.J2;
        }

        public String toString() {
            return "Menu(title=" + this.f1444O + ", emoji=" + this.J2 + ", description=" + this.Uo + ", items=" + this.KN + ")";
        }
    }

    public static final class j extends Wre {
        private final String J2;
        private final Function1 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f1445O;
        private final String Uo;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: DSG.Wre$j$j, reason: collision with other inner class name */
        public static final class EnumC0054j {
            private static final /* synthetic */ EnumC0054j[] J2;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f1448r;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final EnumC0054j f1447n = new EnumC0054j("NONE", 0);

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final EnumC0054j f1449t = new EnumC0054j("CLOSE_SECRET_MENU", 1);

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public static final EnumC0054j f1446O = new EnumC0054j("CLOSE_APP", 2);

            static {
                EnumC0054j[] enumC0054jArrN = n();
                J2 = enumC0054jArrN;
                f1448r = EnumEntriesKt.enumEntries(enumC0054jArrN);
            }

            private static final /* synthetic */ EnumC0054j[] n() {
                return new EnumC0054j[]{f1447n, f1449t, f1446O};
            }

            public static EnumC0054j valueOf(String str) {
                return (EnumC0054j) Enum.valueOf(EnumC0054j.class, str);
            }

            public static EnumC0054j[] values() {
                return (EnumC0054j[]) J2.clone();
            }

            private EnumC0054j(String str, int i2) {
            }
        }

        public /* synthetic */ j(String str, String str2, String str3, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : str3, function1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f1445O, jVar.f1445O) && Intrinsics.areEqual(this.J2, jVar.J2) && Intrinsics.areEqual(this.Uo, jVar.Uo) && Intrinsics.areEqual(this.KN, jVar.KN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String title, String emoji, String str, Function1 execute) {
            super(null, title, emoji, str, 1, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(execute, "execute");
            this.f1445O = title;
            this.J2 = emoji;
            this.Uo = str;
            this.KN = execute;
        }

        public final Function1 O() {
            return this.KN;
        }

        public int hashCode() {
            int iHashCode = ((this.f1445O.hashCode() * 31) + this.J2.hashCode()) * 31;
            String str = this.Uo;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.KN.hashCode();
        }

        @Override // DSG.Wre
        public String n() {
            return this.Uo;
        }

        @Override // DSG.Wre
        public String nr() {
            return this.f1445O;
        }

        @Override // DSG.Wre
        public String rl() {
            return this.J2;
        }

        public String toString() {
            return "Action(title=" + this.f1445O + ", emoji=" + this.J2 + ", description=" + this.Uo + ", execute=" + this.KN + ")";
        }
    }

    public static final class n extends Wre {
        private final String J2;
        private final Function2 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f1450O;
        private final String Uo;

        public /* synthetic */ n(String str, String str2, String str3, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : str3, function2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f1450O, nVar.f1450O) && Intrinsics.areEqual(this.J2, nVar.J2) && Intrinsics.areEqual(this.Uo, nVar.Uo) && Intrinsics.areEqual(this.KN, nVar.KN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String title, String emoji, String str, Function2 trailingContent) {
            super(null, title, emoji, str, 1, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(trailingContent, "trailingContent");
            this.f1450O = title;
            this.J2 = emoji;
            this.Uo = str;
            this.KN = trailingContent;
        }

        public final Function2 O() {
            return this.KN;
        }

        public int hashCode() {
            int iHashCode = ((this.f1450O.hashCode() * 31) + this.J2.hashCode()) * 31;
            String str = this.Uo;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.KN.hashCode();
        }

        @Override // DSG.Wre
        public String n() {
            return this.Uo;
        }

        @Override // DSG.Wre
        public String nr() {
            return this.f1450O;
        }

        @Override // DSG.Wre
        public String rl() {
            return this.J2;
        }

        public String toString() {
            return "CustomItem(title=" + this.f1450O + ", emoji=" + this.J2 + ", description=" + this.Uo + ", trailingContent=" + this.KN + ")";
        }
    }

    public static final class w6 extends Wre {
        private final String J2;
        private final Function3 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f1451O;
        private final String Uo;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class j {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f1452O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f1453n = new j("CLOSE_SECRET_MENU", 0);

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private static final /* synthetic */ j[] f1454t;

            static {
                j[] jVarArrN = n();
                f1454t = jVarArrN;
                f1452O = EnumEntriesKt.enumEntries(jVarArrN);
            }

            private static final /* synthetic */ j[] n() {
                return new j[]{f1453n};
            }

            public static j valueOf(String str) {
                return (j) Enum.valueOf(j.class, str);
            }

            public static j[] values() {
                return (j[]) f1454t.clone();
            }

            private j(String str, int i2) {
            }
        }

        public /* synthetic */ w6(String str, String str2, String str3, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? null : str3, function3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f1451O, w6Var.f1451O) && Intrinsics.areEqual(this.J2, w6Var.J2) && Intrinsics.areEqual(this.Uo, w6Var.Uo) && Intrinsics.areEqual(this.KN, w6Var.KN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(String title, String emoji, String str, Function3 content) {
            super(null, title, emoji, str, 1, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f1451O = title;
            this.J2 = emoji;
            this.Uo = str;
            this.KN = content;
        }

        public final Function3 O() {
            return this.KN;
        }

        public int hashCode() {
            int iHashCode = ((this.f1451O.hashCode() * 31) + this.J2.hashCode()) * 31;
            String str = this.Uo;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.KN.hashCode();
        }

        @Override // DSG.Wre
        public String n() {
            return this.Uo;
        }

        @Override // DSG.Wre
        public String nr() {
            return this.f1451O;
        }

        @Override // DSG.Wre
        public String rl() {
            return this.J2;
        }

        public String toString() {
            return "CustomScreen(title=" + this.f1451O + ", emoji=" + this.J2 + ", description=" + this.Uo + ", content=" + this.KN + ")";
        }
    }

    public /* synthetic */ Wre(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    public abstract String n();

    public abstract String nr();

    public abstract String rl();

    private Wre(String str, String str2, String str3, String str4) {
        this.f1442n = str;
        this.rl = str2;
        this.f1443t = str3;
        this.nr = str4;
    }

    public final String t() {
        return this.f1442n;
    }

    public /* synthetic */ Wre(String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, str4, null);
    }
}
