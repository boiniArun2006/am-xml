package Du;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class B extends Sis {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EJn.Wre f1945t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(final XA.Ml keySerializer, final XA.Ml valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f1945t = EJn.qz.nr("kotlin.Pair", new EJn.Wre[0], new Function1() { // from class: Du.RGN
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return B.KN(keySerializer, valueSerializer, (EJn.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(XA.Ml ml, XA.Ml ml2, EJn.j buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        EJn.j.rl(buildClassSerialDescriptor, "first", ml.getDescriptor(), null, false, 12, null);
        EJn.j.rl(buildClassSerialDescriptor, "second", ml2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.f1945t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Sis
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Object nr(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Sis
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Object rl(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Sis
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Pair J2(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }
}
