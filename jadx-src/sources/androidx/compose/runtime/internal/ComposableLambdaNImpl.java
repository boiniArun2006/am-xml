package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000b\"\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "Landroidx/compose/runtime/Composer;", "composer", "", "rl", "(Landroidx/compose/runtime/Composer;)V", "", "params", c.f62177j, "(I)I", "", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "I", "getKey", "()I", "key", "", "t", "Z", "tracked", "O", "getArity", "arity", "J2", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/RecomposeScope;", "r", "Landroidx/compose/runtime/RecomposeScope;", "scope", "", "o", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n37#2,2:182\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n114#1:182,2\n*E\n"})
public final class ComposableLambdaNImpl implements ComposableLambdaN {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Object _block;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int arity;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List scopes;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private RecomposeScope scope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    private final int n(int params) {
        int i2 = params - 2;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    @Override // kotlin.jvm.functions.FunctionN
    public Object invoke(final Object... args) {
        final int iN = n(args.length);
        Object obj = args[iN];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = ArraysKt.slice(args, RangesKt.until(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerKN = ((Composer) obj).KN(this.key);
        rl(composerKN);
        int iT = iIntValue | (composerKN.p5(this) ? ComposableLambdaKt.t(iN) : ComposableLambdaKt.J2(iN));
        Object obj3 = this._block;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(Integer.valueOf(iT));
        Object objInvoke = ((FunctionN) obj3).invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    n(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer, int i2) {
                    Object[] array2 = ArraysKt.slice(args, RangesKt.until(0, iN)).toArray(new Object[0]);
                    Object obj4 = args[iN + 1];
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iN2 = RecomposeScopeImplKt.n(((Integer) obj4).intValue());
                    int length = (args.length - iN) - 2;
                    Object[] objArr = new Object[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        Object obj5 = args[iN + 2 + i3];
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i3] = Integer.valueOf(RecomposeScopeImplKt.n(((Integer) obj5).intValue()));
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    SpreadBuilder spreadBuilder2 = new SpreadBuilder(4);
                    spreadBuilder2.addSpread(array2);
                    spreadBuilder2.add(composer);
                    spreadBuilder2.add(Integer.valueOf(iN2 | 1));
                    spreadBuilder2.addSpread(objArr);
                    composableLambdaNImpl.invoke(spreadBuilder2.toArray(new Object[spreadBuilder2.size()]));
                }
            });
        }
        return objInvoke;
    }

    private final void rl(Composer composer) {
        RecomposeScope recomposeScopeNY;
        if (!this.tracked || (recomposeScopeNY = composer.nY()) == null) {
            return;
        }
        composer.bzg(recomposeScopeNY);
        if (ComposableLambdaKt.O(this.scope, recomposeScopeNY)) {
            this.scope = recomposeScopeNY;
            return;
        }
        List list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScopeNY);
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (ComposableLambdaKt.O((RecomposeScope) list.get(i2), recomposeScopeNY)) {
                list.set(i2, recomposeScopeNY);
                return;
            }
        }
        list.add(recomposeScopeNY);
    }

    @Override // kotlin.jvm.functions.FunctionN, kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }
}
