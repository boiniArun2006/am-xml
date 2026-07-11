package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", i = {0, 0, 1, 1}, l = {894, 897}, m = "onTap-rOwcSBo", n = {"$this$onTap_u2drOwcSBo", "autoSwitchToMinute", "$this$onTap_u2drOwcSBo", "autoSwitchToMinute"}, s = {"L$0", "Z$0", "L$0", "Z$0"})
final class TimePickerKt$onTap$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f28724O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f28725n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f28726t;

    TimePickerKt$onTap$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28724O = obj;
        this.J2 |= Integer.MIN_VALUE;
        return TimePickerKt.xg(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}
