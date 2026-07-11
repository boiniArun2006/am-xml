package androidx.media3.common;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087@¢\u0006\u0002\u0010\b\u001a1\u0010\t\u001a\u00020\u0001*\u00020\u00022\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0082@¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"listen", "", "Landroidx/media3/common/Player;", "onEvents", "Lkotlin/Function2;", "Landroidx/media3/common/Player$Events;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/media3/common/Player;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenImpl", "lib-common-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlayerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerExtensions.kt\nandroidx/media3/common/PlayerExtensionsKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,112:1\n351#2,11:113\n*S KotlinDebug\n*F\n+ 1 PlayerExtensions.kt\nandroidx/media3/common/PlayerExtensionsKt\n*L\n84#1:113,11\n*E\n"})
public final class PlayerExtensionsKt {

    /* JADX INFO: renamed from: androidx.media3.common.PlayerExtensionsKt$listen$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.media3.common.PlayerExtensionsKt", f = "PlayerExtensions.kt", i = {}, l = {49, 51}, m = "listen", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlayerExtensionsKt.listen(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.PlayerExtensionsKt$listenImpl$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.media3.common.PlayerExtensionsKt", f = "PlayerExtensions.kt", i = {0, 0, 0}, l = {113}, m = "listenImpl", n = {"$this$listenImpl", "onEvents", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0", "L$1", "L$2"})
    static final class C15711 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C15711(Continuation<? super C15711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PlayerExtensionsKt.listenImpl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.PlayerExtensionsKt$listen$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.media3.common.PlayerExtensionsKt$listen$2", f = "PlayerExtensions.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<GJW.vd, Continuation<?>, Object> {
        final /* synthetic */ Function2<Player, Player.Events, Unit> $onEvents;
        final /* synthetic */ Player $this_listen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Player player, Function2<? super Player, ? super Player.Events, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_listen = player;
            this.$onEvents = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_listen, this.$onEvents, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation<?> continuation) {
            return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Player player = this.$this_listen;
                Function2<Player, Player.Events, Unit> function2 = this.$onEvents;
                this.label = 1;
                if (PlayerExtensionsKt.listenImpl(player, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (listenImpl(r5, r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (GJW.Dsr.Uo(r7, r4, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @UnstableApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object listen(Player player, Function2<? super Player, ? super Player.Events, Unit> function2, Continuation<?> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            throw new KotlinNothingValueException();
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(Looper.myLooper(), player.getApplicationLooper())) {
            anonymousClass1.label = 1;
        } else {
            Handler handlerN = HandlerCompat.n(player.getApplicationLooper());
            Intrinsics.checkNotNullExpressionValue(handlerN, "createAsync(...)");
            YF.I28 i28T = YF.Wre.t(handlerN, null, 1, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(player, function2, null);
            anonymousClass1.label = 2;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.media3.common.PlayerListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object listenImpl(Player player, Function2<? super Player, ? super Player.Events, Unit> function2, Continuation<?> continuation) throws Throwable {
        C15711 c15711;
        final Ref.ObjectRef objectRef;
        PlayerListener playerListener;
        Throwable th;
        T t3;
        if (continuation instanceof C15711) {
            c15711 = (C15711) continuation;
            int i2 = c15711.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15711.label = i2 - Integer.MIN_VALUE;
            } else {
                c15711 = new C15711(continuation);
            }
        }
        Object obj = c15711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c15711.label;
        PlayerListener playerListener2 = null;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            objectRef = new Ref.ObjectRef();
            try {
                c15711.L$0 = player;
                c15711.L$1 = function2;
                c15711.L$2 = objectRef;
                c15711.label = 1;
                GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(c15711), 1);
                eOVar.e();
                objectRef.element = new PlayerListener(function2, eOVar);
                eOVar.J2(new Function1<Throwable, Unit>() { // from class: androidx.media3.common.PlayerExtensionsKt$listenImpl$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        PlayerListener playerListener3;
                        PlayerListener playerListener4 = objectRef.element;
                        if (playerListener4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            playerListener3 = null;
                        } else {
                            playerListener3 = playerListener4;
                        }
                        playerListener3.getIsCancelled().set(true);
                    }
                });
                T t4 = objectRef.element;
                if (t4 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    playerListener = null;
                } else {
                    playerListener = (PlayerListener) t4;
                }
                player.addListener(playerListener);
                Object objWPU = eOVar.WPU();
                if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c15711);
                }
                if (objWPU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                t3 = objectRef.element;
                if (t3 != 0) {
                }
                player.removeListener(playerListener2);
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef2 = (Ref.ObjectRef) c15711.L$2;
            Player player2 = (Player) c15711.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objectRef = objectRef2;
                player = player2;
            } catch (Throwable th3) {
                objectRef = objectRef2;
                player = player2;
                th = th3;
                t3 = objectRef.element;
                if (t3 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                } else {
                    playerListener2 = (PlayerListener) t3;
                }
                player.removeListener(playerListener2);
                throw th;
            }
        }
        throw new KotlinNothingValueException();
    }
}
