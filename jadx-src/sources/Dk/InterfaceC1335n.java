package Dk;

import Dk.InterfaceC1335n;
import android.content.Context;
import cb.InterfaceC1679Ml;
import cb.InterfaceC1680j;
import cb.InterfaceC1682w6;
import com.bendingspoons.concierge.domain.entities.Id;
import fb.AbstractC2109j;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Dk.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface InterfaceC1335n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f1920n = j.rl;

    /* JADX INFO: renamed from: Dk.n$j */
    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: renamed from: Dk.n$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0065j extends FunctionReferenceImpl implements Function0 {
            C0065j(Object obj) {
                super(0, obj, InterfaceC0067n.class, "isUserAtLeast13", "isUserAtLeast13()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC0067n) this.receiver).n());
            }
        }

        /* JADX INFO: renamed from: Dk.n$j$n, reason: collision with other inner class name */
        /* synthetic */ class C0066n extends FunctionReferenceImpl implements Function0 {
            C0066n(Object obj) {
                super(0, obj, InterfaceC0067n.class, "isUserAtLeast13", "isUserAtLeast13()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((InterfaceC0067n) this.receiver).n());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC1335n nr(Context context, InterfaceC0067n interfaceC0067n, rB.Ml ml, bH.CN3 cn3) {
            InterfaceC1679Ml interfaceC1679MlN = InterfaceC1679Ml.f43655n.n(context, interfaceC0067n.rl());
            InterfaceC1682w6 interfaceC1682w6Rl = InterfaceC1682w6.f43659n.rl(context, interfaceC0067n.rl(), new C0065j(interfaceC0067n));
            InterfaceC1680j interfaceC1680jN = InterfaceC1680j.f43657n.n();
            rB.Ml mlNr = d3.j.nr(ml, "concierge");
            ujA.n nVar = new ujA.n(interfaceC1679MlN, interfaceC1682w6Rl, mlNr, new C0066n(interfaceC0067n), null, 16, null);
            ujA.j jVar = new ujA.j(interfaceC1679MlN, interfaceC1682w6Rl, interfaceC1680jN, mlNr);
            if (cn3 != null) {
                com.bendingspoons.concierge.ui.secretmenu.j.n(cn3, jVar, context);
            }
            nVar.KN();
            return jVar;
        }

        public final InterfaceC1335n t(final InterfaceC0067n config, final Context context, final bH.CN3 cn3, final rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return (InterfaceC1335n) n(new Function0() { // from class: Dk.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InterfaceC1335n.j.nr(context, config, spiderSense, cn3);
                }
            });
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: Dk.n$n, reason: collision with other inner class name */
    public interface InterfaceC0067n {

        /* JADX INFO: renamed from: Dk.n$n$j */
        public static final class j {
            public static boolean n(InterfaceC0067n interfaceC0067n) {
                return true;
            }
        }

        boolean n();

        Map rl();
    }

    Object J2(Continuation continuation);

    Object KN(String str, Continuation continuation);

    Object O(Id.Predefined.Internal.j jVar, Continuation continuation);

    void Uo(HX.j jVar);

    Object n(Continuation continuation);

    Object t(Id.Predefined.External.j jVar, Continuation continuation);
}
