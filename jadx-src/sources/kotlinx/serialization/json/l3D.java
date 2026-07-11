package kotlinx.serialization.json;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class l3D {

    public static final class j implements EJn.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Lazy f70275n;

        private final EJn.Wre n() {
            return (EJn.Wre) this.f70275n.getValue();
        }

        @Override // EJn.Wre
        public int t(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return n().t(name);
        }

        j(Function0 function0) {
            this.f70275n = LazyKt.lazy(function0);
        }

        @Override // EJn.Wre
        public List J2(int i2) {
            return n().J2(i2);
        }

        @Override // EJn.Wre
        public String KN() {
            return n().KN();
        }

        @Override // EJn.Wre
        public String O(int i2) {
            return n().O(i2);
        }

        @Override // EJn.Wre
        public EJn.Wre Uo(int i2) {
            return n().Uo(i2);
        }

        @Override // EJn.Wre
        public EJn.Pl getKind() {
            return n().getKind();
        }

        @Override // EJn.Wre
        public int nr() {
            return n().nr();
        }

        @Override // EJn.Wre
        public boolean xMQ(int i2) {
            return n().xMQ(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EJn.Wre J2(Function0 function0) {
        return new j(function0);
    }

    public static final InterfaceC2252c O(gi.Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        InterfaceC2252c interfaceC2252c = wre instanceof InterfaceC2252c ? (InterfaceC2252c) wre : null;
        if (interfaceC2252c != null) {
            return interfaceC2252c;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(wre.getClass()));
    }

    public static final fuX nr(gi.I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        fuX fux = i28 instanceof fuX ? (fuX) i28 : null;
        if (fux != null) {
            return fux;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(i28.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(gi.Wre wre) {
        O(wre);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(gi.I28 i28) {
        nr(i28);
    }
}
