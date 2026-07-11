package jg;

import f.EnumC1982eO;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69522n;
    private final pq.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C2200z f69521t = new C2200z(null);
    public static final int nr = 8;

    public static final class C extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final C f69523O = new C();

        private C() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C);
        }

        public String toString() {
            return "CloudUploadCancelled";
        }

        public int hashCode() {
            return 490005456;
        }
    }

    public static final class CN3 extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69524O;

        public CN3(boolean z2) {
            super(null);
            pq.Ml ml = new pq.Ml();
            ml.KN("is_project_overridden", z2);
            this.f69524O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69524O;
        }
    }

    public static final class DAz extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final DAz f69525O = new DAz();

        private DAz() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DAz);
        }

        public String toString() {
            return "OnboardingCompleted";
        }

        public int hashCode() {
            return 1476197723;
        }
    }

    public static final class Dsr extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Dsr f69526O = new Dsr();

        private Dsr() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Dsr);
        }

        public String toString() {
            return "CloudDownloadRequested";
        }

        public int hashCode() {
            return 1732157254;
        }
    }

    public static final class Ew extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69527O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ew(String productId, String str, int i2, boolean z2, mg4.w6 subscriptionTier, List availableProducts, EnumC1982eO enumC1982eO) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(subscriptionTier, "subscriptionTier");
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            pq.Ml ml = new pq.Ml();
            ml.O("product_id", productId);
            if (str != null) {
                ml.O("hook", str);
            }
            ml.nr("number_of_sessions", Integer.valueOf(i2));
            ml.KN("is_first_paywall", z2);
            ml.O("subscription_tier", rWZ.j.KN(subscriptionTier));
            ml.O("available_products", CollectionsKt.joinToString$default(availableProducts, ",", null, null, 0, null, null, 62, null));
            if (enumC1982eO != null) {
                ml.O("paywall_type", rWZ.j.J2(enumC1982eO));
            }
            this.f69527O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69527O;
        }
    }

    public static final class I28 extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final I28 f69528O = new I28();

        private I28() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public String toString() {
            return "AppSetupStarted";
        }

        public int hashCode() {
            return 383879280;
        }
    }

    public static final class K extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69529O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(String hook, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(hook, "hook");
            pq.Ml ml = new pq.Ml();
            ml.O("hook", hook);
            ml.KN("with_back_button", z2);
            this.f69529O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69529O;
        }
    }

    public static final class Ln extends n {
        private final pq.Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final EnumC1982eO f69530O;

        public Ln(EnumC1982eO enumC1982eO) {
            super(null);
            this.f69530O = enumC1982eO;
            pq.Ml ml = new pq.Ml();
            if (enumC1982eO != null) {
                ml.O("paywall_type", rWZ.j.J2(enumC1982eO));
            }
            this.J2 = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.J2;
        }
    }

    public static final class Lu extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Lu f69531O = new Lu();

        private Lu() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Lu);
        }

        public String toString() {
            return "PlayfulUnlockFtUiShown";
        }

        public int hashCode() {
            return 1237517175;
        }
    }

    public static final class M extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69532O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(String str, List availableProducts, EnumC1982eO enumC1982eO) {
            super(null);
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            pq.Ml ml = new pq.Ml();
            if (str != null) {
                ml.O("hook", str);
            }
            ml.O("available_products", CollectionsKt.joinToString$default(availableProducts, ",", null, null, 0, null, null, 62, null));
            if (enumC1982eO != null) {
                ml.O("paywall_type", rWZ.j.J2(enumC1982eO));
            }
            this.f69532O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69532O;
        }
    }

    public static final class Md extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69533O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Md(String projectId) {
            super(null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            pq.Ml ml = new pq.Ml();
            ml.O("project_id", projectId);
            this.f69533O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69533O;
        }
    }

    public static final class Ml extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69534O;

        public Ml(String str) {
            super(null);
            pq.Ml ml = new pq.Ml();
            ml.O("app_setup_error", str == null ? "" : str);
            this.f69534O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69534O;
        }
    }

    public static abstract class OU extends n {

        public static abstract class j extends OU {

            public static final class CN3 extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69535O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CN3(String url, boolean z2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.f69535O = pq.I28.n(pq.n.O("url", url), pq.n.n("is_favorite", z2));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69535O;
                }
            }

            public static final class Dsr extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69536O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Dsr(String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.f69536O = pq.I28.n(pq.n.O("url", url));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69536O;
                }
            }

            public static final class I28 extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final I28 f69537O = new I28();

                private I28() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof I28);
                }

                public String toString() {
                    return "Shown";
                }

                public int hashCode() {
                    return -1521333589;
                }
            }

            public static final class Ml extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final Ml f69538O = new Ml();

                private Ml() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Ml);
                }

                public String toString() {
                    return "SavedTemplatesFilterTapped";
                }

                public int hashCode() {
                    return -1410032548;
                }
            }

            public static final class Wre extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69539O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Wre(String tag) {
                    super(null);
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    this.f69539O = pq.I28.n(pq.n.O("tag", tag));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69539O;
                }
            }

            public static final class aC extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final aC f69540O = new aC();

                private aC() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof aC);
                }

                public String toString() {
                    return "ViewYourTemplatesTapped";
                }

                public int hashCode() {
                    return 1364939431;
                }
            }

            public static final class fuX extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69541O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public fuX(String tag, boolean z2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    this.f69541O = pq.I28.n(pq.n.O("tag", tag), pq.n.n("is_enabled", z2));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69541O;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$j$j, reason: collision with other inner class name */
            public static final class C0989j extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final C0989j f69542O = new C0989j();

                private C0989j() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0989j);
                }

                public String toString() {
                    return "AllTemplatesFilterTapped";
                }

                public int hashCode() {
                    return -105720062;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$j$n, reason: collision with other inner class name */
            public static final class C0990n extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69543O;

                public C0990n(int i2) {
                    super(null);
                    this.f69543O = pq.I28.n(pq.n.nr("page", Integer.valueOf(i2)));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69543O;
                }
            }

            public static final class w6 extends j {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final w6 f69544O = new w6();

                private w6() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof w6);
                }

                public String toString() {
                    return "Refreshed";
                }

                public int hashCode() {
                    return 397786452;
                }
            }

            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: jg.n$OU$n, reason: collision with other inner class name */
        public static abstract class AbstractC0991n extends OU {

            /* JADX INFO: renamed from: jg.n$OU$n$CN3 */
            public static final class CN3 extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final CN3 f69545O = new CN3();

                private CN3() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof CN3);
                }

                public String toString() {
                    return "Shown";
                }

                public int hashCode() {
                    return -832940968;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$Dsr */
            public static final class Dsr extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final Dsr f69546O = new Dsr();

                private Dsr() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Dsr);
                }

                public String toString() {
                    return "ViewAllProjectsTapped";
                }

                public int hashCode() {
                    return 616736969;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$I28 */
            public static final class I28 extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final I28 f69547O = new I28();

                private I28() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof I28);
                }

                public String toString() {
                    return "ProjectOpened";
                }

                public int hashCode() {
                    return -719249111;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$Ml */
            public static final class Ml extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final Ml f69548O = new Ml();

                private Ml() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Ml);
                }

                public String toString() {
                    return "GetStartedWithTutorialTapped";
                }

                public int hashCode() {
                    return 1199880820;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$Wre */
            public static final class Wre extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final Wre f69549O = new Wre();

                private Wre() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Wre);
                }

                public String toString() {
                    return "Refreshed";
                }

                public int hashCode() {
                    return 85403777;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$aC */
            public static final class aC extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final aC f69550O = new aC();

                private aC() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof aC);
                }

                public String toString() {
                    return "ViewAllTemplatesTapped";
                }

                public int hashCode() {
                    return -2145570206;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$fuX */
            public static final class fuX extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69551O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public fuX(String tag) {
                    super(null);
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    this.f69551O = pq.I28.n(pq.n.O("tag", tag));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69551O;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$j */
            public static final class j extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final j f69552O = new j();

                private j() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof j);
                }

                public String toString() {
                    return "CreateNewProjectTapped";
                }

                public int hashCode() {
                    return -1134966278;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$n, reason: collision with other inner class name */
            public static final class C0992n extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final C0992n f69553O = new C0992n();

                private C0992n() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0992n);
                }

                public String toString() {
                    return "GetStartedWithProjectTapped";
                }

                public int hashCode() {
                    return -435458341;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$n$w6 */
            public static final class w6 extends AbstractC0991n {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final w6 f69554O = new w6();

                private w6() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof w6);
                }

                public String toString() {
                    return "GetStartedWithTemplateTapped";
                }

                public int hashCode() {
                    return -1511254384;
                }
            }

            public /* synthetic */ AbstractC0991n(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0991n() {
                super(null);
            }
        }

        public static abstract class w6 extends OU {

            public static final class C extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69555O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C(String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.f69555O = pq.I28.n(pq.n.O("url", url));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69555O;
                }
            }

            public static final class CN3 extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final CN3 f69556O = new CN3();

                private CN3() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof CN3);
                }

                public String toString() {
                    return "SwipedDownToSeeNext";
                }

                public int hashCode() {
                    return -1610410310;
                }
            }

            public static final class Dsr extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69557O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Dsr(String url, boolean z2) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.f69557O = pq.I28.n(pq.n.O("url", url), pq.n.n("is_favorite", z2));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69557O;
                }
            }

            public static final class I28 extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final I28 f69558O = new I28();

                private I28() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof I28);
                }

                public String toString() {
                    return "SeeAllSavedTemplatesTapped";
                }

                public int hashCode() {
                    return -2036698095;
                }
            }

            public static final class Ml extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final Ml f69559O = new Ml();

                private Ml() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof Ml);
                }

                public String toString() {
                    return "PreviousButtonTapped";
                }

                public int hashCode() {
                    return -724309574;
                }
            }

            public static final class Wre extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69560O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Wre(String style, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(style, "style");
                    pq.Ml mlN = pq.I28.n(pq.n.O("style", style));
                    if (str != null) {
                        mlN.O("tag", str);
                    }
                    this.f69560O = mlN;
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69560O;
                }
            }

            public static final class aC extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private final pq.Ml f69561O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public aC(String url) {
                    super(null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.f69561O = pq.I28.n(pq.n.O("url", url));
                }

                @Override // jg.n
                public pq.Ml n() {
                    return this.f69561O;
                }
            }

            public static final class fuX extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final fuX f69562O = new fuX();

                private fuX() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof fuX);
                }

                public String toString() {
                    return "SwipedUpToSeePrevious";
                }

                public int hashCode() {
                    return -1875042779;
                }
            }

            public static final class j extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final j f69563O = new j();

                private j() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof j);
                }

                public String toString() {
                    return "BackButtonTapped";
                }

                public int hashCode() {
                    return 868349482;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$w6$n, reason: collision with other inner class name */
            public static final class C0993n extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final C0993n f69564O = new C0993n();

                private C0993n() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0993n);
                }

                public String toString() {
                    return "DismissedAfterWatchingLastVideo";
                }

                public int hashCode() {
                    return 661885882;
                }
            }

            /* JADX INFO: renamed from: jg.n$OU$w6$w6, reason: collision with other inner class name */
            public static final class C0994w6 extends w6 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public static final C0994w6 f69565O = new C0994w6();

                private C0994w6() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0994w6);
                }

                public String toString() {
                    return "NextButtonTapped";
                }

                public int hashCode() {
                    return 399690294;
                }
            }

            public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private w6() {
                super(null);
            }
        }

        public /* synthetic */ OU(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OU() {
            super(null);
        }
    }

    public static final class P extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69566O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(String projectId) {
            super(null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            pq.Ml ml = new pq.Ml();
            ml.O("project_id", projectId);
            this.f69566O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69566O;
        }
    }

    public static final class Pl extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Pl f69567O = new Pl();

        private Pl() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Pl);
        }

        public String toString() {
            return "CloudUploadFlowStarted";
        }

        public int hashCode() {
            return -400630222;
        }
    }

    public static final class Q extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69568O;

        public Q(Integer num) {
            String strN;
            super(null);
            pq.Ml ml = new pq.Ml();
            if (num != null && (strN = rWZ.j.n(num.intValue())) != null) {
                ml.O("export_format", strN);
            }
            this.f69568O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69568O;
        }
    }

    public static final class QJ extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69569O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QJ(String hook, String link) {
            super(null);
            Intrinsics.checkNotNullParameter(hook, "hook");
            Intrinsics.checkNotNullParameter(link, "link");
            pq.Ml ml = new pq.Ml();
            ml.O("hook", hook);
            ml.O("link", link);
            this.f69569O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69569O;
        }
    }

    public static final class SPz extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69570O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SPz(rWZ.n exportSnapshot) {
            super(null);
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f69570O = rWZ.w6.t(exportSnapshot, true);
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69570O;
        }
    }

    public static final class Sis extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69571O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sis(rWZ.Pl signInPopupType) {
            super(null);
            Intrinsics.checkNotNullParameter(signInPopupType, "signInPopupType");
            pq.Ml ml = new pq.Ml();
            ml.O("sign_in_popup_type", signInPopupType.rl());
            this.f69571O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69571O;
        }
    }

    public static final class UGc extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69572O;

        public UGc(Integer num) {
            String strN;
            super(null);
            pq.Ml ml = new pq.Ml();
            if (num != null && (strN = rWZ.j.n(num.intValue())) != null) {
                ml.O("export_format", strN);
            }
            this.f69572O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69572O;
        }
    }

    public static final class Wre extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Wre f69573O = new Wre();

        private Wre() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Wre);
        }

        public String toString() {
            return "CloudDownloadCancelled";
        }

        public int hashCode() {
            return 1514811689;
        }
    }

    public static final class Xo extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Xo f69574O = new Xo();

        private Xo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Xo);
        }

        public String toString() {
            return "CloudUploadMainButtonTapped";
        }

        public int hashCode() {
            return 1603593560;
        }
    }

    public static final class Z extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69575O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Z(String productId, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            pq.Ml ml = new pq.Ml();
            ml.O("product_id", productId);
            if (str != null) {
                ml.O("hook", str);
            }
            this.f69575O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69575O;
        }
    }

    public static final class Zs extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69576O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Zs(String projectId, int i2, int i3, int i5, String background) {
            super(null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(background, "background");
            pq.Ml ml = new pq.Ml();
            ml.O("project_id", projectId);
            ml.nr("project_width", Integer.valueOf(i2));
            ml.nr("project_height", Integer.valueOf(i3));
            ml.nr("frame_rate", Integer.valueOf(i5));
            ml.O("background", background);
            this.f69576O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69576O;
        }
    }

    public static final class aC extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final aC f69577O = new aC();

        private aC() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof aC);
        }

        public String toString() {
            return "CloudProjectDeleted";
        }

        public int hashCode() {
            return -1669130432;
        }
    }

    public static final class afx extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69578O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public afx(String exportPage) {
            super(null);
            Intrinsics.checkNotNullParameter(exportPage, "exportPage");
            pq.Ml ml = new pq.Ml();
            ml.O("export_page", exportPage);
            this.f69578O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69578O;
        }
    }

    /* JADX INFO: renamed from: jg.n$c, reason: case insensitive filesystem */
    public static final class C2198c extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69579O;

        public C2198c(Integer num) {
            String strN;
            super(null);
            pq.Ml ml = new pq.Ml();
            if (num != null && (strN = rWZ.j.n(num.intValue())) != null) {
                ml.O("export_format", strN);
            }
            this.f69579O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69579O;
        }
    }

    public static final class ci extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69580O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ci(rWZ.n exportSnapshot) {
            super(null);
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f69580O = rWZ.w6.t(exportSnapshot, true);
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69580O;
        }
    }

    public static final class eO extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69581O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eO(rWZ.eO requestTriggerPoint) {
            super(null);
            Intrinsics.checkNotNullParameter(requestTriggerPoint, "requestTriggerPoint");
            pq.Ml ml = new pq.Ml();
            ml.O("request_trigger_point", requestTriggerPoint.rl());
            this.f69581O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69581O;
        }
    }

    public static final class fuX extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final fuX f69582O = new fuX();

        private fuX() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof fuX);
        }

        public String toString() {
            return "CloudDownloadFlowStarted";
        }

        public int hashCode() {
            return 890648907;
        }
    }

    public static final class g9s extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final g9s f69583O = new g9s();

        private g9s() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g9s);
        }

        public String toString() {
            return "ExportUiCloseButtonTapped";
        }

        public int hashCode() {
            return 1446288537;
        }
    }

    public static final class h extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69584O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String hook, String ctaId) {
            super(null);
            Intrinsics.checkNotNullParameter(hook, "hook");
            Intrinsics.checkNotNullParameter(ctaId, "ctaId");
            pq.Ml ml = new pq.Ml();
            ml.O("hook", hook);
            ml.O("cta_id", ctaId);
            this.f69584O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69584O;
        }
    }

    public static final class iF extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final iF f69585O = new iF();

        private iF() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iF);
        }

        public String toString() {
            return "SignInCanceled";
        }

        public int hashCode() {
            return -1930158928;
        }
    }

    public static final class iwV extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69586O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iwV(String str, List availableProducts, boolean z2, EnumC1982eO enumC1982eO) {
            super(null);
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            pq.Ml ml = new pq.Ml();
            if (str != null) {
                ml.O("hook", str);
            }
            ml.O("available_products", CollectionsKt.joinToString$default(availableProducts, ",", null, null, 0, null, null, 62, null));
            ml.KN("with_back_button", z2);
            if (enumC1982eO != null) {
                ml.O("paywall_type", rWZ.j.J2(enumC1982eO));
            }
            this.f69586O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69586O;
        }
    }

    public static final class j extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69587O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i2, String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            pq.Ml ml = new pq.Ml();
            ml.nr("error_code", Integer.valueOf(i2));
            ml.O("message", message);
            this.f69587O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69587O;
        }
    }

    public static final class l3D extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69588O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3D(rWZ.n exportSnapshot, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            pq.Ml mlT = rWZ.w6.t(exportSnapshot, true);
            mlT.KN("qr_code_generation_error", z2);
            this.f69588O = mlT;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69588O;
        }
    }

    public static final class l4Z extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69589O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l4Z(rWZ.Pl signInPopupType) {
            super(null);
            Intrinsics.checkNotNullParameter(signInPopupType, "signInPopupType");
            pq.Ml ml = new pq.Ml();
            ml.O("sign_in_popup_type", signInPopupType.rl());
            this.f69589O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69589O;
        }
    }

    public static final class lej extends n {
        private final pq.Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final EnumC1982eO f69590O;

        public lej(EnumC1982eO enumC1982eO) {
            super(null);
            this.f69590O = enumC1982eO;
            pq.Ml ml = new pq.Ml();
            if (enumC1982eO != null) {
                ml.O("paywall_type", rWZ.j.J2(enumC1982eO));
            }
            this.J2 = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.J2;
        }
    }

    /* JADX INFO: renamed from: jg.n$m, reason: case insensitive filesystem */
    public static final class C2199m extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69591O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2199m(rWZ.Xo signInPosition) {
            super(null);
            Intrinsics.checkNotNullParameter(signInPosition, "signInPosition");
            pq.Ml ml = new pq.Ml();
            ml.O("position", signInPosition.rl());
            this.f69591O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69591O;
        }
    }

    public static final class mz extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final mz f69592O = new mz();

        private mz() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof mz);
        }

        public String toString() {
            return "SignInStarted";
        }

        public int hashCode() {
            return 122734986;
        }
    }

    /* JADX INFO: renamed from: jg.n$n, reason: collision with other inner class name */
    public static final class C0995n extends n {
        public C0995n() {
            super(null);
        }
    }

    public static final class nKK extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69593O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nKK(String productId, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            pq.Ml ml = new pq.Ml();
            ml.O("product_id", productId);
            if (str != null) {
                ml.O("hook", str);
            }
            this.f69593O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69593O;
        }
    }

    public static final class o extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69594O;

        public o(boolean z2) {
            super(null);
            pq.Ml ml = new pq.Ml();
            ml.KN("is_project_overridden", z2);
            this.f69594O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69594O;
        }
    }

    public static final class pO extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69595O;

        public pO(String str, Exception exc) {
            String message;
            super(null);
            pq.Ml ml = new pq.Ml();
            if (str != null) {
                ml.O("provider", str);
            }
            ml.O("error_info", (exc == null || (message = exc.getMessage()) == null) ? "Unknown" : message);
            this.f69595O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69595O;
        }
    }

    public static final class psW extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69596O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public psW(String hook) {
            super(null);
            Intrinsics.checkNotNullParameter(hook, "hook");
            pq.Ml ml = new pq.Ml();
            ml.O("hook", hook);
            this.f69596O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69596O;
        }
    }

    public static final class qf extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final qf f69597O = new qf();

        private qf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof qf);
        }

        public String toString() {
            return "OnboardingStarted";
        }

        public int hashCode() {
            return 1962789777;
        }
    }

    public static final class qz extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69598O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qz(String errorKind) {
            super(null);
            Intrinsics.checkNotNullParameter(errorKind, "errorKind");
            pq.Ml ml = new pq.Ml();
            ml.O("error_kind", errorKind);
            this.f69598O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69598O;
        }
    }

    public static final class r extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69599O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(rWZ.n exportSnapshot) {
            super(null);
            Intrinsics.checkNotNullParameter(exportSnapshot, "exportSnapshot");
            this.f69599O = rWZ.w6.t(exportSnapshot, true);
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69599O;
        }
    }

    public static final class rv6 extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69600O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rv6(String str, List availableProducts, EnumC1982eO enumC1982eO) {
            super(null);
            Intrinsics.checkNotNullParameter(availableProducts, "availableProducts");
            pq.Ml ml = new pq.Ml();
            if (str != null) {
                ml.O("hook", str);
            }
            ml.J2("available_products", rWZ.j.mUb(availableProducts));
            if (enumC1982eO != null) {
                ml.O("paywall_type", rWZ.j.J2(enumC1982eO));
            }
            this.f69600O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69600O;
        }
    }

    public static final class s4 extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69601O;

        public s4(Integer num) {
            String strN;
            super(null);
            pq.Ml ml = new pq.Ml();
            if (num != null && (strN = rWZ.j.n(num.intValue())) != null) {
                ml.O("export_format", strN);
            }
            this.f69601O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69601O;
        }
    }

    public static final class u extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final u f69602O = new u();

        private u() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public String toString() {
            return "OnboardingSkipped";
        }

        public int hashCode() {
            return 1712452160;
        }
    }

    public static final class vd extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final vd f69603O = new vd();

        private vd() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof vd);
        }

        public String toString() {
            return "PlayfulUnlockFtGameStarted";
        }

        public int hashCode() {
            return 583678921;
        }
    }

    public static final class w6 extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f69604O = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "AppSetupCompleted";
        }

        public int hashCode() {
            return 266665594;
        }
    }

    public static final class yg extends n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final pq.Ml f69605O;

        public yg(String str) {
            super(null);
            pq.Ml ml = new pq.Ml();
            if (str != null) {
                ml.O("provider", str);
            }
            this.f69605O = ml;
        }

        @Override // jg.n
        public pq.Ml n() {
            return this.f69605O;
        }
    }

    /* JADX INFO: renamed from: jg.n$z, reason: case insensitive filesystem */
    public static final class C2200z {
        public /* synthetic */ C2200z(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2200z() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
        this.f69522n = jg.w6.n(this);
        this.rl = new pq.Ml();
    }

    public pq.Ml n() {
        return this.rl;
    }

    public String rl() {
        return this.f69522n;
    }
}
