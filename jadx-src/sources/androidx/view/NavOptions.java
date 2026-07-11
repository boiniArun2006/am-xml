package androidx.view;

import XA.r;
import androidx.view.serialization.RouteSerializerKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001:\u00013B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b#\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b%\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b&\u0010 R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b)\u0010 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b*\u0010\"R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b+\u00100R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b,\u00102¨\u00064"}, d2 = {"Landroidx/navigation/NavOptions;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Lkotlin/reflect/KClass;", "popUpToRouteClass", "(ZZLkotlin/reflect/KClass;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "mUb", "()Z", "qie", "xMQ", "gh", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", c.f62177j, "Z", "rl", "t", "I", "O", "nr", "J2", "Uo", "KN", "<set-?>", "Ljava/lang/String;", "Lkotlin/reflect/KClass;", "()Lkotlin/reflect/KClass;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavOptions {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int enterAnim;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final int popEnterAnim;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToSaveState;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final int exitAnim;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private KClass popUpToRouteClass;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private String popUpToRoute;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean singleTop;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean popUpToInclusive;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private Object popUpToRouteObject;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean restoreState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int popUpToId;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final int popExitAnim;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u00020\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001dJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001c\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010(¨\u00063"}, d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "<init>", "()V", "", "singleTop", "nr", "(Z)Landroidx/navigation/NavOptions$Builder;", "restoreState", "qie", "", "destinationId", "inclusive", "saveState", "Uo", "(IZZ)Landroidx/navigation/NavOptions$Builder;", "", "route", "xMQ", "(Ljava/lang/String;ZZ)Landroidx/navigation/NavOptions$Builder;", "Lkotlin/reflect/KClass;", "klass", "mUb", "(Lkotlin/reflect/KClass;ZZ)Landroidx/navigation/NavOptions$Builder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "KN", "(Ljava/lang/Object;ZZ)Landroidx/navigation/NavOptions$Builder;", "enterAnim", "rl", "(I)Landroidx/navigation/NavOptions$Builder;", "exitAnim", "t", "popEnterAnim", "O", "popExitAnim", "J2", "Landroidx/navigation/NavOptions;", c.f62177j, "()Landroidx/navigation/NavOptions;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "Lkotlin/reflect/KClass;", "popUpToRouteClass", "Ljava/lang/Object;", "popUpToRouteObject", "popUpToInclusive", "popUpToSaveState", "gh", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n1#1,594:1\n430#1,6:595\n*S KotlinDebug\n*F\n+ 1 NavOptions.kt\nandroidx/navigation/NavOptions$Builder\n*L\n-1#1:595,6\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private Object popUpToRouteObject;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private boolean popUpToSaveState;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private KClass popUpToRouteClass;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private boolean popUpToInclusive;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean singleTop;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private String popUpToRoute;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private boolean restoreState;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private int popUpToId = -1;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private int enterAnim = -1;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private int exitAnim = -1;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private int popEnterAnim = -1;

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private int popExitAnim = -1;

        public static /* synthetic */ Builder gh(Builder builder, int i2, boolean z2, boolean z3, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                z3 = false;
            }
            return builder.Uo(i2, z2, z3);
        }

        public final Builder J2(int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        public final Builder KN(Object route, boolean inclusive, boolean saveState) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.popUpToRouteObject = route;
            Uo(RouteSerializerKt.Uo(r.t(Reflection.getOrCreateKotlinClass(route.getClass()))), inclusive, saveState);
            return this;
        }

        public final Builder O(int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        public final Builder Uo(int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final Builder mUb(KClass klass, boolean inclusive, boolean saveState) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.popUpToRouteClass = klass;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final NavOptions n() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            KClass kClass = this.popUpToRouteClass;
            if (kClass != null) {
                return new NavOptions(this.singleTop, this.restoreState, kClass, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj == null) {
                return new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z2 = this.singleTop;
            boolean z3 = this.restoreState;
            Intrinsics.checkNotNull(obj);
            return new NavOptions(z2, z3, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final Builder nr(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        public final Builder qie(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }

        public final Builder rl(int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        public final Builder t(int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        public final Builder xMQ(String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }
    }

    public NavOptions(boolean z2, boolean z3, int i2, boolean z4, boolean z5, int i3, int i5, int i7, int i8) {
        this.singleTop = z2;
        this.restoreState = z3;
        this.popUpToId = i2;
        this.popUpToInclusive = z4;
        this.popUpToSaveState = z5;
        this.enterAnim = i3;
        this.exitAnim = i5;
        this.popEnterAnim = i7;
        this.popExitAnim = i8;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavOptions)) {
            NavOptions navOptions = (NavOptions) other;
            if (this.singleTop == navOptions.singleTop && this.restoreState == navOptions.restoreState && this.popUpToId == navOptions.popUpToId && Intrinsics.areEqual(this.popUpToRoute, navOptions.popUpToRoute) && Intrinsics.areEqual(this.popUpToRouteClass, navOptions.popUpToRouteClass) && Intrinsics.areEqual(this.popUpToRouteObject, navOptions.popUpToRouteObject) && this.popUpToInclusive == navOptions.popUpToInclusive && this.popUpToSaveState == navOptions.popUpToSaveState && this.enterAnim == navOptions.enterAnim && this.exitAnim == navOptions.exitAnim && this.popEnterAnim == navOptions.popEnterAnim && this.popExitAnim == navOptions.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final KClass getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getExitAnim() {
        return this.exitAnim;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavOptions.class.getSimpleName());
        sb.append("(");
        if (this.singleTop) {
            sb.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb.append(str2);
            } else {
                KClass kClass = this.popUpToRouteClass;
                if (kClass != null) {
                    sb.append(kClass);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb.append(obj);
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(this.enterAnim));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.exitAnim));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.popEnterAnim));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.popExitAnim));
            sb.append(")");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = (((((getSingleTop() ? 1 : 0) * 31) + (getRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode3 = 0;
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int i3 = (i2 + iHashCode) * 31;
        KClass kClass = this.popUpToRouteClass;
        if (kClass != null) {
            iHashCode2 = kClass.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i5 = (i3 + iHashCode2) * 31;
        Object obj = this.popUpToRouteObject;
        if (obj != null) {
            iHashCode3 = obj.hashCode();
        }
        return ((((((((((((i5 + iHashCode3) * 31) + (getPopUpToInclusive() ? 1 : 0)) * 31) + (getPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    public NavOptions(boolean z2, boolean z3, String str, boolean z4, boolean z5, int i2, int i3, int i5, int i7) {
        this(z2, z3, NavDestination.INSTANCE.n(str).hashCode(), z4, z5, i2, i3, i5, i7);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z2, boolean z3, KClass kClass, boolean z4, boolean z5, int i2, int i3, int i5, int i7) {
        this(z2, z3, RouteSerializerKt.Uo(r.t(kClass)), z4, z5, i2, i3, i5, i7);
        Intrinsics.checkNotNull(kClass);
        this.popUpToRouteClass = kClass;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavOptions(boolean z2, boolean z3, Object popUpToRouteObject, boolean z4, boolean z5, int i2, int i3, int i5, int i7) {
        this(z2, z3, RouteSerializerKt.Uo(r.t(Reflection.getOrCreateKotlinClass(popUpToRouteObject.getClass()))), z4, z5, i2, i3, i5, i7);
        Intrinsics.checkNotNullParameter(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}
