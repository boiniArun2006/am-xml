package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class UGc {
    private j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f58123O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Allocator f58124n;
    private j nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ParsableByteArray f58125t;

    private static final class j implements Allocator.AllocationNode {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f58126n;
        public j nr;
        public long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Allocation f58127t;

        public j n() {
            this.f58127t = null;
            j jVar = this.nr;
            this.nr = null;
            return jVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
            return (Allocation) Assertions.checkNotNull(this.f58127t);
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocator.AllocationNode next() {
            j jVar = this.nr;
            if (jVar == null || jVar.f58127t == null) {
                return null;
            }
            return jVar;
        }

        public int nr(long j2) {
            return ((int) (j2 - this.f58126n)) + this.f58127t.offset;
        }

        public void rl(Allocation allocation, j jVar) {
            this.f58127t = allocation;
            this.nr = jVar;
        }

        public void t(long j2, int i2) {
            Assertions.checkState(this.f58127t == null);
            this.f58126n = j2;
            this.rl = j2 + ((long) i2);
        }

        public j(long j2, int i2) {
            t(j2, i2);
        }
    }

    private int KN(int i2) {
        j jVar = this.J2;
        if (jVar.f58127t == null) {
            jVar.rl(this.f58124n.allocate(), new j(this.J2.rl, this.rl));
        }
        return Math.min(i2, (int) (this.J2.rl - this.Uo));
    }

    private void Uo(int i2) {
        long j2 = this.Uo + ((long) i2);
        this.Uo = j2;
        j jVar = this.J2;
        if (j2 == jVar.rl) {
            this.J2 = jVar.nr;
        }
    }

    private static j gh(j jVar, DecoderInputBuffer decoderInputBuffer, SampleQueue.n nVar, ParsableByteArray parsableByteArray) {
        long j2 = nVar.rl;
        int unsignedShort = 1;
        parsableByteArray.reset(1);
        j jVarMUb = mUb(jVar, j2, parsableByteArray.getData(), 1);
        long j3 = j2 + 1;
        byte b2 = parsableByteArray.getData()[0];
        boolean z2 = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
        int i2 = b2 & ByteCompanionObject.MAX_VALUE;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        byte[] bArr = cryptoInfo.iv;
        if (bArr == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        j jVarMUb2 = mUb(jVarMUb, j3, cryptoInfo.iv, i2);
        long j4 = j3 + ((long) i2);
        if (z2) {
            parsableByteArray.reset(2);
            jVarMUb2 = mUb(jVarMUb2, j4, parsableByteArray.getData(), 2);
            j4 += 2;
            unsignedShort = parsableByteArray.readUnsignedShort();
        }
        int i3 = unsignedShort;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z2) {
            int i5 = i3 * 6;
            parsableByteArray.reset(i5);
            jVarMUb2 = mUb(jVarMUb2, j4, parsableByteArray.getData(), i5);
            j4 += (long) i5;
            parsableByteArray.setPosition(0);
            for (int i7 = 0; i7 < i3; i7++) {
                iArr2[i7] = parsableByteArray.readUnsignedShort();
                iArr4[i7] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = nVar.f58114n - ((int) (j4 - nVar.rl));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(nVar.f58115t);
        cryptoInfo.set(i3, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j5 = nVar.rl;
        int i8 = (int) (j4 - j5);
        nVar.rl = j5 + ((long) i8);
        nVar.f58114n -= i8;
        return jVarMUb2;
    }

    private void n(j jVar) {
        if (jVar.f58127t == null) {
            return;
        }
        this.f58124n.release(jVar);
        jVar.n();
    }

    private static j nr(j jVar, long j2) {
        while (j2 >= jVar.rl) {
            jVar = jVar.nr;
        }
        return jVar;
    }

    public void HI() {
        this.f58123O = this.nr;
    }

    public void Ik(ParsableByteArray parsableByteArray, int i2) {
        while (i2 > 0) {
            int iKN = KN(i2);
            j jVar = this.J2;
            parsableByteArray.readBytes(jVar.f58127t.data, jVar.nr(this.Uo), iKN);
            i2 -= iKN;
            Uo(iKN);
        }
    }

    public void J2(DecoderInputBuffer decoderInputBuffer, SampleQueue.n nVar) {
        qie(this.f58123O, decoderInputBuffer, nVar, this.f58125t);
    }

    public long O() {
        return this.Uo;
    }

    public void az(DecoderInputBuffer decoderInputBuffer, SampleQueue.n nVar) {
        this.f58123O = qie(this.f58123O, decoderInputBuffer, nVar, this.f58125t);
    }

    public void rl(long j2) {
        j jVar;
        if (j2 == -1) {
            return;
        }
        while (true) {
            jVar = this.nr;
            if (j2 < jVar.rl) {
                break;
            }
            this.f58124n.release(jVar.f58127t);
            this.nr = this.nr.n();
        }
        if (this.f58123O.f58126n < jVar.f58126n) {
            this.f58123O = jVar;
        }
    }

    public void t(long j2) {
        Assertions.checkArgument(j2 <= this.Uo);
        this.Uo = j2;
        if (j2 != 0) {
            j jVar = this.nr;
            if (j2 != jVar.f58126n) {
                while (this.Uo > jVar.rl) {
                    jVar = jVar.nr;
                }
                j jVar2 = (j) Assertions.checkNotNull(jVar.nr);
                n(jVar2);
                j jVar3 = new j(jVar.rl, this.rl);
                jVar.nr = jVar3;
                if (this.Uo == jVar.rl) {
                    jVar = jVar3;
                }
                this.J2 = jVar;
                if (this.f58123O == jVar2) {
                    this.f58123O = jVar3;
                    return;
                }
                return;
            }
        }
        n(this.nr);
        j jVar4 = new j(this.Uo, this.rl);
        this.nr = jVar4;
        this.f58123O = jVar4;
        this.J2 = jVar4;
    }

    public void ty() {
        n(this.nr);
        this.nr.t(0L, this.rl);
        j jVar = this.nr;
        this.f58123O = jVar;
        this.J2 = jVar;
        this.Uo = 0L;
        this.f58124n.trim();
    }

    public UGc(Allocator allocator) {
        this.f58124n = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.rl = individualAllocationLength;
        this.f58125t = new ParsableByteArray(32);
        j jVar = new j(0L, individualAllocationLength);
        this.nr = jVar;
        this.f58123O = jVar;
        this.J2 = jVar;
    }

    private static j mUb(j jVar, long j2, byte[] bArr, int i2) {
        j jVarNr = nr(jVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (jVarNr.rl - j2));
            System.arraycopy(jVarNr.f58127t.data, jVarNr.nr(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == jVarNr.rl) {
                jVarNr = jVarNr.nr;
            }
        }
        return jVarNr;
    }

    private static j qie(j jVar, DecoderInputBuffer decoderInputBuffer, SampleQueue.n nVar, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            jVar = gh(jVar, decoderInputBuffer, nVar, parsableByteArray);
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            parsableByteArray.reset(4);
            j jVarMUb = mUb(jVar, nVar.rl, parsableByteArray.getData(), 4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            nVar.rl += 4;
            nVar.f58114n -= 4;
            decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
            j jVarXMQ = xMQ(jVarMUb, nVar.rl, decoderInputBuffer.data, unsignedIntToInt);
            nVar.rl += (long) unsignedIntToInt;
            int i2 = nVar.f58114n - unsignedIntToInt;
            nVar.f58114n = i2;
            decoderInputBuffer.resetSupplementalData(i2);
            return xMQ(jVarXMQ, nVar.rl, decoderInputBuffer.supplementalData, nVar.f58114n);
        }
        decoderInputBuffer.ensureSpaceForWrite(nVar.f58114n);
        return xMQ(jVar, nVar.rl, decoderInputBuffer.data, nVar.f58114n);
    }

    private static j xMQ(j jVar, long j2, ByteBuffer byteBuffer, int i2) {
        j jVarNr = nr(jVar, j2);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (jVarNr.rl - j2));
            byteBuffer.put(jVarNr.f58127t.data, jVarNr.nr(j2), iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == jVarNr.rl) {
                jVarNr = jVarNr.nr;
            }
        }
        return jVarNr;
    }

    public int ck(DataReader dataReader, int i2, boolean z2) throws IOException {
        int iKN = KN(i2);
        j jVar = this.J2;
        int i3 = dataReader.read(jVar.f58127t.data, jVar.nr(this.Uo), iKN);
        if (i3 == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        Uo(i3);
        return i3;
    }
}
