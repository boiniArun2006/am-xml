package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class PrivateCommand extends SpliceCommand {
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.ptsAdjustment + ", identifier= " + this.identifier + " }";
    }

    private PrivateCommand(long j2, byte[] bArr, long j3) {
        this.ptsAdjustment = j3;
        this.identifier = j2;
        this.commandBytes = bArr;
    }

    static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i2, long j2) {
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new PrivateCommand(unsignedInt, bArr, j2);
    }
}
