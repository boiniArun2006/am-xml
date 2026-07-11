package kotlinx.serialization.json;

import Mms.AbstractC1417p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class iwV implements XA.Ml {
    private final XA.Ml tSerializer;

    protected abstract Dsr transformDeserialize(Dsr dsr);

    protected Dsr transformSerialize(Dsr element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    public iwV(XA.Ml tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // XA.w6
    public final Object deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        fuX fuxNr = l3D.nr(decoder);
        return fuxNr.nr().nr(this.tSerializer, transformDeserialize(fuxNr.KN()));
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // XA.eO
    public final void serialize(gi.Wre encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC2252c interfaceC2252cO = l3D.O(encoder);
        interfaceC2252cO.iF(transformSerialize(AbstractC1417p.nr(interfaceC2252cO.nr(), value, this.tSerializer)));
    }
}
