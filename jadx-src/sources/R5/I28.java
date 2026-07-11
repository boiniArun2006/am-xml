package R5;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    public static final class j extends I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f8646n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "End";
        }

        public int hashCode() {
            return 519075024;
        }
    }

    public static abstract class n extends I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f8647n;

        public static final class j extends n {
            private final EnumC0293j rl;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: R5.I28$n$j$j, reason: collision with other inner class name */
            public static final class EnumC0293j {
                private static final /* synthetic */ EnumC0293j[] J2;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private static final /* synthetic */ EnumEntries f8650r;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final EnumC0293j f8649n = new EnumC0293j("LEFT", 0);

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public static final EnumC0293j f8651t = new EnumC0293j("MIDDLE", 1);

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final EnumC0293j f8648O = new EnumC0293j("RIGHT", 2);

                static {
                    EnumC0293j[] enumC0293jArrN = n();
                    J2 = enumC0293jArrN;
                    f8650r = EnumEntriesKt.enumEntries(enumC0293jArrN);
                }

                private static final /* synthetic */ EnumC0293j[] n() {
                    return new EnumC0293j[]{f8649n, f8651t, f8648O};
                }

                public static EnumC0293j valueOf(String str) {
                    return (EnumC0293j) Enum.valueOf(EnumC0293j.class, str);
                }

                public static EnumC0293j[] values() {
                    return (EnumC0293j[]) J2.clone();
                }

                private EnumC0293j(String str, int i2) {
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.rl == ((j) obj).rl;
            }

            /* JADX INFO: renamed from: R5.I28$n$j$n, reason: collision with other inner class name */
            public /* synthetic */ class C0294n {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC0293j.values().length];
                    try {
                        iArr[EnumC0293j.f8649n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC0293j.f8651t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC0293j.f8648O.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public j(EnumC0293j chosenBox) {
                int i2;
                Intrinsics.checkNotNullParameter(chosenBox, "chosenBox");
                int i3 = C0294n.$EnumSwitchMapping$0[chosenBox.ordinal()];
                if (i3 == 1) {
                    i2 = 2131951644;
                } else if (i3 == 2) {
                    i2 = 2131951643;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 2131951645;
                }
                super(i2, null);
                this.rl = chosenBox;
            }

            public int hashCode() {
                return this.rl.hashCode();
            }

            public String toString() {
                return "Chosen(chosenBox=" + this.rl + ")";
            }
        }

        /* JADX INFO: renamed from: R5.I28$n$n, reason: collision with other inner class name */
        public static final class C0295n extends n {
            public static final C0295n rl = new C0295n();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0295n);
            }

            public String toString() {
                return "Presentation";
            }

            private C0295n() {
                super(2131951641, null);
            }

            public int hashCode() {
                return -1156870394;
            }
        }

        public static final class w6 extends n {
            public static final w6 rl = new w6();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof w6);
            }

            public String toString() {
                return "Shuffling";
            }

            private w6() {
                super(2131951642, null);
            }

            public int hashCode() {
                return 188670218;
            }
        }

        public /* synthetic */ n(int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2);
        }

        private n(int i2) {
            super(null);
            this.f8647n = i2;
        }

        public final int n() {
            return this.f8647n;
        }
    }

    public static final class w6 extends I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f8652n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "Start";
        }

        public int hashCode() {
            return 628000535;
        }
    }

    public /* synthetic */ I28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private I28() {
    }
}
