package Mms;

import EJn.Pl;
import EJn.Xo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class lej implements DGv.fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6726n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6727t;

    @Override // DGv.fuX
    public void J2(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // DGv.fuX
    public void Uo(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // DGv.fuX
    public void t(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    public lej(kotlinx.serialization.json.CN3 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f6726n = configuration.O();
        this.rl = configuration.ck();
        this.f6727t = configuration.J2() != kotlinx.serialization.json.j.f70272n;
    }

    @Override // DGv.fuX
    public void O(KClass baseClass, KClass actualClass, XA.Ml actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        EJn.Wre descriptor = actualSerializer.getDescriptor();
        xMQ(descriptor, actualClass);
        if (this.rl || !this.f6727t) {
            return;
        }
        KN(descriptor, actualClass);
    }

    private final void KN(EJn.Wre wre, KClass kClass) {
        int iNr = wre.nr();
        for (int i2 = 0; i2 < iNr; i2++) {
            String strO = wre.O(i2);
            if (Intrinsics.areEqual(strO, this.f6726n)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + strO + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void xMQ(EJn.Wre wre, KClass kClass) {
        EJn.Pl kind = wre.getKind();
        if (!(kind instanceof EJn.Ml) && !Intrinsics.areEqual(kind, Pl.j.f2280n)) {
            if (!this.rl && this.f6727t) {
                if (!Intrinsics.areEqual(kind, Xo.n.f2284n) && !Intrinsics.areEqual(kind, Xo.w6.f2285n) && !(kind instanceof EJn.I28) && !(kind instanceof Pl.n)) {
                    return;
                }
                throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
