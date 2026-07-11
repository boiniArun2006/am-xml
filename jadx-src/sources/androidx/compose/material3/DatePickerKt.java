package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import TFv.CN3;
import WJ.phkN.HFAkacKHsU;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.database.Kr.FlTC;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0084\u0001\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u001bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u009c\u0001\u0010.\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192#\u0010%\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070\u001b2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u008f\u0001\u00100\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001f2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070\u001b2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b0\u00101\u001aZ\u00106\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u00020\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u008f\u0001\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\b\u0010 \u001a\u0004\u0018\u00010\u001f2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070\u001b2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b:\u0010;\u001aK\u0010<\u001a\u00020\u00072\u0006\u00109\u001a\u0002082!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0080@¢\u0006\u0004\b<\u0010=\u001a\u001f\u0010>\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b>\u0010?\u001ax\u0010G\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010B\u001a\u00020\u001f2\b\u0010C\u001a\u0004\u0018\u00010\u001f2\b\u0010D\u001a\u0004\u0018\u00010\u001f2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010J\u001a\u00020I2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\bJ\u0010K\u001a9\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000bH\u0003¢\u0006\u0004\bR\u0010S\u001ap\u0010[\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u000b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020Q2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b[\u0010\\\u001ab\u0010_\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001f2!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110I¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020\u00070\u001b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b_\u0010`\u001a`\u0010b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010W\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020Q2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bb\u0010c\u001ai\u0010k\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020Q2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\bk\u0010l\u001aB\u0010n\u001a\u00020\u00072\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010m\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\bn\u0010o\u001a5\u0010w\u001a\b\u0012\u0004\u0012\u00020v0u2\u0006\u0010\u0001\u001a\u00020p2\u0006\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020Q2\u0006\u0010t\u001a\u00020QH\u0002¢\u0006\u0004\bw\u0010x\"\u001a\u0010|\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010y\u001a\u0004\bz\u0010{\"\u001a\u0010~\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010y\u001a\u0004\b}\u0010{\"\u001b\u0010\u0080\u0001\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010y\u001a\u0004\b\u007f\u0010{\" \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0018\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001\"\u0017\u0010\u0089\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0083\u0001\"\u0015\u0010\u008a\u0001\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010y\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008b\u0001²\u0006\u000e\u0010f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "rl", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "KN", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "selectedDateMillis", "displayedMonthMillis", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dateInMillis", "onDateSelectionChange", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "qie", "(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "t", "(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "J2", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "xMQ", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "s7N", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "az", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/internal/CalendarMonth;", "month", "todayMillis", "startDateMillis", "endDateMillis", "Landroidx/compose/material3/SelectedRangeInfo;", "rangeSelectionInfo", "mUb", "(Landroidx/compose/material3/internal/CalendarMonth;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "", "nHg", "(Lkotlin/ranges/IntRange;)I", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "", "e", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "Uo", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "year", "onYearSelected", "HI", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "currentYear", "ty", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "gh", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "expanded", "ck", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "LGJW/vd;", "coroutineScope", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "E2", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;LGJW/vd;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "F", "N", "()F", "RecommendedSizeForAccessibility", "getMonthYearHeight", "MonthYearHeight", "X", "DatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "nr", "Landroidx/compose/foundation/layout/PaddingValues;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "O", "DatePickerTitlePadding", "DatePickerHeadlinePadding", "YearsVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2272:1\n1223#2,6:2273\n1223#2,6:2279\n1223#2,6:2285\n1223#2,6:2331\n1223#2,6:2337\n1223#2,6:2346\n1223#2,6:2352\n1223#2,3:2363\n1226#2,3:2369\n1223#2,6:2410\n1223#2,6:2416\n1223#2,6:2422\n1223#2,6:2552\n1223#2,6:2558\n1223#2,6:2600\n1223#2,6:2650\n1223#2,6:2724\n1223#2,6:2730\n1223#2,6:2736\n1223#2,6:2754\n1223#2,6:2760\n1223#2,6:2766\n85#3:2291\n82#3,6:2292\n88#3:2326\n92#3:2330\n85#3:2373\n81#3,7:2374\n88#3:2409\n85#3:2465\n82#3,6:2466\n88#3:2500\n92#3:2504\n92#3:2512\n85#3:2513\n83#3,5:2514\n88#3:2547\n92#3:2551\n85#3:2657\n83#3,5:2658\n88#3:2691\n92#3:2749\n78#4,6:2298\n85#4,4:2313\n89#4,2:2323\n93#4:2329\n78#4,6:2381\n85#4,4:2396\n89#4,2:2406\n78#4,6:2436\n85#4,4:2451\n89#4,2:2461\n78#4,6:2472\n85#4,4:2487\n89#4,2:2497\n93#4:2503\n93#4:2507\n93#4:2511\n78#4,6:2519\n85#4,4:2534\n89#4,2:2544\n93#4:2550\n78#4,6:2567\n85#4,4:2582\n89#4,2:2592\n78#4,6:2612\n85#4,4:2627\n89#4,2:2637\n93#4:2643\n93#4:2648\n78#4,6:2663\n85#4,4:2678\n89#4,2:2688\n78#4,6:2695\n85#4,4:2710\n89#4,2:2720\n93#4:2744\n93#4:2748\n78#4,6:2775\n85#4,4:2790\n89#4,2:2800\n93#4:2806\n368#5,9:2304\n377#5:2325\n378#5,2:2327\n368#5,9:2387\n377#5:2408\n368#5,9:2442\n377#5:2463\n368#5,9:2478\n377#5:2499\n378#5,2:2501\n378#5,2:2505\n378#5,2:2509\n368#5,9:2525\n377#5:2546\n378#5,2:2548\n368#5,9:2573\n377#5:2594\n368#5,9:2618\n377#5:2639\n378#5,2:2641\n378#5,2:2646\n368#5,9:2669\n377#5:2690\n368#5,9:2701\n377#5:2722\n378#5,2:2742\n378#5,2:2746\n368#5,9:2781\n377#5:2802\n378#5,2:2804\n4032#6,6:2317\n4032#6,6:2400\n4032#6,6:2455\n4032#6,6:2491\n4032#6,6:2538\n4032#6,6:2586\n4032#6,6:2631\n4032#6,6:2682\n4032#6,6:2714\n4032#6,6:2794\n77#7:2343\n77#7:2808\n1#8:2344\n148#9:2345\n148#9:2812\n148#9:2813\n148#9:2814\n148#9:2815\n148#9:2816\n148#9:2817\n148#9:2818\n488#10:2358\n487#10,4:2359\n491#10,2:2366\n495#10:2372\n487#11:2368\n71#12:2428\n67#12,7:2429\n74#12:2464\n78#12:2508\n71#12:2606\n69#12,5:2607\n74#12:2640\n78#12:2644\n98#13,3:2564\n101#13:2595\n105#13:2649\n98#13,3:2692\n101#13:2723\n105#13:2745\n98#13,3:2772\n101#13:2803\n105#13:2807\n33#14,4:2596\n38#14:2645\n86#15:2656\n156#16:2750\n159#16:2751\n168#16:2752\n114#16:2753\n81#17:2809\n107#17,2:2810\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n172#1:2273,6\n191#1:2279,6\n367#1:2285,6\n1364#1:2331,6\n1371#1:2337,6\n1408#1:2346,6\n1498#1:2352,6\n1510#1:2363,3\n1510#1:2369,3\n1524#1:2410,6\n1536#1:2416,6\n1548#1:2422,6\n1660#1:2552,6\n1697#1:2558,6\n1751#1:2600,6\n1786#1:2650,6\n1831#1:2724,6\n1859#1:2730,6\n1865#1:2736,6\n1952#1:2754,6\n2100#1:2760,6\n2118#1:2766,6\n1310#1:2291\n1310#1:2292,6\n1310#1:2326\n1310#1:2330\n1513#1:2373\n1513#1:2374,7\n1513#1:2409\n1553#1:2465\n1553#1:2466,6\n1553#1:2500\n1553#1:2504\n1513#1:2512\n1630#1:2513\n1630#1:2514,5\n1630#1:2547\n1630#1:2551\n1796#1:2657\n1796#1:2658,5\n1796#1:2691\n1796#1:2749\n1310#1:2298,6\n1310#1:2313,4\n1310#1:2323,2\n1310#1:2329\n1513#1:2381,6\n1513#1:2396,4\n1513#1:2406,2\n1552#1:2436,6\n1552#1:2451,4\n1552#1:2461,2\n1553#1:2472,6\n1553#1:2487,4\n1553#1:2497,2\n1553#1:2503\n1552#1:2507\n1513#1:2511\n1630#1:2519,6\n1630#1:2534,4\n1630#1:2544,2\n1630#1:2550\n1742#1:2567,6\n1742#1:2582,4\n1742#1:2592,2\n1749#1:2612,6\n1749#1:2627,4\n1749#1:2637,2\n1749#1:2643\n1742#1:2648\n1796#1:2663,6\n1796#1:2678,4\n1796#1:2688,2\n1803#1:2695,6\n1803#1:2710,4\n1803#1:2720,2\n1803#1:2744\n1796#1:2748\n2152#1:2775,6\n2152#1:2790,4\n2152#1:2800,2\n2152#1:2806\n1310#1:2304,9\n1310#1:2325\n1310#1:2327,2\n1513#1:2387,9\n1513#1:2408\n1552#1:2442,9\n1552#1:2463\n1553#1:2478,9\n1553#1:2499\n1553#1:2501,2\n1552#1:2505,2\n1513#1:2509,2\n1630#1:2525,9\n1630#1:2546\n1630#1:2548,2\n1742#1:2573,9\n1742#1:2594\n1749#1:2618,9\n1749#1:2639\n1749#1:2641,2\n1742#1:2646,2\n1796#1:2669,9\n1796#1:2690\n1803#1:2701,9\n1803#1:2722\n1803#1:2742,2\n1796#1:2746,2\n2152#1:2781,9\n2152#1:2802\n2152#1:2804,2\n1310#1:2317,6\n1513#1:2400,6\n1552#1:2455,6\n1553#1:2491,6\n1630#1:2538,6\n1742#1:2586,6\n1749#1:2631,6\n1796#1:2682,6\n1803#1:2714,6\n2152#1:2794,6\n1400#1:2343\n2213#1:2808\n1400#1:2345\n2260#1:2812\n2261#1:2813\n2262#1:2814\n2263#1:2815\n2265#1:2816\n2266#1:2817\n2268#1:2818\n1510#1:2358\n1510#1:2359,4\n1510#1:2366,2\n1510#1:2372\n1510#1:2368\n1552#1:2428\n1552#1:2429,7\n1552#1:2464\n1552#1:2508\n1749#1:2606\n1749#1:2607,5\n1749#1:2640\n1749#1:2644\n1742#1:2564,3\n1742#1:2595\n1742#1:2649\n1803#1:2692,3\n1803#1:2723\n1803#1:2745\n2152#1:2772,3\n2152#1:2803\n2152#1:2807\n1748#1:2596,4\n1748#1:2645\n1798#1:2656\n1915#1:2750\n1917#1:2751\n1919#1:2752\n1924#1:2753\n1511#1:2809\n1511#1:2810,2\n*E\n"})
public final class DatePickerKt {
    private static final PaddingValues J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final PaddingValues f25216O;
    private static final float Uo;
    private static final PaddingValues nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f25218t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f25217n = Dp.KN(48);
    private static final float rl = Dp.KN(56);

    static {
        float f3 = 12;
        f25218t = Dp.KN(f3);
        nr = PaddingKt.O(0.0f, 0.0f, Dp.KN(f3), Dp.KN(f3), 3, null);
        float f4 = 24;
        float f5 = 16;
        f25216O = PaddingKt.O(Dp.KN(f4), Dp.KN(f5), Dp.KN(f3), 0.0f, 8, null);
        J2 = PaddingKt.O(Dp.KN(f4), 0.0f, Dp.KN(f3), Dp.KN(f3), 2, null);
        Uo = Dp.KN(f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List E2(final LazyGridState lazyGridState, final vd vdVar, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", f = "DatePicker.kt", i = {}, l = {2242}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f25472n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ LazyGridState f25473t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyGridState lazyGridState, Continuation continuation) {
                    super(2, continuation);
                    this.f25473t = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f25473t, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f25472n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        LazyGridState lazyGridState = this.f25473t;
                        int iR = lazyGridState.r() - 3;
                        this.f25472n = 1;
                        if (LazyGridState.s7N(lazyGridState, iR, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                boolean z2;
                if (lazyGridState.nr()) {
                    C.nr(vdVar, null, null, new AnonymousClass1(lazyGridState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1", f = "DatePicker.kt", i = {}, l = {2250}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f25468n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ LazyGridState f25469t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyGridState lazyGridState, Continuation continuation) {
                    super(2, continuation);
                    this.f25469t = lazyGridState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f25469t, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f25468n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        LazyGridState lazyGridState = this.f25469t;
                        int iR = lazyGridState.r() + 3;
                        this.f25468n = 1;
                        if (LazyGridState.s7N(lazyGridState, iR, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                boolean z2;
                if (lazyGridState.J2()) {
                    C.nr(vdVar, null, null, new AnonymousClass1(lazyGridState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        })});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(final Modifier modifier, final long j2, final Function1 function1, final SelectableDates selectableDates, final CalendarModel calendarModel, final IntRange intRange, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        Function1 function12;
        SelectableDates selectableDates2;
        CalendarModel calendarModel2;
        IntRange intRange2;
        DatePickerColors datePickerColors2;
        Composer composerKN = composer.KN(-1286899812);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= composerKN.E2(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i2 & 3072) == 0) {
            selectableDates2 = selectableDates;
            i3 |= composerKN.p5(selectableDates2) ? 2048 : 1024;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i2 & 24576) == 0) {
            calendarModel2 = calendarModel;
            i3 |= composerKN.E2(calendarModel2) ? 16384 : 8192;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((196608 & i2) == 0) {
            intRange2 = intRange;
            i3 |= composerKN.E2(intRange2) ? 131072 : 65536;
        } else {
            intRange2 = intRange;
        }
        if ((1572864 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= composerKN.p5(datePickerColors2) ? 1048576 : 524288;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1286899812, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2003)");
            }
            final Modifier modifier3 = modifier2;
            final Function1 function13 = function12;
            final SelectableDates selectableDates3 = selectableDates2;
            final CalendarModel calendarModel3 = calendarModel2;
            final IntRange intRange3 = intRange2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            TextKt.n(TypographyKt.t(DatePickerModalTokens.f29490n.te(), composerKN, 6), ComposableLambdaKt.nr(1301915789, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1301915789, i5, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:2005)");
                    }
                    CalendarModel calendarModel4 = calendarModel3;
                    final int year = calendarModel4.KN(calendarModel4.xMQ()).getYear();
                    final int year2 = calendarModel3.Uo(j2).getYear();
                    final LazyGridState lazyGridStateRl = LazyGridStateKt.rl(Math.max(0, (year2 - intRange3.getFirst()) - 3), 0, composer2, 0, 2);
                    long containerColor = datePickerColors3.getContainerColor();
                    Object objIF = composer2.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.o(compositionScopedCoroutineScopeCanceller);
                        objIF = compositionScopedCoroutineScopeCanceller;
                    }
                    final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    final String strN = Strings_androidKt.n(Strings.n(R.string.f27137r), composer2, 0);
                    final String strN2 = Strings_androidKt.n(Strings.n(R.string.f27136o), composer2, 0);
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    Modifier modifierNr = SemanticsModifierKt.nr(BackgroundKt.nr(modifier3, containerColor, null, 2, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.UhV(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.1.2
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    Arrangement arrangement = Arrangement.f17400n;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalO = arrangement.O();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(DatePickerKt.Uo);
                    boolean zE2 = composer2.E2(intRange3) | composer2.p5(lazyGridStateRl) | composer2.E2(coroutineScope) | composer2.p5(strN) | composer2.p5(strN2) | composer2.t(year2) | composer2.t(year) | composer2.p5(function13) | composer2.p5(selectableDates3) | composer2.p5(datePickerColors3);
                    final IntRange intRange4 = intRange3;
                    final Function1 function14 = function13;
                    final SelectableDates selectableDates4 = selectableDates3;
                    final DatePickerColors datePickerColors4 = datePickerColors3;
                    Object objIF2 = composer2.iF();
                    if (zE2 || objIF2 == companion.n()) {
                        Object obj = new Function1<LazyGridScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                                n(lazyGridScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(LazyGridScope lazyGridScope) {
                                int iCount = CollectionsKt.count(intRange4);
                                final IntRange intRange5 = intRange4;
                                final LazyGridState lazyGridState = lazyGridStateRl;
                                final vd vdVar = coroutineScope;
                                final String str = strN;
                                final String str2 = strN2;
                                final int i7 = year2;
                                final int i8 = year;
                                final Function1 function15 = function14;
                                final SelectableDates selectableDates5 = selectableDates4;
                                final DatePickerColors datePickerColors5 = datePickerColors4;
                                LazyGridScope.KN(lazyGridScope, iCount, null, null, null, ComposableLambdaKt.rl(1040623618, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                        n(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LazyGridItemScope lazyGridItemScope, final int i9, Composer composer3, int i10) {
                                        int i11;
                                        if ((i10 & 48) == 0) {
                                            i11 = i10 | (composer3.t(i9) ? 32 : 16);
                                        } else {
                                            i11 = i10;
                                        }
                                        if ((i11 & 145) == 144 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1040623618, i11, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2034)");
                                        }
                                        final int first = i9 + intRange5.getFirst();
                                        final String strT = CalendarLocale_jvmKt.t(first, 0, 0, false, 7, null);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
                                        Modifier modifierCk = SizeKt.ck(companion3, datePickerModalTokens.g(), datePickerModalTokens.nY());
                                        boolean zP5 = ((i11 & 112) == 32) | composer3.p5(lazyGridState) | composer3.E2(vdVar) | composer3.p5(str) | composer3.p5(str2);
                                        final LazyGridState lazyGridState2 = lazyGridState;
                                        final vd vdVar2 = vdVar;
                                        final String str3 = str;
                                        final String str4 = str2;
                                        Object objIF3 = composer3.iF();
                                        if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                                            Function1<SemanticsPropertyReceiver, Unit> function16 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    n(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    LazyGridItemInfo lazyGridItemInfo;
                                                    SemanticsPropertiesKt.Nxk(semanticsPropertyReceiver, (lazyGridState2.r() == i9 || ((lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull(lazyGridState2.WPU().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == i9)) ? DatePickerKt.E2(lazyGridState2, vdVar2, str3, str4) : CollectionsKt.emptyList());
                                                }
                                            };
                                            composer3.o(function16);
                                            objIF3 = function16;
                                        }
                                        Modifier modifierNr2 = SemanticsModifierKt.nr(modifierCk, false, (Function1) objIF3, 1, null);
                                        boolean z2 = first == i7;
                                        boolean z3 = first == i8;
                                        boolean zP52 = composer3.p5(function15) | composer3.t(first);
                                        final Function1 function17 = function15;
                                        Object objIF4 = composer3.iF();
                                        if (zP52 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$2$1
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
                                                    function17.invoke(Integer.valueOf(first));
                                                }
                                            };
                                            composer3.o(objIF4);
                                        }
                                        Function0 function0 = (Function0) objIF4;
                                        boolean zN = selectableDates5.n(first);
                                        Strings.Companion companion4 = Strings.INSTANCE;
                                        String str5 = String.format(Strings_androidKt.n(Strings.n(R.string.ck), composer3, 0), Arrays.copyOf(new Object[]{strT}, 1));
                                        Intrinsics.checkNotNullExpressionValue(str5, "format(this, *args)");
                                        DatePickerKt.ty(modifierNr2, z2, z3, function0, zN, str5, datePickerColors5, ComposableLambdaKt.nr(882189459, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i12) {
                                                if ((i12 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(882189459, i12, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2074)");
                                                }
                                                TextKt.t(strT, SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3.1
                                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        n(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 130556);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582912);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }), 14, null);
                            }
                        };
                        composer2.o(obj);
                        objIF2 = obj;
                    }
                    LazyGridDslKt.nr(fixed, modifierNr, lazyGridStateRl, null, false, horizontalOrVerticalTy, horizontalOrVerticalO, null, false, (Function1) objIF2, composer2, 1769472, 408);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    DatePickerKt.HI(modifier, j2, function1, selectableDates, calendarModel, intRange, datePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void J2(final Modifier modifier, final Function2 function2, final long j2, long j3, final float f3, final Function2 function22, Composer composer, final int i2) {
        int i3;
        final long j4;
        Composer composerKN = composer.KN(-996037719);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            j4 = j3;
            i3 |= composerKN.nr(j4) ? 2048 : 1024;
        } else {
            j4 = j3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.rl(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function22) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-996037719, i3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1621)");
            }
            Modifier modifierZmq = SizeKt.KN(modifier, 0.0f, 1, null).Zmq(function2 != null ? SizeKt.rl(Modifier.INSTANCE, 0.0f, f3, 1, null) : Modifier.INSTANCE);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.nr(), Alignment.INSTANCE.gh(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composerKN.eF(594325590);
            if (function2 != null) {
                ProvideContentColorTextStyleKt.n(j2, TypographyKt.t(DatePickerModalTokens.f29490n.o(), composerKN, 6), ComposableLambdaKt.nr(1936268514, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1936268514, i5, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1636)");
                        }
                        Alignment alignmentNr = Alignment.INSTANCE.nr();
                        Function2 function23 = function2;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentNr, false);
                        int iN2 = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion3.n();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer2.T();
                        if (composer2.getInserting()) {
                            composer2.s7N(function0N2);
                        } else {
                            composer2.r();
                        }
                        Composer composerN2 = Updater.n(composer2);
                        Updater.O(composerN2, measurePolicyUo, companion3.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                        Function2 function2Rl2 = companion3.rl();
                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion3.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        function23.invoke(composer2, 0);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, ((i3 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
            }
            composerKN.Xw();
            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j4)), function22, composerKN, ProvidedValue.xMQ | ((i3 >> 12) & 112));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    DatePickerKt.J2(modifier, function2, j2, j4, f3, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float N() {
        return f25217n;
    }

    public static final PaddingValues T() {
        return nr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final Modifier modifier, final boolean z2, final Function0 function0, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final String str, final DatePickerColors datePickerColors, final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z7;
        boolean z9;
        boolean z10;
        DatePickerColors datePickerColors2;
        Composer composerKN = composer.KN(-1434777861);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z7 = z3;
            i3 |= composerKN.n(z7) ? 2048 : 1024;
        } else {
            z7 = z3;
        }
        if ((i2 & 24576) == 0) {
            z9 = z4;
            i3 |= composerKN.n(z9) ? 16384 : 8192;
        } else {
            z9 = z4;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.n(z5) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z10 = z6;
            i3 |= composerKN.n(z10) ? 1048576 : 524288;
        } else {
            z10 = z6;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.p5(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= composerKN.p5(datePickerColors2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerKN.E2(function2) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((306783379 & i5) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1434777861, i5, -1, "androidx.compose.material3.Day (DatePicker.kt:1941)");
            }
            boolean z11 = (29360128 & i5) == 8388608;
            Object objIF = composerKN.iF();
            if (z11 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.Jk(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                    }
                };
                composerKN.o(objIF);
            }
            Modifier modifierT = SemanticsModifierKt.t(modifier, true, (Function1) objIF);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
            Shape shapeO = ShapesKt.O(datePickerModalTokens.O(), composerKN, 6);
            int i7 = i5 >> 3;
            int i8 = i5 >> 15;
            long value = ((Color) datePickerColors2.n(z2, z9, z7, composerKN, (i8 & 7168) | (i7 & 14) | ((i5 >> 9) & 112) | (i7 & 896)).getValue()).getValue();
            int i9 = i5 >> 12;
            SurfaceKt.rl(z2, function0, modifierT, z4, shapeO, value, ((Color) datePickerColors.rl(z5, z2, z10, z4, composerKN, (i8 & 14) | (i5 & 112) | (i9 & 896) | (i7 & 7168) | (i9 & 57344)).getValue()).getValue(), 0.0f, 0.0f, (!z5 || z2) ? null : BorderStrokeKt.n(datePickerModalTokens.qie(), datePickerColors.getTodayDateBorderColor()), null, ComposableLambdaKt.nr(-2031780827, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Day$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i10) {
                    if ((i10 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-2031780827, i10, -1, "androidx.compose.material3.Day.<anonymous> (DatePicker.kt:1980)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    DatePickerModalTokens datePickerModalTokens2 = DatePickerModalTokens.f29490n;
                    Modifier modifierCk = SizeKt.ck(companion, datePickerModalTokens2.mUb(), datePickerModalTokens2.xMQ());
                    Alignment alignmentO = Alignment.INSTANCE.O();
                    Function2 function22 = function2;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                    int iN = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierCk);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N);
                    } else {
                        composer2.r();
                    }
                    Composer composerN = Updater.n(composer2);
                    Updater.O(composerN, measurePolicyUo, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    function22.invoke(composer2, 0);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, i7 & 7294, 48, 1408);
            composerKN = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Day$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i10) {
                    DatePickerKt.Uo(modifier, z2, function0, z3, z4, z5, z6, str, datePickerColors, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float X() {
        return f25218t;
    }

    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    public static final void az(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i2) {
        Composer composer2;
        boolean z2 = true;
        Composer composerKN = composer.KN(-1849465391);
        int i3 = (i2 & 6) == 0 ? (composerKN.p5(datePickerColors) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(calendarModel) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1849465391, i3, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1728)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i5 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i7 = i5; i7 < size; i7++) {
                arrayList.add(weekdayNames.get(i7));
            }
            ?? r9 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                arrayList.add(weekdayNames.get(i8));
            }
            TextStyle textStyleT = TypographyKt.t(DatePickerModalTokens.f29490n.T(), composerKN, 6);
            Alignment alignment = null;
            Modifier modifierKN = SizeKt.KN(SizeKt.rl(Modifier.INSTANCE, 0.0f, f25217n, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.O(), Alignment.INSTANCE.xMQ(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composerKN.eF(396197267);
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                final Pair pair = (Pair) arrayList.get(i9);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zP5 = composerKN.p5(pair);
                Object objIF = composerKN.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.I(semanticsPropertyReceiver, (String) pair.getFirst());
                        }
                    };
                    composerKN.o(objIF);
                }
                Modifier modifierN = SemanticsModifierKt.n(companion2, (Function1) objIF);
                float f3 = f25217n;
                Modifier modifierS = SizeKt.S(modifierN, f3, f3);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), r9);
                int iN2 = ComposablesKt.n(composerKN, r9);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierS);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                boolean z3 = z2;
                Function0 function0N2 = companion3.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N2);
                } else {
                    composerKN.r();
                }
                Composer composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyUo, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                Composer composer3 = composerKN;
                TextKt.t((String) pair.getSecond(), SizeKt.E2(companion2, alignment, false, 3, alignment), datePickerColors.getWeekdayContentColor(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, textStyleT, composer3, 48, 0, 65016);
                composer3.XQ();
                i9++;
                composerKN = composer3;
                z2 = z3;
                r9 = 0;
                alignment = alignment;
                arrayList = arrayList;
            }
            composer2 = composerKN;
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    n(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer4, int i10) {
                    DatePickerKt.az(datePickerColors, calendarModel, composer4, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ck(final Function0 function0, final boolean z2, Modifier modifier, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(409654418);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(function2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(409654418, i5, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2207)");
                }
                modifier2 = modifier3;
                ButtonKt.O(function02, modifier2, false, RoundedCornerShapeKt.J2(), ButtonDefaults.f24588n.nY(0L, ((Color) composerKN.ty(ContentColorKt.n())).getValue(), 0L, 0L, composerKN, 24576, 13), null, null, null, null, ComposableLambdaKt.nr(1899012021, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        n(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(RowScope rowScope, Composer composer2, int i8) {
                        String strN;
                        if ((i8 & 17) == 16 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1899012021, i8, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2216)");
                        }
                        function2.invoke(composer2, 0);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        SpacerKt.n(SizeKt.Z(companion, ButtonDefaults.f24588n.ck()), composer2, 6);
                        ImageVector imageVectorN = ArrowDropDownKt.n(Icons.Filled.f23862n);
                        if (z2) {
                            composer2.eF(-1360040181);
                            Strings.Companion companion2 = Strings.INSTANCE;
                            strN = Strings_androidKt.n(Strings.n(R.string.XQ), composer2, 0);
                            composer2.Xw();
                        } else {
                            composer2.eF(-1359945910);
                            Strings.Companion companion3 = Strings.INSTANCE;
                            strN = Strings_androidKt.n(Strings.n(R.string.ViF), composer2, 0);
                            composer2.Xw();
                        }
                        IconKt.nr(imageVectorN, strN, RotateKt.n(companion, z2 ? 180.0f : 0.0f), 0L, composer2, 0, 8);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | 807075840 | ((i5 >> 3) & 112), 388);
                composerKN = composerKN;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2
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
                        DatePickerKt.ck(function0, z2, modifier4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i3 & 8) == 0) {
        }
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            modifier2 = modifier3;
            ButtonKt.O(function02, modifier2, false, RoundedCornerShapeKt.J2(), ButtonDefaults.f24588n.nY(0L, ((Color) composerKN.ty(ContentColorKt.n())).getValue(), 0L, 0L, composerKN, 24576, 13), null, null, null, null, ComposableLambdaKt.nr(1899012021, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    n(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(RowScope rowScope, Composer composer2, int i8) {
                    String strN;
                    if ((i8 & 17) == 16 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1899012021, i8, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:2216)");
                    }
                    function2.invoke(composer2, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    SpacerKt.n(SizeKt.Z(companion, ButtonDefaults.f24588n.ck()), composer2, 6);
                    ImageVector imageVectorN = ArrowDropDownKt.n(Icons.Filled.f23862n);
                    if (z2) {
                        composer2.eF(-1360040181);
                        Strings.Companion companion2 = Strings.INSTANCE;
                        strN = Strings_androidKt.n(Strings.n(R.string.XQ), composer2, 0);
                        composer2.Xw();
                    } else {
                        composer2.eF(-1359945910);
                        Strings.Companion companion3 = Strings.INSTANCE;
                        strN = Strings_androidKt.n(Strings.n(R.string.ViF), composer2, 0);
                        composer2.Xw();
                    }
                    IconKt.nr(imageVectorN, strN, RotateKt.n(companion, z2 ? 180.0f : 0.0f), 0L, composer2, 0, 8);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, (i5 & 14) | 807075840 | ((i5 >> 3) & 112), 388);
            composerKN = composerKN;
            if (ComposerKt.v()) {
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(final Modifier modifier, final boolean z2, final boolean z3, final boolean z4, final String str, final Function0 function0, final Function0 function02, final Function0 function03, DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        final String str2;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        DatePickerColors datePickerColors2;
        Composer composerKN = composer.KN(-773929258);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            str2 = str;
            i3 |= composerKN.p5(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i2) == 0) {
            function04 = function0;
            i3 |= composerKN.E2(function04) ? 131072 : 65536;
        } else {
            function04 = function0;
        }
        if ((1572864 & i2) == 0) {
            function05 = function02;
            i3 |= composerKN.E2(function05) ? 1048576 : 524288;
        } else {
            function05 = function02;
        }
        if ((12582912 & i2) == 0) {
            function06 = function03;
            i3 |= composerKN.E2(function06) ? 8388608 : 4194304;
        } else {
            function06 = function03;
        }
        if ((100663296 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= composerKN.p5(datePickerColors2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((38347923 & i3) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-773929258, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2150)");
            }
            Modifier modifierQie = SizeKt.qie(SizeKt.KN(modifier, 0.0f, 1, null), rl);
            MeasurePolicy measurePolicyRl = RowKt.rl(z4 ? Arrangement.f17400n.J2() : Arrangement.f17400n.nr(), Alignment.INSTANCE.xMQ(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierQie);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            final Function0 function07 = function05;
            final Function0 function08 = function04;
            final Function0 function09 = function06;
            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(datePickerColors2.getNavigationContentColor())), ComposableLambdaKt.nr(-962805198, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-962805198, i5, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2163)");
                    }
                    Function0 function010 = function09;
                    boolean z5 = z4;
                    final String str3 = str2;
                    DatePickerKt.ck(function010, z5, null, ComposableLambdaKt.nr(1377272806, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1377272806, i7, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:2167)");
                            }
                            String str4 = str3;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            boolean zP5 = composer3.p5(str4);
                            final String str5 = str3;
                            Object objIF = composer3.iF();
                            if (zP5 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.ijL(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.rl());
                                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, str5);
                                    }
                                };
                                composer3.o(objIF);
                            }
                            TextKt.t(str4, SemanticsModifierKt.nr(companion2, false, (Function1) objIF, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131068);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), composer2, 3072, 4);
                    if (!z4) {
                        Function0 function011 = function07;
                        boolean z6 = z3;
                        Function0 function012 = function08;
                        boolean z7 = z2;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer2, 0);
                        int iN2 = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composer2, companion2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion3.n();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composer2.T();
                        if (composer2.getInserting()) {
                            composer2.s7N(function0N2);
                        } else {
                            composer2.r();
                        }
                        Composer composerN2 = Updater.n(composer2);
                        Updater.O(composerN2, measurePolicyRl2, companion3.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                        Function2 function2Rl2 = companion3.rl();
                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion3.nr());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                        ComposableSingletons$DatePickerKt composableSingletons$DatePickerKt = ComposableSingletons$DatePickerKt.f25072n;
                        IconButtonKt.O(function011, null, z6, null, null, composableSingletons$DatePickerKt.t(), composer2, 196608, 26);
                        IconButtonKt.O(function012, null, z7, null, null, composableSingletons$DatePickerKt.nr(), composer2, 196608, 26);
                        composer2.XQ();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final DatePickerColors datePickerColors3 = datePickerColors2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    DatePickerKt.gh(modifier, z2, z3, z4, str, function0, function02, function03, datePickerColors3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(final CalendarMonth calendarMonth, final Function1 function1, final long j2, final Long l2, final Long l5, final SelectedRangeInfo selectedRangeInfo, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        CalendarMonth calendarMonth2;
        int i3;
        int i5;
        Modifier modifierNr;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        Locale locale;
        Composer composer3;
        int i10;
        int i11;
        boolean z2;
        Object obj;
        boolean zBooleanValue;
        Locale locale2;
        boolean z3;
        boolean z4;
        Object objO;
        final Function1 function12 = function1;
        Long l6 = l5;
        Composer composerKN = composer.KN(-1912870997);
        if ((i2 & 6) == 0) {
            calendarMonth2 = calendarMonth;
            i3 = i2 | (composerKN.p5(calendarMonth2) ? 4 : 2);
        } else {
            calendarMonth2 = calendarMonth;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function12) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(l2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(l6) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(selectedRangeInfo) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.p5(selectableDates) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.p5(datePickerColors) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i12 = i3;
        if ((i12 & 38347923) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1912870997, i12, -1, "androidx.compose.material3.Month (DatePicker.kt:1782)");
            }
            composerKN.eF(1821433443);
            if (selectedRangeInfo != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                i5 = 234881024;
                boolean z5 = ((i12 & 234881024) == 67108864) | ((i12 & 458752) == 131072);
                Object objIF = composerKN.iF();
                if (z5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Month$rangeSelectionDrawModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            n(contentDrawScope);
                            return Unit.INSTANCE;
                        }

                        public final void n(ContentDrawScope contentDrawScope) {
                            DateRangePickerKt.az(contentDrawScope, selectedRangeInfo, datePickerColors.getDayInSelectionRangeContainerColor());
                            contentDrawScope.l2();
                        }
                    };
                    composerKN.o(objIF);
                }
                modifierNr = DrawModifierKt.nr(companion, (Function1) objIF);
            } else {
                i5 = 234881024;
                modifierNr = Modifier.INSTANCE;
            }
            composerKN.Xw();
            Locale localeN = CalendarLocale_androidKt.n(composerKN, 0);
            Modifier modifierZmq = SizeKt.qie(Modifier.INSTANCE, Dp.KN(f25217n * 6)).Zmq(modifierNr);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.O(), Alignment.INSTANCE.gh(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            composerKN.eF(-647461340);
            int i13 = 0;
            int i14 = 0;
            int i15 = 6;
            while (i14 < i15) {
                Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.O(), Alignment.INSTANCE.xMQ(), composerKN, 54);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierKN);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion3.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N2);
                } else {
                    composerKN.r();
                }
                Composer composerN2 = Updater.n(composerKN);
                int i16 = i13;
                Updater.O(composerN2, measurePolicyRl, companion3.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                Function2 function2Rl2 = companion3.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion3.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composerKN.eF(-88395975);
                int i17 = i16;
                int i18 = 0;
                while (i18 < 7) {
                    if (i17 < calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth() || i17 >= calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth2.getNumberOfDays()) {
                        i7 = i17;
                        i8 = i14;
                        i9 = i18;
                        locale = localeN;
                        composer3 = composerKN;
                        i10 = i12;
                        composer3.eF(1554856342);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        float f3 = f25217n;
                        SpacerKt.n(SizeKt.ck(companion4, f3, f3), composer3, 6);
                        composer3.Xw();
                    } else {
                        composerKN.eF(1555370911);
                        final int daysFromStartOfWeekToFirstOfMonth = i17 - calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth();
                        i7 = i17;
                        int i19 = i14;
                        final long startUtcTimeMillis = calendarMonth2.getStartUtcTimeMillis() + (((long) daysFromStartOfWeekToFirstOfMonth) * SignalManager.TWENTY_FOUR_HOURS_MILLIS);
                        boolean z6 = startUtcTimeMillis == j2;
                        boolean z7 = l2 != null && startUtcTimeMillis == l2.longValue();
                        if (l6 != null && startUtcTimeMillis == l6.longValue()) {
                            i11 = i12;
                            z2 = true;
                        } else {
                            i11 = i12;
                            z2 = false;
                        }
                        i9 = i18;
                        composerKN.eF(-88360892);
                        if (selectedRangeInfo != null) {
                            i8 = i19;
                            boolean zNr = ((i11 & 458752) == 131072) | composerKN.nr(startUtcTimeMillis);
                            Object objIF2 = composerKN.iF();
                            if (zNr || objIF2 == Composer.INSTANCE.n()) {
                                if (startUtcTimeMillis < (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                                    z4 = false;
                                    obj = null;
                                    objO = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z4), null, 2, null);
                                    composerKN.o(objO);
                                } else {
                                    if (startUtcTimeMillis <= (l6 != null ? l6.longValue() : Long.MIN_VALUE)) {
                                        z4 = true;
                                    }
                                    obj = null;
                                    objO = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z4), null, 2, null);
                                    composerKN.o(objO);
                                }
                            } else {
                                objO = objIF2;
                                obj = null;
                            }
                            zBooleanValue = ((Boolean) ((MutableState) objO).getValue()).booleanValue();
                        } else {
                            i8 = i19;
                            obj = null;
                            zBooleanValue = false;
                        }
                        composerKN.Xw();
                        Composer composer4 = composerKN;
                        i10 = i11;
                        String strE = e(selectedRangeInfo != null, z6, z7, z2, zBooleanValue, composer4, 0);
                        boolean z9 = z2;
                        boolean z10 = z6;
                        boolean z11 = zBooleanValue;
                        String strT = datePickerFormatter.t(Long.valueOf(startUtcTimeMillis), localeN, true);
                        if (strT == null) {
                            strT = FlTC.FYtxlpezVRfTTJ;
                        }
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        if (z7 || z9) {
                            locale2 = localeN;
                            z3 = true;
                        } else {
                            locale2 = localeN;
                            z3 = false;
                        }
                        Locale locale3 = locale2;
                        boolean zNr2 = ((i10 & 112) == 32) | composer4.nr(startUtcTimeMillis);
                        Object objIF3 = composer4.iF();
                        if (zNr2 || objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$Month$1$1$1$1
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
                                    function12.invoke(Long.valueOf(startUtcTimeMillis));
                                }
                            };
                            composer4.o(objIF3);
                        }
                        Function0 function0 = (Function0) objIF3;
                        boolean zNr3 = composer4.nr(startUtcTimeMillis) | ((i10 & 29360128) == 8388608);
                        Object objIF4 = composer4.iF();
                        if (zNr3 || objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = Boolean.valueOf(selectableDates.n(calendarMonth.getYear()) && selectableDates.rl(startUtcTimeMillis));
                            composer4.o(objIF4);
                        }
                        boolean zBooleanValue2 = ((Boolean) objIF4).booleanValue();
                        if (strE != null) {
                            strT = strE + ", " + strT;
                        }
                        locale = locale3;
                        Uo(companion5, z3, function0, z7, zBooleanValue2, z10, z11, strT, datePickerColors, ComposableLambdaKt.nr(-2095706591, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Month$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                n(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer5, int i20) {
                                if ((i20 & 3) == 2 && composer5.xMQ()) {
                                    composer5.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-2095706591, i20, -1, "androidx.compose.material3.Month.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1883)");
                                }
                                TextKt.t(CalendarLocale_jvmKt.t(daysFromStartOfWeekToFirstOfMonth + 1, 0, 0, false, 7, null), SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Month$1$1$3.1
                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                }), 0L, 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, null, composer5, 0, 0, 130556);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer4, 54), composer4, 805306374 | (i10 & i5));
                        composer3 = composer4;
                        composer3.Xw();
                    }
                    calendarMonth2 = calendarMonth;
                    l6 = l5;
                    localeN = locale;
                    i17 = i7 + 1;
                    i18 = i9 + 1;
                    composerKN = composer3;
                    i12 = i10;
                    i14 = i8;
                    function12 = function1;
                }
                Composer composer5 = composerKN;
                i15 = 6;
                composer5.Xw();
                composer5.XQ();
                i14++;
                calendarMonth2 = calendarMonth;
                function12 = function1;
                l6 = l5;
                i13 = i17;
            }
            composer2 = composerKN;
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Month$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                    n(composer6, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer6, int i20) {
                    DatePickerKt.mUb(calendarMonth, function1, j2, l2, l5, selectedRangeInfo, datePickerFormatter, selectableDates, datePickerColors, composer6, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void n(final Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, final DatePickerColors datePickerColors, final TextStyle textStyle, final float f3, final Function2 function24, Composer composer, final int i2) {
        int i3;
        Function2 function25;
        Function2 function26;
        Function2 function27;
        DatePickerColors datePickerColors2;
        TextStyle textStyle2;
        Composer composer2;
        Composer composerKN = composer.KN(1507356255);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function25 = function2;
            i3 |= composerKN.E2(function25) ? 32 : 16;
        } else {
            function25 = function2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function26 = function22;
            i3 |= composerKN.E2(function26) ? 256 : 128;
        } else {
            function26 = function22;
        }
        if ((i2 & 3072) == 0) {
            function27 = function23;
            i3 |= composerKN.E2(function27) ? 2048 : 1024;
        } else {
            function27 = function23;
        }
        if ((i2 & 24576) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= composerKN.p5(datePickerColors2) ? 16384 : 8192;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((196608 & i2) == 0) {
            textStyle2 = textStyle;
            i3 |= composerKN.p5(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.rl(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(function24) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1507356255, i3, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1308)");
            }
            Modifier modifierNr = BackgroundKt.nr(SemanticsModifierKt.nr(SizeKt.aYN(modifier, DatePickerModalTokens.f29490n.nr(), 0.0f, 0.0f, 0.0f, 14, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$1
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.D(semanticsPropertyReceiver, true);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }, 1, null), datePickerColors2.getContainerColor(), null, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            final Function2 function28 = function25;
            final Function2 function29 = function26;
            final Function2 function210 = function27;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final TextStyle textStyle3 = textStyle2;
            J2(Modifier.INSTANCE, function2, datePickerColors2.getTitleContentColor(), datePickerColors2.getHeadlineContentColor(), f3, ComposableLambdaKt.nr(-229007058, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-229007058, i5, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1326)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierKN = SizeKt.KN(companion2, 0.0f, 1, null);
                    final Function2 function211 = function29;
                    Function2 function212 = function210;
                    Function2 function213 = function28;
                    DatePickerColors datePickerColors4 = datePickerColors3;
                    TextStyle textStyle4 = textStyle3;
                    Arrangement arrangement = Arrangement.f17400n;
                    Arrangement.Vertical verticalUo = arrangement.Uo();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo, companion3.gh(), composer3, 0);
                    int iN2 = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierKN);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion4.n();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer3.T();
                    if (composer3.getInserting()) {
                        composer3.s7N(function0N2);
                    } else {
                        composer3.r();
                    }
                    Composer composerN2 = Updater.n(composer3);
                    Updater.O(composerN2, measurePolicyN2, companion4.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                    Function2 function2Rl2 = companion4.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion4.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    Arrangement.Horizontal horizontalJ2 = (function211 == null || function212 == null) ? function211 != null ? arrangement.J2() : arrangement.t() : arrangement.nr();
                    Modifier modifierKN2 = SizeKt.KN(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion3.xMQ(), composer3, 48);
                    int iN3 = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composer3.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composer3, modifierKN2);
                    Function0 function0N3 = companion4.n();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer3.T();
                    if (composer3.getInserting()) {
                        composer3.s7N(function0N3);
                    } else {
                        composer3.r();
                    }
                    Composer composerN3 = Updater.n(composer3);
                    Updater.O(composerN3, measurePolicyRl, companion4.t());
                    Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                    Function2 function2Rl3 = companion4.rl();
                    if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                    }
                    Updater.O(composerN3, modifierO3, companion4.nr());
                    final RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    composer3.eF(-1287344744);
                    if (function211 != null) {
                        TextKt.n(textStyle4, ComposableLambdaKt.nr(-962031352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$2$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.xMQ()) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-962031352, i7, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1340)");
                                }
                                Modifier modifierRl = RowScope.rl(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                Function2 function214 = function211;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN4 = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk4 = composer4.Ik();
                                Modifier modifierO4 = ComposedModifierKt.O(composer4, modifierRl);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0 function0N4 = companion5.n();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer4.T();
                                if (composer4.getInserting()) {
                                    composer4.s7N(function0N4);
                                } else {
                                    composer4.r();
                                }
                                Composer composerN4 = Updater.n(composer4);
                                Updater.O(composerN4, measurePolicyUo, companion5.t());
                                Updater.O(composerN4, compositionLocalMapIk4, companion5.O());
                                Function2 function2Rl4 = companion5.rl();
                                if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                                    composerN4.o(Integer.valueOf(iN4));
                                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                                }
                                Updater.O(composerN4, modifierO4, companion5.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function214.invoke(composer4, 0);
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                    }
                    composer3.Xw();
                    composer3.eF(-1287336668);
                    if (function212 != null) {
                        function212.invoke(composer3, 0);
                    }
                    composer3.Xw();
                    composer3.XQ();
                    composer3.eF(1995137078);
                    if (function213 != null || function211 != null || function212 != null) {
                        DividerKt.rl(null, 0.0f, datePickerColors4.getDividerColor(), composer3, 0, 3);
                    }
                    composer3.Xw();
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, (i3 & 112) | 196614 | (57344 & (i3 >> 6)));
            composer2 = composerKN;
            function24.invoke(composer2, Integer.valueOf((i3 >> 21) & 14));
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DateEntryContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i5) {
                    DatePickerKt.n(modifier, function2, function22, function23, datePickerColors, textStyle, f3, function24, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(final Long l2, final long j2, final int i2, final Function1 function1, final Function1 function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i3) {
        int i5;
        Function1 function13;
        Function1 function14;
        CalendarModel calendarModel2;
        IntRange intRange2;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Composer composer2;
        Composer composerKN = composer.KN(-895379221);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.t(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            function13 = function1;
            i5 |= composerKN.E2(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i3 & 24576) == 0) {
            function14 = function12;
            i5 |= composerKN.E2(function14) ? 16384 : 8192;
        } else {
            function14 = function12;
        }
        if ((196608 & i3) == 0) {
            calendarModel2 = calendarModel;
            i5 |= composerKN.E2(calendarModel2) ? 131072 : 65536;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((1572864 & i3) == 0) {
            intRange2 = intRange;
            i5 |= composerKN.E2(intRange2) ? 1048576 : 524288;
        } else {
            intRange2 = intRange;
        }
        if ((12582912 & i3) == 0) {
            i5 |= (16777216 & i3) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            selectableDates2 = selectableDates;
            i5 |= composerKN.p5(selectableDates2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((805306368 & i3) == 0) {
            datePickerColors2 = datePickerColors;
            i5 |= composerKN.p5(datePickerColors2) ? 536870912 : 268435456;
        } else {
            datePickerColors2 = datePickerColors;
        }
        int i7 = i5;
        if ((306783379 & i7) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-895379221, i7, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1396)");
            }
            final int i8 = -((Density) composerKN.ty(CompositionLocalsKt.J2())).How(Dp.KN(48));
            DisplayMode displayModeT = DisplayMode.t(i2);
            Modifier modifierNr = SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$1
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.D(semanticsPropertyReceiver, true);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }, 1, null);
            boolean zT2 = composerKN.t(i8);
            Object objIF = composerKN.iF();
            if (zT2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<AnimatedContentTransitionScope<DisplayMode>, ContentTransform>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final ContentTransform invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                        ContentTransform contentTransformJ2;
                        if (DisplayMode.J2(((DisplayMode) animatedContentTransitionScope.getTargetState()).getValue(), DisplayMode.INSTANCE.n())) {
                            EnterTransition enterTransitionT = EnterExitTransitionKt.fD(null, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return n(num.intValue());
                                }

                                public final Integer n(int i9) {
                                    return Integer.valueOf(i9);
                                }
                            }, 1, null).t(EnterExitTransitionKt.HI(AnimationSpecKt.ty(100, 100, null, 4, null), 0.0f, 2, null));
                            ExitTransition exitTransitionIk = EnterExitTransitionKt.Ik(AnimationSpecKt.ty(100, 0, null, 6, null), 0.0f, 2, null);
                            final int i9 = i8;
                            contentTransformJ2 = AnimatedContentKt.J2(enterTransitionT, exitTransitionIk.t(EnterExitTransitionKt.N(null, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return n(num.intValue());
                                }

                                public final Integer n(int i10) {
                                    return Integer.valueOf(i9);
                                }
                            }, 1, null)));
                        } else {
                            TweenSpec tweenSpecTy = AnimationSpecKt.ty(0, 50, null, 5, null);
                            final int i10 = i8;
                            contentTransformJ2 = AnimatedContentKt.J2(EnterExitTransitionKt.iF(tweenSpecTy, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return n(num.intValue());
                                }

                                public final Integer n(int i11) {
                                    return Integer.valueOf(i10);
                                }
                            }).t(EnterExitTransitionKt.HI(AnimationSpecKt.ty(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.N(null, new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                                    return n(num.intValue());
                                }

                                public final Integer n(int i11) {
                                    return Integer.valueOf(i11);
                                }
                            }, 1, null).t(EnterExitTransitionKt.Ik(AnimationSpecKt.ty(100, 0, null, 6, null), 0.0f, 2, null)));
                        }
                        return animatedContentTransitionScope.rl(contentTransformJ2, AnimatedContentKt.t(true, new Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ FiniteAnimationSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                                return n(intSize.getPackedValue(), intSize2.getPackedValue());
                            }

                            public final FiniteAnimationSpec n(long j3, long j4) {
                                return AnimationSpecKt.ty(500, 0, MotionTokens.f29694n.rl(), 2, null);
                            }
                        }));
                    }
                };
                composerKN.o(objIF);
            }
            final Function1 function15 = function13;
            final Function1 function16 = function14;
            final CalendarModel calendarModel3 = calendarModel2;
            final IntRange intRange3 = intRange2;
            final SelectableDates selectableDates3 = selectableDates2;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            composer2 = composerKN;
            AnimatedContentKt.rl(displayModeT, modifierNr, (Function1) objIF, null, HFAkacKHsU.IBeLTctNwBvEqgN, null, ComposableLambdaKt.nr(-459778869, true, new Function4<AnimatedContentScope, DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void n(AnimatedContentScope animatedContentScope, int i9, Composer composer3, int i10) {
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-459778869, i10, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DatePicker.kt:1452)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.J2(i9, companion.rl())) {
                        composer3.eF(-1870116901);
                        DatePickerKt.t(l2, j2, function15, function16, calendarModel3, intRange3, datePickerFormatter, selectableDates3, datePickerColors3, composer3, 0);
                        composer3.Xw();
                    } else if (DisplayMode.J2(i9, companion.n())) {
                        composer3.eF(-1870098348);
                        DateInputKt.n(l2, function15, calendarModel3, intRange3, datePickerFormatter, selectableDates3, datePickerColors3, composer3, 0);
                        composer3.Xw();
                    } else {
                        composer3.eF(-2138080579);
                        composer3.Xw();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, DisplayMode displayMode, Composer composer3, Integer num) {
                    n(animatedContentScope, displayMode.getValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerKN, 54), composer2, ((i7 >> 6) & 14) | 1597440, 40);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$4
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
                    DatePickerKt.qie(l2, j2, i2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, Function2 function2, Function2 function22, boolean z2, DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2Nr;
        int i8;
        Function2 function2Nr2;
        int i9;
        boolean z3;
        DatePickerColors datePickerColors2;
        int i10;
        final DatePickerColors datePickerColorsT;
        boolean z4;
        Function2 function23;
        Locale localeN;
        boolean zP5;
        Object objIF;
        Composer composer2;
        final boolean z5;
        final Modifier modifier3;
        final Function2 function24;
        final DatePickerColors datePickerColors3;
        final DatePickerFormatter datePickerFormatter2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i11;
        final DatePickerFormatter datePickerFormatter3 = datePickerFormatter;
        Composer composerKN = composer.KN(809701813);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(datePickerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                if ((i3 & 4) != 0) {
                    i11 = 128;
                    i5 |= i11;
                } else {
                    if ((i2 & 512) == 0 ? composerKN.p5(datePickerFormatter3) : composerKN.E2(datePickerFormatter3)) {
                        i11 = 256;
                    }
                    i5 |= i11;
                }
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function2Nr = function2;
                    i5 |= composerKN.E2(function2Nr) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function2Nr2 = function22;
                        i5 |= composerKN.E2(function2Nr2) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            z3 = z2;
                            i5 |= composerKN.n(z3) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                datePickerColors2 = datePickerColors;
                                int i13 = composerKN.p5(datePickerColors2) ? 1048576 : 524288;
                                i5 |= i13;
                            } else {
                                datePickerColors2 = datePickerColors;
                            }
                            i5 |= i13;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier3 = modifier2;
                            function24 = function2Nr;
                            z5 = z3;
                            datePickerColors3 = datePickerColors2;
                            datePickerFormatter2 = datePickerFormatter3;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    Object objIF2 = composerKN.iF();
                                    if (objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = DatePickerDefaults.O(DatePickerDefaults.f25177n, null, null, null, 7, null);
                                        composerKN.o(objIF2);
                                    }
                                    datePickerFormatter3 = (DatePickerFormatter) objIF2;
                                    i5 &= -897;
                                }
                                if (i7 == 0) {
                                    i10 = 54;
                                    function2Nr = ComposableLambdaKt.nr(-1504998463, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$2
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i14) {
                                            if ((i14 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1504998463, i14, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:173)");
                                            }
                                            DatePickerDefaults.f25177n.rl(datePickerState.O(), PaddingKt.KN(Modifier.INSTANCE, DatePickerKt.f25216O), composer3, 432, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                } else {
                                    i10 = 54;
                                }
                                if (i8 != 0) {
                                    function2Nr2 = ComposableLambdaKt.nr(-1780043561, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i14) {
                                            if ((i14 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1780043561, i14, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:179)");
                                            }
                                            DatePickerDefaults.f25177n.n(datePickerState.xMQ(), datePickerState.O(), datePickerFormatter3, PaddingKt.KN(Modifier.INSTANCE, DatePickerKt.J2), composer3, 27648, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, i10);
                                }
                                if (i9 != 0) {
                                    z3 = true;
                                }
                                if ((i3 & 64) == 0) {
                                    i5 &= -3670017;
                                    boolean z6 = z3;
                                    datePickerColorsT = DatePickerDefaults.f25177n.t(composerKN, 6);
                                    z4 = z6;
                                    function23 = function2Nr;
                                }
                                Modifier modifier4 = modifier2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(809701813, i5, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:188)");
                                }
                                localeN = CalendarLocale_androidKt.n(composerKN, 0);
                                zP5 = composerKN.p5(localeN);
                                objIF = composerKN.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = CalendarModel_androidKt.n(localeN);
                                    composerKN.o(objIF);
                                }
                                final CalendarModel calendarModel = (CalendarModel) objIF;
                                composerKN.eF(255587712);
                                ComposableLambda composableLambdaNr = !z4 ? ComposableLambdaKt.nr(1982226759, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1982226759, i14, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:198)");
                                        }
                                        Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, DatePickerKt.T());
                                        int iO = datePickerState.O();
                                        boolean zP52 = composer3.p5(datePickerState);
                                        final DatePickerState datePickerState2 = datePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    n(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(int i15) {
                                                    datePickerState2.nr(i15);
                                                }
                                            };
                                            composer3.o(objIF3);
                                        }
                                        DatePickerKt.KN(modifierKN, iO, (Function1) objIF3, composer3, 6);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54) : null;
                                composerKN.Xw();
                                DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
                                TextStyle textStyleT = TypographyKt.t(datePickerModalTokens.Ik(), composerKN, 6);
                                float fHI = datePickerModalTokens.HI();
                                DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-1840727866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1840727866, i14, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:211)");
                                        }
                                        Long lXMQ = datePickerState.xMQ();
                                        long jJ2 = datePickerState.J2();
                                        int iO = datePickerState.O();
                                        boolean zP52 = composer3.p5(datePickerState);
                                        final DatePickerState datePickerState2 = datePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                    n(l2);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Long l2) {
                                                    datePickerState2.gh(l2);
                                                }
                                            };
                                            composer3.o(objIF3);
                                        }
                                        Function1 function1 = (Function1) objIF3;
                                        boolean zP53 = composer3.p5(datePickerState);
                                        final DatePickerState datePickerState3 = datePickerState;
                                        Object objIF4 = composer3.iF();
                                        if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                    n(l2.longValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(long j2) {
                                                    datePickerState3.n(j2);
                                                }
                                            };
                                            composer3.o(objIF4);
                                        }
                                        DatePickerKt.qie(lXMQ, jJ2, iO, function1, (Function1) objIF4, calendarModel, datePickerState.t(), datePickerFormatter3, datePickerState.rl(), datePickerColorsT, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                int i14 = ((i5 >> 3) & 14) | 14155776;
                                int i15 = i5 >> 6;
                                composer2 = composerKN;
                                n(modifier4, function23, function2Nr2, composableLambdaNr, datePickerColorsT, textStyleT, fHI, composableLambdaNr2, composer2, i14 | (i15 & 112) | (i15 & 896) | (i15 & 57344));
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                z5 = z4;
                                modifier3 = modifier4;
                                function24 = function23;
                                datePickerColors3 = datePickerColorsT;
                                datePickerFormatter2 = datePickerFormatter4;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 4) != 0) {
                                    i5 &= -897;
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                            }
                            function23 = function2Nr;
                            z4 = z3;
                            datePickerColorsT = datePickerColors2;
                            Modifier modifier42 = modifier2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            localeN = CalendarLocale_androidKt.n(composerKN, 0);
                            zP5 = composerKN.p5(localeN);
                            objIF = composerKN.iF();
                            if (zP5) {
                                objIF = CalendarModel_androidKt.n(localeN);
                                composerKN.o(objIF);
                                final CalendarModel calendarModel2 = (CalendarModel) objIF;
                                composerKN.eF(255587712);
                                ComposableLambda composableLambdaNr3 = !z4 ? ComposableLambdaKt.nr(1982226759, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i142) {
                                        if ((i142 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1982226759, i142, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:198)");
                                        }
                                        Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, DatePickerKt.T());
                                        int iO = datePickerState.O();
                                        boolean zP52 = composer3.p5(datePickerState);
                                        final DatePickerState datePickerState2 = datePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    n(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(int i152) {
                                                    datePickerState2.nr(i152);
                                                }
                                            };
                                            composer3.o(objIF3);
                                        }
                                        DatePickerKt.KN(modifierKN, iO, (Function1) objIF3, composer3, 6);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54) : null;
                                composerKN.Xw();
                                DatePickerModalTokens datePickerModalTokens2 = DatePickerModalTokens.f29490n;
                                TextStyle textStyleT2 = TypographyKt.t(datePickerModalTokens2.Ik(), composerKN, 6);
                                float fHI2 = datePickerModalTokens2.HI();
                                DatePickerFormatter datePickerFormatter42 = datePickerFormatter3;
                                ComposableLambda composableLambdaNr22 = ComposableLambdaKt.nr(-1840727866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i142) {
                                        if ((i142 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1840727866, i142, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:211)");
                                        }
                                        Long lXMQ = datePickerState.xMQ();
                                        long jJ2 = datePickerState.J2();
                                        int iO = datePickerState.O();
                                        boolean zP52 = composer3.p5(datePickerState);
                                        final DatePickerState datePickerState2 = datePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                    n(l2);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Long l2) {
                                                    datePickerState2.gh(l2);
                                                }
                                            };
                                            composer3.o(objIF3);
                                        }
                                        Function1 function1 = (Function1) objIF3;
                                        boolean zP53 = composer3.p5(datePickerState);
                                        final DatePickerState datePickerState3 = datePickerState;
                                        Object objIF4 = composer3.iF();
                                        if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$5$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                    n(l2.longValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(long j2) {
                                                    datePickerState3.n(j2);
                                                }
                                            };
                                            composer3.o(objIF4);
                                        }
                                        DatePickerKt.qie(lXMQ, jJ2, iO, function1, (Function1) objIF4, calendarModel2, datePickerState.t(), datePickerFormatter3, datePickerState.rl(), datePickerColorsT, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                int i142 = ((i5 >> 3) & 14) | 14155776;
                                int i152 = i5 >> 6;
                                composer2 = composerKN;
                                n(modifier42, function23, function2Nr2, composableLambdaNr3, datePickerColorsT, textStyleT2, fHI2, composableLambdaNr22, composer2, i142 | (i152 & 112) | (i152 & 896) | (i152 & 57344));
                                if (ComposerKt.v()) {
                                }
                                z5 = z4;
                                modifier3 = modifier42;
                                function24 = function23;
                                datePickerColors3 = datePickerColorsT;
                                datePickerFormatter2 = datePickerFormatter42;
                            }
                        }
                        final Function2 function25 = function2Nr2;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePicker$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i16) {
                                    DatePickerKt.rl(datePickerState, modifier3, datePickerFormatter2, function24, function25, z5, datePickerColors3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    z3 = z2;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i12 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if ((i3 & 64) == 0) {
                                function23 = function2Nr;
                                z4 = z3;
                                datePickerColorsT = datePickerColors2;
                            }
                            Modifier modifier422 = modifier2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            localeN = CalendarLocale_androidKt.n(composerKN, 0);
                            zP5 = composerKN.p5(localeN);
                            objIF = composerKN.iF();
                            if (zP5) {
                            }
                        }
                    }
                    final Function2 function252 = function2Nr2;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function2Nr2 = function22;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                z3 = z2;
                if ((1572864 & i2) == 0) {
                }
                if ((599187 & i5) == 599186) {
                }
                final Function2 function2522 = function2Nr2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2Nr = function2;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function2Nr2 = function22;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            z3 = z2;
            if ((1572864 & i2) == 0) {
            }
            if ((599187 & i5) == 599186) {
            }
            final Function2 function25222 = function2Nr2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        function2Nr = function2;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function2Nr2 = function22;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        z3 = z2;
        if ((1572864 & i2) == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        final Function2 function252222 = function2Nr2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final Object s7N(final LazyListState lazyListState, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, Continuation continuation) {
        Object objN = SnapshotStateKt.Ik(new Function0<Integer>() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(lazyListState.o());
            }
        }).n(new CN3() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3
            public final Object n(int i2, Continuation continuation2) {
                int iO = lazyListState.o() / 12;
                function1.invoke(Boxing.boxLong(calendarModel.J2(intRange.getFirst() + iO, (lazyListState.o() % 12) + 1).getStartUtcTimeMillis()));
                return Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation2) {
                return n(((Number) obj).intValue(), continuation2);
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final Long l2, final long j2, final Function1 function1, final Function1 function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        Long l5;
        int i3;
        Object obj;
        Composer composer2;
        Composer composerKN = composer.KN(-434467002);
        if ((i2 & 6) == 0) {
            l5 = l2;
            i3 = (composerKN.p5(l5) ? 4 : 2) | i2;
        } else {
            l5 = l2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function12) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.p5(selectableDates) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerKN.p5(datePickerColors) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & 38347923) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-434467002, i3, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1491)");
            }
            final CalendarMonth calendarMonthUo = calendarModel.Uo(j2);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(calendarMonthUo.Uo(intRange), 0);
            final LazyListState lazyListStateRl = LazyListStateKt.rl(iCoerceAtLeast, 0, composerKN, 0, 2);
            Integer numValueOf = Integer.valueOf(iCoerceAtLeast);
            boolean zP5 = composerKN.p5(lazyListStateRl) | composerKN.t(iCoerceAtLeast);
            Object objIF = composerKN.iF();
            int i5 = i3;
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                obj = null;
                objIF = new DatePickerKt$DatePickerContent$1$1(lazyListStateRl, iCoerceAtLeast, null);
                composerKN.o(objIF);
            } else {
                obj = null;
            }
            EffectsKt.O(numValueOf, (Function2) objIF, composerKN, 0);
            Object objIF2 = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF2 == companion.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF2 = compositionScopedCoroutineScopeCanceller;
            }
            final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF2).getCoroutineScope();
            final MutableState mutableState = (MutableState) RememberSaveableKt.O(new Object[0], null, null, new Function0<MutableState<Boolean>>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$yearPickerVisible$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final MutableState invoke() {
                    return SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                }
            }, composerKN, 3072, 6);
            Locale localeN = CalendarLocale_androidKt.n(composerKN, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f3 = f25218t;
            Modifier modifierGh = PaddingKt.gh(companion2, f3, 0.0f, 2, null);
            boolean zJ2 = lazyListStateRl.J2();
            boolean zNr = lazyListStateRl.nr();
            boolean zNr2 = nr(mutableState);
            String strRl = datePickerFormatter.rl(Long.valueOf(j2), localeN);
            if (strRl == null) {
                strRl = "-";
            }
            String str = strRl;
            boolean zE2 = composerKN.E2(coroutineScope) | composerKN.p5(lazyListStateRl);
            Object objIF3 = composerKN.iF();
            if (zE2 || objIF3 == companion.n()) {
                objIF3 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1527}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f25257n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ LazyListState f25258t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(LazyListState lazyListState, Continuation continuation) {
                            super(2, continuation);
                            this.f25258t = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f25258t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f25257n;
                            try {
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        ResultKt.throwOnFailure(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj);
                                    LazyListState lazyListState = this.f25258t;
                                    int iO = lazyListState.o() + 1;
                                    this.f25257n = 1;
                                    if (LazyListState.qie(lazyListState, iO, 0, this, 2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C.nr(coroutineScope, null, null, new AnonymousClass1(lazyListStateRl, null), 3, null);
                    }
                };
                composerKN.o(objIF3);
            }
            Function0 function0 = (Function0) objIF3;
            boolean zE22 = composerKN.E2(coroutineScope) | composerKN.p5(lazyListStateRl);
            Object objIF4 = composerKN.iF();
            if (zE22 || objIF4 == companion.n()) {
                objIF4 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1

                    /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$2$1$1", f = "DatePicker.kt", i = {}, l = {1539}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f25261n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ LazyListState f25262t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(LazyListState lazyListState, Continuation continuation) {
                            super(2, continuation);
                            this.f25262t = lazyListState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f25262t, continuation);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(vd vdVar, Continuation continuation) {
                            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                            return invoke2(vdVar, (Continuation) continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.f25261n;
                            try {
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        ResultKt.throwOnFailure(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj);
                                    LazyListState lazyListState = this.f25262t;
                                    int iO = lazyListState.o() - 1;
                                    this.f25261n = 1;
                                    if (LazyListState.qie(lazyListState, iO, 0, this, 2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C.nr(coroutineScope, null, null, new AnonymousClass1(lazyListStateRl, null), 3, null);
                    }
                };
                composerKN.o(objIF4);
            }
            Function0 function02 = (Function0) objIF4;
            boolean zP52 = composerKN.p5(mutableState);
            Object objIF5 = composerKN.iF();
            if (zP52 || objIF5 == companion.n()) {
                objIF5 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$3$1
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
                        DatePickerKt.O(mutableState, !DatePickerKt.nr(r0));
                    }
                };
                composerKN.o(objIF5);
            }
            int i7 = i5 & 234881024;
            gh(modifierGh, zJ2, zNr, zNr2, str, function0, function02, (Function0) objIF5, datePickerColors, composerKN, i7 | 6);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion2);
            Function0 function0N2 = companion4.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyUo, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierGh2 = PaddingKt.gh(companion2, f3, 0.0f, 2, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion3.gh(), composerKN, 0);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierGh2);
            Function0 function0N3 = companion4.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyN2, companion4.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
            Function2 function2Rl3 = companion4.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion4.nr());
            az(datePickerColors, calendarModel, composerKN, ((i5 >> 24) & 14) | ((i5 >> 9) & 112));
            xMQ(lazyListStateRl, l5, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composerKN, ((i5 << 3) & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | i7);
            composerKN.XQ();
            AnimatedVisibilityKt.mUb(nr(mutableState), ClipKt.rl(companion2), EnterExitTransitionKt.az(null, null, false, null, 15, null).t(EnterExitTransitionKt.HI(null, 0.6f, 1, null)), EnterExitTransitionKt.ViF(null, null, false, null, 15, null).t(EnterExitTransitionKt.Ik(null, 0.0f, 3, null)), null, ComposableLambdaKt.nr(1193716082, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                    n(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i8) {
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1193716082, i8, -1, "androidx.compose.material3.DatePickerContent.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1576)");
                    }
                    Strings.Companion companion5 = Strings.INSTANCE;
                    final String strN = Strings_androidKt.n(Strings.n(R.string.te), composer3, 0);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    boolean zP53 = composer3.p5(strN);
                    Object objIF6 = composer3.iF();
                    if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                        objIF6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, strN);
                            }
                        };
                        composer3.o(objIF6);
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(companion6, false, (Function1) objIF6, 1, null);
                    long j3 = j2;
                    final MutableState mutableState2 = mutableState;
                    final vd vdVar = coroutineScope;
                    final LazyListState lazyListState = lazyListStateRl;
                    final IntRange intRange2 = intRange;
                    final CalendarMonth calendarMonth = calendarMonthUo;
                    SelectableDates selectableDates2 = selectableDates;
                    CalendarModel calendarModel2 = calendarModel;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    MeasurePolicy measurePolicyN3 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                    int iN4 = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk4 = composer3.Ik();
                    Modifier modifierO4 = ComposedModifierKt.O(composer3, modifierNr);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0 function0N4 = companion7.n();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer3.T();
                    if (composer3.getInserting()) {
                        composer3.s7N(function0N4);
                    } else {
                        composer3.r();
                    }
                    Composer composerN4 = Updater.n(composer3);
                    Updater.O(composerN4, measurePolicyN3, companion7.t());
                    Updater.O(composerN4, compositionLocalMapIk4, companion7.O());
                    Function2 function2Rl4 = companion7.rl();
                    if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                        composerN4.o(Integer.valueOf(iN4));
                        composerN4.az(Integer.valueOf(iN4), function2Rl4);
                    }
                    Updater.O(composerN4, modifierO4, companion7.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    Modifier modifierGh3 = PaddingKt.gh(SizeKt.qie(companion6, Dp.KN(Dp.KN(DatePickerKt.N() * 7) - DividerDefaults.f25669n.rl())), DatePickerKt.X(), 0.0f, 2, null);
                    boolean zP54 = composer3.p5(mutableState2) | composer3.E2(vdVar) | composer3.p5(lazyListState) | composer3.E2(intRange2) | composer3.p5(calendarMonth);
                    Object objIF7 = composer3.iF();
                    if (zP54 || objIF7 == Composer.INSTANCE.n()) {
                        Object obj2 = new Function1<Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1

                            /* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: invalid class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", i = {}, l = {1597}, m = "invokeSuspend", n = {}, s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                                final /* synthetic */ IntRange J2;

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                final /* synthetic */ int f25277O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                int f25278n;

                                /* JADX INFO: renamed from: r, reason: collision with root package name */
                                final /* synthetic */ CalendarMonth f25279r;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                final /* synthetic */ LazyListState f25280t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(LazyListState lazyListState, int i2, IntRange intRange, CalendarMonth calendarMonth, Continuation continuation) {
                                    super(2, continuation);
                                    this.f25280t = lazyListState;
                                    this.f25277O = i2;
                                    this.J2 = intRange;
                                    this.f25279r = calendarMonth;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new AnonymousClass1(this.f25280t, this.f25277O, this.J2, this.f25279r, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f25278n;
                                    if (i2 != 0) {
                                        if (i2 == 1) {
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        LazyListState lazyListState = this.f25280t;
                                        int first = (((this.f25277O - this.J2.getFirst()) * 12) + this.f25279r.getMonth()) - 1;
                                        this.f25278n = 1;
                                        if (LazyListState.nHg(lazyListState, first, 0, this, 2, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                n(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(int i9) {
                                DatePickerKt.O(mutableState2, !DatePickerKt.nr(r0));
                                C.nr(vdVar, null, null, new AnonymousClass1(lazyListState, i9, intRange2, calendarMonth, null), 3, null);
                            }
                        };
                        composer3.o(obj2);
                        objIF7 = obj2;
                    }
                    DatePickerKt.HI(modifierGh3, j3, (Function1) objIF7, selectableDates2, calendarModel2, intRange2, datePickerColors2, composer3, 6);
                    DividerKt.rl(null, 0.0f, datePickerColors2.getDividerColor(), composer3, 0, 3);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 200112, 16);
            composer2 = composerKN;
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i8) {
                    DatePickerKt.t(l2, j2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(final Modifier modifier, final boolean z2, final boolean z3, final Function0 function0, final boolean z4, final String str, final DatePickerColors datePickerColors, final Function2 function2, Composer composer, final int i2) {
        int i3;
        Object objN;
        Composer composerKN = composer.KN(238547184);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.n(z4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(datePickerColors) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(function2) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(238547184, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:2097)");
            }
            int i5 = i3 & 112;
            boolean z5 = ((i3 & 896) == 256) | (i5 == 32);
            Object objIF = composerKN.iF();
            if (z5 || objIF == Composer.INSTANCE.n()) {
                objN = (!z3 || z2) ? null : BorderStrokeKt.n(DatePickerModalTokens.f29490n.qie(), datePickerColors.getTodayDateBorderColor());
                composerKN.o(objN);
            } else {
                objN = objIF;
            }
            BorderStroke borderStroke = (BorderStroke) objN;
            boolean z6 = (458752 & i3) == 131072;
            Object objIF2 = composerKN.iF();
            if (z6 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.Jk(semanticsPropertyReceiver, new AnnotatedString(str, null, null, 6, null));
                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                    }
                };
                composerKN.o(objIF2);
            }
            int i7 = i3 >> 3;
            int i8 = i7 & 14;
            int i9 = i3 >> 9;
            int i10 = i3 >> 6;
            SurfaceKt.rl(z2, function0, SemanticsModifierKt.t(modifier, true, (Function1) objIF2), z4, ShapesKt.O(DatePickerModalTokens.f29490n.E2(), composerKN, 6), ((Color) datePickerColors.az(z2, z4, composerKN, i8 | (i9 & 112) | ((i3 >> 12) & 896)).getValue()).getValue(), ((Color) datePickerColors.ty(z3, z2, z4, composerKN, (i10 & 14) | i5 | (i10 & 896) | (i9 & 7168)).getValue()).getValue(), 0.0f, 0.0f, borderStroke, null, ComposableLambdaKt.nr(-1573188346, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    if ((i11 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1573188346, i11, -1, "androidx.compose.material3.Year.<anonymous> (DatePicker.kt:2130)");
                    }
                    Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment alignmentO = Alignment.INSTANCE.O();
                    Function2 function22 = function2;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                    int iN = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierKN);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer2.T();
                    if (composer2.getInserting()) {
                        composer2.s7N(function0N);
                    } else {
                        composer2.r();
                    }
                    Composer composerN = Updater.n(composer2);
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    function22.invoke(composer2, 0);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, i8 | (i10 & 112) | (i7 & 7168), 48, 1408);
            composerKN = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    DatePickerKt.ty(modifier, z2, z3, function0, z4, str, datePickerColors, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(LazyListState lazyListState, final Long l2, final Function1 function1, final Function1 function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Long l5;
        final Function1 function13;
        SelectableDates selectableDates2;
        DatePickerColors datePickerColors2;
        Object datePickerKt$HorizontalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerKN = composer.KN(-1994757941);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(lazyListState2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l5 = l2;
            i3 |= composerKN.p5(l5) ? 32 : 16;
        } else {
            l5 = l2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function13 = function1;
            i3 |= composerKN.E2(function13) ? 256 : 128;
        } else {
            function13 = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function12) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            selectableDates2 = selectableDates;
            i3 |= composerKN.p5(selectableDates2) ? 8388608 : 4194304;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((100663296 & i2) == 0) {
            datePickerColors2 = datePickerColors;
            i3 |= composerKN.p5(datePickerColors2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((38347923 & i3) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1994757941, i3, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1656)");
            }
            final CalendarDate calendarDateXMQ = calendarModel.xMQ();
            boolean zP5 = composerKN.p5(intRange);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = calendarModel.J2(intRange.getFirst(), 1);
                composerKN.o(objIF);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objIF;
            final DatePickerColors datePickerColors3 = datePickerColors2;
            final SelectableDates selectableDates3 = selectableDates2;
            final Long l6 = l5;
            int i5 = i3;
            TextKt.n(TypographyKt.t(DatePickerModalTokens.f29490n.J2(), composerKN, 6), ComposableLambdaKt.nr(1504086906, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1504086906, i7, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous> (DatePicker.kt:1666)");
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.z(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DatePickerKt.HorizontalMonthsList.1.1.2
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    FlingBehavior flingBehaviorXMQ = DatePickerDefaults.f25177n.xMQ(lazyListState3, null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                    boolean zE2 = composer2.E2(intRange) | composer2.E2(calendarModel) | composer2.p5(calendarMonth) | composer2.p5(function13) | composer2.p5(calendarDateXMQ) | composer2.p5(l6) | composer2.E2(datePickerFormatter) | composer2.p5(selectableDates3) | composer2.p5(datePickerColors3);
                    final IntRange intRange2 = intRange;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Function1 function14 = function13;
                    final CalendarDate calendarDate = calendarDateXMQ;
                    final Long l7 = l6;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates4 = selectableDates3;
                    final DatePickerColors datePickerColors4 = datePickerColors3;
                    Object objIF2 = composer2.iF();
                    if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                n(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(LazyListScope lazyListScope) {
                                int iNHg = DatePickerKt.nHg(intRange2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final Function1 function15 = function14;
                                final CalendarDate calendarDate2 = calendarDate;
                                final Long l8 = l7;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates5 = selectableDates4;
                                final DatePickerColors datePickerColors5 = datePickerColors4;
                                LazyListScope.nr(lazyListScope, iNHg, null, null, ComposableLambdaKt.rl(1137566309, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        n(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(LazyItemScope lazyItemScope, int i8, Composer composer3, int i9) {
                                        int i10;
                                        if ((i9 & 6) == 0) {
                                            i10 = i9 | (composer3.p5(lazyItemScope) ? 4 : 2);
                                        } else {
                                            i10 = i9;
                                        }
                                        if ((i9 & 48) == 0) {
                                            i10 |= composer3.t(i8) ? 32 : 16;
                                        }
                                        if ((i10 & 147) == 146 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1137566309, i10, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1678)");
                                        }
                                        CalendarMonth calendarMonthQie = calendarModel3.qie(calendarMonth3, i8);
                                        Modifier modifierN = LazyItemScope.n(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
                                        Function1 function16 = function15;
                                        CalendarDate calendarDate3 = calendarDate2;
                                        Long l9 = l8;
                                        DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                        SelectableDates selectableDates6 = selectableDates5;
                                        DatePickerColors datePickerColors6 = datePickerColors5;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0 function0N = companion.n();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer3.T();
                                        if (composer3.getInserting()) {
                                            composer3.s7N(function0N);
                                        } else {
                                            composer3.r();
                                        }
                                        Composer composerN = Updater.n(composer3);
                                        Updater.O(composerN, measurePolicyUo, companion.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                                        Function2 function2Rl = companion.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        DatePickerKt.mUb(calendarMonthQie, function16, calendarDate3.getUtcTimeMillis(), l9, null, null, datePickerFormatter4, selectableDates6, datePickerColors6, composer3, 221184);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.o(objIF2);
                    }
                    LazyDslKt.J2(modifierNr, lazyListState3, null, false, null, null, flingBehaviorXMQ, false, (Function1) objIF2, composer2, 0, 188);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 48);
            int i7 = i5 & 14;
            boolean zE2 = (i7 == 4) | ((i5 & 7168) == 2048) | composerKN.E2(calendarModel) | composerKN.E2(intRange);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, function12, calendarModel, intRange, null);
                composerKN.o(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = objIF2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.O(lazyListState2, (Function2) datePickerKt$HorizontalMonthsList$2$1, composerKN, i7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3
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
                    DatePickerKt.xMQ(lazyListState2, l2, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void KN(Modifier modifier, final int i2, final Function1 function1, Composer composer, final int i3) {
        int i5;
        final Modifier modifier2;
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(1393846115);
        if ((i3 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i5 = i9 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (composerKN.t(i2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function1)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i5 |= i7;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1393846115, i5, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1361)");
            }
            boolean z2 = false;
            if (DisplayMode.J2(i2, DisplayMode.INSTANCE.rl())) {
                composerKN.eF(-411219388);
                if ((i5 & 896) == 256) {
                    z2 = true;
                }
                Object objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$1$1
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
                            function1.invoke(DisplayMode.t(DisplayMode.INSTANCE.n()));
                        }
                    };
                    composerKN.o(objIF);
                }
                modifier2 = modifier;
                IconButtonKt.O((Function0) objIF, modifier2, false, null, null, ComposableSingletons$DatePickerKt.f25072n.n(), composerKN, ((i5 << 3) & 112) | 196608, 28);
                composerKN.Xw();
            } else {
                composerKN.eF(-410937381);
                if ((i5 & 896) == 256) {
                    z2 = true;
                }
                Object objIF2 = composerKN.iF();
                if (z2 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$2$1
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
                            function1.invoke(DisplayMode.t(DisplayMode.INSTANCE.rl()));
                        }
                    };
                    composerKN.o(objIF2);
                }
                modifier2 = modifier;
                IconButtonKt.O((Function0) objIF2, modifier2, false, null, null, ComposableSingletons$DatePickerKt.f25072n.rl(), composerKN, ((i5 << 3) & 112) | 196608, 28);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DisplayModeToggleButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i10) {
                    DatePickerKt.KN(modifier2, i2, function1, composer2, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final String e(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Composer composer, int i2) {
        String string;
        if (ComposerKt.v()) {
            ComposerKt.p5(502032503, i2, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1909)");
        }
        StringBuilder sb = new StringBuilder();
        composer.eF(-647730741);
        if (z2) {
            if (z4) {
                composer.eF(-647727716);
                Strings.Companion companion = Strings.INSTANCE;
                sb.append(Strings_androidKt.n(Strings.n(R.string.f27125N), composer, 0));
                composer.Xw();
            } else if (z5) {
                composer.eF(-647723718);
                Strings.Companion companion2 = Strings.INSTANCE;
                sb.append(Strings_androidKt.n(Strings.n(R.string.f27133e), composer, 0));
                composer.Xw();
            } else if (z6) {
                composer.eF(-647719783);
                Strings.Companion companion3 = Strings.INSTANCE;
                sb.append(Strings_androidKt.n(Strings.n(R.string.E2), composer, 0));
                composer.Xw();
            } else {
                composer.eF(1395591750);
                composer.Xw();
            }
        }
        composer.Xw();
        composer.eF(-647717033);
        if (z3) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Strings.Companion companion4 = Strings.INSTANCE;
            sb.append(Strings_androidKt.n(Strings.n(R.string.f27134g), composer, 0));
        }
        composer.Xw();
        if (sb.length() == 0) {
            string = null;
        } else {
            string = sb.toString();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return string;
    }

    public static final int nHg(IntRange intRange) {
        return ((intRange.getLast() - intRange.getFirst()) + 1) * 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
