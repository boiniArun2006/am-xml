package co4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class s4 extends FunctionReferenceImpl implements Function1 {
    public s4(Object obj) {
        super(1, obj, n.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n) this.receiver).n(obj);
    }
}
