package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0004\b%\u0010&J-\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001fH\u0001¢\u0006\u0004\b(\u0010)J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0004\b+\u0010)J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b7\u00106R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b8\u00106R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b?\u00106R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b@\u00106R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\bA\u00106R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\bB\u00106R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\bE\u00106R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u00104\u001a\u0004\bF\u00106R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\bG\u00106R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u00106R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u00106R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bM\u00106R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u00104\u001a\u0004\bO\u00106R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u00104\u001a\u0004\bQ\u00106R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u00104\u001a\u0004\bS\u00106R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u00104\u001a\u0004\bC\u00106R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u00104\u001a\u0004\b;\u00106R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u00106R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u00104\u001a\u0004\b=\u00106R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b9\u0010[\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isToday", "selected", "inRange", "enabled", "Landroidx/compose/runtime/State;", "rl", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animate", c.f62177j, "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "currentYear", "ty", "az", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "t", "()J", "mUb", "Uo", "nr", "qie", "O", "xMQ", "J2", "KN", "getYearContentColor-0d7_KjU", "getDisabledYearContentColor-0d7_KjU", "getCurrentYearContentColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "gh", "getDisabledSelectedYearContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "getDisabledSelectedYearContainerColor-0d7_KjU", "getDayContentColor-0d7_KjU", "HI", "getDisabledDayContentColor-0d7_KjU", "ck", "getSelectedDayContentColor-0d7_KjU", "Ik", "getDisabledSelectedDayContentColor-0d7_KjU", "r", "getSelectedDayContainerColor-0d7_KjU", "o", "getDisabledSelectedDayContainerColor-0d7_KjU", "Z", "getTodayContentColor-0d7_KjU", "XQ", "S", "WPU", "getDayInSelectionRangeContentColor-0d7_KjU", "aYN", "ViF", "Landroidx/compose/material3/TextFieldColors;", "()Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2272:1\n708#2:2273\n696#2:2274\n708#2:2275\n696#2:2276\n708#2:2277\n696#2:2278\n708#2:2279\n696#2:2280\n708#2:2281\n696#2:2282\n708#2:2283\n696#2:2284\n708#2:2285\n696#2:2286\n708#2:2287\n696#2:2288\n708#2:2289\n696#2:2290\n708#2:2291\n696#2:2292\n708#2:2293\n696#2:2294\n708#2:2295\n696#2:2296\n708#2:2297\n696#2:2298\n708#2:2299\n696#2:2300\n708#2:2301\n696#2:2302\n708#2:2303\n696#2:2304\n708#2:2305\n696#2:2306\n708#2:2307\n696#2:2308\n708#2:2309\n696#2:2310\n708#2:2311\n696#2:2312\n708#2:2313\n696#2:2314\n708#2:2315\n696#2:2316\n708#2:2317\n696#2:2318\n708#2:2319\n696#2:2320\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n856#1:2273\n856#1:2274\n857#1:2275\n857#1:2276\n858#1:2277\n858#1:2278\n859#1:2279\n859#1:2280\n860#1:2281\n860#1:2282\n861#1:2283\n861#1:2284\n862#1:2285\n862#1:2286\n863#1:2287\n863#1:2288\n864#1:2289\n864#1:2290\n865#1:2291\n865#1:2292\n866#1:2293\n866#1:2294\n867#1:2295\n867#1:2296\n868#1:2297\n868#1:2298\n871#1:2299\n871#1:2300\n872#1:2301\n872#1:2302\n873#1:2303\n873#1:2304\n874#1:2305\n874#1:2306\n875#1:2307\n875#1:2308\n876#1:2309\n876#1:2310\n877#1:2311\n877#1:2312\n878#1:2313\n878#1:2314\n879#1:2315\n879#1:2316\n880#1:2317\n880#1:2318\n881#1:2319\n881#1:2320\n*E\n"})
public final class DatePickerColors {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final long disabledDayContentColor;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final long disabledSelectedDayContentColor;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long navigationContentColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long disabledYearContentColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long subheadContentColor;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final long dayInSelectionRangeContainerColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long yearContentColor;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final TextFieldColors dateTextFieldColors;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final long dayInSelectionRangeContentColor;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final long todayDateBorderColor;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final long todayContentColor;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final long dividerColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final long disabledSelectedYearContainerColor;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final long selectedDayContentColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long disabledSelectedYearContentColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long selectedYearContentColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long weekdayContentColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedDayContainerColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long selectedYearContainerColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long selectedDayContainerColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long titleContentColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long headlineContentColor;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final long dayContentColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long currentYearContentColor;

    public /* synthetic */ DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, textFieldColors);
    }

    private DatePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, TextFieldColors textFieldColors) {
        this.containerColor = j2;
        this.titleContentColor = j3;
        this.headlineContentColor = j4;
        this.weekdayContentColor = j5;
        this.subheadContentColor = j6;
        this.navigationContentColor = j7;
        this.yearContentColor = j9;
        this.disabledYearContentColor = j10;
        this.currentYearContentColor = j11;
        this.selectedYearContentColor = j12;
        this.disabledSelectedYearContentColor = j13;
        this.selectedYearContainerColor = j14;
        this.disabledSelectedYearContainerColor = j15;
        this.dayContentColor = j16;
        this.disabledDayContentColor = j17;
        this.selectedDayContentColor = j18;
        this.disabledSelectedDayContentColor = j19;
        this.selectedDayContainerColor = j20;
        this.disabledSelectedDayContainerColor = j21;
        this.todayContentColor = j22;
        this.todayDateBorderColor = j23;
        this.dayInSelectionRangeContainerColor = j24;
        this.dayInSelectionRangeContentColor = j25;
        this.dividerColor = j26;
        this.dateTextFieldColors = textFieldColors;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    public boolean equals(Object other) {
        if (!(other instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) other;
        return Color.HI(this.containerColor, datePickerColors.containerColor) && Color.HI(this.titleContentColor, datePickerColors.titleContentColor) && Color.HI(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.HI(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.HI(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.HI(this.yearContentColor, datePickerColors.yearContentColor) && Color.HI(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.HI(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.HI(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.HI(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.HI(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.HI(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.HI(this.dayContentColor, datePickerColors.dayContentColor) && Color.HI(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.HI(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.HI(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.HI(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.HI(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.HI(this.todayContentColor, datePickerColors.todayContentColor) && Color.HI(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.HI(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.HI(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.XQ(this.containerColor) * 31) + Color.XQ(this.titleContentColor)) * 31) + Color.XQ(this.headlineContentColor)) * 31) + Color.XQ(this.weekdayContentColor)) * 31) + Color.XQ(this.subheadContentColor)) * 31) + Color.XQ(this.yearContentColor)) * 31) + Color.XQ(this.disabledYearContentColor)) * 31) + Color.XQ(this.currentYearContentColor)) * 31) + Color.XQ(this.selectedYearContentColor)) * 31) + Color.XQ(this.disabledSelectedYearContentColor)) * 31) + Color.XQ(this.selectedYearContainerColor)) * 31) + Color.XQ(this.disabledSelectedYearContainerColor)) * 31) + Color.XQ(this.dayContentColor)) * 31) + Color.XQ(this.disabledDayContentColor)) * 31) + Color.XQ(this.selectedDayContentColor)) * 31) + Color.XQ(this.disabledSelectedDayContentColor)) * 31) + Color.XQ(this.selectedDayContainerColor)) * 31) + Color.XQ(this.disabledSelectedDayContainerColor)) * 31) + Color.XQ(this.todayContentColor)) * 31) + Color.XQ(this.todayDateBorderColor)) * 31) + Color.XQ(this.dayInSelectionRangeContainerColor)) * 31) + Color.XQ(this.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    public final State az(boolean z2, boolean z3, Composer composer, int i2) {
        long jJ2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1306331107, i2, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:982)");
        }
        if (z2) {
            if (z3) {
                jJ2 = this.selectedYearContainerColor;
            } else {
                jJ2 = this.disabledSelectedYearContainerColor;
            }
        } else {
            jJ2 = Color.INSTANCE.J2();
        }
        State stateN = SingleValueAnimationKt.n(jJ2, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateN;
    }

    public final State n(boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        long jJ2;
        State stateCk;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1240482658, i2, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:933)");
        }
        if (z2) {
            if (z3) {
                jJ2 = this.selectedDayContainerColor;
            } else {
                jJ2 = this.disabledSelectedDayContainerColor;
            }
        } else {
            jJ2 = Color.INSTANCE.J2();
        }
        long j2 = jJ2;
        if (z4) {
            composer.eF(-217363149);
            stateCk = SingleValueAnimationKt.n(j2, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.Xw();
        } else {
            composer.eF(-217247953);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }

    public final State rl(boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i2) {
        long j2;
        State stateN;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1233694918, i2, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:901)");
        }
        if (z3 && z5) {
            j2 = this.selectedDayContentColor;
        } else if (z3 && !z5) {
            j2 = this.disabledSelectedDayContentColor;
        } else if (z4 && z5) {
            j2 = this.dayInSelectionRangeContentColor;
        } else if (z4 && !z5) {
            j2 = this.disabledDayContentColor;
        } else if (z2) {
            j2 = this.todayContentColor;
        } else if (z5) {
            j2 = this.dayContentColor;
        } else {
            j2 = this.disabledDayContentColor;
        }
        long j3 = j2;
        if (z4) {
            composer.eF(-828303257);
            stateN = SnapshotStateKt.ck(Color.xMQ(j3), composer, 0);
            composer.Xw();
        } else {
            composer.eF(-828241443);
            stateN = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateN;
    }

    public final State ty(boolean z2, boolean z3, boolean z4, Composer composer, int i2) {
        long j2;
        if (ComposerKt.v()) {
            ComposerKt.p5(874111097, i2, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:959)");
        }
        if (z3 && z4) {
            j2 = this.selectedYearContentColor;
        } else if (z3 && !z4) {
            j2 = this.disabledSelectedYearContentColor;
        } else if (z2) {
            j2 = this.currentYearContentColor;
        } else if (z4) {
            j2 = this.yearContentColor;
        } else {
            j2 = this.disabledYearContentColor;
        }
        State stateN = SingleValueAnimationKt.n(j2, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateN;
    }
}
