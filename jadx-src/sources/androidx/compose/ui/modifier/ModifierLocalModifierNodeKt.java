package androidx.compose.ui.modifier;

import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", c.f62177j, "()Landroidx/compose/ui/modifier/ModifierLocalMap;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Pair;", "Landroidx/compose/ui/modifier/ModifierLocal;", "entry", "rl", "(Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n1#2:236\n11065#3:237\n11400#3,3:238\n37#4,2:241\n37#4,2:253\n37#4,2:255\n150#5,3:243\n34#5,6:246\n153#5:252\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n198#1:237\n198#1:238,3\n198#1:241,2\n221#1:253,2\n233#1:255,2\n221#1:243,3\n221#1:246,6\n221#1:252\n*E\n"})
public final class ModifierLocalModifierNodeKt {
    public static final ModifierLocalMap n() {
        return EmptyMap.f32357n;
    }

    public static final ModifierLocalMap rl(Pair pair) {
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) pair.getFirst());
        singleLocalMap.t((ModifierLocal) pair.getFirst(), pair.getSecond());
        return singleLocalMap;
    }
}
