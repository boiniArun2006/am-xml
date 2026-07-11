package DGv;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: DGv.j$j, reason: collision with other inner class name */
    public static final class C0050j extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final XA.Ml f1409n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0050j(XA.Ml serializer) {
            super(null);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.f1409n = serializer;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0050j) && Intrinsics.areEqual(((C0050j) obj).f1409n, this.f1409n);
        }

        public int hashCode() {
            return this.f1409n.hashCode();
        }

        @Override // DGv.j
        public XA.Ml n(List typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f1409n;
        }

        public final XA.Ml rl() {
            return this.f1409n;
        }
    }

    public static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Function1 f1410n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function1 provider) {
            super(null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f1410n = provider;
        }

        @Override // DGv.j
        public XA.Ml n(List typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (XA.Ml) this.f1410n.invoke(typeArgumentsSerializers);
        }

        public final Function1 rl() {
            return this.f1410n;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract XA.Ml n(List list);

    private j() {
    }
}
