package Du;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class xZD extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XA.Ml f2053n;
    private final XA.Ml rl;

    public /* synthetic */ xZD(XA.Ml ml, XA.Ml ml2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ml, ml2);
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public abstract EJn.Wre getDescriptor();

    private xZD(XA.Ml ml, XA.Ml ml2) {
        super(null);
        this.f2053n = ml;
        this.rl = ml2;
    }

    public final XA.Ml HI() {
        return this.rl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public final void xMQ(gi.w6 decoder, int i2, Map builder, boolean z2) {
        int iNY;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object objO = gi.w6.O(decoder, getDescriptor(), i2, this.f2053n, null, 8, null);
        if (z2) {
            iNY = decoder.nY(getDescriptor());
            if (iNY != i2 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i2 + ", returned index for value: " + iNY).toString());
            }
        } else {
            iNY = i2 + 1;
        }
        int i3 = iNY;
        builder.put(objO, (!builder.containsKey(objO) || (this.rl.getDescriptor().getKind() instanceof EJn.I28)) ? gi.w6.O(decoder, getDescriptor(), i3, this.rl, null, 8, null) : decoder.fD(getDescriptor(), i3, this.rl, MapsKt.getValue(builder, objO)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public final void KN(gi.w6 decoder, Map builder, int i2, int i3) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i3 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i3 * 2), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            xMQ(decoder, i2 + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iJ2 = J2(obj);
        EJn.Wre descriptor = getDescriptor();
        gi.Ml mlMUb = encoder.mUb(descriptor, iJ2);
        Iterator itO = O(obj);
        int i2 = 0;
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            mlMUb.S(getDescriptor(), i2, ty(), key);
            i2 += 2;
            mlMUb.S(getDescriptor(), i3, HI(), value);
        }
        mlMUb.t(descriptor);
    }

    public final XA.Ml ty() {
        return this.f2053n;
    }
}
