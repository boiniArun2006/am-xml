package FQ;

import android.content.Context;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.RewardedVideoAd;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class I28 {
    public RewardedVideoAd O(Context context, String str) {
        return new RewardedVideoAd(context, str);
    }

    public InterstitialAd n(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public AdView nr(Context context, String str, String str2) {
        return new AdView(context, str, str2);
    }

    public InterstitialAd rl(Context context, String str) {
        return new InterstitialAd(context, str);
    }

    public MediaView t(Context context) {
        return new MediaView(context);
    }
}
