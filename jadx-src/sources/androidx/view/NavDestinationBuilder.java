package androidx.view;

import XA.Ml;
import XA.r;
import androidx.view.NavDestination;
import androidx.view.serialization.RouteSerializerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@NavDestinationDsl
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fBD\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u001b\u0010\u0012\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0004\b\n\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR&\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010!R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002030*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010!¨\u00066"}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "Landroidx/navigation/Navigator;", "navigator", "", "id", "", "route", "<init>", "(Landroidx/navigation/Navigator;ILjava/lang/String;)V", "(Landroidx/navigation/Navigator;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/Navigator;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "t", "()Landroidx/navigation/NavDestination;", c.f62177j, "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "rl", "I", "getId", "()I", "Ljava/lang/String;", "()Ljava/lang/String;", "nr", "Ljava/util/Map;", "", "O", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "Landroidx/navigation/NavArgument;", "J2", "arguments", "", "Landroidx/navigation/NavDeepLink;", "Uo", "Ljava/util/List;", "deepLinks", "Landroidx/navigation/NavAction;", "KN", "actions", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,398:1\n1855#2,2:399\n1855#2,2:401\n1855#2,2:405\n215#3,2:403\n215#3,2:407\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n95#1:399,2\n238#1:401,2\n295#1:405,2\n294#1:403,2\n296#1:407,2\n*E\n"})
public class NavDestinationBuilder<D extends NavDestination> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Map arguments;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Map actions;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private List deepLinks;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Navigator navigator;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Map typeMap;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String route;

    public NavDestinationBuilder(Navigator navigator, int i2, String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
        this.id = i2;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    protected NavDestination t() {
        return this.navigator.n();
    }

    public NavDestination n() {
        NavDestination navDestinationT = t();
        navDestinationT.ViF(this.label);
        for (Map.Entry entry : this.arguments.entrySet()) {
            navDestinationT.O((String) entry.getKey(), (NavArgument) entry.getValue());
        }
        Iterator it = this.deepLinks.iterator();
        while (it.hasNext()) {
            navDestinationT.J2((NavDeepLink) it.next());
        }
        for (Map.Entry entry2 : this.actions.entrySet()) {
            navDestinationT.WPU(((Number) entry2.getKey()).intValue(), (NavAction) entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            navDestinationT.g(str);
        }
        int i2 = this.id;
        if (i2 != -1) {
            navDestinationT.aYN(i2);
        }
        return navDestinationT;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator navigator, String str) {
        this(navigator, -1, str);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavDestinationBuilder(Navigator navigator, KClass kClass, Map typeMap) {
        Ml mlT;
        Ml mlT2;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        int iUo = (kClass == null || (mlT2 = r.t(kClass)) == null) ? -1 : RouteSerializerKt.Uo(mlT2);
        String strMUb = null;
        if (kClass != null && (mlT = r.t(kClass)) != null) {
            strMUb = RouteSerializerKt.mUb(mlT, typeMap, null, 2, null);
        }
        this(navigator, iUo, strMUb);
        if (kClass != null) {
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.KN(r.t(kClass), typeMap)) {
                this.arguments.put(namedNavArgument.getName(), namedNavArgument.getArgument());
            }
        }
        this.typeMap = typeMap;
    }
}
