package androidx.room;

import GJW.vd;
import androidx.room.util.DBUtil;
import java.util.ArrayList;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTFv/CN3;", "", "", "", "<anonymous>", "(LTFv/CN3;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", i = {0, 1}, l = {233, 233, 237}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
final class TriggerBasedInvalidationTracker$createFlow$1 extends SuspendLambda implements Function2<TFv.CN3, Continuation<? super Unit>, Object> {
    final /* synthetic */ int[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TriggerBasedInvalidationTracker f41463O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ String[] f41465o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f41466r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f41467t;

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41468n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TriggerBasedInvalidationTracker f41469t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
            super(2, continuation);
            this.f41469t = triggerBasedInvalidationTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f41469t, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f41468n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.f41469t;
                this.f41468n = 1;
                if (triggerBasedInvalidationTracker.aYN(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n3912#2:605\n4011#2:606\n13467#2,2:607\n4012#2,2:609\n13469#2:611\n4014#2:612\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker$createFlow$1$2\n*L\n245#1:605\n245#1:606\n245#1:607,2\n245#1:609,2\n245#1:611\n245#1:612\n*E\n"})
    static final class AnonymousClass2<T> implements TFv.CN3 {
        final /* synthetic */ String[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f41470O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f41471n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int[] f41472r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f41473t;

        AnonymousClass2(Ref.ObjectRef objectRef, boolean z2, TFv.CN3 cn3, String[] strArr, int[] iArr) {
            this.f41471n = objectRef;
            this.f41473t = z2;
            this.f41470O = cn3;
            this.J2 = strArr;
            this.f41472r = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r14.rl(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        
            if (r14.rl(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(int[] iArr, Continuation continuation) {
            TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 triggerBasedInvalidationTracker$createFlow$1$2$emit$1;
            AnonymousClass2<T> anonymousClass2;
            Object obj;
            if (continuation instanceof TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) {
                triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = (TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) continuation;
                int i2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41476r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41476r = i2 - Integer.MIN_VALUE;
                } else {
                    triggerBasedInvalidationTracker$createFlow$1$2$emit$1 = new TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(this, continuation);
                }
            }
            Object obj2 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41474O;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41476r;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                Ref.ObjectRef objectRef = this.f41471n;
                if (objectRef.element == null) {
                    if (this.f41473t) {
                        TFv.CN3 cn3 = this.f41470O;
                        Set set = ArraysKt.toSet(this.J2);
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41475n = this;
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41477t = iArr;
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41476r = 1;
                    }
                    anonymousClass2 = this;
                    obj = iArr;
                } else {
                    String[] strArr = this.J2;
                    int[] iArr2 = this.f41472r;
                    ArrayList arrayList = new ArrayList();
                    int length = strArr.length;
                    int i5 = 0;
                    int i7 = 0;
                    while (i5 < length) {
                        String str = strArr[i5];
                        int i8 = i7 + 1;
                        T t3 = objectRef.element;
                        if (t3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        int i9 = iArr2[i7];
                        if (((int[]) t3)[i9] != iArr[i9]) {
                            arrayList.add(str);
                        }
                        i5++;
                        i7 = i8;
                    }
                    if (!arrayList.isEmpty()) {
                        TFv.CN3 cn32 = this.f41470O;
                        Set set2 = CollectionsKt.toSet(arrayList);
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41475n = this;
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41477t = iArr;
                        triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41476r = 2;
                    }
                    anonymousClass2 = this;
                    obj = iArr;
                }
            } else {
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = (T) ((int[]) triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41477t);
                anonymousClass2 = (AnonymousClass2) triggerBasedInvalidationTracker$createFlow$1$2$emit$1.f41475n;
                ResultKt.throwOnFailure(obj2);
                obj = obj3;
            }
            anonymousClass2.f41471n.element = (T) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$createFlow$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, int[] iArr, boolean z2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f41463O = triggerBasedInvalidationTracker;
        this.J2 = iArr;
        this.f41466r = z2;
        this.f41465o = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new TriggerBasedInvalidationTracker$createFlow$1(this.f41463O, this.J2, this.f41466r, this.f41465o, continuation);
        triggerBasedInvalidationTracker$createFlow$1.f41467t = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (GJW.Dsr.Uo((kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r12.n(r4, r11) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TFv.CN3 cn3;
        TFv.CN3 cn32;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f41464n;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    cn32 = (TFv.CN3) this.f41467t;
                    ResultKt.throwOnFailure(obj);
                    cn3 = cn32;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    ObservedTableVersions observedTableVersions = this.f41463O.observedTableVersions;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(objectRef, this.f41466r, cn3, this.f41465o, this.J2);
                    this.f41467t = null;
                    this.f41464n = 3;
                } else {
                    cn32 = (TFv.CN3) this.f41467t;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn33 = (TFv.CN3) this.f41467t;
                if (this.f41463O.observedTableStates.t(this.J2)) {
                    RoomDatabase roomDatabase = this.f41463O.database;
                    this.f41467t = cn33;
                    this.f41464n = 1;
                    Object objNr = DBUtil.nr(roomDatabase, false, this);
                    if (objNr != coroutine_suspended) {
                        cn32 = cn33;
                        obj = objNr;
                    }
                    return coroutine_suspended;
                }
                cn3 = cn33;
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                ObservedTableVersions observedTableVersions2 = this.f41463O.observedTableVersions;
                AnonymousClass2 anonymousClass22 = new AnonymousClass2(objectRef2, this.f41466r, cn3, this.f41465o, this.J2);
                this.f41467t = null;
                this.f41464n = 3;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f41463O, null);
            this.f41467t = cn32;
            this.f41464n = 2;
        } catch (Throwable th) {
            this.f41463O.observedTableStates.nr(this.J2);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
        return ((TriggerBasedInvalidationTracker$createFlow$1) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
