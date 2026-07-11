package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001af\u0010\u0012\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0098\u0001\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedDateMillis", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dateInMillis", "", "onDateSelectionChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "Landroidx/compose/material3/DatePickerColors;", "colors", c.f62177j, "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "initialDateMillis", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/internal/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "rl", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "J2", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/ui/unit/Dp;", "F", "InputTextNonErroneousBottomPadding", "Landroidx/compose/ui/text/input/TextFieldValue;", "text", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,386:1\n1223#2,6:387\n1223#2,6:396\n1223#2,6:403\n1223#2,6:409\n1223#2,6:416\n141#3:393\n144#3:394\n138#3:395\n129#3:402\n148#4:415\n148#4:425\n148#4:426\n81#5:422\n107#5,2:423\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n65#1:387,6\n70#1:396,6\n125#1:403,6\n143#1:409,6\n189#1:416,6\n66#1:393\n67#1:394\n68#1:395\n83#1:402\n184#1:415\n381#1:425\n385#1:426\n125#1:422\n125#1:423,2\n*E\n"})
public final class DateInputKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PaddingValues f25128n;
    private static final float rl = Dp.KN(16);

    static {
        float f3 = 24;
        f25128n = PaddingKt.O(Dp.KN(f3), Dp.KN(10), Dp.KN(f3), 0.0f, 8, null);
    }

    public static final PaddingValues J2() {
        return f25128n;
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void n(final Long l2, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        DateInputFormat dateInputFormat;
        int i5;
        ?? r02;
        Composer composer3;
        Composer composerKN = composer.KN(643325609);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(calendarModel) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(intRange) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(selectableDates) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(datePickerColors) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            composer3 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(643325609, i3, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
            }
            Locale localeN = CalendarLocale_androidKt.n(composerKN, 0);
            boolean zP5 = composerKN.p5(localeN);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = calendarModel.t(localeN);
                composerKN.o(objIF);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objIF;
            Strings.Companion companion = Strings.INSTANCE;
            String strN = Strings_androidKt.n(Strings.n(R.string.KN), composerKN, 0);
            String strN2 = Strings_androidKt.n(Strings.n(R.string.mUb), composerKN, 0);
            String strN3 = Strings_androidKt.n(Strings.n(R.string.xMQ), composerKN, 0);
            boolean zP52 = composerKN.p5(dateInputFormat2) | ((i3 & 57344) == 16384 || ((i3 & 32768) != 0 && composerKN.p5(datePickerFormatter)));
            Object objIF2 = composerKN.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                composer2 = composerKN;
                dateInputFormat = dateInputFormat2;
                i5 = i3;
                r02 = 1;
                DateInputValidator dateInputValidator = new DateInputValidator(intRange, selectableDates, dateInputFormat, datePickerFormatter, strN, strN2, strN3, "", null, null, 768, null);
                composer2.o(dateInputValidator);
                objIF2 = dateInputValidator;
            } else {
                composer2 = composerKN;
                i5 = i3;
                dateInputFormat = dateInputFormat2;
                r02 = 1;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objIF2;
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strN4 = Strings_androidKt.n(Strings.n(R.string.gh), composer2, 0);
            Modifier modifierKN = PaddingKt.KN(SizeKt.KN(Modifier.INSTANCE, 0.0f, r02, null), f25128n);
            int iRl = InputIdentifier.INSTANCE.rl();
            dateInputValidator2.rl(l2);
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1819015125, r02, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2
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
                        ComposerKt.p5(-1819015125, i7, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
                    }
                    String str = strN4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    boolean zP53 = composer4.p5(str) | composer4.p5(upperCase);
                    final String str2 = strN4;
                    final String str3 = upperCase;
                    Object objIF3 = composer4.iF();
                    if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
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
                                SemanticsPropertiesKt.I(semanticsPropertyReceiver, str2 + ", " + str3);
                            }
                        };
                        composer4.o(objIF3);
                    }
                    TextKt.t(str, SemanticsModifierKt.nr(companion2, false, (Function1) objIF3, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131068);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composer2, 54);
            ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(-564233108, r02, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3
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
                        ComposerKt.p5(-564233108, i7, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
                    }
                    TextKt.t(upperCase, SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3.1
                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131068);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composer2, 54);
            int i7 = i5 << 3;
            Composer composer4 = composer2;
            rl(modifierKN, l2, function1, calendarModel, composableLambdaNr, composableLambdaNr2, iRl, dateInputValidator2, dateInputFormat, localeN, datePickerColors, composer4, (i7 & 112) | 1794054 | (i7 & 896) | (i7 & 7168), (i5 >> 18) & 14);
            composer3 = composer4;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer3.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    n(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer5, int i8) {
                    DateInputKt.n(l2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer5, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void rl(final Modifier modifier, final Long l2, final Function1 function1, final CalendarModel calendarModel, final Function2 function2, final Function2 function22, final int i2, final DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, Composer composer, final int i3, final int i5) {
        int i7;
        Function1 function12;
        int i8;
        final MutableState mutableState;
        int i9;
        Composer composer2;
        final DateInputFormat dateInputFormat2 = dateInputFormat;
        Composer composerKN = composer.KN(-857008589);
        if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(modifier) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(l2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i7 |= composerKN.E2(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.E2(calendarModel) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= composerKN.E2(function2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= composerKN.E2(function22) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= composerKN.t(i2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= composerKN.p5(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= composerKN.p5(dateInputFormat2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i7 |= composerKN.E2(locale) ? 536870912 : 268435456;
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
                ComposerKt.p5(-857008589, i7, i8, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            MutableState mutableState2 = (MutableState) RememberSaveableKt.O(new Object[0], null, null, new Function0<MutableState<String>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final MutableState invoke() {
                    return SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
                }
            }, composerKN, 3072, 6);
            Object[] objArr = new Object[0];
            Saver saverN = TextFieldValue.INSTANCE.n();
            boolean zE2 = ((i7 & 112) == 32) | composerKN.E2(calendarModel);
            int i10 = 234881024 & i7;
            boolean zE22 = zE2 | (i10 == 67108864) | composerKN.E2(locale);
            Object objIF = composerKN.iF();
            if (zE22 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MutableState invoke() {
                        String strN;
                        Long l5 = l2;
                        if (l5 != null) {
                            CalendarModel calendarModel2 = calendarModel;
                            DateInputFormat dateInputFormat3 = dateInputFormat2;
                            strN = calendarModel2.n(l5.longValue(), dateInputFormat3.getPatternWithoutDelimiters(), locale);
                            if (strN == null) {
                                strN = "";
                            }
                        }
                        return SnapshotStateKt__SnapshotStateKt.O(new TextFieldValue(strN, TextRangeKt.rl(0, 0), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                    }
                };
                composerKN.o(objIF);
            }
            final MutableState mutableStateNr = RememberSaveableKt.nr(objArr, saverN, null, (Function0) objIF, composerKN, 0, 4);
            TextFieldValue textFieldValueT = t(mutableStateNr);
            boolean zP5 = (i10 == 67108864) | composerKN.p5(mutableStateNr) | composerKN.p5(mutableState2) | ((i7 & 896) == 256) | composerKN.E2(calendarModel) | ((29360128 & i7) == 8388608) | ((3670016 & i7) == 1048576) | composerKN.E2(locale);
            Object objIF2 = composerKN.iF();
            if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                mutableState = mutableState2;
                i9 = i7;
                final Function1 function13 = function12;
                Function1<TextFieldValue, Unit> function14 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
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
                        if (textFieldValue.xMQ().length() <= dateInputFormat2.getPatternWithoutDelimiters().length()) {
                            String strXMQ = textFieldValue.xMQ();
                            for (int i11 = 0; i11 < strXMQ.length(); i11++) {
                                if (!Character.isDigit(strXMQ.charAt(i11))) {
                                    return;
                                }
                            }
                            DateInputKt.nr(mutableStateNr, textFieldValue);
                            String string = StringsKt.trim((CharSequence) textFieldValue.xMQ()).toString();
                            Long lValueOf = null;
                            if (string.length() == 0 || string.length() < dateInputFormat2.getPatternWithoutDelimiters().length()) {
                                mutableState.setValue("");
                                function13.invoke(null);
                                return;
                            }
                            CalendarDate calendarDateGh = calendarModel.gh(string, dateInputFormat2.getPatternWithoutDelimiters());
                            mutableState.setValue(dateInputValidator.t(calendarDateGh, i2, locale));
                            Function1 function15 = function13;
                            if (((CharSequence) mutableState.getValue()).length() == 0 && calendarDateGh != null) {
                                lValueOf = Long.valueOf(calendarDateGh.getUtcTimeMillis());
                            }
                            function15.invoke(lValueOf);
                        }
                    }
                };
                dateInputFormat2 = dateInputFormat2;
                composerKN.o(function14);
                objIF2 = function14;
            } else {
                mutableState = mutableState2;
                i9 = i7;
            }
            Function1 function15 = (Function1) objIF2;
            Modifier modifierAz = PaddingKt.az(modifier, 0.0f, 0.0f, 0.0f, !StringsKt.isBlank((CharSequence) mutableState.getValue()) ? Dp.KN(0) : rl, 7, null);
            boolean zP52 = composerKN.p5(mutableState);
            Object objIF3 = composerKN.iF();
            if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        if (StringsKt.isBlank((CharSequence) mutableState.getValue())) {
                            return;
                        }
                        SemanticsPropertiesKt.HI(semanticsPropertyReceiver, (String) mutableState.getValue());
                    }
                };
                composerKN.o(objIF3);
            }
            OutlinedTextFieldKt.n(textFieldValueT, function15, SemanticsModifierKt.nr(modifierAz, false, (Function1) objIF3, 1, null), false, false, null, function2, function22, null, null, null, null, ComposableLambdaKt.nr(-591991974, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i11) {
                    if ((i11 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-591991974, i11, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                    }
                    if (!StringsKt.isBlank((CharSequence) mutableState.getValue())) {
                        TextKt.t((String) mutableState.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), !StringsKt.isBlank((CharSequence) mutableState.getValue()), new DateVisualTransformation(dateInputFormat2), new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.nr(), ImeAction.INSTANCE.rl(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 113, (DefaultConstructorMarker) null), null, true, 0, 0, null, null, datePickerColors.getDateTextFieldColors(), composerKN, (i9 << 6) & 33030144, 12779904, 0, 4001592);
            composer2 = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
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
                    DateInputKt.rl(modifier, l2, function1, calendarModel, function2, function22, i2, dateInputValidator, dateInputFormat2, locale, datePickerColors, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    private static final TextFieldValue t(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }
}
