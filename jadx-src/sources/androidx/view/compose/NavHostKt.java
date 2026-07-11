package androidx.view.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.LifecycleOwner;
import androidx.view.NavBackStackEntry;
import androidx.view.NavDestination;
import androidx.view.NavGraph;
import androidx.view.NavGraphBuilder;
import androidx.view.NavHostController;
import androidx.view.Navigator;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComposeNavGraphNavigator;
import androidx.view.compose.ComposeNavigator;
import androidx.view.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.PredictiveBackHandlerKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aN\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aÜ\u0001\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u009a\u0002\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001aÁ\u0002\u0010$\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u001f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u001a0 2$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b$\u0010%\u001a½\u0002\u0010'\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020&2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u001a0 2$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b'\u0010(\u001a)\u0010+\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,\u001a·\u0001\u0010-\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0016\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\n2\u001f\b\u0002\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b-\u0010.\u001aõ\u0001\u0010/\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2$\b\u0002\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0016\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2$\b\u0002\u0010\u0017\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\n2(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0007¢\u0006\u0002\b\u001a¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b/\u00100\u001a#\u00103\u001a\u0004\u0018\u00010\u0012*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00105\u001a\u0004\u0018\u00010\u0014*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b5\u00106\u001a#\u00107\u001a\u0004\u0018\u00010\u0012*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b7\u00104\u001a#\u00108\u001a\u0004\u0018\u00010\u0014*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b8\u00106\u001a#\u00109\u001a\u0004\u0018\u00010\u001b*\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b9\u0010:¨\u0006C²\u0006\u0012\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00110;8\nX\u008a\u0084\u0002²\u0006\u000e\u0010>\u001a\u00020=8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010@\u001a\u00020?8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110;8\nX\u008a\u0084\u0002²\u0006\u0012\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110;8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/navigation/NavHostController;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Uo", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "O", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "J2", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "typeMap", "KN", "(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "nr", "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/navigation/NavGraph;", "graph", c.f62177j, "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rl", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavDestination;", "scope", "te", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;", "iF", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;", "fD", "E2", "e", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/SizeTransform;", "", "currentBackStack", "", "progress", "", "inPredictiveBack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 4 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,780:1\n1225#2,3:781\n1228#2,3:786\n1225#2,3:789\n1228#2,3:794\n1225#2,3:797\n1228#2,3:802\n1225#2,3:805\n1228#2,3:810\n1225#2,3:813\n1228#2,3:818\n1225#2,6:823\n1225#2,6:829\n1225#2,6:835\n1225#2,6:841\n1225#2,6:847\n1225#2,6:853\n1225#2,6:859\n1225#2,6:865\n1225#2,6:871\n1225#2,6:877\n1225#2,6:883\n1225#2,6:889\n1225#2,6:895\n1225#2,6:901\n1225#2,6:907\n2892#3:784\n2892#3:792\n2892#3:800\n2909#3:808\n2926#3:816\n59#4:785\n59#4:793\n59#4:801\n77#4:809\n95#4:817\n77#5:821\n146#6:822\n146#6:913\n81#7:914\n81#7:918\n107#7,2:919\n81#7:921\n81#7:922\n79#8:915\n112#8,2:916\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n94#1:781,3\n94#1:786,3\n146#1:789,3\n146#1:794,3\n214#1:797,3\n214#1:802,3\n286#1:805,3\n286#1:810,3\n358#1:813,3\n358#1:818,3\n512#1:823,6\n513#1:829,6\n514#1:835,6\n541#1:841,6\n552#1:847,6\n562#1:853,6\n565#1:859,6\n579#1:865,6\n595#1:871,6\n603#1:877,6\n609#1:883,6\n619#1:889,6\n624#1:895,6\n657#1:901,6\n710#1:907,6\n95#1:784\n147#1:792\n215#1:800\n287#1:808\n359#1:816\n95#1:785\n147#1:793\n215#1:801\n287#1:809\n359#1:817\n493#1:821\n507#1:822\n729#1:913\n510#1:914\n513#1:918\n513#1:919,2\n549#1:921\n552#1:922\n512#1:915\n512#1:916,2\n*E\n"})
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, final Function1 function16, Composer composer, final int i2, final int i3, final int i5) {
        NavHostController navHostController2;
        int i7;
        Modifier modifier2;
        int i8;
        Alignment alignment2;
        int i9;
        String str3;
        int i10;
        Function1 function17;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Modifier modifier3;
        Function1 function111;
        Function1 function112;
        Alignment alignment3;
        Function1 function113;
        Function1 function114;
        int i16;
        boolean z2;
        Object objIF;
        Composer composer2;
        final String str4;
        final Modifier modifier4;
        final Alignment alignment4;
        final Function1 function115;
        final Function1 function116;
        final Function1 function117;
        final Function1 function118;
        final Function1 function119;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1840250294);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            navHostController2 = navHostController;
        } else {
            navHostController2 = navHostController;
            if ((i2 & 6) == 0) {
                i7 = (composerKN.E2(navHostController2) ? 4 : 2) | i2;
            } else {
                i7 = i2;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(str) ? 32 : 16;
        }
        int i17 = i5 & 4;
        if (i17 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    alignment2 = alignment;
                    i7 |= composerKN.p5(alignment2) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        str3 = str2;
                        i7 |= composerKN.p5(str3) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                        function17 = function1;
                    } else {
                        function17 = function1;
                        if ((i2 & 196608) == 0) {
                            i7 |= composerKN.E2(function17) ? 131072 : 65536;
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.E2(function12) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= ((i5 & 128) == 0 && composerKN.E2(function13)) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.E2(function14)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i12 = i5 & 512;
                    if (i12 != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i13 = i12;
                            i7 |= composerKN.E2(function15) ? 536870912 : 268435456;
                        }
                        if ((i5 & 1024) != 0) {
                            i14 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i14 = i3 | (composerKN.E2(function16) ? 4 : 2);
                        } else {
                            i14 = i3;
                        }
                        i15 = i7;
                        if ((i15 & 306783379) == 306783378 && (i14 & 3) == 2 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function118 = function14;
                            composer2 = composerKN;
                            function115 = function17;
                            str4 = str3;
                            modifier4 = modifier2;
                            alignment4 = alignment2;
                            function116 = function12;
                            function117 = function13;
                            function119 = function15;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                Alignment alignmentHI = i8 == 0 ? Alignment.INSTANCE.HI() : alignment2;
                                if (i9 != 0) {
                                    str3 = null;
                                }
                                if (i10 != 0) {
                                    function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$7
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.HI(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    };
                                }
                                Function1 function120 = i11 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$8
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.Ik(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                } : function12;
                                if ((i5 & 128) == 0) {
                                    i15 &= -29360129;
                                    function18 = function17;
                                } else {
                                    function18 = function13;
                                }
                                if ((i5 & 256) == 0) {
                                    i15 &= -234881025;
                                    function19 = function120;
                                } else {
                                    function19 = function14;
                                }
                                if (i13 == 0) {
                                    modifier3 = modifier5;
                                    function111 = function19;
                                    function112 = function17;
                                    alignment3 = alignmentHI;
                                    function113 = function120;
                                    function114 = function18;
                                    function110 = null;
                                } else {
                                    function110 = function15;
                                    modifier3 = modifier5;
                                    function111 = function19;
                                    function112 = function17;
                                    alignment3 = alignmentHI;
                                    function113 = function120;
                                    function114 = function18;
                                }
                                i16 = i15;
                            } else {
                                composerKN.wTp();
                                i16 = (i5 & 128) != 0 ? i15 & (-29360129) : i15;
                                if ((i5 & 256) != 0) {
                                    i16 &= -234881025;
                                }
                                function113 = function12;
                                function114 = function13;
                                function111 = function14;
                                function110 = function15;
                                function112 = function17;
                                modifier3 = modifier2;
                                alignment3 = alignment2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1840250294, i16, i14, "androidx.navigation.compose.NavHost (NavHost.kt:210)");
                            }
                            z2 = ((57344 & i16) != 16384) | ((i16 & 112) != 32) | ((i14 & 14) == 4);
                            objIF = composerKN.iF();
                            if (!z2 || objIF == Composer.INSTANCE.n()) {
                                NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController2.get_navigatorProvider(), str, str3);
                                function16.invoke(navGraphBuilder);
                                objIF = navGraphBuilder.nr();
                                composerKN.o(objIF);
                            }
                            int i18 = i16 & 8078;
                            int i19 = i16 >> 3;
                            composer2 = composerKN;
                            t(navHostController2, (NavGraph) objIF, modifier3, alignment3, function112, function113, function114, function111, function110, composer2, i18 | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (i19 & 234881024), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            str4 = str3;
                            modifier4 = modifier3;
                            alignment4 = alignment3;
                            function115 = function112;
                            function116 = function113;
                            function117 = function114;
                            function118 = function111;
                            function119 = function110;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i20) {
                                    NavHostKt.J2(navHostController, str, modifier4, alignment4, str4, function115, function116, function117, function118, function119, function16, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    i13 = i12;
                    if ((i5 & 1024) != 0) {
                    }
                    i15 = i7;
                    if ((i15 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            if ((i5 & 128) == 0) {
                            }
                            if ((i5 & 256) == 0) {
                            }
                            if (i13 == 0) {
                            }
                            i16 = i15;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            z2 = ((57344 & i16) != 16384) | ((i16 & 112) != 32) | ((i14 & 14) == 4);
                            objIF = composerKN.iF();
                            if (!z2) {
                                NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController2.get_navigatorProvider(), str, str3);
                                function16.invoke(navGraphBuilder2);
                                objIF = navGraphBuilder2.nr();
                                composerKN.o(objIF);
                                int i182 = i16 & 8078;
                                int i192 = i16 >> 3;
                                composer2 = composerKN;
                                t(navHostController2, (NavGraph) objIF, modifier3, alignment3, function112, function113, function114, function111, function110, composer2, i182 | (57344 & i192) | (458752 & i192) | (3670016 & i192) | (29360128 & i192) | (i192 & 234881024), 0);
                                if (ComposerKt.v()) {
                                }
                                str4 = str3;
                                modifier4 = modifier3;
                                alignment4 = alignment3;
                                function115 = function112;
                                function116 = function113;
                                function117 = function114;
                                function118 = function111;
                                function119 = function110;
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                str3 = str2;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                if ((i5 & 1024) != 0) {
                }
                i15 = i7;
                if ((i15 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            alignment2 = alignment;
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            str3 = str2;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i5 & 1024) != 0) {
            }
            i15 = i7;
            if ((i15 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        alignment2 = alignment;
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        str3 = str2;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i5 & 1024) != 0) {
        }
        i15 = i7;
        if ((i15 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final NavHostController navHostController, final KClass kClass, Modifier modifier, Alignment alignment, KClass kClass2, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, final Function1 function16, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        Alignment alignment2;
        int i9;
        int i10;
        Map mapEmptyMap;
        int i11;
        Function1 function17;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        KClass kClass3;
        int i17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Modifier modifier3;
        Function1 function111;
        Function1 function112;
        Alignment alignment3;
        Function1 function113;
        Function1 function114;
        boolean zP5;
        Object objIF;
        Composer composer2;
        final Map map2;
        final KClass kClass4;
        final Modifier modifier4;
        final Alignment alignment4;
        final Function1 function115;
        final Function1 function116;
        final Function1 function117;
        final Function1 function118;
        final Function1 function119;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(750467758);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(navHostController) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(kClass) ? 32 : 16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    alignment2 = alignment;
                    i7 |= composerKN.p5(alignment2) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i2 & 24576) == 0) {
                        i7 |= composerKN.E2(kClass2) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                        mapEmptyMap = map;
                    } else {
                        mapEmptyMap = map;
                        if ((i2 & 196608) == 0) {
                            i7 |= composerKN.E2(mapEmptyMap) ? 131072 : 65536;
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                        function17 = function1;
                    } else {
                        function17 = function1;
                        if ((i2 & 1572864) == 0) {
                            i7 |= composerKN.E2(function17) ? 1048576 : 524288;
                        }
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i7 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i7 |= composerKN.E2(function12) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.E2(function13)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i7 |= ((i5 & 512) == 0 && composerKN.E2(function14)) ? 536870912 : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i3 | 6;
                        i14 = i13;
                    } else if ((i3 & 6) == 0) {
                        i14 = i13;
                        i15 = i3 | (composerKN.E2(function15) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i15 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i15 |= composerKN.E2(function16) ? 32 : 16;
                    }
                    i16 = i15;
                    if ((i7 & 306783379) != 306783378 && (i16 & 19) == 18 && composerKN.xMQ()) {
                        composerKN.wTp();
                        function117 = function13;
                        function119 = function15;
                        composer2 = composerKN;
                        map2 = mapEmptyMap;
                        function115 = function17;
                        modifier4 = modifier2;
                        alignment4 = alignment2;
                        kClass4 = kClass2;
                        function116 = function12;
                        function118 = function14;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment alignmentHI = i8 == 0 ? Alignment.INSTANCE.HI() : alignment2;
                            kClass3 = i9 == 0 ? null : kClass2;
                            if (i10 != 0) {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            if (i11 != 0) {
                                function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$11
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.HI(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            Function1 function120 = i12 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$12
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.Ik(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i5 & 256) == 0) {
                                i17 = i7 & (-234881025);
                                function18 = function17;
                            } else {
                                i17 = i7;
                                function18 = function13;
                            }
                            if ((i5 & 512) == 0) {
                                i17 &= -1879048193;
                                function19 = function120;
                            } else {
                                function19 = function14;
                            }
                            if (i14 == 0) {
                                modifier3 = modifier5;
                                function111 = function19;
                                function112 = function18;
                                alignment3 = alignmentHI;
                                function113 = function17;
                                function114 = function120;
                                function110 = null;
                            } else {
                                function110 = function15;
                                modifier3 = modifier5;
                                function111 = function19;
                                function112 = function18;
                                alignment3 = alignmentHI;
                                function113 = function17;
                                function114 = function120;
                            }
                            i7 = i17;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 256) != 0) {
                                i7 &= -234881025;
                            }
                            if ((i5 & 512) != 0) {
                                i7 &= -1879048193;
                            }
                            kClass3 = kClass2;
                            function114 = function12;
                            function112 = function13;
                            function111 = function14;
                            function110 = function15;
                            function113 = function17;
                            modifier3 = modifier2;
                            alignment3 = alignment2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(750467758, i7, i16, "androidx.navigation.compose.NavHost (NavHost.kt:282)");
                        }
                        zP5 = composerKN.p5(kClass3) | composerKN.p5(kClass) | ((i16 & 112) != 32);
                        objIF = composerKN.iF();
                        if (!zP5 || objIF == Composer.INSTANCE.n()) {
                            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass3, mapEmptyMap);
                            function16.invoke(navGraphBuilder);
                            objIF = navGraphBuilder.nr();
                            composerKN.o(objIF);
                        }
                        NavGraph navGraph = (NavGraph) objIF;
                        int i19 = i7 >> 6;
                        composer2 = composerKN;
                        t(navHostController, navGraph, modifier3, alignment3, function113, function114, function112, function111, function110, composer2, (i7 & 8078) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | ((i16 << 24) & 234881024), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        map2 = mapEmptyMap;
                        kClass4 = kClass3;
                        modifier4 = modifier3;
                        alignment4 = alignment3;
                        function115 = function113;
                        function116 = function114;
                        function117 = function112;
                        function118 = function111;
                        function119 = function110;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$14
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i20) {
                                NavHostKt.KN(navHostController, kClass, modifier4, alignment4, kClass4, map2, function115, function116, function117, function118, function119, function16, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                i16 = i15;
                if ((i7 & 306783379) != 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if ((i5 & 512) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        i7 = i17;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        zP5 = composerKN.p5(kClass3) | composerKN.p5(kClass) | ((i16 & 112) != 32);
                        objIF = composerKN.iF();
                        if (!zP5) {
                            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass3, mapEmptyMap);
                            function16.invoke(navGraphBuilder2);
                            objIF = navGraphBuilder2.nr();
                            composerKN.o(objIF);
                            NavGraph navGraph2 = (NavGraph) objIF;
                            int i192 = i7 >> 6;
                            composer2 = composerKN;
                            t(navHostController, navGraph2, modifier3, alignment3, function113, function114, function112, function111, function110, composer2, (i7 & 8078) | (57344 & i192) | (458752 & i192) | (3670016 & i192) | (i192 & 29360128) | ((i16 << 24) & 234881024), 0);
                            if (ComposerKt.v()) {
                            }
                            map2 = mapEmptyMap;
                            kClass4 = kClass3;
                            modifier4 = modifier3;
                            alignment4 = alignment3;
                            function115 = function113;
                            function116 = function114;
                            function117 = function112;
                            function118 = function111;
                            function119 = function110;
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            alignment2 = alignment;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            i16 = i15;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        alignment2 = alignment;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        i16 = i15;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void O(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, Composer composer, final int i2, final int i3) {
        NavHostController navHostController2;
        int i5;
        Modifier modifier2;
        int i7;
        Alignment alignmentHI;
        int i8;
        String str3;
        int i9;
        Function1 function16;
        int i10;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Alignment alignment2;
        Function1 function111;
        String str4;
        int i11;
        int i12;
        int i13;
        Modifier modifier3;
        Function1 function112;
        boolean z2;
        Object objIF;
        Composer composer2;
        final String str5;
        final Modifier modifier4;
        final Alignment alignment3;
        final Function1 function113;
        final Function1 function114;
        final Function1 function115;
        final Function1 function116;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(410432995);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            navHostController2 = navHostController;
        } else {
            navHostController2 = navHostController;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(navHostController2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(str) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    alignmentHI = alignment;
                    i5 |= composerKN.p5(alignmentHI) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 == 0) {
                    if ((i2 & 24576) == 0) {
                        str3 = str2;
                        i5 |= composerKN.p5(str3) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                        function16 = function1;
                    } else {
                        function16 = function1;
                        if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function16) ? 131072 : 65536;
                        }
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                        function17 = function12;
                    } else {
                        function17 = function12;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function17) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 12582912) == 0) {
                        i5 |= ((i3 & 128) == 0 && composerKN.E2(function13)) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i5 |= ((i3 & 256) == 0 && composerKN.E2(function14)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i3 & 512) == 0) {
                        i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i5 |= composerKN.E2(function15) ? 536870912 : 268435456;
                    }
                    int i15 = i5;
                    if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                alignmentHI = Alignment.INSTANCE.HI();
                            }
                            if (i8 != 0) {
                                str3 = null;
                            }
                            if (i9 != 0) {
                                function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$3
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.HI(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            if (i10 != 0) {
                                function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.Ik(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            if ((i3 & 128) == 0) {
                                i15 &= -29360129;
                                function18 = function16;
                            } else {
                                function18 = function13;
                            }
                            if ((i3 & 256) == 0) {
                                function19 = function18;
                                function110 = function16;
                                alignment2 = alignmentHI;
                                function111 = function17;
                                str4 = str3;
                                i11 = i15 & (-234881025);
                                i12 = 410432995;
                                i13 = 16384;
                                modifier3 = modifier2;
                                function112 = function111;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i12, i11, -1, "androidx.navigation.compose.NavHost (NavHost.kt:142)");
                                }
                                z2 = ((i11 & 57344) != i13) | ((i11 & 112) != 32) | ((1879048192 & i11) == 536870912);
                                objIF = composerKN.iF();
                                if (!z2 || objIF == Composer.INSTANCE.n()) {
                                    NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController2.get_navigatorProvider(), str, str4);
                                    function15.invoke(navGraphBuilder);
                                    objIF = navGraphBuilder.nr();
                                    composerKN.o(objIF);
                                }
                                int i16 = i11 & 8078;
                                int i17 = i11 >> 3;
                                composer2 = composerKN;
                                t(navHostController2, (NavGraph) objIF, modifier3, alignment2, function110, function111, function19, function112, null, composer2, (57344 & i17) | i16 | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), 256);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                str5 = str4;
                                modifier4 = modifier3;
                                alignment3 = alignment2;
                                function113 = function110;
                                function114 = function111;
                                function115 = function19;
                                function116 = function112;
                            } else {
                                function19 = function18;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 128) != 0) {
                                i15 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i15 &= -234881025;
                            }
                            function19 = function13;
                        }
                        function110 = function16;
                        alignment2 = alignmentHI;
                        function111 = function17;
                        str4 = str3;
                        i11 = i15;
                        i12 = 410432995;
                        i13 = 16384;
                        function112 = function14;
                        modifier3 = modifier2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        z2 = ((i11 & 57344) != i13) | ((i11 & 112) != 32) | ((1879048192 & i11) == 536870912);
                        objIF = composerKN.iF();
                        if (!z2) {
                            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController2.get_navigatorProvider(), str, str4);
                            function15.invoke(navGraphBuilder2);
                            objIF = navGraphBuilder2.nr();
                            composerKN.o(objIF);
                            int i162 = i11 & 8078;
                            int i172 = i11 >> 3;
                            composer2 = composerKN;
                            t(navHostController2, (NavGraph) objIF, modifier3, alignment2, function110, function111, function19, function112, null, composer2, (57344 & i172) | i162 | (458752 & i172) | (3670016 & i172) | (i172 & 29360128), 256);
                            if (ComposerKt.v()) {
                            }
                            str5 = str4;
                            modifier4 = modifier3;
                            alignment3 = alignment2;
                            function113 = function110;
                            function114 = function111;
                            function115 = function19;
                            function116 = function112;
                        }
                    } else {
                        composerKN.wTp();
                        function116 = function14;
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        alignment3 = alignmentHI;
                        function114 = function17;
                        function115 = function13;
                        function113 = function16;
                        str5 = str3;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i18) {
                                NavHostKt.O(navHostController, str, modifier4, alignment3, str5, function113, function114, function115, function116, function15, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                str3 = str2;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                int i152 = i5;
                if ((i5 & 306783379) == 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            alignmentHI = alignment;
            i8 = i3 & 16;
            if (i8 == 0) {
            }
            str3 = str2;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            int i1522 = i5;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        alignmentHI = alignment;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        str3 = str2;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        int i15222 = i5;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final NavHostController navHostController, final Object obj, Modifier modifier, Alignment alignment, KClass kClass, Map map, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, final Function1 function16, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        Alignment alignment2;
        int i9;
        int i10;
        Map mapEmptyMap;
        int i11;
        Function1 function17;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        KClass kClass2;
        int i17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Modifier modifier3;
        Function1 function111;
        Function1 function112;
        Alignment alignment3;
        Function1 function113;
        Function1 function114;
        boolean zP5;
        Object objIF;
        Composer composer2;
        final Map map2;
        final KClass kClass3;
        final Modifier modifier4;
        final Alignment alignment4;
        final Function1 function115;
        final Function1 function116;
        final Function1 function117;
        final Function1 function118;
        final Function1 function119;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1476019057);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(navHostController) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(obj) ? 32 : 16;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    alignment2 = alignment;
                    i7 |= composerKN.p5(alignment2) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                    if ((i2 & 24576) == 0) {
                        i7 |= composerKN.E2(kClass) ? 16384 : 8192;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                        mapEmptyMap = map;
                    } else {
                        mapEmptyMap = map;
                        if ((i2 & 196608) == 0) {
                            i7 |= composerKN.E2(mapEmptyMap) ? 131072 : 65536;
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                        function17 = function1;
                    } else {
                        function17 = function1;
                        if ((i2 & 1572864) == 0) {
                            i7 |= composerKN.E2(function17) ? 1048576 : 524288;
                        }
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i7 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i7 |= composerKN.E2(function12) ? 8388608 : 4194304;
                    }
                    if ((i2 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.E2(function13)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i7 |= ((i5 & 512) == 0 && composerKN.E2(function14)) ? 536870912 : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i3 | 6;
                        i14 = i13;
                    } else if ((i3 & 6) == 0) {
                        i14 = i13;
                        i15 = i3 | (composerKN.E2(function15) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i15 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i15 |= composerKN.E2(function16) ? 32 : 16;
                    }
                    i16 = i15;
                    if ((i7 & 306783379) != 306783378 && (i16 & 19) == 18 && composerKN.xMQ()) {
                        composerKN.wTp();
                        function117 = function13;
                        function119 = function15;
                        composer2 = composerKN;
                        map2 = mapEmptyMap;
                        function115 = function17;
                        modifier4 = modifier2;
                        alignment4 = alignment2;
                        kClass3 = kClass;
                        function116 = function12;
                        function118 = function14;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment alignmentHI = i8 == 0 ? Alignment.INSTANCE.HI() : alignment2;
                            kClass2 = i9 == 0 ? null : kClass;
                            if (i10 != 0) {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            if (i11 != 0) {
                                function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$15
                                    @Override // kotlin.jvm.functions.Function1
                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                    public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.HI(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            Function1 function120 = i12 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16
                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.Ik(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i5 & 256) == 0) {
                                i17 = i7 & (-234881025);
                                function18 = function17;
                            } else {
                                i17 = i7;
                                function18 = function13;
                            }
                            if ((i5 & 512) == 0) {
                                i17 &= -1879048193;
                                function19 = function120;
                            } else {
                                function19 = function14;
                            }
                            if (i14 == 0) {
                                modifier3 = modifier5;
                                function111 = function19;
                                function112 = function18;
                                alignment3 = alignmentHI;
                                function113 = function17;
                                function114 = function120;
                                function110 = null;
                            } else {
                                function110 = function15;
                                modifier3 = modifier5;
                                function111 = function19;
                                function112 = function18;
                                alignment3 = alignmentHI;
                                function113 = function17;
                                function114 = function120;
                            }
                            i7 = i17;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 256) != 0) {
                                i7 &= -234881025;
                            }
                            if ((i5 & 512) != 0) {
                                i7 &= -1879048193;
                            }
                            kClass2 = kClass;
                            function114 = function12;
                            function112 = function13;
                            function111 = function14;
                            function110 = function15;
                            function113 = function17;
                            modifier3 = modifier2;
                            alignment3 = alignment2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1476019057, i7, i16, "androidx.navigation.compose.NavHost (NavHost.kt:354)");
                        }
                        zP5 = composerKN.p5(kClass2) | composerKN.p5(obj) | ((i16 & 112) != 32);
                        objIF = composerKN.iF();
                        if (!zP5 || objIF == Composer.INSTANCE.n()) {
                            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass2, mapEmptyMap);
                            function16.invoke(navGraphBuilder);
                            objIF = navGraphBuilder.nr();
                            composerKN.o(objIF);
                        }
                        NavGraph navGraph = (NavGraph) objIF;
                        int i19 = i7 >> 6;
                        composer2 = composerKN;
                        t(navHostController, navGraph, modifier3, alignment3, function113, function114, function112, function111, function110, composer2, (i7 & 8078) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | ((i16 << 24) & 234881024), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        map2 = mapEmptyMap;
                        kClass3 = kClass2;
                        modifier4 = modifier3;
                        alignment4 = alignment3;
                        function115 = function113;
                        function116 = function114;
                        function117 = function112;
                        function118 = function111;
                        function119 = function110;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$18
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i20) {
                                NavHostKt.nr(navHostController, obj, modifier4, alignment4, kClass3, map2, function115, function116, function117, function118, function119, function16, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 24576;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                i16 = i15;
                if ((i7 & 306783379) != 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if ((i5 & 256) == 0) {
                        }
                        if ((i5 & 512) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        i7 = i17;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        zP5 = composerKN.p5(kClass2) | composerKN.p5(obj) | ((i16 & 112) != 32);
                        objIF = composerKN.iF();
                        if (!zP5) {
                            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass2, mapEmptyMap);
                            function16.invoke(navGraphBuilder2);
                            objIF = navGraphBuilder2.nr();
                            composerKN.o(objIF);
                            NavGraph navGraph2 = (NavGraph) objIF;
                            int i192 = i7 >> 6;
                            composer2 = composerKN;
                            t(navHostController, navGraph2, modifier3, alignment3, function113, function114, function112, function111, function110, composer2, (i7 & 8078) | (57344 & i192) | (458752 & i192) | (3670016 & i192) | (i192 & 29360128) | ((i16 << 24) & 234881024), 0);
                            if (ComposerKt.v()) {
                            }
                            map2 = mapEmptyMap;
                            kClass3 = kClass2;
                            modifier4 = modifier3;
                            alignment4 = alignment3;
                            function115 = function113;
                            function116 = function114;
                            function117 = function112;
                            function118 = function111;
                            function119 = function110;
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            alignment2 = alignment;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            i16 = i15;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        alignment2 = alignment;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        i16 = i15;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        Alignment alignmentHI;
        int i9;
        Function1 function16;
        int i10;
        Function1 function17;
        Function1 function18;
        int i11;
        int i12;
        int i13;
        Function1 function19;
        final Function1 function110;
        Function1 function111;
        final Modifier modifier3;
        final Alignment alignment2;
        final Function1 function112;
        final Function1 function113;
        int i14;
        final Function1 function114;
        ViewModelStoreOwner viewModelStoreOwnerT;
        Modifier modifier4;
        State state;
        final MutableState mutableState;
        Function1 function115;
        Function1 function116;
        Function1 function117;
        Function1 function118;
        final Modifier modifier5;
        final Alignment alignment3;
        int i15;
        DialogNavigator dialogNavigator;
        final Function1 function119;
        final Function1 function120;
        final Function1 function121;
        Composer composer2;
        final Function1 function122;
        final Function1 function123;
        DialogNavigator dialogNavigator2;
        int i16;
        final MutableState mutableState2;
        Map map;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1964664536);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(navHostController) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(navGraph) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        alignmentHI = alignment;
                        i5 |= composerKN.p5(alignmentHI) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            function16 = function1;
                            i5 |= composerKN.E2(function16) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                            function17 = function12;
                        } else {
                            function17 = function12;
                            if ((i2 & 196608) == 0) {
                                i5 |= composerKN.E2(function17) ? 131072 : 65536;
                            }
                        }
                        if ((i2 & 1572864) == 0) {
                            function18 = function13;
                            i5 |= ((i3 & 64) == 0 && composerKN.E2(function18)) ? 1048576 : 524288;
                        } else {
                            function18 = function13;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.E2(function14)) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 == 0) {
                            if ((i2 & 100663296) == 0) {
                                i12 = i11;
                                i5 |= composerKN.E2(function15) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i13 = i5;
                            if ((i5 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        alignmentHI = Alignment.INSTANCE.HI();
                                    }
                                    if (i9 != 0) {
                                        function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$23
                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                                return EnterExitTransitionKt.HI(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                            }
                                        };
                                    }
                                    if (i10 != 0) {
                                        function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$24
                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                                return EnterExitTransitionKt.Ik(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                            }
                                        };
                                    }
                                    if ((i3 & 64) != 0) {
                                        i13 &= -3670017;
                                        function18 = function16;
                                    }
                                    if ((i3 & 128) == 0) {
                                        i13 &= -29360129;
                                        function19 = function17;
                                    } else {
                                        function19 = function14;
                                    }
                                    function110 = function19;
                                    function111 = function18;
                                    modifier3 = modifier2;
                                    alignment2 = alignmentHI;
                                    function112 = function17;
                                    function113 = function16;
                                    i14 = i13;
                                    if (i12 == 0) {
                                        function114 = null;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1964664536, i14, -1, "androidx.navigation.compose.NavHost (NavHost.kt:490)");
                                    }
                                    final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerKN.ty(LocalLifecycleOwnerKt.t());
                                    viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, LocalViewModelStoreOwner.f39077t);
                                    if (viewModelStoreOwnerT == null) {
                                        throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                                    }
                                    navHostController.fcU(viewModelStoreOwnerT.getViewModelStore());
                                    navHostController.C(navGraph);
                                    Navigator navigatorO = navHostController.get_navigatorProvider().O("composable");
                                    final ComposeNavigator composeNavigator = navigatorO instanceof ComposeNavigator ? (ComposeNavigator) navigatorO : null;
                                    if (composeNavigator == null) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
                                        if (scopeUpdateScopeGh2 != null) {
                                            final Function1 function124 = function111;
                                            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i17) {
                                                    NavHostKt.t(navHostController, navGraph, modifier3, alignment2, function113, function112, function124, function110, function114, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    final Function1 function125 = function111;
                                    final Function1 function126 = function113;
                                    final Function1 function127 = function112;
                                    final Function1 function128 = function110;
                                    final Function1 function129 = function114;
                                    State stateRl = SnapshotStateKt.rl(composeNavigator.az(), null, composerKN, 0, 1);
                                    Object objIF = composerKN.iF();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objIF == companion.n()) {
                                        objIF = PrimitiveSnapshotStateKt.n(0.0f);
                                        composerKN.o(objIF);
                                    }
                                    MutableFloatState mutableFloatState = (MutableFloatState) objIF;
                                    Object objIF2 = composerKN.iF();
                                    if (objIF2 == companion.n()) {
                                        modifier4 = modifier3;
                                        objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                                        composerKN.o(objIF2);
                                    } else {
                                        modifier4 = modifier3;
                                    }
                                    MutableState mutableState3 = (MutableState) objIF2;
                                    boolean z2 = az(stateRl).size() > 1;
                                    boolean zP5 = composerKN.p5(stateRl) | composerKN.p5(composeNavigator);
                                    Object objIF3 = composerKN.iF();
                                    if (zP5 || objIF3 == companion.n()) {
                                        objIF3 = new NavHostKt$NavHost$25$1(composeNavigator, stateRl, mutableFloatState, mutableState3, null);
                                        state = stateRl;
                                        mutableState = mutableState3;
                                        composerKN.o(objIF3);
                                    } else {
                                        state = stateRl;
                                        mutableState = mutableState3;
                                    }
                                    Alignment alignment4 = alignment2;
                                    PredictiveBackHandlerKt.n(z2, (Function2) objIF3, composerKN, 0, 0);
                                    boolean zE2 = composerKN.E2(navHostController) | composerKN.E2(lifecycleOwner);
                                    Object objIF4 = composerKN.iF();
                                    if (zE2 || objIF4 == companion.n()) {
                                        objIF4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$26$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                navHostController.G7(lifecycleOwner);
                                                return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$26$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void n() {
                                                    }
                                                };
                                            }
                                        };
                                        composerKN.o(objIF4);
                                    }
                                    EffectsKt.rl(lifecycleOwner, (Function1) objIF4, composerKN, 0);
                                    final SaveableStateHolder saveableStateHolderN = SaveableStateHolderKt.n(composerKN, 0);
                                    final State stateRl2 = SnapshotStateKt.rl(navHostController.getVisibleEntries(), null, composerKN, 0, 1);
                                    Object objIF5 = composerKN.iF();
                                    if (objIF5 == companion.n()) {
                                        objIF5 = SnapshotStateKt.O(new Function0<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final List<? extends NavBackStackEntry> invoke() {
                                                List listGh = NavHostKt.gh(stateRl2);
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj : listGh) {
                                                    if (Intrinsics.areEqual(((NavBackStackEntry) obj).getDestination().getNavigatorName(), "composable")) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                return arrayList;
                                            }
                                        });
                                        composerKN.o(objIF5);
                                    }
                                    final State state2 = (State) objIF5;
                                    final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull(qie(state2));
                                    Object objIF6 = composerKN.iF();
                                    if (objIF6 == companion.n()) {
                                        objIF6 = new LinkedHashMap();
                                        composerKN.o(objIF6);
                                    }
                                    final Map map2 = (Map) objIF6;
                                    composerKN.eF(653365120);
                                    if (navBackStackEntry != null) {
                                        boolean zP52 = composerKN.p5(composeNavigator) | ((((i14 & 3670016) ^ 1572864) > 1048576 && composerKN.p5(function125)) || (i14 & 1572864) == 1048576) | ((57344 & i14) == 16384);
                                        Object objIF7 = composerKN.iF();
                                        if (zP52 || objIF7 == companion.n()) {
                                            objIF7 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                                    NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
                                                    Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                                                    EnterTransition enterTransition = null;
                                                    if (!((Boolean) composeNavigator.getIsPop().getValue()).booleanValue() && !NavHostKt.xMQ(mutableState)) {
                                                        Iterator it = NavDestination.INSTANCE.t(destination2).iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                break;
                                                            }
                                                            EnterTransition enterTransitionTe = NavHostKt.te((NavDestination) it.next(), animatedContentTransitionScope);
                                                            if (enterTransitionTe != null) {
                                                                enterTransition = enterTransitionTe;
                                                                break;
                                                            }
                                                        }
                                                        if (enterTransition == null) {
                                                            return (EnterTransition) function126.invoke(animatedContentTransitionScope);
                                                        }
                                                        return enterTransition;
                                                    }
                                                    Iterator it2 = NavDestination.INSTANCE.t(destination2).iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        EnterTransition enterTransitionFD = NavHostKt.fD((NavDestination) it2.next(), animatedContentTransitionScope);
                                                        if (enterTransitionFD != null) {
                                                            enterTransition = enterTransitionFD;
                                                            break;
                                                        }
                                                    }
                                                    if (enterTransition == null) {
                                                        return (EnterTransition) function125.invoke(animatedContentTransitionScope);
                                                    }
                                                    return enterTransition;
                                                }
                                            };
                                            composerKN.o(objIF7);
                                        }
                                        final Function1 function130 = (Function1) objIF7;
                                        function117 = function126;
                                        boolean zP53 = composerKN.p5(composeNavigator) | ((((i14 & 29360128) ^ 12582912) > 8388608 && composerKN.p5(function128)) || (i14 & 12582912) == 8388608) | ((458752 & i14) == 131072);
                                        Object objIF8 = composerKN.iF();
                                        if (zP53 || objIF8 == companion.n()) {
                                            objIF8 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                                    NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getDestination();
                                                    Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                                                    ExitTransition exitTransition = null;
                                                    if (!((Boolean) composeNavigator.getIsPop().getValue()).booleanValue() && !NavHostKt.xMQ(mutableState)) {
                                                        Iterator it = NavDestination.INSTANCE.t(destination2).iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                break;
                                                            }
                                                            ExitTransition exitTransitionIF = NavHostKt.iF((NavDestination) it.next(), animatedContentTransitionScope);
                                                            if (exitTransitionIF != null) {
                                                                exitTransition = exitTransitionIF;
                                                                break;
                                                            }
                                                        }
                                                        if (exitTransition == null) {
                                                            return (ExitTransition) function127.invoke(animatedContentTransitionScope);
                                                        }
                                                        return exitTransition;
                                                    }
                                                    Iterator it2 = NavDestination.INSTANCE.t(destination2).iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        ExitTransition exitTransitionE2 = NavHostKt.E2((NavDestination) it2.next(), animatedContentTransitionScope);
                                                        if (exitTransitionE2 != null) {
                                                            exitTransition = exitTransitionE2;
                                                            break;
                                                        }
                                                    }
                                                    if (exitTransition == null) {
                                                        return (ExitTransition) function128.invoke(animatedContentTransitionScope);
                                                    }
                                                    return exitTransition;
                                                }
                                            };
                                            composerKN.o(objIF8);
                                        }
                                        final Function1 function131 = (Function1) objIF8;
                                        function115 = function128;
                                        boolean z3 = (234881024 & i14) == 67108864;
                                        Object objIF9 = composerKN.iF();
                                        if (z3 || objIF9 == companion.n()) {
                                            objIF9 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalSizeTransform$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final SizeTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                                    SizeTransform sizeTransformE;
                                                    NavDestination destination = ((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getDestination();
                                                    Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                    Iterator it = NavDestination.INSTANCE.t((ComposeNavigator.Destination) destination).iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            sizeTransformE = NavHostKt.e((NavDestination) it.next(), animatedContentTransitionScope);
                                                            if (sizeTransformE != null) {
                                                                break;
                                                            }
                                                        } else {
                                                            sizeTransformE = null;
                                                            break;
                                                        }
                                                    }
                                                    if (sizeTransformE == null) {
                                                        Function1 function132 = function129;
                                                        if (function132 == null) {
                                                            return null;
                                                        }
                                                        return (SizeTransform) function132.invoke(animatedContentTransitionScope);
                                                    }
                                                    return sizeTransformE;
                                                }
                                            };
                                            composerKN.o(objIF9);
                                        }
                                        final Function1 function132 = (Function1) objIF9;
                                        Boolean bool = Boolean.TRUE;
                                        boolean zP54 = composerKN.p5(composeNavigator);
                                        function116 = function129;
                                        Object objIF10 = composerKN.iF();
                                        MutableState mutableState4 = mutableState;
                                        if (zP54 || objIF10 == companion.n()) {
                                            objIF10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                    final State state3 = state2;
                                                    final ComposeNavigator composeNavigator2 = composeNavigator;
                                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void n() {
                                                            Iterator it = NavHostKt.qie(state3).iterator();
                                                            while (it.hasNext()) {
                                                                composeNavigator2.HI((NavBackStackEntry) it.next());
                                                            }
                                                        }
                                                    };
                                                }
                                            };
                                            composerKN.o(objIF10);
                                        }
                                        EffectsKt.rl(bool, (Function1) objIF10, composerKN, 6);
                                        Object objIF11 = composerKN.iF();
                                        if (objIF11 == companion.n()) {
                                            objIF11 = new SeekableTransitionState(navBackStackEntry);
                                            composerKN.o(objIF11);
                                        }
                                        final SeekableTransitionState seekableTransitionState = (SeekableTransitionState) objIF11;
                                        Transition transitionKN = TransitionKt.KN(seekableTransitionState, "entry", composerKN, SeekableTransitionState.f15571o | 48, 0);
                                        if (xMQ(mutableState4)) {
                                            composerKN.eF(-1218260648);
                                            Float fValueOf = Float.valueOf(ty(mutableFloatState));
                                            boolean zP55 = composerKN.p5(state) | composerKN.E2(seekableTransitionState);
                                            Object objIF12 = composerKN.iF();
                                            function118 = function127;
                                            if (zP55 || objIF12 == companion.n()) {
                                                objIF12 = new NavHostKt$NavHost$28$1(seekableTransitionState, state, mutableFloatState, null);
                                                composerKN.o(objIF12);
                                            }
                                            EffectsKt.O(fValueOf, (Function2) objIF12, composerKN, 0);
                                            composerKN.Xw();
                                            i16 = 0;
                                            dialogNavigator2 = null;
                                        } else {
                                            function118 = function127;
                                            composerKN.eF(-1218005611);
                                            boolean zE22 = composerKN.E2(seekableTransitionState) | composerKN.E2(navBackStackEntry) | composerKN.p5(transitionKN);
                                            Object objIF13 = composerKN.iF();
                                            if (zE22 || objIF13 == companion.n()) {
                                                dialogNavigator2 = null;
                                                objIF13 = new NavHostKt$NavHost$29$1(seekableTransitionState, navBackStackEntry, transitionKN, null);
                                                composerKN.o(objIF13);
                                            } else {
                                                dialogNavigator2 = null;
                                            }
                                            i16 = 0;
                                            EffectsKt.O(navBackStackEntry, (Function2) objIF13, composerKN, 0);
                                            composerKN.Xw();
                                        }
                                        boolean zE23 = composerKN.E2(map2) | composerKN.p5(composeNavigator) | composerKN.p5(function130) | composerKN.p5(function131) | composerKN.p5(function132);
                                        Object objIF14 = composerKN.iF();
                                        if (zE23 || objIF14 == companion.n()) {
                                            mutableState2 = mutableState4;
                                            final ComposeNavigator composeNavigator2 = composeNavigator;
                                            objIF14 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$30$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                                    float fFloatValue;
                                                    if (!NavHostKt.qie(state2).contains(animatedContentTransitionScope.getInitialState())) {
                                                        return AnimatedContentKt.J2(EnterTransition.INSTANCE.n(), ExitTransition.INSTANCE.n());
                                                    }
                                                    Float f3 = (Float) map2.get(((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId());
                                                    if (f3 != null) {
                                                        fFloatValue = f3.floatValue();
                                                    } else {
                                                        map2.put(((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId(), Float.valueOf(0.0f));
                                                        fFloatValue = 0.0f;
                                                    }
                                                    if (!Intrinsics.areEqual(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), ((NavBackStackEntry) animatedContentTransitionScope.getInitialState()).getId())) {
                                                        fFloatValue = (((Boolean) composeNavigator2.getIsPop().getValue()).booleanValue() || NavHostKt.xMQ(mutableState2)) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
                                                    }
                                                    map2.put(((NavBackStackEntry) animatedContentTransitionScope.getTargetState()).getId(), Float.valueOf(fFloatValue));
                                                    return new ContentTransform((EnterTransition) function130.invoke(animatedContentTransitionScope), (ExitTransition) function131.invoke(animatedContentTransitionScope), fFloatValue, (SizeTransform) function132.invoke(animatedContentTransitionScope));
                                                }
                                            };
                                            map = map2;
                                            composerKN.o(objIF14);
                                        } else {
                                            mutableState2 = mutableState4;
                                            map = map2;
                                        }
                                        final MutableState mutableState5 = mutableState2;
                                        i15 = i16;
                                        dialogNavigator = dialogNavigator2;
                                        Modifier modifier6 = modifier4;
                                        alignment3 = alignment4;
                                        AnimatedContentKt.n(transitionKN, modifier6, (Function1) objIF14, alignment3, new Function1<NavBackStackEntry, Object>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$31
                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Object invoke(NavBackStackEntry navBackStackEntry2) {
                                                return navBackStackEntry2.getId();
                                            }
                                        }, ComposableLambdaKt.nr(820763100, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$32
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry2, Composer composer3, Integer num) {
                                                n(animatedContentScope, navBackStackEntry2, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(final AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry2, Composer composer3, int i17) {
                                                Object objPrevious;
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(820763100, i17, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)");
                                                }
                                                boolean zAreEqual = Intrinsics.areEqual(seekableTransitionState.n(), navBackStackEntry);
                                                if (!NavHostKt.xMQ(mutableState5) && !zAreEqual) {
                                                    List listQie = NavHostKt.qie(state2);
                                                    ListIterator listIterator = listQie.listIterator(listQie.size());
                                                    while (true) {
                                                        if (listIterator.hasPrevious()) {
                                                            objPrevious = listIterator.previous();
                                                            if (Intrinsics.areEqual(navBackStackEntry2, (NavBackStackEntry) objPrevious)) {
                                                                break;
                                                            }
                                                        } else {
                                                            objPrevious = null;
                                                            break;
                                                        }
                                                    }
                                                    navBackStackEntry2 = (NavBackStackEntry) objPrevious;
                                                }
                                                if (navBackStackEntry2 != null) {
                                                    NavBackStackEntryProviderKt.n(navBackStackEntry2, saveableStateHolderN, ComposableLambdaKt.nr(-1263531443, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$32.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            n(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer4, int i18) {
                                                            if ((i18 & 3) == 2 && composer4.xMQ()) {
                                                                composer4.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(-1263531443, i18, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:703)");
                                                            }
                                                            NavDestination destination = navBackStackEntry2.getDestination();
                                                            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                            ((ComposeNavigator.Destination) destination).getContent().invoke(animatedContentScope, navBackStackEntry2, composer4, 0);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54), composerKN, ((i14 >> 3) & 112) | 221184 | (i14 & 7168), 0);
                                        modifier5 = modifier6;
                                        Object objXMQ = transitionKN.xMQ();
                                        Object objIk = transitionKN.Ik();
                                        boolean zP56 = composerKN.p5(transitionKN) | composerKN.E2(navHostController) | composerKN.p5(composeNavigator) | composerKN.E2(map);
                                        Object objIF15 = composerKN.iF();
                                        if (zP56 || objIF15 == companion.n()) {
                                            objIF15 = new NavHostKt$NavHost$33$1(transitionKN, navHostController, map, state2, composeNavigator, null);
                                            composerKN.o(objIF15);
                                        }
                                        EffectsKt.nr(objXMQ, objIk, (Function2) objIF15, composerKN, i15);
                                    } else {
                                        function115 = function128;
                                        function116 = function129;
                                        function117 = function126;
                                        function118 = function127;
                                        modifier5 = modifier4;
                                        alignment3 = alignment4;
                                        i15 = 0;
                                        dialogNavigator = null;
                                    }
                                    composerKN.Xw();
                                    Navigator navigatorO2 = navHostController.get_navigatorProvider().O("dialog");
                                    DialogNavigator dialogNavigator3 = navigatorO2 instanceof DialogNavigator ? (DialogNavigator) navigatorO2 : dialogNavigator;
                                    if (dialogNavigator3 == null) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        ScopeUpdateScope scopeUpdateScopeGh3 = composerKN.gh();
                                        if (scopeUpdateScopeGh3 != null) {
                                            final Function1 function133 = function117;
                                            final Function1 function134 = function115;
                                            final Function1 function135 = function118;
                                            final Function1 function136 = function116;
                                            scopeUpdateScopeGh3.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i17) {
                                                    NavHostKt.t(navHostController, navGraph, modifier5, alignment3, function133, function135, function125, function134, function136, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    function119 = function117;
                                    function120 = function115;
                                    function121 = function118;
                                    DialogHostKt.n(dialogNavigator3, composerKN, i15);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer2 = composerKN;
                                    function122 = function125;
                                    function123 = function116;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i13 &= -29360129;
                                    }
                                    function110 = function14;
                                    function111 = function18;
                                    modifier3 = modifier2;
                                    alignment2 = alignmentHI;
                                    function112 = function17;
                                    function113 = function16;
                                    i14 = i13;
                                }
                                function114 = function15;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerKN.ty(LocalLifecycleOwnerKt.t());
                                viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, LocalViewModelStoreOwner.f39077t);
                                if (viewModelStoreOwnerT == null) {
                                }
                            } else {
                                composerKN.wTp();
                                function120 = function14;
                                composer2 = composerKN;
                                alignment3 = alignmentHI;
                                function119 = function16;
                                function123 = function15;
                                function122 = function18;
                                modifier5 = modifier2;
                                function121 = function17;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$34
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i17) {
                                        NavHostKt.t(navHostController, navGraph, modifier5, alignment3, function119, function121, function122, function120, function123, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 100663296;
                        i12 = i11;
                        i13 = i5;
                        if ((i5 & 38347923) == 38347922) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if ((i3 & 64) != 0) {
                                }
                                if ((i3 & 128) == 0) {
                                }
                                function110 = function19;
                                function111 = function18;
                                modifier3 = modifier2;
                                alignment2 = alignmentHI;
                                function112 = function17;
                                function113 = function16;
                                i14 = i13;
                                if (i12 == 0) {
                                    function114 = function15;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                final LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerKN.ty(LocalLifecycleOwnerKt.t());
                                viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, LocalViewModelStoreOwner.f39077t);
                                if (viewModelStoreOwnerT == null) {
                                }
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function16 = function1;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i5;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                alignmentHI = alignment;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                function16 = function1;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            alignmentHI = alignment;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            function16 = function1;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        alignmentHI = alignment;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        function16 = function1;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition E2(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 popExitTransition;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 popExitTransition2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition();
            if (popExitTransition2 != null) {
                return (ExitTransition) popExitTransition2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition()) == null) {
            return null;
        }
        return (ExitTransition) popExitTransition.invoke(animatedContentTransitionScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void Uo(final NavHostController navHostController, final String str, Modifier modifier, String str2, final Function1 function1, Composer composer, final int i2, final int i3) {
        NavHostController navHostController2;
        int i5;
        Modifier modifier2;
        int i7;
        String str3;
        final String str4;
        boolean z2;
        Object objIF;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(141827520);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            navHostController2 = navHostController;
        } else {
            navHostController2 = navHostController;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(navHostController2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(str) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    str3 = str2;
                    i5 |= composerKN.p5(str3) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerKN.E2(function1) ? 16384 : 8192;
                }
                if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    str4 = str3;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    str4 = i7 == 0 ? null : str3;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(141827520, i5, -1, "androidx.navigation.compose.NavHost (NavHost.kt:90)");
                    }
                    z2 = ((i5 & 7168) != 2048) | ((i5 & 112) != 32) | ((57344 & i5) == 16384);
                    objIF = composerKN.iF();
                    if (!z2 || objIF == Composer.INSTANCE.n()) {
                        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController2.get_navigatorProvider(), str, str4);
                        function1.invoke(navGraphBuilder);
                        objIF = navGraphBuilder.nr();
                        composerKN.o(objIF);
                    }
                    composer2 = composerKN;
                    t(navHostController2, (NavGraph) objIF, modifier2, null, null, null, null, null, null, composer2, i5 & 910, 504);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i9) {
                            NavHostKt.Uo(navHostController, str, modifier3, str4, function1, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            str3 = str2;
            if ((i3 & 16) != 0) {
            }
            if ((i5 & 9363) == 9362) {
                if (i8 != 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                z2 = ((i5 & 7168) != 2048) | ((i5 & 112) != 32) | ((57344 & i5) == 16384);
                objIF = composerKN.iF();
                if (!z2) {
                    NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController2.get_navigatorProvider(), str, str4);
                    function1.invoke(navGraphBuilder2);
                    objIF = navGraphBuilder2.nr();
                    composerKN.o(objIF);
                    composer2 = composerKN;
                    t(navHostController2, (NavGraph) objIF, modifier2, null, null, null, null, null, null, composer2, i5 & 910, 504);
                    if (ComposerKt.v()) {
                    }
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        str3 = str2;
        if ((i3 & 16) != 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SizeTransform e(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 sizeTransform;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 sizeTransform2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform();
            if (sizeTransform2 != null) {
                return (SizeTransform) sizeTransform2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform()) == null) {
            return null;
        }
        return (SizeTransform) sizeTransform.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition fD(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 popEnterTransition;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 popEnterTransition2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition();
            if (popEnterTransition2 != null) {
                return (EnterTransition) popEnterTransition2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition()) == null) {
            return null;
        }
        return (EnterTransition) popEnterTransition.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition iF(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 exitTransition;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 exitTransition2 = ((ComposeNavigator.Destination) navDestination).getExitTransition();
            if (exitTransition2 != null) {
                return (ExitTransition) exitTransition2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition()) == null) {
            return null;
        }
        return (ExitTransition) exitTransition.invoke(animatedContentTransitionScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void n(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Composer composer, final int i2, final int i3) {
        NavHostController navHostController2;
        int i5;
        NavGraph navGraph2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-957014592);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            navHostController2 = navHostController;
        } else if ((i2 & 6) == 0) {
            navHostController2 = navHostController;
            i5 = (composerKN.E2(navHostController2) ? 4 : 2) | i2;
        } else {
            navHostController2 = navHostController;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            navGraph2 = navGraph;
        } else {
            navGraph2 = navGraph;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(navGraph2) ? 32 : 16;
            }
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-957014592, i5, -1, "androidx.navigation.compose.NavHost (NavHost.kt:392)");
                }
                t(navHostController2, navGraph2, modifier4, null, null, null, null, null, null, composerKN, i5 & 1022, 504);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        NavHostKt.n(navHostController, navGraph, modifier3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i5 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            t(navHostController2, navGraph2, modifier4, null, null, null, null, null, null, composerKN, i5 & 1022, 504);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, final int i2, final int i3) {
        NavHostController navHostController2;
        int i5;
        NavGraph navGraph2;
        Modifier modifier2;
        int i7;
        Alignment alignmentHI;
        int i8;
        Function1 function15;
        int i9;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        Modifier modifier3;
        Function1 function19;
        final Modifier modifier4;
        final Alignment alignment2;
        final Function1 function110;
        final Function1 function111;
        final Function1 function112;
        final Function1 function113;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1818191915);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            navHostController2 = navHostController;
        } else {
            navHostController2 = navHostController;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(navHostController2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            navGraph2 = navGraph;
        } else {
            navGraph2 = navGraph;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(navGraph2) ? 32 : 16;
            }
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    alignmentHI = alignment;
                    i5 |= composerKN.p5(alignmentHI) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function15 = function1;
                        i5 |= composerKN.E2(function15) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            function16 = function12;
                            i5 |= composerKN.E2(function16) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                function17 = function13;
                                int i11 = composerKN.E2(function17) ? 1048576 : 524288;
                                i5 |= i11;
                            } else {
                                function17 = function13;
                            }
                            i5 |= i11;
                        } else {
                            function17 = function13;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.E2(function14)) ? 8388608 : 4194304;
                        }
                        if ((i5 & 4793491) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier4 = modifier2;
                            alignment2 = alignmentHI;
                            function110 = function15;
                            function111 = function16;
                            function112 = function17;
                            function113 = function14;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    alignmentHI = Alignment.INSTANCE.HI();
                                }
                                if (i8 != 0) {
                                    function15 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$20
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final EnterTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.HI(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    };
                                }
                                if (i9 != 0) {
                                    function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$21
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final ExitTransition invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.Ik(AnimationSpecKt.ty(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    };
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                    function17 = function15;
                                }
                                if ((i3 & 128) == 0) {
                                    i5 &= -29360129;
                                    modifier3 = modifier5;
                                    function19 = function16;
                                    function18 = function19;
                                    Function1 function114 = function17;
                                    Alignment alignment3 = alignmentHI;
                                    Function1 function115 = function15;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1818191915, i5, -1, "androidx.navigation.compose.NavHost (NavHost.kt:430)");
                                    }
                                    t(navHostController2, navGraph2, modifier3, alignment3, function115, function19, function114, function18, null, composerKN, i5 & 33554430, 256);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier4 = modifier3;
                                    alignment2 = alignment3;
                                    function110 = function115;
                                    function111 = function19;
                                    function112 = function114;
                                    function113 = function18;
                                } else {
                                    function18 = function14;
                                    modifier3 = modifier5;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i5 &= -29360129;
                                }
                                function18 = function14;
                                modifier3 = modifier2;
                            }
                            function19 = function16;
                            Function1 function1142 = function17;
                            Alignment alignment32 = alignmentHI;
                            Function1 function1152 = function15;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            t(navHostController2, navGraph2, modifier3, alignment32, function1152, function19, function1142, function18, null, composerKN, i5 & 33554430, 256);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            alignment2 = alignment32;
                            function110 = function1152;
                            function111 = function19;
                            function112 = function1142;
                            function113 = function18;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$22
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i12) {
                                    NavHostKt.rl(navHostController, navGraph, modifier4, alignment2, function110, function111, function112, function113, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    function16 = function12;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i5 & 4793491) == 4793490) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if ((i3 & 64) != 0) {
                            }
                            if ((i3 & 128) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function15 = function1;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                function16 = function12;
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i5 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            alignmentHI = alignment;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function15 = function1;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            function16 = function12;
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        alignmentHI = alignment;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function15 = function1;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        function16 = function12;
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition te(NavDestination navDestination, AnimatedContentTransitionScope animatedContentTransitionScope) {
        Function1 enterTransition;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1 enterTransition2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition();
            if (enterTransition2 != null) {
                return (EnterTransition) enterTransition2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition()) == null) {
            return null;
        }
        return (EnterTransition) enterTransition.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List az(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gh(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List qie(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ty(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
