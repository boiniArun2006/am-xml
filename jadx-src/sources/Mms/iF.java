package Mms;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class iF {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f6722n = SetsKt.setOf((Object[]) new EJn.Wre[]{WY.j.S(UInt.INSTANCE).getDescriptor(), WY.j.WPU(ULong.INSTANCE).getDescriptor(), WY.j.XQ(UByte.INSTANCE).getDescriptor(), WY.j.aYN(UShort.INSTANCE).getDescriptor()});

    public static final boolean n(EJn.Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return wre.isInline() && Intrinsics.areEqual(wre, kotlinx.serialization.json.C.gh());
    }

    public static final boolean rl(EJn.Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return wre.isInline() && f6722n.contains(wre);
    }
}
