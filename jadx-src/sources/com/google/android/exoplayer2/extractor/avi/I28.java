package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.nKK;
import com.google.common.collect.xZD;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class I28 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nKK f57763n;
    private final int rl;

    public static I28 t(int i2, ParsableByteArray parsableByteArray) {
        nKK.j jVar = new nKK.j();
        int iLimit = parsableByteArray.limit();
        int iRl = -2;
        while (parsableByteArray.bytesLeft() > 8) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int position = parsableByteArray.getPosition() + parsableByteArray.readLittleEndianInt();
            parsableByteArray.setLimit(position);
            j jVarT = littleEndianInt == 1414744396 ? t(parsableByteArray.readLittleEndianInt(), parsableByteArray) : n(littleEndianInt, iRl, parsableByteArray);
            if (jVarT != null) {
                if (jVarT.getType() == 1752331379) {
                    iRl = ((w6) jVarT).rl();
                }
                jVar.n(jVarT);
            }
            parsableByteArray.setPosition(position);
            parsableByteArray.setLimit(iLimit);
        }
        return new I28(i2, jVar.gh());
    }

    @Override // com.google.android.exoplayer2.extractor.avi.j
    public int getType() {
        return this.rl;
    }

    public j rl(Class cls) {
        xZD it = this.f57763n.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.getClass() == cls) {
                return jVar;
            }
        }
        return null;
    }

    private I28(int i2, nKK nkk) {
        this.rl = i2;
        this.f57763n = nkk;
    }

    private static j n(int i2, int i3, ParsableByteArray parsableByteArray) {
        switch (i2) {
            case 1718776947:
                return Wre.nr(i3, parsableByteArray);
            case 1751742049:
                return n.rl(parsableByteArray);
            case 1752331379:
                return w6.t(parsableByteArray);
            case 1852994675:
                return CN3.n(parsableByteArray);
            default:
                return null;
        }
    }
}
