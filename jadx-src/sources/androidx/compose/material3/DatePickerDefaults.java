package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.exoplayer.RendererCapabilities;
import com.facebook.ads.AdError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u0018\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u00020\u0004*\u0002018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058G¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/DatePickerColors;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "Landroidx/compose/material3/DatePickerFormatter;", "nr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/DatePickerFormatter;", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/ui/Modifier;", "modifier", "", "rl", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "selectedDateMillis", "dateFormatter", c.f62177j, "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/FlingBehavior;", "xMQ", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "YearRange", "Landroidx/compose/ui/unit/Dp;", "F", "KN", "()F", "TonalElevation", "Landroidx/compose/material3/SelectableDates;", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "AllDates", "Landroidx/compose/material3/ColorScheme;", "J2", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "defaultDatePickerColors", "Landroidx/compose/ui/graphics/Shape;", "Uo", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2272:1\n1#2:2273\n84#3:2274\n123#3:2275\n111#3:2276\n135#3:2277\n87#3:2278\n126#3:2279\n108#3:2280\n132#3:2281\n1223#4,6:2282\n1223#4,6:2288\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n633#1:2274\n635#1:2275\n666#1:2276\n667#1:2277\n674#1:2278\n675#1:2279\n681#1:2280\n682#1:2281\n689#1:2282,6\n709#1:2288,6\n*E\n"})
public final class DatePickerDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DatePickerDefaults f25177n = new DatePickerDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final IntRange YearRange = new IntRange(1900, AdError.BROKEN_MEDIA_ERROR_CODE);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float TonalElevation = ElevationTokens.f29511n.n();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    public final FlingBehavior xMQ(LazyListState lazyListState, DecayAnimationSpec decayAnimationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.t(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-2036003494, i2, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
        }
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.p5(lazyListState)) || (i2 & 6) == 4) | composer.p5(decayAnimationSpec);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            final SnapLayoutInfoProvider snapLayoutInfoProviderRl = LazyListSnapLayoutInfoProviderKt.rl(lazyListState, null, 2, null);
            objIF = SnapFlingBehaviorKt.HI(new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float n(float velocity) {
                    return snapLayoutInfoProviderRl.n(velocity);
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float rl(float velocity, float decayOffset) {
                    return 0.0f;
                }
            }, decayAnimationSpec, AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null));
            composer.o(objIF);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return targetedFlingBehavior;
    }

    public static /* synthetic */ DatePickerFormatter O(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "yMMMM";
        }
        if ((i2 & 2) != 0) {
            str2 = "yMMMd";
        }
        if ((i2 & 4) != 0) {
            str3 = "yMMMMEEEEd";
        }
        return datePickerDefaults.nr(str, str2, str3);
    }

    public final DatePickerColors J2(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1180555308, i2, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
        }
        DatePickerColors defaultDatePickerColorsCached = colorScheme.getDefaultDatePickerColorsCached();
        composer.eF(-653681037);
        if (defaultDatePickerColorsCached == null) {
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.f29490n;
            DatePickerColors datePickerColors = new DatePickerColors(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.n()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.r()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.ck()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.X()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.WPU()), colorScheme.getOnSurfaceVariant(), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.e()), Color.az(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.az()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.fD()), Color.az(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.fD()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.iF()), Color.az(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.iF()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.ty()), Color.az(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.ty()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.KN()), Color.az(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.KN()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.Uo()), Color.az(ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.Uo()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.az()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.gh()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.Z()), ColorSchemeKt.Uo(colorScheme, datePickerModalTokens.ViF()), ColorSchemeKt.Uo(colorScheme, DividerTokens.f29498n.n()), OutlinedTextFieldDefaults.f26813n.KN(colorScheme, composer, (i2 & 14) | 48), null);
            colorScheme.HV(datePickerColors);
            defaultDatePickerColorsCached = datePickerColors;
        }
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultDatePickerColorsCached;
    }

    public final float KN() {
        return TonalElevation;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final Long l2, final int i2, final DatePickerFormatter datePickerFormatter, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        String strN;
        String strT;
        DisplayMode.Companion companion;
        final String str;
        boolean zP5;
        Object objIF;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1502835813);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(l2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= (i3 & 512) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 256 : 128;
        }
        int i8 = i5 & 8;
        if (i8 == 0) {
            if ((i3 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i7 & 1171) == 1170 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1502835813, i7, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)");
                }
                Locale localeN = CalendarLocale_androidKt.n(composerKN, 0);
                strN = DatePickerFormatter.n(datePickerFormatter, l2, localeN, false, 4, null);
                strT = datePickerFormatter.t(l2, localeN, true);
                composerKN.eF(1148835145);
                String strN2 = "";
                if (strT == null) {
                    DisplayMode.Companion companion2 = DisplayMode.INSTANCE;
                    if (DisplayMode.J2(i2, companion2.rl())) {
                        composerKN.eF(1148842944);
                        Strings.Companion companion3 = Strings.INSTANCE;
                        strT = Strings_androidKt.n(Strings.n(R.string.Ik), composerKN, 0);
                        composerKN.Xw();
                    } else if (DisplayMode.J2(i2, companion2.n())) {
                        composerKN.eF(1148845915);
                        Strings.Companion companion4 = Strings.INSTANCE;
                        strT = Strings_androidKt.n(Strings.n(R.string.qie), composerKN, 0);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(1254558033);
                        composerKN.Xw();
                        strT = "";
                    }
                }
                composerKN.Xw();
                composerKN.eF(1148850481);
                if (strN == null) {
                    DisplayMode.Companion companion5 = DisplayMode.INSTANCE;
                    if (DisplayMode.J2(i2, companion5.rl())) {
                        composerKN.eF(1148853330);
                        Strings.Companion companion6 = Strings.INSTANCE;
                        strN = Strings_androidKt.n(Strings.n(R.string.ty), composerKN, 0);
                        composerKN.Xw();
                    } else if (DisplayMode.J2(i2, companion5.n())) {
                        composerKN.eF(1148855857);
                        Strings.Companion companion7 = Strings.INSTANCE;
                        strN = Strings_androidKt.n(Strings.n(R.string.J2), composerKN, 0);
                        composerKN.Xw();
                    } else {
                        composerKN.eF(1254856625);
                        composerKN.Xw();
                        strN = "";
                    }
                }
                composerKN.Xw();
                companion = DisplayMode.INSTANCE;
                if (!DisplayMode.J2(i2, companion.rl())) {
                    composerKN.eF(1148862013);
                    Strings.Companion companion8 = Strings.INSTANCE;
                    strN2 = Strings_androidKt.n(Strings.n(R.string.HI), composerKN, 0);
                    composerKN.Xw();
                } else if (DisplayMode.J2(i2, companion.n())) {
                    composerKN.eF(1148864764);
                    Strings.Companion companion9 = Strings.INSTANCE;
                    strN2 = Strings_androidKt.n(Strings.n(R.string.Uo), composerKN, 0);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1255139345);
                    composerKN.Xw();
                }
                str = String.format(strN2, Arrays.copyOf(new Object[]{strT}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                zP5 = composerKN.p5(str);
                objIF = composerKN.iF();
                if (!zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1
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
                            SemanticsPropertiesKt.I(semanticsPropertyReceiver, str);
                        }
                    };
                    composerKN.o(objIF);
                }
                Modifier modifier5 = modifier4;
                composer2 = composerKN;
                TextKt.t(strN, SemanticsModifierKt.nr(modifier4, false, (Function1) objIF, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 3072, 122876);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$2
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
                        this.f25182n.n(l2, i2, datePickerFormatter, modifier3, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                    }
                });
                return;
            }
            return;
        }
        i7 |= 3072;
        modifier2 = modifier;
        if ((i7 & 1171) == 1170) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Locale localeN2 = CalendarLocale_androidKt.n(composerKN, 0);
            strN = DatePickerFormatter.n(datePickerFormatter, l2, localeN2, false, 4, null);
            strT = datePickerFormatter.t(l2, localeN2, true);
            composerKN.eF(1148835145);
            String strN22 = "";
            if (strT == null) {
            }
            composerKN.Xw();
            composerKN.eF(1148850481);
            if (strN == null) {
            }
            composerKN.Xw();
            companion = DisplayMode.INSTANCE;
            if (!DisplayMode.J2(i2, companion.rl())) {
            }
            str = String.format(strN22, Arrays.copyOf(new Object[]{strT}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            zP5 = composerKN.p5(str);
            objIF = composerKN.iF();
            if (!zP5) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1
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
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, str);
                    }
                };
                composerKN.o(objIF);
                Modifier modifier52 = modifier4;
                composer2 = composerKN;
                TextKt.t(strN, SemanticsModifierKt.nr(modifier4, false, (Function1) objIF, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composer2, 0, 3072, 122876);
                if (ComposerKt.v()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public final DatePickerFormatter nr(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        return new DatePickerFormatterImpl(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(final int i2, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        DisplayMode.Companion companion;
        Composer composer2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(327413563);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.t(i2) ? 4 : 2);
        } else {
            i7 = i3;
        }
        int i8 = i5 & 2;
        if (i8 == 0) {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i7 & 19) == 18 || !composerKN.xMQ()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(327413563, i7, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)");
                }
                companion = DisplayMode.INSTANCE;
                if (DisplayMode.J2(i2, companion.rl())) {
                    Modifier modifier6 = modifier5;
                    composer2 = composerKN;
                    if (DisplayMode.J2(i2, companion.n())) {
                        composer2.eF(406443211);
                        Strings.Companion companion2 = Strings.INSTANCE;
                        int i9 = i7 & 112;
                        modifier3 = modifier6;
                        TextKt.t(Strings_androidKt.n(Strings.n(R.string.az), composer2, 0), modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, i9, 0, 131068);
                        composer2.Xw();
                    } else {
                        modifier3 = modifier6;
                        composer2.eF(-285079389);
                        composer2.Xw();
                    }
                } else {
                    composerKN.eF(406439148);
                    Strings.Companion companion3 = Strings.INSTANCE;
                    int i10 = i7 & 112;
                    modifier3 = modifier5;
                    TextKt.t(Strings_androidKt.n(Strings.n(R.string.nY), composerKN, 0), modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, i10, 0, 131068);
                    composer2 = composerKN;
                    composer2.Xw();
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier4 = modifier3;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier4 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerTitle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i11) {
                        this.f25187n.rl(i2, modifier4, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                    }
                });
                return;
            }
            return;
        }
        i7 |= 48;
        modifier2 = modifier;
        if ((i7 & 19) == 18) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.J2(i2, companion.rl())) {
            }
            if (ComposerKt.v()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private DatePickerDefaults() {
    }

    public final Shape Uo(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(700927667, i2, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
        }
        Shape shapeO = ShapesKt.O(DatePickerModalTokens.f29490n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final DatePickerColors t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-275219611, i2, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
        }
        DatePickerColors datePickerColorsJ2 = J2(MaterialTheme.f26164n.n(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return datePickerColorsJ2;
    }
}
