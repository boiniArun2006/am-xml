package androidx.room;

import androidx.room.ObservedTableStates;
import androidx.room.Transactor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", i = {0}, l = {Sdk.SDKError.Reason.MRAID_ERROR_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend", n = {"connection"}, s = {"L$0"})
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends SuspendLambda implements Function2<Transactor, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TriggerBasedInvalidationTracker f41513O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41514n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f41515t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$2$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(2, continuation);
        this.f41513O = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this.f41513O, continuation);
        triggerBasedInvalidationTracker$syncTriggers$2$1.f41515t = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Transactor transactor, Continuation continuation) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend", n = {"$this$forEachIndexed$iv", "index$iv", "$this$forEachIndexed$iv", "index$iv"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n13467#2,3:605\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1\n*L\n310#1:605,3\n*E\n"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Unit>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Transactor E2;
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f41516O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ ObservedTableStates.ObserveOp[] f41517S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f41518Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TriggerBasedInvalidationTracker f41519g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f41520n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f41521o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41522r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f41523t;

        /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$WhenMappings */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ObservedTableStates.ObserveOp.values().length];
                try {
                    iArr[ObservedTableStates.ObserveOp.f41348n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ObservedTableStates.ObserveOp.f41350t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ObservedTableStates.ObserveOp.f41347O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ObservedTableStates.ObserveOp[] observeOpArr, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Transactor transactor, Continuation continuation) {
            super(2, continuation);
            this.f41517S = observeOpArr;
            this.f41519g = triggerBasedInvalidationTracker;
            this.E2 = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f41517S, this.f41519g, this.E2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TransactionScope transactionScope, Continuation continuation) {
            return ((AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        
            if (r7.S(r12, r6, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        
            r6 = r12;
            r5 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i2;
            ObservedTableStates.ObserveOp[] observeOpArr;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
            Transactor transactor;
            int i3;
            int i5;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.f41518Z;
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2) {
                    i3 = this.f41521o;
                    i5 = this.f41522r;
                    int i8 = this.J2;
                    Transactor transactor2 = (Transactor) this.f41516O;
                    triggerBasedInvalidationTracker = (TriggerBasedInvalidationTracker) this.f41523t;
                    observeOpArr = (ObservedTableStates.ObserveOp[]) this.f41520n;
                    ResultKt.throwOnFailure(obj);
                    transactor = transactor2;
                    i2 = i8;
                    i5++;
                    if (i5 >= i3) {
                        int i9 = i2 + 1;
                        int i10 = WhenMappings.$EnumSwitchMapping$0[observeOpArr[i5].ordinal()];
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    this.f41520n = observeOpArr;
                                    this.f41523t = triggerBasedInvalidationTracker;
                                    this.f41516O = transactor;
                                    this.J2 = i9;
                                    this.f41522r = i5;
                                    this.f41521o = i3;
                                    this.f41518Z = 2;
                                    if (triggerBasedInvalidationTracker.WPU(transactor, i2, this) != coroutine_suspended) {
                                        transactor2 = transactor;
                                        i8 = i9;
                                        transactor = transactor2;
                                        i2 = i8;
                                    }
                                    return coroutine_suspended;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f41520n = observeOpArr;
                            this.f41523t = triggerBasedInvalidationTracker;
                            this.f41516O = transactor;
                            this.J2 = i9;
                            this.f41522r = i5;
                            this.f41521o = i3;
                            this.f41518Z = 1;
                            i5++;
                            if (i5 >= i3) {
                            }
                        } else {
                            i2 = i9;
                            i5++;
                            if (i5 >= i3) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ObservedTableStates.ObserveOp[] observeOpArr2 = this.f41517S;
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2 = this.f41519g;
                Transactor transactor3 = this.E2;
                int length = observeOpArr2.length;
                i2 = 0;
                observeOpArr = observeOpArr2;
                triggerBasedInvalidationTracker = triggerBasedInvalidationTracker2;
                transactor = transactor3;
                i3 = length;
                i5 = 0;
                if (i5 >= i3) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.n(r3, r4, r7) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor transactor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f41514n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactor = (Transactor) this.f41515t;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            transactor = (Transactor) this.f41515t;
            this.f41515t = transactor;
            this.f41514n = 1;
            obj = transactor.rl(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        ObservedTableStates.ObserveOp[] observeOpArrRl = this.f41513O.observedTableStates.rl();
        if (observeOpArrRl != null) {
            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.f41456t;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(observeOpArrRl, this.f41513O, transactor, null);
            this.f41515t = null;
            this.f41514n = 2;
        }
        return Unit.INSTANCE;
    }
}
