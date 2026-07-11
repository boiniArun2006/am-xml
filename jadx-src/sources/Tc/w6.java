package Tc;

import com.caoccao.javet.utils.Float16;
import java.nio.ByteBuffer;
import v9.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(float[] fArr, int i2, ByteBuffer byteBuffer) {
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.putShort(I28.n((int) (fArr[i3] * Float16.EXPONENT_SIGNIFICAND_MASK)));
        }
    }
}
