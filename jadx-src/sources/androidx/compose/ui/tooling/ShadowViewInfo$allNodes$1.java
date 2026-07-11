package androidx.compose.ui.tooling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroidx/compose/ui/tooling/ShadowViewInfo;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", i = {0, 1}, l = {43, 44}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence"}, s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nShadowViewInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo$allNodes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1373#2:116\n1461#2,5:117\n1855#2,2:122\n*S KotlinDebug\n*F\n+ 1 ShadowViewInfo.android.kt\nandroidx/compose/ui/tooling/ShadowViewInfo$allNodes$1\n*L\n44#1:116\n44#1:117,5\n44#1:122,2\n*E\n"})
final class ShadowViewInfo$allNodes$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super ShadowViewInfo>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ShadowViewInfo J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public /* synthetic */ Object f34019O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f34020n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowViewInfo$allNodes$1(ShadowViewInfo shadowViewInfo, Continuation continuation) {
        super(2, continuation);
        this.J2 = shadowViewInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShadowViewInfo$allNodes$1 shadowViewInfo$allNodes$1 = new ShadowViewInfo$allNodes$1(this.J2, continuation);
        shadowViewInfo$allNodes$1.f34019O = obj;
        return shadowViewInfo$allNodes$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super ShadowViewInfo> sequenceScope, Continuation<? super Unit> continuation) {
        return invoke2((SequenceScope) sequenceScope, (Continuation) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope sequenceScope, Continuation continuation) {
        return ((ShadowViewInfo$allNodes$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (r1.yield(r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        SequenceScope sequenceScope2;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f34021t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    it = (Iterator) this.f34020n;
                    sequenceScope2 = (SequenceScope) this.f34019O;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        ShadowViewInfo shadowViewInfo = (ShadowViewInfo) it.next();
                        this.f34019O = sequenceScope2;
                        this.f34020n = it;
                        this.f34021t = 2;
                        if (sequenceScope2.yield(shadowViewInfo, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sequenceScope = (SequenceScope) this.f34019O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.f34019O;
            ShadowViewInfo shadowViewInfo2 = this.J2;
            this.f34019O = sequenceScope;
            this.f34021t = 1;
        }
        List listT = this.J2.get_children();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listT.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ShadowViewInfo) it2.next()).getAllNodes());
        }
        Iterator it3 = arrayList.iterator();
        sequenceScope2 = sequenceScope;
        it = it3;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
