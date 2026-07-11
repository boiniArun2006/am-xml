package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0081\u0001\u0010\u0011\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u008e\u0001\u0010\u0015\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0081\u0001\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0012\u001a\u008e\u0001\u0010\u0018\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0081\u0001\u0010\u0019\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0098\u0001\u0010\u001b\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0081\u0001\u0010\u001d\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u0012\u001a\u0098\u0001\u0010\u001e\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u0083\u0001\u0010&\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u008f\u0001\u0010)\u001a\u00020\u00012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001al\u0010,\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001ax\u0010.\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010(2\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a'\u00105\u001a\u0002042\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u000200H\u0007¢\u0006\u0004\b5\u00106\u001a@\u0010>\u001a\u00020=2\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u0002002\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000200\u0018\u0001092\u000e\u0010<\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010;H\u0082@¢\u0006\u0004\b>\u0010?\u001a\u0092\u0001\u0010D\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aµ\u0001\u0010I\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010F\u001a\u00020\u00132\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010H\u001a\u00020@2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a£\u0001\u0010W\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020 2\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010P\u001a\u0002002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010F\u001a\u00020U2\u0006\u0010V\u001a\u00020B2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a@\u0010Z\u001a\u00020=2\u0006\u00107\u001a\u00020Y2\u0006\u00108\u001a\u0002002\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000200\u0018\u0001092\u000e\u0010<\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010;H\u0082@¢\u0006\u0004\bZ\u0010[\"\u0014\u0010]\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\\\"\u001a\u0010`\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\\\u001a\u0004\b^\u0010_\"\u0014\u0010a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\\\"\u0014\u0010b\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\\\"\u001a\u0010g\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010d\u001a\u0004\be\u0010f\"\u0014\u0010h\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\\\"\u0014\u0010i\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\\\"\u0014\u0010j\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\\\"\u0014\u0010k\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\\\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006n²\u0006\f\u0010l\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\f\u0010m\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/TopAppBarColors;", "colors", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "HI", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "expandedHeight", "ck", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "J2", "Uo", "mUb", "collapsedHeight", "gh", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "KN", "xMQ", "floatingActionButton", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "rl", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "nr", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "Landroidx/compose/material3/BottomAppBarState;", "O", "(FFF)Landroidx/compose/material3/BottomAppBarState;", "state", "velocity", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/ui/unit/Velocity;", "fD", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TextStyle;", "titleTextStyle", "", "centeredTitle", "qie", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "titleBottomPadding", "smallTitle", "smallTitleTextStyle", "r", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ScrolledOffset;", "scrolledOffset", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleHorizontalArrangement", "", "hideTitleSemantics", "Ik", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/TopAppBarState;", "iF", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "BottomAppBarHorizontalPadding", "te", "()F", "BottomAppBarVerticalPadding", "FABHorizontalPadding", "FABVerticalPadding", "Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "TopTitleAlphaEasing", "MediumTitleBottomPadding", "LargeTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "colorTransitionFraction", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2543:1\n1223#2,6:2544\n1223#2,6:2550\n1223#2,6:2556\n1223#2,6:2562\n1223#2,6:2568\n1223#2,6:2578\n1223#2,6:2584\n1223#2,6:2590\n1223#2,6:2596\n1223#2,6:2607\n1223#2,6:2613\n1223#2,6:2619\n1223#2,6:2625\n124#3:2574\n222#3:2575\n124#3:2602\n222#3:2603\n124#3:2604\n222#3:2605\n148#3:2784\n148#3:2786\n148#3:2788\n148#3:2790\n148#3:2792\n148#3:2793\n148#3:2794\n148#3:2795\n77#4:2576\n77#4:2606\n1#5:2577\n78#6,6:2631\n85#6,4:2646\n89#6,2:2656\n78#6,6:2666\n85#6,4:2681\n89#6,2:2691\n93#6:2697\n78#6,6:2706\n85#6,4:2721\n89#6,2:2731\n93#6:2737\n78#6,6:2746\n85#6,4:2761\n89#6,2:2771\n93#6:2777\n93#6:2781\n368#7,9:2637\n377#7:2658\n368#7,9:2672\n377#7:2693\n378#7,2:2695\n368#7,9:2712\n377#7:2733\n378#7,2:2735\n368#7,9:2752\n377#7:2773\n378#7,2:2775\n378#7,2:2779\n4032#8,6:2650\n4032#8,6:2685\n4032#8,6:2725\n4032#8,6:2765\n71#9:2659\n68#9,6:2660\n74#9:2694\n78#9:2698\n71#9:2699\n68#9,6:2700\n74#9:2734\n78#9:2738\n71#9:2739\n68#9,6:2740\n74#9:2774\n78#9:2778\n81#10:2782\n81#10:2783\n56#11:2785\n56#11:2787\n56#11:2789\n56#11:2791\n56#11:2796\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n*L\n875#1:2544,6\n876#1:2550,6\n900#1:2556,6\n1293#1:2562,6\n1612#1:2568,6\n1867#1:2578,6\n1880#1:2584,6\n1909#1:2590,6\n1910#1:2596,6\n1993#1:2607,6\n2029#1:2613,6\n2030#1:2619,6\n2164#1:2625,6\n1863#1:2574\n1863#1:2575\n1973#1:2602\n1973#1:2603\n1976#1:2604\n1976#1:2605\n1834#1:2784\n1835#1:2786\n1838#1:2788\n1839#1:2790\n2536#1:2792\n2537#1:2793\n2538#1:2794\n2542#1:2795\n1866#1:2576\n1985#1:2606\n2136#1:2631,6\n2136#1:2646,4\n2136#1:2656,2\n2138#1:2666,6\n2138#1:2681,4\n2138#1:2691,2\n2138#1:2697\n2144#1:2706,6\n2144#1:2721,4\n2144#1:2731,2\n2144#1:2737\n2156#1:2746,6\n2156#1:2761,4\n2156#1:2771,2\n2156#1:2777\n2136#1:2781\n2136#1:2637,9\n2136#1:2658\n2138#1:2672,9\n2138#1:2693\n2138#1:2695,2\n2144#1:2712,9\n2144#1:2733\n2144#1:2735,2\n2156#1:2752,9\n2156#1:2773\n2156#1:2775,2\n2136#1:2779,2\n2136#1:2650,6\n2138#1:2685,6\n2144#1:2725,6\n2156#1:2765,6\n2138#1:2659\n2138#1:2660,6\n2138#1:2694\n2138#1:2698\n2144#1:2699\n2144#1:2700,6\n2144#1:2734\n2144#1:2738\n2156#1:2739\n2156#1:2740,6\n2156#1:2774\n2156#1:2778\n1880#1:2782\n1888#1:2783\n1834#1:2785\n1835#1:2787\n1838#1:2789\n1839#1:2791\n2542#1:2796\n*E\n"})
public final class AppBarKt {
    private static final float J2;
    private static final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final CubicBezierEasing f24225O;
    private static final float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f24226n;
    private static final float nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f24227t;
    private static final float xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(final Modifier modifier, final ScrolledOffset scrolledOffset, long j2, final long j3, final long j4, final Function2 function2, final TextStyle textStyle, final float f3, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i2, final boolean z2, final Function2 function22, final Function2 function23, Composer composer, final int i3, final int i5) {
        int i7;
        long j5;
        int i8;
        Composer composer2;
        Composer composerKN = composer.KN(-742442296);
        if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= (i3 & 64) == 0 ? composerKN.p5(scrolledOffset) : composerKN.E2(scrolledOffset) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            j5 = j2;
            i7 |= composerKN.nr(j5) ? 256 : 128;
        } else {
            j5 = j2;
        }
        int i9 = i7;
        if ((i3 & 3072) == 0) {
            i9 |= composerKN.nr(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i9 |= composerKN.nr(j4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i9 |= composerKN.E2(function2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i9 |= composerKN.p5(textStyle) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i9 |= composerKN.rl(f3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i9 |= composerKN.p5(vertical) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i9 |= composerKN.p5(horizontal) ? 536870912 : 268435456;
        }
        int i10 = i9;
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerKN.t(i2) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerKN.E2(function22) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= composerKN.E2(function23) ? 2048 : 1024;
        }
        int i11 = i8;
        if ((i10 & 306783379) == 306783378 && (i11 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-742442296, i10, i11, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            boolean z3 = ((i10 & 112) == 32 || ((i10 & 64) != 0 && composerKN.E2(scrolledOffset))) | ((1879048192 & i10) == 536870912) | ((234881024 & i10) == 67108864) | ((i11 & 14) == 4);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, final long j6) {
                        int size = list.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Measurable measurable = (Measurable) list.get(i12);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "navigationIcon")) {
                                final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j6, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Measurable measurable2 = (Measurable) list.get(i13);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "actionIcons")) {
                                        final Placeable placeableDR02 = measurable2.dR0(Constraints.nr(j6, 0, 0, 0, 0, 14, null));
                                        int iQie = Constraints.qie(j6) == Integer.MAX_VALUE ? Constraints.qie(j6) : RangesKt.coerceAtLeast((Constraints.qie(j6) - placeableDR0.getWidth()) - placeableDR02.getWidth(), 0);
                                        int size3 = list.size();
                                        for (int i14 = 0; i14 < size3; i14++) {
                                            Measurable measurable3 = (Measurable) list.get(i14);
                                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable3), "title")) {
                                                final Placeable placeableDR03 = measurable3.dR0(Constraints.nr(j6, 0, iQie, 0, 0, 12, null));
                                                final int iZ = placeableDR03.z(AlignmentLineKt.rl()) != Integer.MIN_VALUE ? placeableDR03.z(AlignmentLineKt.rl()) : 0;
                                                float fN = scrolledOffset.n();
                                                final int iGh = Constraints.gh(j6) == Integer.MAX_VALUE ? Constraints.gh(j6) : Constraints.gh(j6) + (Float.isNaN(fN) ? 0 : MathKt.roundToInt(fN));
                                                int iQie2 = Constraints.qie(j6);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i15 = i2;
                                                return MeasureScope.ER(measureScope, iQie2, iGh, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
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
                                                        int iQie3;
                                                        int i16;
                                                        int height;
                                                        int iQie4;
                                                        Placeable placeable = placeableDR0;
                                                        Placeable.PlacementScope.az(placementScope, placeable, 0, (iGh - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = placeableDR03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        Arrangement arrangement = Arrangement.f17400n;
                                                        if (Intrinsics.areEqual(horizontal3, arrangement.rl())) {
                                                            iQie3 = (Constraints.qie(j6) - placeableDR03.getWidth()) / 2;
                                                            if (iQie3 < placeableDR0.getWidth()) {
                                                                iQie4 = placeableDR0.getWidth() - iQie3;
                                                            } else if (placeableDR03.getWidth() + iQie3 > Constraints.qie(j6) - placeableDR02.getWidth()) {
                                                                iQie4 = (Constraints.qie(j6) - placeableDR02.getWidth()) - (placeableDR03.getWidth() + iQie3);
                                                            }
                                                            iQie3 += iQie4;
                                                        } else {
                                                            iQie3 = Intrinsics.areEqual(horizontal3, arrangement.t()) ? (Constraints.qie(j6) - placeableDR03.getWidth()) - placeableDR02.getWidth() : Math.max(measureScope.How(AppBarKt.xMQ), placeableDR0.getWidth());
                                                        }
                                                        int i17 = iQie3;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (Intrinsics.areEqual(vertical3, arrangement.rl())) {
                                                            height = (iGh - placeableDR03.getHeight()) / 2;
                                                        } else {
                                                            if (!Intrinsics.areEqual(vertical3, arrangement.n())) {
                                                                i16 = 0;
                                                                Placeable.PlacementScope.az(placementScope, placeable2, i17, i16, 0.0f, 4, null);
                                                                Placeable.PlacementScope.az(placementScope, placeableDR02, Constraints.qie(j6) - placeableDR02.getWidth(), (iGh - placeableDR02.getHeight()) / 2, 0.0f, 4, null);
                                                            }
                                                            int i18 = i15;
                                                            if (i18 == 0) {
                                                                height = iGh - placeableDR03.getHeight();
                                                            } else {
                                                                int height2 = i18 - (placeableDR03.getHeight() - iZ);
                                                                int height3 = placeableDR03.getHeight() + height2;
                                                                if (height3 > Constraints.gh(j6)) {
                                                                    height2 -= height3 - Constraints.gh(j6);
                                                                }
                                                                height = (iGh - placeableDR03.getHeight()) - Math.max(0, height2);
                                                            }
                                                        }
                                                        i16 = height;
                                                        Placeable.PlacementScope.az(placementScope, placeable2, i17, i16, 0.0f, 4, null);
                                                        Placeable.PlacementScope.az(placementScope, placeableDR02, Constraints.qie(j6) - placeableDR02.getWidth(), (iGh - placeableDR02.getHeight()) / 2, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
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
            Updater.O(composerN, measurePolicy, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierRl = LayoutIdKt.rl(companion2, "navigationIcon");
            float f4 = KN;
            Modifier modifierAz = PaddingKt.az(modifierRl, f4, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz);
            Function0 function0N2 = companion.n();
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
            Updater.O(composerN2, measurePolicyUo, companion.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion.O());
            Function2 function2Rl2 = companion.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            ProvidedValue providedValueNr = ContentColorKt.n().nr(Color.xMQ(j5));
            int i12 = ProvidedValue.xMQ;
            CompositionLocalKt.rl(providedValueNr, function22, composerKN, ((i11 >> 3) & 112) | i12);
            composerKN.XQ();
            Modifier modifierT = GraphicsLayerModifierKt.t(PaddingKt.gh(LayoutIdKt.rl(companion2, "title"), f4, 0.0f, 2, null).Zmq(z2 ? SemanticsModifierKt.n(companion2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }) : companion2), 0.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierT);
            Function0 function0N3 = companion.n();
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
            Updater.O(composerN3, measurePolicyUo2, companion.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion.O());
            Function2 function2Rl3 = companion.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion.nr());
            int i13 = i10 >> 9;
            ProvideContentColorTextStyleKt.n(j3, textStyle, function2, composerKN, (i13 & 14) | ((i10 >> 15) & 112) | (i13 & 896));
            composer2 = composerKN;
            composer2.XQ();
            Modifier modifierAz2 = PaddingKt.az(LayoutIdKt.rl(companion2, "actionIcons"), 0.0f, 0.0f, f4, 0.0f, 11, null);
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion3.HI(), false);
            int iN4 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk4 = composer2.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composer2, modifierAz2);
            Function0 function0N4 = companion.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N4);
            } else {
                composer2.r();
            }
            Composer composerN4 = Updater.n(composer2);
            Updater.O(composerN4, measurePolicyUo3, companion.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion.O());
            Function2 function2Rl4 = companion.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion.nr());
            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j4)), function23, composer2, ((i11 >> 6) & 112) | i12);
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final long j6 = j5;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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
                    AppBarKt.Ik(modifier, scrolledOffset, j6, j3, j4, function2, textStyle, f3, vertical, horizontal, i2, z2, function22, function23, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(Modifier modifier, final Function2 function2, final TextStyle textStyle, final float f3, final Function2 function22, final TextStyle textStyle2, final Function2 function23, final Function3 function3, final float f4, final float f5, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Function2 function24;
        TextStyle textStyle3;
        int i8;
        Modifier modifierKN;
        Composer composer2;
        final Modifier modifier2;
        TopAppBarState state;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1169193376);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(modifier) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.E2(function24) ? 32 : 16;
            }
        }
        int i10 = i7;
        if ((i5 & 4) != 0) {
            i10 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i10 |= composerKN.p5(textStyle) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i10 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i10 |= composerKN.rl(f3) ? 2048 : 1024;
            }
            if ((i5 & 16) != 0) {
                if ((i2 & 24576) == 0) {
                    i10 |= composerKN.E2(function22) ? 16384 : 8192;
                }
                if ((i5 & 32) != 0) {
                    i10 |= 196608;
                    textStyle3 = textStyle2;
                } else {
                    textStyle3 = textStyle2;
                    if ((i2 & 196608) == 0) {
                        i10 |= composerKN.p5(textStyle3) ? 131072 : 65536;
                    }
                }
                if ((i5 & 64) != 0) {
                    i10 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i10 |= composerKN.E2(function23) ? 1048576 : 524288;
                }
                if ((i5 & 128) != 0) {
                    i10 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i10 |= composerKN.E2(function3) ? 8388608 : 4194304;
                }
                if ((i5 & 256) != 0) {
                    i10 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i10 |= composerKN.rl(f4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                if ((i5 & 512) != 0) {
                    i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i10 |= composerKN.rl(f5) ? 536870912 : 268435456;
                }
                if ((1024 & i5) != 0) {
                    i8 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i8 = i3 | (composerKN.p5(windowInsets) ? 4 : 2);
                } else {
                    i8 = i3;
                }
                if ((2048 & i5) != 0) {
                    i8 |= 48;
                } else if ((i3 & 48) == 0) {
                    i8 |= composerKN.p5(topAppBarColors) ? 32 : 16;
                }
                if ((i5 & 4096) != 0) {
                    i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(topAppBarScrollBehavior) ? 256 : 128;
                }
                if ((306783379 & i10) != 306783378 || (i8 & 147) != 146 || !composerKN.xMQ()) {
                    Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1169193376, i10, i8, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
                    }
                    if (!Float.isNaN(f4)) {
                        if (!(f4 == Float.POSITIVE_INFINITY)) {
                            if (!Float.isNaN(f5)) {
                                if (!(f5 == Float.POSITIVE_INFINITY)) {
                                    if (Dp.Uo(f5, f4) < 0) {
                                        throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                                    }
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                    Ref.IntRef intRef = new Ref.IntRef();
                                    Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    floatRef.element = density.l(f5);
                                    floatRef2.element = density.l(f4);
                                    intRef.element = density.How(f3);
                                    Unit unit = Unit.INSTANCE;
                                    int i11 = i8 & 896;
                                    boolean zRl = (i11 == 256) | composerKN.rl(floatRef2.element) | composerKN.rl(floatRef.element);
                                    Object objIF = composerKN.iF();
                                    if (zRl || objIF == Composer.INSTANCE.n()) {
                                        objIF = new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$5$1
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
                                                TopAppBarState state2;
                                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.nr()), floatRef2.element - floatRef.element)) {
                                                    return;
                                                }
                                                TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                if (state3 == null) {
                                                    return;
                                                }
                                                state3.KN(floatRef2.element - floatRef.element);
                                            }
                                        };
                                        composerKN.o(objIF);
                                    }
                                    EffectsKt.KN((Function0) objIF, composerKN, 0);
                                    float fN = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.n();
                                    long jN = topAppBarColors.n(fN);
                                    ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-89435287, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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
                                                ComposerKt.p5(-89435287, i12, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)");
                                            }
                                            Arrangement.Horizontal horizontalT = Arrangement.f17400n.t();
                                            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                            Function3 function32 = function3;
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalT, verticalXMQ, composer3, 54);
                                            int iN = ComposablesKt.n(composer3, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer3, companion);
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion2.n();
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
                                            Updater.O(composerN, measurePolicyRl, companion2.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                            Function2 function2Rl = companion2.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO, companion2.nr());
                                            function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                                            composer3.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    float fN2 = f24225O.n(fN);
                                    float f6 = 1.0f - fN;
                                    boolean z2 = fN < 0.5f;
                                    boolean z3 = !z2;
                                    composerKN.eF(1641266888);
                                    if (topAppBarScrollBehavior == null || topAppBarScrollBehavior.getIsPinned()) {
                                        modifierKN = Modifier.INSTANCE;
                                    } else {
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Orientation orientation = Orientation.f16969n;
                                        boolean z4 = i11 == 256;
                                        Object objIF2 = composerKN.iF();
                                        if (z4 || objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
                                                    n(f7.floatValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(float f7) {
                                                    TopAppBarState state2 = topAppBarScrollBehavior.getState();
                                                    state2.Uo(state2.t() + f7);
                                                }
                                            };
                                            composerKN.o(objIF2);
                                        }
                                        DraggableState draggableStateXMQ = DraggableKt.xMQ((Function1) objIF2, composerKN, 0);
                                        boolean z5 = i11 == 256;
                                        Object objIF3 = composerKN.iF();
                                        if (z5 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                            composerKN.o(objIF3);
                                        }
                                        modifierKN = DraggableKt.KN(companion, draggableStateXMQ, orientation, false, null, false, null, (Function3) objIF3, false, 188, null);
                                    }
                                    composerKN.Xw();
                                    composer2 = composerKN;
                                    SurfaceKt.n(modifier3.Zmq(modifierKN), null, jN, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1350062619, true, new AppBarKt$TwoRowsTopAppBar$6(windowInsets, f4, topAppBarColors, function22, textStyle3, fN2, z2, function23, composableLambdaNr, f5, topAppBarScrollBehavior, function24, textStyle, f6, intRef, z3), composer2, 54), composer2, 12582912, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier2 = modifier3;
                                }
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                    }
                    throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
                }
                composerKN.wTp();
                modifier2 = modifier;
                composer2 = composerKN;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$7
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
                            AppBarKt.r(modifier2, function2, textStyle, f3, function22, textStyle2, function23, function3, f4, f5, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i10 |= 24576;
            if ((i5 & 32) != 0) {
            }
            if ((i5 & 64) != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            if ((i5 & 512) != 0) {
            }
            if ((1024 & i5) != 0) {
            }
            if ((2048 & i5) != 0) {
            }
            if ((i5 & 4096) != 0) {
            }
            if ((306783379 & i10) != 306783378) {
                if (i9 == 0) {
                }
                if (ComposerKt.v()) {
                }
                if (!Float.isNaN(f4)) {
                }
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) != 0) {
        }
        if ((i5 & 32) != 0) {
        }
        if ((i5 & 64) != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        if ((i5 & 512) != 0) {
        }
        if ((1024 & i5) != 0) {
        }
        if ((2048 & i5) != 0) {
        }
        if ((i5 & 4096) != 0) {
        }
        if ((306783379 & i10) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    static {
        float f3 = 16;
        float f4 = 12;
        float fKN = Dp.KN(Dp.KN(f3) - Dp.KN(f4));
        f24226n = fKN;
        float fKN2 = Dp.KN(Dp.KN(f3) - Dp.KN(f4));
        rl = fKN2;
        f24227t = Dp.KN(Dp.KN(f3) - fKN);
        nr = Dp.KN(Dp.KN(f4) - fKN2);
        f24225O = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        J2 = Dp.KN(24);
        Uo = Dp.KN(28);
        float fKN3 = Dp.KN(4);
        KN = fKN3;
        xMQ = Dp.KN(Dp.KN(f3) - fKN3);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void HI(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2N;
        int i8;
        Function3 function3Gh;
        WindowInsets windowInsetsGh;
        TopAppBarColors topAppBarColorsTy;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function32;
        WindowInsets windowInsets2;
        Modifier modifier3;
        Function2 function24;
        int i10;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1906353009);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
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
                    function2N = function22;
                    i5 |= composerKN.E2(function2N) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3Gh = function3;
                        i5 |= composerKN.E2(function3Gh) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            windowInsetsGh = windowInsets;
                            int i12 = composerKN.p5(windowInsetsGh) ? 16384 : 8192;
                            i5 |= i12;
                        } else {
                            windowInsetsGh = windowInsets;
                        }
                        i5 |= i12;
                    } else {
                        windowInsetsGh = windowInsets;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            topAppBarColorsTy = topAppBarColors;
                            int i13 = composerKN.p5(topAppBarColorsTy) ? 131072 : 65536;
                            i5 |= i13;
                        } else {
                            topAppBarColorsTy = topAppBarColors;
                        }
                        i5 |= i13;
                    } else {
                        topAppBarColorsTy = topAppBarColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i5 |= composerKN.p5(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            function25 = function2N;
                            function33 = function3Gh;
                            windowInsets3 = windowInsetsGh;
                            topAppBarColors3 = topAppBarColorsTy;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    function2N = ComposableSingletons$AppBarKt.f25044n.n();
                                }
                                if (i8 != 0) {
                                    function3Gh = ComposableSingletons$AppBarKt.f25044n.gh();
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    topAppBarColorsTy = TopAppBarDefaults.f28845n.ty(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    windowInsets2 = windowInsetsGh;
                                    topAppBarColors2 = topAppBarColorsTy;
                                    function24 = function2N;
                                    function32 = function3Gh;
                                    modifier3 = modifier5;
                                } else {
                                    topAppBarColors2 = topAppBarColorsTy;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                    function32 = function3Gh;
                                    windowInsets2 = windowInsetsGh;
                                    modifier3 = modifier5;
                                    function24 = function2N;
                                }
                                i10 = 1906353009;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsTy;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i10 = 1906353009;
                                function32 = function3Gh;
                                windowInsets2 = windowInsetsGh;
                                modifier3 = modifier2;
                                function24 = function2N;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i10, i5, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
                            }
                            int i14 = (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i15 = i5 << 3;
                            composer2 = composerKN;
                            ck(function23, modifier3, function24, function32, TopAppBarDefaults.f28845n.mUb(), windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i14 | (458752 & i15) | (3670016 & i15) | (i15 & 29360128), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$1
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
                                    AppBarKt.HI(function2, modifier4, function25, function33, windowInsets3, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                            }
                            i10 = 1906353009;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i142 = (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i152 = i5 << 3;
                            composer2 = composerKN;
                            ck(function23, modifier3, function24, function32, TopAppBarDefaults.f28845n.mUb(), windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i142 | (458752 & i152) | (3670016 & i152) | (i152 & 29360128), 0);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3Gh = function3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2N = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3Gh = function3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2N = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3Gh = function3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void J2(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2Ty;
        int i8;
        Function3 function3HI;
        WindowInsets windowInsetsGh;
        TopAppBarColors topAppBarColorsN;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function32;
        WindowInsets windowInsets2;
        Modifier modifier3;
        Function2 function24;
        int i10;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2139286460);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
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
                    function2Ty = function22;
                    i5 |= composerKN.E2(function2Ty) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3HI = function3;
                        i5 |= composerKN.E2(function3HI) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            windowInsetsGh = windowInsets;
                            int i12 = composerKN.p5(windowInsetsGh) ? 16384 : 8192;
                            i5 |= i12;
                        } else {
                            windowInsetsGh = windowInsets;
                        }
                        i5 |= i12;
                    } else {
                        windowInsetsGh = windowInsets;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            topAppBarColorsN = topAppBarColors;
                            int i13 = composerKN.p5(topAppBarColorsN) ? 131072 : 65536;
                            i5 |= i13;
                        } else {
                            topAppBarColorsN = topAppBarColors;
                        }
                        i5 |= i13;
                    } else {
                        topAppBarColorsN = topAppBarColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i5 |= composerKN.p5(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            function25 = function2Ty;
                            function33 = function3HI;
                            windowInsets3 = windowInsetsGh;
                            topAppBarColors3 = topAppBarColorsN;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    function2Ty = ComposableSingletons$AppBarKt.f25044n.ty();
                                }
                                if (i8 != 0) {
                                    function3HI = ComposableSingletons$AppBarKt.f25044n.HI();
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    topAppBarColorsN = TopAppBarDefaults.f28845n.n(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    windowInsets2 = windowInsetsGh;
                                    topAppBarColors2 = topAppBarColorsN;
                                    function24 = function2Ty;
                                    function32 = function3HI;
                                    modifier3 = modifier5;
                                } else {
                                    topAppBarColors2 = topAppBarColorsN;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                    function32 = function3HI;
                                    windowInsets2 = windowInsetsGh;
                                    modifier3 = modifier5;
                                    function24 = function2Ty;
                                }
                                i10 = -2139286460;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsN;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i10 = -2139286460;
                                function32 = function3HI;
                                windowInsets2 = windowInsetsGh;
                                modifier3 = modifier2;
                                function24 = function2Ty;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i10, i5, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:273)");
                            }
                            int i14 = (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i15 = i5 << 3;
                            composer2 = composerKN;
                            Uo(function23, modifier3, function24, function32, TopAppBarDefaults.f28845n.mUb(), windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i14 | (458752 & i15) | (3670016 & i15) | (i15 & 29360128), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1
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
                                    AppBarKt.J2(function2, modifier4, function25, function33, windowInsets3, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                            }
                            i10 = -2139286460;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i142 = (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i152 = i5 << 3;
                            composer2 = composerKN;
                            Uo(function23, modifier3, function24, function32, TopAppBarDefaults.f28845n.mUb(), windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i142 | (458752 & i152) | (3670016 & i152) | (i152 & 29360128), 0);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3HI = function3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2Ty = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3HI = function3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2Ty = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3HI = function3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void KN(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2O;
        int i8;
        Function3 function3J2;
        WindowInsets windowInsetsGh;
        TopAppBarColors topAppBarColorsQie;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        int i10;
        Function3 function32;
        WindowInsets windowInsets2;
        Modifier modifier3;
        Function2 function24;
        int i11;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-474540752);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
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
                    function2O = function22;
                    i5 |= composerKN.E2(function2O) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3J2 = function3;
                        i5 |= composerKN.E2(function3J2) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            windowInsetsGh = windowInsets;
                            int i13 = composerKN.p5(windowInsetsGh) ? 16384 : 8192;
                            i5 |= i13;
                        } else {
                            windowInsetsGh = windowInsets;
                        }
                        i5 |= i13;
                    } else {
                        windowInsetsGh = windowInsets;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            topAppBarColorsQie = topAppBarColors;
                            int i14 = composerKN.p5(topAppBarColorsQie) ? 131072 : 65536;
                            i5 |= i14;
                        } else {
                            topAppBarColorsQie = topAppBarColors;
                        }
                        i5 |= i14;
                    } else {
                        topAppBarColorsQie = topAppBarColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i5 |= composerKN.p5(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            function25 = function2O;
                            function33 = function3J2;
                            windowInsets3 = windowInsetsGh;
                            topAppBarColors3 = topAppBarColorsQie;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    function2O = ComposableSingletons$AppBarKt.f25044n.O();
                                }
                                if (i8 != 0) {
                                    function3J2 = ComposableSingletons$AppBarKt.f25044n.J2();
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    topAppBarColorsQie = TopAppBarDefaults.f28845n.qie(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    topAppBarColors2 = topAppBarColorsQie;
                                } else {
                                    topAppBarColors2 = topAppBarColorsQie;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                i10 = 6;
                                function32 = function3J2;
                                windowInsets2 = windowInsetsGh;
                                modifier3 = modifier5;
                                function24 = function2O;
                                i11 = -474540752;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsQie;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i10 = 6;
                                i11 = -474540752;
                                function32 = function3J2;
                                windowInsets2 = windowInsetsGh;
                                modifier3 = modifier2;
                                function24 = function2O;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i11, i5, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:545)");
                            }
                            TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.f28845n;
                            float fJ2 = topAppBarDefaults.J2();
                            float fUo = topAppBarDefaults.Uo();
                            int i15 = (i5 & 14) | 221184 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i16 = i5 << i10;
                            composer2 = composerKN;
                            xMQ(function23, modifier3, function24, function32, fJ2, fUo, windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i15 | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$LargeTopAppBar$1
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
                                    AppBarKt.KN(function2, modifier4, function25, function33, windowInsets3, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i12 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                            }
                            i10 = 6;
                            function32 = function3J2;
                            windowInsets2 = windowInsetsGh;
                            modifier3 = modifier5;
                            function24 = function2O;
                            i11 = -474540752;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            TopAppBarDefaults topAppBarDefaults2 = TopAppBarDefaults.f28845n;
                            float fJ22 = topAppBarDefaults2.J2();
                            float fUo2 = topAppBarDefaults2.Uo();
                            int i152 = (i5 & 14) | 221184 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i162 = i5 << i10;
                            composer2 = composerKN;
                            xMQ(function23, modifier3, function24, function32, fJ22, fUo2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i152 | (3670016 & i162) | (29360128 & i162) | (i162 & 234881024), 0);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3J2 = function3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2O = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3J2 = function3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2O = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3J2 = function3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final BottomAppBarState O(float f3, float f4, float f5) {
        return new BottomAppBarStateImpl(f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2Ck;
        int i8;
        Function3 function3Ik;
        int i9;
        float fMUb;
        WindowInsets windowInsetsGh;
        TopAppBarColors topAppBarColorsN;
        int i10;
        int i11;
        int i12;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        Function3 function32;
        float f4;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i13;
        Function2 function24;
        Composer composer2;
        final float f5;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1952988048);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
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
                    function2Ck = function22;
                    i5 |= composerKN.E2(function2Ck) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3Ik = function3;
                        i5 |= composerKN.E2(function3Ik) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            fMUb = f3;
                            i5 |= composerKN.rl(fMUb) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            if ((i3 & 32) == 0) {
                                windowInsetsGh = windowInsets;
                                int i15 = composerKN.p5(windowInsetsGh) ? 131072 : 65536;
                                i5 |= i15;
                            } else {
                                windowInsetsGh = windowInsets;
                            }
                            i5 |= i15;
                        } else {
                            windowInsetsGh = windowInsets;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                topAppBarColorsN = topAppBarColors;
                                int i16 = composerKN.p5(topAppBarColorsN) ? 1048576 : 524288;
                                i5 |= i16;
                            } else {
                                topAppBarColorsN = topAppBarColors;
                            }
                            i5 |= i16;
                        } else {
                            topAppBarColorsN = topAppBarColors;
                        }
                        i10 = i3 & 128;
                        if (i10 == 0) {
                            if ((i2 & 12582912) == 0) {
                                i11 = i10;
                                i5 |= composerKN.p5(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            }
                            int i17 = i5;
                            if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier5 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i7 != 0) {
                                        function2Ck = ComposableSingletons$AppBarKt.f25044n.ck();
                                    }
                                    if (i8 != 0) {
                                        function3Ik = ComposableSingletons$AppBarKt.f25044n.Ik();
                                    }
                                    if (i9 != 0) {
                                        fMUb = TopAppBarDefaults.f28845n.mUb();
                                    }
                                    if ((i3 & 32) == 0) {
                                        i12 = i17 & (-458753);
                                        windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                    } else {
                                        i12 = i17;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i12 &= -3670017;
                                        topAppBarColorsN = TopAppBarDefaults.f28845n.n(composerKN, 6);
                                    }
                                    if (i11 == 0) {
                                        modifier3 = modifier5;
                                        topAppBarScrollBehavior2 = null;
                                    } else {
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        modifier3 = modifier5;
                                    }
                                    function32 = function3Ik;
                                    f4 = fMUb;
                                    windowInsets2 = windowInsetsGh;
                                    topAppBarColors2 = topAppBarColorsN;
                                    i13 = 1952988048;
                                    function24 = function2Ck;
                                } else {
                                    composerKN.wTp();
                                    int i18 = (i3 & 32) != 0 ? i17 & (-458753) : i17;
                                    if ((i3 & 64) != 0) {
                                        i18 &= -3670017;
                                    }
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function32 = function3Ik;
                                    windowInsets2 = windowInsetsGh;
                                    topAppBarColors2 = topAppBarColorsN;
                                    i13 = 1952988048;
                                    i12 = i18;
                                    function24 = function2Ck;
                                    f4 = fMUb;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i13, i12, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                                }
                                TextStyle textStyleT = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                Dp.Companion companion = Dp.INSTANCE;
                                int i19 = i12 << 6;
                                composer2 = composerKN;
                                qie(modifier3, function23, textStyleT, true, function24, function32, (!Dp.mUb(f4, companion.t()) || Dp.mUb(f4, companion.rl())) ? TopAppBarDefaults.f28845n.mUb() : f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i19) | (458752 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                f5 = f4;
                                modifier4 = modifier3;
                                function25 = function24;
                                function33 = function32;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            } else {
                                composerKN.wTp();
                                composer2 = composerKN;
                                modifier4 = modifier2;
                                function25 = function2Ck;
                                function33 = function3Ik;
                                f5 = fMUb;
                                windowInsets3 = windowInsetsGh;
                                topAppBarColors3 = topAppBarColorsN;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$2
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
                                        AppBarKt.Uo(function2, modifier4, function25, function33, f5, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 12582912;
                        i11 = i10;
                        int i172 = i5;
                        if ((i5 & 4793491) == 4793490) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i14 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i3 & 32) == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                }
                                if (i11 == 0) {
                                }
                                function32 = function3Ik;
                                f4 = fMUb;
                                windowInsets2 = windowInsetsGh;
                                topAppBarColors2 = topAppBarColorsN;
                                i13 = 1952988048;
                                function24 = function2Ck;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                TextStyle textStyleT2 = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                Dp.Companion companion2 = Dp.INSTANCE;
                                if (Dp.mUb(f4, companion2.t())) {
                                    int i192 = i12 << 6;
                                    composer2 = composerKN;
                                    qie(modifier3, function23, textStyleT2, true, function24, function32, (!Dp.mUb(f4, companion2.t()) || Dp.mUb(f4, companion2.rl())) ? TopAppBarDefaults.f28845n.mUb() : f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i192) | (458752 & i192) | (29360128 & i192) | (234881024 & i192) | (i192 & 1879048192), 0);
                                    if (ComposerKt.v()) {
                                    }
                                    f5 = f4;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    fMUb = f3;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    int i1722 = i5;
                    if ((i5 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function3Ik = function3;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                fMUb = f3;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                int i17222 = i5;
                if ((i5 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function2Ck = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3Ik = function3;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            fMUb = f3;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            int i172222 = i5;
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2Ck = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3Ik = function3;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        fMUb = f3;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        int i1722222 = i5;
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ck(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2Qie;
        int i8;
        Function3 function3Az;
        int i9;
        float fMUb;
        WindowInsets windowInsetsGh;
        TopAppBarColors topAppBarColorsTy;
        int i10;
        int i11;
        int i12;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        Function3 function32;
        float f4;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i13;
        Function2 function24;
        Composer composer2;
        final float f5;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(226148675);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
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
                    function2Qie = function22;
                    i5 |= composerKN.E2(function2Qie) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3Az = function3;
                        i5 |= composerKN.E2(function3Az) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            fMUb = f3;
                            i5 |= composerKN.rl(fMUb) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            if ((i3 & 32) == 0) {
                                windowInsetsGh = windowInsets;
                                int i15 = composerKN.p5(windowInsetsGh) ? 131072 : 65536;
                                i5 |= i15;
                            } else {
                                windowInsetsGh = windowInsets;
                            }
                            i5 |= i15;
                        } else {
                            windowInsetsGh = windowInsets;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                topAppBarColorsTy = topAppBarColors;
                                int i16 = composerKN.p5(topAppBarColorsTy) ? 1048576 : 524288;
                                i5 |= i16;
                            } else {
                                topAppBarColorsTy = topAppBarColors;
                            }
                            i5 |= i16;
                        } else {
                            topAppBarColorsTy = topAppBarColors;
                        }
                        i10 = i3 & 128;
                        if (i10 == 0) {
                            if ((i2 & 12582912) == 0) {
                                i11 = i10;
                                i5 |= composerKN.p5(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            }
                            int i17 = i5;
                            if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier5 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i7 != 0) {
                                        function2Qie = ComposableSingletons$AppBarKt.f25044n.qie();
                                    }
                                    if (i8 != 0) {
                                        function3Az = ComposableSingletons$AppBarKt.f25044n.az();
                                    }
                                    if (i9 != 0) {
                                        fMUb = TopAppBarDefaults.f28845n.mUb();
                                    }
                                    if ((i3 & 32) == 0) {
                                        i12 = i17 & (-458753);
                                        windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                    } else {
                                        i12 = i17;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i12 &= -3670017;
                                        topAppBarColorsTy = TopAppBarDefaults.f28845n.ty(composerKN, 6);
                                    }
                                    if (i11 == 0) {
                                        modifier3 = modifier5;
                                        topAppBarScrollBehavior2 = null;
                                    } else {
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        modifier3 = modifier5;
                                    }
                                    function32 = function3Az;
                                    f4 = fMUb;
                                    windowInsets2 = windowInsetsGh;
                                    topAppBarColors2 = topAppBarColorsTy;
                                    i13 = 226148675;
                                    function24 = function2Qie;
                                } else {
                                    composerKN.wTp();
                                    int i18 = (i3 & 32) != 0 ? i17 & (-458753) : i17;
                                    if ((i3 & 64) != 0) {
                                        i18 &= -3670017;
                                    }
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function32 = function3Az;
                                    windowInsets2 = windowInsetsGh;
                                    topAppBarColors2 = topAppBarColorsTy;
                                    i13 = 226148675;
                                    i12 = i18;
                                    function24 = function2Qie;
                                    f4 = fMUb;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i13, i12, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
                                }
                                TextStyle textStyleT = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                Dp.Companion companion = Dp.INSTANCE;
                                int i19 = i12 << 6;
                                composer2 = composerKN;
                                qie(modifier3, function23, textStyleT, false, function24, function32, (!Dp.mUb(f4, companion.t()) || Dp.mUb(f4, companion.rl())) ? TopAppBarDefaults.f28845n.mUb() : f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i19) | (458752 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                f5 = f4;
                                modifier4 = modifier3;
                                function25 = function24;
                                function33 = function32;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            } else {
                                composerKN.wTp();
                                composer2 = composerKN;
                                modifier4 = modifier2;
                                function25 = function2Qie;
                                function33 = function3Az;
                                f5 = fMUb;
                                windowInsets3 = windowInsetsGh;
                                topAppBarColors3 = topAppBarColorsTy;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
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
                                        AppBarKt.ck(function2, modifier4, function25, function33, f5, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 12582912;
                        i11 = i10;
                        int i172 = i5;
                        if ((i5 & 4793491) == 4793490) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i14 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i3 & 32) == 0) {
                                }
                                if ((i3 & 64) != 0) {
                                }
                                if (i11 == 0) {
                                }
                                function32 = function3Az;
                                f4 = fMUb;
                                windowInsets2 = windowInsetsGh;
                                topAppBarColors2 = topAppBarColorsTy;
                                i13 = 226148675;
                                function24 = function2Qie;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                TextStyle textStyleT2 = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                Dp.Companion companion2 = Dp.INSTANCE;
                                if (Dp.mUb(f4, companion2.t())) {
                                    int i192 = i12 << 6;
                                    composer2 = composerKN;
                                    qie(modifier3, function23, textStyleT2, false, function24, function32, (!Dp.mUb(f4, companion2.t()) || Dp.mUb(f4, companion2.rl())) ? TopAppBarDefaults.f28845n.mUb() : f4, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112) | (57344 & i192) | (458752 & i192) | (29360128 & i192) | (234881024 & i192) | (i192 & 1879048192), 0);
                                    if (ComposerKt.v()) {
                                    }
                                    f5 = f4;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    fMUb = f3;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    int i1722 = i5;
                    if ((i5 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function3Az = function3;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                fMUb = f3;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                int i17222 = i5;
                if ((i5 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function2Qie = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3Az = function3;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            fMUb = f3;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            int i172222 = i5;
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2Qie = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3Az = function3;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        fMUb = f3;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        int i1722222 = i5;
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fD(BottomAppBarState bottomAppBarState, float f3, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec, Continuation continuation) {
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$1;
        final Ref.FloatRef floatRef;
        AnimationSpec animationSpec2;
        Ref.FloatRef floatRef2;
        final BottomAppBarState bottomAppBarState2 = bottomAppBarState;
        if (continuation instanceof AppBarKt$settleAppBarBottom$1) {
            appBarKt$settleAppBarBottom$1 = (AppBarKt$settleAppBarBottom$1) continuation;
            int i2 = appBarKt$settleAppBarBottom$1.f24438r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBarBottom$1.f24438r = i2 - Integer.MIN_VALUE;
            } else {
                appBarKt$settleAppBarBottom$1 = new AppBarKt$settleAppBarBottom$1(continuation);
            }
        }
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$12 = appBarKt$settleAppBarBottom$1;
        Object obj = appBarKt$settleAppBarBottom$12.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = appBarKt$settleAppBarBottom$12.f24438r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (bottomAppBarState2.n() < 0.01f || bottomAppBarState2.n() == 1.0f) {
                return Velocity.rl(Velocity.INSTANCE.n());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f3;
            if (decayAnimationSpec != null && Math.abs(f3) > 1.0f) {
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateT = AnimationStateKt.t(0.0f, f3, 0L, 0L, false, 28, null);
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBarBottom$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        n(animationScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(AnimationScope animationScope) {
                        float fFloatValue = ((Number) animationScope.O()).floatValue() - floatRef3.element;
                        float fRl = bottomAppBarState2.rl();
                        bottomAppBarState2.J2(fRl + fFloatValue);
                        float fAbs = Math.abs(fRl - bottomAppBarState2.rl());
                        floatRef3.element = ((Number) animationScope.O()).floatValue();
                        floatRef.element = ((Number) animationScope.J2()).floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationScope.n();
                        }
                    }
                };
                appBarKt$settleAppBarBottom$12.f24437n = bottomAppBarState2;
                animationSpec2 = animationSpec;
                appBarKt$settleAppBarBottom$12.f24439t = animationSpec2;
                appBarKt$settleAppBarBottom$12.f24436O = floatRef;
                appBarKt$settleAppBarBottom$12.f24438r = 1;
                if (SuspendAnimationKt.xMQ(animationStateT, decayAnimationSpec, false, function1, appBarKt$settleAppBarBottom$12, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            animationSpec2 = animationSpec;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) appBarKt$settleAppBarBottom$12.f24437n;
                ResultKt.throwOnFailure(obj);
                floatRef = floatRef2;
                return Velocity.rl(VelocityKt.n(0.0f, floatRef.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) appBarKt$settleAppBarBottom$12.f24436O;
            AnimationSpec animationSpec3 = (AnimationSpec) appBarKt$settleAppBarBottom$12.f24439t;
            BottomAppBarState bottomAppBarState3 = (BottomAppBarState) appBarKt$settleAppBarBottom$12.f24437n;
            ResultKt.throwOnFailure(obj);
            floatRef = floatRef4;
            animationSpec2 = animationSpec3;
            bottomAppBarState2 = bottomAppBarState3;
        }
        AnimationSpec animationSpec4 = animationSpec2;
        if (animationSpec4 != null && bottomAppBarState2.rl() < 0.0f && bottomAppBarState2.rl() > bottomAppBarState2.O()) {
            AnimationState animationStateT2 = AnimationStateKt.t(bottomAppBarState2.rl(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(bottomAppBarState2.n() < 0.5f ? 0.0f : bottomAppBarState2.O());
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBarBottom$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    n(animationScope);
                    return Unit.INSTANCE;
                }

                public final void n(AnimationScope animationScope) {
                    bottomAppBarState2.J2(((Number) animationScope.O()).floatValue());
                }
            };
            appBarKt$settleAppBarBottom$12.f24437n = floatRef;
            appBarKt$settleAppBarBottom$12.f24439t = null;
            appBarKt$settleAppBarBottom$12.f24436O = null;
            appBarKt$settleAppBarBottom$12.f24438r = 2;
            if (SuspendAnimationKt.gh(animationStateT2, fBoxFloat, animationSpec4, false, function12, appBarKt$settleAppBarBottom$12, 4, null) != coroutine_suspended) {
                floatRef2 = floatRef;
                floatRef = floatRef2;
            }
            return coroutine_suspended;
        }
        return Velocity.rl(VelocityKt.n(0.0f, floatRef.element));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gh(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f3, float f4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2T;
        int i8;
        Function3 function3Nr;
        int i9;
        float fKN;
        int i10;
        float fXMQ;
        int i11;
        int i12;
        WindowInsets windowInsetsGh;
        int i13;
        TopAppBarColors topAppBarColorsAz;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        Function2 function24;
        Function3 function32;
        float f5;
        Modifier modifier3;
        int i14;
        Composer composer2;
        final float f6;
        final float f7;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1879191686);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
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
                    function2T = function22;
                    i5 |= composerKN.E2(function2T) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3Nr = function3;
                        i5 |= composerKN.E2(function3Nr) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            fKN = f3;
                            i5 |= composerKN.rl(fKN) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else {
                            if ((196608 & i2) == 0) {
                                fXMQ = f4;
                                i5 |= composerKN.rl(fXMQ) ? 131072 : 65536;
                            }
                            if ((i2 & 1572864) == 0) {
                                i5 |= ((i3 & 64) == 0 && composerKN.p5(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i2 & 12582912) == 0) {
                                i5 |= ((i3 & 128) == 0 && composerKN.p5(topAppBarColors)) ? 8388608 : 4194304;
                            }
                            i11 = i3 & 256;
                            if (i11 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    i12 = i11;
                                    i5 |= composerKN.p5(topAppBarScrollBehavior) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                int i16 = i5;
                                if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    windowInsets3 = windowInsets;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    composer2 = composerKN;
                                    modifier4 = modifier2;
                                    function25 = function2T;
                                    function33 = function3Nr;
                                    f6 = fKN;
                                    f7 = fXMQ;
                                    topAppBarColors3 = topAppBarColors;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        if (i15 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            function2T = ComposableSingletons$AppBarKt.f25044n.t();
                                        }
                                        if (i8 != 0) {
                                            function3Nr = ComposableSingletons$AppBarKt.f25044n.nr();
                                        }
                                        if (i9 != 0) {
                                            fKN = TopAppBarDefaults.f28845n.KN();
                                        }
                                        if (i10 != 0) {
                                            fXMQ = TopAppBarDefaults.f28845n.xMQ();
                                        }
                                        if ((i3 & 64) == 0) {
                                            windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                            i13 = i16 & (-3670017);
                                        } else {
                                            windowInsetsGh = windowInsets;
                                            i13 = i16;
                                        }
                                        if ((i3 & 128) == 0) {
                                            topAppBarColorsAz = TopAppBarDefaults.f28845n.az(composerKN, 6);
                                            i13 &= -29360129;
                                        } else {
                                            topAppBarColorsAz = topAppBarColors;
                                        }
                                        if (i12 == 0) {
                                            windowInsets2 = windowInsetsGh;
                                            topAppBarColors2 = topAppBarColorsAz;
                                            function24 = function2T;
                                            topAppBarScrollBehavior2 = null;
                                        } else {
                                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            windowInsets2 = windowInsetsGh;
                                            topAppBarColors2 = topAppBarColorsAz;
                                            function24 = function2T;
                                        }
                                        function32 = function3Nr;
                                        f5 = fKN;
                                        modifier3 = modifier2;
                                        i14 = i13;
                                    } else {
                                        composerKN.wTp();
                                        int i17 = (i3 & 64) != 0 ? i16 & (-3670017) : i16;
                                        if ((i3 & 128) != 0) {
                                            i17 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i14 = i17;
                                        f5 = fKN;
                                        modifier3 = modifier5;
                                        windowInsets2 = windowInsets;
                                        topAppBarColors2 = topAppBarColors;
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        function24 = function2T;
                                        function32 = function3Nr;
                                    }
                                    float f8 = fXMQ;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1879191686, i14, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
                                    }
                                    TextStyle textStyleT = TypographyKt.t(TopAppBarMediumTokens.f29977n.nr(), composerKN, 6);
                                    TextStyle textStyleT2 = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                    float f9 = J2;
                                    Dp.Companion companion = Dp.INSTANCE;
                                    int i18 = i14 << 12;
                                    composer2 = composerKN;
                                    r(modifier3, function23, textStyleT, f9, function2, textStyleT2, function24, function32, (!Dp.mUb(f5, companion.t()) || Dp.mUb(f5, companion.rl())) ? TopAppBarDefaults.f28845n.KN() : f5, (!Dp.mUb(f8, companion.t()) || Dp.mUb(f8, companion.rl())) ? TopAppBarDefaults.f28845n.xMQ() : f8, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i18) | (3670016 & i18) | (i18 & 29360128), (i14 >> 18) & 1022, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    f6 = f5;
                                    f7 = f8;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$MediumTopAppBar$2
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
                                            AppBarKt.gh(function2, modifier4, function25, function33, f6, f7, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 100663296;
                            i12 = i11;
                            int i162 = i5;
                            if ((i5 & 38347923) == 38347922) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i15 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if ((i3 & 64) == 0) {
                                    }
                                    if ((i3 & 128) == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    function32 = function3Nr;
                                    f5 = fKN;
                                    modifier3 = modifier2;
                                    i14 = i13;
                                    float f82 = fXMQ;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    TextStyle textStyleT3 = TypographyKt.t(TopAppBarMediumTokens.f29977n.nr(), composerKN, 6);
                                    TextStyle textStyleT22 = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                    float f92 = J2;
                                    Dp.Companion companion2 = Dp.INSTANCE;
                                    if (Dp.mUb(f5, companion2.t())) {
                                        if (Dp.mUb(f82, companion2.t())) {
                                            int i182 = i14 << 12;
                                            composer2 = composerKN;
                                            r(modifier3, function23, textStyleT3, f92, function2, textStyleT22, function24, function32, (!Dp.mUb(f5, companion2.t()) || Dp.mUb(f5, companion2.rl())) ? TopAppBarDefaults.f28845n.KN() : f5, (!Dp.mUb(f82, companion2.t()) || Dp.mUb(f82, companion2.rl())) ? TopAppBarDefaults.f28845n.xMQ() : f82, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i182) | (3670016 & i182) | (i182 & 29360128), (i14 >> 18) & 1022, 0);
                                            if (ComposerKt.v()) {
                                            }
                                            f6 = f5;
                                            f7 = f82;
                                            modifier4 = modifier3;
                                            function25 = function24;
                                            function33 = function32;
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors3 = topAppBarColors2;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        fXMQ = f4;
                        if ((i2 & 1572864) == 0) {
                        }
                        if ((i2 & 12582912) == 0) {
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        int i1622 = i5;
                        if ((i5 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    fKN = f3;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    fXMQ = f4;
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    int i16222 = i5;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3Nr = function3;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                fKN = f3;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                fXMQ = f4;
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                int i162222 = i5;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2T = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3Nr = function3;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            fKN = f3;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            fXMQ = f4;
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            int i1622222 = i5;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2T = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3Nr = function3;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        fKN = f3;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        fXMQ = f4;
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        int i16222222 = i5;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object iF(TopAppBarState topAppBarState, float f3, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec, Continuation continuation) {
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$1;
        final Ref.FloatRef floatRef;
        AnimationSpec animationSpec2;
        Ref.FloatRef floatRef2;
        final TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof AppBarKt$settleAppBar$1) {
            appBarKt$settleAppBar$1 = (AppBarKt$settleAppBar$1) continuation;
            int i2 = appBarKt$settleAppBar$1.f24430r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBar$1.f24430r = i2 - Integer.MIN_VALUE;
            } else {
                appBarKt$settleAppBar$1 = new AppBarKt$settleAppBar$1(continuation);
            }
        }
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$12 = appBarKt$settleAppBar$1;
        Object obj = appBarKt$settleAppBar$12.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = appBarKt$settleAppBar$12.f24430r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (topAppBarState2.n() < 0.01f || topAppBarState2.n() == 1.0f) {
                return Velocity.rl(Velocity.INSTANCE.n());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f3;
            if (decayAnimationSpec != null && Math.abs(f3) > 1.0f) {
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateT = AnimationStateKt.t(0.0f, f3, 0L, 0L, false, 28, null);
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        n(animationScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(AnimationScope animationScope) {
                        float fFloatValue = ((Number) animationScope.O()).floatValue() - floatRef3.element;
                        float fT = topAppBarState2.t();
                        topAppBarState2.Uo(fT + fFloatValue);
                        float fAbs = Math.abs(fT - topAppBarState2.t());
                        floatRef3.element = ((Number) animationScope.O()).floatValue();
                        floatRef.element = ((Number) animationScope.J2()).floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationScope.n();
                        }
                    }
                };
                appBarKt$settleAppBar$12.f24429n = topAppBarState2;
                animationSpec2 = animationSpec;
                appBarKt$settleAppBar$12.f24431t = animationSpec2;
                appBarKt$settleAppBar$12.f24428O = floatRef;
                appBarKt$settleAppBar$12.f24430r = 1;
                if (SuspendAnimationKt.xMQ(animationStateT, decayAnimationSpec, false, function1, appBarKt$settleAppBar$12, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            animationSpec2 = animationSpec;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) appBarKt$settleAppBar$12.f24429n;
                ResultKt.throwOnFailure(obj);
                floatRef = floatRef2;
                return Velocity.rl(VelocityKt.n(0.0f, floatRef.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) appBarKt$settleAppBar$12.f24428O;
            AnimationSpec animationSpec3 = (AnimationSpec) appBarKt$settleAppBar$12.f24431t;
            TopAppBarState topAppBarState3 = (TopAppBarState) appBarKt$settleAppBar$12.f24429n;
            ResultKt.throwOnFailure(obj);
            floatRef = floatRef4;
            animationSpec2 = animationSpec3;
            topAppBarState2 = topAppBarState3;
        }
        AnimationSpec animationSpec4 = animationSpec2;
        if (animationSpec4 != null && topAppBarState2.t() < 0.0f && topAppBarState2.t() > topAppBarState2.nr()) {
            AnimationState animationStateT2 = AnimationStateKt.t(topAppBarState2.t(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(topAppBarState2.n() < 0.5f ? 0.0f : topAppBarState2.nr());
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBar$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    n(animationScope);
                    return Unit.INSTANCE;
                }

                public final void n(AnimationScope animationScope) {
                    topAppBarState2.Uo(((Number) animationScope.O()).floatValue());
                }
            };
            appBarKt$settleAppBar$12.f24429n = floatRef;
            appBarKt$settleAppBar$12.f24431t = null;
            appBarKt$settleAppBar$12.f24428O = null;
            appBarKt$settleAppBar$12.f24430r = 2;
            if (SuspendAnimationKt.gh(animationStateT2, fBoxFloat, animationSpec4, false, function12, appBarKt$settleAppBar$12, 4, null) != coroutine_suspended) {
                floatRef2 = floatRef;
                floatRef = floatRef2;
            }
            return coroutine_suspended;
        }
        return Velocity.rl(VelocityKt.n(0.0f, floatRef.element));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void mUb(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2R;
        int i8;
        Function3 function3Rl;
        WindowInsets windowInsetsGh;
        TopAppBarColors topAppBarColorsAz;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        int i10;
        Function3 function32;
        WindowInsets windowInsets2;
        Modifier modifier3;
        Function2 function24;
        int i11;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1805417862);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
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
                    function2R = function22;
                    i5 |= composerKN.E2(function2R) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3Rl = function3;
                        i5 |= composerKN.E2(function3Rl) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            windowInsetsGh = windowInsets;
                            int i13 = composerKN.p5(windowInsetsGh) ? 16384 : 8192;
                            i5 |= i13;
                        } else {
                            windowInsetsGh = windowInsets;
                        }
                        i5 |= i13;
                    } else {
                        windowInsetsGh = windowInsets;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            topAppBarColorsAz = topAppBarColors;
                            int i14 = composerKN.p5(topAppBarColorsAz) ? 131072 : 65536;
                            i5 |= i14;
                        } else {
                            topAppBarColorsAz = topAppBarColors;
                        }
                        i5 |= i14;
                    } else {
                        topAppBarColorsAz = topAppBarColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i5 |= composerKN.p5(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            function25 = function2R;
                            function33 = function3Rl;
                            windowInsets3 = windowInsetsGh;
                            topAppBarColors3 = topAppBarColorsAz;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i7 != 0) {
                                    function2R = ComposableSingletons$AppBarKt.f25044n.r();
                                }
                                if (i8 != 0) {
                                    function3Rl = ComposableSingletons$AppBarKt.f25044n.rl();
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    topAppBarColorsAz = TopAppBarDefaults.f28845n.az(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    topAppBarColors2 = topAppBarColorsAz;
                                } else {
                                    topAppBarColors2 = topAppBarColorsAz;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                i10 = 6;
                                function32 = function3Rl;
                                windowInsets2 = windowInsetsGh;
                                modifier3 = modifier5;
                                function24 = function2R;
                                i11 = 1805417862;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsAz;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i10 = 6;
                                i11 = 1805417862;
                                function32 = function3Rl;
                                windowInsets2 = windowInsetsGh;
                                modifier3 = modifier2;
                                function24 = function2R;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i11, i5, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:400)");
                            }
                            TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.f28845n;
                            float fKN = topAppBarDefaults.KN();
                            float fXMQ = topAppBarDefaults.xMQ();
                            int i15 = (i5 & 14) | 221184 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i16 = i5 << i10;
                            composer2 = composerKN;
                            gh(function23, modifier3, function24, function32, fKN, fXMQ, windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i15 | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$MediumTopAppBar$1
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
                                    AppBarKt.mUb(function2, modifier4, function25, function33, windowInsets3, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i5) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i12 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                            }
                            i10 = 6;
                            function32 = function3Rl;
                            windowInsets2 = windowInsetsGh;
                            modifier3 = modifier5;
                            function24 = function2R;
                            i11 = 1805417862;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            TopAppBarDefaults topAppBarDefaults2 = TopAppBarDefaults.f28845n;
                            float fKN2 = topAppBarDefaults2.KN();
                            float fXMQ2 = topAppBarDefaults2.xMQ();
                            int i152 = (i5 & 14) | 221184 | (i5 & 112) | (i5 & 896) | (i5 & 7168);
                            int i162 = i5 << i10;
                            composer2 = composerKN;
                            gh(function23, modifier3, function24, function32, fKN2, fXMQ2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior3, composer2, i152 | (3670016 & i162) | (29360128 & i162) | (i162 & 234881024), 0);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3Rl = function3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i5) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2R = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3Rl = function3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2R = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3Rl = function3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, float f3, PaddingValues paddingValues, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jN;
        long jT2;
        float fRl;
        int i7;
        PaddingValues paddingValuesT;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        WindowInsets windowInsetsNr;
        int i8;
        long j4;
        long j5;
        float f4;
        Modifier modifier3;
        int i9;
        Composer composer2;
        final Modifier modifier4;
        final long j6;
        final long j7;
        final float f5;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1391700845);
        int i10 = i3 & 1;
        if (i10 != 0) {
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
                jN = j2;
                int i11 = composerKN.nr(jN) ? 32 : 16;
                i5 |= i11;
            } else {
                jN = j2;
            }
            i5 |= i11;
        } else {
            jN = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                jT2 = j3;
                int i12 = composerKN.nr(jT2) ? 256 : 128;
                i5 |= i12;
            } else {
                jT2 = j3;
            }
            i5 |= i12;
        } else {
            jT2 = j3;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                fRl = f3;
                i5 |= composerKN.rl(fRl) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    paddingValuesT = paddingValues;
                    i5 |= composerKN.p5(paddingValuesT) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
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
                if ((i3 & 64) == 0) {
                    if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 2) != 0) {
                                jN = BottomAppBarDefaults.f24473n.n(composerKN, 6);
                                i5 &= -113;
                            }
                            if ((i3 & 4) != 0) {
                                jT2 = ColorSchemeKt.t(jN, composerKN, (i5 >> 3) & 14);
                                i5 &= -897;
                            }
                            if (i13 != 0) {
                                fRl = BottomAppBarDefaults.f24473n.rl();
                            }
                            if (i7 != 0) {
                                paddingValuesT = BottomAppBarDefaults.f24473n.t();
                            }
                            if ((i3 & 32) == 0) {
                                i5 &= -458753;
                                windowInsetsNr = BottomAppBarDefaults.f24473n.nr(composerKN, 6);
                                j5 = jT2;
                                paddingValues2 = paddingValuesT;
                                i8 = 1572864;
                                j4 = jN;
                            } else {
                                paddingValues2 = paddingValuesT;
                                windowInsetsNr = windowInsets2;
                                i8 = 1572864;
                                j4 = jN;
                                j5 = jT2;
                            }
                            f4 = fRl;
                            modifier3 = modifier5;
                            i9 = -1391700845;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            paddingValues2 = paddingValuesT;
                            windowInsetsNr = windowInsets2;
                            i8 = 1572864;
                            i9 = -1391700845;
                            j4 = jN;
                            j5 = jT2;
                            f4 = fRl;
                            modifier3 = modifier2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i9, i5, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                        }
                        composer2 = composerKN;
                        t(modifier3, j4, j5, f4, paddingValues2, windowInsetsNr, null, function3, composer2, (i5 & 14) | i8 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (29360128 & (i5 << 3)), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier4 = modifier3;
                        j6 = j4;
                        j7 = j5;
                        f5 = f4;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsetsNr;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        j6 = jN;
                        j7 = jT2;
                        f5 = fRl;
                        paddingValues3 = paddingValuesT;
                        windowInsets3 = windowInsets2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i15) {
                                AppBarKt.n(modifier4, j6, j7, f5, paddingValues3, windowInsets3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                        if (i10 == 0) {
                        }
                        if ((i3 & 2) != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        f4 = fRl;
                        modifier3 = modifier5;
                        i9 = -1391700845;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        t(modifier3, j4, j5, f4, paddingValues2, windowInsetsNr, null, function3, composer2, (i5 & 14) | i8 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (29360128 & (i5 << 3)), 0);
                        if (ComposerKt.v()) {
                        }
                        modifier4 = modifier3;
                        j6 = j4;
                        j7 = j5;
                        f5 = f4;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsetsNr;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            paddingValuesT = paddingValues;
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
        fRl = f3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        paddingValuesT = paddingValues;
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Function3 function3, Modifier modifier, Function2 function2, long j2, long j3, float f3, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final Function2 function22;
        long jN;
        long jT2;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        WindowInsets windowInsetsNr;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        float f5;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        int i12;
        Modifier modifier3;
        long j4;
        int i13;
        Composer composer2;
        final Function2 function23;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final float f6;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets3;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1044837119);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
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
                    function22 = function2;
                    i5 |= composerKN.E2(function22) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        jN = j2;
                        int i15 = composerKN.nr(jN) ? 2048 : 1024;
                        i5 |= i15;
                    } else {
                        jN = j2;
                    }
                    i5 |= i15;
                } else {
                    jN = j2;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        jT2 = j3;
                        int i16 = composerKN.nr(jT2) ? 16384 : 8192;
                        i5 |= i16;
                    } else {
                        jT2 = j3;
                    }
                    i5 |= i16;
                } else {
                    jT2 = j3;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else {
                    if ((196608 & i2) == 0) {
                        f4 = f3;
                        i5 |= composerKN.rl(f4) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i5 |= ((i3 & 128) == 0 && composerKN.p5(windowInsets)) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 != 0) {
                        if ((i2 & 100663296) == 0) {
                            i11 = i10;
                            i5 |= composerKN.p5(bottomAppBarScrollBehavior) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            function23 = function22;
                            j5 = jN;
                            j6 = jT2;
                            f6 = f4;
                            paddingValues3 = paddingValues;
                            windowInsets3 = windowInsets;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    function22 = null;
                                }
                                if ((i3 & 8) != 0) {
                                    jN = BottomAppBarDefaults.f24473n.n(composerKN, 6);
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    jT2 = ColorSchemeKt.t(jN, composerKN, (i5 >> 9) & 14);
                                    i5 &= -57345;
                                }
                                float fRl = i8 == 0 ? BottomAppBarDefaults.f24473n.rl() : f4;
                                PaddingValues paddingValuesT = i9 == 0 ? BottomAppBarDefaults.f24473n.t() : paddingValues;
                                if ((i3 & 128) == 0) {
                                    windowInsetsNr = BottomAppBarDefaults.f24473n.nr(composerKN, 6);
                                    i5 &= -29360129;
                                } else {
                                    windowInsetsNr = windowInsets;
                                }
                                bottomAppBarScrollBehavior2 = i11 == 0 ? null : bottomAppBarScrollBehavior;
                                f5 = fRl;
                                paddingValues2 = paddingValuesT;
                                windowInsets2 = windowInsetsNr;
                                i12 = -1044837119;
                                modifier3 = modifier2;
                                j4 = jN;
                                i13 = 12582912;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 128) != 0) {
                                    i5 &= -29360129;
                                }
                                paddingValues2 = paddingValues;
                                windowInsets2 = windowInsets;
                                bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                                modifier3 = modifier2;
                                f5 = f4;
                                i13 = 12582912;
                                i12 = -1044837119;
                                j4 = jN;
                            }
                            long j7 = jT2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(i12, i5, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:750)");
                            }
                            int i17 = ((i5 >> 3) & 14) | i13;
                            int i18 = i5 >> 6;
                            composer2 = composerKN;
                            t(modifier3, j4, j7, f5, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.nr(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    n(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RowScope rowScope, Composer composer3, int i19) {
                                    int i20;
                                    if ((i19 & 6) == 0) {
                                        i20 = i19 | (composer3.p5(rowScope) ? 4 : 2);
                                    } else {
                                        i20 = i19;
                                    }
                                    if ((i20 & 19) == 18 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1566394874, i20, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierRl = RowScope.rl(rowScope, companion, 1.0f, false, 2, null);
                                    Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical verticalXMQ = companion2.xMQ();
                                    Function3 function32 = function3;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer3, 54);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierRl);
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
                                    function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                                    composer3.XQ();
                                    if (function22 != null) {
                                        Modifier modifierAz = PaddingKt.az(SizeKt.nr(companion, 0.0f, 1, null), 0.0f, AppBarKt.nr, AppBarKt.f24227t, 0.0f, 9, null);
                                        Alignment alignmentHI = companion2.HI();
                                        Function2 function24 = function22;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentHI, false);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierAz);
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
                                        function24.invoke(composer3, 0);
                                        composer3.XQ();
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, i17 | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function23 = function22;
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j7;
                            f6 = f5;
                            paddingValues3 = paddingValues2;
                            windowInsets3 = windowInsets2;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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
                                    AppBarKt.nr(function3, modifier4, function23, j5, j6, f6, paddingValues3, windowInsets3, bottomAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i11 = i10;
                    if ((i5 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i14 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i3 & 128) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            f5 = fRl;
                            paddingValues2 = paddingValuesT;
                            windowInsets2 = windowInsetsNr;
                            i12 = -1044837119;
                            modifier3 = modifier2;
                            j4 = jN;
                            i13 = 12582912;
                            long j72 = jT2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i172 = ((i5 >> 3) & 14) | i13;
                            int i182 = i5 >> 6;
                            composer2 = composerKN;
                            t(modifier3, j4, j72, f5, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.nr(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    n(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RowScope rowScope, Composer composer3, int i19) {
                                    int i20;
                                    if ((i19 & 6) == 0) {
                                        i20 = i19 | (composer3.p5(rowScope) ? 4 : 2);
                                    } else {
                                        i20 = i19;
                                    }
                                    if ((i20 & 19) == 18 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1566394874, i20, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierRl = RowScope.rl(rowScope, companion, 1.0f, false, 2, null);
                                    Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical verticalXMQ = companion2.xMQ();
                                    Function3 function32 = function3;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer3, 54);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierRl);
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
                                    function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                                    composer3.XQ();
                                    if (function22 != null) {
                                        Modifier modifierAz = PaddingKt.az(SizeKt.nr(companion, 0.0f, 1, null), 0.0f, AppBarKt.nr, AppBarKt.f24227t, 0.0f, 9, null);
                                        Alignment alignmentHI = companion2.HI();
                                        Function2 function24 = function22;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentHI, false);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierAz);
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
                                        function24.invoke(composer3, 0);
                                        composer3.XQ();
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, i172 | (i182 & 112) | (i182 & 896) | (i182 & 7168) | (57344 & i182) | (458752 & i182) | (i182 & 3670016), 0);
                            if (ComposerKt.v()) {
                            }
                            function23 = function22;
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j72;
                            f6 = f5;
                            paddingValues3 = paddingValues2;
                            windowInsets3 = windowInsets2;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                f4 = f3;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function22 = function2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            f4 = f3;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function22 = function2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        f4 = f3;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void qie(Modifier modifier, final Function2 function2, final TextStyle textStyle, final boolean z2, final Function2 function22, final Function3 function3, final float f3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Modifier modifierKN;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-342194911);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i5 |= composerKN.p5(textStyle) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.E2(function22) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function3) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.rl(f3) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) == 0) {
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerKN.p5(windowInsets) ? 8388608 : 4194304;
                            }
                            if ((i3 & 256) == 0) {
                                i5 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i5 |= composerKN.p5(topAppBarColors) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i3 & 512) == 0) {
                                i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.p5(topAppBarScrollBehavior) ? 536870912 : 268435456;
                            }
                            if ((306783379 & i5) == 306783378 || !composerKN.xMQ()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-342194911, i5, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
                                }
                                if (!Float.isNaN(f3)) {
                                    if (!(f3 == Float.POSITIVE_INFINITY)) {
                                        final float fCoerceAtLeast = RangesKt.coerceAtLeast(((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f3), 0.0f);
                                        int i8 = i5 & 1879048192;
                                        boolean zRl = (i8 == 536870912) | composerKN.rl(fCoerceAtLeast);
                                        Object objIF = composerKN.iF();
                                        if (zRl || objIF == Composer.INSTANCE.n()) {
                                            objIF = new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2$1
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
                                                    TopAppBarState state;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state.nr()), -fCoerceAtLeast)) {
                                                        return;
                                                    }
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                    TopAppBarState state2 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                    if (state2 == null) {
                                                        return;
                                                    }
                                                    state2.KN(-fCoerceAtLeast);
                                                }
                                            };
                                            composerKN.o(objIF);
                                        }
                                        EffectsKt.KN((Function0) objIF, composerKN, 0);
                                        boolean z3 = i8 == 536870912;
                                        Object objIF2 = composerKN.iF();
                                        if (z3 || objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = SnapshotStateKt.O(new Function0<Float>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Float invoke() {
                                                    TopAppBarState state;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    return Float.valueOf(((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state.O()) > 0.01f ? 1.0f : 0.0f);
                                                }
                                            });
                                            composerKN.o(objIF2);
                                        }
                                        State stateN = SingleValueAnimationKt.n(topAppBarColors.n(ty((State) objIF2)), AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null), null, null, composerKN, 48, 12);
                                        ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(1370231018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i9) {
                                                if ((i9 & 3) == 2 && composer3.xMQ()) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1370231018, i9, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                                                }
                                                Arrangement.Horizontal horizontalT = Arrangement.f17400n.t();
                                                Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                                Function3 function32 = function3;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalT, verticalXMQ, composer3, 54);
                                                int iN = ComposablesKt.n(composer3, 0);
                                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                                Modifier modifierO = ComposedModifierKt.O(composer3, companion);
                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                Function0 function0N = companion2.n();
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
                                                Updater.O(composerN, measurePolicyRl, companion2.t());
                                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                                Function2 function2Rl = companion2.rl();
                                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                    composerN.o(Integer.valueOf(iN));
                                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                                }
                                                Updater.O(composerN, modifierO, companion2.nr());
                                                function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                                                composer3.XQ();
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                        composerKN.eF(-1193605157);
                                        if (topAppBarScrollBehavior == null || topAppBarScrollBehavior.getIsPinned()) {
                                            modifierKN = Modifier.INSTANCE;
                                        } else {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Orientation orientation = Orientation.f16969n;
                                            boolean z4 = i8 == 536870912;
                                            Object objIF3 = composerKN.iF();
                                            if (z4 || objIF3 == Composer.INSTANCE.n()) {
                                                objIF3 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                                                        n(f4.floatValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(float f4) {
                                                        TopAppBarState state = topAppBarScrollBehavior.getState();
                                                        state.Uo(state.t() + f4);
                                                    }
                                                };
                                                composerKN.o(objIF3);
                                            }
                                            DraggableState draggableStateXMQ = DraggableKt.xMQ((Function1) objIF3, composerKN, 0);
                                            boolean z5 = i8 == 536870912;
                                            Object objIF4 = composerKN.iF();
                                            if (z5 || objIF4 == Composer.INSTANCE.n()) {
                                                objIF4 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                                composerKN.o(objIF4);
                                            }
                                            modifierKN = DraggableKt.KN(companion, draggableStateXMQ, orientation, false, null, false, null, (Function3) objIF4, false, 188, null);
                                        }
                                        composerKN.Xw();
                                        SurfaceKt.n(modifier2.Zmq(modifierKN), null, az(stateN), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1943739546, true, new AppBarKt$SingleRowTopAppBar$3(windowInsets, f3, topAppBarScrollBehavior, topAppBarColors, function2, textStyle, z2, function22, composableLambdaNr), composerKN, 54), composerKN, 12582912, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                        composer2 = composerKN;
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }
                                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                            }
                            composerKN.wTp();
                            composer2 = composerKN;
                            final Modifier modifier3 = modifier2;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
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
                                        AppBarKt.qie(modifier3, function2, textStyle, z2, function22, function3, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 12582912;
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if ((306783379 & i5) == 306783378) {
                            if (i7 != 0) {
                            }
                            if (ComposerKt.v()) {
                            }
                            if (!Float.isNaN(f3)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
                        }
                        final Modifier modifier32 = modifier2;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if ((306783379 & i5) == 306783378) {
                    }
                    final Modifier modifier322 = modifier2;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                final Modifier modifier3222 = modifier2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            final Modifier modifier32222 = modifier2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        final Modifier modifier322222 = modifier2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function3 function3, Modifier modifier, Function2 function2, long j2, long j3, float f3, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, final int i2, final int i3) {
        Function3 function32;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function22;
        long jN;
        long jT2;
        int i8;
        float fRl;
        int i9;
        WindowInsets windowInsetsNr;
        PaddingValues paddingValues2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function23;
        final long j4;
        final long j5;
        final float f4;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(2141738945);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function32 = function3;
        } else {
            function32 = function3;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function32) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
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
                    function22 = function2;
                    i5 |= composerKN.E2(function22) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        jN = j2;
                        int i11 = composerKN.nr(jN) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        jN = j2;
                    }
                    i5 |= i11;
                } else {
                    jN = j2;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        jT2 = j3;
                        int i12 = composerKN.nr(jT2) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        jT2 = j3;
                    }
                    i5 |= i12;
                } else {
                    jT2 = j3;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        fRl = f3;
                        i5 |= composerKN.rl(fRl) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.p5(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) == 0) {
                        i5 |= ((i3 & 128) == 0 && composerKN.p5(windowInsets)) ? 8388608 : 4194304;
                    }
                    if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                function22 = null;
                            }
                            if ((i3 & 8) != 0) {
                                jN = BottomAppBarDefaults.f24473n.n(composerKN, 6);
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                jT2 = ColorSchemeKt.t(jN, composerKN, (i5 >> 9) & 14);
                                i5 &= -57345;
                            }
                            if (i8 != 0) {
                                fRl = BottomAppBarDefaults.f24473n.rl();
                            }
                            PaddingValues paddingValuesT = i9 == 0 ? BottomAppBarDefaults.f24473n.t() : paddingValues;
                            if ((i3 & 128) == 0) {
                                i5 &= -29360129;
                                paddingValues2 = paddingValuesT;
                                modifier3 = modifier2;
                                windowInsetsNr = BottomAppBarDefaults.f24473n.nr(composerKN, 6);
                                long j6 = jN;
                                long j7 = jT2;
                                float f5 = fRl;
                                Function2 function24 = function22;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(2141738945, i5, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:684)");
                                }
                                composer2 = composerKN;
                                nr(function32, modifier3, function24, j6, j7, f5, paddingValues2, windowInsetsNr, null, composer2, (i5 & 14) | 100663296 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                                function23 = function24;
                                j4 = j6;
                                j5 = j7;
                                f4 = f5;
                                paddingValues3 = paddingValues2;
                                windowInsets2 = windowInsetsNr;
                            } else {
                                windowInsetsNr = windowInsets;
                                paddingValues2 = paddingValuesT;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            paddingValues2 = paddingValues;
                            windowInsetsNr = windowInsets;
                        }
                        modifier3 = modifier2;
                        long j62 = jN;
                        long j72 = jT2;
                        float f53 = fRl;
                        Function2 function242 = function22;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        nr(function32, modifier3, function242, j62, j72, f53, paddingValues2, windowInsetsNr, null, composer2, (i5 & 14) | 100663296 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
                        if (ComposerKt.v()) {
                        }
                        modifier4 = modifier3;
                        function23 = function242;
                        j4 = j62;
                        j5 = j72;
                        f4 = f53;
                        paddingValues3 = paddingValues2;
                        windowInsets2 = windowInsetsNr;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        function23 = function22;
                        j4 = jN;
                        j5 = jT2;
                        f4 = fRl;
                        paddingValues3 = paddingValues;
                        windowInsets2 = windowInsets;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                AppBarKt.rl(function3, modifier4, function23, j4, j5, f4, paddingValues3, windowInsets2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                fRl = f3;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i5 & 4793491) == 4793490) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function22 = function2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            fRl = f3;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function22 = function2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        fRl = f3;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, long j2, long j3, float f3, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jN;
        long jT2;
        float fRl;
        int i7;
        PaddingValues paddingValuesT;
        int i8;
        WindowInsets windowInsetsNr;
        final WindowInsets windowInsets2;
        final PaddingValues paddingValues2;
        long j4;
        int i9;
        int i10;
        long j5;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        float f4;
        int i11;
        int i12;
        int i13;
        Modifier modifierKN;
        boolean z2;
        Object objIF;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final WindowInsets windowInsets3;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        final long j6;
        final long j7;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(422438773);
        int i14 = i3 & 1;
        if (i14 != 0) {
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
                jN = j2;
                int i15 = composerKN.nr(jN) ? 32 : 16;
                i5 |= i15;
            } else {
                jN = j2;
            }
            i5 |= i15;
        } else {
            jN = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                jT2 = j3;
                int i16 = composerKN.nr(jT2) ? 256 : 128;
                i5 |= i16;
            } else {
                jT2 = j3;
            }
            i5 |= i16;
        } else {
            jT2 = j3;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                fRl = f3;
                i5 |= composerKN.rl(fRl) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    paddingValuesT = paddingValues;
                    i5 |= composerKN.p5(paddingValuesT) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i5 |= ((i3 & 32) == 0 && composerKN.p5(windowInsets)) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.p5(bottomAppBarScrollBehavior) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                }
                if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
                    composerKN.wTp();
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                    composer2 = composerKN;
                    modifier3 = modifier2;
                    j6 = jN;
                    j7 = jT2;
                    f5 = fRl;
                    paddingValues3 = paddingValuesT;
                    windowInsets3 = windowInsets;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 2) != 0) {
                            jN = BottomAppBarDefaults.f24473n.n(composerKN, 6);
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            jT2 = ColorSchemeKt.t(jN, composerKN, (i5 >> 3) & 14);
                            i5 &= -897;
                        }
                        if (i17 != 0) {
                            fRl = BottomAppBarDefaults.f24473n.rl();
                        }
                        if (i7 != 0) {
                            paddingValuesT = BottomAppBarDefaults.f24473n.t();
                        }
                        if ((i3 & 32) == 0) {
                            windowInsetsNr = BottomAppBarDefaults.f24473n.nr(composerKN, 6);
                            i5 &= -458753;
                        } else {
                            windowInsetsNr = windowInsets;
                        }
                        if (i8 == 0) {
                            int i18 = i5;
                            windowInsets2 = windowInsetsNr;
                            paddingValues2 = paddingValuesT;
                            j4 = jN;
                            i9 = i18;
                            i10 = 12582912;
                            j5 = jT2;
                            f4 = fRl;
                            bottomAppBarScrollBehavior2 = null;
                        } else {
                            int i19 = i5;
                            windowInsets2 = windowInsetsNr;
                            paddingValues2 = paddingValuesT;
                            j4 = jN;
                            i9 = i19;
                            i10 = 12582912;
                            j5 = jT2;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                            f4 = fRl;
                        }
                        i11 = 422438773;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        i10 = 12582912;
                        j5 = jT2;
                        f4 = fRl;
                        paddingValues2 = paddingValuesT;
                        i11 = 422438773;
                        j4 = jN;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        i9 = i5;
                        windowInsets2 = windowInsets;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(i11, i9, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                    }
                    composerKN.eF(1393560009);
                    if (bottomAppBarScrollBehavior2 != null || bottomAppBarScrollBehavior2.getIsPinned()) {
                        i12 = 3670016;
                        i13 = i10;
                        modifierKN = Modifier.INSTANCE;
                    } else {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Orientation orientation = Orientation.f16969n;
                        int i20 = i9 & 3670016;
                        i12 = 3670016;
                        boolean z3 = i20 == 1048576;
                        i13 = i10;
                        Object objIF2 = composerKN.iF();
                        if (z3 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f6) {
                                    n(f6.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(float f6) {
                                    BottomAppBarState state = bottomAppBarScrollBehavior2.getState();
                                    state.J2(state.rl() - f6);
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        DraggableState draggableStateXMQ = DraggableKt.xMQ((Function1) objIF2, composerKN, 0);
                        boolean z4 = i20 == 1048576;
                        Object objIF3 = composerKN.iF();
                        if (z4 || objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                            composerKN.o(objIF3);
                        }
                        modifierKN = DraggableKt.KN(companion, draggableStateXMQ, orientation, false, null, false, null, (Function3) objIF3, false, 188, null);
                    }
                    composerKN.Xw();
                    Shape shapeO = ShapesKt.O(BottomAppBarTokens.f29401n.t(), composerKN, 6);
                    z2 = (i9 & i12) == 1048576;
                    objIF = composerKN.iF();
                    if (!z2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return n(measureScope, measurable, constraints.getValue());
                            }

                            public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j9) {
                                BottomAppBarState state;
                                BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                                BottomAppBarState state2 = bottomAppBarScrollBehavior4 != null ? bottomAppBarScrollBehavior4.getState() : null;
                                if (state2 != null) {
                                    state2.Uo(-measureScope.l(BottomAppBarTokens.f29401n.rl()));
                                }
                                final Placeable placeableDR0 = measurable.dR0(j9);
                                float height = placeableDR0.getHeight();
                                BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = bottomAppBarScrollBehavior2;
                                return MeasureScope.ER(measureScope, placeableDR0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.rl())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        n(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    int i21 = i9 << 3;
                    composer2 = composerKN;
                    SurfaceKt.n(LayoutModifierKt.n(modifier2, (Function3) objIF).Zmq(modifierKN), shapeO, j4, j5, f4, 0.0f, null, ComposableLambdaKt.nr(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                                ComposerKt.p5(1243053520, i22, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                            }
                            Modifier modifierKN2 = PaddingKt.KN(SizeKt.xMQ(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsets2), BottomAppBarTokens.f29401n.rl()), paddingValues2);
                            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                            Function3 function32 = function3;
                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer3, 54);
                            int iN = ComposablesKt.n(composer3, 0);
                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
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
                            Updater.O(composerN, measurePolicyRl, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            Function2 function2Rl = companion2.rl();
                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion2.nr());
                            function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                            composer3.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, (i21 & 896) | i13 | (i21 & 7168) | (i21 & 57344), 96);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    paddingValues3 = paddingValues2;
                    modifier3 = modifier2;
                    windowInsets3 = windowInsets2;
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                    j6 = j4;
                    j7 = j5;
                    f5 = f4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$7
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
                            AppBarKt.t(modifier3, j6, j7, f5, paddingValues3, windowInsets3, bottomAppBarScrollBehavior3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            paddingValuesT = paddingValues;
            if ((i2 & 196608) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    i11 = 422438773;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    composerKN.eF(1393560009);
                    if (bottomAppBarScrollBehavior2 != null) {
                        i12 = 3670016;
                        i13 = i10;
                        modifierKN = Modifier.INSTANCE;
                        composerKN.Xw();
                        Shape shapeO2 = ShapesKt.O(BottomAppBarTokens.f29401n.t(), composerKN, 6);
                        if ((i9 & i12) == 1048576) {
                        }
                        objIF = composerKN.iF();
                        if (!z2) {
                            objIF = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return n(measureScope, measurable, constraints.getValue());
                                }

                                public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j9) {
                                    BottomAppBarState state;
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                                    BottomAppBarState state2 = bottomAppBarScrollBehavior4 != null ? bottomAppBarScrollBehavior4.getState() : null;
                                    if (state2 != null) {
                                        state2.Uo(-measureScope.l(BottomAppBarTokens.f29401n.rl()));
                                    }
                                    final Placeable placeableDR0 = measurable.dR0(j9);
                                    float height = placeableDR0.getHeight();
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = bottomAppBarScrollBehavior2;
                                    return MeasureScope.ER(measureScope, placeableDR0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.rl())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            n(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Placeable.PlacementScope placementScope) {
                                            Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerKN.o(objIF);
                            int i212 = i9 << 3;
                            composer2 = composerKN;
                            SurfaceKt.n(LayoutModifierKt.n(modifier2, (Function3) objIF).Zmq(modifierKN), shapeO2, j4, j5, f4, 0.0f, null, ComposableLambdaKt.nr(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                                        ComposerKt.p5(1243053520, i22, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                                    }
                                    Modifier modifierKN2 = PaddingKt.KN(SizeKt.xMQ(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsets2), BottomAppBarTokens.f29401n.rl()), paddingValues2);
                                    Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
                                    Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                    Function3 function32 = function3;
                                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer3, 54);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion2.n();
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
                                    Updater.O(composerN, measurePolicyRl, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, (i212 & 896) | i13 | (i212 & 7168) | (i212 & 57344), 96);
                            if (ComposerKt.v()) {
                            }
                            paddingValues3 = paddingValues2;
                            modifier3 = modifier2;
                            windowInsets3 = windowInsets2;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                            j6 = j4;
                            j7 = j5;
                            f5 = f4;
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        fRl = f3;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        paddingValuesT = paddingValues;
        if ((i2 & 196608) == 0) {
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

    public static final float te() {
        return rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void xMQ(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f3, float f4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i2, final int i3) {
        Function2 function23;
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2Uo;
        int i8;
        Function3 function3KN;
        int i9;
        float fJ2;
        int i10;
        float fUo;
        int i11;
        int i12;
        WindowInsets windowInsetsGh;
        int i13;
        TopAppBarColors topAppBarColorsQie;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        Function2 function24;
        Function3 function32;
        float f5;
        Modifier modifier3;
        int i14;
        Composer composer2;
        final float f6;
        final float f7;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets3;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-630005584);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function23) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
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
                    function2Uo = function22;
                    i5 |= composerKN.E2(function2Uo) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function3KN = function3;
                        i5 |= composerKN.E2(function3KN) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            fJ2 = f3;
                            i5 |= composerKN.rl(fJ2) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else {
                            if ((196608 & i2) == 0) {
                                fUo = f4;
                                i5 |= composerKN.rl(fUo) ? 131072 : 65536;
                            }
                            if ((i2 & 1572864) == 0) {
                                i5 |= ((i3 & 64) == 0 && composerKN.p5(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i2 & 12582912) == 0) {
                                i5 |= ((i3 & 128) == 0 && composerKN.p5(topAppBarColors)) ? 8388608 : 4194304;
                            }
                            i11 = i3 & 256;
                            if (i11 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    i12 = i11;
                                    i5 |= composerKN.p5(topAppBarScrollBehavior) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                int i16 = i5;
                                if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    windowInsets3 = windowInsets;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    composer2 = composerKN;
                                    modifier4 = modifier2;
                                    function25 = function2Uo;
                                    function33 = function3KN;
                                    f6 = fJ2;
                                    f7 = fUo;
                                    topAppBarColors3 = topAppBarColors;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        if (i15 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            function2Uo = ComposableSingletons$AppBarKt.f25044n.Uo();
                                        }
                                        if (i8 != 0) {
                                            function3KN = ComposableSingletons$AppBarKt.f25044n.KN();
                                        }
                                        if (i9 != 0) {
                                            fJ2 = TopAppBarDefaults.f28845n.J2();
                                        }
                                        if (i10 != 0) {
                                            fUo = TopAppBarDefaults.f28845n.Uo();
                                        }
                                        if ((i3 & 64) == 0) {
                                            windowInsetsGh = TopAppBarDefaults.f28845n.gh(composerKN, 6);
                                            i13 = i16 & (-3670017);
                                        } else {
                                            windowInsetsGh = windowInsets;
                                            i13 = i16;
                                        }
                                        if ((i3 & 128) == 0) {
                                            topAppBarColorsQie = TopAppBarDefaults.f28845n.qie(composerKN, 6);
                                            i13 &= -29360129;
                                        } else {
                                            topAppBarColorsQie = topAppBarColors;
                                        }
                                        if (i12 == 0) {
                                            windowInsets2 = windowInsetsGh;
                                            topAppBarColors2 = topAppBarColorsQie;
                                            function24 = function2Uo;
                                            topAppBarScrollBehavior2 = null;
                                        } else {
                                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            windowInsets2 = windowInsetsGh;
                                            topAppBarColors2 = topAppBarColorsQie;
                                            function24 = function2Uo;
                                        }
                                        function32 = function3KN;
                                        f5 = fJ2;
                                        modifier3 = modifier2;
                                        i14 = i13;
                                    } else {
                                        composerKN.wTp();
                                        int i17 = (i3 & 64) != 0 ? i16 & (-3670017) : i16;
                                        if ((i3 & 128) != 0) {
                                            i17 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i14 = i17;
                                        f5 = fJ2;
                                        modifier3 = modifier5;
                                        windowInsets2 = windowInsets;
                                        topAppBarColors2 = topAppBarColors;
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        function24 = function2Uo;
                                        function32 = function3KN;
                                    }
                                    float f8 = fUo;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-630005584, i14, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
                                    }
                                    TextStyle textStyleT = TypographyKt.t(TopAppBarLargeTokens.f29974n.nr(), composerKN, 6);
                                    TextStyle textStyleT2 = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                    float f9 = Uo;
                                    Dp.Companion companion = Dp.INSTANCE;
                                    int i18 = i14 << 12;
                                    composer2 = composerKN;
                                    r(modifier3, function23, textStyleT, f9, function2, textStyleT2, function24, function32, (!Dp.mUb(f5, companion.t()) || Dp.mUb(f5, companion.rl())) ? TopAppBarDefaults.f28845n.J2() : f5, (!Dp.mUb(f8, companion.t()) || Dp.mUb(f8, companion.rl())) ? TopAppBarDefaults.f28845n.Uo() : f8, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i18) | (3670016 & i18) | (i18 & 29360128), (i14 >> 18) & 1022, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    f6 = f5;
                                    f7 = f8;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$LargeTopAppBar$2
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
                                            AppBarKt.xMQ(function2, modifier4, function25, function33, f6, f7, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 100663296;
                            i12 = i11;
                            int i162 = i5;
                            if ((i5 & 38347923) == 38347922) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i15 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if ((i3 & 64) == 0) {
                                    }
                                    if ((i3 & 128) == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    function32 = function3KN;
                                    f5 = fJ2;
                                    modifier3 = modifier2;
                                    i14 = i13;
                                    float f82 = fUo;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    TextStyle textStyleT3 = TypographyKt.t(TopAppBarLargeTokens.f29974n.nr(), composerKN, 6);
                                    TextStyle textStyleT22 = TypographyKt.t(TopAppBarSmallTokens.f29983n.nr(), composerKN, 6);
                                    float f92 = Uo;
                                    Dp.Companion companion2 = Dp.INSTANCE;
                                    if (Dp.mUb(f5, companion2.t())) {
                                        if (Dp.mUb(f82, companion2.t())) {
                                            int i182 = i14 << 12;
                                            composer2 = composerKN;
                                            r(modifier3, function23, textStyleT3, f92, function2, textStyleT22, function24, function32, (!Dp.mUb(f5, companion2.t()) || Dp.mUb(f5, companion2.rl())) ? TopAppBarDefaults.f28845n.J2() : f5, (!Dp.mUb(f82, companion2.t()) || Dp.mUb(f82, companion2.rl())) ? TopAppBarDefaults.f28845n.Uo() : f82, windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i14 >> 3) & 14) | 3072 | ((i14 << 3) & 112) | (57344 & i182) | (3670016 & i182) | (i182 & 29360128), (i14 >> 18) & 1022, 0);
                                            if (ComposerKt.v()) {
                                            }
                                            f6 = f5;
                                            f7 = f82;
                                            modifier4 = modifier3;
                                            function25 = function24;
                                            function33 = function32;
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors3 = topAppBarColors2;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        fUo = f4;
                        if ((i2 & 1572864) == 0) {
                        }
                        if ((i2 & 12582912) == 0) {
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        int i1622 = i5;
                        if ((i5 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    fJ2 = f3;
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    fUo = f4;
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    int i16222 = i5;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3KN = function3;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                fJ2 = f3;
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                fUo = f4;
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                int i162222 = i5;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function2Uo = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function3KN = function3;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            fJ2 = f3;
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            fUo = f4;
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            int i1622222 = i5;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function2Uo = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function3KN = function3;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        fJ2 = f3;
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        fUo = f4;
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        int i16222222 = i5;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final long az(State state) {
        return ((Color) state.getValue()).getValue();
    }

    private static final float ty(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
