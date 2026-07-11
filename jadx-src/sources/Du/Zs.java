package Du;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Zs {

    public static final class j implements vd {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ XA.Ml f2002n;

        j(XA.Ml ml) {
            this.f2002n = ml;
        }

        @Override // Du.vd
        public XA.Ml[] childSerializers() {
            return new XA.Ml[]{this.f2002n};
        }

        @Override // XA.w6
        public Object deserialize(gi.I28 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public EJn.Wre getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // XA.eO
        public void serialize(gi.Wre encoder, Object obj) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final EJn.Wre n(String name, XA.Ml primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new Md(name, new j(primitiveSerializer));
    }
}
