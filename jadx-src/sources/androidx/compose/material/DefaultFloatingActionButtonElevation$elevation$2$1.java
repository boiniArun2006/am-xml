package androidx.compose.material;

import GJW.C;
import GJW.vd;
import TFv.CN3;
import TFv.Wre;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
final class DefaultFloatingActionButtonElevation$elevation$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ InteractionSource f21776O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f21777n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f21778t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(2, continuation);
        this.f21776O = interactionSource;
        this.J2 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultFloatingActionButtonElevation$elevation$2$1 defaultFloatingActionButtonElevation$elevation$2$1 = new DefaultFloatingActionButtonElevation$elevation$2$1(this.f21776O, this.J2, continuation);
        defaultFloatingActionButtonElevation$elevation$2$1.f21778t = obj;
        return defaultFloatingActionButtonElevation$elevation$2$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((DefaultFloatingActionButtonElevation$elevation$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f21777n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final vd vdVar = (vd) this.f21778t;
            final ArrayList arrayList = new ArrayList();
            Wre interactions = this.f21776O.getInteractions();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.J2;
            CN3 cn3 = new CN3() { // from class: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1.1

                /* JADX INFO: renamed from: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
                static final class C05241 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Interaction f21782O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f21783n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ FloatingActionButtonElevationAnimatable f21784t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C05241(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, Continuation continuation) {
                        super(2, continuation);
                        this.f21784t = floatingActionButtonElevationAnimatable;
                        this.f21782O = interaction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C05241(this.f21784t, this.f21782O, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(vd vdVar, Continuation continuation) {
                        return ((C05241) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f21783n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.f21784t;
                            Interaction interaction = this.f21782O;
                            this.f21783n = 1;
                            if (floatingActionButtonElevationAnimatable.rl(interaction, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // TFv.CN3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object rl(Interaction interaction, Continuation continuation) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    C.nr(vdVar, null, null, new C05241(floatingActionButtonElevationAnimatable, (Interaction) CollectionsKt.lastOrNull(arrayList), null), 3, null);
                    return Unit.INSTANCE;
                }
            };
            this.f21777n = 1;
            if (interactions.n(cn3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
