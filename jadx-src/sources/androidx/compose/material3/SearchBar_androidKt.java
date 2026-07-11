package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.BackEventCompat;
import androidx.view.compose.BackHandlerKt;
import androidx.view.compose.PredictiveBackHandlerKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u009b\u0001\u0010\u0016\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0093\u0002\u0010&\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0089\u0002\u0010(\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a»\u0001\u00104\u001a\u00020\u00012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010/\u001a\u00020.2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101002\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101002\b\b\u0002\u0010\t\u001a\u00020\b2\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u0096\u0001\u00107\u001a\u00020\u00012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010/\u001a\u00020.2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101002\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b7\u00108\u001a)\u0010:\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u0001012\u0006\u00109\u001a\u00020+2\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010;\u001aD\u0010C\u001a\u00020>2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\u00103\u001a\u0004\u0018\u0001012\u0006\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020+2\u0006\u0010B\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aN\u0010G\u001a\u00020>2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\u00103\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010E\u001a\u00020>2\u0006\u0010F\u001a\u00020>2\u0006\u0010B\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010H\"\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010J\"\u001a\u0010O\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010L\u0012\u0004\bM\u0010N\"\u001a\u0010R\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\bP\u0010Q\"\u001a\u0010T\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bS\u0010Q\"\u0014\u0010U\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010L\"\u001a\u0010X\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bW\u0010Q\"\u0014\u0010Z\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010L\"\u0014\u0010[\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010L\"\u0014\u0010]\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010L\"\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`\"\u0014\u0010c\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`\"\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020+0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f\"\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020+0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010f\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020+0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010f\"\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020l0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010f\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020l0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010f\"\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s\"\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006{²\u0006\f\u0010y\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010z\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "inputField", "", "expanded", "Lkotlin/Function1;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "nr", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "query", "onQueryChange", "onSearch", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "t", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationProgress", "Landroidx/compose/runtime/MutableFloatState;", "finalBackProgress", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "firstBackEvent", "currentBackEvent", "O", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "surface", "KN", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "progress", "WPU", "(Landroidx/activity/BackEventCompat;FF)F", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "minMargin", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "predictiveBackMultiplier", "aYN", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "height", "maxOffsetY", "ViF", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/TextFieldColors;", "UnspecifiedTextFieldColors", "F", "getSearchBarCornerRadius$annotations", "()V", "SearchBarCornerRadius", "nY", "()F", "DockedExpandedTableMinHeight", "g", "SearchBarMinWidth", "SearchBarMaxWidth", "J2", "te", "SearchBarVerticalPadding", "Uo", "SearchBarIconOffsetX", "SearchBarPredictiveBackMinMargin", "xMQ", "SearchBarPredictiveBackMaxOffsetY", "Landroidx/compose/animation/core/CubicBezierEasing;", "mUb", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterEasing", "gh", "AnimationExitEasing", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "qie", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationEnterFloatSpec", "az", "AnimationExitFloatSpec", "ty", "AnimationPredictiveBackExitFloatSpec", "Landroidx/compose/ui/unit/IntSize;", "HI", "AnimationEnterSizeSpec", "ck", "AnimationExitSizeSpec", "Landroidx/compose/animation/EnterTransition;", "Ik", "Landroidx/compose/animation/EnterTransition;", "DockedEnterTransition", "Landroidx/compose/animation/ExitTransition;", "r", "Landroidx/compose/animation/ExitTransition;", "DockedExitTransition", "useFullScreenShape", "showContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1243:1\n1223#2,6:1244\n1223#2,6:1250\n1223#2,6:1256\n1223#2,6:1262\n1223#2,6:1268\n1223#2,6:1274\n1223#2,6:1280\n1223#2,6:1286\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1311\n1223#2,6:1317\n1223#2,6:1323\n77#3:1292\n78#4,6:1329\n85#4,4:1344\n89#4,2:1354\n78#4,6:1364\n85#4,4:1379\n89#4,2:1389\n93#4:1395\n78#4,6:1404\n85#4,4:1419\n89#4,2:1429\n93#4:1435\n78#4,6:1444\n85#4,4:1459\n89#4,2:1469\n93#4:1475\n93#4:1479\n368#5,9:1335\n377#5:1356\n368#5,9:1370\n377#5:1391\n378#5,2:1393\n368#5,9:1410\n377#5:1431\n378#5,2:1433\n368#5,9:1450\n377#5:1471\n378#5,2:1473\n378#5,2:1477\n4032#6,6:1348\n4032#6,6:1383\n4032#6,6:1423\n4032#6,6:1463\n71#7:1357\n68#7,6:1358\n74#7:1392\n78#7:1396\n71#7:1397\n68#7,6:1398\n74#7:1432\n78#7:1436\n71#7:1437\n68#7,6:1438\n74#7:1472\n78#7:1476\n81#8:1480\n81#8:1481\n71#9:1482\n148#10:1483\n148#10:1484\n148#10:1485\n148#10:1486\n148#10:1487\n148#10:1488\n148#10:1489\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n179#1:1244,6\n180#1:1250,6\n181#1:1256,6\n182#1:1262,6\n184#1:1268,6\n200#1:1274,6\n201#1:1280,6\n326#1:1286,6\n873#1:1293,6\n877#1:1299,6\n904#1:1305,6\n946#1:1311,6\n951#1:1317,6\n966#1:1323,6\n869#1:1292\n947#1:1329,6\n947#1:1344,4\n947#1:1354,2\n956#1:1364,6\n956#1:1379,4\n956#1:1389,2\n956#1:1395\n957#1:1404,6\n957#1:1419,4\n957#1:1429,2\n957#1:1435\n961#1:1444,6\n961#1:1459,4\n961#1:1469,2\n961#1:1475\n947#1:1479\n947#1:1335,9\n947#1:1356\n956#1:1370,9\n956#1:1391\n956#1:1393,2\n957#1:1410,9\n957#1:1431\n957#1:1433,2\n961#1:1450,9\n961#1:1471\n961#1:1473,2\n947#1:1477,2\n947#1:1348,6\n956#1:1383,6\n957#1:1423,6\n961#1:1463,6\n956#1:1357\n956#1:1358,6\n956#1:1392\n956#1:1396\n957#1:1397\n957#1:1398,6\n957#1:1432\n957#1:1436\n961#1:1437\n961#1:1438,6\n961#1:1472\n961#1:1476\n873#1:1480\n904#1:1481\n1191#1:1482\n1192#1:1483\n1194#1:1484\n1195#1:1485\n1196#1:1486\n1198#1:1487\n1200#1:1488\n1202#1:1489\n*E\n"})
public final class SearchBar_androidKt {
    private static final FiniteAnimationSpec HI;
    private static final EnterTransition Ik;
    private static final float J2;
    private static final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f27276O;
    private static final float Uo;
    private static final FiniteAnimationSpec az;
    private static final FiniteAnimationSpec ck;
    private static final CubicBezierEasing gh;
    private static final CubicBezierEasing mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TextFieldColors f27277n;
    private static final float nr;
    private static final FiniteAnimationSpec qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ExitTransition f27278r;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f27279t;
    private static final FiniteAnimationSpec ty;
    private static final float xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ViF(long j2, int i2, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i3, int i5, float f3) {
        if (backEventCompat2 == null || backEventCompat == null || f3 == 0.0f) {
            return 0;
        }
        int iMin = Math.min(Math.max(0, ((Constraints.gh(j2) - i3) / 2) - i2), i5);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float fAbs = Math.abs(touchY) / Constraints.gh(j2);
        return MathKt.roundToInt(MathHelpersKt.t(0, iMin, fAbs) * f3 * Math.signum(touchY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WPU(BackEventCompat backEventCompat, float f3, float f4) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f4)) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        return f3 / f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String str, final Function1 function1, final Function1 function12, final boolean z2, final Function1 function13, Modifier modifier, boolean z3, Function2 function2, Function2 function22, Function2 function23, Shape shape, SearchBarColors searchBarColors, float f3, float f4, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        String str2;
        int i7;
        int i8;
        final Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Function2 function24;
        int i11;
        Function2 function25;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Shape shapeT;
        boolean z5;
        Composer composer2;
        int i23;
        SearchBarColors searchBarColorsRl;
        int i24;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function26;
        final SearchBarColors searchBarColors2;
        float f5;
        float f6;
        Shape shape2;
        final Function2 function27;
        Modifier modifier3;
        final Function2 function28;
        final boolean z6;
        final float f7;
        Composer composer3;
        final SearchBarColors searchBarColors3;
        final boolean z7;
        final Function2 function29;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final float f8;
        final Function2 function210;
        final Function2 function211;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1299054533);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 6) == 0) {
                i7 = (composerKN.p5(str2) ? 4 : 2) | i2;
            } else {
                i7 = i2;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(function12) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i7 |= composerKN.n(z2) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i7 |= composerKN.E2(function13) ? 16384 : 8192;
                }
                i8 = i5 & 32;
                if (i8 != 0) {
                    i7 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 196608) == 0) {
                        i7 |= composerKN.p5(modifier2) ? 131072 : 65536;
                    }
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i7 |= 1572864;
                    z4 = z3;
                } else {
                    z4 = z3;
                    if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.n(z4) ? 1048576 : 524288;
                    }
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i7 |= 12582912;
                    function24 = function2;
                } else {
                    function24 = function2;
                    if ((i2 & 12582912) == 0) {
                        i7 |= composerKN.E2(function24) ? 8388608 : 4194304;
                    }
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i7 |= 100663296;
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i2 & 100663296) == 0) {
                        i7 |= composerKN.E2(function25) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i13 = i12;
                        i7 |= composerKN.E2(function23) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        i14 = i3 | (((i5 & 1024) == 0 && composerKN.p5(shape)) ? 4 : 2);
                    } else {
                        i14 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i14 |= ((i5 & 2048) == 0 && composerKN.p5(searchBarColors)) ? 32 : 16;
                    }
                    int i25 = i14;
                    i15 = i5 & 4096;
                    if (i15 == 0) {
                        i16 = i25 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        int i26 = i25;
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i26 |= composerKN.rl(f3) ? 256 : 128;
                        }
                        i16 = i26;
                    }
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i18 = i16 | 3072;
                    } else {
                        int i27 = i16;
                        if ((i3 & 3072) == 0) {
                            i18 = i27 | (composerKN.rl(f4) ? 2048 : 1024);
                        } else {
                            i18 = i27;
                        }
                    }
                    i19 = i5 & 16384;
                    if (i19 == 0) {
                        i20 = i18 | 24576;
                    } else {
                        i20 = i18;
                        if ((i3 & 24576) == 0) {
                            i20 |= composerKN.p5(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i5 & 32768) == 0) {
                            if ((i3 & 196608) == 0) {
                                i21 = i19;
                                i20 |= composerKN.E2(function3) ? 131072 : 65536;
                            }
                            if ((i7 & 306783379) != 306783378 && (i20 & 74899) == 74898 && composerKN.xMQ()) {
                                composerKN.wTp();
                                shape3 = shape;
                                searchBarColors3 = searchBarColors;
                                f7 = f4;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                z7 = z4;
                                function210 = function24;
                                composer3 = composerKN;
                                function211 = function23;
                                f8 = f3;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z9 = i9 == 0 ? true : z4;
                                    Function2 function212 = i10 == 0 ? null : function24;
                                    if (i11 != 0) {
                                        function25 = null;
                                    }
                                    Function2 function213 = i13 == 0 ? null : function23;
                                    if ((i5 & 1024) == 0) {
                                        i22 = i20 & (-15);
                                        shapeT = SearchBarDefaults.f27243n.t(composerKN, 6);
                                    } else {
                                        i22 = i20;
                                        shapeT = shape;
                                    }
                                    if ((i5 & 2048) == 0) {
                                        z5 = true;
                                        composer2 = composerKN;
                                        i23 = i7;
                                        searchBarColorsRl = SearchBarDefaults.f27243n.rl(0L, 0L, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 3);
                                        i24 = i22 & (-113);
                                    } else {
                                        z5 = true;
                                        composer2 = composerKN;
                                        i23 = i7;
                                        searchBarColorsRl = searchBarColors;
                                        i24 = i22;
                                    }
                                    float fKN = i15 == 0 ? SearchBarDefaults.f27243n.KN() : f3;
                                    float fUo = i17 == 0 ? SearchBarDefaults.f27243n.Uo() : f4;
                                    if (i21 == 0) {
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsRl;
                                        f5 = fKN;
                                        f6 = fUo;
                                        shape2 = shapeT;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsRl;
                                        f5 = fKN;
                                        f6 = fUo;
                                        shape2 = shapeT;
                                    }
                                    function27 = function213;
                                    modifier3 = modifier4;
                                    function28 = function212;
                                    z6 = z9;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 1024) != 0) {
                                        i20 &= -15;
                                    }
                                    if ((i5 & 2048) != 0) {
                                        i20 &= -113;
                                    }
                                    function27 = function23;
                                    searchBarColors2 = searchBarColors;
                                    f6 = f4;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    function26 = function25;
                                    z5 = true;
                                    modifier3 = modifier2;
                                    z6 = z4;
                                    function28 = function24;
                                    composer2 = composerKN;
                                    i24 = i20;
                                    shape2 = shape;
                                    f5 = f3;
                                    i23 = i7;
                                }
                                composer2.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1299054533, i23, i24, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)");
                                }
                                final String str3 = str2;
                                int i28 = i23 >> 6;
                                int i29 = i24 << 12;
                                Composer composer4 = composer2;
                                SearchBarColors searchBarColors4 = searchBarColors2;
                                n(ComposableLambdaKt.nr(-303118761, z5, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i30) {
                                        if ((i30 & 3) == 2 && composer5.xMQ()) {
                                            composer5.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-303118761, i30, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                        }
                                        SearchBarDefaults.f27243n.n(str3, function1, function12, z2, function13, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), z6, function28, function26, function27, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer5, 196608, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), z2, function13, modifier3, shape2, searchBarColors4, f5, f6, function3, composer4, (i28 & 7168) | (i28 & 112) | 6 | (i28 & 896) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128) | ((i24 << 9) & 234881024), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                f7 = f6;
                                composer3 = composer4;
                                searchBarColors3 = searchBarColors4;
                                z7 = z6;
                                function29 = function26;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                f8 = f5;
                                function210 = function28;
                                function211 = function27;
                            }
                            scopeUpdateScopeGh = composer3.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i30) {
                                        SearchBar_androidKt.rl(str, function1, function12, z2, function13, modifier2, z7, function210, function29, function211, shape3, searchBarColors3, f8, f7, mutableInteractionSource3, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i20 |= 196608;
                        i21 = i19;
                        if ((i7 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i13 == 0) {
                                }
                                if ((i5 & 1024) == 0) {
                                }
                                if ((i5 & 2048) == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                function27 = function213;
                                modifier3 = modifier4;
                                function28 = function212;
                                z6 = z9;
                                composer2.S();
                                if (ComposerKt.v()) {
                                }
                                final String str32 = str2;
                                int i282 = i23 >> 6;
                                int i292 = i24 << 12;
                                Composer composer42 = composer2;
                                SearchBarColors searchBarColors42 = searchBarColors2;
                                n(ComposableLambdaKt.nr(-303118761, z5, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i30) {
                                        if ((i30 & 3) == 2 && composer5.xMQ()) {
                                            composer5.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-303118761, i30, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                        }
                                        SearchBarDefaults.f27243n.n(str32, function1, function12, z2, function13, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), z6, function28, function26, function27, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer5, 196608, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), z2, function13, modifier3, shape2, searchBarColors42, f5, f6, function3, composer42, (i282 & 7168) | (i282 & 112) | 6 | (i282 & 896) | (57344 & i292) | (458752 & i292) | (3670016 & i292) | (i292 & 29360128) | ((i24 << 9) & 234881024), 0);
                                if (ComposerKt.v()) {
                                }
                                modifier2 = modifier3;
                                f7 = f6;
                                composer3 = composer42;
                                searchBarColors3 = searchBarColors42;
                                z7 = z6;
                                function29 = function26;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                f8 = f5;
                                function210 = function28;
                                function211 = function27;
                            }
                        }
                        scopeUpdateScopeGh = composer3.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    if ((i5 & 32768) == 0) {
                    }
                    i21 = i19;
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i13 = i12;
                if ((i3 & 6) != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i252 = i14;
                i15 = i5 & 4096;
                if (i15 == 0) {
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                i19 = i5 & 16384;
                if (i19 == 0) {
                }
                if ((i5 & 32768) == 0) {
                }
                i21 = i19;
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i3 & 6) != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i2522 = i14;
            i15 = i5 & 4096;
            if (i15 == 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            i19 = i5 & 16384;
            if (i19 == 0) {
            }
            if ((i5 & 32768) == 0) {
            }
            i21 = i19;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 16) == 0) {
        }
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i25222 = i14;
        i15 = i5 & 4096;
        if (i15 == 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        i19 = i5 & 16384;
        if (i19 == 0) {
        }
        if ((i5 & 32768) == 0) {
        }
        i21 = i19;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final String str, final Function1 function1, final Function1 function12, final boolean z2, final Function1 function13, Modifier modifier, boolean z3, Function2 function2, Function2 function22, Function2 function23, Shape shape, SearchBarColors searchBarColors, float f3, float f4, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function1 function14;
        int i8;
        final Modifier modifier2;
        int i9;
        boolean z4;
        int i10;
        Function2 function24;
        int i11;
        Function2 function25;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Shape shapeJ2;
        Composer composer2;
        int i21;
        SearchBarColors searchBarColorsRl;
        WindowInsets windowInsetsXMQ;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function26;
        final SearchBarColors searchBarColors2;
        float f5;
        float f6;
        WindowInsets windowInsets2;
        final Function2 function27;
        final Function2 function28;
        Shape shape2;
        Modifier modifier3;
        final boolean z5;
        int i22;
        final float f7;
        final WindowInsets windowInsets3;
        Composer composer3;
        final SearchBarColors searchBarColors3;
        final boolean z6;
        final Function2 function29;
        final Function2 function210;
        final MutableInteractionSource mutableInteractionSource3;
        final float f8;
        final Shape shape3;
        final Function2 function211;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1001512593);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function14 = function1;
        } else {
            function14 = function1;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function14) ? 32 : 16;
            }
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(function12) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i7 |= composerKN.n(z2) ? 2048 : 1024;
            }
            int i23 = 8192;
            if ((i5 & 16) == 0) {
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i7 |= composerKN.E2(function13) ? 16384 : 8192;
                }
                i8 = i5 & 32;
                if (i8 != 0) {
                    i7 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 196608) == 0) {
                        i7 |= composerKN.p5(modifier2) ? 131072 : 65536;
                    }
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i7 |= 1572864;
                    z4 = z3;
                } else {
                    z4 = z3;
                    if ((i2 & 1572864) == 0) {
                        i7 |= composerKN.n(z4) ? 1048576 : 524288;
                    }
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i7 |= 12582912;
                    function24 = function2;
                } else {
                    function24 = function2;
                    if ((i2 & 12582912) == 0) {
                        i7 |= composerKN.E2(function24) ? 8388608 : 4194304;
                    }
                }
                i11 = i5 & 256;
                if (i11 != 0) {
                    i7 |= 100663296;
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i2 & 100663296) == 0) {
                        i7 |= composerKN.E2(function25) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                }
                i12 = i5 & 512;
                if (i12 != 0) {
                    i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i13 = i12;
                        i7 |= composerKN.E2(function23) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        i14 = i3 | (((i5 & 1024) == 0 && composerKN.p5(shape)) ? 4 : 2);
                    } else {
                        i14 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i14 |= ((i5 & 2048) == 0 && composerKN.p5(searchBarColors)) ? 32 : 16;
                    }
                    int i24 = i14;
                    i15 = i5 & 4096;
                    if (i15 == 0) {
                        i16 = i24 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        int i25 = i24;
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i25 |= composerKN.rl(f3) ? 256 : 128;
                        }
                        i16 = i25;
                    }
                    i17 = i5 & 8192;
                    if (i17 == 0) {
                        i18 = i16 | 3072;
                    } else {
                        i18 = i16;
                        if ((i3 & 3072) == 0) {
                            i18 |= composerKN.rl(f4) ? 2048 : 1024;
                        }
                        if ((i3 & 24576) == 0) {
                            if ((i5 & 16384) == 0 && composerKN.p5(windowInsets)) {
                                i23 = 16384;
                            }
                            i18 |= i23;
                        }
                        i19 = i5 & 32768;
                        if (i19 == 0) {
                            if ((i3 & 196608) == 0) {
                                i20 = i17;
                                i18 |= composerKN.p5(mutableInteractionSource) ? 131072 : 65536;
                            }
                            if ((i5 & 65536) == 0) {
                                i18 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i18 |= composerKN.E2(function3) ? 1048576 : 524288;
                            }
                            if ((i7 & 306783379) != 306783378 && (i18 & 599187) == 599186 && composerKN.xMQ()) {
                                composerKN.wTp();
                                shape3 = shape;
                                searchBarColors3 = searchBarColors;
                                f7 = f3;
                                windowInsets3 = windowInsets;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                z6 = z4;
                                function211 = function24;
                                composer3 = composerKN;
                                function210 = function23;
                                f8 = f4;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z7 = i9 == 0 ? true : z4;
                                    Function2 function212 = i10 == 0 ? null : function24;
                                    if (i11 != 0) {
                                        function25 = null;
                                    }
                                    Function2 function213 = i13 == 0 ? null : function23;
                                    if ((i5 & 1024) == 0) {
                                        i18 &= -15;
                                        shapeJ2 = SearchBarDefaults.f27243n.J2(composerKN, 6);
                                    } else {
                                        shapeJ2 = shape;
                                    }
                                    if ((i5 & 2048) == 0) {
                                        composer2 = composerKN;
                                        i21 = i7;
                                        searchBarColorsRl = SearchBarDefaults.f27243n.rl(0L, 0L, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 3);
                                        i18 &= -113;
                                    } else {
                                        composer2 = composerKN;
                                        i21 = i7;
                                        searchBarColorsRl = searchBarColors;
                                    }
                                    float fKN = i15 == 0 ? SearchBarDefaults.f27243n.KN() : f3;
                                    float fUo = i20 == 0 ? SearchBarDefaults.f27243n.Uo() : f4;
                                    if ((i5 & 16384) == 0) {
                                        windowInsetsXMQ = SearchBarDefaults.f27243n.xMQ(composer2, 6);
                                        i18 &= -57345;
                                    } else {
                                        windowInsetsXMQ = windowInsets;
                                    }
                                    if (i19 == 0) {
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsRl;
                                        f5 = fKN;
                                        f6 = fUo;
                                        windowInsets2 = windowInsetsXMQ;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsRl;
                                        f5 = fKN;
                                        f6 = fUo;
                                        windowInsets2 = windowInsetsXMQ;
                                    }
                                    function27 = function212;
                                    function28 = function213;
                                    shape2 = shapeJ2;
                                    modifier3 = modifier4;
                                    z5 = z7;
                                    i22 = i18;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 1024) != 0) {
                                        i18 &= -15;
                                    }
                                    if ((i5 & 2048) != 0) {
                                        i18 &= -113;
                                    }
                                    if ((i5 & 16384) != 0) {
                                        i18 &= -57345;
                                    }
                                    function28 = function23;
                                    searchBarColors2 = searchBarColors;
                                    f6 = f4;
                                    windowInsets2 = windowInsets;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    function26 = function25;
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    function27 = function24;
                                    composer2 = composerKN;
                                    i22 = i18;
                                    shape2 = shape;
                                    f5 = f3;
                                    i21 = i7;
                                }
                                composer2.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1001512593, i21, i22, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)");
                                }
                                final Function1 function15 = function14;
                                int i26 = i21 >> 6;
                                int i27 = 6 | (i26 & 112) | (i26 & 896) | (i26 & 7168);
                                int i28 = i22 << 12;
                                Composer composer4 = composer2;
                                SearchBarColors searchBarColors4 = searchBarColors2;
                                nr(ComposableLambdaKt.nr(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i29) {
                                        if ((i29 & 3) == 2 && composer5.xMQ()) {
                                            composer5.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1158111311, i29, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                        }
                                        SearchBarDefaults.f27243n.n(str, function15, function12, z2, function13, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), z5, function27, function26, function28, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer5, 196608, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), z2, function13, modifier3, shape2, searchBarColors4, f5, f6, windowInsets2, function3, composer4, i27 | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (i28 & 234881024) | ((i22 << 9) & 1879048192), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier2 = modifier3;
                                f7 = f5;
                                windowInsets3 = windowInsets2;
                                composer3 = composer4;
                                searchBarColors3 = searchBarColors4;
                                z6 = z5;
                                function29 = function26;
                                function210 = function28;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                f8 = f6;
                                shape3 = shape2;
                                function211 = function27;
                            }
                            scopeUpdateScopeGh = composer3.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i29) {
                                        SearchBar_androidKt.t(str, function1, function12, z2, function13, modifier2, z6, function211, function29, function210, shape3, searchBarColors3, f7, f8, windowInsets3, mutableInteractionSource3, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i18 |= 196608;
                        i20 = i17;
                        if ((i5 & 65536) == 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i13 == 0) {
                                }
                                if ((i5 & 1024) == 0) {
                                }
                                if ((i5 & 2048) == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if ((i5 & 16384) == 0) {
                                }
                                if (i19 == 0) {
                                }
                                function27 = function212;
                                function28 = function213;
                                shape2 = shapeJ2;
                                modifier3 = modifier4;
                                z5 = z7;
                                i22 = i18;
                                composer2.S();
                                if (ComposerKt.v()) {
                                }
                                final Function1 function152 = function14;
                                int i262 = i21 >> 6;
                                int i272 = 6 | (i262 & 112) | (i262 & 896) | (i262 & 7168);
                                int i282 = i22 << 12;
                                Composer composer42 = composer2;
                                SearchBarColors searchBarColors42 = searchBarColors2;
                                nr(ComposableLambdaKt.nr(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        n(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer5, int i29) {
                                        if ((i29 & 3) == 2 && composer5.xMQ()) {
                                            composer5.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1158111311, i29, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                        }
                                        SearchBarDefaults.f27243n.n(str, function152, function12, z2, function13, SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), z5, function27, function26, function28, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer5, 196608, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), z2, function13, modifier3, shape2, searchBarColors42, f5, f6, windowInsets2, function3, composer42, i272 | (57344 & i282) | (458752 & i282) | (3670016 & i282) | (29360128 & i282) | (i282 & 234881024) | ((i22 << 9) & 1879048192), 0);
                                if (ComposerKt.v()) {
                                }
                                modifier2 = modifier3;
                                f7 = f5;
                                windowInsets3 = windowInsets2;
                                composer3 = composer42;
                                searchBarColors3 = searchBarColors42;
                                z6 = z5;
                                function29 = function26;
                                function210 = function28;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                f8 = f6;
                                shape3 = shape2;
                                function211 = function27;
                            }
                        }
                        scopeUpdateScopeGh = composer3.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i19 = i5 & 32768;
                    if (i19 == 0) {
                    }
                    i20 = i17;
                    if ((i5 & 65536) == 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer3.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i13 = i12;
                if ((i3 & 6) != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i242 = i14;
                i15 = i5 & 4096;
                if (i15 == 0) {
                }
                i17 = i5 & 8192;
                if (i17 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i19 = i5 & 32768;
                if (i19 == 0) {
                }
                i20 = i17;
                if ((i5 & 65536) == 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i5 & 256;
            if (i11 != 0) {
            }
            i12 = i5 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i3 & 6) != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i2422 = i14;
            i15 = i5 & 4096;
            if (i15 == 0) {
            }
            i17 = i5 & 8192;
            if (i17 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i19 = i5 & 32768;
            if (i19 == 0) {
            }
            i20 = i17;
            if ((i5 & 65536) == 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        int i232 = 8192;
        if ((i5 & 16) == 0) {
        }
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i5 & 256;
        if (i11 != 0) {
        }
        i12 = i5 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i24222 = i14;
        i15 = i5 & 4096;
        if (i15 == 0) {
        }
        i17 = i5 & 8192;
        if (i17 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i19 = i5 & 32768;
        if (i19 == 0) {
        }
        i20 = i17;
        if ((i5 & 65536) == 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    static {
        Color.Companion companion = Color.INSTANCE;
        f27277n = new TextFieldColors(companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), new SelectionColors(companion.Uo(), companion.Uo(), null), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), companion.Uo(), null);
        rl = Dp.KN(SearchBarDefaults.f27243n.O() / 2);
        f27279t = Dp.KN(240);
        nr = Dp.KN(360);
        f27276O = Dp.KN(720);
        float f3 = 8;
        J2 = Dp.KN(f3);
        Uo = Dp.KN(4);
        KN = Dp.KN(f3);
        xMQ = Dp.KN(24);
        CubicBezierEasing cubicBezierEasingRl = MotionTokens.f29694n.rl();
        mUb = cubicBezierEasingRl;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        gh = cubicBezierEasing;
        TweenSpec tweenSpecAz = AnimationSpecKt.az(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE, 100, cubicBezierEasingRl);
        qie = tweenSpecAz;
        TweenSpec tweenSpecAz2 = AnimationSpecKt.az(350, 100, cubicBezierEasing);
        az = tweenSpecAz2;
        ty = AnimationSpecKt.ty(350, 0, cubicBezierEasing, 2, null);
        TweenSpec tweenSpecAz3 = AnimationSpecKt.az(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE, 100, cubicBezierEasingRl);
        HI = tweenSpecAz3;
        TweenSpec tweenSpecAz4 = AnimationSpecKt.az(350, 100, cubicBezierEasing);
        ck = tweenSpecAz4;
        Ik = EnterExitTransitionKt.HI(tweenSpecAz, 0.0f, 2, null).t(EnterExitTransitionKt.az(tweenSpecAz3, null, false, null, 14, null));
        f27278r = EnterExitTransitionKt.Ik(tweenSpecAz2, 0.0f, 2, null).t(EnterExitTransitionKt.ViF(tweenSpecAz4, null, false, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final Animatable animatable, final MutableFloatState mutableFloatState, final MutableState mutableState, final MutableState mutableState2, final Modifier modifier, final WindowInsets windowInsets, final Function2 function2, final Function2 function22, final Function2 function23, Composer composer, final int i2) {
        int i3;
        final MutableFloatState mutableFloatState2;
        MutableState mutableState3;
        MutableState mutableState4;
        int i5;
        Composer composerKN = composer.KN(70029564);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(animatable) : composerKN.E2(animatable) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            mutableFloatState2 = mutableFloatState;
            i3 |= composerKN.p5(mutableFloatState2) ? 32 : 16;
        } else {
            mutableFloatState2 = mutableFloatState;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            mutableState3 = mutableState;
            i3 |= composerKN.p5(mutableState3) ? 256 : 128;
        } else {
            mutableState3 = mutableState;
        }
        if ((i2 & 3072) == 0) {
            mutableState4 = mutableState2;
            i3 |= composerKN.p5(mutableState4) ? 2048 : 1024;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(modifier) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(70029564, i3, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new MutableWindowInsets(null, 1, null);
                composerKN.o(objIF);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objIF;
            Modifier modifierN = ZIndexModifierKt.n(modifier, 1.0f);
            boolean z2 = (i3 & 458752) == 131072;
            Object objIF2 = composerKN.iF();
            if (z2 || objIF2 == companion.n()) {
                objIF2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                        n(windowInsets2);
                        return Unit.INSTANCE;
                    }

                    public final void n(WindowInsets windowInsets2) {
                        mutableWindowInsets.J2(WindowInsetsKt.Uo(windowInsets, windowInsets2));
                    }
                };
                composerKN.o(objIF2);
            }
            Modifier modifierN2 = WindowInsetsPaddingKt.n(WindowInsetsPaddingKt.t(modifierN, (Function1) objIF2), windowInsets);
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerKN.E2(animatable))) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objIF3 = composerKN.iF();
            if (z3 || objIF3 == companion.n()) {
                final MutableState mutableState5 = mutableState3;
                final MutableState mutableState6 = mutableState4;
                i5 = i3;
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, final long j2) {
                        Object obj;
                        final Placeable placeableDR0;
                        int i7;
                        int iGh;
                        MeasureScope measureScope2 = measureScope;
                        long j3 = j2;
                        final float fFloatValue = ((Number) animatable.ty()).floatValue();
                        int size = list.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Measurable measurable = (Measurable) list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "InputField")) {
                                int size2 = list.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    Measurable measurable2 = (Measurable) list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "Surface")) {
                                        int size3 = list.size();
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size3) {
                                                obj = null;
                                                break;
                                            }
                                            obj = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "Content")) {
                                                break;
                                            }
                                            i10++;
                                        }
                                        Measurable measurable3 = (Measurable) obj;
                                        final int iN = mutableWindowInsets.n(measureScope2) + measureScope2.How(SearchBar_androidKt.te());
                                        int iHow = measureScope2.How(SearchBar_androidKt.te());
                                        int iUo = ConstraintsKt.Uo(j3, measurable.Nxk(Constraints.gh(j3)));
                                        int iJ2 = ConstraintsKt.J2(j3, measurable.FX(Constraints.qie(j3)));
                                        int iRoundToInt = MathKt.roundToInt(Constraints.qie(j3) * 0.9f);
                                        int iRoundToInt2 = MathKt.roundToInt(Constraints.gh(j3) * 0.9f);
                                        final float fWPU = SearchBar_androidKt.WPU((BackEventCompat) mutableState6.getValue(), fFloatValue, mutableFloatState2.n());
                                        int iT = MathHelpersKt.t(iUo, iRoundToInt, fWPU);
                                        int i11 = iN + iJ2;
                                        int iT2 = MathHelpersKt.t(i11, iRoundToInt2, fWPU);
                                        int iQie = Constraints.qie(j3);
                                        int iGh2 = Constraints.gh(j3);
                                        int iT3 = MathHelpersKt.t(iT, iQie, fFloatValue);
                                        final int iT4 = MathHelpersKt.t(iT2, iGh2, fFloatValue);
                                        final int iT5 = MathHelpersKt.t(iN, 0, fFloatValue);
                                        final int iT6 = MathHelpersKt.t(0, iHow, fFloatValue);
                                        final Placeable placeableDR02 = measurable.dR0(ConstraintsKt.n(iT3, iQie, iJ2, iJ2));
                                        int width = placeableDR02.getWidth();
                                        final Placeable placeableDR03 = measurable2.dR0(Constraints.INSTANCE.t(width, iT4 - iT5));
                                        if (measurable3 != null) {
                                            if (Constraints.Uo(j2)) {
                                                i7 = 0;
                                                iGh = RangesKt.coerceAtLeast(Constraints.gh(j2) - (i11 + iHow), 0);
                                            } else {
                                                i7 = 0;
                                                iGh = Constraints.gh(j2);
                                            }
                                            placeableDR0 = measurable3.dR0(ConstraintsKt.n(width, width, i7, iGh));
                                        } else {
                                            placeableDR0 = null;
                                        }
                                        final MutableState mutableState7 = mutableState6;
                                        final MutableState mutableState8 = mutableState5;
                                        return MeasureScope.ER(measureScope, width, iT4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
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
                                                int iHow2 = measureScope.How(SearchBar_androidKt.KN);
                                                int iAYN = SearchBar_androidKt.aYN(j2, iHow2, (BackEventCompat) mutableState7.getValue(), measureScope.getLayoutDirection(), fFloatValue, fWPU);
                                                int iViF = SearchBar_androidKt.ViF(j2, iHow2, (BackEventCompat) mutableState7.getValue(), (BackEventCompat) mutableState8.getValue(), iT4, measureScope.How(SearchBar_androidKt.xMQ), fWPU);
                                                Placeable.PlacementScope.az(placementScope, placeableDR03, iAYN, iViF + iT5, 0.0f, 4, null);
                                                Placeable.PlacementScope.az(placementScope, placeableDR02, iAYN, iViF + iN, 0.0f, 4, null);
                                                Placeable placeable = placeableDR0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.az(placementScope, placeable, iAYN, iViF + iN + placeableDR02.getHeight() + iT6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    i9++;
                                    measureScope2 = measureScope;
                                    j3 = j2;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i8++;
                            measureScope2 = measureScope;
                            j3 = j2;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(measurePolicy);
                objIF3 = measurePolicy;
            } else {
                i5 = i3;
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objIF3;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN2);
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
            Updater.O(composerN, measurePolicy2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierRl = LayoutIdKt.rl(companion3, "Surface");
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), true);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
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
            function22.invoke(composerKN, Integer.valueOf((i5 >> 21) & 14));
            composerKN.XQ();
            Modifier modifierRl2 = LayoutIdKt.rl(companion3, "InputField");
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), true);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl2);
            Function0 function0N3 = companion2.n();
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
            Updater.O(composerN3, measurePolicyUo2, companion2.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
            Function2 function2Rl3 = companion2.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion2.nr());
            function2.invoke(composerKN, Integer.valueOf((i5 >> 18) & 14));
            composerKN.XQ();
            composerKN.eF(-1107184481);
            if (function23 != null) {
                Modifier modifierRl3 = LayoutIdKt.rl(companion3, "Content");
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion4.HI(), true);
                int iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierRl3);
                Function0 function0N4 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N4);
                } else {
                    composerKN.r();
                }
                Composer composerN4 = Updater.n(composerKN);
                Updater.O(composerN4, measurePolicyUo3, companion2.t());
                Updater.O(composerN4, compositionLocalMapIk4, companion2.O());
                Function2 function2Rl4 = companion2.rl();
                if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                    composerN4.o(Integer.valueOf(iN4));
                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                }
                Updater.O(composerN4, modifierO4, companion2.nr());
                function23.invoke(composerKN, 0);
                composerKN.XQ();
                Unit unit = Unit.INSTANCE;
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$4
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
                    SearchBar_androidKt.KN(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, function2, function22, function23, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Animatable animatable, final MutableFloatState mutableFloatState, final MutableState mutableState, final MutableState mutableState2, Modifier modifier, final Function2 function2, Shape shape, SearchBarColors searchBarColors, float f3, float f4, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        MutableState mutableState3;
        MutableState mutableState4;
        Modifier modifier2;
        SearchBarColors searchBarColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        float f5;
        WindowInsets windowInsets2;
        int i12;
        Shape shapeJ2;
        Modifier modifier3;
        int i13;
        SearchBarColors searchBarColorsRl;
        int i14;
        WindowInsets windowInsetsXMQ;
        int i15;
        final float f6;
        int i16;
        final SearchBarColors searchBarColors3;
        final float f7;
        Shape shape2;
        Modifier modifier4;
        WindowInsets windowInsets3;
        final Density density;
        Shape shapeJ22;
        Shape shapeNr;
        Object objIF;
        Composer.Companion companion;
        State state;
        boolean zN;
        Object objIF2;
        Object objIF3;
        Composer composer2;
        final SearchBarColors searchBarColors4;
        final float f8;
        final float f9;
        final Shape shape3;
        final WindowInsets windowInsets4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-440333505);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = ((i2 & 8) == 0 ? composerKN.p5(animatable) : composerKN.E2(animatable) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(mutableFloatState) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            mutableState3 = mutableState;
        } else {
            mutableState3 = mutableState;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i7 |= composerKN.p5(mutableState3) ? 256 : 128;
            }
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
            mutableState4 = mutableState2;
        } else {
            mutableState4 = mutableState2;
            if ((i2 & 3072) == 0) {
                i7 |= composerKN.p5(mutableState4) ? 2048 : 1024;
            }
        }
        int i17 = i5 & 16;
        if (i17 != 0) {
            i7 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i7 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i7 |= composerKN.E2(function2) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i7 |= ((i5 & 64) == 0 && composerKN.p5(shape)) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) != 0) {
                if ((i5 & 128) == 0) {
                    searchBarColors2 = searchBarColors;
                    int i18 = composerKN.p5(searchBarColors2) ? 8388608 : 4194304;
                    i7 |= i18;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i7 |= i18;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i8 = i5 & 256;
            if (i8 == 0) {
                i7 |= 100663296;
            } else {
                if ((i2 & 100663296) == 0) {
                    i9 = i8;
                    i7 |= composerKN.rl(f3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                i10 = i5 & 512;
                if (i10 == 0) {
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i11 = i10;
                        f5 = f4;
                        i7 |= composerKN.rl(f5) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        if ((i5 & 1024) == 0) {
                            windowInsets2 = windowInsets;
                            int i19 = composerKN.p5(windowInsets2) ? 4 : 2;
                            i12 = i3 | i19;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i12 = i3 | i19;
                    } else {
                        windowInsets2 = windowInsets;
                        i12 = i3;
                    }
                    if ((i5 & 2048) == 0) {
                        i12 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i12 |= composerKN.E2(function3) ? 32 : 16;
                    }
                    if ((306783379 & i7) != 306783378 && (i12 & 19) == 18 && composerKN.xMQ()) {
                        composerKN.wTp();
                        f9 = f5;
                        searchBarColors4 = searchBarColors2;
                        windowInsets4 = windowInsets2;
                        composer2 = composerKN;
                        modifier5 = modifier2;
                        shape3 = shape;
                        f8 = f3;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier6 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i5 & 64) == 0) {
                                i7 &= -3670017;
                                shapeJ2 = SearchBarDefaults.f27243n.J2(composerKN, 6);
                            } else {
                                shapeJ2 = shape;
                            }
                            int i20 = i7;
                            if ((i5 & 128) == 0) {
                                modifier3 = modifier6;
                                i13 = 6;
                                searchBarColorsRl = SearchBarDefaults.f27243n.rl(0L, 0L, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 3);
                                i14 = i20 & (-29360129);
                            } else {
                                modifier3 = modifier6;
                                i13 = 6;
                                searchBarColorsRl = searchBarColors2;
                                i14 = i20;
                            }
                            float fKN = i9 == 0 ? SearchBarDefaults.f27243n.KN() : f3;
                            float fUo = i11 == 0 ? SearchBarDefaults.f27243n.Uo() : f4;
                            if ((i5 & 1024) == 0) {
                                i15 = i14;
                                windowInsetsXMQ = SearchBarDefaults.f27243n.xMQ(composerKN, i13);
                                i16 = i12 & (-15);
                                searchBarColors3 = searchBarColorsRl;
                                f6 = fUo;
                                shape2 = shapeJ2;
                                f7 = fKN;
                            } else {
                                windowInsetsXMQ = windowInsets;
                                i15 = i14;
                                f6 = fUo;
                                i16 = i12;
                                searchBarColors3 = searchBarColorsRl;
                                f7 = fKN;
                                shape2 = shapeJ2;
                            }
                            modifier4 = modifier3;
                        } else {
                            composerKN.wTp();
                            if ((i5 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            if ((i5 & 128) != 0) {
                                i7 &= -29360129;
                            }
                            if ((i5 & 1024) != 0) {
                                i12 &= -15;
                            }
                            f7 = f3;
                            windowInsetsXMQ = windowInsets2;
                            i16 = i12;
                            f6 = f5;
                            searchBarColors3 = searchBarColors2;
                            modifier4 = modifier2;
                            i15 = i7;
                            shape2 = shape;
                        }
                        composerKN.S();
                        Modifier modifier7 = modifier4;
                        if (ComposerKt.v()) {
                            windowInsets3 = windowInsetsXMQ;
                        } else {
                            windowInsets3 = windowInsetsXMQ;
                            ComposerKt.p5(-440333505, i15, i16, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)");
                        }
                        density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                        SearchBarDefaults searchBarDefaults = SearchBarDefaults.f27243n;
                        int i21 = i16;
                        shapeJ22 = searchBarDefaults.J2(composerKN, 6);
                        shapeNr = searchBarDefaults.nr(composerKN, 6);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke() {
                                    return Boolean.valueOf(((Number) animatable.ty()).floatValue() == 1.0f);
                                }
                            });
                            composerKN.o(objIF);
                        }
                        state = (State) objIF;
                        zN = composerKN.n(Uo(state)) | ((((i15 & 3670016) ^ 1572864) <= 1048576 && composerKN.p5(shape2)) || (i15 & 1572864) == 1048576);
                        objIF2 = composerKN.iF();
                        if (zN || objIF2 == companion.n()) {
                            Shape genericShape = !Intrinsics.areEqual(shape2, shapeJ22) ? new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$animatedShape$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                                    n(path, size.getPackedValue(), layoutDirection);
                                    return Unit.INSTANCE;
                                }

                                public final void n(Path path, long j2, LayoutDirection layoutDirection) {
                                    Path.ty(path, RoundRectKt.O(androidx.compose.ui.geometry.SizeKt.t(j2), CornerRadiusKt.rl(density.l(Dp.KN(SearchBar_androidKt.rl * (1 - ((Number) animatable.ty()).floatValue()))), 0.0f, 2, null)), null, 2, null);
                                }
                            }) : Uo(state) ? shapeNr : shape2;
                            composerKN.o(genericShape);
                            objIF2 = genericShape;
                        }
                        final Shape shape4 = (Shape) objIF2;
                        ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i22) {
                                if ((i22 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-170534294, i22, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                                }
                                SurfaceKt.n(null, shape4, searchBarColors3.getContainerColor(), ColorSchemeKt.t(searchBarColors3.getContainerColor(), composer3, 0), f7, f6, null, ComposableSingletons$SearchBar_androidKt.f25102n.rl(), composer3, 12582912, 65);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54);
                        objIF3 = composerKN.iF();
                        if (objIF3 == companion.n()) {
                            objIF3 = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$showContent$2$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke() {
                                    return Boolean.valueOf(((Number) animatable.ty()).floatValue() > 0.0f);
                                }
                            });
                            composerKN.o(objIF3);
                        }
                        composerKN.eF(-1567201454);
                        ComposableLambda composableLambdaNr2 = !J2((State) objIF3) ? ComposableLambdaKt.nr(147843820, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i22) {
                                if ((i22 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(147843820, i22, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:909)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                boolean zE2 = composer3.E2(animatable);
                                final Animatable animatable2 = animatable;
                                Object objIF4 = composer3.iF();
                                if (zE2 || objIF4 == Composer.INSTANCE.n()) {
                                    objIF4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            n(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.rl(((Number) animatable2.ty()).floatValue());
                                        }
                                    };
                                    composer3.o(objIF4);
                                }
                                Modifier modifierN = GraphicsLayerModifierKt.n(companion2, (Function1) objIF4);
                                SearchBarColors searchBarColors5 = searchBarColors3;
                                Function3 function32 = function3;
                                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
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
                                Updater.O(composerN, measurePolicyN, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                Function2 function2Rl = companion3.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion3.nr());
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                DividerKt.rl(null, 0.0f, searchBarColors5.getDividerColor(), composer3, 0, 3);
                                function32.invoke(columnScopeInstance, composer3, 6);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54) : null;
                        composerKN.Xw();
                        int i22 = Animatable.az | 12582912 | (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | ((i21 << 15) & 458752) | ((i15 << 3) & 3670016);
                        Shape shape5 = shape2;
                        float f10 = f6;
                        MutableState mutableState5 = mutableState3;
                        SearchBarColors searchBarColors5 = searchBarColors3;
                        MutableState mutableState6 = mutableState4;
                        float f11 = f7;
                        WindowInsets windowInsets5 = windowInsets3;
                        KN(animatable, mutableFloatState, mutableState5, mutableState6, modifier7, windowInsets5, function2, composableLambdaNr, composableLambdaNr2, composerKN, i22);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2 = composerKN;
                        searchBarColors4 = searchBarColors5;
                        f8 = f11;
                        f9 = f10;
                        shape3 = shape5;
                        windowInsets4 = windowInsets5;
                        modifier5 = modifier7;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i23) {
                                SearchBar_androidKt.O(animatable, mutableFloatState, mutableState, mutableState2, modifier5, function2, shape3, searchBarColors4, f8, f9, windowInsets4, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                i11 = i10;
                f5 = f4;
                if ((i3 & 6) != 0) {
                }
                if ((i5 & 2048) == 0) {
                }
                if ((306783379 & i7) != 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i17 == 0) {
                        }
                        if ((i5 & 64) == 0) {
                        }
                        int i202 = i7;
                        if ((i5 & 128) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i5 & 1024) == 0) {
                        }
                        modifier4 = modifier3;
                        composerKN.S();
                        Modifier modifier72 = modifier4;
                        if (ComposerKt.v()) {
                        }
                        density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                        SearchBarDefaults searchBarDefaults2 = SearchBarDefaults.f27243n;
                        int i212 = i16;
                        shapeJ22 = searchBarDefaults2.J2(composerKN, 6);
                        shapeNr = searchBarDefaults2.nr(composerKN, 6);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                        }
                        state = (State) objIF;
                        if (((i15 & 3670016) ^ 1572864) <= 1048576) {
                            zN = composerKN.n(Uo(state)) | ((((i15 & 3670016) ^ 1572864) <= 1048576 && composerKN.p5(shape2)) || (i15 & 1572864) == 1048576);
                            objIF2 = composerKN.iF();
                            if (zN) {
                                if (!Intrinsics.areEqual(shape2, shapeJ22)) {
                                }
                                composerKN.o(genericShape);
                                objIF2 = genericShape;
                                final Shape shape42 = (Shape) objIF2;
                                ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i222) {
                                        if ((i222 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-170534294, i222, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                                        }
                                        SurfaceKt.n(null, shape42, searchBarColors3.getContainerColor(), ColorSchemeKt.t(searchBarColors3.getContainerColor(), composer3, 0), f7, f6, null, ComposableSingletons$SearchBar_androidKt.f25102n.rl(), composer3, 12582912, 65);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                objIF3 = composerKN.iF();
                                if (objIF3 == companion.n()) {
                                }
                                composerKN.eF(-1567201454);
                                ComposableLambda composableLambdaNr22 = !J2((State) objIF3) ? ComposableLambdaKt.nr(147843820, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i222) {
                                        if ((i222 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(147843820, i222, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:909)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        boolean zE2 = composer3.E2(animatable);
                                        final Animatable animatable2 = animatable;
                                        Object objIF4 = composer3.iF();
                                        if (zE2 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    n(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                    graphicsLayerScope.rl(((Number) animatable2.ty()).floatValue());
                                                }
                                            };
                                            composer3.o(objIF4);
                                        }
                                        Modifier modifierN = GraphicsLayerModifierKt.n(companion2, (Function1) objIF4);
                                        SearchBarColors searchBarColors52 = searchBarColors3;
                                        Function3 function32 = function3;
                                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
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
                                        Updater.O(composerN, measurePolicyN, companion3.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                        Function2 function2Rl = companion3.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion3.nr());
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                        DividerKt.rl(null, 0.0f, searchBarColors52.getDividerColor(), composer3, 0, 3);
                                        function32.invoke(columnScopeInstance, composer3, 6);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54) : null;
                                composerKN.Xw();
                                int i222 = Animatable.az | 12582912 | (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | ((i212 << 15) & 458752) | ((i15 << 3) & 3670016);
                                Shape shape52 = shape2;
                                float f102 = f6;
                                MutableState mutableState52 = mutableState3;
                                SearchBarColors searchBarColors52 = searchBarColors3;
                                MutableState mutableState62 = mutableState4;
                                float f112 = f7;
                                WindowInsets windowInsets52 = windowInsets3;
                                KN(animatable, mutableFloatState, mutableState52, mutableState62, modifier72, windowInsets52, function2, composableLambdaNr3, composableLambdaNr22, composerKN, i222);
                                if (ComposerKt.v()) {
                                }
                                composer2 = composerKN;
                                searchBarColors4 = searchBarColors52;
                                f8 = f112;
                                f9 = f102;
                                shape3 = shape52;
                                windowInsets4 = windowInsets52;
                                modifier5 = modifier72;
                            }
                        } else {
                            zN = composerKN.n(Uo(state)) | ((((i15 & 3670016) ^ 1572864) <= 1048576 && composerKN.p5(shape2)) || (i15 & 1572864) == 1048576);
                            objIF2 = composerKN.iF();
                            if (zN) {
                            }
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i9 = i8;
            i10 = i5 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            f5 = f4;
            if ((i3 & 6) != 0) {
            }
            if ((i5 & 2048) == 0) {
            }
            if ((306783379 & i7) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & 32) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        i8 = i5 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i5 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        f5 = f4;
        if ((i3 & 6) != 0) {
        }
        if ((i5 & 2048) == 0) {
        }
        if ((306783379 & i7) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aYN(long j2, int i2, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f3, float f4) {
        if (backEventCompat == null || f4 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(((Constraints.qie(j2) * 0.05f) - i2) * (1 - f3) * f4 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.f34160n ? 1 : -1));
    }

    public static final float g() {
        return nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function2 function2, final boolean z2, final Function1 function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f3, float f4, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i7;
        float f5;
        int i8;
        float f6;
        Shape shapeT;
        int i9;
        Composer composer2;
        int i10;
        int i11;
        SearchBarColors searchBarColorsRl;
        Shape shape3;
        float f7;
        float fUo;
        final SearchBarColors searchBarColors3;
        Composer composer3;
        boolean z3;
        Object objIF;
        final SearchBarColors searchBarColors4;
        final Modifier modifier3;
        final Shape shape4;
        final float f8;
        final float f9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1209217899);
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
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function1) ? 256 : 128;
        }
        int i12 = i3 & 8;
        if (i12 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    shape2 = shape;
                    int i13 = composerKN.p5(shape2) ? 16384 : 8192;
                    i5 |= i13;
                } else {
                    shape2 = shape;
                }
                i5 |= i13;
            } else {
                shape2 = shape;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    searchBarColors2 = searchBarColors;
                    int i14 = composerKN.p5(searchBarColors2) ? 131072 : 65536;
                    i5 |= i14;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i5 |= i14;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    f5 = f3;
                    i5 |= composerKN.rl(f5) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                    f6 = f4;
                } else {
                    f6 = f4;
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.rl(f6) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 256) != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                int i15 = i5;
                if ((38347923 & i5) == 38347922 && composerKN.xMQ()) {
                    composerKN.wTp();
                    float f10 = f5;
                    composer3 = composerKN;
                    modifier3 = modifier2;
                    f9 = f6;
                    f8 = f10;
                    shape4 = shape2;
                    searchBarColors4 = searchBarColors2;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 16) == 0) {
                            shapeT = SearchBarDefaults.f27243n.t(composerKN, 6);
                            i9 = i15 & (-57345);
                        } else {
                            shapeT = shape2;
                            i9 = i15;
                        }
                        if ((i3 & 32) == 0) {
                            i10 = i8;
                            searchBarColorsRl = SearchBarDefaults.f27243n.rl(0L, 0L, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 3);
                            composer2 = composerKN;
                            i11 = (-458753) & i9;
                        } else {
                            composer2 = composerKN;
                            i10 = i8;
                            i11 = i9;
                            searchBarColorsRl = searchBarColors2;
                        }
                        float fKN = i7 == 0 ? SearchBarDefaults.f27243n.KN() : f3;
                        if (i10 == 0) {
                            shape3 = shapeT;
                            fUo = SearchBarDefaults.f27243n.Uo();
                            f7 = fKN;
                        } else {
                            shape3 = shapeT;
                            f7 = fKN;
                            fUo = f6;
                        }
                        searchBarColors3 = searchBarColorsRl;
                    } else {
                        composerKN.wTp();
                        int i16 = (i3 & 16) != 0 ? i15 & (-57345) : i15;
                        if ((i3 & 32) != 0) {
                            i16 &= -458753;
                        }
                        i11 = i16;
                        fUo = f6;
                        searchBarColors3 = searchBarColors2;
                        f7 = f5;
                        composer2 = composerKN;
                        shape3 = shape2;
                    }
                    composer2.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1209217899, i11, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)");
                    }
                    int i17 = i11 >> 6;
                    Composer composer4 = composer2;
                    SurfaceKt.n(SizeKt.ViF(ZIndexModifierKt.n(modifier2, 1.0f), nr), shape3, searchBarColors3.getContainerColor(), ColorSchemeKt.t(searchBarColors3.getContainerColor(), composer2, 0), f7, fUo, null, ComposableLambdaKt.nr(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            n(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer5, int i18) {
                            if ((i18 & 3) == 2 && composer5.xMQ()) {
                                composer5.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(878471280, i18, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                            }
                            Function2 function22 = function2;
                            boolean z4 = z2;
                            final SearchBarColors searchBarColors5 = searchBarColors3;
                            final Function3 function32 = function3;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer5, 0);
                            int iN = ComposablesKt.n(composer5, 0);
                            CompositionLocalMap compositionLocalMapIk = composer5.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer5, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer5.T();
                            if (composer5.getInserting()) {
                                composer5.s7N(function0N);
                            } else {
                                composer5.r();
                            }
                            Composer composerN = Updater.n(composer5);
                            Updater.O(composerN, measurePolicyN, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            Function2 function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion2.nr());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                            function22.invoke(composer5, 0);
                            AnimatedVisibilityKt.Uo(columnScopeInstance, z4, null, SearchBar_androidKt.Ik, SearchBar_androidKt.f27278r, null, ComposableLambdaKt.nr(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, Integer num) {
                                    n(animatedVisibilityScope, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1743690306, i19, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                                    }
                                    float fKN2 = Dp.KN(((Configuration) composer6.ty(AndroidCompositionLocals_androidKt.J2())).screenHeightDp);
                                    boolean zRl = composer6.rl(fKN2);
                                    Object objIF2 = composer6.iF();
                                    if (zRl || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = Dp.nr(Dp.KN(fKN2 * 0.6666667f));
                                        composer6.o(objIF2);
                                    }
                                    float value = ((Dp) objIF2).getValue();
                                    boolean zRl2 = composer6.rl(value);
                                    Object objIF3 = composer6.iF();
                                    if (zRl2 || objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = Dp.nr(((Dp) RangesKt.coerceAtMost(Dp.nr(SearchBar_androidKt.nY()), Dp.nr(value))).getValue());
                                        composer6.o(objIF3);
                                    }
                                    Modifier modifierMUb = SizeKt.mUb(Modifier.INSTANCE, ((Dp) objIF3).getValue(), value);
                                    SearchBarColors searchBarColors6 = searchBarColors5;
                                    Function3 function33 = function32;
                                    MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer6, 0);
                                    int iN2 = ComposablesKt.n(composer6, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer6.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer6, modifierMUb);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N2 = companion3.n();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer6.T();
                                    if (composer6.getInserting()) {
                                        composer6.s7N(function0N2);
                                    } else {
                                        composer6.r();
                                    }
                                    Composer composerN2 = Updater.n(composer6);
                                    Updater.O(composerN2, measurePolicyN2, companion3.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                    Function2 function2Rl2 = companion3.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion3.nr());
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                                    DividerKt.rl(null, 0.0f, searchBarColors6.getDividerColor(), composer6, 0, 3);
                                    function33.invoke(columnScopeInstance2, composer6, 6);
                                    composer6.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer5, 54), composer5, 1600518, 18);
                            composer5.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), composer4, ((i11 >> 9) & 112) | 12582912 | (i17 & 57344) | (i17 & 458752), 64);
                    composer3 = composer4;
                    z3 = (i11 & 896) == 256;
                    objIF = composer3.iF();
                    if (!z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
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
                                function1.invoke(Boolean.FALSE);
                            }
                        };
                        composer3.o(objIF);
                    }
                    BackHandlerKt.n(z2, (Function0) objIF, composer3, (i11 >> 3) & 14, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    searchBarColors4 = searchBarColors3;
                    modifier3 = modifier2;
                    shape4 = shape3;
                    f8 = f7;
                    f9 = fUo;
                }
                scopeUpdateScopeGh = composer3.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            n(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer5, int i18) {
                            SearchBar_androidKt.n(function2, z2, function1, modifier3, shape4, searchBarColors4, f8, f9, function3, composer5, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            f5 = f3;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            int i152 = i5;
            if ((38347923 & i5) == 38347922) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    searchBarColors3 = searchBarColorsRl;
                    composer2.S();
                    if (ComposerKt.v()) {
                    }
                    int i172 = i11 >> 6;
                    Composer composer42 = composer2;
                    SurfaceKt.n(SizeKt.ViF(ZIndexModifierKt.n(modifier2, 1.0f), nr), shape3, searchBarColors3.getContainerColor(), ColorSchemeKt.t(searchBarColors3.getContainerColor(), composer2, 0), f7, fUo, null, ComposableLambdaKt.nr(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            n(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer5, int i18) {
                            if ((i18 & 3) == 2 && composer5.xMQ()) {
                                composer5.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(878471280, i18, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                            }
                            Function2 function22 = function2;
                            boolean z4 = z2;
                            final SearchBarColors searchBarColors5 = searchBarColors3;
                            final Function3 function32 = function3;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer5, 0);
                            int iN = ComposablesKt.n(composer5, 0);
                            CompositionLocalMap compositionLocalMapIk = composer5.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer5, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer5.T();
                            if (composer5.getInserting()) {
                                composer5.s7N(function0N);
                            } else {
                                composer5.r();
                            }
                            Composer composerN = Updater.n(composer5);
                            Updater.O(composerN, measurePolicyN, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            Function2 function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion2.nr());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                            function22.invoke(composer5, 0);
                            AnimatedVisibilityKt.Uo(columnScopeInstance, z4, null, SearchBar_androidKt.Ik, SearchBar_androidKt.f27278r, null, ComposableLambdaKt.nr(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, Integer num) {
                                    n(animatedVisibilityScope, composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1743690306, i19, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                                    }
                                    float fKN2 = Dp.KN(((Configuration) composer6.ty(AndroidCompositionLocals_androidKt.J2())).screenHeightDp);
                                    boolean zRl = composer6.rl(fKN2);
                                    Object objIF2 = composer6.iF();
                                    if (zRl || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = Dp.nr(Dp.KN(fKN2 * 0.6666667f));
                                        composer6.o(objIF2);
                                    }
                                    float value = ((Dp) objIF2).getValue();
                                    boolean zRl2 = composer6.rl(value);
                                    Object objIF3 = composer6.iF();
                                    if (zRl2 || objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = Dp.nr(((Dp) RangesKt.coerceAtMost(Dp.nr(SearchBar_androidKt.nY()), Dp.nr(value))).getValue());
                                        composer6.o(objIF3);
                                    }
                                    Modifier modifierMUb = SizeKt.mUb(Modifier.INSTANCE, ((Dp) objIF3).getValue(), value);
                                    SearchBarColors searchBarColors6 = searchBarColors5;
                                    Function3 function33 = function32;
                                    MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer6, 0);
                                    int iN2 = ComposablesKt.n(composer6, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer6.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer6, modifierMUb);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0 function0N2 = companion3.n();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer6.T();
                                    if (composer6.getInserting()) {
                                        composer6.s7N(function0N2);
                                    } else {
                                        composer6.r();
                                    }
                                    Composer composerN2 = Updater.n(composer6);
                                    Updater.O(composerN2, measurePolicyN2, companion3.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                    Function2 function2Rl2 = companion3.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion3.nr());
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                                    DividerKt.rl(null, 0.0f, searchBarColors6.getDividerColor(), composer6, 0, 3);
                                    function33.invoke(columnScopeInstance2, composer6, 6);
                                    composer6.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer5, 54), composer5, 1600518, 18);
                            composer5.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), composer42, ((i11 >> 9) & 112) | 12582912 | (i172 & 57344) | (i172 & 458752), 64);
                    composer3 = composer42;
                    if ((i11 & 896) == 256) {
                    }
                    objIF = composer3.iF();
                    if (!z3) {
                        objIF = new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
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
                                function1.invoke(Boolean.FALSE);
                            }
                        };
                        composer3.o(objIF);
                        BackHandlerKt.n(z2, (Function0) objIF, composer3, (i11 >> 3) & 14, 0);
                        if (ComposerKt.v()) {
                        }
                        searchBarColors4 = searchBarColors3;
                        modifier3 = modifier2;
                        shape4 = shape3;
                        f8 = f7;
                        f9 = fUo;
                    }
                }
            }
            scopeUpdateScopeGh = composer3.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        f5 = f3;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        int i1522 = i5;
        if ((38347923 & i5) == 38347922) {
        }
        scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final float nY() {
        return f27279t;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
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
    public static final void nr(final Function2 function2, final boolean z2, final Function1 function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f3, float f4, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function2 function22;
        int i5;
        int i7;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i8;
        float f5;
        int i9;
        float f6;
        WindowInsets windowInsets2;
        int i10;
        Shape shapeJ2;
        int i11;
        int i12;
        SearchBarColors searchBarColorsRl;
        int i13;
        WindowInsets windowInsetsXMQ;
        Modifier modifier3;
        SearchBarColors searchBarColors3;
        int i14;
        float f7;
        float f8;
        Shape shape3;
        Object objIF;
        Composer.Companion companion;
        Animatable animatable;
        Object objIF2;
        MutableFloatState mutableFloatState;
        Object objIF3;
        int i15;
        MutableState mutableState;
        Object objIF4;
        MutableState mutableState2;
        boolean zE2;
        Object objIF5;
        int i16;
        MutableState mutableState3;
        Object objIF6;
        MutatorMutex mutatorMutex;
        boolean zE22;
        Object objIF7;
        MutableFloatState mutableFloatState2;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape4;
        final SearchBarColors searchBarColors4;
        final float f9;
        final float f10;
        final WindowInsets windowInsets3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1444649673);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function22) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
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
                i5 |= composerKN.E2(function1) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        shape2 = shape;
                        int i17 = composerKN.p5(shape2) ? 16384 : 8192;
                        i5 |= i17;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i17;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        searchBarColors2 = searchBarColors;
                        int i18 = composerKN.p5(searchBarColors2) ? 131072 : 65536;
                        i5 |= i18;
                    } else {
                        searchBarColors2 = searchBarColors;
                    }
                    i5 |= i18;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        f5 = f3;
                        i5 |= composerKN.rl(f5) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                        f6 = f4;
                    } else {
                        f6 = f4;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.rl(f6) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i3 & 256) == 0) {
                            windowInsets2 = windowInsets;
                            int i19 = composerKN.p5(windowInsets2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            i5 |= i19;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i5 |= i19;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i5 |= composerKN.E2(function3) ? 536870912 : 268435456;
                        }
                        int i20 = i5;
                        if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            SearchBarColors searchBarColors5 = searchBarColors2;
                            windowInsets3 = windowInsets2;
                            modifier4 = modifier2;
                            searchBarColors4 = searchBarColors5;
                            shape4 = shape2;
                            composer2 = composerKN;
                            f9 = f5;
                            f10 = f6;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i3 & 16) == 0) {
                                    int i21 = i20 & (-57345);
                                    shapeJ2 = SearchBarDefaults.f27243n.J2(composerKN, 6);
                                    i10 = i21;
                                } else {
                                    i10 = i20;
                                    shapeJ2 = shape2;
                                }
                                if ((i3 & 32) == 0) {
                                    i11 = -234881025;
                                    i12 = 6;
                                    searchBarColorsRl = SearchBarDefaults.f27243n.rl(0L, 0L, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 3);
                                    i13 = i10 & (-458753);
                                } else {
                                    i11 = -234881025;
                                    i12 = 6;
                                    searchBarColorsRl = searchBarColors2;
                                    i13 = i10;
                                }
                                float fKN = i8 == 0 ? SearchBarDefaults.f27243n.KN() : f3;
                                float fUo = i9 == 0 ? SearchBarDefaults.f27243n.Uo() : f6;
                                if ((i3 & 256) == 0) {
                                    i13 &= i11;
                                    modifier3 = modifier5;
                                    windowInsetsXMQ = SearchBarDefaults.f27243n.xMQ(composerKN, i12);
                                } else {
                                    windowInsetsXMQ = windowInsets;
                                    modifier3 = modifier5;
                                }
                                searchBarColors3 = searchBarColorsRl;
                                i14 = i13;
                                f7 = fKN;
                                f8 = fUo;
                                shape3 = shapeJ2;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i20 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i20 &= -458753;
                                }
                                if ((i3 & 256) != 0) {
                                    i20 &= -234881025;
                                }
                                windowInsetsXMQ = windowInsets2;
                                f8 = f6;
                                i14 = i20;
                                f7 = f5;
                                searchBarColors3 = searchBarColors2;
                                shape3 = shape2;
                                modifier3 = modifier2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1444649673, i14, -1, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                objIF = AnimatableKt.rl(z2 ? 1.0f : 0.0f, 0.0f, 2, null);
                                composerKN.o(objIF);
                            }
                            animatable = (Animatable) objIF;
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                                objIF2 = PrimitiveSnapshotStateKt.n(Float.NaN);
                                composerKN.o(objIF2);
                            }
                            mutableFloatState = (MutableFloatState) objIF2;
                            objIF3 = composerKN.iF();
                            if (objIF3 != companion.n()) {
                                i15 = 2;
                                objIF3 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                                composerKN.o(objIF3);
                            } else {
                                i15 = 2;
                            }
                            mutableState = (MutableState) objIF3;
                            objIF4 = composerKN.iF();
                            if (objIF4 == companion.n()) {
                                objIF4 = SnapshotStateKt__SnapshotStateKt.O(null, null, i15, null);
                                composerKN.o(objIF4);
                            }
                            mutableState2 = (MutableState) objIF4;
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            Modifier modifier6 = modifier3;
                            zE2 = composerKN.E2(animatable) | ((i14 & 112) != 32);
                            objIF5 = composerKN.iF();
                            if (!zE2 || objIF5 == companion.n()) {
                                i16 = i14;
                                mutableState3 = mutableState;
                                SearchBar_androidKt$SearchBar$1$1 searchBar_androidKt$SearchBar$1$1 = new SearchBar_androidKt$SearchBar$1$1(animatable, z2, mutableFloatState, mutableState3, mutableState2, null);
                                composerKN.o(searchBar_androidKt$SearchBar$1$1);
                                objIF5 = searchBar_androidKt$SearchBar$1$1;
                            } else {
                                i16 = i14;
                                mutableState3 = mutableState;
                            }
                            int i22 = (i16 >> 3) & 14;
                            EffectsKt.O(boolValueOf, (Function2) objIF5, composerKN, i22);
                            objIF6 = composerKN.iF();
                            if (objIF6 == companion.n()) {
                                objIF6 = new MutatorMutex();
                                composerKN.o(objIF6);
                            }
                            mutatorMutex = (MutatorMutex) objIF6;
                            zE22 = composerKN.E2(animatable) | ((i16 & 896) == 256);
                            objIF7 = composerKN.iF();
                            if (!zE22 || objIF7 == companion.n()) {
                                mutableFloatState2 = mutableFloatState;
                                objIF7 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, mutableFloatState2, animatable, function1, mutableState3, mutableState2, null);
                                composerKN.o(objIF7);
                            } else {
                                mutableFloatState2 = mutableFloatState;
                            }
                            PredictiveBackHandlerKt.n(z2, (Function2) objIF7, composerKN, i22, 0);
                            int i23 = i16 << 6;
                            SearchBarColors searchBarColors6 = searchBarColors3;
                            float f11 = f7;
                            float f12 = f8;
                            WindowInsets windowInsets4 = windowInsetsXMQ;
                            Shape shape5 = shape3;
                            O(animatable, mutableFloatState2, mutableState3, mutableState2, modifier6, function22, shape5, searchBarColors6, f11, f12, windowInsets4, function3, composerKN, Animatable.az | 3504 | (57344 & (i16 << 3)) | ((i16 << 15) & 458752) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), (i16 >> 24) & 126, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            composer2 = composerKN;
                            modifier4 = modifier6;
                            shape4 = shape5;
                            searchBarColors4 = searchBarColors6;
                            f9 = f11;
                            f10 = f12;
                            windowInsets3 = windowInsets4;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i24) {
                                    SearchBar_androidKt.nr(function2, z2, function1, modifier4, shape4, searchBarColors4, f9, f10, windowInsets3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    int i202 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            searchBarColors3 = searchBarColorsRl;
                            i14 = i13;
                            f7 = fKN;
                            f8 = fUo;
                            shape3 = shapeJ2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                            }
                            animatable = (Animatable) objIF;
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                            }
                            mutableFloatState = (MutableFloatState) objIF2;
                            objIF3 = composerKN.iF();
                            if (objIF3 != companion.n()) {
                            }
                            mutableState = (MutableState) objIF3;
                            objIF4 = composerKN.iF();
                            if (objIF4 == companion.n()) {
                            }
                            mutableState2 = (MutableState) objIF4;
                            Boolean boolValueOf2 = Boolean.valueOf(z2);
                            Modifier modifier62 = modifier3;
                            zE2 = composerKN.E2(animatable) | ((i14 & 112) != 32);
                            objIF5 = composerKN.iF();
                            if (zE2) {
                                i16 = i14;
                                mutableState3 = mutableState;
                                SearchBar_androidKt$SearchBar$1$1 searchBar_androidKt$SearchBar$1$12 = new SearchBar_androidKt$SearchBar$1$1(animatable, z2, mutableFloatState, mutableState3, mutableState2, null);
                                composerKN.o(searchBar_androidKt$SearchBar$1$12);
                                objIF5 = searchBar_androidKt$SearchBar$1$12;
                                int i222 = (i16 >> 3) & 14;
                                EffectsKt.O(boolValueOf2, (Function2) objIF5, composerKN, i222);
                                objIF6 = composerKN.iF();
                                if (objIF6 == companion.n()) {
                                }
                                mutatorMutex = (MutatorMutex) objIF6;
                                zE22 = composerKN.E2(animatable) | ((i16 & 896) == 256);
                                objIF7 = composerKN.iF();
                                if (zE22) {
                                    mutableFloatState2 = mutableFloatState;
                                    objIF7 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, mutableFloatState2, animatable, function1, mutableState3, mutableState2, null);
                                    composerKN.o(objIF7);
                                    PredictiveBackHandlerKt.n(z2, (Function2) objIF7, composerKN, i222, 0);
                                    int i232 = i16 << 6;
                                    SearchBarColors searchBarColors62 = searchBarColors3;
                                    float f112 = f7;
                                    float f122 = f8;
                                    WindowInsets windowInsets42 = windowInsetsXMQ;
                                    Shape shape52 = shape3;
                                    O(animatable, mutableFloatState2, mutableState3, mutableState2, modifier62, function22, shape52, searchBarColors62, f112, f122, windowInsets42, function3, composerKN, Animatable.az | 3504 | (57344 & (i16 << 3)) | ((i16 << 15) & 458752) | (3670016 & i232) | (29360128 & i232) | (234881024 & i232) | (i232 & 1879048192), (i16 >> 24) & 126, 0);
                                    if (ComposerKt.v()) {
                                    }
                                    composer2 = composerKN;
                                    modifier4 = modifier62;
                                    shape4 = shape52;
                                    searchBarColors4 = searchBarColors62;
                                    f9 = f112;
                                    f10 = f122;
                                    windowInsets3 = windowInsets42;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                f5 = f3;
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i2 & 100663296) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                int i2022 = i5;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            f5 = f3;
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i2 & 100663296) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            int i20222 = i5;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        f5 = f3;
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i2 & 100663296) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        int i202222 = i5;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final float te() {
        return J2;
    }

    private static final boolean J2(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean Uo(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
