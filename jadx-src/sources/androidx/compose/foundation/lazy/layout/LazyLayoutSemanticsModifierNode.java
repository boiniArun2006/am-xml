package androidx.compose.foundation.lazy.layout;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZ)V", "", "W1c", "()V", "poH", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "v", "Lkotlin/jvm/functions/Function0;", "Xw", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "jB", "Landroidx/compose/foundation/gestures/Orientation;", "U", "Z", "P5", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "M7", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "p5", "Lkotlin/jvm/functions/Function1;", "indexForKeyMapping", "eF", "scrollToIndexAction", "ex", "()Z", "isVertical", "Landroidx/compose/ui/semantics/CollectionInfo;", "NC9", "()Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo", "lRt", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private ScrollAxisRange scrollAxisRange;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean userScrollEnabled;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private LazyLayoutSemanticState state;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Function1 scrollToIndexAction;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Function1 indexForKeyMapping = new Function1<Object, Integer>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$indexForKeyMapping$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f18555n.itemProviderLambda.invoke();
            int iN = lazyLayoutItemProvider.n();
            int i2 = 0;
            while (true) {
                if (i2 >= iN) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.areEqual(lazyLayoutItemProvider.nr(i2), obj)) {
                    break;
                }
                i2++;
            }
            return Integer.valueOf(i2);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function0 itemProviderLambda;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.S(semanticsPropertyReceiver, this.indexForKeyMapping);
        if (ex()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                scrollAxisRange = null;
            }
            SemanticsPropertiesKt.UhV(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            SemanticsPropertiesKt.z(semanticsPropertyReceiver, scrollAxisRange2);
        }
        Function1 function1 = this.scrollToIndexAction;
        if (function1 != null) {
            SemanticsPropertiesKt.FX(semanticsPropertyReceiver, null, function1, 1, null);
        }
        SemanticsPropertiesKt.o(semanticsPropertyReceiver, null, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$applySemantics$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f18554n.state.O() - this.f18554n.state.n());
            }
        }, 1, null);
        SemanticsPropertiesKt.J(semanticsPropertyReceiver, NC9());
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final CollectionInfo NC9() {
        return this.state.nr();
    }

    private final void W1c() {
        this.scrollAxisRange = new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f18556n.state.J2());
            }
        }, new Function0<Float>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f18557n.state.rl());
            }
        }, this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new Function1<Integer, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3

            /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ int f18559O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f18560n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ LazyLayoutSemanticsModifierNode f18561t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i2, Continuation continuation) {
                    super(2, continuation);
                    this.f18561t = lazyLayoutSemanticsModifierNode;
                    this.f18559O = i2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass2(this.f18561t, this.f18559O, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f18560n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        LazyLayoutSemanticState lazyLayoutSemanticState = this.f18561t.state;
                        int i3 = this.f18559O;
                        this.f18560n = 1;
                        if (lazyLayoutSemanticState.t(i3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return n(num.intValue());
            }

            public final Boolean n(int i2) {
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f18558n.itemProviderLambda.invoke();
                if (!(i2 >= 0 && i2 < lazyLayoutItemProvider.n())) {
                    InlineClassHelperKt.n("Can't scroll to index " + i2 + ", it is out of bounds [0, " + lazyLayoutItemProvider.n() + ')');
                }
                C.nr(this.f18558n.Xli(), null, null, new AnonymousClass2(this.f18558n, i2, null), 3, null);
                return Boolean.TRUE;
            }
        } : null;
    }

    private final boolean ex() {
        return this.orientation == Orientation.f16969n;
    }

    public final void poH(Function0 itemProviderLambda, LazyLayoutSemanticState state, Orientation orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = itemProviderLambda;
        this.state = state;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            SemanticsModifierNodeKt.rl(this);
        }
        if (this.userScrollEnabled == userScrollEnabled && this.reverseScrolling == reverseScrolling) {
            return;
        }
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        W1c();
        SemanticsModifierNodeKt.rl(this);
    }

    public LazyLayoutSemanticsModifierNode(Function0 function0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.itemProviderLambda = function0;
        this.state = lazyLayoutSemanticState;
        this.orientation = orientation;
        this.userScrollEnabled = z2;
        this.reverseScrolling = z3;
        W1c();
    }
}
