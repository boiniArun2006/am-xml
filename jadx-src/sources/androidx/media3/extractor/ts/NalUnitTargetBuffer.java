package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void appendToNalUnit(byte[] bArr, int i2, int i3) {
        if (this.isFilling) {
            int i5 = i3 - i2;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i7 = this.nalLength;
            if (length < i7 + i5) {
                this.nalData = Arrays.copyOf(bArr2, (i7 + i5) * 2);
            }
            System.arraycopy(bArr, i2, this.nalData, this.nalLength, i5);
            this.nalLength += i5;
        }
    }

    public boolean endNalUnit(int i2) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i2;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void startNalUnit(int i2) {
        Assertions.checkState(!this.isFilling);
        boolean z2 = i2 == this.targetType;
        this.isFilling = z2;
        if (z2) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }

    public NalUnitTargetBuffer(int i2, int i3) {
        this.targetType = i2;
        byte[] bArr = new byte[i3 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }
}
