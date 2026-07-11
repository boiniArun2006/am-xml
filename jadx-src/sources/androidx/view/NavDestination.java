package androidx.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.view.NavDeepLink;
import androidx.view.common.R;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 q2\u00020\u0001:\u0003rstB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020&2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0017¢\u0006\u0004\b,\u0010-J\u0019\u00101\u001a\u0004\u0018\u0001002\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00172\b\b\u0001\u00103\u001a\u00020.2\u0006\u00104\u001a\u000200¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u000e¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u0004\u0018\u00010)2\b\u0010;\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0002H\u0016¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020.H\u0016¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010?R.\u0010P\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010H8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010FR$\u0010X\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010ZR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u0002000\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010]R\"\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR,\u0010/\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020.8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010c\u001a\u0004\bd\u0010D\"\u0004\be\u0010fR.\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010F\u001a\u0004\bh\u0010?\"\u0004\bg\u0010\u0005R\u001e\u0010l\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010?¨\u0006u"}, d2 = {"Landroidx/navigation/NavDestination;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavDeepLink;", "deepLink", "Landroid/net/Uri;", "uri", "", "Landroidx/navigation/NavArgument;", "arguments", "", "Ik", "(Landroidx/navigation/NavDeepLink;Landroid/net/Uri;Ljava/util/Map;)Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "S", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navDeepLink", "J2", "(Landroidx/navigation/NavDeepLink;)V", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "XQ", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "o", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "previousDestination", "", "KN", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "r", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "te", "()Z", "", "id", "Landroidx/navigation/NavAction;", "mUb", "(I)Landroidx/navigation/NavAction;", "actionId", FileUploadManager.f61572j, "WPU", "(ILandroidx/navigation/NavAction;)V", "argumentName", "argument", "O", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "args", "Uo", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", c.f62177j, "Ljava/lang/String;", "ty", "Landroidx/navigation/NavGraph;", "<set-?>", "t", "Landroidx/navigation/NavGraph;", "HI", "()Landroidx/navigation/NavGraph;", "nY", "(Landroidx/navigation/NavGraph;)V", "parent", "idName", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "ViF", "(Ljava/lang/CharSequence;)V", "label", "", "Ljava/util/List;", "deepLinks", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "actions", "", "Z", "Ljava/util/Map;", "_arguments", "I", "az", "aYN", "(I)V", "g", "ck", "Lkotlin/Lazy;", "E2", "Lkotlin/Lazy;", "routeDeepLink", "gh", "()Ljava/util/Map;", "qie", "displayName", "e", "ClassType", "Companion", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,862:1\n232#2,3:863\n1#3:866\n29#4:867\n1549#5:868\n1620#5,3:869\n1855#5,2:876\n1855#5,2:879\n1855#5,2:882\n1224#6,2:872\n1224#6,2:874\n32#7:878\n33#7:881\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n188#1:863,3\n380#1:867\n482#1:868\n482#1:869,3\n725#1:876,2\n733#1:879,2\n737#1:882,2\n706#1:872,2\n710#1:874,2\n730#1:878\n730#1:881\n*E\n"})
public class NavDestination {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Lazy routeDeepLink;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private CharSequence label;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private String idName;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private Map _arguments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String route;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String navigatorName;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final SparseArrayCompat actions;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List deepLinks;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private NavGraph parent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Map f40081X = new LinkedHashMap();

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "Lkotlin/reflect/KClass;", "value", "<init>", "(Lkotlin/reflect/KClass;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ClassType {
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "id", "", "rl", "(Landroid/content/Context;I)Ljava/lang/String;", "route", c.f62177j, "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/navigation/NavDestination;", "Lkotlin/sequences/Sequence;", "t", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String n(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        public final String rl(Context context, int id) {
            String strValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (id <= 16777215) {
                return String.valueOf(id);
            }
            try {
                strValueOf = context.getResources().getResourceName(id);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(id);
            }
            Intrinsics.checkNotNullExpressionValue(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        public final Sequence t(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt.generateSequence(navDestination, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(NavDestination it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getParent();
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", InneractiveMediationNameConsts.OTHER, c.f62177j, "(Landroidx/navigation/NavDestination$DeepLinkMatch;)I", "arguments", "nr", "(Landroid/os/Bundle;)Z", "Landroidx/navigation/NavDestination;", "rl", "()Landroidx/navigation/NavDestination;", "t", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "O", "Z", "J2", "I", "r", "o", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    @SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,862:1\n1855#2,2:863\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n128#1:863,2\n*E\n"})
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final int matchingPathSegments;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final boolean isExactDeepLink;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final NavDestination destination;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final int mimeTypeMatchLevel;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMatchingAction;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Bundle matchingArgs;

        public final boolean nr(Bundle arguments) {
            Bundle bundle;
            Object objN;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!arguments.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(key);
                Object objN2 = null;
                NavType type = navArgument != null ? navArgument.getType() : null;
                if (type != null) {
                    Bundle bundle2 = this.matchingArgs;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    objN = type.n(bundle2, key);
                } else {
                    objN = null;
                }
                if (type != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    objN2 = type.n(arguments, key);
                }
                if (type != null && !type.mUb(objN, objN2)) {
                    return false;
                }
            }
            return true;
        }

        public DeepLinkMatch(NavDestination destination, Bundle bundle, boolean z2, int i2, boolean z3, int i3) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z2;
            this.matchingPathSegments = i2;
            this.hasMatchingAction = z3;
            this.mimeTypeMatchLevel = i3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(DeepLinkMatch other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z2 = this.isExactDeepLink;
            if (z2 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z2 && other.isExactDeepLink) {
                return -1;
            }
            int i2 = this.matchingPathSegments - other.matchingPathSegments;
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z3 = this.hasMatchingAction;
            if (z3 && !other.hasMatchingAction) {
                return 1;
            }
            if (z3 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final NavDestination getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }
    }

    public NavDestination(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat(0, 1, null);
        this._arguments = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[EDGE_INSN: B:31:0x00a0->B:32:0x00a1 BREAK  A[LOOP:1: B:23:0x0071->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object other) {
        boolean z2;
        boolean z3;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof NavDestination)) {
            NavDestination navDestination = (NavDestination) other;
            boolean zAreEqual = Intrinsics.areEqual(this.deepLinks, navDestination.deepLinks);
            if (this.actions.ck() == navDestination.actions.ck()) {
                Iterator it = SequencesKt.asSequence(SparseArrayKt.n(this.actions)).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!Intrinsics.areEqual(this.actions.O(iIntValue), navDestination.actions.O(iIntValue))) {
                        z2 = false;
                        break;
                    }
                }
                z2 = true;
                if (this._arguments.size() != navDestination._arguments.size()) {
                    for (Map.Entry entry : MapsKt.asSequence(this._arguments)) {
                        if (!navDestination._arguments.containsKey(entry.getKey()) || !Intrinsics.areEqual(navDestination._arguments.get(entry.getKey()), entry.getValue())) {
                            z3 = false;
                            break;
                        }
                    }
                    z3 = true;
                    if (this.id != navDestination.id && Intrinsics.areEqual(this.route, navDestination.route) && zAreEqual && z2 && z3) {
                        return true;
                    }
                } else {
                    z3 = false;
                    if (this.id != navDestination.id) {
                    }
                }
            } else {
                z2 = false;
                if (this._arguments.size() != navDestination._arguments.size()) {
                }
            }
        }
        return false;
    }

    public boolean te() {
        return true;
    }

    public static /* synthetic */ int[] xMQ(NavDestination navDestination, NavDestination navDestination2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i2 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.KN(navDestination2);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final NavGraph getParent() {
        return this.parent;
    }

    public final void J2(final NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List listN = NavArgumentKt.n(this._arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Boolean.valueOf(!navDeepLink.mUb().contains(key));
            }
        });
        if (listN.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listN).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] KN(NavDestination previousDestination) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavDestination navDestination = this;
        while (true) {
            Intrinsics.checkNotNull(navDestination);
            NavGraph navGraph = navDestination.parent;
            if ((previousDestination != null ? previousDestination.parent : null) != null) {
                NavGraph navGraph2 = previousDestination.parent;
                Intrinsics.checkNotNull(navGraph2);
                if (navGraph2.E2(navDestination.id) != navDestination) {
                    if (navGraph == null || navGraph.getStartDestId() != navDestination.id) {
                        arrayDeque.addFirst(navDestination);
                    }
                    if (Intrinsics.areEqual(navGraph, previousDestination) || navGraph == null) {
                        break;
                    }
                    navDestination = navGraph;
                } else {
                    arrayDeque.addFirst(navDestination);
                    break;
                }
            }
        }
        List list = CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).id));
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    public final void O(String argumentName, NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public void S(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.aYN);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        g(typedArrayObtainAttributes.getString(R.styleable.f40184g));
        int i2 = R.styleable.nY;
        if (typedArrayObtainAttributes.hasValue(i2)) {
            aYN(typedArrayObtainAttributes.getResourceId(i2, 0));
            this.idName = INSTANCE.rl(context, this.id);
        }
        this.label = typedArrayObtainAttributes.getText(R.styleable.ViF);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final Bundle Uo(Bundle args) {
        if (args == null && this._arguments.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this._arguments.entrySet()) {
            ((NavArgument) entry.getValue()).O((String) entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry entry2 : this._arguments.entrySet()) {
                String str = (String) entry2.getKey();
                NavArgument navArgument = (NavArgument) entry2.getValue();
                if (!navArgument.getIsDefaultValueUnknown() && !navArgument.J2(str, bundle)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + navArgument.getType().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() + " expected.").toString());
                }
            }
        }
        return bundle;
    }

    public final void ViF(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void WPU(int actionId, NavAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (te()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.az(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final DeepLinkMatch XQ(String route) {
        NavDeepLink navDeepLink;
        Intrinsics.checkNotNullParameter(route, "route");
        Lazy lazy = this.routeDeepLink;
        if (lazy == null || (navDeepLink = (NavDeepLink) lazy.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(INSTANCE.n(route));
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        Bundle bundleHI = navDeepLink.HI(uri, this._arguments);
        if (bundleHI == null) {
            return null;
        }
        return new DeepLinkMatch(this, bundleHI, navDeepLink.getIsExactDeepLink(), navDeepLink.KN(uri), false, -1);
    }

    public final void aYN(int i2) {
        this.id = i2;
        this.idName = null;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final void g(String str) {
        if (str == null) {
            aYN(0);
        } else {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String strN = INSTANCE.n(str);
            final NavDeepLink navDeepLinkN = new NavDeepLink.Builder().nr(strN).n();
            List listN = NavArgumentKt.n(this._arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$route$missingRequiredArguments$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(String key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    return Boolean.valueOf(!navDeepLinkN.mUb().contains(key));
                }
            });
            if (!listN.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listN).toString());
            }
            this.routeDeepLink = LazyKt.lazy(new Function0<NavDeepLink>() { // from class: androidx.navigation.NavDestination$route$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final NavDeepLink invoke() {
                    return new NavDeepLink.Builder().nr(strN).n();
                }
            });
            aYN(strN.hashCode());
        }
        this.route = str;
    }

    public final Map gh() {
        return MapsKt.toMap(this._arguments);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i2 = this.id * 31;
        String str = this.route;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i3 = iHashCode * 31;
            String strViF = navDeepLink.getUriPattern();
            int iHashCode2 = (i3 + (strViF != null ? strViF.hashCode() : 0)) * 31;
            String strXMQ = navDeepLink.getAction();
            int iHashCode3 = (iHashCode2 + (strXMQ != null ? strXMQ.hashCode() : 0)) * 31;
            String strZ = navDeepLink.getMimeType();
            iHashCode = iHashCode3 + (strZ != null ? strZ.hashCode() : 0);
        }
        Iterator itRl = SparseArrayKt.rl(this.actions);
        while (itRl.hasNext()) {
            NavAction navAction = (NavAction) itRl.next();
            int iRl = ((iHashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptionsT = navAction.getNavOptions();
            iHashCode = iRl + (navOptionsT != null ? navOptionsT.hashCode() : 0);
            Bundle bundleN = navAction.getDefaultArguments();
            if (bundleN != null && (setKeySet = bundleN.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i5 = iHashCode * 31;
                    Bundle bundleN2 = navAction.getDefaultArguments();
                    Intrinsics.checkNotNull(bundleN2);
                    Object obj = bundleN2.get(str2);
                    iHashCode = i5 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            Object obj2 = this._arguments.get(str3);
            iHashCode = iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final NavAction mUb(int id) {
        NavAction navAction = this.actions.KN() ? null : (NavAction) this.actions.O(id);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.mUb(id);
        }
        return null;
    }

    public final void nY(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public DeepLinkMatch o(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle bundleHI = uri != null ? navDeepLink.HI(uri, this._arguments) : null;
            int iKN = navDeepLink.KN(uri);
            String action = navDeepLinkRequest.getCom.safedk.android.analytics.brandsafety.FileUploadManager.j java.lang.String();
            boolean z2 = action != null && Intrinsics.areEqual(action, navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int iXQ = mimeType != null ? navDeepLink.XQ(mimeType) : -1;
            if (bundleHI == null) {
                if (z2 || iXQ > -1) {
                    if (Ik(navDeepLink, uri, this._arguments)) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, bundleHI, navDeepLink.getIsExactDeepLink(), iKN, z2, iXQ);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }

    public String qie() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    public final boolean r(String route, Bundle arguments) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.route, route)) {
            return true;
        }
        DeepLinkMatch deepLinkMatchXQ = XQ(route);
        if (Intrinsics.areEqual(this, deepLinkMatchXQ != null ? deepLinkMatchXQ.getDestination() : null)) {
            return deepLinkMatchXQ.nr(arguments);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.idName;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.route;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    private final boolean Ik(NavDeepLink deepLink, Uri uri, Map arguments) {
        final Bundle bundleCk = deepLink.ck(uri, arguments);
        return NavArgumentKt.n(arguments, new Function1<String, Boolean>() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Boolean.valueOf(!bundleCk.containsKey(key));
            }
        }).isEmpty();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator navigator) {
        this(NavigatorProvider.INSTANCE.n(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
