package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010(\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", c.f62177j, "(Landroid/view/MotionEvent;)V", "KN", "", "pointerId", "", "Uo", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "J2", "(I)J", "rl", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "index", "pressed", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "nr", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroid/view/MotionEvent;IZ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "t", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "O", "(I)V", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMotionEventAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventAdapter\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,349:1\n30#2:350\n30#2:354\n30#2:359\n30#2:363\n53#3,3:351\n53#3,3:355\n53#3,3:360\n53#3,3:364\n139#4:358\n*S KotlinDebug\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventAdapter\n*L\n256#1:350\n260#1:354\n284#1:359\n316#1:363\n256#1:351,3\n260#1:355,3\n284#1:360,3\n316#1:364,3\n283#1:358\n*E\n"})
public final class MotionEventAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long nextId;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List pointers = new ArrayList();

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int previousToolType = -1;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int previousSource = -1;

    private final long J2(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return PointerId.n(jValueAt);
    }

    private final PointerInputEventData nr(PositionCalculator positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        long jR;
        long jN;
        int i2;
        long jJ2 = J2(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        char c2 = ' ';
        long j2 = 4294967295L;
        long jO = Offset.O((((long) Float.floatToRawIntBits(motionEvent.getY(index))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(index))) << 32));
        long jUo = Offset.Uo(jO, 0.0f, 0.0f, 3, null);
        if (index == 0) {
            jN = Offset.O((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32));
            jR = positionCalculator.r(jN);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jN = MotionEventHelper.f32069n.n(motionEvent, index);
            jR = positionCalculator.r(jN);
        } else {
            long jAYN = positionCalculator.aYN(jO);
            jR = jO;
            jN = jAYN;
        }
        int toolType = motionEvent.getToolType(index);
        int iO = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? PointerType.INSTANCE.O() : PointerType.INSTANCE.n() : PointerType.INSTANCE.rl() : PointerType.INSTANCE.t() : PointerType.INSTANCE.nr() : PointerType.INSTANCE.O();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i3 = 0;
        while (i3 < historySize) {
            float historicalX = motionEvent.getHistoricalX(index, i3);
            float historicalY = motionEvent.getHistoricalY(index, i3);
            char c4 = c2;
            long j3 = j2;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i2 = i3;
            } else {
                long jO2 = Offset.O((((long) Float.floatToRawIntBits(historicalX)) << c4) | (((long) Float.floatToRawIntBits(historicalY)) & j3));
                i2 = i3;
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i2), jO2, jO2, null));
            }
            i3 = i2 + 1;
            c2 = c4;
            j2 = j3;
        }
        return new PointerInputEventData(jJ2, motionEvent.getEventTime(), jN, jR, pressed, pressure, iO, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, motionEvent.getActionMasked() == 8 ? Offset.O((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2)) : Offset.INSTANCE.t(), jUo, null);
    }

    public final void O(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    private final void KN(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!Uo(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    private final boolean Uo(MotionEvent motionEvent, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (motionEvent.getPointerId(i3) == i2) {
                return true;
            }
        }
        return false;
    }

    private final void n(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                    long j2 = this.nextId;
                    this.nextId = 1 + j2;
                    sparseLongArray.put(pointerId, j2);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j3 = this.nextId;
            this.nextId = 1 + j3;
            sparseLongArray2.put(pointerId2, j3);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void rl(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == this.previousToolType && source == this.previousSource) {
                return;
            }
            this.previousToolType = toolType;
            this.previousSource = source;
            this.activeHoverIds.clear();
            this.motionEventToComposePointerIdMap.clear();
        }
    }

    public final PointerInputEvent t(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        boolean z2;
        boolean z3;
        int actionIndex;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 4) {
            rl(motionEvent);
            n(motionEvent);
            if (actionMasked != 9 && actionMasked != 7 && actionMasked != 10) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (actionMasked == 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
            }
            if (actionMasked != 1) {
                if (actionMasked != 6) {
                    actionIndex = -1;
                } else {
                    actionIndex = motionEvent.getActionIndex();
                }
            } else {
                actionIndex = 0;
            }
            this.pointers.clear();
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                List list = this.pointers;
                if (!z2 && i2 != actionIndex && (!z3 || motionEvent.getButtonState() != 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                list.add(nr(positionCalculator, motionEvent, i2, z4));
            }
            KN(motionEvent);
            return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
        }
        this.motionEventToComposePointerIdMap.clear();
        this.activeHoverIds.clear();
        return null;
    }
}
