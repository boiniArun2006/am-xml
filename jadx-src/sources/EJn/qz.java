package EJn;

import Du.tI;
import EJn.Xo;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class qz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Wre KN(String str, Pl pl, Wre[] wreArr, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1() { // from class: EJn.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return qz.xMQ((j) obj2);
                }
            };
        }
        return Uo(str, pl, wreArr, function1);
    }

    public static /* synthetic */ Wre O(String str, Wre[] wreArr, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: EJn.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return qz.J2((j) obj2);
                }
            };
        }
        return nr(str, wreArr, function1);
    }

    public static final Wre Uo(String serialName, Pl kind, Wre[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, Xo.j.f2283n)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        j jVar = new j(serialName);
        builder.invoke(jVar);
        return new Dsr(serialName, kind, jVar.J2().size(), ArraysKt.toList(typeParameters), jVar);
    }

    public static final Wre nr(String serialName, Wre[] typeParameters, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        j jVar = new j(serialName);
        builderAction.invoke(jVar);
        return new Dsr(serialName, Xo.j.f2283n, jVar.J2().size(), ArraysKt.toList(typeParameters), jVar);
    }

    public static final Wre t(String serialName, I28 kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.isBlank(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return tI.n(serialName, kind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return Unit.INSTANCE;
    }
}
