package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a½\u0001\u0010&\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152:\u0010\u001c\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00070\u00172!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a²\u0001\u0010(\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00112:\u0010\u001c\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00070\u00172!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b(\u0010)\u001a²\u0001\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112:\u0010\u001c\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00070\u00172!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b,\u0010-\u001ag\u00101\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010\u00112\b\u00100\u001a\u0004\u0018\u00010\u00112:\u0010\u001c\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00070\u0017H\u0002¢\u0006\u0004\b1\u00102\u001a&\u00108\u001a\u00020\u0007*\u0002032\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a5\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010\u0001\u001a\u00020*2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0002¢\u0006\u0004\bA\u0010B\"\u001a\u0010G\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010F\"\u0014\u0010H\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010D\"\u0014\u0010I\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010D\"\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010K\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", c.f62177j, "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "startDateMillis", "endDateMillis", "onDatesSelectionChange", "Lkotlin/Function1;", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "t", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "rl", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "nr", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "HI", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "az", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "LGJW/vd;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "qie", "(Landroidx/compose/foundation/lazy/LazyListState;LGJW/vd;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "ty", "()Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "Landroidx/compose/ui/unit/Dp;", "F", "HeaderHeightOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1072:1\n1223#2,6:1073\n1223#2,6:1079\n1223#2,6:1086\n1223#2,6:1092\n1223#2,6:1138\n1223#2,6:1144\n56#3:1085\n85#4:1098\n82#4,6:1099\n88#4:1133\n92#4:1137\n78#5,6:1105\n85#5,4:1120\n89#5,2:1130\n93#5:1136\n368#6,9:1111\n377#6:1132\n378#6,2:1134\n4032#7,6:1124\n57#8,4:1150\n57#8,4:1154\n148#9:1158\n148#9:1159\n148#9:1160\n148#9:1161\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n96#1:1073,6\n116#1:1079,6\n264#1:1086,6\n726#1:1092,6\n771#1:1138,6\n854#1:1144,6\n135#1:1085\n734#1:1098\n734#1:1099,6\n734#1:1133\n734#1:1137\n734#1:1105,6\n734#1:1120,4\n734#1:1130,2\n734#1:1136\n734#1:1111,9\n734#1:1132\n734#1:1134,2\n734#1:1124,6\n974#1:1150,4\n975#1:1154,4\n885#1:1158\n1064#1:1159\n1066#1:1160\n1071#1:1161\n*E\n"})
public final class DateRangePickerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PaddingValues f25539n = PaddingKt.O(Dp.KN(24), Dp.KN(20), 0.0f, Dp.KN(8), 4, null);
    private static final float nr = Dp.KN(60);
    private static final PaddingValues rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final PaddingValues f25540t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(long j2, Long l2, Long l5, Function2 function2) {
        if ((l2 == null && l5 == null) || (l2 != null && l5 != null)) {
            function2.invoke(Long.valueOf(j2), null);
        } else if (l2 == null || j2 < l2.longValue()) {
            function2.invoke(Long.valueOf(j2), null);
        } else {
            function2.invoke(l2, Long.valueOf(j2));
        }
    }

    static {
        float f3 = 64;
        float f4 = 12;
        rl = PaddingKt.O(Dp.KN(f3), 0.0f, Dp.KN(f4), 0.0f, 10, null);
        f25540t = PaddingKt.O(Dp.KN(f3), 0.0f, Dp.KN(f4), Dp.KN(f4), 2, null);
    }

    public static final void az(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j2) {
        float fL = contentDrawScope.l(DatePickerKt.N());
        float fL2 = contentDrawScope.l(DatePickerKt.N());
        float fL3 = contentDrawScope.l(DatePickerModalTokens.f29490n.xMQ());
        float f3 = 2;
        float f4 = (fL2 - fL3) / f3;
        float f5 = 7;
        float fGh = (Size.gh(contentDrawScope.t()) - (f5 * fL)) / f5;
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int iGh = IntOffset.gh(gridStartCoordinates);
        int iQie = IntOffset.qie(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int iGh2 = IntOffset.gh(gridEndCoordinates);
        int iQie2 = IntOffset.qie(gridEndCoordinates);
        float f6 = iGh;
        float f7 = fL + fGh;
        float f8 = fGh / f3;
        float fGh2 = (f6 * f7) + (selectedRangeInfo.getFirstIsSelectionStart() ? fL / f3 : 0.0f) + f8;
        float f9 = (iQie * fL2) + f4;
        float f10 = iGh2 * f7;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            fL /= f3;
        }
        float fGh3 = f10 + fL + f8;
        float f11 = (iQie2 * fL2) + f4;
        boolean z2 = contentDrawScope.getLayoutDirection() == LayoutDirection.f34161t;
        if (z2) {
            fGh2 = Size.gh(contentDrawScope.t()) - fGh2;
            fGh3 = Size.gh(contentDrawScope.t()) - fGh3;
        }
        float fGh4 = fGh3;
        DrawScope.h(contentDrawScope, j2, OffsetKt.n(fGh2, f9), SizeKt.n(iQie == iQie2 ? fGh4 - fGh2 : z2 ? -fGh2 : Size.gh(contentDrawScope.t()) - fGh2, fL3), 0.0f, null, null, 0, b.f61769v, null);
        if (iQie != iQie2) {
            for (int i2 = (iQie2 - iQie) - 1; i2 > 0; i2--) {
                DrawScope.h(contentDrawScope, j2, OffsetKt.n(0.0f, f9 + (i2 * fL2)), SizeKt.n(Size.gh(contentDrawScope.t()), fL3), 0.0f, null, null, 0, b.f61769v, null);
            }
            long jN = OffsetKt.n(contentDrawScope.getLayoutDirection() == LayoutDirection.f34160n ? 0.0f : Size.gh(contentDrawScope.t()), f11);
            if (z2) {
                fGh4 -= Size.gh(contentDrawScope.t());
            }
            DrawScope.h(contentDrawScope, j2, jN, SizeKt.n(fGh4, fL3), 0.0f, null, null, 0, b.f61769v, null);
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
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021d  */
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
    public static final void n(final DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, Function2 function2, Function2 function22, boolean z2, DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
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
        Composer composerKN = composer.KN(650830774);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(dateRangePickerState) ? 4 : 2) | i2;
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
                                    function2Nr = ComposableLambdaKt.nr(-162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$2
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
                                                ComposerKt.p5(-162164694, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:97)");
                                            }
                                            DateRangePickerDefaults.f25512n.t(dateRangePickerState.O(), PaddingKt.KN(Modifier.INSTANCE, DateRangePickerKt.rl), composer3, 432, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                } else {
                                    i10 = 54;
                                }
                                if (i8 != 0) {
                                    function2Nr2 = ComposableLambdaKt.nr(-185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$3
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
                                                ComposerKt.p5(-185279404, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:103)");
                                            }
                                            DateRangePickerDefaults.f25512n.rl(dateRangePickerState.mUb(), dateRangePickerState.Uo(), dateRangePickerState.O(), datePickerFormatter3, PaddingKt.KN(Modifier.INSTANCE, DateRangePickerKt.f25540t), composer3, 221184, 0);
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
                                    ComposerKt.p5(650830774, i5, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:113)");
                                }
                                localeN = CalendarLocale_androidKt.n(composerKN, 0);
                                zP5 = composerKN.p5(localeN);
                                objIF = composerKN.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = CalendarModel_androidKt.n(localeN);
                                    composerKN.o(objIF);
                                }
                                final CalendarModel calendarModel = (CalendarModel) objIF;
                                composerKN.eF(-1454747621);
                                ComposableLambda composableLambdaNr = !z4 ? ComposableLambdaKt.nr(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
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
                                            ComposerKt.p5(-1490010652, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                                        }
                                        Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, DatePickerKt.T());
                                        int iO = dateRangePickerState.O();
                                        boolean zP52 = composer3.p5(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    n(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(int i15) {
                                                    dateRangePickerState2.nr(i15);
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
                                TextStyle textStyleT = TypographyKt.t(datePickerModalTokens.S(), composerKN, 6);
                                float fKN = Dp.KN(datePickerModalTokens.XQ() - nr);
                                DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
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
                                            ComposerKt.p5(-57534331, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                                        }
                                        Long lMUb = dateRangePickerState.mUb();
                                        Long lUo = dateRangePickerState.Uo();
                                        long jJ2 = dateRangePickerState.J2();
                                        int iO = dateRangePickerState.O();
                                        boolean zP52 = composer3.p5(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2, Long l5) {
                                                    n(l2, l5);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Long l2, Long l5) {
                                                    try {
                                                        dateRangePickerState2.KN(l2, l5);
                                                    } catch (IllegalArgumentException unused) {
                                                    }
                                                }
                                            };
                                            composer3.o(objIF3);
                                        }
                                        Function2 function25 = (Function2) objIF3;
                                        boolean zP53 = composer3.p5(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                        Object objIF4 = composer3.iF();
                                        if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                    n(l2.longValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(long j2) {
                                                    dateRangePickerState3.n(j2);
                                                }
                                            };
                                            composer3.o(objIF4);
                                        }
                                        DateRangePickerKt.t(lMUb, lUo, jJ2, iO, function25, (Function1) objIF4, calendarModel, dateRangePickerState.t(), datePickerFormatter3, dateRangePickerState.rl(), datePickerColorsT, composer3, 0, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                int i14 = ((i5 >> 3) & 14) | 14155776;
                                int i15 = i5 >> 6;
                                composer2 = composerKN;
                                DatePickerKt.n(modifier4, function23, function2Nr2, composableLambdaNr, datePickerColorsT, textStyleT, fKN, composableLambdaNr2, composer2, i14 | (i15 & 112) | (i15 & 896) | (i15 & 57344));
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
                                composerKN.eF(-1454747621);
                                ComposableLambda composableLambdaNr3 = !z4 ? ComposableLambdaKt.nr(-1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4
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
                                            ComposerKt.p5(-1490010652, i142, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:123)");
                                        }
                                        Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, DatePickerKt.T());
                                        int iO = dateRangePickerState.O();
                                        boolean zP52 = composer3.p5(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    n(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(int i152) {
                                                    dateRangePickerState2.nr(i152);
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
                                TextStyle textStyleT2 = TypographyKt.t(datePickerModalTokens2.S(), composerKN, 6);
                                float fKN2 = Dp.KN(datePickerModalTokens2.XQ() - nr);
                                DatePickerFormatter datePickerFormatter42 = datePickerFormatter3;
                                ComposableLambda composableLambdaNr22 = ComposableLambdaKt.nr(-57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5
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
                                            ComposerKt.p5(-57534331, i142, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                                        }
                                        Long lMUb = dateRangePickerState.mUb();
                                        Long lUo = dateRangePickerState.Uo();
                                        long jJ2 = dateRangePickerState.J2();
                                        int iO = dateRangePickerState.O();
                                        boolean zP52 = composer3.p5(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objIF3 = composer3.iF();
                                        if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2, Long l5) {
                                                    n(l2, l5);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Long l2, Long l5) {
                                                    try {
                                                        dateRangePickerState2.KN(l2, l5);
                                                    } catch (IllegalArgumentException unused) {
                                                    }
                                                }
                                            };
                                            composer3.o(objIF3);
                                        }
                                        Function2 function25 = (Function2) objIF3;
                                        boolean zP53 = composer3.p5(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                        Object objIF4 = composer3.iF();
                                        if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                    n(l2.longValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(long j2) {
                                                    dateRangePickerState3.n(j2);
                                                }
                                            };
                                            composer3.o(objIF4);
                                        }
                                        DateRangePickerKt.t(lMUb, lUo, jJ2, iO, function25, (Function1) objIF4, calendarModel2, dateRangePickerState.t(), datePickerFormatter3, dateRangePickerState.rl(), datePickerColorsT, composer3, 0, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                int i142 = ((i5 >> 3) & 14) | 14155776;
                                int i152 = i5 >> 6;
                                composer2 = composerKN;
                                DatePickerKt.n(modifier42, function23, function2Nr2, composableLambdaNr3, datePickerColorsT, textStyleT2, fKN2, composableLambdaNr22, composer2, i142 | (i152 & 112) | (i152 & 896) | (i152 & 57344));
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
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$6
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
                                    DateRangePickerKt.n(dateRangePickerState, modifier3, datePickerFormatter2, function24, function25, z5, datePickerColors3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(LazyListState lazyListState, final Long l2, final Long l5, final Function2 function2, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Long l6;
        Long l7;
        Function2 function22;
        Object dateRangePickerKt$VerticalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerKN = composer.KN(1257365001);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(lazyListState2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l6 = l2;
            i3 |= composerKN.p5(l6) ? 32 : 16;
        } else {
            l6 = l2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            l7 = l5;
            i3 |= composerKN.p5(l7) ? 256 : 128;
        } else {
            l7 = l5;
        }
        if ((i2 & 3072) == 0) {
            function22 = function2;
            i3 |= composerKN.E2(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.p5(selectableDates) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerKN.p5(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1257365001, i3, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:767)");
            }
            final CalendarDate calendarDateXMQ = calendarModel.xMQ();
            boolean zP5 = composerKN.p5(intRange);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = calendarModel.J2(intRange.getFirst(), 1);
                composerKN.o(objIF);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objIF;
            final Long l8 = l6;
            final Function2 function23 = function22;
            int i5 = i3;
            final Long l9 = l7;
            TextKt.n(TypographyKt.t(DatePickerModalTokens.f29490n.J2(), composerKN, 6), ComposableLambdaKt.nr(1090773432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1
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
                        ComposerKt.p5(1090773432, i7, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:777)");
                    }
                    Object objIF2 = composer2.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF2 == companion.n()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.o(compositionScopedCoroutineScopeCanceller);
                        objIF2 = compositionScopedCoroutineScopeCanceller;
                    }
                    vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF2).getCoroutineScope();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    String strN = Strings_androidKt.n(Strings.n(R.string.f27128T), composer2, 0);
                    String strN2 = Strings_androidKt.n(Strings.n(R.string.f27130X), composer2, 0);
                    boolean zP52 = composer2.p5(l8) | composer2.p5(l9) | composer2.p5(function23);
                    final Long l10 = l8;
                    final Long l11 = l9;
                    final Function2 function24 = function23;
                    Object objIF3 = composer2.iF();
                    if (zP52 || objIF3 == companion.n()) {
                        objIF3 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l12) {
                                n(l12.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(long j2) {
                                DateRangePickerKt.HI(j2, l10, l11, function24);
                            }
                        };
                        composer2.o(objIF3);
                    }
                    final Function1 function12 = (Function1) objIF3;
                    final List listQie = DateRangePickerKt.qie(lazyListState2, coroutineScope, strN, strN2);
                    Modifier modifierNr = SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.UhV(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    boolean zE2 = composer2.E2(intRange) | composer2.E2(calendarModel) | composer2.p5(calendarMonth) | composer2.E2(datePickerFormatter) | composer2.E2(listQie) | composer2.p5(datePickerColors) | composer2.p5(l8) | composer2.p5(l9) | composer2.p5(function12) | composer2.p5(calendarDateXMQ) | composer2.p5(selectableDates);
                    final IntRange intRange2 = intRange;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Long l12 = l8;
                    final Long l13 = l9;
                    final CalendarDate calendarDate = calendarDateXMQ;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objIF4 = composer2.iF();
                    if (zE2 || objIF4 == companion.n()) {
                        Object obj = new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
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
                                final Long l14 = l12;
                                final Long l15 = l13;
                                final Function1 function13 = function12;
                                final CalendarDate calendarDate2 = calendarDate;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                final List list = listQie;
                                LazyListScope.nr(lazyListScope, iNHg, null, null, ComposableLambdaKt.rl(-1413501381, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
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
                                        Long l16;
                                        SelectedRangeInfo selectedRangeInfo;
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
                                            ComposerKt.p5(-1413501381, i10, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:810)");
                                        }
                                        final CalendarMonth calendarMonthQie = calendarModel3.qie(calendarMonth3, i8);
                                        Modifier modifierN = LazyItemScope.n(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
                                        Long l17 = l14;
                                        Long l18 = l15;
                                        Function1 function14 = function13;
                                        CalendarDate calendarDate3 = calendarDate2;
                                        final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                        SelectableDates selectableDates4 = selectableDates3;
                                        final DatePickerColors datePickerColors4 = datePickerColors3;
                                        final List list2 = list;
                                        CalendarModel calendarModel4 = calendarModel3;
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
                                        TextKt.n(TypographyKt.t(DatePickerModalTokens.f29490n.aYN(), composer3, 6), ComposableLambdaKt.nr(1622100276, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i11) {
                                                if ((i11 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1622100276, i11, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:813)");
                                                }
                                                String strRl = datePickerFormatter4.rl(Long.valueOf(calendarMonthQie.getStartUtcTimeMillis()), CalendarLocale_androidKt.n(composer4, 0));
                                                if (strRl == null) {
                                                    strRl = "-";
                                                }
                                                Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, DateRangePickerKt.ty());
                                                boolean zE22 = composer4.E2(list2);
                                                final List list3 = list2;
                                                Object objIF5 = composer4.iF();
                                                if (zE22 || objIF5 == Composer.INSTANCE.n()) {
                                                    objIF5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1
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
                                                            SemanticsPropertiesKt.Nxk(semanticsPropertyReceiver, list3);
                                                        }
                                                    };
                                                    composer4.o(objIF5);
                                                }
                                                TextKt.t(strRl, SemanticsModifierKt.nr(modifierKN, false, (Function1) objIF5, 1, null), datePickerColors4.getSubheadContentColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131064);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer3, 48);
                                        composer3.eF(2125334733);
                                        if (l17 == null || l18 == null) {
                                            l16 = l17;
                                            selectedRangeInfo = null;
                                        } else {
                                            boolean zP53 = composer3.p5(l17) | composer3.p5(l18);
                                            Object objIF5 = composer3.iF();
                                            if (zP53 || objIF5 == Composer.INSTANCE.n()) {
                                                l16 = l17;
                                                objIF5 = SelectedRangeInfo.INSTANCE.n(calendarMonthQie, calendarModel4.rl(l16.longValue()), calendarModel4.rl(l18.longValue()));
                                                composer3.o(objIF5);
                                            } else {
                                                l16 = l17;
                                            }
                                            selectedRangeInfo = (SelectedRangeInfo) objIF5;
                                        }
                                        composer3.Xw();
                                        DatePickerKt.mUb(calendarMonthQie, function14, calendarDate3.getUtcTimeMillis(), l16, l18, selectedRangeInfo, datePickerFormatter4, selectableDates4, datePickerColors4, composer3, 0);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.o(obj);
                        objIF4 = obj;
                    }
                    LazyDslKt.t(modifierNr, lazyListState3, null, false, null, null, null, false, (Function1) objIF4, composer2, 0, 252);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 48);
            int i7 = i5 & 14;
            boolean zE2 = (i7 == 4) | ((57344 & i5) == 16384) | composerKN.E2(calendarModel) | composerKN.E2(intRange);
            Object objIF2 = composerKN.iF();
            if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, function1, calendarModel, intRange, null);
                composerKN.o(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = objIF2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.O(lazyListState2, (Function2) dateRangePickerKt$VerticalMonthsList$2$1, composerKN, i7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3
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
                    DateRangePickerKt.nr(lazyListState2, l2, l5, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List qie(final LazyListState lazyListState, final vd vdVar, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1046}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f25646n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ LazyListState f25647t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation continuation) {
                    super(2, continuation);
                    this.f25647t = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f25647t, continuation);
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
                    int i2 = this.f25646n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.f25647t;
                        int iO = lazyListState.o() - 1;
                        this.f25646n = 1;
                        if (LazyListState.nHg(lazyListState, iO, 0, this, 2, null) == coroutine_suspended) {
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
                if (lazyListState.nr()) {
                    GJW.C.nr(vdVar, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1054}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f25642n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ LazyListState f25643t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation continuation) {
                    super(2, continuation);
                    this.f25643t = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f25643t, continuation);
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
                    int i2 = this.f25642n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.f25643t;
                        int iO = lazyListState.o() + 1;
                        this.f25642n = 1;
                        if (LazyListState.nHg(lazyListState, iO, 0, this, 2, null) == coroutine_suspended) {
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
                if (lazyListState.J2()) {
                    GJW.C.nr(vdVar, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        })});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Long l2, final Long l5, final long j2, final Function2 function2, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Long l6;
        Function2 function22;
        Function1 function12;
        SelectableDates selectableDates2;
        Object obj;
        Composer composerKN = composer.KN(-787063721);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l6 = l5;
            i3 |= composerKN.p5(l6) ? 32 : 16;
        } else {
            l6 = l5;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function22 = function2;
            i3 |= composerKN.E2(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i2 & 24576) == 0) {
            function12 = function1;
            i3 |= composerKN.E2(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            selectableDates2 = selectableDates;
            i3 |= composerKN.p5(selectableDates2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i3 |= composerKN.p5(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-787063721, i3, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:719)");
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast(calendarModel.Uo(j2).Uo(intRange), 0);
            LazyListState lazyListStateRl = LazyListStateKt.rl(iCoerceAtLeast, 0, composerKN, 0, 2);
            Integer numValueOf = Integer.valueOf(iCoerceAtLeast);
            boolean zP5 = composerKN.p5(lazyListStateRl) | composerKN.t(iCoerceAtLeast);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                obj = null;
                objIF = new DateRangePickerKt$DateRangePickerContent$1$1(lazyListStateRl, iCoerceAtLeast, null);
                composerKN.o(objIF);
            } else {
                obj = null;
            }
            EffectsKt.O(numValueOf, (Function2) objIF, composerKN, 0);
            Modifier modifierGh = PaddingKt.gh(Modifier.INSTANCE, DatePickerKt.X(), 0.0f, 2, obj);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
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
            DatePickerKt.az(datePickerColors, calendarModel, composerKN, ((i3 >> 27) & 14) | ((i3 >> 12) & 112));
            nr(lazyListStateRl, l2, l6, function22, function12, calendarModel, intRange, datePickerFormatter, selectableDates2, datePickerColors, composerKN, ((i3 << 3) & 1008) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (1879048192 & i3));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$3
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
                    DateRangePickerKt.rl(l2, l5, j2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final Long l2, final Long l5, final long j2, final int i2, final Function2 function2, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i3, final int i5) {
        int i7;
        Long l6;
        long j3;
        Function2 function22;
        Function1 function12;
        CalendarModel calendarModel2;
        IntRange intRange2;
        int i8;
        Composer composer2;
        Composer composerKN = composer.KN(-532789335);
        if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(l2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            l6 = l5;
            i7 |= composerKN.p5(l6) ? 32 : 16;
        } else {
            l6 = l5;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            j3 = j2;
            i7 |= composerKN.nr(j3) ? 256 : 128;
        } else {
            j3 = j2;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.t(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            function22 = function2;
            i7 |= composerKN.E2(function22) ? 16384 : 8192;
        } else {
            function22 = function2;
        }
        if ((196608 & i3) == 0) {
            function12 = function1;
            i7 |= composerKN.E2(function12) ? 131072 : 65536;
        } else {
            function12 = function1;
        }
        if ((1572864 & i3) == 0) {
            calendarModel2 = calendarModel;
            i7 |= composerKN.E2(calendarModel2) ? 1048576 : 524288;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((12582912 & i3) == 0) {
            intRange2 = intRange;
            i7 |= composerKN.E2(intRange2) ? 8388608 : 4194304;
        } else {
            intRange2 = intRange;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= (i3 & 134217728) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i7 |= composerKN.p5(selectableDates) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerKN.p5(datePickerColors) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i7 & 306783379) == 306783378 && (i8 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-532789335, i7, i8, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:665)");
            }
            final Long l7 = l6;
            final Function2 function23 = function22;
            final IntRange intRange3 = intRange2;
            final long j4 = j3;
            final Function1 function13 = function12;
            final CalendarModel calendarModel3 = calendarModel2;
            composer2 = composerKN;
            CrossfadeKt.rl(DisplayMode.t(i2), SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.D(semanticsPropertyReceiver, true);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    n(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }, 1, null), AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null), null, ComposableLambdaKt.nr(-1026642619, true, new Function3<DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void n(int i9, Composer composer3, int i10) {
                    int i11;
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer3.t(i9) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1026642619, i11, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:677)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.J2(i9, companion.rl())) {
                        composer3.eF(-1871299185);
                        DateRangePickerKt.rl(l2, l7, j4, function23, function13, calendarModel3, intRange3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.Xw();
                    } else if (DisplayMode.J2(i9, companion.n())) {
                        composer3.eF(-1871277944);
                        DateRangeInputKt.n(l2, l7, function23, calendarModel3, intRange3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.Xw();
                    } else {
                        composer3.eF(2120399965);
                        composer3.Xw();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode, Composer composer3, Integer num) {
                    n(displayMode.getValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerKN, 54), composer2, ((i7 >> 9) & 14) | 24960, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
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
                    DateRangePickerKt.t(l2, l5, j2, i2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    public static final PaddingValues ty() {
        return f25539n;
    }
}
