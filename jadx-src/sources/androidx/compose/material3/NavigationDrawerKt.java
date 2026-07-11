package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a`\u0010\u0013\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001al\u0010#\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001at\u0010%\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001al\u0010'\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010$\u001at\u0010(\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010&\u001al\u0010)\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010$\u001at\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b\"H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a#\u0010/\u001a\u00020\f*\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u00100\u001a#\u00101\u001a\u00020\f*\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00100\u001a\u001b\u00104\u001a\u000203*\u0002022\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b4\u00105\u001a\u001b\u00106\u001a\u000203*\u0002022\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b6\u00105\u001a\u0090\u0001\u0010A\u001a\u00020\t2\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u00108\u001a\u00020\u00032\f\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010<\u001a\u00020\u00192\b\b\u0002\u0010>\u001a\u00020=2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bA\u0010B\u001a'\u0010F\u001a\u0002032\u0006\u0010C\u001a\u0002032\u0006\u0010D\u001a\u0002032\u0006\u0010E\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010G\u001a>\u0010L\u001a\u00020\t2\u0006\u0010H\u001a\u00020\u00032\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002030\b2\u0006\u0010K\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\bL\u0010M\"\u0014\u0010O\u001a\u0002038\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010N\"\u0014\u0010P\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010N\"\u0014\u0010Q\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010N\"\u001a\u0010U\u001a\b\u0012\u0004\u0012\u0002030R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006X²\u0006\u000e\u0010V\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010W\u001a\u0002038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010V\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material3/DrawerState;", "wTp", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Color;", "scrimColor", AppLovinEventTypes.USER_VIEWED_CONTENT, "xMQ", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "t", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ck", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Landroidx/compose/ui/unit/Dp;", "drawerTonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "KN", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Uo", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rl", c.f62177j, "HI", "Landroidx/compose/material3/DrawerPredictiveBackState;", "drawerPredictiveBackState", "J2", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "isRtl", "s7N", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerPredictiveBackState;Z)Landroidx/compose/ui/Modifier;", "nHg", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/ui/graphics/GraphicsLayerScope;Landroidx/compose/material3/DrawerPredictiveBackState;)F", "N", "label", "selected", "onClick", "icon", "badge", "shape", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "ty", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "X", "(FFF)F", "open", "onClose", "fraction", TtmlNode.ATTR_TTS_COLOR, "Ik", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "F", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "MinimumDrawerWidth", "Landroidx/compose/animation/core/TweenSpec;", "nr", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "anchorsInitialized", "minValue", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1167:1\n1223#2,6:1168\n1223#2,3:1179\n1226#2,3:1185\n1223#2,6:1191\n1223#2,6:1197\n1223#2,6:1203\n1223#2,6:1287\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1311\n1223#2,6:1352\n1223#2,6:1359\n1223#2,3:1370\n1226#2,3:1376\n1223#2,6:1418\n1223#2,6:1455\n1223#2,6:1631\n1223#2,6:1639\n1223#2,6:1645\n1223#2,6:1651\n488#3:1174\n487#3,4:1175\n491#3,2:1182\n495#3:1188\n488#3:1365\n487#3,4:1366\n491#3,2:1373\n495#3:1379\n487#4:1184\n487#4:1375\n234#5:1189\n234#5:1380\n234#5:1630\n237#5:1638\n77#6:1190\n77#6:1209\n77#6:1358\n77#6:1381\n77#6:1637\n71#7:1210\n68#7,6:1211\n74#7:1245\n71#7:1246\n67#7,7:1247\n74#7:1282\n78#7:1286\n78#7:1351\n71#7:1382\n68#7,6:1383\n74#7:1417\n71#7:1461\n68#7,6:1462\n74#7:1496\n78#7:1500\n71#7:1501\n67#7,7:1502\n74#7:1537\n78#7:1541\n78#7:1548\n71#7:1585\n67#7,7:1586\n74#7:1621\n78#7:1625\n78#8,6:1217\n85#8,4:1232\n89#8,2:1242\n78#8,6:1254\n85#8,4:1269\n89#8,2:1279\n93#8:1285\n78#8,6:1317\n85#8,4:1332\n89#8,2:1342\n93#8:1347\n93#8:1350\n78#8,6:1389\n85#8,4:1404\n89#8,2:1414\n78#8:1424\n76#8,8:1425\n85#8,4:1442\n89#8,2:1452\n78#8,6:1468\n85#8,4:1483\n89#8,2:1493\n93#8:1499\n78#8,6:1509\n85#8,4:1524\n89#8,2:1534\n93#8:1540\n93#8:1544\n93#8:1547\n78#8,6:1556\n85#8,4:1571\n89#8,2:1581\n78#8,6:1593\n85#8,4:1608\n89#8,2:1618\n93#8:1624\n93#8:1628\n368#9,9:1223\n377#9:1244\n368#9,9:1260\n377#9:1281\n378#9,2:1283\n368#9,9:1323\n377#9,3:1344\n378#9,2:1348\n368#9,9:1395\n377#9:1416\n368#9,9:1433\n377#9:1454\n368#9,9:1474\n377#9:1495\n378#9,2:1497\n368#9,9:1515\n377#9:1536\n378#9,2:1538\n378#9,2:1542\n378#9,2:1545\n368#9,9:1562\n377#9:1583\n368#9,9:1599\n377#9:1620\n378#9,2:1622\n378#9,2:1626\n4032#10,6:1236\n4032#10,6:1273\n4032#10,6:1336\n4032#10,6:1408\n4032#10,6:1446\n4032#10,6:1487\n4032#10,6:1528\n4032#10,6:1575\n4032#10,6:1612\n98#11:1549\n95#11,6:1550\n101#11:1584\n105#11:1629\n81#12:1657\n107#12,2:1658\n81#12:1663\n107#12,2:1664\n76#13:1660\n109#13,2:1661\n148#14:1666\n148#14:1667\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n287#1:1168,6\n322#1:1179,3\n322#1:1185,3\n325#1:1191,6\n326#1:1197,6\n329#1:1203,6\n345#1:1287,6\n353#1:1293,6\n359#1:1299,6\n371#1:1305,6\n386#1:1311,6\n445#1:1352,6\n447#1:1359,6\n449#1:1370,3\n449#1:1376,3\n484#1:1418,6\n464#1:1455,6\n751#1:1631,6\n1146#1:1639,6\n1147#1:1645,6\n1158#1:1651,6\n322#1:1174\n322#1:1175,4\n322#1:1182,2\n322#1:1188\n449#1:1365\n449#1:1366,4\n449#1:1373,2\n449#1:1379\n322#1:1184\n449#1:1375\n323#1:1189\n450#1:1380\n747#1:1630\n1143#1:1638\n324#1:1190\n331#1:1209\n446#1:1358\n452#1:1381\n771#1:1637\n332#1:1210\n332#1:1211,6\n332#1:1245\n342#1:1246\n342#1:1247,7\n342#1:1282\n342#1:1286\n332#1:1351\n453#1:1382\n453#1:1383,6\n453#1:1417\n463#1:1461\n463#1:1462,6\n463#1:1496\n463#1:1500\n482#1:1501\n482#1:1502,7\n482#1:1537\n482#1:1541\n453#1:1548\n541#1:1585\n541#1:1586,7\n541#1:1621\n541#1:1625\n332#1:1217,6\n332#1:1232,4\n332#1:1242,2\n342#1:1254,6\n342#1:1269,4\n342#1:1279,2\n342#1:1285\n356#1:1317,6\n356#1:1332,4\n356#1:1342,2\n356#1:1347\n332#1:1350\n453#1:1389,6\n453#1:1404,4\n453#1:1414,2\n461#1:1424\n461#1:1425,8\n461#1:1442,4\n461#1:1452,2\n463#1:1468,6\n463#1:1483,4\n463#1:1493,2\n463#1:1499\n482#1:1509,6\n482#1:1524,4\n482#1:1534,2\n482#1:1540\n461#1:1544\n453#1:1547\n539#1:1556,6\n539#1:1571,4\n539#1:1581,2\n541#1:1593,6\n541#1:1608,4\n541#1:1618,2\n541#1:1624\n539#1:1628\n332#1:1223,9\n332#1:1244\n342#1:1260,9\n342#1:1281\n342#1:1283,2\n356#1:1323,9\n356#1:1344,3\n332#1:1348,2\n453#1:1395,9\n453#1:1416\n461#1:1433,9\n461#1:1454\n463#1:1474,9\n463#1:1495\n463#1:1497,2\n482#1:1515,9\n482#1:1536\n482#1:1538,2\n461#1:1542,2\n453#1:1545,2\n539#1:1562,9\n539#1:1583\n541#1:1599,9\n541#1:1620\n541#1:1622,2\n539#1:1626,2\n332#1:1236,6\n342#1:1273,6\n356#1:1336,6\n453#1:1408,6\n461#1:1446,6\n463#1:1487,6\n482#1:1528,6\n539#1:1575,6\n541#1:1612,6\n539#1:1549\n539#1:1550,6\n539#1:1584\n539#1:1629\n325#1:1657\n325#1:1658,2\n445#1:1663\n445#1:1664,2\n326#1:1660\n326#1:1661,2\n1162#1:1666\n1163#1:1667\n*E\n"})
public final class NavigationDrawerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26480n = 0.5f;
    private static final float rl = Dp.KN(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26481t = Dp.KN(240);
    private static final TweenSpec nr = new TweenSpec(256, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float X(float f3, float f4, float f5) {
        return RangesKt.coerceIn((f5 - f3) / (f4 - f3), 0.0f, 1.0f);
    }

    public static final void ck(final Function2 function2, Modifier modifier, final Function2 function22, Composer composer, final int i2, final int i3) {
        int i5;
        Composer composerKN = composer.KN(-276843608);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = 2 & i3;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((4 & i3) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function22) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-276843608, i5, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:537)");
            }
            Modifier modifierJ2 = SizeKt.J2(modifier, 0.0f, 1, null);
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            function2.invoke(composerKN, Integer.valueOf(i5 & 14));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
            Function0 function0N2 = companion2.n();
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
            Updater.O(composerN2, measurePolicyUo, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function22.invoke(composerKN, Integer.valueOf((i5 >> 6) & 14));
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2
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
                    NavigationDrawerKt.ck(function2, modifier2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HI(Modifier modifier, Shape shape, long j2, long j3, float f3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Shape shape2;
        long jKN;
        int i7;
        long jT2;
        int i8;
        float fO;
        WindowInsets windowInsetsXMQ;
        int i9;
        Function3 function32;
        Modifier modifier3;
        int i10;
        long j4;
        float f4;
        WindowInsets windowInsets2;
        long j5;
        int i11;
        Shape shape3;
        final String strN;
        boolean zP5;
        Object objIF;
        Composer composer2;
        final Modifier modifier4;
        final WindowInsets windowInsets3;
        final Shape shape4;
        final long j6;
        final long j7;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1733353241);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                shape2 = shape;
                i5 |= composerKN.p5(shape2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    jKN = j2;
                    int i14 = composerKN.nr(jKN) ? 256 : 128;
                    i5 |= i14;
                } else {
                    jKN = j2;
                }
                i5 |= i14;
            } else {
                jKN = j2;
            }
            if ((i2 & 3072) != 0) {
                i7 = i13;
                if ((i3 & 8) == 0) {
                    jT2 = j3;
                    int i15 = composerKN.nr(jT2) ? 2048 : 1024;
                    i5 |= i15;
                } else {
                    jT2 = j3;
                }
                i5 |= i15;
            } else {
                i7 = i13;
                jT2 = j3;
            }
            i8 = i3 & 16;
            if (i8 == 0) {
                i5 |= 24576;
                fO = f3;
            } else if ((i2 & 24576) == 0) {
                fO = f3;
                i5 |= composerKN.rl(fO) ? 16384 : 8192;
            } else {
                fO = f3;
            }
            if ((i2 & 196608) != 0) {
                if ((i3 & 32) == 0) {
                    windowInsetsXMQ = windowInsets;
                    int i16 = composerKN.p5(windowInsetsXMQ) ? 131072 : 65536;
                    i5 |= i16;
                } else {
                    windowInsetsXMQ = windowInsets;
                }
                i5 |= i16;
            } else {
                windowInsetsXMQ = windowInsets;
            }
            if ((i3 & 64) != 0) {
                if ((i2 & 1572864) == 0) {
                    i9 = 1;
                    function32 = function3;
                    i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                }
                if ((i5 & 599187) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    f5 = fO;
                    windowInsets3 = windowInsetsXMQ;
                    composer2 = composerKN;
                    shape4 = shape2;
                    j6 = jKN;
                    j7 = jT2;
                    modifier4 = modifier2;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        Shape shapeN = i7 == 0 ? RectangleShapeKt.n() : shape2;
                        if ((i3 & 4) == 0) {
                            jKN = DrawerDefaults.f25687n.KN(composerKN, 6);
                            i5 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jT2 = ColorSchemeKt.t(jKN, composerKN, (i5 >> 6) & 14);
                            i5 &= -7169;
                        }
                        if (i8 != 0) {
                            fO = DrawerDefaults.f25687n.O();
                        }
                        if ((i3 & 32) != 0) {
                            windowInsetsXMQ = DrawerDefaults.f25687n.xMQ(composerKN, 6);
                            i5 &= -458753;
                        }
                        long j9 = jT2;
                        i10 = i9;
                        j4 = j9;
                        f4 = fO;
                        windowInsets2 = windowInsetsXMQ;
                        j5 = jKN;
                        i11 = 6;
                        shape3 = shapeN;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        long j10 = jT2;
                        i10 = i9;
                        j4 = j10;
                        f4 = fO;
                        modifier3 = modifier2;
                        j5 = jKN;
                        i11 = 6;
                        shape3 = shape2;
                        windowInsets2 = windowInsetsXMQ;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1733353241, i5, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:745)");
                    }
                    Strings.Companion companion = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                    zP5 = composerKN.p5(strN);
                    objIF = composerKN.iF();
                    if (!zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                        composerKN.o(objIF);
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(modifier3, false, (Function1) objIF, i10, null);
                    int i17 = ((i5 >> 12) & 112) | i11;
                    int i18 = i5 << 6;
                    composer2 = composerKN;
                    J2(null, windowInsets2, modifierNr, shape3, j5, j4, f4, function32, composer2, i17 | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | ((i5 << 3) & 29360128), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier3;
                    windowInsets3 = windowInsets2;
                    shape4 = shape3;
                    j6 = j5;
                    j7 = j4;
                    f5 = f4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i19) {
                            NavigationDrawerKt.HI(modifier4, shape4, j6, j7, f5, windowInsets3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            i9 = 1;
            function32 = function3;
            if ((i5 & 599187) == 599186) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i12 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 4) == 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    long j92 = jT2;
                    i10 = i9;
                    j4 = j92;
                    f4 = fO;
                    windowInsets2 = windowInsetsXMQ;
                    j5 = jKN;
                    i11 = 6;
                    shape3 = shapeN;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                    zP5 = composerKN.p5(strN);
                    objIF = composerKN.iF();
                    if (!zP5) {
                        objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                        composerKN.o(objIF);
                        Modifier modifierNr2 = SemanticsModifierKt.nr(modifier3, false, (Function1) objIF, i10, null);
                        int i172 = ((i5 >> 12) & 112) | i11;
                        int i182 = i5 << 6;
                        composer2 = composerKN;
                        J2(null, windowInsets2, modifierNr2, shape3, j5, j4, f4, function32, composer2, i172 | (i182 & 7168) | (57344 & i182) | (458752 & i182) | (i182 & 3670016) | ((i5 << 3) & 29360128), 0);
                        if (ComposerKt.v()) {
                        }
                        modifier4 = modifier3;
                        windowInsets3 = windowInsets2;
                        shape4 = shape3;
                        j6 = j5;
                        j7 = j4;
                        f5 = f4;
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        shape2 = shape;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        if ((i2 & 196608) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        i9 = 1;
        function32 = function3;
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(final boolean z2, final Function0 function0, final Function0 function02, final long j2, Composer composer, final int i2) {
        int i3;
        Modifier modifierT;
        Composer composerKN = composer.KN(2106487387);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function02) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.nr(j2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2106487387, i3, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1141)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            final String strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.rl), composerKN, 0);
            composerKN.eF(-1784743395);
            if (z2) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i5 = i3 & 112;
                boolean z3 = i5 == 32;
                Object objIF = composerKN.iF();
                if (z3 || objIF == Composer.INSTANCE.n()) {
                    objIF = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerKN.o(objIF);
                }
                Modifier modifierZmq = companion2.Zmq(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF), 6, null));
                boolean zP5 = (i5 == 32) | composerKN.p5(strN);
                Object objIF2 = composerKN.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
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
                            SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                            final Function0 function03 = function0;
                            SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerKN.o(objIF2);
                }
                modifierT = SemanticsModifierKt.t(modifierZmq, true, (Function1) objIF2);
            } else {
                modifierT = Modifier.INSTANCE;
            }
            composerKN.Xw();
            Modifier modifierZmq2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null).Zmq(modifierT);
            boolean z4 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objIF3 = composerKN.iF();
            if (z4 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        n(drawScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(DrawScope drawScope) {
                        DrawScope.h(drawScope, j2, 0L, 0L, ((Number) function02.invoke()).floatValue(), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                    }
                };
                composerKN.o(objIF3);
            }
            CanvasKt.rl(modifierZmq2, (Function1) objIF3, composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
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
                    NavigationDrawerKt.Ik(z2, function0, function02, j2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final DrawerPredictiveBackState drawerPredictiveBackState, final WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f3, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Shape shapeN;
        long jKN;
        int i8;
        final float f4;
        long jT2;
        int i9;
        long j4;
        float fO;
        final DrawerPredictiveBackState drawerPredictiveBackState2;
        Modifier modifierS7N;
        Composer composer2;
        final Shape shape2;
        final long j5;
        final long j6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-151557245);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(drawerPredictiveBackState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(windowInsets) ? 32 : 16;
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
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    shapeN = shape;
                    i5 |= composerKN.p5(shapeN) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    jKN = j2;
                    i5 |= ((i3 & 16) == 0 && composerKN.nr(jKN)) ? 16384 : 8192;
                } else {
                    jKN = j2;
                }
                if ((196608 & i2) == 0) {
                    i5 |= ((i3 & 32) == 0 && composerKN.nr(j3)) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    f4 = f3;
                } else {
                    f4 = f3;
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.rl(f4) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                }
                if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier3 = modifier2;
                    shape2 = shapeN;
                    j5 = jKN;
                    j6 = j3;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            shapeN = RectangleShapeKt.n();
                        }
                        if ((i3 & 16) != 0) {
                            jKN = DrawerDefaults.f25687n.KN(composerKN, 6);
                            i5 &= -57345;
                        }
                        if ((i3 & 32) == 0) {
                            jT2 = ColorSchemeKt.t(jKN, composerKN, (i5 >> 12) & 14);
                            i5 &= -458753;
                        } else {
                            jT2 = j3;
                        }
                        if (i8 == 0) {
                            j4 = jT2;
                            fO = DrawerDefaults.f25687n.O();
                        } else {
                            i9 = 12582912;
                            j4 = jT2;
                            fO = f4;
                            long j7 = jKN;
                            Shape shape3 = shapeN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-151557245, i5, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:769)");
                            }
                            final boolean z2 = composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t;
                            if (drawerPredictiveBackState == null) {
                                drawerPredictiveBackState2 = drawerPredictiveBackState;
                                modifierS7N = s7N(Modifier.INSTANCE, drawerPredictiveBackState2, z2);
                            } else {
                                drawerPredictiveBackState2 = drawerPredictiveBackState;
                                modifierS7N = Modifier.INSTANCE;
                            }
                            Modifier modifier4 = modifier2;
                            int i11 = i5 >> 6;
                            composer2 = composerKN;
                            SurfaceKt.n(SizeKt.nr(SizeKt.aYN(modifier4, f26481t, 0.0f, DrawerDefaults.f25687n.rl(), 0.0f, 10, null).Zmq(modifierS7N), 0.0f, 1, null), shape3, j7, j4, fO, 0.0f, null, ComposableLambdaKt.nr(669057502, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i12) {
                                    if ((i12 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(669057502, i12, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:786)");
                                    }
                                    DrawerPredictiveBackState drawerPredictiveBackState3 = drawerPredictiveBackState2;
                                    Modifier modifierNr = WindowInsetsPaddingKt.nr(SizeKt.aYN(Modifier.INSTANCE, NavigationDrawerKt.f26481t, 0.0f, DrawerDefaults.f25687n.rl(), 0.0f, 10, null).Zmq(drawerPredictiveBackState3 != null ? NavigationDrawerKt.nHg(Modifier.INSTANCE, drawerPredictiveBackState3, z2) : Modifier.INSTANCE), windowInsets);
                                    Function3 function32 = function3;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierNr);
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
                                    Updater.O(composerN, measurePolicyN, companion.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                    Function2 function2Rl = companion.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion.nr());
                                    function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, i9 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 96);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            shape2 = shape3;
                            j5 = j7;
                            j6 = j4;
                            f4 = fO;
                            modifier3 = modifier4;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        j4 = j3;
                        fO = f4;
                    }
                    i9 = 12582912;
                    long j72 = jKN;
                    Shape shape32 = shapeN;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    if (composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t) {
                    }
                    if (drawerPredictiveBackState == null) {
                    }
                    Modifier modifier42 = modifier2;
                    int i112 = i5 >> 6;
                    composer2 = composerKN;
                    SurfaceKt.n(SizeKt.nr(SizeKt.aYN(modifier42, f26481t, 0.0f, DrawerDefaults.f25687n.rl(), 0.0f, 10, null).Zmq(modifierS7N), 0.0f, 1, null), shape32, j72, j4, fO, 0.0f, null, ComposableLambdaKt.nr(669057502, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i12) {
                            if ((i12 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(669057502, i12, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:786)");
                            }
                            DrawerPredictiveBackState drawerPredictiveBackState3 = drawerPredictiveBackState2;
                            Modifier modifierNr = WindowInsetsPaddingKt.nr(SizeKt.aYN(Modifier.INSTANCE, NavigationDrawerKt.f26481t, 0.0f, DrawerDefaults.f25687n.rl(), 0.0f, 10, null).Zmq(drawerPredictiveBackState3 != null ? NavigationDrawerKt.nHg(Modifier.INSTANCE, drawerPredictiveBackState3, z2) : Modifier.INSTANCE), windowInsets);
                            Function3 function32 = function3;
                            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                            int iN = ComposablesKt.n(composer3, 0);
                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer3, modifierNr);
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
                            Updater.O(composerN, measurePolicyN, companion.t());
                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                            Function2 function2Rl = companion.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion.nr());
                            function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                            composer3.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, i9 | (i112 & 112) | (i112 & 896) | (i112 & 7168) | (i112 & 57344), 96);
                    if (ComposerKt.v()) {
                    }
                    shape2 = shape32;
                    j5 = j72;
                    j6 = j4;
                    f4 = fO;
                    modifier3 = modifier42;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i12) {
                            NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsets, modifier3, shape2, j5, j6, f4, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            shapeN = shape;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i10 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if (i8 == 0) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        shapeN = shape;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(Modifier modifier, Shape shape, long j2, long j3, float f3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Shape shapeUo;
        long jT2;
        long j4;
        float fNr;
        WindowInsets windowInsets2;
        Shape shape2;
        long j5;
        float f4;
        WindowInsets windowInsetsXMQ;
        int i7;
        Modifier modifier3;
        long j6;
        int i8;
        Composer composer2;
        final WindowInsets windowInsets3;
        final Modifier modifier4;
        final Shape shape3;
        final long j7;
        final long j9;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1001163336);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                shapeUo = shape;
                int i10 = composerKN.p5(shapeUo) ? 32 : 16;
                i5 |= i10;
            } else {
                shapeUo = shape;
            }
            i5 |= i10;
        } else {
            shapeUo = shape;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                jT2 = j2;
                int i11 = composerKN.nr(jT2) ? 256 : 128;
                i5 |= i11;
            } else {
                jT2 = j2;
            }
            i5 |= i11;
        } else {
            jT2 = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j4 = j3;
                int i12 = composerKN.nr(j4) ? 2048 : 1024;
                i5 |= i12;
            } else {
                j4 = j3;
            }
            i5 |= i12;
        } else {
            j4 = j3;
        }
        int i13 = i3 & 16;
        if (i13 != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                fNr = f3;
                i5 |= composerKN.rl(fNr) ? 16384 : 8192;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    int i14 = composerKN.p5(windowInsets2) ? 131072 : 65536;
                    i5 |= i14;
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 |= i14;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i3 & 64) != 0) {
                if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                }
                if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier4 = modifier2;
                    shape3 = shapeUo;
                    j7 = jT2;
                    j9 = j4;
                    f5 = fNr;
                    windowInsets3 = windowInsets2;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            i5 &= -113;
                            shapeUo = DrawerDefaults.f25687n.Uo(composerKN, 6);
                        }
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                            jT2 = DrawerDefaults.f25687n.t(composerKN, 6);
                        }
                        if ((i3 & 8) != 0) {
                            long jT3 = ColorSchemeKt.t(jT2, composerKN, (i5 >> 6) & 14);
                            i5 &= -7169;
                            j4 = jT3;
                        }
                        if (i13 != 0) {
                            fNr = DrawerDefaults.f25687n.nr();
                        }
                        if ((i3 & 32) == 0) {
                            i5 &= -458753;
                            modifier3 = modifier5;
                            shape2 = shapeUo;
                            j5 = j4;
                            f4 = fNr;
                            i8 = 1001163336;
                            windowInsetsXMQ = DrawerDefaults.f25687n.xMQ(composerKN, 6);
                            i7 = 6;
                        } else {
                            shape2 = shapeUo;
                            j5 = j4;
                            f4 = fNr;
                            windowInsetsXMQ = windowInsets2;
                            i7 = 6;
                            modifier3 = modifier5;
                            j6 = jT2;
                            i8 = 1001163336;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i8, i5, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:573)");
                            }
                            int i15 = ((i5 >> 12) & 112) | i7;
                            int i16 = i5 << 6;
                            composer2 = composerKN;
                            J2(null, windowInsetsXMQ, modifier3, shape2, j6, j5, f4, function3, composer2, i15 | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016) | ((i5 << 3) & 29360128), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            windowInsets3 = windowInsetsXMQ;
                            modifier4 = modifier3;
                            shape3 = shape2;
                            j7 = j6;
                            j9 = j5;
                            f5 = f4;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        shape2 = shapeUo;
                        j5 = j4;
                        f4 = fNr;
                        windowInsetsXMQ = windowInsets2;
                        i7 = 6;
                        i8 = 1001163336;
                        modifier3 = modifier2;
                    }
                    j6 = jT2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    int i152 = ((i5 >> 12) & 112) | i7;
                    int i162 = i5 << 6;
                    composer2 = composerKN;
                    J2(null, windowInsetsXMQ, modifier3, shape2, j6, j5, f4, function3, composer2, i152 | (i162 & 896) | (i162 & 7168) | (57344 & i162) | (458752 & i162) | (i162 & 3670016) | ((i5 << 3) & 29360128), 0);
                    if (ComposerKt.v()) {
                    }
                    windowInsets3 = windowInsetsXMQ;
                    modifier4 = modifier3;
                    shape3 = shape2;
                    j7 = j6;
                    j9 = j5;
                    f5 = f4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
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
                            NavigationDrawerKt.KN(modifier4, shape3, j7, j9, f5, windowInsets3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            if ((599187 & i5) == 599186) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        fNr = f3;
        if ((196608 & i2) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final DrawerState drawerState, Modifier modifier, Shape shape, long j2, long j3, float f3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Shape shapeUo;
        long jT2;
        long jT3;
        int i7;
        float fNr;
        WindowInsets windowInsets2;
        final WindowInsets windowInsetsXMQ;
        final Modifier modifier3;
        final Shape shape2;
        final long j4;
        final long j5;
        final float f4;
        final WindowInsets windowInsets3;
        final Shape shape3;
        final long j6;
        final long j7;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1513027356);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(drawerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    shapeUo = shape;
                    int i9 = composerKN.p5(shapeUo) ? 256 : 128;
                    i5 |= i9;
                } else {
                    shapeUo = shape;
                }
                i5 |= i9;
            } else {
                shapeUo = shape;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jT2 = j2;
                    int i10 = composerKN.nr(jT2) ? 2048 : 1024;
                    i5 |= i10;
                } else {
                    jT2 = j2;
                }
                i5 |= i10;
            } else {
                jT2 = j2;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    jT3 = j3;
                    int i11 = composerKN.nr(jT3) ? 16384 : 8192;
                    i5 |= i11;
                } else {
                    jT3 = j3;
                }
                i5 |= i11;
            } else {
                jT3 = j3;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i5 |= 196608;
            } else {
                if ((196608 & i2) == 0) {
                    fNr = f3;
                    i5 |= composerKN.rl(fNr) ? 131072 : 65536;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        windowInsets2 = windowInsets;
                        int i12 = composerKN.p5(windowInsets2) ? 1048576 : 524288;
                        i5 |= i12;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i5 |= i12;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i3 & 128) == 0) {
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                    }
                    if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                                shapeUo = DrawerDefaults.f25687n.Uo(composerKN, 6);
                            }
                            if ((i3 & 8) != 0) {
                                jT2 = DrawerDefaults.f25687n.t(composerKN, 6);
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                jT3 = ColorSchemeKt.t(jT2, composerKN, (i5 >> 9) & 14);
                                i5 &= -57345;
                            }
                            if (i7 != 0) {
                                fNr = DrawerDefaults.f25687n.nr();
                            }
                            if ((i3 & 64) == 0) {
                                i5 &= -3670017;
                                windowInsetsXMQ = DrawerDefaults.f25687n.xMQ(composerKN, 6);
                                modifier3 = modifier2;
                                shape2 = shapeUo;
                                j4 = jT2;
                                j5 = jT3;
                                f4 = fNr;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1513027356, i5, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:617)");
                            }
                            NavigationDrawer_androidKt.n(drawerState, ComposableLambdaKt.nr(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                    n(drawerPredictiveBackState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i13) {
                                    int i14;
                                    if ((i13 & 6) == 0) {
                                        i14 = i13 | (composer2.p5(drawerPredictiveBackState) ? 4 : 2);
                                    } else {
                                        i14 = i13;
                                    }
                                    if ((i14 & 19) == 18 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1552342929, i14, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:619)");
                                    }
                                    NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsetsXMQ, modifier3, shape2, j4, j5, f4, function3, composer2, i14 & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i5 & 14) | 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            windowInsets3 = windowInsetsXMQ;
                            shape3 = shape2;
                            j6 = j4;
                            j7 = j5;
                            f5 = f4;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i5 &= -3670017;
                            }
                        }
                        modifier3 = modifier2;
                        shape2 = shapeUo;
                        j4 = jT2;
                        j5 = jT3;
                        f4 = fNr;
                        windowInsetsXMQ = windowInsets2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        NavigationDrawer_androidKt.n(drawerState, ComposableLambdaKt.nr(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                n(drawerPredictiveBackState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 6) == 0) {
                                    i14 = i13 | (composer2.p5(drawerPredictiveBackState) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 19) == 18 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1552342929, i14, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:619)");
                                }
                                NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsetsXMQ, modifier3, shape2, j4, j5, f4, function3, composer2, i14 & 14, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i5 & 14) | 48);
                        if (ComposerKt.v()) {
                        }
                        windowInsets3 = windowInsetsXMQ;
                        shape3 = shape2;
                        j6 = j4;
                        j7 = j5;
                        f5 = f4;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        shape3 = shapeUo;
                        j6 = jT2;
                        j7 = jT3;
                        f5 = fNr;
                        windowInsets3 = windowInsets2;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final Modifier modifier4 = modifier3;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i13) {
                                NavigationDrawerKt.Uo(drawerState, modifier4, shape3, j6, j7, f5, windowInsets3, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 12582912;
                if ((i5 & 4793491) == 4793490) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i8 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 64) == 0) {
                            modifier3 = modifier2;
                            shape2 = shapeUo;
                            j4 = jT2;
                            j5 = jT3;
                            f4 = fNr;
                            windowInsetsXMQ = windowInsets2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        NavigationDrawer_androidKt.n(drawerState, ComposableLambdaKt.nr(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                n(drawerPredictiveBackState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 6) == 0) {
                                    i14 = i13 | (composer2.p5(drawerPredictiveBackState) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 19) == 18 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1552342929, i14, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:619)");
                                }
                                NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsetsXMQ, modifier3, shape2, j4, j5, f4, function3, composer2, i14 & 14, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i5 & 14) | 48);
                        if (ComposerKt.v()) {
                        }
                        windowInsets3 = windowInsetsXMQ;
                        shape3 = shape2;
                        j6 = j4;
                        j7 = j5;
                        f5 = f4;
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fNr = f3;
            if ((1572864 & i2) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        fNr = f3;
        if ((1572864 & i2) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final DrawerState drawerState, Modifier modifier, Shape shape, long j2, long j3, float f3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Shape shapeN;
        long jKN;
        long jT2;
        int i8;
        float fN;
        final WindowInsets windowInsetsXMQ;
        final Modifier modifier3;
        final WindowInsets windowInsets2;
        final Shape shape2;
        final long j4;
        final long j5;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1473549901);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(drawerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    shapeN = shape;
                    i5 |= composerKN.p5(shapeN) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        jKN = j2;
                        int i10 = composerKN.nr(jKN) ? 2048 : 1024;
                        i5 |= i10;
                    } else {
                        jKN = j2;
                    }
                    i5 |= i10;
                } else {
                    jKN = j2;
                }
                if ((i2 & 24576) == 0) {
                    jT2 = j3;
                    i5 |= ((i3 & 16) == 0 && composerKN.nr(jT2)) ? 16384 : 8192;
                } else {
                    jT2 = j3;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        fN = f3;
                        i5 |= composerKN.rl(fN) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i5 |= ((i3 & 64) == 0 && composerKN.p5(windowInsets)) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                        }
                        if ((i5 & 4793491) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier3 = modifier2;
                            shape2 = shapeN;
                            j4 = jKN;
                            j5 = jT2;
                            f4 = fN;
                            windowInsets2 = windowInsets;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    shapeN = RectangleShapeKt.n();
                                }
                                if ((i3 & 8) != 0) {
                                    jKN = DrawerDefaults.f25687n.KN(composerKN, 6);
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    jT2 = ColorSchemeKt.t(jKN, composerKN, (i5 >> 9) & 14);
                                    i5 &= -57345;
                                }
                                if (i8 != 0) {
                                    fN = DrawerDefaults.f25687n.n();
                                }
                                if ((i3 & 64) == 0) {
                                    i5 &= -3670017;
                                    windowInsetsXMQ = DrawerDefaults.f25687n.xMQ(composerKN, 6);
                                }
                                modifier3 = modifier2;
                                final Shape shape3 = shapeN;
                                final long j6 = jKN;
                                final long j7 = jT2;
                                final float f5 = fN;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1473549901, i5, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:705)");
                                }
                                NavigationDrawer_androidKt.n(drawerState, ComposableLambdaKt.nr(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                        n(drawerPredictiveBackState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i11) {
                                        int i12;
                                        if ((i11 & 6) == 0) {
                                            i12 = i11 | (composer2.p5(drawerPredictiveBackState) ? 4 : 2);
                                        } else {
                                            i12 = i11;
                                        }
                                        if ((i12 & 19) == 18 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-807955710, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:707)");
                                        }
                                        NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsetsXMQ, modifier3, shape3, j6, j7, f5, function3, composer2, i12 & 14, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i5 & 14) | 48);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                windowInsets2 = windowInsetsXMQ;
                                shape2 = shape3;
                                j4 = j6;
                                j5 = j7;
                                f4 = f5;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                            }
                            windowInsetsXMQ = windowInsets;
                            modifier3 = modifier2;
                            final Shape shape32 = shapeN;
                            final long j62 = jKN;
                            final long j72 = jT2;
                            final float f53 = fN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            NavigationDrawer_androidKt.n(drawerState, ComposableLambdaKt.nr(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                    n(drawerPredictiveBackState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i11) {
                                    int i12;
                                    if ((i11 & 6) == 0) {
                                        i12 = i11 | (composer2.p5(drawerPredictiveBackState) ? 4 : 2);
                                    } else {
                                        i12 = i11;
                                    }
                                    if ((i12 & 19) == 18 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-807955710, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:707)");
                                    }
                                    NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsetsXMQ, modifier3, shape32, j62, j72, f53, function3, composer2, i12 & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i5 & 14) | 48);
                            if (ComposerKt.v()) {
                            }
                            windowInsets2 = windowInsetsXMQ;
                            shape2 = shape32;
                            j4 = j62;
                            j5 = j72;
                            f4 = f53;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            final Modifier modifier4 = modifier3;
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$3
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
                                    NavigationDrawerKt.n(drawerState, modifier4, shape2, j4, j5, f4, windowInsets2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    if ((i5 & 4793491) == 4793490) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i9 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 64) == 0) {
                                windowInsetsXMQ = windowInsets;
                            }
                            modifier3 = modifier2;
                            final Shape shape322 = shapeN;
                            final long j622 = jKN;
                            final long j722 = jT2;
                            final float f532 = fN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            NavigationDrawer_androidKt.n(drawerState, ComposableLambdaKt.nr(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                    n(drawerPredictiveBackState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i11) {
                                    int i12;
                                    if ((i11 & 6) == 0) {
                                        i12 = i11 | (composer2.p5(drawerPredictiveBackState) ? 4 : 2);
                                    } else {
                                        i12 = i11;
                                    }
                                    if ((i12 & 19) == 18 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-807955710, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:707)");
                                    }
                                    NavigationDrawerKt.J2(drawerPredictiveBackState, windowInsetsXMQ, modifier3, shape322, j622, j722, f532, function3, composer2, i12 & 14, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i5 & 14) | 48);
                            if (ComposerKt.v()) {
                            }
                            windowInsets2 = windowInsetsXMQ;
                            shape2 = shape322;
                            j4 = j622;
                            j5 = j722;
                            f4 = f532;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                fN = f3;
                if ((i2 & 1572864) == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i5 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            shapeN = shape;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            fN = f3;
            if ((i2 & 1572864) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        shapeN = shape;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        fN = f3;
        if ((i2 & 1572864) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier nHg(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z2) {
        return GraphicsLayerModifierKt.n(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerChild$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                float fT = NavigationDrawerKt.T(graphicsLayerScope, drawerPredictiveBackState);
                graphicsLayerScope.Uo(fT == 0.0f ? 1.0f : NavigationDrawerKt.N(graphicsLayerScope, drawerPredictiveBackState) / fT);
                graphicsLayerScope.tUK(TransformOriginKt.n(z2 ? 0.0f : 1.0f, 0.0f));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Modifier modifier, Shape shape, long j2, long j3, float f3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Shape shapeN;
        long jKN;
        long jT2;
        int i7;
        float fN;
        WindowInsets windowInsets2;
        long j4;
        long j5;
        float f4;
        WindowInsets windowInsetsXMQ;
        Modifier modifier3;
        Shape shape2;
        int i8;
        Composer composer2;
        final WindowInsets windowInsets3;
        final Modifier modifier4;
        final Shape shape3;
        final long j6;
        final long j7;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-588600583);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                shapeN = shape;
                i5 |= composerKN.p5(shapeN) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    jKN = j2;
                    int i11 = composerKN.nr(jKN) ? 256 : 128;
                    i5 |= i11;
                } else {
                    jKN = j2;
                }
                i5 |= i11;
            } else {
                jKN = j2;
            }
            if ((i2 & 3072) != 0) {
                jT2 = j3;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(jT2)) ? 2048 : 1024;
            } else {
                jT2 = j3;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    fN = f3;
                    i5 |= composerKN.rl(fN) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        int i12 = composerKN.p5(windowInsets2) ? 131072 : 65536;
                        i5 |= i12;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i5 |= i12;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i3 & 64) == 0) {
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                shapeN = RectangleShapeKt.n();
                            }
                            if ((i3 & 4) != 0) {
                                jKN = DrawerDefaults.f25687n.KN(composerKN, 6);
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jT2 = ColorSchemeKt.t(jKN, composerKN, (i5 >> 6) & 14);
                                i5 &= -7169;
                            }
                            if (i7 != 0) {
                                fN = DrawerDefaults.f25687n.n();
                            }
                            if ((i3 & 32) == 0) {
                                i5 &= -458753;
                                shape2 = shapeN;
                                j4 = jKN;
                                j5 = jT2;
                                f4 = fN;
                                modifier3 = modifier5;
                                windowInsetsXMQ = DrawerDefaults.f25687n.xMQ(composerKN, 6);
                            } else {
                                j4 = jKN;
                                j5 = jT2;
                                f4 = fN;
                                windowInsetsXMQ = windowInsets2;
                                modifier3 = modifier5;
                                shape2 = shapeN;
                            }
                            i8 = -588600583;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            j4 = jKN;
                            j5 = jT2;
                            f4 = fN;
                            windowInsetsXMQ = windowInsets2;
                            i8 = -588600583;
                            modifier3 = modifier2;
                            shape2 = shapeN;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i8, i5, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:661)");
                        }
                        int i13 = i5 << 6;
                        composer2 = composerKN;
                        J2(null, windowInsetsXMQ, modifier3, shape2, j4, j5, f4, function3, composer2, ((i5 >> 12) & 112) | 6 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016) | ((i5 << 3) & 29360128), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        windowInsets3 = windowInsetsXMQ;
                        modifier4 = modifier3;
                        shape3 = shape2;
                        j6 = j4;
                        j7 = j5;
                        f5 = f4;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        shape3 = shapeN;
                        j6 = jKN;
                        j7 = jT2;
                        f5 = fN;
                        windowInsets3 = windowInsets2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
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
                                NavigationDrawerKt.rl(modifier4, shape3, j6, j7, f5, windowInsets3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                if ((i5 & 599187) == 599186) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        i8 = -588600583;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i132 = i5 << 6;
                        composer2 = composerKN;
                        J2(null, windowInsetsXMQ, modifier3, shape2, j4, j5, f4, function3, composer2, ((i5 >> 12) & 112) | 6 | (i132 & 896) | (i132 & 7168) | (57344 & i132) | (458752 & i132) | (i132 & 3670016) | ((i5 << 3) & 29360128), 0);
                        if (ComposerKt.v()) {
                        }
                        windowInsets3 = windowInsetsXMQ;
                        modifier4 = modifier3;
                        shape3 = shape2;
                        j6 = j4;
                        j7 = j5;
                        f5 = f4;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            fN = f3;
            if ((196608 & i2) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        shapeN = shape;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        fN = f3;
        if ((196608 & i2) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final Modifier s7N(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z2) {
        return GraphicsLayerModifierKt.n(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.Uo(NavigationDrawerKt.T(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.az(NavigationDrawerKt.N(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.tUK(TransformOriginKt.n(z2 ? 1.0f : 0.0f, 0.5f));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function2 function2, Modifier modifier, DrawerState drawerState, boolean z2, final Function2 function22, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final DrawerState drawerStateWTp;
        int i7;
        boolean z3;
        boolean z4;
        Object objIF;
        Composer.Companion companion;
        final MutableState mutableState;
        final Density density;
        boolean zP5;
        Object objIF2;
        Object objIF3;
        final vd coroutineScope;
        final String strN;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean z5;
        Object objIF4;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean zP52;
        Object objIF5;
        int iN3;
        Composer composerN3;
        Function2 function2Rl3;
        int iN4;
        Composer composerN4;
        Function2 function2Rl4;
        final Modifier modifier3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(398812198);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    drawerStateWTp = drawerState;
                    int i9 = composerKN.p5(drawerStateWTp) ? 256 : 128;
                    i5 |= i9;
                } else {
                    drawerStateWTp = drawerState;
                }
                i5 |= i9;
            } else {
                drawerStateWTp = drawerState;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
                z3 = z2;
            } else if ((i2 & 3072) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 2048 : 1024;
            } else {
                z3 = z2;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(function22) ? 16384 : 8192;
            }
            if ((i5 & 9363) == 9362 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                        drawerStateWTp = wTp(DrawerValue.Closed, null, composerKN, 6, 2);
                    }
                    if (i7 == 0) {
                        z4 = true;
                    }
                    Modifier modifier4 = modifier2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(398812198, i5, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:443)");
                    }
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                        composerKN.o(objIF);
                    }
                    mutableState = (MutableState) objIF;
                    density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    int i10 = (i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
                    zP5 = ((i10 > 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.p5(density);
                    objIF2 = composerKN.iF();
                    if (zP5 || objIF2 == companion.n()) {
                        objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
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
                                drawerStateWTp.az(density);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    EffectsKt.KN((Function0) objIF2, composerKN, 0);
                    objIF3 = composerKN.iF();
                    if (objIF3 == companion.n()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                        composerKN.o(compositionScopedCoroutineScopeCanceller);
                        objIF3 = compositionScopedCoroutineScopeCanceller;
                    }
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF3).getCoroutineScope();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                    Modifier modifierO = AnchoredDraggableKt.O(modifier4, drawerStateWTp.getAnchoredDraggableState(), Orientation.f16970t, z4, composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t, null, 16, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierO);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion4.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N);
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo, companion4.t());
                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                    function2Rl = companion4.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO2, companion4.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    z5 = (i10 <= 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256;
                    objIF4 = composerKN.iF();
                    if (z5 || objIF4 == companion.n()) {
                        objIF4 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                final Placeable placeableDR0 = ((Measurable) list.get(0)).dR0(j2);
                                final Placeable placeableDR02 = ((Measurable) list.get(1)).dR0(j2);
                                int width = placeableDR02.getWidth();
                                int height = placeableDR02.getHeight();
                                final DrawerState drawerState2 = drawerStateWTp;
                                final MutableState mutableState2 = mutableState;
                                return MeasureScope.ER(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        n(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Placeable.PlacementScope placementScope) {
                                        float fT = drawerState2.getAnchoredDraggableState().HI().t(DrawerValue.Closed);
                                        final float f3 = -placeableDR0.getWidth();
                                        if (!NavigationDrawerKt.nr(mutableState2) || fT != f3) {
                                            if (!NavigationDrawerKt.nr(mutableState2)) {
                                                NavigationDrawerKt.O(mutableState2, true);
                                            }
                                            AnchoredDraggableState.nHg(drawerState2.getAnchoredDraggableState(), AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                    n(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                    draggableAnchorsConfig.n(DrawerValue.Closed, f3);
                                                    draggableAnchorsConfig.n(DrawerValue.Open, 0.0f);
                                                }
                                            }), null, 2, null);
                                        }
                                        Placeable.PlacementScope.az(placementScope, placeableDR02, placeableDR0.getWidth() + MathKt.roundToInt(drawerState2.qie()), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.az(placementScope, placeableDR0, MathKt.roundToInt(drawerState2.qie()), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objIF4;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion5);
                    Function0 function0N2 = companion4.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N2);
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicy, companion4.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                    function2Rl2 = companion4.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO3, companion4.nr());
                    zP52 = composerKN.p5(strN) | ((i10 <= 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                    objIF5 = composerKN.iF();
                    if (zP52 || objIF5 == companion.n()) {
                        objIF5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
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
                                if (drawerStateWTp.mUb()) {
                                    final DrawerState drawerState2 = drawerStateWTp;
                                    final vd vdVar = coroutineScope;
                                    SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1

                                        /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                        @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {473}, m = "invokeSuspend", n = {}, s = {})
                                        static final class C05421 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                                            int f26511n;

                                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                                            final /* synthetic */ DrawerState f26512t;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C05421(DrawerState drawerState, Continuation continuation) {
                                                super(2, continuation);
                                                this.f26512t = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation create(Object obj, Continuation continuation) {
                                                return new C05421(this.f26512t, continuation);
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                                return ((C05421) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                return invoke2(vdVar, (Continuation) continuation);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i2 = this.f26511n;
                                                if (i2 != 0) {
                                                    if (i2 == 1) {
                                                        ResultKt.throwOnFailure(obj);
                                                    } else {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                } else {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.f26512t;
                                                    this.f26511n = 1;
                                                    if (drawerState.nr(this) == coroutine_suspended) {
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
                                            if (((Boolean) drawerState2.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                C.nr(vdVar, null, null, new C05421(drawerState2, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }
                                    }, 1, null);
                                }
                            }
                        };
                        composerKN.o(objIF5);
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(companion5, false, (Function1) objIF5, 1, null);
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                    iN3 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                    Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierNr);
                    Function0 function0N3 = companion4.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N3);
                    }
                    composerN3 = Updater.n(composerKN);
                    Updater.O(composerN3, measurePolicyUo2, companion4.t());
                    Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                    function2Rl3 = companion4.rl();
                    if (!composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                    }
                    Updater.O(composerN3, modifierO4, companion4.nr());
                    function2.invoke(composerKN, Integer.valueOf(i5 & 14));
                    composerKN.XQ();
                    MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion3.HI(), false);
                    iN4 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                    Modifier modifierO5 = ComposedModifierKt.O(composerKN, companion5);
                    Function0 function0N4 = companion4.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N4);
                    }
                    composerN4 = Updater.n(composerKN);
                    Updater.O(composerN4, measurePolicyUo3, companion4.t());
                    Updater.O(composerN4, compositionLocalMapIk4, companion4.O());
                    function2Rl4 = companion4.rl();
                    if (!composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                        composerN4.o(Integer.valueOf(iN4));
                        composerN4.az(Integer.valueOf(iN4), function2Rl4);
                    }
                    Updater.O(composerN4, modifierO5, companion4.nr());
                    function22.invoke(composerKN, Integer.valueOf((i5 >> 12) & 14));
                    composerKN.XQ();
                    composerKN.XQ();
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    z6 = z4;
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                }
                z4 = z3;
                Modifier modifier42 = modifier2;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                mutableState = (MutableState) objIF;
                density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                int i102 = (i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
                if (i102 > 256) {
                    zP5 = ((i102 > 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.p5(density);
                    objIF2 = composerKN.iF();
                    if (zP5) {
                        objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
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
                                drawerStateWTp.az(density);
                            }
                        };
                        composerKN.o(objIF2);
                        EffectsKt.KN((Function0) objIF2, composerKN, 0);
                        objIF3 = composerKN.iF();
                        if (objIF3 == companion.n()) {
                        }
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF3).getCoroutineScope();
                        Strings.Companion companion22 = Strings.INSTANCE;
                        strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                        Modifier modifierO6 = AnchoredDraggableKt.O(modifier42, drawerStateWTp.getAnchoredDraggableState(), Orientation.f16970t, z4, composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t, null, 16, null);
                        Alignment.Companion companion32 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo4 = BoxKt.Uo(companion32.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk5 = composerKN.Ik();
                        Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierO6);
                        ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                        Function0 function0N5 = companion42.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo4, companion42.t());
                        Updater.O(composerN, compositionLocalMapIk5, companion42.O());
                        function2Rl = companion42.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO22, companion42.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            if (i102 <= 256) {
                                objIF4 = composerKN.iF();
                                if (z5) {
                                    objIF4 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                                        @Override // androidx.compose.ui.layout.MeasurePolicy
                                        public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                                            final Placeable placeableDR0 = ((Measurable) list.get(0)).dR0(j2);
                                            final Placeable placeableDR02 = ((Measurable) list.get(1)).dR0(j2);
                                            int width = placeableDR02.getWidth();
                                            int height = placeableDR02.getHeight();
                                            final DrawerState drawerState2 = drawerStateWTp;
                                            final MutableState mutableState2 = mutableState;
                                            return MeasureScope.ER(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    n(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Placeable.PlacementScope placementScope) {
                                                    float fT = drawerState2.getAnchoredDraggableState().HI().t(DrawerValue.Closed);
                                                    final float f3 = -placeableDR0.getWidth();
                                                    if (!NavigationDrawerKt.nr(mutableState2) || fT != f3) {
                                                        if (!NavigationDrawerKt.nr(mutableState2)) {
                                                            NavigationDrawerKt.O(mutableState2, true);
                                                        }
                                                        AnchoredDraggableState.nHg(drawerState2.getAnchoredDraggableState(), AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                                n(draggableAnchorsConfig);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                                draggableAnchorsConfig.n(DrawerValue.Closed, f3);
                                                                draggableAnchorsConfig.n(DrawerValue.Open, 0.0f);
                                                            }
                                                        }), null, 2, null);
                                                    }
                                                    Placeable.PlacementScope.az(placementScope, placeableDR02, placeableDR0.getWidth() + MathKt.roundToInt(drawerState2.qie()), 0, 0.0f, 4, null);
                                                    Placeable.PlacementScope.az(placementScope, placeableDR0, MathKt.roundToInt(drawerState2.qie()), 0, 0.0f, 4, null);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composerKN.o(objIF4);
                                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objIF4;
                                    Modifier.Companion companion52 = Modifier.INSTANCE;
                                    iN2 = ComposablesKt.n(composerKN, 0);
                                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                                    Modifier modifierO32 = ComposedModifierKt.O(composerKN, companion52);
                                    Function0 function0N22 = companion42.n();
                                    if (composerKN.getApplier() == null) {
                                    }
                                    composerKN.T();
                                    if (composerKN.getInserting()) {
                                    }
                                    composerN2 = Updater.n(composerKN);
                                    Updater.O(composerN2, measurePolicy2, companion42.t());
                                    Updater.O(composerN2, compositionLocalMapIk22, companion42.O());
                                    function2Rl2 = companion42.rl();
                                    if (!composerN2.getInserting()) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        Updater.O(composerN2, modifierO32, companion42.nr());
                                        if (i102 <= 256) {
                                            zP52 = composerKN.p5(strN) | ((i102 <= 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                                            objIF5 = composerKN.iF();
                                            if (zP52) {
                                                objIF5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
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
                                                        if (drawerStateWTp.mUb()) {
                                                            final DrawerState drawerState2 = drawerStateWTp;
                                                            final vd vdVar = coroutineScope;
                                                            SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1

                                                                /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                                @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {473}, m = "invokeSuspend", n = {}, s = {})
                                                                static final class C05421 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                                    int f26511n;

                                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                                    final /* synthetic */ DrawerState f26512t;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C05421(DrawerState drawerState, Continuation continuation) {
                                                                        super(2, continuation);
                                                                        this.f26512t = drawerState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                                        return new C05421(this.f26512t, continuation);
                                                                    }

                                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                                                        return ((C05421) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                                        return invoke2(vdVar, (Continuation) continuation);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i2 = this.f26511n;
                                                                        if (i2 != 0) {
                                                                            if (i2 == 1) {
                                                                                ResultKt.throwOnFailure(obj);
                                                                            } else {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                        } else {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            DrawerState drawerState = this.f26512t;
                                                                            this.f26511n = 1;
                                                                            if (drawerState.nr(this) == coroutine_suspended) {
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
                                                                    if (((Boolean) drawerState2.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                                        C.nr(vdVar, null, null, new C05421(drawerState2, null), 3, null);
                                                                    }
                                                                    return Boolean.TRUE;
                                                                }
                                                            }, 1, null);
                                                        }
                                                    }
                                                };
                                                composerKN.o(objIF5);
                                                Modifier modifierNr2 = SemanticsModifierKt.nr(companion52, false, (Function1) objIF5, 1, null);
                                                MeasurePolicy measurePolicyUo22 = BoxKt.Uo(companion32.HI(), false);
                                                iN3 = ComposablesKt.n(composerKN, 0);
                                                CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                                                Modifier modifierO42 = ComposedModifierKt.O(composerKN, modifierNr2);
                                                Function0 function0N32 = companion42.n();
                                                if (composerKN.getApplier() == null) {
                                                }
                                                composerKN.T();
                                                if (composerKN.getInserting()) {
                                                }
                                                composerN3 = Updater.n(composerKN);
                                                Updater.O(composerN3, measurePolicyUo22, companion42.t());
                                                Updater.O(composerN3, compositionLocalMapIk32, companion42.O());
                                                function2Rl3 = companion42.rl();
                                                if (!composerN3.getInserting()) {
                                                    composerN3.o(Integer.valueOf(iN3));
                                                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                                    Updater.O(composerN3, modifierO42, companion42.nr());
                                                    function2.invoke(composerKN, Integer.valueOf(i5 & 14));
                                                    composerKN.XQ();
                                                    MeasurePolicy measurePolicyUo32 = BoxKt.Uo(companion32.HI(), false);
                                                    iN4 = ComposablesKt.n(composerKN, 0);
                                                    CompositionLocalMap compositionLocalMapIk42 = composerKN.Ik();
                                                    Modifier modifierO52 = ComposedModifierKt.O(composerKN, companion52);
                                                    Function0 function0N42 = companion42.n();
                                                    if (composerKN.getApplier() == null) {
                                                    }
                                                    composerKN.T();
                                                    if (composerKN.getInserting()) {
                                                    }
                                                    composerN4 = Updater.n(composerKN);
                                                    Updater.O(composerN4, measurePolicyUo32, companion42.t());
                                                    Updater.O(composerN4, compositionLocalMapIk42, companion42.O());
                                                    function2Rl4 = companion42.rl();
                                                    if (!composerN4.getInserting()) {
                                                        composerN4.o(Integer.valueOf(iN4));
                                                        composerN4.az(Integer.valueOf(iN4), function2Rl4);
                                                        Updater.O(composerN4, modifierO52, companion42.nr());
                                                        function22.invoke(composerKN, Integer.valueOf((i5 >> 12) & 14));
                                                        composerKN.XQ();
                                                        composerKN.XQ();
                                                        composerKN.XQ();
                                                        if (ComposerKt.v()) {
                                                        }
                                                        modifier3 = modifier42;
                                                        z6 = z4;
                                                    }
                                                }
                                            }
                                        } else {
                                            zP52 = composerKN.p5(strN) | ((i102 <= 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                                            objIF5 = composerKN.iF();
                                            if (zP52) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                objIF4 = composerKN.iF();
                                if (z5) {
                                }
                            }
                        }
                    }
                } else {
                    zP5 = ((i102 > 256 && composerKN.p5(drawerStateWTp)) || (i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.p5(density);
                    objIF2 = composerKN.iF();
                    if (zP5) {
                    }
                }
            } else {
                composerKN.wTp();
                z6 = z3;
                modifier3 = modifier2;
            }
            final DrawerState drawerState2 = drawerStateWTp;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3
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
                        NavigationDrawerKt.t(function2, modifier3, drawerState2, z6, function22, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i5 & 9363) == 9362) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i7 == 0) {
                    z4 = z3;
                }
                Modifier modifier422 = modifier2;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                mutableState = (MutableState) objIF;
                density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                int i1022 = (i5 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
            }
        }
        final DrawerState drawerState22 = drawerStateWTp;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(final Function2 function2, final boolean z2, final Function0 function0, Modifier modifier, Function2 function22, Function2 function23, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        Function2 function24;
        int i9;
        Function2 function25;
        Shape shape2;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        Function2 function26;
        Shape shapeO;
        NavigationDrawerItemColors navigationDrawerItemColorsN;
        MutableInteractionSource mutableInteractionSource3;
        NavigationDrawerItemColors navigationDrawerItemColors2;
        Shape shape3;
        Composer composer2;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource4;
        final NavigationDrawerItemColors navigationDrawerItemColors3;
        final Modifier modifier4;
        final Function2 function27;
        final Function2 function28;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1304626543);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function0) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function24 = function22;
                        i5 |= composerKN.E2(function24) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            function25 = function23;
                            i5 |= composerKN.E2(function25) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                shape2 = shape;
                                int i11 = composerKN.p5(shape2) ? 1048576 : 524288;
                                i5 |= i11;
                            } else {
                                shape2 = shape;
                            }
                            i5 |= i11;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 12582912) == 0) {
                            i5 |= ((i3 & 128) == 0 && composerKN.p5(navigationDrawerItemColors)) ? 8388608 : 4194304;
                        }
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i5 |= 100663296;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i2 & 100663296) == 0) {
                                i5 |= composerKN.p5(mutableInteractionSource2) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                        }
                        if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            navigationDrawerItemColors3 = navigationDrawerItemColors;
                            modifier4 = modifier2;
                            function28 = function25;
                            composer2 = composerKN;
                            shape4 = shape2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            function27 = function24;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                Function2 function29 = i8 == 0 ? null : function24;
                                function26 = i9 == 0 ? null : function25;
                                if ((i3 & 64) == 0) {
                                    i5 &= -3670017;
                                    shapeO = ShapesKt.O(NavigationDrawerTokens.f29712n.nr(), composerKN, 6);
                                } else {
                                    shapeO = shape2;
                                }
                                int i12 = i5;
                                if ((i3 & 128) == 0) {
                                    navigationDrawerItemColorsN = NavigationDrawerItemDefaults.f26479n.n(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 100663296, 255);
                                    composerKN = composerKN;
                                    i5 = i12 & (-29360129);
                                } else {
                                    navigationDrawerItemColorsN = navigationDrawerItemColors;
                                    i5 = i12;
                                }
                                mutableInteractionSource3 = i10 == 0 ? null : mutableInteractionSource;
                                navigationDrawerItemColors2 = navigationDrawerItemColorsN;
                                function24 = function29;
                                shape3 = shapeO;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i5 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier2;
                                function26 = function25;
                                shape3 = shape2;
                                navigationDrawerItemColors2 = navigationDrawerItemColors;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1304626543, i5, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:934)");
                            }
                            int i13 = i5 >> 3;
                            final NavigationDrawerItemColors navigationDrawerItemColors4 = navigationDrawerItemColors2;
                            final Function2 function210 = function24;
                            final Function2 function211 = function26;
                            Modifier modifier5 = modifier3;
                            SurfaceKt.rl(z2, function0, SizeKt.KN(SizeKt.gh(SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.KN());
                                }
                            }, 1, null), NavigationDrawerTokens.f29712n.t(), 0.0f, 2, null), 0.0f, 1, null), false, shape3, ((Color) navigationDrawerItemColors2.n(z2, composerKN, (i13 & 14) | ((i5 >> 18) & 112)).getValue()).getValue(), 0L, 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
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
                                        ComposerKt.p5(191488423, i14, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:947)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierAz = PaddingKt.az(companion, Dp.KN(16), 0.0f, Dp.KN(24), 0.0f, 10, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical verticalXMQ = companion2.xMQ();
                                    Function2 function212 = function210;
                                    NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors4;
                                    boolean z3 = z2;
                                    Function2 function213 = function211;
                                    Function2 function214 = function2;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composer3, 48);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierAz);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion3.n();
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
                                    Updater.O(composerN, measurePolicyRl, companion3.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                    Function2 function2Rl = companion3.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion3.nr());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                    composer3.eF(-449396056);
                                    if (function212 != null) {
                                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(((Color) navigationDrawerItemColors5.rl(z3, composer3, 0).getValue()).getValue())), function212, composer3, ProvidedValue.xMQ);
                                        SpacerKt.n(SizeKt.ViF(companion, Dp.KN(12)), composer3, 6);
                                    }
                                    composer3.Xw();
                                    Modifier modifierRl = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                                    int iN2 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierRl);
                                    Function0 function0N2 = companion3.n();
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
                                    Updater.O(composerN2, measurePolicyUo, companion3.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                    Function2 function2Rl2 = companion3.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion3.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    ProvidedValue providedValueNr = ContentColorKt.n().nr(Color.xMQ(((Color) navigationDrawerItemColors5.t(z3, composer3, 0).getValue()).getValue()));
                                    int i15 = ProvidedValue.xMQ;
                                    CompositionLocalKt.rl(providedValueNr, function214, composer3, i15);
                                    composer3.XQ();
                                    composer3.eF(-449381075);
                                    if (function213 != null) {
                                        SpacerKt.n(SizeKt.ViF(companion, Dp.KN(12)), composer3, 6);
                                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(((Color) navigationDrawerItemColors5.nr(z3, composer3, 0).getValue()).getValue())), function213, composer3, i15);
                                    }
                                    composer3.Xw();
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i13 & 126) | ((i5 >> 6) & 57344), ((i5 >> 24) & 14) | 48, 968);
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            shape4 = shape3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            navigationDrawerItemColors3 = navigationDrawerItemColors4;
                            modifier4 = modifier5;
                            function27 = function210;
                            function28 = function26;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3
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
                                    NavigationDrawerKt.ty(function2, z2, function0, modifier4, function27, function28, shape4, navigationDrawerItemColors3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    function25 = function23;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    if ((i5 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            int i122 = i5;
                            if ((i3 & 128) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            navigationDrawerItemColors2 = navigationDrawerItemColorsN;
                            function24 = function29;
                            shape3 = shapeO;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i132 = i5 >> 3;
                            final NavigationDrawerItemColors navigationDrawerItemColors42 = navigationDrawerItemColors2;
                            final Function2 function2102 = function24;
                            final Function2 function2112 = function26;
                            Modifier modifier52 = modifier3;
                            SurfaceKt.rl(z2, function0, SizeKt.KN(SizeKt.gh(SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.KN());
                                }
                            }, 1, null), NavigationDrawerTokens.f29712n.t(), 0.0f, 2, null), 0.0f, 1, null), false, shape3, ((Color) navigationDrawerItemColors2.n(z2, composerKN, (i132 & 14) | ((i5 >> 18) & 112)).getValue()).getValue(), 0L, 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
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
                                        ComposerKt.p5(191488423, i14, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:947)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierAz = PaddingKt.az(companion, Dp.KN(16), 0.0f, Dp.KN(24), 0.0f, 10, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical verticalXMQ = companion2.xMQ();
                                    Function2 function212 = function2102;
                                    NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors42;
                                    boolean z3 = z2;
                                    Function2 function213 = function2112;
                                    Function2 function214 = function2;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composer3, 48);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierAz);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion3.n();
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
                                    Updater.O(composerN, measurePolicyRl, companion3.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                    Function2 function2Rl = companion3.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion3.nr());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                    composer3.eF(-449396056);
                                    if (function212 != null) {
                                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(((Color) navigationDrawerItemColors5.rl(z3, composer3, 0).getValue()).getValue())), function212, composer3, ProvidedValue.xMQ);
                                        SpacerKt.n(SizeKt.ViF(companion, Dp.KN(12)), composer3, 6);
                                    }
                                    composer3.Xw();
                                    Modifier modifierRl = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                                    int iN2 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierRl);
                                    Function0 function0N2 = companion3.n();
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
                                    Updater.O(composerN2, measurePolicyUo, companion3.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                    Function2 function2Rl2 = companion3.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion3.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    ProvidedValue providedValueNr = ContentColorKt.n().nr(Color.xMQ(((Color) navigationDrawerItemColors5.t(z3, composer3, 0).getValue()).getValue()));
                                    int i15 = ProvidedValue.xMQ;
                                    CompositionLocalKt.rl(providedValueNr, function214, composer3, i15);
                                    composer3.XQ();
                                    composer3.eF(-449381075);
                                    if (function213 != null) {
                                        SpacerKt.n(SizeKt.ViF(companion, Dp.KN(12)), composer3, 6);
                                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(((Color) navigationDrawerItemColors5.nr(z3, composer3, 0).getValue()).getValue())), function213, composer3, i15);
                                    }
                                    composer3.Xw();
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i132 & 126) | ((i5 >> 6) & 57344), ((i5 >> 24) & 14) | 48, 968);
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                            }
                            shape4 = shape3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            navigationDrawerItemColors3 = navigationDrawerItemColors42;
                            modifier4 = modifier52;
                            function27 = function2102;
                            function28 = function26;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function24 = function22;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                function25 = function23;
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function24 = function22;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            function25 = function23;
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function24 = function22;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        function25 = function23;
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final DrawerState wTp(final DrawerValue drawerValue, final Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(2098699222, i2, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        Object[] objArr = new Object[0];
        Saver saverN = DrawerState.INSTANCE.n(function1);
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.p5(drawerValue)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.p5(function1)) || (i2 & 48) == 32);
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<DrawerState>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, function1);
                }
            };
            composer.o(objIF);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return drawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public static final void xMQ(Function2 function2, Modifier modifier, DrawerState drawerState, boolean z2, long j2, final Function2 function22, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        DrawerState drawerStateWTp;
        int i7;
        boolean z3;
        long jJ2;
        int i8;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        boolean zP5;
        Object objIF3;
        int i9;
        Composer.Companion companion2;
        boolean z4;
        boolean zP52;
        Object objIF4;
        int i10;
        boolean z5;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean zE2;
        Object objIF5;
        boolean zP53;
        Object objIF6;
        boolean z6;
        Object objIF7;
        boolean zP54;
        Object objIF8;
        boolean zP55;
        Object objIF9;
        int iN3;
        Composer composerN3;
        Function2 function2Rl3;
        Function2 function23;
        final DrawerState drawerState2;
        final boolean z7;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1169303680);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    drawerStateWTp = drawerState;
                    int i12 = composerKN.p5(drawerStateWTp) ? 256 : 128;
                    i5 |= i12;
                } else {
                    drawerStateWTp = drawerState;
                }
                i5 |= i12;
            } else {
                drawerStateWTp = drawerState;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
                z3 = z2;
            } else if ((i2 & 3072) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 2048 : 1024;
            } else {
                z3 = z2;
            }
            if ((i2 & 24576) != 0) {
                jJ2 = j2;
                i5 |= ((i3 & 16) == 0 && composerKN.nr(jJ2)) ? 16384 : 8192;
            } else {
                jJ2 = j2;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerKN.E2(function22) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                        drawerStateWTp = wTp(DrawerValue.Closed, null, composerKN, 6, 2);
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 16) != 0) {
                        jJ2 = DrawerDefaults.f25687n.J2(composerKN, 6);
                        i5 &= -57345;
                    }
                    final boolean z9 = z3;
                    i8 = i5;
                    long j4 = jJ2;
                    Modifier modifier3 = modifier2;
                    final DrawerState drawerState3 = drawerStateWTp;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1169303680, i8, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:320)");
                    }
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                        composerKN.o(compositionScopedCoroutineScopeCanceller);
                        objIF = compositionScopedCoroutineScopeCanceller;
                    }
                    final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                    Strings.Companion companion3 = Strings.INSTANCE;
                    final String strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                    final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                        composerKN.o(objIF2);
                    }
                    final MutableState mutableState = (MutableState) objIF2;
                    zP5 = composerKN.p5(density);
                    objIF3 = composerKN.iF();
                    if (zP5 || objIF3 == companion.n()) {
                        objIF3 = PrimitiveSnapshotStateKt.n(0.0f);
                        composerKN.o(objIF3);
                    }
                    final MutableFloatState mutableFloatState = (MutableFloatState) objIF3;
                    i9 = (i8 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
                    if (i9 > 256 || !composerKN.p5(drawerState3)) {
                        companion2 = companion;
                        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                            z4 = false;
                        }
                        zP52 = z4 | composerKN.p5(density);
                        objIF4 = composerKN.iF();
                        if (zP52 || objIF4 == companion2.n()) {
                            objIF4 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
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
                                    drawerState3.az(density);
                                }
                            };
                            composerKN.o(objIF4);
                        }
                        EffectsKt.KN((Function0) objIF4, composerKN, 0);
                        if (composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t) {
                            i10 = 1;
                            z5 = true;
                        } else {
                            i10 = 1;
                            z5 = false;
                        }
                        Modifier modifierO = AnchoredDraggableKt.O(SizeKt.J2(modifier3, 0.0f, i10, null), drawerState3.getAnchoredDraggableState(), Orientation.f16970t, z9, z5, null, 16, null);
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierO);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion5.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N);
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo, companion5.t());
                        Updater.O(composerN, compositionLocalMapIk, companion5.O());
                        function2Rl = companion5.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO2, companion5.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
                        iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion6);
                        Function0 function0N2 = companion5.n();
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N2);
                        }
                        composerN2 = Updater.n(composerKN);
                        Updater.O(composerN2, measurePolicyUo2, companion5.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                        function2Rl2 = companion5.rl();
                        if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO3, companion5.nr());
                        function22.invoke(composerKN, Integer.valueOf((i8 >> 15) & 14));
                        composerKN.XQ();
                        boolean zMUb = drawerState3.mUb();
                        zE2 = ((i8 & 7168) != 2048) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                        objIF5 = composerKN.iF();
                        if (zE2 || objIF5 == companion2.n()) {
                            objIF5 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1

                                /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1, reason: invalid class name */
                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                    int f26562n;

                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                    final /* synthetic */ DrawerState f26563t;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                        super(2, continuation);
                                        this.f26563t = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object obj, Continuation continuation) {
                                        return new AnonymousClass1(this.f26563t, continuation);
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
                                        int i2 = this.f26562n;
                                        if (i2 != 0) {
                                            if (i2 == 1) {
                                                ResultKt.throwOnFailure(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.f26563t;
                                            this.f26562n = 1;
                                            if (drawerState.nr(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
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
                                    if (z9 && ((Boolean) drawerState3.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                        C.nr(coroutineScope, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                    }
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        Function0 function0 = (Function0) objIF5;
                        zP53 = composerKN.p5(mutableFloatState) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                        objIF6 = composerKN.iF();
                        if (zP53 || objIF6 == companion2.n()) {
                            final float f3 = 0.0f;
                            objIF6 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(NavigationDrawerKt.X(NavigationDrawerKt.qie(mutableFloatState), f3, drawerState3.qie()));
                                }
                            };
                            composerKN.o(objIF6);
                        }
                        Ik(zMUb, function0, (Function0) objIF6, j4, composerKN, (i8 >> 3) & 7168);
                        z6 = (i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256;
                        objIF7 = composerKN.iF();
                        if (z6 || objIF7 == companion2.n()) {
                            objIF7 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.t(n(density2));
                                }

                                public final long n(Density density2) {
                                    float fJ2 = drawerState3.J2();
                                    return IntOffsetKt.n(!Float.isNaN(fJ2) ? MathKt.roundToInt(fJ2) : drawerState3.mUb() ? 0 : -density2.How(DrawerDefaults.f25687n.rl()), 0);
                                }
                            };
                            composerKN.o(objIF7);
                        }
                        Modifier modifierN = OffsetKt.n(companion6, (Function1) objIF7);
                        zP54 = composerKN.p5(strN) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                        objIF8 = composerKN.iF();
                        if (zP54 || objIF8 == companion2.n()) {
                            objIF8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
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
                                    if (drawerState3.mUb()) {
                                        final DrawerState drawerState4 = drawerState3;
                                        final vd vdVar = coroutineScope;
                                        SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1

                                            /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name and collision with other inner class name */
                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {380}, m = "invokeSuspend", n = {}, s = {})
                                            static final class C05441 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                int f26573n;

                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                final /* synthetic */ DrawerState f26574t;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                C05441(DrawerState drawerState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.f26574t = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation create(Object obj, Continuation continuation) {
                                                    return new C05441(this.f26574t, continuation);
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                                    return ((C05441) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                    return invoke2(vdVar, (Continuation) continuation);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i2 = this.f26573n;
                                                    if (i2 != 0) {
                                                        if (i2 == 1) {
                                                            ResultKt.throwOnFailure(obj);
                                                        } else {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                    } else {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.f26574t;
                                                        this.f26573n = 1;
                                                        if (drawerState.nr(this) == coroutine_suspended) {
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
                                                if (((Boolean) drawerState4.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                    C.nr(vdVar, null, null, new C05441(drawerState4, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }
                                        }, 1, null);
                                    }
                                }
                            };
                            composerKN.o(objIF8);
                        }
                        Modifier modifierNr = SemanticsModifierKt.nr(modifierN, false, (Function1) objIF8, 1, null);
                        zP55 = composerKN.p5(mutableFloatState) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                        objIF9 = composerKN.iF();
                        if (zP55 || objIF9 == companion2.n()) {
                            final float f4 = 0.0f;
                            objIF9 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                public final MeasureResult rl(MeasureScope measureScope, List list, long j5) {
                                    Integer numValueOf;
                                    long jNr = Constraints.nr(j5, 0, 0, 0, 0, 10, null);
                                    final ArrayList arrayList = new ArrayList(list.size());
                                    int size = list.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        arrayList.add(((Measurable) list.get(i13)).dR0(jNr));
                                    }
                                    Integer num = null;
                                    int i14 = 1;
                                    if (arrayList.isEmpty()) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(((Placeable) arrayList.get(0)).getWidth());
                                        int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                        if (1 <= lastIndex) {
                                            int i15 = 1;
                                            while (true) {
                                                Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList.get(i15)).getWidth());
                                                if (numValueOf2.compareTo(numValueOf) > 0) {
                                                    numValueOf = numValueOf2;
                                                }
                                                if (i15 == lastIndex) {
                                                    break;
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                    final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                                    if (!arrayList.isEmpty()) {
                                        Integer numValueOf3 = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
                                        int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                                        if (1 <= lastIndex2) {
                                            while (true) {
                                                Integer numValueOf4 = Integer.valueOf(((Placeable) arrayList.get(i14)).getHeight());
                                                if (numValueOf4.compareTo(numValueOf3) > 0) {
                                                    numValueOf3 = numValueOf4;
                                                }
                                                if (i14 == lastIndex2) {
                                                    break;
                                                }
                                                i14++;
                                            }
                                        }
                                        num = numValueOf3;
                                    }
                                    int iIntValue2 = num != null ? num.intValue() : 0;
                                    final DrawerState drawerState4 = drawerState3;
                                    final MutableState mutableState2 = mutableState;
                                    final MutableFloatState mutableFloatState2 = mutableFloatState;
                                    final float f5 = f4;
                                    return MeasureScope.ER(measureScope, iIntValue, iIntValue2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            n(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Placeable.PlacementScope placementScope) {
                                            float fT = drawerState4.getAnchoredDraggableState().HI().t(DrawerValue.Closed);
                                            float f6 = -iIntValue;
                                            if (!NavigationDrawerKt.mUb(mutableState2) || fT != f6) {
                                                if (!NavigationDrawerKt.mUb(mutableState2)) {
                                                    NavigationDrawerKt.gh(mutableState2, true);
                                                }
                                                NavigationDrawerKt.az(mutableFloatState2, f6);
                                                AnchoredDraggableState anchoredDraggableState = drawerState4.getAnchoredDraggableState();
                                                final float f7 = f5;
                                                final MutableFloatState mutableFloatState3 = mutableFloatState2;
                                                AnchoredDraggableState.nHg(anchoredDraggableState, AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.ModalNavigationDrawer.2.6.1.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        n(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                        draggableAnchorsConfig.n(DrawerValue.Closed, NavigationDrawerKt.qie(mutableFloatState3));
                                                        draggableAnchorsConfig.n(DrawerValue.Open, f7);
                                                    }
                                                }), null, 2, null);
                                            }
                                            List list2 = arrayList;
                                            int size2 = list2.size();
                                            for (int i16 = 0; i16 < size2; i16++) {
                                                Placeable.PlacementScope.az(placementScope, (Placeable) list2.get(i16), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composerKN.o(objIF9);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objIF9;
                        int i13 = i8 & 14;
                        iN3 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                        Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierNr);
                        Function0 function0N3 = companion5.n();
                        int i14 = ((i13 << 6) & 896) | 6;
                        if (composerKN.getApplier() == null) {
                            ComposablesKt.t();
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                            composerKN.r();
                        } else {
                            composerKN.s7N(function0N3);
                        }
                        composerN3 = Updater.n(composerKN);
                        Updater.O(composerN3, measurePolicy, companion5.t());
                        Updater.O(composerN3, compositionLocalMapIk3, companion5.O());
                        function2Rl3 = companion5.rl();
                        if (!composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                            composerN3.o(Integer.valueOf(iN3));
                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                        }
                        Updater.O(composerN3, modifierO4, companion5.nr());
                        Integer numValueOf = Integer.valueOf((i14 >> 6) & 14);
                        function23 = function2;
                        function23.invoke(composerKN, numValueOf);
                        composerKN.XQ();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        drawerState2 = drawerState3;
                        z7 = z9;
                        j3 = j4;
                        modifier2 = modifier3;
                    } else {
                        companion2 = companion;
                    }
                    z4 = true;
                    zP52 = z4 | composerKN.p5(density);
                    objIF4 = composerKN.iF();
                    if (zP52) {
                        objIF4 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
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
                                drawerState3.az(density);
                            }
                        };
                        composerKN.o(objIF4);
                        EffectsKt.KN((Function0) objIF4, composerKN, 0);
                        if (composerKN.ty(CompositionLocalsKt.az()) != LayoutDirection.f34161t) {
                        }
                        Modifier modifierO5 = AnchoredDraggableKt.O(SizeKt.J2(modifier3, 0.0f, i10, null), drawerState3.getAnchoredDraggableState(), Orientation.f16970t, z9, z5, null, 16, null);
                        Alignment.Companion companion42 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion42.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                        Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierO5);
                        ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                        Function0 function0N4 = companion52.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo3, companion52.t());
                        Updater.O(composerN, compositionLocalMapIk4, companion52.O());
                        function2Rl = companion52.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO22, companion52.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            Modifier.Companion companion62 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyUo22 = BoxKt.Uo(companion42.HI(), false);
                            iN2 = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                            Modifier modifierO32 = ComposedModifierKt.O(composerKN, companion62);
                            Function0 function0N22 = companion52.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN2 = Updater.n(composerKN);
                            Updater.O(composerN2, measurePolicyUo22, companion52.t());
                            Updater.O(composerN2, compositionLocalMapIk22, companion52.O());
                            function2Rl2 = companion52.rl();
                            if (!composerN2.getInserting()) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                Updater.O(composerN2, modifierO32, companion52.nr());
                                function22.invoke(composerKN, Integer.valueOf((i8 >> 15) & 14));
                                composerKN.XQ();
                                boolean zMUb2 = drawerState3.mUb();
                                if (i9 <= 256) {
                                    zE2 = ((i8 & 7168) != 2048) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                                    objIF5 = composerKN.iF();
                                    if (zE2) {
                                        objIF5 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1

                                            /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                int f26562n;

                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                final /* synthetic */ DrawerState f26563t;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(DrawerState drawerState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.f26563t = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation create(Object obj, Continuation continuation) {
                                                    return new AnonymousClass1(this.f26563t, continuation);
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
                                                    int i2 = this.f26562n;
                                                    if (i2 != 0) {
                                                        if (i2 == 1) {
                                                            ResultKt.throwOnFailure(obj);
                                                        } else {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                    } else {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.f26563t;
                                                        this.f26562n = 1;
                                                        if (drawerState.nr(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
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
                                                if (z9 && ((Boolean) drawerState3.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                    C.nr(coroutineScope, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                                }
                                            }
                                        };
                                        composerKN.o(objIF5);
                                        Function0 function02 = (Function0) objIF5;
                                        if (i9 <= 256) {
                                            zP53 = composerKN.p5(mutableFloatState) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                            objIF6 = composerKN.iF();
                                            if (zP53) {
                                                final float f32 = 0.0f;
                                                objIF6 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                    public final Float invoke() {
                                                        return Float.valueOf(NavigationDrawerKt.X(NavigationDrawerKt.qie(mutableFloatState), f32, drawerState3.qie()));
                                                    }
                                                };
                                                composerKN.o(objIF6);
                                                Ik(zMUb2, function02, (Function0) objIF6, j4, composerKN, (i8 >> 3) & 7168);
                                                if (i9 <= 256) {
                                                    objIF7 = composerKN.iF();
                                                    if (z6) {
                                                        objIF7 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                                                return IntOffset.t(n(density2));
                                                            }

                                                            public final long n(Density density2) {
                                                                float fJ2 = drawerState3.J2();
                                                                return IntOffsetKt.n(!Float.isNaN(fJ2) ? MathKt.roundToInt(fJ2) : drawerState3.mUb() ? 0 : -density2.How(DrawerDefaults.f25687n.rl()), 0);
                                                            }
                                                        };
                                                        composerKN.o(objIF7);
                                                        Modifier modifierN2 = OffsetKt.n(companion62, (Function1) objIF7);
                                                        if (i9 <= 256) {
                                                            zP54 = composerKN.p5(strN) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                                                            objIF8 = composerKN.iF();
                                                            if (zP54) {
                                                                objIF8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
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
                                                                        if (drawerState3.mUb()) {
                                                                            final DrawerState drawerState4 = drawerState3;
                                                                            final vd vdVar = coroutineScope;
                                                                            SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1

                                                                                /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                                                @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {380}, m = "invokeSuspend", n = {}, s = {})
                                                                                static final class C05441 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                                                    int f26573n;

                                                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                                                    final /* synthetic */ DrawerState f26574t;

                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    C05441(DrawerState drawerState, Continuation continuation) {
                                                                                        super(2, continuation);
                                                                                        this.f26574t = drawerState;
                                                                                    }

                                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                                                        return new C05441(this.f26574t, continuation);
                                                                                    }

                                                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                                                                        return ((C05441) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                                                        return invoke2(vdVar, (Continuation) continuation);
                                                                                    }

                                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                    public final Object invokeSuspend(Object obj) {
                                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                        int i2 = this.f26573n;
                                                                                        if (i2 != 0) {
                                                                                            if (i2 == 1) {
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                            } else {
                                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                            }
                                                                                        } else {
                                                                                            ResultKt.throwOnFailure(obj);
                                                                                            DrawerState drawerState = this.f26574t;
                                                                                            this.f26573n = 1;
                                                                                            if (drawerState.nr(this) == coroutine_suspended) {
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
                                                                                    if (((Boolean) drawerState4.getAnchoredDraggableState().getConfirmValueChange().invoke(DrawerValue.Closed)).booleanValue()) {
                                                                                        C.nr(vdVar, null, null, new C05441(drawerState4, null), 3, null);
                                                                                    }
                                                                                    return Boolean.TRUE;
                                                                                }
                                                                            }, 1, null);
                                                                        }
                                                                    }
                                                                };
                                                                composerKN.o(objIF8);
                                                                Modifier modifierNr2 = SemanticsModifierKt.nr(modifierN2, false, (Function1) objIF8, 1, null);
                                                                if (i9 <= 256) {
                                                                    zP55 = composerKN.p5(mutableFloatState) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                                                    objIF9 = composerKN.iF();
                                                                    if (zP55) {
                                                                        final float f42 = 0.0f;
                                                                        objIF9 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1
                                                                            @Override // androidx.compose.ui.layout.MeasurePolicy
                                                                            public final MeasureResult rl(MeasureScope measureScope, List list, long j5) {
                                                                                Integer numValueOf2;
                                                                                long jNr = Constraints.nr(j5, 0, 0, 0, 0, 10, null);
                                                                                final List arrayList = new ArrayList(list.size());
                                                                                int size = list.size();
                                                                                for (int i132 = 0; i132 < size; i132++) {
                                                                                    arrayList.add(((Measurable) list.get(i132)).dR0(jNr));
                                                                                }
                                                                                Integer num = null;
                                                                                int i142 = 1;
                                                                                if (arrayList.isEmpty()) {
                                                                                    numValueOf2 = null;
                                                                                } else {
                                                                                    numValueOf2 = Integer.valueOf(((Placeable) arrayList.get(0)).getWidth());
                                                                                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                                                                    if (1 <= lastIndex) {
                                                                                        int i15 = 1;
                                                                                        while (true) {
                                                                                            Integer numValueOf22 = Integer.valueOf(((Placeable) arrayList.get(i15)).getWidth());
                                                                                            if (numValueOf22.compareTo(numValueOf2) > 0) {
                                                                                                numValueOf2 = numValueOf22;
                                                                                            }
                                                                                            if (i15 == lastIndex) {
                                                                                                break;
                                                                                            }
                                                                                            i15++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                final int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                                                                if (!arrayList.isEmpty()) {
                                                                                    Integer numValueOf3 = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
                                                                                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                                                                                    if (1 <= lastIndex2) {
                                                                                        while (true) {
                                                                                            Integer numValueOf4 = Integer.valueOf(((Placeable) arrayList.get(i142)).getHeight());
                                                                                            if (numValueOf4.compareTo(numValueOf3) > 0) {
                                                                                                numValueOf3 = numValueOf4;
                                                                                            }
                                                                                            if (i142 == lastIndex2) {
                                                                                                break;
                                                                                            }
                                                                                            i142++;
                                                                                        }
                                                                                    }
                                                                                    num = numValueOf3;
                                                                                }
                                                                                int iIntValue2 = num != null ? num.intValue() : 0;
                                                                                final DrawerState drawerState4 = drawerState3;
                                                                                final MutableState mutableState2 = mutableState;
                                                                                final MutableFloatState mutableFloatState2 = mutableFloatState;
                                                                                final float f5 = f42;
                                                                                return MeasureScope.ER(measureScope, iIntValue, iIntValue2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.1
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    {
                                                                                        super(1);
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                        n(placementScope);
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    public final void n(Placeable.PlacementScope placementScope) {
                                                                                        float fT = drawerState4.getAnchoredDraggableState().HI().t(DrawerValue.Closed);
                                                                                        float f6 = -iIntValue;
                                                                                        if (!NavigationDrawerKt.mUb(mutableState2) || fT != f6) {
                                                                                            if (!NavigationDrawerKt.mUb(mutableState2)) {
                                                                                                NavigationDrawerKt.gh(mutableState2, true);
                                                                                            }
                                                                                            NavigationDrawerKt.az(mutableFloatState2, f6);
                                                                                            AnchoredDraggableState anchoredDraggableState = drawerState4.getAnchoredDraggableState();
                                                                                            final float f7 = f5;
                                                                                            final MutableFloatState mutableFloatState3 = mutableFloatState2;
                                                                                            AnchoredDraggableState.nHg(anchoredDraggableState, AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.ModalNavigationDrawer.2.6.1.1.1
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(1);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                                                                    n(draggableAnchorsConfig);
                                                                                                    return Unit.INSTANCE;
                                                                                                }

                                                                                                public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                                                                    draggableAnchorsConfig.n(DrawerValue.Closed, NavigationDrawerKt.qie(mutableFloatState3));
                                                                                                    draggableAnchorsConfig.n(DrawerValue.Open, f7);
                                                                                                }
                                                                                            }), null, 2, null);
                                                                                        }
                                                                                        List list2 = arrayList;
                                                                                        int size2 = list2.size();
                                                                                        for (int i16 = 0; i16 < size2; i16++) {
                                                                                            Placeable.PlacementScope.az(placementScope, (Placeable) list2.get(i16), 0, 0, 0.0f, 4, null);
                                                                                        }
                                                                                    }
                                                                                }, 4, null);
                                                                            }
                                                                        };
                                                                        composerKN.o(objIF9);
                                                                        MeasurePolicy measurePolicy2 = (MeasurePolicy) objIF9;
                                                                        int i132 = i8 & 14;
                                                                        iN3 = ComposablesKt.n(composerKN, 0);
                                                                        CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                                                                        Modifier modifierO42 = ComposedModifierKt.O(composerKN, modifierNr2);
                                                                        Function0 function0N32 = companion52.n();
                                                                        int i142 = ((i132 << 6) & 896) | 6;
                                                                        if (composerKN.getApplier() == null) {
                                                                        }
                                                                        composerKN.T();
                                                                        if (composerKN.getInserting()) {
                                                                        }
                                                                        composerN3 = Updater.n(composerKN);
                                                                        Updater.O(composerN3, measurePolicy2, companion52.t());
                                                                        Updater.O(composerN3, compositionLocalMapIk32, companion52.O());
                                                                        function2Rl3 = companion52.rl();
                                                                        if (!composerN3.getInserting()) {
                                                                            composerN3.o(Integer.valueOf(iN3));
                                                                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                                                            Updater.O(composerN3, modifierO42, companion52.nr());
                                                                            Integer numValueOf2 = Integer.valueOf((i142 >> 6) & 14);
                                                                            function23 = function2;
                                                                            function23.invoke(composerKN, numValueOf2);
                                                                            composerKN.XQ();
                                                                            composerKN.XQ();
                                                                            if (ComposerKt.v()) {
                                                                            }
                                                                            drawerState2 = drawerState3;
                                                                            z7 = z9;
                                                                            j3 = j4;
                                                                            modifier2 = modifier3;
                                                                        }
                                                                    }
                                                                } else {
                                                                    zP55 = composerKN.p5(mutableFloatState) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                                                    objIF9 = composerKN.iF();
                                                                    if (zP55) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            zP54 = composerKN.p5(strN) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                                                            objIF8 = composerKN.iF();
                                                            if (zP54) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    objIF7 = composerKN.iF();
                                                    if (z6) {
                                                    }
                                                }
                                            }
                                        } else {
                                            zP53 = composerKN.p5(mutableFloatState) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
                                            objIF6 = composerKN.iF();
                                            if (zP53) {
                                            }
                                        }
                                    }
                                } else {
                                    zE2 = ((i8 & 7168) != 2048) | ((i9 <= 256 && composerKN.p5(drawerState3)) || (i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | composerKN.E2(coroutineScope);
                                    objIF5 = composerKN.iF();
                                    if (zE2) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    final boolean z92 = z3;
                    i8 = i5;
                    long j42 = jJ2;
                    Modifier modifier32 = modifier2;
                    final DrawerState drawerState32 = drawerStateWTp;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    final vd coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                    Strings.Companion companion32 = Strings.INSTANCE;
                    final String strN2 = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                    final Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                    }
                    final MutableState mutableState2 = (MutableState) objIF2;
                    zP5 = composerKN.p5(density2);
                    objIF3 = composerKN.iF();
                    if (zP5) {
                        objIF3 = PrimitiveSnapshotStateKt.n(0.0f);
                        composerKN.o(objIF3);
                        final MutableFloatState mutableFloatState2 = (MutableFloatState) objIF3;
                        i9 = (i8 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK;
                        if (i9 > 256) {
                            companion2 = companion;
                            if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
                                z4 = true;
                            }
                            zP52 = z4 | composerKN.p5(density2);
                            objIF4 = composerKN.iF();
                            if (zP52) {
                            }
                        }
                    }
                }
            } else {
                composerKN.wTp();
                function23 = function2;
                j3 = jJ2;
                z7 = z3;
                drawerState2 = drawerStateWTp;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final Function2 function24 = function23;
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i15) {
                        NavigationDrawerKt.xMQ(function24, modifier4, drawerState2, z7, j3, function22, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((74899 & i5) == 74898) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                final boolean z922 = z3;
                i8 = i5;
                long j422 = jJ2;
                Modifier modifier322 = modifier2;
                final DrawerState drawerState322 = drawerStateWTp;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                final vd coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                Strings.Companion companion322 = Strings.INSTANCE;
                final String strN22 = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.xMQ), composerKN, 0);
                final Density density22 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                final MutableState mutableState22 = (MutableState) objIF2;
                zP5 = composerKN.p5(density22);
                objIF3 = composerKN.iF();
                if (zP5) {
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float N(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fXMQ = Size.xMQ(graphicsLayerScope.getSize());
        if (Float.isNaN(fXMQ) || fXMQ == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.t() / fXMQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float T(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        int i2;
        float fGh = Size.gh(graphicsLayerScope.getSize());
        if (Float.isNaN(fGh) || fGh == 0.0f) {
            return 1.0f;
        }
        if (drawerPredictiveBackState.nr()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return ((drawerPredictiveBackState.rl() * i2) / fGh) + 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(MutableFloatState mutableFloatState, float f3) {
        mutableFloatState.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mUb(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float qie(MutableFloatState mutableFloatState) {
        return mutableFloatState.n();
    }
}
