package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0087\u0001\u0010\u0016\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001a\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "<init>", "()V", "", "selectedStartDateMillis", "selectedEndDateMillis", "Landroidx/compose/material3/DisplayMode;", "displayMode", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Landroidx/compose/ui/Modifier;", "modifier", "", "startDateText", "endDateText", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "startDatePlaceholder", "endDatePlaceholder", "datesDelimiter", c.f62177j, "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "t", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rl", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1072:1\n153#2:1073\n171#2:1074\n156#2:1075\n159#2:1076\n111#2:1077\n135#2:1078\n111#2:1079\n135#2:1080\n1223#3,6:1081\n148#4:1087\n98#5,3:1088\n101#5:1119\n105#5:1123\n78#6,6:1091\n85#6,4:1106\n89#6,2:1116\n93#6:1122\n368#7,9:1097\n377#7:1118\n378#7,2:1120\n4032#8,6:1110\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n342#1:1073\n344#1:1074\n368#1:1075\n369#1:1076\n435#1:1077\n436#1:1078\n447#1:1079\n448#1:1080\n457#1:1081,6\n462#1:1087\n455#1:1088,3\n455#1:1119\n455#1:1123\n455#1:1091,6\n455#1:1106,4\n455#1:1116,2\n455#1:1122\n455#1:1097,9\n455#1:1118\n455#1:1120,2\n455#1:1110,6\n*E\n"})
public final class DateRangePickerDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DateRangePickerDefaults f25512n = new DateRangePickerDefaults();

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Long l2, final Long l5, final int i2, final DatePickerFormatter datePickerFormatter, final Modifier modifier, final String str, final String str2, final Function2 function2, final Function2 function22, final Function2 function23, Composer composer, final int i3, final int i5) {
        int i7;
        Composer composer2;
        Long l6;
        Composer composerKN = composer.KN(-820363420);
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(l2) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(l5) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.t(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= (i3 & 4096) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= composerKN.p5(modifier) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= composerKN.p5(str) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 |= composerKN.p5(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= composerKN.E2(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i7 |= composerKN.E2(function22) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i7 |= composerKN.E2(function23) ? 536870912 : 268435456;
        }
        int i8 = i7;
        if ((i8 & 306783379) == 306783378 && (i5 & 1) == 0 && composerKN.xMQ()) {
            composerKN.wTp();
            l6 = l2;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-820363420, i8, i5, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:419)");
            }
            Locale localeN = CalendarLocale_androidKt.n(composerKN, 0);
            composer2 = composerKN;
            String strN = DatePickerFormatter.n(datePickerFormatter, l2, localeN, false, 4, null);
            l6 = l2;
            String strN2 = DatePickerFormatter.n(datePickerFormatter, l5, localeN, false, 4, null);
            String strT = datePickerFormatter.t(l6, localeN, true);
            composer2.eF(1063158288);
            String strN3 = "";
            if (strT == null) {
                DisplayMode.Companion companion = DisplayMode.INSTANCE;
                if (DisplayMode.J2(i2, companion.rl())) {
                    composer2.eF(1063166242);
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strT = Strings_androidKt.n(Strings.n(R.string.Ik), composer2, 0);
                    composer2.Xw();
                } else if (DisplayMode.J2(i2, companion.n())) {
                    composer2.eF(1063169213);
                    Strings.Companion companion3 = Strings.INSTANCE;
                    strT = Strings_androidKt.n(Strings.n(R.string.qie), composer2, 0);
                    composer2.Xw();
                } else {
                    composer2.eF(-1401419729);
                    composer2.Xw();
                    strT = "";
                }
            }
            composer2.Xw();
            String strT2 = datePickerFormatter.t(l5, localeN, true);
            composer2.eF(1063174382);
            if (strT2 == null) {
                DisplayMode.Companion companion4 = DisplayMode.INSTANCE;
                if (DisplayMode.J2(i2, companion4.rl())) {
                    composer2.eF(1063182274);
                    Strings.Companion companion5 = Strings.INSTANCE;
                    strN3 = Strings_androidKt.n(Strings.n(R.string.Ik), composer2, 0);
                    composer2.Xw();
                } else if (DisplayMode.J2(i2, companion4.n())) {
                    composer2.eF(1063185245);
                    Strings.Companion companion6 = Strings.INSTANCE;
                    strN3 = Strings_androidKt.n(Strings.n(R.string.qie), composer2, 0);
                    composer2.Xw();
                } else {
                    composer2.eF(-1400922737);
                    composer2.Xw();
                }
            } else {
                strN3 = strT2;
            }
            composer2.Xw();
            final String str3 = str + ": " + strT;
            final String str4 = str2 + ": " + strN3;
            boolean zP5 = composer2.p5(str3) | composer2.p5(str4);
            Object objIF = composer2.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$4$1
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
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, str3 + ", " + str4);
                    }
                };
                composer2.o(objIF);
            }
            Modifier modifierN = SemanticsModifierKt.n(modifier, (Function1) objIF);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.ty(Dp.KN(4)), Alignment.INSTANCE.xMQ(), composer2, 54);
            int iN = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, modifierN);
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion7.n();
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
            Updater.O(composerN, measurePolicyRl, companion7.t());
            Updater.O(composerN, compositionLocalMapIk, companion7.O());
            Function2 function2Rl = companion7.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion7.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            if (strN != null) {
                composer2.eF(303536053);
                TextKt.t(strN, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                composer2.Xw();
            } else {
                composer2.eF(303604222);
                function2.invoke(composer2, Integer.valueOf((i8 >> 21) & 14));
                composer2.Xw();
            }
            function23.invoke(composer2, Integer.valueOf((i8 >> 27) & 14));
            if (strN2 != null) {
                composer2.eF(303729431);
                TextKt.t(strN2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                composer2.Xw();
            } else {
                composer2.eF(303795616);
                function22.invoke(composer2, Integer.valueOf((i8 >> 24) & 14));
                composer2.Xw();
            }
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Long l7 = l6;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$6
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
                    this.f25531n.n(l7, l5, i2, datePickerFormatter, modifier, str, str2, function2, function22, function23, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void rl(final Long l2, final Long l5, final int i2, final DatePickerFormatter datePickerFormatter, Modifier modifier, Composer composer, final int i3, final int i5) {
        Long l6;
        int i7;
        Long l7;
        int i8;
        int i9;
        Modifier modifier2;
        DateRangePickerDefaults dateRangePickerDefaults;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1611069472);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
            l6 = l2;
        } else if ((i3 & 6) == 0) {
            l6 = l2;
            i7 = (composerKN.p5(l6) ? 4 : 2) | i3;
        } else {
            l6 = l2;
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                l7 = l5;
                i7 |= composerKN.p5(l7) ? 32 : 16;
            }
            if ((i5 & 4) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 = i2;
                    i7 |= composerKN.t(i8) ? 256 : 128;
                }
                if ((i5 & 8) != 0) {
                    i7 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i7 |= (i3 & 4096) == 0 ? composerKN.p5(datePickerFormatter) : composerKN.E2(datePickerFormatter) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        modifier2 = modifier;
                        i7 |= composerKN.p5(modifier2) ? 16384 : 8192;
                    }
                    if ((i5 & 32) != 0) {
                        if ((i3 & 196608) == 0) {
                            dateRangePickerDefaults = this;
                            i7 |= composerKN.p5(dateRangePickerDefaults) ? 131072 : 65536;
                        }
                        if ((74899 & i7) == 74898 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier3 = modifier2;
                        } else {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1611069472, i7, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:366)");
                            }
                            Strings.Companion companion = Strings.INSTANCE;
                            final String strN = Strings_androidKt.n(Strings.n(R.string.f27125N), composerKN, 0);
                            final String strN2 = Strings_androidKt.n(Strings.n(R.string.f27133e), composerKN, 0);
                            Modifier modifier4 = modifier2;
                            dateRangePickerDefaults.n(l6, l7, i8, datePickerFormatter, modifier4, strN, strN2, ComposableLambdaKt.nr(482821121, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
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
                                    if ((i10 & 3) == 2 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(482821121, i10, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:377)");
                                    }
                                    TextKt.t(strN, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), ComposableLambdaKt.nr(-1522669758, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
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
                                    if ((i10 & 3) == 2 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1522669758, i10, -1, dpcnwfoVOnrtRA.iuxZYx);
                                    }
                                    TextKt.t(strN2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), ComposableSingletons$DateRangePickerKt.f25078n.n(), composerKN, (i7 & 14) | 918552576 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7), (i7 >> 15) & 14);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3
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
                                    this.f25518n.rl(l2, l5, i2, datePickerFormatter, modifier3, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 196608;
                    dateRangePickerDefaults = this;
                    if ((74899 & i7) == 74898) {
                        if (i9 != 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        Strings.Companion companion2 = Strings.INSTANCE;
                        final String strN3 = Strings_androidKt.n(Strings.n(R.string.f27125N), composerKN, 0);
                        final String strN22 = Strings_androidKt.n(Strings.n(R.string.f27133e), composerKN, 0);
                        Modifier modifier42 = modifier2;
                        dateRangePickerDefaults.n(l6, l7, i8, datePickerFormatter, modifier42, strN3, strN22, ComposableLambdaKt.nr(482821121, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
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
                                if ((i10 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(482821121, i10, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:377)");
                                }
                                TextKt.t(strN3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), ComposableLambdaKt.nr(-1522669758, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
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
                                if ((i10 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1522669758, i10, -1, dpcnwfoVOnrtRA.iuxZYx);
                                }
                                TextKt.t(strN22, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), ComposableSingletons$DateRangePickerKt.f25078n.n(), composerKN, (i7 & 14) | 918552576 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7), (i7 >> 15) & 14);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier42;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                modifier2 = modifier;
                if ((i5 & 32) != 0) {
                }
                dateRangePickerDefaults = this;
                if ((74899 & i7) == 74898) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i8 = i2;
            if ((i5 & 8) != 0) {
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            modifier2 = modifier;
            if ((i5 & 32) != 0) {
            }
            dateRangePickerDefaults = this;
            if ((74899 & i7) == 74898) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        l7 = l5;
        if ((i5 & 4) == 0) {
        }
        i8 = i2;
        if ((i5 & 8) != 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        modifier2 = modifier;
        if ((i5 & 32) != 0) {
        }
        dateRangePickerDefaults = this;
        if ((74899 & i7) == 74898) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
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
    public final void t(final int i2, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        DisplayMode.Companion companion;
        Composer composer2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1412719908);
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
                    ComposerKt.p5(-1412719908, i7, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:338)");
                }
                companion = DisplayMode.INSTANCE;
                if (DisplayMode.J2(i2, companion.rl())) {
                    Modifier modifier6 = modifier5;
                    composer2 = composerKN;
                    if (DisplayMode.J2(i2, companion.n())) {
                        composer2.eF(980473063);
                        Strings.Companion companion2 = Strings.INSTANCE;
                        int i9 = i7 & 112;
                        modifier3 = modifier6;
                        TextKt.t(Strings_androidKt.n(Strings.n(R.string.fD), composer2, 0), modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, i9, 0, 131068);
                        composer2.Xw();
                    } else {
                        modifier3 = modifier6;
                        composer2.eF(329974917);
                        composer2.Xw();
                    }
                } else {
                    composerKN.eF(980469064);
                    Strings.Companion companion3 = Strings.INSTANCE;
                    int i10 = i7 & 112;
                    modifier3 = modifier5;
                    TextKt.t(Strings_androidKt.n(Strings.n(R.string.nHg), composerKN, 0), modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerKN, i10, 0, 131068);
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
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerTitle$1
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
                        this.f25536n.t(i2, modifier4, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
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

    private DateRangePickerDefaults() {
    }
}
