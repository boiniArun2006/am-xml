package G7;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class w6 implements TypeEvaluator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w6 f3387n = new w6();

    public static w6 rl() {
        return f3387n;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f3, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f4 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f5 = f4 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f4) * f3);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f3);
        float fPow6 = fPow3 + (f3 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f3), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f5 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
