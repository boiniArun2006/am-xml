package androidx.view.serialization;

import EJn.Wre;
import EJn.Xo;
import EJn.n;
import XA.Ml;
import XA.fuX;
import XA.r;
import androidx.view.NamedNavArgumentKt;
import androidx.view.NavArgumentBuilder;
import androidx.view.NavType;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0004*\u00020\u00172\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008e\u0001\u0010$\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022S\u0010#\u001aO\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b$\u0010%\u001a\u0090\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u00022S\u0010#\u001aO\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b&\u0010%\u001a/\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020,*\u00020\u0017H\u0000¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/Ml;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "typeMap", "", JavetError.PARAMETER_PATH, "xMQ", "(LXA/Ml;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Landroidx/navigation/NamedNavArgument;", "KN", "(LXA/Ml;Ljava/util/Map;)Ljava/util/List;", "", "route", "gh", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlin/Function0;", "", "handler", "t", "(LXA/Ml;Lkotlin/jvm/functions/Function0;)V", "LEJn/Wre;", "nr", "(LEJn/Wre;Ljava/util/Map;)Landroidx/navigation/NavType;", "", "Uo", "(LXA/Ml;)I", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "argName", "navType", "operation", "O", "(LXA/Ml;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)V", "J2", "fieldName", "fieldType", "className", "az", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "qie", "(LEJn/Wre;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
public final class RouteSerializerKt {
    public static final List KN(final Ml ml, final Map typeMap) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        t(ml, new Function0<Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + ml + ". Arguments can only be generated from concrete classes or objects.");
            }
        });
        int iNr = ml.getDescriptor().nr();
        ArrayList arrayList = new ArrayList(iNr);
        for (final int i2 = 0; i2 < iNr; i2++) {
            final String strO = ml.getDescriptor().O(i2);
            arrayList.add(NamedNavArgumentKt.n(strO, new Function1<NavArgumentBuilder, Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavArgumentBuilder navArgumentBuilder) {
                    n(navArgumentBuilder);
                    return Unit.INSTANCE;
                }

                public final void n(NavArgumentBuilder navArgument) {
                    Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
                    Wre wreUo = ml.getDescriptor().Uo(i2);
                    boolean zRl = wreUo.rl();
                    NavType navTypeNr = RouteSerializerKt.nr(wreUo, typeMap);
                    if (navTypeNr == null) {
                        throw new IllegalArgumentException(RouteSerializerKt.az(strO, wreUo.KN(), ml.getDescriptor().KN(), typeMap.toString()));
                    }
                    navArgument.t(navTypeNr);
                    navArgument.rl(zRl);
                    if (ml.getDescriptor().xMQ(i2)) {
                        navArgument.nr(true);
                    }
                }
            }));
        }
        return arrayList;
    }

    public static final int Uo(Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        int iHashCode = ml.getDescriptor().KN().hashCode();
        int iNr = ml.getDescriptor().nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            iHashCode = (iHashCode * 31) + ml.getDescriptor().O(i2).hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }

    public static final String gh(Object route, Map typeMap) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Ml mlT = r.t(Reflection.getOrCreateKotlinClass(route.getClass()));
        final Map mapS7N = new RouteEncoder(mlT, typeMap).s7N(route);
        final RouteBuilder routeBuilder = new RouteBuilder(mlT);
        J2(mlT, typeMap, new Function3<Integer, String, NavType<Object>, Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRouteWithArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, NavType<Object> navType) {
                n(num.intValue(), str, navType);
                return Unit.INSTANCE;
            }

            public final void n(int i2, String argName, NavType navType) {
                Intrinsics.checkNotNullParameter(argName, "argName");
                Intrinsics.checkNotNullParameter(navType, "navType");
                Object obj = mapS7N.get(argName);
                Intrinsics.checkNotNull(obj);
                routeBuilder.t(i2, argName, navType, (List) obj);
            }
        });
        return routeBuilder.O();
    }

    public static /* synthetic */ String mUb(Ml ml, Map map, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return xMQ(ml, map, str);
    }

    public static final boolean qie(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return Intrinsics.areEqual(wre.getKind(), Xo.j.f2283n) && wre.isInline() && wre.nr() == 1;
    }

    private static final void t(Ml ml, Function0 function0) {
        if (ml instanceof fuX) {
            function0.invoke();
        }
    }

    public static final String xMQ(final Ml ml, Map typeMap, String str) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        t(ml, new Function0<Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot generate route pattern from polymorphic class ");
                KClass kClassN = n.n(ml.getDescriptor());
                sb.append(kClassN != null ? kClassN.getSimpleName() : null);
                sb.append(". Routes can only be generated from concrete classes or objects.");
                throw new IllegalArgumentException(sb.toString());
            }
        });
        final RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, ml) : new RouteBuilder(ml);
        O(ml, typeMap, new Function3<Integer, String, NavType<Object>, Unit>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str2, NavType<Object> navType) {
                n(num.intValue(), str2, navType);
                return Unit.INSTANCE;
            }

            public final void n(int i2, String argName, NavType navType) {
                Intrinsics.checkNotNullParameter(argName, "argName");
                Intrinsics.checkNotNullParameter(navType, "navType");
                routeBuilder.nr(i2, argName, navType);
            }
        });
        return routeBuilder.O();
    }

    private static final void J2(Ml ml, Map map, Function3 function3) {
        int iNr = ml.getDescriptor().nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            String strO = ml.getDescriptor().O(i2);
            NavType navType = (NavType) map.get(strO);
            if (navType != null) {
                function3.invoke(Integer.valueOf(i2), strO, navType);
            } else {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strO + ']').toString());
            }
        }
    }

    private static final void O(Ml ml, Map map, Function3 function3) {
        int iNr = ml.getDescriptor().nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            String strO = ml.getDescriptor().O(i2);
            NavType navTypeNr = nr(ml.getDescriptor().Uo(i2), map);
            if (navTypeNr != null) {
                function3.invoke(Integer.valueOf(i2), strO, navTypeNr);
            } else {
                throw new IllegalArgumentException(az(strO, ml.getDescriptor().Uo(i2).KN(), ml.getDescriptor().KN(), map.toString()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavType nr(Wre wre, Map map) {
        Object next;
        NavType navTypeRl;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (NavTypeConverterKt.t(wre, (KType) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        KType kType = (KType) next;
        if (kType != null) {
            navTypeRl = (NavType) map.get(kType);
        } else {
            navTypeRl = null;
        }
        if (navTypeRl == null) {
            navTypeRl = null;
        }
        if (navTypeRl == null) {
            navTypeRl = NavTypeConverterKt.rl(wre);
        }
        if (Intrinsics.areEqual(navTypeRl, UNKNOWN.f40488Z)) {
            return null;
        }
        Intrinsics.checkNotNull(navTypeRl, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navTypeRl;
    }
}
