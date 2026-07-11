package Mms;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class K extends rv6 {
    private int HI;
    private final List az;
    private final kotlinx.serialization.json.nKK qie;
    private final int ty;

    @Override // Mms.rv6, Mms.w6, gi.w6
    public void t(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(kotlinx.serialization.json.n json, kotlinx.serialization.json.nKK value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.qie = value;
        List list = CollectionsKt.toList(qm().keySet());
        this.az = list;
        this.ty = list.size() * 2;
        this.HI = -1;
    }

    @Override // Mms.rv6, Mms.w6
    /* JADX INFO: renamed from: Po6, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.nKK qm() {
        return this.qie;
    }

    @Override // Mms.rv6, Du.QaP
    protected String Y(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.az.get(i2 / 2);
    }

    @Override // Mms.rv6, Mms.w6
    protected kotlinx.serialization.json.Dsr m(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.HI % 2 == 0 ? kotlinx.serialization.json.C.t(tag) : (kotlinx.serialization.json.Dsr) MapsKt.getValue(qm(), tag);
    }

    @Override // Mms.rv6, gi.w6
    public int nY(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = this.HI;
        if (i2 >= this.ty - 1) {
            return -1;
        }
        int i3 = i2 + 1;
        this.HI = i3;
        return i3;
    }
}
