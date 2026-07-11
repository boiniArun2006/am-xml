package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR1\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\"\u0010 R$\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b%\u0010\u0017R$\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b'\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material3/TimePickerStateImpl;", "Landroidx/compose/material3/TimePickerState;", "", "initialHour", "initialMinute", "", "is24Hour", "<init>", "(IIZ)V", c.f62177j, "Z", "xMQ", "()Z", "set24hour", "(Z)V", "is24hour", "Landroidx/compose/material3/TimePickerSelectionMode;", "<set-?>", "rl", "Landroidx/compose/runtime/MutableState;", "J2", "()I", "O", "(I)V", "selection", "t", "mUb", "nr", "isAfternoon", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/MutableIntState;", "getHourState", "()Landroidx/compose/runtime/MutableIntState;", "hourState", "getMinuteState", "minuteState", "value", "KN", "minute", "Uo", "hour", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerStateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2008:1\n1#2:2009\n81#3:2010\n107#3,2:2011\n81#3:2013\n107#3,2:2014\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerStateImpl\n*L\n681#1:2010\n681#1:2011,2\n683#1:2013\n683#1:2014,2\n*E\n"})
final class TimePickerStateImpl implements TimePickerState {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState minuteState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean is24hour;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableIntState hourState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState selection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState isAfternoon;

    @Override // androidx.compose.material3.TimePickerState
    public int J2() {
        return ((TimePickerSelectionMode) this.selection.getValue()).getValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void KN(int i2) {
        this.minuteState.KN(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void O(int i2) {
        this.selection.setValue(TimePickerSelectionMode.t(i2));
    }

    @Override // androidx.compose.material3.TimePickerState
    public void Uo(int i2) {
        nr(i2 >= 12);
        this.hourState.KN(i2 % 12);
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean mUb() {
        return ((Boolean) this.isAfternoon.getValue()).booleanValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void nr(boolean z2) {
        this.isAfternoon.setValue(Boolean.valueOf(z2));
    }

    @Override // androidx.compose.material3.TimePickerState
    public int rl() {
        return this.minuteState.J2();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int t() {
        return this.hourState.J2() + (mUb() ? 12 : 0);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public boolean getIs24hour() {
        return this.is24hour;
    }

    public TimePickerStateImpl(int i2, int i3, boolean z2) {
        boolean z3;
        if (i2 >= 0 && i2 < 24) {
            if (i3 >= 0 && i3 < 60) {
                this.is24hour = z2;
                this.selection = SnapshotStateKt__SnapshotStateKt.O(TimePickerSelectionMode.t(TimePickerSelectionMode.INSTANCE.n()), null, 2, null);
                if (i2 >= 12) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.isAfternoon = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z3), null, 2, null);
                this.hourState = SnapshotIntStateKt.n(i2 % 12);
                this.minuteState = SnapshotIntStateKt.n(i3);
                return;
            }
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        throw new IllegalArgumentException("initialHour should in [0..23] range");
    }
}
