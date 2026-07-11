package androidx.view.compose;

import TFv.CN3;
import TFv.Wre;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.view.BackEventCompat;
import androidx.view.NavBackStackEntry;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTFv/Wre;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "backEvent", "", "<anonymous>", "(LTFv/Wre;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", i = {0}, l = {524}, m = "invokeSuspend", n = {"currentBackStackEntry"}, s = {"L$0"})
final class NavHostKt$NavHost$25$1 extends SuspendLambda implements Function2<Wre, Continuation<? super Unit>, Object> {
    final /* synthetic */ State J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ComposeNavigator f40306O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f40307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableState f40308o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableFloatState f40309r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f40310t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$25$1(ComposeNavigator composeNavigator, State state, MutableFloatState mutableFloatState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f40306O = composeNavigator;
        this.J2 = state;
        this.f40309r = mutableFloatState;
        this.f40308o = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new NavHostKt$NavHost$25$1(this.f40306O, this.J2, this.f40309r, this.f40308o, continuation);
        navHostKt$NavHost$25$1.f40310t = obj;
        return navHostKt$NavHost$25$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavBackStackEntry navBackStackEntry;
        NavBackStackEntry navBackStackEntry2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f40307n;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    navBackStackEntry2 = (NavBackStackEntry) this.f40310t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre wre = (Wre) this.f40310t;
                if (NavHostKt.az(this.J2).size() > 1) {
                    NavHostKt.HI(this.f40309r, 0.0f);
                    navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull(NavHostKt.az(this.J2));
                    ComposeNavigator composeNavigator = this.f40306O;
                    Intrinsics.checkNotNull(navBackStackEntry);
                    composeNavigator.ck(navBackStackEntry);
                    this.f40306O.ck((NavBackStackEntry) NavHostKt.az(this.J2).get(NavHostKt.az(this.J2).size() - 2));
                } else {
                    navBackStackEntry = null;
                }
                final State state = this.J2;
                final MutableState mutableState = this.f40308o;
                final MutableFloatState mutableFloatState = this.f40309r;
                CN3 cn3 = new CN3() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // TFv.CN3
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Object rl(BackEventCompat backEventCompat, Continuation continuation) {
                        if (NavHostKt.az(state).size() > 1) {
                            NavHostKt.mUb(mutableState, true);
                            NavHostKt.HI(mutableFloatState, backEventCompat.getProgress());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.f40310t = navBackStackEntry;
                this.f40307n = 1;
                if (wre.n(cn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                navBackStackEntry2 = navBackStackEntry;
            }
            if (NavHostKt.az(this.J2).size() > 1) {
                NavHostKt.mUb(this.f40308o, false);
                ComposeNavigator composeNavigator2 = this.f40306O;
                Intrinsics.checkNotNull(navBackStackEntry2);
                composeNavigator2.mUb(navBackStackEntry2, false);
            }
        } catch (CancellationException unused) {
            if (NavHostKt.az(this.J2).size() > 1) {
                NavHostKt.mUb(this.f40308o, false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Wre wre, Continuation continuation) {
        return ((NavHostKt$NavHost$25$1) create(wre, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
