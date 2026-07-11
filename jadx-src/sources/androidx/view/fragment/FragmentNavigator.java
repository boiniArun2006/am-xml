package androidx.view.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleObserver;
import androidx.view.LifecycleOwner;
import androidx.view.NavBackStackEntry;
import androidx.view.NavDestination;
import androidx.view.NavOptions;
import androidx.view.Navigator;
import androidx.view.NavigatorState;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.fragment.FragmentNavigator;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.InitializerViewModelFactoryBuilder;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Navigator.Name("fragment")
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004QRSTB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J1\u00103\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010,\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR,\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0F0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010LR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020K0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010O¨\u0006U"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "ViF", "(I)Z", "Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/fragment/app/Fragment;", "fragment", "", "Z", "(Landroidx/navigation/NavBackStackEntry;Landroidx/fragment/app/Fragment;)V", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "nY", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/fragment/app/FragmentTransaction;", "S", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavOptions;)Landroidx/fragment/app/FragmentTransaction;", "", "id", "isPop", "deduplicate", "Ik", "(Ljava/lang/String;ZZ)V", "Landroidx/navigation/NavigatorState;", "state", "J2", "(Landroidx/navigation/NavigatorState;)V", "o", "(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavigatorState;)V", "popUpTo", "savedState", "mUb", "(Landroidx/navigation/NavBackStackEntry;Z)V", "XQ", "()Landroidx/navigation/fragment/FragmentNavigator$Destination;", "", IV8ValueMap.FUNCTION_ENTRIES, "O", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "Uo", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Bundle;", "xMQ", "()Landroid/os/Bundle;", "KN", "(Landroid/os/Bundle;)V", "t", "Landroid/content/Context;", "nr", "Landroidx/fragment/app/FragmentManager;", "I", "", "Ljava/util/Set;", "savedIds", "", "Lkotlin/Pair;", "Ljava/util/List;", "aYN", "()Ljava/util/List;", "pendingOps", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "fragmentObserver", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "fragmentViewObserver", "ClearEntryStateViewModel", "Companion", "Destination", "Extras", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n31#2:713\n63#2,2:714\n766#3:716\n857#3,2:717\n1855#3,2:719\n518#3,7:721\n533#3,6:728\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n*E\n"})
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion mUb = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Set savedIds;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final LifecycleEventObserver fragmentObserver;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final List pendingOps;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Function1 fragmentViewObserver;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onCleared", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", c.f62177j, "Ljava/lang/ref/WeakReference;", "rl", "()Ljava/lang/ref/WeakReference;", "t", "(Ljava/lang/ref/WeakReference;)V", "completeTransition", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClearEntryStateViewModel extends ViewModel {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public WeakReference completeTransition;

        public final WeakReference rl() {
            WeakReference weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }

        public final void t(WeakReference weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.completeTransition = weakReference;
        }

        @Override // androidx.view.ViewModel
        protected void onCleared() {
            super.onCleared();
            Function0 function0 = (Function0) rl().get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "()V", "KEY_SAVED_IDS", "", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "S", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "fD", "(Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$Destination;", "toString", "()Ljava/lang/String;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/String;", "_className", "iF", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @NavDestination.ClassType
    @SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n232#2,3:713\n1#3:716\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n570#1:713,3\n*E\n"})
    public static class Destination extends NavDestination {

        /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
        private String _className;

        @Override // androidx.view.NavDestination
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return other != null && (other instanceof Destination) && super.equals(other) && Intrinsics.areEqual(this._className, ((Destination) other)._className);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator fragmentNavigator) {
            super(fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.view.NavDestination
        public void S(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.S(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.f40441t);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(R.styleable.nr);
            if (string != null) {
                fD(string);
            }
            Unit unit = Unit.INSTANCE;
            typedArrayObtainAttributes.recycle();
        }

        public final Destination fD(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this._className = className;
            return this;
        }

        public final String iF() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @Override // androidx.view.NavDestination
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this._className;
            if (str == null) {
                sb.append(V8ValueNull.NULL);
            } else {
                sb.append(str);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        @Override // androidx.view.NavDestination
        public int hashCode() {
            int iHashCode;
            int iHashCode2 = super.hashCode() * 31;
            String str = this._className;
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            return iHashCode2 + iHashCode;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fR0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", c.f62177j, "Ljava/util/LinkedHashMap;", "_sharedElements", "", "()Ljava/util/Map;", "sharedElements", "Builder", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final LinkedHashMap _sharedElements;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
        }

        public final Map n() {
            return MapsKt.toMap(this._sharedElements);
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i2;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.w6
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentNavigator.WPU(this.f40446n, lifecycleOwner, event);
            }
        };
        this.fragmentViewObserver = new FragmentNavigator$fragmentViewObserver$1(this);
    }

    private final void Ik(final String id, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            CollectionsKt.removeAll(this.pendingOps, (Function1) new Function1<Pair<? extends String, ? extends Boolean>, Boolean>() { // from class: androidx.navigation.fragment.FragmentNavigator$addPendingOps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Pair it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(it.getFirst(), id));
                }
            });
        }
        this.pendingOps.add(TuplesKt.to(id, Boolean.valueOf(isPop)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ViF(int level) {
        return Log.isLoggable("FragmentManager", level) || Log.isLoggable("FragmentNavigator", level);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WPU(FragmentNavigator this$0, LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : (Iterable) this$0.rl().getTransitionsInProgress().getValue()) {
                if (Intrinsics.areEqual(((NavBackStackEntry) obj2).getId(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (this$0.ViF(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.rl().O(navBackStackEntry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(NavigatorState state, FragmentNavigator this$0, FragmentManager fragmentManager, Fragment fragment) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List list = (List) state.getBackStack().getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (Intrinsics.areEqual(((NavBackStackEntry) objPrevious).getId(), fragment.getTag())) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (this$0.ViF(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + navBackStackEntry + " to FragmentManager " + this$0.fragmentManager);
        }
        if (navBackStackEntry != null) {
            this$0.Z(navBackStackEntry, fragment);
            this$0.o(fragment, navBackStackEntry, state);
        }
    }

    static /* synthetic */ void r(FragmentNavigator fragmentNavigator, String str, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        fragmentNavigator.Ik(str, z2, z3);
    }

    @Override // androidx.view.Navigator
    public void J2(final NavigatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.J2(state);
        if (ViF(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.fragmentManager.az(new FragmentOnAttachListener() { // from class: androidx.navigation.fragment.n
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void n(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.g(state, this, fragmentManager, fragment);
            }
        });
        this.fragmentManager.ty(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.navigation.fragment.FragmentNavigator$onAttach$2
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void O() {
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void rl(Fragment fragment, boolean pop) {
                Object obj;
                Object objPrevious;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                List listPlus = CollectionsKt.plus((Collection) state.getBackStack().getValue(), (Iterable) state.getTransitionsInProgress().getValue());
                ListIterator listIterator = listPlus.listIterator(listPlus.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) objPrevious).getId(), fragment.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                boolean z2 = pop && this.getPendingOps().isEmpty() && fragment.isRemoving();
                Iterator it = this.getPendingOps().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((Pair) next).getFirst(), fragment.getTag())) {
                        obj = next;
                        break;
                    }
                }
                Pair pair = (Pair) obj;
                if (pair != null) {
                    this.getPendingOps().remove(pair);
                }
                if (!z2 && this.ViF(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                }
                boolean z3 = pair != null && ((Boolean) pair.getSecond()).booleanValue();
                if (!pop && !z3 && navBackStackEntry == null) {
                    throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                }
                if (navBackStackEntry != null) {
                    this.o(fragment, navBackStackEntry, state);
                    if (z2) {
                        if (this.ViF(2)) {
                            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + navBackStackEntry + " via system back");
                        }
                        state.xMQ(navBackStackEntry, false);
                    }
                }
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public void t(Fragment fragment, boolean pop) {
                Object objPrevious;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (pop) {
                    List list = (List) state.getBackStack().getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        } else {
                            objPrevious = listIterator.previous();
                            if (Intrinsics.areEqual(((NavBackStackEntry) objPrevious).getId(), fragment.getTag())) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                    if (this.ViF(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                    }
                    if (navBackStackEntry != null) {
                        state.mUb(navBackStackEntry);
                    }
                }
            }
        });
    }

    @Override // androidx.view.Navigator
    public void KN(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.savedIds.clear();
            CollectionsKt.addAll(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.view.Navigator
    public void O(List entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.fragmentManager.p0N()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            nY((NavBackStackEntry) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // androidx.view.Navigator
    public void Uo(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.fragmentManager.p0N()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransactionS = S(backStackEntry, null);
        List list = (List) rl().getBackStack().getValue();
        if (list.size() > 1) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.getOrNull(list, CollectionsKt.getLastIndex(list) - 1);
            if (navBackStackEntry != null) {
                r(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            r(this, backStackEntry.getId(), true, false, 4, null);
            this.fragmentManager.EF(backStackEntry.getId(), 1);
            r(this, backStackEntry.getId(), false, false, 2, null);
            fragmentTransactionS.KN(backStackEntry.getId());
        }
        fragmentTransactionS.mUb();
        rl().J2(backStackEntry);
    }

    @Override // androidx.view.Navigator
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public Destination n() {
        return new Destination(this);
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final List getPendingOps() {
        return this.pendingOps;
    }

    @Override // androidx.view.Navigator
    public void mUb(NavBackStackEntry popUpTo, boolean savedState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        if (this.fragmentManager.p0N()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) rl().getBackStack().getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.first(list);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.getOrNull(list, iIndexOf - 1);
        if (navBackStackEntry2 != null) {
            r(this, navBackStackEntry2.getId(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
            if (SequencesKt.contains(SequencesKt.map(CollectionsKt.asSequence(this.pendingOps), new Function1<Pair<? extends String, ? extends Boolean>, String>() { // from class: androidx.navigation.fragment.FragmentNavigator$popBackStack$1$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final String invoke(Pair it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (String) it.getFirst();
                }
            }), navBackStackEntry3.getId()) || !Intrinsics.areEqual(navBackStackEntry3.getId(), navBackStackEntry.getId())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r(this, ((NavBackStackEntry) it.next()).getId(), true, false, 4, null);
        }
        if (savedState) {
            for (NavBackStackEntry navBackStackEntry4 : CollectionsKt.reversed(listSubList)) {
                if (Intrinsics.areEqual(navBackStackEntry4, navBackStackEntry)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry4);
                } else {
                    this.fragmentManager.xzo(navBackStackEntry4.getId());
                    this.savedIds.add(navBackStackEntry4.getId());
                }
            }
        } else {
            this.fragmentManager.EF(popUpTo.getId(), 1);
        }
        if (ViF(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + savedState);
        }
        rl().xMQ(popUpTo, savedState);
    }

    public final void o(final Fragment fragment, final NavBackStackEntry entry, final NavigatorState state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "fragment.viewModelStore");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.n(Reflection.getOrCreateKotlinClass(ClearEntryStateViewModel.class), new Function1<CreationExtras, ClearEntryStateViewModel>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$viewModel$1$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final FragmentNavigator.ClearEntryStateViewModel invoke(CreationExtras initializer) {
                Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
                return new FragmentNavigator.ClearEntryStateViewModel();
            }
        });
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, initializerViewModelFactoryBuilder.rl(), CreationExtras.Empty.f39070t).n(ClearEntryStateViewModel.class)).t(new WeakReference(new Function0<Unit>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NavigatorState navigatorState = state;
                FragmentNavigator fragmentNavigator = this;
                Fragment fragment2 = fragment;
                for (NavBackStackEntry navBackStackEntry : (Iterable) navigatorState.getTransitionsInProgress().getValue()) {
                    if (fragmentNavigator.ViF(2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + fragment2 + " viewmodel being cleared");
                    }
                    navigatorState.O(navBackStackEntry);
                }
            }
        }));
    }

    @Override // androidx.view.Navigator
    public Bundle xMQ() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.n(TuplesKt.to("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.savedIds)));
    }

    private final FragmentTransaction S(NavBackStackEntry entry, NavOptions navOptions) {
        int enterAnim;
        int exitAnim;
        int popEnterAnim;
        int popExitAnim;
        NavDestination destination = entry.getDestination();
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleT = entry.t();
        String strIF = ((Destination) destination).iF();
        int i2 = 0;
        if (strIF.charAt(0) == '.') {
            strIF = this.context.getPackageName() + strIF;
        }
        Fragment fragmentN = this.fragmentManager.HV().n(this.context.getClassLoader(), strIF);
        Intrinsics.checkNotNullExpressionValue(fragmentN, "fragmentManager.fragment…t.classLoader, className)");
        fragmentN.setArguments(bundleT);
        FragmentTransaction fragmentTransactionO = this.fragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "fragmentManager.beginTransaction()");
        if (navOptions != null) {
            enterAnim = navOptions.getEnterAnim();
        } else {
            enterAnim = -1;
        }
        if (navOptions != null) {
            exitAnim = navOptions.getExitAnim();
        } else {
            exitAnim = -1;
        }
        if (navOptions != null) {
            popEnterAnim = navOptions.getPopEnterAnim();
        } else {
            popEnterAnim = -1;
        }
        if (navOptions != null) {
            popExitAnim = navOptions.getPopExitAnim();
        } else {
            popExitAnim = -1;
        }
        if (enterAnim != -1 || exitAnim != -1 || popEnterAnim != -1 || popExitAnim != -1) {
            if (enterAnim == -1) {
                enterAnim = 0;
            }
            if (exitAnim == -1) {
                exitAnim = 0;
            }
            if (popEnterAnim == -1) {
                popEnterAnim = 0;
            }
            if (popExitAnim != -1) {
                i2 = popExitAnim;
            }
            fragmentTransactionO.WPU(enterAnim, exitAnim, popEnterAnim, i2);
        }
        fragmentTransactionO.Z(this.containerId, fragmentN, entry.getId());
        fragmentTransactionO.ViF(fragmentN);
        fragmentTransactionO.nY(true);
        return fragmentTransactionO;
    }

    private final void Z(final NavBackStackEntry entry, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().mUb(fragment, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new Function1<LifecycleOwner, Unit>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachObservers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
                n(lifecycleOwner);
                return Unit.INSTANCE;
            }

            public final void n(LifecycleOwner lifecycleOwner) {
                List pendingOps = this.f40422n.getPendingOps();
                Fragment fragment2 = fragment;
                boolean z2 = false;
                if (pendingOps == null || !pendingOps.isEmpty()) {
                    Iterator it = pendingOps.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), fragment2.getTag())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (lifecycleOwner == null || z2) {
                    return;
                }
                Lifecycle lifecycleRegistry = fragment.getViewLifecycleOwner().getLifecycleRegistry();
                if (lifecycleRegistry.getState().rl(Lifecycle.State.f38880O)) {
                    lifecycleRegistry.n((LifecycleObserver) this.f40422n.fragmentViewObserver.invoke(entry));
                }
            }
        }));
        fragment.getLifecycleRegistry().n(this.fragmentObserver);
    }

    private final void nY(NavBackStackEntry entry, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        boolean zIsEmpty = ((List) rl().getBackStack().getValue()).isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.getRestoreState() && this.savedIds.remove(entry.getId())) {
            this.fragmentManager.Mh(entry.getId());
            rl().qie(entry);
            return;
        }
        FragmentTransaction fragmentTransactionS = S(entry, navOptions);
        if (!zIsEmpty) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) rl().getBackStack().getValue());
            if (navBackStackEntry != null) {
                r(this, navBackStackEntry.getId(), false, false, 6, null);
            }
            r(this, entry.getId(), false, false, 6, null);
            fragmentTransactionS.KN(entry.getId());
        }
        if (navigatorExtras instanceof Extras) {
            for (Map.Entry entry2 : ((Extras) navigatorExtras).n().entrySet()) {
                fragmentTransactionS.Uo((View) entry2.getKey(), (String) entry2.getValue());
            }
        }
        fragmentTransactionS.mUb();
        if (ViF(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + entry);
        }
        rl().qie(entry);
    }
}
