package Mms;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.UStringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class afx extends gi.j {
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DGv.Ml f6720t;

    public afx(j lexer, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.rl = lexer;
        this.f6720t = json.n();
    }

    @Override // gi.j, gi.I28
    public byte N() {
        j jVar = this.rl;
        String strO = jVar.o();
        try {
            return UStringsKt.toUByte(strO);
        } catch (IllegalArgumentException unused) {
            j.nY(jVar, "Failed to parse type 'UByte' for input '" + strO + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // gi.I28, gi.w6
    /* JADX INFO: renamed from: n */
    public DGv.Ml getSerializersModule() {
        return this.f6720t;
    }

    @Override // gi.w6
    public int nY(EJn.Wre wre) {
        Intrinsics.checkNotNullParameter(wre, QiDPjiOCZHDS.QgGQxWJWj);
        throw new IllegalStateException("unsupported");
    }

    @Override // gi.j, gi.I28
    public short r() {
        j jVar = this.rl;
        String strO = jVar.o();
        try {
            return UStringsKt.toUShort(strO);
        } catch (IllegalArgumentException unused) {
            j.nY(jVar, "Failed to parse type 'UShort' for input '" + strO + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // gi.j, gi.I28
    public long ty() {
        j jVar = this.rl;
        String strO = jVar.o();
        try {
            return UStringsKt.toULong(strO);
        } catch (IllegalArgumentException unused) {
            j.nY(jVar, "Failed to parse type 'ULong' for input '" + strO + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // gi.j, gi.I28
    public int xMQ() {
        j jVar = this.rl;
        String strO = jVar.o();
        try {
            return UStringsKt.toUInt(strO);
        } catch (IllegalArgumentException unused) {
            j.nY(jVar, "Failed to parse type 'UInt' for input '" + strO + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
