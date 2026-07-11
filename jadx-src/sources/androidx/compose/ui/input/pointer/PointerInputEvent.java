package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "", "uptime", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "pointers", "Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", c.f62177j, "J", "getUptime", "()J", "rl", "Ljava/util/List;", "()Ljava/util/List;", "t", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInputEvent {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long uptime;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List pointers;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MotionEvent motionEvent;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final List getPointers() {
        return this.pointers;
    }

    public PointerInputEvent(long j2, List list, MotionEvent motionEvent) {
        this.uptime = j2;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }
}
