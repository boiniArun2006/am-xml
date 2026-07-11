package androidx.compose.material3;

import GJW.vd;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", i = {}, l = {855}, m = "invokeSuspend", n = {}, s = {})
final class DateRangePickerKt$VerticalMonthsList$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ CalendarModel J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function1 f25627O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f25628n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ IntRange f25629r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ LazyListState f25630t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$VerticalMonthsList$2$1(LazyListState lazyListState, Function1 function1, CalendarModel calendarModel, IntRange intRange, Continuation continuation) {
        super(2, continuation);
        this.f25630t = lazyListState;
        this.f25627O = function1;
        this.J2 = calendarModel;
        this.f25629r = intRange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.f25630t, this.f25627O, this.J2, this.f25629r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((DateRangePickerKt$VerticalMonthsList$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f25628n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.f25630t;
            Function1 function1 = this.f25627O;
            CalendarModel calendarModel = this.J2;
            IntRange intRange = this.f25629r;
            this.f25628n = 1;
            if (DatePickerKt.s7N(lazyListState, function1, calendarModel, intRange, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
