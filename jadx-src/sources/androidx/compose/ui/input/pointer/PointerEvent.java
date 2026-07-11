package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u001a\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR0\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n8\u0006@@X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "Landroidx/compose/ui/input/pointer/PointerEventType;", c.f62177j, "()I", "Ljava/util/List;", "t", "()Ljava/util/List;", "rl", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "O", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "Landroidx/compose/ui/input/pointer/PointerButtons;", "I", "buttons", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "nr", "J2", "keyboardModifiers", "<set-?>", "KN", "xMQ", "(I)V", "type", "Landroid/view/MotionEvent;", "Uo", "()Landroid/view/MotionEvent;", "motionEvent", "", "classification", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,232:1\n34#2,6:233\n34#2,6:239\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n102#1:233,6\n124#1:239,6\n*E\n"})
public final class PointerEvent {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List changes;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int keyboardModifiers;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final InternalPointerEvent internalPointerEvent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    public PointerEvent(List list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEventUo = Uo();
        this.buttons = PointerButtons.n(motionEventUo != null ? motionEventUo.getButtonState() : 0);
        MotionEvent motionEventUo2 = Uo();
        this.keyboardModifiers = PointerKeyboardModifiers.rl(motionEventUo2 != null ? motionEventUo2.getMetaState() : 0);
        this.type = n();
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    public final MotionEvent Uo() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.t();
        }
        return null;
    }

    public final int nr() {
        MotionEvent motionEventUo;
        if (Build.VERSION.SDK_INT < 29 || (motionEventUo = Uo()) == null) {
            return 0;
        }
        return motionEventUo.getClassification();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getChanges() {
        return this.changes;
    }

    public final void xMQ(int i2) {
        this.type = i2;
    }

    private final int n() {
        MotionEvent motionEventUo = Uo();
        if (motionEventUo != null) {
            int actionMasked = motionEventUo.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.INSTANCE.J2();
                            case 9:
                                return PointerEventType.INSTANCE.n();
                            case 10:
                                return PointerEventType.INSTANCE.rl();
                            default:
                                return PointerEventType.INSTANCE.Uo();
                        }
                    }
                    return PointerEventType.INSTANCE.t();
                }
                return PointerEventType.INSTANCE.O();
            }
            return PointerEventType.INSTANCE.nr();
        }
        List list = this.changes;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (PointerEventKt.nr(pointerInputChange)) {
                return PointerEventType.INSTANCE.O();
            }
            if (PointerEventKt.rl(pointerInputChange)) {
                return PointerEventType.INSTANCE.nr();
            }
        }
        return PointerEventType.INSTANCE.t();
    }

    public PointerEvent(List list) {
        this(list, null);
    }
}
