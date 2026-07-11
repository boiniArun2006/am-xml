package androidx.view.compose;

import GJW.vd;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.view.NavBackStackEntry;
import androidx.view.NavHostController;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$33$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,780:1\n1855#2,2:781\n526#3:783\n511#3,6:784\n215#4,2:790\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$33$1\n*L\n720#1:781,2\n722#1:783\n722#1:784,6\n723#1:790,2\n*E\n"})
final class NavHostKt$NavHost$33$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ NavHostController f40346O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f40347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ComposeNavigator f40348o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ State f40349r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Transition f40350t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$33$1(Transition transition, NavHostController navHostController, Map map, State state, ComposeNavigator composeNavigator, Continuation continuation) {
        super(2, continuation);
        this.f40350t = transition;
        this.f40346O = navHostController;
        this.J2 = map;
        this.f40349r = state;
        this.f40348o = composeNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavHostKt$NavHost$33$1(this.f40350t, this.f40346O, this.J2, this.f40349r, this.f40348o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((NavHostKt$NavHost$33$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f40347n == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.f40350t.xMQ(), this.f40350t.Ik()) && (this.f40346O.E2() == null || Intrinsics.areEqual(this.f40350t.Ik(), this.f40346O.E2()))) {
                List listQie = NavHostKt.qie(this.f40349r);
                ComposeNavigator composeNavigator = this.f40348o;
                Iterator it = listQie.iterator();
                while (it.hasNext()) {
                    composeNavigator.HI((NavBackStackEntry) it.next());
                }
                Map map = this.J2;
                Transition transition = this.f40350t;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!Intrinsics.areEqual(entry.getKey(), ((NavBackStackEntry) transition.Ik()).getId())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map map2 = this.J2;
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map2.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
