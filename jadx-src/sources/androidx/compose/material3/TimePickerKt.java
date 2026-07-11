package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import GJW.yg;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TimePickerSelectionMode;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a6\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0018\u001a\u00020\b*\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b!\u0010 \u001a\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\"\u0010 \u001a'\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001a'\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b%\u0010$\u001a?\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0003¢\u0006\u0004\b+\u0010,\u001aS\u00106\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0/2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b01¢\u0006\u0002\b3¢\u0006\u0002\b4H\u0003¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b8\u00109\u001a:\u0010>\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a'\u0010@\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b@\u0010A\u001a#\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010C\u001a/\u0010D\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\bD\u0010E\u001a]\u0010L\u001a\u00020\b2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010;\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020:2!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110F¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\b01H\u0002ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001ab\u0010S\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020F2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b012\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010P\u001a\u00020O2\b\b\u0002\u0010R\u001a\u00020Q2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a7\u0010W\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020U2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\b0/¢\u0006\u0002\b3H\u0003ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a*\u0010\\\u001a\u00020[2\u0006\u0010=\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020:H\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a/\u0010b\u001a\u00020\r2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\r2\u0006\u0010`\u001a\u00020:2\u0006\u0010a\u001a\u00020:H\u0002¢\u0006\u0004\bb\u0010c\u001a\u001f\u0010d\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\bd\u0010e\u001a\u001b\u0010g\u001a\u00020\u0002*\u00020\u00022\u0006\u0010f\u001a\u00020\u0016H\u0003¢\u0006\u0004\bg\u0010h\"\u0014\u0010j\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010i\"\u0014\u0010k\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010i\"\u0014\u0010l\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010i\"\u0014\u0010m\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010i\"\u0014\u0010o\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010i\"\u0014\u0010q\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010i\"\u0014\u0010s\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010i\"\u0014\u0010u\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010i\"\u0014\u0010v\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010i\"\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010x\"\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010x\"\u0014\u0010{\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010x\"\u0014\u0010|\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010i\"\u0018\u0010\u007f\u001a\u00020:*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\"\u001c\u0010\u0083\u0001\u001a\u00030\u0080\u0001*\u00020\u00158@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0089\u0001²\u0006\r\u0010\u0084\u0001\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0085\u0001\u001a\u00020F8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0086\u0001\u001a\u00020F8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0012\u001a\u00030\u0087\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0088\u0001\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "", "Z", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "ty", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "x", "y", "maxDist", "Landroidx/compose/ui/unit/IntOffset;", TtmlNode.CENTER, "m", "(Landroidx/compose/material3/TimePickerState;FFFJ)V", "Landroidx/compose/material3/AnalogTimePickerState;", "", "autoSwitchToMinute", "xg", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "qie", "HI", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "mUb", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ViF", "rl", "gh", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "nY", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/graphics/Shape;", "startShape", "endShape", "az", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "aYN", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "xMQ", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "value", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "WPU", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "t", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "z", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;", "nr", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "max", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "onNewValue", "pJg", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "XQ", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "radius", c.f62177j, "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "is24Hour", "number", "", "eTf", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "x1", "y1", "x2", "y2", "dR0", "(FFII)F", "k", "(FF)F", "visible", "ofS", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "F", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "ClockFaceBottomMargin", "O", "DisplaySeparatorWidth", "J2", "SupportLabelTop", "Uo", "TimeInputBottomPadding", "KN", "MaxDistance", "MinimumInteractiveSize", "Landroidx/collection/IntList;", "Landroidx/collection/IntList;", "Minutes", "Hours", "ExtraHours", "PeriodToggleMargin", "piY", "(Landroidx/compose/material3/TimePickerState;)I", "hourForDisplay", "Landroidx/compose/ui/unit/DpOffset;", "ijL", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "selectorPos", "a11yServicesEnabled", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "parentCenter", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 15 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 16 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 18 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,2008:1\n1223#2,6:2009\n1223#2,6:2015\n1223#2,6:2110\n1223#2,6:2116\n1223#2,6:2364\n1223#2,6:2370\n1223#2,6:2377\n1223#2,6:2411\n1223#2,6:2417\n1223#2,6:2426\n1223#2,6:2475\n1223#2,6:2481\n1223#2,6:2489\n1223#2,6:2495\n1223#2,3:2506\n1226#2,3:2512\n1223#2,6:2516\n1223#2,6:2522\n1223#2,6:2563\n1223#2,6:2573\n1223#2,6:2579\n1223#2,6:2659\n1223#2,6:2676\n1223#2,6:2682\n71#3:2021\n56#3:2022\n50#3:2023\n83#3:2024\n71#3:2025\n50#3:2026\n83#3:2027\n71#3:2028\n50#3:2029\n85#4:2030\n82#4,6:2031\n88#4:2065\n92#4:2069\n85#4:2202\n81#4,7:2203\n88#4:2238\n92#4:2282\n85#4:2585\n82#4,6:2586\n88#4:2620\n92#4:2675\n78#5,6:2037\n85#5,4:2052\n89#5,2:2062\n93#5:2068\n78#5,6:2077\n85#5,4:2092\n89#5,2:2102\n93#5:2108\n78#5,6:2129\n85#5,4:2144\n89#5,2:2154\n78#5,6:2165\n85#5,4:2180\n89#5,2:2190\n93#5:2196\n93#5:2200\n78#5,6:2210\n85#5,4:2225\n89#5,2:2235\n78#5,6:2246\n85#5,4:2261\n89#5,2:2271\n93#5:2277\n93#5:2281\n78#5,6:2291\n85#5,4:2306\n89#5,2:2316\n78#5,6:2327\n85#5,4:2342\n89#5,2:2352\n93#5:2358\n93#5:2362\n78#5,6:2383\n85#5,4:2398\n89#5,2:2408\n93#5:2425\n78#5,6:2440\n85#5,4:2455\n89#5,2:2465\n93#5:2471\n78#5,6:2534\n85#5,4:2549\n89#5,2:2559\n93#5:2571\n78#5,6:2592\n85#5,4:2607\n89#5,2:2617\n78#5,6:2630\n85#5,4:2645\n89#5,2:2655\n93#5:2668\n93#5:2674\n78#5,6:2688\n85#5,4:2703\n89#5,2:2713\n93#5:2718\n368#6,9:2043\n377#6:2064\n378#6,2:2066\n368#6,9:2083\n377#6:2104\n378#6,2:2106\n368#6,9:2135\n377#6:2156\n368#6,9:2171\n377#6:2192\n378#6,2:2194\n378#6,2:2198\n368#6,9:2216\n377#6:2237\n368#6,9:2252\n377#6:2273\n378#6,2:2275\n378#6,2:2279\n368#6,9:2297\n377#6:2318\n368#6,9:2333\n377#6:2354\n378#6,2:2356\n378#6,2:2360\n368#6,9:2389\n377#6:2410\n378#6,2:2423\n368#6,9:2446\n377#6:2467\n378#6,2:2469\n368#6,9:2540\n377#6:2561\n378#6,2:2569\n368#6,9:2598\n377#6:2619\n368#6,9:2636\n377#6:2657\n378#6,2:2666\n378#6,2:2672\n368#6,9:2694\n377#6,3:2715\n4032#7,6:2056\n4032#7,6:2096\n4032#7,6:2148\n4032#7,6:2184\n4032#7,6:2229\n4032#7,6:2265\n4032#7,6:2310\n4032#7,6:2346\n4032#7,6:2402\n4032#7,6:2459\n4032#7,6:2553\n4032#7,6:2611\n4032#7,6:2649\n4032#7,6:2707\n98#8:2070\n95#8,6:2071\n101#8:2105\n105#8:2109\n98#8:2122\n95#8,6:2123\n101#8:2157\n105#8:2201\n98#8:2283\n94#8,7:2284\n101#8:2319\n105#8:2363\n71#9:2158\n68#9,6:2159\n74#9:2193\n78#9:2197\n71#9:2239\n68#9,6:2240\n74#9:2274\n78#9:2278\n71#9:2320\n68#9,6:2321\n74#9:2355\n78#9:2359\n71#9:2434\n69#9,5:2435\n74#9:2468\n78#9:2472\n71#9:2528\n69#9,5:2529\n74#9:2562\n78#9:2572\n71#9:2623\n68#9,6:2624\n74#9:2658\n78#9:2669\n201#10:2376\n207#10:2473\n204#10:2474\n228#10:2621\n225#10:2622\n219#10:2670\n222#10:2671\n213#10:2719\n216#10:2720\n210#10:2721\n148#11:2432\n148#11:2736\n148#11:2737\n148#11:2738\n148#11:2739\n148#11:2740\n148#11:2741\n148#11:2742\n148#11:2743\n148#11:2744\n148#11:2751\n77#12:2433\n77#12:2487\n77#12:2665\n1#13:2488\n488#14:2501\n487#14,4:2502\n491#14,2:2509\n495#14:2515\n487#15:2511\n135#16:2722\n81#17:2723\n81#17:2724\n107#17,2:2725\n81#17:2727\n107#17,2:2728\n81#17:2730\n107#17,2:2731\n81#17:2733\n107#17,2:2734\n253#18,6:2745\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n223#1:2009,6\n576#1:2015,6\n966#1:2110,6\n970#1:2116,6\n1161#1:2364,6\n1207#1:2370,6\n1264#1:2377,6\n1275#1:2411,6\n1289#1:2417,6\n1311#1:2426,6\n1364#1:2475,6\n1368#1:2481,6\n1642#1:2489,6\n1643#1:2495,6\n1644#1:2506,3\n1644#1:2512,3\n1666#1:2516,6\n1671#1:2522,6\n1689#1:2563,6\n1763#1:2573,6\n1764#1:2579,6\n1804#1:2659,6\n1858#1:2676,6\n1872#1:2682,6\n907#1:2021\n914#1:2022\n916#1:2023\n917#1:2024\n917#1:2025\n917#1:2026\n918#1:2027\n918#1:2028\n918#1:2029\n931#1:2030\n931#1:2031,6\n931#1:2065\n931#1:2069\n1088#1:2202\n1088#1:2203,7\n1088#1:2238\n1088#1:2282\n1772#1:2585\n1772#1:2586,6\n1772#1:2620\n1772#1:2675\n931#1:2037,6\n931#1:2052,4\n931#1:2062,2\n931#1:2068\n949#1:2077,6\n949#1:2092,4\n949#1:2102,2\n949#1:2108\n973#1:2129,6\n973#1:2144,4\n973#1:2154,2\n1074#1:2165,6\n1074#1:2180,4\n1074#1:2190,2\n1074#1:2196\n973#1:2200\n1088#1:2210,6\n1088#1:2225,4\n1088#1:2235,2\n1091#1:2246,6\n1091#1:2261,4\n1091#1:2271,2\n1091#1:2277\n1088#1:2281\n1108#1:2291,6\n1108#1:2306,4\n1108#1:2316,2\n1111#1:2327,6\n1111#1:2342,4\n1111#1:2352,2\n1111#1:2358\n1108#1:2362\n1261#1:2383,6\n1261#1:2398,4\n1261#1:2408,2\n1261#1:2425\n1336#1:2440,6\n1336#1:2455,4\n1336#1:2465,2\n1336#1:2471\n1660#1:2534,6\n1660#1:2549,4\n1660#1:2559,2\n1660#1:2571\n1772#1:2592,6\n1772#1:2607,4\n1772#1:2617,2\n1797#1:2630,6\n1797#1:2645,4\n1797#1:2655,2\n1797#1:2668\n1772#1:2674\n1872#1:2688,6\n1872#1:2703,4\n1872#1:2713,2\n1872#1:2718\n931#1:2043,9\n931#1:2064\n931#1:2066,2\n949#1:2083,9\n949#1:2104\n949#1:2106,2\n973#1:2135,9\n973#1:2156\n1074#1:2171,9\n1074#1:2192\n1074#1:2194,2\n973#1:2198,2\n1088#1:2216,9\n1088#1:2237\n1091#1:2252,9\n1091#1:2273\n1091#1:2275,2\n1088#1:2279,2\n1108#1:2297,9\n1108#1:2318\n1111#1:2333,9\n1111#1:2354\n1111#1:2356,2\n1108#1:2360,2\n1261#1:2389,9\n1261#1:2410\n1261#1:2423,2\n1336#1:2446,9\n1336#1:2467\n1336#1:2469,2\n1660#1:2540,9\n1660#1:2561\n1660#1:2569,2\n1772#1:2598,9\n1772#1:2619\n1797#1:2636,9\n1797#1:2657\n1797#1:2666,2\n1772#1:2672,2\n1872#1:2694,9\n1872#1:2715,3\n931#1:2056,6\n949#1:2096,6\n973#1:2148,6\n1074#1:2184,6\n1088#1:2229,6\n1091#1:2265,6\n1108#1:2310,6\n1111#1:2346,6\n1261#1:2402,6\n1336#1:2459,6\n1660#1:2553,6\n1772#1:2611,6\n1797#1:2649,6\n1872#1:2707,6\n949#1:2070\n949#1:2071,6\n949#1:2105\n949#1:2109\n973#1:2122\n973#1:2123,6\n973#1:2157\n973#1:2201\n1108#1:2283\n1108#1:2284,7\n1108#1:2319\n1108#1:2363\n1074#1:2158\n1074#1:2159,6\n1074#1:2193\n1074#1:2197\n1091#1:2239\n1091#1:2240,6\n1091#1:2274\n1091#1:2278\n1111#1:2320\n1111#1:2321,6\n1111#1:2355\n1111#1:2359\n1336#1:2434\n1336#1:2435,5\n1336#1:2468\n1336#1:2472\n1660#1:2528\n1660#1:2529,5\n1660#1:2562\n1660#1:2572\n1797#1:2623\n1797#1:2624,6\n1797#1:2658\n1797#1:2669\n1260#1:2376\n1354#1:2473\n1356#1:2474\n1791#1:2621\n1793#1:2622\n1848#1:2670\n1850#1:2671\n1918#1:2719\n1920#1:2720\n1922#1:2721\n1312#1:2432\n1954#1:2736\n1955#1:2737\n1956#1:2738\n1957#1:2739\n1958#1:2740\n1960#1:2741\n1961#1:2742\n1962#1:2743\n1963#1:2744\n1968#1:2751\n1327#1:2433\n1641#1:2487\n1808#1:2665\n1644#1:2501\n1644#1:2502,4\n1644#1:2509,2\n1644#1:2515\n1644#1:2511\n1979#1:2722\n222#1:2723\n966#1:2724\n966#1:2725,2\n970#1:2727\n970#1:2728,2\n1642#1:2730\n1642#1:2731,2\n1643#1:2733\n1643#1:2734,2\n1967#1:2745,6\n*E\n"})
public final class TimePickerKt {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f28558O;
    private static final float Uo;
    private static final float az;
    private static final IntList gh;
    private static final float nr;
    private static final IntList qie;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28559n = Dp.KN(101);
    private static final float rl = Dp.KN(69);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f28560t = Dp.KN(36);
    private static final float J2 = Dp.KN(7);
    private static final float KN = Dp.KN(74);
    private static final float xMQ = Dp.KN(48);
    private static final IntList mUb = IntListKt.nr(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    private static final float dR0(float f3, float f4, int i2, int i3) {
        return (float) Math.hypot(i2 - f3, i3 - f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, final boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composerKN = composer.KN(1249591487);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = 2 & i3;
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= ((i3 & 4) == 0 && composerKN.p5(timePickerColors)) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                if (i7 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.f28557n.n(composerKN, 6);
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1249591487, i5, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:929)");
                }
                Modifier modifierNr = SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$1
                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }, 1, null);
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
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
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                int i8 = i5 >> 3;
                int i9 = (i5 & 14) | (i8 & 112);
                ViF(analogTimePickerState, timePickerColors, composerKN, i9);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion2, f28560t), composerKN, 6);
                t(analogTimePickerState, timePickerColors, z2, composerKN, i9 | (i8 & 896));
                SpacerKt.n(SizeKt.xMQ(companion2, nr), composerKN, 6);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                Modifier modifierNr2 = SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$1
                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }, 1, null);
                MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion3.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion3.t());
                Updater.O(composerN, compositionLocalMapIk2, companion3.O());
                function2Rl = companion3.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion3.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    int i82 = i5 >> 3;
                    int i92 = (i5 & 14) | (i82 & 112);
                    ViF(analogTimePickerState, timePickerColors, composerKN, i92);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    SpacerKt.n(SizeKt.xMQ(companion22, f28560t), composerKN, 6);
                    t(analogTimePickerState, timePickerColors, z2, composerKN, i92 | (i82 & 896));
                    SpacerKt.n(SizeKt.xMQ(companion22, nr), composerKN, 6);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                }
            }
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalTimePicker$3
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
                    TimePickerKt.g(analogTimePickerState, modifier2, timePickerColors2, z2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(float f3, float f4) {
        float fAtan2 = ((float) Math.atan2(f3, f4)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + 6.2831855f : fAtan2;
    }

    static {
        float f3 = 24;
        nr = Dp.KN(f3);
        f28558O = Dp.KN(f3);
        Uo = Dp.KN(f3);
        IntList intListNr = IntListKt.nr(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        gh = intListNr;
        MutableIntList mutableIntList = new MutableIntList(intListNr.get_size());
        int[] iArr = intListNr.content;
        int i2 = intListNr._size;
        for (int i3 = 0; i3 < i2; i3++) {
            mutableIntList.qie((iArr[i3] % 12) + 12);
        }
        qie = mutableIntList;
        az = Dp.KN(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(final Modifier modifier, final TimePickerColors timePickerColors, final TimePickerState timePickerState, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-475657989);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(timePickerColors) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i2 & 512) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-475657989, i3, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            Saver saverN = companion.n();
            int i5 = i3 & 896;
            boolean z2 = i5 == 256 || ((i3 & 512) != 0 && composerKN.E2(timePickerState));
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$hourValue$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final MutableState invoke() {
                        return SnapshotStateKt__SnapshotStateKt.O(new TextFieldValue(CalendarLocale_jvmKt.t(TimePickerKt.piY(timePickerState), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerKN.o(objIF);
            }
            final MutableState mutableStateNr = RememberSaveableKt.nr(objArr, saverN, null, (Function0) objIF, composerKN, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver saverN2 = companion.n();
            boolean z3 = i5 == 256 || ((i3 & 512) != 0 && composerKN.E2(timePickerState));
            Object objIF2 = composerKN.iF();
            if (z3 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$minuteValue$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final MutableState invoke() {
                        return SnapshotStateKt__SnapshotStateKt.O(new TextFieldValue(CalendarLocale_jvmKt.t(timePickerState.rl(), 2, 0, false, 6, null), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerKN.o(objIF2);
            }
            final MutableState mutableStateNr2 = RememberSaveableKt.nr(objArr2, saverN2, null, (Function0) objIF2, composerKN, 0, 4);
            int i7 = i3;
            Modifier modifierAz = PaddingKt.az(modifier, 0.0f, 0.0f, 0.0f, Uo, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion2.qie(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            TimeInputTokens timeInputTokens = TimeInputTokens.f29949n;
            CompositionLocalKt.t(new ProvidedValue[]{TextKt.J2().nr(TextStyle.t(TypographyKt.t(timeInputTokens.J2(), composerKN, 6), timePickerColors.KN(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744446, null)), CompositionLocalsKt.az().nr(LayoutDirection.f34160n)}, ComposableLambdaKt.nr(1306700887, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1
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
                    if ((i8 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1306700887, i8, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:987)");
                    }
                    final MutableState mutableState = mutableStateNr;
                    final TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    final MutableState mutableState2 = mutableStateNr2;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer2, 0);
                    int iN2 = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composer2, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion5.n();
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
                    Updater.O(composerN2, measurePolicyRl2, companion5.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                    Function2 function2Rl2 = companion5.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion5.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    boolean zP5 = composer2.p5(mutableState) | composer2.E2(timePickerState2);
                    Object objIF3 = composer2.iF();
                    if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return n(keyEvent.getNativeKeyEvent());
                            }

                            public final Boolean n(android.view.KeyEvent keyEvent) {
                                int iT = KeyEvent_androidKt.t(keyEvent);
                                if (48 <= iT && iT < 58 && TextRange.ty(TimePickerKt.Ik(mutableState).getSelection()) == 2 && TimePickerKt.Ik(mutableState).xMQ().length() == 2) {
                                    timePickerState2.O(TimePickerSelectionMode.INSTANCE.rl());
                                }
                                return Boolean.FALSE;
                            }
                        };
                        composer2.o(objIF3);
                    }
                    Modifier modifierN = KeyInputModifierKt.n(companion4, (Function1) objIF3);
                    TextFieldValue textFieldValueIk = TimePickerKt.Ik(mutableState);
                    boolean zE2 = composer2.E2(timePickerState2) | composer2.p5(mutableState);
                    Object objIF4 = composer2.iF();
                    if (zE2 || objIF4 == Composer.INSTANCE.n()) {
                        objIF4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                n(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            public final void n(TextFieldValue textFieldValue) {
                                int iN3 = TimePickerSelectionMode.INSTANCE.n();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueIk2 = TimePickerKt.Ik(mutableState);
                                int i9 = timePickerState2.getIs24hour() ? 23 : 12;
                                final MutableState mutableState3 = mutableState;
                                TimePickerKt.pJg(iN3, timePickerState3, textFieldValue, textFieldValueIk2, i9, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$2$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        n(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TextFieldValue textFieldValue2) {
                                        TimePickerKt.r(mutableState3, textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.o(objIF4);
                    }
                    Function1 function1 = (Function1) objIF4;
                    TimePickerSelectionMode.Companion companion6 = TimePickerSelectionMode.INSTANCE;
                    int iN3 = companion6.n();
                    ImeAction.Companion companion7 = ImeAction.INSTANCE;
                    int iNr = companion7.nr();
                    KeyboardType.Companion companion8 = KeyboardType.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, companion8.nr(), iNr, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                    boolean zE22 = composer2.E2(timePickerState2);
                    Object objIF5 = composer2.iF();
                    if (zE22 || objIF5 == Composer.INSTANCE.n()) {
                        objIF5 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                n(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.O(TimePickerSelectionMode.INSTANCE.rl());
                            }
                        };
                        composer2.o(objIF5);
                    }
                    TimePickerKt.XQ(modifierN, textFieldValueIk, function1, timePickerState2, iN3, keyboardOptions, new KeyboardActions(null, null, (Function1) objIF5, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    TimePickerKt.xMQ(SizeKt.S(companion4, TimePickerKt.f28558O, TimeInputTokens.f29949n.n()), composer2, 6);
                    boolean zP52 = composer2.p5(mutableState2) | composer2.E2(timePickerState2);
                    Object objIF6 = composer2.iF();
                    if (zP52 || objIF6 == Composer.INSTANCE.n()) {
                        objIF6 = new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return n(keyEvent.getNativeKeyEvent());
                            }

                            public final Boolean n(android.view.KeyEvent keyEvent) {
                                boolean z4;
                                if (KeyEvent_androidKt.t(keyEvent) == 0 && TextRange.ty(TimePickerKt.o(mutableState2).getSelection()) == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    timePickerState2.O(TimePickerSelectionMode.INSTANCE.n());
                                }
                                return Boolean.valueOf(z4);
                            }
                        };
                        composer2.o(objIF6);
                    }
                    Modifier modifierRl = KeyInputModifierKt.rl(companion4, (Function1) objIF6);
                    TextFieldValue textFieldValueO = TimePickerKt.o(mutableState2);
                    boolean zE23 = composer2.E2(timePickerState2) | composer2.p5(mutableState2);
                    Object objIF7 = composer2.iF();
                    if (zE23 || objIF7 == Composer.INSTANCE.n()) {
                        objIF7 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                n(textFieldValue);
                                return Unit.INSTANCE;
                            }

                            public final void n(TextFieldValue textFieldValue) {
                                int iRl = TimePickerSelectionMode.INSTANCE.rl();
                                TimePickerState timePickerState3 = timePickerState2;
                                TextFieldValue textFieldValueO2 = TimePickerKt.o(mutableState2);
                                final MutableState mutableState3 = mutableState2;
                                TimePickerKt.pJg(iRl, timePickerState3, textFieldValue, textFieldValueO2, 59, new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$5$1.1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        n(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TextFieldValue textFieldValue2) {
                                        TimePickerKt.ck(mutableState3, textFieldValue2);
                                    }
                                });
                            }
                        };
                        composer2.o(objIF7);
                    }
                    Function1 function12 = (Function1) objIF7;
                    int iRl = companion6.rl();
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, companion8.nr(), companion7.rl(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                    boolean zE24 = composer2.E2(timePickerState2);
                    Object objIF8 = composer2.iF();
                    if (zE24 || objIF8 == Composer.INSTANCE.n()) {
                        objIF8 = new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$1$1$1$6$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                n(keyboardActionScope);
                                return Unit.INSTANCE;
                            }

                            public final void n(KeyboardActionScope keyboardActionScope) {
                                timePickerState2.O(TimePickerSelectionMode.INSTANCE.rl());
                            }
                        };
                        composer2.o(objIF8);
                    }
                    TimePickerKt.XQ(modifierRl, textFieldValueO, function12, timePickerState2, iRl, keyboardOptions2, new KeyboardActions(null, null, (Function1) objIF8, null, null, null, 59, null), timePickerColors2, composer2, 24576, 0);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            composerKN.eF(511443242);
            if (!timePickerState.getIs24hour()) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierAz2 = PaddingKt.az(companion4, az, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz2);
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
                nY(SizeKt.S(companion4, timeInputTokens.rl(), timeInputTokens.n()), timePickerState, timePickerColors, composerKN, ((i7 >> 3) & 112) | 6 | ((i7 << 3) & 896));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInputImpl$2
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
                    TimePickerKt.HI(modifier, timePickerColors, timePickerState, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(2054675515);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2054675515, i3, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, companion2.qie(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            rl(timePickerState, timePickerColors, composerKN, i3 & 126);
            composerKN.eF(-709485014);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierAz = PaddingKt.az(companion, az, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz);
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
                TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
                int i5 = i3 << 3;
                nY(SizeKt.S(companion, timePickerTokens.Z(), timePickerTokens.o()), timePickerState, timePickerColors, composerKN, 6 | (i5 & 112) | (i5 & 896));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalClockDisplay$2
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
                    TimePickerKt.ViF(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WPU(final Modifier modifier, final int i2, final TimePickerState timePickerState, final int i3, final TimePickerColors timePickerColors, Composer composer, final int i5) {
        int i7;
        int i8;
        int iN;
        Composer composer2;
        Composer composerKN = composer.KN(-1148055889);
        if ((i5 & 6) == 0) {
            i7 = (composerKN.p5(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 = i2;
            i7 |= composerKN.t(i8) ? 32 : 16;
        } else {
            i8 = i2;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= (i5 & 512) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= composerKN.t(i3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= composerKN.p5(timePickerColors) ? 16384 : 8192;
        }
        if ((i7 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1148055889, i7, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean zJ2 = TimePickerSelectionMode.J2(timePickerState.J2(), i3);
            if (TimePickerSelectionMode.J2(i3, TimePickerSelectionMode.INSTANCE.n())) {
                Strings.Companion companion = Strings.INSTANCE;
                iN = Strings.n(R.string.p5);
            } else {
                Strings.Companion companion2 = Strings.INSTANCE;
                iN = Strings.n(R.string.f27122FX);
            }
            final String strN = Strings_androidKt.n(iN, composerKN, 0);
            long jUo = timePickerColors.Uo(zJ2);
            final long jKN = timePickerColors.KN(zJ2);
            boolean zP5 = composerKN.p5(strN);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$1$1
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
                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.J2());
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                    }
                };
                composerKN.o(objIF);
            }
            Modifier modifierT = SemanticsModifierKt.t(modifier, true, (Function1) objIF);
            Shape shapeO = ShapesKt.O(TimePickerTokens.f29968n.S(), composerKN, 6);
            boolean z2 = ((i7 & 7168) == 2048) | ((i7 & 896) == 256 || ((i7 & 512) != 0 && composerKN.E2(timePickerState)));
            Object objIF2 = composerKN.iF();
            if (z2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$2$1
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
                        if (TimePickerSelectionMode.J2(i3, timePickerState.J2())) {
                            return;
                        }
                        timePickerState.O(i3);
                    }
                };
                composerKN.o(objIF2);
            }
            Function0 function0 = (Function0) objIF2;
            final int i9 = i8;
            composer2 = composerKN;
            SurfaceKt.rl(zJ2, function0, modifierT, false, shapeO, jUo, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.nr(-1477282471, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    if ((i10 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1477282471, i10, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1376)");
                    }
                    final String strETf = TimePickerKt.eTf(i3, timePickerState.getIs24hour(), i9, composer3, 0);
                    Alignment alignmentO = Alignment.INSTANCE.O();
                    int i11 = i9;
                    long j2 = jKN;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                    int iN2 = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion4.n();
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
                    Updater.O(composerN, measurePolicyUo, companion4.t());
                    Updater.O(composerN, compositionLocalMapIk, companion4.O());
                    Function2 function2Rl = companion4.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN2))) {
                        composerN.o(Integer.valueOf(iN2));
                        composerN.az(Integer.valueOf(iN2), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion4.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    boolean zP52 = composer3.p5(strETf);
                    Object objIF3 = composer3.iF();
                    if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$3$1$1$1
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
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, strETf);
                            }
                        };
                        composer3.o(objIF3);
                    }
                    TextKt.t(CalendarLocale_jvmKt.t(i11, 2, 0, false, 6, null), SemanticsModifierKt.nr(companion3, false, (Function1) objIF3, 1, null), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131064);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composer2, 0, 48, 1992);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeSelector$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i10) {
                    TimePickerKt.WPU(modifier, i2, timePickerState, i3, timePickerColors, composer3, RecomposeScopeImplKt.n(i5 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
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
    public static final void XQ(final Modifier modifier, final TextFieldValue textFieldValue, final Function1 function1, TimePickerState timePickerState, int i2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors timePickerColors, Composer composer, final int i3, final int i5) {
        int i7;
        int i8;
        KeyboardOptions keyboardOptionsN;
        float f3;
        int i9;
        int i10;
        KeyboardActions keyboardActionsN;
        int i11;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        boolean zJ2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean z2;
        int i12;
        final TextFieldColors textFieldColors;
        TimePickerSelectionMode.Companion companion2;
        int iN2;
        final String strN;
        int iN3;
        Composer composerN2;
        Function2 function2Rl2;
        boolean zP5;
        Object objIF3;
        int i13;
        KeyboardOptions keyboardOptions2;
        final TimePickerState timePickerState2;
        boolean z3;
        boolean z4;
        Object objIF4;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i14 = i2;
        Composer composerKN = composer.KN(1299172990);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(modifier) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((2 & i5) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(textFieldValue) ? 32 : 16;
        }
        int i15 = i7;
        if ((4 & i5) != 0) {
            i15 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i15 |= composerKN.E2(function1) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i15 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i15 |= (i3 & 4096) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i15 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i15 |= composerKN.t(i14) ? 16384 : 8192;
            }
            i8 = i5 & 32;
            if (i8 == 0) {
                i15 |= 196608;
                keyboardOptionsN = keyboardOptions;
            } else {
                keyboardOptionsN = keyboardOptions;
                if ((i3 & 196608) == 0) {
                    f3 = 0.0f;
                    i15 |= composerKN.p5(keyboardOptionsN) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 == 0) {
                    if ((i3 & 1572864) == 0) {
                        i10 = 6;
                        keyboardActionsN = keyboardActions;
                        i15 |= composerKN.p5(keyboardActionsN) ? 1048576 : 524288;
                    }
                    if ((128 & i5) == 0) {
                        i15 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i15 |= composerKN.p5(timePickerColors) ? 8388608 : 4194304;
                    }
                    i11 = i15;
                    if ((4793491 & i11) == 4793490 || !composerKN.xMQ()) {
                        if (i8 != 0) {
                            keyboardOptionsN = KeyboardOptions.INSTANCE.n();
                        }
                        if (i9 != 0) {
                            keyboardActionsN = KeyboardActions.INSTANCE.n();
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1299172990, i11, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1761)");
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = InteractionSourceKt.n();
                            composerKN.o(objIF);
                        }
                        final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                        objIF2 = composerKN.iF();
                        if (objIF2 == companion.n()) {
                            objIF2 = new FocusRequester();
                            composerKN.o(objIF2);
                        }
                        FocusRequester focusRequester = (FocusRequester) objIF2;
                        TextFieldColors textFieldColorsO = OutlinedTextFieldDefaults.f26813n.O(timePickerColors.KN(true), 0L, 0L, 0L, timePickerColors.Uo(true), timePickerColors.Uo(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 0, 0, 3072, 2147483598, 4095);
                        zJ2 = TimePickerSelectionMode.J2(i14, timePickerState.J2());
                        Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
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
                        Updater.O(composerN, measurePolicyN, companion4.t());
                        Updater.O(composerN, compositionLocalMapIk, companion4.O());
                        function2Rl = companion4.rl();
                        if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion4.nr());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                        composerKN.eF(2011386807);
                        if (zJ2) {
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            TimeInputTokens timeInputTokens = TimeInputTokens.f29949n;
                            Modifier modifierS = SizeKt.S(companion5, timeInputTokens.O(), timeInputTokens.t());
                            int i16 = i11 >> 3;
                            int i17 = (i16 & 7168) | (i16 & 896) | 6 | ((i11 >> 9) & 57344);
                            z2 = zJ2;
                            textFieldColors = textFieldColorsO;
                            i12 = i11;
                            WPU(modifierS, TimePickerSelectionMode.J2(i14, TimePickerSelectionMode.INSTANCE.n()) ? piY(timePickerState) : timePickerState.rl(), timePickerState, i14, timePickerColors, composerKN, i17);
                        } else {
                            z2 = zJ2;
                            i12 = i11;
                            textFieldColors = textFieldColorsO;
                        }
                        composerKN.Xw();
                        companion2 = TimePickerSelectionMode.INSTANCE;
                        if (TimePickerSelectionMode.J2(i14, companion2.rl())) {
                            Strings.Companion companion6 = Strings.INSTANCE;
                            iN2 = Strings.n(R.string.f27121E);
                        } else {
                            Strings.Companion companion7 = Strings.INSTANCE;
                            iN2 = Strings.n(R.string.f27123J);
                        }
                        strN = Strings_androidKt.n(iN2, composerKN, 0);
                        Modifier.Companion companion8 = Modifier.INSTANCE;
                        Modifier modifierOfS = ofS(companion8, z2);
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                        iN3 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierOfS);
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
                        Updater.O(composerN2, measurePolicyUo, companion4.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                        function2Rl2 = companion4.rl();
                        if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN3))) {
                            composerN2.o(Integer.valueOf(iN3));
                            composerN2.az(Integer.valueOf(iN3), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion4.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        Modifier modifierN = FocusRequesterModifierKt.n(companion8, focusRequester);
                        TimeInputTokens timeInputTokens2 = TimeInputTokens.f29949n;
                        Modifier modifierS2 = SizeKt.S(modifierN, timeInputTokens2.O(), timeInputTokens2.t());
                        zP5 = composerKN.p5(strN);
                        objIF3 = composerKN.iF();
                        if (!zP5 || objIF3 == companion.n()) {
                            objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
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
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        Modifier modifierNr = SemanticsModifierKt.nr(modifierS2, false, (Function1) objIF3, 1, null);
                        TextStyle textStyle = (TextStyle) composerKN.ty(TextKt.J2());
                        Brush.Companion companion9 = Brush.INSTANCE;
                        Float fValueOf = Float.valueOf(f3);
                        Color.Companion companion10 = Color.INSTANCE;
                        Pair pair = TuplesKt.to(fValueOf, Color.xMQ(companion10.J2()));
                        Pair pair2 = TuplesKt.to(Float.valueOf(0.1f), Color.xMQ(companion10.J2()));
                        Float fValueOf2 = Float.valueOf(0.1f);
                        MaterialTheme materialTheme = MaterialTheme.f26164n;
                        int i18 = i12 >> 3;
                        int i19 = i12 << 3;
                        KeyboardActions keyboardActions2 = keyboardActionsN;
                        KeyboardOptions keyboardOptions3 = keyboardOptionsN;
                        i13 = i12;
                        boolean z5 = true;
                        BasicTextFieldKt.t(textFieldValue, function1, modifierNr, true, false, textStyle, keyboardOptions3, keyboardActions2, true, 0, 0, null, null, mutableInteractionSource, Brush.Companion.mUb(companion9, new Pair[]{pair, pair2, TuplesKt.to(fValueOf2, Color.xMQ(materialTheme.n(composerKN, i10).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.xMQ(materialTheme.n(composerKN, 6).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.xMQ(companion10.J2())), TuplesKt.to(Float.valueOf(1.0f), Color.xMQ(companion10.J2()))}, 0.0f, 0.0f, 0, 14, null), ComposableLambdaKt.nr(825138052, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                n(function2, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

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
                            public final void n(Function2 function2, Composer composer2, int i20) {
                                int i21;
                                if ((i20 & 6) == 0) {
                                    i21 = i20 | (composer2.E2(function2) ? 4 : 2);
                                } else {
                                    i21 = i20;
                                }
                                if ((i21 & 19) == 18 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(825138052, i21, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1820)");
                                }
                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                String strXMQ = textFieldValue.xMQ();
                                VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                                PaddingValues paddingValuesN = PaddingKt.n(Dp.KN(0));
                                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                                final TextFieldColors textFieldColors2 = textFieldColors;
                                outlinedTextFieldDefaults.t(strXMQ, function2, true, true, visualTransformationT, mutableInteractionSource2, false, null, null, null, null, null, null, null, textFieldColors2, paddingValuesN, ComposableLambdaKt.nr(-833003881, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
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
                                            ComposerKt.p5(-833003881, i22, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1830)");
                                        }
                                        OutlinedTextFieldDefaults.f26813n.n(true, false, mutableInteractionSource2, null, textFieldColors2, ShapesKt.O(TimeInputTokens.f29949n.nr(), composer3, 6), 0.0f, 0.0f, composer3, 100663734, 200);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer2, ((i21 << 3) & 112) | 224640, 14352384, 16320);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i18 & 112) | (i18 & 14) | 100666368 | (i19 & 3670016) | (i19 & 29360128), 199680, 7696);
                        keyboardActionsN = keyboardActions2;
                        keyboardOptions2 = keyboardOptions3;
                        composerKN = composerKN;
                        composerKN.XQ();
                        Modifier modifierN2 = SemanticsModifierKt.n(OffsetKt.t(companion8, 0.0f, J2, 1, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        i14 = i2;
                        TextKt.t(Strings_androidKt.n(!TimePickerSelectionMode.J2(i14, companion2.n()) ? Strings.n(R.string.P5) : Strings.n(R.string.f27124M), composerKN, 0), modifierN2, ColorSchemeKt.xMQ(timeInputTokens2.KN(), composerKN, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypographyKt.t(timeInputTokens2.xMQ(), composerKN, 6), composerKN, 0, 0, 65528);
                        composerKN.XQ();
                        TimePickerSelectionMode timePickerSelectionModeT = TimePickerSelectionMode.t(timePickerState.J2());
                        if ((i13 & 7168) == 2048) {
                            if ((i13 & 4096) != 0) {
                                timePickerState2 = timePickerState;
                                if (composerKN.E2(timePickerState2)) {
                                }
                                if ((i13 & 57344) != 16384) {
                                    z5 = false;
                                }
                                z4 = z5 | z3;
                                objIF4 = composerKN.iF();
                                if (!z4 || objIF4 == companion.n()) {
                                    objIF4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState2, i14, focusRequester, null);
                                    composerKN.o(objIF4);
                                }
                                EffectsKt.O(timePickerSelectionModeT, (Function2) objIF4, composerKN, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            } else {
                                timePickerState2 = timePickerState;
                            }
                            z3 = false;
                            if ((i13 & 57344) != 16384) {
                            }
                            z4 = z5 | z3;
                            objIF4 = composerKN.iF();
                            if (!z4) {
                                objIF4 = new TimePickerKt$TimePickerTextField$2$1(timePickerState2, i14, focusRequester, null);
                                composerKN.o(objIF4);
                                EffectsKt.O(timePickerSelectionModeT, (Function2) objIF4, composerKN, 0);
                                if (ComposerKt.v()) {
                                }
                            }
                        } else {
                            timePickerState2 = timePickerState;
                        }
                        z3 = true;
                        if ((i13 & 57344) != 16384) {
                        }
                        z4 = z5 | z3;
                        objIF4 = composerKN.iF();
                        if (!z4) {
                        }
                    } else {
                        composerKN.wTp();
                        timePickerState2 = timePickerState;
                        keyboardOptions2 = keyboardOptionsN;
                    }
                    final KeyboardActions keyboardActions3 = keyboardActionsN;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        final int i20 = i14;
                        final KeyboardOptions keyboardOptions4 = keyboardOptions2;
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i21) {
                                TimePickerKt.XQ(modifier, textFieldValue, function1, timePickerState2, i20, keyboardOptions4, keyboardActions3, timePickerColors, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i15 |= 1572864;
                i10 = 6;
                keyboardActionsN = keyboardActions;
                if ((128 & i5) == 0) {
                }
                i11 = i15;
                if ((4793491 & i11) == 4793490) {
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                    }
                    final MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF;
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                    }
                    FocusRequester focusRequester2 = (FocusRequester) objIF2;
                    TextFieldColors textFieldColorsO2 = OutlinedTextFieldDefaults.f26813n.O(timePickerColors.KN(true), 0L, 0L, 0L, timePickerColors.Uo(true), timePickerColors.Uo(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 0, 0, 3072, 2147483598, 4095);
                    zJ2 = TimePickerSelectionMode.J2(i14, timePickerState.J2());
                    Arrangement.Vertical verticalUo2 = Arrangement.f17400n.Uo();
                    Alignment.Companion companion32 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(verticalUo2, companion32.gh(), composerKN, 0);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier);
                    ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                    Function0 function0N3 = companion42.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyN2, companion42.t());
                    Updater.O(composerN, compositionLocalMapIk3, companion42.O());
                    function2Rl = companion42.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO3, companion42.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        composerKN.eF(2011386807);
                        if (zJ2) {
                        }
                        composerKN.Xw();
                        companion2 = TimePickerSelectionMode.INSTANCE;
                        if (TimePickerSelectionMode.J2(i14, companion2.rl())) {
                        }
                        strN = Strings_androidKt.n(iN2, composerKN, 0);
                        Modifier.Companion companion82 = Modifier.INSTANCE;
                        Modifier modifierOfS2 = ofS(companion82, z2);
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion32.HI(), false);
                        iN3 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                        Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierOfS2);
                        Function0 function0N22 = companion42.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN2 = Updater.n(composerKN);
                        Updater.O(composerN2, measurePolicyUo2, companion42.t());
                        Updater.O(composerN2, compositionLocalMapIk22, companion42.O());
                        function2Rl2 = companion42.rl();
                        if (!composerN2.getInserting()) {
                            composerN2.o(Integer.valueOf(iN3));
                            composerN2.az(Integer.valueOf(iN3), function2Rl2);
                            Updater.O(composerN2, modifierO22, companion42.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            Modifier modifierN3 = FocusRequesterModifierKt.n(companion82, focusRequester2);
                            TimeInputTokens timeInputTokens22 = TimeInputTokens.f29949n;
                            Modifier modifierS22 = SizeKt.S(modifierN3, timeInputTokens22.O(), timeInputTokens22.t());
                            zP5 = composerKN.p5(strN);
                            objIF3 = composerKN.iF();
                            if (!zP5) {
                                objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$1$1
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
                                    }
                                };
                                composerKN.o(objIF3);
                                Modifier modifierNr2 = SemanticsModifierKt.nr(modifierS22, false, (Function1) objIF3, 1, null);
                                TextStyle textStyle2 = (TextStyle) composerKN.ty(TextKt.J2());
                                Brush.Companion companion92 = Brush.INSTANCE;
                                Float fValueOf3 = Float.valueOf(f3);
                                Color.Companion companion102 = Color.INSTANCE;
                                Pair pair3 = TuplesKt.to(fValueOf3, Color.xMQ(companion102.J2()));
                                Pair pair22 = TuplesKt.to(Float.valueOf(0.1f), Color.xMQ(companion102.J2()));
                                Float fValueOf22 = Float.valueOf(0.1f);
                                MaterialTheme materialTheme2 = MaterialTheme.f26164n;
                                int i182 = i12 >> 3;
                                int i192 = i12 << 3;
                                KeyboardActions keyboardActions22 = keyboardActionsN;
                                KeyboardOptions keyboardOptions32 = keyboardOptionsN;
                                i13 = i12;
                                boolean z52 = true;
                                BasicTextFieldKt.t(textFieldValue, function1, modifierNr2, true, false, textStyle2, keyboardOptions32, keyboardActions22, true, 0, 0, null, null, mutableInteractionSource2, Brush.Companion.mUb(companion92, new Pair[]{pair3, pair22, TuplesKt.to(fValueOf22, Color.xMQ(materialTheme2.n(composerKN, i10).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.xMQ(materialTheme2.n(composerKN, 6).getPrimary())), TuplesKt.to(Float.valueOf(0.9f), Color.xMQ(companion102.J2())), TuplesKt.to(Float.valueOf(1.0f), Color.xMQ(companion102.J2()))}, 0.0f, 0.0f, 0, 14, null), ComposableLambdaKt.nr(825138052, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                        n(function2, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

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
                                    public final void n(Function2 function2, Composer composer2, int i202) {
                                        int i21;
                                        if ((i202 & 6) == 0) {
                                            i21 = i202 | (composer2.E2(function2) ? 4 : 2);
                                        } else {
                                            i21 = i202;
                                        }
                                        if ((i21 & 19) == 18 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(825138052, i21, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1820)");
                                        }
                                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                        String strXMQ = textFieldValue.xMQ();
                                        VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                                        PaddingValues paddingValuesN = PaddingKt.n(Dp.KN(0));
                                        final MutableInteractionSource mutableInteractionSource22 = mutableInteractionSource2;
                                        final TextFieldColors textFieldColors2 = textFieldColors;
                                        outlinedTextFieldDefaults.t(strXMQ, function2, true, true, visualTransformationT, mutableInteractionSource22, false, null, null, null, null, null, null, null, textFieldColors2, paddingValuesN, ComposableLambdaKt.nr(-833003881, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2.1
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
                                                    ComposerKt.p5(-833003881, i22, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1830)");
                                                }
                                                OutlinedTextFieldDefaults.f26813n.n(true, false, mutableInteractionSource22, null, textFieldColors2, ShapesKt.O(TimeInputTokens.f29949n.nr(), composer3, 6), 0.0f, 0.0f, composer3, 100663734, 200);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer2, 54), composer2, ((i21 << 3) & 112) | 224640, 14352384, 16320);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i182 & 112) | (i182 & 14) | 100666368 | (i192 & 3670016) | (i192 & 29360128), 199680, 7696);
                                keyboardActionsN = keyboardActions22;
                                keyboardOptions2 = keyboardOptions32;
                                composerKN = composerKN;
                                composerKN.XQ();
                                Modifier modifierN22 = SemanticsModifierKt.n(OffsetKt.t(companion82, 0.0f, J2, 1, null), new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$2
                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                });
                                i14 = i2;
                                TextKt.t(Strings_androidKt.n(!TimePickerSelectionMode.J2(i14, companion2.n()) ? Strings.n(R.string.P5) : Strings.n(R.string.f27124M), composerKN, 0), modifierN22, ColorSchemeKt.xMQ(timeInputTokens22.KN(), composerKN, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypographyKt.t(timeInputTokens22.xMQ(), composerKN, 6), composerKN, 0, 0, 65528);
                                composerKN.XQ();
                                TimePickerSelectionMode timePickerSelectionModeT2 = TimePickerSelectionMode.t(timePickerState.J2());
                                if ((i13 & 7168) == 2048) {
                                }
                                z3 = true;
                                if ((i13 & 57344) != 16384) {
                                }
                                z4 = z52 | z3;
                                objIF4 = composerKN.iF();
                                if (!z4) {
                                }
                            }
                        }
                    }
                }
                final KeyboardActions keyboardActions32 = keyboardActionsN;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            f3 = 0.0f;
            i9 = i5 & 64;
            if (i9 == 0) {
            }
            i10 = 6;
            keyboardActionsN = keyboardActions;
            if ((128 & i5) == 0) {
            }
            i11 = i15;
            if ((4793491 & i11) == 4793490) {
            }
            final KeyboardActions keyboardActions322 = keyboardActionsN;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) == 0) {
        }
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        f3 = 0.0f;
        i9 = i5 & 64;
        if (i9 == 0) {
        }
        i10 = 6;
        keyboardActionsN = keyboardActions;
        if ((128 & i5) == 0) {
        }
        i11 = i15;
        if ((4793491 & i11) == 4793490) {
        }
        final KeyboardActions keyboardActions3222 = keyboardActionsN;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Z(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i2, Composer composer, final int i3, final int i5) {
        int i7;
        final int iT;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        boolean z2;
        Object objIF;
        final Modifier modifier3;
        final TimePickerColors timePickerColors3;
        Composer composerKN = composer.KN(-619286452);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = ((i3 & 8) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= ((i5 & 4) == 0 && composerKN.p5(timePickerColors)) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if ((i5 & 8) == 0) {
                iT = i2;
                int i9 = composerKN.t(iT) ? 2048 : 1024;
                i7 |= i9;
            } else {
                iT = i2;
            }
            i7 |= i9;
        } else {
            iT = i2;
        }
        if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier;
            timePickerColors3 = timePickerColors;
        } else {
            composerKN.e();
            if ((i3 & 1) == 0 || composerKN.rV9()) {
                if (i8 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i5 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.f28557n.n(composerKN, 6);
                    i7 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i7 &= -7169;
                    modifier2 = modifier;
                    timePickerColors2 = timePickerColors;
                    iT = TimePickerDefaults.f28557n.t(composerKN, 6);
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-619286452, i7, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:220)");
                }
                z2 = false;
                State stateT = AccessibilityServiceStateProvider_androidKt.t(false, false, composerKN, 0, 3);
                if ((i7 & 14) != 4 || ((i7 & 8) != 0 && composerKN.p5(timePickerState))) {
                    z2 = true;
                }
                objIF = composerKN.iF();
                if (!z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new AnalogTimePickerState(timePickerState);
                    composerKN.o(objIF);
                }
                AnalogTimePickerState analogTimePickerState = (AnalogTimePickerState) objIF;
                if (TimePickerLayoutType.O(iT, TimePickerLayoutType.INSTANCE.rl())) {
                    composerKN.eF(-337036960);
                    qie(analogTimePickerState, modifier2, timePickerColors2, !S(stateT), composerKN, i7 & 1008, 0);
                    composerKN.Xw();
                } else {
                    composerKN.eF(-337235422);
                    g(analogTimePickerState, modifier2, timePickerColors2, !S(stateT), composerKN, i7 & 1008, 0);
                    composerKN.Xw();
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier2;
                timePickerColors3 = timePickerColors2;
            } else {
                composerKN.wTp();
                if ((i5 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i5 & 8) != 0) {
                    i7 &= -7169;
                }
            }
            modifier2 = modifier;
            timePickerColors2 = timePickerColors;
            composerKN.S();
            if (ComposerKt.v()) {
            }
            z2 = false;
            State stateT2 = AccessibilityServiceStateProvider_androidKt.t(false, false, composerKN, 0, 3);
            if ((i7 & 14) != 4) {
                z2 = true;
                objIF = composerKN.iF();
                if (!z2) {
                    objIF = new AnalogTimePickerState(timePickerState);
                    composerKN.o(objIF);
                    AnalogTimePickerState analogTimePickerState2 = (AnalogTimePickerState) objIF;
                    if (TimePickerLayoutType.O(iT, TimePickerLayoutType.INSTANCE.rl())) {
                    }
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier2;
                    timePickerColors3 = timePickerColors2;
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimePicker$1
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
                    TimePickerKt.Z(timePickerState, modifier3, timePickerColors3, iT, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aYN(final boolean z2, final Shape shape, final Function0 function0, final TimePickerColors timePickerColors, final Function3 function3, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(-1937408098);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(shape) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(timePickerColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function3) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1937408098, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long jJ2 = timePickerColors.J2(z2);
            long jO = timePickerColors.O(z2);
            Modifier modifierJ2 = SizeKt.J2(ZIndexModifierKt.n(Modifier.INSTANCE, z2 ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z3 = (i3 & 14) == 4;
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$1$1
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
                        SemanticsPropertiesKt.Mx(semanticsPropertyReceiver, z2);
                    }
                };
                composerKN.o(objIF);
            }
            ButtonKt.O(function0, SemanticsModifierKt.nr(modifierJ2, false, (Function1) objIF, 1, null), false, shape, ButtonDefaults.f24588n.nY(jO, jJ2, 0L, 0L, composerKN, 24576, 12), null, null, PaddingKt.n(Dp.KN(0)), null, function3, composerKN, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
            composer2 = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ToggleItem$2
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
                    TimePickerKt.aYN(z2, shape, function0, timePickerColors, function3, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(final Modifier modifier, final TimePickerState timePickerState, final TimePickerColors timePickerColors, MeasurePolicy measurePolicy, final Shape shape, final Shape shape2, Composer composer, final int i2) {
        int i3;
        Shape shape3;
        final MeasurePolicy measurePolicy2 = measurePolicy;
        Composer composerKN = composer.KN(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(timePickerColors) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(measurePolicy2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            shape3 = shape2;
            i3 |= composerKN.p5(shape3) ? 131072 : 65536;
        } else {
            shape3 = shape2;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1374241901, i3, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
            BorderStroke borderStrokeN = BorderStrokeKt.n(timePickerTokens.HI(), timePickerColors.getPeriodSelectorBorderColor());
            Shape shapeO = ShapesKt.O(timePickerTokens.gh(), composerKN, 6);
            Intrinsics.checkNotNull(shapeO, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeO;
            Strings.Companion companion = Strings.INSTANCE;
            final String strN = Strings_androidKt.n(Strings.n(R.string.f27120D), composerKN, 0);
            boolean zP5 = composerKN.p5(strN);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                };
                composerKN.o(objIF);
            }
            Modifier modifierO = BorderKt.O(SelectableGroupKt.n(SemanticsModifierKt.nr(modifier, false, (Function1) objIF, 1, null)), borderStrokeN, cornerBasedShape);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierO);
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
            measurePolicy2 = measurePolicy;
            Updater.O(composerN, measurePolicy2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO2, companion2.nr());
            boolean z2 = !timePickerState.mUb();
            int i5 = i3 & 112;
            boolean z3 = i5 == 32 || ((i3 & 64) != 0 && composerKN.E2(timePickerState));
            Object objIF2 = composerKN.iF();
            if (z3 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$1$1
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
                        timePickerState.nr(false);
                    }
                };
                composerKN.o(objIF2);
            }
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.f25122n;
            int i7 = (i3 << 3) & 7168;
            aYN(z2, shape, (Function0) objIF2, timePickerColors, composableSingletons$TimePickerKt.n(), composerKN, ((i3 >> 9) & 112) | 24576 | i7);
            boolean z4 = true;
            SpacerKt.n(BackgroundKt.nr(SizeKt.J2(ZIndexModifierKt.n(LayoutIdKt.rl(Modifier.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), timePickerColors.getPeriodSelectorBorderColor(), null, 2, null), composerKN, 0);
            boolean zMUb = timePickerState.mUb();
            if (i5 != 32 && ((i3 & 64) == 0 || !composerKN.E2(timePickerState))) {
                z4 = false;
            }
            Object objIF3 = composerKN.iF();
            if (z4 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0<Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$2$2$1
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
                        timePickerState.nr(true);
                    }
                };
                composerKN.o(objIF3);
            }
            aYN(zMUb, shape3, (Function0) objIF3, timePickerColors, composableSingletons$TimePickerKt.rl(), composerKN, ((i3 >> 12) & 112) | 24576 | i7);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$PeriodToggleImpl$3
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
                    TimePickerKt.az(modifier, timePickerState, timePickerColors, measurePolicy2, shape, shape2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final long ijL(AnalogTimePickerState analogTimePickerState) {
        TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
        float f3 = 2;
        float fKN = Dp.KN(timePickerTokens.Uo() / f3);
        float fKN2 = Dp.KN(Dp.KN(((analogTimePickerState.getIs24hour() && analogTimePickerState.mUb() && TimePickerSelectionMode.J2(analogTimePickerState.J2(), TimePickerSelectionMode.INSTANCE.n())) ? rl : f28559n) - fKN) + fKN);
        return DpKt.n(Dp.KN(Dp.KN(((float) Math.cos(analogTimePickerState.S())) * fKN2) + Dp.KN(timePickerTokens.rl() / f3)), Dp.KN(Dp.KN(fKN2 * ((float) Math.sin(analogTimePickerState.S()))) + Dp.KN(timePickerTokens.rl() / f3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(755539561);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(timePickerState) : composerKN.E2(timePickerState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(timePickerColors) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(755539561, i3, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalRl, companion2.gh(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            rl(timePickerState, timePickerColors, composerKN, i3 & 126);
            composerKN.eF(919638492);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierAz = PaddingKt.az(companion, 0.0f, az, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz);
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
                TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
                int i5 = i3 << 3;
                gh(SizeKt.S(companion, timePickerTokens.az(), timePickerTokens.qie()), timePickerState, timePickerColors, composerKN, 6 | (i5 & 112) | (i5 & 896));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalClockDisplay$2
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
                    TimePickerKt.mUb(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static final void nr(final Modifier modifier, final AnalogTimePickerState analogTimePickerState, final int i2, final boolean z2, Composer composer, final int i3) {
        int i5;
        Modifier modifier2;
        Alignment alignment;
        ?? r12;
        Composer composer2;
        Composer composerKN = composer.KN(-206784607);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.E2(analogTimePickerState) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.t(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.n(z2) ? 2048 : 1024;
        }
        int i7 = i5;
        if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-206784607, i7, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle textStyleT = TypographyKt.t(TimePickerTokens.f29968n.t(), composerKN, 6);
            final float fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(KN);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.INSTANCE.t()), null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(IntOffset.t(IntOffset.INSTANCE.rl()), null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState2 = (MutableState) objIF2;
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF3 = compositionScopedCoroutineScopeCanceller;
            }
            final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF3).getCoroutineScope();
            final String strETf = eTf(analogTimePickerState.J2(), analogTimePickerState.getIs24hour(), i2, composerKN, i7 & 896);
            String strT = CalendarLocale_jvmKt.t(i2, 0, 0, false, 7, null);
            boolean zAreEqual = TimePickerSelectionMode.J2(analogTimePickerState.J2(), TimePickerSelectionMode.INSTANCE.rl()) ? Intrinsics.areEqual(CalendarLocale_jvmKt.t(analogTimePickerState.rl(), 0, 0, false, 7, null), strT) : Intrinsics.areEqual(CalendarLocale_jvmKt.t(analogTimePickerState.t(), 0, 0, false, 7, null), strT);
            Alignment alignmentO = Alignment.INSTANCE.O();
            Modifier modifierZ = SizeKt.Z(InteractiveComponentSizeKt.rl(modifier), xMQ);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        n(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    public final void n(LayoutCoordinates layoutCoordinates) {
                        MutableState mutableState3 = mutableState2;
                        LayoutCoordinates layoutCoordinatesV = layoutCoordinates.v();
                        TimePickerKt.KN(mutableState3, layoutCoordinatesV != null ? IntSizeKt.rl(layoutCoordinatesV.n()) : IntOffset.INSTANCE.rl());
                        TimePickerKt.J2(mutableState, LayoutCoordinatesKt.n(layoutCoordinates).az());
                    }
                };
                composerKN.o(objIF4);
            }
            Modifier modifierRl = FocusableKt.rl(OnGloballyPositionedModifierKt.n(modifierZ, (Function1) objIF4), false, null, 3, null);
            boolean zE2 = composerKN.E2(coroutineScope) | composerKN.E2(analogTimePickerState) | composerKN.rl(fL) | ((i7 & 7168) == 2048) | composerKN.n(zAreEqual);
            Object objIF5 = composerKN.iF();
            if (zE2 || objIF5 == companion.n()) {
                modifier2 = modifierRl;
                final boolean z3 = zAreEqual;
                alignment = alignmentO;
                r12 = 0;
                Function1<SemanticsPropertyReceiver, Unit> function1 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1
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
                        final vd vdVar = coroutineScope;
                        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                        final float f3 = fL;
                        final boolean z4 = z2;
                        final MutableState mutableState3 = mutableState;
                        final MutableState mutableState4 = mutableState2;
                        SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$2$1.1

                            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                            @DebugMetadata(c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1$1", f = "TimePicker.kt", i = {}, l = {1674}, m = "invokeSuspend", n = {}, s = {})
                            static final class C05491 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                                final /* synthetic */ boolean J2;

                                /* JADX INFO: renamed from: O, reason: collision with root package name */
                                final /* synthetic */ float f28606O;

                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                int f28607n;

                                /* JADX INFO: renamed from: o, reason: collision with root package name */
                                final /* synthetic */ MutableState f28608o;

                                /* JADX INFO: renamed from: r, reason: collision with root package name */
                                final /* synthetic */ MutableState f28609r;

                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                final /* synthetic */ AnalogTimePickerState f28610t;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C05491(AnalogTimePickerState analogTimePickerState, float f3, boolean z2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
                                    super(2, continuation);
                                    this.f28610t = analogTimePickerState;
                                    this.f28606O = f3;
                                    this.J2 = z2;
                                    this.f28609r = mutableState;
                                    this.f28608o = mutableState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation create(Object obj, Continuation continuation) {
                                    return new C05491(this.f28610t, this.f28606O, this.J2, this.f28609r, this.f28608o, continuation);
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final Object invoke2(vd vdVar, Continuation continuation) {
                                    return ((C05491) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                    return invoke2(vdVar, (Continuation) continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.f28607n;
                                    if (i2 != 0) {
                                        if (i2 == 1) {
                                            ResultKt.throwOnFailure(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.throwOnFailure(obj);
                                        AnalogTimePickerState analogTimePickerState = this.f28610t;
                                        float fAz = Offset.az(TimePickerKt.O(this.f28609r));
                                        float fTy = Offset.ty(TimePickerKt.O(this.f28609r));
                                        float f3 = this.f28606O;
                                        boolean z2 = this.J2;
                                        long jUo = TimePickerKt.Uo(this.f28608o);
                                        this.f28607n = 1;
                                        if (TimePickerKt.xg(analogTimePickerState, fAz, fTy, f3, z2, jUo, this) == coroutine_suspended) {
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
                                C.nr(vdVar, null, null, new C05491(analogTimePickerState2, f3, z4, mutableState3, mutableState4, null), 3, null);
                                return Boolean.TRUE;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.Mx(semanticsPropertyReceiver, z3);
                    }
                };
                composerKN.o(function1);
                objIF5 = function1;
            } else {
                modifier2 = modifierRl;
                alignment = alignmentO;
                r12 = 0;
            }
            Modifier modifierT = SemanticsModifierKt.t(modifier2, true, (Function1) objIF5);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(alignment, r12);
            int iN = ComposablesKt.n(composerKN, r12);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            boolean zP5 = composerKN.p5(strETf);
            Object objIF6 = composerKN.iF();
            if (zP5 || objIF6 == companion.n()) {
                objIF6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$3$1$1
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
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, strETf);
                    }
                };
                composerKN.o(objIF6);
            }
            composer2 = composerKN;
            TextKt.t(strT, SemanticsModifierKt.n(companion3, (Function1) objIF6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleT, composer2, 0, 0, 65532);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockText$4
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
                    TimePickerKt.nr(modifier, analogTimePickerState, i2, z2, composer3, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }

    private static final Modifier ofS(Modifier modifier, final boolean z2) {
        return modifier.Zmq(new VisibleModifier(z2, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                n(inspectorInfo);
                return Unit.INSTANCE;
            }

            public final void n(InspectorInfo inspectorInfo) {
                inspectorInfo.rl("visible");
                inspectorInfo.getProperties().n("visible", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void qie(final AnalogTimePickerState analogTimePickerState, Modifier modifier, TimePickerColors timePickerColors, final boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        TimePickerColors timePickerColorsN;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final TimePickerColors timePickerColors3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1432307537);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    int i8 = composerKN.p5(timePickerColors2) ? 256 : 128;
                    i5 |= i8;
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i5 |= i8;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.n(z2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) == 0) {
                        timePickerColorsN = TimePickerDefaults.f28557n.n(composerKN, 6);
                        i5 &= -897;
                    }
                    Modifier modifier4 = modifier2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1432307537, i5, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:947)");
                    }
                    Modifier modifierAz = PaddingKt.az(modifier4, 0.0f, 0.0f, 0.0f, nr, 7, null);
                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
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
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyRl, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    int i9 = i5 >> 3;
                    int i10 = (i5 & 14) | (i9 & 112);
                    mUb(analogTimePickerState, timePickerColorsN, composerKN, i10);
                    SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, f28560t), composerKN, 6);
                    t(analogTimePickerState, timePickerColorsN, z2, composerKN, i10 | (i9 & 896));
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    timePickerColors3 = timePickerColorsN;
                    modifier3 = modifier4;
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                }
                timePickerColorsN = timePickerColors2;
                Modifier modifier42 = modifier2;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                Modifier modifierAz2 = PaddingKt.az(modifier42, 0.0f, 0.0f, 0.0f, nr, 7, null);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion2.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyRl2, companion2.t());
                Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                function2Rl = companion2.rl();
                if (composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion2.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    int i92 = i5 >> 3;
                    int i102 = (i5 & 14) | (i92 & 112);
                    mUb(analogTimePickerState, timePickerColorsN, composerKN, i102);
                    SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, f28560t), composerKN, 6);
                    t(analogTimePickerState, timePickerColorsN, z2, composerKN, i102 | (i92 & 896));
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    timePickerColors3 = timePickerColorsN;
                    modifier3 = modifier42;
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                timePickerColors3 = timePickerColors2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalTimePicker$2
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
                        TimePickerKt.qie(analogTimePickerState, modifier3, timePickerColors3, z2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
        if ((i3 & 8) == 0) {
        }
        if ((i5 & 1171) == 1170) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                }
                if ((i3 & 4) == 0) {
                    timePickerColorsN = timePickerColors2;
                }
                Modifier modifier422 = modifier2;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                Modifier modifierAz22 = PaddingKt.az(modifier422, 0.0f, 0.0f, 0.0f, nr, 7, null);
                MeasurePolicy measurePolicyRl22 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierAz22);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyRl22, companion22.t());
                Updater.O(composerN, compositionLocalMapIk22, companion22.O());
                function2Rl = companion22.rl();
                if (composerN.getInserting()) {
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(2100674302);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            TextStyle textStyleT = TextStyle.t((TextStyle) composerKN.ty(TextKt.J2()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.n(), LineHeightStyle.Trim.INSTANCE.n(), (DefaultConstructorMarker) null), 0, 0, null, 15695871, null);
            Modifier modifierN = SemanticsModifierKt.n(modifier, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$1
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            });
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composer2 = composerKN;
            TextKt.t(":", null, ColorSchemeKt.xMQ(TimeInputTokens.f29949n.Uo(), composerKN, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleT, composer2, 6, 0, 65530);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$DisplaySeparator$3
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
                    TimePickerKt.xMQ(modifier, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object xg(AnalogTimePickerState analogTimePickerState, float f3, float f4, float f5, boolean z2, long j2, Continuation continuation) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        float f6;
        float fRint;
        AnalogTimePickerState analogTimePickerState2;
        boolean z3;
        AnalogTimePickerState analogTimePickerState3;
        if (continuation instanceof TimePickerKt$onTap$1) {
            timePickerKt$onTap$1 = (TimePickerKt$onTap$1) continuation;
            int i2 = timePickerKt$onTap$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timePickerKt$onTap$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                timePickerKt$onTap$1 = new TimePickerKt$onTap$1(continuation);
            }
        }
        TimePickerKt$onTap$1 timePickerKt$onTap$12 = timePickerKt$onTap$1;
        Object obj = timePickerKt$onTap$12.f28724O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = timePickerKt$onTap$12.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            float fK = k(f4 - IntOffset.qie(j2), f3 - IntOffset.gh(j2));
            if (TimePickerSelectionMode.J2(analogTimePickerState.J2(), TimePickerSelectionMode.INSTANCE.rl())) {
                f6 = 0.10471976f;
                fRint = ((float) Math.rint((fK / 0.10471976f) / 5.0f)) * 5.0f;
            } else {
                f6 = 0.5235988f;
                fRint = (float) Math.rint(fK / 0.5235988f);
            }
            float f7 = fRint * f6;
            m(analogTimePickerState, f3, f4, f5, j2);
            timePickerKt$onTap$12.f28725n = analogTimePickerState;
            timePickerKt$onTap$12.f28726t = z2;
            timePickerKt$onTap$12.J2 = 1;
            if (analogTimePickerState.te(f7, true, timePickerKt$onTap$12) != coroutine_suspended) {
                analogTimePickerState2 = analogTimePickerState;
                z3 = z2;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = timePickerKt$onTap$12.f28726t;
            analogTimePickerState3 = (AnalogTimePickerState) timePickerKt$onTap$12.f28725n;
            ResultKt.throwOnFailure(obj);
            analogTimePickerState2 = analogTimePickerState3;
            if (z3) {
                analogTimePickerState2.O(TimePickerSelectionMode.INSTANCE.rl());
            }
            return Unit.INSTANCE;
        }
        z3 = timePickerKt$onTap$12.f28726t;
        AnalogTimePickerState analogTimePickerState4 = (AnalogTimePickerState) timePickerKt$onTap$12.f28725n;
        ResultKt.throwOnFailure(obj);
        analogTimePickerState2 = analogTimePickerState4;
        if (TimePickerSelectionMode.J2(analogTimePickerState2.J2(), TimePickerSelectionMode.INSTANCE.n()) && z3) {
            timePickerKt$onTap$12.f28725n = analogTimePickerState2;
            timePickerKt$onTap$12.f28726t = z3;
            timePickerKt$onTap$12.J2 = 2;
            if (yg.rl(100L, timePickerKt$onTap$12) != coroutine_suspended) {
                analogTimePickerState3 = analogTimePickerState2;
                analogTimePickerState2 = analogTimePickerState3;
            }
            return coroutine_suspended;
        }
        if (z3) {
        }
        return Unit.INSTANCE;
    }

    private static final Modifier z(Modifier modifier, final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors) {
        return DrawModifierKt.nr(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$drawSelector$1
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
                long jN = androidx.compose.ui.geometry.OffsetKt.n(contentDrawScope.l(DpOffset.J2(TimePickerKt.ijL(analogTimePickerState))), contentDrawScope.l(DpOffset.Uo(TimePickerKt.ijL(analogTimePickerState))));
                TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
                float f3 = 2;
                float fL = contentDrawScope.l(timePickerTokens.Uo()) / f3;
                long selectorColor = timePickerColors.getSelectorColor();
                long jN2 = Color.INSTANCE.n();
                BlendMode.Companion companion = BlendMode.INSTANCE;
                DrawScope.Lu(contentDrawScope, jN2, fL, jN, 0.0f, null, null, companion.n(), 56, null);
                contentDrawScope.l2();
                DrawScope.Lu(contentDrawScope, selectorColor, fL, jN, 0.0f, null, null, companion.iF(), 56, null);
                DrawScope.mI(contentDrawScope, selectorColor, androidx.compose.ui.geometry.SizeKt.rl(contentDrawScope.t()), Offset.ck(jN, androidx.compose.ui.geometry.OffsetKt.n(((float) Math.cos(analogTimePickerState.S())) * fL, ((float) Math.sin(analogTimePickerState.S())) * fL)), contentDrawScope.l(timePickerTokens.KN()), 0, null, 0.0f, null, companion.te(), 240, null);
                DrawScope.Lu(contentDrawScope, selectorColor, contentDrawScope.l(timePickerTokens.O()) / f3, androidx.compose.ui.geometry.SizeKt.rl(contentDrawScope.t()), 0.0f, null, null, 0, b.f61769v, null);
                DrawScope.Lu(contentDrawScope, timePickerColors.n(true), fL, jN, 0.0f, null, null, companion.gh(), 56, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Ik(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MutableState mutableState, long j2) {
        mutableState.setValue(Offset.nr(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(MutableState mutableState, long j2) {
        mutableState.setValue(IntOffset.t(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(MutableState mutableState) {
        return ((Offset) mutableState.getValue()).getPackedValue();
    }

    private static final boolean S(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Uo(MutableState mutableState) {
        return ((IntOffset) mutableState.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    public static final String eTf(int i2, boolean z2, int i3, Composer composer, int i5) {
        int iN;
        if (ComposerKt.v()) {
            ComposerKt.p5(194237364, i5, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if (TimePickerSelectionMode.J2(i2, TimePickerSelectionMode.INSTANCE.rl())) {
            Strings.Companion companion = Strings.INSTANCE;
            iN = Strings.n(R.string.f27119B);
        } else if (z2) {
            Strings.Companion companion2 = Strings.INSTANCE;
            iN = Strings.n(R.string.M7);
        } else {
            Strings.Companion companion3 = Strings.INSTANCE;
            iN = Strings.n(R.string.eF);
        }
        String strRl = Strings_androidKt.rl(iN, new Object[]{Integer.valueOf(i3)}, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return strRl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        int i5;
        boolean zE2;
        int i7;
        int i8;
        Composer composerKN = composer.KN(1261215927);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zE2 = composerKN.p5(timePickerState);
            } else {
                zE2 = composerKN.E2(timePickerState);
            }
            if (zE2) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.p5(timePickerColors)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Measurable measurable = (Measurable) list.get(i9);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "Spacer")) {
                                final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, measureScope.How(TimePickerTokens.f29968n.HI()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    Object obj = list.get(i10);
                                    if (!Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "Spacer")) {
                                        arrayList.add(obj);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    arrayList2.add(((Measurable) arrayList.get(i11)).dR0(Constraints.nr(j2, 0, Constraints.qie(j2) / 2, 0, 0, 12, null)));
                                }
                                return MeasureScope.ER(measureScope, Constraints.qie(j2), Constraints.gh(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.1
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
                                        Placeable.PlacementScope.xMQ(placementScope, (Placeable) arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.xMQ(placementScope, (Placeable) arrayList2.get(1), ((Placeable) arrayList2.get(0)).getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.xMQ(placementScope, placeableDR0, ((Placeable) arrayList2.get(0)).getWidth() - (placeableDR0.getWidth() / 2), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            Shape shapeO = ShapesKt.O(TimePickerTokens.f29968n.gh(), composerKN, 6);
            Intrinsics.checkNotNull(shapeO, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeO;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            az(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.J2(cornerBasedShape), ShapesKt.rl(cornerBasedShape), composerKN, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    TimePickerKt.gh(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TimePickerState timePickerState, float f3, float f4, float f5, long j2) {
        boolean z2;
        if (TimePickerSelectionMode.J2(timePickerState.J2(), TimePickerSelectionMode.INSTANCE.n()) && timePickerState.getIs24hour()) {
            if (dR0(f3, f4, IntOffset.gh(j2), IntOffset.qie(j2)) < f5) {
                z2 = true;
            } else {
                z2 = false;
            }
            timePickerState.nr(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Modifier modifier, final float f3, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        boolean z2;
        Composer composerKN = composer.KN(1548175696);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1548175696, i5, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            if ((i5 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, final long j2) {
                        Object obj;
                        Object obj2;
                        final float fL = measureScope.l(f3);
                        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            Object obj3 = list.get(i12);
                            Measurable measurable = (Measurable) obj3;
                            if (LayoutIdKt.n(measurable) != LayoutId.Selector && LayoutIdKt.n(measurable) != LayoutId.InnerCircle) {
                                arrayList.add(obj3);
                            }
                        }
                        final ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            arrayList2.add(((Measurable) arrayList.get(i13)).dR0(jNr));
                        }
                        int size3 = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i14);
                            if (LayoutIdKt.n((Measurable) obj) == LayoutId.Selector) {
                                break;
                            }
                            i14++;
                        }
                        Measurable measurable2 = (Measurable) obj;
                        int size4 = list.size();
                        while (true) {
                            if (i11 >= size4) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i11);
                            if (LayoutIdKt.n((Measurable) obj2) == LayoutId.InnerCircle) {
                                break;
                            }
                            i11++;
                        }
                        Measurable measurable3 = (Measurable) obj2;
                        final float size5 = 6.2831855f / arrayList2.size();
                        Placeable placeableDR0 = measurable2 != null ? measurable2.dR0(jNr) : null;
                        final Placeable placeableDR02 = measurable3 != null ? measurable3.dR0(jNr) : null;
                        final Placeable placeable = placeableDR0;
                        return MeasureScope.ER(measureScope, Constraints.ty(j2), Constraints.az(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1.1
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
                                Placeable placeable2 = placeable;
                                if (placeable2 != null) {
                                    Placeable.PlacementScope.xMQ(placementScope, placeable2, 0, 0, 0.0f, 4, null);
                                }
                                List list2 = arrayList2;
                                long j3 = j2;
                                float f4 = fL;
                                float f5 = size5;
                                int size6 = list2.size();
                                int i15 = 0;
                                while (i15 < size6) {
                                    Placeable placeable3 = (Placeable) list2.get(i15);
                                    double d2 = f4;
                                    double d4 = ((double) (i15 * f5)) - 1.5707963267948966d;
                                    Placeable.PlacementScope.xMQ(placementScope, placeable3, MathKt.roundToInt((Math.cos(d4) * d2) + ((double) ((Constraints.qie(j3) / 2) - (placeable3.getWidth() / 2)))), MathKt.roundToInt((d2 * Math.sin(d4)) + ((double) ((Constraints.gh(j3) / 2) - (placeable3.getHeight() / 2)))), 0.0f, 4, null);
                                    i15++;
                                    list2 = list2;
                                    j3 = j3;
                                }
                                Placeable placeable4 = placeableDR02;
                                if (placeable4 != null) {
                                    Placeable.PlacementScope.xMQ(placementScope, placeable4, (Constraints.ty(j2) - placeableDR02.getWidth()) / 2, (Constraints.az(j2) - placeableDR02.getHeight()) / 2, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int i11 = ((i5 >> 6) & 14) | ((i5 << 3) & 112);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            int i12 = ((i11 << 6) & 896) | 6;
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
            function2.invoke(composerKN, Integer.valueOf((i12 >> 6) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$2
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
                    TimePickerKt.n(modifier2, f3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        final Modifier modifier2;
        final TimePickerState timePickerState2;
        final TimePickerColors timePickerColors2;
        int i5;
        boolean zE2;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-1898918107);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zE2 = composerKN.p5(timePickerState);
            } else {
                zE2 = composerKN.E2(timePickerState);
            }
            if (zE2) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.p5(timePickerColors)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            Measurable measurable = (Measurable) list.get(i9);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "Spacer")) {
                                final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, 0, 0, measureScope.How(TimePickerTokens.f29968n.HI()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    Object obj = list.get(i10);
                                    if (!Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "Spacer")) {
                                        arrayList.add(obj);
                                    }
                                }
                                final ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    arrayList2.add(((Measurable) arrayList.get(i11)).dR0(Constraints.nr(j2, 0, 0, 0, Constraints.gh(j2) / 2, 3, null)));
                                }
                                return MeasureScope.ER(measureScope, Constraints.qie(j2), Constraints.gh(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.1
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
                                        Placeable.PlacementScope.xMQ(placementScope, (Placeable) arrayList2.get(0), 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.xMQ(placementScope, (Placeable) arrayList2.get(1), 0, ((Placeable) arrayList2.get(0)).getHeight(), 0.0f, 4, null);
                                        Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, ((Placeable) arrayList2.get(0)).getHeight() - (placeableDR0.getHeight() / 2), 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            Shape shapeO = ShapesKt.O(TimePickerTokens.f29968n.gh(), composerKN, 6);
            Intrinsics.checkNotNull(shapeO, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeO;
            modifier2 = modifier;
            timePickerState2 = timePickerState;
            timePickerColors2 = timePickerColors;
            az(modifier2, timePickerState2, timePickerColors2, measurePolicy, ShapesKt.Uo(cornerBasedShape), ShapesKt.n(cornerBasedShape), composerKN, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    TimePickerKt.nY(modifier2, timePickerState2, timePickerColors2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue o(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pJg(int i2, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i3, Function1 function1) {
        int iDigitToInt;
        TextFieldValue textFieldValueO;
        if (Intrinsics.areEqual(textFieldValue.xMQ(), textFieldValue2.xMQ())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.xMQ().length() == 0) {
            if (TimePickerSelectionMode.J2(i2, TimePickerSelectionMode.INSTANCE.n())) {
                timePickerState.Uo(0);
            } else {
                timePickerState.KN(0);
            }
            function1.invoke(TextFieldValue.O(textFieldValue, "", 0L, null, 6, null));
            return;
        }
        try {
            if (textFieldValue.xMQ().length() == 3 && TextRange.ty(textFieldValue.getSelection()) == 1) {
                iDigitToInt = CharsKt.digitToInt(textFieldValue.xMQ().charAt(0));
            } else {
                iDigitToInt = Integer.parseInt(textFieldValue.xMQ());
            }
            if (iDigitToInt <= i3) {
                TimePickerSelectionMode.Companion companion = TimePickerSelectionMode.INSTANCE;
                if (TimePickerSelectionMode.J2(i2, companion.n())) {
                    timePickerState.Uo(iDigitToInt);
                    if (iDigitToInt > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.O(companion.rl());
                    }
                } else {
                    timePickerState.KN(iDigitToInt);
                }
                if (textFieldValue.xMQ().length() <= 2) {
                    textFieldValueO = textFieldValue;
                } else {
                    textFieldValueO = TextFieldValue.O(textFieldValue, String.valueOf(textFieldValue.xMQ().charAt(0)), 0L, null, 6, null);
                }
                function1.invoke(textFieldValueO);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    public static final int piY(TimePickerState timePickerState) {
        if (timePickerState.getIs24hour()) {
            return timePickerState.t() % 24;
        }
        if (timePickerState.t() % 12 == 0) {
            return 12;
        }
        if (timePickerState.mUb()) {
            return timePickerState.t() - 12;
        }
        return timePickerState.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final TimePickerState timePickerState, final TimePickerColors timePickerColors, Composer composer, final int i2) {
        int i3;
        int i5;
        boolean zE2;
        int i7;
        Composer composerKN = composer.KN(-934561141);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(timePickerState);
            } else {
                zE2 = composerKN.E2(timePickerState);
            }
            if (zE2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(timePickerColors)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.t(new ProvidedValue[]{TextKt.J2().nr(TypographyKt.t(TimePickerTokens.f29968n.aYN(), composerKN, 6)), CompositionLocalsKt.az().nr(LayoutDirection.f34160n)}, ComposableLambdaKt.nr(-477913269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$1
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
                    if ((i8 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-477913269, i8, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1132)");
                    }
                    TimePickerState timePickerState2 = timePickerState;
                    TimePickerColors timePickerColors2 = timePickerColors;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer2, 0);
                    int iN = ComposablesKt.n(composer2, 0);
                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer2, companion);
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
                    Updater.O(composerN, measurePolicyRl, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                    TimePickerTokens timePickerTokens = TimePickerTokens.f29968n;
                    Modifier modifierS = SizeKt.S(companion, timePickerTokens.WPU(), timePickerTokens.XQ());
                    int iPiY = TimePickerKt.piY(timePickerState2);
                    TimePickerSelectionMode.Companion companion3 = TimePickerSelectionMode.INSTANCE;
                    TimePickerKt.WPU(modifierS, iPiY, timePickerState2, companion3.n(), timePickerColors2, composer2, 3078);
                    TimePickerKt.xMQ(SizeKt.S(companion, TimePickerKt.f28558O, timePickerTokens.o()), composer2, 6);
                    TimePickerKt.WPU(SizeKt.S(companion, timePickerTokens.WPU(), timePickerTokens.XQ()), timePickerState2.rl(), timePickerState2, companion3.rl(), timePickerColors2, composer2, 3078);
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockDisplayNumbers$2
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
                    TimePickerKt.rl(timePickerState, timePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void t(final AnalogTimePickerState analogTimePickerState, final TimePickerColors timePickerColors, final boolean z2, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-1170157036);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(analogTimePickerState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(timePickerColors)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.n(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1170157036, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            CrossfadeKt.rl(analogTimePickerState.XQ(), z(SizeKt.Z(BackgroundKt.t(Modifier.INSTANCE, timePickerColors.getClockDialColor(), RoundedCornerShapeKt.J2()).Zmq(new ClockDialModifier(analogTimePickerState, z2, analogTimePickerState.J2(), null)), TimePickerTokens.f29968n.rl()), analogTimePickerState, timePickerColors), AnimationSpecKt.ty(200, 0, null, 6, null), null, ComposableLambdaKt.nr(-1022006568, true, new Function3<IntList, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(IntList intList, Composer composer2, Integer num) {
                    n(intList, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(final IntList intList, Composer composer2, int i9) {
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1022006568, i9, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1522)");
                    }
                    Modifier modifierNr = SemanticsModifierKt.nr(SizeKt.Z(Modifier.INSTANCE, TimePickerTokens.f29968n.rl()), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.B(semanticsPropertyReceiver);
                        }
                    }, 1, null);
                    float f3 = TimePickerKt.f28559n;
                    final TimePickerColors timePickerColors2 = timePickerColors;
                    final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
                    final boolean z3 = z2;
                    TimePickerKt.n(modifierNr, f3, ComposableLambdaKt.nr(-320307952, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-320307952, i10, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1526)");
                            }
                            ProvidedValue providedValueNr = ContentColorKt.n().nr(Color.xMQ(timePickerColors2.n(false)));
                            final IntList intList2 = intList;
                            final AnalogTimePickerState analogTimePickerState3 = analogTimePickerState2;
                            final boolean z4 = z3;
                            CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1992872400, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void n(Composer composer4, int i11) {
                                    if ((i11 & 3) == 2 && composer4.xMQ()) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1992872400, i11, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1529)");
                                    }
                                    composer4.eF(1547046870);
                                    int i12 = intList2.get_size();
                                    AnalogTimePickerState analogTimePickerState4 = analogTimePickerState3;
                                    IntList intList3 = intList2;
                                    boolean z5 = z4;
                                    for (final int i13 = 0; i13 < i12; i13++) {
                                        int iO = (!analogTimePickerState4.getIs24hour() || TimePickerSelectionMode.J2(analogTimePickerState4.J2(), TimePickerSelectionMode.INSTANCE.rl())) ? intList3.O(i13) : intList3.O(i13) % 12;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        boolean zT2 = composer4.t(i13);
                                        Object objIF = composer4.iF();
                                        if (zT2 || objIF == Composer.INSTANCE.n()) {
                                            objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$1$1$1
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
                                                    SemanticsPropertiesKt.hRu(semanticsPropertyReceiver, i13);
                                                }
                                            };
                                            composer4.o(objIF);
                                        }
                                        boolean z6 = z5;
                                        TimePickerKt.nr(SemanticsModifierKt.nr(companion, false, (Function1) objIF, 1, null), analogTimePickerState4, iO, z6, composer4, 0);
                                        z5 = z6;
                                    }
                                    composer4.Xw();
                                    if (TimePickerSelectionMode.J2(analogTimePickerState3.J2(), TimePickerSelectionMode.INSTANCE.n()) && analogTimePickerState3.getIs24hour()) {
                                        Modifier modifierT = BackgroundKt.t(SizeKt.Z(LayoutIdKt.rl(Modifier.INSTANCE, LayoutId.InnerCircle), TimePickerTokens.f29968n.rl()), Color.INSTANCE.J2(), RoundedCornerShapeKt.J2());
                                        float f4 = TimePickerKt.rl;
                                        final AnalogTimePickerState analogTimePickerState5 = analogTimePickerState3;
                                        final boolean z7 = z4;
                                        TimePickerKt.n(modifierT, f4, ComposableLambdaKt.nr(-205464413, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                n(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer5, int i14) {
                                                if ((i14 & 3) == 2 && composer5.xMQ()) {
                                                    composer5.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-205464413, i14, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1552)");
                                                }
                                                int i15 = TimePickerKt.qie.get_size();
                                                AnalogTimePickerState analogTimePickerState6 = analogTimePickerState5;
                                                boolean z9 = z7;
                                                for (final int i16 = 0; i16 < i15; i16++) {
                                                    int iO2 = TimePickerKt.qie.O(i16);
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    boolean zT3 = composer5.t(i16);
                                                    Object objIF2 = composer5.iF();
                                                    if (zT3 || objIF2 == Composer.INSTANCE.n()) {
                                                        objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
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
                                                                SemanticsPropertiesKt.hRu(semanticsPropertyReceiver, 12 + i16);
                                                            }
                                                        };
                                                        composer5.o(objIF2);
                                                    }
                                                    TimePickerKt.nr(SemanticsModifierKt.nr(companion2, false, (Function1) objIF2, 1, null), analogTimePickerState6, iO2, z9, composer5, 0);
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer4, 54), composer4, 432, 0);
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54), composer2, 432, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 24960, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    TimePickerKt.t(analogTimePickerState, timePickerColors, z2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(final TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, Composer composer, final int i2, final int i3) {
        int i5;
        boolean zE2;
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(-760850373);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(timePickerState);
            } else {
                zE2 = composerKN.E2(timePickerState);
            }
            if (zE2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0 && composerKN.p5(timePickerColors)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            composerKN.e();
            if ((i2 & 1) != 0 && !composerKN.rV9()) {
                composerKN.wTp();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                HI(modifier, timePickerColors, timePickerState, composerKN, ((i5 >> 3) & 126) | ((i5 << 6) & 896));
                if (ComposerKt.v()) {
                }
            } else {
                if (i10 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    timePickerColors = TimePickerDefaults.f28557n.n(composerKN, 6);
                    i5 &= -897;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(-760850373, i5, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:260)");
                }
                HI(modifier, timePickerColors, timePickerState, composerKN, ((i5 >> 3) & 126) | ((i5 << 6) & 896));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }
        final Modifier modifier2 = modifier;
        final TimePickerColors timePickerColors2 = timePickerColors;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$TimeInput$1
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
                    TimePickerKt.ty(timePickerState, modifier2, timePickerColors2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
