package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b*\u0010#R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b4\u0010#R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "clockDialColor", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "<init>", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "O", "(Z)J", "J2", "Uo", "KN", c.f62177j, InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "rl", "()J", "nr", "t", "getContainerColor-0d7_KjU", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "xMQ", "getPeriodSelectorSelectedContentColor-0d7_KjU", "mUb", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "gh", "getTimeSelectorSelectedContainerColor-0d7_KjU", "qie", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "az", "getTimeSelectorSelectedContentColor-0d7_KjU", "ty", "getTimeSelectorUnselectedContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2008:1\n708#2:2009\n696#2:2010\n708#2:2011\n696#2:2012\n708#2:2013\n696#2:2014\n708#2:2015\n696#2:2016\n708#2:2017\n696#2:2018\n708#2:2019\n696#2:2020\n708#2:2021\n696#2:2022\n708#2:2023\n696#2:2024\n708#2:2025\n696#2:2026\n708#2:2027\n696#2:2028\n708#2:2029\n696#2:2030\n708#2:2031\n696#2:2032\n708#2:2033\n696#2:2034\n708#2:2035\n696#2:2036\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerColors\n*L\n440#1:2009\n440#1:2010\n441#1:2011\n441#1:2012\n442#1:2013\n442#1:2014\n443#1:2015\n443#1:2016\n444#1:2017\n444#1:2018\n445#1:2019\n445#1:2020\n446#1:2021\n446#1:2022\n449#1:2023\n449#1:2024\n452#1:2025\n452#1:2026\n455#1:2027\n455#1:2028\n458#1:2029\n458#1:2030\n461#1:2031\n461#1:2032\n464#1:2033\n464#1:2034\n465#1:2035\n465#1:2036\n*E\n"})
public final class TimePickerColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long clockDialUnselectedContentColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long periodSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long clockDialSelectedContentColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long periodSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final long timeSelectorSelectedContentColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long timeSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long periodSelectorUnselectedContentColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long clockDialColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long periodSelectorBorderColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long timeSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long selectorColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final long timeSelectorUnselectedContentColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long periodSelectorSelectedContentColor;

    public /* synthetic */ TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TimePickerColors.class != other.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) other;
        return Color.HI(this.clockDialColor, timePickerColors.clockDialColor) && Color.HI(this.selectorColor, timePickerColors.selectorColor) && Color.HI(this.containerColor, timePickerColors.containerColor) && Color.HI(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.HI(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.HI(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.HI(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.HI(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.HI(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.HI(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.HI(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.HI(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    private TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.clockDialColor = j2;
        this.selectorColor = j3;
        this.containerColor = j4;
        this.periodSelectorBorderColor = j5;
        this.clockDialSelectedContentColor = j6;
        this.clockDialUnselectedContentColor = j7;
        this.periodSelectorSelectedContainerColor = j9;
        this.periodSelectorUnselectedContainerColor = j10;
        this.periodSelectorSelectedContentColor = j11;
        this.periodSelectorUnselectedContentColor = j12;
        this.timeSelectorSelectedContainerColor = j13;
        this.timeSelectorUnselectedContainerColor = j14;
        this.timeSelectorSelectedContentColor = j15;
        this.timeSelectorUnselectedContentColor = j16;
    }

    public final long J2(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    public final long KN(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    public final long O(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    public final long Uo(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.XQ(this.clockDialColor) * 31) + Color.XQ(this.selectorColor)) * 31) + Color.XQ(this.containerColor)) * 31) + Color.XQ(this.periodSelectorBorderColor)) * 31) + Color.XQ(this.periodSelectorSelectedContainerColor)) * 31) + Color.XQ(this.periodSelectorUnselectedContainerColor)) * 31) + Color.XQ(this.periodSelectorSelectedContentColor)) * 31) + Color.XQ(this.periodSelectorUnselectedContentColor)) * 31) + Color.XQ(this.timeSelectorSelectedContainerColor)) * 31) + Color.XQ(this.timeSelectorUnselectedContainerColor)) * 31) + Color.XQ(this.timeSelectorSelectedContentColor)) * 31) + Color.XQ(this.timeSelectorUnselectedContentColor);
    }

    public final long n(boolean selected) {
        return selected ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }
}
