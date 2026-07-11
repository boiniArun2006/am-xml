package androidx.view;

import XA.Ml;
import XA.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.view.NavDestination;
import androidx.view.common.R;
import androidx.view.serialization.RouteSerializerKt;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 82\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001YB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J9\u0010%\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010!\u001a\u00020 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010.H\u0086\u0002¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020 ¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020'¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u000b\"\b\b\u0000\u0010%*\u0002072\u0006\u00104\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J7\u0010>\u001a\u00020\u000b\"\u0004\b\u0000\u0010%2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020'0<H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020'H\u0016¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u000107H\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020 H\u0016¢\u0006\u0004\bE\u0010FR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010G8G¢\u0006\f\n\u0004\b%\u0010H\u001a\u0004\bI\u0010JR\u0016\u00101\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR.\u0010Q\u001a\u0004\u0018\u00010'2\b\u00104\u001a\u0004\u0018\u00010'8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010N\u001a\u0004\bM\u0010A\"\u0004\bP\u00106R$\u0010T\u001a\u00020 2\u0006\u00101\u001a\u00020 8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010F\"\u0004\bS\u00103R\u0014\u0010V\u001a\u00020'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010AR\u0011\u0010X\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\bW\u0010A¨\u0006Z"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "S", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "", "searchChildren", "searchParent", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "rV9", "(Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "o", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "node", "iF", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "fD", "(Ljava/util/Collection;)V", "", "resId", "E2", "(I)Landroidx/navigation/NavDestination;", "matchingDest", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "", "route", "e", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "searchParents", "X", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "startDestId", "bzg", "(I)V", "startDestRoute", "U", "(Ljava/lang/String;)V", "", "jB", "(Ljava/lang/Object;)V", "LXA/Ml;", "serializer", "Lkotlin/Function1;", "parseRoute", "Xw", "(LXA/Ml;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "nHg", "()Landroidx/collection/SparseArrayCompat;", "N", "I", "v", "Ljava/lang/String;", "startDestIdName", "M7", "startDestinationRoute", "wTp", "P5", "startDestinationId", "qie", "displayName", "s7N", "startDestDisplayName", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,677:1\n232#2,3:678\n1603#3,9:681\n1855#3:690\n1856#3:692\n1612#3:693\n1603#3,9:694\n1855#3:703\n1856#3:705\n1612#3:706\n1#4:691\n1#4:704\n1#4:707\n179#5,2:708\n1224#5,2:711\n22#6:710\n62#6,4:713\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n61#1:678,3\n84#1:681,9\n84#1:690\n84#1:692\n84#1:693\n129#1:694,9\n129#1:703\n129#1:705\n129#1:706\n84#1:691\n129#1:704\n322#1:708,2\n561#1:711,2\n559#1:710\n566#1:713,4\n*E\n"})
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int startDestId;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final SparseArrayCompat nodes;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private String startDestinationRoute;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private String startDestIdName;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "<init>", "()V", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "rl", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDestination;", "Lkotlin/sequences/Sequence;", c.f62177j, "(Landroidx/navigation/NavGraph;)Lkotlin/sequences/Sequence;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Sequence n(NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "<this>");
            return SequencesKt.generateSequence(navGraph, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$childHierarchy$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(NavDestination it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (!(it instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) it;
                    return navGraph2.E2(navGraph2.getStartDestId());
                }
            });
        }

        public final NavDestination rl(NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "<this>");
            return (NavDestination) SequencesKt.last(n(navGraph));
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavGraph$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/navigation/NavGraph$iterator$1", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "()Z", "t", "()Landroidx/navigation/NavDestination;", "", "remove", "()V", "", c.f62177j, "I", "index", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,677:1\n1#2:678\n*E\n"})
    public static final class AnonymousClass1 implements Iterator<NavDestination>, KMutableIterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean wentToNext;

        AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < NavGraph.this.getNodes().ck();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            SparseArrayCompat nodes = NavGraph.this.getNodes();
            ((NavDestination) nodes.Ik(this.index)).nY(null);
            nodes.ty(this.index);
            this.index--;
            this.wentToNext = false;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavDestination next() {
            if (hasNext()) {
                this.wentToNext = true;
                SparseArrayCompat nodes = NavGraph.this.getNodes();
                int i2 = this.index + 1;
                this.index = i2;
                return (NavDestination) nodes.Ik(i2);
            }
            throw new NoSuchElementException();
        }
    }

    @Override // androidx.view.NavDestination
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavGraph) && super.equals(other)) {
            NavGraph navGraph = (NavGraph) other;
            if (this.nodes.ck() == navGraph.nodes.ck() && getStartDestId() == navGraph.getStartDestId()) {
                for (NavDestination navDestination : SequencesKt.asSequence(SparseArrayKt.rl(this.nodes))) {
                    if (!Intrinsics.areEqual(navDestination, navGraph.nodes.O(navDestination.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.nodes = new SparseArrayCompat(0, 1, null);
    }

    private final void M7(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (Intrinsics.areEqual(str, getRoute())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = NavDestination.INSTANCE.n(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public static /* synthetic */ NavDestination N(NavGraph navGraph, int i2, NavDestination navDestination, boolean z2, NavDestination navDestination2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i3 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.T(i2, navDestination, z2, navDestination2);
    }

    public final NavDestination E2(int resId) {
        return N(this, resId, this, false, null, 8, null);
    }

    @Override // androidx.view.NavDestination
    public void S(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.S(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.f40182S);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        P5(typedArrayObtainAttributes.getResourceId(R.styleable.WPU, 0));
        this.startDestIdName = NavDestination.INSTANCE.rl(context, this.startDestId);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final NavDestination T(int resId, NavDestination lastVisited, boolean searchChildren, NavDestination matchingDest) {
        NavDestination navDestination = (NavDestination) this.nodes.O(resId);
        if (matchingDest != null) {
            if (Intrinsics.areEqual(navDestination, matchingDest) && Intrinsics.areEqual(navDestination.getParent(), matchingDest.getParent())) {
                return navDestination;
            }
            navDestination = null;
        } else if (navDestination != null) {
            return navDestination;
        }
        if (searchChildren) {
            Iterator it = SequencesKt.asSequence(SparseArrayKt.rl(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination = null;
                    break;
                }
                NavDestination navDestination2 = (NavDestination) it.next();
                NavDestination navDestinationT = (!(navDestination2 instanceof NavGraph) || Intrinsics.areEqual(navDestination2, lastVisited)) ? null : ((NavGraph) navDestination2).T(resId, this, true, matchingDest);
                if (navDestinationT != null) {
                    navDestination = navDestinationT;
                    break;
                }
            }
        }
        if (navDestination != null) {
            return navDestination;
        }
        if (getParent() == null || Intrinsics.areEqual(getParent(), lastVisited)) {
            return null;
        }
        NavGraph parent = getParent();
        Intrinsics.checkNotNull(parent);
        return parent.T(resId, this, searchChildren, matchingDest);
    }

    public final void U(String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        M7(startDestRoute);
    }

    public final NavDestination X(String route, boolean searchParents) {
        Object next;
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator it = SequencesKt.asSequence(SparseArrayKt.rl(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NavDestination navDestination = (NavDestination) next;
            if (StringsKt.equals$default(navDestination.getRoute(), route, false, 2, null) || navDestination.XQ(route) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        Intrinsics.checkNotNull(parent);
        return parent.e(route);
    }

    public final void Xw(Ml serializer, Function1 parseRoute) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(parseRoute, "parseRoute");
        int iUo = RouteSerializerKt.Uo(serializer);
        NavDestination navDestinationE2 = E2(iUo);
        if (navDestinationE2 != null) {
            M7((String) parseRoute.invoke(navDestinationE2));
            this.startDestId = iUo;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().KN() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    public final NavDestination e(String route) {
        if (route == null || StringsKt.isBlank(route)) {
            return null;
        }
        return X(route, true);
    }

    public final void fD(Collection nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            NavDestination navDestination = (NavDestination) it.next();
            if (navDestination != null) {
                iF(navDestination);
            }
        }
    }

    public final void iF(NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int id = node.getId();
        String route = node.getRoute();
        if (id == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getRoute() != null && Intrinsics.areEqual(route, getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id == getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestination = (NavDestination) this.nodes.O(id);
        if (navDestination == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination != null) {
            navDestination.nY(null);
        }
        node.nY(this);
        this.nodes.az(node.getId(), node);
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new AnonymousClass1();
    }

    public final void jB(final Object startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        Xw(r.t(Reflection.getOrCreateKotlinClass(startDestRoute.getClass())), new Function1<NavDestination, String>() { // from class: androidx.navigation.NavGraph$setStartDestination$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final String invoke(NavDestination startDestination) {
                Intrinsics.checkNotNullParameter(startDestination, "startDestination");
                Map mapGh = startDestination.gh();
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapGh.size()));
                for (Map.Entry entry : mapGh.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
                }
                return RouteSerializerKt.gh(startDestRoute, linkedHashMap);
            }
        });
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final SparseArrayCompat getNodes() {
        return this.nodes;
    }

    @Override // androidx.view.NavDestination
    public NavDestination.DeepLinkMatch o(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return rV9(navDeepLinkRequest, true, false, this);
    }

    public final NavDestination.DeepLinkMatch rV9(NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchO = super.o(navDeepLinkRequest);
        NavDestination.DeepLinkMatch deepLinkMatchRV9 = null;
        if (searchChildren) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                NavDestination.DeepLinkMatch deepLinkMatchO2 = !Intrinsics.areEqual(navDestination, lastVisited) ? navDestination.o(navDeepLinkRequest) : null;
                if (deepLinkMatchO2 != null) {
                    arrayList.add(deepLinkMatchO2);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = getParent();
        if (parent != null && searchParent && !Intrinsics.areEqual(parent, lastVisited)) {
            deepLinkMatchRV9 = parent.rV9(navDeepLinkRequest, searchChildren, true, this);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((Iterable) CollectionsKt.listOfNotNull((Object[]) new NavDestination.DeepLinkMatch[]{deepLinkMatchO, deepLinkMatch, deepLinkMatchRV9}));
    }

    public final String s7N() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Override // androidx.view.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination navDestinationE = e(this.startDestinationRoute);
        if (navDestinationE == null) {
            navDestinationE = E2(getStartDestId());
        }
        sb.append(" startDestination=");
        if (navDestinationE == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb.append("{");
            sb.append(navDestinationE.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    /* JADX INFO: renamed from: wTp, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    private final void P5(int i2) {
        if (i2 != getId()) {
            if (this.startDestinationRoute != null) {
                M7(null);
            }
            this.startDestId = i2;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i2 + " cannot use the same id as the graph " + this).toString());
    }

    public final void bzg(int startDestId) {
        P5(startDestId);
    }

    @Override // androidx.view.NavDestination
    public int hashCode() {
        int startDestId = getStartDestId();
        SparseArrayCompat sparseArrayCompat = this.nodes;
        int iCk = sparseArrayCompat.ck();
        for (int i2 = 0; i2 < iCk; i2++) {
            startDestId = (((startDestId * 31) + sparseArrayCompat.qie(i2)) * 31) + ((NavDestination) sparseArrayCompat.Ik(i2)).hashCode();
        }
        return startDestId;
    }

    @Override // androidx.view.NavDestination
    public String qie() {
        if (getId() != 0) {
            return super.qie();
        }
        return "the root navigation";
    }
}
