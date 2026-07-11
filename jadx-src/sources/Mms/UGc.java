package Mms;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc extends Pl {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6716t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGc(g9s writer, boolean z2) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f6716t = z2;
    }

    @Override // Mms.Pl
    public void O(byte b2) {
        boolean z2 = this.f6716t;
        String strM375toStringimpl = UByte.m375toStringimpl(UByte.m331constructorimpl(b2));
        if (z2) {
            ty(strM375toStringimpl);
        } else {
            gh(strM375toStringimpl);
        }
    }

    @Override // Mms.Pl
    public void mUb(long j2) {
        boolean z2 = this.f6716t;
        long jM487constructorimpl = ULong.m487constructorimpl(j2);
        if (z2) {
            ty(AbstractC1414c.n(jM487constructorimpl, 10));
        } else {
            gh(s4.n(jM487constructorimpl, 10));
        }
    }

    @Override // Mms.Pl
    public void qie(short s2) {
        boolean z2 = this.f6716t;
        String strM638toStringimpl = UShort.m638toStringimpl(UShort.m594constructorimpl(s2));
        if (z2) {
            ty(strM638toStringimpl);
        } else {
            gh(strM638toStringimpl);
        }
    }

    @Override // Mms.Pl
    public void xMQ(int i2) {
        boolean z2 = this.f6716t;
        int iM408constructorimpl = UInt.m408constructorimpl(i2);
        if (z2) {
            ty(Long.toString(((long) iM408constructorimpl) & 4294967295L, 10));
        } else {
            gh(Long.toString(((long) iM408constructorimpl) & 4294967295L, 10));
        }
    }
}
