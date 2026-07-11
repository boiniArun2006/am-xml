package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventHelper;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "Landroidx/compose/ui/geometry/Offset;", c.f62177j, "(Landroid/view/MotionEvent;I)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMotionEventAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,349:1\n30#2:350\n53#3,3:351\n*S KotlinDebug\n*F\n+ 1 MotionEventAdapter.android.kt\nandroidx/compose/ui/input/pointer/MotionEventHelper\n*L\n346#1:350\n346#1:351,3\n*E\n"})
final class MotionEventHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MotionEventHelper f32069n = new MotionEventHelper();

    private MotionEventHelper() {
    }

    public final long n(MotionEvent motionEvent, int index) {
        float rawX = motionEvent.getRawX(index);
        return Offset.O((((long) Float.floatToRawIntBits(motionEvent.getRawY(index))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
