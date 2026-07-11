package Mms;

import EJn.Pl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: Mms.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1417p {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit O(Ref.ObjectRef objectRef, kotlinx.serialization.json.Dsr it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlinx.serialization.json.Dsr nr(kotlinx.serialization.json.n json, Object obj, XA.eO serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new vd(json, new Function1() { // from class: Mms.OU
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC1417p.O(objectRef, (kotlinx.serialization.json.Dsr) obj2);
            }
        }).ViF(serializer, obj);
        T t3 = objectRef.element;
        if (t3 != 0) {
            return (kotlinx.serialization.json.Dsr) t3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(EJn.Wre wre) {
        if (!(wre.getKind() instanceof EJn.I28) && wre.getKind() != Pl.n.f2281n) {
            return false;
        }
        return true;
    }
}
