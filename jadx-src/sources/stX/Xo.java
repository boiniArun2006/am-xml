package stX;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ stX.j f73356O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f73357n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f73358t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Object obj, Object obj2, stX.j jVar) {
            super(0);
            this.f73357n = obj;
            this.f73358t = obj2;
            this.f73356O = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Attempting to assign conflicting values '" + this.f73357n + "' and '" + this.f73358t + "' to field '" + this.f73356O.getName() + '\'';
        }
    }

    public static final eO n(Integer num, Integer num2, Integer num3, stX.j setter, String name, Integer num4) {
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        List listMutableListOf = CollectionsKt.mutableListOf(nr(num, num2, num3, setter, name, true));
        if (num4 != null) {
            listMutableListOf.add(O(num, num4, num3, setter, name, false, 32, null));
            listMutableListOf.add(new eO(CollectionsKt.listOf((Object[]) new Pl[]{new z("+"), new fuX(CollectionsKt.listOf(new s4(Integer.valueOf(num4.intValue() + 1), num2, setter, name, false)))}), CollectionsKt.emptyList()));
        } else {
            listMutableListOf.add(O(num, num2, num3, setter, name, false, 32, null));
        }
        return new eO(CollectionsKt.emptyList(), listMutableListOf);
    }

    private static final eO J2(boolean z2, stX.j jVar, String str, int i2, int i3) {
        if (i3 < (z2 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (z2) {
            listCreateListBuilder.add(new z("-"));
        }
        listCreateListBuilder.add(new fuX(CollectionsKt.listOf(new s4(Integer.valueOf(i2 - (z2 ? 1 : 0)), Integer.valueOf(i3 - (z2 ? 1 : 0)), jVar, str, z2))));
        return new eO(CollectionsKt.build(listCreateListBuilder), CollectionsKt.emptyList());
    }

    public static /* synthetic */ eO O(Integer num, Integer num2, Integer num3, stX.j jVar, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        return nr(num, num2, num3, jVar, str, z2);
    }

    public static final eO nr(Integer num, Integer num2, Integer num3, stX.j setter, String name, boolean z2) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z2 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z2) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return J2(z2, setter, name, iIntValue2, iIntValue);
        }
        eO eOVarJ2 = J2(z2, setter, name, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            iIntValue2++;
            eOVarJ2 = new eO(CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new eO[]{J2(z2, setter, name, iIntValue2, iIntValue2), qz.rl(CollectionsKt.listOf((Object[]) new eO[]{new eO(CollectionsKt.listOf(new z(" ")), CollectionsKt.emptyList()), eOVarJ2}))}));
        }
        return iIntValue3 > iIntValue ? qz.rl(CollectionsKt.listOf((Object[]) new eO[]{new eO(CollectionsKt.listOf(new z(StringsKt.repeat(" ", iIntValue3 - iIntValue))), CollectionsKt.emptyList()), eOVarJ2})) : iIntValue3 == iIntValue ? eOVarJ2 : new eO(CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new eO[]{J2(z2, setter, name, iIntValue3 + 1, iIntValue), eOVarJ2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t(stX.j jVar, Object obj, Object obj2, int i2, int i3) {
        Object objT = jVar.t(obj, obj2);
        if (objT == null) {
            return aC.f73359n.rl(i3);
        }
        return aC.f73359n.n(i2, new j(objT, obj2, jVar));
    }
}
